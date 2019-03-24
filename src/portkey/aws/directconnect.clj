(ns portkey.aws.directconnect (:require [portkey.aws]))

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

(clojure.core/defn- response-describe-tags-response ([input] (response-describe-tags-response nil input)) ([resultWrapper1672641 input] (clojure.core/let [rawinput1672640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672642 {"resourceTags" (rawinput1672640 "resourceTags")}] (clojure.core/cond-> {} (letvar1672642 "resourceTags") (clojure.core/assoc :resource-tags (deser-resource-tag-list (clojure.core/get-in letvar1672642 ["resourceTags"])))))))

(clojure.core/defn- response-direct-connect-server-exception ([input] (response-direct-connect-server-exception nil input)) ([resultWrapper1672644 input] (clojure.core/let [rawinput1672643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672645 {"message" (rawinput1672643 "message")}] (clojure.core/cond-> {} (letvar1672645 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1672645 ["message"])))))))

(clojure.core/defn- response-describe-direct-connect-gateway-attachments-result ([input] (response-describe-direct-connect-gateway-attachments-result nil input)) ([resultWrapper1672647 input] (clojure.core/let [rawinput1672646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672648 {"directConnectGatewayAttachments" (rawinput1672646 "directConnectGatewayAttachments"), "nextToken" (rawinput1672646 "nextToken")}] (clojure.core/cond-> {} (letvar1672648 "directConnectGatewayAttachments") (clojure.core/assoc :direct-connect-gateway-attachments (deser-direct-connect-gateway-attachment-list (clojure.core/get-in letvar1672648 ["directConnectGatewayAttachments"]))) (letvar1672648 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1672648 ["nextToken"])))))))

(clojure.core/defn- response-confirm-connection-response ([input] (response-confirm-connection-response nil input)) ([resultWrapper1672650 input] (clojure.core/let [rawinput1672649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672651 {"connectionState" (rawinput1672649 "connectionState")}] (clojure.core/cond-> {} (letvar1672651 "connectionState") (clojure.core/assoc :connection-state (deser-connection-state (clojure.core/get-in letvar1672651 ["connectionState"])))))))

(clojure.core/defn- response-describe-connection-loa-response ([input] (response-describe-connection-loa-response nil input)) ([resultWrapper1672653 input] (clojure.core/let [rawinput1672652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672654 {"loa" (rawinput1672652 "loa")}] (clojure.core/cond-> {} (letvar1672654 "loa") (clojure.core/assoc :loa (deser-loa (clojure.core/get-in letvar1672654 ["loa"])))))))

(clojure.core/defn- response-confirm-public-virtual-interface-response ([input] (response-confirm-public-virtual-interface-response nil input)) ([resultWrapper1672656 input] (clojure.core/let [rawinput1672655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672657 {"virtualInterfaceState" (rawinput1672655 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar1672657 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar1672657 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-describe-direct-connect-gateways-result ([input] (response-describe-direct-connect-gateways-result nil input)) ([resultWrapper1672659 input] (clojure.core/let [rawinput1672658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672660 {"directConnectGateways" (rawinput1672658 "directConnectGateways"), "nextToken" (rawinput1672658 "nextToken")}] (clojure.core/cond-> {} (letvar1672660 "directConnectGateways") (clojure.core/assoc :direct-connect-gateways (deser-direct-connect-gateway-list (clojure.core/get-in letvar1672660 ["directConnectGateways"]))) (letvar1672660 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1672660 ["nextToken"])))))))

(clojure.core/defn- response-interconnect ([input] (response-interconnect nil input)) ([resultWrapper1672662 input] (clojure.core/let [rawinput1672661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672663 {"jumboFrameCapable" (rawinput1672661 "jumboFrameCapable"), "awsDeviceV2" (rawinput1672661 "awsDeviceV2"), "awsDevice" (rawinput1672661 "awsDevice"), "interconnectName" (rawinput1672661 "interconnectName"), "bandwidth" (rawinput1672661 "bandwidth"), "interconnectState" (rawinput1672661 "interconnectState"), "lagId" (rawinput1672661 "lagId"), "location" (rawinput1672661 "location"), "region" (rawinput1672661 "region"), "loaIssueTime" (rawinput1672661 "loaIssueTime"), "hasLogicalRedundancy" (rawinput1672661 "hasLogicalRedundancy"), "interconnectId" (rawinput1672661 "interconnectId")}] (clojure.core/cond-> {} (letvar1672663 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar1672663 ["jumboFrameCapable"]))) (letvar1672663 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar1672663 ["awsDeviceV2"]))) (letvar1672663 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar1672663 ["awsDevice"]))) (letvar1672663 "interconnectName") (clojure.core/assoc :interconnect-name (deser-interconnect-name (clojure.core/get-in letvar1672663 ["interconnectName"]))) (letvar1672663 "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (clojure.core/get-in letvar1672663 ["bandwidth"]))) (letvar1672663 "interconnectState") (clojure.core/assoc :interconnect-state (deser-interconnect-state (clojure.core/get-in letvar1672663 ["interconnectState"]))) (letvar1672663 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar1672663 ["lagId"]))) (letvar1672663 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar1672663 ["location"]))) (letvar1672663 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar1672663 ["region"]))) (letvar1672663 "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (clojure.core/get-in letvar1672663 ["loaIssueTime"]))) (letvar1672663 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar1672663 ["hasLogicalRedundancy"]))) (letvar1672663 "interconnectId") (clojure.core/assoc :interconnect-id (deser-interconnect-id (clojure.core/get-in letvar1672663 ["interconnectId"])))))))

(clojure.core/defn- response-virtual-interfaces ([input] (response-virtual-interfaces nil input)) ([resultWrapper1672665 input] (clojure.core/let [rawinput1672664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672666 {"virtualInterfaces" (rawinput1672664 "virtualInterfaces")}] (clojure.core/cond-> {} (letvar1672666 "virtualInterfaces") (clojure.core/assoc :virtual-interfaces (deser-virtual-interface-list (clojure.core/get-in letvar1672666 ["virtualInterfaces"])))))))

(clojure.core/defn- response-create-direct-connect-gateway-result ([input] (response-create-direct-connect-gateway-result nil input)) ([resultWrapper1672668 input] (clojure.core/let [rawinput1672667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672669 {"directConnectGateway" (rawinput1672667 "directConnectGateway")}] (clojure.core/cond-> {} (letvar1672669 "directConnectGateway") (clojure.core/assoc :direct-connect-gateway (deser-direct-connect-gateway (clojure.core/get-in letvar1672669 ["directConnectGateway"])))))))

