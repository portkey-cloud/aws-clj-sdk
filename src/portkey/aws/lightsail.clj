(ns portkey.aws.lightsail (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "lightsail", :region "ap-northeast-1"},
    :ssl-common-name "lightsail.ap-northeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "lightsail", :region "eu-west-1"},
    :ssl-common-name "lightsail.eu-west-1.amazonaws.com",
    :endpoint "https://lightsail.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "lightsail", :region "us-east-2"},
    :ssl-common-name "lightsail.us-east-2.amazonaws.com",
    :endpoint "https://lightsail.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "lightsail", :region "ap-southeast-2"},
    :ssl-common-name "lightsail.ap-southeast-2.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "lightsail", :region "ap-southeast-1"},
    :ssl-common-name "lightsail.ap-southeast-1.amazonaws.com",
    :endpoint "https://lightsail.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "lightsail", :region "ap-northeast-2"},
    :ssl-common-name "lightsail.ap-northeast-2.amazonaws.com",
    :endpoint "https://lightsail.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "lightsail", :region "eu-west-3"},
    :ssl-common-name "lightsail.eu-west-3.amazonaws.com",
    :endpoint "https://lightsail.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "lightsail", :region "ca-central-1"},
    :ssl-common-name "lightsail.ca-central-1.amazonaws.com",
    :endpoint "https://lightsail.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "lightsail", :region "eu-central-1"},
    :ssl-common-name "lightsail.eu-central-1.amazonaws.com",
    :endpoint "https://lightsail.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "lightsail", :region "eu-west-2"},
    :ssl-common-name "lightsail.eu-west-2.amazonaws.com",
    :endpoint "https://lightsail.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lightsail", :region "us-west-2"},
    :ssl-common-name "lightsail.us-west-2.amazonaws.com",
    :endpoint "https://lightsail.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lightsail", :region "us-east-1"},
    :ssl-common-name "lightsail.us-east-1.amazonaws.com",
    :endpoint "https://lightsail.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "lightsail", :region "ap-south-1"},
    :ssl-common-name "lightsail.ap-south-1.amazonaws.com",
    :endpoint "https://lightsail.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare serboolean)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-metric-statistic-list)

(clojure.core/declare ser-string-max-256)

(clojure.core/declare ser-disk-map-list)

(clojure.core/declare ser-port-info)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare serstring)

(clojure.core/declare ser-load-balancer-metric-name)

(clojure.core/declare ser-base-64)

(clojure.core/declare sertimestamp)

(clojure.core/declare ser-domain-entry)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-metric-period)

(clojure.core/declare ser-disk-map)

(clojure.core/declare ser-domain-name-list)

(clojure.core/declare ser-port)

(clojure.core/declare ser-resource-name-list)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-domain-entry-options-keys)

(clojure.core/declare serinteger)

(clojure.core/declare ser-instance-metric-name)

(clojure.core/declare ser-metric-statistic)

(clojure.core/declare ser-network-protocol)

(clojure.core/declare ser-attached-disk-map)

(clojure.core/declare ser-domain-entry-type)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-load-balancer-attribute-name)

(clojure.core/declare ser-instance-access-protocol)

(clojure.core/declare ser-port-info-list)

(clojure.core/declare ser-domain-entry-options)

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-metric-statistic-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-statistic coll) #:http.request.field{:shape "MetricStatistic"}))) input), :shape "MetricStatisticList", :type "list"})

(clojure.core/defn- ser-string-max-256 [input] #:http.request.field{:value input, :shape "StringMax256"})

(clojure.core/defn- ser-disk-map-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-disk-map coll) #:http.request.field{:shape "DiskMap"}))) input), :shape "DiskMapList", :type "list"})

(clojure.core/defn- ser-port-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PortInfo", :type "structure"} (clojure.core/contains? input :from-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :from-port)) #:http.request.field{:name "fromPort", :shape "Port"})) (clojure.core/contains? input :to-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port (input :to-port)) #:http.request.field{:name "toPort", :shape "Port"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "NetworkProtocol"}))))

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-load-balancer-metric-name [input] #:http.request.field{:value (clojure.core/get {:http-code-instance-4-xx-count "HTTPCode_Instance_4XX_Count", "InstanceResponseTime" "InstanceResponseTime", "RejectedConnectionCount" "RejectedConnectionCount", "HTTPCode_LB_5XX_Count" "HTTPCode_LB_5XX_Count", :healthy-host-count "HealthyHostCount", :instance-response-time "InstanceResponseTime", :http-code-lb-4-xx-count "HTTPCode_LB_4XX_Count", :http-code-lb-5-xx-count "HTTPCode_LB_5XX_Count", "RequestCount" "RequestCount", :http-code-instance-3-xx-count "HTTPCode_Instance_3XX_Count", :http-code-instance-5-xx-count "HTTPCode_Instance_5XX_Count", "ClientTLSNegotiationErrorCount" "ClientTLSNegotiationErrorCount", :client-tls-negotiation-error-count "ClientTLSNegotiationErrorCount", :http-code-instance-2-xx-count "HTTPCode_Instance_2XX_Count", :unhealthy-host-count "UnhealthyHostCount", "HTTPCode_Instance_5XX_Count" "HTTPCode_Instance_5XX_Count", "HTTPCode_LB_4XX_Count" "HTTPCode_LB_4XX_Count", "HTTPCode_Instance_2XX_Count" "HTTPCode_Instance_2XX_Count", :rejected-connection-count "RejectedConnectionCount", "HealthyHostCount" "HealthyHostCount", "UnhealthyHostCount" "UnhealthyHostCount", :request-count "RequestCount", "HTTPCode_Instance_3XX_Count" "HTTPCode_Instance_3XX_Count", "HTTPCode_Instance_4XX_Count" "HTTPCode_Instance_4XX_Count"} input), :shape "LoadBalancerMetricName"})

(clojure.core/defn- ser-base-64 [input] #:http.request.field{:value input, :shape "Base64"})

(clojure.core/defn- sertimestamp [input] #:http.request.field{:value input, :shape "timestamp"})

(clojure.core/defn- ser-domain-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DomainEntry", :type "structure"} (clojure.core/contains? input :id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :id)) #:http.request.field{:name "id", :shape "NonEmptyString"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :name)) #:http.request.field{:name "name", :shape "DomainName"})) (clojure.core/contains? input :target) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :target)) #:http.request.field{:name "target", :shape "string"})) (clojure.core/contains? input :is-alias) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-alias)) #:http.request.field{:name "isAlias", :shape "boolean"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-entry-type (input :type)) #:http.request.field{:name "type", :shape "DomainEntryType"})) (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-entry-options (input :options)) #:http.request.field{:name "options", :shape "DomainEntryOptions", :deprecated true}))))

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value (clojure.core/get {:kilobytes-second "Kilobytes/Second", :megabits "Megabits", "Terabytes" "Terabytes", :bits-second "Bits/Second", :count-second "Count/Second", :kilobits "Kilobits", "Kilobits/Second" "Kilobits/Second", "Count" "Count", :megabytes-second "Megabytes/Second", "Bits" "Bits", "Percent" "Percent", "Gigabits/Second" "Gigabits/Second", :terabytes "Terabytes", :terabits-second "Terabits/Second", "None" "None", :seconds "Seconds", :bits "Bits", :terabits "Terabits", :bytes-second "Bytes/Second", :kilobytes "Kilobytes", :microseconds "Microseconds", "Count/Second" "Count/Second", "Bytes" "Bytes", "Gigabytes/Second" "Gigabytes/Second", :megabits-second "Megabits/Second", "Megabits/Second" "Megabits/Second", :gigabits "Gigabits", "Kilobytes/Second" "Kilobytes/Second", :gigabits-second "Gigabits/Second", :kilobits-second "Kilobits/Second", :megabytes "Megabytes", "Terabytes/Second" "Terabytes/Second", "Bits/Second" "Bits/Second", "Bytes/Second" "Bytes/Second", "Milliseconds" "Milliseconds", :count "Count", :gigabytes-second "Gigabytes/Second", "Kilobytes" "Kilobytes", :bytes "Bytes", :milliseconds "Milliseconds", "Microseconds" "Microseconds", :percent "Percent", "Terabits" "Terabits", :gigabytes "Gigabytes", "Megabytes/Second" "Megabytes/Second", :terabytes-second "Terabytes/Second", "Gigabytes" "Gigabytes", "Gigabits" "Gigabits", "Megabits" "Megabits", :none "None", "Kilobits" "Kilobits", "Terabits/Second" "Terabits/Second", "Megabytes" "Megabytes", "Seconds" "Seconds"} input), :shape "MetricUnit"})

(clojure.core/defn- ser-metric-period [input] #:http.request.field{:value input, :shape "MetricPeriod"})

(clojure.core/defn- ser-disk-map [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DiskMap", :type "structure"} (clojure.core/contains? input :original-disk-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :original-disk-path)) #:http.request.field{:name "originalDiskPath", :shape "NonEmptyString"})) (clojure.core/contains? input :new-disk-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :new-disk-name)) #:http.request.field{:name "newDiskName", :shape "ResourceName"}))))

(clojure.core/defn- ser-domain-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-domain-name coll) #:http.request.field{:shape "DomainName"}))) input), :shape "DomainNameList", :type "list"})

(clojure.core/defn- ser-port [input] #:http.request.field{:value input, :shape "Port"})

(clojure.core/defn- ser-resource-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "ResourceNameList", :type "list"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-domain-entry-options-keys [input] #:http.request.field{:value input, :shape "DomainEntryOptionsKeys"})

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-instance-metric-name [input] #:http.request.field{:value (clojure.core/get {:status-check-failed-system "StatusCheckFailed_System", "StatusCheckFailed" "StatusCheckFailed", "StatusCheckFailed_System" "StatusCheckFailed_System", :cpu-utilization "CPUUtilization", "NetworkOut" "NetworkOut", :network-out "NetworkOut", :network-in "NetworkIn", :status-check-failed-instance "StatusCheckFailed_Instance", "StatusCheckFailed_Instance" "StatusCheckFailed_Instance", "CPUUtilization" "CPUUtilization", "NetworkIn" "NetworkIn", :status-check-failed "StatusCheckFailed"} input), :shape "InstanceMetricName"})

(clojure.core/defn- ser-metric-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "MetricStatistic"})

(clojure.core/defn- ser-network-protocol [input] #:http.request.field{:value (clojure.core/get {"tcp" "tcp", :tcp "tcp", "all" "all", :all "all", "udp" "udp", :udp "udp"} input), :shape "NetworkProtocol"})

(clojure.core/defn- ser-attached-disk-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-resource-name k) #:http.request.field{:map-info "key", :shape "ResourceName"}) (clojure.core/into (ser-disk-map-list v) #:http.request.field{:map-info "value", :shape "DiskMapList"})])) input), :shape "AttachedDiskMap", :type "map"})

(clojure.core/defn- ser-domain-entry-type [input] #:http.request.field{:value input, :shape "DomainEntryType"})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-load-balancer-attribute-name [input] #:http.request.field{:value (clojure.core/get {"HealthCheckPath" "HealthCheckPath", :health-check-path "HealthCheckPath", "SessionStickinessEnabled" "SessionStickinessEnabled", :session-stickiness-enabled "SessionStickinessEnabled", "SessionStickiness_LB_CookieDurationSeconds" "SessionStickiness_LB_CookieDurationSeconds", :session-stickiness-lb-cookie-duration-seconds "SessionStickiness_LB_CookieDurationSeconds"} input), :shape "LoadBalancerAttributeName"})

(clojure.core/defn- ser-instance-access-protocol [input] #:http.request.field{:value (clojure.core/get {"ssh" "ssh", :ssh "ssh", "rdp" "rdp", :rdp "rdp"} input), :shape "InstanceAccessProtocol"})

(clojure.core/defn- ser-port-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-port-info coll) #:http.request.field{:shape "PortInfo"}))) input), :shape "PortInfoList", :type "list"})

(clojure.core/defn- ser-domain-entry-options [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-domain-entry-options-keys k) #:http.request.field{:map-info "key", :shape "DomainEntryOptionsKeys"}) (clojure.core/into (serstring v) #:http.request.field{:map-info "value", :shape "string"})])) input), :shape "DomainEntryOptions", :type "map"})

(clojure.core/defn- req-create-instances-from-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "StringList"}) (clojure.core/into (serstring (input :availability-zone)) #:http.request.field{:name "availabilityZone", :shape "string"}) (clojure.core/into (ser-resource-name (input :instance-snapshot-name)) #:http.request.field{:name "instanceSnapshotName", :shape "ResourceName"}) (clojure.core/into (ser-non-empty-string (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "NonEmptyString"})]} (clojure.core/contains? input :attached-disk-mapping) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attached-disk-map (input :attached-disk-mapping)) #:http.request.field{:name "attachedDiskMapping", :shape "AttachedDiskMap"})) (clojure.core/contains? input :user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :user-data)) #:http.request.field{:name "userData", :shape "string"})) (clojure.core/contains? input :key-pair-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"}))))

(clojure.core/defn- req-attach-load-balancer-tls-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :certificate-name)) #:http.request.field{:name "certificateName", :shape "ResourceName"})]}))

(clojure.core/defn- req-detach-disk-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-disk-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-snapshot-name)) #:http.request.field{:name "diskSnapshotName", :shape "ResourceName"})]}))

(clojure.core/defn- req-create-domain-entry-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}) (clojure.core/into (ser-domain-entry (input :domain-entry)) #:http.request.field{:name "domainEntry", :shape "DomainEntry"})]}))

(clojure.core/defn- req-get-key-pair-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-update-load-balancer-attribute-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-attribute-name (input :attribute-name)) #:http.request.field{:name "attributeName", :shape "LoadBalancerAttributeName"}) (clojure.core/into (ser-string-max-256 (input :attribute-value)) #:http.request.field{:name "attributeValue", :shape "StringMax256"})]}))

(clojure.core/defn- req-create-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "StringList"}) (clojure.core/into (serstring (input :availability-zone)) #:http.request.field{:name "availabilityZone", :shape "string"}) (clojure.core/into (ser-non-empty-string (input :blueprint-id)) #:http.request.field{:name "blueprintId", :shape "NonEmptyString"}) (clojure.core/into (ser-non-empty-string (input :bundle-id)) #:http.request.field{:name "bundleId", :shape "NonEmptyString"})]} (clojure.core/contains? input :custom-image-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :custom-image-name)) #:http.request.field{:name "customImageName", :shape "ResourceName", :deprecated true})) (clojure.core/contains? input :user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :user-data)) #:http.request.field{:name "userData", :shape "string"})) (clojure.core/contains? input :key-pair-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"}))))

(clojure.core/defn- req-get-load-balancer-metric-data-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-metric-name (input :metric-name)) #:http.request.field{:name "metricName", :shape "LoadBalancerMetricName"}) (clojure.core/into (ser-metric-period (input :period)) #:http.request.field{:name "period", :shape "MetricPeriod"}) (clojure.core/into (sertimestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "timestamp"}) (clojure.core/into (sertimestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "timestamp"}) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "unit", :shape "MetricUnit"}) (clojure.core/into (ser-metric-statistic-list (input :statistics)) #:http.request.field{:name "statistics", :shape "MetricStatisticList"})]}))

(clojure.core/defn- req-get-disk-snapshots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-attach-static-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :static-ip-name)) #:http.request.field{:name "staticIpName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-create-key-pair-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-instance-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-snapshot-name)) #:http.request.field{:name "instanceSnapshotName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-static-ips-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-import-key-pair-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"}) (clojure.core/into (ser-base-64 (input :public-key-base-64)) #:http.request.field{:name "publicKeyBase64", :shape "Base64"})]}))

(clojure.core/defn- req-get-load-balancer-tls-certificates-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-operations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-allocate-static-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :static-ip-name)) #:http.request.field{:name "staticIpName", :shape "ResourceName"})]}))

(clojure.core/defn- req-create-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"})]}))

(clojure.core/defn- req-put-instance-public-ports-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-port-info-list (input :port-infos)) #:http.request.field{:name "portInfos", :shape "PortInfoList"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-blueprints-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :include-inactive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-inactive)) #:http.request.field{:name "includeInactive", :shape "boolean"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-delete-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-domains-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-delete-disk-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-instance-snapshots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-stop-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :force)) #:http.request.field{:name "force", :shape "boolean"}))))

(clojure.core/defn- req-detach-static-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :static-ip-name)) #:http.request.field{:name "staticIpName", :shape "ResourceName"})]}))

(clojure.core/defn- req-is-vpc-peered-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-get-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"})]}))

(clojure.core/defn- req-delete-load-balancer-tls-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :certificate-name)) #:http.request.field{:name "certificateName", :shape "ResourceName"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :force)) #:http.request.field{:name "force", :shape "boolean"}))))

(clojure.core/defn- req-get-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-delete-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"})]}))

(clojure.core/defn- req-create-disk-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :disk-snapshot-name)) #:http.request.field{:name "diskSnapshotName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-static-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :static-ip-name)) #:http.request.field{:name "staticIpName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-regions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :include-availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-availability-zones)) #:http.request.field{:name "includeAvailabilityZones", :shape "boolean"}))))

(clojure.core/defn- req-get-key-pairs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-update-domain-entry-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}) (clojure.core/into (ser-domain-entry (input :domain-entry)) #:http.request.field{:name "domainEntry", :shape "DomainEntry"})]}))

(clojure.core/defn- req-peer-vpc-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-download-default-key-pair-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-delete-key-pair-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :key-pair-name)) #:http.request.field{:name "keyPairName", :shape "ResourceName"})]}))

(clojure.core/defn- req-unpeer-vpc-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-create-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-port (input :instance-port)) #:http.request.field{:name "instancePort", :shape "Port"})]} (clojure.core/contains? input :health-check-path) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :health-check-path)) #:http.request.field{:name "healthCheckPath", :shape "string"})) (clojure.core/contains? input :certificate-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :certificate-name)) #:http.request.field{:name "certificateName", :shape "ResourceName"})) (clojure.core/contains? input :certificate-domain-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name (input :certificate-domain-name)) #:http.request.field{:name "certificateDomainName", :shape "DomainName"})) (clojure.core/contains? input :certificate-alternative-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name-list (input :certificate-alternative-names)) #:http.request.field{:name "certificateAlternativeNames", :shape "DomainNameList"}))))

(clojure.core/defn- req-delete-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-load-balancers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-detach-instances-from-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "ResourceNameList"})]}))

(clojure.core/defn- req-get-disk-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"})]}))

(clojure.core/defn- req-delete-domain-entry-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"}) (clojure.core/into (ser-domain-entry (input :domain-entry)) #:http.request.field{:name "domainEntry", :shape "DomainEntry"})]}))

(clojure.core/defn- req-delete-instance-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-snapshot-name)) #:http.request.field{:name "instanceSnapshotName", :shape "ResourceName"})]}))

(clojure.core/defn- req-create-disk-from-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :disk-snapshot-name)) #:http.request.field{:name "diskSnapshotName", :shape "ResourceName"}) (clojure.core/into (ser-non-empty-string (input :availability-zone)) #:http.request.field{:name "availabilityZone", :shape "NonEmptyString"}) (clojure.core/into (serinteger (input :size-in-gb)) #:http.request.field{:name "sizeInGb", :shape "integer"})]}))

(clojure.core/defn- req-get-operations-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :resource-name)) #:http.request.field{:name "resourceName", :shape "ResourceName"})]} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-get-instance-access-details-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]} (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-access-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "InstanceAccessProtocol"}))))

