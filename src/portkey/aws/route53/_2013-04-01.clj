(ns portkey.aws.route53.-2013-04-01 (:require [portkey.aws]))

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

(clojure.core/defn- ser-alias-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-id (:hosted-zone-id input)) #:http.request.field{:name "HostedZoneId", :shape "ResourceId"}) (clojure.core/into (ser-dns-name (:dns-name input)) #:http.request.field{:name "DNSName", :shape "DNSName"}) (clojure.core/into (ser-alias-health-enabled (:evaluate-target-health input)) #:http.request.field{:name "EvaluateTargetHealth", :shape "AliasHealthEnabled"})], :shape "AliasTarget", :type "structure"}))

(clojure.core/defn- ser-account-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HEALTH_CHECKS_BY_OWNER" "MAX_HEALTH_CHECKS_BY_OWNER", "MAX_TRAFFIC_POLICIES_BY_OWNER" "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-hosted-zones-by-owner "MAX_HOSTED_ZONES_BY_OWNER", :max-reusable-delegation-sets-by-owner "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER", :max-traffic-policies-by-owner "MAX_TRAFFIC_POLICIES_BY_OWNER", :max-traffic-policy-instances-by-owner "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER", "MAX_HOSTED_ZONES_BY_OWNER" "MAX_HOSTED_ZONES_BY_OWNER", :max-health-checks-by-owner "MAX_HEALTH_CHECKS_BY_OWNER"} input), :shape "AccountLimitType"})

