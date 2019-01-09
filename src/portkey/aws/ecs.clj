(ns portkey.aws.ecs (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ecs", :region "ap-northeast-1"},
    :ssl-common-name "ecs.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ecs", :region "eu-west-1"},
    :ssl-common-name "ecs.eu-west-1.amazonaws.com",
    :endpoint "https://ecs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ecs", :region "us-east-2"},
    :ssl-common-name "ecs.us-east-2.amazonaws.com",
    :endpoint "https://ecs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ecs", :region "ap-southeast-2"},
    :ssl-common-name "ecs.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ecs", :region "cn-north-1"},
    :ssl-common-name "ecs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ecs", :region "sa-east-1"},
    :ssl-common-name "ecs.sa-east-1.amazonaws.com",
    :endpoint "https://ecs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ecs", :region "ap-southeast-1"},
    :ssl-common-name "ecs.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ecs", :region "cn-northwest-1"},
    :ssl-common-name "ecs.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ecs.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ecs", :region "ap-northeast-2"},
    :ssl-common-name "ecs.ap-northeast-2.amazonaws.com",
    :endpoint "https://ecs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ecs", :region "eu-west-3"},
    :ssl-common-name "ecs.eu-west-3.amazonaws.com",
    :endpoint "https://ecs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ecs", :region "ca-central-1"},
    :ssl-common-name "ecs.ca-central-1.amazonaws.com",
    :endpoint "https://ecs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ecs", :region "eu-central-1"},
    :ssl-common-name "ecs.eu-central-1.amazonaws.com",
    :endpoint "https://ecs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ecs", :region "eu-west-2"},
    :ssl-common-name "ecs.eu-west-2.amazonaws.com",
    :endpoint "https://ecs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ecs", :region "us-gov-west-1"},
    :ssl-common-name "ecs.us-gov-west-1.amazonaws.com",
    :endpoint "https://ecs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ecs", :region "us-west-2"},
    :ssl-common-name "ecs.us-west-2.amazonaws.com",
    :endpoint "https://ecs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ecs", :region "us-east-1"},
    :ssl-common-name "ecs.us-east-1.amazonaws.com",
    :endpoint "https://ecs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ecs", :region "us-west-1"},
    :ssl-common-name "ecs.us-west-1.amazonaws.com",
    :endpoint "https://ecs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ecs", :region "ap-south-1"},
    :ssl-common-name "ecs.ap-south-1.amazonaws.com",
    :endpoint "https://ecs.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-task-definition-placement-constraint)

(clojure.core/declare ser-health-check)

(clojure.core/declare ser-double)

(clojure.core/declare ser-scheduling-strategy)

(clojure.core/declare ser-host-entry)

(clojure.core/declare ser-string-map)

(clojure.core/declare ser-placement-strategies)

(clojure.core/declare ser-mount-point)

(clojure.core/declare ser-port-mapping-list)

(clojure.core/declare ser-deployment-configuration)

(clojure.core/declare ser-boxed-boolean)

(clojure.core/declare ser-network-binding)

(clojure.core/declare ser-container-override)

(clojure.core/declare ser-volume)

(clojure.core/declare ser-volume-from)

(clojure.core/declare ser-docker-labels-map)

(clojure.core/declare ser-host-entry-list)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-container-state-changes)

(clojure.core/declare ser-assign-public-ip)

(clojure.core/declare ser-task-definition-family-status)

(clojure.core/declare ser-boxed-integer)

(clojure.core/declare ser-aws-vpc-configuration)

(clojure.core/declare ser-task-definition-placement-constraint-type)

(clojure.core/declare ser-container-state-change)

(clojure.core/declare ser-target-type)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-ulimit-name)

(clojure.core/declare ser-task-definition-placement-constraints)

(clojure.core/declare ser-ulimit-list)

(clojure.core/declare ser-docker-volume-configuration)

(clojure.core/declare ser-attachment-state-change)

(clojure.core/declare ser-placement-constraint-type)

(clojure.core/declare ser-log-configuration)

(clojure.core/declare ser-system-controls)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-repository-credentials)

(clojure.core/declare ser-placement-constraint)

(clojure.core/declare ser-cluster-field-list)

(clojure.core/declare ser-compatibility)

(clojure.core/declare ser-devices-list)

(clojure.core/declare ser-service-registry)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-kernel-capabilities)

(clojure.core/declare ser-log-driver)

(clojure.core/declare ser-network-bindings)

(clojure.core/declare ser-load-balancers)

(clojure.core/declare ser-mount-point-list)

(clojure.core/declare ser-tmpfs)

(clojure.core/declare ser-placement-strategy)

(clojure.core/declare ser-tmpfs-list)

(clojure.core/declare ser-container-definition)

(clojure.core/declare ser-network-configuration)

(clojure.core/declare ser-resources)

(clojure.core/declare ser-device-cgroup-permissions)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-volume-list)

(clojure.core/declare ser-system-control)

(clojure.core/declare ser-log-configuration-options-map)

(clojure.core/declare ser-volume-from-list)

(clojure.core/declare ser-attachment-state-changes)

(clojure.core/declare ser-linux-parameters)

(clojure.core/declare ser-container-overrides)

(clojure.core/declare ser-long)

(clojure.core/declare ser-cluster-field)

(clojure.core/declare ser-load-balancer)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-port-mapping)

(clojure.core/declare ser-resource)

(clojure.core/declare ser-host-volume-properties)

(clojure.core/declare ser-container-instance-status)

(clojure.core/declare ser-launch-type)

(clojure.core/declare ser-ulimit)

(clojure.core/declare ser-compatibility-list)

(clojure.core/declare ser-transport-protocol)

(clojure.core/declare ser-network-mode)

(clojure.core/declare ser-version-info)

(clojure.core/declare ser-task-override)

(clojure.core/declare ser-placement-constraints)

(clojure.core/declare ser-task-definition-status)

(clojure.core/declare ser-device)

(clojure.core/declare ser-placement-strategy-type)

(clojure.core/declare ser-scope)

(clojure.core/declare ser-service-registries)

(clojure.core/declare ser-container-definitions)

(clojure.core/declare ser-device-cgroup-permission)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-desired-status)

(clojure.core/declare ser-key-value-pair)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-task-definition-placement-constraint [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TaskDefinitionPlacementConstraint", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-placement-constraint-type (input :type)) #:http.request.field{:name "type", :shape "TaskDefinitionPlacementConstraintType"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :expression)) #:http.request.field{:name "expression", :shape "String"}))))

(clojure.core/defn- ser-health-check [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:command input)) #:http.request.field{:name "command", :shape "StringList"})], :shape "HealthCheck", :type "structure"} (clojure.core/contains? input :interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :interval)) #:http.request.field{:name "interval", :shape "BoxedInteger"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :timeout)) #:http.request.field{:name "timeout", :shape "BoxedInteger"})) (clojure.core/contains? input :retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :retries)) #:http.request.field{:name "retries", :shape "BoxedInteger"})) (clojure.core/contains? input :start-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :start-period)) #:http.request.field{:name "startPeriod", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-scheduling-strategy [input] #:http.request.field{:value (clojure.core/get {"REPLICA" "REPLICA", :replica "REPLICA", "DAEMON" "DAEMON", :daemon "DAEMON"} input), :shape "SchedulingStrategy"})

(clojure.core/defn- ser-host-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:hostname input)) #:http.request.field{:name "hostname", :shape "String"}) (clojure.core/into (ser-string (:ip-address input)) #:http.request.field{:name "ipAddress", :shape "String"})], :shape "HostEntry", :type "structure"}))

