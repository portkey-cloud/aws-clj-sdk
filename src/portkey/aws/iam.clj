(ns portkey.aws.iam (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "iam", :region "us-gov-west-1"},
    :ssl-common-name "iam.us-gov.amazonaws.com",
    :endpoint "https://iam.us-gov.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
   "eu-north-1"
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

(clojure.core/declare sertag-key-list-type)

(clojure.core/declare ser-saml-provider-name-type)

(clojure.core/declare serservice-namespace-type)

(clojure.core/declare serclient-id-type)

(clojure.core/declare servirtual-mfa-device-name)

(clojure.core/declare serservice-namespace-list-type)

(clojure.core/declare ser-context-entry)

(clojure.core/declare sertag-list-type)

(clojure.core/declare serthumbprint-type)

(clojure.core/declare serencoding-type)

(clojure.core/declare serrole-max-session-duration-type)

(clojure.core/declare seraccount-alias-type)

(clojure.core/declare serpassword-reuse-prevention-type)

(clojure.core/declare sertag-key-type)

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

(clojure.core/declare serjob-id-type)

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

(clojure.core/declare ser-tag)

(clojure.core/declare serpassword-type)

(clojure.core/declare serminimum-password-length-type)

(clojure.core/declare serpolicy-path-type)

(clojure.core/declare serentity-list-type)

(clojure.core/declare sertag-value-type)

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

(clojure.core/defn- sertag-key-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (sertag-key-type coll) #:http.request.field{:shape "tagKeyType"}))) input), :shape "tagKeyListType", :type "list", :max 50})

(clojure.core/defn- ser-saml-provider-name-type [input] #:http.request.field{:value input, :shape "SAMLProviderNameType"})

(clojure.core/defn- serservice-namespace-type [input] #:http.request.field{:value input, :shape "serviceNamespaceType"})

(clojure.core/defn- serclient-id-type [input] #:http.request.field{:value input, :shape "clientIDType"})

(clojure.core/defn- servirtual-mfa-device-name [input] #:http.request.field{:value input, :shape "virtualMFADeviceName"})

(clojure.core/defn- serservice-namespace-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serservice-namespace-type coll) #:http.request.field{:shape "serviceNamespaceType"}))) input), :shape "serviceNamespaceListType", :type "list", :max 200, :min 1})

(clojure.core/defn- ser-context-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContextEntry", :type "structure"} (clojure.core/contains? input :context-key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-name-type (input :context-key-name)) #:http.request.field{:name "ContextKeyName", :shape "ContextKeyNameType"})) (clojure.core/contains? input :context-key-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-value-list-type (input :context-key-values)) #:http.request.field{:name "ContextKeyValues", :shape "ContextKeyValueListType"})) (clojure.core/contains? input :context-key-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-context-key-type-enum (input :context-key-type)) #:http.request.field{:name "ContextKeyType", :shape "ContextKeyTypeEnum"}))))

(clojure.core/defn- sertag-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "tagListType", :type "list", :max 50})

(clojure.core/defn- serthumbprint-type [input] #:http.request.field{:value input, :shape "thumbprintType"})

(clojure.core/defn- serencoding-type [input] #:http.request.field{:value (clojure.core/get {"SSH" "SSH", :ssh "SSH", "PEM" "PEM", :pem "PEM"} input), :shape "encodingType"})

(clojure.core/defn- serrole-max-session-duration-type [input] #:http.request.field{:value input, :shape "roleMaxSessionDurationType"})

(clojure.core/defn- seraccount-alias-type [input] #:http.request.field{:value input, :shape "accountAliasType"})

(clojure.core/defn- serpassword-reuse-prevention-type [input] #:http.request.field{:value input, :shape "passwordReusePreventionType"})

(clojure.core/defn- sertag-key-type [input] #:http.request.field{:value input, :shape "tagKeyType"})

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

(clojure.core/defn- serjob-id-type [input] #:http.request.field{:value input, :shape "jobIDType"})

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

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (sertag-key-type (:key input)) #:http.request.field{:name "Key", :shape "tagKeyType"}) (clojure.core/into (sertag-value-type (:value input)) #:http.request.field{:name "Value", :shape "tagValueType"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- serpassword-type [input] #:http.request.field{:value input, :shape "passwordType"})

(clojure.core/defn- serminimum-password-length-type [input] #:http.request.field{:value input, :shape "minimumPasswordLengthType"})

(clojure.core/defn- serpolicy-path-type [input] #:http.request.field{:value input, :shape "policyPathType"})

(clojure.core/defn- serentity-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-entity-type coll) #:http.request.field{:shape "EntityType"}))) input), :shape "entityListType", :type "list"})

(clojure.core/defn- sertag-value-type [input] #:http.request.field{:value input, :shape "tagValueType"})

(clojure.core/defn- serpublic-key-id-type [input] #:http.request.field{:value input, :shape "publicKeyIdType"})

(clojure.core/defn- serpath-type [input] #:http.request.field{:value input, :shape "pathType"})

(clojure.core/defn- ser-entity-type [input] #:http.request.field{:value (clojure.core/get {:role "Role", :local-managed-policy "LocalManagedPolicy", :group "Group", "LocalManagedPolicy" "LocalManagedPolicy", "User" "User", "Role" "Role", "AWSManagedPolicy" "AWSManagedPolicy", "Group" "Group", :user "User", :aws-managed-policy "AWSManagedPolicy"} input), :shape "EntityType"})

(clojure.core/defn- serrole-name-type [input] #:http.request.field{:value input, :shape "roleNameType"})

(clojure.core/defn- req-list-virtual-mfa-devices-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :assignment-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serassignment-status-type (input :assignment-status)) #:http.request.field{:name "AssignmentStatus", :shape "assignmentStatusType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-update-account-password-policy-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :minimum-password-length) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serminimum-password-length-type (input :minimum-password-length)) #:http.request.field{:name "MinimumPasswordLength", :shape "minimumPasswordLengthType"})) (clojure.core/contains? input :require-numbers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-numbers)) #:http.request.field{:name "RequireNumbers", :shape "booleanType"})) (clojure.core/contains? input :require-uppercase-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-uppercase-characters)) #:http.request.field{:name "RequireUppercaseCharacters", :shape "booleanType"})) (clojure.core/contains? input :hard-expiry) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-object-type (input :hard-expiry)) #:http.request.field{:name "HardExpiry", :shape "booleanObjectType"})) (clojure.core/contains? input :require-lowercase-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-lowercase-characters)) #:http.request.field{:name "RequireLowercaseCharacters", :shape "booleanType"})) (clojure.core/contains? input :require-symbols) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :require-symbols)) #:http.request.field{:name "RequireSymbols", :shape "booleanType"})) (clojure.core/contains? input :allow-users-to-change-password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean-type (input :allow-users-to-change-password)) #:http.request.field{:name "AllowUsersToChangePassword", :shape "booleanType"})) (clojure.core/contains? input :max-password-age) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-password-age-type (input :max-password-age)) #:http.request.field{:name "MaxPasswordAge", :shape "maxPasswordAgeType"})) (clojure.core/contains? input :password-reuse-prevention) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpassword-reuse-prevention-type (input :password-reuse-prevention)) #:http.request.field{:name "PasswordReusePrevention", :shape "passwordReusePreventionType"}))))

(clojure.core/defn- req-get-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-create-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serpolicy-document-type (input :assume-role-policy-document)) #:http.request.field{:name "AssumeRolePolicyDocument", :shape "policyDocumentType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-description-type (input :description)) #:http.request.field{:name "Description", :shape "roleDescriptionType"})) (clojure.core/contains? input :max-session-duration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serrole-max-session-duration-type (input :max-session-duration)) #:http.request.field{:name "MaxSessionDuration", :shape "roleMaxSessionDurationType"})) (clojure.core/contains? input :permissions-boundary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "tagListType"}))))

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

(clojure.core/defn- req-tag-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (sertag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "tagListType"})]}))

(clojure.core/defn- req-set-default-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"}) (clojure.core/into (serpolicy-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "policyVersionIdType"})]}))

(clojure.core/defn- req-create-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-saml-metadata-document-type (input :saml-metadata-document)) #:http.request.field{:name "SAMLMetadataDocument", :shape "SAMLMetadataDocumentType"}) (clojure.core/into (ser-saml-provider-name-type (input :name)) #:http.request.field{:name "Name", :shape "SAMLProviderNameType"})]}))

(clojure.core/defn- req-get-service-last-accessed-details-with-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serjob-id-type (input :job-id)) #:http.request.field{:name "JobId", :shape "jobIDType"}) (clojure.core/into (serservice-namespace-type (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "serviceNamespaceType"})]} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"}))))

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

(clojure.core/defn- req-get-service-last-accessed-details-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serjob-id-type (input :job-id)) #:http.request.field{:name "JobId", :shape "jobIDType"})]} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"}))))

(clojure.core/defn- req-detach-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-get-saml-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :saml-provider-arn)) #:http.request.field{:name "SAMLProviderArn", :shape "arnType"})]}))

(clojure.core/defn- req-list-account-aliases-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-list-user-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

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

(clojure.core/defn- req-create-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :permissions-boundary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serarn-type (input :permissions-boundary)) #:http.request.field{:name "PermissionsBoundary", :shape "arnType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sertag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "tagListType"}))))

(clojure.core/defn- req-untag-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (sertag-key-list-type (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "tagKeyListType"})]}))

(clojure.core/defn- req-list-groups-for-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-remove-client-id-from-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serclient-id-type (input :client-id)) #:http.request.field{:name "ClientID", :shape "clientIDType"})]}))

(clojure.core/defn- req-list-instance-profiles-for-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-list-role-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-put-user-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"}) (clojure.core/into (serpolicy-document-type (input :policy-document)) #:http.request.field{:name "PolicyDocument", :shape "policyDocumentType"})]}))

(clojure.core/defn- req-create-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"}))))

(clojure.core/defn- req-get-instance-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serinstance-profile-name-type (input :instance-profile-name)) #:http.request.field{:name "InstanceProfileName", :shape "instanceProfileNameType"})]}))

(clojure.core/defn- req-attach-role-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (serarn-type (input :policy-arn)) #:http.request.field{:name "PolicyArn", :shape "arnType"})]}))

(clojure.core/defn- req-generate-service-last-accessed-details-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :arn)) #:http.request.field{:name "Arn", :shape "arnType"})]}))

(clojure.core/defn- req-delete-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"})]}))

(clojure.core/defn- req-list-service-specific-credentials-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serservice-name (input :service-name)) #:http.request.field{:name "ServiceName", :shape "serviceName"}))))

(clojure.core/defn- req-add-client-id-to-open-id-connect-provider-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serclient-id-type (input :client-id)) #:http.request.field{:name "ClientID", :shape "clientIDType"})]}))

(clojure.core/defn- req-upload-server-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serserver-certificate-name-type (input :server-certificate-name)) #:http.request.field{:name "ServerCertificateName", :shape "serverCertificateNameType"}) (clojure.core/into (sercertificate-body-type (input :certificate-body)) #:http.request.field{:name "CertificateBody", :shape "certificateBodyType"}) (clojure.core/into (serprivate-key-type (input :private-key)) #:http.request.field{:name "PrivateKey", :shape "privateKeyType"})]} (clojure.core/contains? input :path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpath-type (input :path)) #:http.request.field{:name "Path", :shape "pathType"})) (clojure.core/contains? input :certificate-chain) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercertificate-chain-type (input :certificate-chain)) #:http.request.field{:name "CertificateChain", :shape "certificateChainType"}))))

(clojure.core/defn- req-get-group-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"}) (clojure.core/into (serpolicy-name-type (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "policyNameType"})]}))

(clojure.core/defn- req-list-attached-role-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]} (clojure.core/contains? input :path-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpolicy-path-type (input :path-prefix)) #:http.request.field{:name "PathPrefix", :shape "policyPathType"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-get-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (sergroup-name-type (input :group-name)) #:http.request.field{:name "GroupName", :shape "groupNameType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermax-items-type (input :max-items)) #:http.request.field{:name "MaxItems", :shape "maxItemsType"}))))

(clojure.core/defn- req-update-service-specific-credential-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serservice-specific-credential-id (input :service-specific-credential-id)) #:http.request.field{:name "ServiceSpecificCredentialId", :shape "serviceSpecificCredentialId"}) (clojure.core/into (serstatus-type (input :status)) #:http.request.field{:name "Status", :shape "statusType"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}))))

(clojure.core/defn- req-untag-user-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serexisting-user-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "existingUserNameType"}) (clojure.core/into (sertag-key-list-type (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "tagKeyListType"})]}))

(clojure.core/defn- req-update-open-id-connect-provider-thumbprint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :open-id-connect-provider-arn)) #:http.request.field{:name "OpenIDConnectProviderArn", :shape "arnType"}) (clojure.core/into (serthumbprint-list-type (input :thumbprint-list)) #:http.request.field{:name "ThumbprintList", :shape "thumbprintListType"})]}))

(clojure.core/defn- req-delete-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"})]}))

(clojure.core/defn- req-get-ssh-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (seruser-name-type (input :user-name)) #:http.request.field{:name "UserName", :shape "userNameType"}) (clojure.core/into (serpublic-key-id-type (input :ssh-public-key-id)) #:http.request.field{:name "SSHPublicKeyId", :shape "publicKeyIdType"}) (clojure.core/into (serencoding-type (input :encoding)) #:http.request.field{:name "Encoding", :shape "encodingType"})]}))

(clojure.core/defn- req-tag-role-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serrole-name-type (input :role-name)) #:http.request.field{:name "RoleName", :shape "roleNameType"}) (clojure.core/into (sertag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "tagListType"})]}))

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

(clojure.core/defn- req-list-policies-granting-service-access-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (serarn-type (input :arn)) #:http.request.field{:name "Arn", :shape "arnType"}) (clojure.core/into (serservice-namespace-list-type (input :service-namespaces)) #:http.request.field{:name "ServiceNamespaces", :shape "serviceNamespaceListType"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sermarker-type (input :marker)) #:http.request.field{:name "Marker", :shape "markerType"}))))

(clojure.core/declare deser-service-last-accessed)

(clojure.core/declare deser-saml-provider-list-type)

(clojure.core/declare deser-policy-source-type)

(clojure.core/declare deser-resource-specific-result)

(clojure.core/declare deserunrecognized-public-key-encoding-message)

(clojure.core/declare deserpublic-key-material-type)

(clojure.core/declare deser-server-certificate-metadata)

(clojure.core/declare deserentity-details-list-type)

(clojure.core/declare deserjob-status-type)

(clojure.core/declare deserkey-pair-mismatch-message)

(clojure.core/declare deserserver-certificate-metadata-list-type)

(clojure.core/declare deser-entity-details)

(clojure.core/declare deserpolicy-owner-entity-type)

(clojure.core/declare deser-report-state-type)

(clojure.core/declare deservirtual-mfa-device-list-type)

(clojure.core/declare desermarker-type)

(clojure.core/declare deser-deletion-task-status-type)

(clojure.core/declare deser-login-profile)

(clojure.core/declare deserdate-type)

(clojure.core/declare deser-server-certificate)

(clojure.core/declare desergroup-name-list-type)

(clojure.core/declare deser-saml-provider-list-entry)

(clojure.core/declare deser-action-name-type)

(clojure.core/declare deseruser-name-type)

(clojure.core/declare desergroup-name-type)

(clojure.core/declare deserpolicy-document-version-list-type)

(clojure.core/declare deser-role-usage-type)

(clojure.core/declare desercredential-report-expired-exception-message)

(clojure.core/declare deser-instance-profile)

(clojure.core/declare deserattached-policies-list-type)

(clojure.core/declare deserservice-namespace-type)

(clojure.core/declare deser-policy-identifier-type)

(clojure.core/declare deserid-type)

(clojure.core/declare deserclient-id-type)

(clojure.core/declare deserstring-type)

(clojure.core/declare deser-eval-decision-source-type)

(clojure.core/declare deser-password-policy)

(clojure.core/declare desersummary-map-type)

(clojure.core/declare deserlist-policy-granting-service-access-response-list-type)

(clojure.core/declare deser-services-last-accessed)

(clojure.core/declare deserno-such-entity-message)

(clojure.core/declare deseruser-list-type)

(clojure.core/declare desertag-list-type)

(clojure.core/declare deser-permissions-boundary-attachment-type)

(clojure.core/declare deserthumbprint-type)

(clojure.core/declare desersummary-key-type)

(clojure.core/declare deserinstance-profile-list-type)

(clojure.core/declare deserpassword-policy-violation-message)

(clojure.core/declare desermalformed-certificate-message)

(clojure.core/declare deser-statement-list-type)

(clojure.core/declare deserinvalid-certificate-message)

(clojure.core/declare deser-statement)

(clojure.core/declare deser-policy-user-list-type)

(clojure.core/declare deserrole-max-session-duration-type)

(clojure.core/declare deseraccount-alias-type)

(clojure.core/declare deseraccount-alias-list-type)

(clojure.core/declare deseraccess-key-secret-type)

(clojure.core/declare deserpolicy-evaluation-error-message)

(clojure.core/declare deserpassword-reuse-prevention-type)

(clojure.core/declare deser-line-number)

(clojure.core/declare deseruser-detail-list-type)

(clojure.core/declare desertag-key-type)

(clojure.core/declare deser-entity-info)

(clojure.core/declare deser-column-number)

(clojure.core/declare deser-user)

(clojure.core/declare deser-policy-role)

(clojure.core/declare deserattachment-count-type)

(clojure.core/declare deser-ssh-public-key-list-type)

(clojure.core/declare deser-service-specific-credential-metadata)

(clojure.core/declare deserpolicy-type)

(clojure.core/declare deserpolicy-version-id-type)

(clojure.core/declare deser-policy-version)

(clojure.core/declare deser-policy-role-list-type)

(clojure.core/declare deserinvalid-input-message)

(clojure.core/declare deserpublic-key-fingerprint-type)

(clojure.core/declare deserinstance-profile-name-type)

(clojure.core/declare deser-attached-permissions-boundary)

(clojure.core/declare deserservice-specific-credential-id)

(clojure.core/declare deser-evaluation-result)

(clojure.core/declare deser-attached-policy)

(clojure.core/declare desermax-password-age-type)

(clojure.core/declare deserentity-temporarily-unmodifiable-message)

(clojure.core/declare deser-policy-user)

(clojure.core/declare deser-access-key-last-used)

(clojure.core/declare deser-ssh-public-key)

(clojure.core/declare deserduplicate-certificate-message)

(clojure.core/declare deserpolicy-document-type)

(clojure.core/declare deserrole-detail-list-type)

(clojure.core/declare deser-bootstrap-datum)

(clojure.core/declare deser-role)

(clojure.core/declare deserinvalid-user-type-message)

(clojure.core/declare deserboolean-type)

(clojure.core/declare deser-virtual-mfa-device)

(clojure.core/declare deser-list-policies-granting-service-access-entry)

(clojure.core/declare deser-mfa-device)

(clojure.core/declare deserstatus-type)

(clojure.core/declare deserexisting-user-name-type)

(clojure.core/declare deserunmodifiable-entity-message)

(clojure.core/declare deser-open-id-connect-provider-url-type)

(clojure.core/declare deserjob-id-type)

(clojure.core/declare deseraccess-key-id-type)

(clojure.core/declare deser-role-usage-list-type)

(clojure.core/declare deserpolicy-description-type)

(clojure.core/declare deserentity-name-type)

(clojure.core/declare desercredential-report-not-present-exception-message)

(clojure.core/declare deserservice-name)

(clojure.core/declare deser-resource-name-type)

(clojure.core/declare deserboolean-object-type)

(clojure.core/declare deser-deletion-task-id-type)

(clojure.core/declare deser-user-detail)

(clojure.core/declare deser-managed-policy-detail-list-type)

(clojure.core/declare deser-saml-metadata-document-type)

(clojure.core/declare deserpolicy-name-type)

(clojure.core/declare deser-reason-type)

(clojure.core/declare deser-position)

(clojure.core/declare deserdelete-conflict-message)

(clojure.core/declare deserpolicy-name-list-type)

(clojure.core/declare deser-evaluation-results-list-type)

(clojure.core/declare desercertificate-list-type)

(clojure.core/declare deserclient-id-list-type)

(clojure.core/declare desercertificate-body-type)

(clojure.core/declare deser-policy-granting-service-access)

(clojure.core/declare desercredential-report-not-ready-exception-message)

(clojure.core/declare deserservice-name-type)

(clojure.core/declare deser-managed-policy-detail)

(clojure.core/declare deser-eval-decision-details-type)

(clojure.core/declare deser-access-key-metadata)

(clojure.core/declare deserpolicy-not-attachable-message)

(clojure.core/declare desercertificate-chain-type)

(clojure.core/declare deser-policy-group-list-type)

(clojure.core/declare desercertificate-id-type)

(clojure.core/declare deser-context-key-names-result-list-type)

(clojure.core/declare deserthumbprint-list-type)

(clojure.core/declare deserarn-type)

(clojure.core/declare deser-context-key-name-type)

(clojure.core/declare deserservice-not-supported-message)

(clojure.core/declare deser-policy-group)

(clojure.core/declare deserinvalid-public-key-message)

(clojure.core/declare deser-region-name-type)

(clojure.core/declare deser-error-details)

(clojure.core/declare desermalformed-policy-document-message)

(clojure.core/declare deser-signing-certificate)

(clojure.core/declare deser-report-state-description-type)

(clojure.core/declare deser-report-format-type)

(clojure.core/declare deserinteger-type)

(clojure.core/declare deser-role-detail)

(clojure.core/declare deser-service-specific-credentials-list-type)

(clojure.core/declare deserserver-certificate-name-type)

(clojure.core/declare deserserial-number-type)

(clojure.core/declare deserrole-description-type)

(clojure.core/declare deserpolicy-detail-list-type)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-organizations-decision-detail)

(clojure.core/declare deser-tag)

(clojure.core/declare deseraccess-key-metadata-list-type)

(clojure.core/declare deserpolicy-granting-service-access-list-type)

(clojure.core/declare deser-arn-list-type)

(clojure.core/declare deserduplicate-ssh-public-key-message)

(clojure.core/declare deserservice-user-name)

(clojure.core/declare desermfa-device-list-type)

(clojure.core/declare deserminimum-password-length-type)

(clojure.core/declare deserpolicy-path-type)

(clojure.core/declare deser-policy-detail)

(clojure.core/declare desertag-value-type)

(clojure.core/declare deser-open-id-connect-provider-list-entry)

(clojure.core/declare desersummary-value-type)

(clojure.core/declare deserrole-list-type)

(clojure.core/declare deserpublic-key-id-type)

(clojure.core/declare deser-group)

(clojure.core/declare desergroup-detail-list-type)

(clojure.core/declare deser-deletion-task-failure-reason-type)

(clojure.core/declare deser-ssh-public-key-metadata)

(clojure.core/declare deserpath-type)

(clojure.core/declare desergroup-list-type)

(clojure.core/declare deser-policy-evaluation-decision-type)

(clojure.core/declare deserentity-already-exists-message)

(clojure.core/declare deser-open-id-connect-provider-list-type)

(clojure.core/declare deser-service-specific-credential)

(clojure.core/declare deserlimit-exceeded-message)

(clojure.core/declare deser-resource-specific-result-list-type)

(clojure.core/declare deser-access-key)

(clojure.core/declare deserinvalid-authentication-code-message)

(clojure.core/declare deserrole-name-type)

(clojure.core/declare deser-concurrent-modification-message)

(clojure.core/declare deserpolicy-list-type)

(clojure.core/declare deser-report-content-type)

(clojure.core/declare deserservice-password)

(clojure.core/declare deser-group-detail)

(clojure.core/declare deserservice-failure-exception-message)

(clojure.core/defn- deser-service-last-accessed [input] (clojure.core/let [letvar409470 {"ServiceName" (portkey.aws/search-for-tag input "ServiceName" :flattened? nil :xmlAttribute? nil), "LastAuthenticated" (portkey.aws/search-for-tag input "LastAuthenticated" :flattened? nil :xmlAttribute? nil), "ServiceNamespace" (portkey.aws/search-for-tag input "ServiceNamespace" :flattened? nil :xmlAttribute? nil), "LastAuthenticatedEntity" (portkey.aws/search-for-tag input "LastAuthenticatedEntity" :flattened? nil :xmlAttribute? nil), "TotalAuthenticatedEntities" (portkey.aws/search-for-tag input "TotalAuthenticatedEntities" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:service-name (deserservice-name-type (clojure.core/get-in letvar409470 ["ServiceName" :content])), :service-namespace (deserservice-namespace-type (clojure.core/get-in letvar409470 ["ServiceNamespace" :content]))} (letvar409470 "LastAuthenticated") (clojure.core/assoc :last-authenticated (deserdate-type (clojure.core/get-in letvar409470 ["LastAuthenticated" :content]))) (letvar409470 "LastAuthenticatedEntity") (clojure.core/assoc :last-authenticated-entity (deserarn-type (clojure.core/get-in letvar409470 ["LastAuthenticatedEntity" :content]))) (letvar409470 "TotalAuthenticatedEntities") (clojure.core/assoc :total-authenticated-entities (deserinteger-type (clojure.core/get-in letvar409470 ["TotalAuthenticatedEntities" :content]))))))

(clojure.core/defn- deser-saml-provider-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-saml-provider-list-entry coll))) input))

(clojure.core/defn- deser-policy-source-type [input] (clojure.core/get {"user" :user, "group" :group, "role" :role, "aws-managed" :awsmanaged, "user-managed" :usermanaged, "resource" :resource, "none" :none} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-specific-result [input] (clojure.core/let [letvar409600 {"EvalResourceName" (portkey.aws/search-for-tag input "EvalResourceName" :flattened? nil :xmlAttribute? nil), "EvalResourceDecision" (portkey.aws/search-for-tag input "EvalResourceDecision" :flattened? nil :xmlAttribute? nil), "MatchedStatements" (portkey.aws/search-for-tag input "MatchedStatements" :flattened? nil :xmlAttribute? nil), "MissingContextValues" (portkey.aws/search-for-tag input "MissingContextValues" :flattened? nil :xmlAttribute? nil), "EvalDecisionDetails" (portkey.aws/search-for-tag input "EvalDecisionDetails" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:eval-resource-name (deser-resource-name-type (clojure.core/get-in letvar409600 ["EvalResourceName" :content])), :eval-resource-decision (deser-policy-evaluation-decision-type (clojure.core/get-in letvar409600 ["EvalResourceDecision" :content]))} (letvar409600 "MatchedStatements") (clojure.core/assoc :matched-statements (deser-statement-list-type (clojure.core/get-in letvar409600 ["MatchedStatements" :content]))) (letvar409600 "MissingContextValues") (clojure.core/assoc :missing-context-values (deser-context-key-names-result-list-type (clojure.core/get-in letvar409600 ["MissingContextValues" :content]))) (letvar409600 "EvalDecisionDetails") (clojure.core/assoc :eval-decision-details (deser-eval-decision-details-type (clojure.core/get-in letvar409600 ["EvalDecisionDetails" :content]))))))

(clojure.core/defn- deserunrecognized-public-key-encoding-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpublic-key-material-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-server-certificate-metadata [input] (clojure.core/let [letvar409718 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "ServerCertificateName" (portkey.aws/search-for-tag input "ServerCertificateName" :flattened? nil :xmlAttribute? nil), "ServerCertificateId" (portkey.aws/search-for-tag input "ServerCertificateId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "UploadDate" (portkey.aws/search-for-tag input "UploadDate" :flattened? nil :xmlAttribute? nil), "Expiration" (portkey.aws/search-for-tag input "Expiration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path (deserpath-type (clojure.core/get-in letvar409718 ["Path" :content])), :server-certificate-name (deserserver-certificate-name-type (clojure.core/get-in letvar409718 ["ServerCertificateName" :content])), :server-certificate-id (deserid-type (clojure.core/get-in letvar409718 ["ServerCertificateId" :content])), :arn (deserarn-type (clojure.core/get-in letvar409718 ["Arn" :content]))} (letvar409718 "UploadDate") (clojure.core/assoc :upload-date (deserdate-type (clojure.core/get-in letvar409718 ["UploadDate" :content]))) (letvar409718 "Expiration") (clojure.core/assoc :expiration (deserdate-type (clojure.core/get-in letvar409718 ["Expiration" :content]))))))

(clojure.core/defn- deserentity-details-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity-details coll))) input))

(clojure.core/defn- deserjob-status-type [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "COMPLETED" :completed, "FAILED" :failed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserkey-pair-mismatch-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserserver-certificate-metadata-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-server-certificate-metadata coll))) input))

(clojure.core/defn- deser-entity-details [input] (clojure.core/let [letvar409870 {"EntityInfo" (portkey.aws/search-for-tag input "EntityInfo" :flattened? nil :xmlAttribute? nil), "LastAuthenticated" (portkey.aws/search-for-tag input "LastAuthenticated" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:entity-info (deser-entity-info (clojure.core/get-in letvar409870 ["EntityInfo" :content]))} (letvar409870 "LastAuthenticated") (clojure.core/assoc :last-authenticated (deserdate-type (clojure.core/get-in letvar409870 ["LastAuthenticated" :content]))))))

(clojure.core/defn- deserpolicy-owner-entity-type [input] (clojure.core/get {"USER" :user, "ROLE" :role, "GROUP" :group} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-report-state-type [input] (clojure.core/get {"STARTED" :started, "INPROGRESS" :inprogress, "COMPLETE" :complete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deservirtual-mfa-device-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-virtual-mfa-device coll))) input))

(clojure.core/defn- desermarker-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-deletion-task-status-type [input] (clojure.core/get {"SUCCEEDED" :succeeded, "IN_PROGRESS" :in-progress, "FAILED" :failed, "NOT_STARTED" :not-started} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-login-profile [input] (clojure.core/let [letvar410015 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "PasswordResetRequired" (portkey.aws/search-for-tag input "PasswordResetRequired" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar410015 ["UserName" :content])), :create-date (deserdate-type (clojure.core/get-in letvar410015 ["CreateDate" :content]))} (letvar410015 "PasswordResetRequired") (clojure.core/assoc :password-reset-required (deserboolean-type (clojure.core/get-in letvar410015 ["PasswordResetRequired" :content]))))))

(clojure.core/defn- deserdate-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-server-certificate [input] (clojure.core/let [letvar410125 {"ServerCertificateMetadata" (portkey.aws/search-for-tag input "ServerCertificateMetadata" :flattened? nil :xmlAttribute? nil), "CertificateBody" (portkey.aws/search-for-tag input "CertificateBody" :flattened? nil :xmlAttribute? nil), "CertificateChain" (portkey.aws/search-for-tag input "CertificateChain" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:server-certificate-metadata (deser-server-certificate-metadata (clojure.core/get-in letvar410125 ["ServerCertificateMetadata" :content])), :certificate-body (desercertificate-body-type (clojure.core/get-in letvar410125 ["CertificateBody" :content]))} (letvar410125 "CertificateChain") (clojure.core/assoc :certificate-chain (desercertificate-chain-type (clojure.core/get-in letvar410125 ["CertificateChain" :content]))))))

(clojure.core/defn- desergroup-name-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (desergroup-name-type coll))) input))

(clojure.core/defn- deser-saml-provider-list-entry [input] (clojure.core/let [letvar410250 {"Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "ValidUntil" (portkey.aws/search-for-tag input "ValidUntil" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar410250 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar410250 ["Arn" :content]))) (letvar410250 "ValidUntil") (clojure.core/assoc :valid-until (deserdate-type (clojure.core/get-in letvar410250 ["ValidUntil" :content]))) (letvar410250 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar410250 ["CreateDate" :content]))))))

(clojure.core/defn- deser-action-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseruser-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desergroup-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-document-version-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-version coll))) input))

(clojure.core/defn- deser-role-usage-type [input] (clojure.core/let [letvar410390 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Resources" (portkey.aws/search-for-tag input "Resources" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar410390 "Region") (clojure.core/assoc :region (deser-region-name-type (clojure.core/get-in letvar410390 ["Region" :content]))) (letvar410390 "Resources") (clojure.core/assoc :resources (deser-arn-list-type (clojure.core/get-in letvar410390 ["Resources" :content]))))))

(clojure.core/defn- desercredential-report-expired-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-instance-profile [input] (clojure.core/let [letvar410503 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "InstanceProfileName" (portkey.aws/search-for-tag input "InstanceProfileName" :flattened? nil :xmlAttribute? nil), "InstanceProfileId" (portkey.aws/search-for-tag input "InstanceProfileId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "Roles" (portkey.aws/search-for-tag input "Roles" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path (deserpath-type (clojure.core/get-in letvar410503 ["Path" :content])), :instance-profile-name (deserinstance-profile-name-type (clojure.core/get-in letvar410503 ["InstanceProfileName" :content])), :instance-profile-id (deserid-type (clojure.core/get-in letvar410503 ["InstanceProfileId" :content])), :arn (deserarn-type (clojure.core/get-in letvar410503 ["Arn" :content])), :create-date (deserdate-type (clojure.core/get-in letvar410503 ["CreateDate" :content])), :roles (deserrole-list-type (clojure.core/get-in letvar410503 ["Roles" :content]))})))

(clojure.core/defn- deserattached-policies-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attached-policy coll))) input))

(clojure.core/defn- deserservice-namespace-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-identifier-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserid-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserclient-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserstring-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-eval-decision-source-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-password-policy [input] (clojure.core/let [letvar410658 {"MinimumPasswordLength" (portkey.aws/search-for-tag input "MinimumPasswordLength" :flattened? nil :xmlAttribute? nil), "RequireNumbers" (portkey.aws/search-for-tag input "RequireNumbers" :flattened? nil :xmlAttribute? nil), "RequireUppercaseCharacters" (portkey.aws/search-for-tag input "RequireUppercaseCharacters" :flattened? nil :xmlAttribute? nil), "HardExpiry" (portkey.aws/search-for-tag input "HardExpiry" :flattened? nil :xmlAttribute? nil), "ExpirePasswords" (portkey.aws/search-for-tag input "ExpirePasswords" :flattened? nil :xmlAttribute? nil), "RequireLowercaseCharacters" (portkey.aws/search-for-tag input "RequireLowercaseCharacters" :flattened? nil :xmlAttribute? nil), "RequireSymbols" (portkey.aws/search-for-tag input "RequireSymbols" :flattened? nil :xmlAttribute? nil), "AllowUsersToChangePassword" (portkey.aws/search-for-tag input "AllowUsersToChangePassword" :flattened? nil :xmlAttribute? nil), "MaxPasswordAge" (portkey.aws/search-for-tag input "MaxPasswordAge" :flattened? nil :xmlAttribute? nil), "PasswordReusePrevention" (portkey.aws/search-for-tag input "PasswordReusePrevention" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar410658 "MinimumPasswordLength") (clojure.core/assoc :minimum-password-length (deserminimum-password-length-type (clojure.core/get-in letvar410658 ["MinimumPasswordLength" :content]))) (letvar410658 "RequireNumbers") (clojure.core/assoc :require-numbers (deserboolean-type (clojure.core/get-in letvar410658 ["RequireNumbers" :content]))) (letvar410658 "RequireUppercaseCharacters") (clojure.core/assoc :require-uppercase-characters (deserboolean-type (clojure.core/get-in letvar410658 ["RequireUppercaseCharacters" :content]))) (letvar410658 "HardExpiry") (clojure.core/assoc :hard-expiry (deserboolean-object-type (clojure.core/get-in letvar410658 ["HardExpiry" :content]))) (letvar410658 "ExpirePasswords") (clojure.core/assoc :expire-passwords (deserboolean-type (clojure.core/get-in letvar410658 ["ExpirePasswords" :content]))) (letvar410658 "RequireLowercaseCharacters") (clojure.core/assoc :require-lowercase-characters (deserboolean-type (clojure.core/get-in letvar410658 ["RequireLowercaseCharacters" :content]))) (letvar410658 "RequireSymbols") (clojure.core/assoc :require-symbols (deserboolean-type (clojure.core/get-in letvar410658 ["RequireSymbols" :content]))) (letvar410658 "AllowUsersToChangePassword") (clojure.core/assoc :allow-users-to-change-password (deserboolean-type (clojure.core/get-in letvar410658 ["AllowUsersToChangePassword" :content]))) (letvar410658 "MaxPasswordAge") (clojure.core/assoc :max-password-age (desermax-password-age-type (clojure.core/get-in letvar410658 ["MaxPasswordAge" :content]))) (letvar410658 "PasswordReusePrevention") (clojure.core/assoc :password-reuse-prevention (deserpassword-reuse-prevention-type (clojure.core/get-in letvar410658 ["PasswordReusePrevention" :content]))))))

(clojure.core/defn- desersummary-map-type [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(desersummary-key-type k) (desersummary-value-type v)]))) input)))

(clojure.core/defn- deserlist-policy-granting-service-access-response-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-list-policies-granting-service-access-entry coll))) input))