(clojure.core/defn- ser-geo-location-country-code [input] #:http.request.field{:value input, :shape "GeoLocationCountryCode"})

(clojure.core/defn- ser-traffic-policy-version-marker [input] #:http.request.field{:value input, :shape "TrafficPolicyVersionMarker"})

(clojure.core/defn- ser-subnet-mask [input] #:http.request.field{:value input, :shape "SubnetMask"})

(clojure.core/defn- ser-associate-vpc-comment [input] #:http.request.field{:value input, :shape "AssociateVPCComment"})

(clojure.core/defn- ser-resource-description [input] #:http.request.field{:value input, :shape "ResourceDescription"})

(clojure.core/defn- ser-change-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-changes (:changes input)) #:http.request.field{:name "Changes", :shape "Changes"})], :shape "ChangeBatch", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"}))))

(clojure.core/defn- ser-resource-record-set-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "cn-northwest-1" "cn-northwest-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cnnorthwest-1 "cn-northwest-1", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2", "eu-north-1" "eu-north-1", :eunorth-1 "eu-north-1"} input), :shape "ResourceRecordSetRegion"})

(clojure.core/defn- ser-traffic-policy-name [input] #:http.request.field{:value input, :shape "TrafficPolicyName"})

(clojure.core/defn- ser-vpc-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2", "eu-north-1" "eu-north-1", :eunorth-1 "eu-north-1"} input), :shape "VPCRegion"})

(clojure.core/defn- ser-health-check-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :useast-1 "us-east-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :uswest-1 "us-west-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2"} input), :shape "HealthCheckRegion"})

(clojure.core/defn- ser-geo-location-continent-code [input] #:http.request.field{:value input, :shape "GeoLocationContinentCode"})

(clojure.core/defn- ser-health-check-version [input] #:http.request.field{:value input, :shape "HealthCheckVersion"})

(clojure.core/defn- ser-failure-threshold [input] #:http.request.field{:value input, :shape "FailureThreshold"})

(clojure.core/defn- ser-change-action [input] #:http.request.field{:value (clojure.core/get {"CREATE" "CREATE", :create "CREATE", "DELETE" "DELETE", :delete "DELETE", "UPSERT" "UPSERT", :upsert "UPSERT"} input), :shape "ChangeAction"})

(clojure.core/defn- ser-child-health-check-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-health-check-id coll) #:http.request.field{:shape "HealthCheckId", :location-name "ChildHealthCheck"}))) input), :shape "ChildHealthCheckList", :type "list", :max 256})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-change coll) #:http.request.field{:shape "Change", :location-name "Change"}))) input), :shape "Changes", :type "list", :min 1})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-health-check-region-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-health-check-region coll) #:http.request.field{:shape "HealthCheckRegion", :location-name "Region"}))) input), :shape "HealthCheckRegionList", :type "list", :max 64, :min 3})

(clojure.core/defn- ser-reusable-delegation-set-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" "MAX_ZONES_BY_REUSABLE_DELEGATION_SET", :max-zones-by-reusable-delegation-set "MAX_ZONES_BY_REUSABLE_DELEGATION_SET"} input), :shape "ReusableDelegationSetLimitType"})

(clojure.core/defn- ser-tag-resource-id [input] #:http.request.field{:value input, :shape "TagResourceId"})

(clojure.core/defn- ser-geo-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GeoLocation", :type "structure"} (clojure.core/contains? input :continent-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-continent-code (input :continent-code)) #:http.request.field{:name "ContinentCode", :shape "GeoLocationContinentCode"})) (clojure.core/contains? input :country-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-country-code (input :country-code)) #:http.request.field{:name "CountryCode", :shape "GeoLocationCountryCode"})) (clojure.core/contains? input :subdivision-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location-subdivision-code (input :subdivision-code)) #:http.request.field{:name "SubdivisionCode", :shape "GeoLocationSubdivisionCode"}))))

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-type (:type input)) #:http.request.field{:name "Type", :shape "HealthCheckType"})], :shape "HealthCheckConfig", :type "structure"} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :disabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disabled (input :disabled)) #:http.request.field{:name "Disabled", :shape "Disabled"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :measure-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-measure-latency (input :measure-latency)) #:http.request.field{:name "MeasureLatency", :shape "MeasureLatency"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :request-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-interval (input :request-interval)) #:http.request.field{:name "RequestInterval", :shape "RequestInterval"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

(clojure.core/defn- ser-traffic-policy-version [input] #:http.request.field{:value input, :shape "TrafficPolicyVersion"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-ttl [input] #:http.request.field{:value input, :shape "TTL"})

(clojure.core/defn- ser-resettable-element-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resettable-element-name coll) #:http.request.field{:shape "ResettableElementName", :location-name "ResettableElementName"}))) input), :shape "ResettableElementNameList", :type "list", :max 64})

(clojure.core/defn- ser-resource-record-set-weight [input] #:http.request.field{:value input, :shape "ResourceRecordSetWeight"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list", :max 10, :min 1})

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

(clojure.core/defn- ser-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-change-action (:action input)) #:http.request.field{:name "Action", :shape "ChangeAction"}) (clojure.core/into (ser-resource-record-set (:resource-record-set input)) #:http.request.field{:name "ResourceRecordSet", :shape "ResourceRecordSet"})], :shape "Change", :type "structure"}))

(clojure.core/defn- ser-traffic-policy-instance-id [input] #:http.request.field{:value input, :shape "TrafficPolicyInstanceId"})

(clojure.core/defn- ser-resettable-element-name [input] #:http.request.field{:value (clojure.core/get {"FullyQualifiedDomainName" "FullyQualifiedDomainName", :fully-qualified-domain-name "FullyQualifiedDomainName", "Regions" "Regions", :regions "Regions", "ResourcePath" "ResourcePath", :resource-path "ResourcePath", "ChildHealthChecks" "ChildHealthChecks", :child-health-checks "ChildHealthChecks"} input), :shape "ResettableElementName"})

(clojure.core/defn- ser-resource-record [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-r-data (:value input)) #:http.request.field{:name "Value", :shape "RData"})], :shape "ResourceRecord", :type "structure"}))

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-hosted-zone-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HostedZoneConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-description (input :comment)) #:http.request.field{:name "Comment", :shape "ResourceDescription"})) (clojure.core/contains? input :private-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-is-private-zone (input :private-zone)) #:http.request.field{:name "PrivateZone", :shape "IsPrivateZone"}))))

(clojure.core/defn- ser-hosted-zone-limit-type [input] #:http.request.field{:value (clojure.core/get {"MAX_RRSETS_BY_ZONE" "MAX_RRSETS_BY_ZONE", :max-rrsets-by-zone "MAX_RRSETS_BY_ZONE", "MAX_VPCS_ASSOCIATED_BY_ZONE" "MAX_VPCS_ASSOCIATED_BY_ZONE", :max-vpcs-associated-by-zone "MAX_VPCS_ASSOCIATED_BY_ZONE"} input), :shape "HostedZoneLimitType"})

(clojure.core/defn- ser-resource-path [input] #:http.request.field{:value input, :shape "ResourcePath"})

(clojure.core/defn- ser-alarm-identifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-region (:region input)) #:http.request.field{:name "Region", :shape "CloudWatchRegion"}) (clojure.core/into (ser-alarm-name (:name input)) #:http.request.field{:name "Name", :shape "AlarmName"})], :shape "AlarmIdentifier", :type "structure"}))

(clojure.core/defn- ser-is-private-zone [input] #:http.request.field{:value input, :shape "IsPrivateZone"})

(clojure.core/defn- ser-traffic-policy-comment [input] #:http.request.field{:value input, :shape "TrafficPolicyComment"})

(clojure.core/defn- ser-enable-sni [input] #:http.request.field{:value input, :shape "EnableSNI"})

(clojure.core/defn- ser-health-check-type [input] #:http.request.field{:value (clojure.core/get {:http-str-match "HTTP_STR_MATCH", :tcp "TCP", :calculated "CALCULATED", :https-str-match "HTTPS_STR_MATCH", "TCP" "TCP", "CALCULATED" "CALCULATED", "HTTP_STR_MATCH" "HTTP_STR_MATCH", "HTTPS_STR_MATCH" "HTTPS_STR_MATCH", "CLOUDWATCH_METRIC" "CLOUDWATCH_METRIC", "HTTPS" "HTTPS", :http "HTTP", :cloudwatch-metric "CLOUDWATCH_METRIC", "HTTP" "HTTP", :https "HTTPS"} input), :shape "HealthCheckType"})

(clojure.core/defn- ser-r-data [input] #:http.request.field{:value input, :shape "RData"})

(clojure.core/defn- ser-alias-health-enabled [input] #:http.request.field{:value input, :shape "AliasHealthEnabled"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-disassociate-vpc-comment [input] #:http.request.field{:value input, :shape "DisassociateVPCComment"})

(clojure.core/defn- ser-page-marker [input] #:http.request.field{:value input, :shape "PageMarker"})

(clojure.core/defn- ser-nonce [input] #:http.request.field{:value input, :shape "Nonce"})

(clojure.core/defn- ser-measure-latency [input] #:http.request.field{:value input, :shape "MeasureLatency"})

(clojure.core/defn- ser-health-threshold [input] #:http.request.field{:value input, :shape "HealthThreshold"})

(clojure.core/defn- ser-resource-record-set [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-dns-name (:name input)) #:http.request.field{:name "Name", :shape "DNSName"}) (clojure.core/into (ser-rr-type (:type input)) #:http.request.field{:name "Type", :shape "RRType"})], :shape "ResourceRecordSet", :type "structure"} (clojure.core/contains? input :alias-target) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-target (input :alias-target)) #:http.request.field{:name "AliasTarget", :shape "AliasTarget"})) (clojure.core/contains? input :geo-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-geo-location (input :geo-location)) #:http.request.field{:name "GeoLocation", :shape "GeoLocation"})) (clojure.core/contains? input :ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ttl (input :ttl)) #:http.request.field{:name "TTL", :shape "TTL"})) (clojure.core/contains? input :set-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-identifier (input :set-identifier)) #:http.request.field{:name "SetIdentifier", :shape "ResourceRecordSetIdentifier"})) (clojure.core/contains? input :weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-weight (input :weight)) #:http.request.field{:name "Weight", :shape "ResourceRecordSetWeight"})) (clojure.core/contains? input :health-check-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId"})) (clojure.core/contains? input :multi-value-answer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-multi-value-answer (input :multi-value-answer)) #:http.request.field{:name "MultiValueAnswer", :shape "ResourceRecordSetMultiValueAnswer"})) (clojure.core/contains? input :resource-records) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-records (input :resource-records)) #:http.request.field{:name "ResourceRecords", :shape "ResourceRecords"})) (clojure.core/contains? input :failover) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-failover (input :failover)) #:http.request.field{:name "Failover", :shape "ResourceRecordSetFailover"})) (clojure.core/contains? input :traffic-policy-instance-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-policy-instance-id (input :traffic-policy-instance-id)) #:http.request.field{:name "TrafficPolicyInstanceId", :shape "TrafficPolicyInstanceId"})) (clojure.core/contains? input :region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-record-set-region (input :region)) #:http.request.field{:name "Region", :shape "ResourceRecordSetRegion"}))))

(clojure.core/defn- ser-vpc-id [input] #:http.request.field{:value input, :shape "VPCId"})

(clojure.core/defn- ser-tag-resource-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-resource-id coll) #:http.request.field{:shape "TagResourceId", :location-name "ResourceId"}))) input), :shape "TagResourceIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-request-interval [input] #:http.request.field{:value input, :shape "RequestInterval"})

(clojure.core/defn- ser-fully-qualified-domain-name [input] #:http.request.field{:value input, :shape "FullyQualifiedDomainName"})

(clojure.core/defn- ser-vpc [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VPC", :type "structure"} (clojure.core/contains? input :vpc-region) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-region (input :vpc-region)) #:http.request.field{:name "VPCRegion", :shape "VPCRegion"})) (clojure.core/contains? input :vpc-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-id (input :vpc-id)) #:http.request.field{:name "VPCId", :shape "VPCId"}))))

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

(clojure.core/defn- deser-insufficient-data-health-status [input] (clojure.core/get {"Healthy" :healthy, "Unhealthy" :unhealthy, "LastKnownStatus" :last-known-status} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-tag-resource-type [input] (clojure.core/get {"healthcheck" :healthcheck, "hostedzone" :hostedzone} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-geo-location-subdivision-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check [input] (clojure.core/let [letvar1582455 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? nil :xmlAttribute? nil), "HealthCheckConfig" (portkey.aws/search-for-tag input "HealthCheckConfig" :flattened? nil :xmlAttribute? nil), "HealthCheckVersion" (portkey.aws/search-for-tag input "HealthCheckVersion" :flattened? nil :xmlAttribute? nil), "CloudWatchAlarmConfiguration" (portkey.aws/search-for-tag input "CloudWatchAlarmConfiguration" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-health-check-id (clojure.core/get-in letvar1582455 ["Id" :content])), :caller-reference (deser-health-check-nonce (clojure.core/get-in letvar1582455 ["CallerReference" :content])), :health-check-config (deser-health-check-config (clojure.core/get-in letvar1582455 ["HealthCheckConfig" :content])), :health-check-version (deser-health-check-version (clojure.core/get-in letvar1582455 ["HealthCheckVersion" :content]))} (letvar1582455 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar1582455 ["LinkedService" :content]))) (letvar1582455 "CloudWatchAlarmConfiguration") (clojure.core/assoc :cloud-watch-alarm-configuration (deser-cloud-watch-alarm-configuration (clojure.core/get-in letvar1582455 ["CloudWatchAlarmConfiguration" :content]))))))

(clojure.core/defn- deser-disabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-delegation-set-name-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dns-name coll))) input))

(clojure.core/defn- deser-health-check-nonce [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-instance-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-search-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-hosted-zone-rr-set-count [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-tag-set [input] (clojure.core/let [letvar1582596 {"ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "ResourceId" (portkey.aws/search-for-tag input "ResourceId" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1582596 "ResourceType") (clojure.core/assoc :resource-type (deser-tag-resource-type (clojure.core/get-in letvar1582596 ["ResourceType" :content]))) (letvar1582596 "ResourceId") (clojure.core/assoc :resource-id (deser-tag-resource-id (clojure.core/get-in letvar1582596 ["ResourceId" :content]))) (letvar1582596 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1582596 ["Tags" :content]))))))

(clojure.core/defn- deser-rr-type [input] (clojure.core/get {"CAA" :caa, "CNAME" :cname, "TXT" :txt, "SRV" :srv, "AAAA" :aaaa, "NS" :ns, "PTR" :ptr, "NAPTR" :naptr, "A" :a, "SPF" :spf, "SOA" :soa, "MX" :mx} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-watch-logs-log-group-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-alias-target [input] (clojure.core/let [letvar1582714 {"HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? nil :xmlAttribute? nil), "DNSName" (portkey.aws/search-for-tag input "DNSName" :flattened? nil :xmlAttribute? nil), "EvaluateTargetHealth" (portkey.aws/search-for-tag input "EvaluateTargetHealth" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1582714 ["HostedZoneId" :content])), :dns-name (deser-dns-name (clojure.core/get-in letvar1582714 ["DNSName" :content])), :evaluate-target-health (deser-alias-health-enabled (clojure.core/get-in letvar1582714 ["EvaluateTargetHealth" :content]))})))

(clojure.core/defn- deser-account-limit-type [input] (clojure.core/get {"MAX_HEALTH_CHECKS_BY_OWNER" :max-health-checks-by-owner, "MAX_HOSTED_ZONES_BY_OWNER" :max-hosted-zones-by-owner, "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" :max-traffic-policy-instances-by-owner, "MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" :max-reusable-delegation-sets-by-owner, "MAX_TRAFFIC_POLICIES_BY_OWNER" :max-traffic-policies-by-owner} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-geo-location-country-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-version-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-summary coll))) input))

(clojure.core/defn- deser-period [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-delegation-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delegation-set coll))) input))

(clojure.core/defn- deser-threshold [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dimension-field [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-nameserver [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-record-set-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "cn-northwest-1" :cnnorthwest-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1, "eu-north-1" :eunorth-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-traffic-policy-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy [input] (clojure.core/let [letvar1582900 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Document" (portkey.aws/search-for-tag input "Document" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar1582900 ["Id" :content])), :version (deser-traffic-policy-version (clojure.core/get-in letvar1582900 ["Version" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar1582900 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar1582900 ["Type" :content])), :document (deser-traffic-policy-document (clojure.core/get-in letvar1582900 ["Document" :content]))} (letvar1582900 "Comment") (clojure.core/assoc :comment (deser-traffic-policy-comment (clojure.core/get-in letvar1582900 ["Comment" :content]))))))

(clojure.core/defn- deser-vpc-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1, "eu-north-1" :eunorth-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-health-checks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check coll))) input))

(clojure.core/defn- deser-health-check-region [input] (clojure.core/get {"us-east-1" :useast-1, "us-west-1" :uswest-1, "us-west-2" :uswest-2, "eu-west-1" :euwest-1, "ap-southeast-1" :apsoutheast-1, "ap-southeast-2" :apsoutheast-2, "ap-northeast-1" :apnortheast-1, "sa-east-1" :saeast-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-geo-location-continent-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-version [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-error-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-message coll))) input))

(clojure.core/defn- deser-failure-threshold [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-child-health-check-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-id coll))) input))

(clojure.core/defn- deser-checker-ip-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address-cidr coll))) input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dimension [input] (clojure.core/let [letvar1583100 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dimension-field (clojure.core/get-in letvar1583100 ["Name" :content])), :value (deser-dimension-field (clojure.core/get-in letvar1583100 ["Value" :content]))})))

(clojure.core/defn- deser-vp-cs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc coll))) input))

(clojure.core/defn- deser-pagination-token [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-linked-service [input] (clojure.core/let [letvar1583235 {"ServicePrincipal" (portkey.aws/search-for-tag input "ServicePrincipal" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1583235 "ServicePrincipal") (clojure.core/assoc :service-principal (deser-service-principal (clojure.core/get-in letvar1583235 ["ServicePrincipal" :content]))) (letvar1583235 "Description") (clojure.core/assoc :description (deser-resource-description (clojure.core/get-in letvar1583235 ["Description" :content]))))))

(clojure.core/defn- deser-health-check-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-region coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit-type [input] (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-geo-location-continent-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-count [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-hosted-zone [input] (clojure.core/let [letvar1583372 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Config" (portkey.aws/search-for-tag input "Config" :flattened? nil :xmlAttribute? nil), "ResourceRecordSetCount" (portkey.aws/search-for-tag input "ResourceRecordSetCount" :flattened? nil :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar1583372 ["Id" :content])), :name (deser-dns-name (clojure.core/get-in letvar1583372 ["Name" :content])), :caller-reference (deser-nonce (clojure.core/get-in letvar1583372 ["CallerReference" :content]))} (letvar1583372 "Config") (clojure.core/assoc :config (deser-hosted-zone-config (clojure.core/get-in letvar1583372 ["Config" :content]))) (letvar1583372 "ResourceRecordSetCount") (clojure.core/assoc :resource-record-set-count (deser-hosted-zone-rr-set-count (clojure.core/get-in letvar1583372 ["ResourceRecordSetCount" :content]))) (letvar1583372 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar1583372 ["LinkedService" :content]))))))

(clojure.core/defn- deser-tag-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-instance coll))) input))

(clojure.core/defn- deser-page-truncated [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-geo-location [input] (clojure.core/let [letvar1583504 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? nil :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? nil :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1583504 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar1583504 ["ContinentCode" :content]))) (letvar1583504 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar1583504 ["CountryCode" :content]))) (letvar1583504 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar1583504 ["SubdivisionCode" :content]))))))

(clojure.core/defn- deser-ip-address-cidr [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-config [input] (clojure.core/let [letvar1583617 {"InsufficientDataHealthStatus" (portkey.aws/search-for-tag input "InsufficientDataHealthStatus" :flattened? nil :xmlAttribute? nil), "Disabled" (portkey.aws/search-for-tag input "Disabled" :flattened? nil :xmlAttribute? nil), "SearchString" (portkey.aws/search-for-tag input "SearchString" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "FailureThreshold" (portkey.aws/search-for-tag input "FailureThreshold" :flattened? nil :xmlAttribute? nil), "ChildHealthChecks" (portkey.aws/search-for-tag input "ChildHealthChecks" :flattened? nil :xmlAttribute? nil), "Regions" (portkey.aws/search-for-tag input "Regions" :flattened? nil :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? nil :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? nil :xmlAttribute? nil), "ResourcePath" (portkey.aws/search-for-tag input "ResourcePath" :flattened? nil :xmlAttribute? nil), "AlarmIdentifier" (portkey.aws/search-for-tag input "AlarmIdentifier" :flattened? nil :xmlAttribute? nil), "EnableSNI" (portkey.aws/search-for-tag input "EnableSNI" :flattened? nil :xmlAttribute? nil), "MeasureLatency" (portkey.aws/search-for-tag input "MeasureLatency" :flattened? nil :xmlAttribute? nil), "HealthThreshold" (portkey.aws/search-for-tag input "HealthThreshold" :flattened? nil :xmlAttribute? nil), "RequestInterval" (portkey.aws/search-for-tag input "RequestInterval" :flattened? nil :xmlAttribute? nil), "FullyQualifiedDomainName" (portkey.aws/search-for-tag input "FullyQualifiedDomainName" :flattened? nil :xmlAttribute? nil), "Inverted" (portkey.aws/search-for-tag input "Inverted" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-health-check-type (clojure.core/get-in letvar1583617 ["Type" :content]))} (letvar1583617 "InsufficientDataHealthStatus") (clojure.core/assoc :insufficient-data-health-status (deser-insufficient-data-health-status (clojure.core/get-in letvar1583617 ["InsufficientDataHealthStatus" :content]))) (letvar1583617 "Disabled") (clojure.core/assoc :disabled (deser-disabled (clojure.core/get-in letvar1583617 ["Disabled" :content]))) (letvar1583617 "SearchString") (clojure.core/assoc :search-string (deser-search-string (clojure.core/get-in letvar1583617 ["SearchString" :content]))) (letvar1583617 "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (clojure.core/get-in letvar1583617 ["FailureThreshold" :content]))) (letvar1583617 "ChildHealthChecks") (clojure.core/assoc :child-health-checks (deser-child-health-check-list (clojure.core/get-in letvar1583617 ["ChildHealthChecks" :content]))) (letvar1583617 "Regions") (clojure.core/assoc :regions (deser-health-check-region-list (clojure.core/get-in letvar1583617 ["Regions" :content]))) (letvar1583617 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar1583617 ["Port" :content]))) (letvar1583617 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar1583617 ["IPAddress" :content]))) (letvar1583617 "ResourcePath") (clojure.core/assoc :resource-path (deser-resource-path (clojure.core/get-in letvar1583617 ["ResourcePath" :content]))) (letvar1583617 "AlarmIdentifier") (clojure.core/assoc :alarm-identifier (deser-alarm-identifier (clojure.core/get-in letvar1583617 ["AlarmIdentifier" :content]))) (letvar1583617 "EnableSNI") (clojure.core/assoc :enable-sni (deser-enable-sni (clojure.core/get-in letvar1583617 ["EnableSNI" :content]))) (letvar1583617 "MeasureLatency") (clojure.core/assoc :measure-latency (deser-measure-latency (clojure.core/get-in letvar1583617 ["MeasureLatency" :content]))) (letvar1583617 "HealthThreshold") (clojure.core/assoc :health-threshold (deser-health-threshold (clojure.core/get-in letvar1583617 ["HealthThreshold" :content]))) (letvar1583617 "RequestInterval") (clojure.core/assoc :request-interval (deser-request-interval (clojure.core/get-in letvar1583617 ["RequestInterval" :content]))) (letvar1583617 "FullyQualifiedDomainName") (clojure.core/assoc :fully-qualified-domain-name (deser-fully-qualified-domain-name (clojure.core/get-in letvar1583617 ["FullyQualifiedDomainName" :content]))) (letvar1583617 "Inverted") (clojure.core/assoc :inverted (deser-inverted (clojure.core/get-in letvar1583617 ["Inverted" :content]))))))

(clojure.core/defn- deser-change-info [input] (clojure.core/let [letvar1583725 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "SubmittedAt" (portkey.aws/search-for-tag input "SubmittedAt" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar1583725 ["Id" :content])), :status (deser-change-status (clojure.core/get-in letvar1583725 ["Status" :content])), :submitted-at (deser-time-stamp (clojure.core/get-in letvar1583725 ["SubmittedAt" :content]))} (letvar1583725 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar1583725 ["Comment" :content]))))))

(clojure.core/defn- deser-dimension-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension coll))) input))

(clojure.core/defn- deser-status [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-service-principal [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-version [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-geo-location-details [input] (clojure.core/let [letvar1583867 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? nil :xmlAttribute? nil), "ContinentName" (portkey.aws/search-for-tag input "ContinentName" :flattened? nil :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? nil :xmlAttribute? nil), "CountryName" (portkey.aws/search-for-tag input "CountryName" :flattened? nil :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? nil :xmlAttribute? nil), "SubdivisionName" (portkey.aws/search-for-tag input "SubdivisionName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1583867 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar1583867 ["ContinentCode" :content]))) (letvar1583867 "ContinentName") (clojure.core/assoc :continent-name (deser-geo-location-continent-name (clojure.core/get-in letvar1583867 ["ContinentName" :content]))) (letvar1583867 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar1583867 ["CountryCode" :content]))) (letvar1583867 "CountryName") (clojure.core/assoc :country-name (deser-geo-location-country-name (clojure.core/get-in letvar1583867 ["CountryName" :content]))) (letvar1583867 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar1583867 ["SubdivisionCode" :content]))) (letvar1583867 "SubdivisionName") (clojure.core/assoc :subdivision-name (deser-geo-location-subdivision-name (clojure.core/get-in letvar1583867 ["SubdivisionName" :content]))))))

(clojure.core/defn- deser-change-status [input] (clojure.core/get {"PENDING" :pending, "INSYNC" :insync} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-dnsr-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-instance-state [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ttl [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-record-set-weight [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-tag-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-tag-set coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-hosted-zone-count [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-record-data-entry [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-observation [input] (clojure.core/let [letvar1584040 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? nil :xmlAttribute? nil), "StatusReport" (portkey.aws/search-for-tag input "StatusReport" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1584040 "Region") (clojure.core/assoc :region (deser-health-check-region (clojure.core/get-in letvar1584040 ["Region" :content]))) (letvar1584040 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar1584040 ["IPAddress" :content]))) (letvar1584040 "StatusReport") (clojure.core/assoc :status-report (deser-status-report (clojure.core/get-in letvar1584040 ["StatusReport" :content]))))))

(clojure.core/defn- deser-health-check-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-dns-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-query-logging-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-logging-config coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit [input] (clojure.core/let [letvar1584175 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-reusable-delegation-set-limit-type (clojure.core/get-in letvar1584175 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar1584175 ["Value" :content]))})))

(clojure.core/defn- deser-resource-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record coll))) input))

(clojure.core/defn- deser-traffic-policy-document [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-uri [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-hosted-zone-limit [input] (clojure.core/let [letvar1584315 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-hosted-zone-limit-type (clojure.core/get-in letvar1584315 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar1584315 ["Value" :content]))})))

(clojure.core/defn- deser-account-limit [input] (clojure.core/let [letvar1584423 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-account-limit-type (clojure.core/get-in letvar1584423 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar1584423 ["Value" :content]))})))

(clojure.core/defn- deser-query-logging-config-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-query-logging-config [input] (clojure.core/let [letvar1584536 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? nil :xmlAttribute? nil), "CloudWatchLogsLogGroupArn" (portkey.aws/search-for-tag input "CloudWatchLogsLogGroupArn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-query-logging-config-id (clojure.core/get-in letvar1584536 ["Id" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1584536 ["HostedZoneId" :content])), :cloud-watch-logs-log-group-arn (deser-cloud-watch-logs-log-group-arn (clojure.core/get-in letvar1584536 ["CloudWatchLogsLogGroupArn" :content]))})))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-delegation-set [input] (clojure.core/let [letvar1584649 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "NameServers" (portkey.aws/search-for-tag input "NameServers" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name-servers (deser-delegation-set-name-servers (clojure.core/get-in letvar1584649 ["NameServers" :content]))} (letvar1584649 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar1584649 ["Id" :content]))) (letvar1584649 "CallerReference") (clojure.core/assoc :caller-reference (deser-nonce (clojure.core/get-in letvar1584649 ["CallerReference" :content]))))))

(clojure.core/defn- deser-resource-record-set-multi-value-answer [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-port [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-record-set-identifier [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-record-set-failover [input] (clojure.core/get {"PRIMARY" :primary, "SECONDARY" :secondary} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-geo-location-subdivision-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ip-address [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policy-summary [input] (clojure.core/let [letvar1584796 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "LatestVersion" (portkey.aws/search-for-tag input "LatestVersion" :flattened? nil :xmlAttribute? nil), "TrafficPolicyCount" (portkey.aws/search-for-tag input "TrafficPolicyCount" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar1584796 ["Id" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar1584796 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar1584796 ["Type" :content])), :latest-version (deser-traffic-policy-version (clojure.core/get-in letvar1584796 ["LatestVersion" :content])), :traffic-policy-count (deser-traffic-policy-version (clojure.core/get-in letvar1584796 ["TrafficPolicyCount" :content]))})))

(clojure.core/defn- deser-traffic-policy-instance [input] (clojure.core/let [letvar1584904 {"TrafficPolicyVersion" (portkey.aws/search-for-tag input "TrafficPolicyVersion" :flattened? nil :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? nil :xmlAttribute? nil), "TrafficPolicyType" (portkey.aws/search-for-tag input "TrafficPolicyType" :flattened? nil :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? nil :xmlAttribute? nil), "TrafficPolicyId" (portkey.aws/search-for-tag input "TrafficPolicyId" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar1584904 ["Name" :content])), :traffic-policy-version (deser-traffic-policy-version (clojure.core/get-in letvar1584904 ["TrafficPolicyVersion" :content])), :traffic-policy-id (deser-traffic-policy-id (clojure.core/get-in letvar1584904 ["TrafficPolicyId" :content])), :state (deser-traffic-policy-instance-state (clojure.core/get-in letvar1584904 ["State" :content])), :traffic-policy-type (deser-rr-type (clojure.core/get-in letvar1584904 ["TrafficPolicyType" :content])), :ttl (deser-ttl (clojure.core/get-in letvar1584904 ["TTL" :content])), :id (deser-traffic-policy-instance-id (clojure.core/get-in letvar1584904 ["Id" :content])), :message (deser-message (clojure.core/get-in letvar1584904 ["Message" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1584904 ["HostedZoneId" :content]))})))

(clojure.core/defn- deser-geo-location-country-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-record [input] (clojure.core/let [letvar1585017 {"Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:value (deser-r-data (clojure.core/get-in letvar1585017 ["Value" :content]))})))

(clojure.core/defn- deser-alarm-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-usage-count [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-hosted-zone-config [input] (clojure.core/let [letvar1585132 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "PrivateZone" (portkey.aws/search-for-tag input "PrivateZone" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1585132 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar1585132 ["Comment" :content]))) (letvar1585132 "PrivateZone") (clojure.core/assoc :private-zone (deser-is-private-zone (clojure.core/get-in letvar1585132 ["PrivateZone" :content]))))))

(clojure.core/defn- deser-hosted-zone-limit-type [input] (clojure.core/get {"MAX_RRSETS_BY_ZONE" :max-rrsets-by-zone, "MAX_VPCS_ASSOCIATED_BY_ZONE" :max-vpcs-associated-by-zone} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-path [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-traffic-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy coll))) input))

(clojure.core/defn- deser-geo-location-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-geo-location-details coll))) input))

(clojure.core/defn- deser-alarm-identifier [input] (clojure.core/let [letvar1585284 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:region (deser-cloud-watch-region (clojure.core/get-in letvar1585284 ["Region" :content])), :name (deser-alarm-name (clojure.core/get-in letvar1585284 ["Name" :content]))})))

(clojure.core/defn- deser-is-private-zone [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-traffic-policy-comment [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-enable-sni [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-health-check-type [input] (clojure.core/get {"HTTP" :http, "HTTPS" :https, "HTTP_STR_MATCH" :http-str-match, "HTTPS_STR_MATCH" :https-str-match, "TCP" :tcp, "CALCULATED" :calculated, "CLOUDWATCH_METRIC" :cloudwatch-metric} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-record-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-data-entry coll))) input))

(clojure.core/defn- deser-r-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-alias-health-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-health-check-observations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-observation coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar1585447 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1585447 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar1585447 ["Key" :content]))) (letvar1585447 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar1585447 ["Value" :content]))))))

(clojure.core/defn- deser-page-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-nonce [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-measure-latency [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-transport-protocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-hosted-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hosted-zone coll))) input))

(clojure.core/defn- deser-evaluation-periods [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-record-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record-set coll))) input))

(clojure.core/defn- deser-health-threshold [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-resource-record-set [input] (clojure.core/let [letvar1585615 {"AliasTarget" (portkey.aws/search-for-tag input "AliasTarget" :flattened? nil :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? nil :xmlAttribute? nil), "GeoLocation" (portkey.aws/search-for-tag input "GeoLocation" :flattened? nil :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? nil :xmlAttribute? nil), "SetIdentifier" (portkey.aws/search-for-tag input "SetIdentifier" :flattened? nil :xmlAttribute? nil), "Weight" (portkey.aws/search-for-tag input "Weight" :flattened? nil :xmlAttribute? nil), "HealthCheckId" (portkey.aws/search-for-tag input "HealthCheckId" :flattened? nil :xmlAttribute? nil), "MultiValueAnswer" (portkey.aws/search-for-tag input "MultiValueAnswer" :flattened? nil :xmlAttribute? nil), "ResourceRecords" (portkey.aws/search-for-tag input "ResourceRecords" :flattened? nil :xmlAttribute? nil), "Failover" (portkey.aws/search-for-tag input "Failover" :flattened? nil :xmlAttribute? nil), "TrafficPolicyInstanceId" (portkey.aws/search-for-tag input "TrafficPolicyInstanceId" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar1585615 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar1585615 ["Type" :content]))} (letvar1585615 "AliasTarget") (clojure.core/assoc :alias-target (deser-alias-target (clojure.core/get-in letvar1585615 ["AliasTarget" :content]))) (letvar1585615 "GeoLocation") (clojure.core/assoc :geo-location (deser-geo-location (clojure.core/get-in letvar1585615 ["GeoLocation" :content]))) (letvar1585615 "TTL") (clojure.core/assoc :ttl (deser-ttl (clojure.core/get-in letvar1585615 ["TTL" :content]))) (letvar1585615 "SetIdentifier") (clojure.core/assoc :set-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar1585615 ["SetIdentifier" :content]))) (letvar1585615 "Weight") (clojure.core/assoc :weight (deser-resource-record-set-weight (clojure.core/get-in letvar1585615 ["Weight" :content]))) (letvar1585615 "HealthCheckId") (clojure.core/assoc :health-check-id (deser-health-check-id (clojure.core/get-in letvar1585615 ["HealthCheckId" :content]))) (letvar1585615 "MultiValueAnswer") (clojure.core/assoc :multi-value-answer (deser-resource-record-set-multi-value-answer (clojure.core/get-in letvar1585615 ["MultiValueAnswer" :content]))) (letvar1585615 "ResourceRecords") (clojure.core/assoc :resource-records (deser-resource-records (clojure.core/get-in letvar1585615 ["ResourceRecords" :content]))) (letvar1585615 "Failover") (clojure.core/assoc :failover (deser-resource-record-set-failover (clojure.core/get-in letvar1585615 ["Failover" :content]))) (letvar1585615 "TrafficPolicyInstanceId") (clojure.core/assoc :traffic-policy-instance-id (deser-traffic-policy-instance-id (clojure.core/get-in letvar1585615 ["TrafficPolicyInstanceId" :content]))) (letvar1585615 "Region") (clojure.core/assoc :region (deser-resource-record-set-region (clojure.core/get-in letvar1585615 ["Region" :content]))))))

(clojure.core/defn- deser-vpc-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-request-interval [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-time-stamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cloud-watch-alarm-configuration [input] (clojure.core/let [letvar1585732 {"EvaluationPeriods" (portkey.aws/search-for-tag input "EvaluationPeriods" :flattened? nil :xmlAttribute? nil), "Threshold" (portkey.aws/search-for-tag input "Threshold" :flattened? nil :xmlAttribute? nil), "ComparisonOperator" (portkey.aws/search-for-tag input "ComparisonOperator" :flattened? nil :xmlAttribute? nil), "Period" (portkey.aws/search-for-tag input "Period" :flattened? nil :xmlAttribute? nil), "MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? nil :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:evaluation-periods (deser-evaluation-periods (clojure.core/get-in letvar1585732 ["EvaluationPeriods" :content])), :threshold (deser-threshold (clojure.core/get-in letvar1585732 ["Threshold" :content])), :comparison-operator (deser-comparison-operator (clojure.core/get-in letvar1585732 ["ComparisonOperator" :content])), :period (deser-period (clojure.core/get-in letvar1585732 ["Period" :content])), :metric-name (deser-metric-name (clojure.core/get-in letvar1585732 ["MetricName" :content])), :namespace (deser-namespace (clojure.core/get-in letvar1585732 ["Namespace" :content])), :statistic (deser-statistic (clojure.core/get-in letvar1585732 ["Statistic" :content]))} (letvar1585732 "Dimensions") (clojure.core/assoc :dimensions (deser-dimension-list (clojure.core/get-in letvar1585732 ["Dimensions" :content]))))))

(clojure.core/defn- deser-fully-qualified-domain-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"Average" :average, "Sum" :sum, "SampleCount" :sample-count, "Maximum" :maximum, "Minimum" :minimum} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-status-report [input] (clojure.core/let [letvar1585850 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CheckedTime" (portkey.aws/search-for-tag input "CheckedTime" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1585850 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1585850 ["Status" :content]))) (letvar1585850 "CheckedTime") (clojure.core/assoc :checked-time (deser-time-stamp (clojure.core/get-in letvar1585850 ["CheckedTime" :content]))))))

(clojure.core/defn- deser-vpc [input] (clojure.core/let [letvar1585958 {"VPCRegion" (portkey.aws/search-for-tag input "VPCRegion" :flattened? nil :xmlAttribute? nil), "VPCId" (portkey.aws/search-for-tag input "VPCId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1585958 "VPCRegion") (clojure.core/assoc :vpc-region (deser-vpc-region (clojure.core/get-in letvar1585958 ["VPCRegion" :content]))) (letvar1585958 "VPCId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar1585958 ["VPCId" :content]))))))

(clojure.core/defn- deser-limit-value [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-page-max-items [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-inverted [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-cloud-watch-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1, "eu-north-1" :eunorth-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- response-get-hosted-zone-limit-response ([input] (response-get-hosted-zone-limit-response nil input)) ([resultWrapper1585974 input] (clojure.core/let [rawinput1585973 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585975 {"Limit" (portkey.aws/search-for-tag rawinput1585973 "Limit" :flattened? nil :result-wrapper resultWrapper1585974), "Count" (portkey.aws/search-for-tag rawinput1585973 "Count" :flattened? nil :result-wrapper resultWrapper1585974)}] (clojure.core/cond-> {:limit (deser-hosted-zone-limit (clojure.core/get-in letvar1585975 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar1585975 ["Count" :content]))}))))

(clojure.core/defn- response-invalid-pagination-token ([input] (response-invalid-pagination-token nil input)) ([resultWrapper1585977 input] (clojure.core/let [rawinput1585976 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585978 {"message" (portkey.aws/search-for-tag rawinput1585976 "message" :flattened? nil :result-wrapper resultWrapper1585977)}] (clojure.core/cond-> {} (letvar1585978 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1585978 ["message" :content])))))))

(clojure.core/defn- response-delete-reusable-delegation-set-response ([input] (response-delete-reusable-delegation-set-response nil input)) ([resultWrapper1585980 input] (clojure.core/let [rawinput1585979 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585981 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-health-check-last-failure-reason-response ([input] (response-get-health-check-last-failure-reason-response nil input)) ([resultWrapper1585983 input] (clojure.core/let [rawinput1585982 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585984 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput1585982 "HealthCheckObservations" :flattened? nil :result-wrapper resultWrapper1585983)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar1585984 ["HealthCheckObservations" :content]))}))))

(clojure.core/defn- response-last-vpc-association ([input] (response-last-vpc-association nil input)) ([resultWrapper1585986 input] (clojure.core/let [rawinput1585985 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585987 {"message" (portkey.aws/search-for-tag rawinput1585985 "message" :flattened? nil :result-wrapper resultWrapper1585986)}] (clojure.core/cond-> {} (letvar1585987 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1585987 ["message" :content])))))))

(clojure.core/defn- response-query-logging-config-already-exists ([input] (response-query-logging-config-already-exists nil input)) ([resultWrapper1585989 input] (clojure.core/let [rawinput1585988 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585990 {"message" (portkey.aws/search-for-tag rawinput1585988 "message" :flattened? nil :result-wrapper resultWrapper1585989)}] (clojure.core/cond-> {} (letvar1585990 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1585990 ["message" :content])))))))

(clojure.core/defn- response-too-many-health-checks ([input] (response-too-many-health-checks nil input)) ([resultWrapper1585992 input] (clojure.core/let [rawinput1585991 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585993 {"message" (portkey.aws/search-for-tag rawinput1585991 "message" :flattened? nil :result-wrapper resultWrapper1585992)}] (clojure.core/cond-> {} (letvar1585993 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1585993 ["message" :content])))))))

(clojure.core/defn- response-list-hosted-zones-by-name-response ([input] (response-list-hosted-zones-by-name-response nil input)) ([resultWrapper1585995 input] (clojure.core/let [rawinput1585994 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585996 {"HostedZones" (portkey.aws/search-for-tag rawinput1585994 "HostedZones" :flattened? nil :result-wrapper resultWrapper1585995), "DNSName" (portkey.aws/search-for-tag rawinput1585994 "DNSName" :flattened? nil :result-wrapper resultWrapper1585995), "HostedZoneId" (portkey.aws/search-for-tag rawinput1585994 "HostedZoneId" :flattened? nil :result-wrapper resultWrapper1585995), "IsTruncated" (portkey.aws/search-for-tag rawinput1585994 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1585995), "NextDNSName" (portkey.aws/search-for-tag rawinput1585994 "NextDNSName" :flattened? nil :result-wrapper resultWrapper1585995), "NextHostedZoneId" (portkey.aws/search-for-tag rawinput1585994 "NextHostedZoneId" :flattened? nil :result-wrapper resultWrapper1585995), "MaxItems" (portkey.aws/search-for-tag rawinput1585994 "MaxItems" :flattened? nil :result-wrapper resultWrapper1585995)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar1585996 ["HostedZones" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1585996 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1585996 ["MaxItems" :content]))} (letvar1585996 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar1585996 ["DNSName" :content]))) (letvar1585996 "HostedZoneId") (clojure.core/assoc :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1585996 ["HostedZoneId" :content]))) (letvar1585996 "NextDNSName") (clojure.core/assoc :next-dns-name (deser-dns-name (clojure.core/get-in letvar1585996 ["NextDNSName" :content]))) (letvar1585996 "NextHostedZoneId") (clojure.core/assoc :next-hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1585996 ["NextHostedZoneId" :content])))))))

