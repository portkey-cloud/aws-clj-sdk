(ns portkey.aws.ds.-2015-04-16 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ds", :region "ap-northeast-1"},
    :ssl-common-name "ds.ap-northeast-1.amazonaws.com",
    :endpoint "https://ds.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ds", :region "eu-west-1"},
    :ssl-common-name "ds.eu-west-1.amazonaws.com",
    :endpoint "https://ds.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ds", :region "us-east-2"},
    :ssl-common-name "ds.us-east-2.amazonaws.com",
    :endpoint "https://ds.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ds", :region "ap-southeast-2"},
    :ssl-common-name "ds.ap-southeast-2.amazonaws.com",
    :endpoint "https://ds.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ds", :region "cn-north-1"},
    :ssl-common-name "ds.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ds.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ds", :region "sa-east-1"},
    :ssl-common-name "ds.sa-east-1.amazonaws.com",
    :endpoint "https://ds.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ds", :region "ap-southeast-1"},
    :ssl-common-name "ds.ap-southeast-1.amazonaws.com",
    :endpoint "https://ds.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ds", :region "cn-northwest-1"},
    :ssl-common-name "ds.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ds.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ds", :region "ap-northeast-2"},
    :ssl-common-name "ds.ap-northeast-2.amazonaws.com",
    :endpoint "https://ds.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ds", :region "ca-central-1"},
    :ssl-common-name "ds.ca-central-1.amazonaws.com",
    :endpoint "https://ds.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ds", :region "eu-central-1"},
    :ssl-common-name "ds.eu-central-1.amazonaws.com",
    :endpoint "https://ds.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ds", :region "eu-west-2"},
    :ssl-common-name "ds.eu-west-2.amazonaws.com",
    :endpoint "https://ds.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ds", :region "us-west-2"},
    :ssl-common-name "ds.us-west-2.amazonaws.com",
    :endpoint "https://ds.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ds", :region "us-east-1"},
    :ssl-common-name "ds.us-east-1.amazonaws.com",
    :endpoint "https://ds.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ds", :region "us-west-1"},
    :ssl-common-name "ds.us-west-1.amazonaws.com",
    :endpoint "https://ds.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ds", :region "ap-south-1"},
    :ssl-common-name "ds.ap-south-1.amazonaws.com",
    :endpoint "https://ds.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-remote-domain-names)

(clojure.core/declare ser-ip-addr)

(clojure.core/declare ser-radius-display-label)

(clojure.core/declare ser-delete-associated-conditional-forwarder)

(clojure.core/declare ser-connect-password)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-trust-password)

(clojure.core/declare ser-create-snapshot-before-schema-extension)

(clojure.core/declare ser-password)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-use-same-username)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-ldif-content)

(clojure.core/declare ser-topic-name)

(clojure.core/declare ser-radius-shared-secret)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-topic-names)

(clojure.core/declare ser-target-type)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-desired-number-of-domain-controllers)

(clojure.core/declare ser-limit)

(clojure.core/declare ser-organizational-unit-dn)

(clojure.core/declare ser-trust-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-domain-controller-id)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-unshare-target)

(clojure.core/declare ser-user-name)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-trust-direction)

(clojure.core/declare ser-directory-short-name)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-servers)

(clojure.core/declare ser-radius-authentication-protocol)

(clojure.core/declare ser-share-target)

(clojure.core/declare ser-trust-id)

(clojure.core/declare ser-directory-ids)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-schema-extension-id)

(clojure.core/declare ser-radius-settings)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-ip-route)

(clojure.core/declare ser-customer-user-name)

(clojure.core/declare ser-share-method)

(clojure.core/declare ser-directory-size)

(clojure.core/declare ser-directory-connect-settings)

(clojure.core/declare ser-ip-routes)

(clojure.core/declare ser-log-group-name)

(clojure.core/declare ser-dns-ip-addrs)

(clojure.core/declare ser-server)

(clojure.core/declare ser-selective-auth)

(clojure.core/declare ser-radius-retries)

(clojure.core/declare ser-computer-password)

(clojure.core/declare ser-directory-edition)

(clojure.core/declare ser-radius-timeout)

(clojure.core/declare ser-cidr-ips)

(clojure.core/declare ser-directory-id)

(clojure.core/declare ser-trust-ids)

(clojure.core/declare ser-remote-domain-name)

(clojure.core/declare ser-directory-name)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-user-password)

(clojure.core/declare ser-domain-controller-ids)

(clojure.core/declare ser-alias-name)

(clojure.core/declare ser-snapshot-ids)

(clojure.core/declare ser-directory-vpc-settings)

(clojure.core/declare ser-port-number)

(clojure.core/declare ser-notes)

(clojure.core/declare ser-computer-name)

(clojure.core/declare ser-snapshot-name)

(clojure.core/declare ser-cidr-ip)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-update-security-group-for-directory-controllers)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-remote-domain-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-remote-domain-name coll) #:http.request.field{:shape "RemoteDomainName"}))) input), :shape "RemoteDomainNames", :type "list"})