(clojure.core/defn- ser-string-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StringMap", :type "map"})

(clojure.core/defn- ser-placement-strategies [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-placement-strategy coll) #:http.request.field{:shape "PlacementStrategy"}))) input), :shape "PlacementStrategies", :type "list"})

(clojure.core/defn- ser-mount-point [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MountPoint", :type "structure"} (clojure.core/contains? input :source-volume) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-volume)) #:http.request.field{:name "sourceVolume", :shape "String"})) (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :read-only)) #:http.request.field{:name "readOnly", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-port-mapping-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-port-mapping coll) #:http.request.field{:shape "PortMapping"}))) input), :shape "PortMappingList", :type "list"})

(clojure.core/defn- ser-deployment-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentConfiguration", :type "structure"} (clojure.core/contains? input :maximum-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :maximum-percent)) #:http.request.field{:name "maximumPercent", :shape "BoxedInteger"})) (clojure.core/contains? input :minimum-healthy-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :minimum-healthy-percent)) #:http.request.field{:name "minimumHealthyPercent", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-boxed-boolean [input] #:http.request.field{:value input, :shape "BoxedBoolean"})

(clojure.core/defn- ser-network-binding [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkBinding", :type "structure"} (clojure.core/contains? input :bind-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :bind-ip)) #:http.request.field{:name "bindIP", :shape "String"})) (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"})) (clojure.core/contains? input :host-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :host-port)) #:http.request.field{:name "hostPort", :shape "BoxedInteger"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transport-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "TransportProtocol"}))))

(clojure.core/defn- ser-container-override [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerOverride", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :cpu)) #:http.request.field{:name "cpu", :shape "BoxedInteger"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory)) #:http.request.field{:name "memory", :shape "BoxedInteger"})) (clojure.core/contains? input :memory-reservation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory-reservation)) #:http.request.field{:name "memoryReservation", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-volume [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Volume", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host-volume-properties (input :host)) #:http.request.field{:name "host", :shape "HostVolumeProperties"})) (clojure.core/contains? input :docker-volume-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-docker-volume-configuration (input :docker-volume-configuration)) #:http.request.field{:name "dockerVolumeConfiguration", :shape "DockerVolumeConfiguration"}))))

(clojure.core/defn- ser-volume-from [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VolumeFrom", :type "structure"} (clojure.core/contains? input :source-container) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-container)) #:http.request.field{:name "sourceContainer", :shape "String"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :read-only)) #:http.request.field{:name "readOnly", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-docker-labels-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "DockerLabelsMap", :type "map"})

(clojure.core/defn- ser-host-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-host-entry coll) #:http.request.field{:shape "HostEntry"}))) input), :shape "HostEntryList", :type "list"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-value-pair coll) #:http.request.field{:shape "KeyValuePair"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-container-state-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-state-change coll) #:http.request.field{:shape "ContainerStateChange"}))) input), :shape "ContainerStateChanges", :type "list"})

(clojure.core/defn- ser-assign-public-ip [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "AssignPublicIp"})

(clojure.core/defn- ser-task-definition-family-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE", "ALL" "ALL", :all "ALL"} input), :shape "TaskDefinitionFamilyStatus"})

(clojure.core/defn- ser-boxed-integer [input] #:http.request.field{:value input, :shape "BoxedInteger"})

(clojure.core/defn- ser-aws-vpc-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:subnets input)) #:http.request.field{:name "subnets", :shape "StringList"})], :shape "AwsVpcConfiguration", :type "structure"} (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-groups)) #:http.request.field{:name "securityGroups", :shape "StringList"})) (clojure.core/contains? input :assign-public-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assign-public-ip (input :assign-public-ip)) #:http.request.field{:name "assignPublicIp", :shape "AssignPublicIp"}))))

(clojure.core/defn- ser-task-definition-placement-constraint-type [input] #:http.request.field{:value (clojure.core/get {"memberOf" "memberOf", :member-of "memberOf"} input), :shape "TaskDefinitionPlacementConstraintType"})

(clojure.core/defn- ser-container-state-change [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerStateChange", :type "structure"} (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :exit-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :exit-code)) #:http.request.field{:name "exitCode", :shape "BoxedInteger"})) (clojure.core/contains? input :network-bindings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-bindings (input :network-bindings)) #:http.request.field{:name "networkBindings", :shape "NetworkBindings"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"}))))

(clojure.core/defn- ser-target-type [input] #:http.request.field{:value (clojure.core/get {"container-instance" "container-instance", :containerinstance "container-instance"} input), :shape "TargetType"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "SortOrder"})

(clojure.core/defn- ser-ulimit-name [input] #:http.request.field{:value (clojure.core/get {"nproc" "nproc", :locks "locks", :memlock "memlock", :msgqueue "msgqueue", :sigpending "sigpending", "fsize" "fsize", "memlock" "memlock", "nofile" "nofile", "cpu" "cpu", :rss "rss", "rtprio" "rtprio", "sigpending" "sigpending", :fsize "fsize", "rttime" "rttime", :nproc "nproc", "msgqueue" "msgqueue", :rttime "rttime", :nofile "nofile", :stack "stack", :core "core", :nice "nice", "locks" "locks", "data" "data", "core" "core", "rss" "rss", :cpu "cpu", :rtprio "rtprio", "nice" "nice", "stack" "stack", :data "data"} input), :shape "UlimitName"})

(clojure.core/defn- ser-task-definition-placement-constraints [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-task-definition-placement-constraint coll) #:http.request.field{:shape "TaskDefinitionPlacementConstraint"}))) input), :shape "TaskDefinitionPlacementConstraints", :type "list"})

(clojure.core/defn- ser-ulimit-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ulimit coll) #:http.request.field{:shape "Ulimit"}))) input), :shape "UlimitList", :type "list"})

(clojure.core/defn- ser-docker-volume-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DockerVolumeConfiguration", :type "structure"} (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scope (input :scope)) #:http.request.field{:name "scope", :shape "Scope"})) (clojure.core/contains? input :autoprovision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :autoprovision)) #:http.request.field{:name "autoprovision", :shape "BoxedBoolean"})) (clojure.core/contains? input :driver) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :driver)) #:http.request.field{:name "driver", :shape "String"})) (clojure.core/contains? input :driver-opts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :driver-opts)) #:http.request.field{:name "driverOpts", :shape "StringMap"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :labels)) #:http.request.field{:name "labels", :shape "StringMap"}))))

(clojure.core/defn- ser-attachment-state-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:attachment-arn input)) #:http.request.field{:name "attachmentArn", :shape "String"}) (clojure.core/into (ser-string (:status input)) #:http.request.field{:name "status", :shape "String"})], :shape "AttachmentStateChange", :type "structure"}))

(clojure.core/defn- ser-placement-constraint-type [input] #:http.request.field{:value (clojure.core/get {"distinctInstance" "distinctInstance", :distinct-instance "distinctInstance", "memberOf" "memberOf", :member-of "memberOf"} input), :shape "PlacementConstraintType"})

(clojure.core/defn- ser-log-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-log-driver (:log-driver input)) #:http.request.field{:name "logDriver", :shape "LogDriver"})], :shape "LogConfiguration", :type "structure"} (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-configuration-options-map (input :options)) #:http.request.field{:name "options", :shape "LogConfigurationOptionsMap"}))))

(clojure.core/defn- ser-system-controls [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-system-control coll) #:http.request.field{:shape "SystemControl"}))) input), :shape "SystemControls", :type "list"})

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"})], :shape "Attribute", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "TargetType"})) (clojure.core/contains? input :target-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-id)) #:http.request.field{:name "targetId", :shape "String"}))))

(clojure.core/defn- ser-repository-credentials [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:credentials-parameter input)) #:http.request.field{:name "credentialsParameter", :shape "String"})], :shape "RepositoryCredentials", :type "structure"}))

(clojure.core/defn- ser-placement-constraint [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlacementConstraint", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraint-type (input :type)) #:http.request.field{:name "type", :shape "PlacementConstraintType"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :expression)) #:http.request.field{:name "expression", :shape "String"}))))

(clojure.core/defn- ser-cluster-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cluster-field coll) #:http.request.field{:shape "ClusterField"}))) input), :shape "ClusterFieldList", :type "list"})

(clojure.core/defn- ser-compatibility [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "FARGATE" "FARGATE", :fargate "FARGATE"} input), :shape "Compatibility"})

(clojure.core/defn- ser-devices-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-device coll) #:http.request.field{:shape "Device"}))) input), :shape "DevicesList", :type "list"})

(clojure.core/defn- ser-service-registry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ServiceRegistry", :type "structure"} (clojure.core/contains? input :registry-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :registry-arn)) #:http.request.field{:name "registryArn", :shape "String"})) (clojure.core/contains? input :port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :port)) #:http.request.field{:name "port", :shape "BoxedInteger"})) (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "Attributes", :type "list"})

(clojure.core/defn- ser-kernel-capabilities [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KernelCapabilities", :type "structure"} (clojure.core/contains? input :add) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :add)) #:http.request.field{:name "add", :shape "StringList"})) (clojure.core/contains? input :drop) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :drop)) #:http.request.field{:name "drop", :shape "StringList"}))))

(clojure.core/defn- ser-log-driver [input] #:http.request.field{:value (clojure.core/get {"gelf" "gelf", :gelf "gelf", "json-file" "json-file", "fluentd" "fluentd", "journald" "journald", "syslog" "syslog", "splunk" "splunk", "awslogs" "awslogs", :awslogs "awslogs", :splunk "splunk", :syslog "syslog", :fluentd "fluentd", :journald "journald", :jsonfile "json-file"} input), :shape "LogDriver"})

(clojure.core/defn- ser-network-bindings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-network-binding coll) #:http.request.field{:shape "NetworkBinding"}))) input), :shape "NetworkBindings", :type "list"})

(clojure.core/defn- ser-load-balancers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-load-balancer coll) #:http.request.field{:shape "LoadBalancer"}))) input), :shape "LoadBalancers", :type "list"})

(clojure.core/defn- ser-mount-point-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mount-point coll) #:http.request.field{:shape "MountPoint"}))) input), :shape "MountPointList", :type "list"})

(clojure.core/defn- ser-tmpfs [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:container-path input)) #:http.request.field{:name "containerPath", :shape "String"}) (clojure.core/into (ser-integer (:size input)) #:http.request.field{:name "size", :shape "Integer"})], :shape "Tmpfs", :type "structure"} (clojure.core/contains? input :mount-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :mount-options)) #:http.request.field{:name "mountOptions", :shape "StringList"}))))

(clojure.core/defn- ser-placement-strategy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlacementStrategy", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-strategy-type (input :type)) #:http.request.field{:name "type", :shape "PlacementStrategyType"})) (clojure.core/contains? input :field) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :field)) #:http.request.field{:name "field", :shape "String"}))))

(clojure.core/defn- ser-tmpfs-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tmpfs coll) #:http.request.field{:shape "Tmpfs"}))) input), :shape "TmpfsList", :type "list"})

(clojure.core/defn- ser-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerDefinition", :type "structure"} (clojure.core/contains? input :working-directory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :working-directory)) #:http.request.field{:name "workingDirectory", :shape "String"})) (clojure.core/contains? input :interactive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :interactive)) #:http.request.field{:name "interactive", :shape "BoxedBoolean"})) (clojure.core/contains? input :port-mappings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-mapping-list (input :port-mappings)) #:http.request.field{:name "portMappings", :shape "PortMappingList"})) (clojure.core/contains? input :pseudo-terminal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :pseudo-terminal)) #:http.request.field{:name "pseudoTerminal", :shape "BoxedBoolean"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname)) #:http.request.field{:name "hostname", :shape "String"})) (clojure.core/contains? input :ulimits) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ulimit-list (input :ulimits)) #:http.request.field{:name "ulimits", :shape "UlimitList"})) (clojure.core/contains? input :linux-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-linux-parameters (input :linux-parameters)) #:http.request.field{:name "linuxParameters", :shape "LinuxParameters"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :mount-points) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-point-list (input :mount-points)) #:http.request.field{:name "mountPoints", :shape "MountPointList"})) (clojure.core/contains? input :image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image)) #:http.request.field{:name "image", :shape "String"})) (clojure.core/contains? input :user) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :user)) #:http.request.field{:name "user", :shape "String"})) (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :cpu)) #:http.request.field{:name "cpu", :shape "Integer"})) (clojure.core/contains? input :extra-hosts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host-entry-list (input :extra-hosts)) #:http.request.field{:name "extraHosts", :shape "HostEntryList"})) (clojure.core/contains? input :repository-credentials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-credentials (input :repository-credentials)) #:http.request.field{:name "repositoryCredentials", :shape "RepositoryCredentials"})) (clojure.core/contains? input :docker-labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-docker-labels-map (input :docker-labels)) #:http.request.field{:name "dockerLabels", :shape "DockerLabelsMap"})) (clojure.core/contains? input :privileged) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :privileged)) #:http.request.field{:name "privileged", :shape "BoxedBoolean"})) (clojure.core/contains? input :readonly-root-filesystem) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :readonly-root-filesystem)) #:http.request.field{:name "readonlyRootFilesystem", :shape "BoxedBoolean"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :volumes-from) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-from-list (input :volumes-from)) #:http.request.field{:name "volumesFrom", :shape "VolumeFromList"})) (clojure.core/contains? input :entry-point) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :entry-point)) #:http.request.field{:name "entryPoint", :shape "StringList"})) (clojure.core/contains? input :log-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-configuration (input :log-configuration)) #:http.request.field{:name "logConfiguration", :shape "LogConfiguration"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory)) #:http.request.field{:name "memory", :shape "BoxedInteger"})) (clojure.core/contains? input :dns-search-domains) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :dns-search-domains)) #:http.request.field{:name "dnsSearchDomains", :shape "StringList"})) (clojure.core/contains? input :links) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :links)) #:http.request.field{:name "links", :shape "StringList"})) (clojure.core/contains? input :essential) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :essential)) #:http.request.field{:name "essential", :shape "BoxedBoolean"})) (clojure.core/contains? input :dns-servers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :dns-servers)) #:http.request.field{:name "dnsServers", :shape "StringList"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :health-check) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check (input :health-check)) #:http.request.field{:name "healthCheck", :shape "HealthCheck"})) (clojure.core/contains? input :memory-reservation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory-reservation)) #:http.request.field{:name "memoryReservation", :shape "BoxedInteger"})) (clojure.core/contains? input :system-controls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-system-controls (input :system-controls)) #:http.request.field{:name "systemControls", :shape "SystemControls"})) (clojure.core/contains? input :docker-security-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :docker-security-options)) #:http.request.field{:name "dockerSecurityOptions", :shape "StringList"})) (clojure.core/contains? input :disable-networking) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :disable-networking)) #:http.request.field{:name "disableNetworking", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-network-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkConfiguration", :type "structure"} (clojure.core/contains? input :awsvpc-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-vpc-configuration (input :awsvpc-configuration)) #:http.request.field{:name "awsvpcConfiguration", :shape "AwsVpcConfiguration"}))))

(clojure.core/defn- ser-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource coll) #:http.request.field{:shape "Resource"}))) input), :shape "Resources", :type "list"})

(clojure.core/defn- ser-device-cgroup-permissions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-device-cgroup-permission coll) #:http.request.field{:shape "DeviceCgroupPermission"}))) input), :shape "DeviceCgroupPermissions", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-volume-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume coll) #:http.request.field{:shape "Volume"}))) input), :shape "VolumeList", :type "list"})

(clojure.core/defn- ser-system-control [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SystemControl", :type "structure"} (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :namespace)) #:http.request.field{:name "namespace", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- ser-log-configuration-options-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "LogConfigurationOptionsMap", :type "map"})

(clojure.core/defn- ser-volume-from-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume-from coll) #:http.request.field{:shape "VolumeFrom"}))) input), :shape "VolumeFromList", :type "list"})

(clojure.core/defn- ser-attachment-state-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attachment-state-change coll) #:http.request.field{:shape "AttachmentStateChange"}))) input), :shape "AttachmentStateChanges", :type "list"})

(clojure.core/defn- ser-linux-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LinuxParameters", :type "structure"} (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kernel-capabilities (input :capabilities)) #:http.request.field{:name "capabilities", :shape "KernelCapabilities"})) (clojure.core/contains? input :devices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-devices-list (input :devices)) #:http.request.field{:name "devices", :shape "DevicesList"})) (clojure.core/contains? input :init-process-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :init-process-enabled)) #:http.request.field{:name "initProcessEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :shared-memory-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :shared-memory-size)) #:http.request.field{:name "sharedMemorySize", :shape "BoxedInteger"})) (clojure.core/contains? input :tmpfs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tmpfs-list (input :tmpfs)) #:http.request.field{:name "tmpfs", :shape "TmpfsList"}))))

(clojure.core/defn- ser-container-overrides [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-override coll) #:http.request.field{:shape "ContainerOverride"}))) input), :shape "ContainerOverrides", :type "list"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-cluster-field [input] #:http.request.field{:value (clojure.core/get {"STATISTICS" "STATISTICS", :statistics "STATISTICS"} input), :shape "ClusterField"})

(clojure.core/defn- ser-load-balancer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancer", :type "structure"} (clojure.core/contains? input :target-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-group-arn)) #:http.request.field{:name "targetGroupArn", :shape "String"})) (clojure.core/contains? input :load-balancer-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "String"})) (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-port-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PortMapping", :type "structure"} (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"})) (clojure.core/contains? input :host-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :host-port)) #:http.request.field{:name "hostPort", :shape "BoxedInteger"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transport-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "TransportProtocol"}))))

(clojure.core/defn- ser-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Resource", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "type", :shape "String"})) (clojure.core/contains? input :double-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :double-value)) #:http.request.field{:name "doubleValue", :shape "Double"})) (clojure.core/contains? input :long-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :long-value)) #:http.request.field{:name "longValue", :shape "Long"})) (clojure.core/contains? input :integer-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :integer-value)) #:http.request.field{:name "integerValue", :shape "Integer"})) (clojure.core/contains? input :string-set-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :string-set-value)) #:http.request.field{:name "stringSetValue", :shape "StringList"}))))

(clojure.core/defn- ser-host-volume-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HostVolumeProperties", :type "structure"} (clojure.core/contains? input :source-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-path)) #:http.request.field{:name "sourcePath", :shape "String"}))))

(clojure.core/defn- ser-container-instance-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "DRAINING" "DRAINING", :draining "DRAINING"} input), :shape "ContainerInstanceStatus"})

(clojure.core/defn- ser-launch-type [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "FARGATE" "FARGATE", :fargate "FARGATE"} input), :shape "LaunchType"})

(clojure.core/defn- ser-ulimit [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ulimit-name (:name input)) #:http.request.field{:name "name", :shape "UlimitName"}) (clojure.core/into (ser-integer (:soft-limit input)) #:http.request.field{:name "softLimit", :shape "Integer"}) (clojure.core/into (ser-integer (:hard-limit input)) #:http.request.field{:name "hardLimit", :shape "Integer"})], :shape "Ulimit", :type "structure"}))

(clojure.core/defn- ser-compatibility-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compatibility coll) #:http.request.field{:shape "Compatibility"}))) input), :shape "CompatibilityList", :type "list"})

(clojure.core/defn- ser-transport-protocol [input] #:http.request.field{:value (clojure.core/get {"tcp" "tcp", :tcp "tcp", "udp" "udp", :udp "udp"} input), :shape "TransportProtocol"})

(clojure.core/defn- ser-network-mode [input] #:http.request.field{:value (clojure.core/get {"bridge" "bridge", :bridge "bridge", "host" "host", :host "host", "awsvpc" "awsvpc", :awsvpc "awsvpc", "none" "none", :none "none"} input), :shape "NetworkMode"})

(clojure.core/defn- ser-version-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VersionInfo", :type "structure"} (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "agentVersion", :shape "String"})) (clojure.core/contains? input :agent-hash) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-hash)) #:http.request.field{:name "agentHash", :shape "String"})) (clojure.core/contains? input :docker-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :docker-version)) #:http.request.field{:name "dockerVersion", :shape "String"}))))

(clojure.core/defn- ser-task-override [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TaskOverride", :type "structure"} (clojure.core/contains? input :container-overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-overrides (input :container-overrides)) #:http.request.field{:name "containerOverrides", :shape "ContainerOverrides"})) (clojure.core/contains? input :task-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-role-arn)) #:http.request.field{:name "taskRoleArn", :shape "String"})) (clojure.core/contains? input :execution-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :execution-role-arn)) #:http.request.field{:name "executionRoleArn", :shape "String"}))))

(clojure.core/defn- ser-placement-constraints [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-placement-constraint coll) #:http.request.field{:shape "PlacementConstraint"}))) input), :shape "PlacementConstraints", :type "list"})

(clojure.core/defn- ser-task-definition-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"} input), :shape "TaskDefinitionStatus"})

(clojure.core/defn- ser-device [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:host-path input)) #:http.request.field{:name "hostPath", :shape "String"})], :shape "Device", :type "structure"} (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :permissions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-cgroup-permissions (input :permissions)) #:http.request.field{:name "permissions", :shape "DeviceCgroupPermissions"}))))

(clojure.core/defn- ser-placement-strategy-type [input] #:http.request.field{:value (clojure.core/get {"random" "random", :random "random", "spread" "spread", :spread "spread", "binpack" "binpack", :binpack "binpack"} input), :shape "PlacementStrategyType"})

(clojure.core/defn- ser-scope [input] #:http.request.field{:value (clojure.core/get {"task" "task", :task "task", "shared" "shared", :shared "shared"} input), :shape "Scope"})

(clojure.core/defn- ser-service-registries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-registry coll) #:http.request.field{:shape "ServiceRegistry"}))) input), :shape "ServiceRegistries", :type "list"})

(clojure.core/defn- ser-container-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-definition coll) #:http.request.field{:shape "ContainerDefinition"}))) input), :shape "ContainerDefinitions", :type "list"})

(clojure.core/defn- ser-device-cgroup-permission [input] #:http.request.field{:value (clojure.core/get {"read" "read", :read "read", "write" "write", :write "write", "mknod" "mknod", :mknod "mknod"} input), :shape "DeviceCgroupPermission"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-desired-status [input] #:http.request.field{:value (clojure.core/get {"RUNNING" "RUNNING", :running "RUNNING", "PENDING" "PENDING", :pending "PENDING", "STOPPED" "STOPPED", :stopped "STOPPED"} input), :shape "DesiredStatus"})

(clojure.core/defn- ser-key-value-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyValuePair", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-submit-container-state-change-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :task) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})) (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :exit-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :exit-code)) #:http.request.field{:name "exitCode", :shape "BoxedInteger"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :network-bindings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-bindings (input :network-bindings)) #:http.request.field{:name "networkBindings", :shape "NetworkBindings"}))))

(clojure.core/defn- req-delete-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-submit-task-state-change-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :task) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :pull-stopped-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :pull-stopped-at)) #:http.request.field{:name "pullStoppedAt", :shape "Timestamp"})) (clojure.core/contains? input :pull-started-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :pull-started-at)) #:http.request.field{:name "pullStartedAt", :shape "Timestamp"})) (clojure.core/contains? input :execution-stopped-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :execution-stopped-at)) #:http.request.field{:name "executionStoppedAt", :shape "Timestamp"})) (clojure.core/contains? input :containers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-state-changes (input :containers)) #:http.request.field{:name "containers", :shape "ContainerStateChanges"})) (clojure.core/contains? input :attachments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attachment-state-changes (input :attachments)) #:http.request.field{:name "attachments", :shape "AttachmentStateChanges"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})]}))

(clojure.core/defn- req-list-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "TargetType"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :attribute-name)) #:http.request.field{:name "attributeName", :shape "String"})) (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :attribute-value)) #:http.request.field{:name "attributeValue", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-update-container-instances-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"}) (clojure.core/into (ser-container-instance-status (input :status)) #:http.request.field{:name "status", :shape "ContainerInstanceStatus"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-list-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :desired-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-desired-status (input :desired-status)) #:http.request.field{:name "desiredStatus", :shape "DesiredStatus"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :container-instance) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-name)) #:http.request.field{:name "serviceName", :shape "String"})) (clojure.core/contains? input :family) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family)) #:http.request.field{:name "family", :shape "String"}))))

(clojure.core/defn- req-describe-container-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-register-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :family)) #:http.request.field{:name "family", :shape "String"}) (clojure.core/into (ser-container-definitions (input :container-definitions)) #:http.request.field{:name "containerDefinitions", :shape "ContainerDefinitions"})]} (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cpu)) #:http.request.field{:name "cpu", :shape "String"})) (clojure.core/contains? input :volumes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-list (input :volumes)) #:http.request.field{:name "volumes", :shape "VolumeList"})) (clojure.core/contains? input :network-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-mode (input :network-mode)) #:http.request.field{:name "networkMode", :shape "NetworkMode"})) (clojure.core/contains? input :task-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-role-arn)) #:http.request.field{:name "taskRoleArn", :shape "String"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :memory)) #:http.request.field{:name "memory", :shape "String"})) (clojure.core/contains? input :requires-compatibilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compatibility-list (input :requires-compatibilities)) #:http.request.field{:name "requiresCompatibilities", :shape "CompatibilityList"})) (clojure.core/contains? input :execution-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :execution-role-arn)) #:http.request.field{:name "executionRoleArn", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "TaskDefinitionPlacementConstraints"}))))

(clojure.core/defn- req-describe-services-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :services)) #:http.request.field{:name "services", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-put-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-register-container-instance-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :instance-identity-document) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-identity-document)) #:http.request.field{:name "instanceIdentityDocument", :shape "String"})) (clojure.core/contains? input :instance-identity-document-signature) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-identity-document-signature)) #:http.request.field{:name "instanceIdentityDocumentSignature", :shape "String"})) (clojure.core/contains? input :total-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resources (input :total-resources)) #:http.request.field{:name "totalResources", :shape "Resources"})) (clojure.core/contains? input :version-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-info (input :version-info)) #:http.request.field{:name "versionInfo", :shape "VersionInfo"})) (clojure.core/contains? input :container-instance-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance-arn)) #:http.request.field{:name "containerInstanceArn", :shape "String"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"}))))

(clojure.core/defn- req-update-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service)) #:http.request.field{:name "service", :shape "String"})]} (clojure.core/contains? input :deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-configuration (input :deployment-configuration)) #:http.request.field{:name "deploymentConfiguration", :shape "DeploymentConfiguration"})) (clojure.core/contains? input :force-new-deployment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force-new-deployment)) #:http.request.field{:name "forceNewDeployment", :shape "Boolean"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :desired-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :desired-count)) #:http.request.field{:name "desiredCount", :shape "BoxedInteger"})) (clojure.core/contains? input :task-definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})) (clojure.core/contains? input :health-check-grace-period-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :health-check-grace-period-seconds)) #:http.request.field{:name "healthCheckGracePeriodSeconds", :shape "BoxedInteger"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"}))))

(clojure.core/defn- req-deregister-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]}))

(clojure.core/defn- req-run-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]} (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-override (input :overrides)) #:http.request.field{:name "overrides", :shape "TaskOverride"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group)) #:http.request.field{:name "group", :shape "String"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :count)) #:http.request.field{:name "count", :shape "BoxedInteger"})) (clojure.core/contains? input :placement-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-strategies (input :placement-strategy)) #:http.request.field{:name "placementStrategy", :shape "PlacementStrategies"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "PlacementConstraints"}))))

(clojure.core/defn- req-list-container-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :filter)) #:http.request.field{:name "filter", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-instance-status (input :status)) #:http.request.field{:name "status", :shape "ContainerInstanceStatus"}))))

(clojure.core/defn- req-list-task-definition-families-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :family-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family-prefix)) #:http.request.field{:name "familyPrefix", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-family-status (input :status)) #:http.request.field{:name "status", :shape "TaskDefinitionFamilyStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-describe-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :clusters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :clusters)) #:http.request.field{:name "clusters", :shape "StringList"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-field-list (input :include)) #:http.request.field{:name "include", :shape "ClusterFieldList"}))))

(clojure.core/defn- req-update-container-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-list-task-definitions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :family-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family-prefix)) #:http.request.field{:name "familyPrefix", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-status (input :status)) #:http.request.field{:name "status", :shape "TaskDefinitionStatus"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort)) #:http.request.field{:name "sort", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-stop-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"}))))

(clojure.core/defn- req-describe-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]}))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "clusterName", :shape "String"}))))

(clojure.core/defn- req-create-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service-name)) #:http.request.field{:name "serviceName", :shape "String"}) (clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]} (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role)) #:http.request.field{:name "role", :shape "String"})) (clojure.core/contains? input :deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-configuration (input :deployment-configuration)) #:http.request.field{:name "deploymentConfiguration", :shape "DeploymentConfiguration"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :desired-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :desired-count)) #:http.request.field{:name "desiredCount", :shape "BoxedInteger"})) (clojure.core/contains? input :health-check-grace-period-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :health-check-grace-period-seconds)) #:http.request.field{:name "healthCheckGracePeriodSeconds", :shape "BoxedInteger"})) (clojure.core/contains? input :placement-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-strategies (input :placement-strategy)) #:http.request.field{:name "placementStrategy", :shape "PlacementStrategies"})) (clojure.core/contains? input :scheduling-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduling-strategy (input :scheduling-strategy)) #:http.request.field{:name "schedulingStrategy", :shape "SchedulingStrategy"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :service-registries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-registries (input :service-registries)) #:http.request.field{:name "serviceRegistries", :shape "ServiceRegistries"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "PlacementConstraints"})) (clojure.core/contains? input :load-balancers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancers (input :load-balancers)) #:http.request.field{:name "loadBalancers", :shape "LoadBalancers"}))))

(clojure.core/defn- req-discover-poll-endpoint-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :container-instance) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-start-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"}) (clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-override (input :overrides)) #:http.request.field{:name "overrides", :shape "TaskOverride"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group)) #:http.request.field{:name "group", :shape "String"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"}))))

