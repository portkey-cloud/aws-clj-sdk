(ns portkey.aws.elasticloadbalancing.-2012-06-01 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "us-gov-east-1"},
    :ssl-common-name
    "elasticloadbalancing.us-gov-east-1.amazonaws.com",
    :endpoint
    "https://elasticloadbalancing.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "elasticloadbalancing", :region "eu-north-1"},
    :ssl-common-name "elasticloadbalancing.eu-north-1.amazonaws.com",
    :endpoint "https://elasticloadbalancing.eu-north-1.amazonaws.com",
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

(clojure.core/declare deser-attribute-type)

(clojure.core/declare deser-backend-server-descriptions)

(clojure.core/declare deser-health-check)

(clojure.core/declare deser-load-balancer-attributes)

(clojure.core/declare deser-instance-id)

(clojure.core/declare deser-policy-type-name)

(clojure.core/declare deser-cross-zone-load-balancing-enabled)

(clojure.core/declare deser-health-check-timeout)

(clojure.core/declare deser-app-cookie-stickiness-policy)

(clojure.core/declare deser-cardinality)

(clojure.core/declare deser-max)

(clojure.core/declare deser-policy-type-description)

(clojure.core/declare deser-additional-attributes)

(clojure.core/declare deser-load-balancer-description)

(clojure.core/declare deser-policy-attribute-type-description)

(clojure.core/declare deser-lb-cookie-stickiness-policies)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-policy-name)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-instance-states)

(clojure.core/declare deser-instance-port)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-listener-descriptions)

(clojure.core/declare deser-lb-cookie-stickiness-policy)

(clojure.core/declare deser-policy-description)

(clojure.core/declare deser-s-3-bucket-name)

(clojure.core/declare deser-policy-names)

(clojure.core/declare deser-source-security-group)

(clojure.core/declare deser-limit)

(clojure.core/declare deser-load-balancer-descriptions)

(clojure.core/declare deser-listener-description)

(clojure.core/declare deser-availability-zone)

(clojure.core/declare deser-policy-type-descriptions)

(clojure.core/declare deser-access-log-interval)

(clojure.core/declare deser-tag-description)

(clojure.core/declare deser-created-time)

(clojure.core/declare deser-idle-timeout)

(clojure.core/declare deser-limits)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-access-point-name)

(clojure.core/declare deser-attribute-value)

(clojure.core/declare deser-health-check-interval)

(clojure.core/declare deser-additional-attribute)

(clojure.core/declare deser-dns-name)

(clojure.core/declare deser-load-balancer-scheme)

(clojure.core/declare deser-cross-zone-load-balancing)

(clojure.core/declare deser-tag-descriptions)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-protocol)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-connection-draining-timeout)

(clojure.core/declare deser-additional-attribute-value)

(clojure.core/declare deser-access-log-prefix)

(clojure.core/declare deser-unhealthy-threshold)

(clojure.core/declare deser-listener)

(clojure.core/declare deser-connection-draining)

(clojure.core/declare deser-policies)

(clojure.core/declare deser-additional-attribute-key)

(clojure.core/declare deser-healthy-threshold)

(clojure.core/declare deser-access-point-port)

(clojure.core/declare deser-default-value)

(clojure.core/declare deser-security-group-owner-alias)

(clojure.core/declare deser-instance-state)

(clojure.core/declare deser-security-group-name)

(clojure.core/declare deser-state)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-reason-code)

(clojure.core/declare deser-cookie-expiration-period)

(clojure.core/declare deser-health-check-target)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-ssl-certificate-id)

(clojure.core/declare deser-policy-descriptions)

(clojure.core/declare deser-app-cookie-stickiness-policies)

(clojure.core/declare deser-name)

(clojure.core/declare deser-policy-attribute-type-descriptions)

(clojure.core/declare deser-cookie-name)

(clojure.core/declare deser-connection-draining-enabled)

(clojure.core/declare deser-availability-zones)

(clojure.core/declare deser-policy-attribute-description)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-policy-attribute-descriptions)

(clojure.core/declare deser-connection-settings)

(clojure.core/declare deser-access-log-enabled)

(clojure.core/declare deser-instances)

(clojure.core/declare deser-access-log)

(clojure.core/declare deser-backend-server-description)

(clojure.core/defn- deser-attribute-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-backend-server-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-backend-server-description coll))) input))

