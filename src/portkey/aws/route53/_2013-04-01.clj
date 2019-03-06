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
   "aws-global"
   {:credential-scope {:service "route53", :region "us-east-1"},
    :ssl-common-name "route53.amazonaws.com",
    :endpoint "https://route53.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-insufficient-data-health-status)

(clojure.core/declare ser-tag-resource-type)

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

(clojure.core/defn- ser-resource-record-set-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "cn-northwest-1" "cn-northwest-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cnnorthwest-1 "cn-northwest-1", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "ResourceRecordSetRegion"})

(clojure.core/defn- ser-traffic-policy-name [input] #:http.request.field{:value input, :shape "TrafficPolicyName"})

(clojure.core/defn- ser-vpc-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "cn-north-1" "cn-north-1", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", :cnnorth-1 "cn-north-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "VPCRegion"})

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

(clojure.core/defn- ser-health-check-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-type (:type input)) #:http.request.field{:name "Type", :shape "HealthCheckType"})], :shape "HealthCheckConfig", :type "structure"} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :measure-latency) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-measure-latency (input :measure-latency)) #:http.request.field{:name "MeasureLatency", :shape "MeasureLatency"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :request-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-request-interval (input :request-interval)) #:http.request.field{:name "RequestInterval", :shape "RequestInterval"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

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

(clojure.core/defn- ser-cloud-watch-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", :apsouth-1 "ap-south-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :euwest-3 "eu-west-3", :useast-1 "us-east-1", "ap-northeast-3" "ap-northeast-3", :apsoutheast-2 "ap-southeast-2", :apnortheast-2 "ap-northeast-2", "us-east-2" "us-east-2", "ap-southeast-2" "ap-southeast-2", "sa-east-1" "sa-east-1", "ap-southeast-1" "ap-southeast-1", "ap-northeast-2" "ap-northeast-2", "eu-west-3" "eu-west-3", :cacentral-1 "ca-central-1", "ca-central-1" "ca-central-1", "eu-central-1" "eu-central-1", :euwest-2 "eu-west-2", :apnortheast-3 "ap-northeast-3", "eu-west-2" "eu-west-2", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :saeast-1 "sa-east-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", "ap-south-1" "ap-south-1", :euwest-1 "eu-west-1", :useast-2 "us-east-2", :uswest-2 "us-west-2"} input), :shape "CloudWatchRegion"})

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

(clojure.core/defn- req-update-health-check-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-health-check-id (input :health-check-id)) #:http.request.field{:name "HealthCheckId", :shape "HealthCheckId", :location "uri", :location-name "HealthCheckId"})]} (clojure.core/contains? input :insufficient-data-health-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-insufficient-data-health-status (input :insufficient-data-health-status)) #:http.request.field{:name "InsufficientDataHealthStatus", :shape "InsufficientDataHealthStatus"})) (clojure.core/contains? input :search-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-string (input :search-string)) #:http.request.field{:name "SearchString", :shape "SearchString"})) (clojure.core/contains? input :health-check-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-version (input :health-check-version)) #:http.request.field{:name "HealthCheckVersion", :shape "HealthCheckVersion"})) (clojure.core/contains? input :failure-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-threshold (input :failure-threshold)) #:http.request.field{:name "FailureThreshold", :shape "FailureThreshold"})) (clojure.core/contains? input :child-health-checks) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-child-health-check-list (input :child-health-checks)) #:http.request.field{:name "ChildHealthChecks", :shape "ChildHealthCheckList"})) (clojure.core/contains? input :regions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-region-list (input :regions)) #:http.request.field{:name "Regions", :shape "HealthCheckRegionList"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :port)) #:http.request.field{:name "Port", :shape "Port"})) (clojure.core/contains? input :ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :ip-address)) #:http.request.field{:name "IPAddress", :shape "IPAddress"})) (clojure.core/contains? input :resource-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-path (input :resource-path)) #:http.request.field{:name "ResourcePath", :shape "ResourcePath"})) (clojure.core/contains? input :alarm-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-identifier (input :alarm-identifier)) #:http.request.field{:name "AlarmIdentifier", :shape "AlarmIdentifier"})) (clojure.core/contains? input :enable-sni) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enable-sni (input :enable-sni)) #:http.request.field{:name "EnableSNI", :shape "EnableSNI"})) (clojure.core/contains? input :reset-elements) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resettable-element-name-list (input :reset-elements)) #:http.request.field{:name "ResetElements", :shape "ResettableElementNameList"})) (clojure.core/contains? input :health-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-threshold (input :health-threshold)) #:http.request.field{:name "HealthThreshold", :shape "HealthThreshold"})) (clojure.core/contains? input :fully-qualified-domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fully-qualified-domain-name (input :fully-qualified-domain-name)) #:http.request.field{:name "FullyQualifiedDomainName", :shape "FullyQualifiedDomainName"})) (clojure.core/contains? input :inverted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inverted (input :inverted)) #:http.request.field{:name "Inverted", :shape "Inverted"}))))

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

(clojure.core/defn- deser-health-check [input] (clojure.core/let [letvar152849 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? false :xmlAttribute? nil), "HealthCheckConfig" (portkey.aws/search-for-tag input "HealthCheckConfig" :flattened? false :xmlAttribute? nil), "HealthCheckVersion" (portkey.aws/search-for-tag input "HealthCheckVersion" :flattened? false :xmlAttribute? nil), "CloudWatchAlarmConfiguration" (portkey.aws/search-for-tag input "CloudWatchAlarmConfiguration" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-health-check-id (clojure.core/get-in letvar152849 ["Id" :content])), :caller-reference (deser-health-check-nonce (clojure.core/get-in letvar152849 ["CallerReference" :content])), :health-check-config (deser-health-check-config (clojure.core/get-in letvar152849 ["HealthCheckConfig" :content])), :health-check-version (deser-health-check-version (clojure.core/get-in letvar152849 ["HealthCheckVersion" :content]))} (letvar152849 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar152849 ["LinkedService" :content]))) (letvar152849 "CloudWatchAlarmConfiguration") (clojure.core/assoc :cloud-watch-alarm-configuration (deser-cloud-watch-alarm-configuration (clojure.core/get-in letvar152849 ["CloudWatchAlarmConfiguration" :content]))))))

(clojure.core/defn- deser-delegation-set-name-servers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dns-name coll))) input))

(clojure.core/defn- deser-health-check-nonce [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-count [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-search-string [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zone-rr-set-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-tag-set [input] (clojure.core/let [letvar152976 {"ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? false :xmlAttribute? nil), "ResourceId" (portkey.aws/search-for-tag input "ResourceId" :flattened? false :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar152976 "ResourceType") (clojure.core/assoc :resource-type (deser-tag-resource-type (clojure.core/get-in letvar152976 ["ResourceType" :content]))) (letvar152976 "ResourceId") (clojure.core/assoc :resource-id (deser-tag-resource-id (clojure.core/get-in letvar152976 ["ResourceId" :content]))) (letvar152976 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar152976 ["Tags" :content]))))))

(clojure.core/defn- deser-rr-type [input] (clojure.core/get {"CAA" :caa, "CNAME" :cname, "TXT" :txt, "SRV" :srv, "AAAA" :aaaa, "NS" :ns, "PTR" :ptr, "NAPTR" :naptr, "A" :a, "SPF" :spf, "SOA" :soa, "MX" :mx} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-watch-logs-log-group-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-target [input] (clojure.core/let [letvar153082 {"HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "DNSName" (portkey.aws/search-for-tag input "DNSName" :flattened? false :xmlAttribute? nil), "EvaluateTargetHealth" (portkey.aws/search-for-tag input "EvaluateTargetHealth" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar153082 ["HostedZoneId" :content])), :dns-name (deser-dns-name (clojure.core/get-in letvar153082 ["DNSName" :content])), :evaluate-target-health (deser-alias-health-enabled (clojure.core/get-in letvar153082 ["EvaluateTargetHealth" :content]))})))

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

(clojure.core/defn- deser-resource-record-set-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "cn-northwest-1" :cnnorthwest-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-traffic-policy-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy [input] (clojure.core/let [letvar153256 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Document" (portkey.aws/search-for-tag input "Document" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar153256 ["Id" :content])), :version (deser-traffic-policy-version (clojure.core/get-in letvar153256 ["Version" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar153256 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar153256 ["Type" :content])), :document (deser-traffic-policy-document (clojure.core/get-in letvar153256 ["Document" :content]))} (letvar153256 "Comment") (clojure.core/assoc :comment (deser-traffic-policy-comment (clojure.core/get-in letvar153256 ["Comment" :content]))))))

(clojure.core/defn- deser-vpc-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "cn-north-1" :cnnorth-1, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-health-checks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check coll))) input))

(clojure.core/defn- deser-health-check-region [input] (clojure.core/get {"us-east-1" :useast-1, "us-west-1" :uswest-1, "us-west-2" :uswest-2, "eu-west-1" :euwest-1, "ap-southeast-1" :apsoutheast-1, "ap-southeast-2" :apsoutheast-2, "ap-northeast-1" :apnortheast-1, "sa-east-1" :saeast-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-version [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-messages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-message coll))) input))

(clojure.core/defn- deser-failure-threshold [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-child-health-check-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-id coll))) input))

(clojure.core/defn- deser-checker-ip-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ip-address-cidr coll))) input))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dimension [input] (clojure.core/let [letvar153444 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dimension-field (clojure.core/get-in letvar153444 ["Name" :content])), :value (deser-dimension-field (clojure.core/get-in letvar153444 ["Value" :content]))})))

(clojure.core/defn- deser-vp-cs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vpc coll))) input))

(clojure.core/defn- deser-pagination-token [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GreaterThanOrEqualToThreshold" :greater-than-or-equal-to-threshold, "GreaterThanThreshold" :greater-than-threshold, "LessThanThreshold" :less-than-threshold, "LessThanOrEqualToThreshold" :less-than-or-equal-to-threshold} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-linked-service [input] (clojure.core/let [letvar153567 {"ServicePrincipal" (portkey.aws/search-for-tag input "ServicePrincipal" :flattened? false :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar153567 "ServicePrincipal") (clojure.core/assoc :service-principal (deser-service-principal (clojure.core/get-in letvar153567 ["ServicePrincipal" :content]))) (letvar153567 "Description") (clojure.core/assoc :description (deser-resource-description (clojure.core/get-in letvar153567 ["Description" :content]))))))

(clojure.core/defn- deser-health-check-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-region coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit-type [input] (clojure.core/get {"MAX_ZONES_BY_REUSABLE_DELEGATION_SET" :max-zones-by-reusable-delegation-set} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-continent-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-hosted-zone [input] (clojure.core/let [letvar153692 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Config" (portkey.aws/search-for-tag input "Config" :flattened? false :xmlAttribute? nil), "ResourceRecordSetCount" (portkey.aws/search-for-tag input "ResourceRecordSetCount" :flattened? false :xmlAttribute? nil), "LinkedService" (portkey.aws/search-for-tag input "LinkedService" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar153692 ["Id" :content])), :name (deser-dns-name (clojure.core/get-in letvar153692 ["Name" :content])), :caller-reference (deser-nonce (clojure.core/get-in letvar153692 ["CallerReference" :content]))} (letvar153692 "Config") (clojure.core/assoc :config (deser-hosted-zone-config (clojure.core/get-in letvar153692 ["Config" :content]))) (letvar153692 "ResourceRecordSetCount") (clojure.core/assoc :resource-record-set-count (deser-hosted-zone-rr-set-count (clojure.core/get-in letvar153692 ["ResourceRecordSetCount" :content]))) (letvar153692 "LinkedService") (clojure.core/assoc :linked-service (deser-linked-service (clojure.core/get-in letvar153692 ["LinkedService" :content]))))))

(clojure.core/defn- deser-tag-resource-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy-instance coll))) input))

(clojure.core/defn- deser-page-truncated [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-geo-location [input] (clojure.core/let [letvar153812 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar153812 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar153812 ["ContinentCode" :content]))) (letvar153812 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar153812 ["CountryCode" :content]))) (letvar153812 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar153812 ["SubdivisionCode" :content]))))))