(clojure.core/defn- req-get-active-names-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-get-instance-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-attach-disk-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"}) (clojure.core/into (ser-non-empty-string (input :disk-path)) #:http.request.field{:name "diskPath", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-reboot-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-bundles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :include-inactive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-inactive)) #:http.request.field{:name "includeInactive", :shape "boolean"})) (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-close-instance-public-ports-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-port-info (input :port-info)) #:http.request.field{:name "portInfo", :shape "PortInfo"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-start-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-release-static-ip-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :static-ip-name)) #:http.request.field{:name "staticIpName", :shape "ResourceName"})]}))

(clojure.core/defn- req-attach-instances-to-load-balancer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "ResourceNameList"})]}))

(clojure.core/defn- req-open-instance-public-ports-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-port-info (input :port-info)) #:http.request.field{:name "portInfo", :shape "PortInfo"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-operation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-non-empty-string (input :operation-id)) #:http.request.field{:name "operationId", :shape "NonEmptyString"})]}))

(clojure.core/defn- req-get-instance-port-states-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-disks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :page-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :page-token)) #:http.request.field{:name "pageToken", :shape "string"}))))

(clojure.core/defn- req-create-disk-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-name)) #:http.request.field{:name "diskName", :shape "ResourceName"}) (clojure.core/into (ser-non-empty-string (input :availability-zone)) #:http.request.field{:name "availabilityZone", :shape "NonEmptyString"}) (clojure.core/into (serinteger (input :size-in-gb)) #:http.request.field{:name "sizeInGb", :shape "integer"})]}))

(clojure.core/defn- req-create-load-balancer-tls-certificate-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :certificate-name)) #:http.request.field{:name "certificateName", :shape "ResourceName"}) (clojure.core/into (ser-domain-name (input :certificate-domain-name)) #:http.request.field{:name "certificateDomainName", :shape "DomainName"})]} (clojure.core/contains? input :certificate-alternative-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-domain-name-list (input :certificate-alternative-names)) #:http.request.field{:name "certificateAlternativeNames", :shape "DomainNameList"}))))

(clojure.core/defn- req-get-instance-metric-data-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"}) (clojure.core/into (ser-instance-metric-name (input :metric-name)) #:http.request.field{:name "metricName", :shape "InstanceMetricName"}) (clojure.core/into (ser-metric-period (input :period)) #:http.request.field{:name "period", :shape "MetricPeriod"}) (clojure.core/into (sertimestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "timestamp"}) (clojure.core/into (sertimestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "timestamp"}) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "unit", :shape "MetricUnit"}) (clojure.core/into (ser-metric-statistic-list (input :statistics)) #:http.request.field{:name "statistics", :shape "MetricStatisticList"})]}))

(clojure.core/defn- req-delete-disk-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :disk-snapshot-name)) #:http.request.field{:name "diskSnapshotName", :shape "ResourceName"})]}))

(clojure.core/defn- req-create-instance-snapshot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :instance-snapshot-name)) #:http.request.field{:name "instanceSnapshotName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "ResourceName"})]}))

(clojure.core/defn- req-get-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "domainName", :shape "DomainName"})]}))

(clojure.core/declare deserfloat)

(clojure.core/declare deserboolean)

(clojure.core/declare deser-instance-port-state)

(clojure.core/declare deser-load-balancer-tls-certificate-domain-validation-option-list)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-load-balancer-tls-certificate-summary-list)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-operation-list)

(clojure.core/declare deserstring)

(clojure.core/declare deser-port-list)

(clojure.core/declare deser-load-balancer-tls-certificate-revocation-reason)

(clojure.core/declare deser-instance-port-state-list)

(clojure.core/declare deser-disk-snapshot)

(clojure.core/declare deser-load-balancer-tls-certificate-domain-validation-record-list)

(clojure.core/declare deser-metric-datapoint)

(clojure.core/declare deser-resource-location)

(clojure.core/declare deser-load-balancer-metric-name)

(clojure.core/declare deser-instance-access-details)

(clojure.core/declare deser-region-list)

(clojure.core/declare deser-static-ip-list)

(clojure.core/declare deser-metric-datapoint-list)

(clojure.core/declare deser-instance-health-reason)

(clojure.core/declare deser-port-state)

(clojure.core/declare deser-bundle-list)

(clojure.core/declare deser-instance-health-summary)

(clojure.core/declare deser-bundle)

(clojure.core/declare deser-operation)

(clojure.core/declare deser-key-pair-list)

(clojure.core/declare deser-load-balancer-tls-certificate-domain-validation-record)

(clojure.core/declare deser-base-64)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-load-balancer-tls-certificate)

(clojure.core/declare deser-domain-entry)

(clojure.core/declare deser-availability-zone-list)

(clojure.core/declare deser-metric-unit)

(clojure.core/declare deser-availability-zone)

(clojure.core/declare deser-instance-health-state)

(clojure.core/declare deser-load-balancer-tls-certificate-failure-reason)

(clojure.core/declare deser-load-balancer-tls-certificate-domain-validation-option)

(clojure.core/declare deser-blueprint-list)

(clojure.core/declare deser-instance-networking)

(clojure.core/declare deser-load-balancer-tls-certificate-renewal-status)

(clojure.core/declare deser-port-access-type)

(clojure.core/declare deser-region-name)

(clojure.core/declare deser-blueprint)

(clojure.core/declare deser-domain)

(clojure.core/declare deser-domain-list)

(clojure.core/declare deser-instance-hardware)

(clojure.core/declare deser-load-balancer-tls-certificate-renewal-summary)

(clojure.core/declare deser-load-balancer-state)

(clojure.core/declare deser-load-balancer-tls-certificate-status)

(clojure.core/declare deser-ip-v-6-address)

(clojure.core/declare deser-instance-port-info)

(clojure.core/declare deser-port)

(clojure.core/declare deser-iso-date)

(clojure.core/declare deser-disk-snapshot-list)

(clojure.core/declare deser-instance-snapshot-state)

(clojure.core/declare deser-access-direction)

(clojure.core/declare deser-load-balancer-tls-certificate-list)

(clojure.core/declare deser-blueprint-type)

(clojure.core/declare deser-load-balancer-configuration-options)

(clojure.core/declare deser-instance-platform)

(clojure.core/declare deser-disk-state)

(clojure.core/declare deser-operation-status)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-domain-entry-options-keys)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-load-balancer-tls-certificate-summary)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-instance-metric-name)

(clojure.core/declare deser-operation-type)

(clojure.core/declare deser-instance-list)

(clojure.core/declare deserdouble)

(clojure.core/declare deser-load-balancer-protocol)

(clojure.core/declare deser-disk)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-instance-state)

(clojure.core/declare deser-load-balancer)

(clojure.core/declare deser-disk-list)

(clojure.core/declare deser-load-balancer-tls-certificate-domain-status)

(clojure.core/declare deser-network-protocol)

(clojure.core/declare deser-static-ip)

(clojure.core/declare deser-instance-snapshot)

(clojure.core/declare deser-key-pair)

(clojure.core/declare deser-domain-entry-list)

(clojure.core/declare deser-monthly-transfer)

(clojure.core/declare deser-domain-entry-type)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-instance-platform-list)

(clojure.core/declare deser-instance-snapshot-list)

(clojure.core/declare deser-load-balancer-attribute-name)

(clojure.core/declare deser-instance-access-protocol)

(clojure.core/declare deser-disk-snapshot-state)

(clojure.core/declare deser-region)

(clojure.core/declare deser-instance-health-summary-list)

(clojure.core/declare deser-password-data)

(clojure.core/declare deser-instance-port-info-list)

(clojure.core/declare deser-load-balancer-list)

(clojure.core/declare deser-domain-entry-options)

(clojure.core/defn- deserfloat [input] input)

(clojure.core/defn- deserboolean [input] input)

(clojure.core/defn- deser-instance-port-state [input] (clojure.core/cond-> {} (clojure.core/contains? input "fromPort") (clojure.core/assoc :from-port (deser-port (input "fromPort"))) (clojure.core/contains? input "toPort") (clojure.core/assoc :to-port (deser-port (input "toPort"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-network-protocol (input "protocol"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-port-state (input "state")))))

(clojure.core/defn- deser-load-balancer-tls-certificate-domain-validation-option-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-tls-certificate-domain-validation-option coll))) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-load-balancer-tls-certificate-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-tls-certificate-summary coll))) input))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-operation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-operation coll))) input))

(clojure.core/defn- deserstring [input] input)

(clojure.core/defn- deser-port-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-port coll))) input))

(clojure.core/defn- deser-load-balancer-tls-certificate-revocation-reason [input] (clojure.core/get {"PRIVILEGE_WITHDRAWN" :privilege-withdrawn, "CERTIFICATE_HOLD" :certificate-hold, "REMOVE_FROM_CRL" :remove-from-crl, "AFFILIATION_CHANGED" :affiliation-changed, "SUPERCEDED" :superceded, "KEY_COMPROMISE" :key-compromise, "UNSPECIFIED" :unspecified, "CA_COMPROMISE" :ca-compromise, "CESSATION_OF_OPERATION" :cessation-of-operation, "A_A_COMPROMISE" :a-a-compromise} input))

(clojure.core/defn- deser-instance-port-state-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-port-state coll))) input))

(clojure.core/defn- deser-disk-snapshot [input] (clojure.core/cond-> {} (clojure.core/contains? input "progress") (clojure.core/assoc :progress (deserstring (input "progress"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "sizeInGb") (clojure.core/assoc :size-in-gb (deserinteger (input "sizeInGb"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-disk-snapshot-state (input "state"))) (clojure.core/contains? input "fromDiskArn") (clojure.core/assoc :from-disk-arn (deser-non-empty-string (input "fromDiskArn"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "fromDiskName") (clojure.core/assoc :from-disk-name (deser-resource-name (input "fromDiskName")))))

(clojure.core/defn- deser-load-balancer-tls-certificate-domain-validation-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-tls-certificate-domain-validation-record coll))) input))

(clojure.core/defn- deser-metric-datapoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "average") (clojure.core/assoc :average (deserdouble (input "average"))) (clojure.core/contains? input "maximum") (clojure.core/assoc :maximum (deserdouble (input "maximum"))) (clojure.core/contains? input "minimum") (clojure.core/assoc :minimum (deserdouble (input "minimum"))) (clojure.core/contains? input "sampleCount") (clojure.core/assoc :sample-count (deserdouble (input "sampleCount"))) (clojure.core/contains? input "sum") (clojure.core/assoc :sum (deserdouble (input "sum"))) (clojure.core/contains? input "timestamp") (clojure.core/assoc :timestamp (desertimestamp (input "timestamp"))) (clojure.core/contains? input "unit") (clojure.core/assoc :unit (deser-metric-unit (input "unit")))))

(clojure.core/defn- deser-resource-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "availabilityZone") (clojure.core/assoc :availability-zone (deserstring (input "availabilityZone"))) (clojure.core/contains? input "regionName") (clojure.core/assoc :region-name (deser-region-name (input "regionName")))))

(clojure.core/defn- deser-load-balancer-metric-name [input] (clojure.core/get {"InstanceResponseTime" :instance-response-time, "RejectedConnectionCount" :rejected-connection-count, "HTTPCode_LB_5XX_Count" :http-code-lb-5-xx-count, "RequestCount" :request-count, "ClientTLSNegotiationErrorCount" :client-tls-negotiation-error-count, "HTTPCode_Instance_5XX_Count" :http-code-instance-5-xx-count, "HTTPCode_LB_4XX_Count" :http-code-lb-4-xx-count, "HTTPCode_Instance_2XX_Count" :http-code-instance-2-xx-count, "HealthyHostCount" :healthy-host-count, "UnhealthyHostCount" :unhealthy-host-count, "HTTPCode_Instance_3XX_Count" :http-code-instance-3-xx-count, "HTTPCode_Instance_4XX_Count" :http-code-instance-4-xx-count} input))

(clojure.core/defn- deser-instance-access-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-instance-access-protocol (input "protocol"))) (clojure.core/contains? input "instanceName") (clojure.core/assoc :instance-name (deser-resource-name (input "instanceName"))) (clojure.core/contains? input "passwordData") (clojure.core/assoc :password-data (deser-password-data (input "passwordData"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deserstring (input "username"))) (clojure.core/contains? input "certKey") (clojure.core/assoc :cert-key (deserstring (input "certKey"))) (clojure.core/contains? input "privateKey") (clojure.core/assoc :private-key (deserstring (input "privateKey"))) (clojure.core/contains? input "password") (clojure.core/assoc :password (deserstring (input "password"))) (clojure.core/contains? input "ipAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "ipAddress"))) (clojure.core/contains? input "expiresAt") (clojure.core/assoc :expires-at (deser-iso-date (input "expiresAt")))))

(clojure.core/defn- deser-region-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-region coll))) input))

(clojure.core/defn- deser-static-ip-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-static-ip coll))) input))

(clojure.core/defn- deser-metric-datapoint-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-datapoint coll))) input))

(clojure.core/defn- deser-instance-health-reason [input] (clojure.core/get {"Instance.ResponseCodeMismatch" :instance-response-code-mismatch, "Lb.InternalError" :lb-internal-error, "Instance.NotRegistered" :instance-not-registered, "Instance.FailedHealthChecks" :instance-failed-health-checks, "Instance.Timeout" :instance-timeout, "Instance.IpUnusable" :instance-ip-unusable, "Instance.NotInUse" :instance-not-in-use, "Instance.DeregistrationInProgress" :instance-deregistration-in-progress, "Lb.InitialHealthChecking" :lb-initial-health-checking, "Instance.InvalidState" :instance-invalid-state, "Lb.RegistrationInProgress" :lb-registration-in-progress} input))

(clojure.core/defn- deser-port-state [input] (clojure.core/get {"open" :open, "closed" :closed} input))

(clojure.core/defn- deser-bundle-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bundle coll))) input))

