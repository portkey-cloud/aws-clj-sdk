(ns portkey.aws.elasticloadbalancing.-2012-06-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-1"},
    :ssl-common-name "elasticloadbalancing.eu-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-2"},
    :ssl-common-name "elasticloadbalancing.us-east-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-north-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "sa-east-1"},
    :ssl-common-name "elasticloadbalancing.sa-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-southeast-1"},
    :ssl-common-name
    "elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticloadbalancing.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-northeast-2"},
    :ssl-common-name
    "elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-3"},
    :ssl-common-name "elasticloadbalancing.eu-west-3.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ca-central-1"},
    :ssl-common-name "elasticloadbalancing.ca-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-central-1"},
    :ssl-common-name "elasticloadbalancing.eu-central-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-west-2"},
    :ssl-common-name "elasticloadbalancing.eu-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-west-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-2"},
    :ssl-common-name "elasticloadbalancing.us-west-2.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-east-1"},
    :ssl-common-name "elasticloadbalancing.us-east-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-west-1"},
    :ssl-common-name "elasticloadbalancing.us-west-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "ap-south-1"},
    :ssl-common-name "elasticloadbalancing.ap-south-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-health-check)

(clojure.core/declare ser-load-balancer-attributes)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-policy-type-name)

(clojure.core/declare ser-policy-type-names)

(clojure.core/declare ser-cross-zone-load-balancing-enabled)

(clojure.core/declare ser-health-check-timeout)

(clojure.core/declare ser-load-balancer-names)

(clojure.core/declare ser-additional-attributes)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-instance-port)

(clojure.core/declare ser-policy-attribute)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-s-3-bucket-name)

(clojure.core/declare ser-policy-names)

(clojure.core/declare ser-availability-zone)

(clojure.core/declare ser-access-log-interval)

(clojure.core/declare ser-idle-timeout)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-access-point-name)

(clojure.core/declare ser-tag-key-only)

(clojure.core/declare ser-attribute-value)

(clojure.core/declare ser-health-check-interval)

(clojure.core/declare ser-policy-attributes)

(clojure.core/declare ser-additional-attribute)

(clojure.core/declare ser-load-balancer-scheme)

(clojure.core/declare ser-cross-zone-load-balancing)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-protocol)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-connection-draining-timeout)

(clojure.core/declare ser-additional-attribute-value)

(clojure.core/declare ser-ports)

(clojure.core/declare ser-access-log-prefix)

(clojure.core/declare ser-unhealthy-threshold)

(clojure.core/declare ser-listener)

(clojure.core/declare ser-connection-draining)

(clojure.core/declare ser-additional-attribute-key)

(clojure.core/declare ser-healthy-threshold)

(clojure.core/declare ser-access-point-port)

(clojure.core/declare ser-listeners)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-cookie-expiration-period)

(clojure.core/declare ser-health-check-target)

(clojure.core/declare ser-instance)

(clojure.core/declare ser-ssl-certificate-id)

(clojure.core/declare ser-cookie-name)

(clojure.core/declare ser-connection-draining-enabled)

(clojure.core/declare ser-availability-zones)

(clojure.core/declare ser-load-balancer-names-max-20)

(clojure.core/declare ser-connection-settings)

(clojure.core/declare ser-access-log-enabled)

(clojure.core/declare ser-instances)

(clojure.core/declare ser-access-log)

(clojure.core/declare ser-end-point-port)