(clojure.core/defn- deser-services-last-accessed [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-last-accessed coll))) input))

(clojure.core/defn- deserno-such-entity-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseruser-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user coll))) input))

(clojure.core/defn- desertag-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-permissions-boundary-attachment-type [input] (clojure.core/get {"PermissionsBoundaryPolicy" :permissions-boundary-policy} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserthumbprint-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desersummary-key-type [input] (clojure.core/get {"AccountMFAEnabled" :account-mfa-enabled, "VersionsPerPolicyQuota" :versions-per-policy-quota, "PolicySizeQuota" :policy-size-quota, "ServerCertificates" :server-certificates, "AccessKeysPerUserQuota" :access-keys-per-user-quota, "GroupsQuota" :groups-quota, "AttachedPoliciesPerRoleQuota" :attached-policies-per-role-quota, "SigningCertificatesPerUserQuota" :signing-certificates-per-user-quota, "GroupPolicySizeQuota" :group-policy-size-quota, "PolicyVersionsInUse" :policy-versions-in-use, "UserPolicySizeQuota" :user-policy-size-quota, "MFADevicesInUse" :mfa-devices-in-use, "Users" :users, "Groups" :groups, "AccountSigningCertificatesPresent" :account-signing-certificates-present, "Policies" :policies, "AttachedPoliciesPerGroupQuota" :attached-policies-per-group-quota, "UsersQuota" :users-quota, "PoliciesQuota" :policies-quota, "ServerCertificatesQuota" :server-certificates-quota, "AccountAccessKeysPresent" :account-access-keys-present, "GroupsPerUserQuota" :groups-per-user-quota, "MFADevices" :mfa-devices, "AttachedPoliciesPerUserQuota" :attached-policies-per-user-quota, "PolicyVersionsInUseQuota" :policy-versions-in-use-quota} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserinstance-profile-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-profile coll))) input))

(clojure.core/defn- deserpassword-policy-violation-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desermalformed-certificate-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-statement-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-statement coll))) input))

(clojure.core/defn- deserinvalid-certificate-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-statement [input] (clojure.core/let [letvar410926 {"SourcePolicyId" (portkey.aws/search-for-tag input "SourcePolicyId" :flattened? nil :xmlAttribute? nil), "SourcePolicyType" (portkey.aws/search-for-tag input "SourcePolicyType" :flattened? nil :xmlAttribute? nil), "StartPosition" (portkey.aws/search-for-tag input "StartPosition" :flattened? nil :xmlAttribute? nil), "EndPosition" (portkey.aws/search-for-tag input "EndPosition" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar410926 "SourcePolicyId") (clojure.core/assoc :source-policy-id (deser-policy-identifier-type (clojure.core/get-in letvar410926 ["SourcePolicyId" :content]))) (letvar410926 "SourcePolicyType") (clojure.core/assoc :source-policy-type (deser-policy-source-type (clojure.core/get-in letvar410926 ["SourcePolicyType" :content]))) (letvar410926 "StartPosition") (clojure.core/assoc :start-position (deser-position (clojure.core/get-in letvar410926 ["StartPosition" :content]))) (letvar410926 "EndPosition") (clojure.core/assoc :end-position (deser-position (clojure.core/get-in letvar410926 ["EndPosition" :content]))))))

(clojure.core/defn- deser-policy-user-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-user coll))) input))

(clojure.core/defn- deserrole-max-session-duration-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deseraccount-alias-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccount-alias-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deseraccount-alias-type coll))) input))

(clojure.core/defn- deseraccess-key-secret-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-evaluation-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpassword-reuse-prevention-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-line-number [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deseruser-detail-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-user-detail coll))) input))

