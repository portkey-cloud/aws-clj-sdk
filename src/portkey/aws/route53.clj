(ns portkey.aws.route53 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-insufficient-data-health-status)

(clojure.core/declare ser-tag-resource-type)

(clojure.core/declare ser-disabled)

(clojure.core/declare ser-health-check-nonce)

(clojure.core/declare ser-search-string)

(clojure.core/declare ser-rr-type)

(clojure.core/declare ser-cloud-watch-logs-log-group-arn)

(clojure.core/declare ser-alias-target)

(clojure.core/declare ser-account-limit-type)

(clojure.core/declare ser-geo-location-country-code)

(clojure.core/declare ser-traffic-policy-version-marker)

(clojure.core/declare ser-subnet-mask)

(clojure.core/declare ser-associate-vpc-comment)

(clojure.core/declare ser-resource-description)

(clojure.core/declare ser-change-batch)

(clojure.core/declare ser-resource-record-set-region)

(clojure.core/declare ser-traffic-policy-name)

(clojure.core/declare ser-vpc-region)

(clojure.core/declare ser-health-check-region)

(clojure.core/declare ser-geo-location-continent-code)

(clojure.core/declare ser-health-check-version)

(clojure.core/declare ser-failure-threshold)

(clojure.core/declare ser-change-action)

(clojure.core/declare ser-child-health-check-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-changes)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-health-check-region-list)

(clojure.core/declare ser-reusable-delegation-set-limit-type)

(clojure.core/declare ser-tag-resource-id)

(clojure.core/declare ser-geo-location)

(clojure.core/declare ser-health-check-config)

(clojure.core/declare ser-traffic-policy-version)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-ttl)

(clojure.core/declare ser-resettable-element-name-list)

(clojure.core/declare ser-resource-record-set-weight)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-health-check-id)

(clojure.core/declare ser-dns-name)

(clojure.core/declare ser-resource-records)

(clojure.core/declare ser-traffic-policy-document)

(clojure.core/declare ser-traffic-policy-id)

(clojure.core/declare ser-query-logging-config-id)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-resource-record-set-multi-value-answer)

(clojure.core/declare ser-port)

(clojure.core/declare ser-resource-record-set-identifier)

(clojure.core/declare ser-resource-record-set-failover)

(clojure.core/declare ser-geo-location-subdivision-code)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-change)

(clojure.core/declare ser-traffic-policy-instance-id)

(clojure.core/declare ser-resettable-element-name)

(clojure.core/declare ser-resource-record)

(clojure.core/declare ser-alarm-name)

(clojure.core/declare ser-hosted-zone-config)

(clojure.core/declare ser-hosted-zone-limit-type)

(clojure.core/declare ser-resource-path)

(clojure.core/declare ser-alarm-identifier)

(clojure.core/declare ser-is-private-zone)

(clojure.core/declare ser-traffic-policy-comment)

(clojure.core/declare ser-enable-sni)

(clojure.core/declare ser-health-check-type)

(clojure.core/declare ser-r-data)

(clojure.core/declare ser-alias-health-enabled)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-disassociate-vpc-comment)

(clojure.core/declare ser-page-marker)

(clojure.core/declare ser-nonce)

(clojure.core/declare ser-measure-latency)

(clojure.core/declare ser-health-threshold)

(clojure.core/declare ser-resource-record-set)

(clojure.core/declare ser-vpc-id)

(clojure.core/declare ser-tag-resource-id-list)

(clojure.core/declare ser-request-interval)

(clojure.core/declare ser-fully-qualified-domain-name)

(clojure.core/declare ser-vpc)

(clojure.core/declare ser-page-max-items)

(clojure.core/declare ser-inverted)

(clojure.core/declare ser-cloud-watch-region)