(clojure.core/defn- response-create-bgp-peer-response ([input] (response-create-bgp-peer-response nil input)) ([resultWrapper1672671 input] (clojure.core/let [rawinput1672670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672672 {"virtualInterface" (rawinput1672670 "virtualInterface")}] (clojure.core/cond-> {} (letvar1672672 "virtualInterface") (clojure.core/assoc :virtual-interface (deser-virtual-interface (clojure.core/get-in letvar1672672 ["virtualInterface"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1672674 input] (clojure.core/let [rawinput1672673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672675 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-bgp-peer-response ([input] (response-delete-bgp-peer-response nil input)) ([resultWrapper1672677 input] (clojure.core/let [rawinput1672676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672678 {"virtualInterface" (rawinput1672676 "virtualInterface")}] (clojure.core/cond-> {} (letvar1672678 "virtualInterface") (clojure.core/assoc :virtual-interface (deser-virtual-interface (clojure.core/get-in letvar1672678 ["virtualInterface"])))))))

(clojure.core/defn- response-connections ([input] (response-connections nil input)) ([resultWrapper1672680 input] (clojure.core/let [rawinput1672679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672681 {"connections" (rawinput1672679 "connections")}] (clojure.core/cond-> {} (letvar1672681 "connections") (clojure.core/assoc :connections (deser-connection-list (clojure.core/get-in letvar1672681 ["connections"])))))))

(clojure.core/defn- response-duplicate-tag-keys-exception ([input] (response-duplicate-tag-keys-exception nil input)) ([resultWrapper1672683 input] (clojure.core/let [rawinput1672682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672684 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-locations ([input] (response-locations nil input)) ([resultWrapper1672686 input] (clojure.core/let [rawinput1672685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672687 {"locations" (rawinput1672685 "locations")}] (clojure.core/cond-> {} (letvar1672687 "locations") (clojure.core/assoc :locations (deser-location-list (clojure.core/get-in letvar1672687 ["locations"])))))))

(clojure.core/defn- response-lag ([input] (response-lag nil input)) ([resultWrapper1672689 input] (clojure.core/let [rawinput1672688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672690 {"allowsHostedConnections" (rawinput1672688 "allowsHostedConnections"), "numberOfConnections" (rawinput1672688 "numberOfConnections"), "jumboFrameCapable" (rawinput1672688 "jumboFrameCapable"), "awsDeviceV2" (rawinput1672688 "awsDeviceV2"), "awsDevice" (rawinput1672688 "awsDevice"), "minimumLinks" (rawinput1672688 "minimumLinks"), "ownerAccount" (rawinput1672688 "ownerAccount"), "lagName" (rawinput1672688 "lagName"), "connectionsBandwidth" (rawinput1672688 "connectionsBandwidth"), "lagId" (rawinput1672688 "lagId"), "location" (rawinput1672688 "location"), "region" (rawinput1672688 "region"), "lagState" (rawinput1672688 "lagState"), "hasLogicalRedundancy" (rawinput1672688 "hasLogicalRedundancy"), "connections" (rawinput1672688 "connections")}] (clojure.core/cond-> {} (letvar1672690 "allowsHostedConnections") (clojure.core/assoc :allows-hosted-connections (deser-boolean-flag (clojure.core/get-in letvar1672690 ["allowsHostedConnections"]))) (letvar1672690 "numberOfConnections") (clojure.core/assoc :number-of-connections (deser-count (clojure.core/get-in letvar1672690 ["numberOfConnections"]))) (letvar1672690 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar1672690 ["jumboFrameCapable"]))) (letvar1672690 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar1672690 ["awsDeviceV2"]))) (letvar1672690 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar1672690 ["awsDevice"]))) (letvar1672690 "minimumLinks") (clojure.core/assoc :minimum-links (deser-count (clojure.core/get-in letvar1672690 ["minimumLinks"]))) (letvar1672690 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar1672690 ["ownerAccount"]))) (letvar1672690 "lagName") (clojure.core/assoc :lag-name (deser-lag-name (clojure.core/get-in letvar1672690 ["lagName"]))) (letvar1672690 "connectionsBandwidth") (clojure.core/assoc :connections-bandwidth (deser-bandwidth (clojure.core/get-in letvar1672690 ["connectionsBandwidth"]))) (letvar1672690 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar1672690 ["lagId"]))) (letvar1672690 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar1672690 ["location"]))) (letvar1672690 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar1672690 ["region"]))) (letvar1672690 "lagState") (clojure.core/assoc :lag-state (deser-lag-state (clojure.core/get-in letvar1672690 ["lagState"]))) (letvar1672690 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar1672690 ["hasLogicalRedundancy"]))) (letvar1672690 "connections") (clojure.core/assoc :connections (deser-connection-list (clojure.core/get-in letvar1672690 ["connections"])))))))

(clojure.core/defn- response-delete-interconnect-response ([input] (response-delete-interconnect-response nil input)) ([resultWrapper1672692 input] (clojure.core/let [rawinput1672691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672693 {"interconnectState" (rawinput1672691 "interconnectState")}] (clojure.core/cond-> {} (letvar1672693 "interconnectState") (clojure.core/assoc :interconnect-state (deser-interconnect-state (clojure.core/get-in letvar1672693 ["interconnectState"])))))))

(clojure.core/defn- response-create-direct-connect-gateway-association-result ([input] (response-create-direct-connect-gateway-association-result nil input)) ([resultWrapper1672695 input] (clojure.core/let [rawinput1672694 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672696 {"directConnectGatewayAssociation" (rawinput1672694 "directConnectGatewayAssociation")}] (clojure.core/cond-> {} (letvar1672696 "directConnectGatewayAssociation") (clojure.core/assoc :direct-connect-gateway-association (deser-direct-connect-gateway-association (clojure.core/get-in letvar1672696 ["directConnectGatewayAssociation"])))))))

(clojure.core/defn- response-describe-interconnect-loa-response ([input] (response-describe-interconnect-loa-response nil input)) ([resultWrapper1672698 input] (clojure.core/let [rawinput1672697 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672699 {"loa" (rawinput1672697 "loa")}] (clojure.core/cond-> {} (letvar1672699 "loa") (clojure.core/assoc :loa (deser-loa (clojure.core/get-in letvar1672699 ["loa"])))))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper1672701 input] (clojure.core/let [rawinput1672700 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672702 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-direct-connect-client-exception ([input] (response-direct-connect-client-exception nil input)) ([resultWrapper1672704 input] (clojure.core/let [rawinput1672703 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672705 {"message" (rawinput1672703 "message")}] (clojure.core/cond-> {} (letvar1672705 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1672705 ["message"])))))))

(clojure.core/defn- response-loa ([input] (response-loa nil input)) ([resultWrapper1672707 input] (clojure.core/let [rawinput1672706 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672708 {"loaContent" (rawinput1672706 "loaContent"), "loaContentType" (rawinput1672706 "loaContentType")}] (clojure.core/cond-> {} (letvar1672708 "loaContent") (clojure.core/assoc :loa-content (deser-loa-content (clojure.core/get-in letvar1672708 ["loaContent"]))) (letvar1672708 "loaContentType") (clojure.core/assoc :loa-content-type (deser-loa-content-type (clojure.core/get-in letvar1672708 ["loaContentType"])))))))