(clojure.core/defn- deser-instance-health-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceName") (clojure.core/assoc :instance-name (deser-resource-name (input "instanceName"))) (clojure.core/contains? input "instanceHealth") (clojure.core/assoc :instance-health (deser-instance-health-state (input "instanceHealth"))) (clojure.core/contains? input "instanceHealthReason") (clojure.core/assoc :instance-health-reason (deser-instance-health-reason (input "instanceHealthReason")))))

(clojure.core/defn- deser-bundle [input] (clojure.core/cond-> {} (clojure.core/contains? input "isActive") (clojure.core/assoc :is-active (deserboolean (input "isActive"))) (clojure.core/contains? input "diskSizeInGb") (clojure.core/assoc :disk-size-in-gb (deserinteger (input "diskSizeInGb"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deserstring (input "name"))) (clojure.core/contains? input "power") (clojure.core/assoc :power (deserinteger (input "power"))) (clojure.core/contains? input "supportedPlatforms") (clojure.core/assoc :supported-platforms (deser-instance-platform-list (input "supportedPlatforms"))) (clojure.core/contains? input "bundleId") (clojure.core/assoc :bundle-id (deser-non-empty-string (input "bundleId"))) (clojure.core/contains? input "ramSizeInGb") (clojure.core/assoc :ram-size-in-gb (deserfloat (input "ramSizeInGb"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deserstring (input "instanceType"))) (clojure.core/contains? input "transferPerMonthInGb") (clojure.core/assoc :transfer-per-month-in-gb (deserinteger (input "transferPerMonthInGb"))) (clojure.core/contains? input "price") (clojure.core/assoc :price (deserfloat (input "price"))) (clojure.core/contains? input "cpuCount") (clojure.core/assoc :cpu-count (deserinteger (input "cpuCount")))))

(clojure.core/defn- deser-operation [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourceName") (clojure.core/assoc :resource-name (deser-resource-name (input "resourceName"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "isTerminal") (clojure.core/assoc :is-terminal (deserboolean (input "isTerminal"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "operationDetails") (clojure.core/assoc :operation-details (deserstring (input "operationDetails"))) (clojure.core/contains? input "operationType") (clojure.core/assoc :operation-type (deser-operation-type (input "operationType"))) (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deserstring (input "errorCode"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-operation-status (input "status"))) (clojure.core/contains? input "errorDetails") (clojure.core/assoc :error-details (deserstring (input "errorDetails"))) (clojure.core/contains? input "statusChangedAt") (clojure.core/assoc :status-changed-at (deser-iso-date (input "statusChangedAt"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-key-pair-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-pair coll))) input))

(clojure.core/defn- deser-load-balancer-tls-certificate-domain-validation-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-non-empty-string (input "name"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-non-empty-string (input "type"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-non-empty-string (input "value"))) (clojure.core/contains? input "validationStatus") (clojure.core/assoc :validation-status (deser-load-balancer-tls-certificate-domain-status (input "validationStatus"))) (clojure.core/contains? input "domainName") (clojure.core/assoc :domain-name (deser-domain-name (input "domainName")))))

(clojure.core/defn- deser-base-64 [input] input)

(clojure.core/defn- desertimestamp [input] input)

(clojure.core/defn- deser-load-balancer-tls-certificate [input] (clojure.core/cond-> {} (clojure.core/contains? input "notAfter") (clojure.core/assoc :not-after (deser-iso-date (input "notAfter"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "serial") (clojure.core/assoc :serial (deser-non-empty-string (input "serial"))) (clojure.core/contains? input "isAttached") (clojure.core/assoc :is-attached (deserboolean (input "isAttached"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "domainValidationRecords") (clojure.core/assoc :domain-validation-records (deser-load-balancer-tls-certificate-domain-validation-record-list (input "domainValidationRecords"))) (clojure.core/contains? input "keyAlgorithm") (clojure.core/assoc :key-algorithm (deser-non-empty-string (input "keyAlgorithm"))) (clojure.core/contains? input "issuer") (clojure.core/assoc :issuer (deser-non-empty-string (input "issuer"))) (clojure.core/contains? input "domainName") (clojure.core/assoc :domain-name (deser-domain-name (input "domainName"))) (clojure.core/contains? input "revokedAt") (clojure.core/assoc :revoked-at (deser-iso-date (input "revokedAt"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-load-balancer-tls-certificate-status (input "status"))) (clojure.core/contains? input "loadBalancerName") (clojure.core/assoc :load-balancer-name (deser-resource-name (input "loadBalancerName"))) (clojure.core/contains? input "signatureAlgorithm") (clojure.core/assoc :signature-algorithm (deser-non-empty-string (input "signatureAlgorithm"))) (clojure.core/contains? input "subject") (clojure.core/assoc :subject (deser-non-empty-string (input "subject"))) (clojure.core/contains? input "subjectAlternativeNames") (clojure.core/assoc :subject-alternative-names (deser-string-list (input "subjectAlternativeNames"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "renewalSummary") (clojure.core/assoc :renewal-summary (deser-load-balancer-tls-certificate-renewal-summary (input "renewalSummary"))) (clojure.core/contains? input "notBefore") (clojure.core/assoc :not-before (deser-iso-date (input "notBefore"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-load-balancer-tls-certificate-failure-reason (input "failureReason"))) (clojure.core/contains? input "issuedAt") (clojure.core/assoc :issued-at (deser-iso-date (input "issuedAt"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "revocationReason") (clojure.core/assoc :revocation-reason (deser-load-balancer-tls-certificate-revocation-reason (input "revocationReason")))))

(clojure.core/defn- deser-domain-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-non-empty-string (input "id"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-domain-name (input "name"))) (clojure.core/contains? input "target") (clojure.core/assoc :target (deserstring (input "target"))) (clojure.core/contains? input "isAlias") (clojure.core/assoc :is-alias (deserboolean (input "isAlias"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-domain-entry-type (input "type"))) (clojure.core/contains? input "options") (clojure.core/assoc :options (deser-domain-entry-options (input "options")))))

(clojure.core/defn- deser-availability-zone-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-availability-zone coll))) input))

(clojure.core/defn- deser-metric-unit [input] (clojure.core/get {"Terabytes" :terabytes, "Kilobits/Second" :kilobits-second, "Count" :count, "Bits" :bits, "Percent" :percent, "Gigabits/Second" :gigabits-second, "None" :none, "Count/Second" :count-second, "Bytes" :bytes, "Gigabytes/Second" :gigabytes-second, "Megabits/Second" :megabits-second, "Kilobytes/Second" :kilobytes-second, "Terabytes/Second" :terabytes-second, "Bits/Second" :bits-second, "Bytes/Second" :bytes-second, "Milliseconds" :milliseconds, "Kilobytes" :kilobytes, "Microseconds" :microseconds, "Terabits" :terabits, "Megabytes/Second" :megabytes-second, "Gigabytes" :gigabytes, "Gigabits" :gigabits, "Megabits" :megabits, "Kilobits" :kilobits, "Terabits/Second" :terabits-second, "Megabytes" :megabytes, "Seconds" :seconds} input))

(clojure.core/defn- deser-availability-zone [input] (clojure.core/cond-> {} (clojure.core/contains? input "zoneName") (clojure.core/assoc :zone-name (deser-non-empty-string (input "zoneName"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-non-empty-string (input "state")))))

(clojure.core/defn- deser-instance-health-state [input] (clojure.core/get {"initial" :initial, "healthy" :healthy, "unhealthy" :unhealthy, "unused" :unused, "draining" :draining, "unavailable" :unavailable} input))

(clojure.core/defn- deser-load-balancer-tls-certificate-failure-reason [input] (clojure.core/get {"NO_AVAILABLE_CONTACTS" :no-available-contacts, "ADDITIONAL_VERIFICATION_REQUIRED" :additional-verification-required, "DOMAIN_NOT_ALLOWED" :domain-not-allowed, "INVALID_PUBLIC_DOMAIN" :invalid-public-domain, "OTHER" :other} input))

(clojure.core/defn- deser-load-balancer-tls-certificate-domain-validation-option [input] (clojure.core/cond-> {} (clojure.core/contains? input "domainName") (clojure.core/assoc :domain-name (deser-domain-name (input "domainName"))) (clojure.core/contains? input "validationStatus") (clojure.core/assoc :validation-status (deser-load-balancer-tls-certificate-domain-status (input "validationStatus")))))

(clojure.core/defn- deser-blueprint-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-blueprint coll))) input))

(clojure.core/defn- deser-instance-networking [input] (clojure.core/cond-> {} (clojure.core/contains? input "monthlyTransfer") (clojure.core/assoc :monthly-transfer (deser-monthly-transfer (input "monthlyTransfer"))) (clojure.core/contains? input "ports") (clojure.core/assoc :ports (deser-instance-port-info-list (input "ports")))))

(clojure.core/defn- deser-load-balancer-tls-certificate-renewal-status [input] (clojure.core/get {"PENDING_AUTO_RENEWAL" :pending-auto-renewal, "PENDING_VALIDATION" :pending-validation, "SUCCESS" :success, "FAILED" :failed} input))

(clojure.core/defn- deser-port-access-type [input] (clojure.core/get {"Public" :public, "Private" :private} input))

(clojure.core/defn- deser-region-name [input] (clojure.core/get {"ap-northeast-1" :apnortheast-1, "eu-west-1" :euwest-1, "us-east-2" :useast-2, "ap-southeast-2" :apsoutheast-2, "ap-southeast-1" :apsoutheast-1, "ap-northeast-2" :apnortheast-2, "eu-central-1" :eucentral-1, "eu-west-2" :euwest-2, "us-west-2" :uswest-2, "us-east-1" :useast-1, "us-west-1" :uswest-1, "ap-south-1" :apsouth-1} input))

(clojure.core/defn- deser-blueprint [input] (clojure.core/cond-> {} (clojure.core/contains? input "isActive") (clojure.core/assoc :is-active (deserboolean (input "isActive"))) (clojure.core/contains? input "blueprintId") (clojure.core/assoc :blueprint-id (deser-non-empty-string (input "blueprintId"))) (clojure.core/contains? input "group") (clojure.core/assoc :group (deser-non-empty-string (input "group"))) (clojure.core/contains? input "minPower") (clojure.core/assoc :min-power (deserinteger (input "minPower"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "productUrl") (clojure.core/assoc :product-url (deserstring (input "productUrl"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-blueprint-type (input "type"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deserstring (input "version"))) (clojure.core/contains? input "licenseUrl") (clojure.core/assoc :license-url (deserstring (input "licenseUrl"))) (clojure.core/contains? input "versionCode") (clojure.core/assoc :version-code (deserstring (input "versionCode"))) (clojure.core/contains? input "platform") (clojure.core/assoc :platform (deser-instance-platform (input "platform"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deserstring (input "description")))))

(clojure.core/defn- deser-domain [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "domainEntries") (clojure.core/assoc :domain-entries (deser-domain-entry-list (input "domainEntries")))))

(clojure.core/defn- deser-domain-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain coll))) input))

(clojure.core/defn- deser-instance-hardware [input] (clojure.core/cond-> {} (clojure.core/contains? input "cpuCount") (clojure.core/assoc :cpu-count (deserinteger (input "cpuCount"))) (clojure.core/contains? input "disks") (clojure.core/assoc :disks (deser-disk-list (input "disks"))) (clojure.core/contains? input "ramSizeInGb") (clojure.core/assoc :ram-size-in-gb (deserfloat (input "ramSizeInGb")))))

(clojure.core/defn- deser-load-balancer-tls-certificate-renewal-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "renewalStatus") (clojure.core/assoc :renewal-status (deser-load-balancer-tls-certificate-renewal-status (input "renewalStatus"))) (clojure.core/contains? input "domainValidationOptions") (clojure.core/assoc :domain-validation-options (deser-load-balancer-tls-certificate-domain-validation-option-list (input "domainValidationOptions")))))

(clojure.core/defn- deser-load-balancer-state [input] (clojure.core/get {"active" :active, "provisioning" :provisioning, "active_impaired" :active-impaired, "failed" :failed, "unknown" :unknown} input))

(clojure.core/defn- deser-load-balancer-tls-certificate-status [input] (clojure.core/get {"PENDING_VALIDATION" :pending-validation, "ISSUED" :issued, "INACTIVE" :inactive, "EXPIRED" :expired, "VALIDATION_TIMED_OUT" :validation-timed-out, "REVOKED" :revoked, "FAILED" :failed, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-ip-v-6-address [input] input)

(clojure.core/defn- deser-instance-port-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "fromPort") (clojure.core/assoc :from-port (deser-port (input "fromPort"))) (clojure.core/contains? input "toPort") (clojure.core/assoc :to-port (deser-port (input "toPort"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-network-protocol (input "protocol"))) (clojure.core/contains? input "accessFrom") (clojure.core/assoc :access-from (deserstring (input "accessFrom"))) (clojure.core/contains? input "accessType") (clojure.core/assoc :access-type (deser-port-access-type (input "accessType"))) (clojure.core/contains? input "commonName") (clojure.core/assoc :common-name (deserstring (input "commonName"))) (clojure.core/contains? input "accessDirection") (clojure.core/assoc :access-direction (deser-access-direction (input "accessDirection")))))

(clojure.core/defn- deser-port [input] input)

(clojure.core/defn- deser-iso-date [input] input)

(clojure.core/defn- deser-disk-snapshot-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-disk-snapshot coll))) input))

(clojure.core/defn- deser-instance-snapshot-state [input] (clojure.core/get {"pending" :pending, "error" :error, "available" :available} input))

(clojure.core/defn- deser-access-direction [input] (clojure.core/get {"inbound" :inbound, "outbound" :outbound} input))

(clojure.core/defn- deser-load-balancer-tls-certificate-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-tls-certificate coll))) input))

(clojure.core/defn- deser-blueprint-type [input] (clojure.core/get {"os" :os, "app" :app} input))

(clojure.core/defn- deser-load-balancer-configuration-options [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-load-balancer-attribute-name k) (deserstring v)])) input))

(clojure.core/defn- deser-instance-platform [input] (clojure.core/get {"LINUX_UNIX" :linux-unix, "WINDOWS" :windows} input))

(clojure.core/defn- deser-disk-state [input] (clojure.core/get {"pending" :pending, "error" :error, "available" :available, "in-use" :inuse, "unknown" :unknown} input))

(clojure.core/defn- deser-operation-status [input] (clojure.core/get {"NotStarted" :not-started, "Started" :started, "Failed" :failed, "Completed" :completed, "Succeeded" :succeeded} input))

(clojure.core/defn- deser-resource-name [input] input)

(clojure.core/defn- deser-domain-entry-options-keys [input] input)

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"DiskSnapshot" :disk-snapshot, "PeeredVpc" :peered-vpc, "LoadBalancerTlsCertificate" :load-balancer-tls-certificate, "Domain" :domain, "Disk" :disk, "LoadBalancer" :load-balancer, "StaticIp" :static-ip, "InstanceSnapshot" :instance-snapshot, "KeyPair" :key-pair, "Instance" :instance} input))

(clojure.core/defn- deser-load-balancer-tls-certificate-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "isAttached") (clojure.core/assoc :is-attached (deserboolean (input "isAttached")))))

(clojure.core/defn- deserinteger [input] input)

(clojure.core/defn- deser-instance-metric-name [input] (clojure.core/get {"CPUUtilization" :cpu-utilization, "NetworkIn" :network-in, "NetworkOut" :network-out, "StatusCheckFailed" :status-check-failed, "StatusCheckFailed_Instance" :status-check-failed-instance, "StatusCheckFailed_System" :status-check-failed-system} input))

(clojure.core/defn- deser-operation-type [input] (clojure.core/get {"AttachStaticIp" :attach-static-ip, "StartInstance" :start-instance, "PutInstancePublicPorts" :put-instance-public-ports, "CreateInstancesFromSnapshot" :create-instances-from-snapshot, "RebootInstance" :reboot-instance, "DeleteDomainEntry" :delete-domain-entry, "DeleteLoadBalancer" :delete-load-balancer, "StopInstance" :stop-instance, "AttachDisk" :attach-disk, "CreateDiskFromSnapshot" :create-disk-from-snapshot, "CreateInstanceSnapshot" :create-instance-snapshot, "UpdateDomainEntry" :update-domain-entry, "AllocateStaticIp" :allocate-static-ip, "CreateLoadBalancer" :create-load-balancer, "AttachInstancesToLoadBalancer" :attach-instances-to-load-balancer, "CreateDisk" :create-disk, "UpdateLoadBalancerAttribute" :update-load-balancer-attribute, "CreateDomain" :create-domain, "DeleteDisk" :delete-disk, "ReleaseStaticIp" :release-static-ip, "CreateDiskSnapshot" :create-disk-snapshot, "DetachInstancesFromLoadBalancer" :detach-instances-from-load-balancer, "DeleteInstanceSnapshot" :delete-instance-snapshot, "CreateLoadBalancerTlsCertificate" :create-load-balancer-tls-certificate, "DeleteDiskSnapshot" :delete-disk-snapshot, "CloseInstancePublicPorts" :close-instance-public-ports, "OpenInstancePublicPorts" :open-instance-public-ports, "AttachLoadBalancerTlsCertificate" :attach-load-balancer-tls-certificate, "DeleteDomain" :delete-domain, "DetachStaticIp" :detach-static-ip, "DeleteInstance" :delete-instance, "DetachDisk" :detach-disk, "DeleteLoadBalancerTlsCertificate" :delete-load-balancer-tls-certificate, "CreateInstance" :create-instance} input))

(clojure.core/defn- deser-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deserdouble [input] input)

(clojure.core/defn- deser-load-balancer-protocol [input] (clojure.core/get {"HTTP_HTTPS" :http-https, "HTTP" :http} input))