(clojure.core/defn- desertag-key-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-entity-info [input] (clojure.core/let [letvar411111 {"Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:arn (deserarn-type (clojure.core/get-in letvar411111 ["Arn" :content])), :name (deseruser-name-type (clojure.core/get-in letvar411111 ["Name" :content])), :type (deserpolicy-owner-entity-type (clojure.core/get-in letvar411111 ["Type" :content])), :id (deserid-type (clojure.core/get-in letvar411111 ["Id" :content]))} (letvar411111 "Path") (clojure.core/assoc :path (deserpath-type (clojure.core/get-in letvar411111 ["Path" :content]))))))

(clojure.core/defn- deser-column-number [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-user [input] (clojure.core/let [letvar411221 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "UserId" (portkey.aws/search-for-tag input "UserId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "PasswordLastUsed" (portkey.aws/search-for-tag input "PasswordLastUsed" :flattened? nil :xmlAttribute? nil), "PermissionsBoundary" (portkey.aws/search-for-tag input "PermissionsBoundary" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path (deserpath-type (clojure.core/get-in letvar411221 ["Path" :content])), :user-name (deseruser-name-type (clojure.core/get-in letvar411221 ["UserName" :content])), :user-id (deserid-type (clojure.core/get-in letvar411221 ["UserId" :content])), :arn (deserarn-type (clojure.core/get-in letvar411221 ["Arn" :content])), :create-date (deserdate-type (clojure.core/get-in letvar411221 ["CreateDate" :content]))} (letvar411221 "PasswordLastUsed") (clojure.core/assoc :password-last-used (deserdate-type (clojure.core/get-in letvar411221 ["PasswordLastUsed" :content]))) (letvar411221 "PermissionsBoundary") (clojure.core/assoc :permissions-boundary (deser-attached-permissions-boundary (clojure.core/get-in letvar411221 ["PermissionsBoundary" :content]))) (letvar411221 "Tags") (clojure.core/assoc :tags (desertag-list-type (clojure.core/get-in letvar411221 ["Tags" :content]))))))

(clojure.core/defn- deser-policy-role [input] (clojure.core/let [letvar411329 {"RoleName" (portkey.aws/search-for-tag input "RoleName" :flattened? nil :xmlAttribute? nil), "RoleId" (portkey.aws/search-for-tag input "RoleId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar411329 "RoleName") (clojure.core/assoc :role-name (deserrole-name-type (clojure.core/get-in letvar411329 ["RoleName" :content]))) (letvar411329 "RoleId") (clojure.core/assoc :role-id (deserid-type (clojure.core/get-in letvar411329 ["RoleId" :content]))))))

(clojure.core/defn- deserattachment-count-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-ssh-public-key-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssh-public-key-metadata coll))) input))

(clojure.core/defn- deser-service-specific-credential-metadata [input] (clojure.core/let [letvar411456 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "ServiceUserName" (portkey.aws/search-for-tag input "ServiceUserName" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "ServiceSpecificCredentialId" (portkey.aws/search-for-tag input "ServiceSpecificCredentialId" :flattened? nil :xmlAttribute? nil), "ServiceName" (portkey.aws/search-for-tag input "ServiceName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar411456 ["UserName" :content])), :status (deserstatus-type (clojure.core/get-in letvar411456 ["Status" :content])), :service-user-name (deserservice-user-name (clojure.core/get-in letvar411456 ["ServiceUserName" :content])), :create-date (deserdate-type (clojure.core/get-in letvar411456 ["CreateDate" :content])), :service-specific-credential-id (deserservice-specific-credential-id (clojure.core/get-in letvar411456 ["ServiceSpecificCredentialId" :content])), :service-name (deserservice-name (clojure.core/get-in letvar411456 ["ServiceName" :content]))})))

(clojure.core/defn- deserpolicy-type [input] (clojure.core/get {"INLINE" :inline, "MANAGED" :managed} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserpolicy-version-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-version [input] (clojure.core/let [letvar411574 {"Document" (portkey.aws/search-for-tag input "Document" :flattened? nil :xmlAttribute? nil), "VersionId" (portkey.aws/search-for-tag input "VersionId" :flattened? nil :xmlAttribute? nil), "IsDefaultVersion" (portkey.aws/search-for-tag input "IsDefaultVersion" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar411574 "Document") (clojure.core/assoc :document (deserpolicy-document-type (clojure.core/get-in letvar411574 ["Document" :content]))) (letvar411574 "VersionId") (clojure.core/assoc :version-id (deserpolicy-version-id-type (clojure.core/get-in letvar411574 ["VersionId" :content]))) (letvar411574 "IsDefaultVersion") (clojure.core/assoc :is-default-version (deserboolean-type (clojure.core/get-in letvar411574 ["IsDefaultVersion" :content]))) (letvar411574 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar411574 ["CreateDate" :content]))))))

(clojure.core/defn- deser-policy-role-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-role coll))) input))

(clojure.core/defn- deserinvalid-input-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpublic-key-fingerprint-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserinstance-profile-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-attached-permissions-boundary [input] (clojure.core/let [letvar411714 {"PermissionsBoundaryType" (portkey.aws/search-for-tag input "PermissionsBoundaryType" :flattened? nil :xmlAttribute? nil), "PermissionsBoundaryArn" (portkey.aws/search-for-tag input "PermissionsBoundaryArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar411714 "PermissionsBoundaryType") (clojure.core/assoc :permissions-boundary-type (deser-permissions-boundary-attachment-type (clojure.core/get-in letvar411714 ["PermissionsBoundaryType" :content]))) (letvar411714 "PermissionsBoundaryArn") (clojure.core/assoc :permissions-boundary-arn (deserarn-type (clojure.core/get-in letvar411714 ["PermissionsBoundaryArn" :content]))))))

(clojure.core/defn- deserservice-specific-credential-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-evaluation-result [input] (clojure.core/let [letvar411827 {"EvalActionName" (portkey.aws/search-for-tag input "EvalActionName" :flattened? nil :xmlAttribute? nil), "EvalResourceName" (portkey.aws/search-for-tag input "EvalResourceName" :flattened? nil :xmlAttribute? nil), "EvalDecision" (portkey.aws/search-for-tag input "EvalDecision" :flattened? nil :xmlAttribute? nil), "MatchedStatements" (portkey.aws/search-for-tag input "MatchedStatements" :flattened? nil :xmlAttribute? nil), "MissingContextValues" (portkey.aws/search-for-tag input "MissingContextValues" :flattened? nil :xmlAttribute? nil), "OrganizationsDecisionDetail" (portkey.aws/search-for-tag input "OrganizationsDecisionDetail" :flattened? nil :xmlAttribute? nil), "EvalDecisionDetails" (portkey.aws/search-for-tag input "EvalDecisionDetails" :flattened? nil :xmlAttribute? nil), "ResourceSpecificResults" (portkey.aws/search-for-tag input "ResourceSpecificResults" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:eval-action-name (deser-action-name-type (clojure.core/get-in letvar411827 ["EvalActionName" :content])), :eval-decision (deser-policy-evaluation-decision-type (clojure.core/get-in letvar411827 ["EvalDecision" :content]))} (letvar411827 "EvalResourceName") (clojure.core/assoc :eval-resource-name (deser-resource-name-type (clojure.core/get-in letvar411827 ["EvalResourceName" :content]))) (letvar411827 "MatchedStatements") (clojure.core/assoc :matched-statements (deser-statement-list-type (clojure.core/get-in letvar411827 ["MatchedStatements" :content]))) (letvar411827 "MissingContextValues") (clojure.core/assoc :missing-context-values (deser-context-key-names-result-list-type (clojure.core/get-in letvar411827 ["MissingContextValues" :content]))) (letvar411827 "OrganizationsDecisionDetail") (clojure.core/assoc :organizations-decision-detail (deser-organizations-decision-detail (clojure.core/get-in letvar411827 ["OrganizationsDecisionDetail" :content]))) (letvar411827 "EvalDecisionDetails") (clojure.core/assoc :eval-decision-details (deser-eval-decision-details-type (clojure.core/get-in letvar411827 ["EvalDecisionDetails" :content]))) (letvar411827 "ResourceSpecificResults") (clojure.core/assoc :resource-specific-results (deser-resource-specific-result-list-type (clojure.core/get-in letvar411827 ["ResourceSpecificResults" :content]))))))

(clojure.core/defn- deser-attached-policy [input] (clojure.core/let [letvar411935 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "PolicyArn" (portkey.aws/search-for-tag input "PolicyArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar411935 "PolicyName") (clojure.core/assoc :policy-name (deserpolicy-name-type (clojure.core/get-in letvar411935 ["PolicyName" :content]))) (letvar411935 "PolicyArn") (clojure.core/assoc :policy-arn (deserarn-type (clojure.core/get-in letvar411935 ["PolicyArn" :content]))))))

(clojure.core/defn- desermax-password-age-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserentity-temporarily-unmodifiable-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-user [input] (clojure.core/let [letvar412050 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "UserId" (portkey.aws/search-for-tag input "UserId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar412050 "UserName") (clojure.core/assoc :user-name (deseruser-name-type (clojure.core/get-in letvar412050 ["UserName" :content]))) (letvar412050 "UserId") (clojure.core/assoc :user-id (deserid-type (clojure.core/get-in letvar412050 ["UserId" :content]))))))

(clojure.core/defn- deser-access-key-last-used [input] (clojure.core/let [letvar412158 {"LastUsedDate" (portkey.aws/search-for-tag input "LastUsedDate" :flattened? nil :xmlAttribute? nil), "ServiceName" (portkey.aws/search-for-tag input "ServiceName" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:last-used-date (deserdate-type (clojure.core/get-in letvar412158 ["LastUsedDate" :content])), :service-name (deserstring-type (clojure.core/get-in letvar412158 ["ServiceName" :content])), :region (deserstring-type (clojure.core/get-in letvar412158 ["Region" :content]))})))

(clojure.core/defn- deser-ssh-public-key [input] (clojure.core/let [letvar412266 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "SSHPublicKeyId" (portkey.aws/search-for-tag input "SSHPublicKeyId" :flattened? nil :xmlAttribute? nil), "Fingerprint" (portkey.aws/search-for-tag input "Fingerprint" :flattened? nil :xmlAttribute? nil), "SSHPublicKeyBody" (portkey.aws/search-for-tag input "SSHPublicKeyBody" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "UploadDate" (portkey.aws/search-for-tag input "UploadDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar412266 ["UserName" :content])), :ssh-public-key-id (deserpublic-key-id-type (clojure.core/get-in letvar412266 ["SSHPublicKeyId" :content])), :fingerprint (deserpublic-key-fingerprint-type (clojure.core/get-in letvar412266 ["Fingerprint" :content])), :ssh-public-key-body (deserpublic-key-material-type (clojure.core/get-in letvar412266 ["SSHPublicKeyBody" :content])), :status (deserstatus-type (clojure.core/get-in letvar412266 ["Status" :content]))} (letvar412266 "UploadDate") (clojure.core/assoc :upload-date (deserdate-type (clojure.core/get-in letvar412266 ["UploadDate" :content]))))))

(clojure.core/defn- deserduplicate-certificate-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-document-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserrole-detail-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-role-detail coll))) input))

(clojure.core/defn- deser-bootstrap-datum [input] input)

(clojure.core/defn- deser-role [input] (clojure.core/let [letvar412403 {"RoleId" (portkey.aws/search-for-tag input "RoleId" :flattened? nil :xmlAttribute? nil), "AssumeRolePolicyDocument" (portkey.aws/search-for-tag input "AssumeRolePolicyDocument" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "RoleName" (portkey.aws/search-for-tag input "RoleName" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "PermissionsBoundary" (portkey.aws/search-for-tag input "PermissionsBoundary" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "MaxSessionDuration" (portkey.aws/search-for-tag input "MaxSessionDuration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path (deserpath-type (clojure.core/get-in letvar412403 ["Path" :content])), :role-name (deserrole-name-type (clojure.core/get-in letvar412403 ["RoleName" :content])), :role-id (deserid-type (clojure.core/get-in letvar412403 ["RoleId" :content])), :arn (deserarn-type (clojure.core/get-in letvar412403 ["Arn" :content])), :create-date (deserdate-type (clojure.core/get-in letvar412403 ["CreateDate" :content]))} (letvar412403 "AssumeRolePolicyDocument") (clojure.core/assoc :assume-role-policy-document (deserpolicy-document-type (clojure.core/get-in letvar412403 ["AssumeRolePolicyDocument" :content]))) (letvar412403 "Tags") (clojure.core/assoc :tags (desertag-list-type (clojure.core/get-in letvar412403 ["Tags" :content]))) (letvar412403 "PermissionsBoundary") (clojure.core/assoc :permissions-boundary (deser-attached-permissions-boundary (clojure.core/get-in letvar412403 ["PermissionsBoundary" :content]))) (letvar412403 "Description") (clojure.core/assoc :description (deserrole-description-type (clojure.core/get-in letvar412403 ["Description" :content]))) (letvar412403 "MaxSessionDuration") (clojure.core/assoc :max-session-duration (deserrole-max-session-duration-type (clojure.core/get-in letvar412403 ["MaxSessionDuration" :content]))))))

(clojure.core/defn- deserinvalid-user-type-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserboolean-type [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-virtual-mfa-device [input] (clojure.core/let [letvar412518 {"SerialNumber" (portkey.aws/search-for-tag input "SerialNumber" :flattened? nil :xmlAttribute? nil), "Base32StringSeed" (portkey.aws/search-for-tag input "Base32StringSeed" :flattened? nil :xmlAttribute? nil), "QRCodePNG" (portkey.aws/search-for-tag input "QRCodePNG" :flattened? nil :xmlAttribute? nil), "User" (portkey.aws/search-for-tag input "User" :flattened? nil :xmlAttribute? nil), "EnableDate" (portkey.aws/search-for-tag input "EnableDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:serial-number (deserserial-number-type (clojure.core/get-in letvar412518 ["SerialNumber" :content]))} (letvar412518 "Base32StringSeed") (clojure.core/assoc :base-32-string-seed (deser-bootstrap-datum (clojure.core/get-in letvar412518 ["Base32StringSeed" :content]))) (letvar412518 "QRCodePNG") (clojure.core/assoc :qr-code-png (deser-bootstrap-datum (clojure.core/get-in letvar412518 ["QRCodePNG" :content]))) (letvar412518 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar412518 ["User" :content]))) (letvar412518 "EnableDate") (clojure.core/assoc :enable-date (deserdate-type (clojure.core/get-in letvar412518 ["EnableDate" :content]))))))

(clojure.core/defn- deser-list-policies-granting-service-access-entry [input] (clojure.core/let [letvar412626 {"ServiceNamespace" (portkey.aws/search-for-tag input "ServiceNamespace" :flattened? nil :xmlAttribute? nil), "Policies" (portkey.aws/search-for-tag input "Policies" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar412626 "ServiceNamespace") (clojure.core/assoc :service-namespace (deserservice-namespace-type (clojure.core/get-in letvar412626 ["ServiceNamespace" :content]))) (letvar412626 "Policies") (clojure.core/assoc :policies (deserpolicy-granting-service-access-list-type (clojure.core/get-in letvar412626 ["Policies" :content]))))))

(clojure.core/defn- deser-mfa-device [input] (clojure.core/let [letvar412734 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "SerialNumber" (portkey.aws/search-for-tag input "SerialNumber" :flattened? nil :xmlAttribute? nil), "EnableDate" (portkey.aws/search-for-tag input "EnableDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar412734 ["UserName" :content])), :serial-number (deserserial-number-type (clojure.core/get-in letvar412734 ["SerialNumber" :content])), :enable-date (deserdate-type (clojure.core/get-in letvar412734 ["EnableDate" :content]))})))

(clojure.core/defn- deserstatus-type [input] (clojure.core/get {"Active" :active, "Inactive" :inactive} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserexisting-user-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserunmodifiable-entity-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-open-id-connect-provider-url-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserjob-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deseraccess-key-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-role-usage-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-role-usage-type coll))) input))

(clojure.core/defn- deserpolicy-description-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserentity-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desercredential-report-not-present-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserservice-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserboolean-object-type [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-deletion-task-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-user-detail [input] (clojure.core/let [letvar412921 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "GroupList" (portkey.aws/search-for-tag input "GroupList" :flattened? nil :xmlAttribute? nil), "UserId" (portkey.aws/search-for-tag input "UserId" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "PermissionsBoundary" (portkey.aws/search-for-tag input "PermissionsBoundary" :flattened? nil :xmlAttribute? nil), "UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "UserPolicyList" (portkey.aws/search-for-tag input "UserPolicyList" :flattened? nil :xmlAttribute? nil), "AttachedManagedPolicies" (portkey.aws/search-for-tag input "AttachedManagedPolicies" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar412921 "Path") (clojure.core/assoc :path (deserpath-type (clojure.core/get-in letvar412921 ["Path" :content]))) (letvar412921 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar412921 ["CreateDate" :content]))) (letvar412921 "GroupList") (clojure.core/assoc :group-list (desergroup-name-list-type (clojure.core/get-in letvar412921 ["GroupList" :content]))) (letvar412921 "UserId") (clojure.core/assoc :user-id (deserid-type (clojure.core/get-in letvar412921 ["UserId" :content]))) (letvar412921 "Tags") (clojure.core/assoc :tags (desertag-list-type (clojure.core/get-in letvar412921 ["Tags" :content]))) (letvar412921 "PermissionsBoundary") (clojure.core/assoc :permissions-boundary (deser-attached-permissions-boundary (clojure.core/get-in letvar412921 ["PermissionsBoundary" :content]))) (letvar412921 "UserName") (clojure.core/assoc :user-name (deseruser-name-type (clojure.core/get-in letvar412921 ["UserName" :content]))) (letvar412921 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar412921 ["Arn" :content]))) (letvar412921 "UserPolicyList") (clojure.core/assoc :user-policy-list (deserpolicy-detail-list-type (clojure.core/get-in letvar412921 ["UserPolicyList" :content]))) (letvar412921 "AttachedManagedPolicies") (clojure.core/assoc :attached-managed-policies (deserattached-policies-list-type (clojure.core/get-in letvar412921 ["AttachedManagedPolicies" :content]))))))

(clojure.core/defn- deser-managed-policy-detail-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-managed-policy-detail coll))) input))

(clojure.core/defn- deser-saml-metadata-document-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-reason-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-position [input] (clojure.core/let [letvar413061 {"Line" (portkey.aws/search-for-tag input "Line" :flattened? nil :xmlAttribute? nil), "Column" (portkey.aws/search-for-tag input "Column" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar413061 "Line") (clojure.core/assoc :line (deser-line-number (clojure.core/get-in letvar413061 ["Line" :content]))) (letvar413061 "Column") (clojure.core/assoc :column (deser-column-number (clojure.core/get-in letvar413061 ["Column" :content]))))))

(clojure.core/defn- deserdelete-conflict-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-name-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserpolicy-name-type coll))) input))

(clojure.core/defn- deser-evaluation-results-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-evaluation-result coll))) input))

(clojure.core/defn- desercertificate-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signing-certificate coll))) input))

(clojure.core/defn- deserclient-id-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserclient-id-type coll))) input))

(clojure.core/defn- desercertificate-body-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-granting-service-access [input] (clojure.core/let [letvar413247 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "PolicyType" (portkey.aws/search-for-tag input "PolicyType" :flattened? nil :xmlAttribute? nil), "PolicyArn" (portkey.aws/search-for-tag input "PolicyArn" :flattened? nil :xmlAttribute? nil), "EntityType" (portkey.aws/search-for-tag input "EntityType" :flattened? nil :xmlAttribute? nil), "EntityName" (portkey.aws/search-for-tag input "EntityName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:policy-name (deserpolicy-name-type (clojure.core/get-in letvar413247 ["PolicyName" :content])), :policy-type (deserpolicy-type (clojure.core/get-in letvar413247 ["PolicyType" :content]))} (letvar413247 "PolicyArn") (clojure.core/assoc :policy-arn (deserarn-type (clojure.core/get-in letvar413247 ["PolicyArn" :content]))) (letvar413247 "EntityType") (clojure.core/assoc :entity-type (deserpolicy-owner-entity-type (clojure.core/get-in letvar413247 ["EntityType" :content]))) (letvar413247 "EntityName") (clojure.core/assoc :entity-name (deserentity-name-type (clojure.core/get-in letvar413247 ["EntityName" :content]))))))

(clojure.core/defn- desercredential-report-not-ready-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserservice-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-managed-policy-detail [input] (clojure.core/let [letvar413365 {"PermissionsBoundaryUsageCount" (portkey.aws/search-for-tag input "PermissionsBoundaryUsageCount" :flattened? nil :xmlAttribute? nil), "PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "AttachmentCount" (portkey.aws/search-for-tag input "AttachmentCount" :flattened? nil :xmlAttribute? nil), "IsAttachable" (portkey.aws/search-for-tag input "IsAttachable" :flattened? nil :xmlAttribute? nil), "DefaultVersionId" (portkey.aws/search-for-tag input "DefaultVersionId" :flattened? nil :xmlAttribute? nil), "PolicyId" (portkey.aws/search-for-tag input "PolicyId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "UpdateDate" (portkey.aws/search-for-tag input "UpdateDate" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "PolicyVersionList" (portkey.aws/search-for-tag input "PolicyVersionList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar413365 "PermissionsBoundaryUsageCount") (clojure.core/assoc :permissions-boundary-usage-count (deserattachment-count-type (clojure.core/get-in letvar413365 ["PermissionsBoundaryUsageCount" :content]))) (letvar413365 "PolicyName") (clojure.core/assoc :policy-name (deserpolicy-name-type (clojure.core/get-in letvar413365 ["PolicyName" :content]))) (letvar413365 "Path") (clojure.core/assoc :path (deserpolicy-path-type (clojure.core/get-in letvar413365 ["Path" :content]))) (letvar413365 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar413365 ["CreateDate" :content]))) (letvar413365 "AttachmentCount") (clojure.core/assoc :attachment-count (deserattachment-count-type (clojure.core/get-in letvar413365 ["AttachmentCount" :content]))) (letvar413365 "IsAttachable") (clojure.core/assoc :is-attachable (deserboolean-type (clojure.core/get-in letvar413365 ["IsAttachable" :content]))) (letvar413365 "DefaultVersionId") (clojure.core/assoc :default-version-id (deserpolicy-version-id-type (clojure.core/get-in letvar413365 ["DefaultVersionId" :content]))) (letvar413365 "PolicyId") (clojure.core/assoc :policy-id (deserid-type (clojure.core/get-in letvar413365 ["PolicyId" :content]))) (letvar413365 "Description") (clojure.core/assoc :description (deserpolicy-description-type (clojure.core/get-in letvar413365 ["Description" :content]))) (letvar413365 "UpdateDate") (clojure.core/assoc :update-date (deserdate-type (clojure.core/get-in letvar413365 ["UpdateDate" :content]))) (letvar413365 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar413365 ["Arn" :content]))) (letvar413365 "PolicyVersionList") (clojure.core/assoc :policy-version-list (deserpolicy-document-version-list-type (clojure.core/get-in letvar413365 ["PolicyVersionList" :content]))))))

(clojure.core/defn- deser-eval-decision-details-type [input] (clojure.core/let [x-flattened__283694__auto__ (clojure.core/map clojure.core/identity)] (clojure.core/into {} (clojure.core/comp x-flattened__283694__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-eval-decision-source-type k) (deser-policy-evaluation-decision-type v)]))) input)))

(clojure.core/defn- deser-access-key-metadata [input] (clojure.core/let [letvar413496 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "AccessKeyId" (portkey.aws/search-for-tag input "AccessKeyId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar413496 "UserName") (clojure.core/assoc :user-name (deseruser-name-type (clojure.core/get-in letvar413496 ["UserName" :content]))) (letvar413496 "AccessKeyId") (clojure.core/assoc :access-key-id (deseraccess-key-id-type (clojure.core/get-in letvar413496 ["AccessKeyId" :content]))) (letvar413496 "Status") (clojure.core/assoc :status (deserstatus-type (clojure.core/get-in letvar413496 ["Status" :content]))) (letvar413496 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar413496 ["CreateDate" :content]))))))

(clojure.core/defn- deserpolicy-not-attachable-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desercertificate-chain-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-group-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-group coll))) input))

(clojure.core/defn- desercertificate-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-context-key-names-result-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-context-key-name-type coll))) input))

(clojure.core/defn- deserthumbprint-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserthumbprint-type coll))) input))

(clojure.core/defn- deserarn-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-context-key-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserservice-not-supported-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-group [input] (clojure.core/let [letvar413685 {"GroupName" (portkey.aws/search-for-tag input "GroupName" :flattened? nil :xmlAttribute? nil), "GroupId" (portkey.aws/search-for-tag input "GroupId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar413685 "GroupName") (clojure.core/assoc :group-name (desergroup-name-type (clojure.core/get-in letvar413685 ["GroupName" :content]))) (letvar413685 "GroupId") (clojure.core/assoc :group-id (deserid-type (clojure.core/get-in letvar413685 ["GroupId" :content]))))))

(clojure.core/defn- deserinvalid-public-key-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-region-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-error-details [input] (clojure.core/let [letvar413803 {"Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:message (deserstring-type (clojure.core/get-in letvar413803 ["Message" :content])), :code (deserstring-type (clojure.core/get-in letvar413803 ["Code" :content]))})))

(clojure.core/defn- desermalformed-policy-document-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-signing-certificate [input] (clojure.core/let [letvar413916 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "CertificateId" (portkey.aws/search-for-tag input "CertificateId" :flattened? nil :xmlAttribute? nil), "CertificateBody" (portkey.aws/search-for-tag input "CertificateBody" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "UploadDate" (portkey.aws/search-for-tag input "UploadDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar413916 ["UserName" :content])), :certificate-id (desercertificate-id-type (clojure.core/get-in letvar413916 ["CertificateId" :content])), :certificate-body (desercertificate-body-type (clojure.core/get-in letvar413916 ["CertificateBody" :content])), :status (deserstatus-type (clojure.core/get-in letvar413916 ["Status" :content]))} (letvar413916 "UploadDate") (clojure.core/assoc :upload-date (deserdate-type (clojure.core/get-in letvar413916 ["UploadDate" :content]))))))

(clojure.core/defn- deser-report-state-description-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-report-format-type [input] (clojure.core/get {"text/csv" :textcsv} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserinteger-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-role-detail [input] (clojure.core/let [letvar414036 {"RoleId" (portkey.aws/search-for-tag input "RoleId" :flattened? nil :xmlAttribute? nil), "InstanceProfileList" (portkey.aws/search-for-tag input "InstanceProfileList" :flattened? nil :xmlAttribute? nil), "AssumeRolePolicyDocument" (portkey.aws/search-for-tag input "AssumeRolePolicyDocument" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "RoleName" (portkey.aws/search-for-tag input "RoleName" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "RolePolicyList" (portkey.aws/search-for-tag input "RolePolicyList" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "PermissionsBoundary" (portkey.aws/search-for-tag input "PermissionsBoundary" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "AttachedManagedPolicies" (portkey.aws/search-for-tag input "AttachedManagedPolicies" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414036 "RoleId") (clojure.core/assoc :role-id (deserid-type (clojure.core/get-in letvar414036 ["RoleId" :content]))) (letvar414036 "InstanceProfileList") (clojure.core/assoc :instance-profile-list (deserinstance-profile-list-type (clojure.core/get-in letvar414036 ["InstanceProfileList" :content]))) (letvar414036 "AssumeRolePolicyDocument") (clojure.core/assoc :assume-role-policy-document (deserpolicy-document-type (clojure.core/get-in letvar414036 ["AssumeRolePolicyDocument" :content]))) (letvar414036 "Path") (clojure.core/assoc :path (deserpath-type (clojure.core/get-in letvar414036 ["Path" :content]))) (letvar414036 "RoleName") (clojure.core/assoc :role-name (deserrole-name-type (clojure.core/get-in letvar414036 ["RoleName" :content]))) (letvar414036 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar414036 ["CreateDate" :content]))) (letvar414036 "RolePolicyList") (clojure.core/assoc :role-policy-list (deserpolicy-detail-list-type (clojure.core/get-in letvar414036 ["RolePolicyList" :content]))) (letvar414036 "Tags") (clojure.core/assoc :tags (desertag-list-type (clojure.core/get-in letvar414036 ["Tags" :content]))) (letvar414036 "PermissionsBoundary") (clojure.core/assoc :permissions-boundary (deser-attached-permissions-boundary (clojure.core/get-in letvar414036 ["PermissionsBoundary" :content]))) (letvar414036 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar414036 ["Arn" :content]))) (letvar414036 "AttachedManagedPolicies") (clojure.core/assoc :attached-managed-policies (deserattached-policies-list-type (clojure.core/get-in letvar414036 ["AttachedManagedPolicies" :content]))))))

(clojure.core/defn- deser-service-specific-credentials-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-specific-credential-metadata coll))) input))

(clojure.core/defn- deserserver-certificate-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserserial-number-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserrole-description-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-detail-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-detail coll))) input))

(clojure.core/defn- deser-policy [input] (clojure.core/let [letvar414193 {"PermissionsBoundaryUsageCount" (portkey.aws/search-for-tag input "PermissionsBoundaryUsageCount" :flattened? nil :xmlAttribute? nil), "PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "AttachmentCount" (portkey.aws/search-for-tag input "AttachmentCount" :flattened? nil :xmlAttribute? nil), "IsAttachable" (portkey.aws/search-for-tag input "IsAttachable" :flattened? nil :xmlAttribute? nil), "DefaultVersionId" (portkey.aws/search-for-tag input "DefaultVersionId" :flattened? nil :xmlAttribute? nil), "PolicyId" (portkey.aws/search-for-tag input "PolicyId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "UpdateDate" (portkey.aws/search-for-tag input "UpdateDate" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414193 "PermissionsBoundaryUsageCount") (clojure.core/assoc :permissions-boundary-usage-count (deserattachment-count-type (clojure.core/get-in letvar414193 ["PermissionsBoundaryUsageCount" :content]))) (letvar414193 "PolicyName") (clojure.core/assoc :policy-name (deserpolicy-name-type (clojure.core/get-in letvar414193 ["PolicyName" :content]))) (letvar414193 "Path") (clojure.core/assoc :path (deserpolicy-path-type (clojure.core/get-in letvar414193 ["Path" :content]))) (letvar414193 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar414193 ["CreateDate" :content]))) (letvar414193 "AttachmentCount") (clojure.core/assoc :attachment-count (deserattachment-count-type (clojure.core/get-in letvar414193 ["AttachmentCount" :content]))) (letvar414193 "IsAttachable") (clojure.core/assoc :is-attachable (deserboolean-type (clojure.core/get-in letvar414193 ["IsAttachable" :content]))) (letvar414193 "DefaultVersionId") (clojure.core/assoc :default-version-id (deserpolicy-version-id-type (clojure.core/get-in letvar414193 ["DefaultVersionId" :content]))) (letvar414193 "PolicyId") (clojure.core/assoc :policy-id (deserid-type (clojure.core/get-in letvar414193 ["PolicyId" :content]))) (letvar414193 "Description") (clojure.core/assoc :description (deserpolicy-description-type (clojure.core/get-in letvar414193 ["Description" :content]))) (letvar414193 "UpdateDate") (clojure.core/assoc :update-date (deserdate-type (clojure.core/get-in letvar414193 ["UpdateDate" :content]))) (letvar414193 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar414193 ["Arn" :content]))))))

(clojure.core/defn- deser-organizations-decision-detail [input] (clojure.core/let [letvar414301 {"AllowedByOrganizations" (portkey.aws/search-for-tag input "AllowedByOrganizations" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414301 "AllowedByOrganizations") (clojure.core/assoc :allowed-by-organizations (deserboolean-type (clojure.core/get-in letvar414301 ["AllowedByOrganizations" :content]))))))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar414409 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (desertag-key-type (clojure.core/get-in letvar414409 ["Key" :content])), :value (desertag-value-type (clojure.core/get-in letvar414409 ["Value" :content]))})))

(clojure.core/defn- deseraccess-key-metadata-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-access-key-metadata coll))) input))

(clojure.core/defn- deserpolicy-granting-service-access-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-granting-service-access coll))) input))

(clojure.core/defn- deser-arn-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserarn-type coll))) input))

(clojure.core/defn- deserduplicate-ssh-public-key-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserservice-user-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desermfa-device-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mfa-device coll))) input))

(clojure.core/defn- deserminimum-password-length-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserpolicy-path-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-detail [input] (clojure.core/let [letvar414602 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "PolicyDocument" (portkey.aws/search-for-tag input "PolicyDocument" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414602 "PolicyName") (clojure.core/assoc :policy-name (deserpolicy-name-type (clojure.core/get-in letvar414602 ["PolicyName" :content]))) (letvar414602 "PolicyDocument") (clojure.core/assoc :policy-document (deserpolicy-document-type (clojure.core/get-in letvar414602 ["PolicyDocument" :content]))))))

(clojure.core/defn- desertag-value-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-open-id-connect-provider-list-entry [input] (clojure.core/let [letvar414715 {"Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414715 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar414715 ["Arn" :content]))))))

(clojure.core/defn- desersummary-value-type [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserrole-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-role coll))) input))

(clojure.core/defn- deserpublic-key-id-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-group [input] (clojure.core/let [letvar414847 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "GroupName" (portkey.aws/search-for-tag input "GroupName" :flattened? nil :xmlAttribute? nil), "GroupId" (portkey.aws/search-for-tag input "GroupId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path (deserpath-type (clojure.core/get-in letvar414847 ["Path" :content])), :group-name (desergroup-name-type (clojure.core/get-in letvar414847 ["GroupName" :content])), :group-id (deserid-type (clojure.core/get-in letvar414847 ["GroupId" :content])), :arn (deserarn-type (clojure.core/get-in letvar414847 ["Arn" :content])), :create-date (deserdate-type (clojure.core/get-in letvar414847 ["CreateDate" :content]))})))

(clojure.core/defn- desergroup-detail-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group-detail coll))) input))

(clojure.core/defn- deser-deletion-task-failure-reason-type [input] (clojure.core/let [letvar414972 {"Reason" (portkey.aws/search-for-tag input "Reason" :flattened? nil :xmlAttribute? nil), "RoleUsageList" (portkey.aws/search-for-tag input "RoleUsageList" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar414972 "Reason") (clojure.core/assoc :reason (deser-reason-type (clojure.core/get-in letvar414972 ["Reason" :content]))) (letvar414972 "RoleUsageList") (clojure.core/assoc :role-usage-list (deser-role-usage-list-type (clojure.core/get-in letvar414972 ["RoleUsageList" :content]))))))

(clojure.core/defn- deser-ssh-public-key-metadata [input] (clojure.core/let [letvar415080 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "SSHPublicKeyId" (portkey.aws/search-for-tag input "SSHPublicKeyId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "UploadDate" (portkey.aws/search-for-tag input "UploadDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar415080 ["UserName" :content])), :ssh-public-key-id (deserpublic-key-id-type (clojure.core/get-in letvar415080 ["SSHPublicKeyId" :content])), :status (deserstatus-type (clojure.core/get-in letvar415080 ["Status" :content])), :upload-date (deserdate-type (clojure.core/get-in letvar415080 ["UploadDate" :content]))})))

(clojure.core/defn- deserpath-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- desergroup-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-group coll))) input))

(clojure.core/defn- deser-policy-evaluation-decision-type [input] (clojure.core/get {"allowed" :allowed, "explicitDeny" :explicit-deny, "implicitDeny" :implicit-deny} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deserentity-already-exists-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-open-id-connect-provider-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-open-id-connect-provider-list-entry coll))) input))

(clojure.core/defn- deser-service-specific-credential [input] (clojure.core/let [letvar415237 {"CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "ServiceName" (portkey.aws/search-for-tag input "ServiceName" :flattened? nil :xmlAttribute? nil), "ServiceUserName" (portkey.aws/search-for-tag input "ServiceUserName" :flattened? nil :xmlAttribute? nil), "ServicePassword" (portkey.aws/search-for-tag input "ServicePassword" :flattened? nil :xmlAttribute? nil), "ServiceSpecificCredentialId" (portkey.aws/search-for-tag input "ServiceSpecificCredentialId" :flattened? nil :xmlAttribute? nil), "UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:create-date (deserdate-type (clojure.core/get-in letvar415237 ["CreateDate" :content])), :service-name (deserservice-name (clojure.core/get-in letvar415237 ["ServiceName" :content])), :service-user-name (deserservice-user-name (clojure.core/get-in letvar415237 ["ServiceUserName" :content])), :service-password (deserservice-password (clojure.core/get-in letvar415237 ["ServicePassword" :content])), :service-specific-credential-id (deserservice-specific-credential-id (clojure.core/get-in letvar415237 ["ServiceSpecificCredentialId" :content])), :user-name (deseruser-name-type (clojure.core/get-in letvar415237 ["UserName" :content])), :status (deserstatus-type (clojure.core/get-in letvar415237 ["Status" :content]))})))

(clojure.core/defn- deserlimit-exceeded-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-specific-result-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-specific-result coll))) input))

(clojure.core/defn- deser-access-key [input] (clojure.core/let [letvar415367 {"UserName" (portkey.aws/search-for-tag input "UserName" :flattened? nil :xmlAttribute? nil), "AccessKeyId" (portkey.aws/search-for-tag input "AccessKeyId" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "SecretAccessKey" (portkey.aws/search-for-tag input "SecretAccessKey" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:user-name (deseruser-name-type (clojure.core/get-in letvar415367 ["UserName" :content])), :access-key-id (deseraccess-key-id-type (clojure.core/get-in letvar415367 ["AccessKeyId" :content])), :status (deserstatus-type (clojure.core/get-in letvar415367 ["Status" :content])), :secret-access-key (deseraccess-key-secret-type (clojure.core/get-in letvar415367 ["SecretAccessKey" :content]))} (letvar415367 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar415367 ["CreateDate" :content]))))))

(clojure.core/defn- deserinvalid-authentication-code-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserrole-name-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-concurrent-modification-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deserpolicy-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy coll))) input))

(clojure.core/defn- deser-report-content-type [input] input)

(clojure.core/defn- deserservice-password [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-group-detail [input] (clojure.core/let [letvar415514 {"Path" (portkey.aws/search-for-tag input "Path" :flattened? nil :xmlAttribute? nil), "GroupName" (portkey.aws/search-for-tag input "GroupName" :flattened? nil :xmlAttribute? nil), "GroupId" (portkey.aws/search-for-tag input "GroupId" :flattened? nil :xmlAttribute? nil), "Arn" (portkey.aws/search-for-tag input "Arn" :flattened? nil :xmlAttribute? nil), "CreateDate" (portkey.aws/search-for-tag input "CreateDate" :flattened? nil :xmlAttribute? nil), "GroupPolicyList" (portkey.aws/search-for-tag input "GroupPolicyList" :flattened? nil :xmlAttribute? nil), "AttachedManagedPolicies" (portkey.aws/search-for-tag input "AttachedManagedPolicies" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar415514 "Path") (clojure.core/assoc :path (deserpath-type (clojure.core/get-in letvar415514 ["Path" :content]))) (letvar415514 "GroupName") (clojure.core/assoc :group-name (desergroup-name-type (clojure.core/get-in letvar415514 ["GroupName" :content]))) (letvar415514 "GroupId") (clojure.core/assoc :group-id (deserid-type (clojure.core/get-in letvar415514 ["GroupId" :content]))) (letvar415514 "Arn") (clojure.core/assoc :arn (deserarn-type (clojure.core/get-in letvar415514 ["Arn" :content]))) (letvar415514 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar415514 ["CreateDate" :content]))) (letvar415514 "GroupPolicyList") (clojure.core/assoc :group-policy-list (deserpolicy-detail-list-type (clojure.core/get-in letvar415514 ["GroupPolicyList" :content]))) (letvar415514 "AttachedManagedPolicies") (clojure.core/assoc :attached-managed-policies (deserattached-policies-list-type (clojure.core/get-in letvar415514 ["AttachedManagedPolicies" :content]))))))

(clojure.core/defn- deserservice-failure-exception-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-list-policy-versions-response ([input] (response-list-policy-versions-response nil input)) ([resultWrapper415521 input] (clojure.core/let [rawinput415520 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415522 {"Versions" (portkey.aws/search-for-tag rawinput415520 "Versions" :flattened? nil :result-wrapper resultWrapper415521), "IsTruncated" (portkey.aws/search-for-tag rawinput415520 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415521), "Marker" (portkey.aws/search-for-tag rawinput415520 "Marker" :flattened? nil :result-wrapper resultWrapper415521)}] (clojure.core/cond-> {} (letvar415522 "Versions") (clojure.core/assoc :versions (deserpolicy-document-version-list-type (clojure.core/get-in letvar415522 ["Versions" :content]))) (letvar415522 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415522 ["IsTruncated" :content]))) (letvar415522 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415522 ["Marker" :content])))))))