(clojure.core/defn- response-connection ([input] (response-connection nil input)) ([resultWrapper1672710 input] (clojure.core/let [rawinput1672709 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672711 {"partnerName" (rawinput1672709 "partnerName"), "jumboFrameCapable" (rawinput1672709 "jumboFrameCapable"), "connectionName" (rawinput1672709 "connectionName"), "awsDeviceV2" (rawinput1672709 "awsDeviceV2"), "awsDevice" (rawinput1672709 "awsDevice"), "connectionId" (rawinput1672709 "connectionId"), "connectionState" (rawinput1672709 "connectionState"), "bandwidth" (rawinput1672709 "bandwidth"), "ownerAccount" (rawinput1672709 "ownerAccount"), "lagId" (rawinput1672709 "lagId"), "location" (rawinput1672709 "location"), "region" (rawinput1672709 "region"), "loaIssueTime" (rawinput1672709 "loaIssueTime"), "hasLogicalRedundancy" (rawinput1672709 "hasLogicalRedundancy"), "vlan" (rawinput1672709 "vlan")}] (clojure.core/cond-> {} (letvar1672711 "partnerName") (clojure.core/assoc :partner-name (deser-partner-name (clojure.core/get-in letvar1672711 ["partnerName"]))) (letvar1672711 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar1672711 ["jumboFrameCapable"]))) (letvar1672711 "connectionName") (clojure.core/assoc :connection-name (deser-connection-name (clojure.core/get-in letvar1672711 ["connectionName"]))) (letvar1672711 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar1672711 ["awsDeviceV2"]))) (letvar1672711 "awsDevice") (clojure.core/assoc :aws-device (deser-aws-device (clojure.core/get-in letvar1672711 ["awsDevice"]))) (letvar1672711 "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (clojure.core/get-in letvar1672711 ["connectionId"]))) (letvar1672711 "connectionState") (clojure.core/assoc :connection-state (deser-connection-state (clojure.core/get-in letvar1672711 ["connectionState"]))) (letvar1672711 "bandwidth") (clojure.core/assoc :bandwidth (deser-bandwidth (clojure.core/get-in letvar1672711 ["bandwidth"]))) (letvar1672711 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar1672711 ["ownerAccount"]))) (letvar1672711 "lagId") (clojure.core/assoc :lag-id (deser-lag-id (clojure.core/get-in letvar1672711 ["lagId"]))) (letvar1672711 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar1672711 ["location"]))) (letvar1672711 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar1672711 ["region"]))) (letvar1672711 "loaIssueTime") (clojure.core/assoc :loa-issue-time (deser-loa-issue-time (clojure.core/get-in letvar1672711 ["loaIssueTime"]))) (letvar1672711 "hasLogicalRedundancy") (clojure.core/assoc :has-logical-redundancy (deser-has-logical-redundancy (clojure.core/get-in letvar1672711 ["hasLogicalRedundancy"]))) (letvar1672711 "vlan") (clojure.core/assoc :vlan (deser-vlan (clojure.core/get-in letvar1672711 ["vlan"])))))))

(clojure.core/defn- response-delete-direct-connect-gateway-result ([input] (response-delete-direct-connect-gateway-result nil input)) ([resultWrapper1672713 input] (clojure.core/let [rawinput1672712 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672714 {"directConnectGateway" (rawinput1672712 "directConnectGateway")}] (clojure.core/cond-> {} (letvar1672714 "directConnectGateway") (clojure.core/assoc :direct-connect-gateway (deser-direct-connect-gateway (clojure.core/get-in letvar1672714 ["directConnectGateway"])))))))

(clojure.core/defn- response-interconnects ([input] (response-interconnects nil input)) ([resultWrapper1672716 input] (clojure.core/let [rawinput1672715 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672717 {"interconnects" (rawinput1672715 "interconnects")}] (clojure.core/cond-> {} (letvar1672717 "interconnects") (clojure.core/assoc :interconnects (deser-interconnect-list (clojure.core/get-in letvar1672717 ["interconnects"])))))))

(clojure.core/defn- response-confirm-private-virtual-interface-response ([input] (response-confirm-private-virtual-interface-response nil input)) ([resultWrapper1672719 input] (clojure.core/let [rawinput1672718 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672720 {"virtualInterfaceState" (rawinput1672718 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar1672720 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar1672720 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-virtual-gateways ([input] (response-virtual-gateways nil input)) ([resultWrapper1672722 input] (clojure.core/let [rawinput1672721 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672723 {"virtualGateways" (rawinput1672721 "virtualGateways")}] (clojure.core/cond-> {} (letvar1672723 "virtualGateways") (clojure.core/assoc :virtual-gateways (deser-virtual-gateway-list (clojure.core/get-in letvar1672723 ["virtualGateways"])))))))

(clojure.core/defn- response-delete-virtual-interface-response ([input] (response-delete-virtual-interface-response nil input)) ([resultWrapper1672725 input] (clojure.core/let [rawinput1672724 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672726 {"virtualInterfaceState" (rawinput1672724 "virtualInterfaceState")}] (clojure.core/cond-> {} (letvar1672726 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar1672726 ["virtualInterfaceState"])))))))

(clojure.core/defn- response-virtual-interface ([input] (response-virtual-interface nil input)) ([resultWrapper1672728 input] (clojure.core/let [rawinput1672727 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672729 {"virtualInterfaceId" (rawinput1672727 "virtualInterfaceId"), "bgpPeers" (rawinput1672727 "bgpPeers"), "amazonSideAsn" (rawinput1672727 "amazonSideAsn"), "jumboFrameCapable" (rawinput1672727 "jumboFrameCapable"), "awsDeviceV2" (rawinput1672727 "awsDeviceV2"), "connectionId" (rawinput1672727 "connectionId"), "virtualInterfaceState" (rawinput1672727 "virtualInterfaceState"), "addressFamily" (rawinput1672727 "addressFamily"), "ownerAccount" (rawinput1672727 "ownerAccount"), "directConnectGatewayId" (rawinput1672727 "directConnectGatewayId"), "customerAddress" (rawinput1672727 "customerAddress"), "mtu" (rawinput1672727 "mtu"), "location" (rawinput1672727 "location"), "virtualInterfaceName" (rawinput1672727 "virtualInterfaceName"), "region" (rawinput1672727 "region"), "virtualGatewayId" (rawinput1672727 "virtualGatewayId"), "virtualInterfaceType" (rawinput1672727 "virtualInterfaceType"), "amazonAddress" (rawinput1672727 "amazonAddress"), "vlan" (rawinput1672727 "vlan"), "customerRouterConfig" (rawinput1672727 "customerRouterConfig"), "authKey" (rawinput1672727 "authKey"), "routeFilterPrefixes" (rawinput1672727 "routeFilterPrefixes"), "asn" (rawinput1672727 "asn")}] (clojure.core/cond-> {} (letvar1672729 "virtualInterfaceId") (clojure.core/assoc :virtual-interface-id (deser-virtual-interface-id (clojure.core/get-in letvar1672729 ["virtualInterfaceId"]))) (letvar1672729 "bgpPeers") (clojure.core/assoc :bgp-peers (deser-bgp-peer-list (clojure.core/get-in letvar1672729 ["bgpPeers"]))) (letvar1672729 "amazonSideAsn") (clojure.core/assoc :amazon-side-asn (deser-long-asn (clojure.core/get-in letvar1672729 ["amazonSideAsn"]))) (letvar1672729 "jumboFrameCapable") (clojure.core/assoc :jumbo-frame-capable (deser-jumbo-frame-capable (clojure.core/get-in letvar1672729 ["jumboFrameCapable"]))) (letvar1672729 "awsDeviceV2") (clojure.core/assoc :aws-device-v-2 (deser-aws-device-v-2 (clojure.core/get-in letvar1672729 ["awsDeviceV2"]))) (letvar1672729 "connectionId") (clojure.core/assoc :connection-id (deser-connection-id (clojure.core/get-in letvar1672729 ["connectionId"]))) (letvar1672729 "virtualInterfaceState") (clojure.core/assoc :virtual-interface-state (deser-virtual-interface-state (clojure.core/get-in letvar1672729 ["virtualInterfaceState"]))) (letvar1672729 "addressFamily") (clojure.core/assoc :address-family (deser-address-family (clojure.core/get-in letvar1672729 ["addressFamily"]))) (letvar1672729 "ownerAccount") (clojure.core/assoc :owner-account (deser-owner-account (clojure.core/get-in letvar1672729 ["ownerAccount"]))) (letvar1672729 "directConnectGatewayId") (clojure.core/assoc :direct-connect-gateway-id (deser-direct-connect-gateway-id (clojure.core/get-in letvar1672729 ["directConnectGatewayId"]))) (letvar1672729 "customerAddress") (clojure.core/assoc :customer-address (deser-customer-address (clojure.core/get-in letvar1672729 ["customerAddress"]))) (letvar1672729 "mtu") (clojure.core/assoc :mtu (deser-mtu (clojure.core/get-in letvar1672729 ["mtu"]))) (letvar1672729 "location") (clojure.core/assoc :location (deser-location-code (clojure.core/get-in letvar1672729 ["location"]))) (letvar1672729 "virtualInterfaceName") (clojure.core/assoc :virtual-interface-name (deser-virtual-interface-name (clojure.core/get-in letvar1672729 ["virtualInterfaceName"]))) (letvar1672729 "region") (clojure.core/assoc :region (deser-region (clojure.core/get-in letvar1672729 ["region"]))) (letvar1672729 "virtualGatewayId") (clojure.core/assoc :virtual-gateway-id (deser-virtual-gateway-id (clojure.core/get-in letvar1672729 ["virtualGatewayId"]))) (letvar1672729 "virtualInterfaceType") (clojure.core/assoc :virtual-interface-type (deser-virtual-interface-type (clojure.core/get-in letvar1672729 ["virtualInterfaceType"]))) (letvar1672729 "amazonAddress") (clojure.core/assoc :amazon-address (deser-amazon-address (clojure.core/get-in letvar1672729 ["amazonAddress"]))) (letvar1672729 "vlan") (clojure.core/assoc :vlan (deser-vlan (clojure.core/get-in letvar1672729 ["vlan"]))) (letvar1672729 "customerRouterConfig") (clojure.core/assoc :customer-router-config (deser-router-config (clojure.core/get-in letvar1672729 ["customerRouterConfig"]))) (letvar1672729 "authKey") (clojure.core/assoc :auth-key (deser-bgp-auth-key (clojure.core/get-in letvar1672729 ["authKey"]))) (letvar1672729 "routeFilterPrefixes") (clojure.core/assoc :route-filter-prefixes (deser-route-filter-prefix-list (clojure.core/get-in letvar1672729 ["routeFilterPrefixes"]))) (letvar1672729 "asn") (clojure.core/assoc :asn (deser-asn (clojure.core/get-in letvar1672729 ["asn"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1672731 input] (clojure.core/let [rawinput1672730 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672732 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-direct-connect-gateway-associations-result ([input] (response-describe-direct-connect-gateway-associations-result nil input)) ([resultWrapper1672734 input] (clojure.core/let [rawinput1672733 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672735 {"directConnectGatewayAssociations" (rawinput1672733 "directConnectGatewayAssociations"), "nextToken" (rawinput1672733 "nextToken")}] (clojure.core/cond-> {} (letvar1672735 "directConnectGatewayAssociations") (clojure.core/assoc :direct-connect-gateway-associations (deser-direct-connect-gateway-association-list (clojure.core/get-in letvar1672735 ["directConnectGatewayAssociations"]))) (letvar1672735 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1672735 ["nextToken"])))))))

(clojure.core/defn- response-delete-direct-connect-gateway-association-result ([input] (response-delete-direct-connect-gateway-association-result nil input)) ([resultWrapper1672737 input] (clojure.core/let [rawinput1672736 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672738 {"directConnectGatewayAssociation" (rawinput1672736 "directConnectGatewayAssociation")}] (clojure.core/cond-> {} (letvar1672738 "directConnectGatewayAssociation") (clojure.core/assoc :direct-connect-gateway-association (deser-direct-connect-gateway-association (clojure.core/get-in letvar1672738 ["directConnectGatewayAssociation"])))))))

(clojure.core/defn- response-lags ([input] (response-lags nil input)) ([resultWrapper1672740 input] (clojure.core/let [rawinput1672739 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1672741 {"lags" (rawinput1672739 "lags")}] (clojure.core/cond-> {} (letvar1672741 "lags") (clojure.core/assoc :lags (deser-lag-list (clojure.core/get-in letvar1672741 ["lags"])))))))

(clojure.spec.alpha/def :portkey.aws.directconnect/location-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-loa-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-loa-request/connection-id] :opt-un [:portkey.aws.directconnect.describe-loa-request/provider-name :portkey.aws.directconnect.describe-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect/resource-arn-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/resource-arn))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-interconnect-loa-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-interconnect-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-interconnect-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-interconnect-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-interconnect-loa-request/interconnect-id] :opt-un [:portkey.aws.directconnect.describe-interconnect-loa-request/provider-name :portkey.aws.directconnect.describe-interconnect-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-tags-response/resource-tags (clojure.spec.alpha/and :portkey.aws.directconnect/resource-tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-tags-response/resource-tags]))

(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-server-exception/message (clojure.spec.alpha/and :portkey.aws.directconnect/error-message))
(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.direct-connect-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-peer-state #{:deleted "deleting" :pending :deleting "deleted" :available :verifying "verifying" "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect/connection-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/connection-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/connection))

(clojure.spec.alpha/def :portkey.aws.directconnect/location-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/location))

(clojure.spec.alpha/def :portkey.aws.directconnect.update-virtual-interface-attributes-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.update-virtual-interface-attributes-request/mtu (clojure.spec.alpha/and :portkey.aws.directconnect/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect/update-virtual-interface-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.update-virtual-interface-attributes-request/virtual-interface-id] :opt-un [:portkey.aws.directconnect.update-virtual-interface-attributes-request/mtu]))

(clojure.spec.alpha/def :portkey.aws.directconnect.associate-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.associate-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/associate-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.associate-virtual-interface-request/virtual-interface-id :portkey.aws.directconnect.associate-virtual-interface-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-result/direct-connect-gateway-attachments (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-attachment-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateway-attachments-result/direct-connect-gateway-attachments :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-hosted-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-hosted-connection-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-hosted-connection-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-hosted-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-hosted-connection-request/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect/allocate-hosted-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.allocate-hosted-connection-request/connection-id :portkey.aws.directconnect.allocate-hosted-connection-request/owner-account :portkey.aws.directconnect.allocate-hosted-connection-request/bandwidth :portkey.aws.directconnect.allocate-hosted-connection-request/connection-name :portkey.aws.directconnect.allocate-hosted-connection-request/vlan] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/customer-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/router-config (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/interconnect-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-virtual-interfaces-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-virtual-interfaces-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-virtual-interfaces-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-virtual-interfaces-request/connection-id :portkey.aws.directconnect.describe-virtual-interfaces-request/virtual-interface-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/address-family #{"ipv4" :ipv-4 "ipv6" :ipv-6})

(clojure.spec.alpha/def :portkey.aws.directconnect/connection-state #{:deleted :down "requested" :unknown "deleting" :rejected :pending "ordering" :deleting :ordering "unknown" "down" "deleted" :available "rejected" "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect/bandwidth (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-connection-response/connection-state (clojure.spec.alpha/and :portkey.aws.directconnect/connection-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-connection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.confirm-connection-response/connection-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-hosted-connections-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-hosted-connections-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-hosted-connections-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connection-loa-response/loa (clojure.spec.alpha/and :portkey.aws.directconnect/loa))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-connection-loa-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-connection-loa-response/loa]))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-public-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-public-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.confirm-public-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateways-result/direct-connect-gateways (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateways-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateways-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateways-result/direct-connect-gateways :portkey.aws.directconnect.describe-direct-connect-gateways-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/direct-connect-gateway-attachment))

(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-peer-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/bgp-peer))

(clojure.spec.alpha/def :portkey.aws.directconnect/asn clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect/owner-account (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-direct-connect-gateway-association-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.delete-direct-connect-gateway-association-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-direct-connect-gateway-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-direct-connect-gateway-association-request/direct-connect-gateway-id :portkey.aws.directconnect.delete-direct-connect-gateway-association-request/virtual-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-name (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-state (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-id :portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-name :portkey.aws.directconnect.direct-connect-gateway/amazon-side-asn :portkey.aws.directconnect.direct-connect-gateway/owner-account :portkey.aws.directconnect.direct-connect-gateway/direct-connect-gateway-state :portkey.aws.directconnect.direct-connect-gateway/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect/boolean-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.directconnect/loa-content-type #{"application/pdf" :applicationpdf})

(clojure.spec.alpha/def :portkey.aws.directconnect/connection-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/interconnect-name (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/interconnect-state (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/region (clojure.spec.alpha/and :portkey.aws.directconnect/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/loa-issue-time (clojure.spec.alpha/and :portkey.aws.directconnect/loa-issue-time))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.interconnect/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/interconnect (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.interconnect/jumbo-frame-capable :portkey.aws.directconnect.interconnect/aws-device-v-2 :portkey.aws.directconnect.interconnect/aws-device :portkey.aws.directconnect.interconnect/interconnect-name :portkey.aws.directconnect.interconnect/bandwidth :portkey.aws.directconnect.interconnect/interconnect-state :portkey.aws.directconnect.interconnect/lag-id :portkey.aws.directconnect.interconnect/location :portkey.aws.directconnect.interconnect/region :portkey.aws.directconnect.interconnect/loa-issue-time :portkey.aws.directconnect.interconnect/has-logical-redundancy :portkey.aws.directconnect.interconnect/interconnect-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect/interconnect-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/interconnect))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connections-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-connections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-connections-request/connection-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-connection-request/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-connection-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-connection-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-connection-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-connection-request/location :portkey.aws.directconnect.create-connection-request/bandwidth :portkey.aws.directconnect.create-connection-request/connection-name] :opt-un [:portkey.aws.directconnect.create-connection-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-connection-request/connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interfaces/virtual-interfaces (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interfaces (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.virtual-interfaces/virtual-interfaces]))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect/pagination-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-private-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-private-virtual-interface-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-private-virtual-interface-request/new-private-virtual-interface-allocation (clojure.spec.alpha/and :portkey.aws.directconnect/new-private-virtual-interface-allocation))
(clojure.spec.alpha/def :portkey.aws.directconnect/allocate-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.allocate-private-virtual-interface-request/connection-id :portkey.aws.directconnect.allocate-private-virtual-interface-request/owner-account :portkey.aws.directconnect.allocate-private-virtual-interface-request/new-private-virtual-interface-allocation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-result/direct-connect-gateway (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-direct-connect-gateway-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.create-direct-connect-gateway-result/direct-connect-gateway]))

(clojure.spec.alpha/def :portkey.aws.directconnect.location/location-code (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.location/location-name (clojure.spec.alpha/and :portkey.aws.directconnect/location-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.location/region (clojure.spec.alpha/and :portkey.aws.directconnect/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.location/available-port-speeds (clojure.spec.alpha/and :portkey.aws.directconnect/available-port-speeds))
(clojure.spec.alpha/def :portkey.aws.directconnect/location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.location/location-code :portkey.aws.directconnect.location/location-name :portkey.aws.directconnect.location/region :portkey.aws.directconnect.location/available-port-speeds]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-bgp-peer-response/virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-bgp-peer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.create-bgp-peer-response/virtual-interface]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-public-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-public-virtual-interface-request/new-public-virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect/new-public-virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-public-virtual-interface-request/connection-id :portkey.aws.directconnect.create-public-virtual-interface-request/new-public-virtual-interface] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/amazon-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/mtu (clojure.spec.alpha/and :portkey.aws.directconnect/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect/new-private-virtual-interface (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.new-private-virtual-interface/virtual-interface-name :portkey.aws.directconnect.new-private-virtual-interface/vlan :portkey.aws.directconnect.new-private-virtual-interface/asn] :opt-un [:portkey.aws.directconnect.new-private-virtual-interface/address-family :portkey.aws.directconnect.new-private-virtual-interface/direct-connect-gateway-id :portkey.aws.directconnect.new-private-virtual-interface/customer-address :portkey.aws.directconnect.new-private-virtual-interface/mtu :portkey.aws.directconnect.new-private-virtual-interface/virtual-gateway-id :portkey.aws.directconnect.new-private-virtual-interface/amazon-address :portkey.aws.directconnect.new-private-virtual-interface/auth-key]))

(clojure.spec.alpha/def :portkey.aws.directconnect/interconnect-state #{:deleted :down "requested" :unknown "deleting" :pending :deleting "unknown" "down" "deleted" :available "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect/route-filter-prefix-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/route-filter-prefix))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-association-state #{:associating "associating" :associated "disassociated" :disassociated "associated" :disassociating "disassociating"})

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateway-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/virtual-gateway))

(clojure.spec.alpha/def :portkey.aws.directconnect/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/loa-content clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.directconnect/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/aws-device-v-2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/lag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/lag))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-bgp-peer-response/virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-bgp-peer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-bgp-peer-response/virtual-interface]))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/direct-connect-gateway))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateway-region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.connections/connections (clojure.spec.alpha/and :portkey.aws.directconnect/connection-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/connections (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.connections/connections]))

(clojure.spec.alpha/def :portkey.aws.directconnect.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.directconnect/tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.tag-resource-request/resource-arn :portkey.aws.directconnect.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/partner-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/interconnect-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/lag-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/tag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/virtual-interface))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-association-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-association-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-direct-connect-gateway-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-direct-connect-gateway-association-request/direct-connect-gateway-id :portkey.aws.directconnect.create-direct-connect-gateway-association-request/virtual-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/tag-key))

