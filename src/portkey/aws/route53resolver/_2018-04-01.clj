(ns portkey.aws.route53resolver.-2018-04-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "route53resolver", :region "ap-northeast-1"},
    :ssl-common-name "route53resolver.ap-northeast-1.amazonaws.com",
    :endpoint "https://route53resolver.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "route53resolver", :region "eu-west-1"},
    :ssl-common-name "route53resolver.eu-west-1.amazonaws.com",
    :endpoint "https://route53resolver.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "route53resolver", :region "us-east-2"},
    :ssl-common-name "route53resolver.us-east-2.amazonaws.com",
    :endpoint "https://route53resolver.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "route53resolver", :region "ap-southeast-2"},
    :ssl-common-name "route53resolver.ap-southeast-2.amazonaws.com",
    :endpoint "https://route53resolver.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "route53resolver", :region "ap-southeast-1"},
    :ssl-common-name "route53resolver.ap-southeast-1.amazonaws.com",
    :endpoint "https://route53resolver.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "route53resolver", :region "ap-northeast-2"},
    :ssl-common-name "route53resolver.ap-northeast-2.amazonaws.com",
    :endpoint "https://route53resolver.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "route53resolver", :region "eu-west-3"},
    :ssl-common-name "route53resolver.eu-west-3.amazonaws.com",
    :endpoint "https://route53resolver.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "route53resolver", :region "ca-central-1"},
    :ssl-common-name "route53resolver.ca-central-1.amazonaws.com",
    :endpoint "https://route53resolver.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "route53resolver", :region "eu-central-1"},
    :ssl-common-name "route53resolver.eu-central-1.amazonaws.com",
    :endpoint "https://route53resolver.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "route53resolver", :region "eu-west-2"},
    :ssl-common-name "route53resolver.eu-west-2.amazonaws.com",
    :endpoint "https://route53resolver.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "route53resolver", :region "us-west-2"},
    :ssl-common-name "route53resolver.us-west-2.amazonaws.com",
    :endpoint "https://route53resolver.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "route53resolver", :region "us-east-1"},
    :ssl-common-name "route53resolver.us-east-1.amazonaws.com",
    :endpoint "https://route53resolver.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "route53resolver", :region "us-west-1"},
    :ssl-common-name "route53resolver.us-west-1.amazonaws.com",
    :endpoint "https://route53resolver.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "route53resolver", :region "ap-south-1"},
    :ssl-common-name "route53resolver.ap-south-1.amazonaws.com",
    :endpoint "https://route53resolver.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-filter)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-rule-type-option)

(clojure.core/declare ser-creator-request-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-target-address)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-port)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-ip)

(clojure.core/declare ser-ip-addresses-request)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-ip-address-request)

(clojure.core/declare ser-target-list)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-resolver-rule-policy)

(clojure.core/declare ser-name)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-resolver-endpoint-direction)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-resolver-rule-config)

(clojure.core/declare ser-ip-address-update)

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-name (input :name)) #:http.request.field{:name "Name", :shape "FilterName"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-values (input :values)) #:http.request.field{:name "Values", :shape "FilterValues"}))))

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-id coll) #:http.request.field{:shape "ResourceId"}))) input), :shape "SecurityGroupIds", :type "list"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-rule-type-option [input] #:http.request.field{:value (clojure.core/get {"FORWARD" "FORWARD", :forward "FORWARD", "SYSTEM" "SYSTEM", :system "SYSTEM", "RECURSIVE" "RECURSIVE", :recursive "RECURSIVE"} input), :shape "RuleTypeOption"})

(clojure.core/defn- ser-creator-request-id [input] #:http.request.field{:value input, :shape "CreatorRequestId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-target-address [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ip (:ip input)) #:http.request.field{:name "Ip", :shape "Ip"})], :shape "TargetAddress", :type "structure"} (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port", :box true}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValues", :type "list"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-ip [input] #:http.request.field{:value input, :shape "Ip"})

(clojure.core/defn- ser-ip-addresses-request [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ip-address-request coll) #:http.request.field{:shape "IpAddressRequest"}))) input), :shape "IpAddressesRequest", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-ip-address-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-subnet-id (:subnet-id input)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})], :shape "IpAddressRequest", :type "structure"} (clojure.core/contains? input :ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip (input :ip)) #:http.request.field{:name "Ip", :shape "Ip", :box true}))))

(clojure.core/defn- ser-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-address coll) #:http.request.field{:shape "TargetAddress"}))) input), :shape "TargetList", :type "list", :min 1})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-resolver-rule-policy [input] #:http.request.field{:value input, :shape "ResolverRulePolicy"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-resolver-endpoint-direction [input] #:http.request.field{:value (clojure.core/get {"INBOUND" "INBOUND", :inbound "INBOUND", "OUTBOUND" "OUTBOUND", :outbound "OUTBOUND"} input), :shape "ResolverEndpointDirection"})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-resolver-rule-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResolverRuleConfig", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})) (clojure.core/contains? input :target-ips) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-list (input :target-ips)) #:http.request.field{:name "TargetIps", :shape "TargetList"})) (clojure.core/contains? input :resolver-endpoint-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"}))))

(clojure.core/defn- ser-ip-address-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "IpAddressUpdate", :type "structure"} (clojure.core/contains? input :ip-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :ip-id)) #:http.request.field{:name "IpId", :shape "ResourceId", :box true})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId", :box true})) (clojure.core/contains? input :ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip (input :ip)) #:http.request.field{:name "Ip", :shape "Ip", :box true}))))

(clojure.core/defn- req-put-resolver-rule-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"}) (clojure.core/into (ser-resolver-rule-policy (input :resolver-rule-policy)) #:http.request.field{:name "ResolverRulePolicy", :shape "ResolverRulePolicy"})]}))

(clojure.core/defn- req-get-resolver-rule-association-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-rule-association-id)) #:http.request.field{:name "ResolverRuleAssociationId", :shape "ResourceId"})]}))

(clojure.core/defn- req-disassociate-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :vpc-id)) #:http.request.field{:name "VPCId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :resolver-rule-id)) #:http.request.field{:name "ResolverRuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :box true}))))

