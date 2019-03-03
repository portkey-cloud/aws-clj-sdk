(ns portkey.aws.elasticmapreduce (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-northeast-1"},
    :ssl-common-name "ap-northeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-1"},
    :ssl-common-name "eu-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-east-2"},
    :ssl-common-name "us-east-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-southeast-2"},
    :ssl-common-name "ap-southeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "cn-north-1"},
    :ssl-common-name "elasticmapreduce.cn-north-1.amazonaws.com.cn",
    :endpoint "https://elasticmapreduce.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "sa-east-1"},
    :ssl-common-name "sa-east-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-southeast-1"},
    :ssl-common-name "ap-southeast-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "cn-northwest-1"},
    :ssl-common-name
    "elasticmapreduce.cn-northwest-1.amazonaws.com.cn",
    :endpoint
    "https://elasticmapreduce.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-northeast-2"},
    :ssl-common-name "ap-northeast-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-3"},
    :ssl-common-name "eu-west-3.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ca-central-1"},
    :ssl-common-name "ca-central-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-central-1"},
    :ssl-common-name "elasticmapreduce.eu-central-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "eu-west-2"},
    :ssl-common-name "eu-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-gov-west-1"},
    :ssl-common-name "elasticmapreduce.us-gov-west-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-west-2"},
    :ssl-common-name "us-west-2.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-east-1"},
    :ssl-common-name "elasticmapreduce.us-east-1.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "us-west-1"},
    :ssl-common-name "us-west-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "elasticmapreduce", :region "ap-south-1"},
    :ssl-common-name "ap-south-1.elasticmapreduce.amazonaws.com",
    :endpoint "https://elasticmapreduce.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-placement-type)

(clojure.core/declare ser-application)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-unit)

(clojure.core/declare ser-ec-2-instance-ids-to-terminate-list)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-instance-group-type)

(clojure.core/declare ser-string-map)

(clojure.core/declare ser-xml-string-list)

(clojure.core/declare ser-instance-group-config-list)

(clojure.core/declare ser-instance-type-config-list)

(clojure.core/declare ser-non-negative-double)

(clojure.core/declare ser-key-value)

(clojure.core/declare ser-script-bootstrap-action-config)

(clojure.core/declare ser-supported-products-list)

(clojure.core/declare ser-ebs-configuration)

(clojure.core/declare ser-scaling-action)

(clojure.core/declare ser-configuration-list)

(clojure.core/declare ser-ebs-block-device-config)

(clojure.core/declare ser-kerberos-attributes)

(clojure.core/declare ser-instance-group-config)

(clojure.core/declare ser-shrink-policy)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-key-value-list)

(clojure.core/declare ser-instance-state-list)

(clojure.core/declare ser-xml-string-max-len-256)

(clojure.core/declare ser-scale-down-behavior)

(clojure.core/declare ser-new-supported-products-list)

(clojure.core/declare ser-repo-upgrade-on-boot)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-whole-number)

(clojure.core/declare ser-step-config)

(clojure.core/declare ser-instance-group-type-list)

(clojure.core/declare ser-comparison-operator)

(clojure.core/declare ser-cluster-id)

(clojure.core/declare ser-hadoop-jar-step-config)

(clojure.core/declare ser-xml-string-max-len-256-list)

(clojure.core/declare ser-instance-resize-policy)

(clojure.core/declare ser-action-on-failure)

(clojure.core/declare ser-instance-fleet-id)

(clojure.core/declare ser-date)

(clojure.core/declare ser-instance-fleet-config)

(clojure.core/declare ser-spot-provisioning-specification)

(clojure.core/declare ser-job-flow-execution-state-list)

(clojure.core/declare ser-resource-id)

(clojure.core/declare ser-instance-group-modify-config)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-cluster-state)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-step-config-list)

(clojure.core/declare ser-ebs-block-device-config-list)

(clojure.core/declare ser-cluster-state-list)

(clojure.core/declare ser-scaling-rule-list)

(clojure.core/declare ser-step-ids-list)

(clojure.core/declare ser-instance-group-id)

(clojure.core/declare ser-auto-scaling-policy)

(clojure.core/declare ser-adjustment-type)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-volume-specification)

(clojure.core/declare ser-bootstrap-action-config)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-metric-dimension-list)

(clojure.core/declare ser-instance-fleet-modify-config)

(clojure.core/declare ser-instance-fleet-config-list)

(clojure.core/declare ser-job-flow-instances-config)

(clojure.core/declare ser-spot-provisioning-timeout-action)

(clojure.core/declare ser-step-state-list)

(clojure.core/declare ser-application-list)

(clojure.core/declare ser-instance-state)

(clojure.core/declare ser-bootstrap-action-config-list)

(clojure.core/declare ser-job-flow-execution-state)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-cloud-watch-alarm-definition)

(clojure.core/declare ser-instance-type-config)

(clojure.core/declare ser-market-type)

(clojure.core/declare ser-scaling-rule)

(clojure.core/declare ser-ec-2-instance-ids-list)

(clojure.core/declare ser-scaling-constraints)

(clojure.core/declare ser-scaling-trigger)

(clojure.core/declare ser-instance-fleet-type)

(clojure.core/declare ser-step-id)

(clojure.core/declare ser-security-groups-list)

(clojure.core/declare ser-configuration)

(clojure.core/declare ser-boolean-object)

(clojure.core/declare ser-step-state)

(clojure.core/declare ser-supported-product-config)

(clojure.core/declare ser-instance-group-modify-config-list)

(clojure.core/declare ser-instance-role-type)

(clojure.core/declare ser-statistic)

(clojure.core/declare ser-simple-scaling-policy-configuration)

(clojure.core/declare ser-instance-fleet-provisioning-specifications)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-placement-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlacementType", :type "structure"} (clojure.core/contains? input :availability-zone) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :availability-zone)) #:http.request.field{:name "AvailabilityZone", :shape "XmlString"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256-list (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "XmlStringMaxLen256List"}))))