(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-region (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-region))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/attachment-state (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-attachment-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-attachment/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.direct-connect-gateway-attachment/direct-connect-gateway-id :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-id :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-region :portkey.aws.directconnect.direct-connect-gateway-attachment/virtual-interface-owner-account :portkey.aws.directconnect.direct-connect-gateway-attachment/attachment-state :portkey.aws.directconnect.direct-connect-gateway-attachment/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect/duplicate-tag-keys-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-virtual-interface-request/virtual-interface-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.locations/locations (clojure.spec.alpha/and :portkey.aws.directconnect/location-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/locations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.locations/locations]))

(clojure.spec.alpha/def :portkey.aws.directconnect.lag/allows-hosted-connections (clojure.spec.alpha/and :portkey.aws.directconnect/boolean-flag))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/number-of-connections (clojure.spec.alpha/and :portkey.aws.directconnect/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/minimum-links (clojure.spec.alpha/and :portkey.aws.directconnect/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/connections-bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/region (clojure.spec.alpha/and :portkey.aws.directconnect/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/lag-state (clojure.spec.alpha/and :portkey.aws.directconnect/lag-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.lag/connections (clojure.spec.alpha/and :portkey.aws.directconnect/connection-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/lag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.lag/allows-hosted-connections :portkey.aws.directconnect.lag/number-of-connections :portkey.aws.directconnect.lag/jumbo-frame-capable :portkey.aws.directconnect.lag/aws-device-v-2 :portkey.aws.directconnect.lag/aws-device :portkey.aws.directconnect.lag/minimum-links :portkey.aws.directconnect.lag/owner-account :portkey.aws.directconnect.lag/lag-name :portkey.aws.directconnect.lag/connections-bandwidth :portkey.aws.directconnect.lag/lag-id :portkey.aws.directconnect.lag/location :portkey.aws.directconnect.lag/region :portkey.aws.directconnect.lag/lag-state :portkey.aws.directconnect.lag/has-logical-redundancy :portkey.aws.directconnect.lag/connections]))

(clojure.spec.alpha/def :portkey.aws.directconnect/has-logical-redundancy #{:yes :unknown "yes" "unknown" "no" :no})

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateway-state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connection-loa-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connection-loa-request/provider-name (clojure.spec.alpha/and :portkey.aws.directconnect/provider-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connection-loa-request/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-connection-loa-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-connection-loa-request/connection-id] :opt-un [:portkey.aws.directconnect.describe-connection-loa-request/provider-name :portkey.aws.directconnect.describe-connection-loa-request/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-gateway/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-gateway/virtual-gateway-state (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateway (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.virtual-gateway/virtual-gateway-id :portkey.aws.directconnect.virtual-gateway/virtual-gateway-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-private-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-private-virtual-interface-request/new-private-virtual-interface (clojure.spec.alpha/and :portkey.aws.directconnect/new-private-virtual-interface))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-private-virtual-interface-request/connection-id :portkey.aws.directconnect.create-private-virtual-interface-request/new-private-virtual-interface] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-connections-on-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-connections-on-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-connections-on-interconnect-request/interconnect-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-interconnect-response/interconnect-state (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-interconnect-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-interconnect-response/interconnect-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-public-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.confirm-public-virtual-interface-request/virtual-interface-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/aws-device (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-interconnects-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-interconnects-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-interconnects-request/interconnect-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-association-result/direct-connect-gateway-association (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-association))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-direct-connect-gateway-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.create-direct-connect-gateway-association-result/direct-connect-gateway-association]))

(clojure.spec.alpha/def :portkey.aws.directconnect/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-bgp-peer-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.delete-bgp-peer-request/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.delete-bgp-peer-request/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.delete-bgp-peer-request/bgp-peer-id (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-peer-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-bgp-peer-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-bgp-peer-request/virtual-interface-id :portkey.aws.directconnect.delete-bgp-peer-request/asn :portkey.aws.directconnect.delete-bgp-peer-request/customer-address :portkey.aws.directconnect.delete-bgp-peer-request/bgp-peer-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-region (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-region))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/association-state (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-association-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-gateway-association/state-change-error (clojure.spec.alpha/and :portkey.aws.directconnect/state-change-error))
(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.direct-connect-gateway-association/direct-connect-gateway-id :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-id :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-region :portkey.aws.directconnect.direct-connect-gateway-association/virtual-gateway-owner-account :portkey.aws.directconnect.direct-connect-gateway-association/association-state :portkey.aws.directconnect.direct-connect-gateway-association/state-change-error]))

(clojure.spec.alpha/def :portkey.aws.directconnect/provider-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/loa-issue-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.directconnect/mtu clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-interconnect-loa-response/loa (clojure.spec.alpha/and :portkey.aws.directconnect/loa))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-interconnect-loa-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-interconnect-loa-response/loa]))