(clojure.core/defn- req-get-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-rule-id)) #:http.request.field{:name "ResolverRuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-delete-resolver-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"})]}))

(clojure.core/defn- req-update-resolver-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name", :box true}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-resolver-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :box true})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters", :box true}))))

(clojure.core/defn- req-get-resolver-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"})]}))

(clojure.core/defn- req-disassociate-resolver-endpoint-ip-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"}) (clojure.core/into (ser-ip-address-update (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddressUpdate"})]}))

(clojure.core/defn- req-get-resolver-rule-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :arn)) #:http.request.field{:name "Arn", :shape "Arn"})]}))

(clojure.core/defn- req-delete-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-rule-id)) #:http.request.field{:name "ResolverRuleId", :shape "ResourceId"})]}))

(clojure.core/defn- req-list-resolver-endpoints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :box true})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters", :box true}))))

(clojure.core/defn- req-create-resolver-endpoint-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-creator-request-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "CreatorRequestId"}) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds", :box true}) (clojure.core/into (ser-resolver-endpoint-direction (input :direction)) #:http.request.field{:name "Direction", :shape "ResolverEndpointDirection"}) (clojure.core/into (ser-ip-addresses-request (input :ip-addresses)) #:http.request.field{:name "IpAddresses", :shape "IpAddressesRequest"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList", :box true}))))

(clojure.core/defn- req-create-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-creator-request-id (input :creator-request-id)) #:http.request.field{:name "CreatorRequestId", :shape "CreatorRequestId"}) (clojure.core/into (ser-rule-type-option (input :rule-type)) #:http.request.field{:name "RuleType", :shape "RuleTypeOption"}) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"})) (clojure.core/contains? input :target-ips) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-list (input :target-ips)) #:http.request.field{:name "TargetIps", :shape "TargetList", :box true})) (clojure.core/contains? input :resolver-endpoint-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId", :box true})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList", :box true}))))

(clojure.core/defn- req-list-resolver-rule-associations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :box true})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters", :box true}))))

(clojure.core/defn- req-associate-resolver-endpoint-ip-address-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"}) (clojure.core/into (ser-ip-address-update (input :ip-address)) #:http.request.field{:name "IpAddress", :shape "IpAddressUpdate"})]}))

(clojure.core/defn- req-list-resolver-endpoint-ip-addresses-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-endpoint-id)) #:http.request.field{:name "ResolverEndpointId", :shape "ResourceId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken", :box true}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-associate-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-rule-id)) #:http.request.field{:name "ResolverRuleId", :shape "ResourceId"}) (clojure.core/into (ser-resource-id (input :vpc-id)) #:http.request.field{:name "VPCId", :shape "ResourceId"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "Name", :shape "Name"}))))

(clojure.core/defn- req-update-resolver-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resolver-rule-id)) #:http.request.field{:name "ResolverRuleId", :shape "ResourceId"}) (clojure.core/into (ser-resolver-rule-config (input :config)) #:http.request.field{:name "Config", :shape "ResolverRuleConfig"})]}))

(clojure.core/declare deser-resolver-endpoints)

(clojure.core/declare deser-resolver-rule-association-status)

(clojure.core/declare deser-ip-addresses-response)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-ip-address-count)

(clojure.core/declare deser-resolver-rule)

(clojure.core/declare deser-ip-address-status)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-rule-type-option)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-creator-request-id)

(clojure.core/declare deser-resolver-endpoint-status)

(clojure.core/declare deser-rfc-3339-time-string)

(clojure.core/declare deser-resolver-rules)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-target-address)

(clojure.core/declare deser-resolver-rule-associations)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-share-status)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-port)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-ip-address-response)

(clojure.core/declare deser-string)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-ip)

(clojure.core/declare deser-resolver-endpoint)

(clojure.core/declare deser-max-results)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-target-list)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-resolver-rule-policy)

(clojure.core/declare deser-name)

(clojure.core/declare deser-resolver-endpoint-direction)

(clojure.core/declare deser-resolver-rule-status)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-resolver-rule-association)

(clojure.core/defn- deser-resolver-endpoints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resolver-endpoint coll))) input))

(clojure.core/defn- deser-resolver-rule-association-status [input] (clojure.core/get {"CREATING" :creating, "COMPLETE" :complete, "DELETING" :deleting, "FAILED" :failed, "OVERRIDDEN" :overridden} input))

(clojure.core/defn- deser-ip-addresses-response [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address-response coll))) input))

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-id coll))) input))

(clojure.core/defn- deser-ip-address-count [input] input)