(clojure.core/defn- response-get-role-policy-response ([input] (response-get-role-policy-response nil input)) ([resultWrapper415524 input] (clojure.core/let [rawinput415523 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415525 {"RoleName" (portkey.aws/search-for-tag rawinput415523 "RoleName" :flattened? nil :result-wrapper resultWrapper415524), "PolicyName" (portkey.aws/search-for-tag rawinput415523 "PolicyName" :flattened? nil :result-wrapper resultWrapper415524), "PolicyDocument" (portkey.aws/search-for-tag rawinput415523 "PolicyDocument" :flattened? nil :result-wrapper resultWrapper415524)}] (clojure.core/cond-> {:role-name (deserrole-name-type (clojure.core/get-in letvar415525 ["RoleName" :content])), :policy-name (deserpolicy-name-type (clojure.core/get-in letvar415525 ["PolicyName" :content])), :policy-document (deserpolicy-document-type (clojure.core/get-in letvar415525 ["PolicyDocument" :content]))}))))

(clojure.core/defn- response-create-user-response ([input] (response-create-user-response nil input)) ([resultWrapper415527 input] (clojure.core/let [rawinput415526 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415528 {"User" (portkey.aws/search-for-tag rawinput415526 "User" :flattened? nil :result-wrapper resultWrapper415527)}] (clojure.core/cond-> {} (letvar415528 "User") (clojure.core/assoc :user (deser-user (clojure.core/get-in letvar415528 ["User" :content])))))))

(clojure.core/defn- response-list-mfa-devices-response ([input] (response-list-mfa-devices-response nil input)) ([resultWrapper415530 input] (clojure.core/let [rawinput415529 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415531 {"MFADevices" (portkey.aws/search-for-tag rawinput415529 "MFADevices" :flattened? nil :result-wrapper resultWrapper415530), "IsTruncated" (portkey.aws/search-for-tag rawinput415529 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415530), "Marker" (portkey.aws/search-for-tag rawinput415529 "Marker" :flattened? nil :result-wrapper resultWrapper415530)}] (clojure.core/cond-> {:mfa-devices (desermfa-device-list-type (clojure.core/get-in letvar415531 ["MFADevices" :content]))} (letvar415531 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415531 ["IsTruncated" :content]))) (letvar415531 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415531 ["Marker" :content])))))))

(clojure.core/defn- response-get-service-last-accessed-details-with-entities-response ([input] (response-get-service-last-accessed-details-with-entities-response nil input)) ([resultWrapper415533 input] (clojure.core/let [rawinput415532 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415534 {"JobStatus" (portkey.aws/search-for-tag rawinput415532 "JobStatus" :flattened? nil :result-wrapper resultWrapper415533), "JobCreationDate" (portkey.aws/search-for-tag rawinput415532 "JobCreationDate" :flattened? nil :result-wrapper resultWrapper415533), "JobCompletionDate" (portkey.aws/search-for-tag rawinput415532 "JobCompletionDate" :flattened? nil :result-wrapper resultWrapper415533), "EntityDetailsList" (portkey.aws/search-for-tag rawinput415532 "EntityDetailsList" :flattened? nil :result-wrapper resultWrapper415533), "IsTruncated" (portkey.aws/search-for-tag rawinput415532 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415533), "Marker" (portkey.aws/search-for-tag rawinput415532 "Marker" :flattened? nil :result-wrapper resultWrapper415533), "Error" (portkey.aws/search-for-tag rawinput415532 "Error" :flattened? nil :result-wrapper resultWrapper415533)}] (clojure.core/cond-> {:job-status (deserjob-status-type (clojure.core/get-in letvar415534 ["JobStatus" :content])), :job-creation-date (deserdate-type (clojure.core/get-in letvar415534 ["JobCreationDate" :content])), :job-completion-date (deserdate-type (clojure.core/get-in letvar415534 ["JobCompletionDate" :content])), :entity-details-list (deserentity-details-list-type (clojure.core/get-in letvar415534 ["EntityDetailsList" :content]))} (letvar415534 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415534 ["IsTruncated" :content]))) (letvar415534 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415534 ["Marker" :content]))) (letvar415534 "Error") (clojure.core/assoc :error (deser-error-details (clojure.core/get-in letvar415534 ["Error" :content])))))))

(clojure.core/defn- response-get-access-key-last-used-response ([input] (response-get-access-key-last-used-response nil input)) ([resultWrapper415536 input] (clojure.core/let [rawinput415535 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415537 {"UserName" (portkey.aws/search-for-tag rawinput415535 "UserName" :flattened? nil :result-wrapper resultWrapper415536), "AccessKeyLastUsed" (portkey.aws/search-for-tag rawinput415535 "AccessKeyLastUsed" :flattened? nil :result-wrapper resultWrapper415536)}] (clojure.core/cond-> {} (letvar415537 "UserName") (clojure.core/assoc :user-name (deserexisting-user-name-type (clojure.core/get-in letvar415537 ["UserName" :content]))) (letvar415537 "AccessKeyLastUsed") (clojure.core/assoc :access-key-last-used (deser-access-key-last-used (clojure.core/get-in letvar415537 ["AccessKeyLastUsed" :content])))))))

(clojure.core/defn- response-get-login-profile-response ([input] (response-get-login-profile-response nil input)) ([resultWrapper415539 input] (clojure.core/let [rawinput415538 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415540 {"LoginProfile" (portkey.aws/search-for-tag rawinput415538 "LoginProfile" :flattened? nil :result-wrapper resultWrapper415539)}] (clojure.core/cond-> {:login-profile (deser-login-profile (clojure.core/get-in letvar415540 ["LoginProfile" :content]))}))))

(clojure.core/defn- response-get-account-summary-response ([input] (response-get-account-summary-response nil input)) ([resultWrapper415542 input] (clojure.core/let [rawinput415541 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415543 {"SummaryMap" (portkey.aws/search-for-tag rawinput415541 "SummaryMap" :flattened? nil :result-wrapper resultWrapper415542)}] (clojure.core/cond-> {} (letvar415543 "SummaryMap") (clojure.core/assoc :summary-map (desersummary-map-type (clojure.core/get-in letvar415543 ["SummaryMap" :content])))))))

(clojure.core/defn- response-list-server-certificates-response ([input] (response-list-server-certificates-response nil input)) ([resultWrapper415545 input] (clojure.core/let [rawinput415544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415546 {"ServerCertificateMetadataList" (portkey.aws/search-for-tag rawinput415544 "ServerCertificateMetadataList" :flattened? nil :result-wrapper resultWrapper415545), "IsTruncated" (portkey.aws/search-for-tag rawinput415544 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415545), "Marker" (portkey.aws/search-for-tag rawinput415544 "Marker" :flattened? nil :result-wrapper resultWrapper415545)}] (clojure.core/cond-> {:server-certificate-metadata-list (deserserver-certificate-metadata-list-type (clojure.core/get-in letvar415546 ["ServerCertificateMetadataList" :content]))} (letvar415546 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415546 ["IsTruncated" :content]))) (letvar415546 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415546 ["Marker" :content])))))))

(clojure.core/defn- response-policy-not-attachable-exception ([input] (response-policy-not-attachable-exception nil input)) ([resultWrapper415548 input] (clojure.core/let [rawinput415547 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415549 {"message" (portkey.aws/search-for-tag rawinput415547 "message" :flattened? nil :result-wrapper resultWrapper415548)}] (clojure.core/cond-> {} (letvar415549 "message") (clojure.core/assoc :message (deserpolicy-not-attachable-message (clojure.core/get-in letvar415549 ["message" :content])))))))

(clojure.core/defn- response-create-instance-profile-response ([input] (response-create-instance-profile-response nil input)) ([resultWrapper415551 input] (clojure.core/let [rawinput415550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415552 {"InstanceProfile" (portkey.aws/search-for-tag rawinput415550 "InstanceProfile" :flattened? nil :result-wrapper resultWrapper415551)}] (clojure.core/cond-> {:instance-profile (deser-instance-profile (clojure.core/get-in letvar415552 ["InstanceProfile" :content]))}))))

(clojure.core/defn- response-credential-report-not-ready-exception ([input] (response-credential-report-not-ready-exception nil input)) ([resultWrapper415554 input] (clojure.core/let [rawinput415553 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415555 {"message" (portkey.aws/search-for-tag rawinput415553 "message" :flattened? nil :result-wrapper resultWrapper415554)}] (clojure.core/cond-> {} (letvar415555 "message") (clojure.core/assoc :message (desercredential-report-not-ready-exception-message (clojure.core/get-in letvar415555 ["message" :content])))))))

(clojure.core/defn- response-get-ssh-public-key-response ([input] (response-get-ssh-public-key-response nil input)) ([resultWrapper415557 input] (clojure.core/let [rawinput415556 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415558 {"SSHPublicKey" (portkey.aws/search-for-tag rawinput415556 "SSHPublicKey" :flattened? nil :result-wrapper resultWrapper415557)}] (clojure.core/cond-> {} (letvar415558 "SSHPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar415558 ["SSHPublicKey" :content])))))))

(clojure.core/defn- response-update-role-response ([input] (response-update-role-response nil input)) ([resultWrapper415560 input] (clojure.core/let [rawinput415559 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415561 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-service-linked-role-response ([input] (response-create-service-linked-role-response nil input)) ([resultWrapper415563 input] (clojure.core/let [rawinput415562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415564 {"Role" (portkey.aws/search-for-tag rawinput415562 "Role" :flattened? nil :result-wrapper resultWrapper415563)}] (clojure.core/cond-> {} (letvar415564 "Role") (clojure.core/assoc :role (deser-role (clojure.core/get-in letvar415564 ["Role" :content])))))))

(clojure.core/defn- response-invalid-public-key-exception ([input] (response-invalid-public-key-exception nil input)) ([resultWrapper415566 input] (clojure.core/let [rawinput415565 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415567 {"message" (portkey.aws/search-for-tag rawinput415565 "message" :flattened? nil :result-wrapper resultWrapper415566)}] (clojure.core/cond-> {} (letvar415567 "message") (clojure.core/assoc :message (deserinvalid-public-key-message (clojure.core/get-in letvar415567 ["message" :content])))))))

(clojure.core/defn- response-unrecognized-public-key-encoding-exception ([input] (response-unrecognized-public-key-encoding-exception nil input)) ([resultWrapper415569 input] (clojure.core/let [rawinput415568 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415570 {"message" (portkey.aws/search-for-tag rawinput415568 "message" :flattened? nil :result-wrapper resultWrapper415569)}] (clojure.core/cond-> {} (letvar415570 "message") (clojure.core/assoc :message (deserunrecognized-public-key-encoding-message (clojure.core/get-in letvar415570 ["message" :content])))))))

(clojure.core/defn- response-credential-report-expired-exception ([input] (response-credential-report-expired-exception nil input)) ([resultWrapper415572 input] (clojure.core/let [rawinput415571 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415573 {"message" (portkey.aws/search-for-tag rawinput415571 "message" :flattened? nil :result-wrapper resultWrapper415572)}] (clojure.core/cond-> {} (letvar415573 "message") (clojure.core/assoc :message (desercredential-report-expired-exception-message (clojure.core/get-in letvar415573 ["message" :content])))))))

(clojure.core/defn- response-update-saml-provider-response ([input] (response-update-saml-provider-response nil input)) ([resultWrapper415575 input] (clojure.core/let [rawinput415574 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415576 {"SAMLProviderArn" (portkey.aws/search-for-tag rawinput415574 "SAMLProviderArn" :flattened? nil :result-wrapper resultWrapper415575)}] (clojure.core/cond-> {} (letvar415576 "SAMLProviderArn") (clojure.core/assoc :saml-provider-arn (deserarn-type (clojure.core/get-in letvar415576 ["SAMLProviderArn" :content])))))))

(clojure.core/defn- response-create-service-specific-credential-response ([input] (response-create-service-specific-credential-response nil input)) ([resultWrapper415578 input] (clojure.core/let [rawinput415577 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415579 {"ServiceSpecificCredential" (portkey.aws/search-for-tag rawinput415577 "ServiceSpecificCredential" :flattened? nil :result-wrapper resultWrapper415578)}] (clojure.core/cond-> {} (letvar415579 "ServiceSpecificCredential") (clojure.core/assoc :service-specific-credential (deser-service-specific-credential (clojure.core/get-in letvar415579 ["ServiceSpecificCredential" :content])))))))

(clojure.core/defn- response-no-such-entity-exception ([input] (response-no-such-entity-exception nil input)) ([resultWrapper415581 input] (clojure.core/let [rawinput415580 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415582 {"message" (portkey.aws/search-for-tag rawinput415580 "message" :flattened? nil :result-wrapper resultWrapper415581)}] (clojure.core/cond-> {} (letvar415582 "message") (clojure.core/assoc :message (deserno-such-entity-message (clojure.core/get-in letvar415582 ["message" :content])))))))

(clojure.core/defn- response-get-group-policy-response ([input] (response-get-group-policy-response nil input)) ([resultWrapper415584 input] (clojure.core/let [rawinput415583 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415585 {"GroupName" (portkey.aws/search-for-tag rawinput415583 "GroupName" :flattened? nil :result-wrapper resultWrapper415584), "PolicyName" (portkey.aws/search-for-tag rawinput415583 "PolicyName" :flattened? nil :result-wrapper resultWrapper415584), "PolicyDocument" (portkey.aws/search-for-tag rawinput415583 "PolicyDocument" :flattened? nil :result-wrapper resultWrapper415584)}] (clojure.core/cond-> {:group-name (desergroup-name-type (clojure.core/get-in letvar415585 ["GroupName" :content])), :policy-name (deserpolicy-name-type (clojure.core/get-in letvar415585 ["PolicyName" :content])), :policy-document (deserpolicy-document-type (clojure.core/get-in letvar415585 ["PolicyDocument" :content]))}))))

(clojure.core/defn- response-credential-report-not-present-exception ([input] (response-credential-report-not-present-exception nil input)) ([resultWrapper415587 input] (clojure.core/let [rawinput415586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415588 {"message" (portkey.aws/search-for-tag rawinput415586 "message" :flattened? nil :result-wrapper resultWrapper415587)}] (clojure.core/cond-> {} (letvar415588 "message") (clojure.core/assoc :message (desercredential-report-not-present-exception-message (clojure.core/get-in letvar415588 ["message" :content])))))))

(clojure.core/defn- response-generate-credential-report-response ([input] (response-generate-credential-report-response nil input)) ([resultWrapper415590 input] (clojure.core/let [rawinput415589 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415591 {"State" (portkey.aws/search-for-tag rawinput415589 "State" :flattened? nil :result-wrapper resultWrapper415590), "Description" (portkey.aws/search-for-tag rawinput415589 "Description" :flattened? nil :result-wrapper resultWrapper415590)}] (clojure.core/cond-> {} (letvar415591 "State") (clojure.core/assoc :state (deser-report-state-type (clojure.core/get-in letvar415591 ["State" :content]))) (letvar415591 "Description") (clojure.core/assoc :description (deser-report-state-description-type (clojure.core/get-in letvar415591 ["Description" :content])))))))

(clojure.core/defn- response-invalid-certificate-exception ([input] (response-invalid-certificate-exception nil input)) ([resultWrapper415593 input] (clojure.core/let [rawinput415592 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415594 {"message" (portkey.aws/search-for-tag rawinput415592 "message" :flattened? nil :result-wrapper resultWrapper415593)}] (clojure.core/cond-> {} (letvar415594 "message") (clojure.core/assoc :message (deserinvalid-certificate-message (clojure.core/get-in letvar415594 ["message" :content])))))))

(clojure.core/defn- response-create-saml-provider-response ([input] (response-create-saml-provider-response nil input)) ([resultWrapper415596 input] (clojure.core/let [rawinput415595 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415597 {"SAMLProviderArn" (portkey.aws/search-for-tag rawinput415595 "SAMLProviderArn" :flattened? nil :result-wrapper resultWrapper415596)}] (clojure.core/cond-> {} (letvar415597 "SAMLProviderArn") (clojure.core/assoc :saml-provider-arn (deserarn-type (clojure.core/get-in letvar415597 ["SAMLProviderArn" :content])))))))

(clojure.core/defn- response-get-context-keys-for-policy-response ([input] (response-get-context-keys-for-policy-response nil input)) ([resultWrapper415599 input] (clojure.core/let [rawinput415598 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415600 {"ContextKeyNames" (portkey.aws/search-for-tag rawinput415598 "ContextKeyNames" :flattened? nil :result-wrapper resultWrapper415599)}] (clojure.core/cond-> {} (letvar415600 "ContextKeyNames") (clojure.core/assoc :context-key-names (deser-context-key-names-result-list-type (clojure.core/get-in letvar415600 ["ContextKeyNames" :content])))))))

(clojure.core/defn- response-list-instance-profiles-for-role-response ([input] (response-list-instance-profiles-for-role-response nil input)) ([resultWrapper415602 input] (clojure.core/let [rawinput415601 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415603 {"InstanceProfiles" (portkey.aws/search-for-tag rawinput415601 "InstanceProfiles" :flattened? nil :result-wrapper resultWrapper415602), "IsTruncated" (portkey.aws/search-for-tag rawinput415601 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415602), "Marker" (portkey.aws/search-for-tag rawinput415601 "Marker" :flattened? nil :result-wrapper resultWrapper415602)}] (clojure.core/cond-> {:instance-profiles (deserinstance-profile-list-type (clojure.core/get-in letvar415603 ["InstanceProfiles" :content]))} (letvar415603 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415603 ["IsTruncated" :content]))) (letvar415603 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415603 ["Marker" :content])))))))

(clojure.core/defn- response-malformed-certificate-exception ([input] (response-malformed-certificate-exception nil input)) ([resultWrapper415605 input] (clojure.core/let [rawinput415604 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415606 {"message" (portkey.aws/search-for-tag rawinput415604 "message" :flattened? nil :result-wrapper resultWrapper415605)}] (clojure.core/cond-> {} (letvar415606 "message") (clojure.core/assoc :message (desermalformed-certificate-message (clojure.core/get-in letvar415606 ["message" :content])))))))

(clojure.core/defn- response-list-attached-role-policies-response ([input] (response-list-attached-role-policies-response nil input)) ([resultWrapper415608 input] (clojure.core/let [rawinput415607 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415609 {"AttachedPolicies" (portkey.aws/search-for-tag rawinput415607 "AttachedPolicies" :flattened? nil :result-wrapper resultWrapper415608), "IsTruncated" (portkey.aws/search-for-tag rawinput415607 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415608), "Marker" (portkey.aws/search-for-tag rawinput415607 "Marker" :flattened? nil :result-wrapper resultWrapper415608)}] (clojure.core/cond-> {} (letvar415609 "AttachedPolicies") (clojure.core/assoc :attached-policies (deserattached-policies-list-type (clojure.core/get-in letvar415609 ["AttachedPolicies" :content]))) (letvar415609 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415609 ["IsTruncated" :content]))) (letvar415609 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415609 ["Marker" :content])))))))

(clojure.core/defn- response-delete-conflict-exception ([input] (response-delete-conflict-exception nil input)) ([resultWrapper415611 input] (clojure.core/let [rawinput415610 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415612 {"message" (portkey.aws/search-for-tag rawinput415610 "message" :flattened? nil :result-wrapper resultWrapper415611)}] (clojure.core/cond-> {} (letvar415612 "message") (clojure.core/assoc :message (deserdelete-conflict-message (clojure.core/get-in letvar415612 ["message" :content])))))))

(clojure.core/defn- response-service-failure-exception ([input] (response-service-failure-exception nil input)) ([resultWrapper415614 input] (clojure.core/let [rawinput415613 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415615 {"message" (portkey.aws/search-for-tag rawinput415613 "message" :flattened? nil :result-wrapper resultWrapper415614)}] (clojure.core/cond-> {} (letvar415615 "message") (clojure.core/assoc :message (deserservice-failure-exception-message (clojure.core/get-in letvar415615 ["message" :content])))))))

(clojure.core/defn- response-create-role-response ([input] (response-create-role-response nil input)) ([resultWrapper415617 input] (clojure.core/let [rawinput415616 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415618 {"Role" (portkey.aws/search-for-tag rawinput415616 "Role" :flattened? nil :result-wrapper resultWrapper415617)}] (clojure.core/cond-> {:role (deser-role (clojure.core/get-in letvar415618 ["Role" :content]))}))))

(clojure.core/defn- response-get-group-response ([input] (response-get-group-response nil input)) ([resultWrapper415620 input] (clojure.core/let [rawinput415619 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415621 {"Group" (portkey.aws/search-for-tag rawinput415619 "Group" :flattened? nil :result-wrapper resultWrapper415620), "Users" (portkey.aws/search-for-tag rawinput415619 "Users" :flattened? nil :result-wrapper resultWrapper415620), "IsTruncated" (portkey.aws/search-for-tag rawinput415619 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415620), "Marker" (portkey.aws/search-for-tag rawinput415619 "Marker" :flattened? nil :result-wrapper resultWrapper415620)}] (clojure.core/cond-> {:group (deser-group (clojure.core/get-in letvar415621 ["Group" :content])), :users (deseruser-list-type (clojure.core/get-in letvar415621 ["Users" :content]))} (letvar415621 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415621 ["IsTruncated" :content]))) (letvar415621 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415621 ["Marker" :content])))))))

(clojure.core/defn- response-invalid-user-type-exception ([input] (response-invalid-user-type-exception nil input)) ([resultWrapper415623 input] (clojure.core/let [rawinput415622 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415624 {"message" (portkey.aws/search-for-tag rawinput415622 "message" :flattened? nil :result-wrapper resultWrapper415623)}] (clojure.core/cond-> {} (letvar415624 "message") (clojure.core/assoc :message (deserinvalid-user-type-message (clojure.core/get-in letvar415624 ["message" :content])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper415626 input] (clojure.core/let [rawinput415625 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415627 {"message" (portkey.aws/search-for-tag rawinput415625 "message" :flattened? nil :result-wrapper resultWrapper415626)}] (clojure.core/cond-> {} (letvar415627 "message") (clojure.core/assoc :message (deserlimit-exceeded-message (clojure.core/get-in letvar415627 ["message" :content])))))))

(clojure.core/defn- response-list-roles-response ([input] (response-list-roles-response nil input)) ([resultWrapper415629 input] (clojure.core/let [rawinput415628 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415630 {"Roles" (portkey.aws/search-for-tag rawinput415628 "Roles" :flattened? nil :result-wrapper resultWrapper415629), "IsTruncated" (portkey.aws/search-for-tag rawinput415628 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415629), "Marker" (portkey.aws/search-for-tag rawinput415628 "Marker" :flattened? nil :result-wrapper resultWrapper415629)}] (clojure.core/cond-> {:roles (deserrole-list-type (clojure.core/get-in letvar415630 ["Roles" :content]))} (letvar415630 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415630 ["IsTruncated" :content]))) (letvar415630 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415630 ["Marker" :content])))))))

(clojure.core/defn- response-create-open-id-connect-provider-response ([input] (response-create-open-id-connect-provider-response nil input)) ([resultWrapper415632 input] (clojure.core/let [rawinput415631 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415633 {"OpenIDConnectProviderArn" (portkey.aws/search-for-tag rawinput415631 "OpenIDConnectProviderArn" :flattened? nil :result-wrapper resultWrapper415632)}] (clojure.core/cond-> {} (letvar415633 "OpenIDConnectProviderArn") (clojure.core/assoc :open-id-connect-provider-arn (deserarn-type (clojure.core/get-in letvar415633 ["OpenIDConnectProviderArn" :content])))))))

(clojure.core/defn- response-list-groups-response ([input] (response-list-groups-response nil input)) ([resultWrapper415635 input] (clojure.core/let [rawinput415634 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415636 {"Groups" (portkey.aws/search-for-tag rawinput415634 "Groups" :flattened? nil :result-wrapper resultWrapper415635), "IsTruncated" (portkey.aws/search-for-tag rawinput415634 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415635), "Marker" (portkey.aws/search-for-tag rawinput415634 "Marker" :flattened? nil :result-wrapper resultWrapper415635)}] (clojure.core/cond-> {:groups (desergroup-list-type (clojure.core/get-in letvar415636 ["Groups" :content]))} (letvar415636 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415636 ["IsTruncated" :content]))) (letvar415636 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415636 ["Marker" :content])))))))

(clojure.core/defn- response-policy-evaluation-exception ([input] (response-policy-evaluation-exception nil input)) ([resultWrapper415638 input] (clojure.core/let [rawinput415637 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415639 {"message" (portkey.aws/search-for-tag rawinput415637 "message" :flattened? nil :result-wrapper resultWrapper415638)}] (clojure.core/cond-> {} (letvar415639 "message") (clojure.core/assoc :message (deserpolicy-evaluation-error-message (clojure.core/get-in letvar415639 ["message" :content])))))))

(clojure.core/defn- response-duplicate-certificate-exception ([input] (response-duplicate-certificate-exception nil input)) ([resultWrapper415641 input] (clojure.core/let [rawinput415640 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415642 {"message" (portkey.aws/search-for-tag rawinput415640 "message" :flattened? nil :result-wrapper resultWrapper415641)}] (clojure.core/cond-> {} (letvar415642 "message") (clojure.core/assoc :message (deserduplicate-certificate-message (clojure.core/get-in letvar415642 ["message" :content])))))))

(clojure.core/defn- response-list-role-tags-response ([input] (response-list-role-tags-response nil input)) ([resultWrapper415644 input] (clojure.core/let [rawinput415643 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415645 {"Tags" (portkey.aws/search-for-tag rawinput415643 "Tags" :flattened? nil :result-wrapper resultWrapper415644), "IsTruncated" (portkey.aws/search-for-tag rawinput415643 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415644), "Marker" (portkey.aws/search-for-tag rawinput415643 "Marker" :flattened? nil :result-wrapper resultWrapper415644)}] (clojure.core/cond-> {:tags (desertag-list-type (clojure.core/get-in letvar415645 ["Tags" :content]))} (letvar415645 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415645 ["IsTruncated" :content]))) (letvar415645 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415645 ["Marker" :content])))))))

(clojure.core/defn- response-entity-already-exists-exception ([input] (response-entity-already-exists-exception nil input)) ([resultWrapper415647 input] (clojure.core/let [rawinput415646 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415648 {"message" (portkey.aws/search-for-tag rawinput415646 "message" :flattened? nil :result-wrapper resultWrapper415647)}] (clojure.core/cond-> {} (letvar415648 "message") (clojure.core/assoc :message (deserentity-already-exists-message (clojure.core/get-in letvar415648 ["message" :content])))))))

(clojure.core/defn- response-get-role-response ([input] (response-get-role-response nil input)) ([resultWrapper415650 input] (clojure.core/let [rawinput415649 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415651 {"Role" (portkey.aws/search-for-tag rawinput415649 "Role" :flattened? nil :result-wrapper resultWrapper415650)}] (clojure.core/cond-> {:role (deser-role (clojure.core/get-in letvar415651 ["Role" :content]))}))))

