(ns portkey.aws.iam (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-cn-global"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "iam", :region "cn-north-1"},
    :ssl-common-name "iam.cn-north-1.amazonaws.com.cn",
    :endpoint "https://iam.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-us-gov-global"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "iam", :region "us-east-1"},
    :ssl-common-name "iam.amazonaws.com",
    :endpoint "https://iam.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-context-entry-list-type)

(clojure.core/declare serpublic-key-material-type)

(clojure.core/declare sercustom-suffix-type)

(clojure.core/declare serpath-prefix-type)

(clojure.core/declare ser-policy-usage-type)

(clojure.core/declare sermarker-type)

(clojure.core/declare ser-action-name-type)

(clojure.core/declare seruser-name-type)

(clojure.core/declare sergroup-name-type)

(clojure.core/declare ser-saml-provider-name-type)

(clojure.core/declare serclient-id-type)

(clojure.core/declare servirtual-mfa-device-name)

(clojure.core/declare ser-context-entry)

(clojure.core/declare serthumbprint-type)

(clojure.core/declare serencoding-type)

(clojure.core/declare serrole-max-session-duration-type)

(clojure.core/declare seraccount-alias-type)

(clojure.core/declare serpassword-reuse-prevention-type)

(clojure.core/declare ser-resource-handling-option-type)

(clojure.core/declare serpolicy-version-id-type)

(clojure.core/declare ser-context-key-value-type)

(clojure.core/declare serinstance-profile-name-type)

(clojure.core/declare ser-simulation-policy-list-type)

(clojure.core/declare serservice-specific-credential-id)

(clojure.core/declare sermax-password-age-type)

(clojure.core/declare serpolicy-scope-type)

(clojure.core/declare serpolicy-document-type)

(clojure.core/declare ser-action-name-list-type)

(clojure.core/declare serboolean-type)

(clojure.core/declare ser-resource-name-list-type)

(clojure.core/declare serstatus-type)

(clojure.core/declare serexisting-user-name-type)

(clojure.core/declare ser-open-id-connect-provider-url-type)

(clojure.core/declare seraccess-key-id-type)

(clojure.core/declare serpolicy-description-type)

(clojure.core/declare serservice-name)

(clojure.core/declare ser-context-key-value-list-type)

(clojure.core/declare ser-resource-name-type)

(clojure.core/declare serboolean-object-type)

(clojure.core/declare ser-deletion-task-id-type)

(clojure.core/declare ser-saml-metadata-document-type)

(clojure.core/declare serpolicy-name-type)

(clojure.core/declare serauthentication-code-type)

(clojure.core/declare sermax-items-type)

(clojure.core/declare ser-context-key-type-enum)

(clojure.core/declare serassignment-status-type)

(clojure.core/declare serclient-id-list-type)

(clojure.core/declare sercertificate-body-type)

(clojure.core/declare sercertificate-chain-type)

(clojure.core/declare sercertificate-id-type)

(clojure.core/declare serthumbprint-list-type)

(clojure.core/declare serarn-type)

(clojure.core/declare ser-context-key-name-type)

(clojure.core/declare serprivate-key-type)

(clojure.core/declare serserver-certificate-name-type)

(clojure.core/declare serserial-number-type)

(clojure.core/declare serrole-description-type)

(clojure.core/declare serpassword-type)

(clojure.core/declare serminimum-password-length-type)

(clojure.core/declare serpolicy-path-type)

(clojure.core/declare serentity-list-type)

(clojure.core/declare serpublic-key-id-type)

(clojure.core/declare serpath-type)

(clojure.core/declare ser-entity-type)

(clojure.core/declare serrole-name-type)

(clojure.core/defn- ser-context-entry-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-context-entry coll) #:http.request.field{:shape "ContextEntry"}))) input), :shape "ContextEntryListType", :type "list"})

(clojure.core/defn- serpublic-key-material-type [input] #:http.request.field{:value input, :shape "publicKeyMaterialType"})

(clojure.core/defn- sercustom-suffix-type [input] #:http.request.field{:value input, :shape "customSuffixType"})

(clojure.core/defn- serpath-prefix-type [input] #:http.request.field{:value input, :shape "pathPrefixType"})

(clojure.core/defn- ser-policy-usage-type [input] #:http.request.field{:value (clojure.core/get {"PermissionsPolicy" "PermissionsPolicy", :permissions-policy "PermissionsPolicy", "PermissionsBoundary" "PermissionsBoundary", :permissions-boundary "PermissionsBoundary"} input), :shape "PolicyUsageType"})

(clojure.core/defn- sermarker-type [input] #:http.request.field{:value input, :shape "markerType"})

(clojure.core/defn- ser-action-name-type [input] #:http.request.field{:value input, :shape "ActionNameType"})

(clojure.core/defn- seruser-name-type [input] #:http.request.field{:value input, :shape "userNameType"})

(clojure.core/defn- sergroup-name-type [input] #:http.request.field{:value input, :shape "groupNameType"})

(clojure.core/defn- ser-saml-provider-name-type [input] #:http.request.field{:value input, :shape "SAMLProviderNameType"})

(clojure.core/defn- serclient-id-type [input] #:http.request.field{:value input, :shape "clientIDType"})

(clojure.core/defn- servirtual-mfa-device-name [input] #:http.request.field{:value input, :shape "virtualMFADeviceName"})

(clojure.core/defn- ser-context-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContextEntry", :type "structure"} (clojure.core/contains? input :context-key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-name-type (input :context-key-name)) #:http.request.field{:name "ContextKeyName", :shape "ContextKeyNameType"})) (clojure.core/contains? input :context-key-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-value-list-type (input :context-key-values)) #:http.request.field{:name "ContextKeyValues", :shape "ContextKeyValueListType"})) (clojure.core/contains? input :context-key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-type-enum (input :context-key-type)) #:http.request.field{:name "ContextKeyType", :shape "ContextKeyTypeEnum"}))))

(clojure.core/defn- serthumbprint-type [input] #:http.request.field{:value input, :shape "thumbprintType"})

(clojure.core/defn- serencoding-type [input] #:http.request.field{:value (clojure.core/get {"SSH" "SSH", :ssh "SSH", "PEM" "PEM", :pem "PEM"} input), :shape "encodingType"})

(clojure.core/defn- serrole-max-session-duration-type [input] #:http.request.field{:value input, :shape "roleMaxSessionDurationType"})

(clojure.core/defn- seraccount-alias-type [input] #:http.request.field{:value input, :shape "accountAliasType"})

(clojure.core/defn- serpassword-reuse-prevention-type [input] #:http.request.field{:value input, :shape "passwordReusePreventionType"})

(clojure.core/defn- ser-resource-handling-option-type [input] #:http.request.field{:value input, :shape "ResourceHandlingOptionType"})

(clojure.core/defn- serpolicy-version-id-type [input] #:http.request.field{:value input, :shape "policyVersionIdType"})

(clojure.core/defn- ser-context-key-value-type [input] #:http.request.field{:value input, :shape "ContextKeyValueType"})

(clojure.core/defn- serinstance-profile-name-type [input] #:http.request.field{:value input, :shape "instanceProfileNameType"})

(clojure.core/defn- ser-simulation-policy-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serpolicy-document-type coll) #:http.request.field{:shape "policyDocumentType"}))) input), :shape "SimulationPolicyListType", :type "list"})

(clojure.core/defn- serservice-specific-credential-id [input] #:http.request.field{:value input, :shape "serviceSpecificCredentialId"})

(clojure.core/defn- sermax-password-age-type [input] #:http.request.field{:value input, :shape "maxPasswordAgeType"})

(clojure.core/defn- serpolicy-scope-type [input] #:http.request.field{:value (clojure.core/get {"All" "All", :all "All", "AWS" "AWS", :aws "AWS", "Local" "Local", :local "Local"} input), :shape "policyScopeType"})

(clojure.core/defn- serpolicy-document-type [input] #:http.request.field{:value input, :shape "policyDocumentType"})

(clojure.core/defn- ser-action-name-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-action-name-type coll) #:http.request.field{:shape "ActionNameType"}))) input), :shape "ActionNameListType", :type "list"})

(clojure.core/defn- serboolean-type [input] #:http.request.field{:value input, :shape "booleanType"})

(clojure.core/defn- ser-resource-name-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name-type coll) #:http.request.field{:shape "ResourceNameType"}))) input), :shape "ResourceNameListType", :type "list"})

(clojure.core/defn- serstatus-type [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "Inactive" "Inactive", :inactive "Inactive"} input), :shape "statusType"})

(clojure.core/defn- serexisting-user-name-type [input] #:http.request.field{:value input, :shape "existingUserNameType"})

(clojure.core/defn- ser-open-id-connect-provider-url-type [input] #:http.request.field{:value input, :shape "OpenIDConnectProviderUrlType"})

(clojure.core/defn- seraccess-key-id-type [input] #:http.request.field{:value input, :shape "accessKeyIdType"})

(clojure.core/defn- serpolicy-description-type [input] #:http.request.field{:value input, :shape "policyDescriptionType"})

(clojure.core/defn- serservice-name [input] #:http.request.field{:value input, :shape "serviceName"})

(clojure.core/defn- ser-context-key-value-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-context-key-value-type coll) #:http.request.field{:shape "ContextKeyValueType"}))) input), :shape "ContextKeyValueListType", :type "list"})

(clojure.core/defn- ser-resource-name-type [input] #:http.request.field{:value input, :shape "ResourceNameType"})

(clojure.core/defn- serboolean-object-type [input] #:http.request.field{:value input, :shape "booleanObjectType"})

(clojure.core/defn- ser-deletion-task-id-type [input] #:http.request.field{:value input, :shape "DeletionTaskIdType"})

(clojure.core/defn- ser-saml-metadata-document-type [input] #:http.request.field{:value input, :shape "SAMLMetadataDocumentType"})

(clojure.core/defn- serpolicy-name-type [input] #:http.request.field{:value input, :shape "policyNameType"})

(clojure.core/defn- serauthentication-code-type [input] #:http.request.field{:value input, :shape "authenticationCodeType"})

(clojure.core/defn- sermax-items-type [input] #:http.request.field{:value input, :shape "maxItemsType"})

(clojure.core/defn- ser-context-key-type-enum [input] #:http.request.field{:value (clojure.core/get {"boolean" "boolean", :binary "binary", :date-list "dateList", :numeric-list "numericList", "numeric" "numeric", :date "date", "booleanList" "booleanList", :boolean-list "booleanList", "string" "string", :ip "ip", "binaryList" "binaryList", :numeric "numeric", "ipList" "ipList", "binary" "binary", :string-list "stringList", :string "string", "numericList" "numericList", "ip" "ip", :ip-list "ipList", "dateList" "dateList", "date" "date", "stringList" "stringList", :binary-list "binaryList", :boolean "boolean"} input), :shape "ContextKeyTypeEnum"})

(clojure.core/defn- serassignment-status-type [input] #:http.request.field{:value (clojure.core/get {"Assigned" "Assigned", :assigned "Assigned", "Unassigned" "Unassigned", :unassigned "Unassigned", "Any" "Any", :any "Any"} input), :shape "assignmentStatusType"})

(clojure.core/defn- serclient-id-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serclient-id-type coll) #:http.request.field{:shape "clientIDType"}))) input), :shape "clientIDListType", :type "list"})

(clojure.core/defn- sercertificate-body-type [input] #:http.request.field{:value input, :shape "certificateBodyType"})

(clojure.core/defn- sercertificate-chain-type [input] #:http.request.field{:value input, :shape "certificateChainType"})

(clojure.core/defn- sercertificate-id-type [input] #:http.request.field{:value input, :shape "certificateIdType"})

(clojure.core/defn- serthumbprint-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serthumbprint-type coll) #:http.request.field{:shape "thumbprintType"}))) input), :shape "thumbprintListType", :type "list"})

(clojure.core/defn- serarn-type [input] #:http.request.field{:value input, :shape "arnType"})

(clojure.core/defn- ser-context-key-name-type [input] #:http.request.field{:value input, :shape "ContextKeyNameType"})

(clojure.core/defn- serprivate-key-type [input] #:http.request.field{:value input, :shape "privateKeyType"})

(clojure.core/defn- serserver-certificate-name-type [input] #:http.request.field{:value input, :shape "serverCertificateNameType"})

(clojure.core/defn- serserial-number-type [input] #:http.request.field{:value input, :shape "serialNumberType"})

(clojure.core/defn- serrole-description-type [input] #:http.request.field{:value input, :shape "roleDescriptionType"})

(clojure.core/defn- serpassword-type [input] #:http.request.field{:value input, :shape "passwordType"})

(clojure.core/defn- serminimum-password-length-type [input] #:http.request.field{:value input, :shape "minimumPasswordLengthType"})

(clojure.core/defn- serpolicy-path-type [input] #:http.request.field{:value input, :shape "policyPathType"})

(clojure.core/defn- serentity-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-entity-type coll) #:http.request.field{:shape "EntityType"}))) input), :shape "entityListType", :type "list"})

(clojure.core/defn- serpublic-key-id-type [input] #:http.request.field{:value input, :shape "publicKeyIdType"})

(clojure.core/defn- serpath-type [input] #:http.request.field{:value input, :shape "pathType"})

(clojure.core/defn- ser-entity-type [input] #:http.request.field{:value (clojure.core/get {:role "Role", :local-managed-policy "LocalManagedPolicy", :group "Group", "LocalManagedPolicy" "LocalManagedPolicy", "User" "User", "Role" "Role", "AWSManagedPolicy" "AWSManagedPolicy", "Group" "Group", :user "User", :aws-managed-policy "AWSManagedPolicy"} input), :shape "EntityType"})

(clojure.core/defn- serrole-name-type [input] #:http.request.field{:value input, :shape "roleNameType"})

(clojure.core/defn- req-list-virtual-mfa-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :assignment-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serassignment-status-type (input :assignment-status)) #:http.request.field{:name "AssignmentStatus", :shape "assignmentStatusType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-update-account-password-policy-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :minimum-password-length) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serminimum-password-length-type (input :minimum-password-length)) #:http.request.field{:name "MinimumPasswordLength", :shape "minimumPasswordLengthType"})) (clojure.core/contains? input :require-numbers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-numbers)) #:http.request.field{:name "RequireNumbers", :shape "booleanType"})) (clojure.core/contains? input :require-uppercase-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-uppercase-characters)) #:http.request.field{:name "RequireUppercaseCharacters", :shape "booleanType"})) (clojure.core/contains? input :hard-expiry) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-object-type (input :hard-expiry)) #:http.request.field{:name "HardExpiry", :shape "booleanObjectType"})) (clojure.core/contains? input :require-lowercase-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-lowercase-characters)) #:http.request.field{:name "RequireLowercaseCharacters", :shape "booleanType"})) (clojure.core/contains? input :require-symbols) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-symbols)) #:http.request.field{:name "RequireSymbols", :shape "booleanType"})) (clojure.core/contains? input :allow-users-to-change-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :allow-users-to-change-password)) #:http.request.field{:name "AllowUsersToChangePassword", :shape "booleanType"})) (clojure.core/contains? input :max-password-age) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-password-age-type (input :max-password-age)) #:http.request.field{:name "MaxPasswordAge", :shape "maxPasswordAgeType"})) (clojure.core/contains? input :password-reuse-prevention) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpassword-reuse-prevention-type (input :password-reuse-prevention)) #:http.request.field{:name "PasswordReusePrevention", :shape "passwordReusePreventionType"}))))

(clojure.core/defn- req-get-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-create-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-document-type (input :assume-role-policy-document)) #:http.request.field{:name "AssumeRolePolicyDocument", :shape "policyDocumentType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-description-type (input :description)) #:http.request.field{:name "Description", :shape "roleDescriptionType"})) (clojure.core/contains? input :max-session-duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-max-session-duration-type (input :max-session-duration)) #:http.request.field{:name "MaxSessionDuration", :shape "roleMaxSessionDurationType"})) (clojure.core/contains? input :permissions-boundary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"}))))

(clojure.core/defn- req-delete-login-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]}))

(clojure.core/defn- req-update-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]} (clojure.core/contains? input :new-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :new-path)) #:http.request.field{:name "NewPath", :shape "pathType"})) (clojure.core/contains? input :new-user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :new-user-name)) #:http.request.field{:name "NewUserName", :shape "userNameType"}))))

(clojure.core/defn- req-get-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-get-user-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-get-login-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]}))

(clojure.core/defn- req-list-users-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-prefix-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathPrefixType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-list-attached-user-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "policyPathType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-list-open-id-connect-providers-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-roles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-prefix-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathPrefixType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-server-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserver-certificate-name-type (input :server-certificate-name)) #:http.request.field{:name "ServerCertificateName", :shape "serverCertificateNameType"})]}))

(clojure.core/defn- req-delete-signing-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sercertificate-id-type (input :certificate-id)) #:http.request.field{:name "CertificateId", :shape "certificateIdType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-set-default-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"}) (clojure.core/into (serpolicy-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "policyVersionIdType"})]}))

(clojure.core/defn- req-create-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-saml-metadata-document-type (input :saml-metadata-document)) #:http.request.field{:name "SAMLMetadataDocument", :shape "SAMLMetadataDocumentType"}) (clojure.core/into (ser-saml-provider-name-type (input :name)) #:http.request.field{:name "Name", :shape "SAMLProviderNameType"})]}))

(clojure.core/defn- req-get-context-keys-for-principal-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-source-arn)) #:http.request.field{:name "PolicySourceArn", :shape "arnType"})]} (clojure.core/contains? input :policy-input-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-simulation-policy-list-type (input :policy-input-list)) #:http.request.field{:name "PolicyInputList", :shape "SimulationPolicyListType"}))))

(clojure.core/defn- req-reset-service-specific-credential-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serservice-specific-credential-id (input :service-specific-credential-id)) #:http.request.field{:name "ServiceSpecificCredentialId", :shape "serviceSpecificCredentialId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}))))

(clojure.core/defn- req-delete-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-list-attached-group-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "policyPathType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-remove-user-from-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]}))

(clojure.core/defn- req-remove-role-from-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"}) (clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-get-context-keys-for-custom-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-simulation-policy-list-type (input :policy-input-list)) #:http.request.field{:name "PolicyInputList", :shape "SimulationPolicyListType"})]}))

(clojure.core/defn- req-list-server-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-prefix-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathPrefixType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-list-signing-certificates-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-delete-service-linked-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-put-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]}))

(clojure.core/defn- req-list-saml-providers-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-detach-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-create-service-linked-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :aws-service-name)) #:http.request.field{:name "AWSServiceName", :shape "groupNameType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-description-type (input :description)) #:http.request.field{:name "Description", :shape "roleDescriptionType"})) (clojure.core/contains? input :custom-suffix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercustom-suffix-type (input :custom-suffix)) #:http.request.field{:name "CustomSuffix", :shape "customSuffixType"}))))

(clojure.core/defn- req-delete-access-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seraccess-key-id-type (input :access-key-id)) #:http.request.field{:name "AccessKeyId", :shape "accessKeyIdType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-delete-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :saml-provider-arn)) #:http.request.field{:name "SAMLProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-detach-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-update-role-description-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serrole-description-type (input :description)) #:http.request.field{:name "Description", :shape "roleDescriptionType"})]}))

(clojure.core/defn- req-upload-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpublic-key-material-type (input :ssh-public-key-body)) #:http.request.field{:name "SSHPublicKeyBody", :shape "publicKeyMaterialType"})]}))

(clojure.core/defn- req-create-access-key-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-list-group-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-add-user-to-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]}))

(clojure.core/defn- req-create-login-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpassword-type (input :password)) #:http.request.field{:name "Password", :shape "passwordType"})]} (clojure.core/contains? input :password-reset-required) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :password-reset-required)) #:http.request.field{:name "PasswordResetRequired", :shape "booleanType"}))))

(clojure.core/defn- req-list-access-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-attach-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-list-role-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-create-account-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seraccount-alias-type (input :account-alias)) #:http.request.field{:name "AccountAlias", :shape "accountAliasType"})]}))

(clojure.core/defn- req-create-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path)) #:http.request.field{:name "Path", :shape "policyPathType"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-description-type (input :description)) #:http.request.field{:name "Description", :shape "policyDescriptionType"}))))

(clojure.core/defn- req-delete-server-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserver-certificate-name-type (input :server-certificate-name)) #:http.request.field{:name "ServerCertificateName", :shape "serverCertificateNameType"})]}))

(clojure.core/defn- req-put-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]}))

(clojure.core/defn- req-list-entities-for-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]} (clojure.core/contains? input :entity-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-type (input :entity-filter)) #:http.request.field{:name "EntityFilter", :shape "EntityType"})) (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathType"})) (clojure.core/contains? input :policy-usage-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-usage-type (input :policy-usage-filter)) #:http.request.field{:name "PolicyUsageFilter", :shape "PolicyUsageType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-deactivate-mfa-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"})]}))

(clojure.core/defn- req-get-service-linked-role-deletion-status-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deletion-task-id-type (input :deletion-task-id)) #:http.request.field{:name "DeletionTaskId", :shape "DeletionTaskIdType"})]}))

(clojure.core/defn- req-add-role-to-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"}) (clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-delete-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-simulate-custom-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-simulation-policy-list-type (input :policy-input-list)) #:http.request.field{:name "PolicyInputList", :shape "SimulationPolicyListType"}) (clojure.core/into (ser-action-name-list-type (input :action-names)) #:http.request.field{:name "ActionNames", :shape "ActionNameListType"})]} (clojure.core/contains? input :resource-handling-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-handling-option-type (input :resource-handling-option)) #:http.request.field{:name "ResourceHandlingOption", :shape "ResourceHandlingOptionType"})) (clojure.core/contains? input :resource-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-document-type (input :resource-policy)) #:http.request.field{:name "ResourcePolicy", :shape "policyDocumentType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-list-type (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceNameListType"})) (clojure.core/contains? input :context-entries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-entry-list-type (input :context-entries)) #:http.request.field{:name "ContextEntries", :shape "ContextEntryListType"})) (clojure.core/contains? input :resource-owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :resource-owner)) #:http.request.field{:name "ResourceOwner", :shape "ResourceNameType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"})) (clojure.core/contains? input :caller-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :caller-arn)) #:http.request.field{:name "CallerArn", :shape "ResourceNameType"}))))

(clojure.core/defn- req-delete-account-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seraccount-alias-type (input :account-alias)) #:http.request.field{:name "AccountAlias", :shape "accountAliasType"})]}))

(clojure.core/defn- req-update-assume-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]}))

(clojure.core/defn- req-put-role-permissions-boundary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"})]}))

(clojure.core/defn- req-get-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-create-virtual-mfa-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (servirtual-mfa-device-name (input :virtual-mfa-device-name)) #:http.request.field{:name "VirtualMFADeviceName", :shape "virtualMFADeviceName"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"}))))

(clojure.core/defn- req-list-mfa-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-list-instance-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-prefix-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathPrefixType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-enable-mfa-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"}) (clojure.core/into (serauthentication-code-type (input :authentication-code-1)) #:http.request.field{:name "AuthenticationCode1", :shape "authenticationCodeType"}) (clojure.core/into (serauthentication-code-type (input :authentication-code-2)) #:http.request.field{:name "AuthenticationCode2", :shape "authenticationCodeType"})]}))

(clojure.core/defn- req-update-signing-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sercertificate-id-type (input :certificate-id)) #:http.request.field{:name "CertificateId", :shape "certificateIdType"}) (clojure.core/into (serstatus-type (input :status)) #:http.request.field{:name "Status", :shape "statusType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-get-access-key-last-used-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seraccess-key-id-type (input :access-key-id)) #:http.request.field{:name "AccessKeyId", :shape "accessKeyIdType"})]}))

(clojure.core/defn- req-delete-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-create-service-specific-credential-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serservice-name (input :service-name)) #:http.request.field{:name "ServiceName", :shape "serviceName"})]}))

(clojure.core/defn- req-delete-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"}) (clojure.core/into (serpolicy-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "policyVersionIdType"})]}))

(clojure.core/defn- req-delete-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]}))

(clojure.core/defn- req-delete-role-permissions-boundary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-delete-virtual-mfa-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"})]}))

(clojure.core/defn- req-list-policy-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"}) (clojure.core/into (serpolicy-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "policyVersionIdType"})]}))

(clojure.core/defn- req-detach-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-get-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :saml-provider-arn)) #:http.request.field{:name "SAMLProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-list-account-aliases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-account-authorization-details-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serentity-list-type (input :filter)) #:http.request.field{:name "Filter", :shape "entityListType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"}))))

(clojure.core/defn- req-list-ssh-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-update-login-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]} (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpassword-type (input :password)) #:http.request.field{:name "Password", :shape "passwordType"})) (clojure.core/contains? input :password-reset-required) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-object-type (input :password-reset-required)) #:http.request.field{:name "PasswordResetRequired", :shape "booleanObjectType"}))))

(clojure.core/defn- req-list-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-scope-type (input :scope)) #:http.request.field{:name "Scope", :shape "policyScopeType"})) (clojure.core/contains? input :only-attached) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :only-attached)) #:http.request.field{:name "OnlyAttached", :shape "booleanType"})) (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "policyPathType"})) (clojure.core/contains? input :policy-usage-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-usage-type (input :policy-usage-filter)) #:http.request.field{:name "PolicyUsageFilter", :shape "PolicyUsageType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-change-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serpassword-type (input :old-password)) #:http.request.field{:name "OldPassword", :shape "passwordType"}) (clojure.core/into (serpassword-type (input :new-password)) #:http.request.field{:name "NewPassword", :shape "passwordType"})]}))

(clojure.core/defn- req-create-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"}))))

(clojure.core/defn- req-create-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-open-id-connect-provider-url-type (input :url)) #:http.request.field{:name "Url", :shape "OpenIDConnectProviderUrlType"}) (clojure.core/into (serthumbprint-list-type (input :thumbprint-list)) #:http.request.field{:name "ThumbprintList", :shape "thumbprintListType"})]} (clojure.core/contains? input :client-id-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serclient-id-list-type (input :client-id-list)) #:http.request.field{:name "ClientIDList", :shape "clientIDListType"}))))

(clojure.core/defn- req-resync-mfa-device-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serserial-number-type (input :serial-number)) #:http.request.field{:name "SerialNumber", :shape "serialNumberType"}) (clojure.core/into (serauthentication-code-type (input :authentication-code-1)) #:http.request.field{:name "AuthenticationCode1", :shape "authenticationCodeType"}) (clojure.core/into (serauthentication-code-type (input :authentication-code-2)) #:http.request.field{:name "AuthenticationCode2", :shape "authenticationCodeType"})]}))

(clojure.core/defn- req-delete-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"})]}))

(clojure.core/defn- req-list-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-prefix-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "pathPrefixType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :permissions-boundary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"}))))

(clojure.core/defn- req-list-groups-for-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-remove-client-id-from-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serclient-id-type (input :client-id)) #:http.request.field{:name "ClientID", :shape "clientIDType"})]}))

(clojure.core/defn- req-list-instance-profiles-for-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-put-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]}))

(clojure.core/defn- req-create-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"}))))

(clojure.core/defn- req-get-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"})]}))

(clojure.core/defn- req-attach-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]}))

(clojure.core/defn- req-list-service-specific-credentials-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serservice-name (input :service-name)) #:http.request.field{:name "ServiceName", :shape "serviceName"}))))

(clojure.core/defn- req-add-client-id-to-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serclient-id-type (input :client-id)) #:http.request.field{:name "ClientID", :shape "clientIDType"})]}))

(clojure.core/defn- req-upload-server-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserver-certificate-name-type (input :server-certificate-name)) #:http.request.field{:name "ServerCertificateName", :shape "serverCertificateNameType"}) (clojure.core/into (sercertificate-body-type (input :certificate-body)) #:http.request.field{:name "CertificateBody", :shape "certificateBodyType"}) (clojure.core/into (serprivate-key-type (input :private-key)) #:http.request.field{:name "PrivateKey", :shape "privateKeyType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :certificate-chain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercertificate-chain-type (input :certificate-chain)) #:http.request.field{:name "CertificateChain", :shape "certificateChainType"}))))

(clojure.core/defn- req-get-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-list-attached-role-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "policyPathType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-update-service-specific-credential-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serservice-specific-credential-id (input :service-specific-credential-id)) #:http.request.field{:name "ServiceSpecificCredentialId", :shape "serviceSpecificCredentialId"}) (clojure.core/into (serstatus-type (input :status)) #:http.request.field{:name "Status", :shape "statusType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}))))

(clojure.core/defn- req-update-open-id-connect-provider-thumbprint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serthumbprint-list-type (input :thumbprint-list)) #:http.request.field{:name "ThumbprintList", :shape "thumbprintListType"})]}))

(clojure.core/defn- req-delete-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-get-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpublic-key-id-type (input :ssh-public-key-id)) #:http.request.field{:name "SSHPublicKeyId", :shape "publicKeyIdType"}) (clojure.core/into (serencoding-type (input :encoding)) #:http.request.field{:name "Encoding", :shape "encodingType"})]}))

(clojure.core/defn- req-simulate-principal-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-source-arn)) #:http.request.field{:name "PolicySourceArn", :shape "arnType"}) (clojure.core/into (ser-action-name-list-type (input :action-names)) #:http.request.field{:name "ActionNames", :shape "ActionNameListType"})]} (clojure.core/contains? input :resource-handling-option) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-handling-option-type (input :resource-handling-option)) #:http.request.field{:name "ResourceHandlingOption", :shape "ResourceHandlingOptionType"})) (clojure.core/contains? input :resource-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-document-type (input :resource-policy)) #:http.request.field{:name "ResourcePolicy", :shape "policyDocumentType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-list-type (input :resource-arns)) #:http.request.field{:name "ResourceArns", :shape "ResourceNameListType"})) (clojure.core/contains? input :context-entries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-entry-list-type (input :context-entries)) #:http.request.field{:name "ContextEntries", :shape "ContextEntryListType"})) (clojure.core/contains? input :policy-input-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-simulation-policy-list-type (input :policy-input-list)) #:http.request.field{:name "PolicyInputList", :shape "SimulationPolicyListType"})) (clojure.core/contains? input :resource-owner) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :resource-owner)) #:http.request.field{:name "ResourceOwner", :shape "ResourceNameType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"})) (clojure.core/contains? input :caller-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name-type (input :caller-arn)) #:http.request.field{:name "CallerArn", :shape "ResourceNameType"}))))

(clojure.core/defn- req-update-access-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seraccess-key-id-type (input :access-key-id)) #:http.request.field{:name "AccessKeyId", :shape "accessKeyIdType"}) (clojure.core/into (serstatus-type (input :status)) #:http.request.field{:name "Status", :shape "statusType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-delete-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpublic-key-id-type (input :ssh-public-key-id)) #:http.request.field{:name "SSHPublicKeyId", :shape "publicKeyIdType"})]}))

(clojure.core/defn- req-delete-user-permissions-boundary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]}))

(clojure.core/defn- req-update-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpublic-key-id-type (input :ssh-public-key-id)) #:http.request.field{:name "SSHPublicKeyId", :shape "publicKeyIdType"}) (clojure.core/into (serstatus-type (input :status)) #:http.request.field{:name "Status", :shape "statusType"})]}))

(clojure.core/defn- req-delete-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-delete-service-specific-credential-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serservice-specific-credential-id (input :service-specific-credential-id)) #:http.request.field{:name "ServiceSpecificCredentialId", :shape "serviceSpecificCredentialId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}))))

(clojure.core/defn- req-update-server-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserver-certificate-name-type (input :server-certificate-name)) #:http.request.field{:name "ServerCertificateName", :shape "serverCertificateNameType"})]} (clojure.core/contains? input :new-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :new-path)) #:http.request.field{:name "NewPath", :shape "pathType"})) (clojure.core/contains? input :new-server-certificate-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serserver-certificate-name-type (input :new-server-certificate-name)) #:http.request.field{:name "NewServerCertificateName", :shape "serverCertificateNameType"}))))

(clojure.core/defn- req-delete-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-upload-signing-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sercertificate-body-type (input :certificate-body)) #:http.request.field{:name "CertificateBody", :shape "certificateBodyType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}))))

(clojure.core/defn- req-attach-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-list-user-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-update-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-description-type (input :description)) #:http.request.field{:name "Description", :shape "roleDescriptionType"})) (clojure.core/contains? input :max-session-duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-max-session-duration-type (input :max-session-duration)) #:http.request.field{:name "MaxSessionDuration", :shape "roleMaxSessionDurationType"}))))

(clojure.core/defn- req-update-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-saml-metadata-document-type (input :saml-metadata-document)) #:http.request.field{:name "SAMLMetadataDocument", :shape "SAMLMetadataDocumentType"}) (clojure.core/into (serarn-type (input :saml-provider-arn)) #:http.request.field{:name "SAMLProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-update-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :new-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :new-path)) #:http.request.field{:name "NewPath", :shape "pathType"})) (clojure.core/contains? input :new-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sergroup-name-type (input :new-group-name)) #:http.request.field{:name "NewGroupName", :shape "groupNameType"}))))

(clojure.core/defn- req-create-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]} (clojure.core/contains? input :set-as-default) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :set-as-default)) #:http.request.field{:name "SetAsDefault", :shape "booleanType"}))))

(clojure.core/defn- req-put-user-permissions-boundary-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"})]}))

(clojure.spec.alpha/def :portkey.aws.iam/saml-provider-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/saml-provider-list-entry))

(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/versions (clojure.spec.alpha/and :portkey.aws.iam/policy-document-version-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policy-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-policy-versions-response/versions :portkey.aws.iam.list-policy-versions-response/is-truncated :portkey.aws.iam.list-policy-versions-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-request/assignment-status (clojure.spec.alpha/and :portkey.aws.iam/assignment-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-virtual-mfa-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-virtual-mfa-devices-request/assignment-status :portkey.aws.iam.list-virtual-mfa-devices-request/marker :portkey.aws.iam.list-virtual-mfa-devices-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-role-policy-response/role-name :portkey.aws.iam.get-role-policy-response/policy-name :portkey.aws.iam.get-role-policy-response/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-source-type #{"user-managed" :role "role" "resource" "none" :group "group" "user" :resource :usermanaged :awsmanaged "aws-managed" :user :none})

(clojure.spec.alpha/def :portkey.aws.iam/create-user-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/user]))

(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-response/mfa-devices (clojure.spec.alpha/and :portkey.aws.iam/mfa-device-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-mfa-devices-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-mfa-devices-response/mfa-devices] :opt-un [:portkey.aws.iam.list-mfa-devices-response/is-truncated :portkey.aws.iam.list-mfa-devices-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-resource-name (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-resource-decision (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-decision-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/matched-statements (clojure.spec.alpha/and :portkey.aws.iam/statement-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.resource-specific-result/eval-decision-details (clojure.spec.alpha/and :portkey.aws.iam/eval-decision-details-type))
(clojure.spec.alpha/def :portkey.aws.iam/resource-specific-result (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.resource-specific-result/eval-resource-name :portkey.aws.iam.resource-specific-result/eval-resource-decision] :opt-un [:portkey.aws.iam.resource-specific-result/matched-statements :portkey.aws.iam.resource-specific-result/missing-context-values :portkey.aws.iam.resource-specific-result/eval-decision-details]))

(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/minimum-password-length (clojure.spec.alpha/and :portkey.aws.iam/minimum-password-length-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-numbers (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-uppercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/hard-expiry (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-lowercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/require-symbols (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/allow-users-to-change-password (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/max-password-age (clojure.spec.alpha/and :portkey.aws.iam/max-password-age-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-account-password-policy-request/password-reuse-prevention (clojure.spec.alpha/and :portkey.aws.iam/password-reuse-prevention-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-account-password-policy-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.update-account-password-policy-request/minimum-password-length :portkey.aws.iam.update-account-password-policy-request/require-numbers :portkey.aws.iam.update-account-password-policy-request/require-uppercase-characters :portkey.aws.iam.update-account-password-policy-request/hard-expiry :portkey.aws.iam.update-account-password-policy-request/require-lowercase-characters :portkey.aws.iam.update-account-password-policy-request/require-symbols :portkey.aws.iam.update-account-password-policy-request/allow-users-to-change-password :portkey.aws.iam.update-account-password-policy-request/max-password-age :portkey.aws.iam.update-account-password-policy-request/password-reuse-prevention]))

(clojure.spec.alpha/def :portkey.aws.iam/unrecognized-public-key-encoding-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.get-access-key-last-used-response/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-access-key-last-used-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-access-key-last-used-response/user-name :portkey.aws.iam/access-key-last-used]))

(clojure.spec.alpha/def :portkey.aws.iam.get-open-id-connect-provider-request/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-open-id-connect-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-open-id-connect-provider-request/open-id-connect-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-role-request/role-name :portkey.aws.iam.create-role-request/assume-role-policy-document] :opt-un [:portkey.aws.iam.create-role-request/path :portkey.aws.iam.create-role-request/description :portkey.aws.iam.create-role-request/max-session-duration :portkey.aws.iam.create-role-request/permissions-boundary]))

(clojure.spec.alpha/def :portkey.aws.iam/context-entry-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-entry))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-material-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 16384)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/expiration (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.server-certificate-metadata/path :portkey.aws.iam.server-certificate-metadata/server-certificate-name :portkey.aws.iam.server-certificate-metadata/server-certificate-id :portkey.aws.iam.server-certificate-metadata/arn] :opt-un [:portkey.aws.iam.server-certificate-metadata/upload-date :portkey.aws.iam.server-certificate-metadata/expiration]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-login-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-login-profile-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-user-request/new-user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-user-request/user-name] :opt-un [:portkey.aws.iam.update-user-request/new-path :portkey.aws.iam.update-user-request/new-user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/get-login-profile-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/login-profile] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-role-policy-request/role-name :portkey.aws.iam.get-role-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-user-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/key-pair-mismatch-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.get-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-login-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-login-profile-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-metadata-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/server-certificate-metadata))

(clojure.spec.alpha/def :portkey.aws.iam/custom-suffix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/path-prefix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 512)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"\u002F[\u0021-\u007F]*" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-summary-response/summary-map (clojure.spec.alpha/and :portkey.aws.iam/summary-map-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-summary-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-account-summary-response/summary-map]))

(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/server-certificate-metadata-list (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-metadata-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-server-certificates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-server-certificates-response/server-certificate-metadata-list] :opt-un [:portkey.aws.iam.list-server-certificates-response/is-truncated :portkey.aws.iam.list-server-certificates-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/report-state-type #{:started :inprogress "COMPLETE" :complete "INPROGRESS" "STARTED"})

(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-users-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-users-request/path-prefix :portkey.aws.iam.list-users-request/marker :portkey.aws.iam.list-users-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-usage-type #{:permissions-policy "PermissionsPolicy" "PermissionsBoundary" :permissions-boundary})

(clojure.spec.alpha/def :portkey.aws.iam.policy-not-attachable-exception/message (clojure.spec.alpha/and :portkey.aws.iam/policy-not-attachable-message))
(clojure.spec.alpha/def :portkey.aws.iam/policy-not-attachable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-not-attachable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/virtual-mfa-device-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/virtual-mfa-device))

(clojure.spec.alpha/def :portkey.aws.iam/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 320)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/create-instance-profile-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/instance-profile] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-status-type #{"IN_PROGRESS" :in-progress "NOT_STARTED" "SUCCEEDED" "FAILED" :not-started :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.iam.login-profile/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.login-profile/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.login-profile/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/login-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.login-profile/user-name :portkey.aws.iam.login-profile/create-date] :opt-un [:portkey.aws.iam.login-profile/password-reset-required]))

(clojure.spec.alpha/def :portkey.aws.iam/date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.iam.server-certificate/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate/certificate-chain (clojure.spec.alpha/and :portkey.aws.iam/certificate-chain-type))
(clojure.spec.alpha/def :portkey.aws.iam/server-certificate (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/server-certificate-metadata :portkey.aws.iam.server-certificate/certificate-body] :opt-un [:portkey.aws.iam.server-certificate/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.iam/group-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.saml-provider-list-entry/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.saml-provider-list-entry/valid-until (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.saml-provider-list-entry/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/saml-provider-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.saml-provider-list-entry/arn :portkey.aws.iam.saml-provider-list-entry/valid-until :portkey.aws.iam.saml-provider-list-entry/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam/action-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 3 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-not-ready-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-not-ready-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-not-ready-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/get-ssh-public-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-user-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-attached-user-policies-request/user-name] :opt-un [:portkey.aws.iam.list-attached-user-policies-request/path-prefix :portkey.aws.iam.list-attached-user-policies-request/marker :portkey.aws.iam.list-attached-user-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/create-service-linked-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/role]))

(clojure.spec.alpha/def :portkey.aws.iam/group-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/list-open-id-connect-providers-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-version-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-version))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-public-key-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-public-key-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-public-key-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-public-key-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/region (clojure.spec.alpha/and :portkey.aws.iam/region-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/resources (clojure.spec.alpha/and :portkey.aws.iam/arn-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-usage-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.role-usage-type/region :portkey.aws.iam.role-usage-type/resources]))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/instance-profile-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.instance-profile/roles (clojure.spec.alpha/and :portkey.aws.iam/role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/instance-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.instance-profile/path :portkey.aws.iam.instance-profile/instance-profile-name :portkey.aws.iam.instance-profile/instance-profile-id :portkey.aws.iam.instance-profile/arn :portkey.aws.iam.instance-profile/create-date :portkey.aws.iam.instance-profile/roles] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-roles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-roles-request/path-prefix :portkey.aws.iam.list-roles-request/marker :portkey.aws.iam.list-roles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/saml-provider-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w._-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-server-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-server-certificate-request/server-certificate-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/attached-policies-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/attached-policy))

(clojure.spec.alpha/def :portkey.aws.iam.unrecognized-public-key-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iam/unrecognized-public-key-encoding-message))
(clojure.spec.alpha/def :portkey.aws.iam/unrecognized-public-key-encoding-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.unrecognized-public-key-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-identifier-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 16 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-expired-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-expired-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-expired-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/client-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-signing-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-signing-certificate-request/certificate-id] :opt-un [:portkey.aws.iam.delete-signing-certificate-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/set-default-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.set-default-policy-version-request/policy-arn :portkey.aws.iam.set-default-policy-version-request/version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-saml-provider-request/saml-metadata-document (clojure.spec.alpha/and :portkey.aws.iam/saml-metadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-saml-provider-request/name (clojure.spec.alpha/and :portkey.aws.iam/saml-provider-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-saml-provider-request/saml-metadata-document :portkey.aws.iam.create-saml-provider-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/eval-decision-source-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 3 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iam.password-policy/minimum-password-length (clojure.spec.alpha/and :portkey.aws.iam/minimum-password-length-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-numbers (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-uppercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/hard-expiry (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/expire-passwords (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-lowercase-characters (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/require-symbols (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/allow-users-to-change-password (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/max-password-age (clojure.spec.alpha/and :portkey.aws.iam/max-password-age-type))
(clojure.spec.alpha/def :portkey.aws.iam.password-policy/password-reuse-prevention (clojure.spec.alpha/and :portkey.aws.iam/password-reuse-prevention-type))
(clojure.spec.alpha/def :portkey.aws.iam/password-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.password-policy/minimum-password-length :portkey.aws.iam.password-policy/require-numbers :portkey.aws.iam.password-policy/require-uppercase-characters :portkey.aws.iam.password-policy/hard-expiry :portkey.aws.iam.password-policy/expire-passwords :portkey.aws.iam.password-policy/require-lowercase-characters :portkey.aws.iam.password-policy/require-symbols :portkey.aws.iam.password-policy/allow-users-to-change-password :portkey.aws.iam.password-policy/max-password-age :portkey.aws.iam.password-policy/password-reuse-prevention]))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-source-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-principal-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-source-arn] :opt-un [:portkey.aws.iam.get-context-keys-for-principal-policy-request/policy-input-list]))

(clojure.spec.alpha/def :portkey.aws.iam/summary-map-type (clojure.spec.alpha/map-of :portkey.aws.iam/summary-key-type :portkey.aws.iam/summary-value-type))

(clojure.spec.alpha/def :portkey.aws.iam.reset-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.reset-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam/reset-service-specific-credential-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.reset-service-specific-credential-request/service-specific-credential-id] :opt-un [:portkey.aws.iam.reset-service-specific-credential-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-group-policy-request/group-name :portkey.aws.iam.delete-group-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-saml-provider-response/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-saml-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.update-saml-provider-response/saml-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.iam/virtual-mfa-device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/no-such-entity-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/create-service-specific-credential-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/service-specific-credential]))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-group-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-attached-group-policies-request/group-name] :opt-un [:portkey.aws.iam.list-attached-group-policies-request/path-prefix :portkey.aws.iam.list-attached-group-policies-request/marker :portkey.aws.iam.list-attached-group-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.no-such-entity-exception/message (clojure.spec.alpha/and :portkey.aws.iam/no-such-entity-message))
(clojure.spec.alpha/def :portkey.aws.iam/no-such-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.no-such-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-name (clojure.spec.alpha/and :portkey.aws.iam/context-key-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-value-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.context-entry/context-key-type (clojure.spec.alpha/and :portkey.aws.iam/context-key-type-enum))
(clojure.spec.alpha/def :portkey.aws.iam/context-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.context-entry/context-key-name :portkey.aws.iam.context-entry/context-key-values :portkey.aws.iam.context-entry/context-key-type]))

(clojure.spec.alpha/def :portkey.aws.iam.remove-user-from-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-user-from-group-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/remove-user-from-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.remove-user-from-group-request/group-name :portkey.aws.iam.remove-user-from-group-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/user-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/user))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-group-policy-response/group-name :portkey.aws.iam.get-group-policy-response/policy-name :portkey.aws.iam.get-group-policy-response/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-not-present-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-not-present-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-present-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-not-present-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/permissions-boundary-attachment-type #{"PermissionsBoundaryPolicy" :permissions-boundary-policy})

(clojure.spec.alpha/def :portkey.aws.iam/thumbprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 40 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.iam/summary-key-type #{"AccountMFAEnabled" "VersionsPerPolicyQuota" :account-access-keys-present :user-policy-size-quota :policy-size-quota "PolicySizeQuota" :attached-policies-per-role-quota :policies-quota :mfa-devices-in-use :policies :access-keys-per-user-quota "ServerCertificates" "AccessKeysPerUserQuota" :versions-per-policy-quota "GroupsQuota" :server-certificates :groups-quota "AttachedPoliciesPerRoleQuota" :group-policy-size-quota "SigningCertificatesPerUserQuota" "GroupPolicySizeQuota" "PolicyVersionsInUse" :mfa-devices "UserPolicySizeQuota" :signing-certificates-per-user-quota "MFADevicesInUse" "Users" "Groups" :groups-per-user-quota "AccountSigningCertificatesPresent" "Policies" "AttachedPoliciesPerGroupQuota" "UsersQuota" "PoliciesQuota" "ServerCertificatesQuota" :policy-versions-in-use-quota "AccountAccessKeysPresent" :users-quota :groups :attached-policies-per-user-quota "GroupsPerUserQuota" :attached-policies-per-group-quota :server-certificates-quota :account-mfa-enabled :policy-versions-in-use "MFADevices" :account-signing-certificates-present :users "AttachedPoliciesPerUserQuota" "PolicyVersionsInUseQuota"})

(clojure.spec.alpha/def :portkey.aws.iam/instance-profile-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/instance-profile))

(clojure.spec.alpha/def :portkey.aws.iam.remove-role-from-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-role-from-instance-profile-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/remove-role-from-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.remove-role-from-instance-profile-request/instance-profile-name :portkey.aws.iam.remove-role-from-instance-profile-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-custom-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-custom-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-context-keys-for-custom-policy-request/policy-input-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-server-certificates-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-server-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-server-certificates-request/path-prefix :portkey.aws.iam.list-server-certificates-request/marker :portkey.aws.iam.list-server-certificates-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/password-policy-violation-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.generate-credential-report-response/state (clojure.spec.alpha/and :portkey.aws.iam/report-state-type))
(clojure.spec.alpha/def :portkey.aws.iam.generate-credential-report-response/description (clojure.spec.alpha/and :portkey.aws.iam/report-state-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/generate-credential-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.generate-credential-report-response/state :portkey.aws.iam.generate-credential-report-response/description]))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-certificate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-certificate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/malformed-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/statement-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/statement))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.create-saml-provider-response/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-saml-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.create-saml-provider-response/saml-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.get-context-keys-for-policy-response/context-key-names (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-context-keys-for-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-context-keys-for-policy-response/context-key-names]))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/instance-profiles (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-for-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-instance-profiles-for-role-response/instance-profiles] :opt-un [:portkey.aws.iam.list-instance-profiles-for-role-response/is-truncated :portkey.aws.iam.list-instance-profiles-for-role-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-signing-certificates-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-signing-certificates-request/user-name :portkey.aws.iam.list-signing-certificates-request/marker :portkey.aws.iam.list-signing-certificates-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.statement/source-policy-id (clojure.spec.alpha/and :portkey.aws.iam/policy-identifier-type))
(clojure.spec.alpha/def :portkey.aws.iam.statement/source-policy-type (clojure.spec.alpha/and :portkey.aws.iam/policy-source-type))
(clojure.spec.alpha/def :portkey.aws.iam.statement/start-position (clojure.spec.alpha/and :portkey.aws.iam/position))
(clojure.spec.alpha/def :portkey.aws.iam.statement/end-position (clojure.spec.alpha/and :portkey.aws.iam/position))
(clojure.spec.alpha/def :portkey.aws.iam/statement (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.statement/source-policy-id :portkey.aws.iam.statement/source-policy-type :portkey.aws.iam.statement/start-position :portkey.aws.iam.statement/end-position]))

(clojure.spec.alpha/def :portkey.aws.iam.malformed-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/malformed-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/malformed-certificate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.malformed-certificate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-role-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-role-policies-response/attached-policies :portkey.aws.iam.list-attached-role-policies-response/is-truncated :portkey.aws.iam.list-attached-role-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/encoding-type #{:pem :ssh "PEM" "SSH"})

(clojure.spec.alpha/def :portkey.aws.iam/policy-user-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-user))

(clojure.spec.alpha/def :portkey.aws.iam/role-max-session-duration-type (clojure.spec.alpha/int-in 3600 43200))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-linked-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-linked-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-service-linked-role-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.delete-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iam/delete-conflict-message))
(clojure.spec.alpha/def :portkey.aws.iam/delete-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.delete-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-group-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.put-group-policy-request/group-name :portkey.aws.iam.put-group-policy-request/policy-name :portkey.aws.iam.put-group-policy-request/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/account-alias-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 3 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 63)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.service-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iam/service-failure-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/service-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.service-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/create-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/role] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/account-alias-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/account-alias-type))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-secret-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/password-reuse-prevention-type (clojure.spec.alpha/int-in 1 24))

(clojure.spec.alpha/def :portkey.aws.iam/line-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/users (clojure.spec.alpha/and :portkey.aws.iam/user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/group :portkey.aws.iam.get-group-response/users] :opt-un [:portkey.aws.iam.get-group-response/is-truncated :portkey.aws.iam.get-group-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-user-type-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-user-type-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-user-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-user-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.iam/limit-exceeded-message))
(clojure.spec.alpha/def :portkey.aws.iam/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/user-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/user-detail))