(clojure.core/defn- deser-resolver-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage"))) (clojure.core/contains? input "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-creator-request-id (input "CreatorRequestId"))) (clojure.core/contains? input "OwnerId") (clojure.core/assoc :owner-id (deser-account-id (input "OwnerId"))) (clojure.core/contains? input "TargetIps") (clojure.core/assoc :target-ips (deser-target-list (input "TargetIps"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-resolver-rule-status (input "Status"))) (clojure.core/contains? input "ResolverEndpointId") (clojure.core/assoc :resolver-endpoint-id (deser-resource-id (input "ResolverEndpointId"))) (clojure.core/contains? input "ShareStatus") (clojure.core/assoc :share-status (deser-share-status (input "ShareStatus"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "DomainName") (clojure.core/assoc :domain-name (deser-domain-name (input "DomainName"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id"))) (clojure.core/contains? input "RuleType") (clojure.core/assoc :rule-type (deser-rule-type-option (input "RuleType")))))

(clojure.core/defn- deser-ip-address-status [input] (clojure.core/get {"ATTACHING" :attaching, "FAILED_RESOURCE_GONE" :failed-resource-gone, "FAILED_CREATION" :failed-creation, "DELETE_FAILED_FAS_EXPIRED" :delete-failed-fas-expired, "REMAP_ATTACHING" :remap-attaching, "REMAP_DETACHING" :remap-detaching, "ATTACHED" :attached, "DELETING" :deleting, "CREATING" :creating, "DETACHING" :detaching} input))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-rule-type-option [input] (clojure.core/get {"FORWARD" :forward, "SYSTEM" :system, "RECURSIVE" :recursive} input))

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-creator-request-id [input] input)

(clojure.core/defn- deser-resolver-endpoint-status [input] (clojure.core/get {"CREATING" :creating, "OPERATIONAL" :operational, "UPDATING" :updating, "AUTO_RECOVERING" :auto-recovering, "ACTION_NEEDED" :action-needed, "DELETING" :deleting} input))

(clojure.core/defn- deser-rfc-3339-time-string [input] input)

(clojure.core/defn- deser-resolver-rules [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resolver-rule coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-target-address [input] (clojure.core/cond-> {:ip (deser-ip (input "Ip"))} (clojure.core/contains? input "Port") (clojure.core/assoc :port (deser-port (input "Port")))))

(clojure.core/defn- deser-resolver-rule-associations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resolver-rule-association coll))) input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-resource-id [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-share-status [input] (clojure.core/get {"NOT_SHARED" :not-shared, "SHARED_WITH_ME" :shared-with-me, "SHARED_BY_ME" :shared-by-me} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-port [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-ip-address-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "IpId") (clojure.core/assoc :ip-id (deser-resource-id (input "IpId"))) (clojure.core/contains? input "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (input "SubnetId"))) (clojure.core/contains? input "Ip") (clojure.core/assoc :ip (deser-ip (input "Ip"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-ip-address-status (input "Status"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-rfc-3339-time-string (input "CreationTime"))) (clojure.core/contains? input "ModificationTime") (clojure.core/assoc :modification-time (deser-rfc-3339-time-string (input "ModificationTime")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-ip [input] input)

(clojure.core/defn- deser-resolver-endpoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "Direction") (clojure.core/assoc :direction (deser-resolver-endpoint-direction (input "Direction"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (input "SecurityGroupIds"))) (clojure.core/contains? input "IpAddressCount") (clojure.core/assoc :ip-address-count (deser-ip-address-count (input "IpAddressCount"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage"))) (clojure.core/contains? input "CreatorRequestId") (clojure.core/assoc :creator-request-id (deser-creator-request-id (input "CreatorRequestId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-resolver-endpoint-status (input "Status"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-rfc-3339-time-string (input "CreationTime"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-arn (input "Arn"))) (clojure.core/contains? input "ModificationTime") (clojure.core/assoc :modification-time (deser-rfc-3339-time-string (input "ModificationTime"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name (input "Name"))) (clojure.core/contains? input "HostVPCId") (clojure.core/assoc :host-vpc-id (deser-resource-id (input "HostVPCId"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id")))))

(clojure.core/defn- deser-max-results [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-address coll))) input))

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-resolver-rule-policy [input] input)

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-resolver-endpoint-direction [input] (clojure.core/get {"INBOUND" :inbound, "OUTBOUND" :outbound} input))

(clojure.core/defn- deser-resolver-rule-status [input] (clojure.core/get {"COMPLETE" :complete, "DELETING" :deleting, "UPDATING" :updating, "FAILED" :failed} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-resolver-rule-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-resource-id (input "Id"))) (clojure.core/contains? input "ResolverRuleId") (clojure.core/assoc :resolver-rule-id (deser-resource-id (input "ResolverRuleId"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-name (input "Name"))) (clojure.core/contains? input "VPCId") (clojure.core/assoc :vpc-id (deser-resource-id (input "VPCId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-resolver-rule-association-status (input "Status"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage")))))

(clojure.core/defn- response-delete-resolver-endpoint-response ([input] (response-delete-resolver-endpoint-response nil input)) ([resultWrapper1968582 input] (clojure.core/let [rawinput1968581 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968583 {"ResolverEndpoint" (rawinput1968581 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968583 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968583 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-associate-resolver-endpoint-ip-address-response ([input] (response-associate-resolver-endpoint-ip-address-response nil input)) ([resultWrapper1968585 input] (clojure.core/let [rawinput1968584 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968586 {"ResolverEndpoint" (rawinput1968584 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968586 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968586 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1968588 input] (clojure.core/let [rawinput1968587 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968589 {"Message" (rawinput1968587 "Message")}] (clojure.core/cond-> {} (letvar1968589 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968589 ["Message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1968591 input] (clojure.core/let [rawinput1968590 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968592 {"Tags" (rawinput1968590 "Tags"), "NextToken" (rawinput1968590 "NextToken")}] (clojure.core/cond-> {} (letvar1968592 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1968592 ["Tags"]))) (letvar1968592 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1968592 ["NextToken"])))))))

(clojure.core/defn- response-create-resolver-endpoint-response ([input] (response-create-resolver-endpoint-response nil input)) ([resultWrapper1968594 input] (clojure.core/let [rawinput1968593 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968595 {"ResolverEndpoint" (rawinput1968593 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968595 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968595 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-update-resolver-rule-response ([input] (response-update-resolver-rule-response nil input)) ([resultWrapper1968597 input] (clojure.core/let [rawinput1968596 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968598 {"ResolverRule" (rawinput1968596 "ResolverRule")}] (clojure.core/cond-> {} (letvar1968598 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1968598 ["ResolverRule"])))))))

(clojure.core/defn- response-unknown-resource-exception ([input] (response-unknown-resource-exception nil input)) ([resultWrapper1968600 input] (clojure.core/let [rawinput1968599 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968601 {"Message" (rawinput1968599 "Message")}] (clojure.core/cond-> {} (letvar1968601 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968601 ["Message"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1968603 input] (clojure.core/let [rawinput1968602 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968604 {"Message" (rawinput1968602 "Message")}] (clojure.core/cond-> {} (letvar1968604 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968604 ["Message"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1968606 input] (clojure.core/let [rawinput1968605 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968607 {"Message" (rawinput1968605 "Message"), "ResourceType" (rawinput1968605 "ResourceType")}] (clojure.core/cond-> {} (letvar1968607 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968607 ["Message"]))) (letvar1968607 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1968607 ["ResourceType"])))))))

(clojure.core/defn- response-list-resolver-endpoint-ip-addresses-response ([input] (response-list-resolver-endpoint-ip-addresses-response nil input)) ([resultWrapper1968609 input] (clojure.core/let [rawinput1968608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968610 {"NextToken" (rawinput1968608 "NextToken"), "MaxResults" (rawinput1968608 "MaxResults"), "IpAddresses" (rawinput1968608 "IpAddresses")}] (clojure.core/cond-> {} (letvar1968610 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1968610 ["NextToken"]))) (letvar1968610 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1968610 ["MaxResults"]))) (letvar1968610 "IpAddresses") (clojure.core/assoc :ip-addresses (deser-ip-addresses-response (clojure.core/get-in letvar1968610 ["IpAddresses"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1968612 input] (clojure.core/let [rawinput1968611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968613 {"Message" (rawinput1968611 "Message"), "ResourceType" (rawinput1968611 "ResourceType")}] (clojure.core/cond-> {} (letvar1968613 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968613 ["Message"]))) (letvar1968613 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1968613 ["ResourceType"])))))))

(clojure.core/defn- response-resource-exists-exception ([input] (response-resource-exists-exception nil input)) ([resultWrapper1968615 input] (clojure.core/let [rawinput1968614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968616 {"Message" (rawinput1968614 "Message"), "ResourceType" (rawinput1968614 "ResourceType")}] (clojure.core/cond-> {} (letvar1968616 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968616 ["Message"]))) (letvar1968616 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1968616 ["ResourceType"])))))))

(clojure.core/defn- response-associate-resolver-rule-response ([input] (response-associate-resolver-rule-response nil input)) ([resultWrapper1968618 input] (clojure.core/let [rawinput1968617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968619 {"ResolverRuleAssociation" (rawinput1968617 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1968619 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1968619 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1968621 input] (clojure.core/let [rawinput1968620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968622 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1968624 input] (clojure.core/let [rawinput1968623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968625 {"Message" (rawinput1968623 "Message")}] (clojure.core/cond-> {} (letvar1968625 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968625 ["Message"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper1968627 input] (clojure.core/let [rawinput1968626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968628 {"Message" (rawinput1968626 "Message")}] (clojure.core/cond-> {} (letvar1968628 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968628 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1968630 input] (clojure.core/let [rawinput1968629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968631 {"Message" (rawinput1968629 "Message"), "ResourceType" (rawinput1968629 "ResourceType")}] (clojure.core/cond-> {} (letvar1968631 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968631 ["Message"]))) (letvar1968631 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1968631 ["ResourceType"])))))))

(clojure.core/defn- response-create-resolver-rule-response ([input] (response-create-resolver-rule-response nil input)) ([resultWrapper1968633 input] (clojure.core/let [rawinput1968632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968634 {"ResolverRule" (rawinput1968632 "ResolverRule")}] (clojure.core/cond-> {} (letvar1968634 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1968634 ["ResolverRule"])))))))

(clojure.core/defn- response-list-resolver-endpoints-response ([input] (response-list-resolver-endpoints-response nil input)) ([resultWrapper1968636 input] (clojure.core/let [rawinput1968635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968637 {"NextToken" (rawinput1968635 "NextToken"), "MaxResults" (rawinput1968635 "MaxResults"), "ResolverEndpoints" (rawinput1968635 "ResolverEndpoints")}] (clojure.core/cond-> {} (letvar1968637 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1968637 ["NextToken"]))) (letvar1968637 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1968637 ["MaxResults"]))) (letvar1968637 "ResolverEndpoints") (clojure.core/assoc :resolver-endpoints (deser-resolver-endpoints (clojure.core/get-in letvar1968637 ["ResolverEndpoints"])))))))

(clojure.core/defn- response-get-resolver-rule-response ([input] (response-get-resolver-rule-response nil input)) ([resultWrapper1968639 input] (clojure.core/let [rawinput1968638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968640 {"ResolverRule" (rawinput1968638 "ResolverRule")}] (clojure.core/cond-> {} (letvar1968640 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1968640 ["ResolverRule"])))))))

(clojure.core/defn- response-update-resolver-endpoint-response ([input] (response-update-resolver-endpoint-response nil input)) ([resultWrapper1968642 input] (clojure.core/let [rawinput1968641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968643 {"ResolverEndpoint" (rawinput1968641 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968643 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968643 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-list-resolver-rules-response ([input] (response-list-resolver-rules-response nil input)) ([resultWrapper1968645 input] (clojure.core/let [rawinput1968644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968646 {"NextToken" (rawinput1968644 "NextToken"), "MaxResults" (rawinput1968644 "MaxResults"), "ResolverRules" (rawinput1968644 "ResolverRules")}] (clojure.core/cond-> {} (letvar1968646 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1968646 ["NextToken"]))) (letvar1968646 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1968646 ["MaxResults"]))) (letvar1968646 "ResolverRules") (clojure.core/assoc :resolver-rules (deser-resolver-rules (clojure.core/get-in letvar1968646 ["ResolverRules"])))))))

(clojure.core/defn- response-disassociate-resolver-rule-response ([input] (response-disassociate-resolver-rule-response nil input)) ([resultWrapper1968648 input] (clojure.core/let [rawinput1968647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968649 {"ResolverRuleAssociation" (rawinput1968647 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1968649 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1968649 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-list-resolver-rule-associations-response ([input] (response-list-resolver-rule-associations-response nil input)) ([resultWrapper1968651 input] (clojure.core/let [rawinput1968650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968652 {"NextToken" (rawinput1968650 "NextToken"), "MaxResults" (rawinput1968650 "MaxResults"), "ResolverRuleAssociations" (rawinput1968650 "ResolverRuleAssociations")}] (clojure.core/cond-> {} (letvar1968652 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1968652 ["NextToken"]))) (letvar1968652 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1968652 ["MaxResults"]))) (letvar1968652 "ResolverRuleAssociations") (clojure.core/assoc :resolver-rule-associations (deser-resolver-rule-associations (clojure.core/get-in letvar1968652 ["ResolverRuleAssociations"])))))))

(clojure.core/defn- response-delete-resolver-rule-response ([input] (response-delete-resolver-rule-response nil input)) ([resultWrapper1968654 input] (clojure.core/let [rawinput1968653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968655 {"ResolverRule" (rawinput1968653 "ResolverRule")}] (clojure.core/cond-> {} (letvar1968655 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1968655 ["ResolverRule"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1968657 input] (clojure.core/let [rawinput1968656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968658 {"Message" (rawinput1968656 "Message")}] (clojure.core/cond-> {} (letvar1968658 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968658 ["Message"])))))))

(clojure.core/defn- response-put-resolver-rule-policy-response ([input] (response-put-resolver-rule-policy-response nil input)) ([resultWrapper1968660 input] (clojure.core/let [rawinput1968659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968661 {"ReturnValue" (rawinput1968659 "ReturnValue")}] (clojure.core/cond-> {} (letvar1968661 "ReturnValue") (clojure.core/assoc :return-value (deser-boolean (clojure.core/get-in letvar1968661 ["ReturnValue"])))))))

(clojure.core/defn- response-get-resolver-endpoint-response ([input] (response-get-resolver-endpoint-response nil input)) ([resultWrapper1968663 input] (clojure.core/let [rawinput1968662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968664 {"ResolverEndpoint" (rawinput1968662 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968664 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968664 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1968666 input] (clojure.core/let [rawinput1968665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968667 {"Message" (rawinput1968665 "Message"), "FieldName" (rawinput1968665 "FieldName")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar1968667 ["Message"]))} (letvar1968667 "FieldName") (clojure.core/assoc :field-name (deser-string (clojure.core/get-in letvar1968667 ["FieldName"])))))))

(clojure.core/defn- response-disassociate-resolver-endpoint-ip-address-response ([input] (response-disassociate-resolver-endpoint-ip-address-response nil input)) ([resultWrapper1968669 input] (clojure.core/let [rawinput1968668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968670 {"ResolverEndpoint" (rawinput1968668 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1968670 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1968670 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-resource-unavailable-exception ([input] (response-resource-unavailable-exception nil input)) ([resultWrapper1968672 input] (clojure.core/let [rawinput1968671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968673 {"Message" (rawinput1968671 "Message"), "ResourceType" (rawinput1968671 "ResourceType")}] (clojure.core/cond-> {} (letvar1968673 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1968673 ["Message"]))) (letvar1968673 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1968673 ["ResourceType"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1968675 input] (clojure.core/let [rawinput1968674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968676 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-resolver-rule-association-response ([input] (response-get-resolver-rule-association-response nil input)) ([resultWrapper1968678 input] (clojure.core/let [rawinput1968677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968679 {"ResolverRuleAssociation" (rawinput1968677 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1968679 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1968679 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-invalid-policy-document ([input] (response-invalid-policy-document nil input)) ([resultWrapper1968681 input] (clojure.core/let [rawinput1968680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968682 {"Message" (rawinput1968680 "Message")}] (clojure.core/cond-> {} (letvar1968682 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1968682 ["Message"])))))))

(clojure.core/defn- response-get-resolver-rule-policy-response ([input] (response-get-resolver-rule-policy-response nil input)) ([resultWrapper1968684 input] (clojure.core/let [rawinput1968683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1968685 {"ResolverRulePolicy" (rawinput1968683 "ResolverRulePolicy")}] (clojure.core/cond-> {} (letvar1968685 "ResolverRulePolicy") (clojure.core/assoc :resolver-rule-policy (deser-resolver-rule-policy (clojure.core/get-in letvar1968685 ["ResolverRulePolicy"])))))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/arn :portkey.aws.route53resolver.-2018-04-01/resolver-rule-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.get-resolver-rule-association-request/resolver-rule-association-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.get-resolver-rule-association-request/resolver-rule-association-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.filter/name (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/filter-name))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.filter/values (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/filter-values))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.filter/name :portkey.aws.route53resolver.-2018-04-01.filter/values]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-endpoints (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-association-status #{:creating :deleting :overridden "COMPLETE" "OVERRIDDEN" "DELETING" "CREATING" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-addresses-response (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/ip-address-response))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.list-tags-for-resource-response/tags :portkey.aws.route53resolver.-2018-04-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/resource-id))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-address-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/owner-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/account-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/status (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-rule-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule/rule-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rule-type-option))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/status-message :portkey.aws.route53resolver.-2018-04-01/creator-request-id :portkey.aws.route53resolver.-2018-04-01.resolver-rule/owner-id :portkey.aws.route53resolver.-2018-04-01.resolver-rule/target-ips :portkey.aws.route53resolver.-2018-04-01.resolver-rule/status :portkey.aws.route53resolver.-2018-04-01.resolver-rule/resolver-endpoint-id :portkey.aws.route53resolver.-2018-04-01/share-status :portkey.aws.route53resolver.-2018-04-01/arn :portkey.aws.route53resolver.-2018-04-01/domain-name :portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.resolver-rule/id :portkey.aws.route53resolver.-2018-04-01.resolver-rule/rule-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-address-status #{"ATTACHING" :failed-resource-gone "FAILED_RESOURCE_GONE" :failed-creation "FAILED_CREATION" :creating "DELETE_FAILED_FAS_EXPIRED" :deleting "REMAP_ATTACHING" "REMAP_DETACHING" :remap-detaching :remap-attaching "ATTACHED" :delete-failed-fas-expired :attaching "DELETING" "CREATING" "DETACHING" :attached :detaching})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/rule-type-option #{"SYSTEM" :system :forward :recursive "FORWARD" "RECURSIVE"})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/status-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/creator-request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint-status #{:creating :operational "AUTO_RECOVERING" "UPDATING" :deleting :auto-recovering :action-needed "DELETING" "CREATING" :updating "OPERATIONAL" "ACTION_NEEDED"})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-rule-request/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-rule-request/vpc-id :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.list-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.get-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.get-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/rfc-3339-time-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 20 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.delete-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.delete-resolver-endpoint-request/resolver-endpoint-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.unknown-resource-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/unknown-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.unknown-resource-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rules (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/resolver-rule))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-in-use-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resource-in-use-exception/message :portkey.aws.route53resolver.-2018-04-01.resource-in-use-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.list-resolver-endpoint-ip-addresses-response/ip-addresses (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/ip-addresses-response))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01.list-resolver-endpoint-ip-addresses-response/ip-addresses]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.limit-exceeded-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.limit-exceeded-exception/message :portkey.aws.route53resolver.-2018-04-01.limit-exceeded-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-exists-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-exists-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resource-exists-exception/message :portkey.aws.route53resolver.-2018-04-01.resource-exists-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/target-address (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/ip] :opt-un [:portkey.aws.route53resolver.-2018-04-01/port]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-associations (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/resolver-rule-association))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.update-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.update-resolver-endpoint-request/resolver-endpoint-id] :opt-un [:portkey.aws.route53resolver.-2018-04-01/name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/filter-values (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/filter-value))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.tag-resource-request/resource-arn :portkey.aws.route53resolver.-2018-04-01.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/tag))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/tag-key))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/share-status #{:not-shared :shared-by-me "SHARED_BY_ME" :shared-with-me "NOT_SHARED" "SHARED_WITH_ME"})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.get-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.get-resolver-endpoint-request/resolver-endpoint-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-not-found-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resource-not-found-exception/message :portkey.aws.route53resolver.-2018-04-01.resource-not-found-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-endpoint-ip-address-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-endpoint-ip-address-request/ip-address (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/ip-address-update))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-endpoint-ip-address-request/resolver-endpoint-id :portkey.aws.route53resolver.-2018-04-01.disassociate-resolver-endpoint-ip-address-request/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/port (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/resolver-endpoints]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.ip-address-response/ip-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.ip-address-response/status (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/ip-address-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.ip-address-response/creation-time (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.ip-address-response/modification-time (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.ip-address-response/ip-id :portkey.aws.route53resolver.-2018-04-01/subnet-id :portkey.aws.route53resolver.-2018-04-01/ip :portkey.aws.route53resolver.-2018-04-01.ip-address-response/status :portkey.aws.route53resolver.-2018-04-01/status-message :portkey.aws.route53resolver.-2018-04-01.ip-address-response/creation-time :portkey.aws.route53resolver.-2018-04-01.ip-address-response/modification-time]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.delete-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.delete-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 12 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/direction (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint-direction))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/ip-addresses (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/ip-addresses-request))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/creator-request-id :portkey.aws.route53resolver.-2018-04-01/security-group-ids :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/direction :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/ip-addresses] :opt-un [:portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.create-resolver-endpoint-request/tags]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/resolver-rules]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/filters (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/filter))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 7 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-addresses-request (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/ip-address-request :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/direction (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint-direction))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/status (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/creation-time (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/modification-time (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/host-vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/direction :portkey.aws.route53resolver.-2018-04-01/security-group-ids :portkey.aws.route53resolver.-2018-04-01/ip-address-count :portkey.aws.route53resolver.-2018-04-01/status-message :portkey.aws.route53resolver.-2018-04-01/creator-request-id :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/status :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/creation-time :portkey.aws.route53resolver.-2018-04-01/arn :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/modification-time :portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/host-vpc-id :portkey.aws.route53resolver.-2018-04-01.resolver-endpoint/id]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/resolver-rule-associations]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.tag/key (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.tag/value (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.tag/key :portkey.aws.route53resolver.-2018-04-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/subnet-id] :opt-un [:portkey.aws.route53resolver.-2018-04-01/ip]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/target-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver.-2018-04-01/target-address :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/rule-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/rule-type-option))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01/creator-request-id :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/rule-type :portkey.aws.route53resolver.-2018-04-01/domain-name] :opt-un [:portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/target-ips :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/resolver-endpoint-id :portkey.aws.route53resolver.-2018-04-01.create-resolver-rule-request/tags]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 5000))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.put-resolver-rule-policy-response/return-value (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/boolean))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.put-resolver-rule-policy-response/return-value]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_' ']+)" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/next-token :portkey.aws.route53resolver.-2018-04-01/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/filter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.associate-resolver-endpoint-ip-address-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.associate-resolver-endpoint-ip-address-request/ip-address (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/ip-address-update))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.associate-resolver-endpoint-ip-address-request/resolver-endpoint-id :portkey.aws.route53resolver.-2018-04-01.associate-resolver-endpoint-ip-address-request/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-parameter-exception/field-name (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.invalid-parameter-exception/message] :opt-un [:portkey.aws.route53resolver.-2018-04-01.invalid-parameter-exception/field-name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.list-resolver-endpoint-ip-addresses-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.list-resolver-endpoint-ip-addresses-request/resolver-endpoint-id] :opt-un [:portkey.aws.route53resolver.-2018-04-01/max-results :portkey.aws.route53resolver.-2018-04-01/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resource-unavailable-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resource-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resource-unavailable-exception/message :portkey.aws.route53resolver.-2018-04-01.resource-unavailable-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-endpoint-direction #{:outbound "OUTBOUND" :inbound "INBOUND"})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.invalid-policy-document/message (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/invalid-policy-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.invalid-policy-document/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/resolver-rule-policy]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.untag-resource-request/resource-arn :portkey.aws.route53resolver.-2018-04-01.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.associate-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.associate-resolver-rule-request/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.associate-resolver-rule-request/resolver-rule-id :portkey.aws.route53resolver.-2018-04-01.associate-resolver-rule-request/vpc-id] :opt-un [:portkey.aws.route53resolver.-2018-04-01/name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-config/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-config/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.resolver-rule-config/target-ips :portkey.aws.route53resolver.-2018-04-01.resolver-rule-config/resolver-endpoint-id]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-status #{"UPDATING" :deleting "COMPLETE" "DELETING" "FAILED" :updating :complete :failed})

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.ip-address-update/ip-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/ip-address-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.ip-address-update/ip-id :portkey.aws.route53resolver.-2018-04-01/subnet-id :portkey.aws.route53resolver.-2018-04-01/ip]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.update-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.update-resolver-rule-request/config (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-rule-config))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.-2018-04-01.update-resolver-rule-request/resolver-rule-id :portkey.aws.route53resolver.-2018-04-01.update-resolver-rule-request/config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/status (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/resolver-rule-association-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.-2018-04-01/resolver-rule-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/id :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/resolver-rule-id :portkey.aws.route53resolver.-2018-04-01/name :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/vpc-id :portkey.aws.route53resolver.-2018-04-01.resolver-rule-association/status :portkey.aws.route53resolver.-2018-04-01/status-message]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidTagException" :portkey.aws.route53resolver.-2018-04-01/invalid-tag-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/tag-resource-response))

(clojure.core/defn create-resolver-rule ([create-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-resolver-rule-request create-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolverRule", :http.request.configuration/output-deser-fn response-create-resolver-rule-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "LimitExceededException" :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "ResourceExistsException" :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception, "ResourceUnavailableException" :portkey.aws.route53resolver.-2018-04-01/resource-unavailable-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef create-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/create-resolver-rule-response))

(clojure.core/defn get-resolver-rule ([get-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resolver-rule-request get-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRule", :http.request.configuration/output-deser-fn response-get-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-response))

(clojure.core/defn delete-resolver-endpoint ([delete-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-resolver-endpoint-request delete-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolverEndpoint", :http.request.configuration/output-deser-fn response-delete-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/delete-resolver-endpoint-response))

(clojure.core/defn disassociate-resolver-endpoint-ip-address ([disassociate-resolver-endpoint-ip-address-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-resolver-endpoint-ip-address-request disassociate-resolver-endpoint-ip-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateResolverEndpointIpAddress", :http.request.configuration/output-deser-fn response-disassociate-resolver-endpoint-ip-address-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef disassociate-resolver-endpoint-ip-address :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-endpoint-ip-address-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/list-tags-for-resource-response))

(clojure.core/defn put-resolver-rule-policy ([put-resolver-rule-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-resolver-rule-policy-request put-resolver-rule-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResolverRulePolicy", :http.request.configuration/output-deser-fn response-put-resolver-rule-policy-response, :http.request.spec/error-spec {"InvalidPolicyDocument" :portkey.aws.route53resolver.-2018-04-01/invalid-policy-document, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "UnknownResourceException" :portkey.aws.route53resolver.-2018-04-01/unknown-resource-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef put-resolver-rule-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/put-resolver-rule-policy-response))

(clojure.core/defn disassociate-resolver-rule ([disassociate-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-resolver-rule-request disassociate-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateResolverRule", :http.request.configuration/output-deser-fn response-disassociate-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef disassociate-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/disassociate-resolver-rule-response))

(clojure.core/defn list-resolver-endpoints ([] (list-resolver-endpoints {})) ([list-resolver-endpoints-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resolver-endpoints-request list-resolver-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverEndpoints", :http.request.configuration/output-deser-fn response-list-resolver-endpoints-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-endpoints :args (clojure.spec.alpha/? :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoints-response))

(clojure.core/defn create-resolver-endpoint ([create-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-resolver-endpoint-request create-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolverEndpoint", :http.request.configuration/output-deser-fn response-create-resolver-endpoint-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception, "LimitExceededException" :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef create-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/create-resolver-endpoint-response))

(clojure.core/defn associate-resolver-endpoint-ip-address ([associate-resolver-endpoint-ip-address-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-resolver-endpoint-ip-address-request associate-resolver-endpoint-ip-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateResolverEndpointIpAddress", :http.request.configuration/output-deser-fn response-associate-resolver-endpoint-ip-address-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "LimitExceededException" :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef associate-resolver-endpoint-ip-address :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/associate-resolver-endpoint-ip-address-response))

(clojure.core/defn associate-resolver-rule ([associate-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-resolver-rule-request associate-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateResolverRule", :http.request.configuration/output-deser-fn response-associate-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "ResourceUnavailableException" :portkey.aws.route53resolver.-2018-04-01/resource-unavailable-exception, "ResourceExistsException" :portkey.aws.route53resolver.-2018-04-01/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef associate-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/associate-resolver-rule-response))

(clojure.core/defn get-resolver-rule-association ([get-resolver-rule-association-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resolver-rule-association-request get-resolver-rule-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRuleAssociation", :http.request.configuration/output-deser-fn response-get-resolver-rule-association-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule-association :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-association-response))

(clojure.core/defn get-resolver-endpoint ([get-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resolver-endpoint-request get-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverEndpoint", :http.request.configuration/output-deser-fn response-get-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/get-resolver-endpoint-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/untag-resource-response))

(clojure.core/defn get-resolver-rule-policy ([get-resolver-rule-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resolver-rule-policy-request get-resolver-rule-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRulePolicy", :http.request.configuration/output-deser-fn response-get-resolver-rule-policy-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "UnknownResourceException" :portkey.aws.route53resolver.-2018-04-01/unknown-resource-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/get-resolver-rule-policy-response))

(clojure.core/defn list-resolver-rule-associations ([] (list-resolver-rule-associations {})) ([list-resolver-rule-associations-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resolver-rule-associations-request list-resolver-rule-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverRuleAssociations", :http.request.configuration/output-deser-fn response-list-resolver-rule-associations-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-rule-associations :args (clojure.spec.alpha/? :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/list-resolver-rule-associations-response))

(clojure.core/defn update-resolver-rule ([update-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-resolver-rule-request update-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolverRule", :http.request.configuration/output-deser-fn response-update-resolver-rule-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.route53resolver.-2018-04-01/resource-unavailable-exception, "LimitExceededException" :portkey.aws.route53resolver.-2018-04-01/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef update-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/update-resolver-rule-response))

(clojure.core/defn list-resolver-rules ([] (list-resolver-rules {})) ([list-resolver-rules-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resolver-rules-request list-resolver-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverRules", :http.request.configuration/output-deser-fn response-list-resolver-rules-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-rules :args (clojure.spec.alpha/? :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/list-resolver-rules-response))

(clojure.core/defn list-resolver-endpoint-ip-addresses ([list-resolver-endpoint-ip-addresses-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-resolver-endpoint-ip-addresses-request list-resolver-endpoint-ip-addresses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverEndpointIpAddresses", :http.request.configuration/output-deser-fn response-list-resolver-endpoint-ip-addresses-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "InvalidNextTokenException" :portkey.aws.route53resolver.-2018-04-01/invalid-next-token-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-endpoint-ip-addresses :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/list-resolver-endpoint-ip-addresses-response))

(clojure.core/defn update-resolver-endpoint ([update-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-resolver-endpoint-request update-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolverEndpoint", :http.request.configuration/output-deser-fn response-update-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver.-2018-04-01/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef update-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/update-resolver-endpoint-response))

(clojure.core/defn delete-resolver-rule ([delete-resolver-rule-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-resolver-rule-request delete-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver.-2018-04-01/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolverRule", :http.request.configuration/output-deser-fn response-delete-resolver-rule-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver.-2018-04-01/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver.-2018-04-01/resource-not-found-exception, "ResourceInUseException" :portkey.aws.route53resolver.-2018-04-01/resource-in-use-exception, "InternalServiceErrorException" :portkey.aws.route53resolver.-2018-04-01/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver.-2018-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver.-2018-04-01/delete-resolver-rule-response))