(clojure.core/defn- response-get-instance-profile-response ([input] (response-get-instance-profile-response nil input)) ([resultWrapper415653 input] (clojure.core/let [rawinput415652 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415654 {"InstanceProfile" (portkey.aws/search-for-tag rawinput415652 "InstanceProfile" :flattened? nil :result-wrapper resultWrapper415653)}] (clojure.core/cond-> {:instance-profile (deser-instance-profile (clojure.core/get-in letvar415654 ["InstanceProfile" :content]))}))))

(clojure.core/defn- response-get-credential-report-response ([input] (response-get-credential-report-response nil input)) ([resultWrapper415656 input] (clojure.core/let [rawinput415655 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415657 {"Content" (portkey.aws/search-for-tag rawinput415655 "Content" :flattened? nil :result-wrapper resultWrapper415656), "ReportFormat" (portkey.aws/search-for-tag rawinput415655 "ReportFormat" :flattened? nil :result-wrapper resultWrapper415656), "GeneratedTime" (portkey.aws/search-for-tag rawinput415655 "GeneratedTime" :flattened? nil :result-wrapper resultWrapper415656)}] (clojure.core/cond-> {} (letvar415657 "Content") (clojure.core/assoc :content (deser-report-content-type (clojure.core/get-in letvar415657 ["Content" :content]))) (letvar415657 "ReportFormat") (clojure.core/assoc :report-format (deser-report-format-type (clojure.core/get-in letvar415657 ["ReportFormat" :content]))) (letvar415657 "GeneratedTime") (clojure.core/assoc :generated-time (deserdate-type (clojure.core/get-in letvar415657 ["GeneratedTime" :content])))))))

(clojure.core/defn- response-get-service-linked-role-deletion-status-response ([input] (response-get-service-linked-role-deletion-status-response nil input)) ([resultWrapper415659 input] (clojure.core/let [rawinput415658 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415660 {"Status" (portkey.aws/search-for-tag rawinput415658 "Status" :flattened? nil :result-wrapper resultWrapper415659), "Reason" (portkey.aws/search-for-tag rawinput415658 "Reason" :flattened? nil :result-wrapper resultWrapper415659)}] (clojure.core/cond-> {:status (deser-deletion-task-status-type (clojure.core/get-in letvar415660 ["Status" :content]))} (letvar415660 "Reason") (clojure.core/assoc :reason (deser-deletion-task-failure-reason-type (clojure.core/get-in letvar415660 ["Reason" :content])))))))

(clojure.core/defn- response-list-access-keys-response ([input] (response-list-access-keys-response nil input)) ([resultWrapper415662 input] (clojure.core/let [rawinput415661 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415663 {"AccessKeyMetadata" (portkey.aws/search-for-tag rawinput415661 "AccessKeyMetadata" :flattened? nil :result-wrapper resultWrapper415662), "IsTruncated" (portkey.aws/search-for-tag rawinput415661 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415662), "Marker" (portkey.aws/search-for-tag rawinput415661 "Marker" :flattened? nil :result-wrapper resultWrapper415662)}] (clojure.core/cond-> {:access-key-metadata (deseraccess-key-metadata-list-type (clojure.core/get-in letvar415663 ["AccessKeyMetadata" :content]))} (letvar415663 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415663 ["IsTruncated" :content]))) (letvar415663 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415663 ["Marker" :content])))))))

(clojure.core/defn- response-get-policy-version-response ([input] (response-get-policy-version-response nil input)) ([resultWrapper415665 input] (clojure.core/let [rawinput415664 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415666 {"PolicyVersion" (portkey.aws/search-for-tag rawinput415664 "PolicyVersion" :flattened? nil :result-wrapper resultWrapper415665)}] (clojure.core/cond-> {} (letvar415666 "PolicyVersion") (clojure.core/assoc :policy-version (deser-policy-version (clojure.core/get-in letvar415666 ["PolicyVersion" :content])))))))

(clojure.core/defn- response-simulate-policy-response ([input] (response-simulate-policy-response nil input)) ([resultWrapper415668 input] (clojure.core/let [rawinput415667 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415669 {"EvaluationResults" (portkey.aws/search-for-tag rawinput415667 "EvaluationResults" :flattened? nil :result-wrapper resultWrapper415668), "IsTruncated" (portkey.aws/search-for-tag rawinput415667 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415668), "Marker" (portkey.aws/search-for-tag rawinput415667 "Marker" :flattened? nil :result-wrapper resultWrapper415668)}] (clojure.core/cond-> {} (letvar415669 "EvaluationResults") (clojure.core/assoc :evaluation-results (deser-evaluation-results-list-type (clojure.core/get-in letvar415669 ["EvaluationResults" :content]))) (letvar415669 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415669 ["IsTruncated" :content]))) (letvar415669 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415669 ["Marker" :content])))))))

(clojure.core/defn- response-list-groups-for-user-response ([input] (response-list-groups-for-user-response nil input)) ([resultWrapper415671 input] (clojure.core/let [rawinput415670 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415672 {"Groups" (portkey.aws/search-for-tag rawinput415670 "Groups" :flattened? nil :result-wrapper resultWrapper415671), "IsTruncated" (portkey.aws/search-for-tag rawinput415670 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415671), "Marker" (portkey.aws/search-for-tag rawinput415670 "Marker" :flattened? nil :result-wrapper resultWrapper415671)}] (clojure.core/cond-> {:groups (desergroup-list-type (clojure.core/get-in letvar415672 ["Groups" :content]))} (letvar415672 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415672 ["IsTruncated" :content]))) (letvar415672 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415672 ["Marker" :content])))))))

(clojure.core/defn- response-list-signing-certificates-response ([input] (response-list-signing-certificates-response nil input)) ([resultWrapper415674 input] (clojure.core/let [rawinput415673 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415675 {"Certificates" (portkey.aws/search-for-tag rawinput415673 "Certificates" :flattened? nil :result-wrapper resultWrapper415674), "IsTruncated" (portkey.aws/search-for-tag rawinput415673 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415674), "Marker" (portkey.aws/search-for-tag rawinput415673 "Marker" :flattened? nil :result-wrapper resultWrapper415674)}] (clojure.core/cond-> {:certificates (desercertificate-list-type (clojure.core/get-in letvar415675 ["Certificates" :content]))} (letvar415675 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415675 ["IsTruncated" :content]))) (letvar415675 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415675 ["Marker" :content])))))))

(clojure.core/defn- response-duplicate-ssh-public-key-exception ([input] (response-duplicate-ssh-public-key-exception nil input)) ([resultWrapper415677 input] (clojure.core/let [rawinput415676 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415678 {"message" (portkey.aws/search-for-tag rawinput415676 "message" :flattened? nil :result-wrapper resultWrapper415677)}] (clojure.core/cond-> {} (letvar415678 "message") (clojure.core/assoc :message (deserduplicate-ssh-public-key-message (clojure.core/get-in letvar415678 ["message" :content])))))))

(clojure.core/defn- response-entity-temporarily-unmodifiable-exception ([input] (response-entity-temporarily-unmodifiable-exception nil input)) ([resultWrapper415680 input] (clojure.core/let [rawinput415679 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415681 {"message" (portkey.aws/search-for-tag rawinput415679 "message" :flattened? nil :result-wrapper resultWrapper415680)}] (clojure.core/cond-> {} (letvar415681 "message") (clojure.core/assoc :message (deserentity-temporarily-unmodifiable-message (clojure.core/get-in letvar415681 ["message" :content])))))))

(clojure.core/defn- response-unmodifiable-entity-exception ([input] (response-unmodifiable-entity-exception nil input)) ([resultWrapper415683 input] (clojure.core/let [rawinput415682 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415684 {"message" (portkey.aws/search-for-tag rawinput415682 "message" :flattened? nil :result-wrapper resultWrapper415683)}] (clojure.core/cond-> {} (letvar415684 "message") (clojure.core/assoc :message (deserunmodifiable-entity-message (clojure.core/get-in letvar415684 ["message" :content])))))))

(clojure.core/defn- response-generate-service-last-accessed-details-response ([input] (response-generate-service-last-accessed-details-response nil input)) ([resultWrapper415686 input] (clojure.core/let [rawinput415685 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415687 {"JobId" (portkey.aws/search-for-tag rawinput415685 "JobId" :flattened? nil :result-wrapper resultWrapper415686)}] (clojure.core/cond-> {} (letvar415687 "JobId") (clojure.core/assoc :job-id (deserjob-id-type (clojure.core/get-in letvar415687 ["JobId" :content])))))))

(clojure.core/defn- response-list-user-policies-response ([input] (response-list-user-policies-response nil input)) ([resultWrapper415689 input] (clojure.core/let [rawinput415688 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415690 {"PolicyNames" (portkey.aws/search-for-tag rawinput415688 "PolicyNames" :flattened? nil :result-wrapper resultWrapper415689), "IsTruncated" (portkey.aws/search-for-tag rawinput415688 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415689), "Marker" (portkey.aws/search-for-tag rawinput415688 "Marker" :flattened? nil :result-wrapper resultWrapper415689)}] (clojure.core/cond-> {:policy-names (deserpolicy-name-list-type (clojure.core/get-in letvar415690 ["PolicyNames" :content]))} (letvar415690 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415690 ["IsTruncated" :content]))) (letvar415690 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415690 ["Marker" :content])))))))

(clojure.core/defn- response-get-open-id-connect-provider-response ([input] (response-get-open-id-connect-provider-response nil input)) ([resultWrapper415692 input] (clojure.core/let [rawinput415691 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415693 {"Url" (portkey.aws/search-for-tag rawinput415691 "Url" :flattened? nil :result-wrapper resultWrapper415692), "ClientIDList" (portkey.aws/search-for-tag rawinput415691 "ClientIDList" :flattened? nil :result-wrapper resultWrapper415692), "ThumbprintList" (portkey.aws/search-for-tag rawinput415691 "ThumbprintList" :flattened? nil :result-wrapper resultWrapper415692), "CreateDate" (portkey.aws/search-for-tag rawinput415691 "CreateDate" :flattened? nil :result-wrapper resultWrapper415692)}] (clojure.core/cond-> {} (letvar415693 "Url") (clojure.core/assoc :url (deser-open-id-connect-provider-url-type (clojure.core/get-in letvar415693 ["Url" :content]))) (letvar415693 "ClientIDList") (clojure.core/assoc :client-id-list (deserclient-id-list-type (clojure.core/get-in letvar415693 ["ClientIDList" :content]))) (letvar415693 "ThumbprintList") (clojure.core/assoc :thumbprint-list (deserthumbprint-list-type (clojure.core/get-in letvar415693 ["ThumbprintList" :content]))) (letvar415693 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar415693 ["CreateDate" :content])))))))

(clojure.core/defn- response-key-pair-mismatch-exception ([input] (response-key-pair-mismatch-exception nil input)) ([resultWrapper415695 input] (clojure.core/let [rawinput415694 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415696 {"message" (portkey.aws/search-for-tag rawinput415694 "message" :flattened? nil :result-wrapper resultWrapper415695)}] (clojure.core/cond-> {} (letvar415696 "message") (clojure.core/assoc :message (deserkey-pair-mismatch-message (clojure.core/get-in letvar415696 ["message" :content])))))))

(clojure.core/defn- response-list-group-policies-response ([input] (response-list-group-policies-response nil input)) ([resultWrapper415698 input] (clojure.core/let [rawinput415697 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415699 {"PolicyNames" (portkey.aws/search-for-tag rawinput415697 "PolicyNames" :flattened? nil :result-wrapper resultWrapper415698), "IsTruncated" (portkey.aws/search-for-tag rawinput415697 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415698), "Marker" (portkey.aws/search-for-tag rawinput415697 "Marker" :flattened? nil :result-wrapper resultWrapper415698)}] (clojure.core/cond-> {:policy-names (deserpolicy-name-list-type (clojure.core/get-in letvar415699 ["PolicyNames" :content]))} (letvar415699 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415699 ["IsTruncated" :content]))) (letvar415699 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415699 ["Marker" :content])))))))

(clojure.core/defn- response-get-server-certificate-response ([input] (response-get-server-certificate-response nil input)) ([resultWrapper415701 input] (clojure.core/let [rawinput415700 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415702 {"ServerCertificate" (portkey.aws/search-for-tag rawinput415700 "ServerCertificate" :flattened? nil :result-wrapper resultWrapper415701)}] (clojure.core/cond-> {:server-certificate (deser-server-certificate (clojure.core/get-in letvar415702 ["ServerCertificate" :content]))}))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper415704 input] (clojure.core/let [rawinput415703 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415705 {"message" (portkey.aws/search-for-tag rawinput415703 "message" :flattened? nil :result-wrapper resultWrapper415704)}] (clojure.core/cond-> {} (letvar415705 "message") (clojure.core/assoc :message (desermalformed-policy-document-message (clojure.core/get-in letvar415705 ["message" :content])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper415707 input] (clojure.core/let [rawinput415706 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415708 {"message" (portkey.aws/search-for-tag rawinput415706 "message" :flattened? nil :result-wrapper resultWrapper415707)}] (clojure.core/cond-> {} (letvar415708 "message") (clojure.core/assoc :message (deserinvalid-input-message (clojure.core/get-in letvar415708 ["message" :content])))))))

(clojure.core/defn- response-get-policy-response ([input] (response-get-policy-response nil input)) ([resultWrapper415710 input] (clojure.core/let [rawinput415709 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415711 {"Policy" (portkey.aws/search-for-tag rawinput415709 "Policy" :flattened? nil :result-wrapper resultWrapper415710)}] (clojure.core/cond-> {} (letvar415711 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar415711 ["Policy" :content])))))))

(clojure.core/defn- response-create-policy-response ([input] (response-create-policy-response nil input)) ([resultWrapper415713 input] (clojure.core/let [rawinput415712 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415714 {"Policy" (portkey.aws/search-for-tag rawinput415712 "Policy" :flattened? nil :result-wrapper resultWrapper415713)}] (clojure.core/cond-> {} (letvar415714 "Policy") (clojure.core/assoc :policy (deser-policy (clojure.core/get-in letvar415714 ["Policy" :content])))))))

(clojure.core/defn- response-list-attached-group-policies-response ([input] (response-list-attached-group-policies-response nil input)) ([resultWrapper415716 input] (clojure.core/let [rawinput415715 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415717 {"AttachedPolicies" (portkey.aws/search-for-tag rawinput415715 "AttachedPolicies" :flattened? nil :result-wrapper resultWrapper415716), "IsTruncated" (portkey.aws/search-for-tag rawinput415715 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415716), "Marker" (portkey.aws/search-for-tag rawinput415715 "Marker" :flattened? nil :result-wrapper resultWrapper415716)}] (clojure.core/cond-> {} (letvar415717 "AttachedPolicies") (clojure.core/assoc :attached-policies (deserattached-policies-list-type (clojure.core/get-in letvar415717 ["AttachedPolicies" :content]))) (letvar415717 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415717 ["IsTruncated" :content]))) (letvar415717 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415717 ["Marker" :content])))))))

(clojure.core/defn- response-list-ssh-public-keys-response ([input] (response-list-ssh-public-keys-response nil input)) ([resultWrapper415719 input] (clojure.core/let [rawinput415718 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415720 {"SSHPublicKeys" (portkey.aws/search-for-tag rawinput415718 "SSHPublicKeys" :flattened? nil :result-wrapper resultWrapper415719), "IsTruncated" (portkey.aws/search-for-tag rawinput415718 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415719), "Marker" (portkey.aws/search-for-tag rawinput415718 "Marker" :flattened? nil :result-wrapper resultWrapper415719)}] (clojure.core/cond-> {} (letvar415720 "SSHPublicKeys") (clojure.core/assoc :ssh-public-keys (deser-ssh-public-key-list-type (clojure.core/get-in letvar415720 ["SSHPublicKeys" :content]))) (letvar415720 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415720 ["IsTruncated" :content]))) (letvar415720 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415720 ["Marker" :content])))))))

(clojure.core/defn- response-upload-ssh-public-key-response ([input] (response-upload-ssh-public-key-response nil input)) ([resultWrapper415722 input] (clojure.core/let [rawinput415721 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415723 {"SSHPublicKey" (portkey.aws/search-for-tag rawinput415721 "SSHPublicKey" :flattened? nil :result-wrapper resultWrapper415722)}] (clojure.core/cond-> {} (letvar415723 "SSHPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-public-key (clojure.core/get-in letvar415723 ["SSHPublicKey" :content])))))))

(clojure.core/defn- response-list-user-tags-response ([input] (response-list-user-tags-response nil input)) ([resultWrapper415725 input] (clojure.core/let [rawinput415724 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415726 {"Tags" (portkey.aws/search-for-tag rawinput415724 "Tags" :flattened? nil :result-wrapper resultWrapper415725), "IsTruncated" (portkey.aws/search-for-tag rawinput415724 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415725), "Marker" (portkey.aws/search-for-tag rawinput415724 "Marker" :flattened? nil :result-wrapper resultWrapper415725)}] (clojure.core/cond-> {:tags (desertag-list-type (clojure.core/get-in letvar415726 ["Tags" :content]))} (letvar415726 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415726 ["IsTruncated" :content]))) (letvar415726 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415726 ["Marker" :content])))))))

(clojure.core/defn- response-service-not-supported-exception ([input] (response-service-not-supported-exception nil input)) ([resultWrapper415728 input] (clojure.core/let [rawinput415727 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415729 {"message" (portkey.aws/search-for-tag rawinput415727 "message" :flattened? nil :result-wrapper resultWrapper415728)}] (clojure.core/cond-> {} (letvar415729 "message") (clojure.core/assoc :message (deserservice-not-supported-message (clojure.core/get-in letvar415729 ["message" :content])))))))

(clojure.core/defn- response-upload-server-certificate-response ([input] (response-upload-server-certificate-response nil input)) ([resultWrapper415731 input] (clojure.core/let [rawinput415730 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415732 {"ServerCertificateMetadata" (portkey.aws/search-for-tag rawinput415730 "ServerCertificateMetadata" :flattened? nil :result-wrapper resultWrapper415731)}] (clojure.core/cond-> {} (letvar415732 "ServerCertificateMetadata") (clojure.core/assoc :server-certificate-metadata (deser-server-certificate-metadata (clojure.core/get-in letvar415732 ["ServerCertificateMetadata" :content])))))))

(clojure.core/defn- response-get-service-last-accessed-details-response ([input] (response-get-service-last-accessed-details-response nil input)) ([resultWrapper415734 input] (clojure.core/let [rawinput415733 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415735 {"JobStatus" (portkey.aws/search-for-tag rawinput415733 "JobStatus" :flattened? nil :result-wrapper resultWrapper415734), "JobCreationDate" (portkey.aws/search-for-tag rawinput415733 "JobCreationDate" :flattened? nil :result-wrapper resultWrapper415734), "ServicesLastAccessed" (portkey.aws/search-for-tag rawinput415733 "ServicesLastAccessed" :flattened? nil :result-wrapper resultWrapper415734), "JobCompletionDate" (portkey.aws/search-for-tag rawinput415733 "JobCompletionDate" :flattened? nil :result-wrapper resultWrapper415734), "IsTruncated" (portkey.aws/search-for-tag rawinput415733 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415734), "Marker" (portkey.aws/search-for-tag rawinput415733 "Marker" :flattened? nil :result-wrapper resultWrapper415734), "Error" (portkey.aws/search-for-tag rawinput415733 "Error" :flattened? nil :result-wrapper resultWrapper415734)}] (clojure.core/cond-> {:job-status (deserjob-status-type (clojure.core/get-in letvar415735 ["JobStatus" :content])), :job-creation-date (deserdate-type (clojure.core/get-in letvar415735 ["JobCreationDate" :content])), :services-last-accessed (deser-services-last-accessed (clojure.core/get-in letvar415735 ["ServicesLastAccessed" :content])), :job-completion-date (deserdate-type (clojure.core/get-in letvar415735 ["JobCompletionDate" :content]))} (letvar415735 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415735 ["IsTruncated" :content]))) (letvar415735 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415735 ["Marker" :content]))) (letvar415735 "Error") (clojure.core/assoc :error (deser-error-details (clojure.core/get-in letvar415735 ["Error" :content])))))))

(clojure.core/defn- response-list-open-id-connect-providers-response ([input] (response-list-open-id-connect-providers-response nil input)) ([resultWrapper415737 input] (clojure.core/let [rawinput415736 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415738 {"OpenIDConnectProviderList" (portkey.aws/search-for-tag rawinput415736 "OpenIDConnectProviderList" :flattened? nil :result-wrapper resultWrapper415737)}] (clojure.core/cond-> {} (letvar415738 "OpenIDConnectProviderList") (clojure.core/assoc :open-id-connect-provider-list (deser-open-id-connect-provider-list-type (clojure.core/get-in letvar415738 ["OpenIDConnectProviderList" :content])))))))

(clojure.core/defn- response-update-role-description-response ([input] (response-update-role-description-response nil input)) ([resultWrapper415740 input] (clojure.core/let [rawinput415739 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415741 {"Role" (portkey.aws/search-for-tag rawinput415739 "Role" :flattened? nil :result-wrapper resultWrapper415740)}] (clojure.core/cond-> {} (letvar415741 "Role") (clojure.core/assoc :role (deser-role (clojure.core/get-in letvar415741 ["Role" :content])))))))

(clojure.core/defn- response-list-account-aliases-response ([input] (response-list-account-aliases-response nil input)) ([resultWrapper415743 input] (clojure.core/let [rawinput415742 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415744 {"AccountAliases" (portkey.aws/search-for-tag rawinput415742 "AccountAliases" :flattened? nil :result-wrapper resultWrapper415743), "IsTruncated" (portkey.aws/search-for-tag rawinput415742 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415743), "Marker" (portkey.aws/search-for-tag rawinput415742 "Marker" :flattened? nil :result-wrapper resultWrapper415743)}] (clojure.core/cond-> {:account-aliases (deseraccount-alias-list-type (clojure.core/get-in letvar415744 ["AccountAliases" :content]))} (letvar415744 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415744 ["IsTruncated" :content]))) (letvar415744 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415744 ["Marker" :content])))))))

(clojure.core/defn- response-list-saml-providers-response ([input] (response-list-saml-providers-response nil input)) ([resultWrapper415746 input] (clojure.core/let [rawinput415745 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415747 {"SAMLProviderList" (portkey.aws/search-for-tag rawinput415745 "SAMLProviderList" :flattened? nil :result-wrapper resultWrapper415746)}] (clojure.core/cond-> {} (letvar415747 "SAMLProviderList") (clojure.core/assoc :saml-provider-list (deser-saml-provider-list-type (clojure.core/get-in letvar415747 ["SAMLProviderList" :content])))))))

(clojure.core/defn- response-get-account-password-policy-response ([input] (response-get-account-password-policy-response nil input)) ([resultWrapper415749 input] (clojure.core/let [rawinput415748 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415750 {"PasswordPolicy" (portkey.aws/search-for-tag rawinput415748 "PasswordPolicy" :flattened? nil :result-wrapper resultWrapper415749)}] (clojure.core/cond-> {:password-policy (deser-password-policy (clojure.core/get-in letvar415750 ["PasswordPolicy" :content]))}))))

(clojure.core/defn- response-create-group-response ([input] (response-create-group-response nil input)) ([resultWrapper415752 input] (clojure.core/let [rawinput415751 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415753 {"Group" (portkey.aws/search-for-tag rawinput415751 "Group" :flattened? nil :result-wrapper resultWrapper415752)}] (clojure.core/cond-> {:group (deser-group (clojure.core/get-in letvar415753 ["Group" :content]))}))))

(clojure.core/defn- response-upload-signing-certificate-response ([input] (response-upload-signing-certificate-response nil input)) ([resultWrapper415755 input] (clojure.core/let [rawinput415754 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415756 {"Certificate" (portkey.aws/search-for-tag rawinput415754 "Certificate" :flattened? nil :result-wrapper resultWrapper415755)}] (clojure.core/cond-> {:certificate (deser-signing-certificate (clojure.core/get-in letvar415756 ["Certificate" :content]))}))))

(clojure.core/defn- response-list-role-policies-response ([input] (response-list-role-policies-response nil input)) ([resultWrapper415758 input] (clojure.core/let [rawinput415757 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415759 {"PolicyNames" (portkey.aws/search-for-tag rawinput415757 "PolicyNames" :flattened? nil :result-wrapper resultWrapper415758), "IsTruncated" (portkey.aws/search-for-tag rawinput415757 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415758), "Marker" (portkey.aws/search-for-tag rawinput415757 "Marker" :flattened? nil :result-wrapper resultWrapper415758)}] (clojure.core/cond-> {:policy-names (deserpolicy-name-list-type (clojure.core/get-in letvar415759 ["PolicyNames" :content]))} (letvar415759 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415759 ["IsTruncated" :content]))) (letvar415759 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415759 ["Marker" :content])))))))

(clojure.core/defn- response-reset-service-specific-credential-response ([input] (response-reset-service-specific-credential-response nil input)) ([resultWrapper415761 input] (clojure.core/let [rawinput415760 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415762 {"ServiceSpecificCredential" (portkey.aws/search-for-tag rawinput415760 "ServiceSpecificCredential" :flattened? nil :result-wrapper resultWrapper415761)}] (clojure.core/cond-> {} (letvar415762 "ServiceSpecificCredential") (clojure.core/assoc :service-specific-credential (deser-service-specific-credential (clojure.core/get-in letvar415762 ["ServiceSpecificCredential" :content])))))))

(clojure.core/defn- response-list-service-specific-credentials-response ([input] (response-list-service-specific-credentials-response nil input)) ([resultWrapper415764 input] (clojure.core/let [rawinput415763 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415765 {"ServiceSpecificCredentials" (portkey.aws/search-for-tag rawinput415763 "ServiceSpecificCredentials" :flattened? nil :result-wrapper resultWrapper415764)}] (clojure.core/cond-> {} (letvar415765 "ServiceSpecificCredentials") (clojure.core/assoc :service-specific-credentials (deser-service-specific-credentials-list-type (clojure.core/get-in letvar415765 ["ServiceSpecificCredentials" :content])))))))

(clojure.core/defn- response-create-access-key-response ([input] (response-create-access-key-response nil input)) ([resultWrapper415767 input] (clojure.core/let [rawinput415766 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415768 {"AccessKey" (portkey.aws/search-for-tag rawinput415766 "AccessKey" :flattened? nil :result-wrapper resultWrapper415767)}] (clojure.core/cond-> {:access-key (deser-access-key (clojure.core/get-in letvar415768 ["AccessKey" :content]))}))))

(clojure.core/defn- response-create-login-profile-response ([input] (response-create-login-profile-response nil input)) ([resultWrapper415770 input] (clojure.core/let [rawinput415769 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415771 {"LoginProfile" (portkey.aws/search-for-tag rawinput415769 "LoginProfile" :flattened? nil :result-wrapper resultWrapper415770)}] (clojure.core/cond-> {:login-profile (deser-login-profile (clojure.core/get-in letvar415771 ["LoginProfile" :content]))}))))