(clojure.core/defn- deser-ip-address-cidr [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-health-check-config [input] (clojure.core/let [letvar153913 {"InsufficientDataHealthStatus" (portkey.aws/search-for-tag input "InsufficientDataHealthStatus" :flattened? false :xmlAttribute? nil), "SearchString" (portkey.aws/search-for-tag input "SearchString" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "FailureThreshold" (portkey.aws/search-for-tag input "FailureThreshold" :flattened? false :xmlAttribute? nil), "ChildHealthChecks" (portkey.aws/search-for-tag input "ChildHealthChecks" :flattened? false :xmlAttribute? nil), "Regions" (portkey.aws/search-for-tag input "Regions" :flattened? false :xmlAttribute? nil), "Port" (portkey.aws/search-for-tag input "Port" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "ResourcePath" (portkey.aws/search-for-tag input "ResourcePath" :flattened? false :xmlAttribute? nil), "AlarmIdentifier" (portkey.aws/search-for-tag input "AlarmIdentifier" :flattened? false :xmlAttribute? nil), "EnableSNI" (portkey.aws/search-for-tag input "EnableSNI" :flattened? false :xmlAttribute? nil), "MeasureLatency" (portkey.aws/search-for-tag input "MeasureLatency" :flattened? false :xmlAttribute? nil), "HealthThreshold" (portkey.aws/search-for-tag input "HealthThreshold" :flattened? false :xmlAttribute? nil), "RequestInterval" (portkey.aws/search-for-tag input "RequestInterval" :flattened? false :xmlAttribute? nil), "FullyQualifiedDomainName" (portkey.aws/search-for-tag input "FullyQualifiedDomainName" :flattened? false :xmlAttribute? nil), "Inverted" (portkey.aws/search-for-tag input "Inverted" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-health-check-type (clojure.core/get-in letvar153913 ["Type" :content]))} (letvar153913 "InsufficientDataHealthStatus") (clojure.core/assoc :insufficient-data-health-status (deser-insufficient-data-health-status (clojure.core/get-in letvar153913 ["InsufficientDataHealthStatus" :content]))) (letvar153913 "SearchString") (clojure.core/assoc :search-string (deser-search-string (clojure.core/get-in letvar153913 ["SearchString" :content]))) (letvar153913 "FailureThreshold") (clojure.core/assoc :failure-threshold (deser-failure-threshold (clojure.core/get-in letvar153913 ["FailureThreshold" :content]))) (letvar153913 "ChildHealthChecks") (clojure.core/assoc :child-health-checks (deser-child-health-check-list (clojure.core/get-in letvar153913 ["ChildHealthChecks" :content]))) (letvar153913 "Regions") (clojure.core/assoc :regions (deser-health-check-region-list (clojure.core/get-in letvar153913 ["Regions" :content]))) (letvar153913 "Port") (clojure.core/assoc :port (deser-port (clojure.core/get-in letvar153913 ["Port" :content]))) (letvar153913 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar153913 ["IPAddress" :content]))) (letvar153913 "ResourcePath") (clojure.core/assoc :resource-path (deser-resource-path (clojure.core/get-in letvar153913 ["ResourcePath" :content]))) (letvar153913 "AlarmIdentifier") (clojure.core/assoc :alarm-identifier (deser-alarm-identifier (clojure.core/get-in letvar153913 ["AlarmIdentifier" :content]))) (letvar153913 "EnableSNI") (clojure.core/assoc :enable-sni (deser-enable-sni (clojure.core/get-in letvar153913 ["EnableSNI" :content]))) (letvar153913 "MeasureLatency") (clojure.core/assoc :measure-latency (deser-measure-latency (clojure.core/get-in letvar153913 ["MeasureLatency" :content]))) (letvar153913 "HealthThreshold") (clojure.core/assoc :health-threshold (deser-health-threshold (clojure.core/get-in letvar153913 ["HealthThreshold" :content]))) (letvar153913 "RequestInterval") (clojure.core/assoc :request-interval (deser-request-interval (clojure.core/get-in letvar153913 ["RequestInterval" :content]))) (letvar153913 "FullyQualifiedDomainName") (clojure.core/assoc :fully-qualified-domain-name (deser-fully-qualified-domain-name (clojure.core/get-in letvar153913 ["FullyQualifiedDomainName" :content]))) (letvar153913 "Inverted") (clojure.core/assoc :inverted (deser-inverted (clojure.core/get-in letvar153913 ["Inverted" :content]))))))

(clojure.core/defn- deser-change-info [input] (clojure.core/let [letvar154009 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "SubmittedAt" (portkey.aws/search-for-tag input "SubmittedAt" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-resource-id (clojure.core/get-in letvar154009 ["Id" :content])), :status (deser-change-status (clojure.core/get-in letvar154009 ["Status" :content])), :submitted-at (deser-time-stamp (clojure.core/get-in letvar154009 ["SubmittedAt" :content]))} (letvar154009 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar154009 ["Comment" :content]))))))

(clojure.core/defn- deser-dimension-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-dimension coll))) input))

(clojure.core/defn- deser-status [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-service-principal [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-version [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-error-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-geo-location-details [input] (clojure.core/let [letvar154139 {"ContinentCode" (portkey.aws/search-for-tag input "ContinentCode" :flattened? false :xmlAttribute? nil), "ContinentName" (portkey.aws/search-for-tag input "ContinentName" :flattened? false :xmlAttribute? nil), "CountryCode" (portkey.aws/search-for-tag input "CountryCode" :flattened? false :xmlAttribute? nil), "CountryName" (portkey.aws/search-for-tag input "CountryName" :flattened? false :xmlAttribute? nil), "SubdivisionCode" (portkey.aws/search-for-tag input "SubdivisionCode" :flattened? false :xmlAttribute? nil), "SubdivisionName" (portkey.aws/search-for-tag input "SubdivisionName" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar154139 "ContinentCode") (clojure.core/assoc :continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar154139 ["ContinentCode" :content]))) (letvar154139 "ContinentName") (clojure.core/assoc :continent-name (deser-geo-location-continent-name (clojure.core/get-in letvar154139 ["ContinentName" :content]))) (letvar154139 "CountryCode") (clojure.core/assoc :country-code (deser-geo-location-country-code (clojure.core/get-in letvar154139 ["CountryCode" :content]))) (letvar154139 "CountryName") (clojure.core/assoc :country-name (deser-geo-location-country-name (clojure.core/get-in letvar154139 ["CountryName" :content]))) (letvar154139 "SubdivisionCode") (clojure.core/assoc :subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar154139 ["SubdivisionCode" :content]))) (letvar154139 "SubdivisionName") (clojure.core/assoc :subdivision-name (deser-geo-location-subdivision-name (clojure.core/get-in letvar154139 ["SubdivisionName" :content]))))))

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

(clojure.core/defn- deser-health-check-observation [input] (clojure.core/let [letvar154300 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil), "IPAddress" (portkey.aws/search-for-tag input "IPAddress" :flattened? false :xmlAttribute? nil), "StatusReport" (portkey.aws/search-for-tag input "StatusReport" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar154300 "Region") (clojure.core/assoc :region (deser-health-check-region (clojure.core/get-in letvar154300 ["Region" :content]))) (letvar154300 "IPAddress") (clojure.core/assoc :ip-address (deser-ip-address (clojure.core/get-in letvar154300 ["IPAddress" :content]))) (letvar154300 "StatusReport") (clojure.core/assoc :status-report (deser-status-report (clojure.core/get-in letvar154300 ["StatusReport" :content]))))))

(clojure.core/defn- deser-health-check-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-dns-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-query-logging-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-logging-config coll))) input))

(clojure.core/defn- deser-reusable-delegation-set-limit [input] (clojure.core/let [letvar154423 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-reusable-delegation-set-limit-type (clojure.core/get-in letvar154423 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar154423 ["Value" :content]))})))

(clojure.core/defn- deser-resource-records [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record coll))) input))

(clojure.core/defn- deser-traffic-policy-document [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-uri [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zone-limit [input] (clojure.core/let [letvar154551 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-hosted-zone-limit-type (clojure.core/get-in letvar154551 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar154551 ["Value" :content]))})))