(clojure.core/defn- response-list-health-checks-response ([input] (response-list-health-checks-response nil input)) ([resultWrapper1585998 input] (clojure.core/let [rawinput1585997 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1585999 {"HealthChecks" (portkey.aws/search-for-tag rawinput1585997 "HealthChecks" :flattened? nil :result-wrapper resultWrapper1585998), "Marker" (portkey.aws/search-for-tag rawinput1585997 "Marker" :flattened? nil :result-wrapper resultWrapper1585998), "IsTruncated" (portkey.aws/search-for-tag rawinput1585997 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1585998), "NextMarker" (portkey.aws/search-for-tag rawinput1585997 "NextMarker" :flattened? nil :result-wrapper resultWrapper1585998), "MaxItems" (portkey.aws/search-for-tag rawinput1585997 "MaxItems" :flattened? nil :result-wrapper resultWrapper1585998)}] (clojure.core/cond-> {:health-checks (deser-health-checks (clojure.core/get-in letvar1585999 ["HealthChecks" :content])), :marker (deser-page-marker (clojure.core/get-in letvar1585999 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1585999 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1585999 ["MaxItems" :content]))} (letvar1585999 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar1585999 ["NextMarker" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper1586001 input] (clojure.core/let [rawinput1586000 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586002 {"message" (portkey.aws/search-for-tag rawinput1586000 "message" :flattened? nil :result-wrapper resultWrapper1586001)}] (clojure.core/cond-> {} (letvar1586002 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586002 ["message" :content])))))))

(clojure.core/defn- response-incompatible-version ([input] (response-incompatible-version nil input)) ([resultWrapper1586004 input] (clojure.core/let [rawinput1586003 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586005 {"message" (portkey.aws/search-for-tag rawinput1586003 "message" :flattened? nil :result-wrapper resultWrapper1586004)}] (clojure.core/cond-> {} (letvar1586005 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586005 ["message" :content])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1586007 input] (clojure.core/let [rawinput1586006 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586008 {"ResourceTagSet" (portkey.aws/search-for-tag rawinput1586006 "ResourceTagSet" :flattened? nil :result-wrapper resultWrapper1586007)}] (clojure.core/cond-> {:resource-tag-set (deser-resource-tag-set (clojure.core/get-in letvar1586008 ["ResourceTagSet" :content]))}))))

(clojure.core/defn- response-get-hosted-zone-response ([input] (response-get-hosted-zone-response nil input)) ([resultWrapper1586010 input] (clojure.core/let [rawinput1586009 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586011 {"HostedZone" (portkey.aws/search-for-tag rawinput1586009 "HostedZone" :flattened? nil :result-wrapper resultWrapper1586010), "DelegationSet" (portkey.aws/search-for-tag rawinput1586009 "DelegationSet" :flattened? nil :result-wrapper resultWrapper1586010), "VPCs" (portkey.aws/search-for-tag rawinput1586009 "VPCs" :flattened? nil :result-wrapper resultWrapper1586010)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar1586011 ["HostedZone" :content]))} (letvar1586011 "DelegationSet") (clojure.core/assoc :delegation-set (deser-delegation-set (clojure.core/get-in letvar1586011 ["DelegationSet" :content]))) (letvar1586011 "VPCs") (clojure.core/assoc :vp-cs (deser-vp-cs (clojure.core/get-in letvar1586011 ["VPCs" :content])))))))

(clojure.core/defn- response-list-traffic-policy-versions-response ([input] (response-list-traffic-policy-versions-response nil input)) ([resultWrapper1586013 input] (clojure.core/let [rawinput1586012 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586014 {"TrafficPolicies" (portkey.aws/search-for-tag rawinput1586012 "TrafficPolicies" :flattened? nil :result-wrapper resultWrapper1586013), "IsTruncated" (portkey.aws/search-for-tag rawinput1586012 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586013), "TrafficPolicyVersionMarker" (portkey.aws/search-for-tag rawinput1586012 "TrafficPolicyVersionMarker" :flattened? nil :result-wrapper resultWrapper1586013), "MaxItems" (portkey.aws/search-for-tag rawinput1586012 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586013)}] (clojure.core/cond-> {:traffic-policies (deser-traffic-policies (clojure.core/get-in letvar1586014 ["TrafficPolicies" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586014 ["IsTruncated" :content])), :traffic-policy-version-marker (deser-traffic-policy-version-marker (clojure.core/get-in letvar1586014 ["TrafficPolicyVersionMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586014 ["MaxItems" :content]))}))))

(clojure.core/defn- response-hosted-zone-not-private ([input] (response-hosted-zone-not-private nil input)) ([resultWrapper1586016 input] (clojure.core/let [rawinput1586015 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586017 {"message" (portkey.aws/search-for-tag rawinput1586015 "message" :flattened? nil :result-wrapper resultWrapper1586016)}] (clojure.core/cond-> {} (letvar1586017 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586017 ["message" :content])))))))

(clojure.core/defn- response-get-health-check-status-response ([input] (response-get-health-check-status-response nil input)) ([resultWrapper1586019 input] (clojure.core/let [rawinput1586018 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586020 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput1586018 "HealthCheckObservations" :flattened? nil :result-wrapper resultWrapper1586019)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar1586020 ["HealthCheckObservations" :content]))}))))

(clojure.core/defn- response-list-vpc-association-authorizations-response ([input] (response-list-vpc-association-authorizations-response nil input)) ([resultWrapper1586022 input] (clojure.core/let [rawinput1586021 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586023 {"HostedZoneId" (portkey.aws/search-for-tag rawinput1586021 "HostedZoneId" :flattened? nil :result-wrapper resultWrapper1586022), "NextToken" (portkey.aws/search-for-tag rawinput1586021 "NextToken" :flattened? nil :result-wrapper resultWrapper1586022), "VPCs" (portkey.aws/search-for-tag rawinput1586021 "VPCs" :flattened? nil :result-wrapper resultWrapper1586022)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1586023 ["HostedZoneId" :content])), :vp-cs (deser-vp-cs (clojure.core/get-in letvar1586023 ["VPCs" :content]))} (letvar1586023 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1586023 ["NextToken" :content])))))))

(clojure.core/defn- response-no-such-geo-location ([input] (response-no-such-geo-location nil input)) ([resultWrapper1586025 input] (clojure.core/let [rawinput1586024 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586026 {"message" (portkey.aws/search-for-tag rawinput1586024 "message" :flattened? nil :result-wrapper resultWrapper1586025)}] (clojure.core/cond-> {} (letvar1586026 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586026 ["message" :content])))))))

(clojure.core/defn- response-limits-exceeded ([input] (response-limits-exceeded nil input)) ([resultWrapper1586028 input] (clojure.core/let [rawinput1586027 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586029 {"message" (portkey.aws/search-for-tag rawinput1586027 "message" :flattened? nil :result-wrapper resultWrapper1586028)}] (clojure.core/cond-> {} (letvar1586029 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586029 ["message" :content])))))))

(clojure.core/defn- response-public-zone-vpc-association ([input] (response-public-zone-vpc-association nil input)) ([resultWrapper1586031 input] (clojure.core/let [rawinput1586030 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586032 {"message" (portkey.aws/search-for-tag rawinput1586030 "message" :flattened? nil :result-wrapper resultWrapper1586031)}] (clojure.core/cond-> {} (letvar1586032 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586032 ["message" :content])))))))

(clojure.core/defn- response-prior-request-not-complete ([input] (response-prior-request-not-complete nil input)) ([resultWrapper1586034 input] (clojure.core/let [rawinput1586033 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586035 {"message" (portkey.aws/search-for-tag rawinput1586033 "message" :flattened? nil :result-wrapper resultWrapper1586034)}] (clojure.core/cond-> {} (letvar1586035 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586035 ["message" :content])))))))

(clojure.core/defn- response-create-traffic-policy-response ([input] (response-create-traffic-policy-response nil input)) ([resultWrapper1586037 input] (clojure.core/let [rawinput1586036 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586038 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput1586036 "TrafficPolicy" :flattened? nil :result-wrapper resultWrapper1586037), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar1586038 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586038 ["Location"]))}))))

(clojure.core/defn- response-too-many-vpc-association-authorizations ([input] (response-too-many-vpc-association-authorizations nil input)) ([resultWrapper1586040 input] (clojure.core/let [rawinput1586039 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586041 {"message" (portkey.aws/search-for-tag rawinput1586039 "message" :flattened? nil :result-wrapper resultWrapper1586040)}] (clojure.core/cond-> {} (letvar1586041 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586041 ["message" :content])))))))

(clojure.core/defn- response-create-traffic-policy-version-response ([input] (response-create-traffic-policy-version-response nil input)) ([resultWrapper1586043 input] (clojure.core/let [rawinput1586042 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586044 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput1586042 "TrafficPolicy" :flattened? nil :result-wrapper resultWrapper1586043), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar1586044 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586044 ["Location"]))}))))

(clojure.core/defn- response-delete-hosted-zone-response ([input] (response-delete-hosted-zone-response nil input)) ([resultWrapper1586046 input] (clojure.core/let [rawinput1586045 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586047 {"ChangeInfo" (portkey.aws/search-for-tag rawinput1586045 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586046)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar1586047 ["ChangeInfo" :content]))}))))

(clojure.core/defn- response-test-dns-answer-response ([input] (response-test-dns-answer-response nil input)) ([resultWrapper1586049 input] (clojure.core/let [rawinput1586048 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586050 {"Nameserver" (portkey.aws/search-for-tag rawinput1586048 "Nameserver" :flattened? nil :result-wrapper resultWrapper1586049), "RecordName" (portkey.aws/search-for-tag rawinput1586048 "RecordName" :flattened? nil :result-wrapper resultWrapper1586049), "RecordType" (portkey.aws/search-for-tag rawinput1586048 "RecordType" :flattened? nil :result-wrapper resultWrapper1586049), "RecordData" (portkey.aws/search-for-tag rawinput1586048 "RecordData" :flattened? nil :result-wrapper resultWrapper1586049), "ResponseCode" (portkey.aws/search-for-tag rawinput1586048 "ResponseCode" :flattened? nil :result-wrapper resultWrapper1586049), "Protocol" (portkey.aws/search-for-tag rawinput1586048 "Protocol" :flattened? nil :result-wrapper resultWrapper1586049)}] (clojure.core/cond-> {:nameserver (deser-nameserver (clojure.core/get-in letvar1586050 ["Nameserver" :content])), :record-name (deser-dns-name (clojure.core/get-in letvar1586050 ["RecordName" :content])), :record-type (deser-rr-type (clojure.core/get-in letvar1586050 ["RecordType" :content])), :record-data (deser-record-data (clojure.core/get-in letvar1586050 ["RecordData" :content])), :response-code (deser-dnsr-code (clojure.core/get-in letvar1586050 ["ResponseCode" :content])), :protocol (deser-transport-protocol (clojure.core/get-in letvar1586050 ["Protocol" :content]))}))))

(clojure.core/defn- response-delete-query-logging-config-response ([input] (response-delete-query-logging-config-response nil input)) ([resultWrapper1586052 input] (clojure.core/let [rawinput1586051 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586053 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-checker-ip-ranges-response ([input] (response-get-checker-ip-ranges-response nil input)) ([resultWrapper1586055 input] (clojure.core/let [rawinput1586054 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586056 {"CheckerIpRanges" (portkey.aws/search-for-tag rawinput1586054 "CheckerIpRanges" :flattened? nil :result-wrapper resultWrapper1586055)}] (clojure.core/cond-> {:checker-ip-ranges (deser-checker-ip-ranges (clojure.core/get-in letvar1586056 ["CheckerIpRanges" :content]))}))))

(clojure.core/defn- response-create-vpc-association-authorization-response ([input] (response-create-vpc-association-authorization-response nil input)) ([resultWrapper1586058 input] (clojure.core/let [rawinput1586057 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586059 {"HostedZoneId" (portkey.aws/search-for-tag rawinput1586057 "HostedZoneId" :flattened? nil :result-wrapper resultWrapper1586058), "VPC" (portkey.aws/search-for-tag rawinput1586057 "VPC" :flattened? nil :result-wrapper resultWrapper1586058)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar1586059 ["HostedZoneId" :content])), :vpc (deser-vpc (clojure.core/get-in letvar1586059 ["VPC" :content]))}))))

(clojure.core/defn- response-delegation-set-not-reusable ([input] (response-delegation-set-not-reusable nil input)) ([resultWrapper1586061 input] (clojure.core/let [rawinput1586060 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586062 {"message" (portkey.aws/search-for-tag rawinput1586060 "message" :flattened? nil :result-wrapper resultWrapper1586061)}] (clojure.core/cond-> {} (letvar1586062 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586062 ["message" :content])))))))

(clojure.core/defn- response-insufficient-cloud-watch-logs-resource-policy ([input] (response-insufficient-cloud-watch-logs-resource-policy nil input)) ([resultWrapper1586064 input] (clojure.core/let [rawinput1586063 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586065 {"message" (portkey.aws/search-for-tag rawinput1586063 "message" :flattened? nil :result-wrapper resultWrapper1586064)}] (clojure.core/cond-> {} (letvar1586065 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586065 ["message" :content])))))))

(clojure.core/defn- response-too-many-traffic-policy-instances ([input] (response-too-many-traffic-policy-instances nil input)) ([resultWrapper1586067 input] (clojure.core/let [rawinput1586066 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586068 {"message" (portkey.aws/search-for-tag rawinput1586066 "message" :flattened? nil :result-wrapper resultWrapper1586067)}] (clojure.core/cond-> {} (letvar1586068 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586068 ["message" :content])))))))

(clojure.core/defn- response-no-such-health-check ([input] (response-no-such-health-check nil input)) ([resultWrapper1586070 input] (clojure.core/let [rawinput1586069 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586071 {"message" (portkey.aws/search-for-tag rawinput1586069 "message" :flattened? nil :result-wrapper resultWrapper1586070)}] (clojure.core/cond-> {} (letvar1586071 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586071 ["message" :content])))))))

(clojure.core/defn- response-no-such-traffic-policy ([input] (response-no-such-traffic-policy nil input)) ([resultWrapper1586073 input] (clojure.core/let [rawinput1586072 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586074 {"message" (portkey.aws/search-for-tag rawinput1586072 "message" :flattened? nil :result-wrapper resultWrapper1586073)}] (clojure.core/cond-> {} (letvar1586074 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586074 ["message" :content])))))))

(clojure.core/defn- response-associate-vpc-with-hosted-zone-response ([input] (response-associate-vpc-with-hosted-zone-response nil input)) ([resultWrapper1586076 input] (clojure.core/let [rawinput1586075 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586077 {"ChangeInfo" (portkey.aws/search-for-tag rawinput1586075 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586076)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar1586077 ["ChangeInfo" :content]))}))))

(clojure.core/defn- response-create-traffic-policy-instance-response ([input] (response-create-traffic-policy-instance-response nil input)) ([resultWrapper1586079 input] (clojure.core/let [rawinput1586078 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586080 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput1586078 "TrafficPolicyInstance" :flattened? nil :result-wrapper resultWrapper1586079), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar1586080 ["TrafficPolicyInstance" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586080 ["Location"]))}))))

(clojure.core/defn- response-not-authorized-exception ([input] (response-not-authorized-exception nil input)) ([resultWrapper1586082 input] (clojure.core/let [rawinput1586081 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586083 {"message" (portkey.aws/search-for-tag rawinput1586081 "message" :flattened? nil :result-wrapper resultWrapper1586082)}] (clojure.core/cond-> {} (letvar1586083 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586083 ["message" :content])))))))

(clojure.core/defn- response-get-query-logging-config-response ([input] (response-get-query-logging-config-response nil input)) ([resultWrapper1586085 input] (clojure.core/let [rawinput1586084 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586086 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput1586084 "QueryLoggingConfig" :flattened? nil :result-wrapper resultWrapper1586085)}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar1586086 ["QueryLoggingConfig" :content]))}))))

(clojure.core/defn- response-invalid-domain-name ([input] (response-invalid-domain-name nil input)) ([resultWrapper1586088 input] (clojure.core/let [rawinput1586087 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586089 {"message" (portkey.aws/search-for-tag rawinput1586087 "message" :flattened? nil :result-wrapper resultWrapper1586088)}] (clojure.core/cond-> {} (letvar1586089 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586089 ["message" :content])))))))

(clojure.core/defn- response-list-reusable-delegation-sets-response ([input] (response-list-reusable-delegation-sets-response nil input)) ([resultWrapper1586091 input] (clojure.core/let [rawinput1586090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586092 {"DelegationSets" (portkey.aws/search-for-tag rawinput1586090 "DelegationSets" :flattened? nil :result-wrapper resultWrapper1586091), "Marker" (portkey.aws/search-for-tag rawinput1586090 "Marker" :flattened? nil :result-wrapper resultWrapper1586091), "IsTruncated" (portkey.aws/search-for-tag rawinput1586090 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586091), "NextMarker" (portkey.aws/search-for-tag rawinput1586090 "NextMarker" :flattened? nil :result-wrapper resultWrapper1586091), "MaxItems" (portkey.aws/search-for-tag rawinput1586090 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586091)}] (clojure.core/cond-> {:delegation-sets (deser-delegation-sets (clojure.core/get-in letvar1586092 ["DelegationSets" :content])), :marker (deser-page-marker (clojure.core/get-in letvar1586092 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586092 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586092 ["MaxItems" :content]))} (letvar1586092 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar1586092 ["NextMarker" :content])))))))

(clojure.core/defn- response-no-such-change ([input] (response-no-such-change nil input)) ([resultWrapper1586094 input] (clojure.core/let [rawinput1586093 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586095 {"message" (portkey.aws/search-for-tag rawinput1586093 "message" :flattened? nil :result-wrapper resultWrapper1586094)}] (clojure.core/cond-> {} (letvar1586095 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586095 ["message" :content])))))))

(clojure.core/defn- response-invalid-change-batch ([input] (response-invalid-change-batch nil input)) ([resultWrapper1586097 input] (clojure.core/let [rawinput1586096 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586098 {"messages" (portkey.aws/search-for-tag rawinput1586096 "messages" :flattened? nil :result-wrapper resultWrapper1586097), "message" (portkey.aws/search-for-tag rawinput1586096 "message" :flattened? nil :result-wrapper resultWrapper1586097)}] (clojure.core/cond-> {} (letvar1586098 "messages") (clojure.core/assoc :messages (deser-error-messages (clojure.core/get-in letvar1586098 ["messages" :content]))) (letvar1586098 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586098 ["message" :content])))))))

(clojure.core/defn- response-invalid-input ([input] (response-invalid-input nil input)) ([resultWrapper1586100 input] (clojure.core/let [rawinput1586099 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586101 {"message" (portkey.aws/search-for-tag rawinput1586099 "message" :flattened? nil :result-wrapper resultWrapper1586100)}] (clojure.core/cond-> {} (letvar1586101 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586101 ["message" :content])))))))