(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/roles (clojure.spec.alpha/and :portkey.aws.iam/role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-roles-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-roles-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-roles-response/roles] :opt-un [:portkey.aws.iam.list-roles-response/is-truncated :portkey.aws.iam.list-roles-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/list-saml-providers-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-open-id-connect-provider-response/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-open-id-connect-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.create-open-id-connect-provider-response/open-id-connect-provider-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/groups (clojure.spec.alpha/and :portkey.aws.iam/group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-groups-response/groups] :opt-un [:portkey.aws.iam.list-groups-response/is-truncated :portkey.aws.iam.list-groups-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.detach-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-user-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.detach-user-policy-request/user-name :portkey.aws.iam.detach-user-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/column-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.policy-evaluation-exception/message (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-error-message))
(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-evaluation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/aws-service-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-linked-role-request/custom-suffix (clojure.spec.alpha/and :portkey.aws.iam/custom-suffix-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-service-linked-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-service-linked-role-request/aws-service-name] :opt-un [:portkey.aws.iam.create-service-linked-role-request/description :portkey.aws.iam.create-service-linked-role-request/custom-suffix]))

(clojure.spec.alpha/def :portkey.aws.iam.user/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/password-last-used (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam/user (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.user/path :portkey.aws.iam.user/user-name :portkey.aws.iam.user/user-id :portkey.aws.iam.user/arn :portkey.aws.iam.user/create-date] :opt-un [:portkey.aws.iam.user/password-last-used :portkey.aws.iam.user/permissions-boundary]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-access-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-access-key-request/access-key-id] :opt-un [:portkey.aws.iam.delete-access-key-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-saml-provider-request/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-saml-provider-request/saml-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-role (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-role/role-name :portkey.aws.iam.policy-role/role-id]))

(clojure.spec.alpha/def :portkey.aws.iam/attachment-count-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam/resource-handling-option-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.iam/ssh-public-key-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/ssh-public-key-metadata))