(clojure.core/defn- deser-disk [input] (clojure.core/cond-> {} (clojure.core/contains? input "isSystemDisk") (clojure.core/assoc :is-system-disk (deserboolean (input "isSystemDisk"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "isAttached") (clojure.core/assoc :is-attached (deserboolean (input "isAttached"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "path") (clojure.core/assoc :path (deserstring (input "path"))) (clojure.core/contains? input "gbInUse") (clojure.core/assoc :gb-in-use (deserinteger (input "gbInUse"))) (clojure.core/contains? input "sizeInGb") (clojure.core/assoc :size-in-gb (deserinteger (input "sizeInGb"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "attachedTo") (clojure.core/assoc :attached-to (deser-resource-name (input "attachedTo"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "iops") (clojure.core/assoc :iops (deserinteger (input "iops"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-disk-state (input "state"))) (clojure.core/contains? input "attachmentState") (clojure.core/assoc :attachment-state (deserstring (input "attachmentState"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-instance-state [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserinteger (input "code"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deserstring (input "name")))))

(clojure.core/defn- deser-load-balancer [input] (clojure.core/cond-> {} (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-load-balancer-protocol (input "protocol"))) (clojure.core/contains? input "configurationOptions") (clojure.core/assoc :configuration-options (deser-load-balancer-configuration-options (input "configurationOptions"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "healthCheckPath") (clojure.core/assoc :health-check-path (deser-non-empty-string (input "healthCheckPath"))) (clojure.core/contains? input "instanceHealthSummary") (clojure.core/assoc :instance-health-summary (deser-instance-health-summary-list (input "instanceHealthSummary"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "instancePort") (clojure.core/assoc :instance-port (deserinteger (input "instancePort"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-load-balancer-state (input "state"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "tlsCertificateSummaries") (clojure.core/assoc :tls-certificate-summaries (deser-load-balancer-tls-certificate-summary-list (input "tlsCertificateSummaries"))) (clojure.core/contains? input "publicPorts") (clojure.core/assoc :public-ports (deser-port-list (input "publicPorts"))) (clojure.core/contains? input "dnsName") (clojure.core/assoc :dns-name (deser-non-empty-string (input "dnsName")))))

(clojure.core/defn- deser-disk-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-disk coll))) input))

(clojure.core/defn- deser-load-balancer-tls-certificate-domain-status [input] (clojure.core/get {"PENDING_VALIDATION" :pending-validation, "FAILED" :failed, "SUCCESS" :success} input))

(clojure.core/defn- deser-network-protocol [input] (clojure.core/get {"tcp" :tcp, "all" :all, "udp" :udp} input))

(clojure.core/defn- deser-static-ip [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "isAttached") (clojure.core/assoc :is-attached (deserboolean (input "isAttached"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "attachedTo") (clojure.core/assoc :attached-to (deser-resource-name (input "attachedTo"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "ipAddress") (clojure.core/assoc :ip-address (deser-ip-address (input "ipAddress")))))

(clojure.core/defn- deser-instance-snapshot [input] (clojure.core/cond-> {} (clojure.core/contains? input "progress") (clojure.core/assoc :progress (deserstring (input "progress"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "fromBlueprintId") (clojure.core/assoc :from-blueprint-id (deserstring (input "fromBlueprintId"))) (clojure.core/contains? input "fromInstanceName") (clojure.core/assoc :from-instance-name (deser-resource-name (input "fromInstanceName"))) (clojure.core/contains? input "sizeInGb") (clojure.core/assoc :size-in-gb (deserinteger (input "sizeInGb"))) (clojure.core/contains? input "fromBundleId") (clojure.core/assoc :from-bundle-id (deserstring (input "fromBundleId"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "fromAttachedDisks") (clojure.core/assoc :from-attached-disks (deser-disk-list (input "fromAttachedDisks"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-instance-snapshot-state (input "state"))) (clojure.core/contains? input "fromInstanceArn") (clojure.core/assoc :from-instance-arn (deser-non-empty-string (input "fromInstanceArn"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-key-pair [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType"))) (clojure.core/contains? input "fingerprint") (clojure.core/assoc :fingerprint (deser-base-64 (input "fingerprint")))))

(clojure.core/defn- deser-domain-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-domain-entry coll))) input))

(clojure.core/defn- deser-monthly-transfer [input] (clojure.core/cond-> {} (clojure.core/contains? input "gbPerMonthAllocated") (clojure.core/assoc :gb-per-month-allocated (deserinteger (input "gbPerMonthAllocated")))))

(clojure.core/defn- deser-domain-entry-type [input] input)

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "isStaticIp") (clojure.core/assoc :is-static-ip (deserboolean (input "isStaticIp"))) (clojure.core/contains? input "privateIpAddress") (clojure.core/assoc :private-ip-address (deser-ip-address (input "privateIpAddress"))) (clojure.core/contains? input "sshKeyName") (clojure.core/assoc :ssh-key-name (deser-resource-name (input "sshKeyName"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-non-empty-string (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-iso-date (input "createdAt"))) (clojure.core/contains? input "blueprintId") (clojure.core/assoc :blueprint-id (deser-non-empty-string (input "blueprintId"))) (clojure.core/contains? input "username") (clojure.core/assoc :username (deser-non-empty-string (input "username"))) (clojure.core/contains? input "ipv6Address") (clojure.core/assoc :ipv-6-address (deser-ip-v-6-address (input "ipv6Address"))) (clojure.core/contains? input "hardware") (clojure.core/assoc :hardware (deser-instance-hardware (input "hardware"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-resource-name (input "name"))) (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-resource-location (input "location"))) (clojure.core/contains? input "bundleId") (clojure.core/assoc :bundle-id (deser-non-empty-string (input "bundleId"))) (clojure.core/contains? input "networking") (clojure.core/assoc :networking (deser-instance-networking (input "networking"))) (clojure.core/contains? input "supportCode") (clojure.core/assoc :support-code (deserstring (input "supportCode"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-instance-state (input "state"))) (clojure.core/contains? input "blueprintName") (clojure.core/assoc :blueprint-name (deser-non-empty-string (input "blueprintName"))) (clojure.core/contains? input "publicIpAddress") (clojure.core/assoc :public-ip-address (deser-ip-address (input "publicIpAddress"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-instance-platform-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-platform coll))) input))

(clojure.core/defn- deser-instance-snapshot-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-snapshot coll))) input))

(clojure.core/defn- deser-load-balancer-attribute-name [input] (clojure.core/get {"HealthCheckPath" :health-check-path, "SessionStickinessEnabled" :session-stickiness-enabled, "SessionStickiness_LB_CookieDurationSeconds" :session-stickiness-lb-cookie-duration-seconds} input))

(clojure.core/defn- deser-instance-access-protocol [input] (clojure.core/get {"ssh" :ssh, "rdp" :rdp} input))

(clojure.core/defn- deser-disk-snapshot-state [input] (clojure.core/get {"pending" :pending, "completed" :completed, "error" :error, "unknown" :unknown} input))

(clojure.core/defn- deser-region [input] (clojure.core/cond-> {} (clojure.core/contains? input "continentCode") (clojure.core/assoc :continent-code (deserstring (input "continentCode"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deserstring (input "description"))) (clojure.core/contains? input "displayName") (clojure.core/assoc :display-name (deserstring (input "displayName"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-region-name (input "name"))) (clojure.core/contains? input "availabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zone-list (input "availabilityZones")))))

(clojure.core/defn- deser-instance-health-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-health-summary coll))) input))

(clojure.core/defn- deser-password-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "ciphertext") (clojure.core/assoc :ciphertext (deserstring (input "ciphertext"))) (clojure.core/contains? input "keyPairName") (clojure.core/assoc :key-pair-name (deser-resource-name (input "keyPairName")))))

(clojure.core/defn- deser-instance-port-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-port-info coll))) input))

(clojure.core/defn- deser-load-balancer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer coll))) input))

(clojure.core/defn- deser-domain-entry-options [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-domain-entry-options-keys k) (deserstring v)])) input))

(clojure.core/defn- deser-get-blueprints-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "blueprints") (clojure.core/assoc :blueprints (deser-blueprint-list (input "blueprints"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-download-default-key-pair-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "publicKeyBase64") (clojure.core/assoc :public-key-base-64 (deser-base-64 (input "publicKeyBase64"))) (clojure.core/contains? input "privateKeyBase64") (clojure.core/assoc :private-key-base-64 (deser-base-64 (input "privateKeyBase64")))))

(clojure.core/defn- deser-get-operation-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-domain-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "domain") (clojure.core/assoc :domain (deser-domain (input "domain")))))

(clojure.core/defn- deser-delete-domain-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-static-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "staticIp") (clojure.core/assoc :static-ip (deser-static-ip (input "staticIp")))))

(clojure.core/defn- deser-create-disk-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-disks-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "disks") (clojure.core/assoc :disks (deser-disk-list (input "disks"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-detach-disk-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-delete-load-balancer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-attach-load-balancer-tls-certificate-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-bundles-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "bundles") (clojure.core/assoc :bundles (deser-bundle-list (input "bundles"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-delete-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-create-key-pair-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "keyPair") (clojure.core/assoc :key-pair (deser-key-pair (input "keyPair"))) (clojure.core/contains? input "publicKeyBase64") (clojure.core/assoc :public-key-base-64 (deser-base-64 (input "publicKeyBase64"))) (clojure.core/contains? input "privateKeyBase64") (clojure.core/assoc :private-key-base-64 (deser-base-64 (input "privateKeyBase64"))) (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-detach-static-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-key-pair-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "keyPair") (clojure.core/assoc :key-pair (deser-key-pair (input "keyPair")))))

(clojure.core/defn- deser-create-load-balancer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-peer-vpc-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-delete-disk-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-update-load-balancer-attribute-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-load-balancer-tls-certificates-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "tlsCertificates") (clojure.core/assoc :tls-certificates (deser-load-balancer-tls-certificate-list (input "tlsCertificates")))))

(clojure.core/defn- deser-service-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-get-load-balancer-metric-data-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "metricName") (clojure.core/assoc :metric-name (deser-load-balancer-metric-name (input "metricName"))) (clojure.core/contains? input "metricData") (clojure.core/assoc :metric-data (deser-metric-datapoint-list (input "metricData")))))

(clojure.core/defn- deser-delete-load-balancer-tls-certificate-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-delete-instance-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-import-key-pair-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-unpeer-vpc-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-disk-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "disk") (clojure.core/assoc :disk (deser-disk (input "disk")))))

(clojure.core/defn- deser-delete-domain-entry-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-release-static-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-create-domain-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-operations-for-resource-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations"))) (clojure.core/contains? input "nextPageCount") (clojure.core/assoc :next-page-count (deserstring (input "nextPageCount"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-get-instance-snapshots-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceSnapshots") (clojure.core/assoc :instance-snapshots (deser-instance-snapshot-list (input "instanceSnapshots"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-update-domain-entry-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-create-disk-from-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-attach-static-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-open-instance-public-ports-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-create-domain-entry-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-instance-port-states-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "portStates") (clojure.core/assoc :port-states (deser-instance-port-state-list (input "portStates")))))

(clojure.core/defn- deser-delete-disk-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-domains-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "domains") (clojure.core/assoc :domains (deser-domain-list (input "domains"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-get-disk-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "diskSnapshot") (clojure.core/assoc :disk-snapshot (deser-disk-snapshot (input "diskSnapshot")))))

(clojure.core/defn- deser-get-instance-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceSnapshot") (clojure.core/assoc :instance-snapshot (deser-instance-snapshot (input "instanceSnapshot")))))

(clojure.core/defn- deser-invalid-input-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-get-key-pairs-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "keyPairs") (clojure.core/assoc :key-pairs (deser-key-pair-list (input "keyPairs"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-create-load-balancer-tls-certificate-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-static-ips-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "staticIps") (clojure.core/assoc :static-ips (deser-static-ip-list (input "staticIps"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-not-found-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-get-instance-state-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-instance-state (input "state")))))

(clojure.core/defn- deser-access-denied-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-close-instance-public-ports-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-get-disk-snapshots-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "diskSnapshots") (clojure.core/assoc :disk-snapshots (deser-disk-snapshot-list (input "diskSnapshots"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-create-instances-from-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-attach-disk-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-create-disk-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-create-instances-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-is-vpc-peered-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "isPeered") (clojure.core/assoc :is-peered (deserboolean (input "isPeered")))))

(clojure.core/defn- deser-get-instances-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instances") (clojure.core/assoc :instances (deser-instance-list (input "instances"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-get-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "instance") (clojure.core/assoc :instance (deser-instance (input "instance")))))

(clojure.core/defn- deser-stop-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-load-balancer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "loadBalancer") (clojure.core/assoc :load-balancer (deser-load-balancer (input "loadBalancer")))))

(clojure.core/defn- deser-get-load-balancers-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "loadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancer-list (input "loadBalancers"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-reboot-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-operations-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-get-instance-access-details-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "accessDetails") (clojure.core/assoc :access-details (deser-instance-access-details (input "accessDetails")))))

(clojure.core/defn- deser-detach-instances-from-load-balancer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-start-instance-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-delete-key-pair-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-attach-instances-to-load-balancer-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-operation-failure-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-unauthenticated-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.core/defn- deser-allocate-static-ip-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-get-regions-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "regions") (clojure.core/assoc :regions (deser-region-list (input "regions")))))

(clojure.core/defn- deser-get-active-names-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "activeNames") (clojure.core/assoc :active-names (deser-string-list (input "activeNames"))) (clojure.core/contains? input "nextPageToken") (clojure.core/assoc :next-page-token (deserstring (input "nextPageToken")))))

(clojure.core/defn- deser-get-instance-metric-data-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "metricName") (clojure.core/assoc :metric-name (deser-instance-metric-name (input "metricName"))) (clojure.core/contains? input "metricData") (clojure.core/assoc :metric-data (deser-metric-datapoint-list (input "metricData")))))

(clojure.core/defn- deser-create-instance-snapshot-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operations") (clojure.core/assoc :operations (deser-operation-list (input "operations")))))

(clojure.core/defn- deser-put-instance-public-ports-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "operation") (clojure.core/assoc :operation (deser-operation (input "operation")))))

(clojure.core/defn- deser-account-setup-in-progress-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deserstring (input "code"))) (clojure.core/contains? input "docs") (clojure.core/assoc :docs (deserstring (input "docs"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deserstring (input "message"))) (clojure.core/contains? input "tip") (clojure.core/assoc :tip (deserstring (input "tip")))))

(clojure.spec.alpha/def :portkey.aws.lightsail/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/instance-names (clojure.spec.alpha/and :portkey.aws.lightsail/string-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/attached-disk-mapping (clojure.spec.alpha/and :portkey.aws.lightsail/attached-disk-map))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/availability-zone (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/instance-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/bundle-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/user-data (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instances-from-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-instances-from-snapshot-request/instance-names :portkey.aws.lightsail.create-instances-from-snapshot-request/availability-zone :portkey.aws.lightsail.create-instances-from-snapshot-request/instance-snapshot-name :portkey.aws.lightsail.create-instances-from-snapshot-request/bundle-id] :opt-un [:portkey.aws.lightsail.create-instances-from-snapshot-request/attached-disk-mapping :portkey.aws.lightsail.create-instances-from-snapshot-request/user-data :portkey.aws.lightsail.create-instances-from-snapshot-request/key-pair-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lightsail.get-blueprints-result/blueprints (clojure.spec.alpha/and :portkey.aws.lightsail/blueprint-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-blueprints-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-blueprints-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-blueprints-result/blueprints :portkey.aws.lightsail.get-blueprints-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-load-balancer-tls-certificate-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.attach-load-balancer-tls-certificate-request/certificate-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-load-balancer-tls-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.attach-load-balancer-tls-certificate-request/load-balancer-name :portkey.aws.lightsail.attach-load-balancer-tls-certificate-request/certificate-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-disk-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-disk-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.detach-disk-request/disk-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-state/from-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-state/to-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-state/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/network-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-state/state (clojure.spec.alpha/and :portkey.aws.lightsail/port-state))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-port-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-port-state/from-port :portkey.aws.lightsail.instance-port-state/to-port :portkey.aws.lightsail.instance-port-state/protocol :portkey.aws.lightsail.instance-port-state/state]))

(clojure.spec.alpha/def :portkey.aws.lightsail.download-default-key-pair-result/public-key-base-64 (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail.download-default-key-pair-result/private-key-base-64 (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail/download-default-key-pair-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.download-default-key-pair-result/public-key-base-64 :portkey.aws.lightsail.download-default-key-pair-result/private-key-base-64]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-snapshot-request/disk-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-disk-snapshot-request/disk-snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-option-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-option))

(clojure.spec.alpha/def :portkey.aws.lightsail/string-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/string))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-domain-entry-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-domain-entry-request/domain-entry (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-domain-entry-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-domain-entry-request/domain-name :portkey.aws.lightsail.create-domain-entry-request/domain-entry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/metric-statistic-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/metric-statistic))

(clojure.spec.alpha/def :portkey.aws.lightsail/string-max-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operation-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-operation-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-key-pair-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-key-pair-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-key-pair-request/key-pair-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/disk-map-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/disk-map))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-domain-result/domain (clojure.spec.alpha/and :portkey.aws.lightsail/domain))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-domain-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-domain-result/domain]))