(clojure.core/defn- response-get-reusable-delegation-set-response ([input] (response-get-reusable-delegation-set-response nil input)) ([resultWrapper1586103 input] (clojure.core/let [rawinput1586102 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586104 {"DelegationSet" (portkey.aws/search-for-tag rawinput1586102 "DelegationSet" :flattened? nil :result-wrapper resultWrapper1586103)}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar1586104 ["DelegationSet" :content]))}))))

(clojure.core/defn- response-get-traffic-policy-instance-response ([input] (response-get-traffic-policy-instance-response nil input)) ([resultWrapper1586106 input] (clojure.core/let [rawinput1586105 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586107 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput1586105 "TrafficPolicyInstance" :flattened? nil :result-wrapper resultWrapper1586106)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar1586107 ["TrafficPolicyInstance" :content]))}))))

(clojure.core/defn- response-hosted-zone-not-found ([input] (response-hosted-zone-not-found nil input)) ([resultWrapper1586109 input] (clojure.core/let [rawinput1586108 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586110 {"message" (portkey.aws/search-for-tag rawinput1586108 "message" :flattened? nil :result-wrapper resultWrapper1586109)}] (clojure.core/cond-> {} (letvar1586110 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586110 ["message" :content])))))))

(clojure.core/defn- response-invalid-vpc-id ([input] (response-invalid-vpc-id nil input)) ([resultWrapper1586112 input] (clojure.core/let [rawinput1586111 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586113 {"message" (portkey.aws/search-for-tag rawinput1586111 "message" :flattened? nil :result-wrapper resultWrapper1586112)}] (clojure.core/cond-> {} (letvar1586113 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586113 ["message" :content])))))))

(clojure.core/defn- response-no-such-delegation-set ([input] (response-no-such-delegation-set nil input)) ([resultWrapper1586115 input] (clojure.core/let [rawinput1586114 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586116 {"message" (portkey.aws/search-for-tag rawinput1586114 "message" :flattened? nil :result-wrapper resultWrapper1586115)}] (clojure.core/cond-> {} (letvar1586116 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586116 ["message" :content])))))))

(clojure.core/defn- response-too-many-traffic-policy-versions-for-current-policy ([input] (response-too-many-traffic-policy-versions-for-current-policy nil input)) ([resultWrapper1586118 input] (clojure.core/let [rawinput1586117 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586119 {"message" (portkey.aws/search-for-tag rawinput1586117 "message" :flattened? nil :result-wrapper resultWrapper1586118)}] (clojure.core/cond-> {} (letvar1586119 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586119 ["message" :content])))))))

(clojure.core/defn- response-get-traffic-policy-response ([input] (response-get-traffic-policy-response nil input)) ([resultWrapper1586121 input] (clojure.core/let [rawinput1586120 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586122 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput1586120 "TrafficPolicy" :flattened? nil :result-wrapper resultWrapper1586121)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar1586122 ["TrafficPolicy" :content]))}))))

(clojure.core/defn- response-update-traffic-policy-comment-response ([input] (response-update-traffic-policy-comment-response nil input)) ([resultWrapper1586124 input] (clojure.core/let [rawinput1586123 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586125 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput1586123 "TrafficPolicy" :flattened? nil :result-wrapper resultWrapper1586124)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar1586125 ["TrafficPolicy" :content]))}))))

(clojure.core/defn- response-disassociate-vpc-from-hosted-zone-response ([input] (response-disassociate-vpc-from-hosted-zone-response nil input)) ([resultWrapper1586127 input] (clojure.core/let [rawinput1586126 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586128 {"ChangeInfo" (portkey.aws/search-for-tag rawinput1586126 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586127)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar1586128 ["ChangeInfo" :content]))}))))

(clojure.core/defn- response-conflicting-domain-exists ([input] (response-conflicting-domain-exists nil input)) ([resultWrapper1586130 input] (clojure.core/let [rawinput1586129 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586131 {"message" (portkey.aws/search-for-tag rawinput1586129 "message" :flattened? nil :result-wrapper resultWrapper1586130)}] (clojure.core/cond-> {} (letvar1586131 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586131 ["message" :content])))))))

(clojure.core/defn- response-concurrent-modification ([input] (response-concurrent-modification nil input)) ([resultWrapper1586133 input] (clojure.core/let [rawinput1586132 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586134 {"message" (portkey.aws/search-for-tag rawinput1586132 "message" :flattened? nil :result-wrapper resultWrapper1586133)}] (clojure.core/cond-> {} (letvar1586134 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586134 ["message" :content])))))))

(clojure.core/defn- response-delegation-set-in-use ([input] (response-delegation-set-in-use nil input)) ([resultWrapper1586136 input] (clojure.core/let [rawinput1586135 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586137 {"message" (portkey.aws/search-for-tag rawinput1586135 "message" :flattened? nil :result-wrapper resultWrapper1586136)}] (clojure.core/cond-> {} (letvar1586137 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586137 ["message" :content])))))))

(clojure.core/defn- response-list-query-logging-configs-response ([input] (response-list-query-logging-configs-response nil input)) ([resultWrapper1586139 input] (clojure.core/let [rawinput1586138 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586140 {"QueryLoggingConfigs" (portkey.aws/search-for-tag rawinput1586138 "QueryLoggingConfigs" :flattened? nil :result-wrapper resultWrapper1586139), "NextToken" (portkey.aws/search-for-tag rawinput1586138 "NextToken" :flattened? nil :result-wrapper resultWrapper1586139)}] (clojure.core/cond-> {:query-logging-configs (deser-query-logging-configs (clojure.core/get-in letvar1586140 ["QueryLoggingConfigs" :content]))} (letvar1586140 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1586140 ["NextToken" :content])))))))

(clojure.core/defn- response-list-hosted-zones-response ([input] (response-list-hosted-zones-response nil input)) ([resultWrapper1586142 input] (clojure.core/let [rawinput1586141 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586143 {"HostedZones" (portkey.aws/search-for-tag rawinput1586141 "HostedZones" :flattened? nil :result-wrapper resultWrapper1586142), "Marker" (portkey.aws/search-for-tag rawinput1586141 "Marker" :flattened? nil :result-wrapper resultWrapper1586142), "IsTruncated" (portkey.aws/search-for-tag rawinput1586141 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586142), "NextMarker" (portkey.aws/search-for-tag rawinput1586141 "NextMarker" :flattened? nil :result-wrapper resultWrapper1586142), "MaxItems" (portkey.aws/search-for-tag rawinput1586141 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586142)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar1586143 ["HostedZones" :content])), :marker (deser-page-marker (clojure.core/get-in letvar1586143 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586143 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586143 ["MaxItems" :content]))} (letvar1586143 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar1586143 ["NextMarker" :content])))))))

(clojure.core/defn- response-create-hosted-zone-response ([input] (response-create-hosted-zone-response nil input)) ([resultWrapper1586145 input] (clojure.core/let [rawinput1586144 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586146 {"HostedZone" (portkey.aws/search-for-tag rawinput1586144 "HostedZone" :flattened? nil :result-wrapper resultWrapper1586145), "ChangeInfo" (portkey.aws/search-for-tag rawinput1586144 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586145), "DelegationSet" (portkey.aws/search-for-tag rawinput1586144 "DelegationSet" :flattened? nil :result-wrapper resultWrapper1586145), "VPC" (portkey.aws/search-for-tag rawinput1586144 "VPC" :flattened? nil :result-wrapper resultWrapper1586145), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar1586146 ["HostedZone" :content])), :change-info (deser-change-info (clojure.core/get-in letvar1586146 ["ChangeInfo" :content])), :delegation-set (deser-delegation-set (clojure.core/get-in letvar1586146 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586146 ["Location"]))} (letvar1586146 "VPC") (clojure.core/assoc :vpc (deser-vpc (clojure.core/get-in letvar1586146 ["VPC" :content])))))))

(clojure.core/defn- response-health-check-in-use ([input] (response-health-check-in-use nil input)) ([resultWrapper1586148 input] (clojure.core/let [rawinput1586147 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586149 {"message" (portkey.aws/search-for-tag rawinput1586147 "message" :flattened? nil :result-wrapper resultWrapper1586148)}] (clojure.core/cond-> {} (letvar1586149 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586149 ["message" :content])))))))

(clojure.core/defn- response-delete-health-check-response ([input] (response-delete-health-check-response nil input)) ([resultWrapper1586151 input] (clojure.core/let [rawinput1586150 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586152 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-traffic-policy-instance-response ([input] (response-update-traffic-policy-instance-response nil input)) ([resultWrapper1586154 input] (clojure.core/let [rawinput1586153 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586155 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput1586153 "TrafficPolicyInstance" :flattened? nil :result-wrapper resultWrapper1586154)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar1586155 ["TrafficPolicyInstance" :content]))}))))

(clojure.core/defn- response-too-many-traffic-policies ([input] (response-too-many-traffic-policies nil input)) ([resultWrapper1586157 input] (clojure.core/let [rawinput1586156 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586158 {"message" (portkey.aws/search-for-tag rawinput1586156 "message" :flattened? nil :result-wrapper resultWrapper1586157)}] (clojure.core/cond-> {} (letvar1586158 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586158 ["message" :content])))))))

(clojure.core/defn- response-create-query-logging-config-response ([input] (response-create-query-logging-config-response nil input)) ([resultWrapper1586160 input] (clojure.core/let [rawinput1586159 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586161 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput1586159 "QueryLoggingConfig" :flattened? nil :result-wrapper resultWrapper1586160), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar1586161 ["QueryLoggingConfig" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586161 ["Location"]))}))))

(clojure.core/defn- response-traffic-policy-instance-already-exists ([input] (response-traffic-policy-instance-already-exists nil input)) ([resultWrapper1586163 input] (clojure.core/let [rawinput1586162 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586164 {"message" (portkey.aws/search-for-tag rawinput1586162 "message" :flattened? nil :result-wrapper resultWrapper1586163)}] (clojure.core/cond-> {} (letvar1586164 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586164 ["message" :content])))))))

(clojure.core/defn- response-hosted-zone-already-exists ([input] (response-hosted-zone-already-exists nil input)) ([resultWrapper1586166 input] (clojure.core/let [rawinput1586165 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586167 {"message" (portkey.aws/search-for-tag rawinput1586165 "message" :flattened? nil :result-wrapper resultWrapper1586166)}] (clojure.core/cond-> {} (letvar1586167 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586167 ["message" :content])))))))

(clojure.core/defn- response-create-reusable-delegation-set-response ([input] (response-create-reusable-delegation-set-response nil input)) ([resultWrapper1586169 input] (clojure.core/let [rawinput1586168 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586170 {"DelegationSet" (portkey.aws/search-for-tag rawinput1586168 "DelegationSet" :flattened? nil :result-wrapper resultWrapper1586169), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar1586170 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586170 ["Location"]))}))))

(clojure.core/defn- response-list-resource-record-sets-response ([input] (response-list-resource-record-sets-response nil input)) ([resultWrapper1586172 input] (clojure.core/let [rawinput1586171 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586173 {"ResourceRecordSets" (portkey.aws/search-for-tag rawinput1586171 "ResourceRecordSets" :flattened? nil :result-wrapper resultWrapper1586172), "IsTruncated" (portkey.aws/search-for-tag rawinput1586171 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586172), "NextRecordName" (portkey.aws/search-for-tag rawinput1586171 "NextRecordName" :flattened? nil :result-wrapper resultWrapper1586172), "NextRecordType" (portkey.aws/search-for-tag rawinput1586171 "NextRecordType" :flattened? nil :result-wrapper resultWrapper1586172), "NextRecordIdentifier" (portkey.aws/search-for-tag rawinput1586171 "NextRecordIdentifier" :flattened? nil :result-wrapper resultWrapper1586172), "MaxItems" (portkey.aws/search-for-tag rawinput1586171 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586172)}] (clojure.core/cond-> {:resource-record-sets (deser-resource-record-sets (clojure.core/get-in letvar1586173 ["ResourceRecordSets" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586173 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586173 ["MaxItems" :content]))} (letvar1586173 "NextRecordName") (clojure.core/assoc :next-record-name (deser-dns-name (clojure.core/get-in letvar1586173 ["NextRecordName" :content]))) (letvar1586173 "NextRecordType") (clojure.core/assoc :next-record-type (deser-rr-type (clojure.core/get-in letvar1586173 ["NextRecordType" :content]))) (letvar1586173 "NextRecordIdentifier") (clojure.core/assoc :next-record-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar1586173 ["NextRecordIdentifier" :content])))))))

(clojure.core/defn- response-invalid-traffic-policy-document ([input] (response-invalid-traffic-policy-document nil input)) ([resultWrapper1586175 input] (clojure.core/let [rawinput1586174 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586176 {"message" (portkey.aws/search-for-tag rawinput1586174 "message" :flattened? nil :result-wrapper resultWrapper1586175)}] (clojure.core/cond-> {} (letvar1586176 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586176 ["message" :content])))))))

(clojure.core/defn- response-get-health-check-response ([input] (response-get-health-check-response nil input)) ([resultWrapper1586178 input] (clojure.core/let [rawinput1586177 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586179 {"HealthCheck" (portkey.aws/search-for-tag rawinput1586177 "HealthCheck" :flattened? nil :result-wrapper resultWrapper1586178)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar1586179 ["HealthCheck" :content]))}))))

(clojure.core/defn- response-get-traffic-policy-instance-count-response ([input] (response-get-traffic-policy-instance-count-response nil input)) ([resultWrapper1586181 input] (clojure.core/let [rawinput1586180 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586182 {"TrafficPolicyInstanceCount" (portkey.aws/search-for-tag rawinput1586180 "TrafficPolicyInstanceCount" :flattened? nil :result-wrapper resultWrapper1586181)}] (clojure.core/cond-> {:traffic-policy-instance-count (deser-traffic-policy-instance-count (clojure.core/get-in letvar1586182 ["TrafficPolicyInstanceCount" :content]))}))))

(clojure.core/defn- response-no-such-hosted-zone ([input] (response-no-such-hosted-zone nil input)) ([resultWrapper1586184 input] (clojure.core/let [rawinput1586183 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586185 {"message" (portkey.aws/search-for-tag rawinput1586183 "message" :flattened? nil :result-wrapper resultWrapper1586184)}] (clojure.core/cond-> {} (letvar1586185 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586185 ["message" :content])))))))

(clojure.core/defn- response-list-geo-locations-response ([input] (response-list-geo-locations-response nil input)) ([resultWrapper1586187 input] (clojure.core/let [rawinput1586186 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586188 {"GeoLocationDetailsList" (portkey.aws/search-for-tag rawinput1586186 "GeoLocationDetailsList" :flattened? nil :result-wrapper resultWrapper1586187), "IsTruncated" (portkey.aws/search-for-tag rawinput1586186 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586187), "NextContinentCode" (portkey.aws/search-for-tag rawinput1586186 "NextContinentCode" :flattened? nil :result-wrapper resultWrapper1586187), "NextCountryCode" (portkey.aws/search-for-tag rawinput1586186 "NextCountryCode" :flattened? nil :result-wrapper resultWrapper1586187), "NextSubdivisionCode" (portkey.aws/search-for-tag rawinput1586186 "NextSubdivisionCode" :flattened? nil :result-wrapper resultWrapper1586187), "MaxItems" (portkey.aws/search-for-tag rawinput1586186 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586187)}] (clojure.core/cond-> {:geo-location-details-list (deser-geo-location-details-list (clojure.core/get-in letvar1586188 ["GeoLocationDetailsList" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586188 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586188 ["MaxItems" :content]))} (letvar1586188 "NextContinentCode") (clojure.core/assoc :next-continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar1586188 ["NextContinentCode" :content]))) (letvar1586188 "NextCountryCode") (clojure.core/assoc :next-country-code (deser-geo-location-country-code (clojure.core/get-in letvar1586188 ["NextCountryCode" :content]))) (letvar1586188 "NextSubdivisionCode") (clojure.core/assoc :next-subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar1586188 ["NextSubdivisionCode" :content])))))))

(clojure.core/defn- response-conflicting-types ([input] (response-conflicting-types nil input)) ([resultWrapper1586190 input] (clojure.core/let [rawinput1586189 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586191 {"message" (portkey.aws/search-for-tag rawinput1586189 "message" :flattened? nil :result-wrapper resultWrapper1586190)}] (clojure.core/cond-> {} (letvar1586191 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586191 ["message" :content])))))))

(clojure.core/defn- response-delete-traffic-policy-instance-response ([input] (response-delete-traffic-policy-instance-response nil input)) ([resultWrapper1586193 input] (clojure.core/let [rawinput1586192 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586194 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-traffic-policy-already-exists ([input] (response-traffic-policy-already-exists nil input)) ([resultWrapper1586196 input] (clojure.core/let [rawinput1586195 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586197 {"message" (portkey.aws/search-for-tag rawinput1586195 "message" :flattened? nil :result-wrapper resultWrapper1586196)}] (clojure.core/cond-> {} (letvar1586197 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586197 ["message" :content])))))))

(clojure.core/defn- response-delegation-set-already-reusable ([input] (response-delegation-set-already-reusable nil input)) ([resultWrapper1586199 input] (clojure.core/let [rawinput1586198 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586200 {"message" (portkey.aws/search-for-tag rawinput1586198 "message" :flattened? nil :result-wrapper resultWrapper1586199)}] (clojure.core/cond-> {} (letvar1586200 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586200 ["message" :content])))))))

(clojure.core/defn- response-vpc-association-not-found ([input] (response-vpc-association-not-found nil input)) ([resultWrapper1586202 input] (clojure.core/let [rawinput1586201 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586203 {"message" (portkey.aws/search-for-tag rawinput1586201 "message" :flattened? nil :result-wrapper resultWrapper1586202)}] (clojure.core/cond-> {} (letvar1586203 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586203 ["message" :content])))))))

(clojure.core/defn- response-health-check-version-mismatch ([input] (response-health-check-version-mismatch nil input)) ([resultWrapper1586205 input] (clojure.core/let [rawinput1586204 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586206 {"message" (portkey.aws/search-for-tag rawinput1586204 "message" :flattened? nil :result-wrapper resultWrapper1586205)}] (clojure.core/cond-> {} (letvar1586206 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586206 ["message" :content])))))))

(clojure.core/defn- response-get-change-response ([input] (response-get-change-response nil input)) ([resultWrapper1586208 input] (clojure.core/let [rawinput1586207 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586209 {"ChangeInfo" (portkey.aws/search-for-tag rawinput1586207 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586208)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar1586209 ["ChangeInfo" :content]))}))))

(clojure.core/defn- response-list-traffic-policies-response ([input] (response-list-traffic-policies-response nil input)) ([resultWrapper1586211 input] (clojure.core/let [rawinput1586210 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586212 {"TrafficPolicySummaries" (portkey.aws/search-for-tag rawinput1586210 "TrafficPolicySummaries" :flattened? nil :result-wrapper resultWrapper1586211), "IsTruncated" (portkey.aws/search-for-tag rawinput1586210 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586211), "TrafficPolicyIdMarker" (portkey.aws/search-for-tag rawinput1586210 "TrafficPolicyIdMarker" :flattened? nil :result-wrapper resultWrapper1586211), "MaxItems" (portkey.aws/search-for-tag rawinput1586210 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586211)}] (clojure.core/cond-> {:traffic-policy-summaries (deser-traffic-policy-summaries (clojure.core/get-in letvar1586212 ["TrafficPolicySummaries" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586212 ["IsTruncated" :content])), :traffic-policy-id-marker (deser-traffic-policy-id (clojure.core/get-in letvar1586212 ["TrafficPolicyIdMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586212 ["MaxItems" :content]))}))))

(clojure.core/defn- response-get-geo-location-response ([input] (response-get-geo-location-response nil input)) ([resultWrapper1586214 input] (clojure.core/let [rawinput1586213 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586215 {"GeoLocationDetails" (portkey.aws/search-for-tag rawinput1586213 "GeoLocationDetails" :flattened? nil :result-wrapper resultWrapper1586214)}] (clojure.core/cond-> {:geo-location-details (deser-geo-location-details (clojure.core/get-in letvar1586215 ["GeoLocationDetails" :content]))}))))

(clojure.core/defn- response-list-traffic-policy-instances-response ([input] (response-list-traffic-policy-instances-response nil input)) ([resultWrapper1586217 input] (clojure.core/let [rawinput1586216 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586218 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput1586216 "TrafficPolicyInstances" :flattened? nil :result-wrapper resultWrapper1586217), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput1586216 "HostedZoneIdMarker" :flattened? nil :result-wrapper resultWrapper1586217), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput1586216 "TrafficPolicyInstanceNameMarker" :flattened? nil :result-wrapper resultWrapper1586217), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput1586216 "TrafficPolicyInstanceTypeMarker" :flattened? nil :result-wrapper resultWrapper1586217), "IsTruncated" (portkey.aws/search-for-tag rawinput1586216 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586217), "MaxItems" (portkey.aws/search-for-tag rawinput1586216 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586217)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar1586218 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586218 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586218 ["MaxItems" :content]))} (letvar1586218 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar1586218 ["HostedZoneIdMarker" :content]))) (letvar1586218 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar1586218 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar1586218 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar1586218 ["TrafficPolicyInstanceTypeMarker" :content])))))))