(clojure.core/defn- req-list-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :scheduling-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduling-strategy (input :scheduling-strategy)) #:http.request.field{:name "schedulingStrategy", :shape "SchedulingStrategy"}))))

(clojure.core/defn- req-delete-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service)) #:http.request.field{:name "service", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :force)) #:http.request.field{:name "force", :shape "BoxedBoolean"}))))

(clojure.core/defn- req-deregister-container-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :force)) #:http.request.field{:name "force", :shape "BoxedBoolean"}))))

(clojure.core/defn- req-describe-tasks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :tasks)) #:http.request.field{:name "tasks", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.spec.alpha/def :portkey.aws.ecs.list-clusters-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-clusters-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/list-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-clusters-request/next-token :portkey.aws.ecs.list-clusters-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-response/tasks (clojure.spec.alpha/and :portkey.aws.ecs/tasks))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-tasks-response/tasks :portkey.aws.ecs.describe-tasks-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-response/task-arns (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-tasks-response/task-arns :portkey.aws.ecs.list-tasks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs/string-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs.task-definition-placement-constraint/type (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-placement-constraint-type))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition-placement-constraint/expression (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-placement-constraint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task-definition-placement-constraint/type :portkey.aws.ecs.task-definition-placement-constraint/expression]))

(clojure.spec.alpha/def :portkey.aws.ecs.update-container-agent-response/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/container-instance))
(clojure.spec.alpha/def :portkey.aws.ecs/update-container-agent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.update-container-agent-response/container-instance]))