(clojure.spec.alpha/def :portkey.aws.lightsail.port-info/from-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.port-info/to-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.port-info/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/network-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail/port-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.port-info/from-port :portkey.aws.lightsail.port-info/to-port :portkey.aws.lightsail.port-info/protocol]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-domain-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-domain-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-domain-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-summary-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/load-balancer-tls-certificate-summary))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-static-ip-result/static-ip (clojure.spec.alpha/and :portkey.aws.lightsail/static-ip))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-static-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-static-ip-result/static-ip]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-disk-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disks-result/disks (clojure.spec.alpha/and :portkey.aws.lightsail/disk-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-disks-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disks-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disks-result/disks :portkey.aws.lightsail.get-disks-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #".*\S.*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-disk-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-disk-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.detach-disk-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-load-balancer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-load-balancer-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-load-balancer-tls-certificate-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-load-balancer-tls-certificate-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.attach-load-balancer-tls-certificate-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-bundles-result/bundles (clojure.spec.alpha/and :portkey.aws.lightsail/bundle-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-bundles-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-bundles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-bundles-result/bundles :portkey.aws.lightsail.get-bundles-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/operation-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/operation))

(clojure.spec.alpha/def :portkey.aws.lightsail/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instances-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instances-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.update-load-balancer-attribute-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.update-load-balancer-attribute-request/attribute-name (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-attribute-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.update-load-balancer-attribute-request/attribute-value (clojure.spec.alpha/and :portkey.aws.lightsail/string-max-256))
(clojure.spec.alpha/def :portkey.aws.lightsail/update-load-balancer-attribute-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.update-load-balancer-attribute-request/load-balancer-name :portkey.aws.lightsail.update-load-balancer-attribute-request/attribute-name :portkey.aws.lightsail.update-load-balancer-attribute-request/attribute-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/instance-names (clojure.spec.alpha/and :portkey.aws.lightsail/string-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/availability-zone (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/custom-image-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/blueprint-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/bundle-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/user-data (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-instances-request/instance-names :portkey.aws.lightsail.create-instances-request/availability-zone :portkey.aws.lightsail.create-instances-request/blueprint-id :portkey.aws.lightsail.create-instances-request/bundle-id] :opt-un [:portkey.aws.lightsail.create-instances-request/custom-image-name :portkey.aws.lightsail.create-instances-request/user-data :portkey.aws.lightsail.create-instances-request/key-pair-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-instance-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-instance-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail/port-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/port))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-revocation-reason #{"PRIVILEGE_WITHDRAWN" :privilege-withdrawn :unspecified "CERTIFICATE_HOLD" :ca-compromise "REMOVE_FROM_CRL" "AFFILIATION_CHANGED" :remove-from-crl "SUPERCEDED" "KEY_COMPROMISE" :key-compromise :a-a-compromise :superceded "UNSPECIFIED" :cessation-of-operation "CA_COMPROMISE" "CESSATION_OF_OPERATION" "A_A_COMPROMISE" :affiliation-changed :certificate-hold})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/metric-name (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-metric-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/period (clojure.spec.alpha/and :portkey.aws.lightsail/metric-period))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/start-time (clojure.spec.alpha/and :portkey.aws.lightsail/timestamp))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/end-time (clojure.spec.alpha/and :portkey.aws.lightsail/timestamp))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/unit (clojure.spec.alpha/and :portkey.aws.lightsail/metric-unit))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-request/statistics (clojure.spec.alpha/and :portkey.aws.lightsail/metric-statistic-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-load-balancer-metric-data-request/load-balancer-name :portkey.aws.lightsail.get-load-balancer-metric-data-request/metric-name :portkey.aws.lightsail.get-load-balancer-metric-data-request/period :portkey.aws.lightsail.get-load-balancer-metric-data-request/start-time :portkey.aws.lightsail.get-load-balancer-metric-data-request/end-time :portkey.aws.lightsail.get-load-balancer-metric-data-request/unit :portkey.aws.lightsail.get-load-balancer-metric-data-request/statistics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-port-state-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance-port-state))

(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/progress (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/state (clojure.spec.alpha/and :portkey.aws.lightsail/disk-snapshot-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/from-disk-arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-snapshot/from-disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/disk-snapshot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.disk-snapshot/progress :portkey.aws.lightsail.disk-snapshot/arn :portkey.aws.lightsail.disk-snapshot/created-at :portkey.aws.lightsail.disk-snapshot/size-in-gb :portkey.aws.lightsail.disk-snapshot/name :portkey.aws.lightsail.disk-snapshot/location :portkey.aws.lightsail.disk-snapshot/support-code :portkey.aws.lightsail.disk-snapshot/state :portkey.aws.lightsail.disk-snapshot/from-disk-arn :portkey.aws.lightsail.disk-snapshot/resource-type :portkey.aws.lightsail.disk-snapshot/from-disk-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-key-pair-result/key-pair (clojure.spec.alpha/and :portkey.aws.lightsail/key-pair))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-key-pair-result/public-key-base-64 (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-key-pair-result/private-key-base-64 (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-key-pair-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-key-pair-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-key-pair-result/key-pair :portkey.aws.lightsail.create-key-pair-result/public-key-base-64 :portkey.aws.lightsail.create-key-pair-result/private-key-base-64 :portkey.aws.lightsail.create-key-pair-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-snapshots-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-snapshots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disk-snapshots-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-record-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-record))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-static-ip-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-static-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.detach-static-ip-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/average (clojure.spec.alpha/and :portkey.aws.lightsail/double))
(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/maximum (clojure.spec.alpha/and :portkey.aws.lightsail/double))
(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/minimum (clojure.spec.alpha/and :portkey.aws.lightsail/double))
(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/sample-count (clojure.spec.alpha/and :portkey.aws.lightsail/double))
(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/sum (clojure.spec.alpha/and :portkey.aws.lightsail/double))
(clojure.spec.alpha/def :portkey.aws.lightsail.metric-datapoint/unit (clojure.spec.alpha/and :portkey.aws.lightsail/metric-unit))
(clojure.spec.alpha/def :portkey.aws.lightsail/metric-datapoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.metric-datapoint/average :portkey.aws.lightsail.metric-datapoint/maximum :portkey.aws.lightsail.metric-datapoint/minimum :portkey.aws.lightsail.metric-datapoint/sample-count :portkey.aws.lightsail.metric-datapoint/sum :portkey.aws.lightsail/timestamp :portkey.aws.lightsail.metric-datapoint/unit]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-key-pair-result/key-pair (clojure.spec.alpha/and :portkey.aws.lightsail/key-pair))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-key-pair-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-key-pair-result/key-pair]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-load-balancer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-load-balancer-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.resource-location/availability-zone (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.resource-location/region-name (clojure.spec.alpha/and :portkey.aws.lightsail/region-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/resource-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.resource-location/availability-zone :portkey.aws.lightsail.resource-location/region-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-metric-name #{:http-code-instance-4-xx-count "InstanceResponseTime" "RejectedConnectionCount" "HTTPCode_LB_5XX_Count" :healthy-host-count :instance-response-time :http-code-lb-4-xx-count :http-code-lb-5-xx-count "RequestCount" :http-code-instance-3-xx-count :http-code-instance-5-xx-count "ClientTLSNegotiationErrorCount" :client-tls-negotiation-error-count :http-code-instance-2-xx-count :unhealthy-host-count "HTTPCode_Instance_5XX_Count" "HTTPCode_LB_4XX_Count" "HTTPCode_Instance_2XX_Count" :rejected-connection-count "HealthyHostCount" "UnhealthyHostCount" :request-count "HTTPCode_Instance_3XX_Count" "HTTPCode_Instance_4XX_Count"})

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-static-ip-request/static-ip-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.attach-static-ip-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-static-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.attach-static-ip-request/static-ip-name :portkey.aws.lightsail.attach-static-ip-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.peer-vpc-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/peer-vpc-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.peer-vpc-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-disk-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-disk-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-disk-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.update-load-balancer-attribute-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/update-load-balancer-attribute-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.update-load-balancer-attribute-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-key-pair-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-key-pair-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-key-pair-request/key-pair-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-snapshot-request/instance-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-snapshot-request/instance-snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-static-ips-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-static-ips-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-static-ips-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-tls-certificates-result/tls-certificates (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-tls-certificates-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-load-balancer-tls-certificates-result/tls-certificates]))

(clojure.spec.alpha/def :portkey.aws.lightsail.service-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.service-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.service-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.service-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.service-exception/code :portkey.aws.lightsail.service-exception/docs :portkey.aws.lightsail.service-exception/message :portkey.aws.lightsail.service-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-result/metric-name (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-metric-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-metric-data-result/metric-data (clojure.spec.alpha/and :portkey.aws.lightsail/metric-datapoint-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-metric-data-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-load-balancer-metric-data-result/metric-name :portkey.aws.lightsail.get-load-balancer-metric-data-result/metric-data]))

(clojure.spec.alpha/def :portkey.aws.lightsail.import-key-pair-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.import-key-pair-request/public-key-base-64 (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail/import-key-pair-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.import-key-pair-request/key-pair-name :portkey.aws.lightsail.import-key-pair-request/public-key-base-64] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-tls-certificates-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-tls-certificates-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-load-balancer-tls-certificates-request/load-balancer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/instance-access-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/password-data (clojure.spec.alpha/and :portkey.aws.lightsail/password-data))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/username (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/cert-key (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/private-key (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/password (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/ip-address (clojure.spec.alpha/and :portkey.aws.lightsail/ip-address))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-access-details/expires-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-access-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-access-details/protocol :portkey.aws.lightsail.instance-access-details/instance-name :portkey.aws.lightsail.instance-access-details/password-data :portkey.aws.lightsail.instance-access-details/username :portkey.aws.lightsail.instance-access-details/cert-key :portkey.aws.lightsail.instance-access-details/private-key :portkey.aws.lightsail.instance-access-details/password :portkey.aws.lightsail.instance-access-details/ip-address :portkey.aws.lightsail.instance-access-details/expires-at]))

(clojure.spec.alpha/def :portkey.aws.lightsail/region-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/region))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-operations-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/static-ip-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/static-ip))

(clojure.spec.alpha/def :portkey.aws.lightsail.allocate-static-ip-request/static-ip-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/allocate-static-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.allocate-static-ip-request/static-ip-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/metric-datapoint-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/metric-datapoint))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-health-reason #{:lb-internal-error :instance-timeout :instance-not-in-use "Instance.ResponseCodeMismatch" "Lb.InternalError" "Instance.NotRegistered" "Instance.FailedHealthChecks" :instance-deregistration-in-progress :lb-registration-in-progress :instance-invalid-state :instance-response-code-mismatch "Instance.Timeout" :instance-not-registered "Instance.IpUnusable" "Instance.NotInUse" "Instance.DeregistrationInProgress" "Lb.InitialHealthChecking" "Instance.InvalidState" "Lb.RegistrationInProgress" :instance-ip-unusable :lb-initial-health-checking :instance-failed-health-checks})

(clojure.spec.alpha/def :portkey.aws.lightsail.create-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.put-instance-public-ports-request/port-infos (clojure.spec.alpha/and :portkey.aws.lightsail/port-info-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.put-instance-public-ports-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/put-instance-public-ports-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.put-instance-public-ports-request/port-infos :portkey.aws.lightsail.put-instance-public-ports-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/port-state #{:open :closed "closed" "open"})

(clojure.spec.alpha/def :portkey.aws.lightsail/bundle-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/bundle))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-blueprints-request/include-inactive (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-blueprints-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-blueprints-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-blueprints-request/include-inactive :portkey.aws.lightsail.get-blueprints-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-tls-certificate-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-load-balancer-tls-certificate-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-load-balancer-tls-certificate-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-health-summary/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-health-summary/instance-health (clojure.spec.alpha/and :portkey.aws.lightsail/instance-health-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-health-summary/instance-health-reason (clojure.spec.alpha/and :portkey.aws.lightsail/instance-health-reason))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-health-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-health-summary/instance-name :portkey.aws.lightsail.instance-health-summary/instance-health :portkey.aws.lightsail.instance-health-summary/instance-health-reason]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-instance-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-instance-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-instance-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/is-active (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/disk-size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/name (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/power (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/supported-platforms (clojure.spec.alpha/and :portkey.aws.lightsail/instance-platform-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/bundle-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/ram-size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/float))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/instance-type (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/transfer-per-month-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/price (clojure.spec.alpha/and :portkey.aws.lightsail/float))
(clojure.spec.alpha/def :portkey.aws.lightsail.bundle/cpu-count (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail/bundle (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.bundle/is-active :portkey.aws.lightsail.bundle/disk-size-in-gb :portkey.aws.lightsail.bundle/name :portkey.aws.lightsail.bundle/power :portkey.aws.lightsail.bundle/supported-platforms :portkey.aws.lightsail.bundle/bundle-id :portkey.aws.lightsail.bundle/ram-size-in-gb :portkey.aws.lightsail.bundle/instance-type :portkey.aws.lightsail.bundle/transfer-per-month-in-gb :portkey.aws.lightsail.bundle/price :portkey.aws.lightsail.bundle/cpu-count]))

(clojure.spec.alpha/def :portkey.aws.lightsail.import-key-pair-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/import-key-pair-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.import-key-pair-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-instance-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-instance-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.operation/resource-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/is-terminal (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/operation-details (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/operation-type (clojure.spec.alpha/and :portkey.aws.lightsail/operation-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/error-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/status (clojure.spec.alpha/and :portkey.aws.lightsail/operation-status))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/error-details (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/status-changed-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail/operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.operation/resource-name :portkey.aws.lightsail.operation/created-at :portkey.aws.lightsail.operation/is-terminal :portkey.aws.lightsail.operation/id :portkey.aws.lightsail.operation/operation-details :portkey.aws.lightsail.operation/operation-type :portkey.aws.lightsail.operation/error-code :portkey.aws.lightsail.operation/location :portkey.aws.lightsail.operation/status :portkey.aws.lightsail.operation/error-details :portkey.aws.lightsail.operation/status-changed-at :portkey.aws.lightsail.operation/resource-type]))

(clojure.spec.alpha/def :portkey.aws.lightsail/key-pair-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/key-pair))

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/name (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/type (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/value (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/validation-status (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-domain-status))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/name :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/type :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/value :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/validation-status :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-record/domain-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail/base-64 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-domains-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-domains-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-disk-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-disk-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-disk-request/disk-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lightsail.unpeer-vpc-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/unpeer-vpc-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.unpeer-vpc-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-result/disk (clojure.spec.alpha/and :portkey.aws.lightsail/disk))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disk-result/disk]))

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/not-after (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/serial (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/is-attached (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/domain-validation-records (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-record-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/key-algorithm (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/issuer (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/revoked-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/status (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-status))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/signature-algorithm (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/subject (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/subject-alternative-names (clojure.spec.alpha/and :portkey.aws.lightsail/string-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/renewal-summary (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-renewal-summary))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/not-before (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/failure-reason (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-failure-reason))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/issued-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate/revocation-reason (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-revocation-reason))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer-tls-certificate/not-after :portkey.aws.lightsail.load-balancer-tls-certificate/arn :portkey.aws.lightsail.load-balancer-tls-certificate/serial :portkey.aws.lightsail.load-balancer-tls-certificate/is-attached :portkey.aws.lightsail.load-balancer-tls-certificate/created-at :portkey.aws.lightsail.load-balancer-tls-certificate/domain-validation-records :portkey.aws.lightsail.load-balancer-tls-certificate/key-algorithm :portkey.aws.lightsail.load-balancer-tls-certificate/issuer :portkey.aws.lightsail.load-balancer-tls-certificate/domain-name :portkey.aws.lightsail.load-balancer-tls-certificate/revoked-at :portkey.aws.lightsail.load-balancer-tls-certificate/name :portkey.aws.lightsail.load-balancer-tls-certificate/location :portkey.aws.lightsail.load-balancer-tls-certificate/status :portkey.aws.lightsail.load-balancer-tls-certificate/load-balancer-name :portkey.aws.lightsail.load-balancer-tls-certificate/signature-algorithm :portkey.aws.lightsail.load-balancer-tls-certificate/subject :portkey.aws.lightsail.load-balancer-tls-certificate/subject-alternative-names :portkey.aws.lightsail.load-balancer-tls-certificate/support-code :portkey.aws.lightsail.load-balancer-tls-certificate/renewal-summary :portkey.aws.lightsail.load-balancer-tls-certificate/not-before :portkey.aws.lightsail.load-balancer-tls-certificate/failure-reason :portkey.aws.lightsail.load-balancer-tls-certificate/issued-at :portkey.aws.lightsail.load-balancer-tls-certificate/resource-type :portkey.aws.lightsail.load-balancer-tls-certificate/revocation-reason]))

(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/target (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/is-alias (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/type (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain-entry/options (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry-options))
(clojure.spec.alpha/def :portkey.aws.lightsail/domain-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.domain-entry/id :portkey.aws.lightsail.domain-entry/name :portkey.aws.lightsail.domain-entry/target :portkey.aws.lightsail.domain-entry/is-alias :portkey.aws.lightsail.domain-entry/type :portkey.aws.lightsail.domain-entry/options]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-domain-entry-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-domain-entry-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-domain-entry-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/availability-zone-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/availability-zone))

(clojure.spec.alpha/def :portkey.aws.lightsail/metric-unit #{:kilobytes-second :megabits "Terabytes" :bits-second :count-second :kilobits "Kilobits/Second" "Count" :megabytes-second "Bits" "Percent" "Gigabits/Second" :terabytes :terabits-second "None" :seconds :bits :terabits :bytes-second :kilobytes :microseconds "Count/Second" "Bytes" "Gigabytes/Second" :megabits-second "Megabits/Second" :gigabits "Kilobytes/Second" :gigabits-second :kilobits-second :megabytes "Terabytes/Second" "Bits/Second" "Bytes/Second" "Milliseconds" :count :gigabytes-second "Kilobytes" :bytes :milliseconds "Microseconds" :percent "Terabits" :gigabytes "Megabytes/Second" :terabytes-second "Gigabytes" "Gigabits" "Megabits" :none "Kilobits" "Terabits/Second" "Megabytes" "Seconds"})

(clojure.spec.alpha/def :portkey.aws.lightsail.availability-zone/zone-name (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.availability-zone/state (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail/availability-zone (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.availability-zone/zone-name :portkey.aws.lightsail.availability-zone/state]))

(clojure.spec.alpha/def :portkey.aws.lightsail/metric-period (clojure.spec.alpha/int-in 60 86400))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-health-state #{"healthy" :draining :unhealthy :unavailable :unused "initial" :healthy "unhealthy" "unused" :initial "draining" "unavailable"})

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-failure-reason #{:no-available-contacts "INVALID_PUBLIC_DOMAIN" :other "ADDITIONAL_VERIFICATION_REQUIRED" :additional-verification-required :domain-not-allowed "OTHER" "DOMAIN_NOT_ALLOWED" :invalid-public-domain "NO_AVAILABLE_CONTACTS"})

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-option/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-option/validation-status (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-domain-status))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-option/domain-name :portkey.aws.lightsail.load-balancer-tls-certificate-domain-validation-option/validation-status]))

(clojure.spec.alpha/def :portkey.aws.lightsail/blueprint-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/blueprint))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-snapshots-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-snapshots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-snapshots-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-networking/monthly-transfer (clojure.spec.alpha/and :portkey.aws.lightsail/monthly-transfer))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-networking/ports (clojure.spec.alpha/and :portkey.aws.lightsail/instance-port-info-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-networking (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-networking/monthly-transfer :portkey.aws.lightsail.instance-networking/ports]))

(clojure.spec.alpha/def :portkey.aws.lightsail.stop-instance-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.stop-instance-request/force (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail/stop-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.stop-instance-request/instance-name] :opt-un [:portkey.aws.lightsail.stop-instance-request/force]))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-static-ip-request/static-ip-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-static-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.detach-static-ip-request/static-ip-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-renewal-status #{"SUCCESS" :pending-validation :pending-auto-renewal "PENDING_AUTO_RENEWAL" :success "FAILED" "PENDING_VALIDATION" :failed})

(clojure.spec.alpha/def :portkey.aws.lightsail.release-static-ip-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/release-static-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.release-static-ip-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-domain-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-domain-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-domain-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/is-vpc-peered-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-for-resource-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-for-resource-result/next-page-count (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-for-resource-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operations-for-resource-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-operations-for-resource-result/operations :portkey.aws.lightsail.get-operations-for-resource-result/next-page-count :portkey.aws.lightsail.get-operations-for-resource-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-load-balancer-request/load-balancer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/certificate-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/force (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-load-balancer-tls-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/load-balancer-name :portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/certificate-name] :opt-un [:portkey.aws.lightsail.delete-load-balancer-tls-certificate-request/force]))