(clojure.core/defn- ser-application [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Application", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "Version", :shape "String"})) (clojure.core/contains? input :args) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :args)) #:http.request.field{:name "Args", :shape "StringList"})) (clojure.core/contains? input :additional-info) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :additional-info)) #:http.request.field{:name "AdditionalInfo", :shape "StringMap"}))))

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-unit [input] #:http.request.field{:value (clojure.core/get {"KILO_BYTES_PER_SECOND" "KILO_BYTES_PER_SECOND", :tera-bytes "TERA_BYTES", :bytes-per-second "BYTES_PER_SECOND", "PERCENT" "PERCENT", "BITS" "BITS", "COUNT_PER_SECOND" "COUNT_PER_SECOND", :kilo-bits-per-second "KILO_BITS_PER_SECOND", :giga-bits "GIGA_BITS", :giga-bytes-per-second "GIGA_BYTES_PER_SECOND", "MICRO_SECONDS" "MICRO_SECONDS", :milli-seconds "MILLI_SECONDS", "COUNT" "COUNT", "KILO_BITS" "KILO_BITS", "MEGA_BITS" "MEGA_BITS", "TERA_BYTES" "TERA_BYTES", "GIGA_BITS" "GIGA_BITS", "SECONDS" "SECONDS", :kilo-bits "KILO_BITS", :mega-bits-per-second "MEGA_BITS_PER_SECOND", "GIGA_BYTES" "GIGA_BYTES", :bits-per-second "BITS_PER_SECOND", "BYTES_PER_SECOND" "BYTES_PER_SECOND", :mega-bytes-per-second "MEGA_BYTES_PER_SECOND", :micro-seconds "MICRO_SECONDS", :kilo-bytes-per-second "KILO_BYTES_PER_SECOND", "GIGA_BITS_PER_SECOND" "GIGA_BITS_PER_SECOND", :kilo-bytes "KILO_BYTES", :tera-bits "TERA_BITS", :giga-bytes "GIGA_BYTES", :seconds "SECONDS", :bits "BITS", "MEGA_BYTES_PER_SECOND" "MEGA_BYTES_PER_SECOND", "TERA_BYTES_PER_SECOND" "TERA_BYTES_PER_SECOND", "KILO_BITS_PER_SECOND" "KILO_BITS_PER_SECOND", "NONE" "NONE", :mega-bytes "MEGA_BYTES", :mega-bits "MEGA_BITS", "MEGA_BYTES" "MEGA_BYTES", :tera-bytes-per-second "TERA_BYTES_PER_SECOND", :count "COUNT", :giga-bits-per-second "GIGA_BITS_PER_SECOND", :count-per-second "COUNT_PER_SECOND", "BITS_PER_SECOND" "BITS_PER_SECOND", :bytes "BYTES", "TERA_BITS" "TERA_BITS", "TERA_BITS_PER_SECOND" "TERA_BITS_PER_SECOND", :tera-bits-per-second "TERA_BITS_PER_SECOND", "BYTES" "BYTES", :percent "PERCENT", "MEGA_BITS_PER_SECOND" "MEGA_BITS_PER_SECOND", "MILLI_SECONDS" "MILLI_SECONDS", :none "NONE", "GIGA_BYTES_PER_SECOND" "GIGA_BYTES_PER_SECOND", "KILO_BYTES" "KILO_BYTES"} input), :shape "Unit"})

(clojure.core/defn- ser-ec-2-instance-ids-to-terminate-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-id coll) #:http.request.field{:shape "InstanceId"}))) input), :shape "EC2InstanceIdsToTerminateList", :type "list"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-instance-group-type [input] #:http.request.field{:value (clojure.core/get {"MASTER" "MASTER", :master "MASTER", "CORE" "CORE", :core "CORE", "TASK" "TASK", :task "TASK"} input), :shape "InstanceGroupType"})

(clojure.core/defn- ser-string-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StringMap", :type "map"})

(clojure.core/defn- ser-xml-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "XmlStringList", :type "list"})

(clojure.core/defn- ser-instance-group-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-group-config coll) #:http.request.field{:shape "InstanceGroupConfig"}))) input), :shape "InstanceGroupConfigList", :type "list"})

(clojure.core/defn- ser-instance-type-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-type-config coll) #:http.request.field{:shape "InstanceTypeConfig"}))) input), :shape "InstanceTypeConfigList", :type "list"})

(clojure.core/defn- ser-non-negative-double [input] #:http.request.field{:value input, :shape "NonNegativeDouble"})

(clojure.core/defn- ser-key-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyValue", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :key)) #:http.request.field{:name "Key", :shape "XmlString"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :value)) #:http.request.field{:name "Value", :shape "XmlString"}))))

(clojure.core/defn- ser-script-bootstrap-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string (:path input)) #:http.request.field{:name "Path", :shape "XmlString"})], :shape "ScriptBootstrapActionConfig", :type "structure"} (clojure.core/contains? input :args) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-list (input :args)) #:http.request.field{:name "Args", :shape "XmlStringList"}))))

(clojure.core/defn- ser-supported-products-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "SupportedProductsList", :type "list"})

(clojure.core/defn- ser-ebs-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EbsConfiguration", :type "structure"} (clojure.core/contains? input :ebs-block-device-configs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-block-device-config-list (input :ebs-block-device-configs)) #:http.request.field{:name "EbsBlockDeviceConfigs", :shape "EbsBlockDeviceConfigList"})) (clojure.core/contains? input :ebs-optimized) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-object (input :ebs-optimized)) #:http.request.field{:name "EbsOptimized", :shape "BooleanObject"}))))

(clojure.core/defn- ser-scaling-action [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-simple-scaling-policy-configuration (:simple-scaling-policy-configuration input)) #:http.request.field{:name "SimpleScalingPolicyConfiguration", :shape "SimpleScalingPolicyConfiguration"})], :shape "ScalingAction", :type "structure"} (clojure.core/contains? input :market) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-market-type (input :market)) #:http.request.field{:name "Market", :shape "MarketType"}))))

(clojure.core/defn- ser-configuration-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-configuration coll) #:http.request.field{:shape "Configuration"}))) input), :shape "ConfigurationList", :type "list"})

(clojure.core/defn- ser-ebs-block-device-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-volume-specification (:volume-specification input)) #:http.request.field{:name "VolumeSpecification", :shape "VolumeSpecification"})], :shape "EbsBlockDeviceConfig", :type "structure"} (clojure.core/contains? input :volumes-per-instance) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :volumes-per-instance)) #:http.request.field{:name "VolumesPerInstance", :shape "Integer"}))))

(clojure.core/defn- ser-kerberos-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-256 (:realm input)) #:http.request.field{:name "Realm", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-xml-string-max-len-256 (:kdc-admin-password input)) #:http.request.field{:name "KdcAdminPassword", :shape "XmlStringMaxLen256"})], :shape "KerberosAttributes", :type "structure"} (clojure.core/contains? input :cross-realm-trust-principal-password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :cross-realm-trust-principal-password)) #:http.request.field{:name "CrossRealmTrustPrincipalPassword", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :ad-domain-join-user) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :ad-domain-join-user)) #:http.request.field{:name "ADDomainJoinUser", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :ad-domain-join-password) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :ad-domain-join-password)) #:http.request.field{:name "ADDomainJoinPassword", :shape "XmlStringMaxLen256"}))))

(clojure.core/defn- ser-instance-group-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-role-type (:instance-role input)) #:http.request.field{:name "InstanceRole", :shape "InstanceRoleType"}) (clojure.core/into (ser-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "InstanceType"}) (clojure.core/into (ser-integer (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "Integer"})], :shape "InstanceGroupConfig", :type "structure"} (clojure.core/contains? input :bid-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :bid-price)) #:http.request.field{:name "BidPrice", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :ebs-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-configuration (input :ebs-configuration)) #:http.request.field{:name "EbsConfiguration", :shape "EbsConfiguration"})) (clojure.core/contains? input :configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-list (input :configurations)) #:http.request.field{:name "Configurations", :shape "ConfigurationList"})) (clojure.core/contains? input :auto-scaling-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-policy (input :auto-scaling-policy)) #:http.request.field{:name "AutoScalingPolicy", :shape "AutoScalingPolicy"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :name)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :market) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-market-type (input :market)) #:http.request.field{:name "Market", :shape "MarketType"}))))

(clojure.core/defn- ser-shrink-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ShrinkPolicy", :type "structure"} (clojure.core/contains? input :decommission-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :decommission-timeout)) #:http.request.field{:name "DecommissionTimeout", :shape "Integer"})) (clojure.core/contains? input :instance-resize-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-resize-policy (input :instance-resize-policy)) #:http.request.field{:name "InstanceResizePolicy", :shape "InstanceResizePolicy"}))))

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value input, :shape "InstanceType"})

(clojure.core/defn- ser-key-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-value coll) #:http.request.field{:shape "KeyValue"}))) input), :shape "KeyValueList", :type "list"})

(clojure.core/defn- ser-instance-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-state coll) #:http.request.field{:shape "InstanceState"}))) input), :shape "InstanceStateList", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-256 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen256"})

(clojure.core/defn- ser-scale-down-behavior [input] #:http.request.field{:value (clojure.core/get {"TERMINATE_AT_INSTANCE_HOUR" "TERMINATE_AT_INSTANCE_HOUR", :terminate-at-instance-hour "TERMINATE_AT_INSTANCE_HOUR", "TERMINATE_AT_TASK_COMPLETION" "TERMINATE_AT_TASK_COMPLETION", :terminate-at-task-completion "TERMINATE_AT_TASK_COMPLETION"} input), :shape "ScaleDownBehavior"})

(clojure.core/defn- ser-new-supported-products-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-supported-product-config coll) #:http.request.field{:shape "SupportedProductConfig"}))) input), :shape "NewSupportedProductsList", :type "list"})

(clojure.core/defn- ser-repo-upgrade-on-boot [input] #:http.request.field{:value (clojure.core/get {"SECURITY" "SECURITY", :security "SECURITY", "NONE" "NONE", :none "NONE"} input), :shape "RepoUpgradeOnBoot"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-whole-number [input] #:http.request.field{:value input, :shape "WholeNumber"})

(clojure.core/defn- ser-step-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-256 (:name input)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-hadoop-jar-step-config (:hadoop-jar-step input)) #:http.request.field{:name "HadoopJarStep", :shape "HadoopJarStepConfig"})], :shape "StepConfig", :type "structure"} (clojure.core/contains? input :action-on-failure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-action-on-failure (input :action-on-failure)) #:http.request.field{:name "ActionOnFailure", :shape "ActionOnFailure"}))))

(clojure.core/defn- ser-instance-group-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-group-type coll) #:http.request.field{:shape "InstanceGroupType"}))) input), :shape "InstanceGroupTypeList", :type "list"})

(clojure.core/defn- ser-comparison-operator [input] #:http.request.field{:value (clojure.core/get {"GREATER_THAN_OR_EQUAL" "GREATER_THAN_OR_EQUAL", :greater-than-or-equal "GREATER_THAN_OR_EQUAL", "GREATER_THAN" "GREATER_THAN", :greater-than "GREATER_THAN", "LESS_THAN" "LESS_THAN", :less-than "LESS_THAN", "LESS_THAN_OR_EQUAL" "LESS_THAN_OR_EQUAL", :less-than-or-equal "LESS_THAN_OR_EQUAL"} input), :shape "ComparisonOperator"})

(clojure.core/defn- ser-cluster-id [input] #:http.request.field{:value input, :shape "ClusterId"})

(clojure.core/defn- ser-hadoop-jar-step-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string (:jar input)) #:http.request.field{:name "Jar", :shape "XmlString"})], :shape "HadoopJarStepConfig", :type "structure"} (clojure.core/contains? input :properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key-value-list (input :properties)) #:http.request.field{:name "Properties", :shape "KeyValueList"})) (clojure.core/contains? input :main-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :main-class)) #:http.request.field{:name "MainClass", :shape "XmlString"})) (clojure.core/contains? input :args) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-list (input :args)) #:http.request.field{:name "Args", :shape "XmlStringList"}))))

(clojure.core/defn- ser-xml-string-max-len-256-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "XmlStringMaxLen256List", :type "list"})

(clojure.core/defn- ser-instance-resize-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceResizePolicy", :type "structure"} (clojure.core/contains? input :instances-to-terminate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-ids-list (input :instances-to-terminate)) #:http.request.field{:name "InstancesToTerminate", :shape "EC2InstanceIdsList"})) (clojure.core/contains? input :instances-to-protect) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-ids-list (input :instances-to-protect)) #:http.request.field{:name "InstancesToProtect", :shape "EC2InstanceIdsList"})) (clojure.core/contains? input :instance-termination-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :instance-termination-timeout)) #:http.request.field{:name "InstanceTerminationTimeout", :shape "Integer"}))))

(clojure.core/defn- ser-action-on-failure [input] #:http.request.field{:value (clojure.core/get {"TERMINATE_JOB_FLOW" "TERMINATE_JOB_FLOW", :terminate-job-flow "TERMINATE_JOB_FLOW", "TERMINATE_CLUSTER" "TERMINATE_CLUSTER", :terminate-cluster "TERMINATE_CLUSTER", "CANCEL_AND_WAIT" "CANCEL_AND_WAIT", :cancel-and-wait "CANCEL_AND_WAIT", "CONTINUE" "CONTINUE", :continue "CONTINUE"} input), :shape "ActionOnFailure"})

(clojure.core/defn- ser-instance-fleet-id [input] #:http.request.field{:value input, :shape "InstanceFleetId"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-instance-fleet-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-fleet-type (:instance-fleet-type input)) #:http.request.field{:name "InstanceFleetType", :shape "InstanceFleetType"})], :shape "InstanceFleetConfig", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :name)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :target-on-demand-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :target-on-demand-capacity)) #:http.request.field{:name "TargetOnDemandCapacity", :shape "WholeNumber"})) (clojure.core/contains? input :target-spot-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :target-spot-capacity)) #:http.request.field{:name "TargetSpotCapacity", :shape "WholeNumber"})) (clojure.core/contains? input :instance-type-configs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type-config-list (input :instance-type-configs)) #:http.request.field{:name "InstanceTypeConfigs", :shape "InstanceTypeConfigList"})) (clojure.core/contains? input :launch-specifications) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-fleet-provisioning-specifications (input :launch-specifications)) #:http.request.field{:name "LaunchSpecifications", :shape "InstanceFleetProvisioningSpecifications"}))))

(clojure.core/defn- ser-spot-provisioning-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-whole-number (:timeout-duration-minutes input)) #:http.request.field{:name "TimeoutDurationMinutes", :shape "WholeNumber"}) (clojure.core/into (ser-spot-provisioning-timeout-action (:timeout-action input)) #:http.request.field{:name "TimeoutAction", :shape "SpotProvisioningTimeoutAction"})], :shape "SpotProvisioningSpecification", :type "structure"} (clojure.core/contains? input :block-duration-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :block-duration-minutes)) #:http.request.field{:name "BlockDurationMinutes", :shape "WholeNumber"}))))

(clojure.core/defn- ser-job-flow-execution-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-flow-execution-state coll) #:http.request.field{:shape "JobFlowExecutionState"}))) input), :shape "JobFlowExecutionStateList", :type "list"})

(clojure.core/defn- ser-resource-id [input] #:http.request.field{:value input, :shape "ResourceId"})

(clojure.core/defn- ser-instance-group-modify-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-256 (:instance-group-id input)) #:http.request.field{:name "InstanceGroupId", :shape "XmlStringMaxLen256"})], :shape "InstanceGroupModifyConfig", :type "structure"} (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "Integer"})) (clojure.core/contains? input :ec-2-instance-ids-to-terminate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-instance-ids-to-terminate-list (input :ec-2-instance-ids-to-terminate)) #:http.request.field{:name "EC2InstanceIdsToTerminate", :shape "EC2InstanceIdsToTerminateList"})) (clojure.core/contains? input :shrink-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shrink-policy (input :shrink-policy)) #:http.request.field{:name "ShrinkPolicy", :shape "ShrinkPolicy"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-cluster-state [input] #:http.request.field{:value (clojure.core/get {"BOOTSTRAPPING" "BOOTSTRAPPING", :starting "STARTING", "TERMINATED_WITH_ERRORS" "TERMINATED_WITH_ERRORS", :terminated-with-errors "TERMINATED_WITH_ERRORS", "TERMINATED" "TERMINATED", :running "RUNNING", :waiting "WAITING", :terminating "TERMINATING", "STARTING" "STARTING", :terminated "TERMINATED", "WAITING" "WAITING", :bootstrapping "BOOTSTRAPPING", "TERMINATING" "TERMINATING", "RUNNING" "RUNNING"} input), :shape "ClusterState"})

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-step-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-config coll) #:http.request.field{:shape "StepConfig"}))) input), :shape "StepConfigList", :type "list"})

(clojure.core/defn- ser-ebs-block-device-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ebs-block-device-config coll) #:http.request.field{:shape "EbsBlockDeviceConfig"}))) input), :shape "EbsBlockDeviceConfigList", :type "list"})

(clojure.core/defn- ser-cluster-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cluster-state coll) #:http.request.field{:shape "ClusterState"}))) input), :shape "ClusterStateList", :type "list"})

(clojure.core/defn- ser-scaling-rule-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scaling-rule coll) #:http.request.field{:shape "ScalingRule"}))) input), :shape "ScalingRuleList", :type "list"})

(clojure.core/defn- ser-step-ids-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "StepIdsList", :type "list"})

(clojure.core/defn- ser-instance-group-id [input] #:http.request.field{:value input, :shape "InstanceGroupId"})

(clojure.core/defn- ser-auto-scaling-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scaling-constraints (:constraints input)) #:http.request.field{:name "Constraints", :shape "ScalingConstraints"}) (clojure.core/into (ser-scaling-rule-list (:rules input)) #:http.request.field{:name "Rules", :shape "ScalingRuleList"})], :shape "AutoScalingPolicy", :type "structure"}))

(clojure.core/defn- ser-adjustment-type [input] #:http.request.field{:value (clojure.core/get {"CHANGE_IN_CAPACITY" "CHANGE_IN_CAPACITY", :change-in-capacity "CHANGE_IN_CAPACITY", "PERCENT_CHANGE_IN_CAPACITY" "PERCENT_CHANGE_IN_CAPACITY", :percent-change-in-capacity "PERCENT_CHANGE_IN_CAPACITY", "EXACT_CAPACITY" "EXACT_CAPACITY", :exact-capacity "EXACT_CAPACITY"} input), :shape "AdjustmentType"})

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MetricDimension", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-volume-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:volume-type input)) #:http.request.field{:name "VolumeType", :shape "String"}) (clojure.core/into (ser-integer (:size-in-gb input)) #:http.request.field{:name "SizeInGB", :shape "Integer"})], :shape "VolumeSpecification", :type "structure"} (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :iops)) #:http.request.field{:name "Iops", :shape "Integer"}))))

(clojure.core/defn- ser-bootstrap-action-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-256 (:name input)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-script-bootstrap-action-config (:script-bootstrap-action input)) #:http.request.field{:name "ScriptBootstrapAction", :shape "ScriptBootstrapActionConfig"})], :shape "BootstrapActionConfig", :type "structure"}))

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-metric-dimension-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-dimension coll) #:http.request.field{:shape "MetricDimension"}))) input), :shape "MetricDimensionList", :type "list"})

(clojure.core/defn- ser-instance-fleet-modify-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-fleet-id (:instance-fleet-id input)) #:http.request.field{:name "InstanceFleetId", :shape "InstanceFleetId"})], :shape "InstanceFleetModifyConfig", :type "structure"} (clojure.core/contains? input :target-on-demand-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :target-on-demand-capacity)) #:http.request.field{:name "TargetOnDemandCapacity", :shape "WholeNumber"})) (clojure.core/contains? input :target-spot-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :target-spot-capacity)) #:http.request.field{:name "TargetSpotCapacity", :shape "WholeNumber"}))))

(clojure.core/defn- ser-instance-fleet-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-fleet-config coll) #:http.request.field{:shape "InstanceFleetConfig"}))) input), :shape "InstanceFleetConfigList", :type "list"})

(clojure.core/defn- ser-job-flow-instances-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobFlowInstancesConfig", :type "structure"} (clojure.core/contains? input :emr-managed-slave-security-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :emr-managed-slave-security-group)) #:http.request.field{:name "EmrManagedSlaveSecurityGroup", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :placement) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-type (input :placement)) #:http.request.field{:name "Placement", :shape "PlacementType"})) (clojure.core/contains? input :instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :instance-count)) #:http.request.field{:name "InstanceCount", :shape "Integer"})) (clojure.core/contains? input :hadoop-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :hadoop-version)) #:http.request.field{:name "HadoopVersion", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :keep-job-flow-alive-when-no-steps) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :keep-job-flow-alive-when-no-steps)) #:http.request.field{:name "KeepJobFlowAliveWhenNoSteps", :shape "Boolean"})) (clojure.core/contains? input :instance-fleets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-fleet-config-list (input :instance-fleets)) #:http.request.field{:name "InstanceFleets", :shape "InstanceFleetConfigList"})) (clojure.core/contains? input :ec-2-subnet-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256-list (input :ec-2-subnet-ids)) #:http.request.field{:name "Ec2SubnetIds", :shape "XmlStringMaxLen256List"})) (clojure.core/contains? input :slave-instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :slave-instance-type)) #:http.request.field{:name "SlaveInstanceType", :shape "InstanceType"})) (clojure.core/contains? input :master-instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :master-instance-type)) #:http.request.field{:name "MasterInstanceType", :shape "InstanceType"})) (clojure.core/contains? input :ec-2-key-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :ec-2-key-name)) #:http.request.field{:name "Ec2KeyName", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :service-access-security-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :service-access-security-group)) #:http.request.field{:name "ServiceAccessSecurityGroup", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :additional-slave-security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups-list (input :additional-slave-security-groups)) #:http.request.field{:name "AdditionalSlaveSecurityGroups", :shape "SecurityGroupsList"})) (clojure.core/contains? input :emr-managed-master-security-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :emr-managed-master-security-group)) #:http.request.field{:name "EmrManagedMasterSecurityGroup", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :ec-2-subnet-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :ec-2-subnet-id)) #:http.request.field{:name "Ec2SubnetId", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :termination-protected) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :termination-protected)) #:http.request.field{:name "TerminationProtected", :shape "Boolean"})) (clojure.core/contains? input :additional-master-security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups-list (input :additional-master-security-groups)) #:http.request.field{:name "AdditionalMasterSecurityGroups", :shape "SecurityGroupsList"})) (clojure.core/contains? input :instance-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-group-config-list (input :instance-groups)) #:http.request.field{:name "InstanceGroups", :shape "InstanceGroupConfigList"}))))

(clojure.core/defn- ser-spot-provisioning-timeout-action [input] #:http.request.field{:value (clojure.core/get {"SWITCH_TO_ON_DEMAND" "SWITCH_TO_ON_DEMAND", :switch-to-on-demand "SWITCH_TO_ON_DEMAND", "TERMINATE_CLUSTER" "TERMINATE_CLUSTER", :terminate-cluster "TERMINATE_CLUSTER"} input), :shape "SpotProvisioningTimeoutAction"})

(clojure.core/defn- ser-step-state-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-state coll) #:http.request.field{:shape "StepState"}))) input), :shape "StepStateList", :type "list"})

(clojure.core/defn- ser-application-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application coll) #:http.request.field{:shape "Application"}))) input), :shape "ApplicationList", :type "list"})

(clojure.core/defn- ser-instance-state [input] #:http.request.field{:value (clojure.core/get {"BOOTSTRAPPING" "BOOTSTRAPPING", "AWAITING_FULFILLMENT" "AWAITING_FULFILLMENT", "PROVISIONING" "PROVISIONING", "TERMINATED" "TERMINATED", :running "RUNNING", :terminated "TERMINATED", :awaiting-fulfillment "AWAITING_FULFILLMENT", :provisioning "PROVISIONING", :bootstrapping "BOOTSTRAPPING", "RUNNING" "RUNNING"} input), :shape "InstanceState"})

(clojure.core/defn- ser-bootstrap-action-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-bootstrap-action-config coll) #:http.request.field{:shape "BootstrapActionConfig"}))) input), :shape "BootstrapActionConfigList", :type "list"})

(clojure.core/defn- ser-job-flow-execution-state [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", "BOOTSTRAPPING" "BOOTSTRAPPING", :starting "STARTING", :completed "COMPLETED", "TERMINATED" "TERMINATED", :running "RUNNING", :waiting "WAITING", "STARTING" "STARTING", :terminated "TERMINATED", "WAITING" "WAITING", "FAILED" "FAILED", :shutting-down "SHUTTING_DOWN", :bootstrapping "BOOTSTRAPPING", "SHUTTING_DOWN" "SHUTTING_DOWN", :failed "FAILED", "RUNNING" "RUNNING"} input), :shape "JobFlowExecutionState"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :key)) #:http.request.field{:name "Key", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"}))))

(clojure.core/defn- ser-cloud-watch-alarm-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-comparison-operator (:comparison-operator input)) #:http.request.field{:name "ComparisonOperator", :shape "ComparisonOperator"}) (clojure.core/into (ser-string (:metric-name input)) #:http.request.field{:name "MetricName", :shape "String"}) (clojure.core/into (ser-integer (:period input)) #:http.request.field{:name "Period", :shape "Integer"}) (clojure.core/into (ser-non-negative-double (:threshold input)) #:http.request.field{:name "Threshold", :shape "NonNegativeDouble"})], :shape "CloudWatchAlarmDefinition", :type "structure"} (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-unit (input :unit)) #:http.request.field{:name "Unit", :shape "Unit"})) (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimension-list (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensionList"})) (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :namespace)) #:http.request.field{:name "Namespace", :shape "String"})) (clojure.core/contains? input :evaluation-periods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :evaluation-periods)) #:http.request.field{:name "EvaluationPeriods", :shape "Integer"})) (clojure.core/contains? input :statistic) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statistic (input :statistic)) #:http.request.field{:name "Statistic", :shape "Statistic"}))))

(clojure.core/defn- ser-instance-type-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "InstanceType"})], :shape "InstanceTypeConfig", :type "structure"} (clojure.core/contains? input :weighted-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-whole-number (input :weighted-capacity)) #:http.request.field{:name "WeightedCapacity", :shape "WholeNumber"})) (clojure.core/contains? input :bid-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :bid-price)) #:http.request.field{:name "BidPrice", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :bid-price-as-percentage-of-on-demand-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-negative-double (input :bid-price-as-percentage-of-on-demand-price)) #:http.request.field{:name "BidPriceAsPercentageOfOnDemandPrice", :shape "NonNegativeDouble"})) (clojure.core/contains? input :ebs-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-configuration (input :ebs-configuration)) #:http.request.field{:name "EbsConfiguration", :shape "EbsConfiguration"})) (clojure.core/contains? input :configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-list (input :configurations)) #:http.request.field{:name "Configurations", :shape "ConfigurationList"}))))

(clojure.core/defn- ser-market-type [input] #:http.request.field{:value (clojure.core/get {"ON_DEMAND" "ON_DEMAND", :on-demand "ON_DEMAND", "SPOT" "SPOT", :spot "SPOT"} input), :shape "MarketType"})

(clojure.core/defn- ser-scaling-rule [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-scaling-action (:action input)) #:http.request.field{:name "Action", :shape "ScalingAction"}) (clojure.core/into (ser-scaling-trigger (:trigger input)) #:http.request.field{:name "Trigger", :shape "ScalingTrigger"})], :shape "ScalingRule", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "String"}))))

(clojure.core/defn- ser-ec-2-instance-ids-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-id coll) #:http.request.field{:shape "InstanceId"}))) input), :shape "EC2InstanceIdsList", :type "list"})

(clojure.core/defn- ser-scaling-constraints [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:min-capacity input)) #:http.request.field{:name "MinCapacity", :shape "Integer"}) (clojure.core/into (ser-integer (:max-capacity input)) #:http.request.field{:name "MaxCapacity", :shape "Integer"})], :shape "ScalingConstraints", :type "structure"}))

(clojure.core/defn- ser-scaling-trigger [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cloud-watch-alarm-definition (:cloud-watch-alarm-definition input)) #:http.request.field{:name "CloudWatchAlarmDefinition", :shape "CloudWatchAlarmDefinition"})], :shape "ScalingTrigger", :type "structure"}))

(clojure.core/defn- ser-instance-fleet-type [input] #:http.request.field{:value (clojure.core/get {"MASTER" "MASTER", :master "MASTER", "CORE" "CORE", :core "CORE", "TASK" "TASK", :task "TASK"} input), :shape "InstanceFleetType"})

(clojure.core/defn- ser-step-id [input] #:http.request.field{:value input, :shape "StepId"})

(clojure.core/defn- ser-security-groups-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "SecurityGroupsList", :type "list"})

(clojure.core/defn- ser-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Configuration", :type "structure"} (clojure.core/contains? input :classification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :classification)) #:http.request.field{:name "Classification", :shape "String"})) (clojure.core/contains? input :configurations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-list (input :configurations)) #:http.request.field{:name "Configurations", :shape "ConfigurationList"})) (clojure.core/contains? input :properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :properties)) #:http.request.field{:name "Properties", :shape "StringMap"}))))

(clojure.core/defn- ser-boolean-object [input] #:http.request.field{:value input, :shape "BooleanObject"})

(clojure.core/defn- ser-step-state [input] #:http.request.field{:value (clojure.core/get {"INTERRUPTED" "INTERRUPTED", "COMPLETED" "COMPLETED", :pending "PENDING", :completed "COMPLETED", "PENDING" "PENDING", :running "RUNNING", :cancelled "CANCELLED", "CANCEL_PENDING" "CANCEL_PENDING", "FAILED" "FAILED", :interrupted "INTERRUPTED", "CANCELLED" "CANCELLED", :cancel-pending "CANCEL_PENDING", :failed "FAILED", "RUNNING" "RUNNING"} input), :shape "StepState"})

(clojure.core/defn- ser-supported-product-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SupportedProductConfig", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :name)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :args) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-list (input :args)) #:http.request.field{:name "Args", :shape "XmlStringList"}))))

(clojure.core/defn- ser-instance-group-modify-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-group-modify-config coll) #:http.request.field{:shape "InstanceGroupModifyConfig"}))) input), :shape "InstanceGroupModifyConfigList", :type "list"})

(clojure.core/defn- ser-instance-role-type [input] #:http.request.field{:value (clojure.core/get {"MASTER" "MASTER", :master "MASTER", "CORE" "CORE", :core "CORE", "TASK" "TASK", :task "TASK"} input), :shape "InstanceRoleType"})

(clojure.core/defn- ser-statistic [input] #:http.request.field{:value (clojure.core/get {"SUM" "SUM", "MINIMUM" "MINIMUM", "SAMPLE_COUNT" "SAMPLE_COUNT", :maximum "MAXIMUM", :sample-count "SAMPLE_COUNT", "AVERAGE" "AVERAGE", :minimum "MINIMUM", "MAXIMUM" "MAXIMUM", :average "AVERAGE", :sum "SUM"} input), :shape "Statistic"})

(clojure.core/defn- ser-simple-scaling-policy-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:scaling-adjustment input)) #:http.request.field{:name "ScalingAdjustment", :shape "Integer"})], :shape "SimpleScalingPolicyConfiguration", :type "structure"} (clojure.core/contains? input :adjustment-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-adjustment-type (input :adjustment-type)) #:http.request.field{:name "AdjustmentType", :shape "AdjustmentType"})) (clojure.core/contains? input :cool-down) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :cool-down)) #:http.request.field{:name "CoolDown", :shape "Integer"}))))

(clojure.core/defn- ser-instance-fleet-provisioning-specifications [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-spot-provisioning-specification (:spot-specification input)) #:http.request.field{:name "SpotSpecification", :shape "SpotProvisioningSpecification"})], :shape "InstanceFleetProvisioningSpecifications", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-modify-instance-groups-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})) (clojure.core/contains? input :instance-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-group-modify-config-list (input :instance-groups)) #:http.request.field{:name "InstanceGroups", :shape "InstanceGroupModifyConfigList"}))))

(clojure.core/defn- req-list-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :instance-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-group-id (input :instance-group-id)) #:http.request.field{:name "InstanceGroupId", :shape "InstanceGroupId"})) (clojure.core/contains? input :instance-group-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-group-type-list (input :instance-group-types)) #:http.request.field{:name "InstanceGroupTypes", :shape "InstanceGroupTypeList"})) (clojure.core/contains? input :instance-fleet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-fleet-id (input :instance-fleet-id)) #:http.request.field{:name "InstanceFleetId", :shape "InstanceFleetId"})) (clojure.core/contains? input :instance-fleet-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-fleet-type (input :instance-fleet-type)) #:http.request.field{:name "InstanceFleetType", :shape "InstanceFleetType"})) (clojure.core/contains? input :instance-states) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-state-list (input :instance-states)) #:http.request.field{:name "InstanceStates", :shape "InstanceStateList"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-list-steps-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :step-states) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-state-list (input :step-states)) #:http.request.field{:name "StepStates", :shape "StepStateList"})) (clojure.core/contains? input :step-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-list (input :step-ids)) #:http.request.field{:name "StepIds", :shape "XmlStringList"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-describe-job-flows-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :created-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :created-after)) #:http.request.field{:name "CreatedAfter", :shape "Date"})) (clojure.core/contains? input :created-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :created-before)) #:http.request.field{:name "CreatedBefore", :shape "Date"})) (clojure.core/contains? input :job-flow-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-list (input :job-flow-ids)) #:http.request.field{:name "JobFlowIds", :shape "XmlStringList"})) (clojure.core/contains? input :job-flow-states) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-flow-execution-state-list (input :job-flow-states)) #:http.request.field{:name "JobFlowStates", :shape "JobFlowExecutionStateList"}))))

(clojure.core/defn- req-list-instance-fleets-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-remove-auto-scaling-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-instance-group-id (input :instance-group-id)) #:http.request.field{:name "InstanceGroupId", :shape "InstanceGroupId"})]}))

(clojure.core/defn- req-list-instance-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-put-auto-scaling-policy-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-instance-group-id (input :instance-group-id)) #:http.request.field{:name "InstanceGroupId", :shape "InstanceGroupId"}) (clojure.core/into (ser-auto-scaling-policy (input :auto-scaling-policy)) #:http.request.field{:name "AutoScalingPolicy", :shape "AutoScalingPolicy"})]}))

(clojure.core/defn- req-remove-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-string-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "StringList"})]}))

(clojure.core/defn- req-describe-cluster-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]}))

(clojure.core/defn- req-describe-security-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string (input :name)) #:http.request.field{:name "Name", :shape "XmlString"})]}))

(clojure.core/defn- req-list-bootstrap-actions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-run-job-flow-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-256 (input :name)) #:http.request.field{:name "Name", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-job-flow-instances-config (input :instances)) #:http.request.field{:name "Instances", :shape "JobFlowInstancesConfig"})]} (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :service-role)) #:http.request.field{:name "ServiceRole", :shape "XmlString"})) (clojure.core/contains? input :auto-scaling-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :auto-scaling-role)) #:http.request.field{:name "AutoScalingRole", :shape "XmlString"})) (clojure.core/contains? input :job-flow-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :job-flow-role)) #:http.request.field{:name "JobFlowRole", :shape "XmlString"})) (clojure.core/contains? input :custom-ami-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :custom-ami-id)) #:http.request.field{:name "CustomAmiId", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :log-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :log-uri)) #:http.request.field{:name "LogUri", :shape "XmlString"})) (clojure.core/contains? input :kerberos-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kerberos-attributes (input :kerberos-attributes)) #:http.request.field{:name "KerberosAttributes", :shape "KerberosAttributes"})) (clojure.core/contains? input :scale-down-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scale-down-behavior (input :scale-down-behavior)) #:http.request.field{:name "ScaleDownBehavior", :shape "ScaleDownBehavior"})) (clojure.core/contains? input :repo-upgrade-on-boot) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repo-upgrade-on-boot (input :repo-upgrade-on-boot)) #:http.request.field{:name "RepoUpgradeOnBoot", :shape "RepoUpgradeOnBoot"})) (clojure.core/contains? input :configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-configuration-list (input :configurations)) #:http.request.field{:name "Configurations", :shape "ConfigurationList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :visible-to-all-users) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :visible-to-all-users)) #:http.request.field{:name "VisibleToAllUsers", :shape "Boolean"})) (clojure.core/contains? input :additional-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :additional-info)) #:http.request.field{:name "AdditionalInfo", :shape "XmlString"})) (clojure.core/contains? input :applications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-list (input :applications)) #:http.request.field{:name "Applications", :shape "ApplicationList"})) (clojure.core/contains? input :ebs-root-volume-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :ebs-root-volume-size)) #:http.request.field{:name "EbsRootVolumeSize", :shape "Integer"})) (clojure.core/contains? input :new-supported-products) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-new-supported-products-list (input :new-supported-products)) #:http.request.field{:name "NewSupportedProducts", :shape "NewSupportedProductsList"})) (clojure.core/contains? input :steps) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-config-list (input :steps)) #:http.request.field{:name "Steps", :shape "StepConfigList"})) (clojure.core/contains? input :security-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "XmlString"})) (clojure.core/contains? input :release-label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :release-label)) #:http.request.field{:name "ReleaseLabel", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :supported-products) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-supported-products-list (input :supported-products)) #:http.request.field{:name "SupportedProducts", :shape "SupportedProductsList"})) (clojure.core/contains? input :bootstrap-actions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bootstrap-action-config-list (input :bootstrap-actions)) #:http.request.field{:name "BootstrapActions", :shape "BootstrapActionConfigList"})) (clojure.core/contains? input :ami-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :ami-version)) #:http.request.field{:name "AmiVersion", :shape "XmlStringMaxLen256"}))))

(clojure.core/defn- req-list-clusters-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :created-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :created-after)) #:http.request.field{:name "CreatedAfter", :shape "Date"})) (clojure.core/contains? input :created-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :created-before)) #:http.request.field{:name "CreatedBefore", :shape "Date"})) (clojure.core/contains? input :cluster-states) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-state-list (input :cluster-states)) #:http.request.field{:name "ClusterStates", :shape "ClusterStateList"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-add-instance-fleet-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-256 (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-instance-fleet-config (input :instance-fleet)) #:http.request.field{:name "InstanceFleet", :shape "InstanceFleetConfig"})]}))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceId"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-security-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string (input :name)) #:http.request.field{:name "Name", :shape "XmlString"}) (clojure.core/into (ser-string (input :security-configuration)) #:http.request.field{:name "SecurityConfiguration", :shape "String"})]}))

(clojure.core/defn- req-describe-step-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-step-id (input :step-id)) #:http.request.field{:name "StepId", :shape "StepId"})]}))

(clojure.core/defn- req-set-termination-protection-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-list (input :job-flow-ids)) #:http.request.field{:name "JobFlowIds", :shape "XmlStringList"}) (clojure.core/into (ser-boolean (input :termination-protected)) #:http.request.field{:name "TerminationProtected", :shape "Boolean"})]}))

(clojure.core/defn- req-cancel-steps-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-256 (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "XmlStringMaxLen256"})) (clojure.core/contains? input :step-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-ids-list (input :step-ids)) #:http.request.field{:name "StepIds", :shape "StepIdsList"}))))

(clojure.core/defn- req-set-visible-to-all-users-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-list (input :job-flow-ids)) #:http.request.field{:name "JobFlowIds", :shape "XmlStringList"}) (clojure.core/into (ser-boolean (input :visible-to-all-users)) #:http.request.field{:name "VisibleToAllUsers", :shape "Boolean"})]}))

(clojure.core/defn- req-add-instance-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-group-config-list (input :instance-groups)) #:http.request.field{:name "InstanceGroups", :shape "InstanceGroupConfigList"}) (clojure.core/into (ser-xml-string-max-len-256 (input :job-flow-id)) #:http.request.field{:name "JobFlowId", :shape "XmlStringMaxLen256"})]}))

(clojure.core/defn- req-modify-instance-fleet-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cluster-id (input :cluster-id)) #:http.request.field{:name "ClusterId", :shape "ClusterId"}) (clojure.core/into (ser-instance-fleet-modify-config (input :instance-fleet)) #:http.request.field{:name "InstanceFleet", :shape "InstanceFleetModifyConfig"})]}))

(clojure.core/defn- req-add-job-flow-steps-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-256 (input :job-flow-id)) #:http.request.field{:name "JobFlowId", :shape "XmlStringMaxLen256"}) (clojure.core/into (ser-step-config-list (input :steps)) #:http.request.field{:name "Steps", :shape "StepConfigList"})]}))

(clojure.core/defn- req-delete-security-configuration-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string (input :name)) #:http.request.field{:name "Name", :shape "XmlString"})]}))

(clojure.core/defn- req-list-security-configurations-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-terminate-job-flows-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-list (input :job-flow-ids)) #:http.request.field{:name "JobFlowIds", :shape "XmlStringList"})]}))

(clojure.core/declare deser-placement-type)

(clojure.core/declare deser-application)

(clojure.core/declare deser-instance-fleet-state)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-bootstrap-action-detail)

(clojure.core/declare deser-unit)

(clojure.core/declare deser-step-summary-list)

(clojure.core/declare deser-instance-state-change-reason-code)

(clojure.core/declare deser-instance-id)

(clojure.core/declare deser-step-summary)

(clojure.core/declare deser-instance-group-type)

(clojure.core/declare deser-auto-scaling-policy-state-change-reason-code)

(clojure.core/declare deser-instance-group-detail)

(clojure.core/declare deser-string-map)

(clojure.core/declare deser-instance-fleet-state-change-reason-code)

(clojure.core/declare deser-xml-string-list)

(clojure.core/declare deser-auto-scaling-policy-status)

(clojure.core/declare deser-non-negative-double)

(clojure.core/declare deser-ebs-block-device)

(clojure.core/declare deser-key-value)

(clojure.core/declare deser-instance-group-list)

(clojure.core/declare deser-step-timeline)

(clojure.core/declare deser-step-state-change-reason)

(clojure.core/declare deser-script-bootstrap-action-config)

(clojure.core/declare deser-supported-products-list)

(clojure.core/declare deser-cancel-steps-info-list)

(clojure.core/declare deser-scaling-action)

(clojure.core/declare deser-step-detail-list)

(clojure.core/declare deser-configuration-list)

(clojure.core/declare deser-kerberos-attributes)

(clojure.core/declare deser-bootstrap-action-detail-list)

(clojure.core/declare deser-shrink-policy)

(clojure.core/declare deser-instance-group)

(clojure.core/declare deser-instance-type)

(clojure.core/declare deser-step-execution-state)

(clojure.core/declare deser-key-value-list)

(clojure.core/declare deser-job-flow-execution-status-detail)

(clojure.core/declare deser-auto-scaling-policy-state)

(clojure.core/declare deser-xml-string-max-len-256)

(clojure.core/declare deser-scale-down-behavior)

(clojure.core/declare deser-repo-upgrade-on-boot)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-job-flow-detail)

(clojure.core/declare deser-ec-2-instance-attributes)

(clojure.core/declare deser-whole-number)

(clojure.core/declare deser-step-config)

(clojure.core/declare deser-step-detail)

(clojure.core/declare deser-comparison-operator)

(clojure.core/declare deser-cluster-id)

(clojure.core/declare deser-hadoop-jar-step-config)

(clojure.core/declare deser-hadoop-step-config)

(clojure.core/declare deser-instance-fleet)

(clojure.core/declare deser-security-configuration-list)

(clojure.core/declare deser-instance-group-state)

(clojure.core/declare deser-xml-string-max-len-256-list)

(clojure.core/declare deser-instance-fleet-list)

(clojure.core/declare deser-instance-resize-policy)

(clojure.core/declare deser-action-on-failure)

(clojure.core/declare deser-cluster-summary)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-instance-fleet-id)

(clojure.core/declare deser-date)

(clojure.core/declare deser-auto-scaling-policy-state-change-reason)

(clojure.core/declare deser-instance-group-timeline)

(clojure.core/declare deser-spot-provisioning-specification)

(clojure.core/declare deser-step)

(clojure.core/declare deser-step-state-change-reason-code)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-cluster-state)

(clojure.core/declare deser-xml-string)

(clojure.core/declare deser-instance-fleet-timeline)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-cluster-timeline)

(clojure.core/declare deser-auto-scaling-policy-description)

(clojure.core/declare deser-scaling-rule-list)

(clojure.core/declare deser-step-ids-list)

(clojure.core/declare deser-instance-group-id)

(clojure.core/declare deser-instance-type-specification)

(clojure.core/declare deser-adjustment-type)

(clojure.core/declare deser-cluster-status)

(clojure.core/declare deser-ebs-volume-list)

(clojure.core/declare deser-ebs-block-device-list)

(clojure.core/declare deser-cluster-state-change-reason)

(clojure.core/declare deser-instance-type-specification-list)

(clojure.core/declare deser-failure-details)

(clojure.core/declare deser-job-flow-detail-list)

(clojure.core/declare deser-metric-dimension)

(clojure.core/declare deser-volume-specification)

(clojure.core/declare deser-bootstrap-action-config)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-step-status)

(clojure.core/declare deser-metric-dimension-list)

(clojure.core/declare deser-instance-collection-type)

(clojure.core/declare deser-instance-group-status)

(clojure.core/declare deser-instance-fleet-status)

(clojure.core/declare deser-spot-provisioning-timeout-action)

(clojure.core/declare deser-command)

(clojure.core/declare deser-security-configuration-summary)

(clojure.core/declare deser-instance-list)

(clojure.core/declare deser-instance-group-state-change-reason)

(clojure.core/declare deser-cluster-summary-list)

(clojure.core/declare deser-command-list)

(clojure.core/declare deser-application-list)

(clojure.core/declare deser-instance-state)

(clojure.core/declare deser-job-flow-execution-state)

(clojure.core/declare deser-instance-group-ids-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-cloud-watch-alarm-definition)

(clojure.core/declare deser-instance-group-detail-list)

(clojure.core/declare deser-instance-status)

(clojure.core/declare deser-market-type)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-instance-state-change-reason)