(clojure.spec.alpha/def :portkey.aws.ecs.health-check/command (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.health-check/interval (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.health-check/timeout (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.health-check/retries (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.health-check/start-period (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/health-check (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.health-check/command] :opt-un [:portkey.aws.ecs.health-check/interval :portkey.aws.ecs.health-check/timeout :portkey.aws.ecs.health-check/retries :portkey.aws.ecs.health-check/start-period]))

(clojure.spec.alpha/def :portkey.aws.ecs/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.ecs.attachment/id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attachment/type (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attachment/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attachment/details (clojure.spec.alpha/and :portkey.aws.ecs/attachment-details))
(clojure.spec.alpha/def :portkey.aws.ecs/attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.attachment/id :portkey.aws.ecs.attachment/type :portkey.aws.ecs.attachment/status :portkey.aws.ecs.attachment/details]))

(clojure.spec.alpha/def :portkey.aws.ecs/no-update-available-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/task (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/container-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/exit-code (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/network-bindings (clojure.spec.alpha/and :portkey.aws.ecs/network-bindings))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-container-state-change-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-container-state-change-request/cluster :portkey.aws.ecs.submit-container-state-change-request/task :portkey.aws.ecs.submit-container-state-change-request/container-name :portkey.aws.ecs.submit-container-state-change-request/status :portkey.aws.ecs.submit-container-state-change-request/exit-code :portkey.aws.ecs.submit-container-state-change-request/reason :portkey.aws.ecs.submit-container-state-change-request/network-bindings]))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-attributes-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.delete-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.delete-attributes-request/attributes] :opt-un [:portkey.aws.ecs.delete-attributes-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-response/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/container-instances))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-container-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-container-instances-response/container-instances :portkey.aws.ecs.describe-container-instances-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/scheduling-strategy #{"REPLICA" :daemon :replica "DAEMON"})

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-response/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/container-instance))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-container-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deregister-container-instance-response/container-instance]))

(clojure.spec.alpha/def :portkey.aws.ecs.host-entry/hostname (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.host-entry/ip-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/host-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.host-entry/hostname :portkey.aws.ecs.host-entry/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/string-map (clojure.spec.alpha/map-of :portkey.aws.ecs/string :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs/placement-strategies (clojure.spec.alpha/coll-of :portkey.aws.ecs/placement-strategy))

(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/mount-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.mount-point/source-volume :portkey.aws.ecs.mount-point/container-path :portkey.aws.ecs.mount-point/read-only]))

(clojure.spec.alpha/def :portkey.aws.ecs.deployment/updated-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/running-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment/pending-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs/deployment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deployment/updated-at :portkey.aws.ecs.deployment/created-at :portkey.aws.ecs.deployment/launch-type :portkey.aws.ecs.deployment/desired-count :portkey.aws.ecs.deployment/task-definition :portkey.aws.ecs.deployment/id :portkey.aws.ecs.deployment/status :portkey.aws.ecs.deployment/running-count :portkey.aws.ecs.deployment/network-configuration :portkey.aws.ecs.deployment/platform-version :portkey.aws.ecs.deployment/pending-count]))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/task (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/pull-stopped-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/pull-started-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/execution-stopped-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/containers (clojure.spec.alpha/and :portkey.aws.ecs/container-state-changes))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-request/attachments (clojure.spec.alpha/and :portkey.aws.ecs/attachment-state-changes))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-task-state-change-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-task-state-change-request/cluster :portkey.aws.ecs.submit-task-state-change-request/status :portkey.aws.ecs.submit-task-state-change-request/task :portkey.aws.ecs.submit-task-state-change-request/reason :portkey.aws.ecs.submit-task-state-change-request/pull-stopped-at :portkey.aws.ecs.submit-task-state-change-request/pull-started-at :portkey.aws.ecs.submit-task-state-change-request/execution-stopped-at :portkey.aws.ecs.submit-task-state-change-request/containers :portkey.aws.ecs.submit-task-state-change-request/attachments]))

(clojure.spec.alpha/def :portkey.aws.ecs.client-exception/message (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecs/tasks (clojure.spec.alpha/coll-of :portkey.aws.ecs/task))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-cluster-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-cluster-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.delete-cluster-request/cluster] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/target-type (clojure.spec.alpha/and :portkey.aws.ecs/target-type))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/attribute-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/attribute-value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/list-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.list-attributes-request/target-type] :opt-un [:portkey.aws.ecs.list-attributes-request/cluster :portkey.aws.ecs.list-attributes-request/attribute-name :portkey.aws.ecs.list-attributes-request/attribute-value :portkey.aws.ecs.list-attributes-request/next-token :portkey.aws.ecs.list-attributes-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecs/port-mapping-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/port-mapping))

(clojure.spec.alpha/def :portkey.aws.ecs.deployment-configuration/maximum-percent (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.deployment-configuration/minimum-healthy-percent (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/deployment-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deployment-configuration/maximum-percent :portkey.aws.ecs.deployment-configuration/minimum-healthy-percent]))

(clojure.spec.alpha/def :portkey.aws.ecs/failures (clojure.spec.alpha/coll-of :portkey.aws.ecs/failure))

(clojure.spec.alpha/def :portkey.aws.ecs/boxed-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ecs.network-binding/bind-ip (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.network-binding/container-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.network-binding/host-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.network-binding/protocol (clojure.spec.alpha/and :portkey.aws.ecs/transport-protocol))
(clojure.spec.alpha/def :portkey.aws.ecs/network-binding (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.network-binding/bind-ip :portkey.aws.ecs.network-binding/container-port :portkey.aws.ecs.network-binding/host-port :portkey.aws.ecs.network-binding/protocol]))

(clojure.spec.alpha/def :portkey.aws.ecs.container-override/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/command (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/environment (clojure.spec.alpha/and :portkey.aws.ecs/environment-variables))
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/cpu (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/memory (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/memory-reservation (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/container-override (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-override/name :portkey.aws.ecs.container-override/command :portkey.aws.ecs.container-override/environment :portkey.aws.ecs.container-override/cpu :portkey.aws.ecs.container-override/memory :portkey.aws.ecs.container-override/memory-reservation]))

(clojure.spec.alpha/def :portkey.aws.ecs.volume/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.volume/host (clojure.spec.alpha/and :portkey.aws.ecs/host-volume-properties))
(clojure.spec.alpha/def :portkey.aws.ecs.volume/docker-volume-configuration (clojure.spec.alpha/and :portkey.aws.ecs/docker-volume-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs/volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.volume/name :portkey.aws.ecs.volume/host :portkey.aws.ecs.volume/docker-volume-configuration]))

(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-response/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/container-instance))
(clojure.spec.alpha/def :portkey.aws.ecs/register-container-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.register-container-instance-response/container-instance]))