(clojure.core/defn- deser-account-limit [input] (clojure.core/let [letvar154647 {"Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:type (deser-account-limit-type (clojure.core/get-in letvar154647 ["Type" :content])), :value (deser-limit-value (clojure.core/get-in letvar154647 ["Value" :content]))})))

(clojure.core/defn- deser-query-logging-config-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-query-logging-config [input] (clojure.core/let [letvar154748 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "CloudWatchLogsLogGroupArn" (portkey.aws/search-for-tag input "CloudWatchLogsLogGroupArn" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-query-logging-config-id (clojure.core/get-in letvar154748 ["Id" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar154748 ["HostedZoneId" :content])), :cloud-watch-logs-log-group-arn (deser-cloud-watch-logs-log-group-arn (clojure.core/get-in letvar154748 ["CloudWatchLogsLogGroupArn" :content]))})))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-delegation-set [input] (clojure.core/let [letvar154849 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "NameServers" (portkey.aws/search-for-tag input "NameServers" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name-servers (deser-delegation-set-name-servers (clojure.core/get-in letvar154849 ["NameServers" :content]))} (letvar154849 "Id") (clojure.core/assoc :id (deser-resource-id (clojure.core/get-in letvar154849 ["Id" :content]))) (letvar154849 "CallerReference") (clojure.core/assoc :caller-reference (deser-nonce (clojure.core/get-in letvar154849 ["CallerReference" :content]))))))

(clojure.core/defn- deser-resource-record-set-multi-value-answer [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-port [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-namespace [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-message [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-identifier [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record-set-failover [input] (clojure.core/get {"PRIMARY" :primary, "SECONDARY" :secondary} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-geo-location-subdivision-code [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-ip-address [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-instance-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policy-summary [input] (clojure.core/let [letvar154984 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "LatestVersion" (portkey.aws/search-for-tag input "LatestVersion" :flattened? false :xmlAttribute? nil), "TrafficPolicyCount" (portkey.aws/search-for-tag input "TrafficPolicyCount" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-traffic-policy-id (clojure.core/get-in letvar154984 ["Id" :content])), :name (deser-traffic-policy-name (clojure.core/get-in letvar154984 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar154984 ["Type" :content])), :latest-version (deser-traffic-policy-version (clojure.core/get-in letvar154984 ["LatestVersion" :content])), :traffic-policy-count (deser-traffic-policy-version (clojure.core/get-in letvar154984 ["TrafficPolicyCount" :content]))})))

(clojure.core/defn- deser-traffic-policy-instance [input] (clojure.core/let [letvar155080 {"TrafficPolicyVersion" (portkey.aws/search-for-tag input "TrafficPolicyVersion" :flattened? false :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? false :xmlAttribute? nil), "TrafficPolicyType" (portkey.aws/search-for-tag input "TrafficPolicyType" :flattened? false :xmlAttribute? nil), "HostedZoneId" (portkey.aws/search-for-tag input "HostedZoneId" :flattened? false :xmlAttribute? nil), "TrafficPolicyId" (portkey.aws/search-for-tag input "TrafficPolicyId" :flattened? false :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? false :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar155080 ["Name" :content])), :traffic-policy-version (deser-traffic-policy-version (clojure.core/get-in letvar155080 ["TrafficPolicyVersion" :content])), :traffic-policy-id (deser-traffic-policy-id (clojure.core/get-in letvar155080 ["TrafficPolicyId" :content])), :state (deser-traffic-policy-instance-state (clojure.core/get-in letvar155080 ["State" :content])), :traffic-policy-type (deser-rr-type (clojure.core/get-in letvar155080 ["TrafficPolicyType" :content])), :ttl (deser-ttl (clojure.core/get-in letvar155080 ["TTL" :content])), :id (deser-traffic-policy-instance-id (clojure.core/get-in letvar155080 ["Id" :content])), :message (deser-message (clojure.core/get-in letvar155080 ["Message" :content])), :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar155080 ["HostedZoneId" :content]))})))

(clojure.core/defn- deser-geo-location-country-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-resource-record [input] (clojure.core/let [letvar155181 {"Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:value (deser-r-data (clojure.core/get-in letvar155181 ["Value" :content]))})))

(clojure.core/defn- deser-alarm-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-usage-count [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-hosted-zone-config [input] (clojure.core/let [letvar155284 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "PrivateZone" (portkey.aws/search-for-tag input "PrivateZone" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar155284 "Comment") (clojure.core/assoc :comment (deser-resource-description (clojure.core/get-in letvar155284 ["Comment" :content]))) (letvar155284 "PrivateZone") (clojure.core/assoc :private-zone (deser-is-private-zone (clojure.core/get-in letvar155284 ["PrivateZone" :content]))))))

(clojure.core/defn- deser-hosted-zone-limit-type [input] (clojure.core/get {"MAX_RRSETS_BY_ZONE" :max-rrsets-by-zone, "MAX_VPCS_ASSOCIATED_BY_ZONE" :max-vpcs-associated-by-zone} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-path [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-traffic-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-traffic-policy coll))) input))

(clojure.core/defn- deser-geo-location-details-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-geo-location-details coll))) input))

(clojure.core/defn- deser-alarm-identifier [input] (clojure.core/let [letvar155424 {"Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:region (deser-cloud-watch-region (clojure.core/get-in letvar155424 ["Region" :content])), :name (deser-alarm-name (clojure.core/get-in letvar155424 ["Name" :content]))})))

(clojure.core/defn- deser-is-private-zone [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-traffic-policy-comment [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-enable-sni [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-health-check-type [input] (clojure.core/get {"HTTP" :http, "HTTPS" :https, "HTTP_STR_MATCH" :http-str-match, "HTTPS_STR_MATCH" :https-str-match, "TCP" :tcp, "CALCULATED" :calculated, "CLOUDWATCH_METRIC" :cloudwatch-metric} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-record-data [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-record-data-entry coll))) input))

(clojure.core/defn- deser-r-data [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-health-enabled [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-health-check-observations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-health-check-observation coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar155575 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar155575 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar155575 ["Key" :content]))) (letvar155575 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar155575 ["Value" :content]))))))

(clojure.core/defn- deser-page-marker [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-metric-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-nonce [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-measure-latency [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-transport-protocol [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-hosted-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hosted-zone coll))) input))

(clojure.core/defn- deser-evaluation-periods [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-record-set coll))) input))

(clojure.core/defn- deser-health-threshold [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-resource-record-set [input] (clojure.core/let [letvar155731 {"AliasTarget" (portkey.aws/search-for-tag input "AliasTarget" :flattened? false :xmlAttribute? nil), "Type" (portkey.aws/search-for-tag input "Type" :flattened? false :xmlAttribute? nil), "GeoLocation" (portkey.aws/search-for-tag input "GeoLocation" :flattened? false :xmlAttribute? nil), "TTL" (portkey.aws/search-for-tag input "TTL" :flattened? false :xmlAttribute? nil), "SetIdentifier" (portkey.aws/search-for-tag input "SetIdentifier" :flattened? false :xmlAttribute? nil), "Weight" (portkey.aws/search-for-tag input "Weight" :flattened? false :xmlAttribute? nil), "HealthCheckId" (portkey.aws/search-for-tag input "HealthCheckId" :flattened? false :xmlAttribute? nil), "MultiValueAnswer" (portkey.aws/search-for-tag input "MultiValueAnswer" :flattened? false :xmlAttribute? nil), "ResourceRecords" (portkey.aws/search-for-tag input "ResourceRecords" :flattened? false :xmlAttribute? nil), "Failover" (portkey.aws/search-for-tag input "Failover" :flattened? false :xmlAttribute? nil), "TrafficPolicyInstanceId" (portkey.aws/search-for-tag input "TrafficPolicyInstanceId" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "Region" (portkey.aws/search-for-tag input "Region" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-dns-name (clojure.core/get-in letvar155731 ["Name" :content])), :type (deser-rr-type (clojure.core/get-in letvar155731 ["Type" :content]))} (letvar155731 "AliasTarget") (clojure.core/assoc :alias-target (deser-alias-target (clojure.core/get-in letvar155731 ["AliasTarget" :content]))) (letvar155731 "GeoLocation") (clojure.core/assoc :geo-location (deser-geo-location (clojure.core/get-in letvar155731 ["GeoLocation" :content]))) (letvar155731 "TTL") (clojure.core/assoc :ttl (deser-ttl (clojure.core/get-in letvar155731 ["TTL" :content]))) (letvar155731 "SetIdentifier") (clojure.core/assoc :set-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar155731 ["SetIdentifier" :content]))) (letvar155731 "Weight") (clojure.core/assoc :weight (deser-resource-record-set-weight (clojure.core/get-in letvar155731 ["Weight" :content]))) (letvar155731 "HealthCheckId") (clojure.core/assoc :health-check-id (deser-health-check-id (clojure.core/get-in letvar155731 ["HealthCheckId" :content]))) (letvar155731 "MultiValueAnswer") (clojure.core/assoc :multi-value-answer (deser-resource-record-set-multi-value-answer (clojure.core/get-in letvar155731 ["MultiValueAnswer" :content]))) (letvar155731 "ResourceRecords") (clojure.core/assoc :resource-records (deser-resource-records (clojure.core/get-in letvar155731 ["ResourceRecords" :content]))) (letvar155731 "Failover") (clojure.core/assoc :failover (deser-resource-record-set-failover (clojure.core/get-in letvar155731 ["Failover" :content]))) (letvar155731 "TrafficPolicyInstanceId") (clojure.core/assoc :traffic-policy-instance-id (deser-traffic-policy-instance-id (clojure.core/get-in letvar155731 ["TrafficPolicyInstanceId" :content]))) (letvar155731 "Region") (clojure.core/assoc :region (deser-resource-record-set-region (clojure.core/get-in letvar155731 ["Region" :content]))))))

(clojure.core/defn- deser-vpc-id [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-request-interval [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-time-stamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-cloud-watch-alarm-configuration [input] (clojure.core/let [letvar155836 {"EvaluationPeriods" (portkey.aws/search-for-tag input "EvaluationPeriods" :flattened? false :xmlAttribute? nil), "Threshold" (portkey.aws/search-for-tag input "Threshold" :flattened? false :xmlAttribute? nil), "ComparisonOperator" (portkey.aws/search-for-tag input "ComparisonOperator" :flattened? false :xmlAttribute? nil), "Period" (portkey.aws/search-for-tag input "Period" :flattened? false :xmlAttribute? nil), "MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? false :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? false :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? false :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:evaluation-periods (deser-evaluation-periods (clojure.core/get-in letvar155836 ["EvaluationPeriods" :content])), :threshold (deser-threshold (clojure.core/get-in letvar155836 ["Threshold" :content])), :comparison-operator (deser-comparison-operator (clojure.core/get-in letvar155836 ["ComparisonOperator" :content])), :period (deser-period (clojure.core/get-in letvar155836 ["Period" :content])), :metric-name (deser-metric-name (clojure.core/get-in letvar155836 ["MetricName" :content])), :namespace (deser-namespace (clojure.core/get-in letvar155836 ["Namespace" :content])), :statistic (deser-statistic (clojure.core/get-in letvar155836 ["Statistic" :content]))} (letvar155836 "Dimensions") (clojure.core/assoc :dimensions (deser-dimension-list (clojure.core/get-in letvar155836 ["Dimensions" :content]))))))

(clojure.core/defn- deser-fully-qualified-domain-name [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"Average" :average, "Sum" :sum, "SampleCount" :sample-count, "Maximum" :maximum, "Minimum" :minimum} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-status-report [input] (clojure.core/let [letvar155942 {"Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CheckedTime" (portkey.aws/search-for-tag input "CheckedTime" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar155942 "Status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar155942 ["Status" :content]))) (letvar155942 "CheckedTime") (clojure.core/assoc :checked-time (deser-time-stamp (clojure.core/get-in letvar155942 ["CheckedTime" :content]))))))

(clojure.core/defn- deser-vpc [input] (clojure.core/let [letvar156038 {"VPCRegion" (portkey.aws/search-for-tag input "VPCRegion" :flattened? false :xmlAttribute? nil), "VPCId" (portkey.aws/search-for-tag input "VPCId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar156038 "VPCRegion") (clojure.core/assoc :vpc-region (deser-vpc-region (clojure.core/get-in letvar156038 ["VPCRegion" :content]))) (letvar156038 "VPCId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar156038 ["VPCId" :content]))))))

(clojure.core/defn- deser-limit-value [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-page-max-items [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-inverted [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cloud-watch-region [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "ap-northeast-3" :apnortheast-3, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "sa-east-1" :saeast-1, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-west-3" :euwest-3, "ca-central-1" :cacentral-1, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- response-get-hosted-zone-limit-response [input] (clojure.core/let [rawinput156053 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156054 {"Limit" (portkey.aws/search-for-tag rawinput156053 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput156053 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-hosted-zone-limit (clojure.core/get-in letvar156054 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar156054 ["Count" :content]))})))

(clojure.core/defn- response-invalid-pagination-token [input] (clojure.core/let [rawinput156055 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156056 {"message" (portkey.aws/search-for-tag rawinput156055 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156056 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156056 ["message" :content]))))))

(clojure.core/defn- response-delete-reusable-delegation-set-response [input] (clojure.core/let [rawinput156057 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156058 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-health-check-last-failure-reason-response [input] (clojure.core/let [rawinput156059 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156060 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput156059 "HealthCheckObservations" :flattened? false)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar156060 ["HealthCheckObservations" :content]))})))

(clojure.core/defn- response-last-vpc-association [input] (clojure.core/let [rawinput156061 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156062 {"message" (portkey.aws/search-for-tag rawinput156061 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156062 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156062 ["message" :content]))))))

(clojure.core/defn- response-query-logging-config-already-exists [input] (clojure.core/let [rawinput156063 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156064 {"message" (portkey.aws/search-for-tag rawinput156063 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156064 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156064 ["message" :content]))))))

(clojure.core/defn- response-too-many-health-checks [input] (clojure.core/let [rawinput156065 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156066 {"message" (portkey.aws/search-for-tag rawinput156065 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156066 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156066 ["message" :content]))))))

(clojure.core/defn- response-list-hosted-zones-by-name-response [input] (clojure.core/let [rawinput156067 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156068 {"HostedZones" (portkey.aws/search-for-tag rawinput156067 "HostedZones" :flattened? false), "DNSName" (portkey.aws/search-for-tag rawinput156067 "DNSName" :flattened? false), "HostedZoneId" (portkey.aws/search-for-tag rawinput156067 "HostedZoneId" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156067 "IsTruncated" :flattened? false), "NextDNSName" (portkey.aws/search-for-tag rawinput156067 "NextDNSName" :flattened? false), "NextHostedZoneId" (portkey.aws/search-for-tag rawinput156067 "NextHostedZoneId" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156067 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar156068 ["HostedZones" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156068 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156068 ["MaxItems" :content]))} (letvar156068 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar156068 ["DNSName" :content]))) (letvar156068 "HostedZoneId") (clojure.core/assoc :hosted-zone-id (deser-resource-id (clojure.core/get-in letvar156068 ["HostedZoneId" :content]))) (letvar156068 "NextDNSName") (clojure.core/assoc :next-dns-name (deser-dns-name (clojure.core/get-in letvar156068 ["NextDNSName" :content]))) (letvar156068 "NextHostedZoneId") (clojure.core/assoc :next-hosted-zone-id (deser-resource-id (clojure.core/get-in letvar156068 ["NextHostedZoneId" :content]))))))

(clojure.core/defn- response-list-health-checks-response [input] (clojure.core/let [rawinput156069 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156070 {"HealthChecks" (portkey.aws/search-for-tag rawinput156069 "HealthChecks" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput156069 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156069 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput156069 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156069 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:health-checks (deser-health-checks (clojure.core/get-in letvar156070 ["HealthChecks" :content])), :marker (deser-page-marker (clojure.core/get-in letvar156070 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156070 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156070 ["MaxItems" :content]))} (letvar156070 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar156070 ["NextMarker" :content]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput156071 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156072 {"message" (portkey.aws/search-for-tag rawinput156071 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156072 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156072 ["message" :content]))))))

(clojure.core/defn- response-incompatible-version [input] (clojure.core/let [rawinput156073 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156074 {"message" (portkey.aws/search-for-tag rawinput156073 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156074 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156074 ["message" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-response [input] (clojure.core/let [rawinput156075 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156076 {"ResourceTagSet" (portkey.aws/search-for-tag rawinput156075 "ResourceTagSet" :flattened? false)}] (clojure.core/cond-> {:resource-tag-set (deser-resource-tag-set (clojure.core/get-in letvar156076 ["ResourceTagSet" :content]))})))

(clojure.core/defn- response-get-hosted-zone-response [input] (clojure.core/let [rawinput156077 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156078 {"HostedZone" (portkey.aws/search-for-tag rawinput156077 "HostedZone" :flattened? false), "DelegationSet" (portkey.aws/search-for-tag rawinput156077 "DelegationSet" :flattened? false), "VPCs" (portkey.aws/search-for-tag rawinput156077 "VPCs" :flattened? false)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar156078 ["HostedZone" :content]))} (letvar156078 "DelegationSet") (clojure.core/assoc :delegation-set (deser-delegation-set (clojure.core/get-in letvar156078 ["DelegationSet" :content]))) (letvar156078 "VPCs") (clojure.core/assoc :vp-cs (deser-vp-cs (clojure.core/get-in letvar156078 ["VPCs" :content]))))))

(clojure.core/defn- response-list-traffic-policy-versions-response [input] (clojure.core/let [rawinput156079 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156080 {"TrafficPolicies" (portkey.aws/search-for-tag rawinput156079 "TrafficPolicies" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156079 "IsTruncated" :flattened? false), "TrafficPolicyVersionMarker" (portkey.aws/search-for-tag rawinput156079 "TrafficPolicyVersionMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156079 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policies (deser-traffic-policies (clojure.core/get-in letvar156080 ["TrafficPolicies" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156080 ["IsTruncated" :content])), :traffic-policy-version-marker (deser-traffic-policy-version-marker (clojure.core/get-in letvar156080 ["TrafficPolicyVersionMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156080 ["MaxItems" :content]))})))

(clojure.core/defn- response-hosted-zone-not-private [input] (clojure.core/let [rawinput156081 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156082 {"message" (portkey.aws/search-for-tag rawinput156081 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156082 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156082 ["message" :content]))))))

(clojure.core/defn- response-get-health-check-status-response [input] (clojure.core/let [rawinput156083 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156084 {"HealthCheckObservations" (portkey.aws/search-for-tag rawinput156083 "HealthCheckObservations" :flattened? false)}] (clojure.core/cond-> {:health-check-observations (deser-health-check-observations (clojure.core/get-in letvar156084 ["HealthCheckObservations" :content]))})))

(clojure.core/defn- response-list-vpc-association-authorizations-response [input] (clojure.core/let [rawinput156085 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156086 {"HostedZoneId" (portkey.aws/search-for-tag rawinput156085 "HostedZoneId" :flattened? false), "NextToken" (portkey.aws/search-for-tag rawinput156085 "NextToken" :flattened? false), "VPCs" (portkey.aws/search-for-tag rawinput156085 "VPCs" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar156086 ["HostedZoneId" :content])), :vp-cs (deser-vp-cs (clojure.core/get-in letvar156086 ["VPCs" :content]))} (letvar156086 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar156086 ["NextToken" :content]))))))

(clojure.core/defn- response-no-such-geo-location [input] (clojure.core/let [rawinput156087 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156088 {"message" (portkey.aws/search-for-tag rawinput156087 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156088 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156088 ["message" :content]))))))

(clojure.core/defn- response-limits-exceeded [input] (clojure.core/let [rawinput156089 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156090 {"message" (portkey.aws/search-for-tag rawinput156089 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156090 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156090 ["message" :content]))))))

(clojure.core/defn- response-public-zone-vpc-association [input] (clojure.core/let [rawinput156091 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156092 {"message" (portkey.aws/search-for-tag rawinput156091 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156092 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156092 ["message" :content]))))))

(clojure.core/defn- response-prior-request-not-complete [input] (clojure.core/let [rawinput156093 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156094 {"message" (portkey.aws/search-for-tag rawinput156093 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156094 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156094 ["message" :content]))))))

(clojure.core/defn- response-create-traffic-policy-response [input] (clojure.core/let [rawinput156095 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156096 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput156095 "TrafficPolicy" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar156096 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156096 ["Location"]))})))

(clojure.core/defn- response-too-many-vpc-association-authorizations [input] (clojure.core/let [rawinput156097 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156098 {"message" (portkey.aws/search-for-tag rawinput156097 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156098 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156098 ["message" :content]))))))

(clojure.core/defn- response-create-traffic-policy-version-response [input] (clojure.core/let [rawinput156099 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156100 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput156099 "TrafficPolicy" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar156100 ["TrafficPolicy" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156100 ["Location"]))})))