(clojure.core/declare deser-scaling-rule)

(clojure.core/declare deser-ebs-volume)

(clojure.core/declare deser-cancel-steps-info)

(clojure.core/declare deser-ec-2-instance-ids-list)

(clojure.core/declare deser-scaling-constraints)

(clojure.core/declare deser-scaling-trigger)

(clojure.core/declare deser-instance-fleet-type)

(clojure.core/declare deser-step-id)

(clojure.core/declare deser-configuration)

(clojure.core/declare deser-boolean-object)

(clojure.core/declare deser-step-state)

(clojure.core/declare deser-job-flow-instances-detail)

(clojure.core/declare deser-cancel-steps-request-status)

(clojure.core/declare deser-instance-role-type)

(clojure.core/declare deser-statistic)

(clojure.core/declare deser-instance-fleet-state-change-reason)

(clojure.core/declare deser-step-execution-status-detail)

(clojure.core/declare deser-cluster-state-change-reason-code)

(clojure.core/declare deser-simple-scaling-policy-configuration)

(clojure.core/declare deser-instance-timeline)

(clojure.core/declare deser-instance-group-state-change-reason-code)

(clojure.core/declare deser-instance-fleet-provisioning-specifications)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-placement-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-xml-string (input "AvailabilityZone"))) (clojure.core/contains? input "AvailabilityZones") (clojure.core/assoc :availability-zones (deser-xml-string-max-len-256-list (input "AvailabilityZones")))))

(clojure.core/defn- deser-application [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-string (input "Version"))) (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-string-list (input "Args"))) (clojure.core/contains? input "AdditionalInfo") (clojure.core/assoc :additional-info (deser-string-map (input "AdditionalInfo")))))

(clojure.core/defn- deser-instance-fleet-state [input] (clojure.core/get {"PROVISIONING" :provisioning, "BOOTSTRAPPING" :bootstrapping, "RUNNING" :running, "RESIZING" :resizing, "SUSPENDED" :suspended, "TERMINATING" :terminating, "TERMINATED" :terminated} input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-bootstrap-action-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "BootstrapActionConfig") (clojure.core/assoc :bootstrap-action-config (deser-bootstrap-action-config (input "BootstrapActionConfig")))))

(clojure.core/defn- deser-unit [input] (clojure.core/get {"KILO_BYTES_PER_SECOND" :kilo-bytes-per-second, "PERCENT" :percent, "BITS" :bits, "COUNT_PER_SECOND" :count-per-second, "MICRO_SECONDS" :micro-seconds, "COUNT" :count, "KILO_BITS" :kilo-bits, "MEGA_BITS" :mega-bits, "TERA_BYTES" :tera-bytes, "GIGA_BITS" :giga-bits, "SECONDS" :seconds, "GIGA_BYTES" :giga-bytes, "BYTES_PER_SECOND" :bytes-per-second, "GIGA_BITS_PER_SECOND" :giga-bits-per-second, "MEGA_BYTES_PER_SECOND" :mega-bytes-per-second, "TERA_BYTES_PER_SECOND" :tera-bytes-per-second, "KILO_BITS_PER_SECOND" :kilo-bits-per-second, "NONE" :none, "MEGA_BYTES" :mega-bytes, "BITS_PER_SECOND" :bits-per-second, "TERA_BITS" :tera-bits, "TERA_BITS_PER_SECOND" :tera-bits-per-second, "BYTES" :bytes, "MEGA_BITS_PER_SECOND" :mega-bits-per-second, "MILLI_SECONDS" :milli-seconds, "GIGA_BYTES_PER_SECOND" :giga-bytes-per-second, "KILO_BYTES" :kilo-bytes} input))

(clojure.core/defn- deser-step-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-step-summary coll))) input))

(clojure.core/defn- deser-instance-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "VALIDATION_ERROR" :validation-error, "INSTANCE_FAILURE" :instance-failure, "BOOTSTRAP_FAILURE" :bootstrap-failure, "CLUSTER_TERMINATED" :cluster-terminated} input))

(clojure.core/defn- deser-instance-id [input] input)