(clojure.spec.alpha/def :portkey.aws.ecs.volume-from/source-container (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.volume-from/read-only (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/volume-from (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.volume-from/source-container :portkey.aws.ecs.volume-from/read-only]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-clusters-response/cluster-arns (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-clusters-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-clusters-response/cluster-arns :portkey.aws.ecs.list-clusters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs/docker-labels-map (clojure.spec.alpha/map-of :portkey.aws.ecs/string :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs.update-container-instances-state-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.update-container-instances-state-request/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.update-container-instances-state-request/status (clojure.spec.alpha/and :portkey.aws.ecs/container-instance-status))
(clojure.spec.alpha/def :portkey.aws.ecs/update-container-instances-state-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.update-container-instances-state-request/container-instances :portkey.aws.ecs.update-container-instances-state-request/status] :opt-un [:portkey.aws.ecs.update-container-instances-state-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/host-entry-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/host-entry))

(clojure.spec.alpha/def :portkey.aws.ecs/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.ecs/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/desired-status (clojure.spec.alpha/and :portkey.aws.ecs/desired-status))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/service-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-tasks-request/family (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-tasks-request/desired-status :portkey.aws.ecs.list-tasks-request/cluster :portkey.aws.ecs.list-tasks-request/container-instance :portkey.aws.ecs.list-tasks-request/started-by :portkey.aws.ecs.list-tasks-request/launch-type :portkey.aws.ecs.list-tasks-request/max-results :portkey.aws.ecs.list-tasks-request/next-token :portkey.aws.ecs.list-tasks-request/service-name :portkey.aws.ecs.list-tasks-request/family]))

(clojure.spec.alpha/def :portkey.aws.ecs/container-state-changes (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-state-change))

(clojure.spec.alpha/def :portkey.aws.ecs/assign-public-ip #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-request/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-container-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-container-instances-request/container-instances] :opt-un [:portkey.aws.ecs.describe-container-instances-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-family-status #{:inactive :all :active "INACTIVE" "ACTIVE" "ALL"})

(clojure.spec.alpha/def :portkey.aws.ecs/boxed-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/volumes (clojure.spec.alpha/and :portkey.aws.ecs/volume-list))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/container-definitions (clojure.spec.alpha/and :portkey.aws.ecs/container-definitions))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/network-mode (clojure.spec.alpha/and :portkey.aws.ecs/network-mode))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/task-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/memory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/family (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/requires-compatibilities (clojure.spec.alpha/and :portkey.aws.ecs/compatibility-list))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/execution-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs/register-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.register-task-definition-request/family :portkey.aws.ecs.register-task-definition-request/container-definitions] :opt-un [:portkey.aws.ecs.register-task-definition-request/cpu :portkey.aws.ecs.register-task-definition-request/volumes :portkey.aws.ecs.register-task-definition-request/network-mode :portkey.aws.ecs.register-task-definition-request/task-role-arn :portkey.aws.ecs.register-task-definition-request/memory :portkey.aws.ecs.register-task-definition-request/requires-compatibilities :portkey.aws.ecs.register-task-definition-request/execution-role-arn :portkey.aws.ecs.register-task-definition-request/placement-constraints]))

(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/subnets (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/security-groups (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/assign-public-ip (clojure.spec.alpha/and :portkey.aws.ecs/assign-public-ip))
(clojure.spec.alpha/def :portkey.aws.ecs/aws-vpc-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.aws-vpc-configuration/subnets] :opt-un [:portkey.aws.ecs.aws-vpc-configuration/security-groups :portkey.aws.ecs.aws-vpc-configuration/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-request/services (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-services-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-services-request/services] :opt-un [:portkey.aws.ecs.describe-services-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.put-attributes-request/attributes] :opt-un [:portkey.aws.ecs.put-attributes-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/instance-identity-document (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/instance-identity-document-signature (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/total-resources (clojure.spec.alpha/and :portkey.aws.ecs/resources))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/version-info (clojure.spec.alpha/and :portkey.aws.ecs/version-info))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/container-instance-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/register-container-instance-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.register-container-instance-request/cluster :portkey.aws.ecs.register-container-instance-request/instance-identity-document :portkey.aws.ecs.register-container-instance-request/instance-identity-document-signature :portkey.aws.ecs.register-container-instance-request/total-resources :portkey.aws.ecs.register-container-instance-request/version-info :portkey.aws.ecs.register-container-instance-request/container-instance-arn :portkey.aws.ecs.register-container-instance-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-placement-constraint-type #{"memberOf" :member-of})

(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-response/task (clojure.spec.alpha/and :portkey.aws.ecs/task))
(clojure.spec.alpha/def :portkey.aws.ecs/stop-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.stop-task-response/task]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.ecs/clusters))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-clusters-response/clusters :portkey.aws.ecs.describe-clusters-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/containers (clojure.spec.alpha/coll-of :portkey.aws.ecs/container))

(clojure.spec.alpha/def :portkey.aws.ecs.container-state-change/container-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-state-change/exit-code (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-state-change/network-bindings (clojure.spec.alpha/and :portkey.aws.ecs/network-bindings))
(clojure.spec.alpha/def :portkey.aws.ecs.container-state-change/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-state-change/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/container-state-change (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-state-change/container-name :portkey.aws.ecs.container-state-change/exit-code :portkey.aws.ecs.container-state-change/network-bindings :portkey.aws.ecs.container-state-change/reason :portkey.aws.ecs.container-state-change/status]))

(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/deployment-configuration (clojure.spec.alpha/and :portkey.aws.ecs/deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/force-new-deployment (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/health-check-grace-period-seconds (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.update-service-request/service (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/update-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.update-service-request/service] :opt-un [:portkey.aws.ecs.update-service-request/deployment-configuration :portkey.aws.ecs.update-service-request/force-new-deployment :portkey.aws.ecs.update-service-request/cluster :portkey.aws.ecs.update-service-request/desired-count :portkey.aws.ecs.update-service-request/task-definition :portkey.aws.ecs.update-service-request/health-check-grace-period-seconds :portkey.aws.ecs.update-service-request/network-configuration :portkey.aws.ecs.update-service-request/platform-version]))

(clojure.spec.alpha/def :portkey.aws.ecs/target-type #{"container-instance" :containerinstance})

(clojure.spec.alpha/def :portkey.aws.ecs/sort-order #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.ecs.run-task-response/tasks (clojure.spec.alpha/and :portkey.aws.ecs/tasks))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/run-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.run-task-response/tasks :portkey.aws.ecs.run-task-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/ulimit-name #{"nproc" :locks :memlock :msgqueue :sigpending "fsize" "memlock" "nofile" "cpu" :rss "rtprio" "sigpending" :fsize "rttime" :nproc "msgqueue" :rttime :nofile :stack :core :nice "locks" "data" "core" "rss" :cpu :rtprio "nice" "stack" :data})

(clojure.spec.alpha/def :portkey.aws.ecs.delete-service-response/service (clojure.spec.alpha/and :portkey.aws.ecs/service))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.delete-service-response/service]))

(clojure.spec.alpha/def :portkey.aws.ecs/blocked-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/health-status #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-task-definition-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.deregister-task-definition-request/task-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-placement-constraints (clojure.spec.alpha/coll-of :portkey.aws.ecs/task-definition-placement-constraint))

(clojure.spec.alpha/def :portkey.aws.ecs/ulimit-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/ulimit))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.delete-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.ecs/cluster))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.delete-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/service-not-active-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.service-event/id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service-event/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.service-event/message (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/service-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.service-event/id :portkey.aws.ecs.service-event/created-at :portkey.aws.ecs.service-event/message]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs.list-attributes-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-attributes-response/attributes :portkey.aws.ecs.list-attributes-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs/unsupported-feature-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.docker-volume-configuration/scope (clojure.spec.alpha/and :portkey.aws.ecs/scope))
(clojure.spec.alpha/def :portkey.aws.ecs.docker-volume-configuration/autoprovision (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.docker-volume-configuration/driver (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.docker-volume-configuration/driver-opts (clojure.spec.alpha/and :portkey.aws.ecs/string-map))
(clojure.spec.alpha/def :portkey.aws.ecs.docker-volume-configuration/labels (clojure.spec.alpha/and :portkey.aws.ecs/string-map))
(clojure.spec.alpha/def :portkey.aws.ecs/docker-volume-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.docker-volume-configuration/scope :portkey.aws.ecs.docker-volume-configuration/autoprovision :portkey.aws.ecs.docker-volume-configuration/driver :portkey.aws.ecs.docker-volume-configuration/driver-opts :portkey.aws.ecs.docker-volume-configuration/labels]))

(clojure.spec.alpha/def :portkey.aws.ecs/attachments (clojure.spec.alpha/coll-of :portkey.aws.ecs/attachment))

(clojure.spec.alpha/def :portkey.aws.ecs/service-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/overrides (clojure.spec.alpha/and :portkey.aws.ecs/task-override))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/count (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/placement-strategy (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategies))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs/run-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.run-task-request/task-definition] :opt-un [:portkey.aws.ecs.run-task-request/overrides :portkey.aws.ecs.run-task-request/cluster :portkey.aws.ecs.run-task-request/group :portkey.aws.ecs.run-task-request/started-by :portkey.aws.ecs.run-task-request/launch-type :portkey.aws.ecs.run-task-request/count :portkey.aws.ecs.run-task-request/placement-strategy :portkey.aws.ecs.run-task-request/network-configuration :portkey.aws.ecs.run-task-request/platform-version :portkey.aws.ecs.run-task-request/placement-constraints]))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-unknown-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-request/filter (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-request/status (clojure.spec.alpha/and :portkey.aws.ecs/container-instance-status))
(clojure.spec.alpha/def :portkey.aws.ecs/list-container-instances-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-container-instances-request/cluster :portkey.aws.ecs.list-container-instances-request/filter :portkey.aws.ecs.list-container-instances-request/next-token :portkey.aws.ecs.list-container-instances-request/max-results :portkey.aws.ecs.list-container-instances-request/status]))

(clojure.spec.alpha/def :portkey.aws.ecs.attachment-state-change/attachment-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attachment-state-change/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/attachment-state-change (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.attachment-state-change/attachment-arn :portkey.aws.ecs.attachment-state-change/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/placement-constraint-type #{:distinct-instance "distinctInstance" "memberOf" :member-of})

(clojure.spec.alpha/def :portkey.aws.ecs.log-configuration/log-driver (clojure.spec.alpha/and :portkey.aws.ecs/log-driver))
(clojure.spec.alpha/def :portkey.aws.ecs.log-configuration/options (clojure.spec.alpha/and :portkey.aws.ecs/log-configuration-options-map))
(clojure.spec.alpha/def :portkey.aws.ecs/log-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.log-configuration/log-driver] :opt-un [:portkey.aws.ecs.log-configuration/options]))

(clojure.spec.alpha/def :portkey.aws.ecs/system-controls (clojure.spec.alpha/coll-of :portkey.aws.ecs/system-control))

(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-request/family-prefix (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-request/status (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-family-status))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/list-task-definition-families-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-task-definition-families-request/family-prefix :portkey.aws.ecs.list-task-definition-families-request/status :portkey.aws.ecs.list-task-definition-families-request/next-token :portkey.aws.ecs.list-task-definition-families-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecs/services (clojure.spec.alpha/coll-of :portkey.aws.ecs/service))

(clojure.spec.alpha/def :portkey.aws.ecs.attribute/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attribute/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.attribute/target-type (clojure.spec.alpha/and :portkey.aws.ecs/target-type))
(clojure.spec.alpha/def :portkey.aws.ecs.attribute/target-id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.attribute/name] :opt-un [:portkey.aws.ecs.attribute/value :portkey.aws.ecs.attribute/target-type :portkey.aws.ecs.attribute/target-id]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-response/task-definition-arns (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-task-definitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-task-definitions-response/task-definition-arns :portkey.aws.ecs.list-task-definitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs.repository-credentials/credentials-parameter (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/repository-credentials (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.repository-credentials/credentials-parameter] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.placement-constraint/type (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraint-type))
(clojure.spec.alpha/def :portkey.aws.ecs.placement-constraint/expression (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/placement-constraint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.placement-constraint/type :portkey.aws.ecs.placement-constraint/expression]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-request/clusters (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-request/include (clojure.spec.alpha/and :portkey.aws.ecs/cluster-field-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-clusters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-clusters-request/clusters :portkey.aws.ecs.describe-clusters-request/include]))

(clojure.spec.alpha/def :portkey.aws.ecs.create-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.ecs/cluster))
(clojure.spec.alpha/def :portkey.aws.ecs/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.create-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-task-definition-response/task-definition]))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/cluster-field))

(clojure.spec.alpha/def :portkey.aws.ecs/compatibility #{"EC2" "FARGATE" :fargate :ec-2})

(clojure.spec.alpha/def :portkey.aws.ecs.update-container-agent-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.update-container-agent-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/update-container-agent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.update-container-agent-request/container-instance] :opt-un [:portkey.aws.ecs.update-container-agent-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/devices-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/device))

(clojure.spec.alpha/def :portkey.aws.ecs.service-registry/registry-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service-registry/port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service-registry/container-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service-registry/container-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/service-registry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.service-registry/registry-arn :portkey.aws.ecs.service-registry/port :portkey.aws.ecs.service-registry/container-name :portkey.aws.ecs.service-registry/container-port]))