(clojure.core/defn- response-list-instance-profiles-response ([input] (response-list-instance-profiles-response nil input)) ([resultWrapper415773 input] (clojure.core/let [rawinput415772 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415774 {"InstanceProfiles" (portkey.aws/search-for-tag rawinput415772 "InstanceProfiles" :flattened? nil :result-wrapper resultWrapper415773), "IsTruncated" (portkey.aws/search-for-tag rawinput415772 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415773), "Marker" (portkey.aws/search-for-tag rawinput415772 "Marker" :flattened? nil :result-wrapper resultWrapper415773)}] (clojure.core/cond-> {:instance-profiles (deserinstance-profile-list-type (clojure.core/get-in letvar415774 ["InstanceProfiles" :content]))} (letvar415774 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415774 ["IsTruncated" :content]))) (letvar415774 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415774 ["Marker" :content])))))))

(clojure.core/defn- response-list-entities-for-policy-response ([input] (response-list-entities-for-policy-response nil input)) ([resultWrapper415776 input] (clojure.core/let [rawinput415775 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415777 {"PolicyGroups" (portkey.aws/search-for-tag rawinput415775 "PolicyGroups" :flattened? nil :result-wrapper resultWrapper415776), "PolicyUsers" (portkey.aws/search-for-tag rawinput415775 "PolicyUsers" :flattened? nil :result-wrapper resultWrapper415776), "PolicyRoles" (portkey.aws/search-for-tag rawinput415775 "PolicyRoles" :flattened? nil :result-wrapper resultWrapper415776), "IsTruncated" (portkey.aws/search-for-tag rawinput415775 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415776), "Marker" (portkey.aws/search-for-tag rawinput415775 "Marker" :flattened? nil :result-wrapper resultWrapper415776)}] (clojure.core/cond-> {} (letvar415777 "PolicyGroups") (clojure.core/assoc :policy-groups (deser-policy-group-list-type (clojure.core/get-in letvar415777 ["PolicyGroups" :content]))) (letvar415777 "PolicyUsers") (clojure.core/assoc :policy-users (deser-policy-user-list-type (clojure.core/get-in letvar415777 ["PolicyUsers" :content]))) (letvar415777 "PolicyRoles") (clojure.core/assoc :policy-roles (deser-policy-role-list-type (clojure.core/get-in letvar415777 ["PolicyRoles" :content]))) (letvar415777 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415777 ["IsTruncated" :content]))) (letvar415777 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415777 ["Marker" :content])))))))

(clojure.core/defn- response-create-virtual-mfa-device-response ([input] (response-create-virtual-mfa-device-response nil input)) ([resultWrapper415779 input] (clojure.core/let [rawinput415778 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415780 {"VirtualMFADevice" (portkey.aws/search-for-tag rawinput415778 "VirtualMFADevice" :flattened? nil :result-wrapper resultWrapper415779)}] (clojure.core/cond-> {:virtual-mfa-device (deser-virtual-mfa-device (clojure.core/get-in letvar415780 ["VirtualMFADevice" :content]))}))))

(clojure.core/defn- response-list-policies-response ([input] (response-list-policies-response nil input)) ([resultWrapper415782 input] (clojure.core/let [rawinput415781 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415783 {"Policies" (portkey.aws/search-for-tag rawinput415781 "Policies" :flattened? nil :result-wrapper resultWrapper415782), "IsTruncated" (portkey.aws/search-for-tag rawinput415781 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415782), "Marker" (portkey.aws/search-for-tag rawinput415781 "Marker" :flattened? nil :result-wrapper resultWrapper415782)}] (clojure.core/cond-> {} (letvar415783 "Policies") (clojure.core/assoc :policies (deserpolicy-list-type (clojure.core/get-in letvar415783 ["Policies" :content]))) (letvar415783 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415783 ["IsTruncated" :content]))) (letvar415783 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415783 ["Marker" :content])))))))

(clojure.core/defn- response-password-policy-violation-exception ([input] (response-password-policy-violation-exception nil input)) ([resultWrapper415785 input] (clojure.core/let [rawinput415784 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415786 {"message" (portkey.aws/search-for-tag rawinput415784 "message" :flattened? nil :result-wrapper resultWrapper415785)}] (clojure.core/cond-> {} (letvar415786 "message") (clojure.core/assoc :message (deserpassword-policy-violation-message (clojure.core/get-in letvar415786 ["message" :content])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper415788 input] (clojure.core/let [rawinput415787 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415789 {"message" (portkey.aws/search-for-tag rawinput415787 "message" :flattened? nil :result-wrapper resultWrapper415788)}] (clojure.core/cond-> {} (letvar415789 "message") (clojure.core/assoc :message (deser-concurrent-modification-message (clojure.core/get-in letvar415789 ["message" :content])))))))

(clojure.core/defn- response-invalid-authentication-code-exception ([input] (response-invalid-authentication-code-exception nil input)) ([resultWrapper415791 input] (clojure.core/let [rawinput415790 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415792 {"message" (portkey.aws/search-for-tag rawinput415790 "message" :flattened? nil :result-wrapper resultWrapper415791)}] (clojure.core/cond-> {} (letvar415792 "message") (clojure.core/assoc :message (deserinvalid-authentication-code-message (clojure.core/get-in letvar415792 ["message" :content])))))))

(clojure.core/defn- response-get-saml-provider-response ([input] (response-get-saml-provider-response nil input)) ([resultWrapper415794 input] (clojure.core/let [rawinput415793 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415795 {"SAMLMetadataDocument" (portkey.aws/search-for-tag rawinput415793 "SAMLMetadataDocument" :flattened? nil :result-wrapper resultWrapper415794), "CreateDate" (portkey.aws/search-for-tag rawinput415793 "CreateDate" :flattened? nil :result-wrapper resultWrapper415794), "ValidUntil" (portkey.aws/search-for-tag rawinput415793 "ValidUntil" :flattened? nil :result-wrapper resultWrapper415794)}] (clojure.core/cond-> {} (letvar415795 "SAMLMetadataDocument") (clojure.core/assoc :saml-metadata-document (deser-saml-metadata-document-type (clojure.core/get-in letvar415795 ["SAMLMetadataDocument" :content]))) (letvar415795 "CreateDate") (clojure.core/assoc :create-date (deserdate-type (clojure.core/get-in letvar415795 ["CreateDate" :content]))) (letvar415795 "ValidUntil") (clojure.core/assoc :valid-until (deserdate-type (clojure.core/get-in letvar415795 ["ValidUntil" :content])))))))

(clojure.core/defn- response-list-policies-granting-service-access-response ([input] (response-list-policies-granting-service-access-response nil input)) ([resultWrapper415797 input] (clojure.core/let [rawinput415796 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415798 {"PoliciesGrantingServiceAccess" (portkey.aws/search-for-tag rawinput415796 "PoliciesGrantingServiceAccess" :flattened? nil :result-wrapper resultWrapper415797), "IsTruncated" (portkey.aws/search-for-tag rawinput415796 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415797), "Marker" (portkey.aws/search-for-tag rawinput415796 "Marker" :flattened? nil :result-wrapper resultWrapper415797)}] (clojure.core/cond-> {:policies-granting-service-access (deserlist-policy-granting-service-access-response-list-type (clojure.core/get-in letvar415798 ["PoliciesGrantingServiceAccess" :content]))} (letvar415798 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415798 ["IsTruncated" :content]))) (letvar415798 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415798 ["Marker" :content])))))))

(clojure.core/defn- response-list-attached-user-policies-response ([input] (response-list-attached-user-policies-response nil input)) ([resultWrapper415800 input] (clojure.core/let [rawinput415799 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415801 {"AttachedPolicies" (portkey.aws/search-for-tag rawinput415799 "AttachedPolicies" :flattened? nil :result-wrapper resultWrapper415800), "IsTruncated" (portkey.aws/search-for-tag rawinput415799 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415800), "Marker" (portkey.aws/search-for-tag rawinput415799 "Marker" :flattened? nil :result-wrapper resultWrapper415800)}] (clojure.core/cond-> {} (letvar415801 "AttachedPolicies") (clojure.core/assoc :attached-policies (deserattached-policies-list-type (clojure.core/get-in letvar415801 ["AttachedPolicies" :content]))) (letvar415801 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415801 ["IsTruncated" :content]))) (letvar415801 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415801 ["Marker" :content])))))))

(clojure.core/defn- response-list-users-response ([input] (response-list-users-response nil input)) ([resultWrapper415803 input] (clojure.core/let [rawinput415802 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415804 {"Users" (portkey.aws/search-for-tag rawinput415802 "Users" :flattened? nil :result-wrapper resultWrapper415803), "IsTruncated" (portkey.aws/search-for-tag rawinput415802 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415803), "Marker" (portkey.aws/search-for-tag rawinput415802 "Marker" :flattened? nil :result-wrapper resultWrapper415803)}] (clojure.core/cond-> {:users (deseruser-list-type (clojure.core/get-in letvar415804 ["Users" :content]))} (letvar415804 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415804 ["IsTruncated" :content]))) (letvar415804 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415804 ["Marker" :content])))))))

(clojure.core/defn- response-create-policy-version-response ([input] (response-create-policy-version-response nil input)) ([resultWrapper415806 input] (clojure.core/let [rawinput415805 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415807 {"PolicyVersion" (portkey.aws/search-for-tag rawinput415805 "PolicyVersion" :flattened? nil :result-wrapper resultWrapper415806)}] (clojure.core/cond-> {} (letvar415807 "PolicyVersion") (clojure.core/assoc :policy-version (deser-policy-version (clojure.core/get-in letvar415807 ["PolicyVersion" :content])))))))

(clojure.core/defn- response-get-account-authorization-details-response ([input] (response-get-account-authorization-details-response nil input)) ([resultWrapper415809 input] (clojure.core/let [rawinput415808 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415810 {"UserDetailList" (portkey.aws/search-for-tag rawinput415808 "UserDetailList" :flattened? nil :result-wrapper resultWrapper415809), "GroupDetailList" (portkey.aws/search-for-tag rawinput415808 "GroupDetailList" :flattened? nil :result-wrapper resultWrapper415809), "RoleDetailList" (portkey.aws/search-for-tag rawinput415808 "RoleDetailList" :flattened? nil :result-wrapper resultWrapper415809), "Policies" (portkey.aws/search-for-tag rawinput415808 "Policies" :flattened? nil :result-wrapper resultWrapper415809), "IsTruncated" (portkey.aws/search-for-tag rawinput415808 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415809), "Marker" (portkey.aws/search-for-tag rawinput415808 "Marker" :flattened? nil :result-wrapper resultWrapper415809)}] (clojure.core/cond-> {} (letvar415810 "UserDetailList") (clojure.core/assoc :user-detail-list (deseruser-detail-list-type (clojure.core/get-in letvar415810 ["UserDetailList" :content]))) (letvar415810 "GroupDetailList") (clojure.core/assoc :group-detail-list (desergroup-detail-list-type (clojure.core/get-in letvar415810 ["GroupDetailList" :content]))) (letvar415810 "RoleDetailList") (clojure.core/assoc :role-detail-list (deserrole-detail-list-type (clojure.core/get-in letvar415810 ["RoleDetailList" :content]))) (letvar415810 "Policies") (clojure.core/assoc :policies (deser-managed-policy-detail-list-type (clojure.core/get-in letvar415810 ["Policies" :content]))) (letvar415810 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415810 ["IsTruncated" :content]))) (letvar415810 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415810 ["Marker" :content])))))))

(clojure.core/defn- response-delete-service-linked-role-response ([input] (response-delete-service-linked-role-response nil input)) ([resultWrapper415812 input] (clojure.core/let [rawinput415811 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415813 {"DeletionTaskId" (portkey.aws/search-for-tag rawinput415811 "DeletionTaskId" :flattened? nil :result-wrapper resultWrapper415812)}] (clojure.core/cond-> {:deletion-task-id (deser-deletion-task-id-type (clojure.core/get-in letvar415813 ["DeletionTaskId" :content]))}))))

(clojure.core/defn- response-list-virtual-mfa-devices-response ([input] (response-list-virtual-mfa-devices-response nil input)) ([resultWrapper415815 input] (clojure.core/let [rawinput415814 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415816 {"VirtualMFADevices" (portkey.aws/search-for-tag rawinput415814 "VirtualMFADevices" :flattened? nil :result-wrapper resultWrapper415815), "IsTruncated" (portkey.aws/search-for-tag rawinput415814 "IsTruncated" :flattened? nil :result-wrapper resultWrapper415815), "Marker" (portkey.aws/search-for-tag rawinput415814 "Marker" :flattened? nil :result-wrapper resultWrapper415815)}] (clojure.core/cond-> {:virtual-mfa-devices (deservirtual-mfa-device-list-type (clojure.core/get-in letvar415816 ["VirtualMFADevices" :content]))} (letvar415816 "IsTruncated") (clojure.core/assoc :is-truncated (deserboolean-type (clojure.core/get-in letvar415816 ["IsTruncated" :content]))) (letvar415816 "Marker") (clojure.core/assoc :marker (desermarker-type (clojure.core/get-in letvar415816 ["Marker" :content])))))))

(clojure.core/defn- response-get-user-policy-response ([input] (response-get-user-policy-response nil input)) ([resultWrapper415818 input] (clojure.core/let [rawinput415817 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415819 {"UserName" (portkey.aws/search-for-tag rawinput415817 "UserName" :flattened? nil :result-wrapper resultWrapper415818), "PolicyName" (portkey.aws/search-for-tag rawinput415817 "PolicyName" :flattened? nil :result-wrapper resultWrapper415818), "PolicyDocument" (portkey.aws/search-for-tag rawinput415817 "PolicyDocument" :flattened? nil :result-wrapper resultWrapper415818)}] (clojure.core/cond-> {:user-name (deserexisting-user-name-type (clojure.core/get-in letvar415819 ["UserName" :content])), :policy-name (deserpolicy-name-type (clojure.core/get-in letvar415819 ["PolicyName" :content])), :policy-document (deserpolicy-document-type (clojure.core/get-in letvar415819 ["PolicyDocument" :content]))}))))

(clojure.core/defn- response-get-user-response ([input] (response-get-user-response nil input)) ([resultWrapper415821 input] (clojure.core/let [rawinput415820 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar415822 {"User" (portkey.aws/search-for-tag rawinput415820 "User" :flattened? nil :result-wrapper resultWrapper415821)}] (clojure.core/cond-> {:user (deser-user (clojure.core/get-in letvar415822 ["User" :content]))}))))

(clojure.spec.alpha/def :portkey.aws.iam.service-last-accessed/service-name (clojure.spec.alpha/and :portkey.aws.iam/service-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-last-accessed/last-authenticated (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-last-accessed/service-namespace (clojure.spec.alpha/and :portkey.aws.iam/service-namespace-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-last-accessed/last-authenticated-entity (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.service-last-accessed/total-authenticated-entities (clojure.spec.alpha/and :portkey.aws.iam/integer-type))
(clojure.spec.alpha/def :portkey.aws.iam/service-last-accessed (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.service-last-accessed/service-name :portkey.aws.iam.service-last-accessed/service-namespace] :opt-un [:portkey.aws.iam.service-last-accessed/last-authenticated :portkey.aws.iam.service-last-accessed/last-authenticated-entity :portkey.aws.iam.service-last-accessed/total-authenticated-entities]))

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

(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-status (clojure.spec.alpha/and :portkey.aws.iam/job-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-creation-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-completion-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/entity-details-list (clojure.spec.alpha/and :portkey.aws.iam/entity-details-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/error (clojure.spec.alpha/and :portkey.aws.iam/error-details))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-last-accessed-details-with-entities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-status :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-creation-date :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/job-completion-date :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/entity-details-list] :opt-un [:portkey.aws.iam.get-service-last-accessed-details-with-entities-response/is-truncated :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/marker :portkey.aws.iam.get-service-last-accessed-details-with-entities-response/error]))

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
(clojure.spec.alpha/def :portkey.aws.iam.create-role-request/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-role-request/role-name :portkey.aws.iam.create-role-request/assume-role-policy-document] :opt-un [:portkey.aws.iam.create-role-request/path :portkey.aws.iam.create-role-request/description :portkey.aws.iam.create-role-request/max-session-duration :portkey.aws.iam.create-role-request/permissions-boundary :portkey.aws.iam.create-role-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iam/context-entry-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/context-entry))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-material-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 16384)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/server-certificate-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/upload-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.server-certificate-metadata/expiration (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-metadata (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.server-certificate-metadata/path :portkey.aws.iam.server-certificate-metadata/server-certificate-name :portkey.aws.iam.server-certificate-metadata/server-certificate-id :portkey.aws.iam.server-certificate-metadata/arn] :opt-un [:portkey.aws.iam.server-certificate-metadata/upload-date :portkey.aws.iam.server-certificate-metadata/expiration]))

(clojure.spec.alpha/def :portkey.aws.iam/entity-details-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/entity-details))

(clojure.spec.alpha/def :portkey.aws.iam.delete-login-profile-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-login-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-login-profile-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/job-status-type #{"COMPLETED" "IN_PROGRESS" :in-progress :completed "FAILED" :failed})

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

(clojure.spec.alpha/def :portkey.aws.iam.entity-details/last-authenticated (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/entity-details (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/entity-info] :opt-un [:portkey.aws.iam.entity-details/last-authenticated]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-owner-entity-type #{:role "USER" :group "ROLE" :user "GROUP"})

(clojure.spec.alpha/def :portkey.aws.iam/custom-suffix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/path-prefix-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 512)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"\u002F[\u0021-\u007F]*" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/marker-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 320)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/action-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-not-ready-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-not-ready-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-not-ready-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/get-ssh-public-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/policy-path-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-attached-user-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-attached-user-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-attached-user-policies-request/user-name] :opt-un [:portkey.aws.iam.list-attached-user-policies-request/path-prefix :portkey.aws.iam.list-attached-user-policies-request/marker :portkey.aws.iam.list-attached-user-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/create-service-linked-role-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/role]))

(clojure.spec.alpha/def :portkey.aws.iam/group-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/list-open-id-connect-providers-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-version-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-version))

(clojure.spec.alpha/def :portkey.aws.iam.invalid-public-key-exception/message (clojure.spec.alpha/and :portkey.aws.iam/invalid-public-key-message))
(clojure.spec.alpha/def :portkey.aws.iam/invalid-public-key-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.invalid-public-key-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/region (clojure.spec.alpha/and :portkey.aws.iam/region-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-usage-type/resources (clojure.spec.alpha/and :portkey.aws.iam/arn-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-usage-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.role-usage-type/region :portkey.aws.iam.role-usage-type/resources]))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/tag-key-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/tag-key-type :max-count 50))

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

(clojure.spec.alpha/def :portkey.aws.iam/saml-provider-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w._-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-server-certificate-request/server-certificate-name (clojure.spec.alpha/and :portkey.aws.iam/server-certificate-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-server-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-server-certificate-request/server-certificate-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/attached-policies-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/attached-policy))

(clojure.spec.alpha/def :portkey.aws.iam.unrecognized-public-key-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iam/unrecognized-public-key-encoding-message))
(clojure.spec.alpha/def :portkey.aws.iam/unrecognized-public-key-encoding-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.unrecognized-public-key-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/service-namespace-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w-]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-identifier-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 16 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.credential-report-expired-exception/message (clojure.spec.alpha/and :portkey.aws.iam/credential-report-expired-exception-message))
(clojure.spec.alpha/def :portkey.aws.iam/credential-report-expired-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.credential-report-expired-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/client-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-signing-certificate-request/certificate-id (clojure.spec.alpha/and :portkey.aws.iam/certificate-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-signing-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-signing-certificate-request/certificate-id] :opt-un [:portkey.aws.iam.delete-signing-certificate-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/string-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.tag-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.tag-user-request/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/tag-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.tag-user-request/user-name :portkey.aws.iam.tag-user-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.set-default-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/set-default-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.set-default-policy-version-request/policy-arn :portkey.aws.iam.set-default-policy-version-request/version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.create-saml-provider-request/saml-metadata-document (clojure.spec.alpha/and :portkey.aws.iam/saml-metadata-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-saml-provider-request/name (clojure.spec.alpha/and :portkey.aws.iam/saml-provider-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-saml-provider-request/saml-metadata-document :portkey.aws.iam.create-saml-provider-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/eval-decision-source-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/job-id (clojure.spec.alpha/and :portkey.aws.iam/job-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/service-namespace (clojure.spec.alpha/and :portkey.aws.iam/service-namespace-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-last-accessed-details-with-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-last-accessed-details-with-entities-request/job-id :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/service-namespace] :opt-un [:portkey.aws.iam.get-service-last-accessed-details-with-entities-request/max-items :portkey.aws.iam.get-service-last-accessed-details-with-entities-request/marker]))

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

(clojure.spec.alpha/def :portkey.aws.iam/list-policy-granting-service-access-response-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/list-policies-granting-service-access-entry))

(clojure.spec.alpha/def :portkey.aws.iam/virtual-mfa-device-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/service-namespace-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/service-namespace-type :min-count 1 :max-count 200))

(clojure.spec.alpha/def :portkey.aws.iam/services-last-accessed (clojure.spec.alpha/coll-of :portkey.aws.iam/service-last-accessed))

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

(clojure.spec.alpha/def :portkey.aws.iam/tag-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/tag :max-count 50))

(clojure.spec.alpha/def :portkey.aws.iam/permissions-boundary-attachment-type #{"PermissionsBoundaryPolicy" :permissions-boundary-policy})

(clojure.spec.alpha/def :portkey.aws.iam/thumbprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 40 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 40))))

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

(clojure.spec.alpha/def :portkey.aws.iam/account-alias-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 63)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/tag-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\p{L}\p{Z}\p{N}_.:/=+\-@]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam.entity-info/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.entity-info/name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.entity-info/type (clojure.spec.alpha/and :portkey.aws.iam/policy-owner-entity-type))
(clojure.spec.alpha/def :portkey.aws.iam.entity-info/id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.entity-info/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam/entity-info (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.entity-info/arn :portkey.aws.iam.entity-info/name :portkey.aws.iam.entity-info/type :portkey.aws.iam.entity-info/id] :opt-un [:portkey.aws.iam.entity-info/path]))

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
(clojure.spec.alpha/def :portkey.aws.iam.user/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/user (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.user/path :portkey.aws.iam.user/user-name :portkey.aws.iam.user/user-id :portkey.aws.iam.user/arn :portkey.aws.iam.user/create-date] :opt-un [:portkey.aws.iam.user/password-last-used :portkey.aws.iam.user/permissions-boundary :portkey.aws.iam.user/tags]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.delete-access-key-request/access-key-id (clojure.spec.alpha/and :portkey.aws.iam/access-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-access-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-access-key-request/access-key-id] :opt-un [:portkey.aws.iam.delete-access-key-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-saml-provider-request/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-saml-provider-request/saml-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-role/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-role (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-role/role-name :portkey.aws.iam.policy-role/role-id]))

(clojure.spec.alpha/def :portkey.aws.iam/attachment-count-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam/resource-handling-option-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.iam/policy-type #{"MANAGED" :managed "INLINE" :inline})

(clojure.spec.alpha/def :portkey.aws.iam.create-access-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.create-access-key-request/user-name]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"v[1-9][0-9]*(\.[A-Za-z0-9-]*)?" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-value-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.policy-version/document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/is-default-version (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-version/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.policy-version/document :portkey.aws.iam.policy-version/version-id :portkey.aws.iam.policy-version/is-default-version :portkey.aws.iam.policy-version/create-date]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-role-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-role))

(clojure.spec.alpha/def :portkey.aws.iam/invalid-input-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/public-key-fingerprint-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 48 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 48)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[:\w]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-group-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-group-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-group-policies-request/group-name] :opt-un [:portkey.aws.iam.list-group-policies-request/marker :portkey.aws.iam.list-group-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-response/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-role-tags-response/tags] :opt-un [:portkey.aws.iam.list-role-tags-response/is-truncated :portkey.aws.iam.list-role-tags-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.iam/entity-already-exists-message))
(clojure.spec.alpha/def :portkey.aws.iam/entity-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.entity-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam/get-role-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/role] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/instance-profile-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/simulation-policy-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-document-type))

(clojure.spec.alpha/def :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-type (clojure.spec.alpha/and :portkey.aws.iam/permissions-boundary-attachment-type))
(clojure.spec.alpha/def :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attached-permissions-boundary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.attached-permissions-boundary/permissions-boundary-type :portkey.aws.iam.attached-permissions-boundary/permissions-boundary-arn]))

(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.add-user-to-group-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/add-user-to-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.add-user-to-group-request/group-name :portkey.aws.iam.add-user-to-group-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credential-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/policy-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 131072)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

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
(clojure.spec.alpha/def :portkey.aws.iam.role/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.role/description (clojure.spec.alpha/and :portkey.aws.iam/role-description-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role/max-session-duration (clojure.spec.alpha/and :portkey.aws.iam/role-max-session-duration-type))
(clojure.spec.alpha/def :portkey.aws.iam/role (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.role/path :portkey.aws.iam.role/role-name :portkey.aws.iam.role/role-id :portkey.aws.iam.role/arn :portkey.aws.iam.role/create-date] :opt-un [:portkey.aws.iam.role/assume-role-policy-document :portkey.aws.iam.role/tags :portkey.aws.iam.role/permissions-boundary :portkey.aws.iam.role/description :portkey.aws.iam.role/max-session-duration]))

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

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-entry/service-namespace (clojure.spec.alpha/and :portkey.aws.iam/service-namespace-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-entry/policies (clojure.spec.alpha/and :portkey.aws.iam/policy-granting-service-access-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-granting-service-access-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-policies-granting-service-access-entry/service-namespace :portkey.aws.iam.list-policies-granting-service-access-entry/policies]))

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

(clojure.spec.alpha/def :portkey.aws.iam/existing-user-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/unmodifiable-entity-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/open-id-connect-provider-url-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-mfa-devices-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-mfa-devices-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-mfa-devices-request/user-name :portkey.aws.iam.list-mfa-devices-request/marker :portkey.aws.iam.list-mfa-devices-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/job-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 36 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-instance-profiles-request/path-prefix :portkey.aws.iam.list-instance-profiles-request/marker :portkey.aws.iam.list-instance-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/authentication-code-1 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam.enable-mfa-device-request/authentication-code-2 (clojure.spec.alpha/and :portkey.aws.iam/authentication-code-type))
(clojure.spec.alpha/def :portkey.aws.iam/enable-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.enable-mfa-device-request/user-name :portkey.aws.iam.enable-mfa-device-request/serial-number :portkey.aws.iam.enable-mfa-device-request/authentication-code-1 :portkey.aws.iam.enable-mfa-device-request/authentication-code-2] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.generate-service-last-accessed-details-response/job-id (clojure.spec.alpha/and :portkey.aws.iam/job-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/generate-service-last-accessed-details-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.generate-service-last-accessed-details-response/job-id]))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-user-policies-response/policy-names] :opt-un [:portkey.aws.iam.list-user-policies-response/is-truncated :portkey.aws.iam.list-user-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 16 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/policy-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam/entity-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/resource-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/ssh-public-keys (clojure.spec.alpha/and :portkey.aws.iam/ssh-public-key-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-ssh-public-keys-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-ssh-public-keys-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-ssh-public-keys-response/ssh-public-keys :portkey.aws.iam.list-ssh-public-keys-response/is-truncated :portkey.aws.iam.list-ssh-public-keys-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/boolean-object-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-permissions-boundary-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-role-permissions-boundary-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/deletion-task-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.user-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/group-list (clojure.spec.alpha/and :portkey.aws.iam/group-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/user-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.user-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/user-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.user-detail/path :portkey.aws.iam.user-detail/create-date :portkey.aws.iam.user-detail/group-list :portkey.aws.iam.user-detail/user-id :portkey.aws.iam.user-detail/tags :portkey.aws.iam.user-detail/permissions-boundary :portkey.aws.iam.user-detail/user-name :portkey.aws.iam.user-detail/arn :portkey.aws.iam.user-detail/user-policy-list :portkey.aws.iam.user-detail/attached-managed-policies]))