(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-user-name (clojure.spec.alpha/and :portkey.aws.iam/service-user-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential-metadata/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.service-specific-credential-metadata/user-name :portkey.aws.iam.service-specific-credential-metadata/status :portkey.aws.iam.service-specific-credential-metadata/service-user-name :portkey.aws.iam.service-specific-credential-metadata/create-date :portkey.aws.iam.service-specific-credential-metadata/service-specific-credential-id :portkey.aws.iam.service-specific-credential-metadata/service-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.detach-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-group-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.detach-group-policy-request/group-name :portkey.aws.iam.detach-group-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-role-description-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-description-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-role-description-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-role-description-request/role-name :portkey.aws.iam.update-role-description-request/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.duplicate-certificate-exception/message (clojure.spec.alpha/and :portkey.aws.iam/duplicate-certificate-message))
(clojure.spec.alpha/def :portkey.aws.iam/duplicate-certificate-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.duplicate-certificate-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.upload-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-ssh-public-key-request/ssh-public-key-body (clojure.spec.alpha/and :portkey.aws.iam/public-key-material-type))
(clojure.spec.alpha/def :portkey.aws.iam/upload-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.upload-ssh-public-key-request/user-name :portkey.aws.iam.upload-ssh-public-key-request/ssh-public-key-body] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.create-access-key-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"v[1-9][0-9]*(\.[A-Za-z0-9-]*)?" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-value-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.policy-version/document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-version/document :portkey.aws.iam.policy-version/version-id :portkey.aws.iam.policy-version/is-default-version :portkey.aws.iam.policy-version/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-role-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-role))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-input-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-fingerprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 48 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 48)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[:\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-group-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-group-policies-request/group-name] :opt-un [:portkey.aws.iam.list-group-policies-request/marker :portkey.aws.iam.list-group-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iam/entity-already-exists-message))
(clojure.spec.alpha/def :portkey.aws.iam/entity-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.entity-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/get-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/role] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/instance-profile-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/simulation-policy-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-document-type))