(clojure.spec.alpha/def :portkey.aws.ecs/attributes (clojure.spec.alpha/coll-of :portkey.aws.ecs/attribute))

(clojure.spec.alpha/def :portkey.aws.ecs.kernel-capabilities/add (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.kernel-capabilities/drop (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/kernel-capabilities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.kernel-capabilities/add :portkey.aws.ecs.kernel-capabilities/drop]))

(clojure.spec.alpha/def :portkey.aws.ecs/log-driver #{"gelf" :gelf "json-file" "fluentd" "journald" "syslog" "splunk" "awslogs" :awslogs :splunk :syslog :fluentd :journald :jsonfile})

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deregister-task-definition-response/task-definition]))

(clojure.spec.alpha/def :portkey.aws.ecs/network-bindings (clojure.spec.alpha/coll-of :portkey.aws.ecs/network-binding))

(clojure.spec.alpha/def :portkey.aws.ecs/load-balancers (clojure.spec.alpha/coll-of :portkey.aws.ecs/load-balancer))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.ecs/services))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-services-response/services :portkey.aws.ecs.describe-services-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/mount-point-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/mount-point))

(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/container-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/size (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/mount-options (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/tmpfs (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.tmpfs/container-path :portkey.aws.ecs.tmpfs/size] :opt-un [:portkey.aws.ecs.tmpfs/mount-options]))

(clojure.spec.alpha/def :portkey.aws.ecs.cluster/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/cluster-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/registered-container-instances-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/running-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/pending-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/active-services-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/statistics (clojure.spec.alpha/and :portkey.aws.ecs/statistics))
(clojure.spec.alpha/def :portkey.aws.ecs/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.cluster/cluster-arn :portkey.aws.ecs.cluster/cluster-name :portkey.aws.ecs.cluster/status :portkey.aws.ecs.cluster/registered-container-instances-count :portkey.aws.ecs.cluster/running-tasks-count :portkey.aws.ecs.cluster/pending-tasks-count :portkey.aws.ecs.cluster/active-services-count :portkey.aws.ecs.cluster/statistics]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-request/family-prefix (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-request/status (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-status))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-request/sort (clojure.spec.alpha/and :portkey.aws.ecs/sort-order))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/list-task-definitions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-task-definitions-request/family-prefix :portkey.aws.ecs.list-task-definitions-request/status :portkey.aws.ecs.list-task-definitions-request/sort :portkey.aws.ecs.list-task-definitions-request/next-token :portkey.aws.ecs.list-task-definitions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecs.placement-strategy/type (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategy-type))
(clojure.spec.alpha/def :portkey.aws.ecs.placement-strategy/field (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/placement-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.placement-strategy/type :portkey.aws.ecs.placement-strategy/field]))

(clojure.spec.alpha/def :portkey.aws.ecs/tmpfs-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/tmpfs))

(clojure.spec.alpha/def :portkey.aws.ecs.container/last-status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/network-interfaces (clojure.spec.alpha/and :portkey.aws.ecs/network-interfaces))
(clojure.spec.alpha/def :portkey.aws.ecs.container/container-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/exit-code (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container/health-status (clojure.spec.alpha/and :portkey.aws.ecs/health-status))
(clojure.spec.alpha/def :portkey.aws.ecs.container/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/task-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/network-bindings (clojure.spec.alpha/and :portkey.aws.ecs/network-bindings))
(clojure.spec.alpha/def :portkey.aws.ecs.container/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/container (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container/last-status :portkey.aws.ecs.container/network-interfaces :portkey.aws.ecs.container/container-arn :portkey.aws.ecs.container/exit-code :portkey.aws.ecs.container/health-status :portkey.aws.ecs.container/name :portkey.aws.ecs.container/task-arn :portkey.aws.ecs.container/network-bindings :portkey.aws.ecs.container/reason]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-response/container-instance-arns (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-container-instances-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-container-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-container-instances-response/container-instance-arns :portkey.aws.ecs.list-container-instances-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/compatibilities (clojure.spec.alpha/and :portkey.aws.ecs/compatibility-list))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/requires-attributes (clojure.spec.alpha/and :portkey.aws.ecs/requires-attributes))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/task-definition-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/volumes (clojure.spec.alpha/and :portkey.aws.ecs/volume-list))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/revision (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/container-definitions (clojure.spec.alpha/and :portkey.aws.ecs/container-definitions))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/network-mode (clojure.spec.alpha/and :portkey.aws.ecs/network-mode))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/task-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/status (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-status))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/memory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/family (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/requires-compatibilities (clojure.spec.alpha/and :portkey.aws.ecs/compatibility-list))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/execution-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs/task-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task-definition/compatibilities :portkey.aws.ecs.task-definition/requires-attributes :portkey.aws.ecs.task-definition/task-definition-arn :portkey.aws.ecs.task-definition/cpu :portkey.aws.ecs.task-definition/volumes :portkey.aws.ecs.task-definition/revision :portkey.aws.ecs.task-definition/container-definitions :portkey.aws.ecs.task-definition/network-mode :portkey.aws.ecs.task-definition/task-role-arn :portkey.aws.ecs.task-definition/status :portkey.aws.ecs.task-definition/memory :portkey.aws.ecs.task-definition/family :portkey.aws.ecs.task-definition/requires-compatibilities :portkey.aws.ecs.task-definition/execution-role-arn :portkey.aws.ecs.task-definition/placement-constraints]))

(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/working-directory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/interactive (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/port-mappings (clojure.spec.alpha/and :portkey.aws.ecs/port-mapping-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/pseudo-terminal (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/hostname (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/ulimits (clojure.spec.alpha/and :portkey.aws.ecs/ulimit-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/linux-parameters (clojure.spec.alpha/and :portkey.aws.ecs/linux-parameters))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/command (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/mount-points (clojure.spec.alpha/and :portkey.aws.ecs/mount-point-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/image (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/user (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/cpu (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/extra-hosts (clojure.spec.alpha/and :portkey.aws.ecs/host-entry-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/repository-credentials (clojure.spec.alpha/and :portkey.aws.ecs/repository-credentials))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/docker-labels (clojure.spec.alpha/and :portkey.aws.ecs/docker-labels-map))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/privileged (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/volumes-from (clojure.spec.alpha/and :portkey.aws.ecs/volume-from-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/entry-point (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/log-configuration (clojure.spec.alpha/and :portkey.aws.ecs/log-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/memory (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/dns-search-domains (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/links (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/essential (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/dns-servers (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/environment (clojure.spec.alpha/and :portkey.aws.ecs/environment-variables))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/health-check (clojure.spec.alpha/and :portkey.aws.ecs/health-check))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/memory-reservation (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/system-controls (clojure.spec.alpha/and :portkey.aws.ecs/system-controls))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/docker-security-options (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/disable-networking (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/container-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-definition/working-directory :portkey.aws.ecs.container-definition/interactive :portkey.aws.ecs.container-definition/port-mappings :portkey.aws.ecs.container-definition/pseudo-terminal :portkey.aws.ecs.container-definition/hostname :portkey.aws.ecs.container-definition/ulimits :portkey.aws.ecs.container-definition/linux-parameters :portkey.aws.ecs.container-definition/command :portkey.aws.ecs.container-definition/mount-points :portkey.aws.ecs.container-definition/image :portkey.aws.ecs.container-definition/user :portkey.aws.ecs.container-definition/cpu :portkey.aws.ecs.container-definition/extra-hosts :portkey.aws.ecs.container-definition/repository-credentials :portkey.aws.ecs.container-definition/docker-labels :portkey.aws.ecs.container-definition/privileged :portkey.aws.ecs.container-definition/readonly-root-filesystem :portkey.aws.ecs.container-definition/name :portkey.aws.ecs.container-definition/volumes-from :portkey.aws.ecs.container-definition/entry-point :portkey.aws.ecs.container-definition/log-configuration :portkey.aws.ecs.container-definition/memory :portkey.aws.ecs.container-definition/dns-search-domains :portkey.aws.ecs.container-definition/links :portkey.aws.ecs.container-definition/essential :portkey.aws.ecs.container-definition/dns-servers :portkey.aws.ecs.container-definition/environment :portkey.aws.ecs.container-definition/health-check :portkey.aws.ecs.container-definition/memory-reservation :portkey.aws.ecs.container-definition/system-controls :portkey.aws.ecs.container-definition/docker-security-options :portkey.aws.ecs.container-definition/disable-networking]))

(clojure.spec.alpha/def :portkey.aws.ecs/missing-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/task (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/stop-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.stop-task-request/task] :opt-un [:portkey.aws.ecs.stop-task-request/cluster :portkey.aws.ecs.stop-task-request/reason]))

(clojure.spec.alpha/def :portkey.aws.ecs.network-configuration/awsvpc-configuration (clojure.spec.alpha/and :portkey.aws.ecs/aws-vpc-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs/network-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.network-configuration/awsvpc-configuration]))

(clojure.spec.alpha/def :portkey.aws.ecs/attribute-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.failure/arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.failure/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.failure/arn :portkey.aws.ecs.failure/reason]))

(clojure.spec.alpha/def :portkey.aws.ecs/resources (clojure.spec.alpha/coll-of :portkey.aws.ecs/resource))

(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-response/endpoint (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-response/telemetry-endpoint (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/discover-poll-endpoint-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.discover-poll-endpoint-response/endpoint :portkey.aws.ecs.discover-poll-endpoint-response/telemetry-endpoint]))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-response/acknowledgment (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-task-state-change-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-task-state-change-response/acknowledgment]))

(clojure.spec.alpha/def :portkey.aws.ecs/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-container-instances-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/device-cgroup-permissions (clojure.spec.alpha/coll-of :portkey.aws.ecs/device-cgroup-permission))

(clojure.spec.alpha/def :portkey.aws.ecs/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-task-definition-request/task-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/volume-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/volume))

(clojure.spec.alpha/def :portkey.aws.ecs.system-control/namespace (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.system-control/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/system-control (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.system-control/namespace :portkey.aws.ecs.system-control/value]))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-task-definition-incompatibility-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/log-configuration-options-map (clojure.spec.alpha/map-of :portkey.aws.ecs/string :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs/clusters (clojure.spec.alpha/coll-of :portkey.aws.ecs/cluster))

(clojure.spec.alpha/def :portkey.aws.ecs.create-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/create-cluster-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.create-cluster-request/cluster-name]))

(clojure.spec.alpha/def :portkey.aws.ecs/volume-from-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/volume-from))

(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/attachment-id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/private-ipv-4-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/ipv-6-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.network-interface/attachment-id :portkey.aws.ecs.network-interface/private-ipv-4-address :portkey.aws.ecs.network-interface/ipv-6-address]))

(clojure.spec.alpha/def :portkey.aws.ecs/attachment-state-changes (clojure.spec.alpha/coll-of :portkey.aws.ecs/attachment-state-change))

(clojure.spec.alpha/def :portkey.aws.ecs.list-services-response/service-arns (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-services-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-services-response/service-arns :portkey.aws.ecs.list-services-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs.server-exception/message (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/version-info (clojure.spec.alpha/and :portkey.aws.ecs/version-info))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/ec-2-instance-id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/agent-update-status (clojure.spec.alpha/and :portkey.aws.ecs/agent-update-status))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/registered-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/agent-connected (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/remaining-resources (clojure.spec.alpha/and :portkey.aws.ecs/resources))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/running-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/container-instance-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/version (clojure.spec.alpha/and :portkey.aws.ecs/long))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/registered-resources (clojure.spec.alpha/and :portkey.aws.ecs/resources))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/pending-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/attachments (clojure.spec.alpha/and :portkey.aws.ecs/attachments))
(clojure.spec.alpha/def :portkey.aws.ecs/container-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-instance/version-info :portkey.aws.ecs.container-instance/ec-2-instance-id :portkey.aws.ecs.container-instance/agent-update-status :portkey.aws.ecs.container-instance/registered-at :portkey.aws.ecs.container-instance/agent-connected :portkey.aws.ecs.container-instance/remaining-resources :portkey.aws.ecs.container-instance/status :portkey.aws.ecs.container-instance/running-tasks-count :portkey.aws.ecs.container-instance/attributes :portkey.aws.ecs.container-instance/container-instance-arn :portkey.aws.ecs.container-instance/version :portkey.aws.ecs.container-instance/registered-resources :portkey.aws.ecs.container-instance/pending-tasks-count :portkey.aws.ecs.container-instance/attachments]))