(clojure.spec.alpha/def :portkey.aws.directconnect/jumbo-frame-capable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.directconnect/long-asn clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-private-virtual-interface-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-private-virtual-interface-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-private-virtual-interface-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-private-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.confirm-private-virtual-interface-request/virtual-interface-id] :opt-un [:portkey.aws.directconnect.confirm-private-virtual-interface-request/virtual-gateway-id :portkey.aws.directconnect.confirm-private-virtual-interface-request/direct-connect-gateway-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.resource-tag/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.resource-tag/tags (clojure.spec.alpha/and :portkey.aws.directconnect/tag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/resource-tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.resource-tag/resource-arn :portkey.aws.directconnect.resource-tag/tags]))

(clojure.spec.alpha/def :portkey.aws.directconnect/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-tags-request/resource-arns (clojure.spec.alpha/and :portkey.aws.directconnect/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.describe-tags-request/resource-arns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface-allocation/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/new-public-virtual-interface-allocation (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.new-public-virtual-interface-allocation/virtual-interface-name :portkey.aws.directconnect.new-public-virtual-interface-allocation/vlan :portkey.aws.directconnect.new-public-virtual-interface-allocation/asn] :opt-un [:portkey.aws.directconnect.new-public-virtual-interface-allocation/auth-key :portkey.aws.directconnect.new-public-virtual-interface-allocation/amazon-address :portkey.aws.directconnect.new-public-virtual-interface-allocation/customer-address :portkey.aws.directconnect.new-public-virtual-interface-allocation/address-family :portkey.aws.directconnect.new-public-virtual-interface-allocation/route-filter-prefixes]))

(clojure.spec.alpha/def :portkey.aws.directconnect.disassociate-connection-from-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.disassociate-connection-from-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/disassociate-connection-from-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.disassociate-connection-from-lag-request/connection-id :portkey.aws.directconnect.disassociate-connection-from-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-lag-request/number-of-connections (clojure.spec.alpha/and :portkey.aws.directconnect/count))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-lag-request/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-lag-request/connections-bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-lag-request/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-lag-request/number-of-connections :portkey.aws.directconnect.create-lag-request/location :portkey.aws.directconnect.create-lag-request/connections-bandwidth :portkey.aws.directconnect.create-lag-request/lag-name] :opt-un [:portkey.aws.directconnect.create-lag-request/connection-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-direct-connect-gateway-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-direct-connect-gateway-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-direct-connect-gateway-request/direct-connect-gateway-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/port-speed (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateway-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.direct-connect-client-exception/message (clojure.spec.alpha/and :portkey.aws.directconnect/error-message))
(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.direct-connect-client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-auth-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateways-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateways-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateways-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateways-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateways-request/direct-connect-gateway-id :portkey.aws.directconnect.describe-direct-connect-gateways-request/max-results :portkey.aws.directconnect.describe-direct-connect-gateways-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.route-filter-prefix/cidr (clojure.spec.alpha/and :portkey.aws.directconnect/cidr))
(clojure.spec.alpha/def :portkey.aws.directconnect/route-filter-prefix (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.route-filter-prefix/cidr]))

(clojure.spec.alpha/def :portkey.aws.directconnect.loa/loa-content (clojure.spec.alpha/and :portkey.aws.directconnect/loa-content))
(clojure.spec.alpha/def :portkey.aws.directconnect.loa/loa-content-type (clojure.spec.alpha/and :portkey.aws.directconnect/loa-content-type))
(clojure.spec.alpha/def :portkey.aws.directconnect/loa (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.loa/loa-content :portkey.aws.directconnect.loa/loa-content-type]))