(clojure.spec.alpha/def :portkey.aws.lightsail.disk-map/original-disk-path (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk-map/new-disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/disk-map (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.disk-map/original-disk-path :portkey.aws.lightsail.disk-map/new-disk-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-snapshots-result/instance-snapshots (clojure.spec.alpha/and :portkey.aws.lightsail/instance-snapshot-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-snapshots-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-snapshots-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-snapshots-result/instance-snapshots :portkey.aws.lightsail.get-instance-snapshots-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/port-access-type #{"Private" :private "Public" :public})

(clojure.spec.alpha/def :portkey.aws.lightsail/region-name #{:apnortheast-1 :apsouth-1 "ap-northeast-1" "eu-west-1" :useast-1 :apsoutheast-2 :apnortheast-2 "us-east-2" "ap-southeast-2" "ap-southeast-1" "ap-northeast-2" "eu-central-1" :euwest-2 "eu-west-2" :uswest-1 :eucentral-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" "ap-south-1" :euwest-1 :useast-2 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.lightsail.update-domain-entry-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/update-domain-entry-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.update-domain-entry-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/is-active (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/blueprint-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/group (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/min-power (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/product-url (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/type (clojure.spec.alpha/and :portkey.aws.lightsail/blueprint-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/version (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/license-url (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/version-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/platform (clojure.spec.alpha/and :portkey.aws.lightsail/instance-platform))
(clojure.spec.alpha/def :portkey.aws.lightsail.blueprint/description (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/blueprint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.blueprint/is-active :portkey.aws.lightsail.blueprint/blueprint-id :portkey.aws.lightsail.blueprint/group :portkey.aws.lightsail.blueprint/min-power :portkey.aws.lightsail.blueprint/name :portkey.aws.lightsail.blueprint/product-url :portkey.aws.lightsail.blueprint/type :portkey.aws.lightsail.blueprint/version :portkey.aws.lightsail.blueprint/license-url :portkey.aws.lightsail.blueprint/version-code :portkey.aws.lightsail.blueprint/platform :portkey.aws.lightsail.blueprint/description]))

(clojure.spec.alpha/def :portkey.aws.lightsail.domain/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.domain/domain-entries (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/domain (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.domain/name :portkey.aws.lightsail.domain/arn :portkey.aws.lightsail.domain/support-code :portkey.aws.lightsail.domain/created-at :portkey.aws.lightsail.domain/location :portkey.aws.lightsail.domain/resource-type :portkey.aws.lightsail.domain/domain-entries]))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/domain-name))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-from-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-from-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-disk-from-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-static-ip-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-static-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.attach-static-ip-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.open-instance-public-ports-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/open-instance-public-ports-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.open-instance-public-ports-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/domain))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-hardware/cpu-count (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-hardware/disks (clojure.spec.alpha/and :portkey.aws.lightsail/disk-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-hardware/ram-size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/float))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-hardware (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-hardware/cpu-count :portkey.aws.lightsail.instance-hardware/disks :portkey.aws.lightsail.instance-hardware/ram-size-in-gb]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-domain-entry-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-domain-entry-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-domain-entry-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-snapshot-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-snapshot-request/disk-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-disk-snapshot-request/disk-name :portkey.aws.lightsail.create-disk-snapshot-request/disk-snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-static-ip-request/static-ip-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-static-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-static-ip-request/static-ip-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-port-states-result/port-states (clojure.spec.alpha/and :portkey.aws.lightsail/instance-port-state-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-port-states-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-port-states-result/port-states]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-regions-request/include-availability-zones (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-regions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-regions-request/include-availability-zones]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-key-pairs-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-key-pairs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-key-pairs-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.update-domain-entry-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.update-domain-entry-request/domain-entry (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry))
(clojure.spec.alpha/def :portkey.aws.lightsail/update-domain-entry-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.update-domain-entry-request/domain-name :portkey.aws.lightsail.update-domain-entry-request/domain-entry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/peer-vpc-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/download-default-key-pair-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-disk-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-disk-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-disk-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-renewal-summary/renewal-status (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-renewal-status))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-renewal-summary/domain-validation-options (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-domain-validation-option-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-renewal-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer-tls-certificate-renewal-summary/renewal-status :portkey.aws.lightsail.load-balancer-tls-certificate-renewal-summary/domain-validation-options]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-domains-result/domains (clojure.spec.alpha/and :portkey.aws.lightsail/domain-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-domains-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-domains-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-domains-result/domains :portkey.aws.lightsail.get-domains-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-key-pair-request/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-key-pair-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-key-pair-request/key-pair-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/unpeer-vpc-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/instance-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/health-check-path (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/certificate-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/certificate-domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-request/certificate-alternative-names (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-load-balancer-request/load-balancer-name :portkey.aws.lightsail.create-load-balancer-request/instance-port] :opt-un [:portkey.aws.lightsail.create-load-balancer-request/health-check-path :portkey.aws.lightsail.create-load-balancer-request/certificate-name :portkey.aws.lightsail.create-load-balancer-request/certificate-domain-name :portkey.aws.lightsail.create-load-balancer-request/certificate-alternative-names]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-state #{"active_impaired" :active-impaired :unknown "failed" "provisioning" :active "unknown" :provisioning "active" :failed})

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-status #{:inactive "UNKNOWN" :pending-validation "REVOKED" :unknown "EXPIRED" "ISSUED" :revoked "INACTIVE" "FAILED" "PENDING_VALIDATION" :expired :issued "VALIDATION_TIMED_OUT" :validation-timed-out :failed})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-snapshot-result/disk-snapshot (clojure.spec.alpha/and :portkey.aws.lightsail/disk-snapshot))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disk-snapshot-result/disk-snapshot]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-load-balancer-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-load-balancer-request/load-balancer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancers-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-load-balancers-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-snapshot-result/instance-snapshot (clojure.spec.alpha/and :portkey.aws.lightsail/instance-snapshot))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-snapshot-result/instance-snapshot]))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-instances-from-load-balancer-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.detach-instances-from-load-balancer-request/instance-names (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-instances-from-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.detach-instances-from-load-balancer-request/load-balancer-name :portkey.aws.lightsail.detach-instances-from-load-balancer-request/instance-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/ip-v-6-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"([A-F0-9]{1,4}:){7}[A-F0-9]{1,4}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/from-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/to-port (clojure.spec.alpha/and :portkey.aws.lightsail/port))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/network-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/access-from (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/access-type (clojure.spec.alpha/and :portkey.aws.lightsail/port-access-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/common-name (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-port-info/access-direction (clojure.spec.alpha/and :portkey.aws.lightsail/access-direction))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-port-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-port-info/from-port :portkey.aws.lightsail.instance-port-info/to-port :portkey.aws.lightsail.instance-port-info/protocol :portkey.aws.lightsail.instance-port-info/access-from :portkey.aws.lightsail.instance-port-info/access-type :portkey.aws.lightsail.instance-port-info/common-name :portkey.aws.lightsail.instance-port-info/access-direction]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-disk-request/disk-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/port (clojure.spec.alpha/int-in 0 65535))

(clojure.spec.alpha/def :portkey.aws.lightsail.invalid-input-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.invalid-input-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.invalid-input-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.invalid-input-exception/code :portkey.aws.lightsail.invalid-input-exception/docs :portkey.aws.lightsail.invalid-input-exception/message :portkey.aws.lightsail.invalid-input-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail/iso-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lightsail/disk-snapshot-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/disk-snapshot))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-domain-entry-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.delete-domain-entry-request/domain-entry (clojure.spec.alpha/and :portkey.aws.lightsail/domain-entry))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-domain-entry-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-domain-entry-request/domain-name :portkey.aws.lightsail.delete-domain-entry-request/domain-entry] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-snapshot-state #{:pending "error" :error :available "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.lightsail/access-direction #{:outbound "outbound" "inbound" :inbound})

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/load-balancer-tls-certificate))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-key-pairs-result/key-pairs (clojure.spec.alpha/and :portkey.aws.lightsail/key-pair-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-key-pairs-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-key-pairs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-key-pairs-result/key-pairs :portkey.aws.lightsail.get-key-pairs-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/blueprint-type #{"os" :app "app" :os})

(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-tls-certificate-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-load-balancer-tls-certificate-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-load-balancer-tls-certificate-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-instance-snapshot-request/instance-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-instance-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-instance-snapshot-request/instance-snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/resource-name-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/resource-name))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-from-snapshot-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-from-snapshot-request/disk-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-from-snapshot-request/availability-zone (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-from-snapshot-request/size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-from-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-disk-from-snapshot-request/disk-name :portkey.aws.lightsail.create-disk-from-snapshot-request/disk-snapshot-name :portkey.aws.lightsail.create-disk-from-snapshot-request/availability-zone :portkey.aws.lightsail.create-disk-from-snapshot-request/size-in-gb] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-static-ips-result/static-ips (clojure.spec.alpha/and :portkey.aws.lightsail/static-ip-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-static-ips-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-static-ips-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-static-ips-result/static-ips :portkey.aws.lightsail.get-static-ips-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.not-found-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.not-found-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.not-found-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.not-found-exception/code :portkey.aws.lightsail.not-found-exception/docs :portkey.aws.lightsail.not-found-exception/message :portkey.aws.lightsail.not-found-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-configuration-options (clojure.spec.alpha/map-of :portkey.aws.lightsail/load-balancer-attribute-name :portkey.aws.lightsail/string))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-platform #{:windows "LINUX_UNIX" :linux-unix "WINDOWS"})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-for-resource-request/resource-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-for-resource-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operations-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-operations-for-resource-request/resource-name] :opt-un [:portkey.aws.lightsail.get-operations-for-resource-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/disk-state #{:unknown :pending "error" "in-use" :inuse "unknown" :error :available "pending" "available"})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-state-result/state (clojure.spec.alpha/and :portkey.aws.lightsail/instance-state))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-state-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-state-result/state]))