(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/role (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/deployment-configuration (clojure.spec.alpha/and :portkey.aws.ecs/deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/client-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/health-check-grace-period-seconds (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/placement-strategy (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategies))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/service-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/scheduling-strategy (clojure.spec.alpha/and :portkey.aws.ecs/scheduling-strategy))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/service-registries (clojure.spec.alpha/and :portkey.aws.ecs/service-registries))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/load-balancers (clojure.spec.alpha/and :portkey.aws.ecs/load-balancers))
(clojure.spec.alpha/def :portkey.aws.ecs/create-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.create-service-request/service-name :portkey.aws.ecs.create-service-request/task-definition] :opt-un [:portkey.aws.ecs.create-service-request/role :portkey.aws.ecs.create-service-request/deployment-configuration :portkey.aws.ecs.create-service-request/client-token :portkey.aws.ecs.create-service-request/cluster :portkey.aws.ecs.create-service-request/launch-type :portkey.aws.ecs.create-service-request/desired-count :portkey.aws.ecs.create-service-request/health-check-grace-period-seconds :portkey.aws.ecs.create-service-request/placement-strategy :portkey.aws.ecs.create-service-request/scheduling-strategy :portkey.aws.ecs.create-service-request/network-configuration :portkey.aws.ecs.create-service-request/service-registries :portkey.aws.ecs.create-service-request/platform-version :portkey.aws.ecs.create-service-request/placement-constraints :portkey.aws.ecs.create-service-request/load-balancers]))

(clojure.spec.alpha/def :portkey.aws.ecs/connectivity #{:disconnected :connected "CONNECTED" "DISCONNECTED"})

(clojure.spec.alpha/def :portkey.aws.ecs.update-service-response/service (clojure.spec.alpha/and :portkey.aws.ecs/service))
(clojure.spec.alpha/def :portkey.aws.ecs/update-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.update-service-response/service]))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-tasks-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/discover-poll-endpoint-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.discover-poll-endpoint-request/container-instance :portkey.aws.ecs.discover-poll-endpoint-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/requires-attributes (clojure.spec.alpha/coll-of :portkey.aws.ecs/attribute))

(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/capabilities (clojure.spec.alpha/and :portkey.aws.ecs/kernel-capabilities))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/devices (clojure.spec.alpha/and :portkey.aws.ecs/devices-list))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/init-process-enabled (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/shared-memory-size (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/tmpfs (clojure.spec.alpha/and :portkey.aws.ecs/tmpfs-list))
(clojure.spec.alpha/def :portkey.aws.ecs/linux-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.linux-parameters/capabilities :portkey.aws.ecs.linux-parameters/devices :portkey.aws.ecs.linux-parameters/init-process-enabled :portkey.aws.ecs.linux-parameters/shared-memory-size :portkey.aws.ecs.linux-parameters/tmpfs]))

(clojure.spec.alpha/def :portkey.aws.ecs/attachment-details (clojure.spec.alpha/coll-of :portkey.aws.ecs/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.ecs/container-overrides (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-override))

(clojure.spec.alpha/def :portkey.aws.ecs/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-field #{:statistics "STATISTICS"})

(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/overrides (clojure.spec.alpha/and :portkey.aws.ecs/task-override))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs/start-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.start-task-request/task-definition :portkey.aws.ecs.start-task-request/container-instances] :opt-un [:portkey.aws.ecs.start-task-request/cluster :portkey.aws.ecs.start-task-request/overrides :portkey.aws.ecs.start-task-request/started-by :portkey.aws.ecs.start-task-request/group :portkey.aws.ecs.start-task-request/network-configuration]))

(clojure.spec.alpha/def :portkey.aws.ecs/service-events (clojure.spec.alpha/coll-of :portkey.aws.ecs/service-event))

(clojure.spec.alpha/def :portkey.aws.ecs.load-balancer/target-group-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.load-balancer/load-balancer-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.load-balancer/container-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.load-balancer/container-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs/load-balancer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.load-balancer/target-group-arn :portkey.aws.ecs.load-balancer/load-balancer-name :portkey.aws.ecs.load-balancer/container-name :portkey.aws.ecs.load-balancer/container-port]))

(clojure.spec.alpha/def :portkey.aws.ecs/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecs.port-mapping/container-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.port-mapping/host-port (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.port-mapping/protocol (clojure.spec.alpha/and :portkey.aws.ecs/transport-protocol))
(clojure.spec.alpha/def :portkey.aws.ecs/port-mapping (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.port-mapping/container-port :portkey.aws.ecs.port-mapping/host-port :portkey.aws.ecs.port-mapping/protocol]))

(clojure.spec.alpha/def :portkey.aws.ecs/agent-update-status #{:updated "STAGED" :pending "UPDATING" "PENDING" "STAGING" "FAILED" :updating :staging "UPDATED" :failed :staged})

(clojure.spec.alpha/def :portkey.aws.ecs/statistics (clojure.spec.alpha/coll-of :portkey.aws.ecs/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.ecs.start-task-response/tasks (clojure.spec.alpha/and :portkey.aws.ecs/tasks))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/start-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.start-task-response/tasks :portkey.aws.ecs.start-task-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs/register-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.register-task-definition-response/task-definition]))

(clojure.spec.alpha/def :portkey.aws.ecs.create-service-response/service (clojure.spec.alpha/and :portkey.aws.ecs/service))
(clojure.spec.alpha/def :portkey.aws.ecs/create-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.create-service-response/service]))

(clojure.spec.alpha/def :portkey.aws.ecs.resource/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.resource/type (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.resource/double-value (clojure.spec.alpha/and :portkey.aws.ecs/double))
(clojure.spec.alpha/def :portkey.aws.ecs.resource/long-value (clojure.spec.alpha/and :portkey.aws.ecs/long))
(clojure.spec.alpha/def :portkey.aws.ecs.resource/integer-value (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.resource/string-set-value (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.resource/name :portkey.aws.ecs.resource/type :portkey.aws.ecs.resource/double-value :portkey.aws.ecs.resource/long-value :portkey.aws.ecs.resource/integer-value :portkey.aws.ecs.resource/string-set-value]))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-response/acknowledgment (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-container-state-change-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-container-state-change-response/acknowledgment]))

(clojure.spec.alpha/def :portkey.aws.ecs.host-volume-properties/source-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/host-volume-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.host-volume-properties/source-path]))

(clojure.spec.alpha/def :portkey.aws.ecs/container-instance-status #{:draining "DRAINING" :active "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.ecs/launch-type #{"EC2" "FARGATE" :fargate :ec-2})

(clojure.spec.alpha/def :portkey.aws.ecs.ulimit/name (clojure.spec.alpha/and :portkey.aws.ecs/ulimit-name))
(clojure.spec.alpha/def :portkey.aws.ecs.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs/ulimit (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.ulimit/name :portkey.aws.ecs.ulimit/soft-limit :portkey.aws.ecs.ulimit/hard-limit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/container-instances (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-instance))

(clojure.spec.alpha/def :portkey.aws.ecs.list-services-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-services-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-services-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.list-services-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.list-services-request/scheduling-strategy (clojure.spec.alpha/and :portkey.aws.ecs/scheduling-strategy))
(clojure.spec.alpha/def :portkey.aws.ecs/list-services-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-services-request/cluster :portkey.aws.ecs.list-services-request/next-token :portkey.aws.ecs.list-services-request/max-results :portkey.aws.ecs.list-services-request/launch-type :portkey.aws.ecs.list-services-request/scheduling-strategy]))

(clojure.spec.alpha/def :portkey.aws.ecs/target-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/compatibility-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/compatibility))

