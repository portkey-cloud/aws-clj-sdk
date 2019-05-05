(ns portkey.aws.directconnect.-2012-10-25 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "directconnect", :region "us-gov-east-1"},
    :ssl-common-name "directconnect.us-gov-east-1.amazonaws.com",
    :endpoint "https://directconnect.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "directconnect", :region "ap-northeast-1"},
    :ssl-common-name "directconnect.ap-northeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "directconnect", :region "eu-west-1"},
    :ssl-common-name "directconnect.eu-west-1.amazonaws.com",
    :endpoint "https://directconnect.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "directconnect", :region "us-east-2"},
    :ssl-common-name "directconnect.us-east-2.amazonaws.com",
    :endpoint "https://directconnect.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "directconnect", :region "ap-southeast-2"},
    :ssl-common-name "directconnect.ap-southeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "directconnect", :region "cn-north-1"},
    :ssl-common-name "directconnect.cn-north-1.amazonaws.com.cn",
    :endpoint "https://directconnect.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "directconnect", :region "sa-east-1"},
    :ssl-common-name "directconnect.sa-east-1.amazonaws.com",
    :endpoint "https://directconnect.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "directconnect", :region "ap-southeast-1"},
    :ssl-common-name "directconnect.ap-southeast-1.amazonaws.com",
    :endpoint "https://directconnect.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "directconnect", :region "cn-northwest-1"},
    :ssl-common-name "directconnect.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://directconnect.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "directconnect", :region "ap-northeast-2"},
    :ssl-common-name "directconnect.ap-northeast-2.amazonaws.com",
    :endpoint "https://directconnect.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "directconnect", :region "eu-west-3"},
    :ssl-common-name "directconnect.eu-west-3.amazonaws.com",
    :endpoint "https://directconnect.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "directconnect", :region "ca-central-1"},
    :ssl-common-name "directconnect.ca-central-1.amazonaws.com",
    :endpoint "https://directconnect.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "directconnect", :region "eu-central-1"},
    :ssl-common-name "directconnect.eu-central-1.amazonaws.com",
    :endpoint "https://directconnect.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "directconnect", :region "eu-west-2"},
    :ssl-common-name "directconnect.eu-west-2.amazonaws.com",
    :endpoint "https://directconnect.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "directconnect", :region "us-gov-west-1"},
    :ssl-common-name "directconnect.us-gov-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "directconnect", :region "us-west-2"},
    :ssl-common-name "directconnect.us-west-2.amazonaws.com",
    :endpoint "https://directconnect.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "directconnect", :region "us-east-1"},
    :ssl-common-name "directconnect.us-east-1.amazonaws.com",
    :endpoint "https://directconnect.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "directconnect", :region "us-west-1"},
    :ssl-common-name "directconnect.us-west-1.amazonaws.com",
    :endpoint "https://directconnect.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "directconnect", :region "ap-south-1"},
    :ssl-common-name "directconnect.ap-south-1.amazonaws.com",
    :endpoint "https://directconnect.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "directconnect", :region "eu-north-1"},
    :ssl-common-name "directconnect.eu-north-1.amazonaws.com",
    :endpoint "https://directconnect.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-resource-arn-list)

(clojure.core/declare ser-connection-id)

(clojure.core/declare ser-customer-address)

(clojure.core/declare ser-virtual-interface-id)

(clojure.core/declare ser-interconnect-id)

(clojure.core/declare ser-address-family)

(clojure.core/declare ser-bandwidth)

(clojure.core/declare ser-asn)

(clojure.core/declare ser-owner-account)

(clojure.core/declare ser-loa-content-type)

(clojure.core/declare ser-connection-name)

(clojure.core/declare ser-cidr)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-direct-connect-gateway-name)

(clojure.core/declare ser-count)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-amazon-address)

(clojure.core/declare ser-new-private-virtual-interface)

(clojure.core/declare ser-route-filter-prefix-list)

(clojure.core/declare ser-interconnect-name)

(clojure.core/declare ser-lag-id)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-provider-name)

(clojure.core/declare ser-mtu)

(clojure.core/declare ser-long-asn)

(clojure.core/declare ser-direct-connect-gateway-id)

(clojure.core/declare ser-new-public-virtual-interface-allocation)

(clojure.core/declare ser-virtual-gateway-id)

(clojure.core/declare ser-bgp-auth-key)

(clojure.core/declare ser-route-filter-prefix)

(clojure.core/declare ser-location-code)

(clojure.core/declare ser-max-result-set-size)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-new-public-virtual-interface)

(clojure.core/declare ser-lag-name)

(clojure.core/declare ser-new-private-virtual-interface-allocation)

(clojure.core/declare ser-bgp-peer-id)

(clojure.core/declare ser-virtual-interface-name)

(clojure.core/declare ser-new-bgp-peer)

(clojure.core/declare ser-vlan)

(clojure.core/defn- ser-resource-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-arn coll) #:http.request.field{:shape "ResourceArn"}))) input), :shape "ResourceArnList", :type "list"})

(clojure.core/defn- ser-connection-id [input] #:http.request.field{:value input, :shape "ConnectionId"})

(clojure.core/defn- ser-customer-address [input] #:http.request.field{:value input, :shape "CustomerAddress"})

(clojure.core/defn- ser-virtual-interface-id [input] #:http.request.field{:value input, :shape "VirtualInterfaceId"})

(clojure.core/defn- ser-interconnect-id [input] #:http.request.field{:value input, :shape "InterconnectId"})

(clojure.core/defn- ser-address-family [input] #:http.request.field{:value (clojure.core/get {"ipv4" "ipv4", :ipv-4 "ipv4", "ipv6" "ipv6", :ipv-6 "ipv6"} input), :shape "AddressFamily"})

(clojure.core/defn- ser-bandwidth [input] #:http.request.field{:value input, :shape "Bandwidth"})

(clojure.core/defn- ser-asn [input] #:http.request.field{:value input, :shape "ASN"})

(clojure.core/defn- ser-owner-account [input] #:http.request.field{:value input, :shape "OwnerAccount"})

(clojure.core/defn- ser-loa-content-type [input] #:http.request.field{:value (clojure.core/get {"application/pdf" "application/pdf", :applicationpdf "application/pdf"} input), :shape "LoaContentType"})

(clojure.core/defn- ser-connection-name [input] #:http.request.field{:value input, :shape "ConnectionName"})

(clojure.core/defn- ser-cidr [input] #:http.request.field{:value input, :shape "CIDR"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-direct-connect-gateway-name [input] #:http.request.field{:value input, :shape "DirectConnectGatewayName"})

(clojure.core/defn- ser-count [input] #:http.request.field{:value input, :shape "Count"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-amazon-address [input] #:http.request.field{:value input, :shape "AmazonAddress"})

(clojure.core/defn- ser-new-private-virtual-interface [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-virtual-interface-name (:virtual-interface-name input)) #:http.request.field{:name "virtualInterfaceName", :shape "VirtualInterfaceName"}) (clojure.core/into (ser-vlan (:vlan input)) #:http.request.field{:name "vlan", :shape "VLAN"}) (clojure.core/into (ser-asn (:asn input)) #:http.request.field{:name "asn", :shape "ASN"})], :shape "NewPrivateVirtualInterface", :type "structure"} (clojure.core/contains? input :address-family) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-family (input :address-family)) #:http.request.field{:name "addressFamily", :shape "AddressFamily"})) (clojure.core/contains? input :direct-connect-gateway-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"})) (clojure.core/contains? input :mtu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mtu (input :mtu)) #:http.request.field{:name "mtu", :shape "MTU"})) (clojure.core/contains? input :virtual-gateway-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-gateway-id (input :virtual-gateway-id)) #:http.request.field{:name "virtualGatewayId", :shape "VirtualGatewayId"})) (clojure.core/contains? input :amazon-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-address (input :amazon-address)) #:http.request.field{:name "amazonAddress", :shape "AmazonAddress"})) (clojure.core/contains? input :auth-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-auth-key (input :auth-key)) #:http.request.field{:name "authKey", :shape "BGPAuthKey"}))))

(clojure.core/defn- ser-route-filter-prefix-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-route-filter-prefix coll) #:http.request.field{:shape "RouteFilterPrefix"}))) input), :shape "RouteFilterPrefixList", :type "list"})

(clojure.core/defn- ser-interconnect-name [input] #:http.request.field{:value input, :shape "InterconnectName"})

(clojure.core/defn- ser-lag-id [input] #:http.request.field{:value input, :shape "LagId"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-provider-name [input] #:http.request.field{:value input, :shape "ProviderName"})

(clojure.core/defn- ser-mtu [input] #:http.request.field{:value input, :shape "MTU"})

(clojure.core/defn- ser-long-asn [input] #:http.request.field{:value input, :shape "LongAsn"})

(clojure.core/defn- ser-direct-connect-gateway-id [input] #:http.request.field{:value input, :shape "DirectConnectGatewayId"})

(clojure.core/defn- ser-new-public-virtual-interface-allocation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-virtual-interface-name (:virtual-interface-name input)) #:http.request.field{:name "virtualInterfaceName", :shape "VirtualInterfaceName"}) (clojure.core/into (ser-vlan (:vlan input)) #:http.request.field{:name "vlan", :shape "VLAN"}) (clojure.core/into (ser-asn (:asn input)) #:http.request.field{:name "asn", :shape "ASN"})], :shape "NewPublicVirtualInterfaceAllocation", :type "structure"} (clojure.core/contains? input :auth-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-auth-key (input :auth-key)) #:http.request.field{:name "authKey", :shape "BGPAuthKey"})) (clojure.core/contains? input :amazon-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-address (input :amazon-address)) #:http.request.field{:name "amazonAddress", :shape "AmazonAddress"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"})) (clojure.core/contains? input :address-family) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-family (input :address-family)) #:http.request.field{:name "addressFamily", :shape "AddressFamily"})) (clojure.core/contains? input :route-filter-prefixes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-route-filter-prefix-list (input :route-filter-prefixes)) #:http.request.field{:name "routeFilterPrefixes", :shape "RouteFilterPrefixList"}))))

(clojure.core/defn- ser-virtual-gateway-id [input] #:http.request.field{:value input, :shape "VirtualGatewayId"})

(clojure.core/defn- ser-bgp-auth-key [input] #:http.request.field{:value input, :shape "BGPAuthKey"})

(clojure.core/defn- ser-route-filter-prefix [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RouteFilterPrefix", :type "structure"} (clojure.core/contains? input :cidr) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cidr (input :cidr)) #:http.request.field{:name "cidr", :shape "CIDR"}))))

(clojure.core/defn- ser-location-code [input] #:http.request.field{:value input, :shape "LocationCode"})

(clojure.core/defn- ser-max-result-set-size [input] #:http.request.field{:value input, :shape "MaxResultSetSize"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-new-public-virtual-interface [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-virtual-interface-name (:virtual-interface-name input)) #:http.request.field{:name "virtualInterfaceName", :shape "VirtualInterfaceName"}) (clojure.core/into (ser-vlan (:vlan input)) #:http.request.field{:name "vlan", :shape "VLAN"}) (clojure.core/into (ser-asn (:asn input)) #:http.request.field{:name "asn", :shape "ASN"})], :shape "NewPublicVirtualInterface", :type "structure"} (clojure.core/contains? input :auth-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-auth-key (input :auth-key)) #:http.request.field{:name "authKey", :shape "BGPAuthKey"})) (clojure.core/contains? input :amazon-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-address (input :amazon-address)) #:http.request.field{:name "amazonAddress", :shape "AmazonAddress"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"})) (clojure.core/contains? input :address-family) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-family (input :address-family)) #:http.request.field{:name "addressFamily", :shape "AddressFamily"})) (clojure.core/contains? input :route-filter-prefixes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-route-filter-prefix-list (input :route-filter-prefixes)) #:http.request.field{:name "routeFilterPrefixes", :shape "RouteFilterPrefixList"}))))

(clojure.core/defn- ser-lag-name [input] #:http.request.field{:value input, :shape "LagName"})

(clojure.core/defn- ser-new-private-virtual-interface-allocation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-virtual-interface-name (:virtual-interface-name input)) #:http.request.field{:name "virtualInterfaceName", :shape "VirtualInterfaceName"}) (clojure.core/into (ser-vlan (:vlan input)) #:http.request.field{:name "vlan", :shape "VLAN"}) (clojure.core/into (ser-asn (:asn input)) #:http.request.field{:name "asn", :shape "ASN"})], :shape "NewPrivateVirtualInterfaceAllocation", :type "structure"} (clojure.core/contains? input :mtu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mtu (input :mtu)) #:http.request.field{:name "mtu", :shape "MTU"})) (clojure.core/contains? input :auth-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-auth-key (input :auth-key)) #:http.request.field{:name "authKey", :shape "BGPAuthKey"})) (clojure.core/contains? input :amazon-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-address (input :amazon-address)) #:http.request.field{:name "amazonAddress", :shape "AmazonAddress"})) (clojure.core/contains? input :address-family) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-family (input :address-family)) #:http.request.field{:name "addressFamily", :shape "AddressFamily"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"}))))

(clojure.core/defn- ser-bgp-peer-id [input] #:http.request.field{:value input, :shape "BGPPeerId"})

(clojure.core/defn- ser-virtual-interface-name [input] #:http.request.field{:value input, :shape "VirtualInterfaceName"})

(clojure.core/defn- ser-new-bgp-peer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NewBGPPeer", :type "structure"} (clojure.core/contains? input :asn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-asn (input :asn)) #:http.request.field{:name "asn", :shape "ASN"})) (clojure.core/contains? input :auth-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-auth-key (input :auth-key)) #:http.request.field{:name "authKey", :shape "BGPAuthKey"})) (clojure.core/contains? input :address-family) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-address-family (input :address-family)) #:http.request.field{:name "addressFamily", :shape "AddressFamily"})) (clojure.core/contains? input :amazon-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-amazon-address (input :amazon-address)) #:http.request.field{:name "amazonAddress", :shape "AmazonAddress"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"}))))

(clojure.core/defn- ser-vlan [input] #:http.request.field{:value input, :shape "VLAN"})

(clojure.core/defn- req-describe-loa-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "providerName", :shape "ProviderName"})) (clojure.core/contains? input :loa-content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-loa-content-type (input :loa-content-type)) #:http.request.field{:name "loaContentType", :shape "LoaContentType"}))))

(clojure.core/defn- req-describe-interconnect-loa-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-interconnect-id (input :interconnect-id)) #:http.request.field{:name "interconnectId", :shape "InterconnectId"})]} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "providerName", :shape "ProviderName"})) (clojure.core/contains? input :loa-content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-loa-content-type (input :loa-content-type)) #:http.request.field{:name "loaContentType", :shape "LoaContentType"}))))

(clojure.core/defn- req-update-virtual-interface-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})]} (clojure.core/contains? input :mtu) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mtu (input :mtu)) #:http.request.field{:name "mtu", :shape "MTU"}))))

(clojure.core/defn- req-associate-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"}) (clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]}))

(clojure.core/defn- req-allocate-hosted-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-owner-account (input :owner-account)) #:http.request.field{:name "ownerAccount", :shape "OwnerAccount"}) (clojure.core/into (ser-bandwidth (input :bandwidth)) #:http.request.field{:name "bandwidth", :shape "Bandwidth"}) (clojure.core/into (ser-connection-name (input :connection-name)) #:http.request.field{:name "connectionName", :shape "ConnectionName"}) (clojure.core/into (ser-vlan (input :vlan)) #:http.request.field{:name "vlan", :shape "VLAN"})]}))

(clojure.core/defn- req-describe-virtual-interfaces-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :connection-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})) (clojure.core/contains? input :virtual-interface-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"}))))

(clojure.core/defn- req-describe-hosted-connections-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]}))

(clojure.core/defn- req-delete-direct-connect-gateway-association-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"}) (clojure.core/into (ser-virtual-gateway-id (input :virtual-gateway-id)) #:http.request.field{:name "virtualGatewayId", :shape "VirtualGatewayId"})]}))

(clojure.core/defn- req-describe-connections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :connection-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}))))

(clojure.core/defn- req-create-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-location-code (input :location)) #:http.request.field{:name "location", :shape "LocationCode"}) (clojure.core/into (ser-bandwidth (input :bandwidth)) #:http.request.field{:name "bandwidth", :shape "Bandwidth"}) (clojure.core/into (ser-connection-name (input :connection-name)) #:http.request.field{:name "connectionName", :shape "ConnectionName"})]} (clojure.core/contains? input :lag-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"}))))

(clojure.core/defn- req-delete-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]}))

(clojure.core/defn- req-allocate-private-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-owner-account (input :owner-account)) #:http.request.field{:name "ownerAccount", :shape "OwnerAccount"}) (clojure.core/into (ser-new-private-virtual-interface-allocation (input :new-private-virtual-interface-allocation)) #:http.request.field{:name "newPrivateVirtualInterfaceAllocation", :shape "NewPrivateVirtualInterfaceAllocation"})]}))

(clojure.core/defn- req-create-public-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-new-public-virtual-interface (input :new-public-virtual-interface)) #:http.request.field{:name "newPublicVirtualInterface", :shape "NewPublicVirtualInterface"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-direct-connect-gateway-association-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"}) (clojure.core/into (ser-virtual-gateway-id (input :virtual-gateway-id)) #:http.request.field{:name "virtualGatewayId", :shape "VirtualGatewayId"})]}))

(clojure.core/defn- req-delete-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})]}))

(clojure.core/defn- req-describe-connection-loa-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]} (clojure.core/contains? input :provider-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-provider-name (input :provider-name)) #:http.request.field{:name "providerName", :shape "ProviderName"})) (clojure.core/contains? input :loa-content-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-loa-content-type (input :loa-content-type)) #:http.request.field{:name "loaContentType", :shape "LoaContentType"}))))

(clojure.core/defn- req-create-private-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-new-private-virtual-interface (input :new-private-virtual-interface)) #:http.request.field{:name "newPrivateVirtualInterface", :shape "NewPrivateVirtualInterface"})]}))

(clojure.core/defn- req-describe-connections-on-interconnect-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-interconnect-id (input :interconnect-id)) #:http.request.field{:name "interconnectId", :shape "InterconnectId"})]}))

(clojure.core/defn- req-confirm-public-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})]}))