(clojure.spec.alpha/def :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-type (clojure.spec.alpha/and :portkey.aws.iam/permissions-boundary-attachment-type))
(clojure.spec.alpha/def :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attached-permissions-boundary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.attached-permissions-boundary/permissions-boundary-type :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-user-to-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.add-user-to-group-request/group-name :portkey.aws.iam.add-user-to-group-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 20 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-login-profile-request/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-login-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-login-profile-request/user-name :portkey.aws.iam.create-login-profile-request/password] :opt-un [:portkey.aws.iam.create-login-profile-request/password-reset-required]))

(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-access-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-access-keys-request/user-name :portkey.aws.iam.list-access-keys-request/marker :portkey.aws.iam.list-access-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.attach-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-group-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.attach-group-policy-request/group-name :portkey.aws.iam.attach-group-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-role-policies-request/role-name] :opt-un [:portkey.aws.iam.list-role-policies-request/marker :portkey.aws.iam.list-role-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.create-account-alias-request/account-alias (clojure.spec.alpha/and :portkey.aws.iam/account-alias-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-account-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-account-alias-request/account-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-action-name (clojure.spec.alpha/and :portkey.aws.iam/action-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-resource-name (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-decision (clojure.spec.alpha/and :portkey.aws.iam/policy-evaluation-decision-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/matched-statements (clojure.spec.alpha/and :portkey.aws.iam/statement-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/missing-context-values (clojure.spec.alpha/and :portkey.aws.iam/context-key-names-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/eval-decision-details (clojure.spec.alpha/and :portkey.aws.iam/eval-decision-details-type))
(clojure.spec.alpha/def :portkey.aws.iam.evaluation-result/resource-specific-results (clojure.spec.alpha/and :portkey.aws.iam/resource-specific-result-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/evaluation-result (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.evaluation-result/eval-action-name :portkey.aws.iam.evaluation-result/eval-decision] :opt-un [:portkey.aws.iam.evaluation-result/eval-resource-name :portkey.aws.iam.evaluation-result/matched-statements :portkey.aws.iam.evaluation-result/missing-context-values :portkey.aws.iam/organizations-decision-detail :portkey.aws.iam.evaluation-result/eval-decision-details :portkey.aws.iam.evaluation-result/resource-specific-results]))

(clojure.spec.alpha/def :portkey.aws.iam.attached-policy/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attached-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attached-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.attached-policy/policy-name :portkey.aws.iam.attached-policy/policy-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-request/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-policy-request/policy-name :portkey.aws.iam.create-policy-request/policy-document] :opt-un [:portkey.aws.iam.create-policy-request/path :portkey.aws.iam.create-policy-request/description]))

(clojure.spec.alpha/def :portkey.aws.iam/max-password-age-type (clojure.spec.alpha/int-in 1 1095))

(clojure.spec.alpha/def :portkey.aws.iam/entity-temporarily-unmodifiable-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-scope-type #{:aws "AWS" :all "Local" "All" :local})

(clojure.spec.alpha/def :portkey.aws.iam.delete-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-server-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-server-certificate-request/server-certificate-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/get-instance-profile-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/instance-profile] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/content (clojure.spec.alpha/and :portkey.aws.iam/report-content-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/report-format (clojure.spec.alpha/and :portkey.aws.iam/report-format-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-credential-report-response/generated-time (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-credential-report-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-credential-report-response/content :portkey.aws.iam.get-credential-report-response/report-format :portkey.aws.iam.get-credential-report-response/generated-time]))

(clojure.spec.alpha/def :portkey.aws.iam.policy-user/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-user/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-user (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-user/user-name :portkey.aws.iam.policy-user/user-id]))

(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-role-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.put-role-policy-request/role-name :portkey.aws.iam.put-role-policy-request/policy-name :portkey.aws.iam.put-role-policy-request/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/entity-filter (clojure.spec.alpha/and :portkey.aws.iam/entity-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/policy-usage-filter (clojure.spec.alpha/and :portkey.aws.iam/policy-usage-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-entities-for-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-entities-for-policy-request/policy-arn] :opt-un [:portkey.aws.iam.list-entities-for-policy-request/entity-filter :portkey.aws.iam.list-entities-for-policy-request/path-prefix :portkey.aws.iam.list-entities-for-policy-request/policy-usage-filter :portkey.aws.iam.list-entities-for-policy-request/marker :portkey.aws.iam.list-entities-for-policy-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/last-used-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/service-name (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-last-used/region (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key-last-used (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.access-key-last-used/last-used-date :portkey.aws.iam.access-key-last-used/service-name :portkey.aws.iam.access-key-last-used/region] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/fingerprint (clojure.spec.alpha/and :portkey.aws.iam/public-key-fingerprint-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/ssh-public-key-body (clojure.spec.alpha/and :portkey.aws.iam/public-key-material-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/ssh-public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.ssh-public-key/user-name :portkey.aws.iam.ssh-public-key/ssh-public-key-id :portkey.aws.iam.ssh-public-key/fingerprint :portkey.aws.iam.ssh-public-key/ssh-public-key-body :portkey.aws.iam.ssh-public-key/status] :opt-un [:portkey.aws.iam.ssh-public-key/upload-date]))

(clojure.spec.alpha/def :portkey.aws.iam/duplicate-certificate-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 131072)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.deactivate-mfa-device-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.deactivate-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam/deactivate-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.deactivate-mfa-device-request/user-name :portkey.aws.iam.deactivate-mfa-device-request/serial-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-request/deletion-task-id (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-linked-role-deletion-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-linked-role-deletion-status-request/deletion-task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.add-role-to-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-role-to-instance-profile-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-role-to-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.add-role-to-instance-profile-request/instance-profile-name :portkey.aws.iam.add-role-to-instance-profile-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-response/status (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-linked-role-deletion-status-response/reason (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-failure-reason-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-linked-role-deletion-status-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-linked-role-deletion-status-response/status] :opt-un [:portkey.aws.iam.get-service-linked-role-deletion-status-response/reason]))

(clojure.spec.alpha/def :portkey.aws.iam/role-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role-detail))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-user-policy-request/user-name :portkey.aws.iam.delete-user-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/bootstrap-datum clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iam.role/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.role/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/role (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.role/path :portkey.aws.iam.role/role-name :portkey.aws.iam.role/role-id :portkey.aws.iam.role/arn :portkey.aws.iam.role/create-date] :opt-un [:portkey.aws.iam.role/assume-role-policy-document :portkey.aws.iam.role/permissions-boundary :portkey.aws.iam.role/description :portkey.aws.iam.role/max-session-duration]))

(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-handling-option (clojure.spec.alpha/and :portkey.aws.iam/resource-handling-option-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/action-names (clojure.spec.alpha/and :portkey.aws.iam/action-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-arns (clojure.spec.alpha/and :portkey.aws.iam/resource-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/context-entries (clojure.spec.alpha/and :portkey.aws.iam/context-entry-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/resource-owner (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-custom-policy-request/caller-arn (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-custom-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.simulate-custom-policy-request/policy-input-list :portkey.aws.iam.simulate-custom-policy-request/action-names] :opt-un [:portkey.aws.iam.simulate-custom-policy-request/resource-handling-option :portkey.aws.iam.simulate-custom-policy-request/resource-policy :portkey.aws.iam.simulate-custom-policy-request/marker :portkey.aws.iam.simulate-custom-policy-request/resource-arns :portkey.aws.iam.simulate-custom-policy-request/context-entries :portkey.aws.iam.simulate-custom-policy-request/resource-owner :portkey.aws.iam.simulate-custom-policy-request/max-items :portkey.aws.iam.simulate-custom-policy-request/caller-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/access-key-metadata (clojure.spec.alpha/and :portkey.aws.iam/access-key-metadata-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-access-keys-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-access-keys-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-access-keys-response/access-key-metadata] :opt-un [:portkey.aws.iam.list-access-keys-response/is-truncated :portkey.aws.iam.list-access-keys-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/get-policy-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/policy-version]))

(clojure.spec.alpha/def :portkey.aws.iam/action-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/action-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.delete-account-alias-request/account-alias (clojure.spec.alpha/and :portkey.aws.iam/account-alias-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-account-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-account-alias-request/account-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-user-type-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/evaluation-results (clojure.spec.alpha/and :portkey.aws.iam/evaluation-results-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-policy-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.simulate-policy-response/evaluation-results :portkey.aws.iam.simulate-policy-response/is-truncated :portkey.aws.iam.simulate-policy-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/groups (clojure.spec.alpha/and :portkey.aws.iam/group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-for-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-groups-for-user-response/groups] :opt-un [:portkey.aws.iam.list-groups-for-user-response/is-truncated :portkey.aws.iam.list-groups-for-user-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.virtual-mfa-device/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.virtual-mfa-device/base-32-string-seed (clojure.spec.alpha/and :portkey.aws.iam/bootstrap-datum))
(clojure.spec.alpha/def :portkey.aws.iam.virtual-mfa-device/qr-code-png (clojure.spec.alpha/and :portkey.aws.iam/bootstrap-datum))
(clojure.spec.alpha/def :portkey.aws.iam.virtual-mfa-device/enable-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/virtual-mfa-device (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.virtual-mfa-device/serial-number] :opt-un [:portkey.aws.iam.virtual-mfa-device/base-32-string-seed :portkey.aws.iam.virtual-mfa-device/qr-code-png :portkey.aws.iam/user :portkey.aws.iam.virtual-mfa-device/enable-date]))

(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/certificates (clojure.spec.alpha/and :portkey.aws.iam/certificate-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-signing-certificates-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-signing-certificates-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-signing-certificates-response/certificates] :opt-un [:portkey.aws.iam.list-signing-certificates-response/is-truncated :portkey.aws.iam.list-signing-certificates-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.update-assume-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-assume-role-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-assume-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-assume-role-policy-request/role-name :portkey.aws.iam.update-assume-role-policy-request/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.duplicate-ssh-public-key-exception/message (clojure.spec.alpha/and :portkey.aws.iam/duplicate-ssh-public-key-message))
(clojure.spec.alpha/def :portkey.aws.iam/duplicate-ssh-public-key-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.duplicate-ssh-public-key-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.entity-temporarily-unmodifiable-exception/message (clojure.spec.alpha/and :portkey.aws.iam/entity-temporarily-unmodifiable-message))
(clojure.spec.alpha/def :portkey.aws.iam/entity-temporarily-unmodifiable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.entity-temporarily-unmodifiable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.mfa-device/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.mfa-device/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.mfa-device/enable-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/mfa-device (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.mfa-device/user-name :portkey.aws.iam.mfa-device/serial-number :portkey.aws.iam.mfa-device/enable-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.put-role-permissions-boundary-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-role-permissions-boundary-request/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-role-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.put-role-permissions-boundary-request/role-name :portkey.aws.iam.put-role-permissions-boundary-request/permissions-boundary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.unmodifiable-entity-exception/message (clojure.spec.alpha/and :portkey.aws.iam/unmodifiable-entity-message))
(clojure.spec.alpha/def :portkey.aws.iam/unmodifiable-entity-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.unmodifiable-entity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.get-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-virtual-mfa-device-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-virtual-mfa-device-request/virtual-mfa-device-name (clojure.spec.alpha/and :portkey.aws.iam/virtual-mfa-device-name))
(clojure.spec.alpha/def :portkey.aws.iam/create-virtual-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-virtual-mfa-device-request/virtual-mfa-device-name] :opt-un [:portkey.aws.iam.create-virtual-mfa-device-request/path]))

(clojure.spec.alpha/def :portkey.aws.iam/resource-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/resource-name-type))

(clojure.spec.alpha/def :portkey.aws.iam/status-type #{:inactive "Active" "Inactive" :active})

(clojure.spec.alpha/def :portkey.aws.iam/existing-user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/unmodifiable-entity-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/open-id-connect-provider-url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-mfa-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-mfa-devices-request/user-name :portkey.aws.iam.list-mfa-devices-request/marker :portkey.aws.iam.list-mfa-devices-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-instance-profiles-request/path-prefix :portkey.aws.iam.list-instance-profiles-request/marker :portkey.aws.iam.list-instance-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/authentication-code-1 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/authentication-code-2 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam/enable-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.enable-mfa-device-request/user-name :portkey.aws.iam.enable-mfa-device-request/serial-number :portkey.aws.iam.enable-mfa-device-request/authentication-code-1 :portkey.aws.iam.enable-mfa-device-request/authentication-code-2] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-user-policies-response/policy-names] :opt-un [:portkey.aws.iam.list-user-policies-response/is-truncated :portkey.aws.iam.list-user-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 16 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-signing-certificate-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-signing-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-signing-certificate-request/certificate-id :portkey.aws.iam.update-signing-certificate-request/status] :opt-un [:portkey.aws.iam.update-signing-certificate-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.get-open-id-connect-provider-response/url (clojure.spec.alpha/and :portkey.aws.iam/open-id-connect-provider-url-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-open-id-connect-provider-response/client-id-list (clojure.spec.alpha/and :portkey.aws.iam/client-id-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-open-id-connect-provider-response/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-open-id-connect-provider-response/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-open-id-connect-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-open-id-connect-provider-response/url :portkey.aws.iam.get-open-id-connect-provider-response/client-id-list :portkey.aws.iam.get-open-id-connect-provider-response/thumbprint-list :portkey.aws.iam.get-open-id-connect-provider-response/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam/role-usage-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role-usage-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-access-key-last-used-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-access-key-last-used-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-access-key-last-used-request/access-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.key-pair-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.iam/key-pair-mismatch-message))
(clojure.spec.alpha/def :portkey.aws.iam/key-pair-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.key-pair-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-group-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-group-policies-response/policy-names] :opt-un [:portkey.aws.iam.list-group-policies-response/is-truncated :portkey.aws.iam.list-group-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/get-server-certificate-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/server-certificate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.iam/malformed-policy-document-message))
(clojure.spec.alpha/def :portkey.aws.iam/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.create-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-service-specific-credential-request/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/create-service-specific-credential-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-service-specific-credential-request/user-name :portkey.aws.iam.create-service-specific-credential-request/service-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-policy-version-request/policy-arn :portkey.aws.iam.delete-policy-version-request/version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-input-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-input-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-group-request/group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-present-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/policy]))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-value-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-key-value-type))

(clojure.spec.alpha/def :portkey.aws.iam/create-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/policy]))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-group-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-group-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-group-policies-response/attached-policies :portkey.aws.iam.list-attached-group-policies-response/is-truncated :portkey.aws.iam.list-attached-group-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/resource-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/ssh-public-keys (clojure.spec.alpha/and :portkey.aws.iam/ssh-public-key-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-ssh-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-ssh-public-keys-response/ssh-public-keys :portkey.aws.iam.list-ssh-public-keys-response/is-truncated :portkey.aws.iam.list-ssh-public-keys-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/boolean-object-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-permissions-boundary-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-role-permissions-boundary-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.user-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/group-list (clojure.spec.alpha/and :portkey.aws.iam/group-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/user-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.user-detail/path :portkey.aws.iam.user-detail/create-date :portkey.aws.iam.user-detail/group-list :portkey.aws.iam.user-detail/user-id :portkey.aws.iam.user-detail/permissions-boundary :portkey.aws.iam.user-detail/user-name :portkey.aws.iam.user-detail/arn :portkey.aws.iam.user-detail/user-policy-list :portkey.aws.iam.user-detail/attached-managed-policies]))

(clojure.spec.alpha/def :portkey.aws.iam/upload-ssh-public-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-virtual-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-virtual-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-virtual-mfa-device-request/serial-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/managed-policy-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/managed-policy-detail))

(clojure.spec.alpha/def :portkey.aws.iam/saml-metadata-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1000 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 10000000))))