(clojure.spec.alpha/def :portkey.aws.iam/upload-ssh-public-key-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/ssh-public-key]))

(clojure.spec.alpha/def :portkey.aws.iam.delete-virtual-mfa-device-request/serial-number (clojure.spec.alpha/and :portkey.aws.iam/serial-number-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-virtual-mfa-device-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-virtual-mfa-device-request/serial-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/managed-policy-detail-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/managed-policy-detail))

(clojure.spec.alpha/def :portkey.aws.iam/saml-metadata-document-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1000 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 10000000))))

(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-policy-versions-request/policy-arn] :opt-un [:portkey.aws.iam.list-policy-versions-request/marker :portkey.aws.iam.list-policy-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-policy-version-request/version-id (clojure.spec.alpha/and :portkey.aws.iam/policy-version-id-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-policy-version-request/policy-arn :portkey.aws.iam.get-policy-version-request/version-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-response/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-tags-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-user-tags-response/tags] :opt-un [:portkey.aws.iam.list-user-tags-response/is-truncated :portkey.aws.iam.list-user-tags-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-request/job-id (clojure.spec.alpha/and :portkey.aws.iam/job-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-last-accessed-details-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-last-accessed-details-request/job-id] :opt-un [:portkey.aws.iam.get-service-last-accessed-details-request/max-items :portkey.aws.iam.get-service-last-accessed-details-request/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.detach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/detach-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.detach-role-policy-request/role-name :portkey.aws.iam.detach-role-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/reason-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.iam.position/line (clojure.spec.alpha/and :portkey.aws.iam/line-number))
(clojure.spec.alpha/def :portkey.aws.iam.position/column (clojure.spec.alpha/and :portkey.aws.iam/column-number))
(clojure.spec.alpha/def :portkey.aws.iam/position (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.position/line :portkey.aws.iam.position/column]))

(clojure.spec.alpha/def :portkey.aws.iam/delete-conflict-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/authentication-code-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 6 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 6)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\d]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/max-items-type (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.iam.get-saml-provider-request/saml-provider-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-saml-provider-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-saml-provider-request/saml-provider-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-type-enum #{"boolean" :binary :date-list :numeric-list "numeric" :date "booleanList" :boolean-list "string" :ip "binaryList" :numeric "ipList" "binary" :string-list :string "numericList" "ip" :ip-list "dateList" "date" "stringList" :binary-list :boolean})

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-account-aliases-request/marker :portkey.aws.iam.list-account-aliases-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam/policy-name-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-name-type))

(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-user-tags-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-user-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-user-tags-request/user-name] :opt-un [:portkey.aws.iam.list-user-tags-request/marker :portkey.aws.iam.list-user-tags-request/max-items]))

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

(clojure.spec.alpha/def :portkey.aws.iam/certificate-body-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 16384)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/upload-server-certificate-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/server-certificate-metadata]))

(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/job-status (clojure.spec.alpha/and :portkey.aws.iam/job-status-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/job-creation-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/job-completion-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-service-last-accessed-details-response/error (clojure.spec.alpha/and :portkey.aws.iam/error-details))
(clojure.spec.alpha/def :portkey.aws.iam/get-service-last-accessed-details-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-service-last-accessed-details-response/job-status :portkey.aws.iam.get-service-last-accessed-details-response/job-creation-date :portkey.aws.iam/services-last-accessed :portkey.aws.iam.get-service-last-accessed-details-response/job-completion-date] :opt-un [:portkey.aws.iam.get-service-last-accessed-details-response/is-truncated :portkey.aws.iam.get-service-last-accessed-details-response/marker :portkey.aws.iam.get-service-last-accessed-details-response/error]))

(clojure.spec.alpha/def :portkey.aws.iam.policy-granting-service-access/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-granting-service-access/policy-type (clojure.spec.alpha/and :portkey.aws.iam/policy-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-granting-service-access/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-granting-service-access/entity-type (clojure.spec.alpha/and :portkey.aws.iam/policy-owner-entity-type))
(clojure.spec.alpha/def :portkey.aws.iam.policy-granting-service-access/entity-name (clojure.spec.alpha/and :portkey.aws.iam/entity-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/policy-granting-service-access (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.policy-granting-service-access/policy-name :portkey.aws.iam.policy-granting-service-access/policy-type] :opt-un [:portkey.aws.iam.policy-granting-service-access/policy-arn :portkey.aws.iam.policy-granting-service-access/entity-type :portkey.aws.iam.policy-granting-service-access/entity-name]))

(clojure.spec.alpha/def :portkey.aws.iam/credential-report-not-ready-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam/service-name-type (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.iam/certificate-chain-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2097152)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/policy-group-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-group))

(clojure.spec.alpha/def :portkey.aws.iam/update-role-description-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/role]))

(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/old-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam.change-password-request/new-password (clojure.spec.alpha/and :portkey.aws.iam/password-type))
(clojure.spec.alpha/def :portkey.aws.iam/change-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.change-password-request/old-password :portkey.aws.iam.change-password-request/new-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/account-aliases (clojure.spec.alpha/and :portkey.aws.iam/account-alias-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-account-aliases-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-account-aliases-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-account-aliases-response/account-aliases] :opt-un [:portkey.aws.iam.list-account-aliases-response/is-truncated :portkey.aws.iam.list-account-aliases-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/certificate-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 24 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.iam/context-key-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 5 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/path-prefix (clojure.spec.alpha/and :portkey.aws.iam/path-prefix-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-groups-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.list-groups-request/path-prefix :portkey.aws.iam.list-groups-request/marker :portkey.aws.iam.list-groups-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.create-user-request/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/create-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.create-user-request/user-name] :opt-un [:portkey.aws.iam.create-user-request/path :portkey.aws.iam.create-user-request/permissions-boundary :portkey.aws.iam.create-user-request/tags]))

(clojure.spec.alpha/def :portkey.aws.iam/service-not-supported-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iam.untag-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.untag-role-request/tag-keys (clojure.spec.alpha/and :portkey.aws.iam/tag-key-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/untag-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.untag-role-request/role-name :portkey.aws.iam.untag-role-request/tag-keys] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.iam/region-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.iam/get-account-password-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/password-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/create-group-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/group] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-instance-profiles-for-role-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-instance-profiles-for-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-instance-profiles-for-role-request/role-name] :opt-un [:portkey.aws.iam.list-instance-profiles-for-role-request/marker :portkey.aws.iam.list-instance-profiles-for-role-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-user-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-user-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-user-policy-request/user-name :portkey.aws.iam.get-user-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.error-details/message (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam.error-details/code (clojure.spec.alpha/and :portkey.aws.iam/string-type))
(clojure.spec.alpha/def :portkey.aws.iam/error-details (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.error-details/message :portkey.aws.iam.error-details/code] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-tags-request/max-items (clojure.spec.alpha/and :portkey.aws.iam/max-items-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-role-tags-request/role-name] :opt-un [:portkey.aws.iam.list-role-tags-request/marker :portkey.aws.iam.list-role-tags-request/max-items]))

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

(clojure.spec.alpha/def :portkey.aws.iam/private-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 16384)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/report-format-type #{:textcsv "text/csv"})

(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/policy-names (clojure.spec.alpha/and :portkey.aws.iam/policy-name-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-role-policies-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-role-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-role-policies-response/policy-names] :opt-un [:portkey.aws.iam.list-role-policies-response/is-truncated :portkey.aws.iam.list-role-policies-response/marker]))

(clojure.spec.alpha/def :portkey.aws.iam.get-instance-profile-request/instance-profile-name (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-instance-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-instance-profile-request/instance-profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/integer-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-id (clojure.spec.alpha/and :portkey.aws.iam/id-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/instance-profile-list (clojure.spec.alpha/and :portkey.aws.iam/instance-profile-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/assume-role-policy-document (clojure.spec.alpha/and :portkey.aws.iam/policy-document-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/path (clojure.spec.alpha/and :portkey.aws.iam/path-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/create-date (clojure.spec.alpha/and :portkey.aws.iam/date-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/role-policy-list (clojure.spec.alpha/and :portkey.aws.iam/policy-detail-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/permissions-boundary (clojure.spec.alpha/and :portkey.aws.iam/attached-permissions-boundary))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.role-detail/attached-managed-policies (clojure.spec.alpha/and :portkey.aws.iam/attached-policies-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/role-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.role-detail/role-id :portkey.aws.iam.role-detail/instance-profile-list :portkey.aws.iam.role-detail/assume-role-policy-document :portkey.aws.iam.role-detail/path :portkey.aws.iam.role-detail/role-name :portkey.aws.iam.role-detail/create-date :portkey.aws.iam.role-detail/role-policy-list :portkey.aws.iam.role-detail/tags :portkey.aws.iam.role-detail/permissions-boundary :portkey.aws.iam.role-detail/arn :portkey.aws.iam.role-detail/attached-managed-policies]))

(clojure.spec.alpha/def :portkey.aws.iam/reset-service-specific-credential-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam/service-specific-credential]))

(clojure.spec.alpha/def :portkey.aws.iam/service-specific-credentials-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/service-specific-credential-metadata))

(clojure.spec.alpha/def :portkey.aws.iam/server-certificate-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.attach-role-policy-request/policy-arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/attach-role-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.attach-role-policy-request/role-name :portkey.aws.iam.attach-role-policy-request/policy-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/serial-number-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 9 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=/:,.@-]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam/role-description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1000)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.generate-service-last-accessed-details-request/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/generate-service-last-accessed-details-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.generate-service-last-accessed-details-request/arn] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.iam.tag/key (clojure.spec.alpha/and :portkey.aws.iam/tag-key-type))
(clojure.spec.alpha/def :portkey.aws.iam.tag/value (clojure.spec.alpha/and :portkey.aws.iam/tag-value-type))
(clojure.spec.alpha/def :portkey.aws.iam/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.tag/key :portkey.aws.iam.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/create-access-key-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/access-key] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/access-key-metadata-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/access-key-metadata))

(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/group-name (clojure.spec.alpha/and :portkey.aws.iam/group-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-group-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.iam/policy-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-group-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-group-policy-request/group-name :portkey.aws.iam.get-group-policy-request/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/policy-granting-service-access-list-type (clojure.spec.alpha/coll-of :portkey.aws.iam/policy-granting-service-access))

(clojure.spec.alpha/def :portkey.aws.iam/create-login-profile-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam/login-profile] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam/password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0009\u000A\u000D\u0020-\u00FF]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/service-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 17 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 200)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/policy-path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"((/[A-Za-z0-9\.,\+@=_-]+)*)/" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.untag-user-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/existing-user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.untag-user-request/tag-keys (clojure.spec.alpha/and :portkey.aws.iam/tag-key-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/untag-user-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.untag-user-request/user-name :portkey.aws.iam.untag-user-request/tag-keys] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.iam/tag-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\p{L}\p{Z}\p{N}_.:/=+\-@]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.concurrent-modification-exception/message (clojure.spec.alpha/and :portkey.aws.iam/concurrent-modification-message))
(clojure.spec.alpha/def :portkey.aws.iam/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.concurrent-modification-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iam.open-id-connect-provider-list-entry/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam/open-id-connect-provider-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.iam.open-id-connect-provider-list-entry/arn]))