(clojure.core/defn- deser-step-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-step-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Config") (clojure.core/assoc :config (deser-hadoop-step-config (input "Config"))) (clojure.core/contains? input "ActionOnFailure") (clojure.core/assoc :action-on-failure (deser-action-on-failure (input "ActionOnFailure"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-step-status (input "Status")))))

(clojure.core/defn- deser-instance-group-type [input] (clojure.core/get {"MASTER" :master, "CORE" :core, "TASK" :task} input))

(clojure.core/defn- deser-auto-scaling-policy-state-change-reason-code [input] (clojure.core/get {"USER_REQUEST" :user-request, "PROVISION_FAILURE" :provision-failure, "CLEANUP_FAILURE" :cleanup-failure} input))

(clojure.core/defn- deser-instance-group-detail [input] (clojure.core/cond-> {:market (deser-market-type (input "Market")), :instance-role (deser-instance-role-type (input "InstanceRole")), :instance-type (deser-instance-type (input "InstanceType")), :instance-request-count (deser-integer (input "InstanceRequestCount")), :instance-running-count (deser-integer (input "InstanceRunningCount")), :state (deser-instance-group-state (input "State")), :creation-date-time (deser-date (input "CreationDateTime"))} (clojure.core/contains? input "BidPrice") (clojure.core/assoc :bid-price (deser-xml-string-max-len-256 (input "BidPrice"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "InstanceGroupId") (clojure.core/assoc :instance-group-id (deser-xml-string-max-len-256 (input "InstanceGroupId"))) (clojure.core/contains? input "LastStateChangeReason") (clojure.core/assoc :last-state-change-reason (deser-xml-string (input "LastStateChangeReason"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-xml-string-max-len-256 (input "Name"))) (clojure.core/contains? input "StartDateTime") (clojure.core/assoc :start-date-time (deser-date (input "StartDateTime")))))

(clojure.core/defn- deser-string-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-instance-fleet-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "VALIDATION_ERROR" :validation-error, "INSTANCE_FAILURE" :instance-failure, "CLUSTER_TERMINATED" :cluster-terminated} input))

(clojure.core/defn- deser-xml-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string coll))) input))

(clojure.core/defn- deser-auto-scaling-policy-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-auto-scaling-policy-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-auto-scaling-policy-state-change-reason (input "StateChangeReason")))))

(clojure.core/defn- deser-non-negative-double [input] input)

(clojure.core/defn- deser-ebs-block-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeSpecification") (clojure.core/assoc :volume-specification (deser-volume-specification (input "VolumeSpecification"))) (clojure.core/contains? input "Device") (clojure.core/assoc :device (deser-string (input "Device")))))

(clojure.core/defn- deser-key-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-xml-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-xml-string (input "Value")))))

(clojure.core/defn- deser-instance-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-group coll))) input))

(clojure.core/defn- deser-step-timeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "StartDateTime") (clojure.core/assoc :start-date-time (deser-date (input "StartDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime")))))

(clojure.core/defn- deser-step-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-step-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-script-bootstrap-action-config [input] (clojure.core/cond-> {:path (deser-xml-string (input "Path"))} (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-xml-string-list (input "Args")))))

(clojure.core/defn- deser-supported-products-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-256 coll))) input))

(clojure.core/defn- deser-cancel-steps-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cancel-steps-info coll))) input))

(clojure.core/defn- deser-scaling-action [input] (clojure.core/cond-> {:simple-scaling-policy-configuration (deser-simple-scaling-policy-configuration (input "SimpleScalingPolicyConfiguration"))} (clojure.core/contains? input "Market") (clojure.core/assoc :market (deser-market-type (input "Market")))))

(clojure.core/defn- deser-step-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-step-detail coll))) input))

(clojure.core/defn- deser-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-configuration coll))) input))

(clojure.core/defn- deser-kerberos-attributes [input] (clojure.core/cond-> {:realm (deser-xml-string-max-len-256 (input "Realm")), :kdc-admin-password (deser-xml-string-max-len-256 (input "KdcAdminPassword"))} (clojure.core/contains? input "CrossRealmTrustPrincipalPassword") (clojure.core/assoc :cross-realm-trust-principal-password (deser-xml-string-max-len-256 (input "CrossRealmTrustPrincipalPassword"))) (clojure.core/contains? input "ADDomainJoinUser") (clojure.core/assoc :ad-domain-join-user (deser-xml-string-max-len-256 (input "ADDomainJoinUser"))) (clojure.core/contains? input "ADDomainJoinPassword") (clojure.core/assoc :ad-domain-join-password (deser-xml-string-max-len-256 (input "ADDomainJoinPassword")))))

(clojure.core/defn- deser-bootstrap-action-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bootstrap-action-detail coll))) input))

(clojure.core/defn- deser-shrink-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "DecommissionTimeout") (clojure.core/assoc :decommission-timeout (deser-integer (input "DecommissionTimeout"))) (clojure.core/contains? input "InstanceResizePolicy") (clojure.core/assoc :instance-resize-policy (deser-instance-resize-policy (input "InstanceResizePolicy")))))

(clojure.core/defn- deser-instance-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "BidPrice") (clojure.core/assoc :bid-price (deser-string (input "BidPrice"))) (clojure.core/contains? input "InstanceGroupType") (clojure.core/assoc :instance-group-type (deser-instance-group-type (input "InstanceGroupType"))) (clojure.core/contains? input "EbsOptimized") (clojure.core/assoc :ebs-optimized (deser-boolean-object (input "EbsOptimized"))) (clojure.core/contains? input "ShrinkPolicy") (clojure.core/assoc :shrink-policy (deser-shrink-policy (input "ShrinkPolicy"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "Configurations") (clojure.core/assoc :configurations (deser-configuration-list (input "Configurations"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-instance-group-status (input "Status"))) (clojure.core/contains? input "RunningInstanceCount") (clojure.core/assoc :running-instance-count (deser-integer (input "RunningInstanceCount"))) (clojure.core/contains? input "AutoScalingPolicy") (clojure.core/assoc :auto-scaling-policy (deser-auto-scaling-policy-description (input "AutoScalingPolicy"))) (clojure.core/contains? input "EbsBlockDevices") (clojure.core/assoc :ebs-block-devices (deser-ebs-block-device-list (input "EbsBlockDevices"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "RequestedInstanceCount") (clojure.core/assoc :requested-instance-count (deser-integer (input "RequestedInstanceCount"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-instance-group-id (input "Id"))) (clojure.core/contains? input "Market") (clojure.core/assoc :market (deser-market-type (input "Market")))))

(clojure.core/defn- deser-instance-type [input] input)

(clojure.core/defn- deser-step-execution-state [input] (clojure.core/get {"PENDING" :pending, "RUNNING" :running, "CONTINUE" :continue, "COMPLETED" :completed, "CANCELLED" :cancelled, "FAILED" :failed, "INTERRUPTED" :interrupted} input))

(clojure.core/defn- deser-key-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-value coll))) input))

(clojure.core/defn- deser-job-flow-execution-status-detail [input] (clojure.core/cond-> {:state (deser-job-flow-execution-state (input "State")), :creation-date-time (deser-date (input "CreationDateTime"))} (clojure.core/contains? input "StartDateTime") (clojure.core/assoc :start-date-time (deser-date (input "StartDateTime"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime"))) (clojure.core/contains? input "LastStateChangeReason") (clojure.core/assoc :last-state-change-reason (deser-xml-string (input "LastStateChangeReason")))))

(clojure.core/defn- deser-auto-scaling-policy-state [input] (clojure.core/get {"PENDING" :pending, "ATTACHING" :attaching, "ATTACHED" :attached, "DETACHING" :detaching, "DETACHED" :detached, "FAILED" :failed} input))

(clojure.core/defn- deser-xml-string-max-len-256 [input] input)

(clojure.core/defn- deser-scale-down-behavior [input] (clojure.core/get {"TERMINATE_AT_INSTANCE_HOUR" :terminate-at-instance-hour, "TERMINATE_AT_TASK_COMPLETION" :terminate-at-task-completion} input))

(clojure.core/defn- deser-repo-upgrade-on-boot [input] (clojure.core/get {"SECURITY" :security, "NONE" :none} input))

(clojure.core/defn- deser-marker [input] input)

(clojure.core/defn- deser-job-flow-detail [input] (clojure.core/cond-> {:job-flow-id (deser-xml-string-max-len-256 (input "JobFlowId")), :name (deser-xml-string-max-len-256 (input "Name")), :execution-status-detail (deser-job-flow-execution-status-detail (input "ExecutionStatusDetail")), :instances (deser-job-flow-instances-detail (input "Instances"))} (clojure.core/contains? input "ServiceRole") (clojure.core/assoc :service-role (deser-xml-string (input "ServiceRole"))) (clojure.core/contains? input "AutoScalingRole") (clojure.core/assoc :auto-scaling-role (deser-xml-string (input "AutoScalingRole"))) (clojure.core/contains? input "JobFlowRole") (clojure.core/assoc :job-flow-role (deser-xml-string (input "JobFlowRole"))) (clojure.core/contains? input "LogUri") (clojure.core/assoc :log-uri (deser-xml-string (input "LogUri"))) (clojure.core/contains? input "ScaleDownBehavior") (clojure.core/assoc :scale-down-behavior (deser-scale-down-behavior (input "ScaleDownBehavior"))) (clojure.core/contains? input "VisibleToAllUsers") (clojure.core/assoc :visible-to-all-users (deser-boolean (input "VisibleToAllUsers"))) (clojure.core/contains? input "Steps") (clojure.core/assoc :steps (deser-step-detail-list (input "Steps"))) (clojure.core/contains? input "SupportedProducts") (clojure.core/assoc :supported-products (deser-supported-products-list (input "SupportedProducts"))) (clojure.core/contains? input "BootstrapActions") (clojure.core/assoc :bootstrap-actions (deser-bootstrap-action-detail-list (input "BootstrapActions"))) (clojure.core/contains? input "AmiVersion") (clojure.core/assoc :ami-version (deser-xml-string-max-len-256 (input "AmiVersion")))))

(clojure.core/defn- deser-ec-2-instance-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "EmrManagedSlaveSecurityGroup") (clojure.core/assoc :emr-managed-slave-security-group (deser-string (input "EmrManagedSlaveSecurityGroup"))) (clojure.core/contains? input "RequestedEc2SubnetIds") (clojure.core/assoc :requested-ec-2-subnet-ids (deser-xml-string-max-len-256-list (input "RequestedEc2SubnetIds"))) (clojure.core/contains? input "Ec2AvailabilityZone") (clojure.core/assoc :ec-2-availability-zone (deser-string (input "Ec2AvailabilityZone"))) (clojure.core/contains? input "Ec2KeyName") (clojure.core/assoc :ec-2-key-name (deser-string (input "Ec2KeyName"))) (clojure.core/contains? input "ServiceAccessSecurityGroup") (clojure.core/assoc :service-access-security-group (deser-string (input "ServiceAccessSecurityGroup"))) (clojure.core/contains? input "AdditionalSlaveSecurityGroups") (clojure.core/assoc :additional-slave-security-groups (deser-string-list (input "AdditionalSlaveSecurityGroups"))) (clojure.core/contains? input "EmrManagedMasterSecurityGroup") (clojure.core/assoc :emr-managed-master-security-group (deser-string (input "EmrManagedMasterSecurityGroup"))) (clojure.core/contains? input "Ec2SubnetId") (clojure.core/assoc :ec-2-subnet-id (deser-string (input "Ec2SubnetId"))) (clojure.core/contains? input "AdditionalMasterSecurityGroups") (clojure.core/assoc :additional-master-security-groups (deser-string-list (input "AdditionalMasterSecurityGroups"))) (clojure.core/contains? input "RequestedEc2AvailabilityZones") (clojure.core/assoc :requested-ec-2-availability-zones (deser-xml-string-max-len-256-list (input "RequestedEc2AvailabilityZones"))) (clojure.core/contains? input "IamInstanceProfile") (clojure.core/assoc :iam-instance-profile (deser-string (input "IamInstanceProfile")))))

(clojure.core/defn- deser-whole-number [input] input)

(clojure.core/defn- deser-step-config [input] (clojure.core/cond-> {:name (deser-xml-string-max-len-256 (input "Name")), :hadoop-jar-step (deser-hadoop-jar-step-config (input "HadoopJarStep"))} (clojure.core/contains? input "ActionOnFailure") (clojure.core/assoc :action-on-failure (deser-action-on-failure (input "ActionOnFailure")))))

(clojure.core/defn- deser-step-detail [input] (clojure.core/cond-> {:step-config (deser-step-config (input "StepConfig")), :execution-status-detail (deser-step-execution-status-detail (input "ExecutionStatusDetail"))}))

(clojure.core/defn- deser-comparison-operator [input] (clojure.core/get {"GREATER_THAN_OR_EQUAL" :greater-than-or-equal, "GREATER_THAN" :greater-than, "LESS_THAN" :less-than, "LESS_THAN_OR_EQUAL" :less-than-or-equal} input))

(clojure.core/defn- deser-cluster-id [input] input)

(clojure.core/defn- deser-hadoop-jar-step-config [input] (clojure.core/cond-> {:jar (deser-xml-string (input "Jar"))} (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-key-value-list (input "Properties"))) (clojure.core/contains? input "MainClass") (clojure.core/assoc :main-class (deser-xml-string (input "MainClass"))) (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-xml-string-list (input "Args")))))

(clojure.core/defn- deser-hadoop-step-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "Jar") (clojure.core/assoc :jar (deser-string (input "Jar"))) (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-string-map (input "Properties"))) (clojure.core/contains? input "MainClass") (clojure.core/assoc :main-class (deser-string (input "MainClass"))) (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-string-list (input "Args")))))

(clojure.core/defn- deser-instance-fleet [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceTypeSpecifications") (clojure.core/assoc :instance-type-specifications (deser-instance-type-specification-list (input "InstanceTypeSpecifications"))) (clojure.core/contains? input "TargetOnDemandCapacity") (clojure.core/assoc :target-on-demand-capacity (deser-whole-number (input "TargetOnDemandCapacity"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-instance-fleet-status (input "Status"))) (clojure.core/contains? input "TargetSpotCapacity") (clojure.core/assoc :target-spot-capacity (deser-whole-number (input "TargetSpotCapacity"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-xml-string-max-len-256 (input "Name"))) (clojure.core/contains? input "InstanceFleetType") (clojure.core/assoc :instance-fleet-type (deser-instance-fleet-type (input "InstanceFleetType"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-instance-fleet-id (input "Id"))) (clojure.core/contains? input "ProvisionedSpotCapacity") (clojure.core/assoc :provisioned-spot-capacity (deser-whole-number (input "ProvisionedSpotCapacity"))) (clojure.core/contains? input "LaunchSpecifications") (clojure.core/assoc :launch-specifications (deser-instance-fleet-provisioning-specifications (input "LaunchSpecifications"))) (clojure.core/contains? input "ProvisionedOnDemandCapacity") (clojure.core/assoc :provisioned-on-demand-capacity (deser-whole-number (input "ProvisionedOnDemandCapacity")))))

(clojure.core/defn- deser-security-configuration-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-configuration-summary coll))) input))

(clojure.core/defn- deser-instance-group-state [input] (clojure.core/get {"BOOTSTRAPPING" :bootstrapping, "ARRESTED" :arrested, "PROVISIONING" :provisioning, "TERMINATED" :terminated, "RESIZING" :resizing, "ENDED" :ended, "SHUTTING_DOWN" :shutting-down, "TERMINATING" :terminating, "SUSPENDED" :suspended, "RUNNING" :running} input))

(clojure.core/defn- deser-xml-string-max-len-256-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-256 coll))) input))

(clojure.core/defn- deser-instance-fleet-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-fleet coll))) input))

(clojure.core/defn- deser-instance-resize-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstancesToTerminate") (clojure.core/assoc :instances-to-terminate (deser-ec-2-instance-ids-list (input "InstancesToTerminate"))) (clojure.core/contains? input "InstancesToProtect") (clojure.core/assoc :instances-to-protect (deser-ec-2-instance-ids-list (input "InstancesToProtect"))) (clojure.core/contains? input "InstanceTerminationTimeout") (clojure.core/assoc :instance-termination-timeout (deser-integer (input "InstanceTerminationTimeout")))))

(clojure.core/defn- deser-action-on-failure [input] (clojure.core/get {"TERMINATE_JOB_FLOW" :terminate-job-flow, "TERMINATE_CLUSTER" :terminate-cluster, "CANCEL_AND_WAIT" :cancel-and-wait, "CONTINUE" :continue} input))

(clojure.core/defn- deser-cluster-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-cluster-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-cluster-status (input "Status"))) (clojure.core/contains? input "NormalizedInstanceHours") (clojure.core/assoc :normalized-instance-hours (deser-integer (input "NormalizedInstanceHours")))))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-instance-fleet-id [input] input)

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-auto-scaling-policy-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-auto-scaling-policy-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-instance-group-timeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime")))))

(clojure.core/defn- deser-spot-provisioning-specification [input] (clojure.core/cond-> {:timeout-duration-minutes (deser-whole-number (input "TimeoutDurationMinutes")), :timeout-action (deser-spot-provisioning-timeout-action (input "TimeoutAction"))} (clojure.core/contains? input "BlockDurationMinutes") (clojure.core/assoc :block-duration-minutes (deser-whole-number (input "BlockDurationMinutes")))))