(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-policy-versions-request/policy-arn] :opt-un [:portkey.aws.iam.list-policy-versions-request/marker :portkey.aws.iam.list-policy-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-policy-version-request/policy-arn :portkey.aws.iam.get-policy-version-request/version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.detach-role-policy-request/role-name :portkey.aws.iam.detach-role-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/reason-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.position/line (clojure.spec.alpha/and :portkey.aws.iam/line-number))
(clojure.spec.alpha/def :portkey.aws.iam.position/column (clojure.spec.alpha/and :portkey.aws.iam/column-number))
(clojure.spec.alpha/def :portkey.aws.iam/position (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.position/line :portkey.aws.iam.position/column]))

(clojure.spec.alpha/def :portkey.aws.iam/delete-conflict-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/authentication-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 6 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 6)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\d]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/max-items-type (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iam.get-saml-provider-request/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-saml-provider-request/saml-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-type-enum #{"boolean" :binary :date-list :numeric-list "numeric" :date "booleanList" :boolean-list "string" :ip "binaryList" :numeric "ipList" "binary" :string-list :string "numericList" "ip" :ip-list "dateList" "date" "stringList" :binary-list :boolean})

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-account-aliases-request/marker :portkey.aws.iam.list-account-aliases-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/filter (clojure.spec.alpha/and :portkey.aws.iam/entity-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-authorization-details-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-account-authorization-details-request/filter :portkey.aws.iam.get-account-authorization-details-request/max-items :portkey.aws.iam.get-account-authorization-details-request/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/evaluation-results-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/evaluation-result))

(clojure.spec.alpha/def :portkey.aws.iam/assignment-status-type #{:assigned "Any" "Unassigned" :unassigned "Assigned" :any})

(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-ssh-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-ssh-public-keys-request/user-name :portkey.aws.iam.list-ssh-public-keys-request/marker :portkey.aws.iam.list-ssh-public-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/signing-certificate))

(clojure.spec.alpha/def :portkey.aws.iam/client-id-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/client-id-type))

(clojure.spec.alpha/def :portkey.aws.iam.service-not-supported-exception/message (clojure.spec.alpha/and :portkey.aws.iam/service-not-supported-message))
(clojure.spec.alpha/def :portkey.aws.iam/service-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.service-not-supported-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-body-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 16384)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/upload-server-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/server-certificate-metadata]))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-login-profile-request/password-reset-required (clojure.spec.alpha/and :portkey.aws.iam/boolean-object-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-login-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-login-profile-request/user-name] :opt-un [:portkey.aws.iam.update-login-profile-request/password :portkey.aws.iam.update-login-profile-request/password-reset-required]))

(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/permissions-boundary-usage-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/attachment-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/is-attachable (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/default-version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/update-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.managed-policy-detail/policy-version-list (clojure.spec.alpha/and :portkey.aws.iam/policy-document-version-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/managed-policy-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.managed-policy-detail/permissions-boundary-usage-count :portkey.aws.iam.managed-policy-detail/policy-name :portkey.aws.iam.managed-policy-detail/path :portkey.aws.iam.managed-policy-detail/create-date :portkey.aws.iam.managed-policy-detail/attachment-count :portkey.aws.iam.managed-policy-detail/is-attachable :portkey.aws.iam.managed-policy-detail/default-version-id :portkey.aws.iam.managed-policy-detail/policy-id :portkey.aws.iam.managed-policy-detail/description :portkey.aws.iam.managed-policy-detail/update-date :portkey.aws.iam.managed-policy-detail/arn :portkey.aws.iam.managed-policy-detail/policy-version-list]))