(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-response/families (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.list-task-definition-families-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-task-definition-families-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-task-definition-families-response/families :portkey.aws.ecs.list-task-definition-families-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs.service/deployment-configuration (clojure.spec.alpha/and :portkey.aws.ecs/deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.service/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.service/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.service/role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/health-check-grace-period-seconds (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/placement-strategy (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategies))
(clojure.spec.alpha/def :portkey.aws.ecs.service/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/service-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/service-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/running-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/scheduling-strategy (clojure.spec.alpha/and :portkey.aws.ecs/scheduling-strategy))
(clojure.spec.alpha/def :portkey.aws.ecs.service/events (clojure.spec.alpha/and :portkey.aws.ecs/service-events))
(clojure.spec.alpha/def :portkey.aws.ecs.service/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.service/service-registries (clojure.spec.alpha/and :portkey.aws.ecs/service-registries))
(clojure.spec.alpha/def :portkey.aws.ecs.service/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs.service/pending-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/deployments (clojure.spec.alpha/and :portkey.aws.ecs/deployments))
(clojure.spec.alpha/def :portkey.aws.ecs.service/load-balancers (clojure.spec.alpha/and :portkey.aws.ecs/load-balancers))
(clojure.spec.alpha/def :portkey.aws.ecs/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.service/deployment-configuration :portkey.aws.ecs.service/created-at :portkey.aws.ecs.service/cluster-arn :portkey.aws.ecs.service/launch-type :portkey.aws.ecs.service/role-arn :portkey.aws.ecs.service/desired-count :portkey.aws.ecs.service/task-definition :portkey.aws.ecs.service/health-check-grace-period-seconds :portkey.aws.ecs.service/placement-strategy :portkey.aws.ecs.service/status :portkey.aws.ecs.service/service-name :portkey.aws.ecs.service/service-arn :portkey.aws.ecs.service/running-count :portkey.aws.ecs.service/scheduling-strategy :portkey.aws.ecs.service/events :portkey.aws.ecs.service/network-configuration :portkey.aws.ecs.service/service-registries :portkey.aws.ecs.service/platform-version :portkey.aws.ecs.service/placement-constraints :portkey.aws.ecs.service/pending-count :portkey.aws.ecs.service/deployments :portkey.aws.ecs.service/load-balancers]))

(clojure.spec.alpha/def :portkey.aws.ecs/transport-protocol #{:tcp "udp" :udp "tcp"})

(clojure.spec.alpha/def :portkey.aws.ecs/network-mode #{"none" "host" :awsvpc "bridge" :host :bridge "awsvpc" :none})

(clojure.spec.alpha/def :portkey.aws.ecs.version-info/agent-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.version-info/agent-hash (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.version-info/docker-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/version-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.version-info/agent-version :portkey.aws.ecs.version-info/agent-hash :portkey.aws.ecs.version-info/docker-version]))

(clojure.spec.alpha/def :portkey.aws.ecs.task-override/container-overrides (clojure.spec.alpha/and :portkey.aws.ecs/container-overrides))
(clojure.spec.alpha/def :portkey.aws.ecs.task-override/task-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-override/execution-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/task-override (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task-override/container-overrides :portkey.aws.ecs.task-override/task-role-arn :portkey.aws.ecs.task-override/execution-role-arn]))

(clojure.spec.alpha/def :portkey.aws.ecs/placement-constraints (clojure.spec.alpha/coll-of :portkey.aws.ecs/placement-constraint))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-status #{:inactive :active "INACTIVE" "ACTIVE"})

(clojure.spec.alpha/def :portkey.aws.ecs.delete-service-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.delete-service-request/service (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.delete-service-request/force (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.delete-service-request/service] :opt-un [:portkey.aws.ecs.delete-service-request/cluster :portkey.aws.ecs.delete-service-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecs/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.device/host-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.device/container-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.device/permissions (clojure.spec.alpha/and :portkey.aws.ecs/device-cgroup-permissions))
(clojure.spec.alpha/def :portkey.aws.ecs/device (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.device/host-path] :opt-un [:portkey.aws.ecs.device/container-path :portkey.aws.ecs.device/permissions]))

(clojure.spec.alpha/def :portkey.aws.ecs/placement-strategy-type #{"random" :spread "binpack" :random :binpack "spread"})

(clojure.spec.alpha/def :portkey.aws.ecs.task/desired-status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/overrides (clojure.spec.alpha/and :portkey.aws.ecs/task-override))
(clojure.spec.alpha/def :portkey.aws.ecs.task/last-status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.task/task-definition-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/started-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/health-status (clojure.spec.alpha/and :portkey.aws.ecs/health-status))
(clojure.spec.alpha/def :portkey.aws.ecs.task/connectivity-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/connectivity (clojure.spec.alpha/and :portkey.aws.ecs/connectivity))
(clojure.spec.alpha/def :portkey.aws.ecs.task/stopping-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/stopped-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/task-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/memory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/container-instance-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/version (clojure.spec.alpha/and :portkey.aws.ecs/long))
(clojure.spec.alpha/def :portkey.aws.ecs.task/stopped-reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/pull-stopped-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/pull-started-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/execution-stopped-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/containers (clojure.spec.alpha/and :portkey.aws.ecs/containers))
(clojure.spec.alpha/def :portkey.aws.ecs.task/attachments (clojure.spec.alpha/and :portkey.aws.ecs/attachments))
(clojure.spec.alpha/def :portkey.aws.ecs/task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task/desired-status :portkey.aws.ecs.task/overrides :portkey.aws.ecs.task/last-status :portkey.aws.ecs.task/created-at :portkey.aws.ecs.task/group :portkey.aws.ecs.task/started-by :portkey.aws.ecs.task/cluster-arn :portkey.aws.ecs.task/launch-type :portkey.aws.ecs.task/task-definition-arn :portkey.aws.ecs.task/cpu :portkey.aws.ecs.task/started-at :portkey.aws.ecs.task/health-status :portkey.aws.ecs.task/connectivity-at :portkey.aws.ecs.task/connectivity :portkey.aws.ecs.task/stopping-at :portkey.aws.ecs.task/stopped-at :portkey.aws.ecs.task/task-arn :portkey.aws.ecs.task/memory :portkey.aws.ecs.task/container-instance-arn :portkey.aws.ecs.task/version :portkey.aws.ecs.task/stopped-reason :portkey.aws.ecs.task/pull-stopped-at :portkey.aws.ecs.task/pull-started-at :portkey.aws.ecs.task/platform-version :portkey.aws.ecs.task/execution-stopped-at :portkey.aws.ecs.task/containers :portkey.aws.ecs.task/attachments]))

(clojure.spec.alpha/def :portkey.aws.ecs/scope #{:task "shared" "task" :shared})

(clojure.spec.alpha/def :portkey.aws.ecs/service-registries (clojure.spec.alpha/coll-of :portkey.aws.ecs/service-registry))

(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/put-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.put-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.ecs/container-definitions (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-definition))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-services-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/update-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/force (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-container-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.deregister-container-instance-request/container-instance] :opt-un [:portkey.aws.ecs.deregister-container-instance-request/cluster :portkey.aws.ecs.deregister-container-instance-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecs/device-cgroup-permission #{:read "read" :write :mknod "mknod" "write"})

(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-request/tasks (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-tasks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-tasks-request/tasks] :opt-un [:portkey.aws.ecs.describe-tasks-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/deployments (clojure.spec.alpha/coll-of :portkey.aws.ecs/deployment))

(clojure.spec.alpha/def :portkey.aws.ecs/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ecs/network-interfaces (clojure.spec.alpha/coll-of :portkey.aws.ecs/network-interface))

(clojure.spec.alpha/def :portkey.aws.ecs/desired-status #{:pending "PENDING" :running :stopped "STOPPED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.ecs.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/key-value-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.key-value-pair/name :portkey.aws.ecs.key-value-pair/value]))

(clojure.spec.alpha/def :portkey.aws.ecs.update-container-instances-state-response/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/container-instances))
(clojure.spec.alpha/def :portkey.aws.ecs.update-container-instances-state-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/update-container-instances-state-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.update-container-instances-state-response/container-instances :portkey.aws.ecs.update-container-instances-state-response/failures]))

(clojure.core/defn delete-service ([delete-service-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-service-request delete-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteService", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-service-response))

(clojure.core/defn create-cluster ([] (create-cluster {})) ([create-cluster-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateCluster", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/? :portkey.aws.ecs/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/create-cluster-response))

(clojure.core/defn submit-container-state-change ([] (submit-container-state-change {})) ([submit-container-state-change-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-submit-container-state-change-request submit-container-state-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/submit-container-state-change-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/submit-container-state-change-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubmitContainerStateChange", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef submit-container-state-change :args (clojure.spec.alpha/? :portkey.aws.ecs/submit-container-state-change-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/submit-container-state-change-response))

(clojure.core/defn list-tasks ([] (list-tasks {})) ([list-tasks-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tasks-request list-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTasks", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tasks :args (clojure.spec.alpha/? :portkey.aws.ecs/list-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-tasks-response))

(clojure.core/defn update-container-instances-state ([update-container-instances-state-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-container-instances-state-request update-container-instances-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-container-instances-state-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-container-instances-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateContainerInstancesState", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef update-container-instances-state :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-container-instances-state-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-container-instances-state-response))

(clojure.core/defn list-attributes ([list-attributes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-attributes-request list-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAttributes", :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/list-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-attributes-response))

(clojure.core/defn stop-task ([stop-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-task-request stop-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/stop-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/stop-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTask", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/stop-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/stop-task-response))

(clojure.core/defn register-task-definition ([register-task-definition-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-task-definition-request register-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/register-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/register-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterTaskDefinition", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef register-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/register-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/register-task-definition-response))

(clojure.core/defn run-task ([run-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-run-task-request run-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/run-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/run-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RunTask", :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClientException" :portkey.aws.ecs/client-exception, "BlockedException" :portkey.aws.ecs/blocked-exception, "UnsupportedFeatureException" :portkey.aws.ecs/unsupported-feature-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "ServerException" :portkey.aws.ecs/server-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef run-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/run-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/run-task-response))

(clojure.core/defn discover-poll-endpoint ([] (discover-poll-endpoint {})) ([discover-poll-endpoint-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-discover-poll-endpoint-request discover-poll-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/discover-poll-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/discover-poll-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DiscoverPollEndpoint", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception}})))))
(clojure.spec.alpha/fdef discover-poll-endpoint :args (clojure.spec.alpha/? :portkey.aws.ecs/discover-poll-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/discover-poll-endpoint-response))

(clojure.core/defn describe-clusters ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeClusters", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.ecs/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-clusters-response))

(clojure.core/defn list-task-definition-families ([] (list-task-definition-families {})) ([list-task-definition-families-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-task-definition-families-request list-task-definition-families-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-task-definition-families-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-task-definition-families-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTaskDefinitionFamilies", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-task-definition-families :args (clojure.spec.alpha/? :portkey.aws.ecs/list-task-definition-families-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-task-definition-families-response))

(clojure.core/defn submit-task-state-change ([] (submit-task-state-change {})) ([submit-task-state-change-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-submit-task-state-change-request submit-task-state-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/submit-task-state-change-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/submit-task-state-change-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubmitTaskStateChange", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef submit-task-state-change :args (clojure.spec.alpha/? :portkey.aws.ecs/submit-task-state-change-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/submit-task-state-change-response))

(clojure.core/defn delete-attributes ([delete-attributes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-attributes-request delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteAttributes", :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "TargetNotFoundException" :portkey.aws.ecs/target-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-attributes-response))

(clojure.core/defn list-task-definitions ([] (list-task-definitions {})) ([list-task-definitions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-task-definitions-request list-task-definitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-task-definitions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-task-definitions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTaskDefinitions", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-task-definitions :args (clojure.spec.alpha/? :portkey.aws.ecs/list-task-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-task-definitions-response))

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListClusters", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.ecs/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-clusters-response))

(clojure.core/defn put-attributes ([put-attributes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-attributes-request put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/put-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/put-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutAttributes", :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "TargetNotFoundException" :portkey.aws.ecs/target-not-found-exception, "AttributeLimitExceededException" :portkey.aws.ecs/attribute-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/put-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/put-attributes-response))

(clojure.core/defn describe-tasks ([describe-tasks-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-tasks-request describe-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTasks", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tasks :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-tasks-response))

(clojure.core/defn describe-services ([describe-services-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeServices", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-services-response))

(clojure.core/defn register-container-instance ([] (register-container-instance {})) ([register-container-instance-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-container-instance-request register-container-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/register-container-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/register-container-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterContainerInstance", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef register-container-instance :args (clojure.spec.alpha/? :portkey.aws.ecs/register-container-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/register-container-instance-response))

(clojure.core/defn deregister-container-instance ([deregister-container-instance-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-container-instance-request deregister-container-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/deregister-container-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/deregister-container-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterContainerInstance", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-container-instance :args (clojure.spec.alpha/tuple :portkey.aws.ecs/deregister-container-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/deregister-container-instance-response))

(clojure.core/defn create-service ([create-service-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-service-request create-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/create-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/create-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateService", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "UnsupportedFeatureException" :portkey.aws.ecs/unsupported-feature-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef create-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/create-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/create-service-response))

(clojure.core/defn list-container-instances ([] (list-container-instances {})) ([list-container-instances-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-container-instances-request list-container-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-container-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-container-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListContainerInstances", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef list-container-instances :args (clojure.spec.alpha/? :portkey.aws.ecs/list-container-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-container-instances-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteCluster", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClusterContainsContainerInstancesException" :portkey.aws.ecs/cluster-contains-container-instances-exception, "ClusterContainsServicesException" :portkey.aws.ecs/cluster-contains-services-exception, "ClusterContainsTasksException" :portkey.aws.ecs/cluster-contains-tasks-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-cluster-response))

(clojure.core/defn describe-container-instances ([describe-container-instances-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-container-instances-request describe-container-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-container-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-container-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeContainerInstances", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-container-instances :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-container-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-container-instances-response))

(clojure.core/defn deregister-task-definition ([deregister-task-definition-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-task-definition-request deregister-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/deregister-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/deregister-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterTaskDefinition", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef deregister-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/deregister-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/deregister-task-definition-response))

(clojure.core/defn list-services ([] (list-services {})) ([list-services-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-services-request list-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListServices", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef list-services :args (clojure.spec.alpha/? :portkey.aws.ecs/list-services-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-services-response))

(clojure.core/defn update-container-agent ([update-container-agent-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-container-agent-request update-container-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-container-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-container-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateContainerAgent", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "UpdateInProgressException" :portkey.aws.ecs/update-in-progress-exception, "NoUpdateAvailableException" :portkey.aws.ecs/no-update-available-exception, "MissingVersionException" :portkey.aws.ecs/missing-version-exception}})))))
(clojure.spec.alpha/fdef update-container-agent :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-container-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-container-agent-response))

(clojure.core/defn describe-task-definition ([describe-task-definition-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-task-definition-request describe-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTaskDefinition", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef describe-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-task-definition-response))

(clojure.core/defn update-service ([update-service-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-service-request update-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateService", :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClientException" :portkey.aws.ecs/client-exception, "ServiceNotActiveException" :portkey.aws.ecs/service-not-active-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "ServerException" :portkey.aws.ecs/server-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-service-response))

(clojure.core/defn start-task ([start-task-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-task-request start-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/start-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/start-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartTask", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef start-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/start-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/start-task-response))