(clojure.spec.alpha/def :portkey.aws.directconnect.connection/partner-name (clojure.spec.alpha/and :portkey.aws.directconnect/partner-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/aws-device (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/connection-state (clojure.spec.alpha/and :portkey.aws.directconnect/connection-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/region (clojure.spec.alpha/and :portkey.aws.directconnect/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/loa-issue-time (clojure.spec.alpha/and :portkey.aws.directconnect/loa-issue-time))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/has-logical-redundancy (clojure.spec.alpha/and :portkey.aws.directconnect/has-logical-redundancy))
(clojure.spec.alpha/def :portkey.aws.directconnect.connection/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect/connection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.connection/partner-name :portkey.aws.directconnect.connection/jumbo-frame-capable :portkey.aws.directconnect.connection/connection-name :portkey.aws.directconnect.connection/aws-device-v-2 :portkey.aws.directconnect.connection/aws-device :portkey.aws.directconnect.connection/connection-id :portkey.aws.directconnect.connection/connection-state :portkey.aws.directconnect.connection/bandwidth :portkey.aws.directconnect.connection/owner-account :portkey.aws.directconnect.connection/lag-id :portkey.aws.directconnect.connection/location :portkey.aws.directconnect.connection/region :portkey.aws.directconnect.connection/loa-issue-time :portkey.aws.directconnect.connection/has-logical-redundancy :portkey.aws.directconnect.connection/vlan]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-direct-connect-gateway-result/direct-connect-gateway (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-direct-connect-gateway-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-direct-connect-gateway-result/direct-connect-gateway]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-bgp-peer-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-bgp-peer-request/new-bgp-peer (clojure.spec.alpha/and :portkey.aws.directconnect/new-bgp-peer))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-bgp-peer-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.create-bgp-peer-request/virtual-interface-id :portkey.aws.directconnect.create-bgp-peer-request/new-bgp-peer]))

(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-status #{:down "up" :unknown :up "unknown" "down"})

(clojure.spec.alpha/def :portkey.aws.directconnect.interconnects/interconnects (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/interconnects (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.interconnects/interconnects]))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-state #{:deleted :down :unknown "deleting" :rejected :pending :confirming :deleting "unknown" "down" "deleted" :available :verifying "rejected" "verifying" "pending" "available" "confirming"})

(clojure.spec.alpha/def :portkey.aws.directconnect/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-lags-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-lags-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-lags-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect/max-result-set-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect/resource-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-public-virtual-interface-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-public-virtual-interface-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-public-virtual-interface-request/new-public-virtual-interface-allocation (clojure.spec.alpha/and :portkey.aws.directconnect/new-public-virtual-interface-allocation))
(clojure.spec.alpha/def :portkey.aws.directconnect/allocate-public-virtual-interface-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.allocate-public-virtual-interface-request/connection-id :portkey.aws.directconnect.allocate-public-virtual-interface-request/owner-account :portkey.aws.directconnect.allocate-public-virtual-interface-request/new-public-virtual-interface-allocation] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-private-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-private-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.confirm-private-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-gateways/virtual-gateways (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-gateways (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.virtual-gateways/virtual-gateways]))

(clojure.spec.alpha/def :portkey.aws.directconnect.tag/key (clojure.spec.alpha/and :portkey.aws.directconnect/tag-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.tag/value (clojure.spec.alpha/and :portkey.aws.directconnect/tag-value))
(clojure.spec.alpha/def :portkey.aws.directconnect/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.tag/key] :opt-un [:portkey.aws.directconnect.tag/value]))

(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/bgp-peer-id (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-peer-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/bgp-peer-state (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-peer-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/bgp-status (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-status))
(clojure.spec.alpha/def :portkey.aws.directconnect.bgp-peer/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-peer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.bgp-peer/aws-device-v-2 :portkey.aws.directconnect.bgp-peer/bgp-peer-id :portkey.aws.directconnect.bgp-peer/address-family :portkey.aws.directconnect.bgp-peer/customer-address :portkey.aws.directconnect.bgp-peer/amazon-address :portkey.aws.directconnect.bgp-peer/bgp-peer-state :portkey.aws.directconnect.bgp-peer/auth-key :portkey.aws.directconnect.bgp-peer/bgp-status :portkey.aws.directconnect.bgp-peer/asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-request/direct-connect-gateway-name (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-direct-connect-gateway-request/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-direct-connect-gateway-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-direct-connect-gateway-request/direct-connect-gateway-name] :opt-un [:portkey.aws.directconnect.create-direct-connect-gateway-request/amazon-side-asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect.create-interconnect-request/interconnect-name (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-interconnect-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-interconnect-request/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.create-interconnect-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/create-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.create-interconnect-request/interconnect-name :portkey.aws.directconnect.create-interconnect-request/bandwidth :portkey.aws.directconnect.create-interconnect-request/location] :opt-un [:portkey.aws.directconnect.create-interconnect-request/lag-id]))

(clojure.spec.alpha/def :portkey.aws.directconnect/state-change-error (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-public-virtual-interface/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/new-public-virtual-interface (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.new-public-virtual-interface/virtual-interface-name :portkey.aws.directconnect.new-public-virtual-interface/vlan :portkey.aws.directconnect.new-public-virtual-interface/asn] :opt-un [:portkey.aws.directconnect.new-public-virtual-interface/auth-key :portkey.aws.directconnect.new-public-virtual-interface/amazon-address :portkey.aws.directconnect.new-public-virtual-interface/customer-address :portkey.aws.directconnect.new-public-virtual-interface/address-family :portkey.aws.directconnect.new-public-virtual-interface/route-filter-prefixes]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-virtual-interface-response/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-virtual-interface-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-virtual-interface-response/virtual-interface-state]))

(clojure.spec.alpha/def :portkey.aws.directconnect/lag-state #{:deleted :down "requested" :unknown "deleting" :pending :deleting "unknown" "down" "deleted" :available "pending" :requested "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.associate-connection-with-lag-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.associate-connection-with-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/associate-connection-with-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.associate-connection-with-lag-request/connection-id :portkey.aws.directconnect.associate-connection-with-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-lag-request/lag-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.associate-hosted-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.associate-hosted-connection-request/parent-connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/associate-hosted-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.associate-hosted-connection-request/connection-id :portkey.aws.directconnect.associate-hosted-connection-request/parent-connection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-connection-on-interconnect-request/bandwidth (clojure.spec.alpha/and :portkey.aws.directconnect/bandwidth))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-connection-on-interconnect-request/connection-name (clojure.spec.alpha/and :portkey.aws.directconnect/connection-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-connection-on-interconnect-request/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-connection-on-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.allocate-connection-on-interconnect-request/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect/allocate-connection-on-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.allocate-connection-on-interconnect-request/bandwidth :portkey.aws.directconnect.allocate-connection-on-interconnect-request/connection-name :portkey.aws.directconnect.allocate-connection-on-interconnect-request/owner-account :portkey.aws.directconnect.allocate-connection-on-interconnect-request/interconnect-id :portkey.aws.directconnect.allocate-connection-on-interconnect-request/vlan] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/lag-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/mtu (clojure.spec.alpha/and :portkey.aws.directconnect/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-private-virtual-interface-allocation/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect/new-private-virtual-interface-allocation (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.new-private-virtual-interface-allocation/virtual-interface-name :portkey.aws.directconnect.new-private-virtual-interface-allocation/vlan :portkey.aws.directconnect.new-private-virtual-interface-allocation/asn] :opt-un [:portkey.aws.directconnect.new-private-virtual-interface-allocation/mtu :portkey.aws.directconnect.new-private-virtual-interface-allocation/auth-key :portkey.aws.directconnect.new-private-virtual-interface-allocation/amazon-address :portkey.aws.directconnect.new-private-virtual-interface-allocation/address-family :portkey.aws.directconnect.new-private-virtual-interface-allocation/customer-address]))

(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/bgp-peers (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-peer-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/amazon-side-asn (clojure.spec.alpha/and :portkey.aws.directconnect/long-asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/jumbo-frame-capable (clojure.spec.alpha/and :portkey.aws.directconnect/jumbo-frame-capable))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/aws-device-v-2 (clojure.spec.alpha/and :portkey.aws.directconnect/aws-device-v-2))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/virtual-interface-state (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-state))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/owner-account (clojure.spec.alpha/and :portkey.aws.directconnect/owner-account))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/mtu (clojure.spec.alpha/and :portkey.aws.directconnect/mtu))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/location (clojure.spec.alpha/and :portkey.aws.directconnect/location-code))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/virtual-interface-name (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/region (clojure.spec.alpha/and :portkey.aws.directconnect/region))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/virtual-interface-type (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-type))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/vlan (clojure.spec.alpha/and :portkey.aws.directconnect/vlan))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/customer-router-config (clojure.spec.alpha/and :portkey.aws.directconnect/router-config))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/route-filter-prefixes (clojure.spec.alpha/and :portkey.aws.directconnect/route-filter-prefix-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.virtual-interface/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.virtual-interface/virtual-interface-id :portkey.aws.directconnect.virtual-interface/bgp-peers :portkey.aws.directconnect.virtual-interface/amazon-side-asn :portkey.aws.directconnect.virtual-interface/jumbo-frame-capable :portkey.aws.directconnect.virtual-interface/aws-device-v-2 :portkey.aws.directconnect.virtual-interface/connection-id :portkey.aws.directconnect.virtual-interface/virtual-interface-state :portkey.aws.directconnect.virtual-interface/address-family :portkey.aws.directconnect.virtual-interface/owner-account :portkey.aws.directconnect.virtual-interface/direct-connect-gateway-id :portkey.aws.directconnect.virtual-interface/customer-address :portkey.aws.directconnect.virtual-interface/mtu :portkey.aws.directconnect.virtual-interface/location :portkey.aws.directconnect.virtual-interface/virtual-interface-name :portkey.aws.directconnect.virtual-interface/region :portkey.aws.directconnect.virtual-interface/virtual-gateway-id :portkey.aws.directconnect.virtual-interface/virtual-interface-type :portkey.aws.directconnect.virtual-interface/amazon-address :portkey.aws.directconnect.virtual-interface/vlan :portkey.aws.directconnect.virtual-interface/customer-router-config :portkey.aws.directconnect.virtual-interface/auth-key :portkey.aws.directconnect.virtual-interface/route-filter-prefixes :portkey.aws.directconnect.virtual-interface/asn]))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-attachment-state #{"attached" "detaching" :detached "detached" "attaching" :attaching :attached :detaching})