(clojure.core/defn- response-get-health-check-count-response ([input] (response-get-health-check-count-response nil input)) ([resultWrapper1586220 input] (clojure.core/let [rawinput1586219 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586221 {"HealthCheckCount" (portkey.aws/search-for-tag rawinput1586219 "HealthCheckCount" :flattened? nil :result-wrapper resultWrapper1586220)}] (clojure.core/cond-> {:health-check-count (deser-health-check-count (clojure.core/get-in letvar1586221 ["HealthCheckCount" :content]))}))))

(clojure.core/defn- response-delete-vpc-association-authorization-response ([input] (response-delete-vpc-association-authorization-response nil input)) ([resultWrapper1586223 input] (clojure.core/let [rawinput1586222 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586224 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-hosted-zones ([input] (response-too-many-hosted-zones nil input)) ([resultWrapper1586226 input] (clojure.core/let [rawinput1586225 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586227 {"message" (portkey.aws/search-for-tag rawinput1586225 "message" :flattened? nil :result-wrapper resultWrapper1586226)}] (clojure.core/cond-> {} (letvar1586227 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586227 ["message" :content])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1586229 input] (clojure.core/let [rawinput1586228 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586230 {"message" (portkey.aws/search-for-tag rawinput1586228 "message" :flattened? nil :result-wrapper resultWrapper1586229)}] (clojure.core/cond-> {} (letvar1586230 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586230 ["message" :content])))))))

(clojure.core/defn- response-change-tags-for-resource-response ([input] (response-change-tags-for-resource-response nil input)) ([resultWrapper1586232 input] (clojure.core/let [rawinput1586231 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586233 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-hosted-zone-count-response ([input] (response-get-hosted-zone-count-response nil input)) ([resultWrapper1586235 input] (clojure.core/let [rawinput1586234 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586236 {"HostedZoneCount" (portkey.aws/search-for-tag rawinput1586234 "HostedZoneCount" :flattened? nil :result-wrapper resultWrapper1586235)}] (clojure.core/cond-> {:hosted-zone-count (deser-hosted-zone-count (clojure.core/get-in letvar1586236 ["HostedZoneCount" :content]))}))))

(clojure.core/defn- response-no-such-query-logging-config ([input] (response-no-such-query-logging-config nil input)) ([resultWrapper1586238 input] (clojure.core/let [rawinput1586237 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586239 {"message" (portkey.aws/search-for-tag rawinput1586237 "message" :flattened? nil :result-wrapper resultWrapper1586238)}] (clojure.core/cond-> {} (letvar1586239 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586239 ["message" :content])))))))

(clojure.core/defn- response-update-health-check-response ([input] (response-update-health-check-response nil input)) ([resultWrapper1586241 input] (clojure.core/let [rawinput1586240 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586242 {"HealthCheck" (portkey.aws/search-for-tag rawinput1586240 "HealthCheck" :flattened? nil :result-wrapper resultWrapper1586241)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar1586242 ["HealthCheck" :content]))}))))

(clojure.core/defn- response-traffic-policy-in-use ([input] (response-traffic-policy-in-use nil input)) ([resultWrapper1586244 input] (clojure.core/let [rawinput1586243 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586245 {"message" (portkey.aws/search-for-tag rawinput1586243 "message" :flattened? nil :result-wrapper resultWrapper1586244)}] (clojure.core/cond-> {} (letvar1586245 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586245 ["message" :content])))))))

(clojure.core/defn- response-health-check-already-exists ([input] (response-health-check-already-exists nil input)) ([resultWrapper1586247 input] (clojure.core/let [rawinput1586246 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586248 {"message" (portkey.aws/search-for-tag rawinput1586246 "message" :flattened? nil :result-wrapper resultWrapper1586247)}] (clojure.core/cond-> {} (letvar1586248 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586248 ["message" :content])))))))

(clojure.core/defn- response-delegation-set-not-available ([input] (response-delegation-set-not-available nil input)) ([resultWrapper1586250 input] (clojure.core/let [rawinput1586249 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586251 {"message" (portkey.aws/search-for-tag rawinput1586249 "message" :flattened? nil :result-wrapper resultWrapper1586250)}] (clojure.core/cond-> {} (letvar1586251 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586251 ["message" :content])))))))

(clojure.core/defn- response-list-tags-for-resources-response ([input] (response-list-tags-for-resources-response nil input)) ([resultWrapper1586253 input] (clojure.core/let [rawinput1586252 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586254 {"ResourceTagSets" (portkey.aws/search-for-tag rawinput1586252 "ResourceTagSets" :flattened? nil :result-wrapper resultWrapper1586253)}] (clojure.core/cond-> {:resource-tag-sets (deser-resource-tag-set-list (clojure.core/get-in letvar1586254 ["ResourceTagSets" :content]))}))))

(clojure.core/defn- response-get-account-limit-response ([input] (response-get-account-limit-response nil input)) ([resultWrapper1586256 input] (clojure.core/let [rawinput1586255 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586257 {"Limit" (portkey.aws/search-for-tag rawinput1586255 "Limit" :flattened? nil :result-wrapper resultWrapper1586256), "Count" (portkey.aws/search-for-tag rawinput1586255 "Count" :flattened? nil :result-wrapper resultWrapper1586256)}] (clojure.core/cond-> {:limit (deser-account-limit (clojure.core/get-in letvar1586257 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar1586257 ["Count" :content]))}))))

(clojure.core/defn- response-vpc-association-authorization-not-found ([input] (response-vpc-association-authorization-not-found nil input)) ([resultWrapper1586259 input] (clojure.core/let [rawinput1586258 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586260 {"message" (portkey.aws/search-for-tag rawinput1586258 "message" :flattened? nil :result-wrapper resultWrapper1586259)}] (clojure.core/cond-> {} (letvar1586260 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586260 ["message" :content])))))))

(clojure.core/defn- response-no-such-traffic-policy-instance ([input] (response-no-such-traffic-policy-instance nil input)) ([resultWrapper1586262 input] (clojure.core/let [rawinput1586261 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586263 {"message" (portkey.aws/search-for-tag rawinput1586261 "message" :flattened? nil :result-wrapper resultWrapper1586262)}] (clojure.core/cond-> {} (letvar1586263 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586263 ["message" :content])))))))

(clojure.core/defn- response-update-hosted-zone-comment-response ([input] (response-update-hosted-zone-comment-response nil input)) ([resultWrapper1586265 input] (clojure.core/let [rawinput1586264 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586266 {"HostedZone" (portkey.aws/search-for-tag rawinput1586264 "HostedZone" :flattened? nil :result-wrapper resultWrapper1586265)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar1586266 ["HostedZone" :content]))}))))

(clojure.core/defn- response-list-traffic-policy-instances-by-hosted-zone-response ([input] (response-list-traffic-policy-instances-by-hosted-zone-response nil input)) ([resultWrapper1586268 input] (clojure.core/let [rawinput1586267 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586269 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput1586267 "TrafficPolicyInstances" :flattened? nil :result-wrapper resultWrapper1586268), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput1586267 "TrafficPolicyInstanceNameMarker" :flattened? nil :result-wrapper resultWrapper1586268), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput1586267 "TrafficPolicyInstanceTypeMarker" :flattened? nil :result-wrapper resultWrapper1586268), "IsTruncated" (portkey.aws/search-for-tag rawinput1586267 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586268), "MaxItems" (portkey.aws/search-for-tag rawinput1586267 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586268)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar1586269 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586269 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586269 ["MaxItems" :content]))} (letvar1586269 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar1586269 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar1586269 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar1586269 ["TrafficPolicyInstanceTypeMarker" :content])))))))

(clojure.core/defn- response-no-such-cloud-watch-logs-log-group ([input] (response-no-such-cloud-watch-logs-log-group nil input)) ([resultWrapper1586271 input] (clojure.core/let [rawinput1586270 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586272 {"message" (portkey.aws/search-for-tag rawinput1586270 "message" :flattened? nil :result-wrapper resultWrapper1586271)}] (clojure.core/cond-> {} (letvar1586272 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586272 ["message" :content])))))))

(clojure.core/defn- response-list-traffic-policy-instances-by-policy-response ([input] (response-list-traffic-policy-instances-by-policy-response nil input)) ([resultWrapper1586274 input] (clojure.core/let [rawinput1586273 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586275 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput1586273 "TrafficPolicyInstances" :flattened? nil :result-wrapper resultWrapper1586274), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput1586273 "HostedZoneIdMarker" :flattened? nil :result-wrapper resultWrapper1586274), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput1586273 "TrafficPolicyInstanceNameMarker" :flattened? nil :result-wrapper resultWrapper1586274), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput1586273 "TrafficPolicyInstanceTypeMarker" :flattened? nil :result-wrapper resultWrapper1586274), "IsTruncated" (portkey.aws/search-for-tag rawinput1586273 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1586274), "MaxItems" (portkey.aws/search-for-tag rawinput1586273 "MaxItems" :flattened? nil :result-wrapper resultWrapper1586274)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar1586275 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar1586275 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar1586275 ["MaxItems" :content]))} (letvar1586275 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar1586275 ["HostedZoneIdMarker" :content]))) (letvar1586275 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar1586275 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar1586275 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar1586275 ["TrafficPolicyInstanceTypeMarker" :content])))))))

(clojure.core/defn- response-create-health-check-response ([input] (response-create-health-check-response nil input)) ([resultWrapper1586277 input] (clojure.core/let [rawinput1586276 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586278 {"HealthCheck" (portkey.aws/search-for-tag rawinput1586276 "HealthCheck" :flattened? nil :result-wrapper resultWrapper1586277), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar1586278 ["HealthCheck" :content])), :location (deser-resource-uri (clojure.core/get-in letvar1586278 ["Location"]))}))))

(clojure.core/defn- response-delete-traffic-policy-response ([input] (response-delete-traffic-policy-response nil input)) ([resultWrapper1586280 input] (clojure.core/let [rawinput1586279 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586281 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-reusable-delegation-set-limit-response ([input] (response-get-reusable-delegation-set-limit-response nil input)) ([resultWrapper1586283 input] (clojure.core/let [rawinput1586282 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586284 {"Limit" (portkey.aws/search-for-tag rawinput1586282 "Limit" :flattened? nil :result-wrapper resultWrapper1586283), "Count" (portkey.aws/search-for-tag rawinput1586282 "Count" :flattened? nil :result-wrapper resultWrapper1586283)}] (clojure.core/cond-> {:limit (deser-reusable-delegation-set-limit (clojure.core/get-in letvar1586284 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar1586284 ["Count" :content]))}))))

(clojure.core/defn- response-delegation-set-already-created ([input] (response-delegation-set-already-created nil input)) ([resultWrapper1586286 input] (clojure.core/let [rawinput1586285 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586287 {"message" (portkey.aws/search-for-tag rawinput1586285 "message" :flattened? nil :result-wrapper resultWrapper1586286)}] (clojure.core/cond-> {} (letvar1586287 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586287 ["message" :content])))))))

(clojure.core/defn- response-hosted-zone-not-empty ([input] (response-hosted-zone-not-empty nil input)) ([resultWrapper1586289 input] (clojure.core/let [rawinput1586288 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586290 {"message" (portkey.aws/search-for-tag rawinput1586288 "message" :flattened? nil :result-wrapper resultWrapper1586289)}] (clojure.core/cond-> {} (letvar1586290 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1586290 ["message" :content])))))))