(clojure.core/defn- ser-insufficient-data-health-status [input] #:http.request.field{:value (clojure.core/get {"Healthy" "Healthy", :healthy "Healthy", "Unhealthy" "Unhealthy", :unhealthy "Unhealthy", "LastKnownStatus" "LastKnownStatus", :last-known-status "LastKnownStatus"} input), :shape "InsufficientDataHealthStatus"})

(clojure.core/defn- ser-tag-resource-type [input] #:http.request.field{:value (clojure.core/get {"healthcheck" "healthcheck", :healthcheck "healthcheck", "hostedzone" "hostedzone", :hostedzone "hostedzone"} input), :shape "TagResourceType"})

(clojure.core/defn- ser-disabled [input] #:http.request.field{:value input, :shape "Disabled"})

(clojure.core/defn- ser-health-check-nonce [input] #:http.request.field{:value input, :shape "HealthCheckNonce"})

(clojure.core/defn- ser-search-string [input] #:http.request.field{:value input, :shape "SearchString"})

(clojure.core/defn- ser-rr-type [input] #:http.request.field{:value (clojure.core/get {:soa "SOA", "CAA" "CAA", :naptr "NAPTR", "CNAME" "CNAME", :txt "TXT", :ns "NS", "TXT" "TXT", "SRV" "SRV", :srv "SRV", "AAAA" "AAAA", :caa "CAA", "NS" "NS", "PTR" "PTR", :mx "MX", :cname "CNAME", "NAPTR" "NAPTR", "A" "A", "SPF" "SPF", :spf "SPF", :ptr "PTR", :aaaa "AAAA", :a "A", "SOA" "SOA", "MX" "MX"} input), :shape "RRType"})

(clojure.core/defn- ser-cloud-watch-logs-log-group-arn [input] #:http.request.field{:value input, :shape "CloudWatchLogsLogGroupArn"})

(clojure.core/defn- ser-alias-target [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AliasTarget"}))

(clojure.core/defn- ser-account-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HEALTH_CHECKS_BY_OWNER" "MAX_HEALTH_CHECKS_BY_OWNER", "MAX_TRAFFIC_POLICIES_BY_OWNER" "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-hosted-zones-by-owner "MAX_HOSTED_ZONES_BY_OWNER", :max-reusable-delegation-sets-by-owner "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", :max-traffic-policies-by-owner "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-traffic-policy-instances-by-owner "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HOSTED_ZONES_BY_OWNER" "MAX_HOSTED_ZONES_BY_OWNER", :max-health-checks-by-owner "MAX_HEALTH_CHECKS_BY_OWNER"} input), :shape "AccountLimitType"})

(clojure.core/defn- ser-geo-location-country-code [input] #:http.request.field{:value input, :shape "GeoLocationCountryCode"})

(clojure.core/defn- ser-traffic-policy-version-marker [input] #:http.request.field{:value input, :shape "TrafficPolicyVersionMarker"})

(clojure.core/defn- ser-subnet-mask [input] #:http.request.field{:value input, :shape "SubnetMask"})

(clojure.core/defn- ser-associate-vpc-comment [input] #:http.request.field{:value input, :shape "AssociateVPCComment"})

(clojure.core/defn- ser-resource-description [input] #:http.request.field{:value input, :shape "ResourceDescription"})

(clojure.core/defn- ser-change-batch [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ChangeBatch"}))

(clojure.core/defn- ser-resource-record-set-region [input] #:http.request.field{:value input, :shape "ResourceRecordSetRegion"})

(clojure.core/defn- ser-traffic-policy-name [input] #:http.request.field{:value input, :shape "TrafficPolicyName"})

(clojure.core/defn- ser-vpc-region [input] #:http.request.field{:value input, :shape "VPCRegion"})

(clojure.core/defn- ser-health-check-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :useast-1 "us-east-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :uswest-1 "us-west-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2"} input), :shape "HealthCheckRegion"})

(clojure.core/defn- ser-geo-location-continent-code [input] #:http.request.field{:value input, :shape "GeoLocationContinentCode"})

(clojure.core/defn- ser-health-check-version [input] #:http.request.field{:value input, :shape "HealthCheckVersion"})

(clojure.core/defn- ser-failure-threshold [input] #:http.request.field{:value input, :shape "FailureThreshold"})

(clojure.core/defn- ser-change-action [input] #:http.request.field{:value (clojure.core/get {"CREATE" "CREATE", :create "CREATE", "DELETE" "DELETE", :delete "DELETE", "UPSERT" "UPSERT", :upsert "UPSERT"} input), :shape "ChangeAction"})

(clojure.core/defn- ser-child-health-check-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser coll) {}))) input), :shape "ChildHealthCheckList"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-change coll) #:http.request.field{:shape "Change", :location-name "Change"}))) input), :shape "Changes", :type "list", :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-health-check-region-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-health-check-region coll) #:http.request.field{:shape "HealthCheckRegion", :location-name "Region"}))) input), :shape "HealthCheckRegionList", :type "list", :max 64, :min 3})

(clojure.core/defn- ser-reusable-delegation-set-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" "MAX_ZONES_BY_REUSABLE_DELEGATION_SET", :max-zones-by-reusable-delegation-set "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"} input), :shape "ReusableDelegationSetLimitType"})

(clojure.core/defn- ser-tag-resource-id [input] #:http.request.field{:value input, :shape "TagResourceId"})

(clojure.core/defn- ser-geo-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GeoLocation"}))

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HealthCheckConfig"}))

(clojure.core/defn- ser-traffic-policy-version [input] #:http.request.field{:value input, :shape "TrafficPolicyVersion"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-ttl [input] #:http.request.field{:value input, :shape "TTL"})

(clojure.core/defn- ser-resettable-element-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resettable-element-name coll) #:http.request.field{:shape "ResettableElementName", :location-name "ResettableElementName"}))) input), :shape "ResettableElementNameList", :type "list", :max 64})

(clojure.core/defn- ser-resource-record-set-weight [input] #:http.request.field{:value input, :shape "ResourceRecordSetWeight"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-health-check-id [input] #:http.request.field{:value input, :shape "HealthCheckId"})

(clojure.core/defn- ser-dns-name [input] #:http.request.field{:value input, :shape "DNSName"})

(clojure.core/defn- ser-resource-records [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-record coll) #:http.request.field{:shape "ResourceRecord", :location-name "ResourceRecord"}))) input), :shape "ResourceRecords", :type "list", :min 1})

(clojure.core/defn- ser-traffic-policy-document [input] #:http.request.field{:value input, :shape "TrafficPolicyDocument"})

(clojure.core/defn- ser-traffic-policy-id [input] #:http.request.field{:value input, :shape "TrafficPolicyId"})

(clojure.core/defn- ser-query-logging-config-id [input] #:http.request.field{:value input, :shape "QueryLoggingConfigId"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-resource-record-set-multi-value-answer [input] #:http.request.field{:value input, :shape "ResourceRecordSetMultiValueAnswer"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-resource-record-set-identifier [input] #:http.request.field{:value input, :shape "ResourceRecordSetIdentifier"})

(clojure.core/defn- ser-resource-record-set-failover [input] #:http.request.field{:value (clojure.core/get {"PRIMARY" "PRIMARY", :primary "PRIMARY", "SECONDARY" "SECONDARY", :secondary "SECONDARY"} input), :shape "ResourceRecordSetFailover"})

(clojure.core/defn- ser-geo-location-subdivision-code [input] #:http.request.field{:value input, :shape "GeoLocationSubdivisionCode"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IPAddress"})

(clojure.core/defn- ser-change [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Change"}))

(clojure.core/defn- ser-traffic-policy-instance-id [input] #:http.request.field{:value input, :shape "TrafficPolicyInstanceId"})

(clojure.core/defn- ser-resettable-element-name [input] #:http.request.field{:value (clojure.core/get {"FullyQualifiedDomainName" "FullyQualifiedDomainName", :fully-qualified-domain-name "FullyQualifiedDomainName", "Regions" "Regions", :regions "Regions", "ResourcePath" "ResourcePath", :resource-path "ResourcePath", "ChildHealthChecks" "ChildHealthChecks", :child-health-checks "ChildHealthChecks"} input), :shape "ResettableElementName"})

(clojure.core/defn- ser-resource-record [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceRecord"}))

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-hosted-zone-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HostedZoneConfig"}))

(clojure.core/defn- ser-hosted-zone-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_RRSETS_BY_ZONE" "MAX_RRSETS_BY_ZONE", :max-rrsets-by-zone "MAX_RRSETS_BY_ZONE", "MAX_VPCS_ASSOCIATED_BY_ZONE" "MAX_VPCS_ASSOCIATED_BY_ZONE", :max-vpcs-associated-by-zone "MAX_VPCS_ASSOCIATED_BY_ZONE"} input), :shape "HostedZoneLimitType"})

(clojure.core/defn- ser-resource-path [input] #:http.request.field{:value input, :shape "ResourcePath"})

(clojure.core/defn- ser-alarm-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AlarmIdentifier"}))

(clojure.core/defn- ser-is-private-zone [input] #:http.request.field{:value input, :shape "IsPrivateZone"})

(clojure.core/defn- ser-traffic-policy-comment [input] #:http.request.field{:value input, :shape "TrafficPolicyComment"})

(clojure.core/defn- ser-enable-sni [input] #:http.request.field{:value input, :shape "EnableSNI"})

(clojure.core/defn- ser-health-check-type [input] #:http.request.field{:value (clojure.core/get {:http-str-match "HTTP_STR_MATCH", :tcp "TCP", :calculated "CALCULATED", :https-str-match "HTTPS_STR_MATCH", "TCP" "TCP", "CALCULATED" "CALCULATED", "HTTP_STR_MATCH" "HTTP_STR_MATCH", "HTTPS_STR_MATCH" "HTTPS_STR_MATCH", "CLOUDWATCH_METRIC" "CLOUDWATCH_METRIC", "HTTPS" "HTTPS", :http "HTTP", :cloudwatch-metric "CLOUDWATCH_METRIC", "HTTP" "HTTP", :https "HTTPS"} input), :shape "HealthCheckType"})

(clojure.core/defn- ser-r-data [input] #:http.request.field{:value input, :shape "RData"})

(clojure.core/defn- ser-alias-health-enabled [input] #:http.request.field{:value input, :shape "AliasHealthEnabled"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-disassociate-vpc-comment [input] #:http.request.field{:value input, :shape "DisassociateVPCComment"})

(clojure.core/defn- ser-page-marker [input] #:http.request.field{:value input, :shape "PageMarker"})

(clojure.core/defn- ser-nonce [input] #:http.request.field{:value input, :shape "Nonce"})

(clojure.core/defn- ser-measure-latency [input] #:http.request.field{:value input, :shape "MeasureLatency"})

(clojure.core/defn- ser-health-threshold [input] #:http.request.field{:value input, :shape "HealthThreshold"})

(clojure.core/defn- ser-resource-record-set [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ResourceRecordSet"}))

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VPCId"})

(clojure.core/defn- ser-tag-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-resource-id coll) #:http.request.field{:shape "TagResourceId", :location-name "ResourceId"}))) input), :shape "TagResourceIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-request-interval [input] #:http.request.field{:value input, :shape "RequestInterval"})

(clojure.core/defn- ser-fully-qualified-domain-name [input] #:http.request.field{:value input, :shape "FullyQualifiedDomainName"})

(clojure.core/defn- ser-vpc [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VPC"}))

(clojure.core/defn- ser-page-max-items [input] #:http.request.field{:value input, :shape "PageMaxItems"})

(clojure.core/defn- ser-inverted [input] #:http.request.field{:value input, :shape "Inverted"})

(clojure.core/defn- ser-cloud-watch-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2", "eu-north-1" "eu-north-1", :eunorth-1 "eu-north-1"} input), :shape "CloudWatchRegion"})

(clojure.core/defn- req-update-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"}) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion"})]}))

(clojure.core/defn- req-delete-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})]}))

(clojure.core/defn- req-get-checker-ip-ranges-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-traffic-policy-instances-by-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId", :location "querystring", :location-name "id"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion", :location "querystring", :location-name "version"})]} (clojure.core/contains? input :hosted-zone-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id-marker)) #:http.request.field{:name "HostedZoneIdMarker", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-list-traffic-policy-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :traffic-policy-version-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-version-marker (input :traffic-policy-version-marker)) #:http.request.field{:name "TrafficPolicyVersionMarker", :shape "TrafficPolicyVersionMarker", :location "querystring", :location-name "trafficpolicyversion"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-test-dns-answer-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"}) (clojure.core/into (ser-dns-name (input :record-name)) #:http.request.field{:name "RecordName", :shape "DNSName", :location "querystring", :location-name "recordname"}) (clojure.core/into (ser-rr-type (input :record-type)) #:http.request.field{:name "RecordType", :shape "RRType", :location "querystring", :location-name "recordtype"})]} (clojure.core/contains? input :resolver-ip) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :resolver-ip)) #:http.request.field{:name "ResolverIP", :shape "IPAddress", :location "querystring", :location-name "resolverip"})) (clojure.core/contains? input :edns-0-client-subnet-ip) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :edns-0-client-subnet-ip)) #:http.request.field{:name "EDNS0ClientSubnetIP", :shape "IPAddress", :location "querystring", :location-name "edns0clientsubnetip"})) (clojure.core/contains? input :edns-0-client-subnet-mask) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-mask (input :edns-0-client-subnet-mask)) #:http.request.field{:name "EDNS0ClientSubnetMask", :shape "SubnetMask", :location "querystring", :location-name "edns0clientsubnetmask"}))))

(clojure.core/defn- req-list-resource-record-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :start-record-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :start-record-name)) #:http.request.field{:name "StartRecordName", :shape "DNSName", :location "querystring", :location-name "name"})) (clojure.core/contains? input :start-record-type) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :start-record-type)) #:http.request.field{:name "StartRecordType", :shape "RRType", :location "querystring", :location-name "type"})) (clojure.core/contains? input :start-record-identifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-identifier (input :start-record-identifier)) #:http.request.field{:name "StartRecordIdentifier", :shape "ResourceRecordSetIdentifier", :location "querystring", :location-name "identifier"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-vpc-association-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]}))

(clojure.core/defn- req-change-resource-record-sets-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-change-batch (input :change-batch)) #:http.request.field{:name "ChangeBatch", :shape "ChangeBatch"})]}))

(clojure.core/defn- req-get-geo-location-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :continent-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :continent-code)) #:http.request.field{:name "ContinentCode", :shape "GeoLocationContinentCode", :location "querystring", :location-name "continentcode"})) (clojure.core/contains? input :country-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :country-code)) #:http.request.field{:name "CountryCode", :shape "GeoLocationCountryCode", :location "querystring", :location-name "countrycode"})) (clojure.core/contains? input :subdivision-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :subdivision-code)) #:http.request.field{:name "SubdivisionCode", :shape "GeoLocationSubdivisionCode", :location "querystring", :location-name "subdivisioncode"}))))

(clojure.core/defn- req-delete-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-get-health-check-status-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-delete-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-query-logging-config-id (input :id)) #:http.request.field{:name "Id", :shape "QueryLoggingConfigId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-vpc-association-authorization-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]}))

(clojure.core/defn- req-get-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-traffic-policy-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hosted-zone-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id-marker)) #:http.request.field{:name "HostedZoneIdMarker", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-cloud-watch-logs-log-group-arn (input :cloud-watch-logs-log-group-arn)) #:http.request.field{:name "CloudWatchLogsLogGroupArn", :shape "CloudWatchLogsLogGroupArn"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"}) (clojure.core/into (ser-tag-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "TagResourceId", :location "uri", :location-name "ResourceId"})]}))

(clojure.core/defn- req-update-traffic-policy-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})], :body [(clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"})]}))

(clojure.core/defn- req-list-hosted-zones-by-name-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :dns-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :dns-name)) #:http.request.field{:name "DNSName", :shape "DNSName", :location "querystring", :location-name "dnsname"})) (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-traffic-policy-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-traffic-policy-document (input :document)) #:http.request.field{:name "Document", :shape "TrafficPolicyDocument"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"}))))

(clojure.core/defn- req-delete-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-hosted-zone-comment-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"}))))

(clojure.core/defn- req-list-traffic-policy-instances-by-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "id"})]} (clojure.core/contains? input :traffic-policy-instance-name-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dns-name (input :traffic-policy-instance-name-marker)) #:http.request.field{:name "TrafficPolicyInstanceNameMarker", :shape "DNSName", :location "querystring", :location-name "trafficpolicyinstancename"})) (clojure.core/contains? input :traffic-policy-instance-type-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rr-type (input :traffic-policy-instance-type-marker)) #:http.request.field{:name "TrafficPolicyInstanceTypeMarker", :shape "RRType", :location "querystring", :location-name "trafficpolicyinstancetype"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-traffic-policy-name (input :name)) #:http.request.field{:name "Name", :shape "TrafficPolicyName"}) (clojure.core/into (ser-traffic-policy-document (input :document)) #:http.request.field{:name "Document", :shape "TrafficPolicyDocument"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-comment (input :comment)) #:http.request.field{:name "Comment", :shape "TrafficPolicyComment"}))))

(clojure.core/defn- req-get-hosted-zone-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-update-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :disabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disabled (input :disabled)) #:http.request.field{:name "Disabled", :shape "Disabled"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :health-check-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-version (input :health-check-version)) #:http.request.field{:name "HealthCheckVersion", :shape "HealthCheckVersion"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :reset-elements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resettable-element-name-list (input :reset-elements)) #:http.request.field{:name "ResetElements", :shape "ResettableElementNameList"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

(clojure.core/defn- req-list-hosted-zones-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"})) (clojure.core/contains? input :delegation-set-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId", :location "querystring", :location-name "delegationsetid"}))))

(clojure.core/defn- req-get-traffic-policy-instance-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-query-logging-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "querystring", :location-name "hostedzoneid"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken", :location "querystring", :location-name "nexttoken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxresults"}))))

(clojure.core/defn- req-get-change-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-reusable-delegation-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-list-vpc-association-authorizations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken", :location "querystring", :location-name "nexttoken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :location "querystring", :location-name "maxresults"}))))

(clojure.core/defn- req-create-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-dns-name (input :name)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"}) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id)) #:http.request.field{:name "TrafficPolicyId", :shape "TrafficPolicyId"}) (clojure.core/into (ser-traffic-policy-version (input :traffic-policy-version)) #:http.request.field{:name "TrafficPolicyVersion", :shape "TrafficPolicyVersion"})]}))

(clojure.core/defn- req-get-query-logging-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-query-logging-config-id (input :id)) #:http.request.field{:name "Id", :shape "QueryLoggingConfigId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-traffic-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :traffic-policy-id-marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-id (input :traffic-policy-id-marker)) #:http.request.field{:name "TrafficPolicyIdMarker", :shape "TrafficPolicyId", :location "querystring", :location-name "trafficpolicyid"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-create-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-health-check-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "HealthCheckNonce"}) (clojure.core/into (ser-health-check-config (input :health-check-config)) #:http.request.field{:name "HealthCheckConfig", :shape "HealthCheckConfig"})]}))

(clojure.core/defn- req-associate-vpc-with-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-associate-vpc-comment (input :comment)) #:http.request.field{:name "Comment", :shape "AssociateVPCComment"}))))

(clojure.core/defn- req-list-health-checks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-marker (input :marker)) #:http.request.field{:name "Marker", :shape "PageMarker", :location "querystring", :location-name "marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-get-health-check-last-failure-reason-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]}))

(clojure.core/defn- req-get-hosted-zone-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-hosted-zone-limit-type (input :type)) #:http.request.field{:name "Type", :shape "HostedZoneLimitType", :location "uri", :location-name "Type"}) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-change-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"}) (clojure.core/into (ser-tag-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "TagResourceId", :location "uri", :location-name "ResourceId"})]} (clojure.core/contains? input :add-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :add-tags)) #:http.request.field{:name "AddTags", :shape "TagList"})) (clojure.core/contains? input :remove-tag-keys) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :remove-tag-keys)) #:http.request.field{:name "RemoveTagKeys", :shape "TagKeyList"}))))

(clojure.core/defn- req-create-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "Nonce"})]} (clojure.core/contains? input :hosted-zone-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}))))

(clojure.core/defn- req-get-traffic-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyId", :location "uri", :location-name "Id"}) (clojure.core/into (ser-traffic-policy-version (input :version)) #:http.request.field{:name "Version", :shape "TrafficPolicyVersion", :location "uri", :location-name "Version"})]}))

(clojure.core/defn- req-disassociate-vpc-from-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :hosted-zone-id)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId", :location "uri", :location-name "Id"})], :body [(clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})]} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-vpc-comment (input :comment)) #:http.request.field{:name "Comment", :shape "DisassociateVPCComment"}))))

(clojure.core/defn- req-delete-reusable-delegation-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-resource-id (input :id)) #:http.request.field{:name "Id", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-account-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-account-limit-type (input :type)) #:http.request.field{:name "Type", :shape "AccountLimitType", :location "uri", :location-name "Type"})]}))

(clojure.core/defn- req-get-health-check-count-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-traffic-policy-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-traffic-policy-instance-id (input :id)) #:http.request.field{:name "Id", :shape "TrafficPolicyInstanceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-reusable-delegation-set-limit-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-reusable-delegation-set-limit-type (input :type)) #:http.request.field{:name "Type", :shape "ReusableDelegationSetLimitType", :location "uri", :location-name "Type"}) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-tag-resource-type (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "TagResourceType", :location "uri", :location-name "ResourceType"})], :body [(clojure.core/into (ser-tag-resource-id-list (input :resource-ids)) #:http.request.field{:name "ResourceIds", :shape "TagResourceIdList"})]}))

(clojure.core/defn- req-list-geo-locations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :start-continent-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :start-continent-code)) #:http.request.field{:name "StartContinentCode", :shape "GeoLocationContinentCode", :location "querystring", :location-name "startcontinentcode"})) (clojure.core/contains? input :start-country-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :start-country-code)) #:http.request.field{:name "StartCountryCode", :shape "GeoLocationCountryCode", :location "querystring", :location-name "startcountrycode"})) (clojure.core/contains? input :start-subdivision-code) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :start-subdivision-code)) #:http.request.field{:name "StartSubdivisionCode", :shape "GeoLocationSubdivisionCode", :location "querystring", :location-name "startsubdivisioncode"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "PageMaxItems", :location "querystring", :location-name "maxitems"}))))

(clojure.core/defn- req-create-hosted-zone-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-dns-name (input :name)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-nonce (input :caller-reference)) #:http.request.field{:name "CallerReference", :shape "Nonce"})]} (clojure.core/contains? input :vpc) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc (input :vpc)) #:http.request.field{:name "VPC", :shape "VPC"})) (clojure.core/contains? input :hosted-zone-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hosted-zone-config (input :hosted-zone-config)) #:http.request.field{:name "HostedZoneConfig", :shape "HostedZoneConfig"})) (clojure.core/contains? input :delegation-set-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id (input :delegation-set-id)) #:http.request.field{:name "DelegationSetId", :shape "ResourceId"}))))

(clojure.core/declare deser-insufficient-data-health-status)

(clojure.core/declare deser-tag-resource-type)

(clojure.core/declare deser-geo-location-subdivision-name)

(clojure.core/declare deser-health-check)

(clojure.core/declare deser-disabled)

(clojure.core/declare deser-delegation-set-name-servers)

(clojure.core/declare deser-health-check-nonce)

(clojure.core/declare deser-traffic-policy-instance-count)

(clojure.core/declare deser-search-string)

(clojure.core/declare deser-hosted-zone-rr-set-count)

(clojure.core/declare deser-resource-tag-set)

(clojure.core/declare deser-rr-type)

(clojure.core/declare deser-cloud-watch-logs-log-group-arn)

(clojure.core/declare deser-alias-target)

(clojure.core/declare deser-account-limit-type)

(clojure.core/declare deser-geo-location-country-code)

(clojure.core/declare deser-traffic-policy-version-marker)

(clojure.core/declare deser-traffic-policy-summaries)

(clojure.core/declare deser-period)

(clojure.core/declare deser-delegation-sets)

(clojure.core/declare deser-threshold)

(clojure.core/declare deser-dimension-field)

(clojure.core/declare deser-nameserver)

(clojure.core/declare deser-resource-description)

(clojure.core/declare deser-resource-record-set-region)

(clojure.core/declare deser-traffic-policy-name)

(clojure.core/declare deser-traffic-policy)

(clojure.core/declare deser-vpc-region)

(clojure.core/declare deser-health-checks)

(clojure.core/declare deser-health-check-region)

(clojure.core/declare deser-geo-location-continent-code)

(clojure.core/declare deser-health-check-version)

(clojure.core/declare deser-error-messages)

(clojure.core/declare deser-failure-threshold)

(clojure.core/declare deser-child-health-check-list)

(clojure.core/declare deser-checker-ip-ranges)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-dimension)

(clojure.core/declare deser-vp-cs)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-linked-service)

(clojure.core/declare deser-health-check-region-list)

(clojure.core/declare deser-reusable-delegation-set-limit-type)

(clojure.core/declare deser-geo-location-continent-name)

(clojure.core/declare deser-health-check-count)

(clojure.core/declare deser-hosted-zone)

(clojure.core/declare deser-tag-resource-id)

(clojure.core/declare deser-traffic-policy-instances)

(clojure.core/declare deser-page-truncated)

(clojure.core/declare deser-geo-location)

(clojure.core/declare deser-ip-address-cidr)

(clojure.core/declare deser-health-check-config)

(clojure.core/declare deser-change-info)

(clojure.core/declare deser-dimension-list)

(clojure.core/declare deser-status)

(clojure.core/declare deser-service-principal)

(clojure.core/declare deser-traffic-policy-version)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-geo-location-details)

(clojure.core/declare deser-change-status)

(clojure.core/declare deser-dnsr-code)

(clojure.core/declare deser-resource-id)

(clojure.core/declare deser-traffic-policy-instance-state)

(clojure.core/declare deser-ttl)

(clojure.core/declare deser-resource-record-set-weight)

(clojure.core/declare deser-resource-tag-set-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-hosted-zone-count)

(clojure.core/declare deser-record-data-entry)

(clojure.core/declare deser-health-check-observation)

(clojure.core/declare deser-health-check-id)

(clojure.core/declare deser-dns-name)

(clojure.core/declare deser-query-logging-configs)

(clojure.core/declare deser-reusable-delegation-set-limit)

(clojure.core/declare deser-resource-records)

(clojure.core/declare deser-traffic-policy-document)

(clojure.core/declare deser-resource-uri)

(clojure.core/declare deser-traffic-policy-id)

(clojure.core/declare deser-hosted-zone-limit)

(clojure.core/declare deser-account-limit)

(clojure.core/declare deser-query-logging-config-id)

(clojure.core/declare deser-query-logging-config)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-delegation-set)

(clojure.core/declare deser-resource-record-set-multi-value-answer)

(clojure.core/declare deser-port)

(clojure.core/declare deser-namespace)

(clojure.core/declare deser-message)

(clojure.core/declare deser-resource-record-set-identifier)

(clojure.core/declare deser-resource-record-set-failover)

(clojure.core/declare deser-geo-location-subdivision-code)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-traffic-policy-instance-id)

(clojure.core/declare deser-traffic-policy-summary)

(clojure.core/declare deser-traffic-policy-instance)

(clojure.core/declare deser-geo-location-country-name)

(clojure.core/declare deser-resource-record)

(clojure.core/declare deser-alarm-name)

(clojure.core/declare deser-usage-count)

(clojure.core/declare deser-hosted-zone-config)

(clojure.core/declare deser-hosted-zone-limit-type)

(clojure.core/declare deser-resource-path)

(clojure.core/declare deser-traffic-policies)

(clojure.core/declare deser-geo-location-details-list)

(clojure.core/declare deser-alarm-identifier)

(clojure.core/declare deser-is-private-zone)

(clojure.core/declare deser-traffic-policy-comment)

(clojure.core/declare deser-enable-sni)

(clojure.core/declare deser-health-check-type)

(clojure.core/declare deser-record-data)

(clojure.core/declare deser-r-data)

(clojure.core/declare deser-alias-health-enabled)

(clojure.core/declare deser-health-check-observations)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-page-marker)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-nonce)

(clojure.core/declare deser-measure-latency)

(clojure.core/declare deser-transport-protocol)

(clojure.core/declare deser-hosted-zones)

(clojure.core/declare deser-evaluation-periods)

(clojure.core/declare deser-resource-record-sets)

(clojure.core/declare deser-health-threshold)

(clojure.core/declare deser-resource-record-set)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-request-interval)

(clojure.core/declare deser-time-stamp)

(clojure.core/declare deser-cloud-watch-alarm-configuration)

(clojure.core/declare deser-fully-qualified-domain-name)

(clojure.core/declare deser-statistic)

(clojure.core/declare deser-status-report)

(clojure.core/declare deser-vpc)

(clojure.core/declare deser-limit-value)

(clojure.core/declare deser-page-max-items)

(clojure.core/declare deser-inverted)

(clojure.core/declare deser-cloud-watch-region)

(clojure.core/defn- deser-insufficient-data-health-status [input] (clojure.core/get {"Healthy" :healthy, "Unhealthy" :unhealthy, "LastKnownStatus" :last-known-status} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-tag-resource-type [input] (clojure.core/get {"healthcheck" :healthcheck, "hostedzone" :hostedzone} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-subdivision-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check [input] (clojure.core/let [letvar177179 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-disabled [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-delegation-set-name-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-health-check-nonce [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-search-string [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zone-rr-set-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-tag-set [input] (clojure.core/let [letvar177445 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-rr-type [input] (clojure.core/get {"CAA" :caa, "CNAME" :cname, "TXT" :txt, "SRV" :srv, "AAAA" :aaaa, "NS" :ns, "PTR" :ptr, "NAPTR" :naptr, "A" :a, "SPF" :spf, "SOA" :soa, "MX" :mx} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-watch-logs-log-group-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-target [input] (clojure.core/let [letvar177681 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-account-limit-type [input] (clojure.core/get {"MAX_HEALTH_CHECKS_BY_OWNER" :max-health-checks-by-owner, "MAX_HOSTED_ZONES_BY_OWNER" :max-hosted-zones-by-owner, "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" :max-traffic-policy-instances-by-owner, "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" :max-reusable-delegation-sets-by-owner, "MAX_TRAFFIC_POLICIES_BY_OWNER" :max-traffic-policies-by-owner} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-country-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-version-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-summary coll))) input))

(clojure.core/defn- deser-period [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-delegation-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delegation-set coll))) input))

(clojure.core/defn- deser-threshold [input] (java.lang.Double. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-dimension-field [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-nameserver [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-description [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "cn-northwest-1" :cnnorthwest-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1, "eu-north-1" :eunorth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-traffic-policy-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy [input] (clojure.core/let [letvar178229 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Document" (portkey.aws/search-for-tag input "Document" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar178229 ["Id" :content])), :version (deser-traffic-policy-version (clojure.core/get-in letvar178229 ["Version" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar178229 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar178229 ["Type" :content])), :document (deser-traffic-policy-document (clojure.core/get-in letvar178229 ["Document" :content]))} (letvar178229 "Comment") (clojure.core/assoc :comment (deser-traffic-policy-comment (clojure.core/get-in letvar178229 ["Comment" :content]))))))

(clojure.core/defn- deser-vpc-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1, "eu-north-1" :eunorth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-health-checks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check coll))) input))

(clojure.core/defn- deser-health-check-region [input] (clojure.core/get {"us-east-1" :useast-1, "us-west-1" :uswest-1, "us-west-2" :uswest-2, "eu-west-1" :euwest-1, "ap-southeast-1" :apsoutheast-1, "ap-southeast-2" :apsoutheast-2, "ap-northeast-1" :apnortheast-1, "sa-east-1" :saeast-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-version [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-message coll))) input))

(clojure.core/defn- deser-failure-threshold [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-child-health-check-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-id coll))) input))

(clojure.core/defn- deser-checker-ip-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address-cidr coll))) input))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dimension [input] (clojure.core/let [letvar178645 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dimension-field (clojure.core/get-in letvar178645 ["Name" :content])), :value (deser-dimension-field (clojure.core/get-in letvar178645 ["Value" :content]))})))

(clojure.core/defn- deser-vp-cs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc coll))) input))

(clojure.core/defn- deser-pagination-token [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-linked-service [input] (clojure.core/let [letvar178894 {"ServicePrincipal" (portkey.aws/search-for-tag input "ServicePrincipal" :flattened? false :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar178894 "ServicePrincipal") (clojure.core/assoc :service-principal (deser-service-principal (clojure.core/get-in letvar178894 ["ServicePrincipal" :content]))) (letvar178894 "Description") (clojure.core/assoc :description (deser-resource-description (clojure.core/get-in letvar178894 ["Description" :content]))))))

(clojure.core/defn- deser-health-check-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-region coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit-type [input] (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-hosted-zone [input] (clojure.core/let [letvar179159 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Config" (portkey.aws/search-for-tag input "Config" :flattened? false :xmlAttribute? nil), "ResourceRecordSetCount" (portkey.aws/search-for-tag input "ResourceRecordSetCount" :flattened? false :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar179159 ["Id" :content])), :name (deser-dns-name (clojure.core/get-in letvar179159 ["Name" :content])), :caller-reference (deser-nonce (clojure.core/get-in letvar179159 ["CallerReference" :content]))} (letvar179159 "Config") (clojure.core/assoc :config (deser-hosted-zone-config (clojure.core/get-in letvar179159 ["Config" :content]))) (letvar179159 "ResourceRecordSetCount") (clojure.core/assoc :resource-record-set-count (deser-hosted-zone-rr-set-count (clojure.core/get-in letvar179159 ["ResourceRecordSetCount" :content]))) (letvar179159 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar179159 ["LinkedService" :content]))))))

(clojure.core/defn- deser-tag-resource-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-instance coll))) input))

(clojure.core/defn- deser-page-truncated [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-geo-location [input] (clojure.core/let [letvar179414 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar179414 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar179414 ["ContinentCode" :content]))) (letvar179414 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar179414 ["CountryCode" :content]))) (letvar179414 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar179414 ["SubdivisionCode" :content]))))))

(clojure.core/defn- deser-ip-address-cidr [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-config [input] (clojure.core/let [letvar179627 {"InsufficientDataHealthStatus" (portkey.aws/search-for-tag input "InsufficientDataHealthStatus" :flattened? false :xmlAttribute? nil), "Disabled" (portkey.aws/search-for-tag input "Disabled" :flattened? false :xmlAttribute? nil), "SearchString" (portkey.aws/search-for-tag input "SearchString" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "FailureThreshold" (portkey.aws/search-for-tag input "FailureThreshold" :flattened? false :xmlAttribute? nil), "ChildHealthChecks" (portkey.aws/search-for-tag input "ChildHealthChecks" :flattened? false :xmlAttribute? nil), "Regions" (portkey.aws/search-for-tag input "Regions" :flattened? false :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "ResourcePath" (portkey.aws/search-for-tag input "ResourcePath" :flattened? false :xmlAttribute? nil), "AlarmIdentifier" (portkey.aws/search-for-tag input "AlarmIdentifier" :flattened? false :xmlAttribute? nil), "EnableSNI" (portkey.aws/search-for-tag input "EnableSNI" :flattened? false :xmlAttribute? nil), "MeasureLatency" (portkey.aws/search-for-tag input "MeasureLatency" :flattened? false :xmlAttribute? nil), "HealthThreshold" (portkey.aws/search-for-tag input "HealthThreshold" :flattened? false :xmlAttribute? nil), "RequestInterval" (portkey.aws/search-for-tag input "RequestInterval" :flattened? false :xmlAttribute? nil), "FullyQualifiedDomainName" (portkey.aws/search-for-tag input "FullyQualifiedDomainName" :flattened? false :xmlAttribute? nil), "Inverted" (portkey.aws/search-for-tag input "Inverted" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-health-check-type (clojure.core/get-in letvar179627 ["Type" :content]))} (letvar179627 "InsufficientDataHealthStatus") (clojure.core/assoc :insufficient-data-health-status (deser-insufficient-data-health-status (clojure.core/get-in letvar179627 ["InsufficientDataHealthStatus" :content]))) (letvar179627 "Disabled") (clojure.core/assoc :disabled (deser-disabled (clojure.core/get-in letvar179627 ["Disabled" :content]))) (letvar179627 "SearchString") (clojure.core/assoc :search-string (deser-search-string (clojure.core/get-in letvar179627 ["SearchString" :content]))) (letvar179627 "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (clojure.core/get-in letvar179627 ["FailureThreshold" :content]))) (letvar179627 "ChildHealthChecks") (clojure.core/assoc :child-health-checks (deser-child-health-check-list (clojure.core/get-in letvar179627 ["ChildHealthChecks" :content]))) (letvar179627 "Regions") (clojure.core/assoc :regions (deser-health-check-region-list (clojure.core/get-in letvar179627 ["Regions" :content]))) (letvar179627 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar179627 ["Port" :content]))) (letvar179627 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar179627 ["IPAddress" :content]))) (letvar179627 "ResourcePath") (clojure.core/assoc :resource-path (deser-resource-path (clojure.core/get-in letvar179627 ["ResourcePath" :content]))) (letvar179627 "AlarmIdentifier") (clojure.core/assoc :alarm-identifier (deser-alarm-identifier (clojure.core/get-in letvar179627 ["AlarmIdentifier" :content]))) (letvar179627 "EnableSNI") (clojure.core/assoc :enable-sni (deser-enable-sni (clojure.core/get-in letvar179627 ["EnableSNI" :content]))) (letvar179627 "MeasureLatency") (clojure.core/assoc :measure-latency (deser-measure-latency (clojure.core/get-in letvar179627 ["MeasureLatency" :content]))) (letvar179627 "HealthThreshold") (clojure.core/assoc :health-threshold (deser-health-threshold (clojure.core/get-in letvar179627 ["HealthThreshold" :content]))) (letvar179627 "RequestInterval") (clojure.core/assoc :request-interval (deser-request-interval (clojure.core/get-in letvar179627 ["RequestInterval" :content]))) (letvar179627 "FullyQualifiedDomainName") (clojure.core/assoc :fully-qualified-domain-name (deser-fully-qualified-domain-name (clojure.core/get-in letvar179627 ["FullyQualifiedDomainName" :content]))) (letvar179627 "Inverted") (clojure.core/assoc :inverted (deser-inverted (clojure.core/get-in letvar179627 ["Inverted" :content]))))))

(clojure.core/defn- deser-change-info [input] (clojure.core/let [letvar179807 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "SubmittedAt" (portkey.aws/search-for-tag input "SubmittedAt" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar179807 ["Id" :content])), :status (deser-change-status (clojure.core/get-in letvar179807 ["Status" :content])), :submitted-at (deser-time-stamp (clojure.core/get-in letvar179807 ["SubmittedAt" :content]))} (letvar179807 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar179807 ["Comment" :content]))))))

(clojure.core/defn- deser-dimension-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension coll))) input))

(clojure.core/defn- deser-status [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-service-principal [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-version [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-geo-location-details [input] (clojure.core/let [letvar180081 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "ContinentName" (portkey.aws/search-for-tag input "ContinentName" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "CountryName" (portkey.aws/search-for-tag input "CountryName" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil), "SubdivisionName" (portkey.aws/search-for-tag input "SubdivisionName" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar180081 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar180081 ["ContinentCode" :content]))) (letvar180081 "ContinentName") (clojure.core/assoc :continent-name (deser-geo-location-continent-name (clojure.core/get-in letvar180081 ["ContinentName" :content]))) (letvar180081 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar180081 ["CountryCode" :content]))) (letvar180081 "CountryName") (clojure.core/assoc :country-name (deser-geo-location-country-name (clojure.core/get-in letvar180081 ["CountryName" :content]))) (letvar180081 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar180081 ["SubdivisionCode" :content]))) (letvar180081 "SubdivisionName") (clojure.core/assoc :subdivision-name (deser-geo-location-subdivision-name (clojure.core/get-in letvar180081 ["SubdivisionName" :content]))))))

(clojure.core/defn- deser-change-status [input] (clojure.core/get {"PENDING" :pending, "INSYNC" :insync} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-dnsr-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-state [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-ttl [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-set-weight [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-tag-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag-set coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-hosted-zone-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-record-data-entry [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-observation [input] (clojure.core/let [letvar180447 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "StatusReport" (portkey.aws/search-for-tag input "StatusReport" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar180447 "Region") (clojure.core/assoc :region (deser-health-check-region (clojure.core/get-in letvar180447 ["Region" :content]))) (letvar180447 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar180447 ["IPAddress" :content]))) (letvar180447 "StatusReport") (clojure.core/assoc :status-report (deser-status-report (clojure.core/get-in letvar180447 ["StatusReport" :content]))))))

(clojure.core/defn- deser-health-check-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dns-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-query-logging-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-logging-config coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit [input] (clojure.core/let [letvar180699 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-reusable-delegation-set-limit-type (clojure.core/get-in letvar180699 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar180699 ["Value" :content]))})))

(clojure.core/defn- deser-resource-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record coll))) input))