(clojure.core/defn- req-describe-interconnects-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :interconnect-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-interconnect-id (input :interconnect-id)) #:http.request.field{:name "interconnectId", :shape "InterconnectId"}))))

(clojure.core/defn- req-delete-bgp-peer-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :virtual-interface-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})) (clojure.core/contains? input :asn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-asn (input :asn)) #:http.request.field{:name "asn", :shape "ASN"})) (clojure.core/contains? input :customer-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customer-address (input :customer-address)) #:http.request.field{:name "customerAddress", :shape "CustomerAddress"})) (clojure.core/contains? input :bgp-peer-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bgp-peer-id (input :bgp-peer-id)) #:http.request.field{:name "bgpPeerId", :shape "BGPPeerId"}))))

(clojure.core/defn- req-confirm-private-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})]} (clojure.core/contains? input :virtual-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-gateway-id (input :virtual-gateway-id)) #:http.request.field{:name "virtualGatewayId", :shape "VirtualGatewayId"})) (clojure.core/contains? input :direct-connect-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"}))))

(clojure.core/defn- req-describe-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})]}))

(clojure.core/defn- req-disassociate-connection-from-lag-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"})]}))

(clojure.core/defn- req-create-lag-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-count (input :number-of-connections)) #:http.request.field{:name "numberOfConnections", :shape "Count"}) (clojure.core/into (ser-location-code (input :location)) #:http.request.field{:name "location", :shape "LocationCode"}) (clojure.core/into (ser-bandwidth (input :connections-bandwidth)) #:http.request.field{:name "connectionsBandwidth", :shape "Bandwidth"}) (clojure.core/into (ser-lag-name (input :lag-name)) #:http.request.field{:name "lagName", :shape "LagName"})]} (clojure.core/contains? input :connection-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}))))

(clojure.core/defn- req-delete-direct-connect-gateway-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"})]}))

(clojure.core/defn- req-describe-direct-connect-gateways-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :direct-connect-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-set-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResultSetSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-create-bgp-peer-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :virtual-interface-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})) (clojure.core/contains? input :new-bgp-peer) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-new-bgp-peer (input :new-bgp-peer)) #:http.request.field{:name "newBGPPeer", :shape "NewBGPPeer"}))))

(clojure.core/defn- req-describe-lags-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :lag-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"}))))

(clojure.core/defn- req-allocate-public-virtual-interface-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-owner-account (input :owner-account)) #:http.request.field{:name "ownerAccount", :shape "OwnerAccount"}) (clojure.core/into (ser-new-public-virtual-interface-allocation (input :new-public-virtual-interface-allocation)) #:http.request.field{:name "newPublicVirtualInterfaceAllocation", :shape "NewPublicVirtualInterfaceAllocation"})]}))

(clojure.core/defn- req-create-direct-connect-gateway-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-direct-connect-gateway-name (input :direct-connect-gateway-name)) #:http.request.field{:name "directConnectGatewayName", :shape "DirectConnectGatewayName"})]} (clojure.core/contains? input :amazon-side-asn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long-asn (input :amazon-side-asn)) #:http.request.field{:name "amazonSideAsn", :shape "LongAsn"}))))

(clojure.core/defn- req-create-interconnect-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-interconnect-name (input :interconnect-name)) #:http.request.field{:name "interconnectName", :shape "InterconnectName"}) (clojure.core/into (ser-bandwidth (input :bandwidth)) #:http.request.field{:name "bandwidth", :shape "Bandwidth"}) (clojure.core/into (ser-location-code (input :location)) #:http.request.field{:name "location", :shape "LocationCode"})]} (clojure.core/contains? input :lag-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"}))))

(clojure.core/defn- req-associate-connection-with-lag-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"})]}))

(clojure.core/defn- req-delete-lag-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"})]}))

(clojure.core/defn- req-associate-hosted-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"}) (clojure.core/into (ser-connection-id (input :parent-connection-id)) #:http.request.field{:name "parentConnectionId", :shape "ConnectionId"})]}))

(clojure.core/defn- req-allocate-connection-on-interconnect-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bandwidth (input :bandwidth)) #:http.request.field{:name "bandwidth", :shape "Bandwidth"}) (clojure.core/into (ser-connection-name (input :connection-name)) #:http.request.field{:name "connectionName", :shape "ConnectionName"}) (clojure.core/into (ser-owner-account (input :owner-account)) #:http.request.field{:name "ownerAccount", :shape "OwnerAccount"}) (clojure.core/into (ser-interconnect-id (input :interconnect-id)) #:http.request.field{:name "interconnectId", :shape "InterconnectId"}) (clojure.core/into (ser-vlan (input :vlan)) #:http.request.field{:name "vlan", :shape "VLAN"})]}))

(clojure.core/defn- req-describe-direct-connect-gateway-attachments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :direct-connect-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"})) (clojure.core/contains? input :virtual-interface-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-interface-id (input :virtual-interface-id)) #:http.request.field{:name "virtualInterfaceId", :shape "VirtualInterfaceId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-set-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResultSetSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-update-lag-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-lag-id (input :lag-id)) #:http.request.field{:name "lagId", :shape "LagId"})]} (clojure.core/contains? input :lag-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lag-name (input :lag-name)) #:http.request.field{:name "lagName", :shape "LagName"})) (clojure.core/contains? input :minimum-links) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-count (input :minimum-links)) #:http.request.field{:name "minimumLinks", :shape "Count"}))))

(clojure.core/defn- req-delete-interconnect-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-interconnect-id (input :interconnect-id)) #:http.request.field{:name "interconnectId", :shape "InterconnectId"})]}))

(clojure.core/defn- req-describe-direct-connect-gateway-associations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :direct-connect-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-connect-gateway-id (input :direct-connect-gateway-id)) #:http.request.field{:name "directConnectGatewayId", :shape "DirectConnectGatewayId"})) (clojure.core/contains? input :virtual-gateway-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-virtual-gateway-id (input :virtual-gateway-id)) #:http.request.field{:name "virtualGatewayId", :shape "VirtualGatewayId"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-result-set-size (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResultSetSize"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-confirm-connection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-connection-id (input :connection-id)) #:http.request.field{:name "connectionId", :shape "ConnectionId"})]}))

(clojure.core/declare deser-location-name)

(clojure.core/declare deser-bgp-peer-state)

(clojure.core/declare deser-connection-id)

(clojure.core/declare deser-connection-list)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-customer-address)

(clojure.core/declare deser-router-config)

(clojure.core/declare deser-virtual-interface-id)

(clojure.core/declare deser-interconnect-id)

(clojure.core/declare deser-virtual-interface-region)

(clojure.core/declare deser-address-family)

(clojure.core/declare deser-connection-state)

(clojure.core/declare deser-bandwidth)

(clojure.core/declare deser-direct-connect-gateway-attachment-list)

(clojure.core/declare deser-bgp-peer-list)

(clojure.core/declare deser-asn)

(clojure.core/declare deser-owner-account)

(clojure.core/declare deser-direct-connect-gateway)

(clojure.core/declare deser-boolean-flag)

(clojure.core/declare deser-loa-content-type)

(clojure.core/declare deser-connection-name)

(clojure.core/declare deser-interconnect)

(clojure.core/declare deser-interconnect-list)

(clojure.core/declare deser-cidr)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-direct-connect-gateway-name)

(clojure.core/declare deser-virtual-interface-type)

(clojure.core/declare deser-count)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-location)

(clojure.core/declare deser-amazon-address)

(clojure.core/declare deser-interconnect-state)

(clojure.core/declare deser-route-filter-prefix-list)

(clojure.core/declare deser-direct-connect-gateway-association-state)

(clojure.core/declare deser-virtual-gateway-list)

(clojure.core/declare deser-loa-content)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-aws-device-v-2)

(clojure.core/declare deser-lag-list)

(clojure.core/declare deser-direct-connect-gateway-list)

(clojure.core/declare deser-virtual-gateway-region)

(clojure.core/declare deser-partner-name)

(clojure.core/declare deser-interconnect-name)

(clojure.core/declare deser-lag-id)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-virtual-interface-list)

(clojure.core/declare deser-direct-connect-gateway-attachment)

(clojure.core/declare deser-lag)

(clojure.core/declare deser-has-logical-redundancy)

(clojure.core/declare deser-virtual-gateway-state)

(clojure.core/declare deser-virtual-gateway)

(clojure.core/declare deser-aws-device)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-direct-connect-gateway-association)

(clojure.core/declare deser-loa-issue-time)

(clojure.core/declare deser-mtu)

(clojure.core/declare deser-jumbo-frame-capable)

(clojure.core/declare deser-long-asn)

(clojure.core/declare deser-direct-connect-gateway-id)

(clojure.core/declare deser-resource-tag)

(clojure.core/declare deser-port-speed)

(clojure.core/declare deser-virtual-gateway-id)

(clojure.core/declare deser-bgp-auth-key)

(clojure.core/declare deser-route-filter-prefix)

(clojure.core/declare deser-loa)

(clojure.core/declare deser-connection)

(clojure.core/declare deser-bgp-status)

(clojure.core/declare deser-virtual-interface-state)

(clojure.core/declare deser-location-code)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-bgp-peer)

(clojure.core/declare deser-state-change-error)

(clojure.core/declare deser-lag-state)

(clojure.core/declare deser-lag-name)

(clojure.core/declare deser-virtual-interface)

(clojure.core/declare deser-direct-connect-gateway-attachment-state)

(clojure.core/declare deser-bgp-peer-id)

(clojure.core/declare deser-virtual-interface-name)