(clojure.core/defn- deser-step [input] (clojure.core/cond-> {} (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-step-id (input "Id"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Config") (clojure.core/assoc :config (deser-hadoop-step-config (input "Config"))) (clojure.core/contains? input "ActionOnFailure") (clojure.core/assoc :action-on-failure (deser-action-on-failure (input "ActionOnFailure"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-step-status (input "Status")))))

(clojure.core/defn- deser-step-state-change-reason-code [input] (clojure.core/get {"NONE" :none} input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-cluster-state [input] (clojure.core/get {"STARTING" :starting, "BOOTSTRAPPING" :bootstrapping, "RUNNING" :running, "WAITING" :waiting, "TERMINATING" :terminating, "TERMINATED" :terminated, "TERMINATED_WITH_ERRORS" :terminated-with-errors} input))

(clojure.core/defn- deser-xml-string [input] input)

(clojure.core/defn- deser-instance-fleet-timeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime")))))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "ServiceRole") (clojure.core/assoc :service-role (deser-string (input "ServiceRole"))) (clojure.core/contains? input "AutoScalingRole") (clojure.core/assoc :auto-scaling-role (deser-xml-string (input "AutoScalingRole"))) (clojure.core/contains? input "CustomAmiId") (clojure.core/assoc :custom-ami-id (deser-xml-string-max-len-256 (input "CustomAmiId"))) (clojure.core/contains? input "LogUri") (clojure.core/assoc :log-uri (deser-string (input "LogUri"))) (clojure.core/contains? input "KerberosAttributes") (clojure.core/assoc :kerberos-attributes (deser-kerberos-attributes (input "KerberosAttributes"))) (clojure.core/contains? input "ScaleDownBehavior") (clojure.core/assoc :scale-down-behavior (deser-scale-down-behavior (input "ScaleDownBehavior"))) (clojure.core/contains? input "RepoUpgradeOnBoot") (clojure.core/assoc :repo-upgrade-on-boot (deser-repo-upgrade-on-boot (input "RepoUpgradeOnBoot"))) (clojure.core/contains? input "Ec2InstanceAttributes") (clojure.core/assoc :ec-2-instance-attributes (deser-ec-2-instance-attributes (input "Ec2InstanceAttributes"))) (clojure.core/contains? input "Configurations") (clojure.core/assoc :configurations (deser-configuration-list (input "Configurations"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags"))) (clojure.core/contains? input "RequestedAmiVersion") (clojure.core/assoc :requested-ami-version (deser-string (input "RequestedAmiVersion"))) (clojure.core/contains? input "VisibleToAllUsers") (clojure.core/assoc :visible-to-all-users (deser-boolean (input "VisibleToAllUsers"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-cluster-status (input "Status"))) (clojure.core/contains? input "NormalizedInstanceHours") (clojure.core/assoc :normalized-instance-hours (deser-integer (input "NormalizedInstanceHours"))) (clojure.core/contains? input "Applications") (clojure.core/assoc :applications (deser-application-list (input "Applications"))) (clojure.core/contains? input "EbsRootVolumeSize") (clojure.core/assoc :ebs-root-volume-size (deser-integer (input "EbsRootVolumeSize"))) (clojure.core/contains? input "InstanceCollectionType") (clojure.core/assoc :instance-collection-type (deser-instance-collection-type (input "InstanceCollectionType"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-xml-string (input "SecurityConfiguration"))) (clojure.core/contains? input "MasterPublicDnsName") (clojure.core/assoc :master-public-dns-name (deser-string (input "MasterPublicDnsName"))) (clojure.core/contains? input "ReleaseLabel") (clojure.core/assoc :release-label (deser-string (input "ReleaseLabel"))) (clojure.core/contains? input "TerminationProtected") (clojure.core/assoc :termination-protected (deser-boolean (input "TerminationProtected"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "RunningAmiVersion") (clojure.core/assoc :running-ami-version (deser-string (input "RunningAmiVersion"))) (clojure.core/contains? input "AutoTerminate") (clojure.core/assoc :auto-terminate (deser-boolean (input "AutoTerminate"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-cluster-id (input "Id")))))

(clojure.core/defn- deser-cluster-timeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime")))))

(clojure.core/defn- deser-auto-scaling-policy-description [input] (clojure.core/cond-> {} (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-auto-scaling-policy-status (input "Status"))) (clojure.core/contains? input "Constraints") (clojure.core/assoc :constraints (deser-scaling-constraints (input "Constraints"))) (clojure.core/contains? input "Rules") (clojure.core/assoc :rules (deser-scaling-rule-list (input "Rules")))))

(clojure.core/defn- deser-scaling-rule-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-rule coll))) input))

(clojure.core/defn- deser-step-ids-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-256 coll))) input))

(clojure.core/defn- deser-instance-group-id [input] input)

(clojure.core/defn- deser-instance-type-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "WeightedCapacity") (clojure.core/assoc :weighted-capacity (deser-whole-number (input "WeightedCapacity"))) (clojure.core/contains? input "BidPrice") (clojure.core/assoc :bid-price (deser-xml-string-max-len-256 (input "BidPrice"))) (clojure.core/contains? input "BidPriceAsPercentageOfOnDemandPrice") (clojure.core/assoc :bid-price-as-percentage-of-on-demand-price (deser-non-negative-double (input "BidPriceAsPercentageOfOnDemandPrice"))) (clojure.core/contains? input "Configurations") (clojure.core/assoc :configurations (deser-configuration-list (input "Configurations"))) (clojure.core/contains? input "EbsBlockDevices") (clojure.core/assoc :ebs-block-devices (deser-ebs-block-device-list (input "EbsBlockDevices"))) (clojure.core/contains? input "EbsOptimized") (clojure.core/assoc :ebs-optimized (deser-boolean-object (input "EbsOptimized")))))

(clojure.core/defn- deser-adjustment-type [input] (clojure.core/get {"CHANGE_IN_CAPACITY" :change-in-capacity, "PERCENT_CHANGE_IN_CAPACITY" :percent-change-in-capacity, "EXACT_CAPACITY" :exact-capacity} input))

(clojure.core/defn- deser-cluster-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-cluster-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-cluster-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "Timeline") (clojure.core/assoc :timeline (deser-cluster-timeline (input "Timeline")))))

(clojure.core/defn- deser-ebs-volume-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ebs-volume coll))) input))

(clojure.core/defn- deser-ebs-block-device-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ebs-block-device coll))) input))

(clojure.core/defn- deser-cluster-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-cluster-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-instance-type-specification-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-type-specification coll))) input))

(clojure.core/defn- deser-failure-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "Reason") (clojure.core/assoc :reason (deser-string (input "Reason"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message"))) (clojure.core/contains? input "LogFile") (clojure.core/assoc :log-file (deser-string (input "LogFile")))))

(clojure.core/defn- deser-job-flow-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-flow-detail coll))) input))

(clojure.core/defn- deser-metric-dimension [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-volume-specification [input] (clojure.core/cond-> {:volume-type (deser-string (input "VolumeType")), :size-in-gb (deser-integer (input "SizeInGB"))} (clojure.core/contains? input "Iops") (clojure.core/assoc :iops (deser-integer (input "Iops")))))

(clojure.core/defn- deser-bootstrap-action-config [input] (clojure.core/cond-> {:name (deser-xml-string-max-len-256 (input "Name")), :script-bootstrap-action (deser-script-bootstrap-action-config (input "ScriptBootstrapAction"))}))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-step-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-step-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-step-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "FailureDetails") (clojure.core/assoc :failure-details (deser-failure-details (input "FailureDetails"))) (clojure.core/contains? input "Timeline") (clojure.core/assoc :timeline (deser-step-timeline (input "Timeline")))))

(clojure.core/defn- deser-metric-dimension-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-dimension coll))) input))

(clojure.core/defn- deser-instance-collection-type [input] (clojure.core/get {"INSTANCE_FLEET" :instance-fleet, "INSTANCE_GROUP" :instance-group} input))

(clojure.core/defn- deser-instance-group-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-instance-group-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-instance-group-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "Timeline") (clojure.core/assoc :timeline (deser-instance-group-timeline (input "Timeline")))))

(clojure.core/defn- deser-instance-fleet-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-instance-fleet-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-instance-fleet-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "Timeline") (clojure.core/assoc :timeline (deser-instance-fleet-timeline (input "Timeline")))))

(clojure.core/defn- deser-spot-provisioning-timeout-action [input] (clojure.core/get {"SWITCH_TO_ON_DEMAND" :switch-to-on-demand, "TERMINATE_CLUSTER" :terminate-cluster} input))

(clojure.core/defn- deser-command [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "ScriptPath") (clojure.core/assoc :script-path (deser-string (input "ScriptPath"))) (clojure.core/contains? input "Args") (clojure.core/assoc :args (deser-string-list (input "Args")))))

(clojure.core/defn- deser-security-configuration-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-xml-string (input "Name"))) (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime")))))

(clojure.core/defn- deser-instance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-instance-group-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-instance-group-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-cluster-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster-summary coll))) input))

(clojure.core/defn- deser-command-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-command coll))) input))

(clojure.core/defn- deser-application-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application coll))) input))

(clojure.core/defn- deser-instance-state [input] (clojure.core/get {"AWAITING_FULFILLMENT" :awaiting-fulfillment, "PROVISIONING" :provisioning, "BOOTSTRAPPING" :bootstrapping, "RUNNING" :running, "TERMINATED" :terminated} input))

(clojure.core/defn- deser-job-flow-execution-state [input] (clojure.core/get {"STARTING" :starting, "BOOTSTRAPPING" :bootstrapping, "RUNNING" :running, "WAITING" :waiting, "SHUTTING_DOWN" :shutting-down, "TERMINATED" :terminated, "COMPLETED" :completed, "FAILED" :failed} input))

(clojure.core/defn- deser-instance-group-ids-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-256 coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-string (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-string (input "Value")))))

(clojure.core/defn- deser-cloud-watch-alarm-definition [input] (clojure.core/cond-> {:comparison-operator (deser-comparison-operator (input "ComparisonOperator")), :metric-name (deser-string (input "MetricName")), :period (deser-integer (input "Period")), :threshold (deser-non-negative-double (input "Threshold"))} (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-unit (input "Unit"))) (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-metric-dimension-list (input "Dimensions"))) (clojure.core/contains? input "Namespace") (clojure.core/assoc :namespace (deser-string (input "Namespace"))) (clojure.core/contains? input "EvaluationPeriods") (clojure.core/assoc :evaluation-periods (deser-integer (input "EvaluationPeriods"))) (clojure.core/contains? input "Statistic") (clojure.core/assoc :statistic (deser-statistic (input "Statistic")))))

(clojure.core/defn- deser-instance-group-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-group-detail coll))) input))

(clojure.core/defn- deser-instance-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-instance-state (input "State"))) (clojure.core/contains? input "StateChangeReason") (clojure.core/assoc :state-change-reason (deser-instance-state-change-reason (input "StateChangeReason"))) (clojure.core/contains? input "Timeline") (clojure.core/assoc :timeline (deser-instance-timeline (input "Timeline")))))

(clojure.core/defn- deser-market-type [input] (clojure.core/get {"ON_DEMAND" :on-demand, "SPOT" :spot} input))

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "PublicDnsName") (clojure.core/assoc :public-dns-name (deser-string (input "PublicDnsName"))) (clojure.core/contains? input "EbsVolumes") (clojure.core/assoc :ebs-volumes (deser-ebs-volume-list (input "EbsVolumes"))) (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-instance-status (input "Status"))) (clojure.core/contains? input "InstanceFleetId") (clojure.core/assoc :instance-fleet-id (deser-instance-fleet-id (input "InstanceFleetId"))) (clojure.core/contains? input "PrivateDnsName") (clojure.core/assoc :private-dns-name (deser-string (input "PrivateDnsName"))) (clojure.core/contains? input "InstanceGroupId") (clojure.core/assoc :instance-group-id (deser-string (input "InstanceGroupId"))) (clojure.core/contains? input "Ec2InstanceId") (clojure.core/assoc :ec-2-instance-id (deser-instance-id (input "Ec2InstanceId"))) (clojure.core/contains? input "PublicIpAddress") (clojure.core/assoc :public-ip-address (deser-string (input "PublicIpAddress"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-instance-id (input "Id"))) (clojure.core/contains? input "Market") (clojure.core/assoc :market (deser-market-type (input "Market"))) (clojure.core/contains? input "PrivateIpAddress") (clojure.core/assoc :private-ip-address (deser-string (input "PrivateIpAddress")))))

(clojure.core/defn- deser-instance-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-instance-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-scaling-rule [input] (clojure.core/cond-> {:name (deser-string (input "Name")), :action (deser-scaling-action (input "Action")), :trigger (deser-scaling-trigger (input "Trigger"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-string (input "Description")))))

(clojure.core/defn- deser-ebs-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "Device") (clojure.core/assoc :device (deser-string (input "Device"))) (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-string (input "VolumeId")))))

(clojure.core/defn- deser-cancel-steps-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "StepId") (clojure.core/assoc :step-id (deser-step-id (input "StepId"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-cancel-steps-request-status (input "Status"))) (clojure.core/contains? input "Reason") (clojure.core/assoc :reason (deser-string (input "Reason")))))

(clojure.core/defn- deser-ec-2-instance-ids-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-id coll))) input))

(clojure.core/defn- deser-scaling-constraints [input] (clojure.core/cond-> {:min-capacity (deser-integer (input "MinCapacity")), :max-capacity (deser-integer (input "MaxCapacity"))}))

(clojure.core/defn- deser-scaling-trigger [input] (clojure.core/cond-> {:cloud-watch-alarm-definition (deser-cloud-watch-alarm-definition (input "CloudWatchAlarmDefinition"))}))

(clojure.core/defn- deser-instance-fleet-type [input] (clojure.core/get {"MASTER" :master, "CORE" :core, "TASK" :task} input))

(clojure.core/defn- deser-step-id [input] input)

(clojure.core/defn- deser-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "Classification") (clojure.core/assoc :classification (deser-string (input "Classification"))) (clojure.core/contains? input "Configurations") (clojure.core/assoc :configurations (deser-configuration-list (input "Configurations"))) (clojure.core/contains? input "Properties") (clojure.core/assoc :properties (deser-string-map (input "Properties")))))

(clojure.core/defn- deser-boolean-object [input] input)

(clojure.core/defn- deser-step-state [input] (clojure.core/get {"PENDING" :pending, "CANCEL_PENDING" :cancel-pending, "RUNNING" :running, "COMPLETED" :completed, "CANCELLED" :cancelled, "FAILED" :failed, "INTERRUPTED" :interrupted} input))

(clojure.core/defn- deser-job-flow-instances-detail [input] (clojure.core/cond-> {:master-instance-type (deser-instance-type (input "MasterInstanceType")), :slave-instance-type (deser-instance-type (input "SlaveInstanceType")), :instance-count (deser-integer (input "InstanceCount"))} (clojure.core/contains? input "Placement") (clojure.core/assoc :placement (deser-placement-type (input "Placement"))) (clojure.core/contains? input "HadoopVersion") (clojure.core/assoc :hadoop-version (deser-xml-string-max-len-256 (input "HadoopVersion"))) (clojure.core/contains? input "NormalizedInstanceHours") (clojure.core/assoc :normalized-instance-hours (deser-integer (input "NormalizedInstanceHours"))) (clojure.core/contains? input "KeepJobFlowAliveWhenNoSteps") (clojure.core/assoc :keep-job-flow-alive-when-no-steps (deser-boolean (input "KeepJobFlowAliveWhenNoSteps"))) (clojure.core/contains? input "Ec2KeyName") (clojure.core/assoc :ec-2-key-name (deser-xml-string-max-len-256 (input "Ec2KeyName"))) (clojure.core/contains? input "MasterPublicDnsName") (clojure.core/assoc :master-public-dns-name (deser-xml-string (input "MasterPublicDnsName"))) (clojure.core/contains? input "Ec2SubnetId") (clojure.core/assoc :ec-2-subnet-id (deser-xml-string-max-len-256 (input "Ec2SubnetId"))) (clojure.core/contains? input "MasterInstanceId") (clojure.core/assoc :master-instance-id (deser-xml-string (input "MasterInstanceId"))) (clojure.core/contains? input "TerminationProtected") (clojure.core/assoc :termination-protected (deser-boolean (input "TerminationProtected"))) (clojure.core/contains? input "InstanceGroups") (clojure.core/assoc :instance-groups (deser-instance-group-detail-list (input "InstanceGroups")))))

(clojure.core/defn- deser-cancel-steps-request-status [input] (clojure.core/get {"SUBMITTED" :submitted, "FAILED" :failed} input))

(clojure.core/defn- deser-instance-role-type [input] (clojure.core/get {"MASTER" :master, "CORE" :core, "TASK" :task} input))

(clojure.core/defn- deser-statistic [input] (clojure.core/get {"SAMPLE_COUNT" :sample-count, "AVERAGE" :average, "SUM" :sum, "MINIMUM" :minimum, "MAXIMUM" :maximum} input))

(clojure.core/defn- deser-instance-fleet-state-change-reason [input] (clojure.core/cond-> {} (clojure.core/contains? input "Code") (clojure.core/assoc :code (deser-instance-fleet-state-change-reason-code (input "Code"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-string (input "Message")))))

(clojure.core/defn- deser-step-execution-status-detail [input] (clojure.core/cond-> {:state (deser-step-execution-state (input "State")), :creation-date-time (deser-date (input "CreationDateTime"))} (clojure.core/contains? input "StartDateTime") (clojure.core/assoc :start-date-time (deser-date (input "StartDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime"))) (clojure.core/contains? input "LastStateChangeReason") (clojure.core/assoc :last-state-change-reason (deser-xml-string (input "LastStateChangeReason")))))

(clojure.core/defn- deser-cluster-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "VALIDATION_ERROR" :validation-error, "INSTANCE_FAILURE" :instance-failure, "INSTANCE_FLEET_TIMEOUT" :instance-fleet-timeout, "BOOTSTRAP_FAILURE" :bootstrap-failure, "USER_REQUEST" :user-request, "STEP_FAILURE" :step-failure, "ALL_STEPS_COMPLETED" :all-steps-completed} input))

(clojure.core/defn- deser-simple-scaling-policy-configuration [input] (clojure.core/cond-> {:scaling-adjustment (deser-integer (input "ScalingAdjustment"))} (clojure.core/contains? input "AdjustmentType") (clojure.core/assoc :adjustment-type (deser-adjustment-type (input "AdjustmentType"))) (clojure.core/contains? input "CoolDown") (clojure.core/assoc :cool-down (deser-integer (input "CoolDown")))))

(clojure.core/defn- deser-instance-timeline [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime"))) (clojure.core/contains? input "ReadyDateTime") (clojure.core/assoc :ready-date-time (deser-date (input "ReadyDateTime"))) (clojure.core/contains? input "EndDateTime") (clojure.core/assoc :end-date-time (deser-date (input "EndDateTime")))))

(clojure.core/defn- deser-instance-group-state-change-reason-code [input] (clojure.core/get {"INTERNAL_ERROR" :internal-error, "VALIDATION_ERROR" :validation-error, "INSTANCE_FAILURE" :instance-failure, "CLUSTER_TERMINATED" :cluster-terminated} input))

(clojure.core/defn- deser-instance-fleet-provisioning-specifications [input] (clojure.core/cond-> {:spot-specification (deser-spot-provisioning-specification (input "SpotSpecification"))}))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-add-job-flow-steps-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "StepIds") (clojure.core/assoc :step-ids (deser-step-ids-list (input "StepIds")))))