(clojure.spec.alpha/def :portkey.aws.iam.list-open-id-connect-providers-response/open-id-connect-provider-list (clojure.spec.alpha/and :portkey.aws.iam/open-id-connect-provider-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-open-id-connect-providers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-open-id-connect-providers-response/open-id-connect-provider-list]))

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/scope (clojure.spec.alpha/and :portkey.aws.iam/policy-scope-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/only-attached (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/policy-usage-filter (clojure.spec.alpha/and :portkey.aws.iam/policy-usage-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-policies-request/scope :portkey.aws.iam.list-policies-request/only-attached :portkey.aws.iam.list-policies-request/path-prefix :portkey.aws.iam.list-policies-request/policy-usage-filter :portkey.aws.iam.list-policies-request/marker :portkey.aws.iam.list-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/eval-decision-details-type (clojure.spec.alpha/map-of :portkey.aws.iam/eval-decision-source-type :portkey.aws.iam/policy-evaluation-decision-type))

(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key-metadata/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.access-key-metadata/user-name :portkey.aws.iam.access-key-metadata/access-key-id :portkey.aws.iam.access-key-metadata/status :portkey.aws.iam.access-key-metadata/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-not-attachable-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-chain-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 2097152)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-group-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-group))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-description-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/role]))

(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/old-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/new-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam/change-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.change-password-request/old-password :portkey.aws.iam.change-password-request/new-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/account-aliases (clojure.spec.alpha/and :portkey.aws.iam/account-alias-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-account-aliases-response/account-aliases] :opt-un [:portkey.aws.iam.list-account-aliases-response/is-truncated :portkey.aws.iam.list-account-aliases-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 24 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.create-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-instance-profile-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-instance-profile-request/instance-profile-name] :opt-un [:portkey.aws.iam.create-instance-profile-request/path]))

(clojure.spec.alpha/def :portkey.aws.iam.list-saml-providers-response/saml-provider-list (clojure.spec.alpha/and :portkey.aws.iam/saml-provider-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-saml-providers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-saml-providers-response/saml-provider-list]))

(clojure.spec.alpha/def :portkey.aws.iam.create-open-id-connect-provider-request/url (clojure.spec.alpha/and :portkey.aws.iam/open-id-connect-provider-url-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-open-id-connect-provider-request/client-id-list (clojure.spec.alpha/and :portkey.aws.iam/client-id-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-open-id-connect-provider-request/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-open-id-connect-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-open-id-connect-provider-request/url :portkey.aws.iam.create-open-id-connect-provider-request/thumbprint-list] :opt-un [:portkey.aws.iam.create-open-id-connect-provider-request/client-id-list]))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-names-result-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-key-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.resync-mfa-device-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.resync-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.resync-mfa-device-request/authentication-code-1 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam.resync-mfa-device-request/authentication-code-2 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam/resync-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.resync-mfa-device-request/user-name :portkey.aws.iam.resync-mfa-device-request/serial-number :portkey.aws.iam.resync-mfa-device-request/authentication-code-1 :portkey.aws.iam.resync-mfa-device-request/authentication-code-2] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/thumbprint-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/thumbprint-type))

(clojure.spec.alpha/def :portkey.aws.iam.delete-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-instance-profile-request/instance-profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 20 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 5 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-groups-request/path-prefix :portkey.aws.iam.list-groups-request/marker :portkey.aws.iam.list-groups-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-user-request/user-name] :opt-un [:portkey.aws.iam.create-user-request/path :portkey.aws.iam.create-user-request/permissions-boundary]))

(clojure.spec.alpha/def :portkey.aws.iam/service-not-supported-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.policy-group/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-group/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-group/group-name :portkey.aws.iam.policy-group/group-id]))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-for-user-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-for-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-groups-for-user-request/user-name] :opt-un [:portkey.aws.iam.list-groups-for-user-request/marker :portkey.aws.iam.list-groups-for-user-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-public-key-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.remove-client-id-from-open-id-connect-provider-request/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.remove-client-id-from-open-id-connect-provider-request/client-id (clojure.spec.alpha/and :portkey.aws.iam/client-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/remove-client-id-from-open-id-connect-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.remove-client-id-from-open-id-connect-provider-request/open-id-connect-provider-arn :portkey.aws.iam.remove-client-id-from-open-id-connect-provider-request/client-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/region-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.iam/get-account-password-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/password-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/create-group-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-for-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-instance-profiles-for-role-request/role-name] :opt-un [:portkey.aws.iam.list-instance-profiles-for-role-request/marker :portkey.aws.iam.list-instance-profiles-for-role-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-user-policy-request/user-name :portkey.aws.iam.get-user-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/malformed-policy-document-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.signing-certificate/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/signing-certificate (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.signing-certificate/user-name :portkey.aws.iam.signing-certificate/certificate-id :portkey.aws.iam.signing-certificate/certificate-body :portkey.aws.iam.signing-certificate/status] :opt-un [:portkey.aws.iam.signing-certificate/upload-date]))

(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-user-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.put-user-policy-request/user-name :portkey.aws.iam.put-user-policy-request/policy-name :portkey.aws.iam.put-user-policy-request/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/report-state-description-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-response/certificate (clojure.spec.alpha/and :portkey.aws.iam/signing-certificate))
(clojure.spec.alpha/def :portkey.aws.iam/upload-signing-certificate-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.upload-signing-certificate-response/certificate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-group-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-group-request/group-name] :opt-un [:portkey.aws.iam.create-group-request/path]))

(clojure.spec.alpha/def :portkey.aws.iam/private-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 16384)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/report-format-type #{:textcsv "text/csv"})

(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-role-policies-response/policy-names] :opt-un [:portkey.aws.iam.list-role-policies-response/is-truncated :portkey.aws.iam.list-role-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.get-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-instance-profile-request/instance-profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/instance-profile-list (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.role-detail/role-id :portkey.aws.iam.role-detail/instance-profile-list :portkey.aws.iam.role-detail/assume-role-policy-document :portkey.aws.iam.role-detail/path :portkey.aws.iam.role-detail/role-name :portkey.aws.iam.role-detail/create-date :portkey.aws.iam.role-detail/role-policy-list :portkey.aws.iam.role-detail/permissions-boundary :portkey.aws.iam.role-detail/arn :portkey.aws.iam.role-detail/attached-managed-policies]))

(clojure.spec.alpha/def :portkey.aws.iam/reset-service-specific-credential-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/service-specific-credential]))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credentials-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/service-specific-credential-metadata))

(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.attach-role-policy-request/role-name :portkey.aws.iam.attach-role-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 9 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 256)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/role-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 1000)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-detail))

(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-response/service-specific-credentials (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credentials-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-service-specific-credentials-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-service-specific-credentials-response/service-specific-credentials]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-user-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.policy/permissions-boundary-usage-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/path (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/attachment-count (clojure.spec.alpha/and :portkey.aws.iam/attachment-count-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/is-attachable (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/default-version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/policy-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/description (clojure.spec.alpha/and :portkey.aws.iam/policy-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/update-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy/permissions-boundary-usage-count :portkey.aws.iam.policy/policy-name :portkey.aws.iam.policy/path :portkey.aws.iam.policy/create-date :portkey.aws.iam.policy/attachment-count :portkey.aws.iam.policy/is-attachable :portkey.aws.iam.policy/default-version-id :portkey.aws.iam.policy/policy-id :portkey.aws.iam.policy/description :portkey.aws.iam.policy/update-date :portkey.aws.iam.policy/arn]))

(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-service-specific-credentials-request/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam/list-service-specific-credentials-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-service-specific-credentials-request/user-name :portkey.aws.iam.list-service-specific-credentials-request/service-name]))

(clojure.spec.alpha/def :portkey.aws.iam.add-client-id-to-open-id-connect-provider-request/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-client-id-to-open-id-connect-provider-request/client-id (clojure.spec.alpha/and :portkey.aws.iam/client-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-client-id-to-open-id-connect-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.add-client-id-to-open-id-connect-provider-request/open-id-connect-provider-arn :portkey.aws.iam.add-client-id-to-open-id-connect-provider-request/client-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.organizations-decision-detail/allowed-by-organizations (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/organizations-decision-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.organizations-decision-detail/allowed-by-organizations]))

(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/private-key (clojure.spec.alpha/and :portkey.aws.iam/private-key-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-server-certificate-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.iam/certificate-chain-type))
(clojure.spec.alpha/def :portkey.aws.iam/upload-server-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.upload-server-certificate-request/server-certificate-name :portkey.aws.iam.upload-server-certificate-request/certificate-body :portkey.aws.iam.upload-server-certificate-request/private-key] :opt-un [:portkey.aws.iam.upload-server-certificate-request/path :portkey.aws.iam.upload-server-certificate-request/certificate-chain]))

(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/access-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-metadata-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/access-key-metadata))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-group-policy-request/group-name :portkey.aws.iam.get-group-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/create-login-profile-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/login-profile] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-role-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-role-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-attached-role-policies-request/role-name] :opt-un [:portkey.aws.iam.list-attached-role-policies-request/path-prefix :portkey.aws.iam.list-attached-role-policies-request/marker :portkey.aws.iam.list-attached-role-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/arn-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/arn-type))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-group-request/group-name] :opt-un [:portkey.aws.iam.get-group-request/marker :portkey.aws.iam.get-group-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/duplicate-ssh-public-key-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/instance-profiles (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-instance-profiles-response/instance-profiles] :opt-un [:portkey.aws.iam.list-instance-profiles-response/is-truncated :portkey.aws.iam.list-instance-profiles-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/service-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 17 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 200)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-groups (clojure.spec.alpha/and :portkey.aws.iam/policy-group-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-users (clojure.spec.alpha/and :portkey.aws.iam/policy-user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/policy-roles (clojure.spec.alpha/and :portkey.aws.iam/policy-role-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-entities-for-policy-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-entities-for-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-entities-for-policy-response/policy-groups :portkey.aws.iam.list-entities-for-policy-response/policy-users :portkey.aws.iam.list-entities-for-policy-response/policy-roles :portkey.aws.iam.list-entities-for-policy-response/is-truncated :portkey.aws.iam.list-entities-for-policy-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/mfa-device-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/mfa-device))

(clojure.spec.alpha/def :portkey.aws.iam/minimum-password-length-type (clojure.spec.alpha/int-in 6 128))

(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.update-service-specific-credential-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-service-specific-credential-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-service-specific-credential-request/service-specific-credential-id :portkey.aws.iam.update-service-specific-credential-request/status] :opt-un [:portkey.aws.iam.update-service-specific-credential-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"((/[A-Za-z0-9\.,\+@=_-]+)*)/" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/entity-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/entity-type))

(clojure.spec.alpha/def :portkey.aws.iam.policy-detail/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-detail/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-detail/policy-name :portkey.aws.iam.policy-detail/policy-document]))

(clojure.spec.alpha/def :portkey.aws.iam.update-open-id-connect-provider-thumbprint-request/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-open-id-connect-provider-thumbprint-request/thumbprint-list (clojure.spec.alpha/and :portkey.aws.iam/thumbprint-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-open-id-connect-provider-thumbprint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-open-id-connect-provider-thumbprint-request/open-id-connect-provider-arn :portkey.aws.iam.update-open-id-connect-provider-thumbprint-request/thumbprint-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/create-virtual-mfa-device-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/virtual-mfa-device] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/policies (clojure.spec.alpha/and :portkey.aws.iam/policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-policies-response/policies :portkey.aws.iam.list-policies-response/is-truncated :portkey.aws.iam.list-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.password-policy-violation-exception/message (clojure.spec.alpha/and :portkey.aws.iam/password-policy-violation-message))
(clojure.spec.alpha/def :portkey.aws.iam/password-policy-violation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.password-policy-violation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.open-id-connect-provider-list-entry/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/open-id-connect-provider-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.open-id-connect-provider-list-entry/arn]))

(clojure.spec.alpha/def :portkey.aws.iam/summary-value-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-role-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/encoding (clojure.spec.alpha/and :portkey.aws.iam/encoding-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-ssh-public-key-request/user-name :portkey.aws.iam.get-ssh-public-key-request/ssh-public-key-id :portkey.aws.iam.get-ssh-public-key-request/encoding] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-handling-option (clojure.spec.alpha/and :portkey.aws.iam/resource-handling-option-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/policy-source-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/action-names (clojure.spec.alpha/and :portkey.aws.iam/action-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-arns (clojure.spec.alpha/and :portkey.aws.iam/resource-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/context-entries (clojure.spec.alpha/and :portkey.aws.iam/context-entry-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/policy-input-list (clojure.spec.alpha/and :portkey.aws.iam/simulation-policy-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/resource-owner (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.simulate-principal-policy-request/caller-arn (clojure.spec.alpha/and :portkey.aws.iam/resource-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/simulate-principal-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.simulate-principal-policy-request/policy-source-arn :portkey.aws.iam.simulate-principal-policy-request/action-names] :opt-un [:portkey.aws.iam.simulate-principal-policy-request/resource-handling-option :portkey.aws.iam.simulate-principal-policy-request/resource-policy :portkey.aws.iam.simulate-principal-policy-request/marker :portkey.aws.iam.simulate-principal-policy-request/resource-arns :portkey.aws.iam.simulate-principal-policy-request/context-entries :portkey.aws.iam.simulate-principal-policy-request/policy-input-list :portkey.aws.iam.simulate-principal-policy-request/resource-owner :portkey.aws.iam.simulate-principal-policy-request/max-items :portkey.aws.iam.simulate-principal-policy-request/caller-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-access-key-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-access-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-access-key-request/access-key-id :portkey.aws.iam.update-access-key-request/status] :opt-un [:portkey.aws.iam.update-access-key-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-authentication-code-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-authentication-code-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-authentication-code-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-authentication-code-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/role-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/role))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 20 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 128)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.group/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.group/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/group (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.group/path :portkey.aws.iam.group/group-name :portkey.aws.iam.group/group-id :portkey.aws.iam.group/arn :portkey.aws.iam.group/create-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/group-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group-detail))

(clojure.spec.alpha/def :portkey.aws.iam.get-saml-provider-response/saml-metadata-document (clojure.spec.alpha/and :portkey.aws.iam/saml-metadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-saml-provider-response/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-saml-provider-response/valid-until (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-saml-provider-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-saml-provider-response/saml-metadata-document :portkey.aws.iam.get-saml-provider-response/create-date :portkey.aws.iam.get-saml-provider-response/valid-until]))

(clojure.spec.alpha/def :portkey.aws.iam.deletion-task-failure-reason-type/reason (clojure.spec.alpha/and :portkey.aws.iam/reason-type))
(clojure.spec.alpha/def :portkey.aws.iam.deletion-task-failure-reason-type/role-usage-list (clojure.spec.alpha/and :portkey.aws.iam/role-usage-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-failure-reason-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.deletion-task-failure-reason-type/reason :portkey.aws.iam.deletion-task-failure-reason-type/role-usage-list]))

(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key-metadata/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key-metadata/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key-metadata/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.ssh-public-key-metadata/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/ssh-public-key-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.ssh-public-key-metadata/user-name :portkey.aws.iam.ssh-public-key-metadata/ssh-public-key-id :portkey.aws.iam.ssh-public-key-metadata/status :portkey.aws.iam.ssh-public-key-metadata/upload-date] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.delete-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-ssh-public-key-request/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-ssh-public-key-request/user-name :portkey.aws.iam.delete-ssh-public-key-request/ssh-public-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 512)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"(\u002F)|(\u002F[\u0021-\u007F]+\u002F)" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-permissions-boundary-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-user-permissions-boundary-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-ssh-public-key-request/user-name :portkey.aws.iam.update-ssh-public-key-request/ssh-public-key-id :portkey.aws.iam.update-ssh-public-key-request/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.delete-open-id-connect-provider-request/open-id-connect-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-open-id-connect-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-open-id-connect-provider-request/open-id-connect-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/group-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/group))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-specific-credential-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-service-specific-credential-request/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-specific-credential-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-service-specific-credential-request/service-specific-credential-id] :opt-un [:portkey.aws.iam.delete-service-specific-credential-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-evaluation-decision-type #{"implicitDeny" "allowed" :explicit-deny "explicitDeny" :implicit-deny :allowed})

(clojure.spec.alpha/def :portkey.aws.iam/entity-already-exists-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/entity-type #{:role :local-managed-policy :group "LocalManagedPolicy" "User" "Role" "AWSManagedPolicy" "Group" :user :aws-managed-policy})

(clojure.spec.alpha/def :portkey.aws.iam/open-id-connect-provider-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/open-id-connect-provider-list-entry))

(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-user-name (clojure.spec.alpha/and :portkey.aws.iam/service-user-name))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-password (clojure.spec.alpha/and :portkey.aws.iam/service-password))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/service-specific-credential-id (clojure.spec.alpha/and :portkey.aws.iam/service-specific-credential-id))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-specific-credential/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.service-specific-credential/create-date :portkey.aws.iam.service-specific-credential/service-name :portkey.aws.iam.service-specific-credential/service-user-name :portkey.aws.iam.service-specific-credential/service-password :portkey.aws.iam.service-specific-credential/service-specific-credential-id :portkey.aws.iam.service-specific-credential/user-name :portkey.aws.iam.service-specific-credential/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/attached-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-user-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-attached-user-policies-response/attached-policies :portkey.aws.iam.list-attached-user-policies-response/is-truncated :portkey.aws.iam.list-attached-user-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/limit-exceeded-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-server-certificate-request/new-server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-server-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-server-certificate-request/server-certificate-name] :opt-un [:portkey.aws.iam.update-server-certificate-request/new-path :portkey.aws.iam.update-server-certificate-request/new-server-certificate-name]))