(clojure.core/defn- response-change-resource-record-sets-response ([input] (response-change-resource-record-sets-response nil input)) ([resultWrapper1586292 input] (clojure.core/let [rawinput1586291 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1586293 {"ChangeInfo" (portkey.aws/search-for-tag rawinput1586291 "ChangeInfo" :flattened? nil :result-wrapper resultWrapper1586292)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar1586293 ["ChangeInfo" :content]))}))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/insufficient-data-health-status #{"Healthy" :unhealthy "LastKnownStatus" :healthy :last-known-status "Unhealthy"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.update-traffic-policy-instance-request/id :portkey.aws.route53.-2013-04-01/ttl :portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/hosted-zone-limit))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-response/limit :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-traffic-policy-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-traffic-policy-request/version (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-traffic-policy-request/id :portkey.aws.route53.-2013-04-01.delete-traffic-policy-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-resource-type #{"healthcheck" :healthcheck "hostedzone" :hostedzone})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-pagination-token/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-pagination-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-pagination-token/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-subdivision-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.health-check/id :portkey.aws.route53.-2013-04-01.health-check/caller-reference :portkey.aws.route53.-2013-04-01/health-check-config :portkey.aws.route53.-2013-04-01/health-check-version] :opt-un [:portkey.aws.route53.-2013-04-01/linked-service :portkey.aws.route53.-2013-04-01/cloud-watch-alarm-configuration]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/disabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-name-servers (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/dns-name :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/id] :opt-un [:portkey.aws.route53.-2013-04-01/traffic-policy-version-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/search-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-rr-set-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.last-vpc-association/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/last-vpc-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.last-vpc-association/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-tag-set/resource-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-tag-set/resource-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-tag-set/tags (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-tag-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.resource-tag-set/resource-type :portkey.aws.route53.-2013-04-01.resource-tag-set/resource-id :portkey.aws.route53.-2013-04-01.resource-tag-set/tags]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/record-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/record-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/resolver-ip (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/ip-address))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/edns-0-client-subnet-ip (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/ip-address))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-request/edns-0-client-subnet-mask (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/subnet-mask))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/test-dns-answer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.test-dns-answer-request/hosted-zone-id :portkey.aws.route53.-2013-04-01.test-dns-answer-request/record-name :portkey.aws.route53.-2013-04-01.test-dns-answer-request/record-type] :opt-un [:portkey.aws.route53.-2013-04-01.test-dns-answer-request/resolver-ip :portkey.aws.route53.-2013-04-01.test-dns-answer-request/edns-0-client-subnet-ip :portkey.aws.route53.-2013-04-01.test-dns-answer-request/edns-0-client-subnet-mask]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.query-logging-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.query-logging-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-health-checks/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-health-checks (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-health-checks/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/rr-type #{:soa "CAA" :naptr "CNAME" :txt :ns "TXT" "SRV" :srv "AAAA" :caa "NS" "PTR" :mx :cname "NAPTR" "A" "SPF" :spf :ptr :aaaa :a "SOA" "MX"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/cloud-watch-logs-log-group-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.alias-target/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.alias-target/evaluate-target-health (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/alias-health-enabled))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/alias-target (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.alias-target/hosted-zone-id :portkey.aws.route53.-2013-04-01/dns-name :portkey.aws.route53.-2013-04-01.alias-target/evaluate-target-health] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/account-limit-type #{"MAX_REUSABLE_DELEGATION_SETS_BY_OWNER" "MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER" "MAX_HEALTH_CHECKS_BY_OWNER" "MAX_TRAFFIC_POLICIES_BY_OWNER" :max-hosted-zones-by-owner :max-reusable-delegation-sets-by-owner :max-traffic-policies-by-owner :max-traffic-policy-instances-by-owner "MAX_HOSTED_ZONES_BY_OWNER" :max-health-checks-by-owner})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-identifier (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-resource-record-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/hosted-zone-id] :opt-un [:portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-name :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-type :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/start-record-identifier :portkey.aws.route53.-2013-04-01.list-resource-record-sets-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-country-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-version-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/subnet-mask (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-summaries (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/traffic-policy-summary))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/period (clojure.spec.alpha/int-in 60 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/next-dns-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/next-hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zones :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/is-truncated :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01/dns-name :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/hosted-zone-id :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/next-dns-name :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-response/next-hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-sets (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/delegation-set))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-vpc-association-authorization-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-vpc-association-authorization-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/threshold clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-response/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-health-checks-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-checks :portkey.aws.route53.-2013-04-01.list-health-checks-response/marker :portkey.aws.route53.-2013-04-01.list-health-checks-response/is-truncated :portkey.aws.route53.-2013-04-01.list-health-checks-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-health-checks-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-resource-record-sets-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-resource-record-sets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.change-resource-record-sets-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/change-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-geo-location-request/continent-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-geo-location-request/country-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-geo-location-request/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-geo-location-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.get-geo-location-request/continent-code :portkey.aws.route53.-2013-04-01.get-geo-location-request/country-code :portkey.aws.route53.-2013-04-01.get-geo-location-request/subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/associate-vpc-comment (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-status-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-query-logging-config-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-query-logging-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.incompatible-version/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/incompatible-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.incompatible-version/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension-field (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/resource-tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zone] :opt-un [:portkey.aws.route53.-2013-04-01/delegation-set :portkey.aws.route53.-2013-04-01/vp-cs]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/nameserver (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policies :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/is-truncated :portkey.aws.route53.-2013-04-01/traffic-policy-version-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-vpc-association-authorization-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-vpc-association-authorization-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-not-private/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-not-private (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-not-private/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-batch/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/changes] :opt-un [:portkey.aws.route53.-2013-04-01.change-batch/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-status-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "cn-northwest-1" "ap-northeast-2" "eu-west-3" :cnnorthwest-1 :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2 "eu-north-1" :eunorth-1})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-hosted-zone-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-hosted-zone-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-response/next-token (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-response/hosted-zone-id :portkey.aws.route53.-2013-04-01/vp-cs] :opt-un [:portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-geo-location/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-geo-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-geo-location/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.limits-exceeded/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/limits-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.limits-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.public-zone-vpc-association/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/public-zone-vpc-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.public-zone-vpc-association/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.prior-request-not-complete/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/prior-request-not-complete (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.prior-request-not-complete/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy :portkey.aws.route53.-2013-04-01.create-traffic-policy-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-vpc-association-authorizations/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-vpc-association-authorizations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-vpc-association-authorizations/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/version (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/document (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.traffic-policy/id :portkey.aws.route53.-2013-04-01.traffic-policy/version :portkey.aws.route53.-2013-04-01.traffic-policy/name :portkey.aws.route53.-2013-04-01.traffic-policy/type :portkey.aws.route53.-2013-04-01.traffic-policy/document] :opt-un [:portkey.aws.route53.-2013-04-01.traffic-policy/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/hosted-zone-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/traffic-policy-instance-type-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2 "eu-north-1" :eunorth-1})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-traffic-policy-instance-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-query-logging-config-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-query-logging-config-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/cloud-watch-logs-log-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-tags-for-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-tags-for-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-tags-for-resource-request/resource-type :portkey.aws.route53.-2013-04-01.list-tags-for-resource-request/resource-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-response/record-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-response/record-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-response/response-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dnsr-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.test-dns-answer-response/protocol (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/transport-protocol))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/test-dns-answer-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/nameserver :portkey.aws.route53.-2013-04-01.test-dns-answer-response/record-name :portkey.aws.route53.-2013-04-01.test-dns-answer-response/record-type :portkey.aws.route53.-2013-04-01/record-data :portkey.aws.route53.-2013-04-01.test-dns-answer-response/response-code :portkey.aws.route53.-2013-04-01.test-dns-answer-response/protocol] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-checks (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/health-check))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-region #{:apnortheast-1 "ap-northeast-1" "eu-west-1" :useast-1 :apsoutheast-2 "ap-southeast-2" "sa-east-1" "ap-southeast-1" :uswest-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" :euwest-1 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-continent-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/version (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/id :portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/version :portkey.aws.route53.-2013-04-01.update-traffic-policy-comment-request/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/error-messages (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/error-message))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/failure-threshold (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01/dns-name :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-request/hosted-zone-id :portkey.aws.route53.-2013-04-01.list-hosted-zones-by-name-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-query-logging-config-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/checker-ip-ranges] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/document (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/id :portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/document] :opt-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-version-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-action #{"DELETE" :create :delete :upsert "CREATE" "UPSERT"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/child-health-check-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/health-check-id :max-count 256))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/checker-ip-ranges (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/ip-address-cidr))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-vpc-association-authorization-response/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-vpc-association-authorization-response/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set-not-reusable/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set-not-reusable/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-hosted-zone-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-hosted-zone-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.insufficient-cloud-watch-logs-resource-policy/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/insufficient-cloud-watch-logs-resource-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.insufficient-cloud-watch-logs-resource-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-traffic-policy-instances/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-instances (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-traffic-policy-instances/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.dimension/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.dimension/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.dimension/name :portkey.aws.route53.-2013-04-01.dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vp-cs (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/vpc :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/changes (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/change :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-health-check/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-health-check (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-health-check/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-traffic-policy/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-traffic-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-traffic-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-hosted-zone-comment-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-hosted-zone-comment-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.update-hosted-zone-comment-request/id] :opt-un [:portkey.aws.route53.-2013-04-01.update-hosted-zone-comment-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/comparison-operator #{"LessThanThreshold" :greater-than-threshold :less-than-threshold "GreaterThanThreshold" "LessThanOrEqualToThreshold" :greater-than-or-equal-to-threshold :less-than-or-equal-to-threshold "GreaterThanOrEqualToThreshold"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instance :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.linked-service/description (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/linked-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01/service-principal :portkey.aws.route53.-2013-04-01.linked-service/description]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.not-authorized-exception/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/not-authorized-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.not-authorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/hosted-zone-id] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/traffic-policy-instance-type-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-region-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/health-check-region :min-count 3 :max-count 64))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit-type #{"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-continent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-query-logging-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/query-logging-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-domain-name/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-domain-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-domain-name/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/delegation-sets :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/marker :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/is-truncated :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-request/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-request/document (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-document))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-request/name :portkey.aws.route53.-2013-04-01.create-traffic-policy-request/document] :opt-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone/config (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/hosted-zone-config))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone/resource-record-set-count (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/hosted-zone-rr-set-count))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.hosted-zone/id :portkey.aws.route53.-2013-04-01.hosted-zone/name :portkey.aws.route53.-2013-04-01.hosted-zone/caller-reference] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone/config :portkey.aws.route53.-2013-04-01.hosted-zone/resource-record-set-count :portkey.aws.route53.-2013-04-01/linked-service]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-change/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-change/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instances (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/traffic-policy-instance))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/page-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location/continent-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location/country-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.geo-location/continent-code :portkey.aws.route53.-2013-04-01.geo-location/country-code :portkey.aws.route53.-2013-04-01.geo-location/subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/ip-address-cidr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-health-check-request/child-health-checks (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/child-health-check-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-health-check-request/regions (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-region-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.update-health-check-request/reset-elements (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resettable-element-name-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un [:portkey.aws.route53.-2013-04-01/insufficient-data-health-status :portkey.aws.route53.-2013-04-01/disabled :portkey.aws.route53.-2013-04-01/search-string :portkey.aws.route53.-2013-04-01/health-check-version :portkey.aws.route53.-2013-04-01/failure-threshold :portkey.aws.route53.-2013-04-01.update-health-check-request/child-health-checks :portkey.aws.route53.-2013-04-01.update-health-check-request/regions :portkey.aws.route53.-2013-04-01/port :portkey.aws.route53.-2013-04-01/ip-address :portkey.aws.route53.-2013-04-01/resource-path :portkey.aws.route53.-2013-04-01/alarm-identifier :portkey.aws.route53.-2013-04-01/enable-sni :portkey.aws.route53.-2013-04-01.update-health-check-request/reset-elements :portkey.aws.route53.-2013-04-01/health-threshold :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name :portkey.aws.route53.-2013-04-01/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/child-health-checks (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/child-health-check-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/regions (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-region-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.health-check-config/type] :opt-un [:portkey.aws.route53.-2013-04-01/insufficient-data-health-status :portkey.aws.route53.-2013-04-01/disabled :portkey.aws.route53.-2013-04-01/search-string :portkey.aws.route53.-2013-04-01/failure-threshold :portkey.aws.route53.-2013-04-01.health-check-config/child-health-checks :portkey.aws.route53.-2013-04-01.health-check-config/regions :portkey.aws.route53.-2013-04-01/port :portkey.aws.route53.-2013-04-01/ip-address :portkey.aws.route53.-2013-04-01/resource-path :portkey.aws.route53.-2013-04-01/alarm-identifier :portkey.aws.route53.-2013-04-01/enable-sni :portkey.aws.route53.-2013-04-01/measure-latency :portkey.aws.route53.-2013-04-01/health-threshold :portkey.aws.route53.-2013-04-01/request-interval :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name :portkey.aws.route53.-2013-04-01/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/status (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-status))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/submitted-at (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-info (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.change-info/id :portkey.aws.route53.-2013-04-01.change-info/status :portkey.aws.route53.-2013-04-01.change-info/submitted-at] :opt-un [:portkey.aws.route53.-2013-04-01.change-info/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/dimension :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-request/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-hosted-zones-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-hosted-zones-request/marker :portkey.aws.route53.-2013-04-01.list-hosted-zones-request/max-items :portkey.aws.route53.-2013-04-01.list-hosted-zones-request/delegation-set-id]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-version (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-change-batch/messages (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-messages))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-change-batch/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-change-batch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-change-batch/messages :portkey.aws.route53.-2013-04-01.invalid-change-batch/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/continent-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/continent-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/country-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/country-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/subdivision-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.geo-location-details/subdivision-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.geo-location-details/continent-code :portkey.aws.route53.-2013-04-01.geo-location-details/continent-name :portkey.aws.route53.-2013-04-01.geo-location-details/country-code :portkey.aws.route53.-2013-04-01.geo-location-details/country-name :portkey.aws.route53.-2013-04-01.geo-location-details/subdivision-code :portkey.aws.route53.-2013-04-01.geo-location-details/subdivision-name]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-status #{:pending "INSYNC" "PENDING" :insync})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dnsr-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-input/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-input/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/delegation-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instance] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-not-found/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-vpc-id/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-vpc-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-vpc-id/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/ttl clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-delegation-set/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-delegation-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-delegation-set/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resettable-element-name-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/resettable-element-name :max-count 64))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-query-logging-configs-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-query-logging-configs-request/next-token (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-query-logging-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-query-logging-configs-request/hosted-zone-id :portkey.aws.route53.-2013-04-01.list-query-logging-configs-request/next-token :portkey.aws.route53.-2013-04-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-weight clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-traffic-policy-versions-for-current-policy/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-versions-for-current-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-traffic-policy-versions-for-current-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-tag-set-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/resource-tag-set))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/tag :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.conflicting-domain-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/conflicting-domain-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.conflicting-domain-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/tag-key :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-change-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-change-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-change-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-request/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-request/marker :portkey.aws.route53.-2013-04-01.list-reusable-delegation-sets-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/record-data-entry (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.concurrent-modification/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/concurrent-modification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.concurrent-modification/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set-in-use/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-query-logging-configs-response/next-token (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-query-logging-configs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/query-logging-configs] :opt-un [:portkey.aws.route53.-2013-04-01.list-query-logging-configs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-request/next-token (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/pagination-token))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-request/hosted-zone-id] :opt-un [:portkey.aws.route53.-2013-04-01.list-vpc-association-authorizations-request/next-token :portkey.aws.route53.-2013-04-01/max-results]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-observation/region (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-region))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-observation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.health-check-observation/region :portkey.aws.route53.-2013-04-01/ip-address :portkey.aws.route53.-2013-04-01/status-report]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dns-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-configs (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/query-logging-config))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/type :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-records (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/resource-record :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 102400))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/hosted-zone-id :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/name :portkey.aws.route53.-2013-04-01/ttl :portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/next-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-hosted-zones-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zones :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/marker :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/is-truncated :portkey.aws.route53.-2013-04-01.list-hosted-zones-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-hosted-zones-response/next-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-query-logging-config-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-query-logging-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-query-logging-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-limit/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/hosted-zone-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-limit/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.hosted-zone-limit/type :portkey.aws.route53.-2013-04-01.hosted-zone-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.account-limit/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/account-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.account-limit/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/account-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.account-limit/type :portkey.aws.route53.-2013-04-01.account-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-config-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.query-logging-config/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.query-logging-config/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.query-logging-config/id :portkey.aws.route53.-2013-04-01.query-logging-config/hosted-zone-id :portkey.aws.route53.-2013-04-01/cloud-watch-logs-log-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zone :portkey.aws.route53.-2013-04-01/change-info :portkey.aws.route53.-2013-04-01/delegation-set :portkey.aws.route53.-2013-04-01.create-hosted-zone-response/location] :opt-un [:portkey.aws.route53.-2013-04-01/vpc]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set/name-servers (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delegation-set-name-servers))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delegation-set/name-servers] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set/id :portkey.aws.route53.-2013-04-01.delegation-set/caller-reference]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-multi-value-answer clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-in-use/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.health-check-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/traffic-policy-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policies-request/traffic-policy-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-failover #{:primary :secondary "SECONDARY" "PRIMARY"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 45)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-health-check-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instance] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-traffic-policies/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-traffic-policies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-traffic-policies/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-query-logging-config-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-query-logging-config-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/query-logging-config :portkey.aws.route53.-2013-04-01.create-query-logging-config-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change/action (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-action))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.change/action :portkey.aws.route53.-2013-04-01/resource-record-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.traffic-policy-instance-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-summary/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-summary/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-summary/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-summary/latest-version (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-summary/traffic-policy-count (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.traffic-policy-summary/id :portkey.aws.route53.-2013-04-01.traffic-policy-summary/name :portkey.aws.route53.-2013-04-01.traffic-policy-summary/type :portkey.aws.route53.-2013-04-01.traffic-policy-summary/latest-version :portkey.aws.route53.-2013-04-01.traffic-policy-summary/traffic-policy-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/delegation-set :portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance/traffic-policy-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance/state (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-instance-state))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-instance/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.traffic-policy-instance/id :portkey.aws.route53.-2013-04-01.traffic-policy-instance/hosted-zone-id :portkey.aws.route53.-2013-04-01.traffic-policy-instance/name :portkey.aws.route53.-2013-04-01/ttl :portkey.aws.route53.-2013-04-01.traffic-policy-instance/state :portkey.aws.route53.-2013-04-01/message :portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version :portkey.aws.route53.-2013-04-01.traffic-policy-instance/traffic-policy-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resettable-element-name #{:fully-qualified-domain-name :resource-path "ChildHealthChecks" :regions "Regions" :child-health-checks "ResourcePath" "FullyQualifiedDomainName"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-identifier (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-resource-record-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/resource-record-sets :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/is-truncated :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-name :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-type :portkey.aws.route53.-2013-04-01.list-resource-record-sets-response/next-record-identifier]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.invalid-traffic-policy-document/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/invalid-traffic-policy-document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.invalid-traffic-policy-document/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-health-check-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-health-check-request/caller-reference :portkey.aws.route53.-2013-04-01/health-check-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-country-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instance-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/r-data))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.resource-record/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/alarm-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-hosted-zone/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-hosted-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-hosted-zone/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/usage-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-config/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-config/private-zone (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/is-private-zone))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-config/comment :portkey.aws.route53.-2013-04-01.hosted-zone-config/private-zone]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-continent-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-country-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-subdivision-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-geo-locations-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/geo-location-details-list :portkey.aws.route53.-2013-04-01.list-geo-locations-response/is-truncated :portkey.aws.route53.-2013-04-01.list-geo-locations-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-continent-code :portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-country-code :portkey.aws.route53.-2013-04-01.list-geo-locations-response/next-subdivision-code]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.associate-vpc-with-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.associate-vpc-with-hosted-zone-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/associate-vpc-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.associate-vpc-with-hosted-zone-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un [:portkey.aws.route53.-2013-04-01.associate-vpc-with-hosted-zone-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.conflicting-types/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/conflicting-types (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.conflicting-types/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-limit-type #{"MAX_VPCS_ASSOCIATED_BY_ZONE" :max-rrsets-by-zone "MAX_RRSETS_BY_ZONE" :max-vpcs-associated-by-zone})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.traffic-policy-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policies (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/traffic-policy))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-details-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/geo-location-details))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.alarm-identifier/region (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/cloud-watch-region))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.alarm-identifier/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/alarm-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/alarm-identifier (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.alarm-identifier/region :portkey.aws.route53.-2013-04-01.alarm-identifier/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-request/marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-marker))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-health-checks-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-health-checks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-health-checks-request/marker :portkey.aws.route53.-2013-04-01.list-health-checks-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/is-private-zone clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set-already-reusable/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-already-reusable (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set-already-reusable/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.vpc-association-not-found/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-association-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.vpc-association-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/enable-sni clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-type #{:http-str-match :tcp :calculated :https-str-match "TCP" "CALCULATED" "HTTP_STR_MATCH" "HTTPS_STR_MATCH" "CLOUDWATCH_METRIC" "HTTPS" :http :cloudwatch-metric "HTTP" :https})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-version-mismatch/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-version-mismatch (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.health-check-version-mismatch/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-change-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/hosted-zone-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-request/type :portkey.aws.route53.-2013-04-01.get-hosted-zone-limit-request/hosted-zone-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/add-tags (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/remove-tag-keys (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/resource-type :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/resource-id] :opt-un [:portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/add-tags :portkey.aws.route53.-2013-04-01.change-tags-for-resource-request/remove-tag-keys]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/record-data (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/record-data-entry))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/r-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4000))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/traffic-policy-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policies-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-summaries :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/is-truncated :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/traffic-policy-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policies-response/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/alias-health-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-observations (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/health-check-observation))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-geo-location-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/geo-location-details] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instances :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/is-truncated :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/hosted-zone-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/max-results (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.tag/key (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.tag/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.tag/key :portkey.aws.route53.-2013-04-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/disassociate-vpc-comment (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/page-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-request/caller-reference] :opt-un [:portkey.aws.route53.-2013-04-01.create-reusable-delegation-set-request/hosted-zone-id]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-traffic-policy-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-traffic-policy-request/version (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-version))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-traffic-policy-request/id :portkey.aws.route53.-2013-04-01.get-traffic-policy-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.too-many-hosted-zones/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/too-many-hosted-zones (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.too-many-hosted-zones/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.disassociate-vpc-from-hosted-zone-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.disassociate-vpc-from-hosted-zone-request/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/disassociate-vpc-comment))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.disassociate-vpc-from-hosted-zone-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un [:portkey.aws.route53.-2013-04-01.disassociate-vpc-from-hosted-zone-request/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/measure-latency clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zone-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-query-logging-config/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-query-logging-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-query-logging-config/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/transport-protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.traffic-policy-in-use/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.traffic-policy-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-reusable-delegation-set-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-reusable-delegation-set-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-already-exists/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.health-check-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zones (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/hosted-zone))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set-not-available/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-not-available (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set-not-available/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-tags-for-resources-response/resource-tag-sets (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-tag-set-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-tags-for-resources-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-tags-for-resources-response/resource-tag-sets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/evaluation-periods (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-account-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/account-limit))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-account-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-account-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-account-limit-response/limit :portkey.aws.route53.-2013-04-01.get-account-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.vpc-association-authorization-not-found/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-association-authorization-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.vpc-association-authorization-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-sets (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/resource-record-set))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-threshold (clojure.spec.alpha/int-in 0 256))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-account-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/account-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-account-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-account-limit-request/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-traffic-policy-instance/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-traffic-policy-instance/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/set-identifier (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-identifier))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/weight (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-weight))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/multi-value-answer (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-multi-value-answer))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/failover (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-failover))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record-set/region (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-record-set-region))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.resource-record-set/name :portkey.aws.route53.-2013-04-01.resource-record-set/type] :opt-un [:portkey.aws.route53.-2013-04-01/alias-target :portkey.aws.route53.-2013-04-01/geo-location :portkey.aws.route53.-2013-04-01/ttl :portkey.aws.route53.-2013-04-01.resource-record-set/set-identifier :portkey.aws.route53.-2013-04-01.resource-record-set/weight :portkey.aws.route53.-2013-04-01/health-check-id :portkey.aws.route53.-2013-04-01.resource-record-set/multi-value-answer :portkey.aws.route53.-2013-04-01/resource-records :portkey.aws.route53.-2013-04-01.resource-record-set/failover :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id :portkey.aws.route53.-2013-04-01.resource-record-set/region]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zone] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instances :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/is-truncated :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-hosted-zone-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-resource-id-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/tag-resource-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-cloud-watch-logs-log-group/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-cloud-watch-logs-log-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-cloud-watch-logs-log-group/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instances :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/is-truncated :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/max-items] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/hosted-zone-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-response/traffic-policy-instance-type-marker]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-count-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-health-check-response/location (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-uri))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-health-check-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check :portkey.aws.route53.-2013-04-01.create-health-check-response/location] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/request-interval (clojure.spec.alpha/int-in 10 30))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-traffic-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-response/limit (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-response/count (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/usage-count))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-response/limit :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-response/count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/time-stamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.cloud-watch-alarm-configuration/dimensions (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dimension-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/cloud-watch-alarm-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/evaluation-periods :portkey.aws.route53.-2013-04-01/threshold :portkey.aws.route53.-2013-04-01/comparison-operator :portkey.aws.route53.-2013-04-01/period :portkey.aws.route53.-2013-04-01/metric-name :portkey.aws.route53.-2013-04-01/namespace :portkey.aws.route53.-2013-04-01/statistic] :opt-un [:portkey.aws.route53.-2013-04-01.cloud-watch-alarm-configuration/dimensions]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-traffic-policy-instance-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-traffic-policy-instance-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-request/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-request/type :portkey.aws.route53.-2013-04-01.get-reusable-delegation-set-limit-request/delegation-set-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delegation-set-already-created/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-already-created (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.delegation-set-already-created/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.status-report/checked-time (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/status-report (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01/status :portkey.aws.route53.-2013-04-01.status-report/checked-time]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-tags-for-resources-request/resource-type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-tags-for-resources-request/resource-ids (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/tag-resource-id-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-tags-for-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-tags-for-resources-request/resource-type :portkey.aws.route53.-2013-04-01.list-tags-for-resources-request/resource-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01/vpc-region :portkey.aws.route53.-2013-04-01/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-continent-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-continent-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-country-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-country-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-subdivision-code (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-geo-locations-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-geo-locations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-continent-code :portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-country-code :portkey.aws.route53.-2013-04-01.list-geo-locations-request/start-subdivision-code :portkey.aws.route53.-2013-04-01.list-geo-locations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-not-empty/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-not-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-not-empty/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-resource-record-sets-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/change-info] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/limit-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/page-max-items (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/inverted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/cloud-watch-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "sa-east-1" "ap-southeast-1" "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2 "eu-north-1" :eunorth-1})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-hosted-zone-request/name :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/caller-reference] :opt-un [:portkey.aws.route53.-2013-04-01/vpc :portkey.aws.route53.-2013-04-01/hosted-zone-config :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/delegation-set-id]))