(clojure.core/defn- deser-invalid-request-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-describe-security-configuration-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-xml-string (input "Name"))) (clojure.core/contains? input "SecurityConfiguration") (clojure.core/assoc :security-configuration (deser-string (input "SecurityConfiguration"))) (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime")))))

(clojure.core/defn- deser-add-tags-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-security-configurations-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "SecurityConfigurations") (clojure.core/assoc :security-configurations (deser-security-configuration-list (input "SecurityConfigurations"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-create-security-configuration-output [input] (clojure.core/cond-> {:name (deser-xml-string (input "Name")), :creation-date-time (deser-date (input "CreationDateTime"))}))

(clojure.core/defn- deser-remove-tags-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-bootstrap-actions-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "BootstrapActions") (clojure.core/assoc :bootstrap-actions (deser-command-list (input "BootstrapActions"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-list-steps-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Steps") (clojure.core/assoc :steps (deser-step-summary-list (input "Steps"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-describe-step-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Step") (clojure.core/assoc :step (deser-step (input "Step")))))

(clojure.core/defn- deser-internal-server-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-error-message (input "Message")))))

(clojure.core/defn- deser-run-job-flow-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobFlowId") (clojure.core/assoc :job-flow-id (deser-xml-string-max-len-256 (input "JobFlowId")))))

(clojure.core/defn- deser-list-instances-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Instances") (clojure.core/assoc :instances (deser-instance-list (input "Instances"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-add-instance-fleet-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-xml-string-max-len-256 (input "ClusterId"))) (clojure.core/contains? input "InstanceFleetId") (clojure.core/assoc :instance-fleet-id (deser-instance-fleet-id (input "InstanceFleetId")))))

(clojure.core/defn- deser-delete-security-configuration-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-instance-fleets-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceFleets") (clojure.core/assoc :instance-fleets (deser-instance-fleet-list (input "InstanceFleets"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-list-instance-groups-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "InstanceGroups") (clojure.core/assoc :instance-groups (deser-instance-group-list (input "InstanceGroups"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-add-instance-groups-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobFlowId") (clojure.core/assoc :job-flow-id (deser-xml-string-max-len-256 (input "JobFlowId"))) (clojure.core/contains? input "InstanceGroupIds") (clojure.core/assoc :instance-group-ids (deser-instance-group-ids-list (input "InstanceGroupIds")))))

(clojure.core/defn- deser-cancel-steps-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "CancelStepsInfoList") (clojure.core/assoc :cancel-steps-info-list (deser-cancel-steps-info-list (input "CancelStepsInfoList")))))