(clojure.core/declare deser-region)

(clojure.core/declare deser-vlan)

(clojure.core/declare deser-resource-tag-list)

(clojure.core/declare deser-direct-connect-gateway-association-list)

(clojure.core/declare deser-direct-connect-gateway-state)

(clojure.core/declare deser-available-port-speeds)

(clojure.core/defn- deser-location-name [input] input)

(clojure.core/defn- deser-bgp-peer-state [input] (clojure.core/get {"verifying" :verifying, "pending" :pending, "available" :available, "deleting" :deleting, "deleted" :deleted} input))

(clojure.core/defn- deser-connection-id [input] input)

(clojure.core/defn- deser-connection-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-connection coll))) input))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-location coll))) input))

(clojure.core/defn- deser-customer-address [input] input)

(clojure.core/defn- deser-router-config [input] input)

(clojure.core/defn- deser-virtual-interface-id [input] input)

(clojure.core/defn- deser-interconnect-id [input] input)

(clojure.core/defn- deser-virtual-interface-region [input] input)

(clojure.core/defn- deser-address-family [input] (clojure.core/get {"ipv4" :ipv-4, "ipv6" :ipv-6} input))

(clojure.core/defn- deser-connection-state [input] (clojure.core/get {"requested" :requested, "deleting" :deleting, "ordering" :ordering, "unknown" :unknown, "down" :down, "deleted" :deleted, "rejected" :rejected, "pending" :pending, "available" :available} input))

(clojure.core/defn- deser-bandwidth [input] input)

(clojure.core/defn- deser-direct-connect-gateway-attachment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-direct-connect-gateway-attachment coll))) input))

(clojure.core/defn- deser-bgp-peer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bgp-peer coll))) input))

(clojure.core/defn- deser-asn [input] input)

(clojure.core/defn- deser-owner-account [input] input)

(clojure.core/defn- deser-direct-connect-gateway [input] (clojure.core/cond-> {} (clojure.core/contains? input "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (input "directConnectGatewayId"))) (clojure.core/contains? input "directConnectGatewayName") (clojure.core/assoc :direct-connect-gateway-name (deser-direct-connect-gateway-name (input "directConnectGatewayName"))) (clojure.core/contains? input "amazonSideAsn") (clojure.core/assoc :amazon-side-asn (deser-long-asn (input "amazonSideAsn"))) (clojure.core/contains? input "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (input "ownerAccount"))) (clojure.core/contains? input "directConnectGatewayState") (clojure.core/assoc :direct-connect-gateway-state (deser-direct-connect-gateway-state (input "directConnectGatewayState"))) (clojure.core/contains? input "stateChangeError") (clojure.core/assoc :state-change-error (deser-state-change-error (input "stateChangeError")))))

(clojure.core/defn- deser-boolean-flag [input] input)

(clojure.core/defn- deser-loa-content-type [input] (clojure.core/get {"application/pdf" :applicationpdf} input))

(clojure.core/defn- deser-connection-name [input] input)

(clojure.core/defn- deser-interconnect [input] (clojure.core/cond-> {} (clojure.core/contains? input "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (input "jumboFrameCapable"))) (clojure.core/contains? input "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (input "awsDeviceV2"))) (clojure.core/contains? input "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (input "awsDevice"))) (clojure.core/contains? input "interconnectName") (clojure.core/assoc :interconnect-name (deser-interconnect-name (input "interconnectName"))) (clojure.core/contains? input "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (input "bandwidth"))) (clojure.core/contains? input "interconnectState") (clojure.core/assoc :interconnect-state (deser-interconnect-state (input "interconnectState"))) (clojure.core/contains? input "lagId") (clojure.core/assoc :lag-id (deser-lag-id (input "lagId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location-code (input "location"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-region (input "region"))) (clojure.core/contains? input "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (input "loaIssueTime"))) (clojure.core/contains? input "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (input "hasLogicalRedundancy"))) (clojure.core/contains? input "interconnectId") (clojure.core/assoc :interconnect-id (deser-interconnect-id (input "interconnectId")))))

(clojure.core/defn- deser-interconnect-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-interconnect coll))) input))

(clojure.core/defn- deser-cidr [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-direct-connect-gateway-name [input] input)

(clojure.core/defn- deser-virtual-interface-type [input] input)

(clojure.core/defn- deser-count [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "locationCode") (clojure.core/assoc :location-code (deser-location-code (input "locationCode"))) (clojure.core/contains? input "locationName") (clojure.core/assoc :location-name (deser-location-name (input "locationName"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-region (input "region"))) (clojure.core/contains? input "availablePortSpeeds") (clojure.core/assoc :available-port-speeds (deser-available-port-speeds (input "availablePortSpeeds")))))

(clojure.core/defn- deser-amazon-address [input] input)

(clojure.core/defn- deser-interconnect-state [input] (clojure.core/get {"requested" :requested, "pending" :pending, "available" :available, "down" :down, "deleting" :deleting, "deleted" :deleted, "unknown" :unknown} input))

(clojure.core/defn- deser-route-filter-prefix-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-route-filter-prefix coll))) input))

(clojure.core/defn- deser-direct-connect-gateway-association-state [input] (clojure.core/get {"associating" :associating, "associated" :associated, "disassociating" :disassociating, "disassociated" :disassociated} input))

(clojure.core/defn- deser-virtual-gateway-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-virtual-gateway coll))) input))

(clojure.core/defn- deser-loa-content [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-aws-device-v-2 [input] input)

(clojure.core/defn- deser-lag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lag coll))) input))

(clojure.core/defn- deser-direct-connect-gateway-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-direct-connect-gateway coll))) input))

(clojure.core/defn- deser-virtual-gateway-region [input] input)

(clojure.core/defn- deser-partner-name [input] input)

(clojure.core/defn- deser-interconnect-name [input] input)

(clojure.core/defn- deser-lag-id [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-virtual-interface-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-virtual-interface coll))) input))

(clojure.core/defn- deser-direct-connect-gateway-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (input "directConnectGatewayId"))) (clojure.core/contains? input "virtualInterfaceId") (clojure.core/assoc :virtual-interface-id (deser-virtual-interface-id (input "virtualInterfaceId"))) (clojure.core/contains? input "virtualInterfaceRegion") (clojure.core/assoc :virtual-interface-region (deser-virtual-interface-region (input "virtualInterfaceRegion"))) (clojure.core/contains? input "virtualInterfaceOwnerAccount") (clojure.core/assoc :virtual-interface-owner-account (deser-owner-account (input "virtualInterfaceOwnerAccount"))) (clojure.core/contains? input "attachmentState") (clojure.core/assoc :attachment-state (deser-direct-connect-gateway-attachment-state (input "attachmentState"))) (clojure.core/contains? input "stateChangeError") (clojure.core/assoc :state-change-error (deser-state-change-error (input "stateChangeError")))))

(clojure.core/defn- deser-lag [input] (clojure.core/cond-> {} (clojure.core/contains? input "allowsHostedConnections") (clojure.core/assoc :allows-hosted-connections (deser-boolean-flag (input "allowsHostedConnections"))) (clojure.core/contains? input "numberOfConnections") (clojure.core/assoc :number-of-connections (deser-count (input "numberOfConnections"))) (clojure.core/contains? input "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (input "jumboFrameCapable"))) (clojure.core/contains? input "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (input "awsDeviceV2"))) (clojure.core/contains? input "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (input "awsDevice"))) (clojure.core/contains? input "minimumLinks") (clojure.core/assoc :minimum-links (deser-count (input "minimumLinks"))) (clojure.core/contains? input "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (input "ownerAccount"))) (clojure.core/contains? input "lagName") (clojure.core/assoc :lag-name (deser-lag-name (input "lagName"))) (clojure.core/contains? input "connectionsBandwidth") (clojure.core/assoc :connections-bandwidth (deser-bandwidth (input "connectionsBandwidth"))) (clojure.core/contains? input "lagId") (clojure.core/assoc :lag-id (deser-lag-id (input "lagId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location-code (input "location"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-region (input "region"))) (clojure.core/contains? input "lagState") (clojure.core/assoc :lag-state (deser-lag-state (input "lagState"))) (clojure.core/contains? input "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (input "hasLogicalRedundancy"))) (clojure.core/contains? input "connections") (clojure.core/assoc :connections (deser-connection-list (input "connections")))))

(clojure.core/defn- deser-has-logical-redundancy [input] (clojure.core/get {"unknown" :unknown, "yes" :yes, "no" :no} input))

(clojure.core/defn- deser-virtual-gateway-state [input] input)

(clojure.core/defn- deser-virtual-gateway [input] (clojure.core/cond-> {} (clojure.core/contains? input "virtualGatewayId") (clojure.core/assoc :virtual-gateway-id (deser-virtual-gateway-id (input "virtualGatewayId"))) (clojure.core/contains? input "virtualGatewayState") (clojure.core/assoc :virtual-gateway-state (deser-virtual-gateway-state (input "virtualGatewayState")))))

(clojure.core/defn- deser-aws-device [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-direct-connect-gateway-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (input "directConnectGatewayId"))) (clojure.core/contains? input "virtualGatewayId") (clojure.core/assoc :virtual-gateway-id (deser-virtual-gateway-id (input "virtualGatewayId"))) (clojure.core/contains? input "virtualGatewayRegion") (clojure.core/assoc :virtual-gateway-region (deser-virtual-gateway-region (input "virtualGatewayRegion"))) (clojure.core/contains? input "virtualGatewayOwnerAccount") (clojure.core/assoc :virtual-gateway-owner-account (deser-owner-account (input "virtualGatewayOwnerAccount"))) (clojure.core/contains? input "associationState") (clojure.core/assoc :association-state (deser-direct-connect-gateway-association-state (input "associationState"))) (clojure.core/contains? input "stateChangeError") (clojure.core/assoc :state-change-error (deser-state-change-error (input "stateChangeError")))))

(clojure.core/defn- deser-loa-issue-time [input] input)

(clojure.core/defn- deser-mtu [input] input)

(clojure.core/defn- deser-jumbo-frame-capable [input] input)

(clojure.core/defn- deser-long-asn [input] input)

(clojure.core/defn- deser-direct-connect-gateway-id [input] input)

(clojure.core/defn- deser-resource-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourceArn") (clojure.core/assoc :resource-arn (deser-resource-arn (input "resourceArn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-list (input "tags")))))

(clojure.core/defn- deser-port-speed [input] input)

(clojure.core/defn- deser-virtual-gateway-id [input] input)

(clojure.core/defn- deser-bgp-auth-key [input] input)

(clojure.core/defn- deser-route-filter-prefix [input] (clojure.core/cond-> {} (clojure.core/contains? input "cidr") (clojure.core/assoc :cidr (deser-cidr (input "cidr")))))

(clojure.core/defn- deser-loa [input] (clojure.core/cond-> {} (clojure.core/contains? input "loaContent") (clojure.core/assoc :loa-content (deser-loa-content (input "loaContent"))) (clojure.core/contains? input "loaContentType") (clojure.core/assoc :loa-content-type (deser-loa-content-type (input "loaContentType")))))

(clojure.core/defn- deser-connection [input] (clojure.core/cond-> {} (clojure.core/contains? input "partnerName") (clojure.core/assoc :partner-name (deser-partner-name (input "partnerName"))) (clojure.core/contains? input "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (input "jumboFrameCapable"))) (clojure.core/contains? input "connectionName") (clojure.core/assoc :connection-name (deser-connection-name (input "connectionName"))) (clojure.core/contains? input "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (input "awsDeviceV2"))) (clojure.core/contains? input "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (input "awsDevice"))) (clojure.core/contains? input "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (input "connectionId"))) (clojure.core/contains? input "connectionState") (clojure.core/assoc :connection-state (deser-connection-state (input "connectionState"))) (clojure.core/contains? input "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (input "bandwidth"))) (clojure.core/contains? input "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (input "ownerAccount"))) (clojure.core/contains? input "lagId") (clojure.core/assoc :lag-id (deser-lag-id (input "lagId"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location-code (input "location"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-region (input "region"))) (clojure.core/contains? input "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (input "loaIssueTime"))) (clojure.core/contains? input "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (input "hasLogicalRedundancy"))) (clojure.core/contains? input "vlan") (clojure.core/assoc :vlan (deser-vlan (input "vlan")))))

(clojure.core/defn- deser-bgp-status [input] (clojure.core/get {"up" :up, "down" :down, "unknown" :unknown} input))

(clojure.core/defn- deser-virtual-interface-state [input] (clojure.core/get {"deleting" :deleting, "unknown" :unknown, "down" :down, "deleted" :deleted, "rejected" :rejected, "verifying" :verifying, "pending" :pending, "available" :available, "confirming" :confirming} input))

(clojure.core/defn- deser-location-code [input] input)

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "key"))} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-bgp-peer [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (input "awsDeviceV2"))) (clojure.core/contains? input "bgpPeerId") (clojure.core/assoc :bgp-peer-id (deser-bgp-peer-id (input "bgpPeerId"))) (clojure.core/contains? input "addressFamily") (clojure.core/assoc :address-family (deser-address-family (input "addressFamily"))) (clojure.core/contains? input "customerAddress") (clojure.core/assoc :customer-address (deser-customer-address (input "customerAddress"))) (clojure.core/contains? input "amazonAddress") (clojure.core/assoc :amazon-address (deser-amazon-address (input "amazonAddress"))) (clojure.core/contains? input "bgpPeerState") (clojure.core/assoc :bgp-peer-state (deser-bgp-peer-state (input "bgpPeerState"))) (clojure.core/contains? input "authKey") (clojure.core/assoc :auth-key (deser-bgp-auth-key (input "authKey"))) (clojure.core/contains? input "bgpStatus") (clojure.core/assoc :bgp-status (deser-bgp-status (input "bgpStatus"))) (clojure.core/contains? input "asn") (clojure.core/assoc :asn (deser-asn (input "asn")))))