(clojure.core/defn- ser-health-check [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-health-check-target (:target input)) #:http.request.field{:name "Target", :shape "HealthCheckTarget"}) (clojure.core/into (ser-health-check-interval (:interval input)) #:http.request.field{:name "Interval", :shape "HealthCheckInterval"}) (clojure.core/into (ser-health-check-timeout (:timeout input)) #:http.request.field{:name "Timeout", :shape "HealthCheckTimeout"}) (clojure.core/into (ser-unhealthy-threshold (:unhealthy-threshold input)) #:http.request.field{:name "UnhealthyThreshold", :shape "UnhealthyThreshold"}) (clojure.core/into (ser-healthy-threshold (:healthy-threshold input)) #:http.request.field{:name "HealthyThreshold", :shape "HealthyThreshold"})], :shape "HealthCheck", :type "structure"}))

(clojure.core/defn- ser-load-balancer-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancerAttributes", :type "structure"} (clojure.core/contains? input :cross-zone-load-balancing) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cross-zone-load-balancing (input :cross-zone-load-balancing)) #:http.request.field{:name "CrossZoneLoadBalancing", :shape "CrossZoneLoadBalancing"})) (clojure.core/contains? input :access-log) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-log (input :access-log)) #:http.request.field{:name "AccessLog", :shape "AccessLog"})) (clojure.core/contains? input :connection-draining) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-draining (input :connection-draining)) #:http.request.field{:name "ConnectionDraining", :shape "ConnectionDraining"})) (clojure.core/contains? input :connection-settings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-settings (input :connection-settings)) #:http.request.field{:name "ConnectionSettings", :shape "ConnectionSettings"})) (clojure.core/contains? input :additional-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-attributes (input :additional-attributes)) #:http.request.field{:name "AdditionalAttributes", :shape "AdditionalAttributes"}))))

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-policy-type-name [input] #:http.request.field{:value input, :shape "PolicyTypeName"})

(clojure.core/defn- ser-policy-type-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-type-name coll) #:http.request.field{:shape "PolicyTypeName"}))) input), :shape "PolicyTypeNames", :type "list"})

(clojure.core/defn- ser-cross-zone-load-balancing-enabled [input] #:http.request.field{:value input, :shape "CrossZoneLoadBalancingEnabled"})

(clojure.core/defn- ser-health-check-timeout [input] #:http.request.field{:value input, :shape "HealthCheckTimeout"})

(clojure.core/defn- ser-load-balancer-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-access-point-name coll) #:http.request.field{:shape "AccessPointName"}))) input), :shape "LoadBalancerNames", :type "list"})

(clojure.core/defn- ser-additional-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-additional-attribute coll) #:http.request.field{:shape "AdditionalAttribute"}))) input), :shape "AdditionalAttributes", :type "list", :max 10})

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroups", :type "list"})

(clojure.core/defn- ser-instance-port [input] #:http.request.field{:value input, :shape "InstancePort"})

(clojure.core/defn- ser-policy-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PolicyAttribute", :type "structure"} (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeName"})) (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-value (input :attribute-value)) #:http.request.field{:name "AttributeValue", :shape "AttributeValue"}))))

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-s-3-bucket-name [input] #:http.request.field{:value input, :shape "S3BucketName"})

(clojure.core/defn- ser-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-name coll) #:http.request.field{:shape "PolicyName"}))) input), :shape "PolicyNames", :type "list"})

(clojure.core/defn- ser-availability-zone [input] #:http.request.field{:value input, :shape "AvailabilityZone"})

(clojure.core/defn- ser-access-log-interval [input] #:http.request.field{:value input, :shape "AccessLogInterval"})

(clojure.core/defn- ser-idle-timeout [input] #:http.request.field{:value input, :shape "IdleTimeout"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :min 1})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key-only coll) #:http.request.field{:shape "TagKeyOnly"}))) input), :shape "TagKeyList", :type "list", :min 1})

(clojure.core/defn- ser-access-point-name [input] #:http.request.field{:value input, :shape "AccessPointName"})

(clojure.core/defn- ser-tag-key-only [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagKeyOnly", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"}))))

(clojure.core/defn- ser-attribute-value [input] #:http.request.field{:value input, :shape "AttributeValue"})

(clojure.core/defn- ser-health-check-interval [input] #:http.request.field{:value input, :shape "HealthCheckInterval"})

(clojure.core/defn- ser-policy-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-policy-attribute coll) #:http.request.field{:shape "PolicyAttribute"}))) input), :shape "PolicyAttributes", :type "list"})

(clojure.core/defn- ser-additional-attribute [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AdditionalAttribute", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-attribute-key (input :key)) #:http.request.field{:name "Key", :shape "AdditionalAttributeKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-attribute-value (input :value)) #:http.request.field{:name "Value", :shape "AdditionalAttributeValue"}))))

(clojure.core/defn- ser-load-balancer-scheme [input] #:http.request.field{:value input, :shape "LoadBalancerScheme"})

(clojure.core/defn- ser-cross-zone-load-balancing [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cross-zone-load-balancing-enabled (:enabled input)) #:http.request.field{:name "Enabled", :shape "CrossZoneLoadBalancingEnabled"})], :shape "CrossZoneLoadBalancing", :type "structure"}))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-protocol [input] #:http.request.field{:value input, :shape "Protocol"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-connection-draining-timeout [input] #:http.request.field{:value input, :shape "ConnectionDrainingTimeout"})

(clojure.core/defn- ser-additional-attribute-value [input] #:http.request.field{:value input, :shape "AdditionalAttributeValue"})

(clojure.core/defn- ser-ports [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-access-point-port coll) #:http.request.field{:shape "AccessPointPort"}))) input), :shape "Ports", :type "list"})

(clojure.core/defn- ser-access-log-prefix [input] #:http.request.field{:value input, :shape "AccessLogPrefix"})

(clojure.core/defn- ser-unhealthy-threshold [input] #:http.request.field{:value input, :shape "UnhealthyThreshold"})

(clojure.core/defn- ser-listener [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-protocol (:protocol input)) #:http.request.field{:name "Protocol", :shape "Protocol"}) (clojure.core/into (ser-access-point-port (:load-balancer-port input)) #:http.request.field{:name "LoadBalancerPort", :shape "AccessPointPort"}) (clojure.core/into (ser-instance-port (:instance-port input)) #:http.request.field{:name "InstancePort", :shape "InstancePort"})], :shape "Listener", :type "structure"} (clojure.core/contains? input :instance-protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-protocol (input :instance-protocol)) #:http.request.field{:name "InstanceProtocol", :shape "Protocol"})) (clojure.core/contains? input :ssl-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-certificate-id (input :ssl-certificate-id)) #:http.request.field{:name "SSLCertificateId", :shape "SSLCertificateId"}))))

(clojure.core/defn- ser-connection-draining [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-connection-draining-enabled (:enabled input)) #:http.request.field{:name "Enabled", :shape "ConnectionDrainingEnabled"})], :shape "ConnectionDraining", :type "structure"} (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-connection-draining-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "ConnectionDrainingTimeout"}))))

(clojure.core/defn- ser-additional-attribute-key [input] #:http.request.field{:value input, :shape "AdditionalAttributeKey"})

(clojure.core/defn- ser-healthy-threshold [input] #:http.request.field{:value input, :shape "HealthyThreshold"})

(clojure.core/defn- ser-access-point-port [input] #:http.request.field{:value input, :shape "AccessPointPort"})

(clojure.core/defn- ser-listeners [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-listener coll) #:http.request.field{:shape "Listener"}))) input), :shape "Listeners", :type "list"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-cookie-expiration-period [input] #:http.request.field{:value input, :shape "CookieExpirationPeriod"})

(clojure.core/defn- ser-health-check-target [input] #:http.request.field{:value input, :shape "HealthCheckTarget"})

(clojure.core/defn- ser-instance [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Instance", :type "structure"} (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "InstanceId"}))))

(clojure.core/defn- ser-ssl-certificate-id [input] #:http.request.field{:value input, :shape "SSLCertificateId"})

(clojure.core/defn- ser-cookie-name [input] #:http.request.field{:value input, :shape "CookieName"})

(clojure.core/defn- ser-connection-draining-enabled [input] #:http.request.field{:value input, :shape "ConnectionDrainingEnabled"})

(clojure.core/defn- ser-availability-zones [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-availability-zone coll) #:http.request.field{:shape "AvailabilityZone"}))) input), :shape "AvailabilityZones", :type "list"})

(clojure.core/defn- ser-load-balancer-names-max-20 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-access-point-name coll) #:http.request.field{:shape "AccessPointName"}))) input), :shape "LoadBalancerNamesMax20", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-connection-settings [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-idle-timeout (:idle-timeout input)) #:http.request.field{:name "IdleTimeout", :shape "IdleTimeout"})], :shape "ConnectionSettings", :type "structure"}))

(clojure.core/defn- ser-access-log-enabled [input] #:http.request.field{:value input, :shape "AccessLogEnabled"})

(clojure.core/defn- ser-instances [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance coll) #:http.request.field{:shape "Instance"}))) input), :shape "Instances", :type "list"})

(clojure.core/defn- ser-access-log [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-access-log-enabled (:enabled input)) #:http.request.field{:name "Enabled", :shape "AccessLogEnabled"})], :shape "AccessLog", :type "structure"} (clojure.core/contains? input :s-3-bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket-name (input :s-3-bucket-name)) #:http.request.field{:name "S3BucketName", :shape "S3BucketName"})) (clojure.core/contains? input :emit-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-log-interval (input :emit-interval)) #:http.request.field{:name "EmitInterval", :shape "AccessLogInterval"})) (clojure.core/contains? input :s-3-bucket-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-log-prefix (input :s-3-bucket-prefix)) #:http.request.field{:name "S3BucketPrefix", :shape "AccessLogPrefix"}))))

(clojure.core/defn- ser-end-point-port [input] #:http.request.field{:value input, :shape "EndPointPort"})

(clojure.core/defn- req-describe-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-names-max-20 (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNamesMax20"})]}))

(clojure.core/defn- req-attach-load-balancer-to-subnets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})]}))

(clojure.core/defn- req-delete-load-balancer-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"})]}))

(clojure.core/defn- req-deregister-end-points-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-instances (input :instances)) #:http.request.field{:name "Instances", :shape "Instances"})]}))

(clojure.core/defn- req-set-load-balancer-listener-ssl-certificate-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-access-point-port (input :load-balancer-port)) #:http.request.field{:name "LoadBalancerPort", :shape "AccessPointPort"}) (clojure.core/into (ser-ssl-certificate-id (input :ssl-certificate-id)) #:http.request.field{:name "SSLCertificateId", :shape "SSLCertificateId"})]}))

(clojure.core/defn- req-describe-end-point-state-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"})]} (clojure.core/contains? input :instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instances (input :instances)) #:http.request.field{:name "Instances", :shape "Instances"}))))

(clojure.core/defn- req-describe-load-balancer-policy-types-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy-type-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-type-names (input :policy-type-names)) #:http.request.field{:name "PolicyTypeNames", :shape "PolicyTypeNames"}))))

(clojure.core/defn- req-describe-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"})]}))

(clojure.core/defn- req-delete-access-point-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"})]}))

(clojure.core/defn- req-create-app-cookie-stickiness-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"}) (clojure.core/into (ser-cookie-name (input :cookie-name)) #:http.request.field{:name "CookieName", :shape "CookieName"})]}))

(clojure.core/defn- req-describe-access-points-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-remove-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"}) (clojure.core/into (ser-tag-key-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagKeyList"})]}))

(clojure.core/defn- req-set-load-balancer-policies-for-backend-server-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-end-point-port (input :instance-port)) #:http.request.field{:name "InstancePort", :shape "EndPointPort"}) (clojure.core/into (ser-policy-names (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNames"})]}))

(clojure.core/defn- req-describe-account-limits-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :page-size)) #:http.request.field{:name "PageSize", :shape "PageSize"}))))

(clojure.core/defn- req-delete-load-balancer-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-ports (input :load-balancer-ports)) #:http.request.field{:name "LoadBalancerPorts", :shape "Ports"})]}))

(clojure.core/defn- req-apply-security-groups-to-load-balancer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})]}))

(clojure.core/defn- req-add-availability-zones-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})]}))

(clojure.core/defn- req-create-lb-cookie-stickiness-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"})]} (clojure.core/contains? input :cookie-expiration-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-expiration-period (input :cookie-expiration-period)) #:http.request.field{:name "CookieExpirationPeriod", :shape "CookieExpirationPeriod"}))))

(clojure.core/defn- req-detach-load-balancer-from-subnets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})]}))

(clojure.core/defn- req-configure-health-check-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-health-check (input :health-check)) #:http.request.field{:name "HealthCheck", :shape "HealthCheck"})]}))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-access-point-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-listeners (input :listeners)) #:http.request.field{:name "Listeners", :shape "Listeners"})]} (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})) (clojure.core/contains? input :subnets) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnets (input :subnets)) #:http.request.field{:name "Subnets", :shape "Subnets"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :scheme) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-scheme (input :scheme)) #:http.request.field{:name "Scheme", :shape "LoadBalancerScheme"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-modify-load-balancer-attributes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-load-balancer-attributes (input :load-balancer-attributes)) #:http.request.field{:name "LoadBalancerAttributes", :shape "LoadBalancerAttributes"})]}))

(clojure.core/defn- req-remove-availability-zones-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})]}))

(clojure.core/defn- req-set-load-balancer-policies-of-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-access-point-port (input :load-balancer-port)) #:http.request.field{:name "LoadBalancerPort", :shape "AccessPointPort"}) (clojure.core/into (ser-policy-names (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNames"})]}))

(clojure.core/defn- req-create-load-balancer-listener-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-listeners (input :listeners)) #:http.request.field{:name "Listeners", :shape "Listeners"})]}))

(clojure.core/defn- req-describe-load-balancer-policies-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :load-balancer-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"})) (clojure.core/contains? input :policy-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-names (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNames"}))))

(clojure.core/defn- req-create-load-balancer-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"}) (clojure.core/into (ser-policy-type-name (input :policy-type-name)) #:http.request.field{:name "PolicyTypeName", :shape "PolicyTypeName"})]} (clojure.core/contains? input :policy-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-attributes (input :policy-attributes)) #:http.request.field{:name "PolicyAttributes", :shape "PolicyAttributes"}))))

(clojure.core/defn- req-register-end-points-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-access-point-name (input :load-balancer-name)) #:http.request.field{:name "LoadBalancerName", :shape "AccessPointName"}) (clojure.core/into (ser-instances (input :instances)) #:http.request.field{:name "Instances", :shape "Instances"})]}))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/backend-server-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/backend-server-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.health-check/target (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-target))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.health-check/interval (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-interval))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.health-check/timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/health-check (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.health-check/target :portkey.aws.elasticloadbalancing.-2012-06-01.health-check/interval :portkey.aws.elasticloadbalancing.-2012-06-01.health-check/timeout :portkey.aws.elasticloadbalancing.-2012-06-01/unhealthy-threshold :portkey.aws.elasticloadbalancing.-2012-06-01/healthy-threshold] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-tags-input/load-balancer-names (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names-max-20))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.describe-tags-input/load-balancer-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-access-points-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-descriptions :portkey.aws.elasticloadbalancing.-2012-06-01.describe-access-points-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/cross-zone-load-balancing :portkey.aws.elasticloadbalancing.-2012-06-01/access-log :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining :portkey.aws.elasticloadbalancing.-2012-06-01/connection-settings :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/cross-zone-load-balancing-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-timeout (clojure.spec.alpha/int-in 2 60))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.attach-load-balancer-to-subnets-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.attach-load-balancer-to-subnets-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/subnets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/app-cookie-stickiness-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-name :portkey.aws.elasticloadbalancing.-2012-06-01/cookie-name]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/cardinality (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/max (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-policy-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-account-limits-output/next-marker (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/marker))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/limits :portkey.aws.elasticloadbalancing.-2012-06-01.describe-account-limits-output/next-marker]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-name :portkey.aws.elasticloadbalancing.-2012-06-01/description :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-type-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute :max-count 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/page-size (clojure.spec.alpha/int-in 1 400))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/canonical-hosted-zone-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-scheme))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/canonical-hosted-zone-name-id (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/dns-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/backend-server-descriptions :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/canonical-hosted-zone-name :portkey.aws.elasticloadbalancing.-2012-06-01/health-check :portkey.aws.elasticloadbalancing.-2012-06-01/subnets :portkey.aws.elasticloadbalancing.-2012-06-01/security-groups :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/listener-descriptions :portkey.aws.elasticloadbalancing.-2012-06-01/source-security-group :portkey.aws.elasticloadbalancing.-2012-06-01/created-time :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/scheme :portkey.aws.elasticloadbalancing.-2012-06-01/dns-name :portkey.aws.elasticloadbalancing.-2012-06-01.load-balancer-description/canonical-hosted-zone-name-id :portkey.aws.elasticloadbalancing.-2012-06-01/policies :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones :portkey.aws.elasticloadbalancing.-2012-06-01/vpc-id :portkey.aws.elasticloadbalancing.-2012-06-01/instances]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-type-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/attribute-name :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-type :portkey.aws.elasticloadbalancing.-2012-06-01/description :portkey.aws.elasticloadbalancing.-2012-06-01/default-value :portkey.aws.elasticloadbalancing.-2012-06-01/cardinality]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/lb-cookie-stickiness-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/lb-cookie-stickiness-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/subnets (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.deregister-end-points-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.deregister-end-points-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/instances] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/dns-name]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-listener-ssl-certificate-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-listener-ssl-certificate-input/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-listener-ssl-certificate-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-listener-ssl-certificate-input/load-balancer-port :portkey.aws.elasticloadbalancing.-2012-06-01/ssl-certificate-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/security-groups (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-id))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-subnet-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instance-states (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/instance-state))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-end-point-state-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.describe-end-point-state-input/load-balancer-name] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instances]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-names]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-load-balancer-attributes-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.describe-load-balancer-attributes-input/load-balancer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instance-port (clojure.spec.alpha/int-in 1 65535))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instances]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/attribute-name :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.delete-access-point-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.delete-access-point-input/load-balancer-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/subnets]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-app-cookie-stickiness-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.create-app-cookie-stickiness-policy-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name :portkey.aws.elasticloadbalancing.-2012-06-01/cookie-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names :portkey.aws.elasticloadbalancing.-2012-06-01/marker :portkey.aws.elasticloadbalancing.-2012-06-01/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/listener-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/listener-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/lb-cookie-stickiness-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-name :portkey.aws.elasticloadbalancing.-2012-06-01/cookie-expiration-period]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.remove-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names :portkey.aws.elasticloadbalancing.-2012-06-01.remove-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/s-3-bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.source-security-group/owner-alias (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-owner-alias))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.source-security-group/group-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/source-security-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.source-security-group/owner-alias :portkey.aws.elasticloadbalancing.-2012-06-01.source-security-group/group-name]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-for-backend-server-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-for-backend-server-input/instance-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/end-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-for-backend-server-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-for-backend-server-input/instance-port :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/marker :portkey.aws.elasticloadbalancing.-2012-06-01/page-size]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-listener-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/name :portkey.aws.elasticloadbalancing.-2012-06-01/max]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/listener-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/listener :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zone (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attribute-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-access-points-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-listener-input/load-balancer-ports (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/ports))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-listener-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01.delete-load-balancer-listener-input/load-balancer-ports] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-interval clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.apply-security-groups-to-load-balancer-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.apply-security-groups-to-load-balancer-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/security-groups] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.tag-description/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.tag-description/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.tag-description/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01.tag-description/tags]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/created-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/idle-timeout (clojure.spec.alpha/int-in 1 3600))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/limits (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/limit))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.add-availability-zones-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.add-availability-zones-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-lb-cookie-stickiness-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.create-lb-cookie-stickiness-policy-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/cookie-expiration-period]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/tag :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-access-point-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/security-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key-only :min-count 1))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-tag-keys-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.tag-key-only/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key-only (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.tag-key-only/key]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-interval (clojure.spec.alpha/int-in 5 300))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.detach-load-balancer-from-subnets-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.detach-load-balancer-from-subnets-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/subnets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attributes (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.configure-health-check-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.configure-health-check-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/health-check] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.additional-attribute/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.additional-attribute/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.additional-attribute/key :portkey.aws.elasticloadbalancing.-2012-06-01.additional-attribute/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-scheme (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-scheme-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.cross-zone-load-balancing/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/cross-zone-load-balancing-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/cross-zone-load-balancing (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.cross-zone-load-balancing/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/tag-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names :portkey.aws.elasticloadbalancing.-2012-06-01.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/ports (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-port))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instances]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/unhealthy-threshold (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/tag-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.listener/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.listener/instance-protocol (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/protocol))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/listener (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01/protocol :portkey.aws.elasticloadbalancing.-2012-06-01.listener/load-balancer-port :portkey.aws.elasticloadbalancing.-2012-06-01/instance-port] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.listener/instance-protocol :portkey.aws.elasticloadbalancing.-2012-06-01/ssl-certificate-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.connection-draining/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.connection-draining/timeout (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining-timeout))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.connection-draining/enabled] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.connection-draining/timeout]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.policies/other-policies (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/app-cookie-stickiness-policies :portkey.aws.elasticloadbalancing.-2012-06-01/lb-cookie-stickiness-policies :portkey.aws.elasticloadbalancing.-2012-06-01.policies/other-policies]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/scheme (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-scheme))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/listeners] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones :portkey.aws.elasticloadbalancing.-2012-06-01/subnets :portkey.aws.elasticloadbalancing.-2012-06-01/security-groups :portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/scheme :portkey.aws.elasticloadbalancing.-2012-06-01.create-access-point-input/tags]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/healthy-threshold (clojure.spec.alpha/int-in 2 10))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-port clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/listeners (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/listener))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/default-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-owner-alias (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.modify-load-balancer-attributes-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.modify-load-balancer-attributes-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instance-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instance-id :portkey.aws.elasticloadbalancing.-2012-06-01/state :portkey.aws.elasticloadbalancing.-2012-06-01/reason-code :portkey.aws.elasticloadbalancing.-2012-06-01/description]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/dependency-throttle-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.remove-availability-zones-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.remove-availability-zones-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/state (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.tag/key (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.tag/value (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.tag/key] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-descriptions]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/reason-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/cookie-expiration-period clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instance-states]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-of-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-of-listener-input/load-balancer-port (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-port))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-of-listener-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01.set-load-balancer-policies-of-listener-input/load-balancer-port :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/health-check-target (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instance-id]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/ssl-certificate-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/app-cookie-stickiness-policies (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/app-cookie-stickiness-policy))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-type-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-type-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/subnets]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-load-balancer-listener-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.create-load-balancer-listener-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/listeners] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/cookie-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.describe-load-balancer-policies-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.describe-load-balancer-policies-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/availability-zone))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/attribute-name :portkey.aws.elasticloadbalancing.-2012-06-01/attribute-value]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.create-load-balancer-policy-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.create-load-balancer-policy-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-name :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-name] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/policy-attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/listener-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-descriptions (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/policy-attribute-description))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names-max-20 (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/connection-settings (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01/idle-timeout] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.modify-load-balancer-attributes-output/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01.modify-load-balancer-attributes-output/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/instances (clojure.spec.alpha/coll-of :portkey.aws.elasticloadbalancing.-2012-06-01/instance))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attributes]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.access-log/enabled (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-enabled))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.access-log/emit-interval (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-interval))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.access-log/s-3-bucket-prefix (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-log-prefix))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/access-log (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.access-log/enabled] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/s-3-bucket-name :portkey.aws.elasticloadbalancing.-2012-06-01.access-log/emit-interval :portkey.aws.elasticloadbalancing.-2012-06-01.access-log/s-3-bucket-prefix]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/backend-server-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/instance-port :portkey.aws.elasticloadbalancing.-2012-06-01/policy-names]))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-security-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.register-end-points-input/load-balancer-name (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-name))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01.register-end-points-input/load-balancer-name :portkey.aws.elasticloadbalancing.-2012-06-01/instances] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/end-point-port clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticloadbalancing.-2012-06-01/health-check]))

(clojure.core/defn remove-tags ([remove-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-output))

(clojure.core/defn apply-security-groups-to-load-balancer ([apply-security-groups-to-load-balancer-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-apply-security-groups-to-load-balancer-input apply-security-groups-to-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ApplySecurityGroupsToLoadBalancer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef apply-security-groups-to-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-output))

(clojure.core/defn describe-account-limits ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeAccountLimits", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-output))

(clojure.core/defn describe-load-balancer-policies ([] (describe-load-balancer-policies {})) ([describe-load-balancer-policies-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-load-balancer-policies-input describe-load-balancer-policies-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancerPolicies", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-policies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-output))

(clojure.core/defn set-load-balancer-policies-of-listener ([set-load-balancer-policies-of-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-load-balancer-policies-of-listener-input set-load-balancer-policies-of-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetLoadBalancerPoliciesOfListener", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-policies-of-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-output))

(clojure.core/defn disable-availability-zones-for-load-balancer ([remove-availability-zones-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-availability-zones-input remove-availability-zones-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableAvailabilityZonesForLoadBalancer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef disable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-output))

(clojure.core/defn delete-load-balancer ([delete-access-point-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-access-point-input delete-access-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancer", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-output))

(clojure.core/defn create-lb-cookie-stickiness-policy ([create-lb-cookie-stickiness-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-lb-cookie-stickiness-policy-input create-lb-cookie-stickiness-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLBCookieStickinessPolicy", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-lb-cookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-output))

(clojure.core/defn describe-instance-health ([describe-end-point-state-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-end-point-state-input describe-end-point-state-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeInstanceHealth", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef describe-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-output))

(clojure.core/defn modify-load-balancer-attributes ([modify-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-load-balancer-attributes-input modify-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyLoadBalancerAttributes", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attribute-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-output))

(clojure.core/defn create-load-balancer ([create-access-point-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-access-point-input create-access-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancer", :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancing.-2012-06-01/operation-not-permitted-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-subnet-exception, "TooManyAccessPointsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-access-points-exception, "DuplicateAccessPointNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-access-point-name-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-tags-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-output))

(clojure.core/defn describe-tags ([describe-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTags", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-output))

(clojure.core/defn describe-load-balancer-policy-types ([] (describe-load-balancer-policy-types {})) ([describe-load-balancer-policy-types-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-load-balancer-policy-types-input describe-load-balancer-policy-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancerPolicyTypes", :http.request.spec/error-spec {"PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-policy-types :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-output))

(clojure.core/defn attach-load-balancer-to-subnets ([attach-load-balancer-to-subnets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-attach-load-balancer-to-subnets-input attach-load-balancer-to-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AttachLoadBalancerToSubnets", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-subnet-exception}})))))
(clojure.spec.alpha/fdef attach-load-balancer-to-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-output))

(clojure.core/defn enable-availability-zones-for-load-balancer ([add-availability-zones-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-availability-zones-input add-availability-zones-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableAvailabilityZonesForLoadBalancer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef enable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-output))

(clojure.core/defn set-load-balancer-policies-for-backend-server ([set-load-balancer-policies-for-backend-server-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-load-balancer-policies-for-backend-server-input set-load-balancer-policies-for-backend-server-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetLoadBalancerPoliciesForBackendServer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-policies-for-backend-server :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-output))

(clojure.core/defn create-load-balancer-policy ([create-load-balancer-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-load-balancer-policy-input create-load-balancer-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancerPolicy", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-output))

(clojure.core/defn delete-load-balancer-listeners ([delete-load-balancer-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-load-balancer-listener-input delete-load-balancer-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancerListeners", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-output))

(clojure.core/defn deregister-instances-from-load-balancer ([deregister-end-points-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-end-points-input deregister-end-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterInstancesFromLoadBalancer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef deregister-instances-from-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-output))

(clojure.core/defn detach-load-balancer-from-subnets ([detach-load-balancer-from-subnets-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-detach-load-balancer-from-subnets-input detach-load-balancer-from-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DetachLoadBalancerFromSubnets", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef detach-load-balancer-from-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-output))

(clojure.core/defn register-instances-with-load-balancer ([register-end-points-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-end-points-input register-end-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterInstancesWithLoadBalancer", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef register-instances-with-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-output))

(clojure.core/defn create-app-cookie-stickiness-policy ([create-app-cookie-stickiness-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-app-cookie-stickiness-policy-input create-app-cookie-stickiness-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateAppCookieStickinessPolicy", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-app-cookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-output))

(clojure.core/defn create-load-balancer-listeners ([create-load-balancer-listener-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-load-balancer-listener-input create-load-balancer-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLoadBalancerListeners", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-listener-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-output))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-tags-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-tag-keys-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-output))

(clojure.core/defn configure-health-check ([configure-health-check-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-configure-health-check-input configure-health-check-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ConfigureHealthCheck", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef configure-health-check :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-output))

(clojure.core/defn set-load-balancer-listener-ssl-certificate ([set-load-balancer-listener-ssl-certificate-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-load-balancer-listener-ssl-certificate-input set-load-balancer-listener-ssl-certificate-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetLoadBalancerListenerSSLCertificate", :http.request.spec/error-spec {"CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-listener-ssl-certificate :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-output))

(clojure.core/defn delete-load-balancer-policy ([delete-load-balancer-policy-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-load-balancer-policy-input delete-load-balancer-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLoadBalancerPolicy", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-output))

(clojure.core/defn describe-load-balancers ([] (describe-load-balancers {})) ([describe-access-points-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-access-points-input describe-access-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancers", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DependencyThrottleException" :portkey.aws.elasticloadbalancing.-2012-06-01/dependency-throttle-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-output))

(clojure.core/defn describe-load-balancer-attributes ([describe-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-load-balancer-attributes-input describe-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLoadBalancerAttributes", :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attribute-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-output))