(clojure.core/defn- deser-health-check [input] (clojure.core/let [letvar872167 {"Target" (portkey.aws/search-for-tag input "Target" :flattened? nil :xmlAttribute? nil), "Interval" (portkey.aws/search-for-tag input "Interval" :flattened? nil :xmlAttribute? nil), "Timeout" (portkey.aws/search-for-tag input "Timeout" :flattened? nil :xmlAttribute? nil), "UnhealthyThreshold" (portkey.aws/search-for-tag input "UnhealthyThreshold" :flattened? nil :xmlAttribute? nil), "HealthyThreshold" (portkey.aws/search-for-tag input "HealthyThreshold" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target (deser-health-check-target (clojure.core/get-in letvar872167 ["Target" :content])), :interval (deser-health-check-interval (clojure.core/get-in letvar872167 ["Interval" :content])), :timeout (deser-health-check-timeout (clojure.core/get-in letvar872167 ["Timeout" :content])), :unhealthy-threshold (deser-unhealthy-threshold (clojure.core/get-in letvar872167 ["UnhealthyThreshold" :content])), :healthy-threshold (deser-healthy-threshold (clojure.core/get-in letvar872167 ["HealthyThreshold" :content]))})))

(clojure.core/defn- deser-load-balancer-attributes [input] (clojure.core/let [letvar872275 {"CrossZoneLoadBalancing" (portkey.aws/search-for-tag input "CrossZoneLoadBalancing" :flattened? nil :xmlAttribute? nil), "AccessLog" (portkey.aws/search-for-tag input "AccessLog" :flattened? nil :xmlAttribute? nil), "ConnectionDraining" (portkey.aws/search-for-tag input "ConnectionDraining" :flattened? nil :xmlAttribute? nil), "ConnectionSettings" (portkey.aws/search-for-tag input "ConnectionSettings" :flattened? nil :xmlAttribute? nil), "AdditionalAttributes" (portkey.aws/search-for-tag input "AdditionalAttributes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872275 "CrossZoneLoadBalancing") (clojure.core/assoc :cross-zone-load-balancing (deser-cross-zone-load-balancing (clojure.core/get-in letvar872275 ["CrossZoneLoadBalancing" :content]))) (letvar872275 "AccessLog") (clojure.core/assoc :access-log (deser-access-log (clojure.core/get-in letvar872275 ["AccessLog" :content]))) (letvar872275 "ConnectionDraining") (clojure.core/assoc :connection-draining (deser-connection-draining (clojure.core/get-in letvar872275 ["ConnectionDraining" :content]))) (letvar872275 "ConnectionSettings") (clojure.core/assoc :connection-settings (deser-connection-settings (clojure.core/get-in letvar872275 ["ConnectionSettings" :content]))) (letvar872275 "AdditionalAttributes") (clojure.core/assoc :additional-attributes (deser-additional-attributes (clojure.core/get-in letvar872275 ["AdditionalAttributes" :content]))))))

(clojure.core/defn- deser-instance-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-type-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cross-zone-load-balancing-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-health-check-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-app-cookie-stickiness-policy [input] (clojure.core/let [letvar872397 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "CookieName" (portkey.aws/search-for-tag input "CookieName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872397 "PolicyName") (clojure.core/assoc :policy-name (deser-policy-name (clojure.core/get-in letvar872397 ["PolicyName" :content]))) (letvar872397 "CookieName") (clojure.core/assoc :cookie-name (deser-cookie-name (clojure.core/get-in letvar872397 ["CookieName" :content]))))))

(clojure.core/defn- deser-cardinality [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-max [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-type-description [input] (clojure.core/let [letvar872515 {"PolicyTypeName" (portkey.aws/search-for-tag input "PolicyTypeName" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "PolicyAttributeTypeDescriptions" (portkey.aws/search-for-tag input "PolicyAttributeTypeDescriptions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872515 "PolicyTypeName") (clojure.core/assoc :policy-type-name (deser-policy-type-name (clojure.core/get-in letvar872515 ["PolicyTypeName" :content]))) (letvar872515 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar872515 ["Description" :content]))) (letvar872515 "PolicyAttributeTypeDescriptions") (clojure.core/assoc :policy-attribute-type-descriptions (deser-policy-attribute-type-descriptions (clojure.core/get-in letvar872515 ["PolicyAttributeTypeDescriptions" :content]))))))

(clojure.core/defn- deser-additional-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-additional-attribute coll))) input))

(clojure.core/defn- deser-load-balancer-description [input] (clojure.core/let [letvar872640 {"BackendServerDescriptions" (portkey.aws/search-for-tag input "BackendServerDescriptions" :flattened? nil :xmlAttribute? nil), "CanonicalHostedZoneName" (portkey.aws/search-for-tag input "CanonicalHostedZoneName" :flattened? nil :xmlAttribute? nil), "HealthCheck" (portkey.aws/search-for-tag input "HealthCheck" :flattened? nil :xmlAttribute? nil), "Subnets" (portkey.aws/search-for-tag input "Subnets" :flattened? nil :xmlAttribute? nil), "SecurityGroups" (portkey.aws/search-for-tag input "SecurityGroups" :flattened? nil :xmlAttribute? nil), "LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "ListenerDescriptions" (portkey.aws/search-for-tag input "ListenerDescriptions" :flattened? nil :xmlAttribute? nil), "SourceSecurityGroup" (portkey.aws/search-for-tag input "SourceSecurityGroup" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "Scheme" (portkey.aws/search-for-tag input "Scheme" :flattened? nil :xmlAttribute? nil), "DNSName" (portkey.aws/search-for-tag input "DNSName" :flattened? nil :xmlAttribute? nil), "CanonicalHostedZoneNameID" (portkey.aws/search-for-tag input "CanonicalHostedZoneNameID" :flattened? nil :xmlAttribute? nil), "Policies" (portkey.aws/search-for-tag input "Policies" :flattened? nil :xmlAttribute? nil), "AvailabilityZones" (portkey.aws/search-for-tag input "AvailabilityZones" :flattened? nil :xmlAttribute? nil), "VPCId" (portkey.aws/search-for-tag input "VPCId" :flattened? nil :xmlAttribute? nil), "Instances" (portkey.aws/search-for-tag input "Instances" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872640 "BackendServerDescriptions") (clojure.core/assoc :backend-server-descriptions (deser-backend-server-descriptions (clojure.core/get-in letvar872640 ["BackendServerDescriptions" :content]))) (letvar872640 "CanonicalHostedZoneName") (clojure.core/assoc :canonical-hosted-zone-name (deser-dns-name (clojure.core/get-in letvar872640 ["CanonicalHostedZoneName" :content]))) (letvar872640 "HealthCheck") (clojure.core/assoc :health-check (deser-health-check (clojure.core/get-in letvar872640 ["HealthCheck" :content]))) (letvar872640 "Subnets") (clojure.core/assoc :subnets (deser-subnets (clojure.core/get-in letvar872640 ["Subnets" :content]))) (letvar872640 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-groups (clojure.core/get-in letvar872640 ["SecurityGroups" :content]))) (letvar872640 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-access-point-name (clojure.core/get-in letvar872640 ["LoadBalancerName" :content]))) (letvar872640 "ListenerDescriptions") (clojure.core/assoc :listener-descriptions (deser-listener-descriptions (clojure.core/get-in letvar872640 ["ListenerDescriptions" :content]))) (letvar872640 "SourceSecurityGroup") (clojure.core/assoc :source-security-group (deser-source-security-group (clojure.core/get-in letvar872640 ["SourceSecurityGroup" :content]))) (letvar872640 "CreatedTime") (clojure.core/assoc :created-time (deser-created-time (clojure.core/get-in letvar872640 ["CreatedTime" :content]))) (letvar872640 "Scheme") (clojure.core/assoc :scheme (deser-load-balancer-scheme (clojure.core/get-in letvar872640 ["Scheme" :content]))) (letvar872640 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar872640 ["DNSName" :content]))) (letvar872640 "CanonicalHostedZoneNameID") (clojure.core/assoc :canonical-hosted-zone-name-id (deser-dns-name (clojure.core/get-in letvar872640 ["CanonicalHostedZoneNameID" :content]))) (letvar872640 "Policies") (clojure.core/assoc :policies (deser-policies (clojure.core/get-in letvar872640 ["Policies" :content]))) (letvar872640 "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (clojure.core/get-in letvar872640 ["AvailabilityZones" :content]))) (letvar872640 "VPCId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar872640 ["VPCId" :content]))) (letvar872640 "Instances") (clojure.core/assoc :instances (deser-instances (clojure.core/get-in letvar872640 ["Instances" :content]))))))

(clojure.core/defn- deser-policy-attribute-type-description [input] (clojure.core/let [letvar872748 {"AttributeName" (portkey.aws/search-for-tag input "AttributeName" :flattened? nil :xmlAttribute? nil), "AttributeType" (portkey.aws/search-for-tag input "AttributeType" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "DefaultValue" (portkey.aws/search-for-tag input "DefaultValue" :flattened? nil :xmlAttribute? nil), "Cardinality" (portkey.aws/search-for-tag input "Cardinality" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872748 "AttributeName") (clojure.core/assoc :attribute-name (deser-attribute-name (clojure.core/get-in letvar872748 ["AttributeName" :content]))) (letvar872748 "AttributeType") (clojure.core/assoc :attribute-type (deser-attribute-type (clojure.core/get-in letvar872748 ["AttributeType" :content]))) (letvar872748 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar872748 ["Description" :content]))) (letvar872748 "DefaultValue") (clojure.core/assoc :default-value (deser-default-value (clojure.core/get-in letvar872748 ["DefaultValue" :content]))) (letvar872748 "Cardinality") (clojure.core/assoc :cardinality (deser-cardinality (clojure.core/get-in letvar872748 ["Cardinality" :content]))))))

(clojure.core/defn- deser-lb-cookie-stickiness-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lb-cookie-stickiness-policy coll))) input))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-attribute-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-subnet-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-instance-states [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-state coll))) input))

(clojure.core/defn- deser-instance-port [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-marker [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-listener-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener-description coll))) input))

(clojure.core/defn- deser-lb-cookie-stickiness-policy [input] (clojure.core/let [letvar872968 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "CookieExpirationPeriod" (portkey.aws/search-for-tag input "CookieExpirationPeriod" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar872968 "PolicyName") (clojure.core/assoc :policy-name (deser-policy-name (clojure.core/get-in letvar872968 ["PolicyName" :content]))) (letvar872968 "CookieExpirationPeriod") (clojure.core/assoc :cookie-expiration-period (deser-cookie-expiration-period (clojure.core/get-in letvar872968 ["CookieExpirationPeriod" :content]))))))

(clojure.core/defn- deser-policy-description [input] (clojure.core/let [letvar873076 {"PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "PolicyTypeName" (portkey.aws/search-for-tag input "PolicyTypeName" :flattened? nil :xmlAttribute? nil), "PolicyAttributeDescriptions" (portkey.aws/search-for-tag input "PolicyAttributeDescriptions" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873076 "PolicyName") (clojure.core/assoc :policy-name (deser-policy-name (clojure.core/get-in letvar873076 ["PolicyName" :content]))) (letvar873076 "PolicyTypeName") (clojure.core/assoc :policy-type-name (deser-policy-type-name (clojure.core/get-in letvar873076 ["PolicyTypeName" :content]))) (letvar873076 "PolicyAttributeDescriptions") (clojure.core/assoc :policy-attribute-descriptions (deser-policy-attribute-descriptions (clojure.core/get-in letvar873076 ["PolicyAttributeDescriptions" :content]))))))

(clojure.core/defn- deser-s-3-bucket-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-name coll))) input))

(clojure.core/defn- deser-source-security-group [input] (clojure.core/let [letvar873206 {"OwnerAlias" (portkey.aws/search-for-tag input "OwnerAlias" :flattened? nil :xmlAttribute? nil), "GroupName" (portkey.aws/search-for-tag input "GroupName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873206 "OwnerAlias") (clojure.core/assoc :owner-alias (deser-security-group-owner-alias (clojure.core/get-in letvar873206 ["OwnerAlias" :content]))) (letvar873206 "GroupName") (clojure.core/assoc :group-name (deser-security-group-name (clojure.core/get-in letvar873206 ["GroupName" :content]))))))

(clojure.core/defn- deser-limit [input] (clojure.core/let [letvar873314 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Max" (portkey.aws/search-for-tag input "Max" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873314 "Name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar873314 ["Name" :content]))) (letvar873314 "Max") (clojure.core/assoc :max (deser-max (clojure.core/get-in letvar873314 ["Max" :content]))))))

(clojure.core/defn- deser-load-balancer-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-description coll))) input))

(clojure.core/defn- deser-listener-description [input] (clojure.core/let [letvar873439 {"Listener" (portkey.aws/search-for-tag input "Listener" :flattened? nil :xmlAttribute? nil), "PolicyNames" (portkey.aws/search-for-tag input "PolicyNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873439 "Listener") (clojure.core/assoc :listener (deser-listener (clojure.core/get-in letvar873439 ["Listener" :content]))) (letvar873439 "PolicyNames") (clojure.core/assoc :policy-names (deser-policy-names (clojure.core/get-in letvar873439 ["PolicyNames" :content]))))))

(clojure.core/defn- deser-availability-zone [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-type-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-type-description coll))) input))

(clojure.core/defn- deser-access-log-interval [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-tag-description [input] (clojure.core/let [letvar873571 {"LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873571 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-access-point-name (clojure.core/get-in letvar873571 ["LoadBalancerName" :content]))) (letvar873571 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar873571 ["Tags" :content]))))))

(clojure.core/defn- deser-created-time [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-idle-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-limits [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-limit coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-access-point-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-attribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-health-check-interval [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-additional-attribute [input] (clojure.core/let [letvar873729 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar873729 "Key") (clojure.core/assoc :key (deser-additional-attribute-key (clojure.core/get-in letvar873729 ["Key" :content]))) (letvar873729 "Value") (clojure.core/assoc :value (deser-additional-attribute-value (clojure.core/get-in letvar873729 ["Value" :content]))))))

(clojure.core/defn- deser-dns-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-scheme [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cross-zone-load-balancing [input] (clojure.core/let [letvar873847 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-cross-zone-load-balancing-enabled (clojure.core/get-in letvar873847 ["Enabled" :content]))})))

(clojure.core/defn- deser-tag-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-description coll))) input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-protocol [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-security-group-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-connection-draining-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-additional-attribute-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-access-log-prefix [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-unhealthy-threshold [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-listener [input] (clojure.core/let [letvar874006 {"Protocol" (portkey.aws/search-for-tag input "Protocol" :flattened? nil :xmlAttribute? nil), "LoadBalancerPort" (portkey.aws/search-for-tag input "LoadBalancerPort" :flattened? nil :xmlAttribute? nil), "InstanceProtocol" (portkey.aws/search-for-tag input "InstanceProtocol" :flattened? nil :xmlAttribute? nil), "InstancePort" (portkey.aws/search-for-tag input "InstancePort" :flattened? nil :xmlAttribute? nil), "SSLCertificateId" (portkey.aws/search-for-tag input "SSLCertificateId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:protocol (deser-protocol (clojure.core/get-in letvar874006 ["Protocol" :content])), :load-balancer-port (deser-access-point-port (clojure.core/get-in letvar874006 ["LoadBalancerPort" :content])), :instance-port (deser-instance-port (clojure.core/get-in letvar874006 ["InstancePort" :content]))} (letvar874006 "InstanceProtocol") (clojure.core/assoc :instance-protocol (deser-protocol (clojure.core/get-in letvar874006 ["InstanceProtocol" :content]))) (letvar874006 "SSLCertificateId") (clojure.core/assoc :ssl-certificate-id (deser-ssl-certificate-id (clojure.core/get-in letvar874006 ["SSLCertificateId" :content]))))))

(clojure.core/defn- deser-connection-draining [input] (clojure.core/let [letvar874114 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Timeout" (portkey.aws/search-for-tag input "Timeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-connection-draining-enabled (clojure.core/get-in letvar874114 ["Enabled" :content]))} (letvar874114 "Timeout") (clojure.core/assoc :timeout (deser-connection-draining-timeout (clojure.core/get-in letvar874114 ["Timeout" :content]))))))

(clojure.core/defn- deser-policies [input] (clojure.core/let [letvar874222 {"AppCookieStickinessPolicies" (portkey.aws/search-for-tag input "AppCookieStickinessPolicies" :flattened? nil :xmlAttribute? nil), "LBCookieStickinessPolicies" (portkey.aws/search-for-tag input "LBCookieStickinessPolicies" :flattened? nil :xmlAttribute? nil), "OtherPolicies" (portkey.aws/search-for-tag input "OtherPolicies" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar874222 "AppCookieStickinessPolicies") (clojure.core/assoc :app-cookie-stickiness-policies (deser-app-cookie-stickiness-policies (clojure.core/get-in letvar874222 ["AppCookieStickinessPolicies" :content]))) (letvar874222 "LBCookieStickinessPolicies") (clojure.core/assoc :lb-cookie-stickiness-policies (deser-lb-cookie-stickiness-policies (clojure.core/get-in letvar874222 ["LBCookieStickinessPolicies" :content]))) (letvar874222 "OtherPolicies") (clojure.core/assoc :other-policies (deser-policy-names (clojure.core/get-in letvar874222 ["OtherPolicies" :content]))))))

(clojure.core/defn- deser-additional-attribute-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-healthy-threshold [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-access-point-port [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-default-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-security-group-owner-alias [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-instance-state [input] (clojure.core/let [letvar874349 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil), "ReasonCode" (portkey.aws/search-for-tag input "ReasonCode" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar874349 "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (clojure.core/get-in letvar874349 ["InstanceId" :content]))) (letvar874349 "State") (clojure.core/assoc :state (deser-state (clojure.core/get-in letvar874349 ["State" :content]))) (letvar874349 "ReasonCode") (clojure.core/assoc :reason-code (deser-reason-code (clojure.core/get-in letvar874349 ["ReasonCode" :content]))) (letvar874349 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar874349 ["Description" :content]))))))

(clojure.core/defn- deser-security-group-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-state [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar874467 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar874467 ["Key" :content]))} (letvar874467 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar874467 ["Value" :content]))))))

(clojure.core/defn- deser-reason-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-cookie-expiration-period [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-health-check-target [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-instance [input] (clojure.core/let [letvar874587 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar874587 "InstanceId") (clojure.core/assoc :instance-id (deser-instance-id (clojure.core/get-in letvar874587 ["InstanceId" :content]))))))

(clojure.core/defn- deser-ssl-certificate-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-description coll))) input))

(clojure.core/defn- deser-app-cookie-stickiness-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-app-cookie-stickiness-policy coll))) input))

(clojure.core/defn- deser-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-attribute-type-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-attribute-type-description coll))) input))

(clojure.core/defn- deser-cookie-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-connection-draining-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-availability-zone coll))) input))

(clojure.core/defn- deser-policy-attribute-description [input] (clojure.core/let [letvar874780 {"AttributeName" (portkey.aws/search-for-tag input "AttributeName" :flattened? nil :xmlAttribute? nil), "AttributeValue" (portkey.aws/search-for-tag input "AttributeValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar874780 "AttributeName") (clojure.core/assoc :attribute-name (deser-attribute-name (clojure.core/get-in letvar874780 ["AttributeName" :content]))) (letvar874780 "AttributeValue") (clojure.core/assoc :attribute-value (deser-attribute-value (clojure.core/get-in letvar874780 ["AttributeValue" :content]))))))

(clojure.core/defn- deser-vpc-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-attribute-descriptions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-attribute-description coll))) input))

(clojure.core/defn- deser-connection-settings [input] (clojure.core/let [letvar874910 {"IdleTimeout" (portkey.aws/search-for-tag input "IdleTimeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:idle-timeout (deser-idle-timeout (clojure.core/get-in letvar874910 ["IdleTimeout" :content]))})))

(clojure.core/defn- deser-access-log-enabled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-access-log [input] (clojure.core/let [letvar875037 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "S3BucketName" (portkey.aws/search-for-tag input "S3BucketName" :flattened? nil :xmlAttribute? nil), "EmitInterval" (portkey.aws/search-for-tag input "EmitInterval" :flattened? nil :xmlAttribute? nil), "S3BucketPrefix" (portkey.aws/search-for-tag input "S3BucketPrefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deser-access-log-enabled (clojure.core/get-in letvar875037 ["Enabled" :content]))} (letvar875037 "S3BucketName") (clojure.core/assoc :s-3-bucket-name (deser-s-3-bucket-name (clojure.core/get-in letvar875037 ["S3BucketName" :content]))) (letvar875037 "EmitInterval") (clojure.core/assoc :emit-interval (deser-access-log-interval (clojure.core/get-in letvar875037 ["EmitInterval" :content]))) (letvar875037 "S3BucketPrefix") (clojure.core/assoc :s-3-bucket-prefix (deser-access-log-prefix (clojure.core/get-in letvar875037 ["S3BucketPrefix" :content]))))))

(clojure.core/defn- deser-backend-server-description [input] (clojure.core/let [letvar875145 {"InstancePort" (portkey.aws/search-for-tag input "InstancePort" :flattened? nil :xmlAttribute? nil), "PolicyNames" (portkey.aws/search-for-tag input "PolicyNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar875145 "InstancePort") (clojure.core/assoc :instance-port (deser-instance-port (clojure.core/get-in letvar875145 ["InstancePort" :content]))) (letvar875145 "PolicyNames") (clojure.core/assoc :policy-names (deser-policy-names (clojure.core/get-in letvar875145 ["PolicyNames" :content]))))))

(clojure.core/defn- response-describe-access-points-output ([input] (response-describe-access-points-output nil input)) ([resultWrapper875147 input] (clojure.core/let [rawinput875146 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875148 {"LoadBalancerDescriptions" (portkey.aws/search-for-tag rawinput875146 "LoadBalancerDescriptions" :flattened? nil :result-wrapper resultWrapper875147), "NextMarker" (portkey.aws/search-for-tag rawinput875146 "NextMarker" :flattened? nil :result-wrapper resultWrapper875147)}] (clojure.core/cond-> {} (letvar875148 "LoadBalancerDescriptions") (clojure.core/assoc :load-balancer-descriptions (deser-load-balancer-descriptions (clojure.core/get-in letvar875148 ["LoadBalancerDescriptions" :content]))) (letvar875148 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar875148 ["NextMarker" :content])))))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper875150 input] (clojure.core/let [rawinput875149 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875151 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-load-balancer-listener-output ([input] (response-delete-load-balancer-listener-output nil input)) ([resultWrapper875153 input] (clojure.core/let [rawinput875152 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875154 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-account-limits-output ([input] (response-describe-account-limits-output nil input)) ([resultWrapper875156 input] (clojure.core/let [rawinput875155 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875157 {"Limits" (portkey.aws/search-for-tag rawinput875155 "Limits" :flattened? nil :result-wrapper resultWrapper875156), "NextMarker" (portkey.aws/search-for-tag rawinput875155 "NextMarker" :flattened? nil :result-wrapper resultWrapper875156)}] (clojure.core/cond-> {} (letvar875157 "Limits") (clojure.core/assoc :limits (deser-limits (clojure.core/get-in letvar875157 ["Limits" :content]))) (letvar875157 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar875157 ["NextMarker" :content])))))))

(clojure.core/defn- response-set-load-balancer-policies-for-backend-server-output ([input] (response-set-load-balancer-policies-for-backend-server-output nil input)) ([resultWrapper875159 input] (clojure.core/let [rawinput875158 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875160 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-protocol-exception ([input] (response-unsupported-protocol-exception nil input)) ([resultWrapper875162 input] (clojure.core/let [rawinput875161 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875163 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-access-point-output ([input] (response-create-access-point-output nil input)) ([resultWrapper875165 input] (clojure.core/let [rawinput875164 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875166 {"DNSName" (portkey.aws/search-for-tag rawinput875164 "DNSName" :flattened? nil :result-wrapper resultWrapper875165)}] (clojure.core/cond-> {} (letvar875166 "DNSName") (clojure.core/assoc :dns-name (deser-dns-name (clojure.core/get-in letvar875166 ["DNSName" :content])))))))

(clojure.core/defn- response-create-lb-cookie-stickiness-policy-output ([input] (response-create-lb-cookie-stickiness-policy-output nil input)) ([resultWrapper875168 input] (clojure.core/let [rawinput875167 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875169 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-load-balancer-listener-output ([input] (response-create-load-balancer-listener-output nil input)) ([resultWrapper875171 input] (clojure.core/let [rawinput875170 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875172 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-subnet-exception ([input] (response-invalid-subnet-exception nil input)) ([resultWrapper875174 input] (clojure.core/let [rawinput875173 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875175 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-register-end-points-output ([input] (response-register-end-points-output nil input)) ([resultWrapper875177 input] (clojure.core/let [rawinput875176 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875178 {"Instances" (portkey.aws/search-for-tag rawinput875176 "Instances" :flattened? nil :result-wrapper resultWrapper875177)}] (clojure.core/cond-> {} (letvar875178 "Instances") (clojure.core/assoc :instances (deser-instances (clojure.core/get-in letvar875178 ["Instances" :content])))))))

(clojure.core/defn- response-detach-load-balancer-from-subnets-output ([input] (response-detach-load-balancer-from-subnets-output nil input)) ([resultWrapper875180 input] (clojure.core/let [rawinput875179 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875181 {"Subnets" (portkey.aws/search-for-tag rawinput875179 "Subnets" :flattened? nil :result-wrapper resultWrapper875180)}] (clojure.core/cond-> {} (letvar875181 "Subnets") (clojure.core/assoc :subnets (deser-subnets (clojure.core/get-in letvar875181 ["Subnets" :content])))))))

(clojure.core/defn- response-delete-access-point-output ([input] (response-delete-access-point-output nil input)) ([resultWrapper875183 input] (clojure.core/let [rawinput875182 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875184 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-tags-output ([input] (response-add-tags-output nil input)) ([resultWrapper875186 input] (clojure.core/let [rawinput875185 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875187 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-duplicate-listener-exception ([input] (response-duplicate-listener-exception nil input)) ([resultWrapper875189 input] (clojure.core/let [rawinput875188 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875190 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-tags-output ([input] (response-remove-tags-output nil input)) ([resultWrapper875192 input] (clojure.core/let [rawinput875191 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875193 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-load-balancer-attribute-not-found-exception ([input] (response-load-balancer-attribute-not-found-exception nil input)) ([resultWrapper875195 input] (clojure.core/let [rawinput875194 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875196 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-access-points-exception ([input] (response-too-many-access-points-exception nil input)) ([resultWrapper875198 input] (clojure.core/let [rawinput875197 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875199 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-end-point-exception ([input] (response-invalid-end-point-exception nil input)) ([resultWrapper875201 input] (clojure.core/let [rawinput875200 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875202 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-load-balancer-policy-output ([input] (response-create-load-balancer-policy-output nil input)) ([resultWrapper875204 input] (clojure.core/let [rawinput875203 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875205 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-duplicate-access-point-name-exception ([input] (response-duplicate-access-point-name-exception nil input)) ([resultWrapper875207 input] (clojure.core/let [rawinput875206 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875208 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-apply-security-groups-to-load-balancer-output ([input] (response-apply-security-groups-to-load-balancer-output nil input)) ([resultWrapper875210 input] (clojure.core/let [rawinput875209 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875211 {"SecurityGroups" (portkey.aws/search-for-tag rawinput875209 "SecurityGroups" :flattened? nil :result-wrapper resultWrapper875210)}] (clojure.core/cond-> {} (letvar875211 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-groups (clojure.core/get-in letvar875211 ["SecurityGroups" :content])))))))

(clojure.core/defn- response-duplicate-tag-keys-exception ([input] (response-duplicate-tag-keys-exception nil input)) ([resultWrapper875213 input] (clojure.core/let [rawinput875212 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875214 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-add-availability-zones-output ([input] (response-add-availability-zones-output nil input)) ([resultWrapper875216 input] (clojure.core/let [rawinput875215 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875217 {"AvailabilityZones" (portkey.aws/search-for-tag rawinput875215 "AvailabilityZones" :flattened? nil :result-wrapper resultWrapper875216)}] (clojure.core/cond-> {} (letvar875217 "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (clojure.core/get-in letvar875217 ["AvailabilityZones" :content])))))))

(clojure.core/defn- response-duplicate-policy-name-exception ([input] (response-duplicate-policy-name-exception nil input)) ([resultWrapper875219 input] (clojure.core/let [rawinput875218 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875220 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-availability-zones-output ([input] (response-remove-availability-zones-output nil input)) ([resultWrapper875222 input] (clojure.core/let [rawinput875221 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875223 {"AvailabilityZones" (portkey.aws/search-for-tag rawinput875221 "AvailabilityZones" :flattened? nil :result-wrapper resultWrapper875222)}] (clojure.core/cond-> {} (letvar875223 "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-availability-zones (clojure.core/get-in letvar875223 ["AvailabilityZones" :content])))))))

(clojure.core/defn- response-invalid-scheme-exception ([input] (response-invalid-scheme-exception nil input)) ([resultWrapper875225 input] (clojure.core/let [rawinput875224 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875226 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-policy-not-found-exception ([input] (response-policy-not-found-exception nil input)) ([resultWrapper875228 input] (clojure.core/let [rawinput875227 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875229 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-configuration-request-exception ([input] (response-invalid-configuration-request-exception nil input)) ([resultWrapper875231 input] (clojure.core/let [rawinput875230 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875232 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-access-point-not-found-exception ([input] (response-access-point-not-found-exception nil input)) ([resultWrapper875234 input] (clojure.core/let [rawinput875233 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875235 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper875237 input] (clojure.core/let [rawinput875236 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875238 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deregister-end-points-output ([input] (response-deregister-end-points-output nil input)) ([resultWrapper875240 input] (clojure.core/let [rawinput875239 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875241 {"Instances" (portkey.aws/search-for-tag rawinput875239 "Instances" :flattened? nil :result-wrapper resultWrapper875240)}] (clojure.core/cond-> {} (letvar875241 "Instances") (clojure.core/assoc :instances (deser-instances (clojure.core/get-in letvar875241 ["Instances" :content])))))))

(clojure.core/defn- response-certificate-not-found-exception ([input] (response-certificate-not-found-exception nil input)) ([resultWrapper875243 input] (clojure.core/let [rawinput875242 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875244 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-policy-type-not-found-exception ([input] (response-policy-type-not-found-exception nil input)) ([resultWrapper875246 input] (clojure.core/let [rawinput875245 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875247 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-tags-output ([input] (response-describe-tags-output nil input)) ([resultWrapper875249 input] (clojure.core/let [rawinput875248 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875250 {"TagDescriptions" (portkey.aws/search-for-tag rawinput875248 "TagDescriptions" :flattened? nil :result-wrapper resultWrapper875249)}] (clojure.core/cond-> {} (letvar875250 "TagDescriptions") (clojure.core/assoc :tag-descriptions (deser-tag-descriptions (clojure.core/get-in letvar875250 ["TagDescriptions" :content])))))))

(clojure.core/defn- response-too-many-policies-exception ([input] (response-too-many-policies-exception nil input)) ([resultWrapper875252 input] (clojure.core/let [rawinput875251 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875253 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-set-load-balancer-policies-of-listener-output ([input] (response-set-load-balancer-policies-of-listener-output nil input)) ([resultWrapper875255 input] (clojure.core/let [rawinput875254 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875256 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-subnet-not-found-exception ([input] (response-subnet-not-found-exception nil input)) ([resultWrapper875258 input] (clojure.core/let [rawinput875257 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875259 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-load-balancer-policies-output ([input] (response-describe-load-balancer-policies-output nil input)) ([resultWrapper875261 input] (clojure.core/let [rawinput875260 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875262 {"PolicyDescriptions" (portkey.aws/search-for-tag rawinput875260 "PolicyDescriptions" :flattened? nil :result-wrapper resultWrapper875261)}] (clojure.core/cond-> {} (letvar875262 "PolicyDescriptions") (clojure.core/assoc :policy-descriptions (deser-policy-descriptions (clojure.core/get-in letvar875262 ["PolicyDescriptions" :content])))))))

(clojure.core/defn- response-dependency-throttle-exception ([input] (response-dependency-throttle-exception nil input)) ([resultWrapper875264 input] (clojure.core/let [rawinput875263 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875265 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-load-balancer-policy-types-output ([input] (response-describe-load-balancer-policy-types-output nil input)) ([resultWrapper875267 input] (clojure.core/let [rawinput875266 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875268 {"PolicyTypeDescriptions" (portkey.aws/search-for-tag rawinput875266 "PolicyTypeDescriptions" :flattened? nil :result-wrapper resultWrapper875267)}] (clojure.core/cond-> {} (letvar875268 "PolicyTypeDescriptions") (clojure.core/assoc :policy-type-descriptions (deser-policy-type-descriptions (clojure.core/get-in letvar875268 ["PolicyTypeDescriptions" :content])))))))

(clojure.core/defn- response-describe-end-point-state-output ([input] (response-describe-end-point-state-output nil input)) ([resultWrapper875270 input] (clojure.core/let [rawinput875269 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875271 {"InstanceStates" (portkey.aws/search-for-tag rawinput875269 "InstanceStates" :flattened? nil :result-wrapper resultWrapper875270)}] (clojure.core/cond-> {} (letvar875271 "InstanceStates") (clojure.core/assoc :instance-states (deser-instance-states (clojure.core/get-in letvar875271 ["InstanceStates" :content])))))))

(clojure.core/defn- response-set-load-balancer-listener-ssl-certificate-output ([input] (response-set-load-balancer-listener-ssl-certificate-output nil input)) ([resultWrapper875273 input] (clojure.core/let [rawinput875272 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875274 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-attach-load-balancer-to-subnets-output ([input] (response-attach-load-balancer-to-subnets-output nil input)) ([resultWrapper875276 input] (clojure.core/let [rawinput875275 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875277 {"Subnets" (portkey.aws/search-for-tag rawinput875275 "Subnets" :flattened? nil :result-wrapper resultWrapper875276)}] (clojure.core/cond-> {} (letvar875277 "Subnets") (clojure.core/assoc :subnets (deser-subnets (clojure.core/get-in letvar875277 ["Subnets" :content])))))))

(clojure.core/defn- response-create-app-cookie-stickiness-policy-output ([input] (response-create-app-cookie-stickiness-policy-output nil input)) ([resultWrapper875279 input] (clojure.core/let [rawinput875278 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875280 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-listener-not-found-exception ([input] (response-listener-not-found-exception nil input)) ([resultWrapper875282 input] (clojure.core/let [rawinput875281 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875283 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-load-balancer-policy-output ([input] (response-delete-load-balancer-policy-output nil input)) ([resultWrapper875285 input] (clojure.core/let [rawinput875284 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875286 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-modify-load-balancer-attributes-output ([input] (response-modify-load-balancer-attributes-output nil input)) ([resultWrapper875288 input] (clojure.core/let [rawinput875287 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875289 {"LoadBalancerName" (portkey.aws/search-for-tag rawinput875287 "LoadBalancerName" :flattened? nil :result-wrapper resultWrapper875288), "LoadBalancerAttributes" (portkey.aws/search-for-tag rawinput875287 "LoadBalancerAttributes" :flattened? nil :result-wrapper resultWrapper875288)}] (clojure.core/cond-> {} (letvar875289 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-access-point-name (clojure.core/get-in letvar875289 ["LoadBalancerName" :content]))) (letvar875289 "LoadBalancerAttributes") (clojure.core/assoc :load-balancer-attributes (deser-load-balancer-attributes (clojure.core/get-in letvar875289 ["LoadBalancerAttributes" :content])))))))

(clojure.core/defn- response-describe-load-balancer-attributes-output ([input] (response-describe-load-balancer-attributes-output nil input)) ([resultWrapper875291 input] (clojure.core/let [rawinput875290 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875292 {"LoadBalancerAttributes" (portkey.aws/search-for-tag rawinput875290 "LoadBalancerAttributes" :flattened? nil :result-wrapper resultWrapper875291)}] (clojure.core/cond-> {} (letvar875292 "LoadBalancerAttributes") (clojure.core/assoc :load-balancer-attributes (deser-load-balancer-attributes (clojure.core/get-in letvar875292 ["LoadBalancerAttributes" :content])))))))

(clojure.core/defn- response-invalid-security-group-exception ([input] (response-invalid-security-group-exception nil input)) ([resultWrapper875294 input] (clojure.core/let [rawinput875293 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875295 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-configure-health-check-output ([input] (response-configure-health-check-output nil input)) ([resultWrapper875297 input] (clojure.core/let [rawinput875296 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar875298 {"HealthCheck" (portkey.aws/search-for-tag rawinput875296 "HealthCheck" :flattened? nil :result-wrapper resultWrapper875297)}] (clojure.core/cond-> {} (letvar875298 "HealthCheck") (clojure.core/assoc :health-check (deser-health-check (clojure.core/get-in letvar875298 ["HealthCheck" :content])))))))

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

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/protocol (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-names :portkey.aws.elasticloadbalancing.-2012-06-01.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/connection-draining-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.elasticloadbalancing.-2012-06-01/additional-attribute-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9.]+$" s__21078__auto__))))

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

(clojure.core/defn remove-tags "Removes one or more tags from the specified load balancer." ([remove-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RemoveTagsResult", :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn response-remove-tags-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/remove-tags-output))

(clojure.core/defn apply-security-groups-to-load-balancer "Associates one or more security groups with your load balancer in a virtual\nprivate cloud (VPC). The specified security groups override the previously\nassociated security groups.\n For more information, see Security Groups for Load Balancers in a VPC\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-security-groups.html#elb-vpc-security-groups)\nin the Classic Load Balancers Guide." ([apply-security-groups-to-load-balancer-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-apply-security-groups-to-load-balancer-input apply-security-groups-to-load-balancer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ApplySecurityGroupsToLoadBalancerResult", :http.request.configuration/action "ApplySecurityGroupsToLoadBalancer", :http.request.configuration/output-deser-fn response-apply-security-groups-to-load-balancer-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef apply-security-groups-to-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/apply-security-groups-to-load-balancer-output))

(clojure.core/defn describe-account-limits "Describes the current Elastic Load Balancing resource limits for your AWS\naccount.\n For more information, see Limits for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html)\nin the Classic Load Balancers Guide." ([] (describe-account-limits {})) ([describe-account-limits-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-account-limits-input describe-account-limits-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-account-limits :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-account-limits-output))

(clojure.core/defn describe-load-balancer-policies "Describes the specified policies.\n If you specify a load balancer name, the action returns the descriptions of all\npolicies created for the load balancer. If you specify a policy name associated\nwith your load balancer, the action returns the description of that policy. If\nyou don't specify a load balancer name, the action returns descriptions of the\nspecified sample policies, or descriptions of all sample policies. The names of\nthe sample policies have the ELBSample- prefix." ([] (describe-load-balancer-policies {})) ([describe-load-balancer-policies-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancer-policies-input describe-load-balancer-policies-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerPoliciesResult", :http.request.configuration/action "DescribeLoadBalancerPolicies", :http.request.configuration/output-deser-fn response-describe-load-balancer-policies-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-policies :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policies-output))

(clojure.core/defn set-load-balancer-policies-of-listener "Replaces the current set of policies for the specified load balancer port with\nthe specified set of policies.\n To enable back-end server authentication, use\nSetLoadBalancerPoliciesForBackendServer.\n For more information about setting policies, see Update the SSL Negotiation\nConfiguration\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/ssl-config-update.html),\nDuration-Based Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration),\nand Application-Controlled Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application)\nin the Classic Load Balancers Guide." ([set-load-balancer-policies-of-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-load-balancer-policies-of-listener-input set-load-balancer-policies-of-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetLoadBalancerPoliciesOfListenerResult", :http.request.configuration/action "SetLoadBalancerPoliciesOfListener", :http.request.configuration/output-deser-fn response-set-load-balancer-policies-of-listener-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-policies-of-listener :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-of-listener-output))

(clojure.core/defn disable-availability-zones-for-load-balancer "Removes the specified Availability Zones from the set of Availability Zones for\nthe specified load balancer in EC2-Classic or a default VPC.\n For load balancers in a non-default VPC, use DetachLoadBalancerFromSubnets.\n There must be at least one Availability Zone registered with a load balancer at\nall times. After an Availability Zone is removed, all instances registered with\nthe load balancer that are in the removed Availability Zone go into the\nOutOfService state. Then, the load balancer attempts to equally balance the\ntraffic among its remaining Availability Zones.\n For more information, see Add or Remove Availability Zones\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html)\nin the Classic Load Balancers Guide." ([remove-availability-zones-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-availability-zones-input remove-availability-zones-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DisableAvailabilityZonesForLoadBalancerResult", :http.request.configuration/action "DisableAvailabilityZonesForLoadBalancer", :http.request.configuration/output-deser-fn response-remove-availability-zones-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef disable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/remove-availability-zones-output))

(clojure.core/defn delete-load-balancer "Deletes the specified load balancer.\n If you are attempting to recreate a load balancer, you must reconfigure all\nsettings. The DNS name associated with a deleted load balancer are no longer\nusable. The name and associated DNS record of the deleted load balancer no\nlonger exist and traffic sent to any of its IP addresses is no longer delivered\nto your instances.\n If the load balancer does not exist or has already been deleted, the call to\nDeleteLoadBalancer still succeeds." ([delete-access-point-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-access-point-input delete-access-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLoadBalancerResult", :http.request.configuration/action "DeleteLoadBalancer", :http.request.configuration/output-deser-fn response-delete-access-point-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-access-point-output))

(clojure.core/defn create-lb-cookie-stickiness-policy "Generates a stickiness policy with sticky session lifetimes controlled by the\nlifetime of the browser (user-agent) or a specified expiration period. This\npolicy can be associated only with HTTP/HTTPS listeners.\n When a load balancer implements this policy, the load balancer uses a special\ncookie to track the instance for each request. When the load balancer receives a\nrequest, it first checks to see if this cookie is present in the request. If so,\nthe load balancer sends the request to the application server specified in the\ncookie. If not, the load balancer sends the request to a server that is chosen\nbased on the existing load-balancing algorithm.\n A cookie is inserted into the response for binding subsequent requests from the\nsame user to that server. The validity of the cookie is based on the cookie\nexpiration time, which is specified in the policy configuration.\n For more information, see Duration-Based Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-duration)\nin the Classic Load Balancers Guide." ([create-lb-cookie-stickiness-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-lb-cookie-stickiness-policy-input create-lb-cookie-stickiness-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLBCookieStickinessPolicyResult", :http.request.configuration/action "CreateLBCookieStickinessPolicy", :http.request.configuration/output-deser-fn response-create-lb-cookie-stickiness-policy-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-lb-cookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-lb-cookie-stickiness-policy-output))

(clojure.core/defn describe-instance-health "Describes the state of the specified instances with respect to the specified\nload balancer. If no instances are specified, the call describes the state of\nall instances that are currently registered with the load balancer. If instances\nare specified, their state is returned even if they are no longer registered\nwith the load balancer. The state of terminated instances is not returned." ([describe-end-point-state-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-end-point-state-input describe-end-point-state-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeInstanceHealthResult", :http.request.configuration/action "DescribeInstanceHealth", :http.request.configuration/output-deser-fn response-describe-end-point-state-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef describe-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-end-point-state-output))

(clojure.core/defn modify-load-balancer-attributes "Modifies the attributes of the specified load balancer.\n You can modify the load balancer attributes, such as AccessLogs,\nConnectionDraining, and CrossZoneLoadBalancing by either enabling or disabling\nthem. Or, you can modify the load balancer attribute ConnectionSettings by\nspecifying an idle connection timeout value for your load balancer.\n For more information, see the following in the Classic Load Balancers Guide:\n * Cross-Zone Load Balancing\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)\n * Connection Draining\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)\n * Access Logs\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/access-log-collection.html)\n * Idle Connection Timeout\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)" ([modify-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-modify-load-balancer-attributes-input modify-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ModifyLoadBalancerAttributesResult", :http.request.configuration/action "ModifyLoadBalancerAttributes", :http.request.configuration/output-deser-fn response-modify-load-balancer-attributes-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attribute-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef modify-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/modify-load-balancer-attributes-output))

(clojure.core/defn create-load-balancer "Creates a Classic Load Balancer.\n You can add listeners, security groups, subnets, and tags when you create your\nload balancer, or you can add them later using CreateLoadBalancerListeners,\nApplySecurityGroupsToLoadBalancer, AttachLoadBalancerToSubnets, and AddTags.\n To describe your current load balancers, see DescribeLoadBalancers. When you\nare finished with a load balancer, you can delete it using DeleteLoadBalancer.\n You can create up to 20 load balancers per region per account. You can request\nan increase for the number of load balancers for your account. For more\ninformation, see Limits for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-limits.html)\nin the Classic Load Balancers Guide." ([create-access-point-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-access-point-input create-access-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLoadBalancerResult", :http.request.configuration/action "CreateLoadBalancer", :http.request.configuration/output-deser-fn response-create-access-point-output, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.elasticloadbalancing.-2012-06-01/operation-not-permitted-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-subnet-exception, "TooManyAccessPointsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-access-points-exception, "DuplicateAccessPointNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-access-point-name-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-tag-keys-exception, "InvalidSchemeException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-scheme-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-tags-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-not-found-exception, "InvalidSecurityGroupException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-security-group-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-access-point-output))

(clojure.core/defn describe-tags "Describes the tags associated with the specified load balancers." ([describe-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tags-input describe-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTagsResult", :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-describe-tags-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-tags-output))

(clojure.core/defn describe-load-balancer-policy-types "Describes the specified load balancer policy types or all load balancer policy\ntypes.\n The description of each type indicates how it can be used. For example, some\npolicies can be used only with layer 7 listeners, some policies can be used only\nwith layer 4 listeners, and some policies can be used only with your EC2\ninstances.\n You can use CreateLoadBalancerPolicy to create a policy configuration for any\nof these policy types. Then, depending on the policy type, use either\nSetLoadBalancerPoliciesOfListener or SetLoadBalancerPoliciesForBackendServer to\nset the policy." ([] (describe-load-balancer-policy-types {})) ([describe-load-balancer-policy-types-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancer-policy-types-input describe-load-balancer-policy-types-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerPolicyTypesResult", :http.request.configuration/action "DescribeLoadBalancerPolicyTypes", :http.request.configuration/output-deser-fn response-describe-load-balancer-policy-types-output, :http.request.spec/error-spec {"PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-policy-types :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-policy-types-output))

(clojure.core/defn attach-load-balancer-to-subnets "Adds one or more subnets to the set of configured subnets for the specified load\nbalancer.\n The load balancer evenly distributes requests across all registered subnets.\nFor more information, see Add or Remove Subnets for Your Load Balancer in a VPC\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-manage-subnets.html)\nin the Classic Load Balancers Guide." ([attach-load-balancer-to-subnets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-attach-load-balancer-to-subnets-input attach-load-balancer-to-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AttachLoadBalancerToSubnetsResult", :http.request.configuration/action "AttachLoadBalancerToSubnets", :http.request.configuration/output-deser-fn response-attach-load-balancer-to-subnets-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "SubnetNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/subnet-not-found-exception, "InvalidSubnetException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-subnet-exception}})))))
(clojure.spec.alpha/fdef attach-load-balancer-to-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/attach-load-balancer-to-subnets-output))

(clojure.core/defn enable-availability-zones-for-load-balancer "Adds the specified Availability Zones to the set of Availability Zones for the\nspecified load balancer in EC2-Classic or a default VPC.\n For load balancers in a non-default VPC, use AttachLoadBalancerToSubnets.\n The load balancer evenly distributes requests across all its registered\nAvailability Zones that contain instances. For more information, see Add or\nRemove Availability Zones\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-az.html)\nin the Classic Load Balancers Guide." ([add-availability-zones-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-availability-zones-input add-availability-zones-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "EnableAvailabilityZonesForLoadBalancerResult", :http.request.configuration/action "EnableAvailabilityZonesForLoadBalancer", :http.request.configuration/output-deser-fn response-add-availability-zones-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef enable-availability-zones-for-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/add-availability-zones-output))

(clojure.core/defn set-load-balancer-policies-for-backend-server "Replaces the set of policies associated with the specified port on which the EC2\ninstance is listening with a new set of policies. At this time, only the\nback-end server authentication policy type can be applied to the instance ports;\nthis policy type is composed of multiple public key policies.\n Each time you use SetLoadBalancerPoliciesForBackendServer to enable the\npolicies, use the PolicyNames parameter to list the policies that you want to\nenable.\n You can use DescribeLoadBalancers or DescribeLoadBalancerPolicies to verify\nthat the policy is associated with the EC2 instance.\n For more information about enabling back-end instance authentication, see\nConfigure Back-end Instance Authentication\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-create-https-ssl-load-balancer.html#configure_backendauth_clt)\nin the Classic Load Balancers Guide. For more information about Proxy Protocol,\nsee Configure Proxy Protocol Support\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-proxy-protocol.html)\nin the Classic Load Balancers Guide." ([set-load-balancer-policies-for-backend-server-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-load-balancer-policies-for-backend-server-input set-load-balancer-policies-for-backend-server-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetLoadBalancerPoliciesForBackendServerResult", :http.request.configuration/action "SetLoadBalancerPoliciesForBackendServer", :http.request.configuration/output-deser-fn response-set-load-balancer-policies-for-backend-server-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-policies-for-backend-server :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-policies-for-backend-server-output))

(clojure.core/defn create-load-balancer-policy "Creates a policy with the specified attributes for the specified load balancer.\n Policies are settings that are saved for your load balancer and that can be\napplied to the listener or the application server, depending on the policy type." ([create-load-balancer-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-load-balancer-policy-input create-load-balancer-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLoadBalancerPolicyResult", :http.request.configuration/action "CreateLoadBalancerPolicy", :http.request.configuration/output-deser-fn response-create-load-balancer-policy-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "PolicyTypeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/policy-type-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-policy-output))

(clojure.core/defn delete-load-balancer-listeners "Deletes the specified listeners from the specified load balancer." ([delete-load-balancer-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-load-balancer-listener-input delete-load-balancer-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLoadBalancerListenersResult", :http.request.configuration/action "DeleteLoadBalancerListeners", :http.request.configuration/output-deser-fn response-delete-load-balancer-listener-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-listener-output))

(clojure.core/defn deregister-instances-from-load-balancer "Deregisters the specified instances from the specified load balancer. After the\ninstance is deregistered, it no longer receives traffic from the load balancer.\n You can use DescribeLoadBalancers to verify that the instance is deregistered\nfrom the load balancer.\n For more information, see Register or De-Register EC2 Instances\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html)\nin the Classic Load Balancers Guide." ([deregister-end-points-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-deregister-end-points-input deregister-end-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeregisterInstancesFromLoadBalancerResult", :http.request.configuration/action "DeregisterInstancesFromLoadBalancer", :http.request.configuration/output-deser-fn response-deregister-end-points-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef deregister-instances-from-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/deregister-end-points-output))

(clojure.core/defn detach-load-balancer-from-subnets "Removes the specified subnets from the set of configured subnets for the load\nbalancer.\n After a subnet is removed, all EC2 instances registered with the load balancer\nin the removed subnet go into the OutOfService state. Then, the load balancer\nbalances the traffic among the remaining routable subnets." ([detach-load-balancer-from-subnets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-detach-load-balancer-from-subnets-input detach-load-balancer-from-subnets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachLoadBalancerFromSubnetsResult", :http.request.configuration/action "DetachLoadBalancerFromSubnets", :http.request.configuration/output-deser-fn response-detach-load-balancer-from-subnets-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef detach-load-balancer-from-subnets :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/detach-load-balancer-from-subnets-output))

(clojure.core/defn register-instances-with-load-balancer "Adds the specified instances to the specified load balancer.\n The instance must be a running instance in the same network as the load\nbalancer (EC2-Classic or the same VPC). If you have EC2-Classic instances and a\nload balancer in a VPC with ClassicLink enabled, you can link the EC2-Classic\ninstances to that VPC and then register the linked EC2-Classic instances with\nthe load balancer in the VPC.\n Note that RegisterInstanceWithLoadBalancer completes when the request has been\nregistered. Instance registration takes a little time to complete. To check the\nstate of the registered instances, use DescribeLoadBalancers or\nDescribeInstanceHealth.\n After the instance is registered, it starts receiving traffic and requests from\nthe load balancer. Any instance that is not in one of the Availability Zones\nregistered for the load balancer is moved to the OutOfService state. If an\nAvailability Zone is added to the load balancer later, any instances registered\nwith the load balancer move to the InService state.\n To deregister instances from a load balancer, use\nDeregisterInstancesFromLoadBalancer.\n For more information, see Register or De-Register EC2 Instances\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-deregister-register-instances.html)\nin the Classic Load Balancers Guide." ([register-end-points-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-end-points-input register-end-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RegisterInstancesWithLoadBalancerResult", :http.request.configuration/action "RegisterInstancesWithLoadBalancer", :http.request.configuration/output-deser-fn response-register-end-points-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidEndPointException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-end-point-exception}})))))
(clojure.spec.alpha/fdef register-instances-with-load-balancer :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/register-end-points-output))

(clojure.core/defn create-app-cookie-stickiness-policy "Generates a stickiness policy with sticky session lifetimes that follow that of\nan application-generated cookie. This policy can be associated only with\nHTTP/HTTPS listeners.\n This policy is similar to the policy created by CreateLBCookieStickinessPolicy,\nexcept that the lifetime of the special Elastic Load Balancing cookie, AWSELB,\nfollows the lifetime of the application-generated cookie specified in the policy\nconfiguration. The load balancer only inserts a new stickiness cookie when the\napplication response includes a new application cookie.\n If the application cookie is explicitly removed or expires, the session stops\nbeing sticky until a new application cookie is issued.\n For more information, see Application-Controlled Session Stickiness\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-sticky-sessions.html#enable-sticky-sessions-application)\nin the Classic Load Balancers Guide." ([create-app-cookie-stickiness-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-app-cookie-stickiness-policy-input create-app-cookie-stickiness-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateAppCookieStickinessPolicyResult", :http.request.configuration/action "CreateAppCookieStickinessPolicy", :http.request.configuration/output-deser-fn response-create-app-cookie-stickiness-policy-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicatePolicyNameException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-policy-name-exception, "TooManyPoliciesException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-policies-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef create-app-cookie-stickiness-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-app-cookie-stickiness-policy-output))

(clojure.core/defn create-load-balancer-listeners "Creates one or more listeners for the specified load balancer. If a listener\nwith the specified port does not already exist, it is created; otherwise, the\nproperties of the new listener must match the properties of the existing\nlistener.\n For more information, see Listeners for Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-listener-config.html)\nin the Classic Load Balancers Guide." ([create-load-balancer-listener-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-load-balancer-listener-input create-load-balancer-listener-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateLoadBalancerListenersResult", :http.request.configuration/action "CreateLoadBalancerListeners", :http.request.configuration/output-deser-fn response-create-load-balancer-listener-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DuplicateListenerException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-listener-exception, "CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef create-load-balancer-listeners :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/create-load-balancer-listener-output))

(clojure.core/defn add-tags "Adds the specified tags to the specified load balancer. Each load balancer can\nhave a maximum of 10 tags.\n Each tag consists of a key and an optional value. If a tag with the same key is\nalready associated with the load balancer, AddTags updates its value.\n For more information, see Tag Your Classic Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/add-remove-tags.html)\nin the Classic Load Balancers Guide." ([add-tags-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AddTagsResult", :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "TooManyTagsException" :portkey.aws.elasticloadbalancing.-2012-06-01/too-many-tags-exception, "DuplicateTagKeysException" :portkey.aws.elasticloadbalancing.-2012-06-01/duplicate-tag-keys-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/add-tags-output))

(clojure.core/defn configure-health-check "Specifies the health check settings to use when evaluating the health state of\nyour EC2 instances.\n For more information, see Configure Health Checks for Your Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-healthchecks.html)\nin the Classic Load Balancers Guide." ([configure-health-check-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-configure-health-check-input configure-health-check-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ConfigureHealthCheckResult", :http.request.configuration/action "ConfigureHealthCheck", :http.request.configuration/output-deser-fn response-configure-health-check-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception}})))))
(clojure.spec.alpha/fdef configure-health-check :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/configure-health-check-output))

(clojure.core/defn set-load-balancer-listener-ssl-certificate "Sets the certificate that terminates the specified listener's SSL connections.\nThe specified certificate replaces any prior certificate that was used on the\nsame load balancer and port.\n For more information about updating your SSL certificate, see Replace the SSL\nCertificate for Your Load Balancer\n(http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/elb-update-ssl-cert.html)\nin the Classic Load Balancers Guide." ([set-load-balancer-listener-ssl-certificate-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-load-balancer-listener-ssl-certificate-input set-load-balancer-listener-ssl-certificate-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetLoadBalancerListenerSSLCertificateResult", :http.request.configuration/action "SetLoadBalancerListenerSSLCertificate", :http.request.configuration/output-deser-fn response-set-load-balancer-listener-ssl-certificate-output, :http.request.spec/error-spec {"CertificateNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/certificate-not-found-exception, "AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "ListenerNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/listener-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception, "UnsupportedProtocolException" :portkey.aws.elasticloadbalancing.-2012-06-01/unsupported-protocol-exception}})))))
(clojure.spec.alpha/fdef set-load-balancer-listener-ssl-certificate :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/set-load-balancer-listener-ssl-certificate-output))

(clojure.core/defn delete-load-balancer-policy "Deletes the specified policy from the specified load balancer. This policy must\nnot be enabled for any listeners." ([delete-load-balancer-policy-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-load-balancer-policy-input delete-load-balancer-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLoadBalancerPolicyResult", :http.request.configuration/action "DeleteLoadBalancerPolicy", :http.request.configuration/output-deser-fn response-delete-load-balancer-policy-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "InvalidConfigurationRequestException" :portkey.aws.elasticloadbalancing.-2012-06-01/invalid-configuration-request-exception}})))))
(clojure.spec.alpha/fdef delete-load-balancer-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/delete-load-balancer-policy-output))

(clojure.core/defn describe-load-balancers "Describes the specified the load balancers. If no load balancers are specified,\nthe call describes all of your load balancers." ([] (describe-load-balancers {})) ([describe-access-points-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-access-points-input describe-access-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancersResult", :http.request.configuration/action "DescribeLoadBalancers", :http.request.configuration/output-deser-fn response-describe-access-points-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "DependencyThrottleException" :portkey.aws.elasticloadbalancing.-2012-06-01/dependency-throttle-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/? :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-access-points-output))

(clojure.core/defn describe-load-balancer-attributes "Describes the attributes for the specified load balancer." ([describe-load-balancer-attributes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-load-balancer-attributes-input describe-load-balancer-attributes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.elasticloadbalancing.-2012-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-06-01", :http.request.configuration/service-id "Elastic Load Balancing", :http.request.spec/input-spec :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerAttributesResult", :http.request.configuration/action "DescribeLoadBalancerAttributes", :http.request.configuration/output-deser-fn response-describe-load-balancer-attributes-output, :http.request.spec/error-spec {"AccessPointNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/access-point-not-found-exception, "LoadBalancerAttributeNotFoundException" :portkey.aws.elasticloadbalancing.-2012-06-01/load-balancer-attribute-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-load-balancer-attributes :args (clojure.spec.alpha/tuple :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticloadbalancing.-2012-06-01/describe-load-balancer-attributes-output))