(clojure.core/defn- response-delete-hosted-zone-response [input] (clojure.core/let [rawinput156101 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156102 {"ChangeInfo" (portkey.aws/search-for-tag rawinput156101 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar156102 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-test-dns-answer-response [input] (clojure.core/let [rawinput156103 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156104 {"Nameserver" (portkey.aws/search-for-tag rawinput156103 "Nameserver" :flattened? false), "RecordName" (portkey.aws/search-for-tag rawinput156103 "RecordName" :flattened? false), "RecordType" (portkey.aws/search-for-tag rawinput156103 "RecordType" :flattened? false), "RecordData" (portkey.aws/search-for-tag rawinput156103 "RecordData" :flattened? false), "ResponseCode" (portkey.aws/search-for-tag rawinput156103 "ResponseCode" :flattened? false), "Protocol" (portkey.aws/search-for-tag rawinput156103 "Protocol" :flattened? false)}] (clojure.core/cond-> {:nameserver (deser-nameserver (clojure.core/get-in letvar156104 ["Nameserver" :content])), :record-name (deser-dns-name (clojure.core/get-in letvar156104 ["RecordName" :content])), :record-type (deser-rr-type (clojure.core/get-in letvar156104 ["RecordType" :content])), :record-data (deser-record-data (clojure.core/get-in letvar156104 ["RecordData" :content])), :response-code (deser-dnsr-code (clojure.core/get-in letvar156104 ["ResponseCode" :content])), :protocol (deser-transport-protocol (clojure.core/get-in letvar156104 ["Protocol" :content]))})))

(clojure.core/defn- response-delete-query-logging-config-response [input] (clojure.core/let [rawinput156105 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156106 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-checker-ip-ranges-response [input] (clojure.core/let [rawinput156107 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156108 {"CheckerIpRanges" (portkey.aws/search-for-tag rawinput156107 "CheckerIpRanges" :flattened? false)}] (clojure.core/cond-> {:checker-ip-ranges (deser-checker-ip-ranges (clojure.core/get-in letvar156108 ["CheckerIpRanges" :content]))})))

(clojure.core/defn- response-create-vpc-association-authorization-response [input] (clojure.core/let [rawinput156109 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156110 {"HostedZoneId" (portkey.aws/search-for-tag rawinput156109 "HostedZoneId" :flattened? false), "VPC" (portkey.aws/search-for-tag rawinput156109 "VPC" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-id (deser-resource-id (clojure.core/get-in letvar156110 ["HostedZoneId" :content])), :vpc (deser-vpc (clojure.core/get-in letvar156110 ["VPC" :content]))})))

(clojure.core/defn- response-delegation-set-not-reusable [input] (clojure.core/let [rawinput156111 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156112 {"message" (portkey.aws/search-for-tag rawinput156111 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156112 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156112 ["message" :content]))))))

(clojure.core/defn- response-insufficient-cloud-watch-logs-resource-policy [input] (clojure.core/let [rawinput156113 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156114 {"message" (portkey.aws/search-for-tag rawinput156113 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156114 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156114 ["message" :content]))))))

(clojure.core/defn- response-too-many-traffic-policy-instances [input] (clojure.core/let [rawinput156115 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156116 {"message" (portkey.aws/search-for-tag rawinput156115 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156116 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156116 ["message" :content]))))))

(clojure.core/defn- response-no-such-health-check [input] (clojure.core/let [rawinput156117 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156118 {"message" (portkey.aws/search-for-tag rawinput156117 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156118 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156118 ["message" :content]))))))

(clojure.core/defn- response-no-such-traffic-policy [input] (clojure.core/let [rawinput156119 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156120 {"message" (portkey.aws/search-for-tag rawinput156119 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156120 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156120 ["message" :content]))))))

(clojure.core/defn- response-associate-vpc-with-hosted-zone-response [input] (clojure.core/let [rawinput156121 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156122 {"ChangeInfo" (portkey.aws/search-for-tag rawinput156121 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar156122 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-create-traffic-policy-instance-response [input] (clojure.core/let [rawinput156123 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156124 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput156123 "TrafficPolicyInstance" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar156124 ["TrafficPolicyInstance" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156124 ["Location"]))})))

(clojure.core/defn- response-not-authorized-exception [input] (clojure.core/let [rawinput156125 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156126 {"message" (portkey.aws/search-for-tag rawinput156125 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156126 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156126 ["message" :content]))))))

(clojure.core/defn- response-get-query-logging-config-response [input] (clojure.core/let [rawinput156127 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156128 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput156127 "QueryLoggingConfig" :flattened? false)}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar156128 ["QueryLoggingConfig" :content]))})))

(clojure.core/defn- response-invalid-domain-name [input] (clojure.core/let [rawinput156129 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156130 {"message" (portkey.aws/search-for-tag rawinput156129 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156130 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156130 ["message" :content]))))))

(clojure.core/defn- response-list-reusable-delegation-sets-response [input] (clojure.core/let [rawinput156131 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156132 {"DelegationSets" (portkey.aws/search-for-tag rawinput156131 "DelegationSets" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput156131 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156131 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput156131 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156131 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:delegation-sets (deser-delegation-sets (clojure.core/get-in letvar156132 ["DelegationSets" :content])), :marker (deser-page-marker (clojure.core/get-in letvar156132 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156132 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156132 ["MaxItems" :content]))} (letvar156132 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar156132 ["NextMarker" :content]))))))

(clojure.core/defn- response-no-such-change [input] (clojure.core/let [rawinput156133 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156134 {"message" (portkey.aws/search-for-tag rawinput156133 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156134 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156134 ["message" :content]))))))

(clojure.core/defn- response-invalid-change-batch [input] (clojure.core/let [rawinput156135 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156136 {"messages" (portkey.aws/search-for-tag rawinput156135 "messages" :flattened? false), "message" (portkey.aws/search-for-tag rawinput156135 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156136 "messages") (clojure.core/assoc :messages (deser-error-messages (clojure.core/get-in letvar156136 ["messages" :content]))) (letvar156136 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156136 ["message" :content]))))))

(clojure.core/defn- response-invalid-input [input] (clojure.core/let [rawinput156137 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156138 {"message" (portkey.aws/search-for-tag rawinput156137 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156138 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156138 ["message" :content]))))))

(clojure.core/defn- response-get-reusable-delegation-set-response [input] (clojure.core/let [rawinput156139 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156140 {"DelegationSet" (portkey.aws/search-for-tag rawinput156139 "DelegationSet" :flattened? false)}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar156140 ["DelegationSet" :content]))})))

(clojure.core/defn- response-get-traffic-policy-instance-response [input] (clojure.core/let [rawinput156141 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156142 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput156141 "TrafficPolicyInstance" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar156142 ["TrafficPolicyInstance" :content]))})))

(clojure.core/defn- response-hosted-zone-not-found [input] (clojure.core/let [rawinput156143 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156144 {"message" (portkey.aws/search-for-tag rawinput156143 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156144 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156144 ["message" :content]))))))

(clojure.core/defn- response-invalid-vpc-id [input] (clojure.core/let [rawinput156145 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156146 {"message" (portkey.aws/search-for-tag rawinput156145 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156146 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156146 ["message" :content]))))))

(clojure.core/defn- response-no-such-delegation-set [input] (clojure.core/let [rawinput156147 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156148 {"message" (portkey.aws/search-for-tag rawinput156147 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156148 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156148 ["message" :content]))))))

(clojure.core/defn- response-too-many-traffic-policy-versions-for-current-policy [input] (clojure.core/let [rawinput156149 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156150 {"message" (portkey.aws/search-for-tag rawinput156149 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156150 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156150 ["message" :content]))))))

(clojure.core/defn- response-get-traffic-policy-response [input] (clojure.core/let [rawinput156151 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156152 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput156151 "TrafficPolicy" :flattened? false)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar156152 ["TrafficPolicy" :content]))})))

(clojure.core/defn- response-update-traffic-policy-comment-response [input] (clojure.core/let [rawinput156153 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156154 {"TrafficPolicy" (portkey.aws/search-for-tag rawinput156153 "TrafficPolicy" :flattened? false)}] (clojure.core/cond-> {:traffic-policy (deser-traffic-policy (clojure.core/get-in letvar156154 ["TrafficPolicy" :content]))})))