(clojure.core/defn- ser-ip-addr [input] #:http.request.field{:value input, :shape "IpAddr"})

(clojure.core/defn- ser-radius-display-label [input] #:http.request.field{:value input, :shape "RadiusDisplayLabel"})

(clojure.core/defn- ser-delete-associated-conditional-forwarder [input] #:http.request.field{:value input, :shape "DeleteAssociatedConditionalForwarder"})

(clojure.core/defn- ser-connect-password [input] #:http.request.field{:value input, :shape "ConnectPassword"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list"})

(clojure.core/defn- ser-trust-password [input] #:http.request.field{:value input, :shape "TrustPassword"})

(clojure.core/defn- ser-create-snapshot-before-schema-extension [input] #:http.request.field{:value input, :shape "CreateSnapshotBeforeSchemaExtension"})

(clojure.core/defn- ser-password [input] #:http.request.field{:value input, :shape "Password"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-use-same-username [input] #:http.request.field{:value input, :shape "UseSameUsername"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-ldif-content [input] #:http.request.field{:value input, :shape "LdifContent"})

(clojure.core/defn- ser-topic-name [input] #:http.request.field{:value input, :shape "TopicName"})

(clojure.core/defn- ser-radius-shared-secret [input] #:http.request.field{:value input, :shape "RadiusSharedSecret"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-topic-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-topic-name coll) #:http.request.field{:shape "TopicName"}))) input), :shape "TopicNames", :type "list"})

(clojure.core/defn- ser-target-type [input] #:http.request.field{:value (clojure.core/get {"ACCOUNT" "ACCOUNT", :account "ACCOUNT"} input), :shape "TargetType"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-desired-number-of-domain-controllers [input] #:http.request.field{:value input, :shape "DesiredNumberOfDomainControllers"})

(clojure.core/defn- ser-limit [input] #:http.request.field{:value input, :shape "Limit"})

(clojure.core/defn- ser-organizational-unit-dn [input] #:http.request.field{:value input, :shape "OrganizationalUnitDN"})

(clojure.core/defn- ser-trust-type [input] #:http.request.field{:value (clojure.core/get {"Forest" "Forest", :forest "Forest", "External" "External", :external "External"} input), :shape "TrustType"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Attribute", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name (input :name)) #:http.request.field{:name "Name", :shape "AttributeName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AttributeValue"}))))

(clojure.core/defn- ser-domain-controller-id [input] #:http.request.field{:value input, :shape "DomainControllerId"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-unshare-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"}) (clojure.core/into (ser-target-type (:type input)) #:http.request.field{:name "Type", :shape "TargetType"})], :shape "UnshareTarget", :type "structure"}))

(clojure.core/defn- ser-user-name [input] #:http.request.field{:value input, :shape "UserName"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "Attributes", :type "list"})

(clojure.core/defn- ser-trust-direction [input] #:http.request.field{:value (clojure.core/get {"One-Way: Outgoing" "One-Way: Outgoing", :one-way-outgoing "One-Way: Outgoing", "One-Way: Incoming" "One-Way: Incoming", :one-way-incoming "One-Way: Incoming", "Two-Way" "Two-Way", :two-way "Two-Way"} input), :shape "TrustDirection"})

(clojure.core/defn- ser-directory-short-name [input] #:http.request.field{:value input, :shape "DirectoryShortName"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-servers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-server coll) #:http.request.field{:shape "Server"}))) input), :shape "Servers", :type "list"})

(clojure.core/defn- ser-radius-authentication-protocol [input] #:http.request.field{:value (clojure.core/get {"PAP" "PAP", :pap "PAP", "CHAP" "CHAP", :chap "CHAP", "MS-CHAPv1" "MS-CHAPv1", :mscha-pv-1 "MS-CHAPv1", "MS-CHAPv2" "MS-CHAPv2", :mscha-pv-2 "MS-CHAPv2"} input), :shape "RadiusAuthenticationProtocol"})

(clojure.core/defn- ser-share-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"}) (clojure.core/into (ser-target-type (:type input)) #:http.request.field{:name "Type", :shape "TargetType"})], :shape "ShareTarget", :type "structure"}))

(clojure.core/defn- ser-trust-id [input] #:http.request.field{:value input, :shape "TrustId"})

(clojure.core/defn- ser-directory-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-directory-id coll) #:http.request.field{:shape "DirectoryId"}))) input), :shape "DirectoryIds", :type "list"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-schema-extension-id [input] #:http.request.field{:value input, :shape "SchemaExtensionId"})

(clojure.core/defn- ser-radius-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RadiusSettings", :type "structure"} (clojure.core/contains? input :radius-servers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-servers (input :radius-servers)) #:http.request.field{:name "RadiusServers", :shape "Servers"})) (clojure.core/contains? input :radius-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-number (input :radius-port)) #:http.request.field{:name "RadiusPort", :shape "PortNumber"})) (clojure.core/contains? input :radius-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-timeout (input :radius-timeout)) #:http.request.field{:name "RadiusTimeout", :shape "RadiusTimeout"})) (clojure.core/contains? input :radius-retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-retries (input :radius-retries)) #:http.request.field{:name "RadiusRetries", :shape "RadiusRetries"})) (clojure.core/contains? input :shared-secret) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-shared-secret (input :shared-secret)) #:http.request.field{:name "SharedSecret", :shape "RadiusSharedSecret"})) (clojure.core/contains? input :authentication-protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-authentication-protocol (input :authentication-protocol)) #:http.request.field{:name "AuthenticationProtocol", :shape "RadiusAuthenticationProtocol"})) (clojure.core/contains? input :display-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-radius-display-label (input :display-label)) #:http.request.field{:name "DisplayLabel", :shape "RadiusDisplayLabel"})) (clojure.core/contains? input :use-same-username) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-use-same-username (input :use-same-username)) #:http.request.field{:name "UseSameUsername", :shape "UseSameUsername"}))))

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VpcId"})

(clojure.core/defn- ser-ip-route [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpRoute", :type "structure"} (clojure.core/contains? input :cidr-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cidr-ip (input :cidr-ip)) #:http.request.field{:name "CidrIp", :shape "CidrIp"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- ser-customer-user-name [input] #:http.request.field{:value input, :shape "CustomerUserName"})

(clojure.core/defn- ser-share-method [input] #:http.request.field{:value (clojure.core/get {"ORGANIZATIONS" "ORGANIZATIONS", :organizations "ORGANIZATIONS", "HANDSHAKE" "HANDSHAKE", :handshake "HANDSHAKE"} input), :shape "ShareMethod"})

(clojure.core/defn- ser-directory-size [input] #:http.request.field{:value (clojure.core/get {"Small" "Small", :small "Small", "Large" "Large", :large "Large"} input), :shape "DirectorySize"})

(clojure.core/defn- ser-directory-connect-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-id (:vpc-id input)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (:subnet-ids input)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"}) (clojure.core/into (ser-dns-ip-addrs (:customer-dns-ips input)) #:http.request.field{:name "CustomerDnsIps", :shape "DnsIpAddrs"}) (clojure.core/into (ser-user-name (:customer-user-name input)) #:http.request.field{:name "CustomerUserName", :shape "UserName"})], :shape "DirectoryConnectSettings", :type "structure"}))

(clojure.core/defn- ser-ip-routes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-route coll) #:http.request.field{:shape "IpRoute"}))) input), :shape "IpRoutes", :type "list"})

(clojure.core/defn- ser-log-group-name [input] #:http.request.field{:value input, :shape "LogGroupName"})

(clojure.core/defn- ser-dns-ip-addrs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-addr coll) #:http.request.field{:shape "IpAddr"}))) input), :shape "DnsIpAddrs", :type "list"})

(clojure.core/defn- ser-server [input] #:http.request.field{:value input, :shape "Server"})

(clojure.core/defn- ser-selective-auth [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "SelectiveAuth"})

(clojure.core/defn- ser-radius-retries [input] #:http.request.field{:value input, :shape "RadiusRetries"})

(clojure.core/defn- ser-computer-password [input] #:http.request.field{:value input, :shape "ComputerPassword"})

(clojure.core/defn- ser-directory-edition [input] #:http.request.field{:value (clojure.core/get {"Enterprise" "Enterprise", :enterprise "Enterprise", "Standard" "Standard", :standard "Standard"} input), :shape "DirectoryEdition"})

(clojure.core/defn- ser-radius-timeout [input] #:http.request.field{:value input, :shape "RadiusTimeout"})

(clojure.core/defn- ser-cidr-ips [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cidr-ip coll) #:http.request.field{:shape "CidrIp"}))) input), :shape "CidrIps", :type "list"})

(clojure.core/defn- ser-directory-id [input] #:http.request.field{:value input, :shape "DirectoryId"})

(clojure.core/defn- ser-trust-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trust-id coll) #:http.request.field{:shape "TrustId"}))) input), :shape "TrustIds", :type "list"})

(clojure.core/defn- ser-remote-domain-name [input] #:http.request.field{:value input, :shape "RemoteDomainName"})

(clojure.core/defn- ser-directory-name [input] #:http.request.field{:value input, :shape "DirectoryName"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-user-password [input] #:http.request.field{:value input, :shape "UserPassword"})

(clojure.core/defn- ser-domain-controller-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-controller-id coll) #:http.request.field{:shape "DomainControllerId"}))) input), :shape "DomainControllerIds", :type "list"})

(clojure.core/defn- ser-alias-name [input] #:http.request.field{:value input, :shape "AliasName"})

(clojure.core/defn- ser-snapshot-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-snapshot-id coll) #:http.request.field{:shape "SnapshotId"}))) input), :shape "SnapshotIds", :type "list"})

(clojure.core/defn- ser-directory-vpc-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-id (:vpc-id input)) #:http.request.field{:name "VpcId", :shape "VpcId"}) (clojure.core/into (ser-subnet-ids (:subnet-ids input)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})], :shape "DirectoryVpcSettings", :type "structure"}))

(clojure.core/defn- ser-port-number [input] #:http.request.field{:value input, :shape "PortNumber"})

(clojure.core/defn- ser-notes [input] #:http.request.field{:value input, :shape "Notes"})

(clojure.core/defn- ser-computer-name [input] #:http.request.field{:value input, :shape "ComputerName"})

(clojure.core/defn- ser-snapshot-name [input] #:http.request.field{:value input, :shape "SnapshotName"})

(clojure.core/defn- ser-cidr-ip [input] #:http.request.field{:value input, :shape "CidrIp"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-update-security-group-for-directory-controllers [input] #:http.request.field{:value input, :shape "UpdateSecurityGroupForDirectoryControllers"})

(clojure.core/defn- req-describe-snapshots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :snapshot-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-ids (input :snapshot-ids)) #:http.request.field{:name "SnapshotIds", :shape "SnapshotIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-create-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-dns-ip-addrs (input :dns-ip-addrs)) #:http.request.field{:name "DnsIpAddrs", :shape "DnsIpAddrs"})]}))

(clojure.core/defn- req-get-directory-limits-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-describe-directories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-ids (input :directory-ids)) #:http.request.field{:name "DirectoryIds", :shape "DirectoryIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-connect-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}) (clojure.core/into (ser-directory-size (input :size)) #:http.request.field{:name "Size", :shape "DirectorySize"}) (clojure.core/into (ser-directory-connect-settings (input :connect-settings)) #:http.request.field{:name "ConnectSettings", :shape "DirectoryConnectSettings"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- req-create-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"}) (clojure.core/into (ser-directory-size (input :size)) #:http.request.field{:name "Size", :shape "DirectorySize"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :vpc-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-vpc-settings (input :vpc-settings)) #:http.request.field{:name "VpcSettings", :shape "DirectoryVpcSettings"}))))

(clojure.core/defn- req-reject-shared-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :shared-directory-id)) #:http.request.field{:name "SharedDirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-start-schema-extension-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-create-snapshot-before-schema-extension (input :create-snapshot-before-schema-extension)) #:http.request.field{:name "CreateSnapshotBeforeSchemaExtension", :shape "CreateSnapshotBeforeSchemaExtension"}) (clojure.core/into (ser-ldif-content (input :ldif-content)) #:http.request.field{:name "LdifContent", :shape "LdifContent"}) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})]}))

(clojure.core/defn- req-create-microsoft-ad-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"}) (clojure.core/into (ser-password (input :password)) #:http.request.field{:name "Password", :shape "Password"}) (clojure.core/into (ser-directory-vpc-settings (input :vpc-settings)) #:http.request.field{:name "VpcSettings", :shape "DirectoryVpcSettings"})]} (clojure.core/contains? input :short-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-short-name (input :short-name)) #:http.request.field{:name "ShortName", :shape "DirectoryShortName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :edition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-edition (input :edition)) #:http.request.field{:name "Edition", :shape "DirectoryEdition"}))))

(clojure.core/defn- req-create-log-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "LogGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-create-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-name (input :name)) #:http.request.field{:name "Name", :shape "SnapshotName"}))))

(clojure.core/defn- req-delete-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-update-number-of-domain-controllers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-desired-number-of-domain-controllers (input :desired-number)) #:http.request.field{:name "DesiredNumber", :shape "DesiredNumberOfDomainControllers"})]}))

(clojure.core/defn- req-list-schema-extensions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-share-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-share-target (input :share-target)) #:http.request.field{:name "ShareTarget", :shape "ShareTarget"}) (clojure.core/into (ser-share-method (input :share-method)) #:http.request.field{:name "ShareMethod", :shape "ShareMethod"})]} (clojure.core/contains? input :share-notes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notes (input :share-notes)) #:http.request.field{:name "ShareNotes", :shape "Notes"}))))

(clojure.core/defn- req-reset-user-password-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-customer-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "CustomerUserName"}) (clojure.core/into (ser-user-password (input :new-password)) #:http.request.field{:name "NewPassword", :shape "UserPassword"})]}))

(clojure.core/defn- req-delete-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})]}))

(clojure.core/defn- req-update-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-dns-ip-addrs (input :dns-ip-addrs)) #:http.request.field{:name "DnsIpAddrs", :shape "DnsIpAddrs"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-add-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-ip-routes (input :ip-routes)) #:http.request.field{:name "IpRoutes", :shape "IpRoutes"})]} (clojure.core/contains? input :update-security-group-for-directory-controllers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-security-group-for-directory-controllers (input :update-security-group-for-directory-controllers)) #:http.request.field{:name "UpdateSecurityGroupForDirectoryControllers", :shape "UpdateSecurityGroupForDirectoryControllers"}))))

(clojure.core/defn- req-accept-shared-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :shared-directory-id)) #:http.request.field{:name "SharedDirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-deregister-event-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-topic-name (input :topic-name)) #:http.request.field{:name "TopicName", :shape "TopicName"})]}))

(clojure.core/defn- req-create-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"}) (clojure.core/into (ser-trust-password (input :trust-password)) #:http.request.field{:name "TrustPassword", :shape "TrustPassword"}) (clojure.core/into (ser-trust-direction (input :trust-direction)) #:http.request.field{:name "TrustDirection", :shape "TrustDirection"})]} (clojure.core/contains? input :trust-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trust-type (input :trust-type)) #:http.request.field{:name "TrustType", :shape "TrustType"})) (clojure.core/contains? input :conditional-forwarder-ip-addrs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-ip-addrs (input :conditional-forwarder-ip-addrs)) #:http.request.field{:name "ConditionalForwarderIpAddrs", :shape "DnsIpAddrs"})) (clojure.core/contains? input :selective-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selective-auth (input :selective-auth)) #:http.request.field{:name "SelectiveAuth", :shape "SelectiveAuth"}))))

(clojure.core/defn- req-enable-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-radius-settings (input :radius-settings)) #:http.request.field{:name "RadiusSettings", :shape "RadiusSettings"})]}))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-alias-name (input :alias)) #:http.request.field{:name "Alias", :shape "AliasName"})]}))

(clojure.core/defn- req-disable-sso-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}))))

(clojure.core/defn- req-cancel-schema-extension-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-schema-extension-id (input :schema-extension-id)) #:http.request.field{:name "SchemaExtensionId", :shape "SchemaExtensionId"})]}))

(clojure.core/defn- req-get-snapshot-limits-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-describe-trusts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :trust-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trust-ids (input :trust-ids)) #:http.request.field{:name "TrustIds", :shape "TrustIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-enable-sso-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :user-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "UserName"})) (clojure.core/contains? input :password) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connect-password (input :password)) #:http.request.field{:name "Password", :shape "ConnectPassword"}))))

(clojure.core/defn- req-unshare-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-unshare-target (input :unshare-target)) #:http.request.field{:name "UnshareTarget", :shape "UnshareTarget"})]}))

(clojure.core/defn- req-describe-event-topics-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :topic-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-topic-names (input :topic-names)) #:http.request.field{:name "TopicNames", :shape "TopicNames"}))))

(clojure.core/defn- req-restore-from-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})]}))

(clojure.core/defn- req-update-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]} (clojure.core/contains? input :selective-auth) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selective-auth (input :selective-auth)) #:http.request.field{:name "SelectiveAuth", :shape "SelectiveAuth"}))))

(clojure.core/defn- req-list-log-subscriptions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :directory-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-remove-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-cidr-ips (input :cidr-ips)) #:http.request.field{:name "CidrIps", :shape "CidrIps"})]}))

(clojure.core/defn- req-remove-tags-from-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-describe-shared-directories-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :owner-directory-id)) #:http.request.field{:name "OwnerDirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :shared-directory-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-ids (input :shared-directory-ids)) #:http.request.field{:name "SharedDirectoryIds", :shape "DirectoryIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-delete-log-subscription-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-describe-conditional-forwarders-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :remote-domain-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-remote-domain-names (input :remote-domain-names)) #:http.request.field{:name "RemoteDomainNames", :shape "RemoteDomainNames"}))))

(clojure.core/defn- req-list-ip-routes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-register-event-topic-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-topic-name (input :topic-name)) #:http.request.field{:name "TopicName", :shape "TopicName"})]}))

(clojure.core/defn- req-disable-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]}))

(clojure.core/defn- req-verify-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]}))

(clojure.core/defn- req-add-tags-to-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-domain-controllers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"})]} (clojure.core/contains? input :domain-controller-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-controller-ids (input :domain-controller-ids)) #:http.request.field{:name "DomainControllerIds", :shape "DomainControllerIds"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit (input :limit)) #:http.request.field{:name "Limit", :shape "Limit"}))))

(clojure.core/defn- req-update-radius-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-radius-settings (input :radius-settings)) #:http.request.field{:name "RadiusSettings", :shape "RadiusSettings"})]}))

(clojure.core/defn- req-create-computer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-computer-name (input :computer-name)) #:http.request.field{:name "ComputerName", :shape "ComputerName"}) (clojure.core/into (ser-computer-password (input :password)) #:http.request.field{:name "Password", :shape "ComputerPassword"})]} (clojure.core/contains? input :organizational-unit-distinguished-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit-dn (input :organizational-unit-distinguished-name)) #:http.request.field{:name "OrganizationalUnitDistinguishedName", :shape "OrganizationalUnitDN"})) (clojure.core/contains? input :computer-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :computer-attributes)) #:http.request.field{:name "ComputerAttributes", :shape "Attributes"}))))

(clojure.core/defn- req-delete-trust-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-trust-id (input :trust-id)) #:http.request.field{:name "TrustId", :shape "TrustId"})]} (clojure.core/contains? input :delete-associated-conditional-forwarder) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-delete-associated-conditional-forwarder (input :delete-associated-conditional-forwarder)) #:http.request.field{:name "DeleteAssociatedConditionalForwarder", :shape "DeleteAssociatedConditionalForwarder"}))))

(clojure.core/defn- req-delete-conditional-forwarder-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-id (input :directory-id)) #:http.request.field{:name "DirectoryId", :shape "DirectoryId"}) (clojure.core/into (ser-remote-domain-name (input :remote-domain-name)) #:http.request.field{:name "RemoteDomainName", :shape "RemoteDomainName"})]}))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/tag-key))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/tags :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-snapshots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/snapshot-ids :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/remote-domain-name :portkey.aws.ds.-2015-04-16/dns-ip-addrs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/get-directory-limits-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-directories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-ids :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.connect-directory-request/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.connect-directory-request/short-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.connect-directory-request/password (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.connect-directory-request/size (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.connect-directory-request/connect-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-connect-settings))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/connect-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.connect-directory-request/name :portkey.aws.ds.-2015-04-16.connect-directory-request/password :portkey.aws.ds.-2015-04-16.connect-directory-request/size :portkey.aws.ds.-2015-04-16.connect-directory-request/connect-settings] :opt-un [:portkey.aws.ds.-2015-04-16.connect-directory-request/short-name :portkey.aws.ds.-2015-04-16/description]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-directory-request/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-directory-request/short-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-directory-request/size (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-directory-request/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-vpc-settings))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.create-directory-request/name :portkey.aws.ds.-2015-04-16/password :portkey.aws.ds.-2015-04-16.create-directory-request/size] :opt-un [:portkey.aws.ds.-2015-04-16.create-directory-request/short-name :portkey.aws.ds.-2015-04-16/description :portkey.aws.ds.-2015-04-16.create-directory-request/vpc-settings]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remote-domain-names (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/remote-domain-name))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-addr (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-event-topics-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/event-topics]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.reject-shared-directory-request/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/reject-shared-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.reject-shared-directory-request/shared-directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.organizations-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/organizations-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.organizations-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/conditional-forwarder (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/remote-domain-name :portkey.aws.ds.-2015-04-16/dns-ip-addrs :portkey.aws.ds.-2015-04-16/replication-scope]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/start-schema-extension-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/create-snapshot-before-schema-extension :portkey.aws.ds.-2015-04-16/ldif-content :portkey.aws.ds.-2015-04-16/description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshots (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/snapshot))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-route-status-msg #{"AddFailed" :adding "Removed" "RemoveFailed" :removing :added "Removing" "Added" :add-failed "Adding" :remove-failed :removed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-display-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/short-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-vpc-settings))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/edition (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-edition))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-microsoft-ad-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/name :portkey.aws.ds.-2015-04-16/password :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/vpc-settings] :opt-un [:portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/short-name :portkey.aws.ds.-2015-04-16/description :portkey.aws.ds.-2015-04-16.create-microsoft-ad-request/edition]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-log-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/connected-directories-limit (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/connected-directories-current-count (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-directories-limit (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-directories-current-count (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-current-count (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-limit (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-limit-reached (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/cloud-only-directories-limit-reached))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-limits/connected-directories-limit :portkey.aws.ds.-2015-04-16.directory-limits/connected-directories-current-count :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-directories-limit :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-directories-current-count :portkey.aws.ds.-2015-04-16/cloud-only-directories-limit-reached :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-current-count :portkey.aws.ds.-2015-04-16/connected-directories-limit-reached :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-limit :portkey.aws.ds.-2015-04-16.directory-limits/cloud-only-microsoft-ad-limit-reached]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-snapshot-request/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/snapshot-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16.create-snapshot-request/name]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-associated-conditional-forwarder clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.entity-does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.entity-does-not-exist-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/created-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/connect-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-already-shared-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-already-shared-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-already-shared-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/conditional-forwarders]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([A-Fa-f0-9]{8}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{4}-[A-Fa-f0-9]{12})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/subnet-id))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.client-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.client-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.ip-route-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-route-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.ip-route-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.update-number-of-domain-controllers-request/desired-number (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/desired-number-of-domain-controllers))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.update-number-of-domain-controllers-request/desired-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/customer-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(\d{12})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-addrs (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/ip-addr))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-schema-extensions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.share-directory-request/share-notes (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/notes))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/share-target :portkey.aws.ds.-2015-04-16/share-method] :opt-un [:portkey.aws.ds.-2015-04-16.share-directory-request/share-notes]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(.|\s)*\S(.|\s)*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-snapshot-before-schema-extension clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller-status #{:deleted "Failed" "Active" "Creating" :creating "Restoring" :restoring :deleting "Deleting" "Deleted" :active :impaired "Impaired" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(?=^.{8,64}$)((?=.*\d)(?=.*[A-Z])(?=.*[a-z])|(?=.*\d)(?=.*[^A-Za-z0-9\s])(?=.*[a-z])|(?=.*[^A-Za-z0-9\s])(?=.*[A-Z])(?=.*[a-z])|(?=.*\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9\s]))^.*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/enable-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot-limits/manual-snapshots-limit (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot-limits/manual-snapshots-current-count (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/limit))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-limits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.snapshot-limits/manual-snapshots-limit :portkey.aws.ds.-2015-04-16.snapshot-limits/manual-snapshots-current-count :portkey.aws.ds.-2015-04-16/manual-snapshots-limit-reached]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/ip-routes-info :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.reset-user-password-request/user-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/customer-user-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.reset-user-password-request/new-password (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/user-password))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/reset-user-password-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.reset-user-password-request/user-name :portkey.aws.ds.-2015-04-16.reset-user-password-request/new-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__)))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.owner-directory-description/account-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.owner-directory-description/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-vpc-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/owner-directory-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.owner-directory-description/account-id :portkey.aws.ds.-2015-04-16/dns-ip-addrs :portkey.aws.ds.-2015-04-16.owner-directory-description/vpc-settings :portkey.aws.ds.-2015-04-16/radius-settings :portkey.aws.ds.-2015-04-16/radius-status]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/snapshot-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.event-topic/status (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/topic-status))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/event-topic (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/topic-name :portkey.aws.ds.-2015-04-16/topic-arn :portkey.aws.ds.-2015-04-16/created-date-time :portkey.aws.ds.-2015-04-16.event-topic/status]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/use-same-username clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(subnet-[0-9a-f]{8}|subnet-[0-9a-f]{17})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-alias-result/alias (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-alias-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.create-alias-result/alias]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.share-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.share-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-trusts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/trusts :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/stage-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/start-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/remote-domain-name :portkey.aws.ds.-2015-04-16/dns-ip-addrs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/manual-snapshots-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ldif-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 500000))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/resource-id] :opt-un [:portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/type (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-type))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/edition (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-edition))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/alias (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/short-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-short-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/share-notes (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/notes))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/size (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-size))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/connect-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-connect-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/stage-last-updated-date-time (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/last-updated-date-time))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/vpc-settings (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-vpc-settings-description))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-description/stage (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-stage))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-description/type :portkey.aws.ds.-2015-04-16/owner-directory-description :portkey.aws.ds.-2015-04-16/stage-reason :portkey.aws.ds.-2015-04-16.directory-description/edition :portkey.aws.ds.-2015-04-16.directory-description/alias :portkey.aws.ds.-2015-04-16.directory-description/short-name :portkey.aws.ds.-2015-04-16/desired-number-of-domain-controllers :portkey.aws.ds.-2015-04-16/share-status :portkey.aws.ds.-2015-04-16.directory-description/share-notes :portkey.aws.ds.-2015-04-16/sso-enabled :portkey.aws.ds.-2015-04-16/description :portkey.aws.ds.-2015-04-16/radius-settings :portkey.aws.ds.-2015-04-16/share-method :portkey.aws.ds.-2015-04-16.directory-description/size :portkey.aws.ds.-2015-04-16/dns-ip-addrs :portkey.aws.ds.-2015-04-16/access-url :portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.directory-description/connect-settings :portkey.aws.ds.-2015-04-16.directory-description/stage-last-updated-date-time :portkey.aws.ds.-2015-04-16.directory-description/name :portkey.aws.ds.-2015-04-16/launch-time :portkey.aws.ds.-2015-04-16/radius-status :portkey.aws.ds.-2015-04-16.directory-description/vpc-settings :portkey.aws.ds.-2015-04-16.directory-description/stage]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/topic-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/schema-extension-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/add-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/ip-routes] :opt-un [:portkey.aws.ds.-2015-04-16/update-security-group-for-directory-controllers]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.invalid-target-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.invalid-target-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-descriptions :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-schema-extensions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/schema-extensions-info :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/register-event-topic-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-shared-secret (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 8 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.share-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.share-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.service-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.service-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remove-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/disable-sso-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/topic-names (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/topic-name))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.accept-shared-directory-request/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/accept-shared-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.accept-shared-directory-request/shared-directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/state-last-updated-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/target-type #{:account "ACCOUNT"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/deregister-event-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/topic-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-shared-directories-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/shared-directories :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tags (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/tag))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/desired-number-of-domain-controllers (clojure.spec.alpha/int-in 2 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/deregister-event-topic-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-route-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/cidr-ip :portkey.aws.ds.-2015-04-16/ip-route-status-msg :portkey.aws.ds.-2015-04-16/added-date-time :portkey.aws.ds.-2015-04-16/ip-route-status-reason :portkey.aws.ds.-2015-04-16/description]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-trust-request/conditional-forwarder-ip-addrs (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/dns-ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/remote-domain-name :portkey.aws.ds.-2015-04-16/trust-password :portkey.aws.ds.-2015-04-16/trust-direction] :opt-un [:portkey.aws.ds.-2015-04-16/trust-type :portkey.aws.ds.-2015-04-16.create-trust-request/conditional-forwarder-ip-addrs :portkey.aws.ds.-2015-04-16/selective-auth]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/get-directory-limits-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-limits]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/limit (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.tag-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.tag-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.invalid-password-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/invalid-password-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.invalid-password-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/organizational-unit-dn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-type #{"Forest" :external :forest "External"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/enable-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/radius-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/availability-zone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/request-id :portkey.aws.ds.-2015-04-16/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-type #{:manual "Auto" "Manual" :auto})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-vpc-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/vpc-id :portkey.aws.ds.-2015-04-16/subnet-ids :portkey.aws.ds.-2015-04-16/security-group-id :portkey.aws.ds.-2015-04-16/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-alias-request/alias (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/alias-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16.create-alias-request/alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.entity-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/entity-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.entity-already-exists-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-microsoft-ad-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.attribute/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/attribute-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.attribute/value (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/attribute-value))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.attribute/name :portkey.aws.ds.-2015-04-16.attribute/value]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.disable-sso-request/password (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/disable-sso-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/user-name :portkey.aws.ds.-2015-04-16.disable-sso-request/password]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controllers (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/domain-controller))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.invalid-next-token-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/log-subscriptions (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/log-subscription))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.reject-shared-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/reject-shared-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.reject-shared-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/cancel-schema-extension-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/schema-extension-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^dc-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.domain-controller-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.domain-controller-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.computer/computer-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/sid))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.computer/computer-attributes (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/attributes))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/computer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.computer/computer-id :portkey.aws.ds.-2015-04-16/computer-name :portkey.aws.ds.-2015-04-16.computer/computer-attributes]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[d]-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/cloud-only-directories-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.unshare-target/id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/target-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.unshare-target/type (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/target-type))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/unshare-target (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.unshare-target/id :portkey.aws.ds.-2015-04-16.unshare-target/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/attributes (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/attribute))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-direction #{:one-way-incoming :one-way-outgoing "One-Way: Incoming" "One-Way: Outgoing" "Two-Way" :two-way})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-short-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[^\\/:*?\"\<\>|.]+[^\\/:*?\"<>|]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-unavailable-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-state-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/get-snapshot-limits-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-status #{"Failed" "Creating" :creating :completed "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-trusts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/trust-ids :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-routes-info (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/ip-route-info))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.enable-sso-request/password (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/connect-password))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/enable-sso-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/user-name :portkey.aws.ds.-2015-04-16.enable-sso-request/password]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/unshare-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/unshare-target] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-event-topics-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/topic-names]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/event-topics (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/event-topic))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-status #{:deleted "Rejecting" :rejected "Rejected" :reject-failed :share-failed :rejecting :sharing :pending-acceptance :deleting "Deleting" "ShareFailed" "Deleted" "Sharing" :shared "Shared" "RejectFailed" "PendingAcceptance"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-not-shared-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-not-shared-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.directory-not-shared-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/added-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/servers (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/server))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-authentication-protocol #{:chap "PAP" "CHAP" :mscha-pv-1 :mscha-pv-2 :pap "MS-CHAPv1" "MS-CHAPv2"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.share-target/id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/target-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.share-target/type (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/target-type))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-target (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.share-target/id :portkey.aws.ds.-2015-04-16.share-target/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.unsupported-operation-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/unsupported-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.unsupported-operation-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-domain-controllers-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/domain-controllers :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^t-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-ids (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/directory-id))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/restore-from-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/snapshot-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/sso-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/verify-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/trust-id] :opt-un [:portkey.aws.ds.-2015-04-16/selective-auth]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/restore-from-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/schema-extension-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/schema-extension-id :portkey.aws.ds.-2015-04-16/description :portkey.aws.ds.-2015-04-16/schema-extension-status :portkey.aws.ds.-2015-04-16/schema-extension-status-reason :portkey.aws.ds.-2015-04-16/start-date-time :portkey.aws.ds.-2015-04-16/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(sg-[0-9a-f]{8}|sg-[0-9a-f]{17})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/schema-extension-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^e-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trusts (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/trust))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.radius-settings/radius-servers (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/servers))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.radius-settings/radius-port (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/port-number))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.radius-settings/shared-secret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/radius-shared-secret))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.radius-settings/authentication-protocol (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/radius-authentication-protocol))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.radius-settings/display-label (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/radius-display-label))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.radius-settings/radius-servers :portkey.aws.ds.-2015-04-16.radius-settings/radius-port :portkey.aws.ds.-2015-04-16/radius-timeout :portkey.aws.ds.-2015-04-16/radius-retries :portkey.aws.ds.-2015-04-16.radius-settings/shared-secret :portkey.aws.ds.-2015-04-16.radius-settings/authentication-protocol :portkey.aws.ds.-2015-04-16.radius-settings/display-label :portkey.aws.ds.-2015-04-16/use-same-username]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(vpc-[0-9a-f]{8}|vpc-[0-9a-f]{17})$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-route (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/cidr-ip :portkey.aws.ds.-2015-04-16/description]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/customer-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(?!.*\\|.*\"|.*\/|.*\[|.*\]|.*:|.*;|.*\||.*=|.*,|.*\+|.*\*|.*\?|.*<|.*>|.*@).*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/share-method #{"ORGANIZATIONS" :handshake :organizations "HANDSHAKE"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.unshare-directory-result/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/unshare-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.unshare-directory-result/shared-directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/shared-directories (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/shared-directory))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-size #{:large :small "Large" "Small"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.access-denied-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-connect-settings/customer-dns-ips (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/dns-ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-connect-settings/customer-user-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/user-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-connect-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/vpc-id :portkey.aws.ds.-2015-04-16/subnet-ids :portkey.aws.ds.-2015-04-16.directory-connect-settings/customer-dns-ips :portkey.aws.ds.-2015-04-16.directory-connect-settings/customer-user-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-routes (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/ip-route))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/replication-scope #{"Domain" :domain})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-type #{:microsoft-ad "SimpleAD" :simple-ad "MicrosoftAD" "SharedMicrosoftAD" :shared-microsoft-ad :ad-connector "ADConnector"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/last-updated-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-connect-settings-description/customer-user-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/user-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.directory-connect-settings-description/connect-ips (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/ip-addrs))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-connect-settings-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/vpc-id :portkey.aws.ds.-2015-04-16/subnet-ids :portkey.aws.ds.-2015-04-16.directory-connect-settings-description/customer-user-name :portkey.aws.ds.-2015-04-16/security-group-id :portkey.aws.ds.-2015-04-16/availability-zones :portkey.aws.ds.-2015-04-16.directory-connect-settings-description/connect-ips]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-snapshots-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/snapshots :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/topic-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-log-subscription-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot/type (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/snapshot-type))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot/name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/snapshot-name))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot/status (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/snapshot-status))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/snapshot-id :portkey.aws.ds.-2015-04-16.snapshot/type :portkey.aws.ds.-2015-04-16.snapshot/name :portkey.aws.ds.-2015-04-16.snapshot/status :portkey.aws.ds.-2015-04-16/start-time]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-log-subscriptions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/log-subscriptions :portkey.aws.ds.-2015-04-16/next-token]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.shared-directory/owner-account-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.shared-directory/shared-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.shared-directory/share-notes (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/notes))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.shared-directory/owner-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.shared-directory/shared-account-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/customer-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/shared-directory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/created-date-time :portkey.aws.ds.-2015-04-16.shared-directory/owner-account-id :portkey.aws.ds.-2015-04-16.shared-directory/shared-directory-id :portkey.aws.ds.-2015-04-16/share-status :portkey.aws.ds.-2015-04-16.shared-directory/share-notes :portkey.aws.ds.-2015-04-16/share-method :portkey.aws.ds.-2015-04-16/last-updated-date-time :portkey.aws.ds.-2015-04-16.shared-directory/owner-directory-id :portkey.aws.ds.-2015-04-16.shared-directory/shared-account-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/cancel-schema-extension-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.user-does-not-exist-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/user-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.user-does-not-exist-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-state #{"Verified" :deleted "Created" "Failed" "Creating" "UpdateFailed" :creating :updated :verify-failed "VerifyFailed" :created :deleting :update-failed "Deleting" "Deleted" :updating "Verifying" :verifying "Updating" :verified :failed "Updated"})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/log-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[-._/#A-Za-z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/dns-ip-addrs (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/ip-addr))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/access-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/get-snapshot-limits-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/snapshot-limits]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/server (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-computer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/computer]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/selective-auth #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-log-subscription-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/end-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-retries (clojure.spec.alpha/int-in 0 10))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/computer-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 8 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\u00FF]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/enable-sso-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/add-ip-routes-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-log-subscriptions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remove-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/cidr-ips] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/resource-id :portkey.aws.ds.-2015-04-16/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-edition #{"Standard" :standard "Enterprise" :enterprise})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-timeout (clojure.spec.alpha/int-in 1 20))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/cidr-ips (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/cidr-ip))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-stage #{:deleted "Created" "Failed" "Active" "Creating" "Inoperable" :creating "Restoring" :restoring :created :deleting "RestoreFailed" :inoperable "Deleting" :restore-failed "Deleted" :active :impaired "Impaired" :requested "Requested" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^d-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.describe-shared-directories-request/owner-directory-id (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-id))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.describe-shared-directories-request/shared-directory-ids (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/directory-ids))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-shared-directories-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.describe-shared-directories-request/owner-directory-id] :opt-un [:portkey.aws.ds.-2015-04-16.describe-shared-directories-request/shared-directory-ids :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-log-subscription-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.insufficient-permissions-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/insufficient-permissions-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.insufficient-permissions-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/subscription-created-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust-ids (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/trust-id))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/remote-domain-names]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/schema-extensions-info (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/schema-extension-info))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/list-ip-routes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/start-schema-extension-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/schema-extension-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.domain-controller/status-last-updated-date-time (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/last-updated-date-time))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.domain-controller/status (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/domain-controller-status))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.domain-controller/status-reason (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/domain-controller-status-reason))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.domain-controller/dns-ip-addr (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/ip-addr))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.domain-controller/status-last-updated-date-time :portkey.aws.ds.-2015-04-16/subnet-id :portkey.aws.ds.-2015-04-16/availability-zone :portkey.aws.ds.-2015-04-16.domain-controller/status :portkey.aws.ds.-2015-04-16/domain-controller-id :portkey.aws.ds.-2015-04-16.domain-controller/status-reason :portkey.aws.ds.-2015-04-16/vpc-id :portkey.aws.ds.-2015-04-16.domain-controller/dns-ip-addr :portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/launch-time]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/remote-domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+[.]?$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/register-event-topic-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/topic-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9]+[\\.-])+([a-zA-Z0-9])+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.tag/key (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/tag-key))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.tag/value (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/tag-value))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16.tag/key :portkey.aws.ds.-2015-04-16.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/conditional-forwarders (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/conditional-forwarder))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/connect-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/user-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 127))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/topic-status #{:deleted "Failed" "Topic not found" "Registered" :topicnotfound "Deleted" :registered :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/connected-directories-limit-reached clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/domain-controller-ids (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/domain-controller-id))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/trust (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/created-date-time :portkey.aws.ds.-2015-04-16/state-last-updated-date-time :portkey.aws.ds.-2015-04-16/trust-type :portkey.aws.ds.-2015-04-16/trust-direction :portkey.aws.ds.-2015-04-16/trust-state-reason :portkey.aws.ds.-2015-04-16/trust-id :portkey.aws.ds.-2015-04-16/last-updated-date-time :portkey.aws.ds.-2015-04-16/trust-state :portkey.aws.ds.-2015-04-16/selective-auth :portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/remote-domain-name]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 62)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(?!d-)([\da-zA-Z]+)([-]*[\da-zA-Z])*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/launch-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/disable-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-trust-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/trust-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/radius-status #{"Failed" "Creating" :creating :completed "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-ids (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/snapshot-id))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-vpc-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/vpc-id :portkey.aws.ds.-2015-04-16/subnet-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.authentication-failed-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/authentication-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.authentication-failed-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/directory-descriptions (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/directory-description))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.ds.-2015-04-16/availability-zone))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/verify-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/trust-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/port-number (clojure.spec.alpha/int-in 1025 65535))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/schema-extension-status #{"CreatingSnapshot" "Failed" :initializing "Cancelled" "CancelInProgress" :rollback-in-progress "RollbackInProgress" :completed :cancel-in-progress :updating-schema :cancelled :replicating "UpdatingSchema" "Completed" "Initializing" :creating-snapshot "Replicating" :failed})

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.invalid-parameter-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.snapshot-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/exception-message))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16.snapshot-limit-exceeded-exception/message :portkey.aws.ds.-2015-04-16/request-id]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/add-tags-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/resource-id :portkey.aws.ds.-2015-04-16/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/describe-domain-controllers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id] :opt-un [:portkey.aws.ds.-2015-04-16/domain-controller-ids :portkey.aws.ds.-2015-04-16/next-token :portkey.aws.ds.-2015-04-16/limit]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-radius-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/radius-settings] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-computer-request/password (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/computer-password))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-computer-request/organizational-unit-distinguished-name (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/organizational-unit-dn))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16.create-computer-request/computer-attributes (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/attributes))
(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/create-computer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/computer-name :portkey.aws.ds.-2015-04-16.create-computer-request/password] :opt-un [:portkey.aws.ds.-2015-04-16.create-computer-request/organizational-unit-distinguished-name :portkey.aws.ds.-2015-04-16.create-computer-request/computer-attributes]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/ip-route-status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/start-date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/notes (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/disable-radius-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/computer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-trust-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/trust-id] :opt-un [:portkey.aws.ds.-2015-04-16/delete-associated-conditional-forwarder]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/accept-shared-directory-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/shared-directory]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/log-subscription (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/log-group-name :portkey.aws.ds.-2015-04-16/subscription-created-date-time]))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([a-zA-Z0-9_])[\\a-zA-Z0-9_@#%*+=:?./!\s-]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ds.-2015-04-16/directory-id :portkey.aws.ds.-2015-04-16/remote-domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/cidr-ip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\/([1-9]|[1-2][0-9]|3[0-2]))$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/snapshot-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^s-[0-9a-f]{10}$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/add-tags-to-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/reset-user-password-result (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/update-security-group-for-directory-controllers clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ds.-2015-04-16/sid (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[&\w+-.@]+" s__27882__auto__))))

(clojure.core/defn describe-trusts ([] (describe-trusts {})) ([describe-trusts-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-trusts-request describe-trusts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-trusts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-trusts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrusts", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-trusts :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/describe-trusts-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-trusts-result))

(clojure.core/defn update-number-of-domain-controllers ([update-number-of-domain-controllers-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-number-of-domain-controllers-request update-number-of-domain-controllers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNumberOfDomainControllers", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "DomainControllerLimitExceededException" :portkey.aws.ds.-2015-04-16/domain-controller-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef update-number-of-domain-controllers :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/update-number-of-domain-controllers-result))

(clojure.core/defn delete-conditional-forwarder ([delete-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-conditional-forwarder-request delete-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteConditionalForwarder", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef delete-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/delete-conditional-forwarder-result))

(clojure.core/defn verify-trust ([verify-trust-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-verify-trust-request verify-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/verify-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/verify-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "VerifyTrust", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef verify-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/verify-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/verify-trust-result))

(clojure.core/defn reset-user-password ([reset-user-password-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-reset-user-password-request reset-user-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/reset-user-password-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/reset-user-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ResetUserPassword", :http.request.spec/error-spec {"DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "UserDoesNotExistException" :portkey.aws.ds.-2015-04-16/user-does-not-exist-exception, "InvalidPasswordException" :portkey.aws.ds.-2015-04-16/invalid-password-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef reset-user-password :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/reset-user-password-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/reset-user-password-result))

(clojure.core/defn create-alias ([create-alias-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-alias-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-alias-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAlias", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-alias-result))

(clojure.core/defn update-radius ([update-radius-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-radius-request update-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/update-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/update-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateRadius", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef update-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/update-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/update-radius-result))

(clojure.core/defn remove-ip-routes ([remove-ip-routes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-ip-routes-request remove-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/remove-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/remove-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveIpRoutes", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef remove-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/remove-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/remove-ip-routes-result))

(clojure.core/defn enable-radius ([enable-radius-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-enable-radius-request enable-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/enable-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/enable-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableRadius", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef enable-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/enable-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/enable-radius-result))

(clojure.core/defn delete-log-subscription ([delete-log-subscription-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-log-subscription-request delete-log-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/delete-log-subscription-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/delete-log-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLogSubscription", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef delete-log-subscription :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/delete-log-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/delete-log-subscription-result))

(clojure.core/defn delete-directory ([delete-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-directory-request delete-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/delete-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/delete-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDirectory", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef delete-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/delete-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/delete-directory-result))

(clojure.core/defn deregister-event-topic ([deregister-event-topic-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-event-topic-request deregister-event-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/deregister-event-topic-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/deregister-event-topic-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterEventTopic", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef deregister-event-topic :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/deregister-event-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/deregister-event-topic-result))

(clojure.core/defn describe-domain-controllers ([describe-domain-controllers-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-domain-controllers-request describe-domain-controllers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-domain-controllers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-domain-controllers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDomainControllers", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef describe-domain-controllers :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/describe-domain-controllers-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-domain-controllers-result))

(clojure.core/defn describe-conditional-forwarders ([describe-conditional-forwarders-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-conditional-forwarders-request describe-conditional-forwarders-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeConditionalForwarders", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef describe-conditional-forwarders :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-conditional-forwarders-result))

(clojure.core/defn create-snapshot ([create-snapshot-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-snapshot-request create-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSnapshot", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "SnapshotLimitExceededException" :portkey.aws.ds.-2015-04-16/snapshot-limit-exceeded-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-snapshot-result))

(clojure.core/defn disable-sso ([disable-sso-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disable-sso-request disable-sso-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/disable-sso-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/disable-sso-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableSso", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InsufficientPermissionsException" :portkey.aws.ds.-2015-04-16/insufficient-permissions-exception, "AuthenticationFailedException" :portkey.aws.ds.-2015-04-16/authentication-failed-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef disable-sso :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/disable-sso-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/disable-sso-result))

(clojure.core/defn update-trust ([update-trust-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-trust-request update-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/update-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/update-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrust", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef update-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/update-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/update-trust-result))

(clojure.core/defn list-log-subscriptions ([] (list-log-subscriptions {})) ([list-log-subscriptions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-log-subscriptions-request list-log-subscriptions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/list-log-subscriptions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/list-log-subscriptions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListLogSubscriptions", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef list-log-subscriptions :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/list-log-subscriptions-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/list-log-subscriptions-result))

(clojure.core/defn register-event-topic ([register-event-topic-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-event-topic-request register-event-topic-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/register-event-topic-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/register-event-topic-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterEventTopic", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef register-event-topic :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/register-event-topic-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/register-event-topic-result))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/list-tags-for-resource-result))

(clojure.core/defn cancel-schema-extension ([cancel-schema-extension-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-cancel-schema-extension-request cancel-schema-extension-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/cancel-schema-extension-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/cancel-schema-extension-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelSchemaExtension", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef cancel-schema-extension :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/cancel-schema-extension-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/cancel-schema-extension-result))

(clojure.core/defn add-ip-routes ([add-ip-routes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-ip-routes-request add-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/add-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/add-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddIpRoutes", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "IpRouteLimitExceededException" :portkey.aws.ds.-2015-04-16/ip-route-limit-exceeded-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef add-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/add-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/add-ip-routes-result))

(clojure.core/defn create-microsoft-ad ([create-microsoft-ad-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-microsoft-ad-request create-microsoft-ad-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-microsoft-ad-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-microsoft-ad-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateMicrosoftAD", :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds.-2015-04-16/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-microsoft-ad :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-microsoft-ad-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-microsoft-ad-result))

(clojure.core/defn list-ip-routes ([list-ip-routes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-ip-routes-request list-ip-routes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/list-ip-routes-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/list-ip-routes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListIpRoutes", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef list-ip-routes :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/list-ip-routes-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/list-ip-routes-result))

(clojure.core/defn connect-directory ([connect-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-connect-directory-request connect-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/connect-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/connect-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ConnectDirectory", :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds.-2015-04-16/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef connect-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/connect-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/connect-directory-result))

(clojure.core/defn delete-snapshot ([delete-snapshot-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-snapshot-request delete-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/delete-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/delete-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSnapshot", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef delete-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/delete-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/delete-snapshot-result))

(clojure.core/defn create-trust ([create-trust-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-trust-request create-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrust", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef create-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-trust-result))

(clojure.core/defn unshare-directory ([unshare-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-unshare-directory-request unshare-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/unshare-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/unshare-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnshareDirectory", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidTargetException" :portkey.aws.ds.-2015-04-16/invalid-target-exception, "DirectoryNotSharedException" :portkey.aws.ds.-2015-04-16/directory-not-shared-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef unshare-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/unshare-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/unshare-directory-result))

(clojure.core/defn list-schema-extensions ([list-schema-extensions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-schema-extensions-request list-schema-extensions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/list-schema-extensions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/list-schema-extensions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSchemaExtensions", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef list-schema-extensions :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/list-schema-extensions-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/list-schema-extensions-result))

(clojure.core/defn delete-trust ([delete-trust-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-trust-request delete-trust-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/delete-trust-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/delete-trust-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrust", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception}})))))
(clojure.spec.alpha/fdef delete-trust :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/delete-trust-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/delete-trust-result))

(clojure.core/defn disable-radius ([disable-radius-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disable-radius-request disable-radius-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/disable-radius-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/disable-radius-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableRadius", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef disable-radius :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/disable-radius-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/disable-radius-result))

(clojure.core/defn restore-from-snapshot ([restore-from-snapshot-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-restore-from-snapshot-request restore-from-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/restore-from-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/restore-from-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RestoreFromSnapshot", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef restore-from-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/restore-from-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/restore-from-snapshot-result))

(clojure.core/defn describe-snapshots ([] (describe-snapshots {})) ([describe-snapshots-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-snapshots-request describe-snapshots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-snapshots-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-snapshots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSnapshots", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef describe-snapshots :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/describe-snapshots-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-snapshots-result))

(clojure.core/defn describe-shared-directories ([describe-shared-directories-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-shared-directories-request describe-shared-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-shared-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-shared-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSharedDirectories", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef describe-shared-directories :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/describe-shared-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-shared-directories-result))

(clojure.core/defn create-log-subscription ([create-log-subscription-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-log-subscription-request create-log-subscription-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-log-subscription-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-log-subscription-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLogSubscription", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "InsufficientPermissionsException" :portkey.aws.ds.-2015-04-16/insufficient-permissions-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-log-subscription :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-log-subscription-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-log-subscription-result))

(clojure.core/defn share-directory ([share-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-share-directory-request share-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/share-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/share-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ShareDirectory", :http.request.spec/error-spec {"OrganizationsException" :portkey.aws.ds.-2015-04-16/organizations-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds.-2015-04-16/directory-already-shared-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "InvalidTargetException" :portkey.aws.ds.-2015-04-16/invalid-target-exception, "ShareLimitExceededException" :portkey.aws.ds.-2015-04-16/share-limit-exceeded-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "AccessDeniedException" :portkey.aws.ds.-2015-04-16/access-denied-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef share-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/share-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/share-directory-result))

(clojure.core/defn create-directory ([create-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-directory-request create-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDirectory", :http.request.spec/error-spec {"DirectoryLimitExceededException" :portkey.aws.ds.-2015-04-16/directory-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-directory-result))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-from-resource-request remove-tags-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/remove-tags-from-resource-result))

(clojure.core/defn describe-directories ([] (describe-directories {})) ([describe-directories-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-directories-request describe-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-directories-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-directories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeDirectories", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.ds.-2015-04-16/invalid-next-token-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef describe-directories :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/describe-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-directories-result))

(clojure.core/defn reject-shared-directory ([reject-shared-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-reject-shared-directory-request reject-shared-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/reject-shared-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/reject-shared-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RejectSharedDirectory", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds.-2015-04-16/directory-already-shared-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef reject-shared-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/reject-shared-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/reject-shared-directory-result))

(clojure.core/defn start-schema-extension ([start-schema-extension-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-schema-extension-request start-schema-extension-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/start-schema-extension-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/start-schema-extension-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSchemaExtension", :http.request.spec/error-spec {"DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "SnapshotLimitExceededException" :portkey.aws.ds.-2015-04-16/snapshot-limit-exceeded-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef start-schema-extension :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/start-schema-extension-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/start-schema-extension-result))

(clojure.core/defn update-conditional-forwarder ([update-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-conditional-forwarder-request update-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateConditionalForwarder", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef update-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/update-conditional-forwarder-result))

(clojure.core/defn get-snapshot-limits ([get-snapshot-limits-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-snapshot-limits-request get-snapshot-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/get-snapshot-limits-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/get-snapshot-limits-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSnapshotLimits", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef get-snapshot-limits :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/get-snapshot-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/get-snapshot-limits-result))

(clojure.core/defn create-conditional-forwarder ([create-conditional-forwarder-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-conditional-forwarder-request create-conditional-forwarder-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateConditionalForwarder", :http.request.spec/error-spec {"EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-conditional-forwarder :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-conditional-forwarder-result))

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-to-resource-request add-tags-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/add-tags-to-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/add-tags-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToResource", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "TagLimitExceededException" :portkey.aws.ds.-2015-04-16/tag-limit-exceeded-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/add-tags-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/add-tags-to-resource-result))

(clojure.core/defn enable-sso ([enable-sso-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-enable-sso-request enable-sso-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/enable-sso-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/enable-sso-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableSso", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InsufficientPermissionsException" :portkey.aws.ds.-2015-04-16/insufficient-permissions-exception, "AuthenticationFailedException" :portkey.aws.ds.-2015-04-16/authentication-failed-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef enable-sso :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/enable-sso-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/enable-sso-result))

(clojure.core/defn accept-shared-directory ([accept-shared-directory-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-accept-shared-directory-request accept-shared-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/accept-shared-directory-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/accept-shared-directory-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AcceptSharedDirectory", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "DirectoryAlreadySharedException" :portkey.aws.ds.-2015-04-16/directory-already-shared-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef accept-shared-directory :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/accept-shared-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/accept-shared-directory-result))

(clojure.core/defn get-directory-limits ([] (get-directory-limits {})) ([get-directory-limits-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-directory-limits-request get-directory-limits-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/get-directory-limits-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/get-directory-limits-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDirectoryLimits", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef get-directory-limits :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/get-directory-limits-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/get-directory-limits-result))

(clojure.core/defn create-computer ([create-computer-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-computer-request create-computer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/create-computer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/create-computer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateComputer", :http.request.spec/error-spec {"AuthenticationFailedException" :portkey.aws.ds.-2015-04-16/authentication-failed-exception, "DirectoryUnavailableException" :portkey.aws.ds.-2015-04-16/directory-unavailable-exception, "EntityAlreadyExistsException" :portkey.aws.ds.-2015-04-16/entity-already-exists-exception, "EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "UnsupportedOperationException" :portkey.aws.ds.-2015-04-16/unsupported-operation-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef create-computer :args (clojure.spec.alpha/tuple :portkey.aws.ds.-2015-04-16/create-computer-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/create-computer-result))

(clojure.core/defn describe-event-topics ([] (describe-event-topics {})) ([describe-event-topics-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-event-topics-request describe-event-topics-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ds.-2015-04-16/endpoints, :http.request.configuration/target-prefix "DirectoryService_20150416", :http.request.spec/output-spec :portkey.aws.ds.-2015-04-16/describe-event-topics-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-04-16", :http.request.configuration/service-id "Directory Service", :http.request.spec/input-spec :portkey.aws.ds.-2015-04-16/describe-event-topics-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventTopics", :http.request.spec/error-spec {"EntityDoesNotExistException" :portkey.aws.ds.-2015-04-16/entity-does-not-exist-exception, "InvalidParameterException" :portkey.aws.ds.-2015-04-16/invalid-parameter-exception, "ClientException" :portkey.aws.ds.-2015-04-16/client-exception, "ServiceException" :portkey.aws.ds.-2015-04-16/service-exception}})))))
(clojure.spec.alpha/fdef describe-event-topics :args (clojure.spec.alpha/? :portkey.aws.ds.-2015-04-16/describe-event-topics-request) :ret (clojure.spec.alpha/and :portkey.aws.ds.-2015-04-16/describe-event-topics-result))