(clojure.spec.alpha/def :portkey.aws.iam/resource-specific-result-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/resource-specific-result))

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-role-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-role-policy-request/role-name :portkey.aws.iam.delete-role-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.upload-signing-certificate-request/certificate-body (clojure.spec.alpha/and :portkey.aws.iam/certificate-body-type))
(clojure.spec.alpha/def :portkey.aws.iam/upload-signing-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.upload-signing-certificate-request/certificate-body] :opt-un [:portkey.aws.iam.upload-signing-certificate-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.access-key/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/secret-access-key (clojure.spec.alpha/and :portkey.aws.iam/access-key-secret-type))
(clojure.spec.alpha/def :portkey.aws.iam.access-key/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/access-key (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.access-key/user-name :portkey.aws.iam.access-key/access-key-id :portkey.aws.iam.access-key/status :portkey.aws.iam.access-key/secret-access-key] :opt-un [:portkey.aws.iam.access-key/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/users (clojure.spec.alpha/and :portkey.aws.iam/user-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-users-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-users-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-users-response/users] :opt-un [:portkey.aws.iam.list-users-response/is-truncated :portkey.aws.iam.list-users-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-authentication-code-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/create-policy-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/policy-version]))

(clojure.spec.alpha/def :portkey.aws.iam/role-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__254996__auto__] (clojure.core/<= 1 (clojure.core/count s__254996__auto__))) (clojure.core/fn [s__254997__auto__] (clojure.core/< (clojure.core/count s__254997__auto__) 64)) (clojure.core/fn [s__254998__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__254998__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.attach-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-user-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.attach-user-policy-request/user-name :portkey.aws.iam.attach-user-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-user-policies-request/user-name] :opt-un [:portkey.aws.iam.list-user-policies-request/marker :portkey.aws.iam.list-user-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/user-detail-list (clojure.spec.alpha/and :portkey.aws.iam/user-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/group-detail-list (clojure.spec.alpha/and :portkey.aws.iam/group-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/role-detail-list (clojure.spec.alpha/and :portkey.aws.iam/role-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/policies (clojure.spec.alpha/and :portkey.aws.iam/managed-policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-account-authorization-details-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-account-authorization-details-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.get-account-authorization-details-response/user-detail-list :portkey.aws.iam.get-account-authorization-details-response/group-detail-list :portkey.aws.iam.get-account-authorization-details-response/role-detail-list :portkey.aws.iam.get-account-authorization-details-response/policies :portkey.aws.iam.get-account-authorization-details-response/is-truncated :portkey.aws.iam.get-account-authorization-details-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.get-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-role-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-role-request/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-role-request/role-name] :opt-un [:portkey.aws.iam.update-role-request/description :portkey.aws.iam.update-role-request/max-session-duration]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-service-linked-role-response/deletion-task-id (clojure.spec.alpha/and :portkey.aws.iam/deletion-task-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-service-linked-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-service-linked-role-response/deletion-task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-saml-provider-request/saml-metadata-document (clojure.spec.alpha/and :portkey.aws.iam/saml-metadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-saml-provider-request/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-saml-provider-request/saml-metadata-document :portkey.aws.iam.update-saml-provider-request/saml-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy))

(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-response/virtual-mfa-devices (clojure.spec.alpha/and :portkey.aws.iam/virtual-mfa-device-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-virtual-mfa-devices-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-virtual-mfa-devices-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-virtual-mfa-devices-response/virtual-mfa-devices] :opt-un [:portkey.aws.iam.list-virtual-mfa-devices-response/is-truncated :portkey.aws.iam.list-virtual-mfa-devices-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/new-path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-group-request/new-group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-group-request/group-name] :opt-un [:portkey.aws.iam.update-group-request/new-path :portkey.aws.iam.update-group-request/new-group-name]))

(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-policy-version-request/set-as-default (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-policy-version-request/policy-arn :portkey.aws.iam.create-policy-version-request/policy-document] :opt-un [:portkey.aws.iam.create-policy-version-request/set-as-default]))

(clojure.spec.alpha/def :portkey.aws.iam/report-content-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.iam/service-password (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.put-user-permissions-boundary-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.put-user-permissions-boundary-request/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/put-user-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.put-user-permissions-boundary-request/user-name :portkey.aws.iam.put-user-permissions-boundary-request/permissions-boundary] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-response/policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-user-policy-response/user-name :portkey.aws.iam.get-user-policy-response/policy-name :portkey.aws.iam.get-user-policy-response/policy-document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/get-user-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/user] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.group-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/group-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.group-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/group-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.group-detail/path :portkey.aws.iam.group-detail/group-name :portkey.aws.iam.group-detail/group-id :portkey.aws.iam.group-detail/arn :portkey.aws.iam.group-detail/create-date :portkey.aws.iam.group-detail/group-policy-list :portkey.aws.iam.group-detail/attached-managed-policies]))

(clojure.spec.alpha/def :portkey.aws.iam/service-failure-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn list-attached-user-policies ([list-attached-user-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-attached-user-policies-request list-attached-user-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-attached-user-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-user-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttachedUserPolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-user-policies-response))

(clojure.core/defn get-ssh-public-key ([get-ssh-public-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-ssh-public-key-request get-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-ssh-public-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSSHPublicKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}})))))
(clojure.spec.alpha/fdef get-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-ssh-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-ssh-public-key-response))