(clojure.core/defn- response-disassociate-vpc-from-hosted-zone-response [input] (clojure.core/let [rawinput156155 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156156 {"ChangeInfo" (portkey.aws/search-for-tag rawinput156155 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar156156 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-conflicting-domain-exists [input] (clojure.core/let [rawinput156157 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156158 {"message" (portkey.aws/search-for-tag rawinput156157 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156158 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156158 ["message" :content]))))))

(clojure.core/defn- response-concurrent-modification [input] (clojure.core/let [rawinput156159 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156160 {"message" (portkey.aws/search-for-tag rawinput156159 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156160 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156160 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-in-use [input] (clojure.core/let [rawinput156161 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156162 {"message" (portkey.aws/search-for-tag rawinput156161 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156162 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156162 ["message" :content]))))))

(clojure.core/defn- response-list-query-logging-configs-response [input] (clojure.core/let [rawinput156163 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156164 {"QueryLoggingConfigs" (portkey.aws/search-for-tag rawinput156163 "QueryLoggingConfigs" :flattened? false), "NextToken" (portkey.aws/search-for-tag rawinput156163 "NextToken" :flattened? false)}] (clojure.core/cond-> {:query-logging-configs (deser-query-logging-configs (clojure.core/get-in letvar156164 ["QueryLoggingConfigs" :content]))} (letvar156164 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar156164 ["NextToken" :content]))))))

(clojure.core/defn- response-list-hosted-zones-response [input] (clojure.core/let [rawinput156165 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156166 {"HostedZones" (portkey.aws/search-for-tag rawinput156165 "HostedZones" :flattened? false), "Marker" (portkey.aws/search-for-tag rawinput156165 "Marker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156165 "IsTruncated" :flattened? false), "NextMarker" (portkey.aws/search-for-tag rawinput156165 "NextMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156165 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:hosted-zones (deser-hosted-zones (clojure.core/get-in letvar156166 ["HostedZones" :content])), :marker (deser-page-marker (clojure.core/get-in letvar156166 ["Marker" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156166 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156166 ["MaxItems" :content]))} (letvar156166 "NextMarker") (clojure.core/assoc :next-marker (deser-page-marker (clojure.core/get-in letvar156166 ["NextMarker" :content]))))))

(clojure.core/defn- response-create-hosted-zone-response [input] (clojure.core/let [rawinput156167 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156168 {"HostedZone" (portkey.aws/search-for-tag rawinput156167 "HostedZone" :flattened? false), "ChangeInfo" (portkey.aws/search-for-tag rawinput156167 "ChangeInfo" :flattened? false), "DelegationSet" (portkey.aws/search-for-tag rawinput156167 "DelegationSet" :flattened? false), "VPC" (portkey.aws/search-for-tag rawinput156167 "VPC" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar156168 ["HostedZone" :content])), :change-info (deser-change-info (clojure.core/get-in letvar156168 ["ChangeInfo" :content])), :delegation-set (deser-delegation-set (clojure.core/get-in letvar156168 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156168 ["Location"]))} (letvar156168 "VPC") (clojure.core/assoc :vpc (deser-vpc (clojure.core/get-in letvar156168 ["VPC" :content]))))))

(clojure.core/defn- response-health-check-in-use [input] (clojure.core/let [rawinput156169 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156170 {"message" (portkey.aws/search-for-tag rawinput156169 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156170 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156170 ["message" :content]))))))

(clojure.core/defn- response-delete-health-check-response [input] (clojure.core/let [rawinput156171 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156172 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-update-traffic-policy-instance-response [input] (clojure.core/let [rawinput156173 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156174 {"TrafficPolicyInstance" (portkey.aws/search-for-tag rawinput156173 "TrafficPolicyInstance" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance (deser-traffic-policy-instance (clojure.core/get-in letvar156174 ["TrafficPolicyInstance" :content]))})))

(clojure.core/defn- response-too-many-traffic-policies [input] (clojure.core/let [rawinput156175 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156176 {"message" (portkey.aws/search-for-tag rawinput156175 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156176 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156176 ["message" :content]))))))

(clojure.core/defn- response-create-query-logging-config-response [input] (clojure.core/let [rawinput156177 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156178 {"QueryLoggingConfig" (portkey.aws/search-for-tag rawinput156177 "QueryLoggingConfig" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:query-logging-config (deser-query-logging-config (clojure.core/get-in letvar156178 ["QueryLoggingConfig" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156178 ["Location"]))})))

(clojure.core/defn- response-traffic-policy-instance-already-exists [input] (clojure.core/let [rawinput156179 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156180 {"message" (portkey.aws/search-for-tag rawinput156179 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156180 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156180 ["message" :content]))))))

(clojure.core/defn- response-hosted-zone-already-exists [input] (clojure.core/let [rawinput156181 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156182 {"message" (portkey.aws/search-for-tag rawinput156181 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156182 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156182 ["message" :content]))))))

(clojure.core/defn- response-create-reusable-delegation-set-response [input] (clojure.core/let [rawinput156183 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156184 {"DelegationSet" (portkey.aws/search-for-tag rawinput156183 "DelegationSet" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:delegation-set (deser-delegation-set (clojure.core/get-in letvar156184 ["DelegationSet" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156184 ["Location"]))})))

(clojure.core/defn- response-list-resource-record-sets-response [input] (clojure.core/let [rawinput156185 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156186 {"ResourceRecordSets" (portkey.aws/search-for-tag rawinput156185 "ResourceRecordSets" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156185 "IsTruncated" :flattened? false), "NextRecordName" (portkey.aws/search-for-tag rawinput156185 "NextRecordName" :flattened? false), "NextRecordType" (portkey.aws/search-for-tag rawinput156185 "NextRecordType" :flattened? false), "NextRecordIdentifier" (portkey.aws/search-for-tag rawinput156185 "NextRecordIdentifier" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156185 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:resource-record-sets (deser-resource-record-sets (clojure.core/get-in letvar156186 ["ResourceRecordSets" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156186 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156186 ["MaxItems" :content]))} (letvar156186 "NextRecordName") (clojure.core/assoc :next-record-name (deser-dns-name (clojure.core/get-in letvar156186 ["NextRecordName" :content]))) (letvar156186 "NextRecordType") (clojure.core/assoc :next-record-type (deser-rr-type (clojure.core/get-in letvar156186 ["NextRecordType" :content]))) (letvar156186 "NextRecordIdentifier") (clojure.core/assoc :next-record-identifier (deser-resource-record-set-identifier (clojure.core/get-in letvar156186 ["NextRecordIdentifier" :content]))))))

(clojure.core/defn- response-invalid-traffic-policy-document [input] (clojure.core/let [rawinput156187 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156188 {"message" (portkey.aws/search-for-tag rawinput156187 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156188 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156188 ["message" :content]))))))

(clojure.core/defn- response-get-health-check-response [input] (clojure.core/let [rawinput156189 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156190 {"HealthCheck" (portkey.aws/search-for-tag rawinput156189 "HealthCheck" :flattened? false)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar156190 ["HealthCheck" :content]))})))

(clojure.core/defn- response-get-traffic-policy-instance-count-response [input] (clojure.core/let [rawinput156191 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156192 {"TrafficPolicyInstanceCount" (portkey.aws/search-for-tag rawinput156191 "TrafficPolicyInstanceCount" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instance-count (deser-traffic-policy-instance-count (clojure.core/get-in letvar156192 ["TrafficPolicyInstanceCount" :content]))})))

(clojure.core/defn- response-no-such-hosted-zone [input] (clojure.core/let [rawinput156193 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156194 {"message" (portkey.aws/search-for-tag rawinput156193 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156194 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156194 ["message" :content]))))))

(clojure.core/defn- response-list-geo-locations-response [input] (clojure.core/let [rawinput156195 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156196 {"GeoLocationDetailsList" (portkey.aws/search-for-tag rawinput156195 "GeoLocationDetailsList" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156195 "IsTruncated" :flattened? false), "NextContinentCode" (portkey.aws/search-for-tag rawinput156195 "NextContinentCode" :flattened? false), "NextCountryCode" (portkey.aws/search-for-tag rawinput156195 "NextCountryCode" :flattened? false), "NextSubdivisionCode" (portkey.aws/search-for-tag rawinput156195 "NextSubdivisionCode" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156195 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:geo-location-details-list (deser-geo-location-details-list (clojure.core/get-in letvar156196 ["GeoLocationDetailsList" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156196 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156196 ["MaxItems" :content]))} (letvar156196 "NextContinentCode") (clojure.core/assoc :next-continent-code (deser-geo-location-continent-code (clojure.core/get-in letvar156196 ["NextContinentCode" :content]))) (letvar156196 "NextCountryCode") (clojure.core/assoc :next-country-code (deser-geo-location-country-code (clojure.core/get-in letvar156196 ["NextCountryCode" :content]))) (letvar156196 "NextSubdivisionCode") (clojure.core/assoc :next-subdivision-code (deser-geo-location-subdivision-code (clojure.core/get-in letvar156196 ["NextSubdivisionCode" :content]))))))

(clojure.core/defn- response-conflicting-types [input] (clojure.core/let [rawinput156197 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156198 {"message" (portkey.aws/search-for-tag rawinput156197 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156198 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156198 ["message" :content]))))))

(clojure.core/defn- response-delete-traffic-policy-instance-response [input] (clojure.core/let [rawinput156199 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156200 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-traffic-policy-already-exists [input] (clojure.core/let [rawinput156201 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156202 {"message" (portkey.aws/search-for-tag rawinput156201 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156202 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156202 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-already-reusable [input] (clojure.core/let [rawinput156203 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156204 {"message" (portkey.aws/search-for-tag rawinput156203 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156204 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156204 ["message" :content]))))))

(clojure.core/defn- response-vpc-association-not-found [input] (clojure.core/let [rawinput156205 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156206 {"message" (portkey.aws/search-for-tag rawinput156205 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156206 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156206 ["message" :content]))))))

(clojure.core/defn- response-health-check-version-mismatch [input] (clojure.core/let [rawinput156207 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156208 {"message" (portkey.aws/search-for-tag rawinput156207 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156208 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156208 ["message" :content]))))))

(clojure.core/defn- response-get-change-response [input] (clojure.core/let [rawinput156209 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156210 {"ChangeInfo" (portkey.aws/search-for-tag rawinput156209 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar156210 ["ChangeInfo" :content]))})))

(clojure.core/defn- response-list-traffic-policies-response [input] (clojure.core/let [rawinput156211 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156212 {"TrafficPolicySummaries" (portkey.aws/search-for-tag rawinput156211 "TrafficPolicySummaries" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156211 "IsTruncated" :flattened? false), "TrafficPolicyIdMarker" (portkey.aws/search-for-tag rawinput156211 "TrafficPolicyIdMarker" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156211 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-summaries (deser-traffic-policy-summaries (clojure.core/get-in letvar156212 ["TrafficPolicySummaries" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156212 ["IsTruncated" :content])), :traffic-policy-id-marker (deser-traffic-policy-id (clojure.core/get-in letvar156212 ["TrafficPolicyIdMarker" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156212 ["MaxItems" :content]))})))

(clojure.core/defn- response-get-geo-location-response [input] (clojure.core/let [rawinput156213 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156214 {"GeoLocationDetails" (portkey.aws/search-for-tag rawinput156213 "GeoLocationDetails" :flattened? false)}] (clojure.core/cond-> {:geo-location-details (deser-geo-location-details (clojure.core/get-in letvar156214 ["GeoLocationDetails" :content]))})))

(clojure.core/defn- response-list-traffic-policy-instances-response [input] (clojure.core/let [rawinput156215 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156216 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput156215 "TrafficPolicyInstances" :flattened? false), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput156215 "HostedZoneIdMarker" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput156215 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput156215 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156215 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156215 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar156216 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156216 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156216 ["MaxItems" :content]))} (letvar156216 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar156216 ["HostedZoneIdMarker" :content]))) (letvar156216 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar156216 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar156216 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar156216 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-get-health-check-count-response [input] (clojure.core/let [rawinput156217 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156218 {"HealthCheckCount" (portkey.aws/search-for-tag rawinput156217 "HealthCheckCount" :flattened? false)}] (clojure.core/cond-> {:health-check-count (deser-health-check-count (clojure.core/get-in letvar156218 ["HealthCheckCount" :content]))})))

(clojure.core/defn- response-delete-vpc-association-authorization-response [input] (clojure.core/let [rawinput156219 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156220 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-too-many-hosted-zones [input] (clojure.core/let [rawinput156221 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156222 {"message" (portkey.aws/search-for-tag rawinput156221 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156222 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156222 ["message" :content]))))))

(clojure.core/defn- response-throttling-exception [input] (clojure.core/let [rawinput156223 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156224 {"message" (portkey.aws/search-for-tag rawinput156223 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156224 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156224 ["message" :content]))))))

(clojure.core/defn- response-change-tags-for-resource-response [input] (clojure.core/let [rawinput156225 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156226 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-hosted-zone-count-response [input] (clojure.core/let [rawinput156227 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156228 {"HostedZoneCount" (portkey.aws/search-for-tag rawinput156227 "HostedZoneCount" :flattened? false)}] (clojure.core/cond-> {:hosted-zone-count (deser-hosted-zone-count (clojure.core/get-in letvar156228 ["HostedZoneCount" :content]))})))

(clojure.core/defn- response-no-such-query-logging-config [input] (clojure.core/let [rawinput156229 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156230 {"message" (portkey.aws/search-for-tag rawinput156229 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156230 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156230 ["message" :content]))))))

(clojure.core/defn- response-update-health-check-response [input] (clojure.core/let [rawinput156231 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156232 {"HealthCheck" (portkey.aws/search-for-tag rawinput156231 "HealthCheck" :flattened? false)}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar156232 ["HealthCheck" :content]))})))

(clojure.core/defn- response-traffic-policy-in-use [input] (clojure.core/let [rawinput156233 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156234 {"message" (portkey.aws/search-for-tag rawinput156233 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156234 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156234 ["message" :content]))))))

(clojure.core/defn- response-health-check-already-exists [input] (clojure.core/let [rawinput156235 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156236 {"message" (portkey.aws/search-for-tag rawinput156235 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156236 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156236 ["message" :content]))))))

(clojure.core/defn- response-delegation-set-not-available [input] (clojure.core/let [rawinput156237 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156238 {"message" (portkey.aws/search-for-tag rawinput156237 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156238 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156238 ["message" :content]))))))

(clojure.core/defn- response-list-tags-for-resources-response [input] (clojure.core/let [rawinput156239 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156240 {"ResourceTagSets" (portkey.aws/search-for-tag rawinput156239 "ResourceTagSets" :flattened? false)}] (clojure.core/cond-> {:resource-tag-sets (deser-resource-tag-set-list (clojure.core/get-in letvar156240 ["ResourceTagSets" :content]))})))

(clojure.core/defn- response-get-account-limit-response [input] (clojure.core/let [rawinput156241 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156242 {"Limit" (portkey.aws/search-for-tag rawinput156241 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput156241 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-account-limit (clojure.core/get-in letvar156242 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar156242 ["Count" :content]))})))

(clojure.core/defn- response-vpc-association-authorization-not-found [input] (clojure.core/let [rawinput156243 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156244 {"message" (portkey.aws/search-for-tag rawinput156243 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156244 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156244 ["message" :content]))))))

(clojure.core/defn- response-no-such-traffic-policy-instance [input] (clojure.core/let [rawinput156245 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156246 {"message" (portkey.aws/search-for-tag rawinput156245 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156246 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156246 ["message" :content]))))))

(clojure.core/defn- response-update-hosted-zone-comment-response [input] (clojure.core/let [rawinput156247 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156248 {"HostedZone" (portkey.aws/search-for-tag rawinput156247 "HostedZone" :flattened? false)}] (clojure.core/cond-> {:hosted-zone (deser-hosted-zone (clojure.core/get-in letvar156248 ["HostedZone" :content]))})))

(clojure.core/defn- response-list-traffic-policy-instances-by-hosted-zone-response [input] (clojure.core/let [rawinput156249 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156250 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput156249 "TrafficPolicyInstances" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput156249 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput156249 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156249 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156249 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar156250 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156250 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156250 ["MaxItems" :content]))} (letvar156250 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar156250 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar156250 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar156250 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-no-such-cloud-watch-logs-log-group [input] (clojure.core/let [rawinput156251 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156252 {"message" (portkey.aws/search-for-tag rawinput156251 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156252 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156252 ["message" :content]))))))

(clojure.core/defn- response-list-traffic-policy-instances-by-policy-response [input] (clojure.core/let [rawinput156253 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156254 {"TrafficPolicyInstances" (portkey.aws/search-for-tag rawinput156253 "TrafficPolicyInstances" :flattened? false), "HostedZoneIdMarker" (portkey.aws/search-for-tag rawinput156253 "HostedZoneIdMarker" :flattened? false), "TrafficPolicyInstanceNameMarker" (portkey.aws/search-for-tag rawinput156253 "TrafficPolicyInstanceNameMarker" :flattened? false), "TrafficPolicyInstanceTypeMarker" (portkey.aws/search-for-tag rawinput156253 "TrafficPolicyInstanceTypeMarker" :flattened? false), "IsTruncated" (portkey.aws/search-for-tag rawinput156253 "IsTruncated" :flattened? false), "MaxItems" (portkey.aws/search-for-tag rawinput156253 "MaxItems" :flattened? false)}] (clojure.core/cond-> {:traffic-policy-instances (deser-traffic-policy-instances (clojure.core/get-in letvar156254 ["TrafficPolicyInstances" :content])), :is-truncated (deser-page-truncated (clojure.core/get-in letvar156254 ["IsTruncated" :content])), :max-items (deser-page-max-items (clojure.core/get-in letvar156254 ["MaxItems" :content]))} (letvar156254 "HostedZoneIdMarker") (clojure.core/assoc :hosted-zone-id-marker (deser-resource-id (clojure.core/get-in letvar156254 ["HostedZoneIdMarker" :content]))) (letvar156254 "TrafficPolicyInstanceNameMarker") (clojure.core/assoc :traffic-policy-instance-name-marker (deser-dns-name (clojure.core/get-in letvar156254 ["TrafficPolicyInstanceNameMarker" :content]))) (letvar156254 "TrafficPolicyInstanceTypeMarker") (clojure.core/assoc :traffic-policy-instance-type-marker (deser-rr-type (clojure.core/get-in letvar156254 ["TrafficPolicyInstanceTypeMarker" :content]))))))

(clojure.core/defn- response-create-health-check-response [input] (clojure.core/let [rawinput156255 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156256 {"HealthCheck" (portkey.aws/search-for-tag rawinput156255 "HealthCheck" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"])}] (clojure.core/cond-> {:health-check (deser-health-check (clojure.core/get-in letvar156256 ["HealthCheck" :content])), :location (deser-resource-uri (clojure.core/get-in letvar156256 ["Location"]))})))

(clojure.core/defn- response-delete-traffic-policy-response [input] (clojure.core/let [rawinput156257 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156258 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-get-reusable-delegation-set-limit-response [input] (clojure.core/let [rawinput156259 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156260 {"Limit" (portkey.aws/search-for-tag rawinput156259 "Limit" :flattened? false), "Count" (portkey.aws/search-for-tag rawinput156259 "Count" :flattened? false)}] (clojure.core/cond-> {:limit (deser-reusable-delegation-set-limit (clojure.core/get-in letvar156260 ["Limit" :content])), :count (deser-usage-count (clojure.core/get-in letvar156260 ["Count" :content]))})))

(clojure.core/defn- response-delegation-set-already-created [input] (clojure.core/let [rawinput156261 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156262 {"message" (portkey.aws/search-for-tag rawinput156261 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156262 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156262 ["message" :content]))))))

(clojure.core/defn- response-hosted-zone-not-empty [input] (clojure.core/let [rawinput156263 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156264 {"message" (portkey.aws/search-for-tag rawinput156263 "message" :flattened? false)}] (clojure.core/cond-> {} (letvar156264 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar156264 ["message" :content]))))))

(clojure.core/defn- response-change-resource-record-sets-response [input] (clojure.core/let [rawinput156265 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar156266 {"ChangeInfo" (portkey.aws/search-for-tag rawinput156265 "ChangeInfo" :flattened? false)}] (clojure.core/cond-> {:change-info (deser-change-info (clojure.core/get-in letvar156266 ["ChangeInfo" :content]))})))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-subdivision-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.health-check/id :portkey.aws.route53.-2013-04-01.health-check/caller-reference :portkey.aws.route53.-2013-04-01/health-check-config :portkey.aws.route53.-2013-04-01/health-check-version] :opt-un [:portkey.aws.route53.-2013-04-01/linked-service :portkey.aws.route53.-2013-04-01/cloud-watch-alarm-configuration]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delegation-set-name-servers (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/dns-name :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/rr-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/hosted-zone-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-name-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/traffic-policy-instance-type-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-instances-by-policy-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/id] :opt-un [:portkey.aws.route53.-2013-04-01/traffic-policy-version-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/search-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-country-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 2))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-version-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 4))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/subnet-mask (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 3))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension-field (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/resource-tag-set] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-hosted-zone-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/hosted-zone] :opt-un [:portkey.aws.route53.-2013-04-01/delegation-set :portkey.aws.route53.-2013-04-01/vp-cs]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/nameserver (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/is-truncated (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-truncated))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policies :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/is-truncated :portkey.aws.route53.-2013-04-01/traffic-policy-version-marker :portkey.aws.route53.-2013-04-01.list-traffic-policy-versions-response/max-items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.delete-vpc-association-authorization-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.delete-vpc-association-authorization-request/hosted-zone-id :portkey.aws.route53.-2013-04-01/vpc] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.hosted-zone-not-private/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/hosted-zone-not-private (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.hosted-zone-not-private/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-batch/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/changes] :opt-un [:portkey.aws.route53.-2013-04-01.change-batch/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-health-check-status-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-observations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "cn-northwest-1" "ap-northeast-2" "eu-west-3" :cnnorthwest-1 :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 512))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "cn-north-1" "sa-east-1" "ap-southeast-1" :cnnorth-1 "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-continent-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 2 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 2))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.dimension/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.dimension/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dimension-field))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.dimension/name :portkey.aws.route53.-2013-04-01.dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vp-cs (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/vpc :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/changes (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/change :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-health-check/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-health-check (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-health-check/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.no-such-traffic-policy/message (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/error-message))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/no-such-traffic-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.no-such-traffic-policy/message]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-continent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 32))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

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
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/update-health-check-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/health-check-id] :opt-un [:portkey.aws.route53.-2013-04-01/insufficient-data-health-status :portkey.aws.route53.-2013-04-01/search-string :portkey.aws.route53.-2013-04-01/health-check-version :portkey.aws.route53.-2013-04-01/failure-threshold :portkey.aws.route53.-2013-04-01.update-health-check-request/child-health-checks :portkey.aws.route53.-2013-04-01.update-health-check-request/regions :portkey.aws.route53.-2013-04-01/port :portkey.aws.route53.-2013-04-01/ip-address :portkey.aws.route53.-2013-04-01/resource-path :portkey.aws.route53.-2013-04-01/alarm-identifier :portkey.aws.route53.-2013-04-01/enable-sni :portkey.aws.route53.-2013-04-01.update-health-check-request/reset-elements :portkey.aws.route53.-2013-04-01/health-threshold :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name :portkey.aws.route53.-2013-04-01/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/child-health-checks (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/child-health-check-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.health-check-config/regions (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/health-check-region-list))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.health-check-config/type] :opt-un [:portkey.aws.route53.-2013-04-01/insufficient-data-health-status :portkey.aws.route53.-2013-04-01/search-string :portkey.aws.route53.-2013-04-01/failure-threshold :portkey.aws.route53.-2013-04-01.health-check-config/child-health-checks :portkey.aws.route53.-2013-04-01.health-check-config/regions :portkey.aws.route53.-2013-04-01/port :portkey.aws.route53.-2013-04-01/ip-address :portkey.aws.route53.-2013-04-01/resource-path :portkey.aws.route53.-2013-04-01/alarm-identifier :portkey.aws.route53.-2013-04-01/enable-sni :portkey.aws.route53.-2013-04-01/measure-latency :portkey.aws.route53.-2013-04-01/health-threshold :portkey.aws.route53.-2013-04-01/request-interval :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name :portkey.aws.route53.-2013-04-01/inverted]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/status (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-status))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/submitted-at (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/time-stamp))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.change-info/comment (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-description))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/change-info (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.change-info/id :portkey.aws.route53.-2013-04-01.change-info/status :portkey.aws.route53.-2013-04-01.change-info/submitted-at] :opt-un [:portkey.aws.route53.-2013-04-01.change-info/comment]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dimension-list (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/dimension :max-count 10))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/service-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 32))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/record-data-entry (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 512))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/health-check-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/dns-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-configs (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/query-logging-config))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/type (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit-type))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/limit-value))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/reusable-delegation-set-limit (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/type :portkey.aws.route53.-2013-04-01.reusable-delegation-set-limit/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-records (clojure.spec.alpha/coll-of :portkey.aws.route53.-2013-04-01/resource-record :min-count 1))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 102400))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/hosted-zone-id :portkey.aws.route53.-2013-04-01.create-traffic-policy-instance-request/name :portkey.aws.route53.-2013-04-01/ttl :portkey.aws.route53.-2013-04-01/traffic-policy-id :portkey.aws.route53.-2013-04-01/traffic-policy-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-config-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.query-logging-config/id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/query-logging-config-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.query-logging-config/hosted-zone-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/query-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.query-logging-config/id :portkey.aws.route53.-2013-04-01.query-logging-config/hosted-zone-id :portkey.aws.route53.-2013-04-01/cloud-watch-logs-log-group-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-identifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/traffic-policy-id-marker (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/traffic-policy-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/max-items (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/page-max-items))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/list-traffic-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.route53.-2013-04-01.list-traffic-policies-request/traffic-policy-id-marker :portkey.aws.route53.-2013-04-01.list-traffic-policies-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record-set-failover #{:primary :secondary "SECONDARY" "PRIMARY"})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-subdivision-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 3))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 45)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"(^((([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))$|^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$)" s__22929__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-instance-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 36))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/geo-location-country-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01/traffic-policy-instance-count] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.resource-record/value (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/r-data))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-record (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.resource-record/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/alarm-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/resource-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/traffic-policy-comment (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/r-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 4000))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/page-marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/nonce (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/fully-qualified-domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 255))))

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

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/cloud-watch-region #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :euwest-3 :useast-1 "ap-northeast-3" :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "sa-east-1" "ap-southeast-1" "ap-northeast-2" "eu-west-3" :cacentral-1 "ca-central-1" "eu-central-1" :euwest-2 :apnortheast-3 "eu-west-2" :uswest-1 :eucentral-1 :saeast-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/name (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/caller-reference (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/nonce))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/delegation-set-id (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/resource-id))
(clojure.spec.alpha/def :portkey.aws.route53.-2013-04-01/create-hosted-zone-request (clojure.spec.alpha/keys :req-un [:portkey.aws.route53.-2013-04-01.create-hosted-zone-request/name :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/caller-reference] :opt-un [:portkey.aws.route53.-2013-04-01/vpc :portkey.aws.route53.-2013-04-01/hosted-zone-config :portkey.aws.route53.-2013-04-01.create-hosted-zone-request/delegation-set-id]))