(clojure.spec.alpha/def :portkey.aws.lightsail/operation-status #{:started "Failed" "NotStarted" "Succeeded" :completed "Started" :not-started "Completed" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.lightsail.access-denied-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.access-denied-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.access-denied-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.access-denied-exception/code :portkey.aws.lightsail.access-denied-exception/docs :portkey.aws.lightsail.access-denied-exception/message :portkey.aws.lightsail.access-denied-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"\w[\w\-]*\w" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-access-details-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-access-details-request/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/instance-access-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-access-details-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-access-details-request/instance-name] :opt-un [:portkey.aws.lightsail.get-instance-access-details-request/protocol]))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-entry-options-keys (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-active-names-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-active-names-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-active-names-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-state-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-state-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.close-instance-public-ports-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/close-instance-public-ports-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.close-instance-public-ports-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-snapshots-result/disk-snapshots (clojure.spec.alpha/and :portkey.aws.lightsail/disk-snapshot-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-disk-snapshots-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disk-snapshots-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disk-snapshots-result/disk-snapshots :portkey.aws.lightsail.get-disk-snapshots-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/resource-type #{:peered-vpc :disk "DiskSnapshot" :instance :key-pair :disk-snapshot "PeeredVpc" :load-balancer-tls-certificate :load-balancer "LoadBalancerTlsCertificate" "Domain" "Disk" "LoadBalancer" "StaticIp" "InstanceSnapshot" "KeyPair" :domain "Instance" :instance-snapshot :static-ip})

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-summary/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer-tls-certificate-summary/is-attached (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer-tls-certificate-summary/name :portkey.aws.lightsail.load-balancer-tls-certificate-summary/is-attached]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-from-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instances-from-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-instances-from-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-disk-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-disk-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.attach-disk-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-metric-name #{:status-check-failed-system "StatusCheckFailed" "StatusCheckFailed_System" :cpu-utilization "NetworkOut" :network-out :network-in :status-check-failed-instance "StatusCheckFailed_Instance" "CPUUtilization" "NetworkIn" :status-check-failed})

(clojure.spec.alpha/def :portkey.aws.lightsail/operation-type #{"AttachStaticIp" :create-load-balancer :update-domain-entry :create-instances-from-snapshot "StartInstance" "PutInstancePublicPorts" :delete-domain "CreateInstancesFromSnapshot" "RebootInstance" :attach-load-balancer-tls-certificate "DeleteDomainEntry" "DeleteLoadBalancer" :delete-load-balancer-tls-certificate :start-instance "StopInstance" "AttachDisk" "CreateDiskFromSnapshot" :delete-disk "CreateInstanceSnapshot" :create-disk :create-disk-from-snapshot :create-instance "UpdateDomainEntry" :delete-load-balancer :put-instance-public-ports "AllocateStaticIp" "CreateLoadBalancer" "AttachInstancesToLoadBalancer" :attach-instances-to-load-balancer "CreateDisk" "UpdateLoadBalancerAttribute" :reboot-instance :delete-instance :allocate-static-ip :attach-disk :detach-disk "CreateDomain" :release-static-ip "DeleteDisk" "ReleaseStaticIp" "CreateDiskSnapshot" "DetachInstancesFromLoadBalancer" "DeleteInstanceSnapshot" "CreateLoadBalancerTlsCertificate" "DeleteDiskSnapshot" :delete-disk-snapshot "CloseInstancePublicPorts" :create-load-balancer-tls-certificate :close-instance-public-ports :attach-static-ip :create-disk-snapshot :detach-instances-from-load-balancer "OpenInstancePublicPorts" :open-instance-public-ports "AttachLoadBalancerTlsCertificate" "DeleteDomain" :update-load-balancer-attribute "DetachStaticIp" :delete-domain-entry :create-instance-snapshot :delete-instance-snapshot "DeleteInstance" "DetachDisk" :create-domain :detach-static-ip "DeleteLoadBalancerTlsCertificate" "CreateInstance" :stop-instance})

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-disk-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.attach-disk-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.attach-disk-request/disk-path (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-disk-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.attach-disk-request/disk-name :portkey.aws.lightsail.attach-disk-request/instance-name :portkey.aws.lightsail.attach-disk-request/disk-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-disk-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.reboot-instance-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/reboot-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.reboot-instance-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instances-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instances-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-instances-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-protocol #{:http-https :http "HTTP" "HTTP_HTTPS"})

(clojure.spec.alpha/def :portkey.aws.lightsail.is-vpc-peered-result/is-peered (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail/is-vpc-peered-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.is-vpc-peered-result/is-peered]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instances-result/instances (clojure.spec.alpha/and :portkey.aws.lightsail/instance-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instances-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instances-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instances-result/instances :portkey.aws.lightsail.get-instances-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/metric-statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.lightsail.disk/is-system-disk (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/is-attached (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/path (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/gb-in-use (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/attached-to (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/iops (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/state (clojure.spec.alpha/and :portkey.aws.lightsail/disk-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/attachment-state (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.disk/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail/disk (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.disk/is-system-disk :portkey.aws.lightsail.disk/arn :portkey.aws.lightsail.disk/is-attached :portkey.aws.lightsail.disk/created-at :portkey.aws.lightsail.disk/path :portkey.aws.lightsail.disk/gb-in-use :portkey.aws.lightsail.disk/size-in-gb :portkey.aws.lightsail.disk/name :portkey.aws.lightsail.disk/attached-to :portkey.aws.lightsail.disk/location :portkey.aws.lightsail.disk/iops :portkey.aws.lightsail.disk/support-code :portkey.aws.lightsail.disk/state :portkey.aws.lightsail.disk/attachment-state :portkey.aws.lightsail.disk/resource-type]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-bundles-request/include-inactive (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-bundles-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-bundles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-bundles-request/include-inactive :portkey.aws.lightsail.get-bundles-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"([0-9]{1,3}\.){3}[0-9]{1,3}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-state/code (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-state/name (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-state/code :portkey.aws.lightsail.instance-state/name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/protocol (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-protocol))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/configuration-options (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-configuration-options))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/health-check-path (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/instance-health-summary (clojure.spec.alpha/and :portkey.aws.lightsail/instance-health-summary-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/instance-port (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/state (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/tls-certificate-summaries (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-tls-certificate-summary-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/public-ports (clojure.spec.alpha/and :portkey.aws.lightsail/port-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.load-balancer/dns-name (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.load-balancer/protocol :portkey.aws.lightsail.load-balancer/configuration-options :portkey.aws.lightsail.load-balancer/arn :portkey.aws.lightsail.load-balancer/created-at :portkey.aws.lightsail.load-balancer/health-check-path :portkey.aws.lightsail.load-balancer/instance-health-summary :portkey.aws.lightsail.load-balancer/name :portkey.aws.lightsail.load-balancer/location :portkey.aws.lightsail.load-balancer/instance-port :portkey.aws.lightsail.load-balancer/support-code :portkey.aws.lightsail.load-balancer/state :portkey.aws.lightsail.load-balancer/resource-type :portkey.aws.lightsail.load-balancer/tls-certificate-summaries :portkey.aws.lightsail.load-balancer/public-ports :portkey.aws.lightsail.load-balancer/dns-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-result/instance (clojure.spec.alpha/and :portkey.aws.lightsail/instance))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-result/instance]))

(clojure.spec.alpha/def :portkey.aws.lightsail/disk-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/disk))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-tls-certificate-domain-status #{"SUCCESS" :pending-validation :success "FAILED" "PENDING_VALIDATION" :failed})

(clojure.spec.alpha/def :portkey.aws.lightsail/network-protocol #{:tcp "udp" :all :udp "all" "tcp"})

(clojure.spec.alpha/def :portkey.aws.lightsail.stop-instance-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/stop-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.stop-instance-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/is-attached (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/attached-to (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.static-ip/ip-address (clojure.spec.alpha/and :portkey.aws.lightsail/ip-address))
(clojure.spec.alpha/def :portkey.aws.lightsail/static-ip (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.static-ip/arn :portkey.aws.lightsail.static-ip/is-attached :portkey.aws.lightsail.static-ip/created-at :portkey.aws.lightsail.static-ip/name :portkey.aws.lightsail.static-ip/attached-to :portkey.aws.lightsail.static-ip/location :portkey.aws.lightsail.static-ip/support-code :portkey.aws.lightsail.static-ip/resource-type :portkey.aws.lightsail.static-ip/ip-address]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancer-result/load-balancer (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-load-balancer-result/load-balancer]))

(clojure.spec.alpha/def :portkey.aws.lightsail.close-instance-public-ports-request/port-info (clojure.spec.alpha/and :portkey.aws.lightsail/port-info))
(clojure.spec.alpha/def :portkey.aws.lightsail.close-instance-public-ports-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/close-instance-public-ports-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.close-instance-public-ports-request/port-info :portkey.aws.lightsail.close-instance-public-ports-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/progress (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/from-blueprint-id (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/from-instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/from-bundle-id (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/from-attached-disks (clojure.spec.alpha/and :portkey.aws.lightsail/disk-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/state (clojure.spec.alpha/and :portkey.aws.lightsail/instance-snapshot-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/from-instance-arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance-snapshot/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance-snapshot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance-snapshot/progress :portkey.aws.lightsail.instance-snapshot/arn :portkey.aws.lightsail.instance-snapshot/created-at :portkey.aws.lightsail.instance-snapshot/from-blueprint-id :portkey.aws.lightsail.instance-snapshot/from-instance-name :portkey.aws.lightsail.instance-snapshot/size-in-gb :portkey.aws.lightsail.instance-snapshot/from-bundle-id :portkey.aws.lightsail.instance-snapshot/name :portkey.aws.lightsail.instance-snapshot/location :portkey.aws.lightsail.instance-snapshot/from-attached-disks :portkey.aws.lightsail.instance-snapshot/support-code :portkey.aws.lightsail.instance-snapshot/state :portkey.aws.lightsail.instance-snapshot/from-instance-arn :portkey.aws.lightsail.instance-snapshot/resource-type]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancers-result/load-balancers (clojure.spec.alpha/and :portkey.aws.lightsail/load-balancer-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-load-balancers-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-load-balancers-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-load-balancers-result/load-balancers :portkey.aws.lightsail.get-load-balancers-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.start-instance-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/start-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.start-instance-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.reboot-instance-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/reboot-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.reboot-instance-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail.key-pair/fingerprint (clojure.spec.alpha/and :portkey.aws.lightsail/base-64))
(clojure.spec.alpha/def :portkey.aws.lightsail/key-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.key-pair/name :portkey.aws.lightsail.key-pair/arn :portkey.aws.lightsail.key-pair/support-code :portkey.aws.lightsail.key-pair/created-at :portkey.aws.lightsail.key-pair/location :portkey.aws.lightsail.key-pair/resource-type :portkey.aws.lightsail.key-pair/fingerprint]))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-entry-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/domain-entry))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-operations-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-operations-result/operations :portkey.aws.lightsail.get-operations-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail.release-static-ip-request/static-ip-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/release-static-ip-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.release-static-ip-request/static-ip-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-access-details-result/access-details (clojure.spec.alpha/and :portkey.aws.lightsail/instance-access-details))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-access-details-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-access-details-result/access-details]))

(clojure.spec.alpha/def :portkey.aws.lightsail/attached-disk-map (clojure.spec.alpha/map-of :portkey.aws.lightsail/resource-name :portkey.aws.lightsail/disk-map-list))

(clojure.spec.alpha/def :portkey.aws.lightsail.monthly-transfer/gb-per-month-allocated (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail/monthly-transfer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.monthly-transfer/gb-per-month-allocated]))

(clojure.spec.alpha/def :portkey.aws.lightsail.detach-instances-from-load-balancer-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/detach-instances-from-load-balancer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.detach-instances-from-load-balancer-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.start-instance-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/start-instance-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.start-instance-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-instances-to-load-balancer-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.attach-instances-to-load-balancer-request/instance-names (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-instances-to-load-balancer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.attach-instances-to-load-balancer-request/load-balancer-name :portkey.aws.lightsail.attach-instances-to-load-balancer-request/instance-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-entry-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lightsail.instance/is-static-ip (clojure.spec.alpha/and :portkey.aws.lightsail/boolean))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/private-ip-address (clojure.spec.alpha/and :portkey.aws.lightsail/ip-address))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/ssh-key-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/arn (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/created-at (clojure.spec.alpha/and :portkey.aws.lightsail/iso-date))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/blueprint-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/username (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/ipv-6-address (clojure.spec.alpha/and :portkey.aws.lightsail/ip-v-6-address))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/hardware (clojure.spec.alpha/and :portkey.aws.lightsail/instance-hardware))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/location (clojure.spec.alpha/and :portkey.aws.lightsail/resource-location))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/bundle-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/networking (clojure.spec.alpha/and :portkey.aws.lightsail/instance-networking))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/support-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/state (clojure.spec.alpha/and :portkey.aws.lightsail/instance-state))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/blueprint-name (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/public-ip-address (clojure.spec.alpha/and :portkey.aws.lightsail/ip-address))
(clojure.spec.alpha/def :portkey.aws.lightsail.instance/resource-type (clojure.spec.alpha/and :portkey.aws.lightsail/resource-type))
(clojure.spec.alpha/def :portkey.aws.lightsail/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.instance/is-static-ip :portkey.aws.lightsail.instance/private-ip-address :portkey.aws.lightsail.instance/ssh-key-name :portkey.aws.lightsail.instance/arn :portkey.aws.lightsail.instance/created-at :portkey.aws.lightsail.instance/blueprint-id :portkey.aws.lightsail.instance/username :portkey.aws.lightsail.instance/ipv-6-address :portkey.aws.lightsail.instance/hardware :portkey.aws.lightsail.instance/name :portkey.aws.lightsail.instance/location :portkey.aws.lightsail.instance/bundle-id :portkey.aws.lightsail.instance/networking :portkey.aws.lightsail.instance/support-code :portkey.aws.lightsail.instance/state :portkey.aws.lightsail.instance/blueprint-name :portkey.aws.lightsail.instance/public-ip-address :portkey.aws.lightsail.instance/resource-type]))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lightsail.open-instance-public-ports-request/port-info (clojure.spec.alpha/and :portkey.aws.lightsail/port-info))
(clojure.spec.alpha/def :portkey.aws.lightsail.open-instance-public-ports-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/open-instance-public-ports-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.open-instance-public-ports-request/port-info :portkey.aws.lightsail.open-instance-public-ports-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-platform-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance-platform))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-snapshot-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance-snapshot))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-operation-request/operation-id (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-operation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-operation-request/operation-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-key-pair-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-key-pair-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.delete-key-pair-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-attribute-name #{:health-check-path :session-stickiness-lb-cookie-duration-seconds :session-stickiness-enabled "SessionStickiness_LB_CookieDurationSeconds" "SessionStickinessEnabled" "HealthCheckPath"})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-port-states-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-port-states-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-port-states-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-disks-request/page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-disks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-disks-request/page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-access-protocol #{:ssh :rdp "rdp" "ssh"})

(clojure.spec.alpha/def :portkey.aws.lightsail.attach-instances-to-load-balancer-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/attach-instances-to-load-balancer-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.attach-instances-to-load-balancer-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.operation-failure-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation-failure-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.operation-failure-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/operation-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.operation-failure-exception/code :portkey.aws.lightsail.operation-failure-exception/docs :portkey.aws.lightsail.operation-failure-exception/message :portkey.aws.lightsail.operation-failure-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail.unauthenticated-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.unauthenticated-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.unauthenticated-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.unauthenticated-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/unauthenticated-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.unauthenticated-exception/code :portkey.aws.lightsail.unauthenticated-exception/docs :portkey.aws.lightsail.unauthenticated-exception/message :portkey.aws.lightsail.unauthenticated-exception/tip]))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-request/disk-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-request/availability-zone (clojure.spec.alpha/and :portkey.aws.lightsail/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-disk-request/size-in-gb (clojure.spec.alpha/and :portkey.aws.lightsail/integer))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-disk-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-disk-request/disk-name :portkey.aws.lightsail.create-disk-request/availability-zone :portkey.aws.lightsail.create-disk-request/size-in-gb] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.allocate-static-ip-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/allocate-static-ip-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.allocate-static-ip-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail/port-info-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/port-info))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/load-balancer-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-alternative-names (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-load-balancer-tls-certificate-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-load-balancer-tls-certificate-request/load-balancer-name :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-name :portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-domain-name] :opt-un [:portkey.aws.lightsail.create-load-balancer-tls-certificate-request/certificate-alternative-names]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/metric-name (clojure.spec.alpha/and :portkey.aws.lightsail/instance-metric-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/period (clojure.spec.alpha/and :portkey.aws.lightsail/metric-period))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/start-time (clojure.spec.alpha/and :portkey.aws.lightsail/timestamp))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/end-time (clojure.spec.alpha/and :portkey.aws.lightsail/timestamp))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/unit (clojure.spec.alpha/and :portkey.aws.lightsail/metric-unit))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-request/statistics (clojure.spec.alpha/and :portkey.aws.lightsail/metric-statistic-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-metric-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-instance-metric-data-request/instance-name :portkey.aws.lightsail.get-instance-metric-data-request/metric-name :portkey.aws.lightsail.get-instance-metric-data-request/period :portkey.aws.lightsail.get-instance-metric-data-request/start-time :portkey.aws.lightsail.get-instance-metric-data-request/end-time :portkey.aws.lightsail.get-instance-metric-data-request/unit :portkey.aws.lightsail.get-instance-metric-data-request/statistics] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-regions-result/regions (clojure.spec.alpha/and :portkey.aws.lightsail/region-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-regions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-regions-result/regions]))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-active-names-result/active-names (clojure.spec.alpha/and :portkey.aws.lightsail/string-list))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-active-names-result/next-page-token (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-active-names-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-active-names-result/active-names :portkey.aws.lightsail.get-active-names-result/next-page-token]))

(clojure.spec.alpha/def :portkey.aws.lightsail/disk-snapshot-state #{:unknown :pending :completed "error" "completed" "unknown" :error "pending"})

(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-result/metric-name (clojure.spec.alpha/and :portkey.aws.lightsail/instance-metric-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.get-instance-metric-data-result/metric-data (clojure.spec.alpha/and :portkey.aws.lightsail/metric-datapoint-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-instance-metric-data-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.get-instance-metric-data-result/metric-name :portkey.aws.lightsail.get-instance-metric-data-result/metric-data]))

(clojure.spec.alpha/def :portkey.aws.lightsail.region/continent-code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.region/description (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.region/display-name (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.region/name (clojure.spec.alpha/and :portkey.aws.lightsail/region-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.region/availability-zones (clojure.spec.alpha/and :portkey.aws.lightsail/availability-zone-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/region (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.region/continent-code :portkey.aws.lightsail.region/description :portkey.aws.lightsail.region/display-name :portkey.aws.lightsail.region/name :portkey.aws.lightsail.region/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-health-summary-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance-health-summary))

(clojure.spec.alpha/def :portkey.aws.lightsail.password-data/ciphertext (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.password-data/key-pair-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/password-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.password-data/ciphertext :portkey.aws.lightsail.password-data/key-pair-name]))

(clojure.spec.alpha/def :portkey.aws.lightsail.delete-disk-snapshot-request/disk-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/delete-disk-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.delete-disk-snapshot-request/disk-snapshot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instance-snapshot-request/instance-snapshot-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail.create-instance-snapshot-request/instance-name (clojure.spec.alpha/and :portkey.aws.lightsail/resource-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instance-snapshot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.create-instance-snapshot-request/instance-snapshot-name :portkey.aws.lightsail.create-instance-snapshot-request/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.get-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.lightsail/domain-name))
(clojure.spec.alpha/def :portkey.aws.lightsail/get-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lightsail.get-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lightsail.create-instance-snapshot-result/operations (clojure.spec.alpha/and :portkey.aws.lightsail/operation-list))
(clojure.spec.alpha/def :portkey.aws.lightsail/create-instance-snapshot-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.create-instance-snapshot-result/operations]))

(clojure.spec.alpha/def :portkey.aws.lightsail.put-instance-public-ports-result/operation (clojure.spec.alpha/and :portkey.aws.lightsail/operation))
(clojure.spec.alpha/def :portkey.aws.lightsail/put-instance-public-ports-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.put-instance-public-ports-result/operation]))

(clojure.spec.alpha/def :portkey.aws.lightsail/instance-port-info-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/instance-port-info))

(clojure.spec.alpha/def :portkey.aws.lightsail/load-balancer-list (clojure.spec.alpha/coll-of :portkey.aws.lightsail/load-balancer))

(clojure.spec.alpha/def :portkey.aws.lightsail/domain-entry-options (clojure.spec.alpha/map-of :portkey.aws.lightsail/domain-entry-options-keys :portkey.aws.lightsail/string))

(clojure.spec.alpha/def :portkey.aws.lightsail.account-setup-in-progress-exception/code (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.account-setup-in-progress-exception/docs (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.account-setup-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail.account-setup-in-progress-exception/tip (clojure.spec.alpha/and :portkey.aws.lightsail/string))
(clojure.spec.alpha/def :portkey.aws.lightsail/account-setup-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lightsail.account-setup-in-progress-exception/code :portkey.aws.lightsail.account-setup-in-progress-exception/docs :portkey.aws.lightsail.account-setup-in-progress-exception/message :portkey.aws.lightsail.account-setup-in-progress-exception/tip]))