(clojure.core/defn- deser-state-change-error [input] input)

(clojure.core/defn- deser-lag-state [input] (clojure.core/get {"requested" :requested, "pending" :pending, "available" :available, "down" :down, "deleting" :deleting, "deleted" :deleted, "unknown" :unknown} input))

(clojure.core/defn- deser-lag-name [input] input)

(clojure.core/defn- deser-virtual-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "virtualInterfaceId") (clojure.core/assoc :virtual-interface-id (deser-virtual-interface-id (input "virtualInterfaceId"))) (clojure.core/contains? input "bgpPeers") (clojure.core/assoc :bgp-peers (deser-bgp-peer-list (input "bgpPeers"))) (clojure.core/contains? input "amazonSideAsn") (clojure.core/assoc :amazon-side-asn (deser-long-asn (input "amazonSideAsn"))) (clojure.core/contains? input "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (input "jumboFrameCapable"))) (clojure.core/contains? input "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (input "awsDeviceV2"))) (clojure.core/contains? input "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (input "connectionId"))) (clojure.core/contains? input "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (input "virtualInterfaceState"))) (clojure.core/contains? input "addressFamily") (clojure.core/assoc :address-family (deser-address-family (input "addressFamily"))) (clojure.core/contains? input "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (input "ownerAccount"))) (clojure.core/contains? input "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (input "directConnectGatewayId"))) (clojure.core/contains? input "customerAddress") (clojure.core/assoc :customer-address (deser-customer-address (input "customerAddress"))) (clojure.core/contains? input "mtu") (clojure.core/assoc :mtu (deser-mtu (input "mtu"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-location-code (input "location"))) (clojure.core/contains? input "virtualInterfaceName") (clojure.core/assoc :virtual-interface-name (deser-virtual-interface-name (input "virtualInterfaceName"))) (clojure.core/contains? input "region") (clojure.core/assoc :region (deser-region (input "region"))) (clojure.core/contains? input "virtualGatewayId") (clojure.core/assoc :virtual-gateway-id (deser-virtual-gateway-id (input "virtualGatewayId"))) (clojure.core/contains? input "virtualInterfaceType") (clojure.core/assoc :virtual-interface-type (deser-virtual-interface-type (input "virtualInterfaceType"))) (clojure.core/contains? input "amazonAddress") (clojure.core/assoc :amazon-address (deser-amazon-address (input "amazonAddress"))) (clojure.core/contains? input "vlan") (clojure.core/assoc :vlan (deser-vlan (input "vlan"))) (clojure.core/contains? input "customerRouterConfig") (clojure.core/assoc :customer-router-config (deser-router-config (input "customerRouterConfig"))) (clojure.core/contains? input "authKey") (clojure.core/assoc :auth-key (deser-bgp-auth-key (input "authKey"))) (clojure.core/contains? input "routeFilterPrefixes") (clojure.core/assoc :route-filter-prefixes (deser-route-filter-prefix-list (input "routeFilterPrefixes"))) (clojure.core/contains? input "asn") (clojure.core/assoc :asn (deser-asn (input "asn")))))

(clojure.core/defn- deser-direct-connect-gateway-attachment-state [input] (clojure.core/get {"attaching" :attaching, "attached" :attached, "detaching" :detaching, "detached" :detached} input))

(clojure.core/defn- deser-bgp-peer-id [input] input)

(clojure.core/defn- deser-virtual-interface-name [input] input)

(clojure.core/defn- deser-region [input] input)

(clojure.core/defn- deser-vlan [input] input)

(clojure.core/defn- deser-resource-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag coll))) input))

(clojure.core/defn- deser-direct-connect-gateway-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-direct-connect-gateway-association coll))) input))

(clojure.core/defn- deser-direct-connect-gateway-state [input] (clojure.core/get {"pending" :pending, "available" :available, "deleting" :deleting, "deleted" :deleted} input))

(clojure.core/defn- deser-available-port-speeds [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-port-speed coll))) input))

(clojure.core/defn- response-describe-tags-response ([input] (response-describe-tags-response nil input)) ([resultWrapper536361 input] (clojure.core/let [rawinput536360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536362 {"resourceTags" (rawinput536360 "resourceTags")}] (clojure.core/cond-> {} (letvar536362 "resourceTags") (clojure.core/assoc :resource-tags (deser-resource-tag-list (clojure.core/get-in letvar536362 ["resourceTags"])))))))

(clojure.core/defn- response-direct-connect-server-exception ([input] (response-direct-connect-server-exception nil input)) ([resultWrapper536364 input] (clojure.core/let [rawinput536363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536365 {"message" (rawinput536363 "message")}] (clojure.core/cond-> {} (letvar536365 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar536365 ["message"])))))))

(clojure.core/defn- response-describe-direct-connect-gateway-attachments-result ([input] (response-describe-direct-connect-gateway-attachments-result nil input)) ([resultWrapper536367 input] (clojure.core/let [rawinput536366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536368 {"directConnectGatewayAttachments" (rawinput536366 "directConnectGatewayAttachments"), "nextToken" (rawinput536366 "nextToken")}] (clojure.core/cond-> {} (letvar536368 "directConnectGatewayAttachments") (clojure.core/assoc :direct-connect-gateway-attachments (deser-direct-connect-gateway-attachment-list (clojure.core/get-in letvar536368 ["directConnectGatewayAttachments"]))) (letvar536368 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar536368 ["nextToken"])))))))

(clojure.core/defn- response-confirm-connection-response ([input] (response-confirm-connection-response nil input)) ([resultWrapper536370 input] (clojure.core/let [rawinput536369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536371 {"connectionState" (rawinput536369 "connectionState")}] (clojure.core/cond-> {} (letvar536371 "connectionState") (clojure.core/assoc :connection-state (deser-connection-state (clojure.core/get-in letvar536371 ["connectionState"])))))))

(clojure.core/defn- response-describe-connection-loa-response ([input] (response-describe-connection-loa-response nil input)) ([resultWrapper536373 input] (clojure.core/let [rawinput536372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536374 {"loa" (rawinput536372 "loa")}] (clojure.core/cond-> {} (letvar536374 "loa") (clojure.core/assoc :loa (deser-loa (clojure.core/get-in letvar536374 ["loa"])))))))

(clojure.core/defn- response-confirm-public-virtual-interface-response ([input] (response-confirm-public-virtual-interface-response nil input)) ([resultWrapper536376 input] (clojure.core/let [rawinput536375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536377 {"virtualInterfaceState" (rawinput536375 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar536377 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar536377 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-describe-direct-connect-gateways-result ([input] (response-describe-direct-connect-gateways-result nil input)) ([resultWrapper536379 input] (clojure.core/let [rawinput536378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536380 {"directConnectGateways" (rawinput536378 "directConnectGateways"), "nextToken" (rawinput536378 "nextToken")}] (clojure.core/cond-> {} (letvar536380 "directConnectGateways") (clojure.core/assoc :direct-connect-gateways (deser-direct-connect-gateway-list (clojure.core/get-in letvar536380 ["directConnectGateways"]))) (letvar536380 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar536380 ["nextToken"])))))))

(clojure.core/defn- response-interconnect ([input] (response-interconnect nil input)) ([resultWrapper536382 input] (clojure.core/let [rawinput536381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536383 {"jumboFrameCapable" (rawinput536381 "jumboFrameCapable"), "awsDeviceV2" (rawinput536381 "awsDeviceV2"), "awsDevice" (rawinput536381 "awsDevice"), "interconnectName" (rawinput536381 "interconnectName"), "bandwidth" (rawinput536381 "bandwidth"), "interconnectState" (rawinput536381 "interconnectState"), "lagId" (rawinput536381 "lagId"), "location" (rawinput536381 "location"), "region" (rawinput536381 "region"), "loaIssueTime" (rawinput536381 "loaIssueTime"), "hasLogicalRedundancy" (rawinput536381 "hasLogicalRedundancy"), "interconnectId" (rawinput536381 "interconnectId")}] (clojure.core/cond-> {} (letvar536383 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar536383 ["jumboFrameCapable"]))) (letvar536383 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar536383 ["awsDeviceV2"]))) (letvar536383 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar536383 ["awsDevice"]))) (letvar536383 "interconnectName") (clojure.core/assoc :interconnect-name (deser-interconnect-name (clojure.core/get-in letvar536383 ["interconnectName"]))) (letvar536383 "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (clojure.core/get-in letvar536383 ["bandwidth"]))) (letvar536383 "interconnectState") (clojure.core/assoc :interconnect-state (deser-interconnect-state (clojure.core/get-in letvar536383 ["interconnectState"]))) (letvar536383 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar536383 ["lagId"]))) (letvar536383 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar536383 ["location"]))) (letvar536383 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar536383 ["region"]))) (letvar536383 "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (clojure.core/get-in letvar536383 ["loaIssueTime"]))) (letvar536383 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar536383 ["hasLogicalRedundancy"]))) (letvar536383 "interconnectId") (clojure.core/assoc :interconnect-id (deser-interconnect-id (clojure.core/get-in letvar536383 ["interconnectId"])))))))

(clojure.core/defn- response-virtual-interfaces ([input] (response-virtual-interfaces nil input)) ([resultWrapper536385 input] (clojure.core/let [rawinput536384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536386 {"virtualInterfaces" (rawinput536384 "virtualInterfaces")}] (clojure.core/cond-> {} (letvar536386 "virtualInterfaces") (clojure.core/assoc :virtual-interfaces (deser-virtual-interface-list (clojure.core/get-in letvar536386 ["virtualInterfaces"])))))))

(clojure.core/defn- response-create-direct-connect-gateway-result ([input] (response-create-direct-connect-gateway-result nil input)) ([resultWrapper536388 input] (clojure.core/let [rawinput536387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536389 {"directConnectGateway" (rawinput536387 "directConnectGateway")}] (clojure.core/cond-> {} (letvar536389 "directConnectGateway") (clojure.core/assoc :direct-connect-gateway (deser-direct-connect-gateway (clojure.core/get-in letvar536389 ["directConnectGateway"])))))))

(clojure.core/defn- response-create-bgp-peer-response ([input] (response-create-bgp-peer-response nil input)) ([resultWrapper536391 input] (clojure.core/let [rawinput536390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536392 {"virtualInterface" (rawinput536390 "virtualInterface")}] (clojure.core/cond-> {} (letvar536392 "virtualInterface") (clojure.core/assoc :virtual-interface (deser-virtual-interface (clojure.core/get-in letvar536392 ["virtualInterface"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper536394 input] (clojure.core/let [rawinput536393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536395 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-bgp-peer-response ([input] (response-delete-bgp-peer-response nil input)) ([resultWrapper536397 input] (clojure.core/let [rawinput536396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536398 {"virtualInterface" (rawinput536396 "virtualInterface")}] (clojure.core/cond-> {} (letvar536398 "virtualInterface") (clojure.core/assoc :virtual-interface (deser-virtual-interface (clojure.core/get-in letvar536398 ["virtualInterface"])))))))

(clojure.core/defn- response-connections ([input] (response-connections nil input)) ([resultWrapper536400 input] (clojure.core/let [rawinput536399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536401 {"connections" (rawinput536399 "connections")}] (clojure.core/cond-> {} (letvar536401 "connections") (clojure.core/assoc :connections (deser-connection-list (clojure.core/get-in letvar536401 ["connections"])))))))

(clojure.core/defn- response-duplicate-tag-keys-exception ([input] (response-duplicate-tag-keys-exception nil input)) ([resultWrapper536403 input] (clojure.core/let [rawinput536402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536404 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-locations ([input] (response-locations nil input)) ([resultWrapper536406 input] (clojure.core/let [rawinput536405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536407 {"locations" (rawinput536405 "locations")}] (clojure.core/cond-> {} (letvar536407 "locations") (clojure.core/assoc :locations (deser-location-list (clojure.core/get-in letvar536407 ["locations"])))))))

(clojure.core/defn- response-lag ([input] (response-lag nil input)) ([resultWrapper536409 input] (clojure.core/let [rawinput536408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536410 {"allowsHostedConnections" (rawinput536408 "allowsHostedConnections"), "numberOfConnections" (rawinput536408 "numberOfConnections"), "jumboFrameCapable" (rawinput536408 "jumboFrameCapable"), "awsDeviceV2" (rawinput536408 "awsDeviceV2"), "awsDevice" (rawinput536408 "awsDevice"), "minimumLinks" (rawinput536408 "minimumLinks"), "ownerAccount" (rawinput536408 "ownerAccount"), "lagName" (rawinput536408 "lagName"), "connectionsBandwidth" (rawinput536408 "connectionsBandwidth"), "lagId" (rawinput536408 "lagId"), "location" (rawinput536408 "location"), "region" (rawinput536408 "region"), "lagState" (rawinput536408 "lagState"), "hasLogicalRedundancy" (rawinput536408 "hasLogicalRedundancy"), "connections" (rawinput536408 "connections")}] (clojure.core/cond-> {} (letvar536410 "allowsHostedConnections") (clojure.core/assoc :allows-hosted-connections (deser-boolean-flag (clojure.core/get-in letvar536410 ["allowsHostedConnections"]))) (letvar536410 "numberOfConnections") (clojure.core/assoc :number-of-connections (deser-count (clojure.core/get-in letvar536410 ["numberOfConnections"]))) (letvar536410 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar536410 ["jumboFrameCapable"]))) (letvar536410 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar536410 ["awsDeviceV2"]))) (letvar536410 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar536410 ["awsDevice"]))) (letvar536410 "minimumLinks") (clojure.core/assoc :minimum-links (deser-count (clojure.core/get-in letvar536410 ["minimumLinks"]))) (letvar536410 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar536410 ["ownerAccount"]))) (letvar536410 "lagName") (clojure.core/assoc :lag-name (deser-lag-name (clojure.core/get-in letvar536410 ["lagName"]))) (letvar536410 "connectionsBandwidth") (clojure.core/assoc :connections-bandwidth (deser-bandwidth (clojure.core/get-in letvar536410 ["connectionsBandwidth"]))) (letvar536410 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar536410 ["lagId"]))) (letvar536410 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar536410 ["location"]))) (letvar536410 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar536410 ["region"]))) (letvar536410 "lagState") (clojure.core/assoc :lag-state (deser-lag-state (clojure.core/get-in letvar536410 ["lagState"]))) (letvar536410 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar536410 ["hasLogicalRedundancy"]))) (letvar536410 "connections") (clojure.core/assoc :connections (deser-connection-list (clojure.core/get-in letvar536410 ["connections"])))))))