(clojure.core/defn get-reusable-delegation-set-limit "Gets the maximum number of hosted zones that you can associate with the\nspecified reusable delegation set.\n For the default limit, see Limits\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html)\nin the Amazon Route 53 Developer Guide. To request a higher limit, open a case\n(https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&limitType=service-code-route53)." ([get-reusable-delegation-set-limit-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-reusable-delegation-set-limit-request get-reusable-delegation-set-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/reusabledelegationsetlimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReusableDelegationSetLimit", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-response))

(clojure.core/defn list-tags-for-resources "Lists tags for up to 10 health checks or hosted zones.\n For information about using tags for cost allocation, see Using Cost Allocation\nTags\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide." ([list-tags-for-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resources-request list-tags-for-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resources-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResources", :http.request.configuration/output-deser-fn response-list-tags-for-resources-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resources :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-tags-for-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-tags-for-resources-response))

(clojure.core/defn delete-traffic-policy-instance "Deletes a traffic policy instance and all of the resource record sets that\nAmazon Route 53 created when you created the instance.\n In the Route 53 console, traffic policy instances are known as policy records." ([delete-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-traffic-policy-instance-request delete-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-delete-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef delete-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-response))

(clojure.core/defn list-geo-locations "Retrieves a list of supported geographic locations.\n Countries are listed first, and continents are listed last. If Amazon Route 53\nsupports subdivisions for a country (for example, states or provinces), the\nsubdivisions for that country are listed in alphabetical order immediately after\nthe corresponding country." ([] (list-geo-locations {})) ([list-geo-locations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-geo-locations-request list-geo-locations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-geo-locations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocations", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-geo-locations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGeoLocations", :http.request.configuration/output-deser-fn response-list-geo-locations-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-geo-locations :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-geo-locations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-geo-locations-response))

(clojure.core/defn disassociate-vpc-from-hosted-zone "Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the\nfollowing:\n * You can't disassociate the last VPC from a private hosted zone.\n * You can't convert a private hosted zone into a public hosted zone.\n * You can submit a DisassociateVPCFromHostedZone request using either the\naccount that created the hosted zone or the account that created the VPC." ([disassociate-vpc-from-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-vpc-from-hosted-zone-request disassociate-vpc-from-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/disassociatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateVPCFromHostedZone", :http.request.configuration/output-deser-fn response-disassociate-vpc-from-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "VPCAssociationNotFound" :portkey.aws.route53.-2013-04-01/vpc-association-not-found, "LastVPCAssociation" :portkey.aws.route53.-2013-04-01/last-vpc-association, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef disassociate-vpc-from-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-response))

(clojure.core/defn delete-query-logging-config "Deletes a configuration for DNS query logging. If you delete a configuration,\nAmazon Route 53 stops sending query logs to CloudWatch Logs. Route 53 doesn't\ndelete any logs that are already in CloudWatch Logs.\n For more information about DNS query logs, see CreateQueryLoggingConfig." ([delete-query-logging-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-query-logging-config-request delete-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteQueryLoggingConfig", :http.request.configuration/output-deser-fn response-delete-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "NoSuchQueryLoggingConfig" :portkey.aws.route53.-2013-04-01/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-query-logging-config-response))

(clojure.core/defn get-traffic-policy-instance "Gets information about a specified traffic policy instance.\n After you submit a CreateTrafficPolicyInstance or an\nUpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53\ncreates the resource record sets that are specified in the traffic policy\ndefinition. For more information, see the State response element.\n In the Route 53 console, traffic policy instances are known as policy records." ([get-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-traffic-policy-instance-request get-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-response))

(clojure.core/defn create-traffic-policy "Creates a traffic policy, which you use to create multiple DNS resource record\nsets for one domain name (such as example.com) or one subdomain name (such as\nwww.example.com)." ([create-traffic-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-traffic-policy-request create-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrafficPolicy", :http.request.configuration/output-deser-fn response-create-traffic-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicies" :portkey.aws.route53.-2013-04-01/too-many-traffic-policies, "TrafficPolicyAlreadyExists" :portkey.aws.route53.-2013-04-01/traffic-policy-already-exists, "InvalidTrafficPolicyDocument" :portkey.aws.route53.-2013-04-01/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-response))

(clojure.core/defn get-checker-ip-ranges " GetCheckerIpRanges still works, but we recommend that you download\nip-ranges.json, which includes IP address ranges for all AWS services. For more\ninformation, see IP Address Ranges of Amazon Route 53 Servers\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html)\nin the Amazon Route 53 Developer Guide." ([] (get-checker-ip-ranges {})) ([get-checker-ip-ranges-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-checker-ip-ranges-request get-checker-ip-ranges-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/checkeripranges", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCheckerIpRanges", :http.request.configuration/output-deser-fn response-get-checker-ip-ranges-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-checker-ip-ranges :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-response))

(clojure.core/defn get-health-check-status "Gets status of a specified health check." ([get-health-check-status-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-health-check-status-request get-health-check-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-status-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/status", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-status-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHealthCheckStatus", :http.request.configuration/output-deser-fn response-get-health-check-status-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-status :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-status-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-status-response))

(clojure.core/defn create-traffic-policy-instance "Creates resource record sets in a specified hosted zone based on the settings in\na specified traffic policy version. In addition, CreateTrafficPolicyInstance\nassociates the resource record sets with a specified domain name (such as\nexample.com) or subdomain name (such as www.example.com). Amazon Route 53\nresponds to DNS queries for the domain or subdomain name by using the resource\nrecord sets that CreateTrafficPolicyInstance created." ([create-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-traffic-policy-instance-request create-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-create-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicyInstances" :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-instances, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "TrafficPolicyInstanceAlreadyExists" :portkey.aws.route53.-2013-04-01/traffic-policy-instance-already-exists}})))))
(clojure.spec.alpha/fdef create-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-response))

(clojure.core/defn create-vpc-association-authorization "Authorizes the AWS account that created a specified VPC to submit an\nAssociateVPCWithHostedZone request to associate the VPC with a specified hosted\nzone that was created by a different account. To submit a\nCreateVPCAssociationAuthorization request, you must use the account that created\nthe hosted zone. After you authorize the association, use the account that\ncreated the VPC to submit an AssociateVPCWithHostedZone request.\n If you want to associate multiple VPCs that you created by using one account\nwith a hosted zone that you created by using a different account, you must\nsubmit one authorization request for each VPC." ([create-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-vpc-association-authorization-request create-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-create-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "TooManyVPCAssociationAuthorizations" :portkey.aws.route53.-2013-04-01/too-many-vpc-association-authorizations, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef create-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-response))

(clojure.core/defn get-account-limit "Gets the specified limit for the current account, for example, the maximum\nnumber of health checks that you can create using the account.\n For the default limit, see Limits\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html)\nin the Amazon Route 53 Developer Guide. To request a higher limit, open a case\n(https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&limitType=service-code-route53)." ([get-account-limit-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-account-limit-request get-account-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-account-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/accountlimit/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-account-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccountLimit", :http.request.configuration/output-deser-fn response-get-account-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-account-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-account-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-account-limit-response))

(clojure.core/defn get-reusable-delegation-set "Retrieves information about a specified reusable delegation set, including the\nfour name servers that are assigned to the delegation set." ([get-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-reusable-delegation-set-request get-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetReusableDelegationSet", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-response))

(clojure.core/defn get-traffic-policy "Gets information about a specific traffic policy version." ([get-traffic-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-traffic-policy-request get-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrafficPolicy", :http.request.configuration/output-deser-fn response-get-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-response))

(clojure.core/defn list-traffic-policy-instances "Gets information about the traffic policy instances that you created by using\nthe current AWS account.\n After you submit an UpdateTrafficPolicyInstance request, there's a brief delay\nwhile Amazon Route 53 creates the resource record sets that are specified in the\ntraffic policy definition. For more information, see the State response element.\n Route 53 returns a maximum of 100 items in each response. If you have a lot of\ntraffic policy instances, you can use the MaxItems parameter to list them in\ngroups of up to 100." ([] (list-traffic-policy-instances {})) ([list-traffic-policy-instances-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-traffic-policy-instances-request list-traffic-policy-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrafficPolicyInstances", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-response))

(clojure.core/defn create-traffic-policy-version "Creates a new version of an existing traffic policy. When you create a new\nversion of a traffic policy, you specify the ID of the traffic policy that you\nwant to update and a JSON-formatted document that describes the new version. You\nuse traffic policies to create multiple DNS resource record sets for one domain\nname (such as example.com) or one subdomain name (such as www.example.com). You\ncan create a maximum of 1000 versions of a traffic policy. If you reach the\nlimit and need to create another version, you'll need to start a new traffic\npolicy." ([create-traffic-policy-version-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-traffic-policy-version-request create-traffic-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrafficPolicyVersion", :http.request.configuration/output-deser-fn response-create-traffic-policy-version-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicyVersionsForCurrentPolicy" :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-versions-for-current-policy, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "InvalidTrafficPolicyDocument" :portkey.aws.route53.-2013-04-01/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-response))

(clojure.core/defn list-hosted-zones-by-name "Retrieves a list of your hosted zones in lexicographic order. The response\nincludes a HostedZones child element for each hosted zone created by the current\nAWS account.\n ListHostedZonesByName sorts hosted zones by name with the labels reversed. For\nexample:\n com.example.www.\n Note the trailing dot, which can change the sort order in some circumstances.\n If the domain name includes escape characters or Punycode,\nListHostedZonesByName alphabetizes the domain name using the escaped or\nPunycoded value, which is the format that Amazon Route 53 saves in its database.\nFor example, to create a hosted zone for exämple.com, you specify ex\\344mple.com\nfor the domain name. ListHostedZonesByName alphabetizes it as:\n com.ex\\344mple.\n The labels are reversed and alphabetized using the escaped value. For more\ninformation about valid domain name formats, including internationalized domain\nnames, see DNS Domain Name Format\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html)\nin the Amazon Route 53 Developer Guide.\n Route 53 returns up to 100 items in each response. If you have a lot of hosted\nzones, use the MaxItems parameter to list them in groups of up to 100. The\nresponse includes values that help navigate from one group of MaxItems hosted\nzones to the next:\n * The DNSName and HostedZoneId elements in the response contain the values, if\nany, specified for the dnsname and hostedzoneid parameters in the request that\nproduced the current response.\n * The MaxItems element in the response contains the value, if any, that you\nspecified for the maxitems parameter in the request that produced the current\nresponse.\n * If the value of IsTruncated in the response is true, there are more hosted\nzones associated with the current AWS account.\n If IsTruncated is false, this response includes the last hosted zone that is\nassociated with the current account. The NextDNSName element and\nNextHostedZoneId elements are omitted from the response.\n * The NextDNSName and NextHostedZoneId elements in the response contain the\ndomain name and the hosted zone ID of the next hosted zone that is associated\nwith the current AWS account. If you want to list more hosted zones, make\nanother call to ListHostedZonesByName, and specify the value of NextDNSName and\nNextHostedZoneId in the dnsname and hostedzoneid parameters, respectively." ([] (list-hosted-zones-by-name {})) ([list-hosted-zones-by-name-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-hosted-zones-by-name-request list-hosted-zones-by-name-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonesbyname", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHostedZonesByName", :http.request.configuration/output-deser-fn response-list-hosted-zones-by-name-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name}})))))
(clojure.spec.alpha/fdef list-hosted-zones-by-name :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-response))

(clojure.core/defn delete-health-check "Deletes a health check.\n Amazon Route 53 does not prevent you from deleting a health check even if the\nhealth check is associated with one or more resource record sets. If you delete\na health check and you don't update the associated resource record sets, the\nfuture status of the health check can't be predicted and may change. This will\naffect the routing of DNS queries for your DNS failover configuration. For more\ninformation, see Replacing and Deleting Health Checks\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html)\nin the Amazon Route 53 Developer Guide." ([delete-health-check-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-health-check-request delete-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteHealthCheck", :http.request.configuration/output-deser-fn response-delete-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "HealthCheckInUse" :portkey.aws.route53.-2013-04-01/health-check-in-use, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-health-check-response))

(clojure.core/defn delete-reusable-delegation-set "Deletes a reusable delegation set.\n You can delete a reusable delegation set only if it isn't associated with any\nhosted zones.\n To verify that the reusable delegation set is not associated with any hosted\nzones, submit a GetReusableDelegationSet request and specify the ID of the\nreusable delegation set that you want to delete." ([delete-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-reusable-delegation-set-request delete-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteReusableDelegationSet", :http.request.configuration/output-deser-fn response-delete-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetInUse" :portkey.aws.route53.-2013-04-01/delegation-set-in-use, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response))

(clojure.core/defn list-traffic-policy-versions "Gets information about all of the versions for a specified traffic policy.\n Traffic policy versions are listed in numerical order by VersionNumber." ([list-traffic-policy-versions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-traffic-policy-versions-request list-traffic-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies/{Id}/versions", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrafficPolicyVersions", :http.request.configuration/output-deser-fn response-list-traffic-policy-versions-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response))

(clojure.core/defn list-tags-for-resource "Lists tags for one health check or hosted zone.\n For information about using tags for cost allocation, see Using Cost Allocation\nTags\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response))

(clojure.core/defn list-hosted-zones "Retrieves a list of the public and private hosted zones that are associated with\nthe current AWS account. The response includes a HostedZones child element for\neach hosted zone.\n Amazon Route 53 returns a maximum of 100 items in each response. If you have a\nlot of hosted zones, you can use the maxitems parameter to list them in groups\nof up to 100." ([] (list-hosted-zones {})) ([list-hosted-zones-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-hosted-zones-request list-hosted-zones-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHostedZones", :http.request.configuration/output-deser-fn response-list-hosted-zones-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable}})))))
(clojure.spec.alpha/fdef list-hosted-zones :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-hosted-zones-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-hosted-zones-response))

(clojure.core/defn get-hosted-zone-limit "Gets the specified limit for a specified hosted zone, for example, the maximum\nnumber of records that you can create in the hosted zone.\n For the default limit, see Limits\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html)\nin the Amazon Route 53 Developer Guide. To request a higher limit, open a case\n(https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&limitType=service-code-route53)." ([get-hosted-zone-limit-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-hosted-zone-limit-request get-hosted-zone-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonelimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHostedZoneLimit", :http.request.configuration/output-deser-fn response-get-hosted-zone-limit-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "HostedZoneNotPrivate" :portkey.aws.route53.-2013-04-01/hosted-zone-not-private}})))))
(clojure.spec.alpha/fdef get-hosted-zone-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-response))

(clojure.core/defn update-health-check "Updates an existing health check. Note that some values can't be updated.\n For more information about updating health checks, see Creating, Updating, and\nDeleting Health Checks\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html)\nin the Amazon Route 53 Developer Guide." ([update-health-check-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-health-check-request update-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateHealthCheck", :http.request.configuration/output-deser-fn response-update-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "HealthCheckVersionMismatch" :portkey.aws.route53.-2013-04-01/health-check-version-mismatch}})))))
(clojure.spec.alpha/fdef update-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-health-check-response))

(clojure.core/defn get-geo-location "Gets information about whether a specified geographic location is supported for\nAmazon Route 53 geolocation resource record sets.\n Use the following syntax to determine whether a continent is supported for\ngeolocation:\n GET /2013-04-01/geolocation?continentcode=two-letter abbreviation for a\ncontinent\n Use the following syntax to determine whether a country is supported for\ngeolocation:\n GET /2013-04-01/geolocation?countrycode=two-character country code\n Use the following syntax to determine whether a subdivision of a country is\nsupported for geolocation:\n GET /2013-04-01/geolocation?countrycode=two-character country\ncode&subdivisioncode=subdivision code" ([] (get-geo-location {})) ([get-geo-location-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-geo-location-request get-geo-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-geo-location-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-geo-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetGeoLocation", :http.request.configuration/output-deser-fn response-get-geo-location-response, :http.request.spec/error-spec {"NoSuchGeoLocation" :portkey.aws.route53.-2013-04-01/no-such-geo-location, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-geo-location :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-geo-location-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-geo-location-response))

(clojure.core/defn update-traffic-policy-comment "Updates the comment for a specified traffic policy version." ([update-traffic-policy-comment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-traffic-policy-comment-request update-traffic-policy-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrafficPolicyComment", :http.request.configuration/output-deser-fn response-update-traffic-policy-comment-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification}})))))
(clojure.spec.alpha/fdef update-traffic-policy-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-response))

(clojure.core/defn get-traffic-policy-instance-count "Gets the number of traffic policy instances that are associated with the current\nAWS account." ([] (get-traffic-policy-instance-count {})) ([get-traffic-policy-instance-count-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-traffic-policy-instance-count-request get-traffic-policy-instance-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstancecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTrafficPolicyInstanceCount", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response))

(clojure.core/defn get-hosted-zone "Gets information about a specified hosted zone including the four name servers\nassigned to the hosted zone." ([get-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-hosted-zone-request get-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHostedZone", :http.request.configuration/output-deser-fn response-get-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-response))

(clojure.core/defn list-vpc-association-authorizations "Gets a list of the VPCs that were created by other accounts and that can be\nassociated with a specified hosted zone because you've submitted one or more\nCreateVPCAssociationAuthorization requests.\n The response includes a VPCs element with a VPC child element for each VPC that\ncan be associated with the hosted zone." ([list-vpc-association-authorizations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-vpc-association-authorizations-request list-vpc-association-authorizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVPCAssociationAuthorizations", :http.request.configuration/output-deser-fn response-list-vpc-association-authorizations-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidPaginationToken" :portkey.aws.route53.-2013-04-01/invalid-pagination-token}})))))
(clojure.spec.alpha/fdef list-vpc-association-authorizations :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-response))

(clojure.core/defn list-traffic-policies "Gets information about the latest version for every traffic policy that is\nassociated with the current AWS account. Policies are listed in the order that\nthey were created in." ([] (list-traffic-policies {})) ([list-traffic-policies-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-traffic-policies-request list-traffic-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policies-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrafficPolicies", :http.request.configuration/output-deser-fn response-list-traffic-policies-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-traffic-policies :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-traffic-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policies-response))

(clojure.core/defn create-hosted-zone "Creates a new public or private hosted zone. You create records in a public\nhosted zone to define how you want to route traffic on the internet for a\ndomain, such as example.com, and its subdomains (apex.example.com,\nacme.example.com). You create records in a private hosted zone to define how you\nwant to route traffic for a domain and its subdomains within one or more Amazon\nVirtual Private Clouds (Amazon VPCs).\n You can't convert a public hosted zone to a private hosted zone or vice versa.\nInstead, you must create a new hosted zone with the same name and create new\nresource record sets.\n For more information about charges for hosted zones, see Amazon Route 53\nPricing (http://aws.amazon.com/route53/pricing/).\n Note the following:\n * You can't create a hosted zone for a top-level domain (TLD) such as .com.\n * For public hosted zones, Amazon Route 53 automatically creates a default SOA\nrecord and four NS records for the zone. For more information about SOA and NS\nrecords, see NS and SOA Records that Route 53 Creates for a Hosted Zone\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html) in\nthe Amazon Route 53 Developer Guide.\n If you want to use the same name servers for multiple public hosted zones, you\ncan optionally associate a reusable delegation set with the hosted zone. See the\nDelegationSetId element.\n * If your domain is registered with a registrar other than Route 53, you must\nupdate the name servers with your registrar to make Route 53 the DNS service for\nthe domain. For more information, see Migrating DNS Service for an Existing\nDomain to Amazon Route 53\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html) in\nthe Amazon Route 53 Developer Guide.\n When you submit a CreateHostedZone request, the initial status of the hosted\nzone is PENDING. For public hosted zones, this means that the NS and SOA records\nare not yet available on all Route 53 DNS servers. When the NS and SOA records\nare available, the status of the zone changes to INSYNC." ([create-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-hosted-zone-request create-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHostedZone", :http.request.configuration/output-deser-fn response-create-hosted-zone-response, :http.request.spec/error-spec {"DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "ConflictingDomainExists" :portkey.aws.route53.-2013-04-01/conflicting-domain-exists, "HostedZoneAlreadyExists" :portkey.aws.route53.-2013-04-01/hosted-zone-already-exists, "TooManyHostedZones" :portkey.aws.route53.-2013-04-01/too-many-hosted-zones, "DelegationSetNotAvailable" :portkey.aws.route53.-2013-04-01/delegation-set-not-available}})))))
(clojure.spec.alpha/fdef create-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-hosted-zone-response))

(clojure.core/defn list-health-checks "Retrieve a list of the health checks that are associated with the current AWS\naccount." ([] (list-health-checks {})) ([list-health-checks-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-health-checks-request list-health-checks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-health-checks-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-health-checks-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHealthChecks", :http.request.configuration/output-deser-fn response-list-health-checks-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "IncompatibleVersion" :portkey.aws.route53.-2013-04-01/incompatible-version}})))))
(clojure.spec.alpha/fdef list-health-checks :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-health-checks-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-health-checks-response))

(clojure.core/defn delete-vpc-association-authorization "Removes authorization to submit an AssociateVPCWithHostedZone request to\nassociate a specified VPC with a hosted zone that was created by a different\naccount. You must use the account that created the hosted zone to submit a\nDeleteVPCAssociationAuthorization request.\n Sending this request only prevents the AWS account that created the VPC from\nassociating the VPC with the Amazon Route 53 hosted zone in the future. If the\nVPC is already associated with the hosted zone,\nDeleteVPCAssociationAuthorization won't disassociate the VPC from the hosted\nzone. If you want to delete an existing association, use\nDisassociateVPCFromHostedZone." ([delete-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-vpc-association-authorization-request delete-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/deauthorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-delete-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "VPCAssociationAuthorizationNotFound" :portkey.aws.route53.-2013-04-01/vpc-association-authorization-not-found, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-response))

(clojure.core/defn get-health-check "Gets information about a specified health check." ([get-health-check-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-health-check-request get-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHealthCheck", :http.request.configuration/output-deser-fn response-get-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "IncompatibleVersion" :portkey.aws.route53.-2013-04-01/incompatible-version}})))))
(clojure.spec.alpha/fdef get-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-response))

(clojure.core/defn list-traffic-policy-instances-by-policy "Gets information about the traffic policy instances that you created by using a\nspecify traffic policy version.\n After you submit a CreateTrafficPolicyInstance or an\nUpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53\ncreates the resource record sets that are specified in the traffic policy\ndefinition. For more information, see the State response element.\n Route 53 returns a maximum of 100 items in each response. If you have a lot of\ntraffic policy instances, you can use the MaxItems parameter to list them in\ngroups of up to 100." ([list-traffic-policy-instances-by-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-traffic-policy-instances-by-policy-request list-traffic-policy-instances-by-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrafficPolicyInstancesByPolicy", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-response))

(clojure.core/defn change-tags-for-resource "Adds, edits, or deletes tags for a health check or a hosted zone.\n For information about using tags for cost allocation, see Using Cost Allocation\nTags\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html)\nin the AWS Billing and Cost Management User Guide." ([change-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-change-tags-for-resource-request change-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/change-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/change-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ChangeTagsForResource", :http.request.configuration/output-deser-fn response-change-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef change-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/change-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-tags-for-resource-response))

(clojure.core/defn delete-traffic-policy "Deletes a traffic policy." ([delete-traffic-policy-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-traffic-policy-request delete-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTrafficPolicy", :http.request.configuration/output-deser-fn response-delete-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TrafficPolicyInUse" :portkey.aws.route53.-2013-04-01/traffic-policy-in-use, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification}})))))
(clojure.spec.alpha/fdef delete-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-traffic-policy-response))

(clojure.core/defn create-query-logging-config "Creates a configuration for DNS query logging. After you create a query logging\nconfiguration, Amazon Route 53 begins to publish log data to an Amazon\nCloudWatch Logs log group.\n DNS query logs contain information about the queries that Route 53 receives for\na specified public hosted zone, such as the following:\n * Route 53 edge location that responded to the DNS query\n * Domain or subdomain that was requested\n * DNS record type, such as A or AAAA\n * DNS response code, such as NoError or ServFail\n Log Group and Resource Policy\n Before you create a query logging configuration, perform the following\noperations.\n If you create a query logging configuration using the Route 53 console, Route\n53 performs these operations automatically.\n * Create a CloudWatch Logs log group, and make note of the ARN, which you\nspecify when you create a query logging configuration. Note the following:\n * You must create the log group in the us-east-1 region.\n * You must use the same AWS account to create the log group and the hosted zone\nthat you want to configure query logging for.\n * When you create log groups for query logging, we recommend that you use a\nconsistent prefix, for example:\n /aws/route53/hosted zone name\n In the next step, you'll create a resource policy, which controls access to one\nor more log groups and the associated AWS resources, such as Route 53 hosted\nzones. There's a limit on the number of resource policies that you can create,\nso we recommend that you use a consistent prefix so you can use the same\nresource policy for all the log groups that you create for query logging.\n * Create a CloudWatch Logs resource policy, and give it the permissions that\nRoute 53 needs to create log streams and to send query logs to log streams. For\nthe value of Resource, specify the ARN for the log group that you created in the\nprevious step. To use the same resource policy for all the CloudWatch Logs log\ngroups that you created for query logging configurations, replace the hosted\nzone name with *, for example:\n arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*\n You can't use the CloudWatch console to create or edit a resource policy. You\nmust use the CloudWatch API, one of the AWS SDKs, or the AWS CLI.\n Log Streams and Edge Locations\n When Route 53 finishes creating the configuration for DNS query logging, it\ndoes the following:\n * Creates a log stream for an edge location the first time that the edge\nlocation responds to DNS queries for the specified hosted zone. That log stream\nis used to log all queries that Route 53 responds to for that edge location.\n * Begins to send query logs to the applicable log stream.\n The name of each log stream is in the following format:\n hosted zone ID/edge location code\n The edge location code is a three-letter code and an arbitrarily assigned\nnumber, for example, DFW3. The three-letter code typically corresponds with the\nInternational Air Transport Association airport code for an airport near the\nedge location. (These abbreviations might change in the future.) For a list of\nedge locations, see \"The Route 53 Global Network\" on the Route 53 Product\nDetails (http://aws.amazon.com/route53/details/) page.\n Queries That Are Logged\n Query logs contain only the queries that DNS resolvers forward to Route 53. If\na DNS resolver has already cached the response to a query (such as the IP\naddress for a load balancer for example.com), the resolver will continue to\nreturn the cached response. It doesn't forward another query to Route 53 until\nthe TTL for the corresponding resource record set expires. Depending on how many\nDNS queries are submitted for a resource record set, and depending on the TTL\nfor that resource record set, query logs might contain information about only\none query out of every several thousand queries that are submitted to DNS. For\nmore information about how DNS works, see Routing Internet Traffic to Your\nWebsite or Web Application\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html)\nin the Amazon Route 53 Developer Guide.\n Log File Format\n For a list of the values in each query log and the format of each value, see\nLogging DNS Queries\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in\nthe Amazon Route 53 Developer Guide.\n Pricing\n For information about charges for query logs, see Amazon CloudWatch Pricing\n(http://aws.amazon.com/cloudwatch/pricing/).\n How to Stop Logging\n If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the\nquery logging configuration. For more information, see DeleteQueryLoggingConfig." ([create-query-logging-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-query-logging-config-request create-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateQueryLoggingConfig", :http.request.configuration/output-deser-fn response-create-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NoSuchCloudWatchLogsLogGroup" :portkey.aws.route53.-2013-04-01/no-such-cloud-watch-logs-log-group, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "QueryLoggingConfigAlreadyExists" :portkey.aws.route53.-2013-04-01/query-logging-config-already-exists, "InsufficientCloudWatchLogsResourcePolicy" :portkey.aws.route53.-2013-04-01/insufficient-cloud-watch-logs-resource-policy}})))))
(clojure.spec.alpha/fdef create-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-query-logging-config-response))

(clojure.core/defn get-health-check-count "Retrieves the number of health checks that are associated with the current AWS\naccount." ([] (get-health-check-count {})) ([get-health-check-count-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-health-check-count-request get-health-check-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheckcount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHealthCheckCount", :http.request.configuration/output-deser-fn response-get-health-check-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-health-check-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-health-check-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-count-response))

(clojure.core/defn test-dns-answer "Gets the value that Amazon Route 53 returns in response to a DNS request for a\nspecified record name and type. You can optionally specify the IP address of a\nDNS resolver, an EDNS0 client subnet IP address, and a subnet mask." ([test-dns-answer-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-test-dns-answer-request test-dns-answer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/test-dns-answer-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/testdnsanswer", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/test-dns-answer-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestDNSAnswer", :http.request.configuration/output-deser-fn response-test-dns-answer-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef test-dns-answer :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/test-dns-answer-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/test-dns-answer-response))

(clojure.core/defn update-traffic-policy-instance "Updates the resource record sets in a specified hosted zone that were created\nbased on the settings in a specified traffic policy version.\n When you update a traffic policy instance, Amazon Route 53 continues to respond\nto DNS queries for the root resource record set name (such as example.com) while\nit replaces one group of resource record sets with another. Route 53 performs\nthe following operations:\n * Route 53 creates a new group of resource record sets based on the specified\ntraffic policy. This is true regardless of how significant the differences are\nbetween the existing resource record sets and the new resource record sets.\n * When all of the new resource record sets have been created, Route 53 starts\nto respond to DNS queries for the root resource record set name (such as\nexample.com) by using the new resource record sets.\n * Route 53 deletes the old group of resource record sets that are associated\nwith the root resource record set name." ([update-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-traffic-policy-instance-request update-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-update-traffic-policy-instance-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ConflictingTypes" :portkey.aws.route53.-2013-04-01/conflicting-types}})))))
(clojure.spec.alpha/fdef update-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-response))

(clojure.core/defn list-traffic-policy-instances-by-hosted-zone "Gets information about the traffic policy instances that you created in a\nspecified hosted zone.\n After you submit a CreateTrafficPolicyInstance or an\nUpdateTrafficPolicyInstance request, there's a brief delay while Amazon Route 53\ncreates the resource record sets that are specified in the traffic policy\ndefinition. For more information, see the State response element.\n Route 53 returns a maximum of 100 items in each response. If you have a lot of\ntraffic policy instances, you can use the MaxItems parameter to list them in\ngroups of up to 100." ([list-traffic-policy-instances-by-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-traffic-policy-instances-by-hosted-zone-request list-traffic-policy-instances-by-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrafficPolicyInstancesByHostedZone", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-hosted-zone-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-response))

(clojure.core/defn update-hosted-zone-comment "Updates the comment for a specified hosted zone." ([update-hosted-zone-comment-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-hosted-zone-comment-request update-hosted-zone-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateHostedZoneComment", :http.request.configuration/output-deser-fn response-update-hosted-zone-comment-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef update-hosted-zone-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-response))

(clojure.core/defn get-change "Returns the current status of a change batch request. The status is one of the\nfollowing values:\n * PENDING indicates that the changes in this request have not propagated to all\nAmazon Route 53 DNS servers. This is the initial status of all change batch\nrequests.\n * INSYNC indicates that the changes have propagated to all Route 53 DNS\nservers." ([get-change-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-change-request get-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-change-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/change/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-change-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetChange", :http.request.configuration/output-deser-fn response-get-change-response, :http.request.spec/error-spec {"NoSuchChange" :portkey.aws.route53.-2013-04-01/no-such-change, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-change :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-change-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-change-response))

(clojure.core/defn list-query-logging-configs "Lists the configurations for DNS query logging that are associated with the\ncurrent AWS account or the configuration that is associated with a specified\nhosted zone.\n For more information about DNS query logs, see CreateQueryLoggingConfig.\nAdditional information, including the format of DNS query logs, appears in\nLogging DNS Queries\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html) in\nthe Amazon Route 53 Developer Guide." ([] (list-query-logging-configs {})) ([list-query-logging-configs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-query-logging-configs-request list-query-logging-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-query-logging-configs-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-query-logging-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListQueryLoggingConfigs", :http.request.configuration/output-deser-fn response-list-query-logging-configs-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidPaginationToken" :portkey.aws.route53.-2013-04-01/invalid-pagination-token, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-query-logging-configs :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-query-logging-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-query-logging-configs-response))

(clojure.core/defn create-health-check "Creates a new health check.\n For information about adding health checks to resource record sets, see\nResourceRecordSet$HealthCheckId in ChangeResourceRecordSets.\n ELB Load Balancers\n If you're registering EC2 instances with an Elastic Load Balancing (ELB) load\nbalancer, do not create Amazon Route 53 health checks for the EC2 instances.\nWhen you register an EC2 instance with a load balancer, you configure settings\nfor an ELB health check, which performs a similar function to a Route 53 health\ncheck.\n Private Hosted Zones\n You can associate health checks with failover resource record sets in a private\nhosted zone. Note the following:\n * Route 53 health checkers are outside the VPC. To check the health of an\nendpoint within a VPC by IP address, you must assign a public IP address to the\ninstance in the VPC.\n * You can configure a health checker to check the health of an external\nresource that the instance relies on, such as a database server.\n * You can create a CloudWatch metric, associate an alarm with the metric, and\nthen create a health check that is based on the state of the alarm. For example,\nyou might create a CloudWatch metric that checks the status of the Amazon EC2\nStatusCheckFailed metric, add an alarm to the metric, and then create a health\ncheck that is based on the state of the alarm. For information about creating\nCloudWatch metrics and alarms by using the CloudWatch console, see the Amazon\nCloudWatch User Guide\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html)." ([create-health-check-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-health-check-request create-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHealthCheck", :http.request.configuration/output-deser-fn response-create-health-check-response, :http.request.spec/error-spec {"TooManyHealthChecks" :portkey.aws.route53.-2013-04-01/too-many-health-checks, "HealthCheckAlreadyExists" :portkey.aws.route53.-2013-04-01/health-check-already-exists, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef create-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-health-check-response))

(clojure.core/defn associate-vpc-with-hosted-zone "Associates an Amazon VPC with a private hosted zone.\n To perform the association, the VPC and the private hosted zone must already\nexist. You can't convert a public hosted zone into a private hosted zone.\n If you want to associate a VPC that was created by using one AWS account with a\nprivate hosted zone that was created by using a different account, the AWS\naccount that created the private hosted zone must first submit a\nCreateVPCAssociationAuthorization request. Then the account that created the VPC\nmust submit an AssociateVPCWithHostedZone request." ([associate-vpc-with-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-vpc-with-hosted-zone-request associate-vpc-with-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/associatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateVPCWithHostedZone", :http.request.configuration/output-deser-fn response-associate-vpc-with-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NotAuthorizedException" :portkey.aws.route53.-2013-04-01/not-authorized-exception, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PublicZoneVPCAssociation" :portkey.aws.route53.-2013-04-01/public-zone-vpc-association, "ConflictingDomainExists" :portkey.aws.route53.-2013-04-01/conflicting-domain-exists, "LimitsExceeded" :portkey.aws.route53.-2013-04-01/limits-exceeded}})))))
(clojure.spec.alpha/fdef associate-vpc-with-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-response))

(clojure.core/defn change-resource-record-sets "Creates, changes, or deletes a resource record set, which contains authoritative\nDNS information for a specified domain name or subdomain name. For example, you\ncan use ChangeResourceRecordSets to create a resource record set that routes\ntraffic for test.example.com to a web server that has an IP address of\n192.0.2.44.\n Change Batches and Transactional Changes\n The request body must include a document with a ChangeResourceRecordSetsRequest\nelement. The request body contains a list of change items, known as a change\nbatch. Change batches are considered transactional changes. When using the\nAmazon Route 53 API to change resource record sets, Route 53 either makes all or\nnone of the changes in a change batch request. This ensures that Route 53 never\npartially implements the intended changes to the resource record sets in a\nhosted zone.\n For example, a change batch request that deletes the CNAME record for\nwww.example.com and creates an alias resource record set for www.example.com.\nRoute 53 deletes the first resource record set and creates the second resource\nrecord set in a single operation. If either the DELETE or the CREATE action\nfails, then both changes (plus any other changes in the batch) fail, and the\noriginal CNAME record continues to exist.\n Due to the nature of transactional changes, you can't delete the same resource\nrecord set more than once in a single change batch. If you attempt to delete the\nsame change batch more than once, Route 53 returns an InvalidChangeBatch error.\n Traffic Flow\n To create resource record sets for complex routing configurations, use either\nthe traffic flow visual editor in the Route 53 console or the API actions for\ntraffic policies and traffic policy instances. Save the configuration as a\ntraffic policy, then associate the traffic policy with one or more domain names\n(such as example.com) or subdomain names (such as www.example.com), in the same\nhosted zone or in multiple hosted zones. You can roll back the updates if the\nnew configuration isn't performing as expected. For more information, see Using\nTraffic Flow to Route DNS Traffic\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html) in\nthe Amazon Route 53 Developer Guide.\n Create, Delete, and Upsert\n Use ChangeResourceRecordsSetsRequest to perform the following actions:\n * CREATE: Creates a resource record set that has the specified values.\n * DELETE: Deletes an existing resource record set that has the specified\nvalues.\n * UPSERT: If a resource record set does not already exist, AWS creates it. If a\nresource set does exist, Route 53 updates it with the values in the request.\n Syntaxes for Creating, Updating, and Deleting Resource Record Sets\n The syntax for a request depends on the type of resource record set that you\nwant to create, delete, or update, such as weighted, alias, or failover. The XML\nelements in your request must appear in the order listed in the syntax.\n For an example for each type of resource record set, see \"Examples.\"\n Don't refer to the syntax in the \"Parameter Syntax\" section, which includes all\nof the elements for every kind of resource record set that you can create,\ndelete, or update by using ChangeResourceRecordSets.\n Change Propagation to Route 53 DNS Servers\n When you submit a ChangeResourceRecordSets request, Route 53 propagates your\nchanges to all of the Route 53 authoritative DNS servers. While your changes are\npropagating, GetChange returns a status of PENDING. When propagation is\ncomplete, GetChange returns a status of INSYNC. Changes generally propagate to\nall Route 53 name servers within 60 seconds. For more information, see\nGetChange.\n Limits on ChangeResourceRecordSets Requests\n For information about the limits on a ChangeResourceRecordSets request, see\nLimits\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html)\nin the Amazon Route 53 Developer Guide." ([change-resource-record-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-change-resource-record-sets-request change-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/change-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset/", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/change-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ChangeResourceRecordSets", :http.request.configuration/output-deser-fn response-change-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidChangeBatch" :portkey.aws.route53.-2013-04-01/invalid-change-batch, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef change-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/change-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-resource-record-sets-response))

(clojure.core/defn create-reusable-delegation-set "Creates a delegation set (a group of four name servers) that can be reused by\nmultiple hosted zones. If a hosted zoned ID is specified,\nCreateReusableDelegationSet marks the delegation set associated with that zone\nas reusable.\n You can't associate a reusable delegation set with a private hosted zone.\n For information about using a reusable delegation set to configure white label\nname servers, see Configuring White Label Name Servers\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html).\n The process for migrating existing hosted zones to use a reusable delegation\nset is comparable to the process for configuring white label name servers. You\nneed to perform the following steps:\n * Create a reusable delegation set.\n * Recreate hosted zones, and reduce the TTL to 60 seconds or less.\n * Recreate resource record sets in the new hosted zones.\n * Change the registrar's name servers to use the name servers for the new\nhosted zones.\n * Monitor traffic for the website or application.\n * Change TTLs back to their original values.\n If you want to migrate existing hosted zones to use a reusable delegation set,\nthe existing hosted zones can't use any of the name servers that are assigned to\nthe reusable delegation set. If one or more hosted zones do use one or more name\nservers that are assigned to the reusable delegation set, you can do one of the\nfollowing:\n * For small numbers of hosted zones—up to a few hundred—it's relatively easy to\ncreate reusable delegation sets until you get one that has four name servers\nthat don't overlap with any of the name servers in your hosted zones.\n * For larger numbers of hosted zones, the easiest solution is to use more than\none reusable delegation set.\n * For larger numbers of hosted zones, you can also migrate hosted zones that\nhave overlapping name servers to hosted zones that don't have overlapping name\nservers, then migrate the hosted zones again to use the reusable delegation set." ([create-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-reusable-delegation-set-request create-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateReusableDelegationSet", :http.request.configuration/output-deser-fn response-create-reusable-delegation-set-response, :http.request.spec/error-spec {"DelegationSetAlreadyCreated" :portkey.aws.route53.-2013-04-01/delegation-set-already-created, "LimitsExceeded" :portkey.aws.route53.-2013-04-01/limits-exceeded, "HostedZoneNotFound" :portkey.aws.route53.-2013-04-01/hosted-zone-not-found, "InvalidArgument" :portkey.aws.route53.-2013-04-01/invalid-argument, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "DelegationSetNotAvailable" :portkey.aws.route53.-2013-04-01/delegation-set-not-available, "DelegationSetAlreadyReusable" :portkey.aws.route53.-2013-04-01/delegation-set-already-reusable}})))))
(clojure.spec.alpha/fdef create-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-response))

(clojure.core/defn list-resource-record-sets "Lists the resource record sets in a specified hosted zone.\n ListResourceRecordSets returns up to 100 resource record sets at a time in\nASCII order, beginning at a position specified by the name and type elements.\n Sort order\n ListResourceRecordSets sorts results first by DNS name with the labels\nreversed, for example:\n com.example.www.\n Note the trailing dot, which can change the sort order when the record name\ncontains characters that appear before . (decimal 46) in the ASCII table. These\ncharacters include the following: ! \" # $ % & ' ( ) * + , -\n When multiple records have the same DNS name, ListResourceRecordSets sorts\nresults by the record type.\n Specifying where to start listing records\n You can use the name and type elements to specify the resource record set that\nthe list begins with:\n If you do not specify Name or Type\n The results begin with the first resource record set that the hosted zone\ncontains.\n If you specify Name but not Type\n The results begin with the first resource record set in the list whose name is\ngreater than or equal to Name.\n If you specify Type but not Name\n Amazon Route 53 returns the InvalidInput error.\n If you specify both Name and Type\n The results begin with the first resource record set in the list whose name is\ngreater than or equal to Name, and whose type is greater than or equal to Type.\n Resource record sets that are PENDING\n This action returns the most current version of the records. This includes\nrecords that are PENDING, and that are not yet available on all Route 53 DNS\nservers.\n Changing resource record sets\n To ensure that you get an accurate listing of the resource record sets for a\nhosted zone at a point in time, do not submit a ChangeResourceRecordSets request\nwhile you're paging through the results of a ListResourceRecordSets request. If\nyou do, some pages may display results without the latest changes while other\npages display results with the latest changes.\n Displaying the next page of results\n If a ListResourceRecordSets command returns more than one page of results, the\nvalue of IsTruncated is true. To display the next page of results, get the\nvalues of NextRecordName, NextRecordType, and NextRecordIdentifier (if any) from\nthe response. Then submit another ListResourceRecordSets request, and specify\nthose values for StartRecordName, StartRecordType, and StartRecordIdentifier." ([list-resource-record-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-resource-record-sets-request list-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResourceRecordSets", :http.request.configuration/output-deser-fn response-list-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-resource-record-sets-response))

(clojure.core/defn get-hosted-zone-count "Retrieves the number of hosted zones that are associated with the current AWS\naccount." ([] (get-hosted-zone-count {})) ([get-hosted-zone-count-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-hosted-zone-count-request get-hosted-zone-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHostedZoneCount", :http.request.configuration/output-deser-fn response-get-hosted-zone-count-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-response))

(clojure.core/defn get-health-check-last-failure-reason "Gets the reason that a specified health check failed most recently." ([get-health-check-last-failure-reason-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-health-check-last-failure-reason-request get-health-check-last-failure-reason-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/lastfailurereason", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetHealthCheckLastFailureReason", :http.request.configuration/output-deser-fn response-get-health-check-last-failure-reason-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-last-failure-reason :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response))

(clojure.core/defn list-reusable-delegation-sets "Retrieves a list of the reusable delegation sets that are associated with the\ncurrent AWS account." ([] (list-reusable-delegation-sets {})) ([list-reusable-delegation-sets-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-reusable-delegation-sets-request list-reusable-delegation-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListReusableDelegationSets", :http.request.configuration/output-deser-fn response-list-reusable-delegation-sets-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-reusable-delegation-sets :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-response))

(clojure.core/defn delete-hosted-zone "Deletes a hosted zone.\n If the name servers for the hosted zone are associated with a domain and if you\nwant to make the domain unavailable on the Internet, we recommend that you\ndelete the name servers from the domain to prevent future DNS queries from\npossibly being misrouted. If the domain is registered with Amazon Route 53, see\nUpdateDomainNameservers. If the domain is registered with another registrar, use\nthe method provided by the registrar to delete name servers for the domain.\n Some domain registries don't allow you to remove all of the name servers for a\ndomain. If the registry for your domain requires one or more name servers, we\nrecommend that you delete the hosted zone only if you transfer DNS service to\nanother service provider, and you replace the name servers for the domain with\nname servers from the new provider.\n You can delete a hosted zone only if it contains only the default SOA record\nand NS resource record sets. If the hosted zone contains other resource record\nsets, you must delete them before you can delete the hosted zone. If you try to\ndelete a hosted zone that contains other resource record sets, the request\nfails, and Route 53 returns a HostedZoneNotEmpty error. For information about\ndeleting records from your hosted zone, see ChangeResourceRecordSets.\n To verify that the hosted zone has been deleted, do one of the following:\n * Use the GetHostedZone action to request information about the hosted zone.\n * Use the ListHostedZones action to get a list of the hosted zones associated\nwith the current AWS account." ([delete-hosted-zone-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-hosted-zone-request delete-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteHostedZone", :http.request.configuration/output-deser-fn response-delete-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "HostedZoneNotEmpty" :portkey.aws.route53.-2013-04-01/hosted-zone-not-empty, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name}})))))
(clojure.spec.alpha/fdef delete-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-hosted-zone-response))

(clojure.core/defn get-query-logging-config "Gets information about a specified configuration for DNS query logging.\n For more information about DNS query logs, see CreateQueryLoggingConfig and\nLogging DNS Queries\n(http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html)." ([get-query-logging-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-query-logging-config-request get-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryLoggingConfig", :http.request.configuration/output-deser-fn response-get-query-logging-config-response, :http.request.spec/error-spec {"NoSuchQueryLoggingConfig" :portkey.aws.route53.-2013-04-01/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-query-logging-config-response))