(clojure.core/defn get-reusable-delegation-set-limit ([get-reusable-delegation-set-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-reusable-delegation-set-limit-request get-reusable-delegation-set-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/reusabledelegationsetlimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReusableDelegationSetLimit", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-limit-response))

(clojure.core/defn list-tags-for-resources ([list-tags-for-resources-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resources-request list-tags-for-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resources-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResources", :http.request.configuration/output-deser-fn response-list-tags-for-resources-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resources :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-tags-for-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-tags-for-resources-response))

(clojure.core/defn delete-traffic-policy-instance ([delete-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-traffic-policy-instance-request delete-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-delete-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef delete-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-traffic-policy-instance-response))

(clojure.core/defn list-geo-locations ([] (list-geo-locations {})) ([list-geo-locations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-geo-locations-request list-geo-locations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-geo-locations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocations", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-geo-locations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGeoLocations", :http.request.configuration/output-deser-fn response-list-geo-locations-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-geo-locations :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-geo-locations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-geo-locations-response))

(clojure.core/defn disassociate-vpc-from-hosted-zone ([disassociate-vpc-from-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-disassociate-vpc-from-hosted-zone-request disassociate-vpc-from-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/disassociatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateVPCFromHostedZone", :http.request.configuration/output-deser-fn response-disassociate-vpc-from-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "VPCAssociationNotFound" :portkey.aws.route53.-2013-04-01/vpc-association-not-found, "LastVPCAssociation" :portkey.aws.route53.-2013-04-01/last-vpc-association, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef disassociate-vpc-from-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/disassociate-vpc-from-hosted-zone-response))

(clojure.core/defn delete-query-logging-config ([delete-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-query-logging-config-request delete-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteQueryLoggingConfig", :http.request.configuration/output-deser-fn response-delete-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "NoSuchQueryLoggingConfig" :portkey.aws.route53.-2013-04-01/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-query-logging-config-response))

(clojure.core/defn get-traffic-policy-instance ([get-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-instance-request get-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-response))

(clojure.core/defn create-traffic-policy ([create-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-request create-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicy", :http.request.configuration/output-deser-fn response-create-traffic-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicies" :portkey.aws.route53.-2013-04-01/too-many-traffic-policies, "TrafficPolicyAlreadyExists" :portkey.aws.route53.-2013-04-01/traffic-policy-already-exists, "InvalidTrafficPolicyDocument" :portkey.aws.route53.-2013-04-01/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-response))

(clojure.core/defn get-checker-ip-ranges ([] (get-checker-ip-ranges {})) ([get-checker-ip-ranges-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-checker-ip-ranges-request get-checker-ip-ranges-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/checkeripranges", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCheckerIpRanges", :http.request.configuration/output-deser-fn response-get-checker-ip-ranges-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-checker-ip-ranges :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-checker-ip-ranges-response))

(clojure.core/defn get-health-check-status ([get-health-check-status-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-status-request get-health-check-status-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-status-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/status", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-status-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckStatus", :http.request.configuration/output-deser-fn response-get-health-check-status-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-status :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-status-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-status-response))

(clojure.core/defn create-traffic-policy-instance ([create-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-instance-request create-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-create-traffic-policy-instance-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicyInstances" :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-instances, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "TrafficPolicyInstanceAlreadyExists" :portkey.aws.route53.-2013-04-01/traffic-policy-instance-already-exists}})))))
(clojure.spec.alpha/fdef create-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-instance-response))

(clojure.core/defn create-vpc-association-authorization ([create-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-vpc-association-authorization-request create-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-create-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "TooManyVPCAssociationAuthorizations" :portkey.aws.route53.-2013-04-01/too-many-vpc-association-authorizations, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef create-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-vpc-association-authorization-response))

(clojure.core/defn get-account-limit ([get-account-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-account-limit-request get-account-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-account-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/accountlimit/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-account-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAccountLimit", :http.request.configuration/output-deser-fn response-get-account-limit-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-account-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-account-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-account-limit-response))

(clojure.core/defn get-reusable-delegation-set ([get-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-reusable-delegation-set-request get-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetReusableDelegationSet", :http.request.configuration/output-deser-fn response-get-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-reusable-delegation-set-response))

(clojure.core/defn get-traffic-policy ([get-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-request get-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicy", :http.request.configuration/output-deser-fn response-get-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-response))

(clojure.core/defn list-traffic-policy-instances ([] (list-traffic-policy-instances {})) ([list-traffic-policy-instances-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-request list-traffic-policy-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstances", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-response))

(clojure.core/defn create-traffic-policy-version ([create-traffic-policy-version-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-traffic-policy-version-request create-traffic-policy-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateTrafficPolicyVersion", :http.request.configuration/output-deser-fn response-create-traffic-policy-version-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TooManyTrafficPolicyVersionsForCurrentPolicy" :portkey.aws.route53.-2013-04-01/too-many-traffic-policy-versions-for-current-policy, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "InvalidTrafficPolicyDocument" :portkey.aws.route53.-2013-04-01/invalid-traffic-policy-document}})))))
(clojure.spec.alpha/fdef create-traffic-policy-version :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-traffic-policy-version-response))

(clojure.core/defn list-hosted-zones-by-name ([] (list-hosted-zones-by-name {})) ([list-hosted-zones-by-name-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-hosted-zones-by-name-request list-hosted-zones-by-name-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonesbyname", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHostedZonesByName", :http.request.configuration/output-deser-fn response-list-hosted-zones-by-name-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name}})))))
(clojure.spec.alpha/fdef list-hosted-zones-by-name :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-hosted-zones-by-name-response))

(clojure.core/defn delete-health-check ([delete-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-health-check-request delete-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHealthCheck", :http.request.configuration/output-deser-fn response-delete-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "HealthCheckInUse" :portkey.aws.route53.-2013-04-01/health-check-in-use, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-health-check-response))

(clojure.core/defn delete-reusable-delegation-set ([delete-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-reusable-delegation-set-request delete-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReusableDelegationSet", :http.request.configuration/output-deser-fn response-delete-reusable-delegation-set-response, :http.request.spec/error-spec {"NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetInUse" :portkey.aws.route53.-2013-04-01/delegation-set-in-use, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-reusable-delegation-set-response))

(clojure.core/defn list-traffic-policy-versions ([list-traffic-policy-versions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-versions-request list-traffic-policy-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies/{Id}/versions", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyVersions", :http.request.configuration/output-deser-fn response-list-traffic-policy-versions-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-versions :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-versions-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-tags-for-resource-response))

(clojure.core/defn list-hosted-zones ([] (list-hosted-zones {})) ([list-hosted-zones-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-hosted-zones-request list-hosted-zones-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-hosted-zones-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHostedZones", :http.request.configuration/output-deser-fn response-list-hosted-zones-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable}})))))
(clojure.spec.alpha/fdef list-hosted-zones :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-hosted-zones-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-hosted-zones-response))

(clojure.core/defn get-hosted-zone-limit ([get-hosted-zone-limit-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-limit-request get-hosted-zone-limit-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonelimit/{Id}/{Type}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZoneLimit", :http.request.configuration/output-deser-fn response-get-hosted-zone-limit-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "HostedZoneNotPrivate" :portkey.aws.route53.-2013-04-01/hosted-zone-not-private}})))))
(clojure.spec.alpha/fdef get-hosted-zone-limit :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-limit-response))

(clojure.core/defn update-health-check ([update-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-health-check-request update-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHealthCheck", :http.request.configuration/output-deser-fn response-update-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "HealthCheckVersionMismatch" :portkey.aws.route53.-2013-04-01/health-check-version-mismatch}})))))
(clojure.spec.alpha/fdef update-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-health-check-response))

(clojure.core/defn get-geo-location ([] (get-geo-location {})) ([get-geo-location-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-geo-location-request get-geo-location-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-geo-location-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/geolocation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-geo-location-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetGeoLocation", :http.request.configuration/output-deser-fn response-get-geo-location-response, :http.request.spec/error-spec {"NoSuchGeoLocation" :portkey.aws.route53.-2013-04-01/no-such-geo-location, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-geo-location :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-geo-location-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-geo-location-response))

(clojure.core/defn update-traffic-policy-comment ([update-traffic-policy-comment-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-traffic-policy-comment-request update-traffic-policy-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrafficPolicyComment", :http.request.configuration/output-deser-fn response-update-traffic-policy-comment-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification}})))))
(clojure.spec.alpha/fdef update-traffic-policy-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-traffic-policy-comment-response))

(clojure.core/defn get-traffic-policy-instance-count ([] (get-traffic-policy-instance-count {})) ([get-traffic-policy-instance-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-traffic-policy-instance-count-request get-traffic-policy-instance-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstancecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetTrafficPolicyInstanceCount", :http.request.configuration/output-deser-fn response-get-traffic-policy-instance-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-traffic-policy-instance-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-traffic-policy-instance-count-response))

(clojure.core/defn get-hosted-zone ([get-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-request get-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZone", :http.request.configuration/output-deser-fn response-get-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-response))

(clojure.core/defn list-vpc-association-authorizations ([list-vpc-association-authorizations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-vpc-association-authorizations-request list-vpc-association-authorizations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/authorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListVPCAssociationAuthorizations", :http.request.configuration/output-deser-fn response-list-vpc-association-authorizations-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidPaginationToken" :portkey.aws.route53.-2013-04-01/invalid-pagination-token}})))))
(clojure.spec.alpha/fdef list-vpc-association-authorizations :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-vpc-association-authorizations-response))

(clojure.core/defn list-traffic-policies ([] (list-traffic-policies {})) ([list-traffic-policies-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policies-request list-traffic-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicies", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policies-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicies", :http.request.configuration/output-deser-fn response-list-traffic-policies-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-traffic-policies :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-traffic-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policies-response))

(clojure.core/defn create-hosted-zone ([create-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-hosted-zone-request create-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateHostedZone", :http.request.configuration/output-deser-fn response-create-hosted-zone-response, :http.request.spec/error-spec {"DelegationSetNotReusable" :portkey.aws.route53.-2013-04-01/delegation-set-not-reusable, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "NoSuchDelegationSet" :portkey.aws.route53.-2013-04-01/no-such-delegation-set, "ConflictingDomainExists" :portkey.aws.route53.-2013-04-01/conflicting-domain-exists, "HostedZoneAlreadyExists" :portkey.aws.route53.-2013-04-01/hosted-zone-already-exists, "TooManyHostedZones" :portkey.aws.route53.-2013-04-01/too-many-hosted-zones, "DelegationSetNotAvailable" :portkey.aws.route53.-2013-04-01/delegation-set-not-available}})))))
(clojure.spec.alpha/fdef create-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-hosted-zone-response))

(clojure.core/defn list-health-checks ([] (list-health-checks {})) ([list-health-checks-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-health-checks-request list-health-checks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-health-checks-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-health-checks-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHealthChecks", :http.request.configuration/output-deser-fn response-list-health-checks-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "IncompatibleVersion" :portkey.aws.route53.-2013-04-01/incompatible-version}})))))
(clojure.spec.alpha/fdef list-health-checks :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-health-checks-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-health-checks-response))

(clojure.core/defn delete-vpc-association-authorization ([delete-vpc-association-authorization-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-vpc-association-authorization-request delete-vpc-association-authorization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/deauthorizevpcassociation", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteVPCAssociationAuthorization", :http.request.configuration/output-deser-fn response-delete-vpc-association-authorization-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "VPCAssociationAuthorizationNotFound" :portkey.aws.route53.-2013-04-01/vpc-association-authorization-not-found, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef delete-vpc-association-authorization :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-vpc-association-authorization-response))

(clojure.core/defn get-health-check ([get-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-request get-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheck", :http.request.configuration/output-deser-fn response-get-health-check-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "IncompatibleVersion" :portkey.aws.route53.-2013-04-01/incompatible-version}})))))
(clojure.spec.alpha/fdef get-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-response))

(clojure.core/defn list-traffic-policy-instances-by-policy ([list-traffic-policy-instances-by-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-by-policy-request list-traffic-policy-instances-by-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/trafficpolicy", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstancesByPolicy", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-policy-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-policy-response))

(clojure.core/defn change-tags-for-resource ([change-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-change-tags-for-resource-request change-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/change-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/tags/{ResourceType}/{ResourceId}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/change-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeTagsForResource", :http.request.configuration/output-deser-fn response-change-tags-for-resource-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ThrottlingException" :portkey.aws.route53.-2013-04-01/throttling-exception}})))))
(clojure.spec.alpha/fdef change-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/change-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-tags-for-resource-response))

(clojure.core/defn delete-traffic-policy ([delete-traffic-policy-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-traffic-policy-request delete-traffic-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicy/{Id}/{Version}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-traffic-policy-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTrafficPolicy", :http.request.configuration/output-deser-fn response-delete-traffic-policy-response, :http.request.spec/error-spec {"NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "TrafficPolicyInUse" :portkey.aws.route53.-2013-04-01/traffic-policy-in-use, "ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification}})))))
(clojure.spec.alpha/fdef delete-traffic-policy :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-traffic-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-traffic-policy-response))

(clojure.core/defn create-query-logging-config ([create-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-query-logging-config-request create-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateQueryLoggingConfig", :http.request.configuration/output-deser-fn response-create-query-logging-config-response, :http.request.spec/error-spec {"ConcurrentModification" :portkey.aws.route53.-2013-04-01/concurrent-modification, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NoSuchCloudWatchLogsLogGroup" :portkey.aws.route53.-2013-04-01/no-such-cloud-watch-logs-log-group, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "QueryLoggingConfigAlreadyExists" :portkey.aws.route53.-2013-04-01/query-logging-config-already-exists, "InsufficientCloudWatchLogsResourcePolicy" :portkey.aws.route53.-2013-04-01/insufficient-cloud-watch-logs-resource-policy}})))))
(clojure.spec.alpha/fdef create-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-query-logging-config-response))

(clojure.core/defn get-health-check-count ([] (get-health-check-count {})) ([get-health-check-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-count-request get-health-check-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheckcount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckCount", :http.request.configuration/output-deser-fn response-get-health-check-count-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-health-check-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-health-check-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-count-response))

(clojure.core/defn test-dns-answer ([test-dns-answer-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-test-dns-answer-request test-dns-answer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/test-dns-answer-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/testdnsanswer", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/test-dns-answer-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "TestDNSAnswer", :http.request.configuration/output-deser-fn response-test-dns-answer-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef test-dns-answer :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/test-dns-answer-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/test-dns-answer-response))

(clojure.core/defn update-traffic-policy-instance ([update-traffic-policy-instance-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-traffic-policy-instance-request update-traffic-policy-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstance/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateTrafficPolicyInstance", :http.request.configuration/output-deser-fn response-update-traffic-policy-instance-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicy" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "ConflictingTypes" :portkey.aws.route53.-2013-04-01/conflicting-types}})))))
(clojure.spec.alpha/fdef update-traffic-policy-instance :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-traffic-policy-instance-response))

(clojure.core/defn list-traffic-policy-instances-by-hosted-zone ([list-traffic-policy-instances-by-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-traffic-policy-instances-by-hosted-zone-request list-traffic-policy-instances-by-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/trafficpolicyinstances/hostedzone", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrafficPolicyInstancesByHostedZone", :http.request.configuration/output-deser-fn response-list-traffic-policy-instances-by-hosted-zone-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "NoSuchTrafficPolicyInstance" :portkey.aws.route53.-2013-04-01/no-such-traffic-policy-instance, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-traffic-policy-instances-by-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-traffic-policy-instances-by-hosted-zone-response))

(clojure.core/defn update-hosted-zone-comment ([update-hosted-zone-comment-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-hosted-zone-comment-request update-hosted-zone-comment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateHostedZoneComment", :http.request.configuration/output-deser-fn response-update-hosted-zone-comment-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef update-hosted-zone-comment :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/update-hosted-zone-comment-response))

(clojure.core/defn get-change ([get-change-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-change-request get-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-change-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/change/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-change-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetChange", :http.request.configuration/output-deser-fn response-get-change-response, :http.request.spec/error-spec {"NoSuchChange" :portkey.aws.route53.-2013-04-01/no-such-change, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-change :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-change-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-change-response))

(clojure.core/defn list-query-logging-configs ([] (list-query-logging-configs {})) ([list-query-logging-configs-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-query-logging-configs-request list-query-logging-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-query-logging-configs-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-query-logging-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQueryLoggingConfigs", :http.request.configuration/output-deser-fn response-list-query-logging-configs-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidPaginationToken" :portkey.aws.route53.-2013-04-01/invalid-pagination-token, "NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone}})))))
(clojure.spec.alpha/fdef list-query-logging-configs :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-query-logging-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-query-logging-configs-response))

(clojure.core/defn create-health-check ([create-health-check-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-health-check-request create-health-check-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-health-check-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-health-check-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateHealthCheck", :http.request.configuration/output-deser-fn response-create-health-check-response, :http.request.spec/error-spec {"TooManyHealthChecks" :portkey.aws.route53.-2013-04-01/too-many-health-checks, "HealthCheckAlreadyExists" :portkey.aws.route53.-2013-04-01/health-check-already-exists, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef create-health-check :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-health-check-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-health-check-response))

(clojure.core/defn associate-vpc-with-hosted-zone ([associate-vpc-with-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-associate-vpc-with-hosted-zone-request associate-vpc-with-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/associatevpc", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateVPCWithHostedZone", :http.request.configuration/output-deser-fn response-associate-vpc-with-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NotAuthorizedException" :portkey.aws.route53.-2013-04-01/not-authorized-exception, "InvalidVPCId" :portkey.aws.route53.-2013-04-01/invalid-vpc-id, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PublicZoneVPCAssociation" :portkey.aws.route53.-2013-04-01/public-zone-vpc-association, "ConflictingDomainExists" :portkey.aws.route53.-2013-04-01/conflicting-domain-exists, "LimitsExceeded" :portkey.aws.route53.-2013-04-01/limits-exceeded}})))))
(clojure.spec.alpha/fdef associate-vpc-with-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/associate-vpc-with-hosted-zone-response))

(clojure.core/defn change-resource-record-sets ([change-resource-record-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-change-resource-record-sets-request change-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/change-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset/", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/change-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeResourceRecordSets", :http.request.configuration/output-deser-fn response-change-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidChangeBatch" :portkey.aws.route53.-2013-04-01/invalid-change-batch, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete}})))))
(clojure.spec.alpha/fdef change-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/change-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/change-resource-record-sets-response))

(clojure.core/defn create-reusable-delegation-set ([create-reusable-delegation-set-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-reusable-delegation-set-request create-reusable-delegation-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateReusableDelegationSet", :http.request.configuration/output-deser-fn response-create-reusable-delegation-set-response, :http.request.spec/error-spec {"DelegationSetAlreadyCreated" :portkey.aws.route53.-2013-04-01/delegation-set-already-created, "LimitsExceeded" :portkey.aws.route53.-2013-04-01/limits-exceeded, "HostedZoneNotFound" :portkey.aws.route53.-2013-04-01/hosted-zone-not-found, "InvalidArgument" :portkey.aws.route53.-2013-04-01/invalid-argument, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "DelegationSetNotAvailable" :portkey.aws.route53.-2013-04-01/delegation-set-not-available, "DelegationSetAlreadyReusable" :portkey.aws.route53.-2013-04-01/delegation-set-already-reusable}})))))
(clojure.spec.alpha/fdef create-reusable-delegation-set :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/create-reusable-delegation-set-response))

(clojure.core/defn list-resource-record-sets ([list-resource-record-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-resource-record-sets-request list-resource-record-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-resource-record-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}/rrset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-resource-record-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListResourceRecordSets", :http.request.configuration/output-deser-fn response-list-resource-record-sets-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-resource-record-sets :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/list-resource-record-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-resource-record-sets-response))

(clojure.core/defn get-hosted-zone-count ([] (get-hosted-zone-count {})) ([get-hosted-zone-count-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-hosted-zone-count-request get-hosted-zone-count-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzonecount", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHostedZoneCount", :http.request.configuration/output-deser-fn response-get-hosted-zone-count-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-hosted-zone-count :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-hosted-zone-count-response))

(clojure.core/defn get-health-check-last-failure-reason ([get-health-check-last-failure-reason-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-health-check-last-failure-reason-request get-health-check-last-failure-reason-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/healthcheck/{HealthCheckId}/lastfailurereason", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetHealthCheckLastFailureReason", :http.request.configuration/output-deser-fn response-get-health-check-last-failure-reason-response, :http.request.spec/error-spec {"NoSuchHealthCheck" :portkey.aws.route53.-2013-04-01/no-such-health-check, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-health-check-last-failure-reason :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-health-check-last-failure-reason-response))

(clojure.core/defn list-reusable-delegation-sets ([] (list-reusable-delegation-sets {})) ([list-reusable-delegation-sets-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-reusable-delegation-sets-request list-reusable-delegation-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/delegationset", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListReusableDelegationSets", :http.request.configuration/output-deser-fn response-list-reusable-delegation-sets-response, :http.request.spec/error-spec {"InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef list-reusable-delegation-sets :args (clojure.spec.alpha/? :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/list-reusable-delegation-sets-response))

(clojure.core/defn delete-hosted-zone ([delete-hosted-zone-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-hosted-zone-request delete-hosted-zone-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/delete-hosted-zone-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/hostedzone/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/delete-hosted-zone-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHostedZone", :http.request.configuration/output-deser-fn response-delete-hosted-zone-response, :http.request.spec/error-spec {"NoSuchHostedZone" :portkey.aws.route53.-2013-04-01/no-such-hosted-zone, "HostedZoneNotEmpty" :portkey.aws.route53.-2013-04-01/hosted-zone-not-empty, "PriorRequestNotComplete" :portkey.aws.route53.-2013-04-01/prior-request-not-complete, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input, "InvalidDomainName" :portkey.aws.route53.-2013-04-01/invalid-domain-name}})))))
(clojure.spec.alpha/fdef delete-hosted-zone :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/delete-hosted-zone-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/delete-hosted-zone-response))

(clojure.core/defn get-query-logging-config ([get-query-logging-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-query-logging-config-request get-query-logging-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.route53.-2013-04-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.route53.-2013-04-01/get-query-logging-config-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2013-04-01/queryloggingconfig/{Id}", :http.request.configuration/version "2013-04-01", :http.request.configuration/service-id "Route 53", :http.request.spec/input-spec :portkey.aws.route53.-2013-04-01/get-query-logging-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueryLoggingConfig", :http.request.configuration/output-deser-fn response-get-query-logging-config-response, :http.request.spec/error-spec {"NoSuchQueryLoggingConfig" :portkey.aws.route53.-2013-04-01/no-such-query-logging-config, "InvalidInput" :portkey.aws.route53.-2013-04-01/invalid-input}})))))
(clojure.spec.alpha/fdef get-query-logging-config :args (clojure.spec.alpha/tuple :portkey.aws.route53.-2013-04-01/get-query-logging-config-request) :ret (clojure.spec.alpha/and :portkey.aws.route53.-2013-04-01/get-query-logging-config-response))