(clojure.core/defn- response-delete-interconnect-response ([input] (response-delete-interconnect-response nil input)) ([resultWrapper536412 input] (clojure.core/let [rawinput536411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536413 {"interconnectState" (rawinput536411 "interconnectState")}] (clojure.core/cond-> {} (letvar536413 "interconnectState") (clojure.core/assoc :interconnect-state (deser-interconnect-state (clojure.core/get-in letvar536413 ["interconnectState"])))))))

(clojure.core/defn- response-create-direct-connect-gateway-association-result ([input] (response-create-direct-connect-gateway-association-result nil input)) ([resultWrapper536415 input] (clojure.core/let [rawinput536414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536416 {"directConnectGatewayAssociation" (rawinput536414 "directConnectGatewayAssociation")}] (clojure.core/cond-> {} (letvar536416 "directConnectGatewayAssociation") (clojure.core/assoc :direct-connect-gateway-association (deser-direct-connect-gateway-association (clojure.core/get-in letvar536416 ["directConnectGatewayAssociation"])))))))

(clojure.core/defn- response-describe-interconnect-loa-response ([input] (response-describe-interconnect-loa-response nil input)) ([resultWrapper536418 input] (clojure.core/let [rawinput536417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536419 {"loa" (rawinput536417 "loa")}] (clojure.core/cond-> {} (letvar536419 "loa") (clojure.core/assoc :loa (deser-loa (clojure.core/get-in letvar536419 ["loa"])))))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper536421 input] (clojure.core/let [rawinput536420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536422 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-direct-connect-client-exception ([input] (response-direct-connect-client-exception nil input)) ([resultWrapper536424 input] (clojure.core/let [rawinput536423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536425 {"message" (rawinput536423 "message")}] (clojure.core/cond-> {} (letvar536425 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar536425 ["message"])))))))

(clojure.core/defn- response-loa ([input] (response-loa nil input)) ([resultWrapper536427 input] (clojure.core/let [rawinput536426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536428 {"loaContent" (rawinput536426 "loaContent"), "loaContentType" (rawinput536426 "loaContentType")}] (clojure.core/cond-> {} (letvar536428 "loaContent") (clojure.core/assoc :loa-content (deser-loa-content (clojure.core/get-in letvar536428 ["loaContent"]))) (letvar536428 "loaContentType") (clojure.core/assoc :loa-content-type (deser-loa-content-type (clojure.core/get-in letvar536428 ["loaContentType"])))))))