(clojure.core/defn create-service-specific-credential ([create-service-specific-credential-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-service-specific-credential-request create-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-service-specific-credential-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateServiceSpecificCredential", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}})))))
(clojure.spec.alpha/fdef create-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-specific-credential-response))

(clojure.core/defn list-signing-certificates ([] (list-signing-certificates {})) ([list-signing-certificates-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-signing-certificates-request list-signing-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-signing-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-signing-certificates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSigningCertificates", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-signing-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-signing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-signing-certificates-response))

(clojure.core/defn list-attached-group-policies ([list-attached-group-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-attached-group-policies-request list-attached-group-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-attached-group-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-group-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttachedGroupPolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-group-policies-response))

(clojure.core/defn detach-group-policy ([detach-group-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-detach-group-policy-request detach-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachGroupPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-policy-versions ([list-policy-versions-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-policy-versions-request list-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-policy-versions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicyVersions", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policy-versions-response))

(clojure.core/defn delete-policy-version ([delete-policy-version-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-policy-version-request delete-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicyVersion", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-account-alias ([delete-account-alias-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-account-alias-request delete-account-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-account-alias-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAccountAlias", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn attach-role-policy ([attach-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-attach-role-policy-request attach-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachRolePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn delete-server-certificate ([delete-server-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-server-certificate-request delete-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServerCertificate", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn update-saml-provider ([update-saml-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-saml-provider-request update-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/update-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSAMLProvider", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-saml-provider-response))

(clojure.core/defn delete-group ([delete-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGroup", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-request) :ret clojure.core/true?)

(clojure.core/defn update-login-profile ([update-login-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-login-profile-request update-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateLoginProfile", :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn update-account-password-policy ([] (update-account-password-policy {})) ([update-account-password-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-account-password-policy-request update-account-password-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-account-password-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAccountPasswordPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account-password-policy :args (clojure.spec.alpha/? :portkey.aws.iam/update-account-password-policy-request) :ret clojure.core/true?)

(clojure.core/defn deactivate-mfa-device ([deactivate-mfa-device-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-deactivate-mfa-device-request deactivate-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/deactivate-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeactivateMFADevice", :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef deactivate-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/deactivate-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-policy-version ([get-policy-version-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-policy-version-request get-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPolicyVersion", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-version-response))

(clojure.core/defn update-access-key ([update-access-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-access-key-request update-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAccessKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-access-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-login-profile ([delete-login-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-login-profile-request delete-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoginProfile", :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-login-profile ([get-login-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-login-profile-request get-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-login-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoginProfile", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-login-profile-response))

(clojure.core/defn update-open-id-connect-provider-thumbprint ([update-open-id-connect-provider-thumbprint-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-open-id-connect-provider-thumbprint-request update-open-id-connect-provider-thumbprint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-open-id-connect-provider-thumbprint-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateOpenIDConnectProviderThumbprint", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-open-id-connect-provider-thumbprint :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-open-id-connect-provider-thumbprint-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-specific-credential ([delete-service-specific-credential-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-service-specific-credential-request delete-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServiceSpecificCredential", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef delete-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn list-groups-for-user ([list-groups-for-user-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-groups-for-user-request list-groups-for-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-groups-for-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-groups-for-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroupsForUser", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-groups-for-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-groups-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-for-user-response))

(clojure.core/defn upload-ssh-public-key ([upload-ssh-public-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-upload-ssh-public-key-request upload-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/upload-ssh-public-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadSSHPublicKey", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidPublicKeyException" :portkey.aws.iam/invalid-public-key-exception, "DuplicateSSHPublicKeyException" :portkey.aws.iam/duplicate-ssh-public-key-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}})))))
(clojure.spec.alpha/fdef upload-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-ssh-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-ssh-public-key-response))

(clojure.core/defn list-group-policies ([list-group-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-group-policies-request list-group-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-group-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-group-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroupPolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-group-policies-response))

(clojure.core/defn delete-role ([delete-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-role-request delete-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRole", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-request) :ret clojure.core/true?)

(clojure.core/defn delete-instance-profile ([delete-instance-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-instance-profile-request delete-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInstanceProfile", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn list-groups ([] (list-groups {})) ([list-groups-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-groups-request list-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-groups-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGroups", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.iam/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-response))

(clojure.core/defn get-account-summary ([] (get-account-summary {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-account-summary-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountSummary", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-summary :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-summary-response))

(clojure.core/defn list-saml-providers ([] (list-saml-providers {})) ([list-saml-providers-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-saml-providers-request list-saml-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-saml-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-saml-providers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSAMLProviders", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-saml-providers :args (clojure.spec.alpha/? :portkey.aws.iam/list-saml-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-saml-providers-response))

(clojure.core/defn delete-saml-provider ([delete-saml-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-saml-provider-request delete-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSAMLProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-saml-provider-request) :ret clojure.core/true?)

(clojure.core/defn get-saml-provider ([get-saml-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-saml-provider-request get-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSAMLProvider", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-saml-provider-response))

(clojure.core/defn update-assume-role-policy ([update-assume-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-assume-role-policy-request update-assume-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-assume-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateAssumeRolePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-assume-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-assume-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-roles ([] (list-roles {})) ([list-roles-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-roles-request list-roles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-roles-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-roles-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRoles", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-roles :args (clojure.spec.alpha/? :portkey.aws.iam/list-roles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-roles-response))

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPolicies", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iam/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policies-response))

(clojure.core/defn attach-group-policy ([attach-group-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-attach-group-policy-request attach-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachGroupPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn get-open-id-connect-provider ([get-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-open-id-connect-provider-request get-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-open-id-connect-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOpenIDConnectProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-open-id-connect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-open-id-connect-provider-response))

(clojure.core/defn get-access-key-last-used ([get-access-key-last-used-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-access-key-last-used-request get-access-key-last-used-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-access-key-last-used-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-access-key-last-used-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccessKeyLastUsed", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-access-key-last-used :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-access-key-last-used-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-access-key-last-used-response))

(clojure.core/defn list-service-specific-credentials ([] (list-service-specific-credentials {})) ([list-service-specific-credentials-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-service-specific-credentials-request list-service-specific-credentials-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-service-specific-credentials-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-service-specific-credentials-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListServiceSpecificCredentials", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-service-specific-credentials :args (clojure.spec.alpha/? :portkey.aws.iam/list-service-specific-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-service-specific-credentials-response))

(clojure.core/defn get-role-policy ([get-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-role-policy-request get-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-role-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRolePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-policy-response))

(clojure.core/defn remove-client-id-from-open-id-connect-provider ([remove-client-id-from-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-remove-client-id-from-open-id-connect-provider-request remove-client-id-from-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-client-id-from-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveClientIDFromOpenIDConnectProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-client-id-from-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-client-id-from-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn get-context-keys-for-custom-policy ([get-context-keys-for-custom-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-context-keys-for-custom-policy-request get-context-keys-for-custom-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-context-keys-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-context-keys-for-custom-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContextKeysForCustomPolicy", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-context-keys-for-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn list-instance-profiles ([] (list-instance-profiles {})) ([list-instance-profiles-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-instance-profiles-request list-instance-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-instance-profiles-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-instance-profiles-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstanceProfiles", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-instance-profiles :args (clojure.spec.alpha/? :portkey.aws.iam/list-instance-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-response))

(clojure.core/defn get-credential-report ([] (get-credential-report {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-credential-report-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCredentialReport", :http.request.spec/error-spec {"CredentialReportNotPresentException" :portkey.aws.iam/credential-report-not-present-exception, "CredentialReportExpiredException" :portkey.aws.iam/credential-report-expired-exception, "CredentialReportNotReadyException" :portkey.aws.iam/credential-report-not-ready-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-credential-report :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-credential-report-response))

(clojure.core/defn upload-server-certificate ([upload-server-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-upload-server-certificate-request upload-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/upload-server-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadServerCertificate", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "KeyPairMismatchException" :portkey.aws.iam/key-pair-mismatch-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef upload-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-server-certificate-response))

(clojure.core/defn get-service-linked-role-deletion-status ([get-service-linked-role-deletion-status-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-service-linked-role-deletion-status-request get-service-linked-role-deletion-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-service-linked-role-deletion-status-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-service-linked-role-deletion-status-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetServiceLinkedRoleDeletionStatus", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-service-linked-role-deletion-status :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-service-linked-role-deletion-status-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-service-linked-role-deletion-status-response))

(clojure.core/defn delete-signing-certificate ([delete-signing-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-signing-certificate-request delete-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSigningCertificate", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn add-role-to-instance-profile ([add-role-to-instance-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-add-role-to-instance-profile-request add-role-to-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-role-to-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddRoleToInstanceProfile", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-role-to-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-role-to-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn create-instance-profile ([create-instance-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-instance-profile-request create-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-instance-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstanceProfile", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-instance-profile-response))

(clojure.core/defn detach-role-policy ([detach-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-detach-role-policy-request detach-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachRolePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-instance-profiles-for-role ([list-instance-profiles-for-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-instance-profiles-for-role-request list-instance-profiles-for-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-instance-profiles-for-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-instance-profiles-for-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstanceProfilesForRole", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-instance-profiles-for-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-instance-profiles-for-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-for-role-response))

(clojure.core/defn upload-signing-certificate ([upload-signing-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-upload-signing-certificate-request upload-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/upload-signing-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadSigningCertificate", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "InvalidCertificateException" :portkey.aws.iam/invalid-certificate-exception, "DuplicateCertificateException" :portkey.aws.iam/duplicate-certificate-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef upload-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-signing-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-signing-certificate-response))

(clojure.core/defn update-service-specific-credential ([update-service-specific-credential-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-service-specific-credential-request update-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateServiceSpecificCredential", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef update-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn create-policy-version ([create-policy-version-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-policy-version-request create-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePolicyVersion", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-version-response))

(clojure.core/defn get-context-keys-for-principal-policy ([get-context-keys-for-principal-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-context-keys-for-principal-policy-request get-context-keys-for-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-context-keys-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-context-keys-for-principal-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetContextKeysForPrincipalPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-context-keys-for-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn resync-mfa-device ([resync-mfa-device-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-resync-mfa-device-request resync-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/resync-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResyncMFADevice", :http.request.spec/error-spec {"InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef resync-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/resync-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-group ([get-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-group-request get-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-group-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGroup", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-response))

(clojure.core/defn update-group ([update-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-group-request update-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateGroup", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-group-request) :ret clojure.core/true?)

(clojure.core/defn create-role ([create-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-role-request create-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRole", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-role-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUser", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateUser", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-user-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-response))

(clojure.core/defn enable-mfa-device ([enable-mfa-device-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-enable-mfa-device-request enable-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/enable-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableMFADevice", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef enable-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/enable-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn put-role-policy ([put-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-role-policy-request put-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRolePolicy", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn delete-role-permissions-boundary ([delete-role-permissions-boundary-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-role-permissions-boundary-request delete-role-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRolePermissionsBoundary", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn list-mfa-devices ([] (list-mfa-devices {})) ([list-mfa-devices-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-mfa-devices-request list-mfa-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-mfa-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-mfa-devices-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMFADevices", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-mfa-devices :args (clojure.spec.alpha/? :portkey.aws.iam/list-mfa-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-mfa-devices-response))

(clojure.core/defn create-service-linked-role ([create-service-linked-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-service-linked-role-request create-service-linked-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-service-linked-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-service-linked-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateServiceLinkedRole", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-linked-role-response))

(clojure.core/defn detach-user-policy ([detach-user-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-detach-user-policy-request detach-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachUserPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-user-policy ([put-user-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-user-policy-request put-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutUserPolicy", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-signing-certificate ([update-signing-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-signing-certificate-request update-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSigningCertificate", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-user-policy ([get-user-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-user-policy-request get-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-user-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUserPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-user-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-policy-response))

(clojure.core/defn create-access-key ([] (create-access-key {})) ([create-access-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-access-key-request create-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-access-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAccessKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-access-key :args (clojure.spec.alpha/? :portkey.aws.iam/create-access-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-access-key-response))

(clojure.core/defn delete-user-permissions-boundary ([delete-user-permissions-boundary-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-user-permissions-boundary-request delete-user-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserPermissionsBoundary", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn delete-account-password-policy ([] (delete-account-password-policy {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAccountPasswordPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account-password-policy :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn add-client-id-to-open-id-connect-provider ([add-client-id-to-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-add-client-id-to-open-id-connect-provider-request add-client-id-to-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-client-id-to-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddClientIDToOpenIDConnectProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-client-id-to-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-client-id-to-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn create-saml-provider ([create-saml-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-saml-provider-request create-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSAMLProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-saml-provider-response))

(clojure.core/defn delete-open-id-connect-provider ([delete-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-open-id-connect-provider-request delete-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteOpenIDConnectProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn reset-service-specific-credential ([reset-service-specific-credential-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-reset-service-specific-credential-request reset-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/reset-service-specific-credential-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/reset-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResetServiceSpecificCredential", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef reset-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/reset-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/reset-service-specific-credential-response))

(clojure.core/defn list-entities-for-policy ([list-entities-for-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-entities-for-policy-request list-entities-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-entities-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-entities-for-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEntitiesForPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-entities-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-entities-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-entities-for-policy-response))

(clojure.core/defn delete-ssh-public-key ([delete-ssh-public-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-ssh-public-key-request delete-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSSHPublicKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef delete-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-ssh-public-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-role-policy ([delete-role-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-role-policy-request delete-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRolePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn change-password ([change-password-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-change-password-request change-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/change-password-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangePassword", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidUserTypeException" :portkey.aws.iam/invalid-user-type-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef change-password :args (clojure.spec.alpha/tuple :portkey.aws.iam/change-password-request) :ret clojure.core/true?)

(clojure.core/defn update-ssh-public-key ([update-ssh-public-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-ssh-public-key-request update-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateSSHPublicKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef update-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-ssh-public-key-request) :ret clojure.core/true?)

(clojure.core/defn remove-role-from-instance-profile ([remove-role-from-instance-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-remove-role-from-instance-profile-request remove-role-from-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-role-from-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveRoleFromInstanceProfile", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-role-from-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-role-from-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-server-certificate ([get-server-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-server-certificate-request get-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-server-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetServerCertificate", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-server-certificate-response))

(clojure.core/defn get-account-password-policy ([] (get-account-password-policy {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-account-password-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountPasswordPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-password-policy :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-password-policy-response))

(clojure.core/defn list-attached-role-policies ([list-attached-role-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-attached-role-policies-request list-attached-role-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-attached-role-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-role-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttachedRolePolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-role-policies-response))

(clojure.core/defn set-default-policy-version ([set-default-policy-version-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-set-default-policy-version-request set-default-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/set-default-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetDefaultPolicyVersion", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn list-open-id-connect-providers ([] (list-open-id-connect-providers {})) ([list-open-id-connect-providers-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-open-id-connect-providers-request list-open-id-connect-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-open-id-connect-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-open-id-connect-providers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOpenIDConnectProviders", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-open-id-connect-providers :args (clojure.spec.alpha/? :portkey.aws.iam/list-open-id-connect-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-open-id-connect-providers-response))

(clojure.core/defn list-access-keys ([] (list-access-keys {})) ([list-access-keys-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-access-keys-request list-access-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-access-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-access-keys-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAccessKeys", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-access-keys :args (clojure.spec.alpha/? :portkey.aws.iam/list-access-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-access-keys-response))

(clojure.core/defn delete-virtual-mfa-device ([delete-virtual-mfa-device-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-virtual-mfa-device-request delete-virtual-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-virtual-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVirtualMFADevice", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-virtual-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-group-policy ([get-group-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-group-policy-request get-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-group-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGroupPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-policy-response))

(clojure.core/defn put-user-permissions-boundary ([put-user-permissions-boundary-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-user-permissions-boundary-request put-user-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-user-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutUserPermissionsBoundary", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-user-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-user-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePolicy", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-response))

(clojure.core/defn list-users ([] (list-users {})) ([list-users-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-users-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUsers", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/? :portkey.aws.iam/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-users-response))

(clojure.core/defn list-role-policies ([list-role-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-role-policies-request list-role-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-role-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-role-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRolePolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-role-policies-response))

(clojure.core/defn delete-user-policy ([delete-user-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-user-policy-request delete-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteUserPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn create-account-alias ([create-account-alias-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-account-alias-request create-account-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-account-alias-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAccountAlias", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-linked-role ([delete-service-linked-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-service-linked-role-request delete-service-linked-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/delete-service-linked-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-service-linked-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteServiceLinkedRole", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/delete-service-linked-role-response))

(clojure.core/defn update-server-certificate ([update-server-certificate-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-server-certificate-request update-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateServerCertificate", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn simulate-principal-policy ([simulate-principal-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-simulate-principal-policy-request simulate-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/simulate-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/simulate-principal-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SimulatePrincipalPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}})))))
(clojure.spec.alpha/fdef simulate-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn list-server-certificates ([] (list-server-certificates {})) ([list-server-certificates-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-server-certificates-request list-server-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-server-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-server-certificates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListServerCertificates", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-server-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-server-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-server-certificates-response))

(clojure.core/defn get-role ([get-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-role-request get-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRole", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-response))

(clojure.core/defn put-group-policy ([put-group-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-group-policy-request put-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutGroupPolicy", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-virtual-mfa-devices ([] (list-virtual-mfa-devices {})) ([list-virtual-mfa-devices-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-virtual-mfa-devices-request list-virtual-mfa-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-virtual-mfa-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-virtual-mfa-devices-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVirtualMFADevices", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-virtual-mfa-devices :args (clojure.spec.alpha/? :portkey.aws.iam/list-virtual-mfa-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-virtual-mfa-devices-response))

(clojure.core/defn generate-credential-report ([] (generate-credential-report {})) ([_] (clojure.core/let [request-function-result__255528__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/generate-credential-report-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GenerateCredentialReport", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef generate-credential-report :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/generate-credential-report-response))

(clojure.core/defn delete-access-key ([delete-access-key-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-access-key-request delete-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAccessKey", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-access-key-request) :ret clojure.core/true?)

(clojure.core/defn create-login-profile ([create-login-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-login-profile-request create-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-login-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoginProfile", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-login-profile-response))

(clojure.core/defn create-group ([create-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-group-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateGroup", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-group-response))

(clojure.core/defn attach-user-policy ([attach-user-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-attach-user-policy-request attach-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachUserPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn remove-user-from-group ([remove-user-from-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-remove-user-from-group-request remove-user-from-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-user-from-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveUserFromGroup", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-user-from-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-user-from-group-request) :ret clojure.core/true?)

(clojure.core/defn list-account-aliases ([] (list-account-aliases {})) ([list-account-aliases-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-account-aliases-request list-account-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-account-aliases-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-account-aliases-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAccountAliases", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-account-aliases :args (clojure.spec.alpha/? :portkey.aws.iam/list-account-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-account-aliases-response))

(clojure.core/defn update-role-description ([update-role-description-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-role-description-request update-role-description-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/update-role-description-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-role-description-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRoleDescription", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-role-description :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-description-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-description-response))

(clojure.core/defn create-open-id-connect-provider ([create-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-open-id-connect-provider-request create-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-open-id-connect-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateOpenIDConnectProvider", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-open-id-connect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-open-id-connect-provider-response))

(clojure.core/defn delete-group-policy ([delete-group-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-group-policy-request delete-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGroupPolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn get-instance-profile ([get-instance-profile-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-instance-profile-request get-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-instance-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceProfile", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-instance-profile-response))

(clojure.core/defn get-account-authorization-details ([] (get-account-authorization-details {})) ([get-account-authorization-details-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-account-authorization-details-request get-account-authorization-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-account-authorization-details-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-account-authorization-details-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountAuthorizationDetails", :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-authorization-details :args (clojure.spec.alpha/? :portkey.aws.iam/get-account-authorization-details-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-authorization-details-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeletePolicy", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-user ([update-user-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateUser", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-user-request) :ret clojure.core/true?)

(clojure.core/defn create-virtual-mfa-device ([create-virtual-mfa-device-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-create-virtual-mfa-device-request create-virtual-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/create-virtual-mfa-device-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-virtual-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVirtualMFADevice", :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-virtual-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-virtual-mfa-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-virtual-mfa-device-response))

(clojure.core/defn add-user-to-group ([add-user-to-group-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-add-user-to-group-request add-user-to-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-user-to-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddUserToGroup", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-user-to-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-user-to-group-request) :ret clojure.core/true?)

(clojure.core/defn update-role ([update-role-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-update-role-request update-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/update-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRole", :http.request.spec/error-spec {"UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-response))

(clojure.core/defn put-role-permissions-boundary ([put-role-permissions-boundary-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-put-role-permissions-boundary-request put-role-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-role-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRolePermissionsBoundary", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-role-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-role-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn list-user-policies ([list-user-policies-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-user-policies-request list-user-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-user-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-user-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListUserPolicies", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-user-policies-response))

(clojure.core/defn simulate-custom-policy ([simulate-custom-policy-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-simulate-custom-policy-request simulate-custom-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/simulate-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/simulate-custom-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SimulateCustomPolicy", :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}})))))
(clojure.spec.alpha/fdef simulate-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn list-ssh-public-keys ([] (list-ssh-public-keys {})) ([list-ssh-public-keys-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-list-ssh-public-keys-request list-ssh-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/list-ssh-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-ssh-public-keys-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSSHPublicKeys", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-ssh-public-keys :args (clojure.spec.alpha/? :portkey.aws.iam/list-ssh-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-ssh-public-keys-response))

(clojure.core/defn get-user ([] (get-user {})) ([get-user-requestinput] (clojure.core/let [request-function-result__255528__auto__ (req-get-user-request get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__255528__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.spec/output-spec :portkey.aws.iam/get-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetUser", :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/? :portkey.aws.iam/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-response))