(clojure.spec.alpha/def :portkey.aws.directconnect/bgp-peer-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/virtual-interface-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/region (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.directconnect.new-bgp-peer/asn (clojure.spec.alpha/and :portkey.aws.directconnect/asn))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-bgp-peer/auth-key (clojure.spec.alpha/and :portkey.aws.directconnect/bgp-auth-key))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-bgp-peer/address-family (clojure.spec.alpha/and :portkey.aws.directconnect/address-family))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-bgp-peer/amazon-address (clojure.spec.alpha/and :portkey.aws.directconnect/amazon-address))
(clojure.spec.alpha/def :portkey.aws.directconnect.new-bgp-peer/customer-address (clojure.spec.alpha/and :portkey.aws.directconnect/customer-address))
(clojure.spec.alpha/def :portkey.aws.directconnect/new-bgp-peer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.new-bgp-peer/asn :portkey.aws.directconnect.new-bgp-peer/auth-key :portkey.aws.directconnect.new-bgp-peer/address-family :portkey.aws.directconnect.new-bgp-peer/amazon-address :portkey.aws.directconnect.new-bgp-peer/customer-address]))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-result/direct-connect-gateway-associations (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-association-list))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-result/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateway-associations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateway-associations-result/direct-connect-gateway-associations :portkey.aws.directconnect.describe-direct-connect-gateway-associations-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/virtual-interface-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/direct-connect-gateway-id :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/virtual-interface-id :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/max-results :portkey.aws.directconnect.describe-direct-connect-gateway-attachments-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-direct-connect-gateway-association-result/direct-connect-gateway-association (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-association))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-direct-connect-gateway-association-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.delete-direct-connect-gateway-association-result/direct-connect-gateway-association]))

(clojure.spec.alpha/def :portkey.aws.directconnect.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.directconnect/resource-arn))
(clojure.spec.alpha/def :portkey.aws.directconnect.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.directconnect/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.untag-resource-request/resource-arn :portkey.aws.directconnect.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect.lags/lags (clojure.spec.alpha/and :portkey.aws.directconnect/lag-list))
(clojure.spec.alpha/def :portkey.aws.directconnect/lags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.lags/lags]))

(clojure.spec.alpha/def :portkey.aws.directconnect/vlan clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.directconnect.update-lag-request/lag-id (clojure.spec.alpha/and :portkey.aws.directconnect/lag-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.update-lag-request/lag-name (clojure.spec.alpha/and :portkey.aws.directconnect/lag-name))
(clojure.spec.alpha/def :portkey.aws.directconnect.update-lag-request/minimum-links (clojure.spec.alpha/and :portkey.aws.directconnect/count))
(clojure.spec.alpha/def :portkey.aws.directconnect/update-lag-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.update-lag-request/lag-id] :opt-un [:portkey.aws.directconnect.update-lag-request/lag-name :portkey.aws.directconnect.update-lag-request/minimum-links]))

(clojure.spec.alpha/def :portkey.aws.directconnect.delete-interconnect-request/interconnect-id (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/delete-interconnect-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.delete-interconnect-request/interconnect-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.directconnect/resource-tag-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/resource-tag))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-association-list (clojure.spec.alpha/coll-of :portkey.aws.directconnect/direct-connect-gateway-association))

(clojure.spec.alpha/def :portkey.aws.directconnect/direct-connect-gateway-state #{:deleted "deleting" :pending :deleting "deleted" :available "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/direct-connect-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/direct-connect-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/virtual-gateway-id (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateway-id))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.directconnect/max-result-set-size))
(clojure.spec.alpha/def :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.directconnect/pagination-token))
(clojure.spec.alpha/def :portkey.aws.directconnect/describe-direct-connect-gateway-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/direct-connect-gateway-id :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/virtual-gateway-id :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/max-results :portkey.aws.directconnect.describe-direct-connect-gateway-associations-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.directconnect/available-port-speeds (clojure.spec.alpha/coll-of :portkey.aws.directconnect/port-speed))

(clojure.spec.alpha/def :portkey.aws.directconnect.confirm-connection-request/connection-id (clojure.spec.alpha/and :portkey.aws.directconnect/connection-id))
(clojure.spec.alpha/def :portkey.aws.directconnect/confirm-connection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.directconnect.confirm-connection-request/connection-id] :opt-un []))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"DuplicateTagKeysException" :portkey.aws.directconnect/duplicate-tag-keys-exception, "TooManyTagsException" :portkey.aws.directconnect/too-many-tags-exception, "DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/tag-resource-response))

