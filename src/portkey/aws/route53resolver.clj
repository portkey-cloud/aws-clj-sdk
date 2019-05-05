(ns portkey.aws.route53resolver (:require [portkey.aws]))

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

(clojure.core/defn- response-delete-resolver-endpoint-response ([input] (response-delete-resolver-endpoint-response nil input)) ([resultWrapper1594094 input] (clojure.core/let [rawinput1594093 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594095 {"ResolverEndpoint" (rawinput1594093 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594095 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594095 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-associate-resolver-endpoint-ip-address-response ([input] (response-associate-resolver-endpoint-ip-address-response nil input)) ([resultWrapper1594097 input] (clojure.core/let [rawinput1594096 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594098 {"ResolverEndpoint" (rawinput1594096 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594098 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594098 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1594100 input] (clojure.core/let [rawinput1594099 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594101 {"Message" (rawinput1594099 "Message")}] (clojure.core/cond-> {} (letvar1594101 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594101 ["Message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1594103 input] (clojure.core/let [rawinput1594102 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594104 {"Tags" (rawinput1594102 "Tags"), "NextToken" (rawinput1594102 "NextToken")}] (clojure.core/cond-> {} (letvar1594104 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1594104 ["Tags"]))) (letvar1594104 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1594104 ["NextToken"])))))))

(clojure.core/defn- response-create-resolver-endpoint-response ([input] (response-create-resolver-endpoint-response nil input)) ([resultWrapper1594106 input] (clojure.core/let [rawinput1594105 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594107 {"ResolverEndpoint" (rawinput1594105 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594107 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594107 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-update-resolver-rule-response ([input] (response-update-resolver-rule-response nil input)) ([resultWrapper1594109 input] (clojure.core/let [rawinput1594108 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594110 {"ResolverRule" (rawinput1594108 "ResolverRule")}] (clojure.core/cond-> {} (letvar1594110 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1594110 ["ResolverRule"])))))))

(clojure.core/defn- response-unknown-resource-exception ([input] (response-unknown-resource-exception nil input)) ([resultWrapper1594112 input] (clojure.core/let [rawinput1594111 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594113 {"Message" (rawinput1594111 "Message")}] (clojure.core/cond-> {} (letvar1594113 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594113 ["Message"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1594115 input] (clojure.core/let [rawinput1594114 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594116 {"Message" (rawinput1594114 "Message")}] (clojure.core/cond-> {} (letvar1594116 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594116 ["Message"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1594118 input] (clojure.core/let [rawinput1594117 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594119 {"Message" (rawinput1594117 "Message"), "ResourceType" (rawinput1594117 "ResourceType")}] (clojure.core/cond-> {} (letvar1594119 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594119 ["Message"]))) (letvar1594119 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1594119 ["ResourceType"])))))))

(clojure.core/defn- response-list-resolver-endpoint-ip-addresses-response ([input] (response-list-resolver-endpoint-ip-addresses-response nil input)) ([resultWrapper1594121 input] (clojure.core/let [rawinput1594120 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594122 {"NextToken" (rawinput1594120 "NextToken"), "MaxResults" (rawinput1594120 "MaxResults"), "IpAddresses" (rawinput1594120 "IpAddresses")}] (clojure.core/cond-> {} (letvar1594122 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1594122 ["NextToken"]))) (letvar1594122 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1594122 ["MaxResults"]))) (letvar1594122 "IpAddresses") (clojure.core/assoc :ip-addresses (deser-ip-addresses-response (clojure.core/get-in letvar1594122 ["IpAddresses"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1594124 input] (clojure.core/let [rawinput1594123 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594125 {"Message" (rawinput1594123 "Message"), "ResourceType" (rawinput1594123 "ResourceType")}] (clojure.core/cond-> {} (letvar1594125 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594125 ["Message"]))) (letvar1594125 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1594125 ["ResourceType"])))))))

(clojure.core/defn- response-resource-exists-exception ([input] (response-resource-exists-exception nil input)) ([resultWrapper1594127 input] (clojure.core/let [rawinput1594126 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594128 {"Message" (rawinput1594126 "Message"), "ResourceType" (rawinput1594126 "ResourceType")}] (clojure.core/cond-> {} (letvar1594128 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594128 ["Message"]))) (letvar1594128 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1594128 ["ResourceType"])))))))

(clojure.core/defn- response-associate-resolver-rule-response ([input] (response-associate-resolver-rule-response nil input)) ([resultWrapper1594130 input] (clojure.core/let [rawinput1594129 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594131 {"ResolverRuleAssociation" (rawinput1594129 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1594131 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1594131 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1594133 input] (clojure.core/let [rawinput1594132 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594134 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1594136 input] (clojure.core/let [rawinput1594135 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594137 {"Message" (rawinput1594135 "Message")}] (clojure.core/cond-> {} (letvar1594137 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594137 ["Message"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper1594139 input] (clojure.core/let [rawinput1594138 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594140 {"Message" (rawinput1594138 "Message")}] (clojure.core/cond-> {} (letvar1594140 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594140 ["Message"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1594142 input] (clojure.core/let [rawinput1594141 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594143 {"Message" (rawinput1594141 "Message"), "ResourceType" (rawinput1594141 "ResourceType")}] (clojure.core/cond-> {} (letvar1594143 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594143 ["Message"]))) (letvar1594143 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1594143 ["ResourceType"])))))))

(clojure.core/defn- response-create-resolver-rule-response ([input] (response-create-resolver-rule-response nil input)) ([resultWrapper1594145 input] (clojure.core/let [rawinput1594144 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594146 {"ResolverRule" (rawinput1594144 "ResolverRule")}] (clojure.core/cond-> {} (letvar1594146 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1594146 ["ResolverRule"])))))))

(clojure.core/defn- response-list-resolver-endpoints-response ([input] (response-list-resolver-endpoints-response nil input)) ([resultWrapper1594148 input] (clojure.core/let [rawinput1594147 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594149 {"NextToken" (rawinput1594147 "NextToken"), "MaxResults" (rawinput1594147 "MaxResults"), "ResolverEndpoints" (rawinput1594147 "ResolverEndpoints")}] (clojure.core/cond-> {} (letvar1594149 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1594149 ["NextToken"]))) (letvar1594149 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1594149 ["MaxResults"]))) (letvar1594149 "ResolverEndpoints") (clojure.core/assoc :resolver-endpoints (deser-resolver-endpoints (clojure.core/get-in letvar1594149 ["ResolverEndpoints"])))))))

(clojure.core/defn- response-get-resolver-rule-response ([input] (response-get-resolver-rule-response nil input)) ([resultWrapper1594151 input] (clojure.core/let [rawinput1594150 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594152 {"ResolverRule" (rawinput1594150 "ResolverRule")}] (clojure.core/cond-> {} (letvar1594152 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1594152 ["ResolverRule"])))))))

(clojure.core/defn- response-update-resolver-endpoint-response ([input] (response-update-resolver-endpoint-response nil input)) ([resultWrapper1594154 input] (clojure.core/let [rawinput1594153 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594155 {"ResolverEndpoint" (rawinput1594153 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594155 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594155 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-list-resolver-rules-response ([input] (response-list-resolver-rules-response nil input)) ([resultWrapper1594157 input] (clojure.core/let [rawinput1594156 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594158 {"NextToken" (rawinput1594156 "NextToken"), "MaxResults" (rawinput1594156 "MaxResults"), "ResolverRules" (rawinput1594156 "ResolverRules")}] (clojure.core/cond-> {} (letvar1594158 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1594158 ["NextToken"]))) (letvar1594158 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1594158 ["MaxResults"]))) (letvar1594158 "ResolverRules") (clojure.core/assoc :resolver-rules (deser-resolver-rules (clojure.core/get-in letvar1594158 ["ResolverRules"])))))))

(clojure.core/defn- response-disassociate-resolver-rule-response ([input] (response-disassociate-resolver-rule-response nil input)) ([resultWrapper1594160 input] (clojure.core/let [rawinput1594159 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594161 {"ResolverRuleAssociation" (rawinput1594159 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1594161 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1594161 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-list-resolver-rule-associations-response ([input] (response-list-resolver-rule-associations-response nil input)) ([resultWrapper1594163 input] (clojure.core/let [rawinput1594162 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594164 {"NextToken" (rawinput1594162 "NextToken"), "MaxResults" (rawinput1594162 "MaxResults"), "ResolverRuleAssociations" (rawinput1594162 "ResolverRuleAssociations")}] (clojure.core/cond-> {} (letvar1594164 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1594164 ["NextToken"]))) (letvar1594164 "MaxResults") (clojure.core/assoc :max-results (deser-max-results (clojure.core/get-in letvar1594164 ["MaxResults"]))) (letvar1594164 "ResolverRuleAssociations") (clojure.core/assoc :resolver-rule-associations (deser-resolver-rule-associations (clojure.core/get-in letvar1594164 ["ResolverRuleAssociations"])))))))

(clojure.core/defn- response-delete-resolver-rule-response ([input] (response-delete-resolver-rule-response nil input)) ([resultWrapper1594166 input] (clojure.core/let [rawinput1594165 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594167 {"ResolverRule" (rawinput1594165 "ResolverRule")}] (clojure.core/cond-> {} (letvar1594167 "ResolverRule") (clojure.core/assoc :resolver-rule (deser-resolver-rule (clojure.core/get-in letvar1594167 ["ResolverRule"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1594169 input] (clojure.core/let [rawinput1594168 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594170 {"Message" (rawinput1594168 "Message")}] (clojure.core/cond-> {} (letvar1594170 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594170 ["Message"])))))))

(clojure.core/defn- response-put-resolver-rule-policy-response ([input] (response-put-resolver-rule-policy-response nil input)) ([resultWrapper1594172 input] (clojure.core/let [rawinput1594171 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594173 {"ReturnValue" (rawinput1594171 "ReturnValue")}] (clojure.core/cond-> {} (letvar1594173 "ReturnValue") (clojure.core/assoc :return-value (deser-boolean (clojure.core/get-in letvar1594173 ["ReturnValue"])))))))

(clojure.core/defn- response-get-resolver-endpoint-response ([input] (response-get-resolver-endpoint-response nil input)) ([resultWrapper1594175 input] (clojure.core/let [rawinput1594174 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594176 {"ResolverEndpoint" (rawinput1594174 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594176 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594176 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1594178 input] (clojure.core/let [rawinput1594177 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594179 {"Message" (rawinput1594177 "Message"), "FieldName" (rawinput1594177 "FieldName")}] (clojure.core/cond-> {:message (deser-exception-message (clojure.core/get-in letvar1594179 ["Message"]))} (letvar1594179 "FieldName") (clojure.core/assoc :field-name (deser-string (clojure.core/get-in letvar1594179 ["FieldName"])))))))

(clojure.core/defn- response-disassociate-resolver-endpoint-ip-address-response ([input] (response-disassociate-resolver-endpoint-ip-address-response nil input)) ([resultWrapper1594181 input] (clojure.core/let [rawinput1594180 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594182 {"ResolverEndpoint" (rawinput1594180 "ResolverEndpoint")}] (clojure.core/cond-> {} (letvar1594182 "ResolverEndpoint") (clojure.core/assoc :resolver-endpoint (deser-resolver-endpoint (clojure.core/get-in letvar1594182 ["ResolverEndpoint"])))))))

(clojure.core/defn- response-resource-unavailable-exception ([input] (response-resource-unavailable-exception nil input)) ([resultWrapper1594184 input] (clojure.core/let [rawinput1594183 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594185 {"Message" (rawinput1594183 "Message"), "ResourceType" (rawinput1594183 "ResourceType")}] (clojure.core/cond-> {} (letvar1594185 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1594185 ["Message"]))) (letvar1594185 "ResourceType") (clojure.core/assoc :resource-type (deser-string (clojure.core/get-in letvar1594185 ["ResourceType"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1594187 input] (clojure.core/let [rawinput1594186 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594188 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-resolver-rule-association-response ([input] (response-get-resolver-rule-association-response nil input)) ([resultWrapper1594190 input] (clojure.core/let [rawinput1594189 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594191 {"ResolverRuleAssociation" (rawinput1594189 "ResolverRuleAssociation")}] (clojure.core/cond-> {} (letvar1594191 "ResolverRuleAssociation") (clojure.core/assoc :resolver-rule-association (deser-resolver-rule-association (clojure.core/get-in letvar1594191 ["ResolverRuleAssociation"])))))))

(clojure.core/defn- response-invalid-policy-document ([input] (response-invalid-policy-document nil input)) ([resultWrapper1594193 input] (clojure.core/let [rawinput1594192 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594194 {"Message" (rawinput1594192 "Message")}] (clojure.core/cond-> {} (letvar1594194 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1594194 ["Message"])))))))

(clojure.core/defn- response-get-resolver-rule-policy-response ([input] (response-get-resolver-rule-policy-response nil input)) ([resultWrapper1594196 input] (clojure.core/let [rawinput1594195 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1594197 {"ResolverRulePolicy" (rawinput1594195 "ResolverRulePolicy")}] (clojure.core/cond-> {} (letvar1594197 "ResolverRulePolicy") (clojure.core/assoc :resolver-rule-policy (deser-resolver-rule-policy (clojure.core/get-in letvar1594197 ["ResolverRulePolicy"])))))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/delete-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/put-resolver-rule-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/arn :portkey.aws.route53resolver/resolver-rule-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.get-resolver-rule-association-request/resolver-rule-association-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.get-resolver-rule-association-request/resolver-rule-association-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.filter/name (clojure.spec.alpha/and :portkey.aws.route53resolver/filter-name))
(clojure.spec.alpha/def :portkey.aws.route53resolver.filter/values (clojure.spec.alpha/and :portkey.aws.route53resolver/filter-values))
(clojure.spec.alpha/def :portkey.aws.route53resolver/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.filter/name :portkey.aws.route53resolver.filter/values]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-endpoints (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/resolver-endpoint))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-association-status #{:creating :deleting :overridden "COMPLETE" "OVERRIDDEN" "DELETING" "CREATING" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-addresses-response (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/ip-address-response))

(clojure.spec.alpha/def :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.list-tags-for-resource-response/tags :portkey.aws.route53resolver/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/create-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/resource-id))

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-address-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/owner-id (clojure.spec.alpha/and :portkey.aws.route53resolver/account-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/status (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-rule-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule/rule-type (clojure.spec.alpha/and :portkey.aws.route53resolver/rule-type-option))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/status-message :portkey.aws.route53resolver/creator-request-id :portkey.aws.route53resolver.resolver-rule/owner-id :portkey.aws.route53resolver.resolver-rule/target-ips :portkey.aws.route53resolver.resolver-rule/status :portkey.aws.route53resolver.resolver-rule/resolver-endpoint-id :portkey.aws.route53resolver/share-status :portkey.aws.route53resolver/arn :portkey.aws.route53resolver/domain-name :portkey.aws.route53resolver/name :portkey.aws.route53resolver.resolver-rule/id :portkey.aws.route53resolver.resolver-rule/rule-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-address-status #{"ATTACHING" :failed-resource-gone "FAILED_RESOURCE_GONE" :failed-creation "FAILED_CREATION" :creating "DELETE_FAILED_FAS_EXPIRED" :deleting "REMAP_ATTACHING" "REMAP_DETACHING" :remap-detaching :remap-attaching "ATTACHED" :delete-failed-fas-expired :attaching "DELETING" "CREATING" "DETACHING" :attached :detaching})

(clojure.spec.alpha/def :portkey.aws.route53resolver/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/rule-type-option #{"SYSTEM" :system :forward :recursive "FORWARD" "RECURSIVE"})

(clojure.spec.alpha/def :portkey.aws.route53resolver/status-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/creator-request-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-endpoint-status #{:creating :operational "AUTO_RECOVERING" "UPDATING" :deleting :auto-recovering :action-needed "DELETING" "CREATING" :updating "OPERATIONAL" "ACTION_NEEDED"})

(clojure.spec.alpha/def :portkey.aws.route53resolver.disassociate-resolver-rule-request/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.disassociate-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/disassociate-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.disassociate-resolver-rule-request/vpc-id :portkey.aws.route53resolver.disassociate-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.list-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.get-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.get-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver/update-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/rfc-3339-time-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 40))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.delete-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/delete-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.delete-resolver-endpoint-request/resolver-endpoint-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.unknown-resource-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/unknown-resource-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.unknown-resource-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rules (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/resolver-rule))

(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-in-use-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resource-in-use-exception/message :portkey.aws.route53resolver.resource-in-use-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.list-resolver-endpoint-ip-addresses-response/ip-addresses (clojure.spec.alpha/and :portkey.aws.route53resolver/ip-addresses-response))
(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/max-results :portkey.aws.route53resolver.list-resolver-endpoint-ip-addresses-response/ip-addresses]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.limit-exceeded-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.limit-exceeded-exception/message :portkey.aws.route53resolver.limit-exceeded-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-exists-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-exists-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resource-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resource-exists-exception/message :portkey.aws.route53resolver.resource-exists-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/target-address (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/ip] :opt-un [:portkey.aws.route53resolver/port]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/associate-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-associations (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/resolver-rule-association))

(clojure.spec.alpha/def :portkey.aws.route53resolver/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.update-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/update-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.update-resolver-endpoint-request/resolver-endpoint-id] :opt-un [:portkey.aws.route53resolver/name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/filter-values (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/filter-value))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.tag-resource-request/resource-arn :portkey.aws.route53resolver.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/tag))

(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-tag-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.invalid-tag-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/tag-key))

(clojure.spec.alpha/def :portkey.aws.route53resolver/share-status #{:not-shared :shared-by-me "SHARED_BY_ME" :shared-with-me "NOT_SHARED" "SHARED_WITH_ME"})

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.get-resolver-endpoint-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.get-resolver-endpoint-request/resolver-endpoint-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-not-found-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resource-not-found-exception/message :portkey.aws.route53resolver.resource-not-found-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.disassociate-resolver-endpoint-ip-address-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.disassociate-resolver-endpoint-ip-address-request/ip-address (clojure.spec.alpha/and :portkey.aws.route53resolver/ip-address-update))
(clojure.spec.alpha/def :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.disassociate-resolver-endpoint-ip-address-request/resolver-endpoint-id :portkey.aws.route53resolver.disassociate-resolver-endpoint-ip-address-request/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver/create-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/port (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-endpoints-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/resolver-endpoints]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.ip-address-response/ip-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.ip-address-response/status (clojure.spec.alpha/and :portkey.aws.route53resolver/ip-address-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.ip-address-response/creation-time (clojure.spec.alpha/and :portkey.aws.route53resolver/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.ip-address-response/modification-time (clojure.spec.alpha/and :portkey.aws.route53resolver/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.ip-address-response/ip-id :portkey.aws.route53resolver/subnet-id :portkey.aws.route53resolver/ip :portkey.aws.route53resolver.ip-address-response/status :portkey.aws.route53resolver/status-message :portkey.aws.route53resolver.ip-address-response/creation-time :portkey.aws.route53resolver.ip-address-response/modification-time]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53resolver.delete-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/delete-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.delete-resolver-rule-request/resolver-rule-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/update-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-endpoints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-endpoint-request/direction (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-endpoint-direction))
(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-endpoint-request/ip-addresses (clojure.spec.alpha/and :portkey.aws.route53resolver/ip-addresses-request))
(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-endpoint-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver/create-resolver-endpoint-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/creator-request-id :portkey.aws.route53resolver/security-group-ids :portkey.aws.route53resolver.create-resolver-endpoint-request/direction :portkey.aws.route53resolver.create-resolver-endpoint-request/ip-addresses] :opt-un [:portkey.aws.route53resolver/name :portkey.aws.route53resolver.create-resolver-endpoint-request/tags]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/resolver-rules]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/filters (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/filter))

(clojure.spec.alpha/def :portkey.aws.route53resolver/disassociate-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 7 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-addresses-request (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/ip-address-request :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/direction (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-endpoint-direction))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/status (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-endpoint-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/creation-time (clojure.spec.alpha/and :portkey.aws.route53resolver/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/modification-time (clojure.spec.alpha/and :portkey.aws.route53resolver/rfc-3339-time-string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/host-vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-endpoint/id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-endpoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resolver-endpoint/direction :portkey.aws.route53resolver/security-group-ids :portkey.aws.route53resolver/ip-address-count :portkey.aws.route53resolver/status-message :portkey.aws.route53resolver/creator-request-id :portkey.aws.route53resolver.resolver-endpoint/status :portkey.aws.route53resolver.resolver-endpoint/creation-time :portkey.aws.route53resolver/arn :portkey.aws.route53resolver.resolver-endpoint/modification-time :portkey.aws.route53resolver/name :portkey.aws.route53resolver.resolver-endpoint/host-vpc-id :portkey.aws.route53resolver.resolver-endpoint/id]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-rule-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/resolver-rule-associations]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/delete-resolver-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.route53resolver.tag/key (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-key))
(clojure.spec.alpha/def :portkey.aws.route53resolver.tag/value (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-value))
(clojure.spec.alpha/def :portkey.aws.route53resolver/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.tag/key :portkey.aws.route53resolver.tag/value]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/subnet-id] :opt-un [:portkey.aws.route53resolver/ip]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/target-list (clojure.spec.alpha/coll-of :portkey.aws.route53resolver/target-address :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-rule-request/rule-type (clojure.spec.alpha/and :portkey.aws.route53resolver/rule-type-option))
(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-rule-request/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-rule-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.create-resolver-rule-request/tags (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver/create-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver/creator-request-id :portkey.aws.route53resolver.create-resolver-rule-request/rule-type :portkey.aws.route53resolver/domain-name] :opt-un [:portkey.aws.route53resolver/name :portkey.aws.route53resolver.create-resolver-rule-request/target-ips :portkey.aws.route53resolver.create-resolver-rule-request/resolver-endpoint-id :portkey.aws.route53resolver.create-resolver-rule-request/tags]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 5000))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.put-resolver-rule-policy-response/return-value (clojure.spec.alpha/and :portkey.aws.route53resolver/boolean))
(clojure.spec.alpha/def :portkey.aws.route53resolver/put-resolver-rule-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.put-resolver-rule-policy-response/return-value]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_' ']+)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-rule-associations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/next-token :portkey.aws.route53resolver/filters]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/filter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.associate-resolver-endpoint-ip-address-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.associate-resolver-endpoint-ip-address-request/ip-address (clojure.spec.alpha/and :portkey.aws.route53resolver/ip-address-update))
(clojure.spec.alpha/def :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.associate-resolver-endpoint-ip-address-request/resolver-endpoint-id :portkey.aws.route53resolver.associate-resolver-endpoint-ip-address-request/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-parameter-exception/field-name (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.invalid-parameter-exception/message] :opt-un [:portkey.aws.route53resolver.invalid-parameter-exception/field-name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-endpoint]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.list-resolver-endpoint-ip-addresses-request/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.list-resolver-endpoint-ip-addresses-request/resolver-endpoint-id] :opt-un [:portkey.aws.route53resolver/max-results :portkey.aws.route53resolver/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resource-unavailable-exception/resource-type (clojure.spec.alpha/and :portkey.aws.route53resolver/string))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resource-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resource-unavailable-exception/message :portkey.aws.route53resolver.resource-unavailable-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-endpoint-direction #{:outbound "OUTBOUND" :inbound "INBOUND"})

(clojure.spec.alpha/def :portkey.aws.route53resolver/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-association-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule-association]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.invalid-policy-document/message (clojure.spec.alpha/and :portkey.aws.route53resolver/exception-message))
(clojure.spec.alpha/def :portkey.aws.route53resolver/invalid-policy-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.invalid-policy-document/message]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/get-resolver-rule-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/resolver-rule-policy]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53resolver.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.route53resolver/arn))
(clojure.spec.alpha/def :portkey.aws.route53resolver.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.untag-resource-request/resource-arn :portkey.aws.route53resolver.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.associate-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.associate-resolver-rule-request/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/associate-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.associate-resolver-rule-request/resolver-rule-id :portkey.aws.route53resolver.associate-resolver-rule-request/vpc-id] :opt-un [:portkey.aws.route53resolver/name]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-config/target-ips (clojure.spec.alpha/and :portkey.aws.route53resolver/target-list))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-config/resolver-endpoint-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver/name :portkey.aws.route53resolver.resolver-rule-config/target-ips :portkey.aws.route53resolver.resolver-rule-config/resolver-endpoint-id]))

(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-status #{"UPDATING" :deleting "COMPLETE" "DELETING" "FAILED" :updating :complete :failed})

(clojure.spec.alpha/def :portkey.aws.route53resolver/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53resolver.ip-address-update/ip-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver/ip-address-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.ip-address-update/ip-id :portkey.aws.route53resolver/subnet-id :portkey.aws.route53resolver/ip]))

(clojure.spec.alpha/def :portkey.aws.route53resolver.update-resolver-rule-request/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.update-resolver-rule-request/config (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-rule-config))
(clojure.spec.alpha/def :portkey.aws.route53resolver/update-resolver-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53resolver.update-resolver-rule-request/resolver-rule-id :portkey.aws.route53resolver.update-resolver-rule-request/config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-association/id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-association/resolver-rule-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-association/vpc-id (clojure.spec.alpha/and :portkey.aws.route53resolver/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53resolver.resolver-rule-association/status (clojure.spec.alpha/and :portkey.aws.route53resolver/resolver-rule-association-status))
(clojure.spec.alpha/def :portkey.aws.route53resolver/resolver-rule-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53resolver.resolver-rule-association/id :portkey.aws.route53resolver.resolver-rule-association/resolver-rule-id :portkey.aws.route53resolver/name :portkey.aws.route53resolver.resolver-rule-association/vpc-id :portkey.aws.route53resolver.resolver-rule-association/status :portkey.aws.route53resolver/status-message]))

(clojure.core/defn tag-resource "Adds one or more tags to a specified resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.route53resolver/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidTagException" :portkey.aws.route53resolver/invalid-tag-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/tag-resource-response))

(clojure.core/defn create-resolver-rule "For DNS queries that originate in your VPCs, specifies which resolver endpoint\nthe queries pass through, one domain name that you want to forward to your\nnetwork, and the IP addresses of the DNS resolvers in your network." ([create-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-resolver-rule-request create-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/create-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/create-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolverRule", :http.request.configuration/output-deser-fn response-create-resolver-rule-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "LimitExceededException" :portkey.aws.route53resolver/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "ResourceExistsException" :portkey.aws.route53resolver/resource-exists-exception, "ResourceUnavailableException" :portkey.aws.route53resolver/resource-unavailable-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef create-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/create-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/create-resolver-rule-response))

(clojure.core/defn get-resolver-rule "Gets information about a specified resolver rule, such as the domain name that\nthe rule forwards DNS queries for and the ID of the outbound resolver endpoint\nthat the rule is associated with." ([get-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resolver-rule-request get-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/get-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/get-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRule", :http.request.configuration/output-deser-fn response-get-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/get-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/get-resolver-rule-response))

(clojure.core/defn delete-resolver-endpoint "Deletes a resolver endpoint. The effect of deleting a resolver endpoint depends\non whether it's an inbound or an outbound resolver endpoint:\n * Inbound: DNS queries from your network or another VPC are no longer routed to\nthe DNS service for the specified VPC.\n * Outbound: DNS queries from a VPC are no longer routed to your network or to\nanother VPC." ([delete-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-resolver-endpoint-request delete-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/delete-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/delete-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolverEndpoint", :http.request.configuration/output-deser-fn response-delete-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/delete-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/delete-resolver-endpoint-response))

(clojure.core/defn disassociate-resolver-endpoint-ip-address "Removes IP addresses from an inbound or an outbound resolver endpoint. If you\nwant to remove more than one IP address, submit one\nDisassociateResolverEndpointIpAddress request for each IP address.\n To add an IP address to an endpoint, see AssociateResolverEndpointIpAddress." ([disassociate-resolver-endpoint-ip-address-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-resolver-endpoint-ip-address-request disassociate-resolver-endpoint-ip-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateResolverEndpointIpAddress", :http.request.configuration/output-deser-fn response-disassociate-resolver-endpoint-ip-address-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef disassociate-resolver-endpoint-ip-address :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/disassociate-resolver-endpoint-ip-address-response))

(clojure.core/defn list-tags-for-resource "Lists the tags that you associated with the specified resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.route53resolver/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/list-tags-for-resource-response))

(clojure.core/defn put-resolver-rule-policy "Specifies the Resolver operations and resources that you want to allow another\nAWS account to be able to use." ([put-resolver-rule-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-resolver-rule-policy-request put-resolver-rule-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/put-resolver-rule-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/put-resolver-rule-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResolverRulePolicy", :http.request.configuration/output-deser-fn response-put-resolver-rule-policy-response, :http.request.spec/error-spec {"InvalidPolicyDocument" :portkey.aws.route53resolver/invalid-policy-document, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "UnknownResourceException" :portkey.aws.route53resolver/unknown-resource-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef put-resolver-rule-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/put-resolver-rule-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/put-resolver-rule-policy-response))

(clojure.core/defn disassociate-resolver-rule "Removes the association between a specified resolver rule and a specified VPC.\n If you disassociate a resolver rule from a VPC, Resolver stops forwarding DNS\nqueries for the domain name that you specified in the resolver rule." ([disassociate-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-resolver-rule-request disassociate-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/disassociate-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/disassociate-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateResolverRule", :http.request.configuration/output-deser-fn response-disassociate-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef disassociate-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/disassociate-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/disassociate-resolver-rule-response))

(clojure.core/defn list-resolver-endpoints "Lists all the resolver endpoints that were created using the current AWS\naccount." ([] (list-resolver-endpoints {})) ([list-resolver-endpoints-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolver-endpoints-request list-resolver-endpoints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/list-resolver-endpoints-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/list-resolver-endpoints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverEndpoints", :http.request.configuration/output-deser-fn response-list-resolver-endpoints-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-endpoints :args (clojure.spec.alpha/? :portkey.aws.route53resolver/list-resolver-endpoints-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/list-resolver-endpoints-response))

(clojure.core/defn create-resolver-endpoint "Creates a resolver endpoint. There are two types of resolver endpoints, inbound\nand outbound:\n * An inbound resolver endpoint forwards DNS queries to the DNS service for a\nVPC from your network or another VPC.\n * An outbound resolver endpoint forwards DNS queries from the DNS service for a\nVPC to your network or another VPC." ([create-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-resolver-endpoint-request create-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/create-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/create-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResolverEndpoint", :http.request.configuration/output-deser-fn response-create-resolver-endpoint-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver/resource-exists-exception, "LimitExceededException" :portkey.aws.route53resolver/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef create-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/create-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/create-resolver-endpoint-response))

(clojure.core/defn associate-resolver-endpoint-ip-address "Adds IP addresses to an inbound or an outbound resolver endpoint. If you want to\nadding more than one IP address, submit one AssociateResolverEndpointIpAddress\nrequest for each IP address.\n To remove an IP address from an endpoint, see\nDisassociateResolverEndpointIpAddress." ([associate-resolver-endpoint-ip-address-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-resolver-endpoint-ip-address-request associate-resolver-endpoint-ip-address-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateResolverEndpointIpAddress", :http.request.configuration/output-deser-fn response-associate-resolver-endpoint-ip-address-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "ResourceExistsException" :portkey.aws.route53resolver/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "LimitExceededException" :portkey.aws.route53resolver/limit-exceeded-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef associate-resolver-endpoint-ip-address :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/associate-resolver-endpoint-ip-address-response))

(clojure.core/defn associate-resolver-rule "Associates a resolver rule with a VPC. When you associate a rule with a VPC,\nResolver forwards all DNS queries for the domain name that is specified in the\nrule and that originate in the VPC. The queries are forwarded to the IP\naddresses for the DNS resolvers that are specified in the rule. For more\ninformation about rules, see CreateResolverRule." ([associate-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-resolver-rule-request associate-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/associate-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/associate-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateResolverRule", :http.request.configuration/output-deser-fn response-associate-resolver-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "ResourceUnavailableException" :portkey.aws.route53resolver/resource-unavailable-exception, "ResourceExistsException" :portkey.aws.route53resolver/resource-exists-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef associate-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/associate-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/associate-resolver-rule-response))

(clojure.core/defn get-resolver-rule-association "Gets information about an association between a specified resolver rule and a\nVPC. You associate a resolver rule and a VPC using AssociateResolverRule." ([get-resolver-rule-association-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resolver-rule-association-request get-resolver-rule-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/get-resolver-rule-association-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/get-resolver-rule-association-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRuleAssociation", :http.request.configuration/output-deser-fn response-get-resolver-rule-association-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule-association :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/get-resolver-rule-association-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/get-resolver-rule-association-response))

(clojure.core/defn get-resolver-endpoint "Gets information about a specified resolver endpoint, such as whether it's an\ninbound or an outbound resolver endpoint, and the current status of the\nendpoint." ([get-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resolver-endpoint-request get-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/get-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/get-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverEndpoint", :http.request.configuration/output-deser-fn response-get-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef get-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/get-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/get-resolver-endpoint-response))

(clojure.core/defn untag-resource "Removes one or more tags from a specified resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/untag-resource-response))

(clojure.core/defn get-resolver-rule-policy "Gets information about a resolver rule policy. A resolver rule policy specifies\nthe Resolver operations and resources that you want to allow another AWS account\nto be able to use." ([get-resolver-rule-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-resolver-rule-policy-request get-resolver-rule-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/get-resolver-rule-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/get-resolver-rule-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResolverRulePolicy", :http.request.configuration/output-deser-fn response-get-resolver-rule-policy-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "UnknownResourceException" :portkey.aws.route53resolver/unknown-resource-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-resolver-rule-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/get-resolver-rule-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/get-resolver-rule-policy-response))

(clojure.core/defn list-resolver-rule-associations "Lists the associations that were created between resolver rules and VPCs using\nthe current AWS account." ([] (list-resolver-rule-associations {})) ([list-resolver-rule-associations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolver-rule-associations-request list-resolver-rule-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/list-resolver-rule-associations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/list-resolver-rule-associations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverRuleAssociations", :http.request.configuration/output-deser-fn response-list-resolver-rule-associations-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-rule-associations :args (clojure.spec.alpha/? :portkey.aws.route53resolver/list-resolver-rule-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/list-resolver-rule-associations-response))

(clojure.core/defn update-resolver-rule "Updates settings for a specified resolver rule. ResolverRuleId is required, and\nall other parameters are optional. If you don't specify a parameter, it retains\nits current value." ([update-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-resolver-rule-request update-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/update-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/update-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolverRule", :http.request.configuration/output-deser-fn response-update-resolver-rule-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "ResourceUnavailableException" :portkey.aws.route53resolver/resource-unavailable-exception, "LimitExceededException" :portkey.aws.route53resolver/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef update-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/update-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/update-resolver-rule-response))

(clojure.core/defn list-resolver-rules "Lists the resolver rules that were created using the current AWS account." ([] (list-resolver-rules {})) ([list-resolver-rules-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolver-rules-request list-resolver-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/list-resolver-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/list-resolver-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverRules", :http.request.configuration/output-deser-fn response-list-resolver-rules-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.route53resolver/invalid-next-token-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-rules :args (clojure.spec.alpha/? :portkey.aws.route53resolver/list-resolver-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/list-resolver-rules-response))

(clojure.core/defn list-resolver-endpoint-ip-addresses "Gets the IP addresses for a specified resolver endpoint." ([list-resolver-endpoint-ip-addresses-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resolver-endpoint-ip-addresses-request list-resolver-endpoint-ip-addresses-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResolverEndpointIpAddresses", :http.request.configuration/output-deser-fn response-list-resolver-endpoint-ip-addresses-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "InvalidNextTokenException" :portkey.aws.route53resolver/invalid-next-token-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef list-resolver-endpoint-ip-addresses :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/list-resolver-endpoint-ip-addresses-response))

(clojure.core/defn update-resolver-endpoint "Updates the name of an inbound or an outbound resolver endpoint." ([update-resolver-endpoint-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-resolver-endpoint-request update-resolver-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/update-resolver-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/update-resolver-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResolverEndpoint", :http.request.configuration/output-deser-fn response-update-resolver-endpoint-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.route53resolver/invalid-request-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef update-resolver-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/update-resolver-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/update-resolver-endpoint-response))

(clojure.core/defn delete-resolver-rule "Deletes a resolver rule. Before you can delete a resolver rule, you must\ndisassociate it from all the VPCs that you associated the resolver rule with.\nFor more infomation, see DisassociateResolverRule." ([delete-resolver-rule-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-resolver-rule-request delete-resolver-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53resolver/endpoints, :http.request.configuration/target-prefix "Route53Resolver", :http.request.spec/output-spec :portkey.aws.route53resolver/delete-resolver-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-04-01", :http.request.configuration/service-id "Route53Resolver", :http.request.spec/input-spec :portkey.aws.route53resolver/delete-resolver-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResolverRule", :http.request.configuration/output-deser-fn response-delete-resolver-rule-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.route53resolver/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.route53resolver/resource-not-found-exception, "ResourceInUseException" :portkey.aws.route53resolver/resource-in-use-exception, "InternalServiceErrorException" :portkey.aws.route53resolver/internal-service-error-exception, "ThrottlingException" :portkey.aws.route53resolver/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-resolver-rule :args (clojure.spec.alpha/tuple :portkey.aws.route53resolver/delete-resolver-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.route53resolver/delete-resolver-rule-response))