(clojure.spec.alpha/def :portkey.aws.iam/summary-value-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.iam.delete-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-role-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.get-ssh-public-key-request/encoding (clojure.spec.alpha/and :portkey.aws.iam/encoding-type))
(clojure.spec.alpha/def :portkey.aws.iam/get-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.get-ssh-public-key-request/user-name :portkey.aws.iam.get-ssh-public-key-request/ssh-public-key-id :portkey.aws.iam.get-ssh-public-key-request/encoding] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.tag-role-request/role-name (clojure.spec.alpha/and :portkey.aws.iam/role-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.tag-role-request/tags (clojure.spec.alpha/and :portkey.aws.iam/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/tag-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.tag-role-request/role-name :portkey.aws.iam.tag-role-request/tags] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.iam/public-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 20 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/path-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 512)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"(\u002F)|(\u002F[\u0021-\u007F]+\u002F)" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.iam.delete-user-permissions-boundary-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam/delete-user-permissions-boundary-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.delete-user-permissions-boundary-request/user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/user-name (clojure.spec.alpha/and :portkey.aws.iam/user-name-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/ssh-public-key-id (clojure.spec.alpha/and :portkey.aws.iam/public-key-id-type))
(clojure.spec.alpha/def :portkey.aws.iam.update-ssh-public-key-request/status (clojure.spec.alpha/and :portkey.aws.iam/status-type))
(clojure.spec.alpha/def :portkey.aws.iam/update-ssh-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.update-ssh-public-key-request/user-name :portkey.aws.iam.update-ssh-public-key-request/ssh-public-key-id :portkey.aws.iam.update-ssh-public-key-request/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-response/policies-granting-service-access (clojure.spec.alpha/and :portkey.aws.iam/list-policy-granting-service-access-response-list-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-response/is-truncated (clojure.spec.alpha/and :portkey.aws.iam/boolean-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-response/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-granting-service-access-response (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-policies-granting-service-access-response/policies-granting-service-access] :opt-un [:portkey.aws.iam.list-policies-granting-service-access-response/is-truncated :portkey.aws.iam.list-policies-granting-service-access-response/marker]))

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

(clojure.spec.alpha/def :portkey.aws.iam/role-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\w+=,.@-]+" s__283180__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.iam/concurrent-modification-message (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-request/marker (clojure.spec.alpha/and :portkey.aws.iam/marker-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-request/arn (clojure.spec.alpha/and :portkey.aws.iam/arn-type))
(clojure.spec.alpha/def :portkey.aws.iam.list-policies-granting-service-access-request/service-namespaces (clojure.spec.alpha/and :portkey.aws.iam/service-namespace-list-type))
(clojure.spec.alpha/def :portkey.aws.iam/list-policies-granting-service-access-request (clojure.spec.alpha/keys :req-un [:portkey.aws.iam.list-policies-granting-service-access-request/arn :portkey.aws.iam.list-policies-granting-service-access-request/service-namespaces] :opt-un [:portkey.aws.iam.list-policies-granting-service-access-request/marker]))

(clojure.spec.alpha/def :portkey.aws.iam/service-failure-exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn list-attached-user-policies ([list-attached-user-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-attached-user-policies-request list-attached-user-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-attached-user-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-user-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAttachedUserPoliciesResult", :http.request.configuration/action "ListAttachedUserPolicies", :http.request.configuration/output-deser-fn response-list-attached-user-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-user-policies-response))

(clojure.core/defn get-ssh-public-key ([get-ssh-public-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-ssh-public-key-request get-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-ssh-public-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSSHPublicKeyResult", :http.request.configuration/action "GetSSHPublicKey", :http.request.configuration/output-deser-fn response-get-ssh-public-key-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}})))))
(clojure.spec.alpha/fdef get-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-ssh-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-ssh-public-key-response))

(clojure.core/defn create-service-specific-credential ([create-service-specific-credential-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-service-specific-credential-request create-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-service-specific-credential-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateServiceSpecificCredentialResult", :http.request.configuration/action "CreateServiceSpecificCredential", :http.request.configuration/output-deser-fn response-create-service-specific-credential-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}})))))
(clojure.spec.alpha/fdef create-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-specific-credential-response))

(clojure.core/defn list-signing-certificates ([] (list-signing-certificates {})) ([list-signing-certificates-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-signing-certificates-request list-signing-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-signing-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-signing-certificates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSigningCertificatesResult", :http.request.configuration/action "ListSigningCertificates", :http.request.configuration/output-deser-fn response-list-signing-certificates-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-signing-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-signing-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-signing-certificates-response))

(clojure.core/defn list-attached-group-policies ([list-attached-group-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-attached-group-policies-request list-attached-group-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-attached-group-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-group-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAttachedGroupPoliciesResult", :http.request.configuration/action "ListAttachedGroupPolicies", :http.request.configuration/output-deser-fn response-list-attached-group-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-group-policies-response))

(clojure.core/defn detach-group-policy ([detach-group-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-group-policy-request detach-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachGroupPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-policy-versions ([list-policy-versions-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-policy-versions-request list-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-policy-versions-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPolicyVersionsResult", :http.request.configuration/action "ListPolicyVersions", :http.request.configuration/output-deser-fn response-list-policy-versions-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policy-versions-response))

(clojure.core/defn delete-policy-version ([delete-policy-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-policy-version-request delete-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicyVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-account-alias ([delete-account-alias-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-account-alias-request delete-account-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-account-alias-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccountAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn attach-role-policy ([attach-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-role-policy-request attach-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachRolePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn delete-server-certificate ([delete-server-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-server-certificate-request delete-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServerCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn update-saml-provider ([update-saml-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-saml-provider-request update-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/update-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateSAMLProviderResult", :http.request.configuration/action "UpdateSAMLProvider", :http.request.configuration/output-deser-fn response-update-saml-provider-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-saml-provider-response))

(clojure.core/defn delete-group ([delete-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-group-request delete-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-request) :ret clojure.core/true?)

(clojure.core/defn update-login-profile ([update-login-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-login-profile-request update-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLoginProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn update-account-password-policy ([] (update-account-password-policy {})) ([update-account-password-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-account-password-policy-request update-account-password-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-account-password-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccountPasswordPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-account-password-policy :args (clojure.spec.alpha/? :portkey.aws.iam/update-account-password-policy-request) :ret clojure.core/true?)

(clojure.core/defn deactivate-mfa-device ([deactivate-mfa-device-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-deactivate-mfa-device-request deactivate-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/deactivate-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeactivateMFADevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef deactivate-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/deactivate-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-policy-version ([get-policy-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-policy-version-request get-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetPolicyVersionResult", :http.request.configuration/action "GetPolicyVersion", :http.request.configuration/output-deser-fn response-get-policy-version-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-version-response))

(clojure.core/defn update-access-key ([update-access-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-access-key-request update-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAccessKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-access-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-login-profile ([delete-login-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-login-profile-request delete-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLoginProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-login-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-login-profile ([get-login-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-login-profile-request get-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-login-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetLoginProfileResult", :http.request.configuration/action "GetLoginProfile", :http.request.configuration/output-deser-fn response-get-login-profile-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-login-profile-response))

(clojure.core/defn update-open-id-connect-provider-thumbprint ([update-open-id-connect-provider-thumbprint-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-open-id-connect-provider-thumbprint-request update-open-id-connect-provider-thumbprint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-open-id-connect-provider-thumbprint-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateOpenIDConnectProviderThumbprint", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-open-id-connect-provider-thumbprint :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-open-id-connect-provider-thumbprint-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-specific-credential ([delete-service-specific-credential-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-service-specific-credential-request delete-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServiceSpecificCredential", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef delete-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn list-groups-for-user ([list-groups-for-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-groups-for-user-request list-groups-for-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-groups-for-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-groups-for-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListGroupsForUserResult", :http.request.configuration/action "ListGroupsForUser", :http.request.configuration/output-deser-fn response-list-groups-for-user-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-groups-for-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-groups-for-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-for-user-response))

(clojure.core/defn upload-ssh-public-key ([upload-ssh-public-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-upload-ssh-public-key-request upload-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/upload-ssh-public-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UploadSSHPublicKeyResult", :http.request.configuration/action "UploadSSHPublicKey", :http.request.configuration/output-deser-fn response-upload-ssh-public-key-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidPublicKeyException" :portkey.aws.iam/invalid-public-key-exception, "DuplicateSSHPublicKeyException" :portkey.aws.iam/duplicate-ssh-public-key-exception, "UnrecognizedPublicKeyEncodingException" :portkey.aws.iam/unrecognized-public-key-encoding-exception}})))))
(clojure.spec.alpha/fdef upload-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-ssh-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-ssh-public-key-response))

(clojure.core/defn list-group-policies ([list-group-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-group-policies-request list-group-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-group-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-group-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListGroupPoliciesResult", :http.request.configuration/action "ListGroupPolicies", :http.request.configuration/output-deser-fn response-list-group-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-group-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-group-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-group-policies-response))

(clojure.core/defn delete-role ([delete-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-role-request delete-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRole", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-request) :ret clojure.core/true?)

(clojure.core/defn get-service-last-accessed-details-with-entities ([get-service-last-accessed-details-with-entities-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-service-last-accessed-details-with-entities-request get-service-last-accessed-details-with-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-service-last-accessed-details-with-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-service-last-accessed-details-with-entities-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetServiceLastAccessedDetailsWithEntitiesResult", :http.request.configuration/action "GetServiceLastAccessedDetailsWithEntities", :http.request.configuration/output-deser-fn response-get-service-last-accessed-details-with-entities-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-service-last-accessed-details-with-entities :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-service-last-accessed-details-with-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-service-last-accessed-details-with-entities-response))

(clojure.core/defn delete-instance-profile ([delete-instance-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-instance-profile-request delete-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInstanceProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn list-groups ([] (list-groups {})) ([list-groups-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-groups-request list-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-groups-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListGroupsResult", :http.request.configuration/action "ListGroups", :http.request.configuration/output-deser-fn response-list-groups-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-groups :args (clojure.spec.alpha/? :portkey.aws.iam/list-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-groups-response))

(clojure.core/defn get-account-summary ([] (get-account-summary {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-account-summary-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAccountSummaryResult", :http.request.configuration/action "GetAccountSummary", :http.request.configuration/output-deser-fn response-get-account-summary-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-summary :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-summary-response))

(clojure.core/defn list-saml-providers ([] (list-saml-providers {})) ([list-saml-providers-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-saml-providers-request list-saml-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-saml-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-saml-providers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSAMLProvidersResult", :http.request.configuration/action "ListSAMLProviders", :http.request.configuration/output-deser-fn response-list-saml-providers-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-saml-providers :args (clojure.spec.alpha/? :portkey.aws.iam/list-saml-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-saml-providers-response))

(clojure.core/defn delete-saml-provider ([delete-saml-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-saml-provider-request delete-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSAMLProvider", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-saml-provider-request) :ret clojure.core/true?)

(clojure.core/defn get-saml-provider ([get-saml-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-saml-provider-request get-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetSAMLProviderResult", :http.request.configuration/action "GetSAMLProvider", :http.request.configuration/output-deser-fn response-get-saml-provider-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-saml-provider-response))

(clojure.core/defn update-assume-role-policy ([update-assume-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-assume-role-policy-request update-assume-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-assume-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAssumeRolePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-assume-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-assume-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-roles ([] (list-roles {})) ([list-roles-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-roles-request list-roles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-roles-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-roles-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListRolesResult", :http.request.configuration/action "ListRoles", :http.request.configuration/output-deser-fn response-list-roles-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-roles :args (clojure.spec.alpha/? :portkey.aws.iam/list-roles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-roles-response))

(clojure.core/defn list-policies ([] (list-policies {})) ([list-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-policies-request list-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPoliciesResult", :http.request.configuration/action "ListPolicies", :http.request.configuration/output-deser-fn response-list-policies-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-policies :args (clojure.spec.alpha/? :portkey.aws.iam/list-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policies-response))

(clojure.core/defn attach-group-policy ([attach-group-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-group-policy-request attach-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachGroupPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn get-open-id-connect-provider ([get-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-open-id-connect-provider-request get-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-open-id-connect-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetOpenIDConnectProviderResult", :http.request.configuration/action "GetOpenIDConnectProvider", :http.request.configuration/output-deser-fn response-get-open-id-connect-provider-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-open-id-connect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-open-id-connect-provider-response))

(clojure.core/defn get-access-key-last-used ([get-access-key-last-used-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-access-key-last-used-request get-access-key-last-used-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-access-key-last-used-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-access-key-last-used-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAccessKeyLastUsedResult", :http.request.configuration/action "GetAccessKeyLastUsed", :http.request.configuration/output-deser-fn response-get-access-key-last-used-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef get-access-key-last-used :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-access-key-last-used-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-access-key-last-used-response))

(clojure.core/defn list-service-specific-credentials ([] (list-service-specific-credentials {})) ([list-service-specific-credentials-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-service-specific-credentials-request list-service-specific-credentials-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-service-specific-credentials-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-service-specific-credentials-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListServiceSpecificCredentialsResult", :http.request.configuration/action "ListServiceSpecificCredentials", :http.request.configuration/output-deser-fn response-list-service-specific-credentials-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceNotSupportedException" :portkey.aws.iam/service-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-service-specific-credentials :args (clojure.spec.alpha/? :portkey.aws.iam/list-service-specific-credentials-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-service-specific-credentials-response))

(clojure.core/defn get-role-policy ([get-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-role-policy-request get-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-role-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetRolePolicyResult", :http.request.configuration/action "GetRolePolicy", :http.request.configuration/output-deser-fn response-get-role-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-policy-response))

(clojure.core/defn remove-client-id-from-open-id-connect-provider ([remove-client-id-from-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-remove-client-id-from-open-id-connect-provider-request remove-client-id-from-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-client-id-from-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveClientIDFromOpenIDConnectProvider", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-client-id-from-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-client-id-from-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn get-context-keys-for-custom-policy ([get-context-keys-for-custom-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-context-keys-for-custom-policy-request get-context-keys-for-custom-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-context-keys-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-context-keys-for-custom-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetContextKeysForCustomPolicyResult", :http.request.configuration/action "GetContextKeysForCustomPolicy", :http.request.configuration/output-deser-fn response-get-context-keys-for-policy-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-context-keys-for-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn list-instance-profiles ([] (list-instance-profiles {})) ([list-instance-profiles-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-instance-profiles-request list-instance-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-instance-profiles-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-instance-profiles-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListInstanceProfilesResult", :http.request.configuration/action "ListInstanceProfiles", :http.request.configuration/output-deser-fn response-list-instance-profiles-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-instance-profiles :args (clojure.spec.alpha/? :portkey.aws.iam/list-instance-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-response))

(clojure.core/defn get-credential-report ([] (get-credential-report {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-credential-report-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetCredentialReportResult", :http.request.configuration/action "GetCredentialReport", :http.request.configuration/output-deser-fn response-get-credential-report-response, :http.request.spec/error-spec {"CredentialReportNotPresentException" :portkey.aws.iam/credential-report-not-present-exception, "CredentialReportExpiredException" :portkey.aws.iam/credential-report-expired-exception, "CredentialReportNotReadyException" :portkey.aws.iam/credential-report-not-ready-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-credential-report :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-credential-report-response))

(clojure.core/defn upload-server-certificate ([upload-server-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-upload-server-certificate-request upload-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/upload-server-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UploadServerCertificateResult", :http.request.configuration/action "UploadServerCertificate", :http.request.configuration/output-deser-fn response-upload-server-certificate-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "KeyPairMismatchException" :portkey.aws.iam/key-pair-mismatch-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef upload-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-server-certificate-response))

(clojure.core/defn get-service-linked-role-deletion-status ([get-service-linked-role-deletion-status-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-service-linked-role-deletion-status-request get-service-linked-role-deletion-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-service-linked-role-deletion-status-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-service-linked-role-deletion-status-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetServiceLinkedRoleDeletionStatusResult", :http.request.configuration/action "GetServiceLinkedRoleDeletionStatus", :http.request.configuration/output-deser-fn response-get-service-linked-role-deletion-status-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-service-linked-role-deletion-status :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-service-linked-role-deletion-status-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-service-linked-role-deletion-status-response))

(clojure.core/defn delete-signing-certificate ([delete-signing-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-signing-certificate-request delete-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSigningCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn add-role-to-instance-profile ([add-role-to-instance-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-add-role-to-instance-profile-request add-role-to-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-role-to-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddRoleToInstanceProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-role-to-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-role-to-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn create-instance-profile ([create-instance-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-instance-profile-request create-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-instance-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateInstanceProfileResult", :http.request.configuration/action "CreateInstanceProfile", :http.request.configuration/output-deser-fn response-create-instance-profile-response, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-instance-profile-response))

(clojure.core/defn untag-role ([untag-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-untag-role-request untag-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/untag-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagRole", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef untag-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/untag-role-request) :ret clojure.core/true?)

(clojure.core/defn detach-role-policy ([detach-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-role-policy-request detach-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachRolePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-instance-profiles-for-role ([list-instance-profiles-for-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-instance-profiles-for-role-request list-instance-profiles-for-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-instance-profiles-for-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-instance-profiles-for-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListInstanceProfilesForRoleResult", :http.request.configuration/action "ListInstanceProfilesForRole", :http.request.configuration/output-deser-fn response-list-instance-profiles-for-role-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-instance-profiles-for-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-instance-profiles-for-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-instance-profiles-for-role-response))

(clojure.core/defn upload-signing-certificate ([upload-signing-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-upload-signing-certificate-request upload-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/upload-signing-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/upload-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UploadSigningCertificateResult", :http.request.configuration/action "UploadSigningCertificate", :http.request.configuration/output-deser-fn response-upload-signing-certificate-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedCertificateException" :portkey.aws.iam/malformed-certificate-exception, "InvalidCertificateException" :portkey.aws.iam/invalid-certificate-exception, "DuplicateCertificateException" :portkey.aws.iam/duplicate-certificate-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef upload-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/upload-signing-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/upload-signing-certificate-response))

(clojure.core/defn update-service-specific-credential ([update-service-specific-credential-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-service-specific-credential-request update-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServiceSpecificCredential", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef update-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-service-specific-credential-request) :ret clojure.core/true?)

(clojure.core/defn create-policy-version ([create-policy-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-policy-version-request create-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePolicyVersionResult", :http.request.configuration/action "CreatePolicyVersion", :http.request.configuration/output-deser-fn response-create-policy-version-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-version-response))

(clojure.core/defn get-context-keys-for-principal-policy ([get-context-keys-for-principal-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-context-keys-for-principal-policy-request get-context-keys-for-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-context-keys-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-context-keys-for-principal-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetContextKeysForPrincipalPolicyResult", :http.request.configuration/action "GetContextKeysForPrincipalPolicy", :http.request.configuration/output-deser-fn response-get-context-keys-for-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-context-keys-for-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-context-keys-for-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-context-keys-for-policy-response))

(clojure.core/defn resync-mfa-device ([resync-mfa-device-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-resync-mfa-device-request resync-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/resync-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResyncMFADevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef resync-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/resync-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-group ([get-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-group-request get-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-group-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetGroupResult", :http.request.configuration/action "GetGroup", :http.request.configuration/output-deser-fn response-get-group-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-response))

(clojure.core/defn list-policies-granting-service-access ([list-policies-granting-service-access-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-policies-granting-service-access-request list-policies-granting-service-access-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-policies-granting-service-access-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-policies-granting-service-access-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListPoliciesGrantingServiceAccessResult", :http.request.configuration/action "ListPoliciesGrantingServiceAccess", :http.request.configuration/output-deser-fn response-list-policies-granting-service-access-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-policies-granting-service-access :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-policies-granting-service-access-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-policies-granting-service-access-response))

(clojure.core/defn update-group ([update-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-group-request update-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-group-request) :ret clojure.core/true?)

(clojure.core/defn create-role ([create-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-role-request create-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateRoleResult", :http.request.configuration/action "CreateRole", :http.request.configuration/output-deser-fn response-create-role-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-role-response))

(clojure.core/defn delete-user ([delete-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-user-request delete-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-request) :ret clojure.core/true?)

(clojure.core/defn create-user ([create-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-user-request create-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateUserResult", :http.request.configuration/action "CreateUser", :http.request.configuration/output-deser-fn response-create-user-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-user-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetPolicyResult", :http.request.configuration/action "GetPolicy", :http.request.configuration/output-deser-fn response-get-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-policy-response))

(clojure.core/defn enable-mfa-device ([enable-mfa-device-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-enable-mfa-device-request enable-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/enable-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableMFADevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "InvalidAuthenticationCodeException" :portkey.aws.iam/invalid-authentication-code-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef enable-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/enable-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn put-role-policy ([put-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-role-policy-request put-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRolePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn delete-role-permissions-boundary ([delete-role-permissions-boundary-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-role-permissions-boundary-request delete-role-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRolePermissionsBoundary", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn list-mfa-devices ([] (list-mfa-devices {})) ([list-mfa-devices-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-mfa-devices-request list-mfa-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-mfa-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-mfa-devices-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListMFADevicesResult", :http.request.configuration/action "ListMFADevices", :http.request.configuration/output-deser-fn response-list-mfa-devices-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-mfa-devices :args (clojure.spec.alpha/? :portkey.aws.iam/list-mfa-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-mfa-devices-response))

(clojure.core/defn create-service-linked-role ([create-service-linked-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-service-linked-role-request create-service-linked-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-service-linked-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-service-linked-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateServiceLinkedRoleResult", :http.request.configuration/action "CreateServiceLinkedRole", :http.request.configuration/output-deser-fn response-create-service-linked-role-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-service-linked-role-response))

(clojure.core/defn detach-user-policy ([detach-user-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-user-policy-request detach-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/detach-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachUserPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef detach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/detach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn put-user-policy ([put-user-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-user-policy-request put-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutUserPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-signing-certificate ([update-signing-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-signing-certificate-request update-signing-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-signing-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSigningCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-signing-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-signing-certificate-request) :ret clojure.core/true?)

(clojure.core/defn get-user-policy ([get-user-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-user-policy-request get-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-user-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetUserPolicyResult", :http.request.configuration/action "GetUserPolicy", :http.request.configuration/output-deser-fn response-get-user-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-user-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-policy-response))

(clojure.core/defn untag-user ([untag-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-untag-user-request untag-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/untag-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef untag-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/untag-user-request) :ret clojure.core/true?)

(clojure.core/defn generate-service-last-accessed-details ([generate-service-last-accessed-details-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-generate-service-last-accessed-details-request generate-service-last-accessed-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/generate-service-last-accessed-details-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/generate-service-last-accessed-details-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GenerateServiceLastAccessedDetailsResult", :http.request.configuration/action "GenerateServiceLastAccessedDetails", :http.request.configuration/output-deser-fn response-generate-service-last-accessed-details-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef generate-service-last-accessed-details :args (clojure.spec.alpha/tuple :portkey.aws.iam/generate-service-last-accessed-details-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/generate-service-last-accessed-details-response))

(clojure.core/defn create-access-key ([] (create-access-key {})) ([create-access-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-access-key-request create-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-access-key-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateAccessKeyResult", :http.request.configuration/action "CreateAccessKey", :http.request.configuration/output-deser-fn response-create-access-key-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-access-key :args (clojure.spec.alpha/? :portkey.aws.iam/create-access-key-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-access-key-response))

(clojure.core/defn delete-user-permissions-boundary ([delete-user-permissions-boundary-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-user-permissions-boundary-request delete-user-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserPermissionsBoundary", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn delete-account-password-policy ([] (delete-account-password-policy {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccountPasswordPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-account-password-policy :args clojure.core/empty? :ret clojure.core/true?)

(clojure.core/defn add-client-id-to-open-id-connect-provider ([add-client-id-to-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-add-client-id-to-open-id-connect-provider-request add-client-id-to-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-client-id-to-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddClientIDToOpenIDConnectProvider", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-client-id-to-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-client-id-to-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn create-saml-provider ([create-saml-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-saml-provider-request create-saml-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-saml-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-saml-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateSAMLProviderResult", :http.request.configuration/action "CreateSAMLProvider", :http.request.configuration/output-deser-fn response-create-saml-provider-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-saml-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-saml-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-saml-provider-response))

(clojure.core/defn delete-open-id-connect-provider ([delete-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-open-id-connect-provider-request delete-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteOpenIDConnectProvider", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-open-id-connect-provider-request) :ret clojure.core/true?)

(clojure.core/defn reset-service-specific-credential ([reset-service-specific-credential-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-reset-service-specific-credential-request reset-service-specific-credential-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/reset-service-specific-credential-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/reset-service-specific-credential-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ResetServiceSpecificCredentialResult", :http.request.configuration/action "ResetServiceSpecificCredential", :http.request.configuration/output-deser-fn response-reset-service-specific-credential-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef reset-service-specific-credential :args (clojure.spec.alpha/tuple :portkey.aws.iam/reset-service-specific-credential-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/reset-service-specific-credential-response))

(clojure.core/defn list-entities-for-policy ([list-entities-for-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-entities-for-policy-request list-entities-for-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-entities-for-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-entities-for-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListEntitiesForPolicyResult", :http.request.configuration/action "ListEntitiesForPolicy", :http.request.configuration/output-deser-fn response-list-entities-for-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-entities-for-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-entities-for-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-entities-for-policy-response))

(clojure.core/defn list-user-tags ([list-user-tags-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-user-tags-request list-user-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-user-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-user-tags-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListUserTagsResult", :http.request.configuration/action "ListUserTags", :http.request.configuration/output-deser-fn response-list-user-tags-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-user-tags :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-user-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-user-tags-response))

(clojure.core/defn delete-ssh-public-key ([delete-ssh-public-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-ssh-public-key-request delete-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSSHPublicKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef delete-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-ssh-public-key-request) :ret clojure.core/true?)

(clojure.core/defn delete-role-policy ([delete-role-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-role-policy-request delete-role-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-role-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRolePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-role-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-role-policy-request) :ret clojure.core/true?)

(clojure.core/defn change-password ([change-password-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-change-password-request change-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/change-password-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ChangePassword", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidUserTypeException" :portkey.aws.iam/invalid-user-type-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef change-password :args (clojure.spec.alpha/tuple :portkey.aws.iam/change-password-request) :ret clojure.core/true?)

(clojure.core/defn update-ssh-public-key ([update-ssh-public-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-ssh-public-key-request update-ssh-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-ssh-public-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSSHPublicKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef update-ssh-public-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-ssh-public-key-request) :ret clojure.core/true?)

(clojure.core/defn remove-role-from-instance-profile ([remove-role-from-instance-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-remove-role-from-instance-profile-request remove-role-from-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-role-from-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveRoleFromInstanceProfile", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-role-from-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-role-from-instance-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-server-certificate ([get-server-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-server-certificate-request get-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-server-certificate-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetServerCertificateResult", :http.request.configuration/action "GetServerCertificate", :http.request.configuration/output-deser-fn response-get-server-certificate-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-server-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-server-certificate-response))

(clojure.core/defn get-account-password-policy ([] (get-account-password-policy {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-account-password-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAccountPasswordPolicyResult", :http.request.configuration/action "GetAccountPasswordPolicy", :http.request.configuration/output-deser-fn response-get-account-password-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-password-policy :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-password-policy-response))

(clojure.core/defn list-attached-role-policies ([list-attached-role-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-attached-role-policies-request list-attached-role-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-attached-role-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-attached-role-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAttachedRolePoliciesResult", :http.request.configuration/action "ListAttachedRolePolicies", :http.request.configuration/output-deser-fn response-list-attached-role-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-attached-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-attached-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-attached-role-policies-response))

(clojure.core/defn set-default-policy-version ([set-default-policy-version-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-default-policy-version-request set-default-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/set-default-policy-version-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetDefaultPolicyVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef set-default-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.iam/set-default-policy-version-request) :ret clojure.core/true?)

(clojure.core/defn list-open-id-connect-providers ([] (list-open-id-connect-providers {})) ([list-open-id-connect-providers-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-open-id-connect-providers-request list-open-id-connect-providers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-open-id-connect-providers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-open-id-connect-providers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListOpenIDConnectProvidersResult", :http.request.configuration/action "ListOpenIDConnectProviders", :http.request.configuration/output-deser-fn response-list-open-id-connect-providers-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-open-id-connect-providers :args (clojure.spec.alpha/? :portkey.aws.iam/list-open-id-connect-providers-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-open-id-connect-providers-response))

(clojure.core/defn list-access-keys ([] (list-access-keys {})) ([list-access-keys-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-access-keys-request list-access-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-access-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-access-keys-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAccessKeysResult", :http.request.configuration/action "ListAccessKeys", :http.request.configuration/output-deser-fn response-list-access-keys-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-access-keys :args (clojure.spec.alpha/? :portkey.aws.iam/list-access-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-access-keys-response))

(clojure.core/defn delete-virtual-mfa-device ([delete-virtual-mfa-device-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-virtual-mfa-device-request delete-virtual-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-virtual-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVirtualMFADevice", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-virtual-mfa-device-request) :ret clojure.core/true?)

(clojure.core/defn get-group-policy ([get-group-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-group-policy-request get-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-group-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetGroupPolicyResult", :http.request.configuration/action "GetGroupPolicy", :http.request.configuration/output-deser-fn response-get-group-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-group-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-group-policy-response))

(clojure.core/defn put-user-permissions-boundary ([put-user-permissions-boundary-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-user-permissions-boundary-request put-user-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-user-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutUserPermissionsBoundary", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-user-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-user-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn create-policy ([create-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-policy-request create-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreatePolicyResult", :http.request.configuration/action "CreatePolicy", :http.request.configuration/output-deser-fn response-create-policy-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-policy-response))

(clojure.core/defn tag-user ([tag-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-tag-user-request tag-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/tag-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef tag-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/tag-user-request) :ret clojure.core/true?)

(clojure.core/defn list-users ([] (list-users {})) ([list-users-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-users-request list-users-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-users-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-users-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListUsersResult", :http.request.configuration/action "ListUsers", :http.request.configuration/output-deser-fn response-list-users-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-users :args (clojure.spec.alpha/? :portkey.aws.iam/list-users-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-users-response))

(clojure.core/defn list-role-policies ([list-role-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-role-policies-request list-role-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-role-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-role-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListRolePoliciesResult", :http.request.configuration/action "ListRolePolicies", :http.request.configuration/output-deser-fn response-list-role-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-role-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-role-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-role-policies-response))

(clojure.core/defn delete-user-policy ([delete-user-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-user-policy-request delete-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUserPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn create-account-alias ([create-account-alias-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-account-alias-request create-account-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-account-alias-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAccountAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-account-alias :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-account-alias-request) :ret clojure.core/true?)

(clojure.core/defn delete-service-linked-role ([delete-service-linked-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-service-linked-role-request delete-service-linked-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/delete-service-linked-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-service-linked-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteServiceLinkedRoleResult", :http.request.configuration/action "DeleteServiceLinkedRole", :http.request.configuration/output-deser-fn response-delete-service-linked-role-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-service-linked-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-service-linked-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/delete-service-linked-role-response))

(clojure.core/defn update-server-certificate ([update-server-certificate-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-server-certificate-request update-server-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-server-certificate-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateServerCertificate", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-server-certificate :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-server-certificate-request) :ret clojure.core/true?)

(clojure.core/defn simulate-principal-policy ([simulate-principal-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-simulate-principal-policy-request simulate-principal-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/simulate-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/simulate-principal-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SimulatePrincipalPolicyResult", :http.request.configuration/action "SimulatePrincipalPolicy", :http.request.configuration/output-deser-fn response-simulate-policy-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}})))))
(clojure.spec.alpha/fdef simulate-principal-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-principal-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn list-server-certificates ([] (list-server-certificates {})) ([list-server-certificates-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-server-certificates-request list-server-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-server-certificates-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-server-certificates-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListServerCertificatesResult", :http.request.configuration/action "ListServerCertificates", :http.request.configuration/output-deser-fn response-list-server-certificates-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-server-certificates :args (clojure.spec.alpha/? :portkey.aws.iam/list-server-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-server-certificates-response))

(clojure.core/defn get-role ([get-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-role-request get-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetRoleResult", :http.request.configuration/action "GetRole", :http.request.configuration/output-deser-fn response-get-role-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-role-response))

(clojure.core/defn put-group-policy ([put-group-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-group-policy-request put-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutGroupPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "MalformedPolicyDocumentException" :portkey.aws.iam/malformed-policy-document-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn list-virtual-mfa-devices ([] (list-virtual-mfa-devices {})) ([list-virtual-mfa-devices-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-virtual-mfa-devices-request list-virtual-mfa-devices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-virtual-mfa-devices-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-virtual-mfa-devices-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListVirtualMFADevicesResult", :http.request.configuration/action "ListVirtualMFADevices", :http.request.configuration/output-deser-fn response-list-virtual-mfa-devices-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-virtual-mfa-devices :args (clojure.spec.alpha/? :portkey.aws.iam/list-virtual-mfa-devices-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-virtual-mfa-devices-response))

(clojure.core/defn list-role-tags ([list-role-tags-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-role-tags-request list-role-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-role-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-role-tags-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListRoleTagsResult", :http.request.configuration/action "ListRoleTags", :http.request.configuration/output-deser-fn response-list-role-tags-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-role-tags :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-role-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-role-tags-response))

(clojure.core/defn generate-credential-report ([] (generate-credential-report {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/generate-credential-report-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GenerateCredentialReportResult", :http.request.configuration/action "GenerateCredentialReport", :http.request.configuration/output-deser-fn response-generate-credential-report-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef generate-credential-report :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.iam/generate-credential-report-response))

(clojure.core/defn delete-access-key ([delete-access-key-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-access-key-request delete-access-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-access-key-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccessKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-access-key :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-access-key-request) :ret clojure.core/true?)

(clojure.core/defn get-service-last-accessed-details ([get-service-last-accessed-details-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-service-last-accessed-details-request get-service-last-accessed-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-service-last-accessed-details-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-service-last-accessed-details-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetServiceLastAccessedDetailsResult", :http.request.configuration/action "GetServiceLastAccessedDetails", :http.request.configuration/output-deser-fn response-get-service-last-accessed-details-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception}})))))
(clojure.spec.alpha/fdef get-service-last-accessed-details :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-service-last-accessed-details-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-service-last-accessed-details-response))

(clojure.core/defn create-login-profile ([create-login-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-login-profile-request create-login-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-login-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-login-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLoginProfileResult", :http.request.configuration/action "CreateLoginProfile", :http.request.configuration/output-deser-fn response-create-login-profile-response, :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "PasswordPolicyViolationException" :portkey.aws.iam/password-policy-violation-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-login-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-login-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-login-profile-response))

(clojure.core/defn create-group ([create-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-group-request create-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-group-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateGroupResult", :http.request.configuration/action "CreateGroup", :http.request.configuration/output-deser-fn response-create-group-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-group-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-group-response))

(clojure.core/defn attach-user-policy ([attach-user-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-user-policy-request attach-user-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/attach-user-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachUserPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef attach-user-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/attach-user-policy-request) :ret clojure.core/true?)

(clojure.core/defn remove-user-from-group ([remove-user-from-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-remove-user-from-group-request remove-user-from-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/remove-user-from-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveUserFromGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef remove-user-from-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/remove-user-from-group-request) :ret clojure.core/true?)

(clojure.core/defn list-account-aliases ([] (list-account-aliases {})) ([list-account-aliases-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-account-aliases-request list-account-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-account-aliases-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-account-aliases-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListAccountAliasesResult", :http.request.configuration/action "ListAccountAliases", :http.request.configuration/output-deser-fn response-list-account-aliases-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-account-aliases :args (clojure.spec.alpha/? :portkey.aws.iam/list-account-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-account-aliases-response))

(clojure.core/defn update-role-description ([update-role-description-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-role-description-request update-role-description-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/update-role-description-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-role-description-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateRoleDescriptionResult", :http.request.configuration/action "UpdateRoleDescription", :http.request.configuration/output-deser-fn response-update-role-description-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-role-description :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-description-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-description-response))

(clojure.core/defn create-open-id-connect-provider ([create-open-id-connect-provider-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-open-id-connect-provider-request create-open-id-connect-provider-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-open-id-connect-provider-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-open-id-connect-provider-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateOpenIDConnectProviderResult", :http.request.configuration/action "CreateOpenIDConnectProvider", :http.request.configuration/output-deser-fn response-create-open-id-connect-provider-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-open-id-connect-provider :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-open-id-connect-provider-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-open-id-connect-provider-response))

(clojure.core/defn delete-group-policy ([delete-group-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-group-policy-request delete-group-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-group-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGroupPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-group-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-group-policy-request) :ret clojure.core/true?)

(clojure.core/defn tag-role ([tag-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-tag-role-request tag-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/tag-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagRole", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef tag-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/tag-role-request) :ret clojure.core/true?)

(clojure.core/defn get-instance-profile ([get-instance-profile-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-instance-profile-request get-instance-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-instance-profile-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-instance-profile-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetInstanceProfileResult", :http.request.configuration/action "GetInstanceProfile", :http.request.configuration/output-deser-fn response-get-instance-profile-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-instance-profile :args (clojure.spec.alpha/tuple :portkey.aws.iam/get-instance-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-instance-profile-response))

(clojure.core/defn get-account-authorization-details ([] (get-account-authorization-details {})) ([get-account-authorization-details-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-account-authorization-details-request get-account-authorization-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-account-authorization-details-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-account-authorization-details-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAccountAuthorizationDetailsResult", :http.request.configuration/action "GetAccountAuthorizationDetails", :http.request.configuration/output-deser-fn response-get-account-authorization-details-response, :http.request.spec/error-spec {"ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-account-authorization-details :args (clojure.spec.alpha/? :portkey.aws.iam/get-account-authorization-details-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-account-authorization-details-response))

(clojure.core/defn delete-policy ([delete-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-policy-request delete-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/delete-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "DeleteConflictException" :portkey.aws.iam/delete-conflict-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/delete-policy-request) :ret clojure.core/true?)

(clojure.core/defn update-user ([update-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-user-request update-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateUser", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "EntityTemporarilyUnmodifiableException" :portkey.aws.iam/entity-temporarily-unmodifiable-exception, "ConcurrentModificationException" :portkey.aws.iam/concurrent-modification-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-user :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-user-request) :ret clojure.core/true?)

(clojure.core/defn create-virtual-mfa-device ([create-virtual-mfa-device-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-virtual-mfa-device-request create-virtual-mfa-device-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/create-virtual-mfa-device-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/create-virtual-mfa-device-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateVirtualMFADeviceResult", :http.request.configuration/action "CreateVirtualMFADevice", :http.request.configuration/output-deser-fn response-create-virtual-mfa-device-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "EntityAlreadyExistsException" :portkey.aws.iam/entity-already-exists-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef create-virtual-mfa-device :args (clojure.spec.alpha/tuple :portkey.aws.iam/create-virtual-mfa-device-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/create-virtual-mfa-device-response))

(clojure.core/defn add-user-to-group ([add-user-to-group-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-add-user-to-group-request add-user-to-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/add-user-to-group-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddUserToGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "LimitExceededException" :portkey.aws.iam/limit-exceeded-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef add-user-to-group :args (clojure.spec.alpha/tuple :portkey.aws.iam/add-user-to-group-request) :ret clojure.core/true?)

(clojure.core/defn update-role ([update-role-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-role-request update-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/update-role-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/update-role-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateRoleResult", :http.request.configuration/action "UpdateRole", :http.request.configuration/output-deser-fn response-update-role-response, :http.request.spec/error-spec {"UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef update-role :args (clojure.spec.alpha/tuple :portkey.aws.iam/update-role-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/update-role-response))

(clojure.core/defn put-role-permissions-boundary ([put-role-permissions-boundary-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-role-permissions-boundary-request put-role-permissions-boundary-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/put-role-permissions-boundary-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRolePermissionsBoundary", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "InvalidInputException" :portkey.aws.iam/invalid-input-exception, "UnmodifiableEntityException" :portkey.aws.iam/unmodifiable-entity-exception, "PolicyNotAttachableException" :portkey.aws.iam/policy-not-attachable-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef put-role-permissions-boundary :args (clojure.spec.alpha/tuple :portkey.aws.iam/put-role-permissions-boundary-request) :ret clojure.core/true?)

(clojure.core/defn list-user-policies ([list-user-policies-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-user-policies-request list-user-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-user-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-user-policies-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListUserPoliciesResult", :http.request.configuration/action "ListUserPolicies", :http.request.configuration/output-deser-fn response-list-user-policies-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef list-user-policies :args (clojure.spec.alpha/tuple :portkey.aws.iam/list-user-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-user-policies-response))

(clojure.core/defn simulate-custom-policy ([simulate-custom-policy-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-simulate-custom-policy-request simulate-custom-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/simulate-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/simulate-custom-policy-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SimulateCustomPolicyResult", :http.request.configuration/action "SimulateCustomPolicy", :http.request.configuration/output-deser-fn response-simulate-policy-response, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.iam/invalid-input-exception, "PolicyEvaluationException" :portkey.aws.iam/policy-evaluation-exception}})))))
(clojure.spec.alpha/fdef simulate-custom-policy :args (clojure.spec.alpha/tuple :portkey.aws.iam/simulate-custom-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/simulate-policy-response))

(clojure.core/defn list-ssh-public-keys ([] (list-ssh-public-keys {})) ([list-ssh-public-keys-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-ssh-public-keys-request list-ssh-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/list-ssh-public-keys-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/list-ssh-public-keys-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListSSHPublicKeysResult", :http.request.configuration/action "ListSSHPublicKeys", :http.request.configuration/output-deser-fn response-list-ssh-public-keys-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception}})))))
(clojure.spec.alpha/fdef list-ssh-public-keys :args (clojure.spec.alpha/? :portkey.aws.iam/list-ssh-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/list-ssh-public-keys-response))

(clojure.core/defn get-user ([] (get-user {})) ([get-user-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-user-request get-user-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.iam/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.iam/get-user-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2010-05-08", :http.request.configuration/service-id "IAM", :http.request.spec/input-spec :portkey.aws.iam/get-user-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetUserResult", :http.request.configuration/action "GetUser", :http.request.configuration/output-deser-fn response-get-user-response, :http.request.spec/error-spec {"NoSuchEntityException" :portkey.aws.iam/no-such-entity-exception, "ServiceFailureException" :portkey.aws.iam/service-failure-exception}})))))
(clojure.spec.alpha/fdef get-user :args (clojure.spec.alpha/? :portkey.aws.iam/get-user-request) :ret (clojure.spec.alpha/and :portkey.aws.iam/get-user-response))