(clojure.core/defn describe-interconnect-loa ([describe-interconnect-loa-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-interconnect-loa-request describe-interconnect-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-interconnect-loa-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-interconnect-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInterconnectLoa", :http.request.configuration/output-deser-fn response-describe-interconnect-loa-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-interconnect-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-interconnect-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-interconnect-loa-response))

(clojure.core/defn update-lag ([update-lag-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-lag-request update-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/update-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef update-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/update-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/lag))

(clojure.core/defn confirm-connection ([confirm-connection-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-confirm-connection-request confirm-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/confirm-connection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/confirm-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmConnection", :http.request.configuration/output-deser-fn response-confirm-connection-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/confirm-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/confirm-connection-response))

(clojure.core/defn describe-loa ([describe-loa-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-loa-request describe-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/loa, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLoa", :http.request.configuration/output-deser-fn response-loa, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/loa))

(clojure.core/defn describe-connections-on-interconnect ([describe-connections-on-interconnect-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-connections-on-interconnect-request describe-connections-on-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-connections-on-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnectionsOnInterconnect", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connections-on-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-connections-on-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connections))

(clojure.core/defn describe-direct-connect-gateways ([] (describe-direct-connect-gateways {})) ([describe-direct-connect-gateways-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-direct-connect-gateways-request describe-direct-connect-gateways-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-direct-connect-gateways-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-direct-connect-gateways-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGateways", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateways-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateways :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-direct-connect-gateways-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-direct-connect-gateways-result))

(clojure.core/defn describe-virtual-interfaces ([] (describe-virtual-interfaces {})) ([describe-virtual-interfaces-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-virtual-interfaces-request describe-virtual-interfaces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interfaces, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-virtual-interfaces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualInterfaces", :http.request.configuration/output-deser-fn response-virtual-interfaces, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-interfaces :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-virtual-interfaces-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interfaces))

(clojure.core/defn create-interconnect ([create-interconnect-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-interconnect-request create-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/interconnect, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInterconnect", :http.request.configuration/output-deser-fn response-interconnect, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/interconnect))

(clojure.core/defn describe-hosted-connections ([describe-hosted-connections-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-hosted-connections-request describe-hosted-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-hosted-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHostedConnections", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-hosted-connections :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-hosted-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connections))

(clojure.core/defn delete-direct-connect-gateway-association ([delete-direct-connect-gateway-association-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-direct-connect-gateway-association-request delete-direct-connect-gateway-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/delete-direct-connect-gateway-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-direct-connect-gateway-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectConnectGatewayAssociation", :http.request.configuration/output-deser-fn response-delete-direct-connect-gateway-association-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-direct-connect-gateway-association :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-direct-connect-gateway-association-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/delete-direct-connect-gateway-association-result))

(clojure.core/defn describe-direct-connect-gateway-associations ([] (describe-direct-connect-gateway-associations {})) ([describe-direct-connect-gateway-associations-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-direct-connect-gateway-associations-request describe-direct-connect-gateway-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-direct-connect-gateway-associations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-direct-connect-gateway-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGatewayAssociations", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateway-associations-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateway-associations :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-direct-connect-gateway-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-direct-connect-gateway-associations-result))

(clojure.core/defn delete-direct-connect-gateway ([delete-direct-connect-gateway-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-direct-connect-gateway-request delete-direct-connect-gateway-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/delete-direct-connect-gateway-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-direct-connect-gateway-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectConnectGateway", :http.request.configuration/output-deser-fn response-delete-direct-connect-gateway-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-direct-connect-gateway :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-direct-connect-gateway-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/delete-direct-connect-gateway-result))

(clojure.core/defn allocate-hosted-connection ([allocate-hosted-connection-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-allocate-hosted-connection-request allocate-hosted-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/allocate-hosted-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocateHostedConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-hosted-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/allocate-hosted-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn create-connection ([create-connection-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-connection-request create-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn associate-connection-with-lag ([associate-connection-with-lag-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-connection-with-lag-request associate-connection-with-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/associate-connection-with-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateConnectionWithLag", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-connection-with-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/associate-connection-with-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn associate-hosted-connection ([associate-hosted-connection-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-hosted-connection-request associate-hosted-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/associate-hosted-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateHostedConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-hosted-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/associate-hosted-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn confirm-private-virtual-interface ([confirm-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-confirm-private-virtual-interface-request confirm-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/confirm-private-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/confirm-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmPrivateVirtualInterface", :http.request.configuration/output-deser-fn response-confirm-private-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/confirm-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/confirm-private-virtual-interface-response))

(clojure.core/defn describe-tags ([describe-tags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tags-request describe-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-tags-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-tags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-tags-response))

(clojure.core/defn create-private-virtual-interface ([create-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-private-virtual-interface-request create-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePrivateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn allocate-connection-on-interconnect ([allocate-connection-on-interconnect-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-allocate-connection-on-interconnect-request allocate-connection-on-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/allocate-connection-on-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocateConnectionOnInterconnect", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-connection-on-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/allocate-connection-on-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn describe-interconnects ([] (describe-interconnects {})) ([describe-interconnects-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-interconnects-request describe-interconnects-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/interconnects, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-interconnects-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeInterconnects", :http.request.configuration/output-deser-fn response-interconnects, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-interconnects :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-interconnects-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/interconnects))

(clojure.core/defn delete-lag ([delete-lag-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-lag-request delete-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/lag))

(clojure.core/defn disassociate-connection-from-lag ([disassociate-connection-from-lag-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-connection-from-lag-request disassociate-connection-from-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/disassociate-connection-from-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateConnectionFromLag", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef disassociate-connection-from-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/disassociate-connection-from-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn describe-connections ([] (describe-connections {})) ([describe-connections-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-connections-request describe-connections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connections, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-connections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnections", :http.request.configuration/output-deser-fn response-connections, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connections :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-connections-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connections))

(clojure.core/defn delete-bgp-peer ([] (delete-bgp-peer {})) ([delete-bgp-peer-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-bgp-peer-request delete-bgp-peer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/delete-bgp-peer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-bgp-peer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBGPPeer", :http.request.configuration/output-deser-fn response-delete-bgp-peer-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-bgp-peer :args (clojure.spec.alpha/? :portkey.aws.directconnect/delete-bgp-peer-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/delete-bgp-peer-response))

(clojure.core/defn confirm-public-virtual-interface ([confirm-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-confirm-public-virtual-interface-request confirm-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/confirm-public-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/confirm-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ConfirmPublicVirtualInterface", :http.request.configuration/output-deser-fn response-confirm-public-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef confirm-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/confirm-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/confirm-public-virtual-interface-response))

(clojure.core/defn describe-virtual-gateways ([] (describe-virtual-gateways {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-gateways, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVirtualGateways", :http.request.configuration/output-deser-fn response-virtual-gateways, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-virtual-gateways :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-gateways))

(clojure.core/defn create-direct-connect-gateway-association ([create-direct-connect-gateway-association-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-direct-connect-gateway-association-request create-direct-connect-gateway-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/create-direct-connect-gateway-association-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-direct-connect-gateway-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectConnectGatewayAssociation", :http.request.configuration/output-deser-fn response-create-direct-connect-gateway-association-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-direct-connect-gateway-association :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-direct-connect-gateway-association-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/create-direct-connect-gateway-association-result))

(clojure.core/defn delete-connection ([delete-connection-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-connection-request delete-connection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/connection, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-connection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConnection", :http.request.configuration/output-deser-fn response-connection, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-connection :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-connection-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/connection))

(clojure.core/defn create-bgp-peer ([] (create-bgp-peer {})) ([create-bgp-peer-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-bgp-peer-request create-bgp-peer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/create-bgp-peer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-bgp-peer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBGPPeer", :http.request.configuration/output-deser-fn response-create-bgp-peer-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-bgp-peer :args (clojure.spec.alpha/? :portkey.aws.directconnect/create-bgp-peer-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/create-bgp-peer-response))

(clojure.core/defn delete-virtual-interface ([delete-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-virtual-interface-request delete-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/delete-virtual-interface-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVirtualInterface", :http.request.configuration/output-deser-fn response-delete-virtual-interface-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/delete-virtual-interface-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/untag-resource-response))

(clojure.core/defn describe-lags ([] (describe-lags {})) ([describe-lags-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-lags-request describe-lags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/lags, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-lags-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLags", :http.request.configuration/output-deser-fn response-lags, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-lags :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-lags-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/lags))

(clojure.core/defn describe-direct-connect-gateway-attachments ([] (describe-direct-connect-gateway-attachments {})) ([describe-direct-connect-gateway-attachments-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-direct-connect-gateway-attachments-request describe-direct-connect-gateway-attachments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDirectConnectGatewayAttachments", :http.request.configuration/output-deser-fn response-describe-direct-connect-gateway-attachments-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-direct-connect-gateway-attachments :args (clojure.spec.alpha/? :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-direct-connect-gateway-attachments-result))

(clojure.core/defn describe-locations ([] (describe-locations {})) ([_] (clojure.core/let [request-function-result__1468878__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/locations, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec nil, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLocations", :http.request.configuration/output-deser-fn response-locations, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-locations :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.directconnect/locations))

(clojure.core/defn allocate-private-virtual-interface ([allocate-private-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-allocate-private-virtual-interface-request allocate-private-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/allocate-private-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocatePrivateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-private-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/allocate-private-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn create-lag ([create-lag-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-lag-request create-lag-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/lag, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-lag-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLag", :http.request.configuration/output-deser-fn response-lag, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-lag :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-lag-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/lag))

(clojure.core/defn delete-interconnect ([delete-interconnect-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-interconnect-request delete-interconnect-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/delete-interconnect-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/delete-interconnect-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteInterconnect", :http.request.configuration/output-deser-fn response-delete-interconnect-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef delete-interconnect :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/delete-interconnect-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/delete-interconnect-response))

(clojure.core/defn create-public-virtual-interface ([create-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-public-virtual-interface-request create-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn allocate-public-virtual-interface ([allocate-public-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-allocate-public-virtual-interface-request allocate-public-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/allocate-public-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AllocatePublicVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef allocate-public-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/allocate-public-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn describe-connection-loa ([describe-connection-loa-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-connection-loa-request describe-connection-loa-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/describe-connection-loa-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/describe-connection-loa-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeConnectionLoa", :http.request.configuration/output-deser-fn response-describe-connection-loa-response, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef describe-connection-loa :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/describe-connection-loa-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/describe-connection-loa-response))

(clojure.core/defn update-virtual-interface-attributes ([update-virtual-interface-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-virtual-interface-attributes-request update-virtual-interface-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/update-virtual-interface-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVirtualInterfaceAttributes", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef update-virtual-interface-attributes :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/update-virtual-interface-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn associate-virtual-interface ([associate-virtual-interface-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-virtual-interface-request associate-virtual-interface-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/virtual-interface, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/associate-virtual-interface-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateVirtualInterface", :http.request.configuration/output-deser-fn response-virtual-interface, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef associate-virtual-interface :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/associate-virtual-interface-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/virtual-interface))

(clojure.core/defn create-direct-connect-gateway ([create-direct-connect-gateway-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-direct-connect-gateway-request create-direct-connect-gateway-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.directconnect/endpoints, :http.request.configuration/target-prefix "OvertureService", :http.request.spec/output-spec :portkey.aws.directconnect/create-direct-connect-gateway-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-10-25", :http.request.configuration/service-id "Direct Connect", :http.request.spec/input-spec :portkey.aws.directconnect/create-direct-connect-gateway-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectConnectGateway", :http.request.configuration/output-deser-fn response-create-direct-connect-gateway-result, :http.request.spec/error-spec {"DirectConnectServerException" :portkey.aws.directconnect/direct-connect-server-exception, "DirectConnectClientException" :portkey.aws.directconnect/direct-connect-client-exception}})))))
(clojure.spec.alpha/fdef create-direct-connect-gateway :args (clojure.spec.alpha/tuple :portkey.aws.directconnect/create-direct-connect-gateway-request) :ret (clojure.spec.alpha/and :portkey.aws.directconnect/create-direct-connect-gateway-result))