(clojure.core/defn- deser-describe-cluster-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Cluster") (clojure.core/assoc :cluster (deser-cluster (input "Cluster")))))

(clojure.core/defn- deser-internal-server-error [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-list-clusters-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Clusters") (clojure.core/assoc :clusters (deser-cluster-summary-list (input "Clusters"))) (clojure.core/contains? input "Marker") (clojure.core/assoc :marker (deser-marker (input "Marker")))))

(clojure.core/defn- deser-put-auto-scaling-policy-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "ClusterId") (clojure.core/assoc :cluster-id (deser-cluster-id (input "ClusterId"))) (clojure.core/contains? input "InstanceGroupId") (clojure.core/assoc :instance-group-id (deser-instance-group-id (input "InstanceGroupId"))) (clojure.core/contains? input "AutoScalingPolicy") (clojure.core/assoc :auto-scaling-policy (deser-auto-scaling-policy-description (input "AutoScalingPolicy")))))

(clojure.core/defn- deser-remove-auto-scaling-policy-output [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-describe-job-flows-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "JobFlows") (clojure.core/assoc :job-flows (deser-job-flow-detail-list (input "JobFlows")))))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.placement-type/availability-zone (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.placement-type/availability-zones (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/placement-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.placement-type/availability-zone :portkey.aws.elasticmapreduce.placement-type/availability-zones]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.application/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.application/version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.application/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.application/additional-info (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-map))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/application (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.application/name :portkey.aws.elasticmapreduce.application/version :portkey.aws.elasticmapreduce.application/args :portkey.aws.elasticmapreduce.application/additional-info]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.modify-instance-groups-input/instance-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-modify-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/modify-instance-groups-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce.modify-instance-groups-input/instance-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-instances-input/instance-group-types (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-type-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-instances-input/instance-states (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-state-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un [:portkey.aws.elasticmapreduce/instance-group-id :portkey.aws.elasticmapreduce.list-instances-input/instance-group-types :portkey.aws.elasticmapreduce/instance-fleet-id :portkey.aws.elasticmapreduce/instance-fleet-type :portkey.aws.elasticmapreduce.list-instances-input/instance-states :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-job-flow-steps-output/step-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-ids-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-job-flow-steps-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.add-job-flow-steps-output/step-ids]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-state #{"BOOTSTRAPPING" :resizing "PROVISIONING" "TERMINATED" :suspended :running :terminating :terminated "RESIZING" :provisioning :bootstrapping "TERMINATING" "SUSPENDED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/string-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/string))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/bootstrap-action-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/bootstrap-action-config]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/unit #{"KILO_BYTES_PER_SECOND" :tera-bytes :bytes-per-second "PERCENT" "BITS" "COUNT_PER_SECOND" :kilo-bits-per-second :giga-bits :giga-bytes-per-second "MICRO_SECONDS" :milli-seconds "COUNT" "KILO_BITS" "MEGA_BITS" "TERA_BYTES" "GIGA_BITS" "SECONDS" :kilo-bits :mega-bits-per-second "GIGA_BYTES" :bits-per-second "BYTES_PER_SECOND" :mega-bytes-per-second :micro-seconds :kilo-bytes-per-second "GIGA_BITS_PER_SECOND" :kilo-bytes :tera-bits :giga-bytes :seconds :bits "MEGA_BYTES_PER_SECOND" "TERA_BYTES_PER_SECOND" "KILO_BITS_PER_SECOND" "NONE" :mega-bytes :mega-bits "MEGA_BYTES" :tera-bytes-per-second :count :giga-bits-per-second :count-per-second "BITS_PER_SECOND" :bytes "TERA_BITS" "TERA_BITS_PER_SECOND" :tera-bits-per-second "BYTES" :percent "MEGA_BITS_PER_SECOND" "MILLI_SECONDS" :none "GIGA_BYTES_PER_SECOND" "KILO_BYTES"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ec-2-instance-ids-to-terminate-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-id))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-summary-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/step-summary))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-steps-input/step-states (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-state-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-steps-input/step-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-steps-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un [:portkey.aws.elasticmapreduce.list-steps-input/step-states :portkey.aws.elasticmapreduce.list-steps-input/step-ids :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-state-change-reason-code #{:bootstrap-failure :validation-error "VALIDATION_ERROR" :internal-error :instance-failure :cluster-terminated "INTERNAL_ERROR" "CLUSTER_TERMINATED" "BOOTSTRAP_FAILURE" "INSTANCE_FAILURE"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-summary/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-summary/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-summary/config (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/hadoop-step-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-summary/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.step-summary/id :portkey.aws.elasticmapreduce.step-summary/name :portkey.aws.elasticmapreduce.step-summary/config :portkey.aws.elasticmapreduce/action-on-failure :portkey.aws.elasticmapreduce.step-summary/status]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-type #{:task "CORE" "TASK" :core :master "MASTER"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy-state-change-reason-code #{"USER_REQUEST" :cleanup-failure "PROVISION_FAILURE" "CLEANUP_FAILURE" :provision-failure :user-request})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/bid-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/instance-running-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/instance-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-role-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/instance-group-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/last-state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/instance-request-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/start-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-detail/market (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/market-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.instance-group-detail/market :portkey.aws.elasticmapreduce.instance-group-detail/instance-role :portkey.aws.elasticmapreduce/instance-type :portkey.aws.elasticmapreduce.instance-group-detail/instance-request-count :portkey.aws.elasticmapreduce.instance-group-detail/instance-running-count :portkey.aws.elasticmapreduce.instance-group-detail/state :portkey.aws.elasticmapreduce.instance-group-detail/creation-date-time] :opt-un [:portkey.aws.elasticmapreduce.instance-group-detail/bid-price :portkey.aws.elasticmapreduce.instance-group-detail/ready-date-time :portkey.aws.elasticmapreduce.instance-group-detail/instance-group-id :portkey.aws.elasticmapreduce.instance-group-detail/last-state-change-reason :portkey.aws.elasticmapreduce.instance-group-detail/end-date-time :portkey.aws.elasticmapreduce.instance-group-detail/name :portkey.aws.elasticmapreduce.instance-group-detail/start-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/string-map (clojure.spec.alpha/map-of :portkey.aws.elasticmapreduce/string :portkey.aws.elasticmapreduce/string))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-job-flows-input/created-after (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-job-flows-input/created-before (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-job-flows-input/job-flow-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-job-flows-input/job-flow-states (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-execution-state-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-job-flows-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.describe-job-flows-input/created-after :portkey.aws.elasticmapreduce.describe-job-flows-input/created-before :portkey.aws.elasticmapreduce.describe-job-flows-input/job-flow-ids :portkey.aws.elasticmapreduce.describe-job-flows-input/job-flow-states]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-state-change-reason-code #{:validation-error "VALIDATION_ERROR" :internal-error :instance-failure :cluster-terminated "INTERNAL_ERROR" "CLUSTER_TERMINATED" "INSTANCE_FAILURE"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/xml-string-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instance-fleets-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un [:portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/error-code :portkey.aws.elasticmapreduce.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-group-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.auto-scaling-policy-status/state :portkey.aws.elasticmapreduce.auto-scaling-policy-status/state-change-reason]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-type-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-type-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/non-negative-double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-block-device/device (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-block-device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/volume-specification :portkey.aws.elasticmapreduce.ebs-block-device/device]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce/instance-group-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.key-value/key (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.key-value/value (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/key-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.key-value/key :portkey.aws.elasticmapreduce.key-value/value]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-group))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-timeline/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-timeline/start-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-timeline/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-timeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.step-timeline/creation-date-time :portkey.aws.elasticmapreduce.step-timeline/start-date-time :portkey.aws.elasticmapreduce.step-timeline/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.step-state-change-reason/code :portkey.aws.elasticmapreduce.step-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.script-bootstrap-action-config/path (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.script-bootstrap-action-config/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/script-bootstrap-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.script-bootstrap-action-config/path] :opt-un [:portkey.aws.elasticmapreduce.script-bootstrap-action-config/args]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/supported-products-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-configuration/ebs-block-device-configs (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ebs-block-device-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-configuration/ebs-optimized (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean-object))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.ebs-configuration/ebs-block-device-configs :portkey.aws.elasticmapreduce.ebs-configuration/ebs-optimized]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cancel-steps-info-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/cancel-steps-info))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-action/market (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/market-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scaling-action (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/simple-scaling-policy-configuration] :opt-un [:portkey.aws.elasticmapreduce.scaling-action/market]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-detail-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/step-detail))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/configuration-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/configuration))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-block-device-config/volumes-per-instance (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-block-device-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/volume-specification] :opt-un [:portkey.aws.elasticmapreduce.ebs-block-device-config/volumes-per-instance]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.kerberos-attributes/realm (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.kerberos-attributes/kdc-admin-password (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.kerberos-attributes/cross-realm-trust-principal-password (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.kerberos-attributes/ad-domain-join-user (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.kerberos-attributes/ad-domain-join-password (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/kerberos-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.kerberos-attributes/realm :portkey.aws.elasticmapreduce.kerberos-attributes/kdc-admin-password] :opt-un [:portkey.aws.elasticmapreduce.kerberos-attributes/cross-realm-trust-principal-password :portkey.aws.elasticmapreduce.kerberos-attributes/ad-domain-join-user :portkey.aws.elasticmapreduce.kerberos-attributes/ad-domain-join-password]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/bootstrap-action-detail-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/bootstrap-action-detail))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instance-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un [:portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/bid-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/instance-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-role-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-config/market (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/market-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.instance-group-config/instance-role :portkey.aws.elasticmapreduce/instance-type :portkey.aws.elasticmapreduce.instance-group-config/instance-count] :opt-un [:portkey.aws.elasticmapreduce.instance-group-config/bid-price :portkey.aws.elasticmapreduce/ebs-configuration :portkey.aws.elasticmapreduce.instance-group-config/configurations :portkey.aws.elasticmapreduce/auto-scaling-policy :portkey.aws.elasticmapreduce.instance-group-config/name :portkey.aws.elasticmapreduce.instance-group-config/market]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.shrink-policy/decommission-timeout (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/shrink-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.shrink-policy/decommission-timeout :portkey.aws.elasticmapreduce/instance-resize-policy]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/bid-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/ebs-optimized (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean-object))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/running-instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/auto-scaling-policy (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-description))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/ebs-block-devices (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ebs-block-device-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/requested-instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group/market (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/market-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-group/bid-price :portkey.aws.elasticmapreduce/instance-group-type :portkey.aws.elasticmapreduce.instance-group/ebs-optimized :portkey.aws.elasticmapreduce/shrink-policy :portkey.aws.elasticmapreduce/instance-type :portkey.aws.elasticmapreduce.instance-group/configurations :portkey.aws.elasticmapreduce.instance-group/status :portkey.aws.elasticmapreduce.instance-group/running-instance-count :portkey.aws.elasticmapreduce.instance-group/auto-scaling-policy :portkey.aws.elasticmapreduce.instance-group/ebs-block-devices :portkey.aws.elasticmapreduce.instance-group/name :portkey.aws.elasticmapreduce.instance-group/requested-instance-count :portkey.aws.elasticmapreduce.instance-group/id :portkey.aws.elasticmapreduce.instance-group/market]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-execution-state #{"INTERRUPTED" "CONTINUE" "COMPLETED" :continue :pending :completed "PENDING" :running :cancelled "FAILED" :interrupted "CANCELLED" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/key-value-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/key-value))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-execution-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/start-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/last-state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-execution-status-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.job-flow-execution-status-detail/state :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/creation-date-time] :opt-un [:portkey.aws.elasticmapreduce.job-flow-execution-status-detail/start-date-time :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/ready-date-time :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/end-date-time :portkey.aws.elasticmapreduce.job-flow-execution-status-detail/last-state-change-reason]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy-state #{"ATTACHING" :pending :detached "PENDING" "ATTACHED" :attaching "FAILED" "DETACHING" "DETACHED" :attached :detaching :failed})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/put-auto-scaling-policy-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce/instance-group-id :portkey.aws.elasticmapreduce/auto-scaling-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-state-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-state))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/xml-string-max-len-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scale-down-behavior #{:terminate-at-instance-hour "TERMINATE_AT_INSTANCE_HOUR" "TERMINATE_AT_TASK_COMPLETION" :terminate-at-task-completion})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/new-supported-products-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/supported-product-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/repo-upgrade-on-boot #{:security "NONE" "SECURITY" :none})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-security-configuration-output/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-security-configuration-output/security-configuration (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-security-configuration-output/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-security-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.describe-security-configuration-output/name :portkey.aws.elasticmapreduce.describe-security-configuration-output/security-configuration :portkey.aws.elasticmapreduce.describe-security-configuration-output/creation-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/service-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/execution-status-detail (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-execution-status-detail))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/auto-scaling-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/job-flow-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/log-uri (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/visible-to-all-users (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-detail-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/supported-products (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/supported-products-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/job-flow-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/bootstrap-actions (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/bootstrap-action-detail-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/instances (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-instances-detail))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-detail/ami-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.job-flow-detail/job-flow-id :portkey.aws.elasticmapreduce.job-flow-detail/name :portkey.aws.elasticmapreduce.job-flow-detail/execution-status-detail :portkey.aws.elasticmapreduce.job-flow-detail/instances] :opt-un [:portkey.aws.elasticmapreduce.job-flow-detail/service-role :portkey.aws.elasticmapreduce.job-flow-detail/auto-scaling-role :portkey.aws.elasticmapreduce.job-flow-detail/job-flow-role :portkey.aws.elasticmapreduce.job-flow-detail/log-uri :portkey.aws.elasticmapreduce/scale-down-behavior :portkey.aws.elasticmapreduce.job-flow-detail/visible-to-all-users :portkey.aws.elasticmapreduce.job-flow-detail/steps :portkey.aws.elasticmapreduce.job-flow-detail/supported-products :portkey.aws.elasticmapreduce.job-flow-detail/bootstrap-actions :portkey.aws.elasticmapreduce.job-flow-detail/ami-version]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/emr-managed-slave-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/requested-ec-2-subnet-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-availability-zone (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-key-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/service-access-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/additional-slave-security-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/emr-managed-master-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-subnet-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/additional-master-security-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/requested-ec-2-availability-zones (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ec-2-instance-attributes/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ec-2-instance-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.ec-2-instance-attributes/emr-managed-slave-security-group :portkey.aws.elasticmapreduce.ec-2-instance-attributes/requested-ec-2-subnet-ids :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-availability-zone :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-key-name :portkey.aws.elasticmapreduce.ec-2-instance-attributes/service-access-security-group :portkey.aws.elasticmapreduce.ec-2-instance-attributes/additional-slave-security-groups :portkey.aws.elasticmapreduce.ec-2-instance-attributes/emr-managed-master-security-group :portkey.aws.elasticmapreduce.ec-2-instance-attributes/ec-2-subnet-id :portkey.aws.elasticmapreduce.ec-2-instance-attributes/additional-master-security-groups :portkey.aws.elasticmapreduce.ec-2-instance-attributes/requested-ec-2-availability-zones :portkey.aws.elasticmapreduce.ec-2-instance-attributes/iam-instance-profile]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/whole-number (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-config/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-config/hadoop-jar-step (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/hadoop-jar-step-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.step-config/name :portkey.aws.elasticmapreduce.step-config/hadoop-jar-step] :opt-un [:portkey.aws.elasticmapreduce/action-on-failure]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-detail/execution-status-detail (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-execution-status-detail))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/step-config :portkey.aws.elasticmapreduce.step-detail/execution-status-detail] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.remove-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/remove-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/resource-id :portkey.aws.elasticmapreduce.remove-tags-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-cluster-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-type-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-group-type))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/comparison-operator #{"GREATER_THAN_OR_EQUAL" "GREATER_THAN" :less-than :greater-than-or-equal "LESS_THAN_OR_EQUAL" :greater-than "LESS_THAN" :less-than-or-equal})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-security-configurations-output/security-configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/security-configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-security-configurations-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-security-configurations-output/security-configurations :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-security-configuration-input/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-security-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.describe-security-configuration-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-jar-step-config/properties (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/key-value-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-jar-step-config/jar (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-jar-step-config/main-class (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-jar-step-config/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/hadoop-jar-step-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.hadoop-jar-step-config/jar] :opt-un [:portkey.aws.elasticmapreduce.hadoop-jar-step-config/properties :portkey.aws.elasticmapreduce.hadoop-jar-step-config/main-class :portkey.aws.elasticmapreduce.hadoop-jar-step-config/args]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-step-config/jar (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-step-config/properties (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-map))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-step-config/main-class (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.hadoop-step-config/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/hadoop-step-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.hadoop-step-config/jar :portkey.aws.elasticmapreduce.hadoop-step-config/properties :portkey.aws.elasticmapreduce.hadoop-step-config/main-class :portkey.aws.elasticmapreduce.hadoop-step-config/args]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/instance-type-specifications (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type-specification-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/target-on-demand-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/target-spot-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/provisioned-spot-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/launch-specifications (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-provisioning-specifications))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet/provisioned-on-demand-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet/instance-type-specifications :portkey.aws.elasticmapreduce.instance-fleet/target-on-demand-capacity :portkey.aws.elasticmapreduce.instance-fleet/status :portkey.aws.elasticmapreduce.instance-fleet/target-spot-capacity :portkey.aws.elasticmapreduce.instance-fleet/name :portkey.aws.elasticmapreduce/instance-fleet-type :portkey.aws.elasticmapreduce.instance-fleet/id :portkey.aws.elasticmapreduce.instance-fleet/provisioned-spot-capacity :portkey.aws.elasticmapreduce.instance-fleet/launch-specifications :portkey.aws.elasticmapreduce.instance-fleet/provisioned-on-demand-capacity]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.create-security-configuration-output/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.create-security-configuration-output/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/create-security-configuration-output (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.create-security-configuration-output/name :portkey.aws.elasticmapreduce.create-security-configuration-output/creation-date-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/security-configuration-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/security-configuration-summary))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-state #{"BOOTSTRAPPING" :resizing :ended "ARRESTED" "PROVISIONING" "TERMINATED" :suspended :running :terminating :terminated "RESIZING" :provisioning :arrested "ENDED" :shutting-down :bootstrapping "SHUTTING_DOWN" "TERMINATING" "SUSPENDED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/xml-string-max-len-256-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/remove-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-fleet))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-resize-policy/instances-to-terminate (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ec-2-instance-ids-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-resize-policy/instances-to-protect (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ec-2-instance-ids-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-resize-policy/instance-termination-timeout (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-resize-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-resize-policy/instances-to-terminate :portkey.aws.elasticmapreduce.instance-resize-policy/instances-to-protect :portkey.aws.elasticmapreduce.instance-resize-policy/instance-termination-timeout]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/action-on-failure #{"CONTINUE" :terminate-job-flow "TERMINATE_CLUSTER" :continue :terminate-cluster "CANCEL_AND_WAIT" "TERMINATE_JOB_FLOW" :cancel-and-wait})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-bootstrap-actions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id] :opt-un [:portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-summary/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-summary/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-summary/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-summary/normalized-instance-hours (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cluster-summary/id :portkey.aws.elasticmapreduce.cluster-summary/name :portkey.aws.elasticmapreduce.cluster-summary/status :portkey.aws.elasticmapreduce.cluster-summary/normalized-instance-hours]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.auto-scaling-policy-state-change-reason/code :portkey.aws.elasticmapreduce.auto-scaling-policy-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-timeline/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-timeline/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-timeline/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-timeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-group-timeline/creation-date-time :portkey.aws.elasticmapreduce.instance-group-timeline/ready-date-time :portkey.aws.elasticmapreduce.instance-group-timeline/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-config/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-config/target-on-demand-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-config/target-spot-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-config/instance-type-configs (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-config/launch-specifications (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-provisioning-specifications))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/instance-fleet-type] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet-config/name :portkey.aws.elasticmapreduce.instance-fleet-config/target-on-demand-capacity :portkey.aws.elasticmapreduce.instance-fleet-config/target-spot-capacity :portkey.aws.elasticmapreduce.instance-fleet-config/instance-type-configs :portkey.aws.elasticmapreduce.instance-fleet-config/launch-specifications]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.spot-provisioning-specification/timeout-duration-minutes (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.spot-provisioning-specification/timeout-action (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/spot-provisioning-timeout-action))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.spot-provisioning-specification/block-duration-minutes (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/spot-provisioning-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.spot-provisioning-specification/timeout-duration-minutes :portkey.aws.elasticmapreduce.spot-provisioning-specification/timeout-action] :opt-un [:portkey.aws.elasticmapreduce.spot-provisioning-specification/block-duration-minutes]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-execution-state-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/job-flow-execution-state))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-bootstrap-actions-output/bootstrap-actions (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/command-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-bootstrap-actions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-bootstrap-actions-output/bootstrap-actions :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step/config (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/hadoop-step-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.step/id :portkey.aws.elasticmapreduce.step/name :portkey.aws.elasticmapreduce.step/config :portkey.aws.elasticmapreduce/action-on-failure :portkey.aws.elasticmapreduce.step/status]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/resource-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-state-change-reason-code #{"NONE" :none})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-modify-config/instance-group-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-modify-config/instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-modify-config/ec-2-instance-ids-to-terminate (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ec-2-instance-ids-to-terminate-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-modify-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.instance-group-modify-config/instance-group-id] :opt-un [:portkey.aws.elasticmapreduce.instance-group-modify-config/instance-count :portkey.aws.elasticmapreduce.instance-group-modify-config/ec-2-instance-ids-to-terminate :portkey.aws.elasticmapreduce/shrink-policy]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/service-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/auto-scaling-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/job-flow-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/custom-ami-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/log-uri (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/tags (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/visible-to-all-users (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/additional-info (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/applications (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/application-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/ebs-root-volume-size (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/new-supported-products (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/new-supported-products-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/security-configuration (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/release-label (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/supported-products (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/supported-products-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/bootstrap-actions (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/bootstrap-action-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/instances (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-instances-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-input/ami-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/run-job-flow-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.run-job-flow-input/name :portkey.aws.elasticmapreduce.run-job-flow-input/instances] :opt-un [:portkey.aws.elasticmapreduce.run-job-flow-input/service-role :portkey.aws.elasticmapreduce.run-job-flow-input/auto-scaling-role :portkey.aws.elasticmapreduce.run-job-flow-input/job-flow-role :portkey.aws.elasticmapreduce.run-job-flow-input/custom-ami-id :portkey.aws.elasticmapreduce.run-job-flow-input/log-uri :portkey.aws.elasticmapreduce/kerberos-attributes :portkey.aws.elasticmapreduce/scale-down-behavior :portkey.aws.elasticmapreduce/repo-upgrade-on-boot :portkey.aws.elasticmapreduce.run-job-flow-input/configurations :portkey.aws.elasticmapreduce.run-job-flow-input/tags :portkey.aws.elasticmapreduce.run-job-flow-input/visible-to-all-users :portkey.aws.elasticmapreduce.run-job-flow-input/additional-info :portkey.aws.elasticmapreduce.run-job-flow-input/applications :portkey.aws.elasticmapreduce.run-job-flow-input/ebs-root-volume-size :portkey.aws.elasticmapreduce.run-job-flow-input/new-supported-products :portkey.aws.elasticmapreduce.run-job-flow-input/steps :portkey.aws.elasticmapreduce.run-job-flow-input/security-configuration :portkey.aws.elasticmapreduce.run-job-flow-input/release-label :portkey.aws.elasticmapreduce.run-job-flow-input/supported-products :portkey.aws.elasticmapreduce.run-job-flow-input/bootstrap-actions :portkey.aws.elasticmapreduce.run-job-flow-input/ami-version]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-clusters-input/created-after (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-clusters-input/created-before (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-clusters-input/cluster-states (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-state-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-clusters-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-clusters-input/created-after :portkey.aws.elasticmapreduce.list-clusters-input/created-before :portkey.aws.elasticmapreduce.list-clusters-input/cluster-states :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-steps-output/steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-summary-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-steps-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-steps-output/steps :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/tag-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/tag))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-state #{"BOOTSTRAPPING" :starting "TERMINATED_WITH_ERRORS" :terminated-with-errors "TERMINATED" :running :waiting :terminating "STARTING" :terminated "WAITING" :bootstrapping "TERMINATING" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-step-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/step]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 0 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10280)) (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-timeline/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-timeline/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-timeline/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-timeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet-timeline/creation-date-time :portkey.aws.elasticmapreduce.instance-fleet-timeline/ready-date-time :portkey.aws.elasticmapreduce.instance-fleet-timeline/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/step-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-block-device-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/ebs-block-device-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27879__auto__] (clojure.core/<= 1 (clojure.core/count s__27879__auto__))) (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/service-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/auto-scaling-role (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/custom-ami-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/log-uri (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/tags (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/requested-ami-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/visible-to-all-users (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/normalized-instance-hours (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/applications (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/application-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/ebs-root-volume-size (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/security-configuration (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/master-public-dns-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/release-label (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/termination-protected (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/running-ami-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/auto-terminate (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cluster/service-role :portkey.aws.elasticmapreduce.cluster/auto-scaling-role :portkey.aws.elasticmapreduce.cluster/custom-ami-id :portkey.aws.elasticmapreduce.cluster/log-uri :portkey.aws.elasticmapreduce/kerberos-attributes :portkey.aws.elasticmapreduce/scale-down-behavior :portkey.aws.elasticmapreduce/repo-upgrade-on-boot :portkey.aws.elasticmapreduce/ec-2-instance-attributes :portkey.aws.elasticmapreduce.cluster/configurations :portkey.aws.elasticmapreduce.cluster/tags :portkey.aws.elasticmapreduce.cluster/requested-ami-version :portkey.aws.elasticmapreduce.cluster/visible-to-all-users :portkey.aws.elasticmapreduce.cluster/status :portkey.aws.elasticmapreduce.cluster/normalized-instance-hours :portkey.aws.elasticmapreduce.cluster/applications :portkey.aws.elasticmapreduce.cluster/ebs-root-volume-size :portkey.aws.elasticmapreduce/instance-collection-type :portkey.aws.elasticmapreduce.cluster/security-configuration :portkey.aws.elasticmapreduce.cluster/master-public-dns-name :portkey.aws.elasticmapreduce.cluster/release-label :portkey.aws.elasticmapreduce.cluster/termination-protected :portkey.aws.elasticmapreduce.cluster/name :portkey.aws.elasticmapreduce.cluster/running-ami-version :portkey.aws.elasticmapreduce.cluster/auto-terminate :portkey.aws.elasticmapreduce.cluster/id]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/error-message))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-timeline/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-timeline/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-timeline/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-timeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cluster-timeline/creation-date-time :portkey.aws.elasticmapreduce.cluster-timeline/ready-date-time :portkey.aws.elasticmapreduce.cluster-timeline/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.run-job-flow-output/job-flow-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/run-job-flow-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.run-job-flow-output/job-flow-id]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-description/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-description/constraints (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-constraints))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy-description/rules (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-rule-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.auto-scaling-policy-description/status :portkey.aws.elasticmapreduce.auto-scaling-policy-description/constraints :portkey.aws.elasticmapreduce.auto-scaling-policy-description/rules]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-state-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/cluster-state))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scaling-rule-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/scaling-rule))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-ids-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/weighted-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/bid-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/bid-price-as-percentage-of-on-demand-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/ebs-block-devices (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ebs-block-device-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-specification/ebs-optimized (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean-object))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-type-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/instance-type :portkey.aws.elasticmapreduce.instance-type-specification/weighted-capacity :portkey.aws.elasticmapreduce.instance-type-specification/bid-price :portkey.aws.elasticmapreduce.instance-type-specification/bid-price-as-percentage-of-on-demand-price :portkey.aws.elasticmapreduce.instance-type-specification/configurations :portkey.aws.elasticmapreduce.instance-type-specification/ebs-block-devices :portkey.aws.elasticmapreduce.instance-type-specification/ebs-optimized]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy/constraints (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-constraints))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.auto-scaling-policy/rules (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-rule-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/auto-scaling-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.auto-scaling-policy/constraints :portkey.aws.elasticmapreduce.auto-scaling-policy/rules] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/adjustment-type #{"EXACT_CAPACITY" "PERCENT_CHANGE_IN_CAPACITY" :exact-capacity :change-in-capacity :percent-change-in-capacity "CHANGE_IN_CAPACITY"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-status/timeline (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-timeline))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cluster-status/state :portkey.aws.elasticmapreduce.cluster-status/state-change-reason :portkey.aws.elasticmapreduce.cluster-status/timeline]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-volume-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/ebs-volume))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-block-device-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/ebs-block-device))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cluster-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cluster-state-change-reason/code :portkey.aws.elasticmapreduce.cluster-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-type-specification-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-type-specification))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.failure-details/reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.failure-details/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.failure-details/log-file (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/failure-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.failure-details/reason :portkey.aws.elasticmapreduce.failure-details/message :portkey.aws.elasticmapreduce.failure-details/log-file]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-detail-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/job-flow-detail))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-fleet-input/cluster-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-fleet-input/instance-fleet (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-instance-fleet-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.add-instance-fleet-input/cluster-id :portkey.aws.elasticmapreduce.add-instance-fleet-input/instance-fleet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.metric-dimension/key (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/metric-dimension (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.metric-dimension/key :portkey.aws.elasticmapreduce.metric-dimension/value]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/tag-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/resource-id :portkey.aws.elasticmapreduce.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.volume-specification/volume-type (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.volume-specification/iops (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.volume-specification/size-in-gb (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/volume-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.volume-specification/volume-type :portkey.aws.elasticmapreduce.volume-specification/size-in-gb] :opt-un [:portkey.aws.elasticmapreduce.volume-specification/iops]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.bootstrap-action-config/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.bootstrap-action-config/script-bootstrap-action (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/script-bootstrap-action-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/bootstrap-action-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.bootstrap-action-config/name :portkey.aws.elasticmapreduce.bootstrap-action-config/script-bootstrap-action] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-instances-output/instances (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-instances-output/instances :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-status/timeline (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-timeline))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.step-status/state :portkey.aws.elasticmapreduce.step-status/state-change-reason :portkey.aws.elasticmapreduce/failure-details :portkey.aws.elasticmapreduce.step-status/timeline]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/metric-dimension-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-collection-type #{:instance-fleet "INSTANCE_FLEET" "INSTANCE_GROUP" :instance-group})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-modify-config/target-on-demand-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-modify-config/target-spot-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-modify-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/instance-fleet-id] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet-modify-config/target-on-demand-capacity :portkey.aws.elasticmapreduce.instance-fleet-modify-config/target-spot-capacity]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-status/timeline (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-timeline))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-group-status/state :portkey.aws.elasticmapreduce.instance-group-status/state-change-reason :portkey.aws.elasticmapreduce.instance-group-status/timeline]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.create-security-configuration-input/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.create-security-configuration-input/security-configuration (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/create-security-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.create-security-configuration-input/name :portkey.aws.elasticmapreduce.create-security-configuration-input/security-configuration] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-step-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce/step-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-fleet-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-status/timeline (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-timeline))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet-status/state :portkey.aws.elasticmapreduce.instance-fleet-status/state-change-reason :portkey.aws.elasticmapreduce.instance-fleet-status/timeline]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/emr-managed-slave-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/placement (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/placement-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/hadoop-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/keep-job-flow-alive-when-no-steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-fleets (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-subnet-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/slave-instance-type (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/master-instance-type (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-key-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/service-access-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/additional-slave-security-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/security-groups-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/emr-managed-master-security-group (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-subnet-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/termination-protected (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/additional-master-security-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/security-groups-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-instances-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.job-flow-instances-config/emr-managed-slave-security-group :portkey.aws.elasticmapreduce.job-flow-instances-config/placement :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-count :portkey.aws.elasticmapreduce.job-flow-instances-config/hadoop-version :portkey.aws.elasticmapreduce.job-flow-instances-config/keep-job-flow-alive-when-no-steps :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-fleets :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-subnet-ids :portkey.aws.elasticmapreduce.job-flow-instances-config/slave-instance-type :portkey.aws.elasticmapreduce.job-flow-instances-config/master-instance-type :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-key-name :portkey.aws.elasticmapreduce.job-flow-instances-config/service-access-security-group :portkey.aws.elasticmapreduce.job-flow-instances-config/additional-slave-security-groups :portkey.aws.elasticmapreduce.job-flow-instances-config/emr-managed-master-security-group :portkey.aws.elasticmapreduce.job-flow-instances-config/ec-2-subnet-id :portkey.aws.elasticmapreduce.job-flow-instances-config/termination-protected :portkey.aws.elasticmapreduce.job-flow-instances-config/additional-master-security-groups :portkey.aws.elasticmapreduce.job-flow-instances-config/instance-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/spot-provisioning-timeout-action #{"TERMINATE_CLUSTER" :terminate-cluster :switch-to-on-demand "SWITCH_TO_ON_DEMAND"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.command/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.command/script-path (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.command/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/command (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.command/name :portkey.aws.elasticmapreduce.command/script-path :portkey.aws.elasticmapreduce.command/args]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-fleet-output/cluster-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-instance-fleet-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.add-instance-fleet-output/cluster-id :portkey.aws.elasticmapreduce/instance-fleet-id]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-state-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/step-state))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.set-termination-protection-input/job-flow-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.set-termination-protection-input/termination-protected (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/set-termination-protection-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.set-termination-protection-input/job-flow-ids :portkey.aws.elasticmapreduce.set-termination-protection-input/termination-protected] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.security-configuration-summary/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.security-configuration-summary/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/security-configuration-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.security-configuration-summary/name :portkey.aws.elasticmapreduce.security-configuration-summary/creation-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-group-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-group-state-change-reason/code :portkey.aws.elasticmapreduce.instance-group-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-summary-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/cluster-summary))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/delete-security-configuration-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/command-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/command))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cancel-steps-input/cluster-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cancel-steps-input/step-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-ids-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cancel-steps-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.cancel-steps-input/cluster-id :portkey.aws.elasticmapreduce.cancel-steps-input/step-ids]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.set-visible-to-all-users-input/job-flow-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.set-visible-to-all-users-input/visible-to-all-users (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/set-visible-to-all-users-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.set-visible-to-all-users-input/job-flow-ids :portkey.aws.elasticmapreduce.set-visible-to-all-users-input/visible-to-all-users] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-instance-fleets-output/instance-fleets (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instance-fleets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-instance-fleets-output/instance-fleets :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/application-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/application))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-state #{"BOOTSTRAPPING" "AWAITING_FULFILLMENT" "PROVISIONING" "TERMINATED" :running :terminated :awaiting-fulfillment :provisioning :bootstrapping "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-instance-groups-output/instance-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-instance-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-instance-groups-output/instance-groups :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/bootstrap-action-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/bootstrap-action-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-execution-state #{"COMPLETED" "BOOTSTRAPPING" :starting :completed "TERMINATED" :running :waiting "STARTING" :terminated "WAITING" "FAILED" :shutting-down :bootstrapping "SHUTTING_DOWN" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-ids-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-groups-output/job-flow-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-groups-output/instance-group-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-ids-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-instance-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.add-instance-groups-output/job-flow-id :portkey.aws.elasticmapreduce.add-instance-groups-output/instance-group-ids]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cancel-steps-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/cancel-steps-info-list]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.tag/key (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.tag/value (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.tag/key :portkey.aws.elasticmapreduce.tag/value]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/period (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/threshold (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/dimensions (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/metric-dimension-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/namespace (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/metric-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/evaluation-periods (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cloud-watch-alarm-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/comparison-operator :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/metric-name :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/period :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/threshold] :opt-un [:portkey.aws.elasticmapreduce/unit :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/dimensions :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/namespace :portkey.aws.elasticmapreduce.cloud-watch-alarm-definition/evaluation-periods :portkey.aws.elasticmapreduce/statistic]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-detail-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-group-detail))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-config/weighted-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/whole-number))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-config/bid-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-config/bid-price-as-percentage-of-on-demand-price (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/non-negative-double))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-type-config/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-type-config (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/instance-type] :opt-un [:portkey.aws.elasticmapreduce.instance-type-config/weighted-capacity :portkey.aws.elasticmapreduce.instance-type-config/bid-price :portkey.aws.elasticmapreduce.instance-type-config/bid-price-as-percentage-of-on-demand-price :portkey.aws.elasticmapreduce/ebs-configuration :portkey.aws.elasticmapreduce.instance-type-config/configurations]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-status/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-status/state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-state-change-reason))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-status/timeline (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-timeline))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-status/state :portkey.aws.elasticmapreduce.instance-status/state-change-reason :portkey.aws.elasticmapreduce.instance-status/timeline]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-groups-input/instance-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-instance-groups-input/job-flow-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-instance-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.add-instance-groups-input/instance-groups :portkey.aws.elasticmapreduce.add-instance-groups-input/job-flow-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-cluster-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/cluster]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/market-type #{"ON_DEMAND" "SPOT" :on-demand :spot})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/public-dns-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/ebs-volumes (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/ebs-volume-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/private-dns-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/instance-group-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/ec-2-instance-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/public-ip-address (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-id))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/market (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/market-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance/private-ip-address (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance/public-dns-name :portkey.aws.elasticmapreduce.instance/ebs-volumes :portkey.aws.elasticmapreduce/instance-type :portkey.aws.elasticmapreduce.instance/status :portkey.aws.elasticmapreduce/instance-fleet-id :portkey.aws.elasticmapreduce.instance/private-dns-name :portkey.aws.elasticmapreduce.instance/instance-group-id :portkey.aws.elasticmapreduce.instance/ec-2-instance-id :portkey.aws.elasticmapreduce.instance/public-ip-address :portkey.aws.elasticmapreduce.instance/id :portkey.aws.elasticmapreduce.instance/market :portkey.aws.elasticmapreduce.instance/private-ip-address]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.modify-instance-fleet-input/instance-fleet (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-modify-config))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/modify-instance-fleet-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce.modify-instance-fleet-input/instance-fleet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-state-change-reason/code :portkey.aws.elasticmapreduce.instance-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-rule/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-rule/description (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-rule/action (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-action))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-rule/trigger (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/scaling-trigger))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scaling-rule (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.scaling-rule/name :portkey.aws.elasticmapreduce.scaling-rule/action :portkey.aws.elasticmapreduce.scaling-rule/trigger] :opt-un [:portkey.aws.elasticmapreduce.scaling-rule/description]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-volume/device (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.ebs-volume/volume-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ebs-volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.ebs-volume/device :portkey.aws.elasticmapreduce.ebs-volume/volume-id]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cancel-steps-info/status (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cancel-steps-request-status))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.cancel-steps-info/reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cancel-steps-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/step-id :portkey.aws.elasticmapreduce.cancel-steps-info/status :portkey.aws.elasticmapreduce.cancel-steps-info/reason]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/ec-2-instance-ids-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-id))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-constraints/min-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.scaling-constraints/max-capacity (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scaling-constraints (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.scaling-constraints/min-capacity :portkey.aws.elasticmapreduce.scaling-constraints/max-capacity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.list-clusters-output/clusters (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cluster-summary-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-clusters-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.list-clusters-output/clusters :portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/scaling-trigger (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce/cloud-watch-alarm-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.put-auto-scaling-policy-output/auto-scaling-policy (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/auto-scaling-policy-description))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/put-auto-scaling-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/cluster-id :portkey.aws.elasticmapreduce/instance-group-id :portkey.aws.elasticmapreduce.put-auto-scaling-policy-output/auto-scaling-policy]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-job-flow-steps-input/job-flow-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.add-job-flow-steps-input/steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-config-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/add-job-flow-steps-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.add-job-flow-steps-input/job-flow-id :portkey.aws.elasticmapreduce.add-job-flow-steps-input/steps] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-type #{:task "CORE" "TASK" :core :master "MASTER"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/security-groups-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.configuration/classification (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.configuration/configurations (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/configuration-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.configuration/properties (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string-map))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.configuration/classification :portkey.aws.elasticmapreduce.configuration/configurations :portkey.aws.elasticmapreduce.configuration/properties]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/boolean-object clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.delete-security-configuration-input/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/delete-security-configuration-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.delete-security-configuration-input/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-state #{"INTERRUPTED" "COMPLETED" :pending :completed "PENDING" :running :cancelled "CANCEL_PENDING" "FAILED" :interrupted "CANCELLED" :cancel-pending :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.supported-product-config/name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.supported-product-config/args (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/supported-product-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.supported-product-config/name :portkey.aws.elasticmapreduce.supported-product-config/args]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/placement (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/placement-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/instance-count (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/hadoop-version (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/normalized-instance-hours (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/keep-job-flow-alive-when-no-steps (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/slave-instance-type (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/master-instance-type (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-type))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/ec-2-key-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/master-public-dns-name (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/ec-2-subnet-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-max-len-256))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/master-instance-id (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/termination-protected (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/boolean))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.job-flow-instances-detail/instance-groups (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-group-detail-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/job-flow-instances-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.job-flow-instances-detail/master-instance-type :portkey.aws.elasticmapreduce.job-flow-instances-detail/slave-instance-type :portkey.aws.elasticmapreduce.job-flow-instances-detail/instance-count] :opt-un [:portkey.aws.elasticmapreduce.job-flow-instances-detail/placement :portkey.aws.elasticmapreduce.job-flow-instances-detail/hadoop-version :portkey.aws.elasticmapreduce.job-flow-instances-detail/normalized-instance-hours :portkey.aws.elasticmapreduce.job-flow-instances-detail/keep-job-flow-alive-when-no-steps :portkey.aws.elasticmapreduce.job-flow-instances-detail/ec-2-key-name :portkey.aws.elasticmapreduce.job-flow-instances-detail/master-public-dns-name :portkey.aws.elasticmapreduce.job-flow-instances-detail/ec-2-subnet-id :portkey.aws.elasticmapreduce.job-flow-instances-detail/master-instance-id :portkey.aws.elasticmapreduce.job-flow-instances-detail/termination-protected :portkey.aws.elasticmapreduce.job-flow-instances-detail/instance-groups]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/list-security-configurations-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce/marker]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-modify-config-list (clojure.spec.alpha/coll-of :portkey.aws.elasticmapreduce/instance-group-modify-config))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.describe-job-flows-output/job-flows (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/job-flow-detail-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/describe-job-flows-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.describe-job-flows-output/job-flows]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cancel-steps-request-status #{:submitted "SUBMITTED" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-role-type #{:task "CORE" "TASK" :core :master "MASTER"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/statistic #{"SUM" "MINIMUM" "SAMPLE_COUNT" :maximum :sample-count "AVERAGE" :minimum "MAXIMUM" :average :sum})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-state-change-reason/code (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/instance-fleet-state-change-reason-code))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-state-change-reason/message (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-state-change-reason (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-fleet-state-change-reason/code :portkey.aws.elasticmapreduce.instance-fleet-state-change-reason/message]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.terminate-job-flows-input/job-flow-ids (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string-list))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/terminate-job-flows-input (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.terminate-job-flows-input/job-flow-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-execution-status-detail/state (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/step-execution-state))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-execution-status-detail/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-execution-status-detail/start-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-execution-status-detail/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.step-execution-status-detail/last-state-change-reason (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/xml-string))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/step-execution-status-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.step-execution-status-detail/state :portkey.aws.elasticmapreduce.step-execution-status-detail/creation-date-time] :opt-un [:portkey.aws.elasticmapreduce.step-execution-status-detail/start-date-time :portkey.aws.elasticmapreduce.step-execution-status-detail/end-date-time :portkey.aws.elasticmapreduce.step-execution-status-detail/last-state-change-reason]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/cluster-state-change-reason-code #{"INSTANCE_FLEET_TIMEOUT" :step-failure "USER_REQUEST" :bootstrap-failure :validation-error "VALIDATION_ERROR" :internal-error :instance-failure "ALL_STEPS_COMPLETED" "INTERNAL_ERROR" "BOOTSTRAP_FAILURE" "STEP_FAILURE" "INSTANCE_FAILURE" :user-request :all-steps-completed :instance-fleet-timeout})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.simple-scaling-policy-configuration/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.simple-scaling-policy-configuration/cool-down (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/integer))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/simple-scaling-policy-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.simple-scaling-policy-configuration/scaling-adjustment] :opt-un [:portkey.aws.elasticmapreduce/adjustment-type :portkey.aws.elasticmapreduce.simple-scaling-policy-configuration/cool-down]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-timeline/creation-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-timeline/ready-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-timeline/end-date-time (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/date))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-timeline (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.elasticmapreduce.instance-timeline/creation-date-time :portkey.aws.elasticmapreduce.instance-timeline/ready-date-time :portkey.aws.elasticmapreduce.instance-timeline/end-date-time]))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-group-state-change-reason-code #{:validation-error "VALIDATION_ERROR" :internal-error :instance-failure :cluster-terminated "INTERNAL_ERROR" "CLUSTER_TERMINATED" "INSTANCE_FAILURE"})

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce.instance-fleet-provisioning-specifications/spot-specification (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/spot-provisioning-specification))
(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/instance-fleet-provisioning-specifications (clojure.spec.alpha/keys :req-un [:portkey.aws.elasticmapreduce.instance-fleet-provisioning-specifications/spot-specification] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.elasticmapreduce/boolean clojure.core/boolean?)

(clojure.core/defn list-instance-fleets ([list-instance-fleets-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-instance-fleets-input list-instance-fleets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-instance-fleets-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-instance-fleets-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstanceFleets", :http.request.configuration/output-deser-fn deser-list-instance-fleets-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-instance-fleets :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/list-instance-fleets-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-instance-fleets-output))

(clojure.core/defn remove-tags ([remove-tags-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-tags-input remove-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/remove-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/remove-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTags", :http.request.configuration/output-deser-fn deser-remove-tags-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef remove-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/remove-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/remove-tags-output))

(clojure.core/defn delete-security-configuration ([delete-security-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-delete-security-configuration-input delete-security-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/delete-security-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/delete-security-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteSecurityConfiguration", :http.request.configuration/output-deser-fn deser-delete-security-configuration-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/delete-security-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/delete-security-configuration-output))

(clojure.core/defn list-steps ([list-steps-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-steps-input list-steps-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-steps-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-steps-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSteps", :http.request.configuration/output-deser-fn deser-list-steps-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-steps :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/list-steps-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-steps-output))

(clojure.core/defn describe-step ([describe-step-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-step-input describe-step-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/describe-step-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/describe-step-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeStep", :http.request.configuration/output-deser-fn deser-describe-step-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-step :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/describe-step-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/describe-step-output))

(clojure.core/defn list-instances ([list-instances-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-instances-input list-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstances", :http.request.configuration/output-deser-fn deser-list-instances-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-instances :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/list-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-instances-output))

(clojure.core/defn put-auto-scaling-policy ([put-auto-scaling-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-put-auto-scaling-policy-input put-auto-scaling-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/put-auto-scaling-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/put-auto-scaling-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutAutoScalingPolicy", :http.request.configuration/output-deser-fn deser-put-auto-scaling-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef put-auto-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/put-auto-scaling-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/put-auto-scaling-policy-output))

(clojure.core/defn list-bootstrap-actions ([list-bootstrap-actions-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-bootstrap-actions-input list-bootstrap-actions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-bootstrap-actions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-bootstrap-actions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListBootstrapActions", :http.request.configuration/output-deser-fn deser-list-bootstrap-actions-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-bootstrap-actions :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/list-bootstrap-actions-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-bootstrap-actions-output))

(clojure.core/defn set-termination-protection ([set-termination-protection-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-termination-protection-input set-termination-protection-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/set-termination-protection-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetTerminationProtection", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef set-termination-protection :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/set-termination-protection-input) :ret clojure.core/true?)

(clojure.core/defn list-security-configurations ([] (list-security-configurations {})) ([list-security-configurations-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-security-configurations-input list-security-configurations-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-security-configurations-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-security-configurations-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSecurityConfigurations", :http.request.configuration/output-deser-fn deser-list-security-configurations-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-security-configurations :args (clojure.spec.alpha/? :portkey.aws.elasticmapreduce/list-security-configurations-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-security-configurations-output))

(clojure.core/defn remove-auto-scaling-policy ([remove-auto-scaling-policy-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-remove-auto-scaling-policy-input remove-auto-scaling-policy-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveAutoScalingPolicy", :http.request.configuration/output-deser-fn deser-remove-auto-scaling-policy-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef remove-auto-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/remove-auto-scaling-policy-output))

(clojure.core/defn create-security-configuration ([create-security-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-create-security-configuration-input create-security-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/create-security-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/create-security-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateSecurityConfiguration", :http.request.configuration/output-deser-fn deser-create-security-configuration-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/create-security-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/create-security-configuration-output))

(clojure.core/defn modify-instance-fleet ([modify-instance-fleet-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-instance-fleet-input modify-instance-fleet-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/modify-instance-fleet-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyInstanceFleet", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef modify-instance-fleet :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/modify-instance-fleet-input) :ret clojure.core/true?)

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-clusters-input list-clusters-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-clusters-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-clusters-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn deser-list-clusters-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.elasticmapreduce/list-clusters-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-clusters-output))

(clojure.core/defn describe-cluster ([describe-cluster-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-cluster-input describe-cluster-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/describe-cluster-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/describe-cluster-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeCluster", :http.request.configuration/output-deser-fn deser-describe-cluster-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-cluster :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/describe-cluster-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/describe-cluster-output))

(clojure.core/defn add-instance-fleet ([add-instance-fleet-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-instance-fleet-input add-instance-fleet-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/add-instance-fleet-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/add-instance-fleet-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddInstanceFleet", :http.request.configuration/output-deser-fn deser-add-instance-fleet-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-instance-fleet :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/add-instance-fleet-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/add-instance-fleet-output))

(clojure.core/defn list-instance-groups ([list-instance-groups-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-instance-groups-input list-instance-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/list-instance-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/list-instance-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInstanceGroups", :http.request.configuration/output-deser-fn deser-list-instance-groups-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-instance-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/list-instance-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/list-instance-groups-output))

(clojure.core/defn add-job-flow-steps ([add-job-flow-steps-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-job-flow-steps-input add-job-flow-steps-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/add-job-flow-steps-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/add-job-flow-steps-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddJobFlowSteps", :http.request.configuration/output-deser-fn deser-add-job-flow-steps-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef add-job-flow-steps :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/add-job-flow-steps-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/add-job-flow-steps-output))

(clojure.core/defn describe-job-flows ([] (describe-job-flows {})) ([describe-job-flows-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-job-flows-input describe-job-flows-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/describe-job-flows-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/describe-job-flows-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJobFlows", :http.request.configuration/output-deser-fn deser-describe-job-flows-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-job-flows :args (clojure.spec.alpha/? :portkey.aws.elasticmapreduce/describe-job-flows-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/describe-job-flows-output))

(clojure.core/defn terminate-job-flows ([terminate-job-flows-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-terminate-job-flows-input terminate-job-flows-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/terminate-job-flows-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateJobFlows", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef terminate-job-flows :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/terminate-job-flows-input) :ret clojure.core/true?)

(clojure.core/defn describe-security-configuration ([describe-security-configuration-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-describe-security-configuration-input describe-security-configuration-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/describe-security-configuration-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/describe-security-configuration-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSecurityConfiguration", :http.request.configuration/output-deser-fn deser-describe-security-configuration-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-security-configuration :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/describe-security-configuration-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/describe-security-configuration-output))

(clojure.core/defn modify-instance-groups ([] (modify-instance-groups {})) ([modify-instance-groups-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-modify-instance-groups-input modify-instance-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/modify-instance-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyInstanceGroups", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef modify-instance-groups :args (clojure.spec.alpha/? :portkey.aws.elasticmapreduce/modify-instance-groups-input) :ret clojure.core/true?)

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn deser-add-tags-output, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.elasticmapreduce/internal-server-exception, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/add-tags-output))

(clojure.core/defn add-instance-groups ([add-instance-groups-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-add-instance-groups-input add-instance-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/add-instance-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/add-instance-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddInstanceGroups", :http.request.configuration/output-deser-fn deser-add-instance-groups-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef add-instance-groups :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/add-instance-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/add-instance-groups-output))

(clojure.core/defn cancel-steps ([] (cancel-steps {})) ([cancel-steps-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-cancel-steps-input cancel-steps-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/cancel-steps-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/cancel-steps-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelSteps", :http.request.configuration/output-deser-fn deser-cancel-steps-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error, "InvalidRequestException" :portkey.aws.elasticmapreduce/invalid-request-exception}})))))
(clojure.spec.alpha/fdef cancel-steps :args (clojure.spec.alpha/? :portkey.aws.elasticmapreduce/cancel-steps-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/cancel-steps-output))

(clojure.core/defn set-visible-to-all-users ([set-visible-to-all-users-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-set-visible-to-all-users-input set-visible-to-all-users-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/set-visible-to-all-users-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetVisibleToAllUsers", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef set-visible-to-all-users :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/set-visible-to-all-users-input) :ret clojure.core/true?)

(clojure.core/defn run-job-flow ([run-job-flow-inputinput] (clojure.core/let [request-function-result__28581__auto__ (req-run-job-flow-input run-job-flow-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.elasticmapreduce/endpoints, :http.request.configuration/target-prefix "ElasticMapReduce", :http.request.spec/output-spec :portkey.aws.elasticmapreduce/run-job-flow-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-03-31", :http.request.configuration/service-id "EMR", :http.request.spec/input-spec :portkey.aws.elasticmapreduce/run-job-flow-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RunJobFlow", :http.request.configuration/output-deser-fn deser-run-job-flow-output, :http.request.spec/error-spec {"InternalServerError" :portkey.aws.elasticmapreduce/internal-server-error}})))))
(clojure.spec.alpha/fdef run-job-flow :args (clojure.spec.alpha/tuple :portkey.aws.elasticmapreduce/run-job-flow-input) :ret (clojure.spec.alpha/and :portkey.aws.elasticmapreduce/run-job-flow-output))