(clojure.core/defn- response-connection ([input] (response-connection nil input)) ([resultWrapper536430 input] (clojure.core/let [rawinput536429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536431 {"partnerName" (rawinput536429 "partnerName"), "jumboFrameCapable" (rawinput536429 "jumboFrameCapable"), "connectionName" (rawinput536429 "connectionName"), "awsDeviceV2" (rawinput536429 "awsDeviceV2"), "awsDevice" (rawinput536429 "awsDevice"), "connectionId" (rawinput536429 "connectionId"), "connectionState" (rawinput536429 "connectionState"), "bandwidth" (rawinput536429 "bandwidth"), "ownerAccount" (rawinput536429 "ownerAccount"), "lagId" (rawinput536429 "lagId"), "location" (rawinput536429 "location"), "region" (rawinput536429 "region"), "loaIssueTime" (rawinput536429 "loaIssueTime"), "hasLogicalRedundancy" (rawinput536429 "hasLogicalRedundancy"), "vlan" (rawinput536429 "vlan")}] (clojure.core/cond-> {} (letvar536431 "partnerName") (clojure.core/assoc :partner-name (deser-partner-name (clojure.core/get-in letvar536431 ["partnerName"]))) (letvar536431 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar536431 ["jumboFrameCapable"]))) (letvar536431 "connectionName") (clojure.core/assoc :connection-name (deser-connection-name (clojure.core/get-in letvar536431 ["connectionName"]))) (letvar536431 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar536431 ["awsDeviceV2"]))) (letvar536431 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar536431 ["awsDevice"]))) (letvar536431 "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (clojure.core/get-in letvar536431 ["connectionId"]))) (letvar536431 "connectionState") (clojure.core/assoc :connection-state (deser-connection-state (clojure.core/get-in letvar536431 ["connectionState"]))) (letvar536431 "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (clojure.core/get-in letvar536431 ["bandwidth"]))) (letvar536431 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar536431 ["ownerAccount"]))) (letvar536431 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar536431 ["lagId"]))) (letvar536431 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar536431 ["location"]))) (letvar536431 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar536431 ["region"]))) (letvar536431 "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (clojure.core/get-in letvar536431 ["loaIssueTime"]))) (letvar536431 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar536431 ["hasLogicalRedundancy"]))) (letvar536431 "vlan") (clojure.core/assoc :vlan (deser-vlan (clojure.core/get-in letvar536431 ["vlan"])))))))

(clojure.core/defn- response-delete-direct-connect-gateway-result ([input] (response-delete-direct-connect-gateway-result nil input)) ([resultWrapper536433 input] (clojure.core/let [rawinput536432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536434 {"directConnectGateway" (rawinput536432 "directConnectGateway")}] (clojure.core/cond-> {} (letvar536434 "directConnectGateway") (clojure.core/assoc :direct-connect-gateway (deser-direct-connect-gateway (clojure.core/get-in letvar536434 ["directConnectGateway"])))))))

(clojure.core/defn- response-interconnects ([input] (response-interconnects nil input)) ([resultWrapper536436 input] (clojure.core/let [rawinput536435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536437 {"interconnects" (rawinput536435 "interconnects")}] (clojure.core/cond-> {} (letvar536437 "interconnects") (clojure.core/assoc :interconnects (deser-interconnect-list (clojure.core/get-in letvar536437 ["interconnects"])))))))

(clojure.core/defn- response-confirm-private-virtual-interface-response ([input] (response-confirm-private-virtual-interface-response nil input)) ([resultWrapper536439 input] (clojure.core/let [rawinput536438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536440 {"virtualInterfaceState" (rawinput536438 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar536440 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar536440 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-virtual-gateways ([input] (response-virtual-gateways nil input)) ([resultWrapper536442 input] (clojure.core/let [rawinput536441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536443 {"virtualGateways" (rawinput536441 "virtualGateways")}] (clojure.core/cond-> {} (letvar536443 "virtualGateways") (clojure.core/assoc :virtual-gateways (deser-virtual-gateway-list (clojure.core/get-in letvar536443 ["virtualGateways"])))))))

(clojure.core/defn- response-delete-virtual-interface-response ([input] (response-delete-virtual-interface-response nil input)) ([resultWrapper536445 input] (clojure.core/let [rawinput536444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536446 {"virtualInterfaceState" (rawinput536444 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar536446 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar536446 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-virtual-interface ([input] (response-virtual-interface nil input)) ([resultWrapper536448 input] (clojure.core/let [rawinput536447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536449 {"virtualInterfaceId" (rawinput536447 "virtualInterfaceId"), "bgpPeers" (rawinput536447 "bgpPeers"), "amazonSideAsn" (rawinput536447 "amazonSideAsn"), "jumboFrameCapable" (rawinput536447 "jumboFrameCapable"), "awsDeviceV2" (rawinput536447 "awsDeviceV2"), "connectionId" (rawinput536447 "connectionId"), "virtualInterfaceState" (rawinput536447 "virtualInterfaceState"), "addressFamily" (rawinput536447 "addressFamily"), "ownerAccount" (rawinput536447 "ownerAccount"), "directConnectGatewayId" (rawinput536447 "directConnectGatewayId"), "customerAddress" (rawinput536447 "customerAddress"), "mtu" (rawinput536447 "mtu"), "location" (rawinput536447 "location"), "virtualInterfaceName" (rawinput536447 "virtualInterfaceName"), "region" (rawinput536447 "region"), "virtualGatewayId" (rawinput536447 "virtualGatewayId"), "virtualInterfaceType" (rawinput536447 "virtualInterfaceType"), "amazonAddress" (rawinput536447 "amazonAddress"), "vlan" (rawinput536447 "vlan"), "customerRouterConfig" (rawinput536447 "customerRouterConfig"), "authKey" (rawinput536447 "authKey"), "routeFilterPrefixes" (rawinput536447 "routeFilterPrefixes"), "asn" (rawinput536447 "asn")}] (clojure.core/cond-> {} (letvar536449 "virtualInterfaceId") (clojure.core/assoc :virtual-interface-id (deser-virtual-interface-id (clojure.core/get-in letvar536449 ["virtualInterfaceId"]))) (letvar536449 "bgpPeers") (clojure.core/assoc :bgp-peers (deser-bgp-peer-list (clojure.core/get-in letvar536449 ["bgpPeers"]))) (letvar536449 "amazonSideAsn") (clojure.core/assoc :amazon-side-asn (deser-long-asn (clojure.core/get-in letvar536449 ["amazonSideAsn"]))) (letvar536449 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar536449 ["jumboFrameCapable"]))) (letvar536449 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar536449 ["awsDeviceV2"]))) (letvar536449 "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (clojure.core/get-in letvar536449 ["connectionId"]))) (letvar536449 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar536449 ["virtualInterfaceState"]))) (letvar536449 "addressFamily") (clojure.core/assoc :address-family (deser-address-family (clojure.core/get-in letvar536449 ["addressFamily"]))) (letvar536449 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar536449 ["ownerAccount"]))) (letvar536449 "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (clojure.core/get-in letvar536449 ["directConnectGatewayId"]))) (letvar536449 "customerAddress") (clojure.core/assoc :customer-address (deser-customer-address (clojure.core/get-in letvar536449 ["customerAddress"]))) (letvar536449 "mtu") (clojure.core/assoc :mtu (deser-mtu (clojure.core/get-in letvar536449 ["mtu"]))) (letvar536449 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar536449 ["location"]))) (letvar536449 "virtualInterfaceName") (clojure.core/assoc :virtual-interface-name (deser-virtual-interface-name (clojure.core/get-in letvar536449 ["virtualInterfaceName"]))) (letvar536449 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar536449 ["region"]))) (letvar536449 "virtualGatewayId") (clojure.core/assoc :virtual-gateway-id (deser-virtual-gateway-id (clojure.core/get-in letvar536449 ["virtualGatewayId"]))) (letvar536449 "virtualInterfaceType") (clojure.core/assoc :virtual-interface-type (deser-virtual-interface-type (clojure.core/get-in letvar536449 ["virtualInterfaceType"]))) (letvar536449 "amazonAddress") (clojure.core/assoc :amazon-address (deser-amazon-address (clojure.core/get-in letvar536449 ["amazonAddress"]))) (letvar536449 "vlan") (clojure.core/assoc :vlan (deser-vlan (clojure.core/get-in letvar536449 ["vlan"]))) (letvar536449 "customerRouterConfig") (clojure.core/assoc :customer-router-config (deser-router-config (clojure.core/get-in letvar536449 ["customerRouterConfig"]))) (letvar536449 "authKey") (clojure.core/assoc :auth-key (deser-bgp-auth-key (clojure.core/get-in letvar536449 ["authKey"]))) (letvar536449 "routeFilterPrefixes") (clojure.core/assoc :route-filter-prefixes (deser-route-filter-prefix-list (clojure.core/get-in letvar536449 ["routeFilterPrefixes"]))) (letvar536449 "asn") (clojure.core/assoc :asn (deser-asn (clojure.core/get-in letvar536449 ["asn"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper536451 input] (clojure.core/let [rawinput536450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536452 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-direct-connect-gateway-associations-result ([input] (response-describe-direct-connect-gateway-associations-result nil input)) ([resultWrapper536454 input] (clojure.core/let [rawinput536453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536455 {"directConnectGatewayAssociations" (rawinput536453 "directConnectGatewayAssociations"), "nextToken" (rawinput536453 "nextToken")}] (clojure.core/cond-> {} (letvar536455 "directConnectGatewayAssociations") (clojure.core/assoc :direct-connect-gateway-associations (deser-direct-connect-gateway-association-list (clojure.core/get-in letvar536455 ["directConnectGatewayAssociations"]))) (letvar536455 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar536455 ["nextToken"])))))))

(clojure.core/defn- response-delete-direct-connect-gateway-association-result ([input] (response-delete-direct-connect-gateway-association-result nil input)) ([resultWrapper536457 input] (clojure.core/let [rawinput536456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536458 {"directConnectGatewayAssociation" (rawinput536456 "directConnectGatewayAssociation")}] (clojure.core/cond-> {} (letvar536458 "directConnectGatewayAssociation") (clojure.core/assoc :direct-connect-gateway-association (deser-direct-connect-gateway-association (clojure.core/get-in letvar536458 ["directConnectGatewayAssociation"])))))))

(clojure.core/defn- response-lags ([input] (response-lags nil input)) ([resultWrapper536460 input] (clojure.core/let [rawinput536459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar536461 {"lags" (rawinput536459 "lags")}] (clojure.core/cond-> {} (letvar536461 "lags") (clojure.core/assoc :lags (deser-lag-list (clojure.core/get-in letvar536461 ["lags"])))))))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/location-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-loa-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-loa-request/connection-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-loa-request/provider-name :portkey.aws.directconnect.-2012-10-25.describe-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/resource-arn-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/resource-arn))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/interconnect-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/provider-name :portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-tags-response/resource-tags (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/resource-tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-tags-response/resource-tags]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-server-exception/message (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/error-message))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.direct-connect-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-peer-state #{:deleted "deleting" :pending :deleting "deleted" :available :verifying "verifying" "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connection-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connection-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/location-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/location))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.update-virtual-interface-attributes-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.update-virtual-interface-attributes-request/mtu (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/update-virtual-interface-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.update-virtual-interface-attributes-request/virtual-interface-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.update-virtual-interface-attributes-request/mtu]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/associate-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.associate-virtual-interface-request/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.associate-virtual-interface-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-result/direct-connect-gateway-attachments (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-result/direct-connect-gateway-attachments :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/allocate-hosted-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/connection-id :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/owner-account :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/bandwidth :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/connection-name :portkey.aws.directconnect.-2012-10-25.allocate-hosted-connection-request/vlan] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/customer-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/router-config (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnect-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-virtual-interfaces-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-virtual-interfaces-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-virtual-interfaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-virtual-interfaces-request/connection-id :portkey.aws.directconnect.-2012-10-25.describe-virtual-interfaces-request/virtual-interface-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/address-family #{"ipv4" :ipv-4 "ipv6" :ipv-6})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connection-state #{:deleted :down "requested" :unknown "deleting" :rejected :pending "ordering" :deleting :ordering "unknown" "down" "deleted" :available "rejected" "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bandwidth (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-connection-response/connection-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.confirm-connection-response/connection-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-hosted-connections-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-hosted-connections-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-hosted-connections-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connection-loa-response/loa (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-connection-loa-response/loa]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-public-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.confirm-public-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-result/direct-connect-gateways (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-result/direct-connect-gateways :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-peer-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/bgp-peer))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/asn clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/owner-account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-request/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-request/virtual-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-name :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/amazon-side-asn :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/owner-account :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/direct-connect-gateway-state :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/boolean-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/loa-content-type #{"application/pdf" :applicationpdf})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connection-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/loa-issue-time (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-issue-time))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.interconnect/jumbo-frame-capable :portkey.aws.directconnect.-2012-10-25.interconnect/aws-device-v-2 :portkey.aws.directconnect.-2012-10-25.interconnect/aws-device :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-name :portkey.aws.directconnect.-2012-10-25.interconnect/bandwidth :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-state :portkey.aws.directconnect.-2012-10-25.interconnect/lag-id :portkey.aws.directconnect.-2012-10-25.interconnect/location :portkey.aws.directconnect.-2012-10-25.interconnect/region :portkey.aws.directconnect.-2012-10-25.interconnect/loa-issue-time :portkey.aws.directconnect.-2012-10-25.interconnect/has-logical-redundancy :portkey.aws.directconnect.-2012-10-25.interconnect/interconnect-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnect-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/interconnect))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connections-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-connections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-connections-request/connection-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-connection-request/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-connection-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-connection-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-connection-request/location :portkey.aws.directconnect.-2012-10-25.create-connection-request/bandwidth :portkey.aws.directconnect.-2012-10-25.create-connection-request/connection-name] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-connection-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-connection-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interfaces/virtual-interfaces (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interfaces (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.virtual-interfaces/virtual-interfaces]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/new-private-virtual-interface-allocation (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/new-private-virtual-interface-allocation))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/allocate-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/connection-id :portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/owner-account :portkey.aws.directconnect.-2012-10-25.allocate-private-virtual-interface-request/new-private-virtual-interface-allocation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-result/direct-connect-gateway (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-result/direct-connect-gateway]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.location/location-code (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.location/location-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.location/region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.location/available-port-speeds (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/available-port-speeds))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.location/location-code :portkey.aws.directconnect.-2012-10-25.location/location-name :portkey.aws.directconnect.-2012-10-25.location/region :portkey.aws.directconnect.-2012-10-25.location/available-port-speeds]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-bgp-peer-response/virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-bgp-peer-response/virtual-interface]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-public-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-public-virtual-interface-request/new-public-virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/new-public-virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-public-virtual-interface-request/connection-id :portkey.aws.directconnect.-2012-10-25.create-public-virtual-interface-request/new-public-virtual-interface] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/amazon-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/mtu (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/new-private-virtual-interface (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/virtual-interface-name :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/vlan :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/asn] :opt-un [:portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/address-family :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/customer-address :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/mtu :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/amazon-address :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface/auth-key]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnect-state #{:deleted :down "requested" :unknown "deleting" :pending :deleting "unknown" "down" "deleted" :available "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/route-filter-prefix-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/route-filter-prefix))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association-state #{:associating "associating" :associated "disassociated" :disassociated "associated" :disassociating "disassociating"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateway-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/virtual-gateway))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/loa-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/aws-device-v-2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/lag))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-response/virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-response/virtual-interface]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateway-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connections/connections (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connections (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.connections/connections]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.tag-resource-request/resource-arn :portkey.aws.directconnect.-2012-10-25.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/partner-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnect-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lag-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-request/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-request/virtual-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/tag-key))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/attachment-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-region :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/virtual-interface-owner-account :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/attachment-state :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-attachment/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/duplicate-tag-keys-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-virtual-interface-request/virtual-interface-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.locations/locations (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/locations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.locations/locations]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/allows-hosted-connections (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/boolean-flag))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/number-of-connections (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/minimum-links (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/connections-bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/lag-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lag/connections (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.lag/allows-hosted-connections :portkey.aws.directconnect.-2012-10-25.lag/number-of-connections :portkey.aws.directconnect.-2012-10-25.lag/jumbo-frame-capable :portkey.aws.directconnect.-2012-10-25.lag/aws-device-v-2 :portkey.aws.directconnect.-2012-10-25.lag/aws-device :portkey.aws.directconnect.-2012-10-25.lag/minimum-links :portkey.aws.directconnect.-2012-10-25.lag/owner-account :portkey.aws.directconnect.-2012-10-25.lag/lag-name :portkey.aws.directconnect.-2012-10-25.lag/connections-bandwidth :portkey.aws.directconnect.-2012-10-25.lag/lag-id :portkey.aws.directconnect.-2012-10-25.lag/location :portkey.aws.directconnect.-2012-10-25.lag/region :portkey.aws.directconnect.-2012-10-25.lag/lag-state :portkey.aws.directconnect.-2012-10-25.lag/has-logical-redundancy :portkey.aws.directconnect.-2012-10-25.lag/connections]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/has-logical-redundancy #{:yes :unknown "yes" "unknown" "no" :no})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateway-state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/connection-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/provider-name :portkey.aws.directconnect.-2012-10-25.describe-connection-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-gateway/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-gateway/virtual-gateway-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateway (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.virtual-gateway/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.virtual-gateway/virtual-gateway-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-private-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-private-virtual-interface-request/new-private-virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/new-private-virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-private-virtual-interface-request/connection-id :portkey.aws.directconnect.-2012-10-25.create-private-virtual-interface-request/new-private-virtual-interface] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-connections-on-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-connections-on-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-connections-on-interconnect-request/interconnect-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-interconnect-response/interconnect-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-interconnect-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-interconnect-response/interconnect-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-public-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.confirm-public-virtual-interface-request/virtual-interface-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/aws-device (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-interconnects-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-interconnects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-interconnects-request/interconnect-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-result/direct-connect-gateway-association (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-association-result/direct-connect-gateway-association]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/bgp-peer-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-peer-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/asn :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/customer-address :portkey.aws.directconnect.-2012-10-25.delete-bgp-peer-request/bgp-peer-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/association-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-region :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/virtual-gateway-owner-account :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/association-state :portkey.aws.directconnect.-2012-10-25.direct-connect-gateway-association/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/provider-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/loa-issue-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/mtu clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-response/loa (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-interconnect-loa-response/loa]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/jumbo-frame-capable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/long-asn clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/virtual-interface-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-request/direct-connect-gateway-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.resource-tag/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.resource-tag/tags (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/resource-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.resource-tag/resource-arn :portkey.aws.directconnect.-2012-10-25.resource-tag/tags]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-tags-request/resource-arns (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.describe-tags-request/resource-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/new-public-virtual-interface-allocation (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/virtual-interface-name :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/vlan :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/asn] :opt-un [:portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/auth-key :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/amazon-address :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/customer-address :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/address-family :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface-allocation/route-filter-prefixes]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.disassociate-connection-from-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.disassociate-connection-from-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/disassociate-connection-from-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.disassociate-connection-from-lag-request/connection-id :portkey.aws.directconnect.-2012-10-25.disassociate-connection-from-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-lag-request/number-of-connections (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-lag-request/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-lag-request/connections-bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-lag-request/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-lag-request/number-of-connections :portkey.aws.directconnect.-2012-10-25.create-lag-request/location :portkey.aws.directconnect.-2012-10-25.create-lag-request/connections-bandwidth :portkey.aws.directconnect.-2012-10-25.create-lag-request/lag-name] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-lag-request/connection-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-request/direct-connect-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/port-speed (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.direct-connect-client-exception/message (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/error-message))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.direct-connect-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-auth-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/max-results :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateways-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.route-filter-prefix/cidr (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/cidr))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/route-filter-prefix (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.route-filter-prefix/cidr]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.loa/loa-content (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-content))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.loa/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/loa (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.loa/loa-content :portkey.aws.directconnect.-2012-10-25.loa/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/partner-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/partner-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/connection-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/loa-issue-time (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa-issue-time))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.connection/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.connection/partner-name :portkey.aws.directconnect.-2012-10-25.connection/jumbo-frame-capable :portkey.aws.directconnect.-2012-10-25.connection/connection-name :portkey.aws.directconnect.-2012-10-25.connection/aws-device-v-2 :portkey.aws.directconnect.-2012-10-25.connection/aws-device :portkey.aws.directconnect.-2012-10-25.connection/connection-id :portkey.aws.directconnect.-2012-10-25.connection/connection-state :portkey.aws.directconnect.-2012-10-25.connection/bandwidth :portkey.aws.directconnect.-2012-10-25.connection/owner-account :portkey.aws.directconnect.-2012-10-25.connection/lag-id :portkey.aws.directconnect.-2012-10-25.connection/location :portkey.aws.directconnect.-2012-10-25.connection/region :portkey.aws.directconnect.-2012-10-25.connection/loa-issue-time :portkey.aws.directconnect.-2012-10-25.connection/has-logical-redundancy :portkey.aws.directconnect.-2012-10-25.connection/vlan]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-result/direct-connect-gateway (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-result/direct-connect-gateway]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-bgp-peer-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-bgp-peer-request/new-bgp-peer (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/new-bgp-peer))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-bgp-peer-request/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.create-bgp-peer-request/new-bgp-peer]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-status #{:down "up" :unknown :up "unknown" "down"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.interconnects/interconnects (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/interconnects (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.interconnects/interconnects]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-state #{:deleted :down :unknown "deleting" :rejected :pending :confirming :deleting "unknown" "down" "deleted" :available :verifying "rejected" "verifying" "pending" "available" "confirming"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-lags-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-lags-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-lags-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/max-result-set-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/new-public-virtual-interface-allocation (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/new-public-virtual-interface-allocation))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/allocate-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/connection-id :portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/owner-account :portkey.aws.directconnect.-2012-10-25.allocate-public-virtual-interface-request/new-public-virtual-interface-allocation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.confirm-private-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-gateways/virtual-gateways (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-gateways (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.virtual-gateways/virtual-gateways]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.tag/key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.tag/value (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-value))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.tag/key] :opt-un [:portkey.aws.directconnect.-2012-10-25.tag/value]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-peer-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-peer-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-peer-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-peer-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-status (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-status))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.bgp-peer/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-peer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.bgp-peer/aws-device-v-2 :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-peer-id :portkey.aws.directconnect.-2012-10-25.bgp-peer/address-family :portkey.aws.directconnect.-2012-10-25.bgp-peer/customer-address :portkey.aws.directconnect.-2012-10-25.bgp-peer/amazon-address :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-peer-state :portkey.aws.directconnect.-2012-10-25.bgp-peer/auth-key :portkey.aws.directconnect.-2012-10-25.bgp-peer/bgp-status :portkey.aws.directconnect.-2012-10-25.bgp-peer/asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-request/direct-connect-gateway-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-request/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-request/direct-connect-gateway-name] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-direct-connect-gateway-request/amazon-side-asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/interconnect-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/create-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.create-interconnect-request/interconnect-name :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/bandwidth :portkey.aws.directconnect.-2012-10-25.create-interconnect-request/location] :opt-un [:portkey.aws.directconnect.-2012-10-25.create-interconnect-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/state-change-error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/new-public-virtual-interface (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/virtual-interface-name :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/vlan :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/asn] :opt-un [:portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/auth-key :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/amazon-address :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/customer-address :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/address-family :portkey.aws.directconnect.-2012-10-25.new-public-virtual-interface/route-filter-prefixes]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lag-state #{:deleted :down "requested" :unknown "deleting" :pending :deleting "unknown" "down" "deleted" :available "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-connection-with-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-connection-with-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/associate-connection-with-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.associate-connection-with-lag-request/connection-id :portkey.aws.directconnect.-2012-10-25.associate-connection-with-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-hosted-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.associate-hosted-connection-request/parent-connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/associate-hosted-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.associate-hosted-connection-request/connection-id :portkey.aws.directconnect.-2012-10-25.associate-hosted-connection-request/parent-connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/allocate-connection-on-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/bandwidth :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/connection-name :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/owner-account :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/interconnect-id :portkey.aws.directconnect.-2012-10-25.allocate-connection-on-interconnect-request/vlan] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/mtu (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/new-private-virtual-interface-allocation (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/virtual-interface-name :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/vlan :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/asn] :opt-un [:portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/mtu :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/auth-key :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/amazon-address :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/address-family :portkey.aws.directconnect.-2012-10-25.new-private-virtual-interface-allocation/customer-address]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/bgp-peers (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-peer-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/mtu (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/location (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/region (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-type (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/customer-router-config (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/router-config))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.virtual-interface/bgp-peers :portkey.aws.directconnect.-2012-10-25.virtual-interface/amazon-side-asn :portkey.aws.directconnect.-2012-10-25.virtual-interface/jumbo-frame-capable :portkey.aws.directconnect.-2012-10-25.virtual-interface/aws-device-v-2 :portkey.aws.directconnect.-2012-10-25.virtual-interface/connection-id :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-state :portkey.aws.directconnect.-2012-10-25.virtual-interface/address-family :portkey.aws.directconnect.-2012-10-25.virtual-interface/owner-account :portkey.aws.directconnect.-2012-10-25.virtual-interface/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.virtual-interface/customer-address :portkey.aws.directconnect.-2012-10-25.virtual-interface/mtu :portkey.aws.directconnect.-2012-10-25.virtual-interface/location :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-name :portkey.aws.directconnect.-2012-10-25.virtual-interface/region :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.virtual-interface/virtual-interface-type :portkey.aws.directconnect.-2012-10-25.virtual-interface/amazon-address :portkey.aws.directconnect.-2012-10-25.virtual-interface/vlan :portkey.aws.directconnect.-2012-10-25.virtual-interface/customer-router-config :portkey.aws.directconnect.-2012-10-25.virtual-interface/auth-key :portkey.aws.directconnect.-2012-10-25.virtual-interface/route-filter-prefixes :portkey.aws.directconnect.-2012-10-25.virtual-interface/asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-attachment-state #{"attached" "detaching" :detached "detached" "attaching" :attaching :attached :detaching})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/bgp-peer-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/virtual-interface-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/asn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/address-family (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/new-bgp-peer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.new-bgp-peer/asn :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/auth-key :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/address-family :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/amazon-address :portkey.aws.directconnect.-2012-10-25.new-bgp-peer/customer-address]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-result/direct-connect-gateway-associations (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-result/direct-connect-gateway-associations :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/virtual-interface-id :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/max-results :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-attachments-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-result/direct-connect-gateway-association (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.delete-direct-connect-gateway-association-result/direct-connect-gateway-association]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.untag-resource-request/resource-arn :portkey.aws.directconnect.-2012-10-25.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.lags/lags (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/lags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.lags/lags]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/vlan clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.update-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.update-lag-request/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.update-lag-request/minimum-links (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/update-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.update-lag-request/lag-id] :opt-un [:portkey.aws.directconnect.-2012-10-25.update-lag-request/lag-name :portkey.aws.directconnect.-2012-10-25.update-lag-request/minimum-links]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.delete-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/delete-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.delete-interconnect-request/interconnect-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/resource-tag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/resource-tag))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-association))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-state #{:deleted "deleting" :pending :deleting "deleted" :available "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/direct-connect-gateway-id :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/virtual-gateway-id :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/max-results :portkey.aws.directconnect.-2012-10-25.describe-direct-connect-gateway-associations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/available-port-speeds (clojure.spec.alpha/coll-of :portkey.aws.directconnect.-2012-10-25/port-speed))

(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25.confirm-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.-2012-10-25/confirm-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.-2012-10-25.confirm-connection-request/connection-id] :opt-un []))

(clojure.core/defn tag-resource "Adds the specified tags to the specified AWS Direct Connect resource. Each\nresource can have a maximum of 50 tags.\n Each tag consists of a key and an optional value. If a tag with the same key is\nalready associated with the resource, this action updates its value." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"DuplicateTagKeysException" :portkey.aws.directconnect.-2012-10-25/duplicate-tag-keys-exception, "TooManyTagsException" :portkey.aws.directconnect.-2012-10-25/too-many-tags-exception, "DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/tag-resource-response))

(clojure.core/defn describe-interconnect-loa "Deprecated. Use DescribeLoa instead.\n Gets the LOA-CFA for the specified interconnect.\n The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a\ndocument that is used when establishing your cross connect to AWS at the\ncolocation facility. For more information, see Requesting Cross Connects at AWS\nDirect Connect Locations\n(https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html) in\nthe AWS Direct Connect User Guide." ([describe-interconnect-loa-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-interconnect-loa-request describe-interconnect-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInterconnectLoa", :http.request.configuration/output-deser-fn response-describe-interconnect-loa-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-interconnect-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-interconnect-loa-response))

(clojure.core/defn update-lag "Updates the attributes of the specified link aggregation group (LAG).\n You can update the following attributes:\n * The name of the LAG.\n * The value for the minimum number of connections that must be operational for\nthe LAG itself to be operational.\n When you create a LAG, the default value for the minimum number of operational\nconnections is zero (0). If you update this value and the number of operational\nconnections falls below the specified value, the LAG automatically goes down to\navoid over-utilization of the remaining connections. Adjust this value with\ncare, as it could force the LAG down if it is set higher than the current number\nof operational connections." ([update-lag-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-lag-request update-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/update-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef update-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/update-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag))

(clojure.core/defn confirm-connection "Confirms the creation of the specified hosted connection on an interconnect.\n Upon creation, the hosted connection is initially in the Ordering state, and\nremains in this state until the owner confirms creation of the hosted\nconnection." ([confirm-connection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-connection-request confirm-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/confirm-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/confirm-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmConnection", :http.request.configuration/output-deser-fn response-confirm-connection-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/confirm-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/confirm-connection-response))

(clojure.core/defn describe-loa "Gets the LOA-CFA for a connection, interconnect, or link aggregation group\n(LAG).\n The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a\ndocument that is used when establishing your cross connect to AWS at the\ncolocation facility. For more information, see Requesting Cross Connects at AWS\nDirect Connect Locations\n(https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html) in\nthe AWS Direct Connect User Guide." ([describe-loa-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-loa-request describe-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/loa, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLoa", :http.request.configuration/output-deser-fn response-loa, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/loa))

(clojure.core/defn describe-connections-on-interconnect "Deprecated. Use DescribeHostedConnections instead.\n Lists the connections that have been provisioned on the specified interconnect.\n Intended for use by AWS Direct Connect partners only." ([describe-connections-on-interconnect-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-connections-on-interconnect-request describe-connections-on-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-connections-on-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnectionsOnInterconnect", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connections-on-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-connections-on-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connections))

(clojure.core/defn describe-direct-connect-gateways "Lists all your Direct Connect gateways or only the specified Direct Connect\ngateway. Deleted Direct Connect gateways are not returned." ([] (describe-direct-connect-gateways {})) ([describe-direct-connect-gateways-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-direct-connect-gateways-request describe-direct-connect-gateways-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGateways", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateways-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateways :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateways-result))

(clojure.core/defn describe-virtual-interfaces "Displays all virtual interfaces for an AWS account. Virtual interfaces deleted\nfewer than 15 minutes before you make the request are also returned. If you\nspecify a connection ID, only the virtual interfaces associated with the\nconnection are returned. If you specify a virtual interface ID, then only a\nsingle virtual interface is returned.\n A virtual interface (VLAN) transmits the traffic between the AWS Direct Connect\nlocation and the customer network." ([] (describe-virtual-interfaces {})) ([describe-virtual-interfaces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-virtual-interfaces-request describe-virtual-interfaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interfaces, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-virtual-interfaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualInterfaces", :http.request.configuration/output-deser-fn response-virtual-interfaces, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-interfaces :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-virtual-interfaces-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interfaces))

(clojure.core/defn create-interconnect "Creates an interconnect between an AWS Direct Connect partner's network and a\nspecific AWS Direct Connect location.\n An interconnect is a connection which is capable of hosting other connections.\nThe partner can use an interconnect to provide sub-1Gbps AWS Direct Connect\nservice to tier 2 customers who do not have their own connections. Like a\nstandard connection, an interconnect links the partner's network to an AWS\nDirect Connect location over a standard Ethernet fiber-optic cable. One end is\nconnected to the partner's router, the other to an AWS Direct Connect router.\n You can automatically add the new interconnect to a link aggregation group\n(LAG) by specifying a LAG ID in the request. This ensures that the new\ninterconnect is allocated on the same AWS Direct Connect endpoint that hosts the\nspecified LAG. If there are no available ports on the endpoint, the request\nfails and no interconnect is created.\n For each end customer, the AWS Direct Connect partner provisions a connection\non their interconnect by calling AllocateConnectionOnInterconnect. The end\ncustomer can then connect to AWS resources by creating a virtual interface on\ntheir connection, using the VLAN assigned to them by the partner.\n Intended for use by AWS Direct Connect partners only." ([create-interconnect-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-interconnect-request create-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/interconnect, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInterconnect", :http.request.configuration/output-deser-fn response-interconnect, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnect))

(clojure.core/defn describe-hosted-connections "Lists the hosted connections that have been provisioned on the specified\ninterconnect or link aggregation group (LAG).\n Intended for use by AWS Direct Connect partners only." ([describe-hosted-connections-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-hosted-connections-request describe-hosted-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-hosted-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHostedConnections", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-hosted-connections :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-hosted-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connections))

(clojure.core/defn delete-direct-connect-gateway-association "Deletes the association between the specified Direct Connect gateway and virtual\nprivate gateway." ([delete-direct-connect-gateway-association-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-direct-connect-gateway-association-request delete-direct-connect-gateway-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectConnectGatewayAssociation", :http.request.configuration/output-deser-fn response-delete-direct-connect-gateway-association-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-direct-connect-gateway-association :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-association-result))

(clojure.core/defn describe-direct-connect-gateway-associations "Lists the associations between your Direct Connect gateways and virtual private\ngateways. You must specify a Direct Connect gateway, a virtual private gateway,\nor both. If you specify a Direct Connect gateway, the response contains all\nvirtual private gateways associated with the Direct Connect gateway. If you\nspecify a virtual private gateway, the response contains all Direct Connect\ngateways associated with the virtual private gateway. If you specify both, the\nresponse contains the association between the Direct Connect gateway and the\nvirtual private gateway." ([] (describe-direct-connect-gateway-associations {})) ([describe-direct-connect-gateway-associations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-direct-connect-gateway-associations-request describe-direct-connect-gateway-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGatewayAssociations", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateway-associations-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateway-associations :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-associations-result))

(clojure.core/defn delete-direct-connect-gateway "Deletes the specified Direct Connect gateway. You must first delete all virtual\ninterfaces that are attached to the Direct Connect gateway and disassociate all\nvirtual private gateways that are associated with the Direct Connect gateway." ([delete-direct-connect-gateway-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-direct-connect-gateway-request delete-direct-connect-gateway-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectConnectGateway", :http.request.configuration/output-deser-fn response-delete-direct-connect-gateway-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-direct-connect-gateway :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/delete-direct-connect-gateway-result))

(clojure.core/defn allocate-hosted-connection "Creates a hosted connection on the specified interconnect or a link aggregation\ngroup (LAG).\n Allocates a VLAN number and a specified amount of bandwidth for use by a hosted\nconnection on the specified interconnect or LAG.\n Intended for use by AWS Direct Connect partners only." ([allocate-hosted-connection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-allocate-hosted-connection-request allocate-hosted-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/allocate-hosted-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocateHostedConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-hosted-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/allocate-hosted-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn create-connection "Creates a connection between a customer network and a specific AWS Direct\nConnect location.\n A connection links your internal network to an AWS Direct Connect location over\na standard Ethernet fiber-optic cable. One end of the cable is connected to your\nrouter, the other to an AWS Direct Connect router.\n To find the locations for your Region, use DescribeLocations.\n You can automatically add the new connection to a link aggregation group (LAG)\nby specifying a LAG ID in the request. This ensures that the new connection is\nallocated on the same AWS Direct Connect endpoint that hosts the specified LAG.\nIf there are no available ports on the endpoint, the request fails and no\nconnection is created." ([create-connection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-connection-request create-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn associate-connection-with-lag "Associates an existing connection with a link aggregation group (LAG). The\nconnection is interrupted and re-established as a member of the LAG\n(connectivity to AWS is interrupted). The connection must be hosted on the same\nAWS Direct Connect endpoint as the LAG, and its bandwidth must match the\nbandwidth for the LAG. You can re-associate a connection that's currently\nassociated with a different LAG; however, if removing the connection would cause\nthe original LAG to fall below its setting for minimum number of operational\nconnections, the request fails.\n Any virtual interfaces that are directly associated with the connection are\nautomatically re-associated with the LAG. If the connection was originally\nassociated with a different LAG, the virtual interfaces remain associated with\nthe original LAG.\n For interconnects, any hosted connections are automatically re-associated with\nthe LAG. If the interconnect was originally associated with a different LAG, the\nhosted connections remain associated with the original LAG." ([associate-connection-with-lag-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-connection-with-lag-request associate-connection-with-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/associate-connection-with-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateConnectionWithLag", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-connection-with-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/associate-connection-with-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn associate-hosted-connection "Associates a hosted connection and its virtual interfaces with a link\naggregation group (LAG) or interconnect. If the target interconnect or LAG has\nan existing hosted connection with a conflicting VLAN number or IP address, the\noperation fails. This action temporarily interrupts the hosted connection's\nconnectivity to AWS as it is being migrated.\n Intended for use by AWS Direct Connect partners only." ([associate-hosted-connection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-hosted-connection-request associate-hosted-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/associate-hosted-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateHostedConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-hosted-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/associate-hosted-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn confirm-private-virtual-interface "Accepts ownership of a private virtual interface created by another AWS account.\n After the virtual interface owner makes this call, the virtual interface is\ncreated and attached to the specified virtual private gateway or Direct Connect\ngateway, and is made available to handle traffic." ([confirm-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-private-virtual-interface-request confirm-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmPrivateVirtualInterface", :http.request.configuration/output-deser-fn response-confirm-private-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/confirm-private-virtual-interface-response))

(clojure.core/defn describe-tags "Describes the tags associated with the specified AWS Direct Connect resources." ([describe-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-tags-response))

(clojure.core/defn create-private-virtual-interface "Creates a private virtual interface. A virtual interface is the VLAN that\ntransports AWS Direct Connect traffic. A private virtual interface can be\nconnected to either a Direct Connect gateway or a Virtual Private Gateway (VGW).\nConnecting the private virtual interface to a Direct Connect gateway enables the\npossibility for connecting to multiple VPCs, including VPCs in different AWS\nRegions. Connecting the private virtual interface to a VGW only provides access\nto a single VPC within the same Region." ([create-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-private-virtual-interface-request create-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePrivateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn allocate-connection-on-interconnect "Deprecated. Use AllocateHostedConnection instead.\n Creates a hosted connection on an interconnect.\n Allocates a VLAN number and a specified amount of bandwidth for use by a hosted\nconnection on the specified interconnect.\n Intended for use by AWS Direct Connect partners only." ([allocate-connection-on-interconnect-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-allocate-connection-on-interconnect-request allocate-connection-on-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/allocate-connection-on-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocateConnectionOnInterconnect", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-connection-on-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/allocate-connection-on-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn describe-interconnects "Lists the interconnects owned by the AWS account or only the specified\ninterconnect." ([] (describe-interconnects {})) ([describe-interconnects-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-interconnects-request describe-interconnects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/interconnects, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-interconnects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInterconnects", :http.request.configuration/output-deser-fn response-interconnects, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-interconnects :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-interconnects-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/interconnects))

(clojure.core/defn delete-lag "Deletes the specified link aggregation group (LAG). You cannot delete a LAG if\nit has active virtual interfaces or hosted connections." ([delete-lag-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-lag-request delete-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag))

(clojure.core/defn disassociate-connection-from-lag "Disassociates a connection from a link aggregation group (LAG). The connection\nis interrupted and re-established as a standalone connection (the connection is\nnot deleted; to delete the connection, use the DeleteConnection request). If the\nLAG has associated virtual interfaces or hosted connections, they remain\nassociated with the LAG. A disassociated connection owned by an AWS Direct\nConnect partner is automatically converted to an interconnect.\n If disassociating the connection would cause the LAG to fall below its setting\nfor minimum number of operational connections, the request fails, except when\nit's the last member of the LAG. If all connections are disassociated, the LAG\ncontinues to exist as an empty LAG with no physical connections." ([disassociate-connection-from-lag-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-connection-from-lag-request disassociate-connection-from-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/disassociate-connection-from-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateConnectionFromLag", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef disassociate-connection-from-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/disassociate-connection-from-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn describe-connections "Displays the specified connection or all connections in this Region." ([] (describe-connections {})) ([describe-connections-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-connections-request describe-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnections", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connections :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connections))

(clojure.core/defn delete-bgp-peer "Deletes the specified BGP peer on the specified virtual interface with the\nspecified customer address and ASN.\n You cannot delete the last BGP peer from a virtual interface." ([] (delete-bgp-peer {})) ([delete-bgp-peer-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bgp-peer-request delete-bgp-peer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBGPPeer", :http.request.configuration/output-deser-fn response-delete-bgp-peer-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-bgp-peer :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/delete-bgp-peer-response))

(clojure.core/defn confirm-public-virtual-interface "Accepts ownership of a public virtual interface created by another AWS account.\n After the virtual interface owner makes this call, the specified virtual\ninterface is created and made available to handle traffic." ([confirm-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-confirm-public-virtual-interface-request confirm-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmPublicVirtualInterface", :http.request.configuration/output-deser-fn response-confirm-public-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/confirm-public-virtual-interface-response))

(clojure.core/defn describe-virtual-gateways "Lists the virtual private gateways owned by the AWS account.\n You can create one or more AWS Direct Connect private virtual interfaces linked\nto a virtual private gateway." ([] (describe-virtual-gateways {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-gateways, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualGateways", :http.request.configuration/output-deser-fn response-virtual-gateways, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-gateways :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-gateways))

(clojure.core/defn create-direct-connect-gateway-association "Creates an association between a Direct Connect gateway and a virtual private\ngateway. The virtual private gateway must be attached to a VPC and must not be\nassociated with another Direct Connect gateway." ([create-direct-connect-gateway-association-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-direct-connect-gateway-association-request create-direct-connect-gateway-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectConnectGatewayAssociation", :http.request.configuration/output-deser-fn response-create-direct-connect-gateway-association-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-direct-connect-gateway-association :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-association-result))

(clojure.core/defn delete-connection "Deletes the specified connection.\n Deleting a connection only stops the AWS Direct Connect port hour and data\ntransfer charges. If you are partnering with any third parties to connect with\nthe AWS Direct Connect location, you must cancel your service with them\nseparately." ([delete-connection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-connection-request delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/connection))

(clojure.core/defn create-bgp-peer "Creates a BGP peer on the specified virtual interface.\n You must create a BGP peer for the corresponding address family (IPv4/IPv6) in\norder to access AWS resources that also use that address family.\n If logical redundancy is not supported by the connection, interconnect, or LAG,\nthe BGP peer cannot be in the same address family as an existing BGP peer on the\nvirtual interface.\n When creating a IPv6 BGP peer, omit the Amazon address and customer address.\nIPv6 addresses are automatically assigned from the Amazon pool of IPv6\naddresses; you cannot specify custom IPv6 addresses.\n For a public virtual interface, the Autonomous System Number (ASN) must be\nprivate or already whitelisted for the virtual interface." ([] (create-bgp-peer {})) ([create-bgp-peer-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-bgp-peer-request create-bgp-peer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBGPPeer", :http.request.configuration/output-deser-fn response-create-bgp-peer-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-bgp-peer :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/create-bgp-peer-response))

(clojure.core/defn delete-virtual-interface "Deletes a virtual interface." ([delete-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-virtual-interface-request delete-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVirtualInterface", :http.request.configuration/output-deser-fn response-delete-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/delete-virtual-interface-response))

(clojure.core/defn untag-resource "Removes one or more tags from the specified AWS Direct Connect resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/untag-resource-response))

(clojure.core/defn describe-lags "Describes all your link aggregation groups (LAG) or the specified LAG." ([] (describe-lags {})) ([describe-lags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-lags-request describe-lags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/lags, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-lags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLags", :http.request.configuration/output-deser-fn response-lags, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-lags :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-lags-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lags))

(clojure.core/defn describe-direct-connect-gateway-attachments "Lists the attachments between your Direct Connect gateways and virtual\ninterfaces. You must specify a Direct Connect gateway, a virtual interface, or\nboth. If you specify a Direct Connect gateway, the response contains all virtual\ninterfaces attached to the Direct Connect gateway. If you specify a virtual\ninterface, the response contains all Direct Connect gateways attached to the\nvirtual interface. If you specify both, the response contains the attachment\nbetween the Direct Connect gateway and the virtual interface." ([] (describe-direct-connect-gateway-attachments {})) ([describe-direct-connect-gateway-attachments-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-direct-connect-gateway-attachments-request describe-direct-connect-gateway-attachments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGatewayAttachments", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateway-attachments-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateway-attachments :args (clojure.spec.alpha/? :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-direct-connect-gateway-attachments-result))

(clojure.core/defn describe-locations "Lists the AWS Direct Connect locations in the current AWS Region. These are the\nlocations that can be selected when calling CreateConnection or\nCreateInterconnect." ([] (describe-locations {})) ([_] (clojure.core/let [request-function-result__22119__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/locations, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLocations", :http.request.configuration/output-deser-fn response-locations, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-locations :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/locations))

(clojure.core/defn allocate-private-virtual-interface "Provisions a private virtual interface to be owned by the specified AWS account.\n Virtual interfaces created using this action must be confirmed by the owner\nusing ConfirmPrivateVirtualInterface. Until then, the virtual interface is in\nthe Confirming state and is not available to handle traffic." ([allocate-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-allocate-private-virtual-interface-request allocate-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/allocate-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocatePrivateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/allocate-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn create-lag "Creates a link aggregation group (LAG) with the specified number of bundled\nphysical connections between the customer network and a specific AWS Direct\nConnect location. A LAG is a logical interface that uses the Link Aggregation\nControl Protocol (LACP) to aggregate multiple interfaces, enabling you to treat\nthem as a single interface.\n All connections in a LAG must use the same bandwidth and must terminate at the\nsame AWS Direct Connect endpoint.\n You can have up to 10 connections per LAG. Regardless of this limit, if you\nrequest more connections for the LAG than AWS Direct Connect can allocate on a\nsingle endpoint, no LAG is created.\n You can specify an existing physical connection or interconnect to include in\nthe LAG (which counts towards the total number of connections). Doing so\ninterrupts the current physical connection or hosted connections, and\nre-establishes them as a member of the LAG. The LAG will be created on the same\nAWS Direct Connect endpoint to which the connection terminates. Any virtual\ninterfaces associated with the connection are automatically disassociated and\nre-associated with the LAG. The connection ID does not change.\n If the AWS account used to create a LAG is a registered AWS Direct Connect\npartner, the LAG is automatically enabled to host sub-connections. For a LAG\nowned by a partner, any associated virtual interfaces cannot be directly\nconfigured." ([create-lag-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-lag-request create-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/lag))

(clojure.core/defn delete-interconnect "Deletes the specified interconnect.\n Intended for use by AWS Direct Connect partners only." ([delete-interconnect-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-interconnect-request delete-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/delete-interconnect-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/delete-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInterconnect", :http.request.configuration/output-deser-fn response-delete-interconnect-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/delete-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/delete-interconnect-response))

(clojure.core/defn create-public-virtual-interface "Creates a public virtual interface. A virtual interface is the VLAN that\ntransports AWS Direct Connect traffic. A public virtual interface supports\nsending traffic to public services of AWS such as Amazon S3.\n When creating an IPv6 public virtual interface (addressFamily is ipv6), leave\nthe customer and amazon address fields blank to use auto-assigned IPv6 space.\nCustom IPv6 addresses are not supported." ([create-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-public-virtual-interface-request create-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn allocate-public-virtual-interface "Provisions a public virtual interface to be owned by the specified AWS account.\n The owner of a connection calls this function to provision a public virtual\ninterface to be owned by the specified AWS account.\n Virtual interfaces created using this function must be confirmed by the owner\nusing ConfirmPublicVirtualInterface. Until this step has been completed, the\nvirtual interface is in the confirming state and is not available to handle\ntraffic.\n When creating an IPv6 public virtual interface, omit the Amazon address and\ncustomer address. IPv6 addresses are automatically assigned from the Amazon pool\nof IPv6 addresses; you cannot specify custom IPv6 addresses." ([allocate-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-allocate-public-virtual-interface-request allocate-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/allocate-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocatePublicVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/allocate-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn describe-connection-loa "Deprecated. Use DescribeLoa instead.\n Gets the LOA-CFA for a connection.\n The Letter of Authorization - Connecting Facility Assignment (LOA-CFA) is a\ndocument that your APN partner or service provider uses when establishing your\ncross connect to AWS at the colocation facility. For more information, see\nRequesting Cross Connects at AWS Direct Connect Locations\n(https://docs.aws.amazon.com/directconnect/latest/UserGuide/Colocation.html) in\nthe AWS Direct Connect User Guide." ([describe-connection-loa-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-connection-loa-request describe-connection-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnectionLoa", :http.request.configuration/output-deser-fn response-describe-connection-loa-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connection-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/describe-connection-loa-response))

(clojure.core/defn update-virtual-interface-attributes "Updates the specified attributes of the specified virtual private interface.\n Setting the MTU of a virtual interface to 9001 (jumbo frames) can cause an\nupdate to the underlying physical connection if it wasn't updated to support\njumbo frames. Updating the connection disrupts network connectivity for all\nvirtual interfaces associated with the connection for up to 30 seconds. To check\nwhether your connection supports jumbo frames, call DescribeConnections. To\ncheck whether your virtual interface supports jumbo frames, call\nDescribeVirtualInterfaces." ([update-virtual-interface-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-virtual-interface-attributes-request update-virtual-interface-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/update-virtual-interface-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVirtualInterfaceAttributes", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef update-virtual-interface-attributes :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/update-virtual-interface-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn associate-virtual-interface "Associates a virtual interface with a specified link aggregation group (LAG) or\nconnection. Connectivity to AWS is temporarily interrupted as the virtual\ninterface is being migrated. If the target connection or LAG has an associated\nvirtual interface with a conflicting VLAN number or a conflicting IP address,\nthe operation fails.\n Virtual interfaces associated with a hosted connection cannot be associated\nwith a LAG; hosted connections must be migrated along with their virtual\ninterfaces using AssociateHostedConnection.\n To reassociate a virtual interface to a new connection or LAG, the requester\nmust own either the virtual interface itself or the connection to which the\nvirtual interface is currently associated. Additionally, the requester must own\nthe connection or LAG for the association." ([associate-virtual-interface-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-virtual-interface-request associate-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/associate-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/associate-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/virtual-interface))

(clojure.core/defn create-direct-connect-gateway "Creates a Direct Connect gateway, which is an intermediate object that enables\nyou to connect a set of virtual interfaces and virtual private gateways. A\nDirect Connect gateway is global and visible in any AWS Region after it is\ncreated. The virtual interfaces and virtual private gateways that are connected\nthrough a Direct Connect gateway can be in different AWS Regions. This enables\nyou to connect to a VPC in any Region, regardless of the Region in which the\nvirtual interfaces are located, and pass traffic between them." ([create-direct-connect-gateway-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-direct-connect-gateway-request create-direct-connect-gateway-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect.-2012-10-25/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectConnectGateway", :http.request.configuration/output-deser-fn response-create-direct-connect-gateway-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect.-2012-10-25/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect.-2012-10-25/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-direct-connect-gateway :args (clojure.spec.alpha/tuple :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect.-2012-10-25/create-direct-connect-gateway-result))