(clojure.core/defn attach-static-ip ([attach-static-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-attach-static-ip-request attach-static-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/attach-static-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/attach-static-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachStaticIp", :http.request.configuration/output-deser-fn deser-attach-static-ip-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef attach-static-ip :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/attach-static-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/attach-static-ip-result))

(clojure.core/defn get-operations ([] (get-operations {})) ([get-operations-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-operations-request get-operations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-operations-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-operations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOperations", :http.request.configuration/output-deser-fn deser-get-operations-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-operations :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-operations-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-operations-result))

(clojure.core/defn get-operations-for-resource ([get-operations-for-resource-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-operations-for-resource-request get-operations-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-operations-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-operations-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOperationsForResource", :http.request.configuration/output-deser-fn deser-get-operations-for-resource-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-operations-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-operations-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-operations-for-resource-result))

(clojure.core/defn get-load-balancer-tls-certificates ([get-load-balancer-tls-certificates-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-load-balancer-tls-certificates-request get-load-balancer-tls-certificates-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-load-balancer-tls-certificates-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-load-balancer-tls-certificates-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoadBalancerTlsCertificates", :http.request.configuration/output-deser-fn deser-get-load-balancer-tls-certificates-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-load-balancer-tls-certificates :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-load-balancer-tls-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-load-balancer-tls-certificates-result))

(clojure.core/defn start-instance ([start-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-start-instance-request start-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/start-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/start-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartInstance", :http.request.configuration/output-deser-fn deser-start-instance-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef start-instance :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/start-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/start-instance-result))

(clojure.core/defn get-load-balancers ([] (get-load-balancers {})) ([get-load-balancers-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-load-balancers-request get-load-balancers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-load-balancers-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-load-balancers-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoadBalancers", :http.request.configuration/output-deser-fn deser-get-load-balancers-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-load-balancers :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-load-balancers-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-load-balancers-result))

(clojure.core/defn delete-key-pair ([delete-key-pair-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-key-pair-request delete-key-pair-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-key-pair-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-key-pair-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteKeyPair", :http.request.configuration/output-deser-fn deser-delete-key-pair-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-key-pair :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-key-pair-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-key-pair-result))

(clojure.core/defn put-instance-public-ports ([put-instance-public-ports-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-instance-public-ports-request put-instance-public-ports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/put-instance-public-ports-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/put-instance-public-ports-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutInstancePublicPorts", :http.request.configuration/output-deser-fn deser-put-instance-public-ports-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef put-instance-public-ports :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/put-instance-public-ports-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/put-instance-public-ports-result))

(clojure.core/defn get-static-ip ([get-static-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-static-ip-request get-static-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-static-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-static-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStaticIp", :http.request.configuration/output-deser-fn deser-get-static-ip-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-static-ip :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-static-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-static-ip-result))

(clojure.core/defn get-domain ([get-domain-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-domain-request get-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-domain-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDomain", :http.request.configuration/output-deser-fn deser-get-domain-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-domain :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-domain-result))

(clojure.core/defn get-operation ([get-operation-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-operation-request get-operation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-operation-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-operation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOperation", :http.request.configuration/output-deser-fn deser-get-operation-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-operation :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-operation-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-operation-result))

(clojure.core/defn peer-vpc ([] (peer-vpc {})) ([peer-vpc-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-peer-vpc-request peer-vpc-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/peer-vpc-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/peer-vpc-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PeerVpc", :http.request.configuration/output-deser-fn deser-peer-vpc-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef peer-vpc :args (clojure.spec.alpha/? :portkey.aws.lightsail/peer-vpc-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/peer-vpc-result))

(clojure.core/defn create-instances-from-snapshot ([create-instances-from-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-instances-from-snapshot-request create-instances-from-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-instances-from-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-instances-from-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstancesFromSnapshot", :http.request.configuration/output-deser-fn deser-create-instances-from-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-instances-from-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-instances-from-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-instances-from-snapshot-result))

(clojure.core/defn reboot-instance ([reboot-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-reboot-instance-request reboot-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/reboot-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/reboot-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RebootInstance", :http.request.configuration/output-deser-fn deser-reboot-instance-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef reboot-instance :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/reboot-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/reboot-instance-result))

(clojure.core/defn delete-domain-entry ([delete-domain-entry-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-domain-entry-request delete-domain-entry-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-domain-entry-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-domain-entry-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDomainEntry", :http.request.configuration/output-deser-fn deser-delete-domain-entry-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-domain-entry :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-domain-entry-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-domain-entry-result))

(clojure.core/defn delete-load-balancer ([delete-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-load-balancer-request delete-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-load-balancer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancer", :http.request.configuration/output-deser-fn deser-delete-load-balancer-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-load-balancer-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-load-balancer-result))

(clojure.core/defn stop-instance ([stop-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-stop-instance-request stop-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/stop-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/stop-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopInstance", :http.request.configuration/output-deser-fn deser-stop-instance-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef stop-instance :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/stop-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/stop-instance-result))

(clojure.core/defn get-key-pair ([get-key-pair-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-key-pair-request get-key-pair-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-key-pair-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-key-pair-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetKeyPair", :http.request.configuration/output-deser-fn deser-get-key-pair-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-key-pair :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-key-pair-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-key-pair-result))

(clojure.core/defn attach-disk ([attach-disk-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-attach-disk-request attach-disk-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/attach-disk-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/attach-disk-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachDisk", :http.request.configuration/output-deser-fn deser-attach-disk-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef attach-disk :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/attach-disk-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/attach-disk-result))

(clojure.core/defn import-key-pair ([import-key-pair-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-import-key-pair-request import-key-pair-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/import-key-pair-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/import-key-pair-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ImportKeyPair", :http.request.configuration/output-deser-fn deser-import-key-pair-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef import-key-pair :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/import-key-pair-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/import-key-pair-result))

(clojure.core/defn get-blueprints ([] (get-blueprints {})) ([get-blueprints-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-blueprints-request get-blueprints-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-blueprints-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-blueprints-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBlueprints", :http.request.configuration/output-deser-fn deser-get-blueprints-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-blueprints :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-blueprints-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-blueprints-result))

(clojure.core/defn unpeer-vpc ([] (unpeer-vpc {})) ([unpeer-vpc-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-unpeer-vpc-request unpeer-vpc-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/unpeer-vpc-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/unpeer-vpc-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UnpeerVpc", :http.request.configuration/output-deser-fn deser-unpeer-vpc-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef unpeer-vpc :args (clojure.spec.alpha/? :portkey.aws.lightsail/unpeer-vpc-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/unpeer-vpc-result))

(clojure.core/defn create-disk-from-snapshot ([create-disk-from-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-disk-from-snapshot-request create-disk-from-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-disk-from-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-disk-from-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDiskFromSnapshot", :http.request.configuration/output-deser-fn deser-create-disk-from-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-disk-from-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-disk-from-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-disk-from-snapshot-result))

(clojure.core/defn create-instance-snapshot ([create-instance-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-instance-snapshot-request create-instance-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-instance-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-instance-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstanceSnapshot", :http.request.configuration/output-deser-fn deser-create-instance-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-instance-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-instance-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-instance-snapshot-result))

(clojure.core/defn get-instance ([get-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-request get-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstance", :http.request.configuration/output-deser-fn deser-get-instance-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-result))

(clojure.core/defn get-disk ([get-disk-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-disk-request get-disk-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-disk-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-disk-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDisk", :http.request.configuration/output-deser-fn deser-get-disk-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-disk :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-disk-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-disk-result))

(clojure.core/defn get-instance-state ([get-instance-state-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-state-request get-instance-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-state-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceState", :http.request.configuration/output-deser-fn deser-get-instance-state-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-state :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-state-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-state-result))

(clojure.core/defn update-domain-entry ([update-domain-entry-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-domain-entry-request update-domain-entry-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/update-domain-entry-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/update-domain-entry-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDomainEntry", :http.request.configuration/output-deser-fn deser-update-domain-entry-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef update-domain-entry :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/update-domain-entry-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/update-domain-entry-result))

(clojure.core/defn get-load-balancer-metric-data ([get-load-balancer-metric-data-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-load-balancer-metric-data-request get-load-balancer-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-load-balancer-metric-data-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-load-balancer-metric-data-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoadBalancerMetricData", :http.request.configuration/output-deser-fn deser-get-load-balancer-metric-data-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-load-balancer-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-load-balancer-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-load-balancer-metric-data-result))

(clojure.core/defn allocate-static-ip ([allocate-static-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-allocate-static-ip-request allocate-static-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/allocate-static-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/allocate-static-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AllocateStaticIp", :http.request.configuration/output-deser-fn deser-allocate-static-ip-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef allocate-static-ip :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/allocate-static-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/allocate-static-ip-result))

(clojure.core/defn create-load-balancer ([create-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-load-balancer-request create-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-load-balancer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancer", :http.request.configuration/output-deser-fn deser-create-load-balancer-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-load-balancer-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-load-balancer-result))

(clojure.core/defn attach-instances-to-load-balancer ([attach-instances-to-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-attach-instances-to-load-balancer-request attach-instances-to-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/attach-instances-to-load-balancer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/attach-instances-to-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachInstancesToLoadBalancer", :http.request.configuration/output-deser-fn deser-attach-instances-to-load-balancer-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef attach-instances-to-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/attach-instances-to-load-balancer-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/attach-instances-to-load-balancer-result))

(clojure.core/defn get-domains ([] (get-domains {})) ([get-domains-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-domains-request get-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-domains-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-domains-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDomains", :http.request.configuration/output-deser-fn deser-get-domains-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-domains :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-domains-result))

(clojure.core/defn create-disk ([create-disk-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-disk-request create-disk-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-disk-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-disk-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDisk", :http.request.configuration/output-deser-fn deser-create-disk-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-disk :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-disk-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-disk-result))

(clojure.core/defn update-load-balancer-attribute ([update-load-balancer-attribute-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-load-balancer-attribute-request update-load-balancer-attribute-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/update-load-balancer-attribute-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/update-load-balancer-attribute-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateLoadBalancerAttribute", :http.request.configuration/output-deser-fn deser-update-load-balancer-attribute-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef update-load-balancer-attribute :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/update-load-balancer-attribute-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/update-load-balancer-attribute-result))

(clojure.core/defn create-domain ([create-domain-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-domain-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDomain", :http.request.configuration/output-deser-fn deser-create-domain-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-domain-result))

(clojure.core/defn get-instance-access-details ([get-instance-access-details-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-access-details-request get-instance-access-details-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-access-details-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-access-details-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceAccessDetails", :http.request.configuration/output-deser-fn deser-get-instance-access-details-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-access-details :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-access-details-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-access-details-result))

(clojure.core/defn get-key-pairs ([] (get-key-pairs {})) ([get-key-pairs-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-key-pairs-request get-key-pairs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-key-pairs-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-key-pairs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetKeyPairs", :http.request.configuration/output-deser-fn deser-get-key-pairs-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-key-pairs :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-key-pairs-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-key-pairs-result))

(clojure.core/defn get-instance-port-states ([get-instance-port-states-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-port-states-request get-instance-port-states-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-port-states-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-port-states-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstancePortStates", :http.request.configuration/output-deser-fn deser-get-instance-port-states-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-port-states :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-port-states-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-port-states-result))

(clojure.core/defn get-disks ([] (get-disks {})) ([get-disks-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-disks-request get-disks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-disks-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-disks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDisks", :http.request.configuration/output-deser-fn deser-get-disks-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-disks :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-disks-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-disks-result))

(clojure.core/defn delete-disk ([delete-disk-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-disk-request delete-disk-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-disk-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-disk-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDisk", :http.request.configuration/output-deser-fn deser-delete-disk-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-disk :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-disk-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-disk-result))

(clojure.core/defn release-static-ip ([release-static-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-release-static-ip-request release-static-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/release-static-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/release-static-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReleaseStaticIp", :http.request.configuration/output-deser-fn deser-release-static-ip-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef release-static-ip :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/release-static-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/release-static-ip-result))

(clojure.core/defn create-disk-snapshot ([create-disk-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-disk-snapshot-request create-disk-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-disk-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-disk-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDiskSnapshot", :http.request.configuration/output-deser-fn deser-create-disk-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-disk-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-disk-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-disk-snapshot-result))

(clojure.core/defn detach-instances-from-load-balancer ([detach-instances-from-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detach-instances-from-load-balancer-request detach-instances-from-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/detach-instances-from-load-balancer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/detach-instances-from-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachInstancesFromLoadBalancer", :http.request.configuration/output-deser-fn deser-detach-instances-from-load-balancer-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef detach-instances-from-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/detach-instances-from-load-balancer-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/detach-instances-from-load-balancer-result))

(clojure.core/defn delete-instance-snapshot ([delete-instance-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-instance-snapshot-request delete-instance-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-instance-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-instance-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInstanceSnapshot", :http.request.configuration/output-deser-fn deser-delete-instance-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-instance-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-instance-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-instance-snapshot-result))

(clojure.core/defn create-load-balancer-tls-certificate ([create-load-balancer-tls-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-load-balancer-tls-certificate-request create-load-balancer-tls-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-load-balancer-tls-certificate-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-load-balancer-tls-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancerTlsCertificate", :http.request.configuration/output-deser-fn deser-create-load-balancer-tls-certificate-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer-tls-certificate :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-load-balancer-tls-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-load-balancer-tls-certificate-result))

(clojure.core/defn delete-disk-snapshot ([delete-disk-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-disk-snapshot-request delete-disk-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-disk-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-disk-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDiskSnapshot", :http.request.configuration/output-deser-fn deser-delete-disk-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-disk-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-disk-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-disk-snapshot-result))

(clojure.core/defn create-instances ([create-instances-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-instances-request create-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-instances-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateInstances", :http.request.configuration/output-deser-fn deser-create-instances-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-instances :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-instances-result))

(clojure.core/defn get-instance-snapshot ([get-instance-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-snapshot-request get-instance-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceSnapshot", :http.request.configuration/output-deser-fn deser-get-instance-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-snapshot-result))

(clojure.core/defn close-instance-public-ports ([close-instance-public-ports-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-close-instance-public-ports-request close-instance-public-ports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/close-instance-public-ports-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/close-instance-public-ports-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CloseInstancePublicPorts", :http.request.configuration/output-deser-fn deser-close-instance-public-ports-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef close-instance-public-ports :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/close-instance-public-ports-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/close-instance-public-ports-result))

(clojure.core/defn get-disk-snapshots ([] (get-disk-snapshots {})) ([get-disk-snapshots-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-disk-snapshots-request get-disk-snapshots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-disk-snapshots-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-disk-snapshots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDiskSnapshots", :http.request.configuration/output-deser-fn deser-get-disk-snapshots-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-disk-snapshots :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-disk-snapshots-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-disk-snapshots-result))

(clojure.core/defn get-disk-snapshot ([get-disk-snapshot-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-disk-snapshot-request get-disk-snapshot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-disk-snapshot-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-disk-snapshot-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDiskSnapshot", :http.request.configuration/output-deser-fn deser-get-disk-snapshot-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-disk-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-disk-snapshot-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-disk-snapshot-result))

(clojure.core/defn get-static-ips ([] (get-static-ips {})) ([get-static-ips-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-static-ips-request get-static-ips-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-static-ips-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-static-ips-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStaticIps", :http.request.configuration/output-deser-fn deser-get-static-ips-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-static-ips :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-static-ips-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-static-ips-result))

(clojure.core/defn open-instance-public-ports ([open-instance-public-ports-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-open-instance-public-ports-request open-instance-public-ports-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/open-instance-public-ports-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/open-instance-public-ports-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "OpenInstancePublicPorts", :http.request.configuration/output-deser-fn deser-open-instance-public-ports-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef open-instance-public-ports :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/open-instance-public-ports-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/open-instance-public-ports-result))

(clojure.core/defn get-bundles ([] (get-bundles {})) ([get-bundles-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-bundles-request get-bundles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-bundles-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-bundles-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetBundles", :http.request.configuration/output-deser-fn deser-get-bundles-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-bundles :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-bundles-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-bundles-result))

(clojure.core/defn attach-load-balancer-tls-certificate ([attach-load-balancer-tls-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-attach-load-balancer-tls-certificate-request attach-load-balancer-tls-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/attach-load-balancer-tls-certificate-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/attach-load-balancer-tls-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachLoadBalancerTlsCertificate", :http.request.configuration/output-deser-fn deser-attach-load-balancer-tls-certificate-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef attach-load-balancer-tls-certificate :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/attach-load-balancer-tls-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/attach-load-balancer-tls-certificate-result))

(clojure.core/defn delete-domain ([delete-domain-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-domain-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-domain-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDomain", :http.request.configuration/output-deser-fn deser-delete-domain-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-domain-result))

(clojure.core/defn get-instances ([] (get-instances {})) ([get-instances-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instances-request get-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instances-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstances", :http.request.configuration/output-deser-fn deser-get-instances-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instances :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instances-result))

(clojure.core/defn detach-static-ip ([detach-static-ip-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detach-static-ip-request detach-static-ip-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/detach-static-ip-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/detach-static-ip-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachStaticIp", :http.request.configuration/output-deser-fn deser-detach-static-ip-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef detach-static-ip :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/detach-static-ip-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/detach-static-ip-result))

(clojure.core/defn get-regions ([] (get-regions {})) ([get-regions-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-regions-request get-regions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-regions-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-regions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRegions", :http.request.configuration/output-deser-fn deser-get-regions-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-regions :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-regions-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-regions-result))

(clojure.core/defn delete-instance ([delete-instance-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-instance-request delete-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-instance-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteInstance", :http.request.configuration/output-deser-fn deser-delete-instance-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-instance :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-instance-result))

(clojure.core/defn get-instance-snapshots ([] (get-instance-snapshots {})) ([get-instance-snapshots-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-snapshots-request get-instance-snapshots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-snapshots-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-snapshots-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceSnapshots", :http.request.configuration/output-deser-fn deser-get-instance-snapshots-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-snapshots :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-instance-snapshots-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-snapshots-result))

(clojure.core/defn detach-disk ([detach-disk-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-detach-disk-request detach-disk-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/detach-disk-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/detach-disk-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachDisk", :http.request.configuration/output-deser-fn deser-detach-disk-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef detach-disk :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/detach-disk-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/detach-disk-result))

(clojure.core/defn download-default-key-pair ([] (download-default-key-pair {})) ([download-default-key-pair-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-download-default-key-pair-request download-default-key-pair-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/download-default-key-pair-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/download-default-key-pair-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DownloadDefaultKeyPair", :http.request.configuration/output-deser-fn deser-download-default-key-pair-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef download-default-key-pair :args (clojure.spec.alpha/? :portkey.aws.lightsail/download-default-key-pair-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/download-default-key-pair-result))

(clojure.core/defn get-active-names ([] (get-active-names {})) ([get-active-names-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-active-names-request get-active-names-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-active-names-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-active-names-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetActiveNames", :http.request.configuration/output-deser-fn deser-get-active-names-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-active-names :args (clojure.spec.alpha/? :portkey.aws.lightsail/get-active-names-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-active-names-result))

(clojure.core/defn get-instance-metric-data ([get-instance-metric-data-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-instance-metric-data-request get-instance-metric-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-instance-metric-data-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-instance-metric-data-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInstanceMetricData", :http.request.configuration/output-deser-fn deser-get-instance-metric-data-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-instance-metric-data :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-instance-metric-data-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-instance-metric-data-result))

(clojure.core/defn is-vpc-peered ([] (is-vpc-peered {})) ([is-vpc-peered-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-is-vpc-peered-request is-vpc-peered-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/is-vpc-peered-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/is-vpc-peered-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "IsVpcPeered", :http.request.configuration/output-deser-fn deser-is-vpc-peered-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef is-vpc-peered :args (clojure.spec.alpha/? :portkey.aws.lightsail/is-vpc-peered-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/is-vpc-peered-result))

(clojure.core/defn delete-load-balancer-tls-certificate ([delete-load-balancer-tls-certificate-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-load-balancer-tls-certificate-request delete-load-balancer-tls-certificate-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/delete-load-balancer-tls-certificate-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/delete-load-balancer-tls-certificate-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancerTlsCertificate", :http.request.configuration/output-deser-fn deser-delete-load-balancer-tls-certificate-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer-tls-certificate :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/delete-load-balancer-tls-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/delete-load-balancer-tls-certificate-result))

(clojure.core/defn create-key-pair ([create-key-pair-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-key-pair-request create-key-pair-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-key-pair-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-key-pair-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateKeyPair", :http.request.configuration/output-deser-fn deser-create-key-pair-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-key-pair :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-key-pair-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-key-pair-result))

(clojure.core/defn get-load-balancer ([get-load-balancer-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-get-load-balancer-request get-load-balancer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/get-load-balancer-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/get-load-balancer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLoadBalancer", :http.request.configuration/output-deser-fn deser-get-load-balancer-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef get-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/get-load-balancer-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/get-load-balancer-result))

(clojure.core/defn create-domain-entry ([create-domain-entry-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-domain-entry-request create-domain-entry-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.lightsail/endpoints, :http.request.configuration/target-prefix "Lightsail_20161128", :http.request.spec/output-spec :portkey.aws.lightsail/create-domain-entry-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-11-28", :http.request.configuration/service-id "Lightsail", :http.request.spec/input-spec :portkey.aws.lightsail/create-domain-entry-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDomainEntry", :http.request.configuration/output-deser-fn deser-create-domain-entry-result, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lightsail/service-exception, "InvalidInputException" :portkey.aws.lightsail/invalid-input-exception, "NotFoundException" :portkey.aws.lightsail/not-found-exception, "OperationFailureException" :portkey.aws.lightsail/operation-failure-exception, "AccessDeniedException" :portkey.aws.lightsail/access-denied-exception, "AccountSetupInProgressException" :portkey.aws.lightsail/account-setup-in-progress-exception, "UnauthenticatedException" :portkey.aws.lightsail/unauthenticated-exception}})))))
(clojure.spec.alpha/fdef create-domain-entry :args (clojure.spec.alpha/tuple :portkey.aws.lightsail/create-domain-entry-request) :ret (clojure.spec.alpha/and :portkey.aws.lightsail/create-domain-entry-result))
