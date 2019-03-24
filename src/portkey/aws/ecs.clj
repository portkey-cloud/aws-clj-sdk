(ns portkey.aws.ecs (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "ecs", :region "us-gov-east-1"},
    :ssl-common-name "ecs.us-gov-east-1.amazonaws.com",
    :endpoint "https://ecs.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "ecs", :region "eu-north-1"},
    :ssl-common-name "ecs.eu-north-1.amazonaws.com",
    :endpoint "https://ecs.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-setting-name)

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-task-definition-placement-constraint)

(clojure.core/declare ser-health-check)

(clojure.core/declare ser-double)

(clojure.core/declare ser-scheduling-strategy)

(clojure.core/declare ser-host-entry)

(clojure.core/declare ser-string-map)

(clojure.core/declare ser-placement-strategies)

(clojure.core/declare ser-mount-point)

(clojure.core/declare ser-secret)

(clojure.core/declare ser-port-mapping-list)

(clojure.core/declare ser-deployment-configuration)

(clojure.core/declare ser-boxed-boolean)

(clojure.core/declare ser-network-binding)

(clojure.core/declare ser-container-override)

(clojure.core/declare ser-platform-devices)

(clojure.core/declare ser-task-field-list)

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

(clojure.core/declare ser-deployment-controller)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-container-state-change)

(clojure.core/declare ser-target-type)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-ulimit-name)

(clojure.core/declare ser-task-definition-placement-constraints)

(clojure.core/declare ser-ulimit-list)

(clojure.core/declare ser-docker-volume-configuration)

(clojure.core/declare ser-pid-mode)

(clojure.core/declare ser-attachment-state-change)

(clojure.core/declare ser-placement-constraint-type)

(clojure.core/declare ser-log-configuration)

(clojure.core/declare ser-system-controls)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-repository-credentials)

(clojure.core/declare ser-placement-constraint)

(clojure.core/declare ser-task-field)

(clojure.core/declare ser-cluster-field-list)

(clojure.core/declare ser-compatibility)

(clojure.core/declare ser-service-field)

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

(clojure.core/declare ser-secret-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-task-definition-field)

(clojure.core/declare ser-container-definition)

(clojure.core/declare ser-container-instance-field-list)

(clojure.core/declare ser-network-configuration)

(clojure.core/declare ser-resources)

(clojure.core/declare ser-device-cgroup-permissions)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-platform-device-type)

(clojure.core/declare ser-volume-list)

(clojure.core/declare ser-system-control)

(clojure.core/declare ser-log-configuration-options-map)

(clojure.core/declare ser-volume-from-list)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-attachment-state-changes)

(clojure.core/declare ser-task-definition-field-list)

(clojure.core/declare ser-linux-parameters)

(clojure.core/declare ser-platform-device)

(clojure.core/declare ser-container-overrides)

(clojure.core/declare ser-long)

(clojure.core/declare ser-cluster-field)

(clojure.core/declare ser-load-balancer)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-port-mapping)

(clojure.core/declare ser-service-field-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-resource)

(clojure.core/declare ser-host-volume-properties)

(clojure.core/declare ser-container-instance-status)

(clojure.core/declare ser-ipc-mode)

(clojure.core/declare ser-launch-type)

(clojure.core/declare ser-ulimit)

(clojure.core/declare ser-compatibility-list)

(clojure.core/declare ser-transport-protocol)

(clojure.core/declare ser-network-mode)

(clojure.core/declare ser-version-info)

(clojure.core/declare ser-task-override)

(clojure.core/declare ser-resource-requirements)

(clojure.core/declare ser-placement-constraints)

(clojure.core/declare ser-task-definition-status)

(clojure.core/declare ser-device)

(clojure.core/declare ser-container-instance-field)

(clojure.core/declare ser-placement-strategy-type)

(clojure.core/declare ser-scope)

(clojure.core/declare ser-service-registries)

(clojure.core/declare ser-container-definitions)

(clojure.core/declare ser-deployment-controller-type)

(clojure.core/declare ser-propagate-tags)

(clojure.core/declare ser-device-cgroup-permission)

(clojure.core/declare ser-resource-requirement)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-desired-status)

(clojure.core/declare ser-key-value-pair)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-setting-name [input] #:http.request.field{:value (clojure.core/get {"serviceLongArnFormat" "serviceLongArnFormat", :service-long-arn-format "serviceLongArnFormat", "taskLongArnFormat" "taskLongArnFormat", :task-long-arn-format "taskLongArnFormat", "containerInstanceLongArnFormat" "containerInstanceLongArnFormat", :container-instance-long-arn-format "containerInstanceLongArnFormat"} input), :shape "SettingName"})

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-task-definition-placement-constraint [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TaskDefinitionPlacementConstraint", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-placement-constraint-type (input :type)) #:http.request.field{:name "type", :shape "TaskDefinitionPlacementConstraintType"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :expression)) #:http.request.field{:name "expression", :shape "String"}))))

(clojure.core/defn- ser-health-check [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:command input)) #:http.request.field{:name "command", :shape "StringList"})], :shape "HealthCheck", :type "structure"} (clojure.core/contains? input :interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :interval)) #:http.request.field{:name "interval", :shape "BoxedInteger"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :timeout)) #:http.request.field{:name "timeout", :shape "BoxedInteger"})) (clojure.core/contains? input :retries) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :retries)) #:http.request.field{:name "retries", :shape "BoxedInteger"})) (clojure.core/contains? input :start-period) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :start-period)) #:http.request.field{:name "startPeriod", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-double [input] #:http.request.field{:value input, :shape "Double"})

(clojure.core/defn- ser-scheduling-strategy [input] #:http.request.field{:value (clojure.core/get {"REPLICA" "REPLICA", :replica "REPLICA", "DAEMON" "DAEMON", :daemon "DAEMON"} input), :shape "SchedulingStrategy"})

(clojure.core/defn- ser-host-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:hostname input)) #:http.request.field{:name "hostname", :shape "String"}) (clojure.core/into (ser-string (:ip-address input)) #:http.request.field{:name "ipAddress", :shape "String"})], :shape "HostEntry", :type "structure"}))

(clojure.core/defn- ser-string-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "StringMap", :type "map"})

(clojure.core/defn- ser-placement-strategies [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-placement-strategy coll) #:http.request.field{:shape "PlacementStrategy"}))) input), :shape "PlacementStrategies", :type "list"})

(clojure.core/defn- ser-mount-point [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MountPoint", :type "structure"} (clojure.core/contains? input :source-volume) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-volume)) #:http.request.field{:name "sourceVolume", :shape "String"})) (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :read-only)) #:http.request.field{:name "readOnly", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-secret [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-string (:value-from input)) #:http.request.field{:name "valueFrom", :shape "String"})], :shape "Secret", :type "structure"}))

(clojure.core/defn- ser-port-mapping-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-port-mapping coll) #:http.request.field{:shape "PortMapping"}))) input), :shape "PortMappingList", :type "list"})

(clojure.core/defn- ser-deployment-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentConfiguration", :type "structure"} (clojure.core/contains? input :maximum-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :maximum-percent)) #:http.request.field{:name "maximumPercent", :shape "BoxedInteger"})) (clojure.core/contains? input :minimum-healthy-percent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :minimum-healthy-percent)) #:http.request.field{:name "minimumHealthyPercent", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-boxed-boolean [input] #:http.request.field{:value input, :shape "BoxedBoolean"})

(clojure.core/defn- ser-network-binding [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkBinding", :type "structure"} (clojure.core/contains? input :bind-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :bind-ip)) #:http.request.field{:name "bindIP", :shape "String"})) (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"})) (clojure.core/contains? input :host-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :host-port)) #:http.request.field{:name "hostPort", :shape "BoxedInteger"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transport-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "TransportProtocol"}))))

(clojure.core/defn- ser-container-override [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerOverride", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :cpu)) #:http.request.field{:name "cpu", :shape "BoxedInteger"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory)) #:http.request.field{:name "memory", :shape "BoxedInteger"})) (clojure.core/contains? input :memory-reservation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory-reservation)) #:http.request.field{:name "memoryReservation", :shape "BoxedInteger"})) (clojure.core/contains? input :resource-requirements) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-requirements (input :resource-requirements)) #:http.request.field{:name "resourceRequirements", :shape "ResourceRequirements"}))))

(clojure.core/defn- ser-platform-devices [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-platform-device coll) #:http.request.field{:shape "PlatformDevice"}))) input), :shape "PlatformDevices", :type "list"})

(clojure.core/defn- ser-task-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-task-field coll) #:http.request.field{:shape "TaskField"}))) input), :shape "TaskFieldList", :type "list"})

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

(clojure.core/defn- ser-deployment-controller [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-deployment-controller-type (:type input)) #:http.request.field{:name "type", :shape "DeploymentControllerType"})], :shape "DeploymentController", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-container-state-change [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerStateChange", :type "structure"} (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :exit-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :exit-code)) #:http.request.field{:name "exitCode", :shape "BoxedInteger"})) (clojure.core/contains? input :network-bindings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-bindings (input :network-bindings)) #:http.request.field{:name "networkBindings", :shape "NetworkBindings"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"}))))

(clojure.core/defn- ser-target-type [input] #:http.request.field{:value (clojure.core/get {"container-instance" "container-instance", :containerinstance "container-instance"} input), :shape "TargetType"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"} input), :shape "SortOrder"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-ulimit-name [input] #:http.request.field{:value (clojure.core/get {"nproc" "nproc", :locks "locks", :memlock "memlock", :msgqueue "msgqueue", :sigpending "sigpending", "fsize" "fsize", "memlock" "memlock", "nofile" "nofile", "cpu" "cpu", :rss "rss", "rtprio" "rtprio", "sigpending" "sigpending", :fsize "fsize", "rttime" "rttime", :nproc "nproc", "msgqueue" "msgqueue", :rttime "rttime", :nofile "nofile", :stack "stack", :core "core", :nice "nice", "locks" "locks", "data" "data", "core" "core", "rss" "rss", :cpu "cpu", :rtprio "rtprio", "nice" "nice", "stack" "stack", :data "data"} input), :shape "UlimitName"})

(clojure.core/defn- ser-task-definition-placement-constraints [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-task-definition-placement-constraint coll) #:http.request.field{:shape "TaskDefinitionPlacementConstraint"}))) input), :shape "TaskDefinitionPlacementConstraints", :type "list"})

(clojure.core/defn- ser-ulimit-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ulimit coll) #:http.request.field{:shape "Ulimit"}))) input), :shape "UlimitList", :type "list"})

(clojure.core/defn- ser-docker-volume-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DockerVolumeConfiguration", :type "structure"} (clojure.core/contains? input :scope) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scope (input :scope)) #:http.request.field{:name "scope", :shape "Scope"})) (clojure.core/contains? input :autoprovision) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :autoprovision)) #:http.request.field{:name "autoprovision", :shape "BoxedBoolean"})) (clojure.core/contains? input :driver) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :driver)) #:http.request.field{:name "driver", :shape "String"})) (clojure.core/contains? input :driver-opts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :driver-opts)) #:http.request.field{:name "driverOpts", :shape "StringMap"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-map (input :labels)) #:http.request.field{:name "labels", :shape "StringMap"}))))

(clojure.core/defn- ser-pid-mode [input] #:http.request.field{:value (clojure.core/get {"host" "host", :host "host", "task" "task", :task "task"} input), :shape "PidMode"})

(clojure.core/defn- ser-attachment-state-change [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:attachment-arn input)) #:http.request.field{:name "attachmentArn", :shape "String"}) (clojure.core/into (ser-string (:status input)) #:http.request.field{:name "status", :shape "String"})], :shape "AttachmentStateChange", :type "structure"}))

(clojure.core/defn- ser-placement-constraint-type [input] #:http.request.field{:value (clojure.core/get {"distinctInstance" "distinctInstance", :distinct-instance "distinctInstance", "memberOf" "memberOf", :member-of "memberOf"} input), :shape "PlacementConstraintType"})

(clojure.core/defn- ser-log-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-log-driver (:log-driver input)) #:http.request.field{:name "logDriver", :shape "LogDriver"})], :shape "LogConfiguration", :type "structure"} (clojure.core/contains? input :options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-configuration-options-map (input :options)) #:http.request.field{:name "options", :shape "LogConfigurationOptionsMap"}))))

(clojure.core/defn- ser-system-controls [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-system-control coll) #:http.request.field{:shape "SystemControl"}))) input), :shape "SystemControls", :type "list"})

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"})], :shape "Attribute", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"})) (clojure.core/contains? input :target-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "TargetType"})) (clojure.core/contains? input :target-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-id)) #:http.request.field{:name "targetId", :shape "String"}))))

(clojure.core/defn- ser-repository-credentials [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:credentials-parameter input)) #:http.request.field{:name "credentialsParameter", :shape "String"})], :shape "RepositoryCredentials", :type "structure"}))

(clojure.core/defn- ser-placement-constraint [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlacementConstraint", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraint-type (input :type)) #:http.request.field{:name "type", :shape "PlacementConstraintType"})) (clojure.core/contains? input :expression) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :expression)) #:http.request.field{:name "expression", :shape "String"}))))

(clojure.core/defn- ser-task-field [input] #:http.request.field{:value (clojure.core/get {"TAGS" "TAGS", :tags "TAGS"} input), :shape "TaskField"})

(clojure.core/defn- ser-cluster-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cluster-field coll) #:http.request.field{:shape "ClusterField"}))) input), :shape "ClusterFieldList", :type "list"})

(clojure.core/defn- ser-compatibility [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "FARGATE" "FARGATE", :fargate "FARGATE"} input), :shape "Compatibility"})

(clojure.core/defn- ser-service-field [input] #:http.request.field{:value (clojure.core/get {"TAGS" "TAGS", :tags "TAGS"} input), :shape "ServiceField"})

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

(clojure.core/defn- ser-secret-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-secret coll) #:http.request.field{:shape "Secret"}))) input), :shape "SecretList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-task-definition-field [input] #:http.request.field{:value (clojure.core/get {"TAGS" "TAGS", :tags "TAGS"} input), :shape "TaskDefinitionField"})

(clojure.core/defn- ser-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerDefinition", :type "structure"} (clojure.core/contains? input :working-directory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :working-directory)) #:http.request.field{:name "workingDirectory", :shape "String"})) (clojure.core/contains? input :interactive) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :interactive)) #:http.request.field{:name "interactive", :shape "BoxedBoolean"})) (clojure.core/contains? input :port-mappings) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-port-mapping-list (input :port-mappings)) #:http.request.field{:name "portMappings", :shape "PortMappingList"})) (clojure.core/contains? input :pseudo-terminal) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :pseudo-terminal)) #:http.request.field{:name "pseudoTerminal", :shape "BoxedBoolean"})) (clojure.core/contains? input :hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :hostname)) #:http.request.field{:name "hostname", :shape "String"})) (clojure.core/contains? input :ulimits) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ulimit-list (input :ulimits)) #:http.request.field{:name "ulimits", :shape "UlimitList"})) (clojure.core/contains? input :linux-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-linux-parameters (input :linux-parameters)) #:http.request.field{:name "linuxParameters", :shape "LinuxParameters"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :mount-points) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-point-list (input :mount-points)) #:http.request.field{:name "mountPoints", :shape "MountPointList"})) (clojure.core/contains? input :image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image)) #:http.request.field{:name "image", :shape "String"})) (clojure.core/contains? input :resource-requirements) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-requirements (input :resource-requirements)) #:http.request.field{:name "resourceRequirements", :shape "ResourceRequirements"})) (clojure.core/contains? input :user) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :user)) #:http.request.field{:name "user", :shape "String"})) (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :cpu)) #:http.request.field{:name "cpu", :shape "Integer"})) (clojure.core/contains? input :extra-hosts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host-entry-list (input :extra-hosts)) #:http.request.field{:name "extraHosts", :shape "HostEntryList"})) (clojure.core/contains? input :repository-credentials) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-credentials (input :repository-credentials)) #:http.request.field{:name "repositoryCredentials", :shape "RepositoryCredentials"})) (clojure.core/contains? input :docker-labels) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-docker-labels-map (input :docker-labels)) #:http.request.field{:name "dockerLabels", :shape "DockerLabelsMap"})) (clojure.core/contains? input :privileged) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :privileged)) #:http.request.field{:name "privileged", :shape "BoxedBoolean"})) (clojure.core/contains? input :readonly-root-filesystem) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :readonly-root-filesystem)) #:http.request.field{:name "readonlyRootFilesystem", :shape "BoxedBoolean"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :volumes-from) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-from-list (input :volumes-from)) #:http.request.field{:name "volumesFrom", :shape "VolumeFromList"})) (clojure.core/contains? input :entry-point) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :entry-point)) #:http.request.field{:name "entryPoint", :shape "StringList"})) (clojure.core/contains? input :log-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-configuration (input :log-configuration)) #:http.request.field{:name "logConfiguration", :shape "LogConfiguration"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory)) #:http.request.field{:name "memory", :shape "BoxedInteger"})) (clojure.core/contains? input :dns-search-domains) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :dns-search-domains)) #:http.request.field{:name "dnsSearchDomains", :shape "StringList"})) (clojure.core/contains? input :links) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :links)) #:http.request.field{:name "links", :shape "StringList"})) (clojure.core/contains? input :essential) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :essential)) #:http.request.field{:name "essential", :shape "BoxedBoolean"})) (clojure.core/contains? input :dns-servers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :dns-servers)) #:http.request.field{:name "dnsServers", :shape "StringList"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :health-check) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check (input :health-check)) #:http.request.field{:name "healthCheck", :shape "HealthCheck"})) (clojure.core/contains? input :memory-reservation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :memory-reservation)) #:http.request.field{:name "memoryReservation", :shape "BoxedInteger"})) (clojure.core/contains? input :system-controls) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-system-controls (input :system-controls)) #:http.request.field{:name "systemControls", :shape "SystemControls"})) (clojure.core/contains? input :docker-security-options) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :docker-security-options)) #:http.request.field{:name "dockerSecurityOptions", :shape "StringList"})) (clojure.core/contains? input :secrets) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-list (input :secrets)) #:http.request.field{:name "secrets", :shape "SecretList"})) (clojure.core/contains? input :disable-networking) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :disable-networking)) #:http.request.field{:name "disableNetworking", :shape "BoxedBoolean"}))))

(clojure.core/defn- ser-container-instance-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-instance-field coll) #:http.request.field{:shape "ContainerInstanceField"}))) input), :shape "ContainerInstanceFieldList", :type "list"})

(clojure.core/defn- ser-network-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkConfiguration", :type "structure"} (clojure.core/contains? input :awsvpc-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-vpc-configuration (input :awsvpc-configuration)) #:http.request.field{:name "awsvpcConfiguration", :shape "AwsVpcConfiguration"}))))

(clojure.core/defn- ser-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource coll) #:http.request.field{:shape "Resource"}))) input), :shape "Resources", :type "list"})

(clojure.core/defn- ser-device-cgroup-permissions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-device-cgroup-permission coll) #:http.request.field{:shape "DeviceCgroupPermission"}))) input), :shape "DeviceCgroupPermissions", :type "list"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-platform-device-type [input] #:http.request.field{:value (clojure.core/get {"GPU" "GPU", :gpu "GPU"} input), :shape "PlatformDeviceType"})

(clojure.core/defn- ser-volume-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume coll) #:http.request.field{:shape "Volume"}))) input), :shape "VolumeList", :type "list"})

(clojure.core/defn- ser-system-control [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SystemControl", :type "structure"} (clojure.core/contains? input :namespace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :namespace)) #:http.request.field{:name "namespace", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- ser-log-configuration-options-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "LogConfigurationOptionsMap", :type "map"})

(clojure.core/defn- ser-volume-from-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume-from coll) #:http.request.field{:shape "VolumeFrom"}))) input), :shape "VolumeFromList", :type "list"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"GPU" "GPU", :gpu "GPU"} input), :shape "ResourceType"})

(clojure.core/defn- ser-attachment-state-changes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attachment-state-change coll) #:http.request.field{:shape "AttachmentStateChange"}))) input), :shape "AttachmentStateChanges", :type "list"})

(clojure.core/defn- ser-task-definition-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-task-definition-field coll) #:http.request.field{:shape "TaskDefinitionField"}))) input), :shape "TaskDefinitionFieldList", :type "list"})

(clojure.core/defn- ser-linux-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LinuxParameters", :type "structure"} (clojure.core/contains? input :capabilities) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kernel-capabilities (input :capabilities)) #:http.request.field{:name "capabilities", :shape "KernelCapabilities"})) (clojure.core/contains? input :devices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-devices-list (input :devices)) #:http.request.field{:name "devices", :shape "DevicesList"})) (clojure.core/contains? input :init-process-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :init-process-enabled)) #:http.request.field{:name "initProcessEnabled", :shape "BoxedBoolean"})) (clojure.core/contains? input :shared-memory-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :shared-memory-size)) #:http.request.field{:name "sharedMemorySize", :shape "BoxedInteger"})) (clojure.core/contains? input :tmpfs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tmpfs-list (input :tmpfs)) #:http.request.field{:name "tmpfs", :shape "TmpfsList"}))))

(clojure.core/defn- ser-platform-device [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id input)) #:http.request.field{:name "id", :shape "String"}) (clojure.core/into (ser-platform-device-type (:type input)) #:http.request.field{:name "type", :shape "PlatformDeviceType"})], :shape "PlatformDevice", :type "structure"}))

(clojure.core/defn- ser-container-overrides [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-override coll) #:http.request.field{:shape "ContainerOverride"}))) input), :shape "ContainerOverrides", :type "list"})

(clojure.core/defn- ser-long [input] #:http.request.field{:value input, :shape "Long"})

(clojure.core/defn- ser-cluster-field [input] #:http.request.field{:value (clojure.core/get {"STATISTICS" "STATISTICS", :statistics "STATISTICS", "TAGS" "TAGS", :tags "TAGS"} input), :shape "ClusterField"})

(clojure.core/defn- ser-load-balancer [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancer", :type "structure"} (clojure.core/contains? input :target-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target-group-arn)) #:http.request.field{:name "targetGroupArn", :shape "String"})) (clojure.core/contains? input :load-balancer-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :load-balancer-name)) #:http.request.field{:name "loadBalancerName", :shape "String"})) (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-port-mapping [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PortMapping", :type "structure"} (clojure.core/contains? input :container-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :container-port)) #:http.request.field{:name "containerPort", :shape "BoxedInteger"})) (clojure.core/contains? input :host-port) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :host-port)) #:http.request.field{:name "hostPort", :shape "BoxedInteger"})) (clojure.core/contains? input :protocol) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transport-protocol (input :protocol)) #:http.request.field{:name "protocol", :shape "TransportProtocol"}))))

(clojure.core/defn- ser-service-field-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-field coll) #:http.request.field{:shape "ServiceField"}))) input), :shape "ServiceFieldList", :type "list"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-resource [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Resource", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :type)) #:http.request.field{:name "type", :shape "String"})) (clojure.core/contains? input :double-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-double (input :double-value)) #:http.request.field{:name "doubleValue", :shape "Double"})) (clojure.core/contains? input :long-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-long (input :long-value)) #:http.request.field{:name "longValue", :shape "Long"})) (clojure.core/contains? input :integer-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :integer-value)) #:http.request.field{:name "integerValue", :shape "Integer"})) (clojure.core/contains? input :string-set-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :string-set-value)) #:http.request.field{:name "stringSetValue", :shape "StringList"}))))

(clojure.core/defn- ser-host-volume-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "HostVolumeProperties", :type "structure"} (clojure.core/contains? input :source-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-path)) #:http.request.field{:name "sourcePath", :shape "String"}))))

(clojure.core/defn- ser-container-instance-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "DRAINING" "DRAINING", :draining "DRAINING"} input), :shape "ContainerInstanceStatus"})

(clojure.core/defn- ser-ipc-mode [input] #:http.request.field{:value (clojure.core/get {"host" "host", :host "host", "task" "task", :task "task", "none" "none", :none "none"} input), :shape "IpcMode"})

(clojure.core/defn- ser-launch-type [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "FARGATE" "FARGATE", :fargate "FARGATE"} input), :shape "LaunchType"})

(clojure.core/defn- ser-ulimit [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ulimit-name (:name input)) #:http.request.field{:name "name", :shape "UlimitName"}) (clojure.core/into (ser-integer (:soft-limit input)) #:http.request.field{:name "softLimit", :shape "Integer"}) (clojure.core/into (ser-integer (:hard-limit input)) #:http.request.field{:name "hardLimit", :shape "Integer"})], :shape "Ulimit", :type "structure"}))

(clojure.core/defn- ser-compatibility-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compatibility coll) #:http.request.field{:shape "Compatibility"}))) input), :shape "CompatibilityList", :type "list"})

(clojure.core/defn- ser-transport-protocol [input] #:http.request.field{:value (clojure.core/get {"tcp" "tcp", :tcp "tcp", "udp" "udp", :udp "udp"} input), :shape "TransportProtocol"})

(clojure.core/defn- ser-network-mode [input] #:http.request.field{:value (clojure.core/get {"bridge" "bridge", :bridge "bridge", "host" "host", :host "host", "awsvpc" "awsvpc", :awsvpc "awsvpc", "none" "none", :none "none"} input), :shape "NetworkMode"})

(clojure.core/defn- ser-version-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VersionInfo", :type "structure"} (clojure.core/contains? input :agent-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-version)) #:http.request.field{:name "agentVersion", :shape "String"})) (clojure.core/contains? input :agent-hash) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :agent-hash)) #:http.request.field{:name "agentHash", :shape "String"})) (clojure.core/contains? input :docker-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :docker-version)) #:http.request.field{:name "dockerVersion", :shape "String"}))))

(clojure.core/defn- ser-task-override [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TaskOverride", :type "structure"} (clojure.core/contains? input :container-overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-overrides (input :container-overrides)) #:http.request.field{:name "containerOverrides", :shape "ContainerOverrides"})) (clojure.core/contains? input :task-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-role-arn)) #:http.request.field{:name "taskRoleArn", :shape "String"})) (clojure.core/contains? input :execution-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :execution-role-arn)) #:http.request.field{:name "executionRoleArn", :shape "String"}))))

(clojure.core/defn- ser-resource-requirements [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-requirement coll) #:http.request.field{:shape "ResourceRequirement"}))) input), :shape "ResourceRequirements", :type "list"})

(clojure.core/defn- ser-placement-constraints [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-placement-constraint coll) #:http.request.field{:shape "PlacementConstraint"}))) input), :shape "PlacementConstraints", :type "list"})

(clojure.core/defn- ser-task-definition-status [input] #:http.request.field{:value (clojure.core/get {"ACTIVE" "ACTIVE", :active "ACTIVE", "INACTIVE" "INACTIVE", :inactive "INACTIVE"} input), :shape "TaskDefinitionStatus"})

(clojure.core/defn- ser-device [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:host-path input)) #:http.request.field{:name "hostPath", :shape "String"})], :shape "Device", :type "structure"} (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :permissions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-device-cgroup-permissions (input :permissions)) #:http.request.field{:name "permissions", :shape "DeviceCgroupPermissions"}))))

(clojure.core/defn- ser-container-instance-field [input] #:http.request.field{:value (clojure.core/get {"TAGS" "TAGS", :tags "TAGS"} input), :shape "ContainerInstanceField"})

(clojure.core/defn- ser-placement-strategy-type [input] #:http.request.field{:value (clojure.core/get {"random" "random", :random "random", "spread" "spread", :spread "spread", "binpack" "binpack", :binpack "binpack"} input), :shape "PlacementStrategyType"})

(clojure.core/defn- ser-scope [input] #:http.request.field{:value (clojure.core/get {"task" "task", :task "task", "shared" "shared", :shared "shared"} input), :shape "Scope"})

(clojure.core/defn- ser-service-registries [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-service-registry coll) #:http.request.field{:shape "ServiceRegistry"}))) input), :shape "ServiceRegistries", :type "list"})

(clojure.core/defn- ser-container-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-definition coll) #:http.request.field{:shape "ContainerDefinition"}))) input), :shape "ContainerDefinitions", :type "list"})

(clojure.core/defn- ser-deployment-controller-type [input] #:http.request.field{:value (clojure.core/get {"ECS" "ECS", :ecs "ECS", "CODE_DEPLOY" "CODE_DEPLOY", :code-deploy "CODE_DEPLOY"} input), :shape "DeploymentControllerType"})

(clojure.core/defn- ser-propagate-tags [input] #:http.request.field{:value (clojure.core/get {"TASK_DEFINITION" "TASK_DEFINITION", :task-definition "TASK_DEFINITION", "SERVICE" "SERVICE", :service "SERVICE"} input), :shape "PropagateTags"})

(clojure.core/defn- ser-device-cgroup-permission [input] #:http.request.field{:value (clojure.core/get {"read" "read", :read "read", "write" "write", :write "write", "mknod" "mknod", :mknod "mknod"} input), :shape "DeviceCgroupPermission"})

(clojure.core/defn- ser-resource-requirement [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:value input)) #:http.request.field{:name "value", :shape "String"}) (clojure.core/into (ser-resource-type (:type input)) #:http.request.field{:name "type", :shape "ResourceType"})], :shape "ResourceRequirement", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-desired-status [input] #:http.request.field{:value (clojure.core/get {"RUNNING" "RUNNING", :running "RUNNING", "PENDING" "PENDING", :pending "PENDING", "STOPPED" "STOPPED", :stopped "STOPPED"} input), :shape "DesiredStatus"})

(clojure.core/defn- ser-key-value-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyValuePair", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- req-list-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-submit-container-state-change-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :task) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})) (clojure.core/contains? input :container-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-name)) #:http.request.field{:name "containerName", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :exit-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :exit-code)) #:http.request.field{:name "exitCode", :shape "BoxedInteger"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :network-bindings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-bindings (input :network-bindings)) #:http.request.field{:name "networkBindings", :shape "NetworkBindings"}))))

(clojure.core/defn- req-delete-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-list-account-settings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-setting-name (input :name)) #:http.request.field{:name "name", :shape "SettingName"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"})) (clojure.core/contains? input :principal-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal-arn)) #:http.request.field{:name "principalArn", :shape "String"})) (clojure.core/contains? input :effective-settings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :effective-settings)) #:http.request.field{:name "effectiveSettings", :shape "Boolean"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"}))))

(clojure.core/defn- req-put-account-setting-default-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-setting-name (input :name)) #:http.request.field{:name "name", :shape "SettingName"}) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"})]}))

(clojure.core/defn- req-submit-task-state-change-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :task) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})) (clojure.core/contains? input :pull-stopped-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :pull-stopped-at)) #:http.request.field{:name "pullStoppedAt", :shape "Timestamp"})) (clojure.core/contains? input :pull-started-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :pull-started-at)) #:http.request.field{:name "pullStartedAt", :shape "Timestamp"})) (clojure.core/contains? input :execution-stopped-at) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :execution-stopped-at)) #:http.request.field{:name "executionStoppedAt", :shape "Timestamp"})) (clojure.core/contains? input :containers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-state-changes (input :containers)) #:http.request.field{:name "containers", :shape "ContainerStateChanges"})) (clojure.core/contains? input :attachments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attachment-state-changes (input :attachments)) #:http.request.field{:name "attachments", :shape "AttachmentStateChanges"}))))

(clojure.core/defn- req-delete-cluster-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})]}))

(clojure.core/defn- req-list-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-type (input :target-type)) #:http.request.field{:name "targetType", :shape "TargetType"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :attribute-name)) #:http.request.field{:name "attributeName", :shape "String"})) (clojure.core/contains? input :attribute-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :attribute-value)) #:http.request.field{:name "attributeValue", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-update-container-instances-state-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"}) (clojure.core/into (ser-container-instance-status (input :status)) #:http.request.field{:name "status", :shape "ContainerInstanceStatus"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "String"})]}))

(clojure.core/defn- req-list-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :desired-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-desired-status (input :desired-status)) #:http.request.field{:name "desiredStatus", :shape "DesiredStatus"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :container-instance) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-name)) #:http.request.field{:name "serviceName", :shape "String"})) (clojure.core/contains? input :family) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family)) #:http.request.field{:name "family", :shape "String"}))))

(clojure.core/defn- req-describe-container-instances-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-instance-field-list (input :include)) #:http.request.field{:name "include", :shape "ContainerInstanceFieldList"}))))

(clojure.core/defn- req-register-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :family)) #:http.request.field{:name "family", :shape "String"}) (clojure.core/into (ser-container-definitions (input :container-definitions)) #:http.request.field{:name "containerDefinitions", :shape "ContainerDefinitions"})]} (clojure.core/contains? input :cpu) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cpu)) #:http.request.field{:name "cpu", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :volumes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-list (input :volumes)) #:http.request.field{:name "volumes", :shape "VolumeList"})) (clojure.core/contains? input :network-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-mode (input :network-mode)) #:http.request.field{:name "networkMode", :shape "NetworkMode"})) (clojure.core/contains? input :task-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-role-arn)) #:http.request.field{:name "taskRoleArn", :shape "String"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :memory)) #:http.request.field{:name "memory", :shape "String"})) (clojure.core/contains? input :requires-compatibilities) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compatibility-list (input :requires-compatibilities)) #:http.request.field{:name "requiresCompatibilities", :shape "CompatibilityList"})) (clojure.core/contains? input :execution-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :execution-role-arn)) #:http.request.field{:name "executionRoleArn", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "TaskDefinitionPlacementConstraints"})) (clojure.core/contains? input :ipc-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ipc-mode (input :ipc-mode)) #:http.request.field{:name "ipcMode", :shape "IpcMode"})) (clojure.core/contains? input :pid-mode) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pid-mode (input :pid-mode)) #:http.request.field{:name "pidMode", :shape "PidMode"}))))

(clojure.core/defn- req-describe-services-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :services)) #:http.request.field{:name "services", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-field-list (input :include)) #:http.request.field{:name "include", :shape "ServiceFieldList"}))))

(clojure.core/defn- req-put-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-register-container-instance-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :version-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-info (input :version-info)) #:http.request.field{:name "versionInfo", :shape "VersionInfo"})) (clojure.core/contains? input :total-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resources (input :total-resources)) #:http.request.field{:name "totalResources", :shape "Resources"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :instance-identity-document-signature) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-identity-document-signature)) #:http.request.field{:name "instanceIdentityDocumentSignature", :shape "String"})) (clojure.core/contains? input :platform-devices) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-devices (input :platform-devices)) #:http.request.field{:name "platformDevices", :shape "PlatformDevices"})) (clojure.core/contains? input :instance-identity-document) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-identity-document)) #:http.request.field{:name "instanceIdentityDocument", :shape "String"})) (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "attributes", :shape "Attributes"})) (clojure.core/contains? input :container-instance-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance-arn)) #:http.request.field{:name "containerInstanceArn", :shape "String"}))))

(clojure.core/defn- req-update-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service)) #:http.request.field{:name "service", :shape "String"})]} (clojure.core/contains? input :deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-configuration (input :deployment-configuration)) #:http.request.field{:name "deploymentConfiguration", :shape "DeploymentConfiguration"})) (clojure.core/contains? input :force-new-deployment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force-new-deployment)) #:http.request.field{:name "forceNewDeployment", :shape "Boolean"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :desired-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :desired-count)) #:http.request.field{:name "desiredCount", :shape "BoxedInteger"})) (clojure.core/contains? input :task-definition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})) (clojure.core/contains? input :health-check-grace-period-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :health-check-grace-period-seconds)) #:http.request.field{:name "healthCheckGracePeriodSeconds", :shape "BoxedInteger"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"}))))

(clojure.core/defn- req-put-account-setting-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-setting-name (input :name)) #:http.request.field{:name "name", :shape "SettingName"}) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"})]} (clojure.core/contains? input :principal-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal-arn)) #:http.request.field{:name "principalArn", :shape "String"}))))

(clojure.core/defn- req-deregister-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]}))

(clojure.core/defn- req-run-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]} (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-override (input :overrides)) #:http.request.field{:name "overrides", :shape "TaskOverride"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :propagate-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-propagate-tags (input :propagate-tags)) #:http.request.field{:name "propagateTags", :shape "PropagateTags"})) (clojure.core/contains? input :group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group)) #:http.request.field{:name "group", :shape "String"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :count)) #:http.request.field{:name "count", :shape "BoxedInteger"})) (clojure.core/contains? input :placement-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-strategies (input :placement-strategy)) #:http.request.field{:name "placementStrategy", :shape "PlacementStrategies"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "PlacementConstraints"})) (clojure.core/contains? input :enable-ecs-managed-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-ecs-managed-tags)) #:http.request.field{:name "enableECSManagedTags", :shape "Boolean"}))))

(clojure.core/defn- req-list-container-instances-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :filter)) #:http.request.field{:name "filter", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-instance-status (input :status)) #:http.request.field{:name "status", :shape "ContainerInstanceStatus"}))))

(clojure.core/defn- req-list-task-definition-families-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :family-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family-prefix)) #:http.request.field{:name "familyPrefix", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-family-status (input :status)) #:http.request.field{:name "status", :shape "TaskDefinitionFamilyStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-describe-clusters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :clusters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :clusters)) #:http.request.field{:name "clusters", :shape "StringList"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cluster-field-list (input :include)) #:http.request.field{:name "include", :shape "ClusterFieldList"}))))

(clojure.core/defn- req-update-container-agent-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "String"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})]}))

(clojure.core/defn- req-list-task-definitions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :family-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :family-prefix)) #:http.request.field{:name "familyPrefix", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-status (input :status)) #:http.request.field{:name "status", :shape "TaskDefinitionStatus"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort)) #:http.request.field{:name "sort", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"}))))

(clojure.core/defn- req-stop-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task)) #:http.request.field{:name "task", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :reason) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"}))))

(clojure.core/defn- req-describe-task-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]} (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-definition-field-list (input :include)) #:http.request.field{:name "include", :shape "TaskDefinitionFieldList"}))))

(clojure.core/defn- req-delete-account-setting-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-setting-name (input :name)) #:http.request.field{:name "name", :shape "SettingName"})]} (clojure.core/contains? input :principal-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal-arn)) #:http.request.field{:name "principalArn", :shape "String"}))))

(clojure.core/defn- req-create-cluster-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster-name)) #:http.request.field{:name "clusterName", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-create-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service-name)) #:http.request.field{:name "serviceName", :shape "String"}) (clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"})]} (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :role)) #:http.request.field{:name "role", :shape "String"})) (clojure.core/contains? input :deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-configuration (input :deployment-configuration)) #:http.request.field{:name "deploymentConfiguration", :shape "DeploymentConfiguration"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :propagate-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-propagate-tags (input :propagate-tags)) #:http.request.field{:name "propagateTags", :shape "PropagateTags"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :desired-count) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :desired-count)) #:http.request.field{:name "desiredCount", :shape "BoxedInteger"})) (clojure.core/contains? input :health-check-grace-period-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :health-check-grace-period-seconds)) #:http.request.field{:name "healthCheckGracePeriodSeconds", :shape "BoxedInteger"})) (clojure.core/contains? input :deployment-controller) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-controller (input :deployment-controller)) #:http.request.field{:name "deploymentController", :shape "DeploymentController"})) (clojure.core/contains? input :placement-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-strategies (input :placement-strategy)) #:http.request.field{:name "placementStrategy", :shape "PlacementStrategies"})) (clojure.core/contains? input :scheduling-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduling-strategy (input :scheduling-strategy)) #:http.request.field{:name "schedulingStrategy", :shape "SchedulingStrategy"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :service-registries) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-service-registries (input :service-registries)) #:http.request.field{:name "serviceRegistries", :shape "ServiceRegistries"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "platformVersion", :shape "String"})) (clojure.core/contains? input :placement-constraints) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-placement-constraints (input :placement-constraints)) #:http.request.field{:name "placementConstraints", :shape "PlacementConstraints"})) (clojure.core/contains? input :load-balancers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancers (input :load-balancers)) #:http.request.field{:name "loadBalancers", :shape "LoadBalancers"})) (clojure.core/contains? input :enable-ecs-managed-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-ecs-managed-tags)) #:http.request.field{:name "enableECSManagedTags", :shape "Boolean"}))))

(clojure.core/defn- req-discover-poll-endpoint-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :container-instance) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"}))))

(clojure.core/defn- req-start-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :task-definition)) #:http.request.field{:name "taskDefinition", :shape "String"}) (clojure.core/into (ser-string-list (input :container-instances)) #:http.request.field{:name "containerInstances", :shape "StringList"})]} (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-override (input :overrides)) #:http.request.field{:name "overrides", :shape "TaskOverride"})) (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :propagate-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-propagate-tags (input :propagate-tags)) #:http.request.field{:name "propagateTags", :shape "PropagateTags"})) (clojure.core/contains? input :group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group)) #:http.request.field{:name "group", :shape "String"})) (clojure.core/contains? input :started-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :started-by)) #:http.request.field{:name "startedBy", :shape "String"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "networkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :enable-ecs-managed-tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-ecs-managed-tags)) #:http.request.field{:name "enableECSManagedTags", :shape "Boolean"}))))

(clojure.core/defn- req-list-services-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "BoxedInteger"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "launchType", :shape "LaunchType"})) (clojure.core/contains? input :scheduling-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduling-strategy (input :scheduling-strategy)) #:http.request.field{:name "schedulingStrategy", :shape "SchedulingStrategy"}))))

(clojure.core/defn- req-delete-service-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :service)) #:http.request.field{:name "service", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :force)) #:http.request.field{:name "force", :shape "BoxedBoolean"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "String"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-deregister-container-instance-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :container-instance)) #:http.request.field{:name "containerInstance", :shape "String"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boxed-boolean (input :force)) #:http.request.field{:name "force", :shape "BoxedBoolean"}))))

(clojure.core/defn- req-describe-tasks-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :tasks)) #:http.request.field{:name "tasks", :shape "StringList"})]} (clojure.core/contains? input :cluster) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :cluster)) #:http.request.field{:name "cluster", :shape "String"})) (clojure.core/contains? input :include) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-field-list (input :include)) #:http.request.field{:name "include", :shape "TaskFieldList"}))))

(clojure.core/declare deser-setting-name)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-task-definition-placement-constraint)

(clojure.core/declare deser-health-check)

(clojure.core/declare deser-double)

(clojure.core/declare deser-attachment)

(clojure.core/declare deser-setting)

(clojure.core/declare deser-task-sets)

(clojure.core/declare deser-scheduling-strategy)

(clojure.core/declare deser-host-entry)

(clojure.core/declare deser-string-map)

(clojure.core/declare deser-placement-strategies)

(clojure.core/declare deser-mount-point)

(clojure.core/declare deser-secret)

(clojure.core/declare deser-deployment)

(clojure.core/declare deser-tasks)

(clojure.core/declare deser-port-mapping-list)

(clojure.core/declare deser-deployment-configuration)

(clojure.core/declare deser-failures)

(clojure.core/declare deser-boxed-boolean)

(clojure.core/declare deser-network-binding)

(clojure.core/declare deser-container-override)

(clojure.core/declare deser-volume)

(clojure.core/declare deser-volume-from)

(clojure.core/declare deser-docker-labels-map)

(clojure.core/declare deser-host-entry-list)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-assign-public-ip)

(clojure.core/declare deser-boxed-integer)

(clojure.core/declare deser-aws-vpc-configuration)

(clojure.core/declare deser-task-definition-placement-constraint-type)

(clojure.core/declare deser-deployment-controller)

(clojure.core/declare deser-containers)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-gpu-ids)

(clojure.core/declare deser-target-type)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-ulimit-name)

(clojure.core/declare deser-scale-unit)

(clojure.core/declare deser-health-status)

(clojure.core/declare deser-task-set)

(clojure.core/declare deser-task-definition-placement-constraints)

(clojure.core/declare deser-ulimit-list)

(clojure.core/declare deser-scale)

(clojure.core/declare deser-service-event)

(clojure.core/declare deser-docker-volume-configuration)

(clojure.core/declare deser-attachments)

(clojure.core/declare deser-pid-mode)

(clojure.core/declare deser-placement-constraint-type)

(clojure.core/declare deser-log-configuration)

(clojure.core/declare deser-system-controls)

(clojure.core/declare deser-services)

(clojure.core/declare deser-attribute)

(clojure.core/declare deser-repository-credentials)

(clojure.core/declare deser-placement-constraint)

(clojure.core/declare deser-compatibility)

(clojure.core/declare deser-devices-list)

(clojure.core/declare deser-service-registry)

(clojure.core/declare deser-attributes)

(clojure.core/declare deser-kernel-capabilities)

(clojure.core/declare deser-log-driver)

(clojure.core/declare deser-network-bindings)

(clojure.core/declare deser-load-balancers)

(clojure.core/declare deser-mount-point-list)

(clojure.core/declare deser-tmpfs)

(clojure.core/declare deser-cluster)

(clojure.core/declare deser-task-stop-code)

(clojure.core/declare deser-placement-strategy)

(clojure.core/declare deser-tmpfs-list)

(clojure.core/declare deser-container)

(clojure.core/declare deser-secret-list)

(clojure.core/declare deser-task-definition)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-container-definition)

(clojure.core/declare deser-network-configuration)

(clojure.core/declare deser-failure)

(clojure.core/declare deser-resources)

(clojure.core/declare deser-settings)

(clojure.core/declare deser-device-cgroup-permissions)

(clojure.core/declare deser-stability-status)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-volume-list)

(clojure.core/declare deser-system-control)

(clojure.core/declare deser-log-configuration-options-map)

(clojure.core/declare deser-clusters)

(clojure.core/declare deser-volume-from-list)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-container-instance)

(clojure.core/declare deser-connectivity)

(clojure.core/declare deser-requires-attributes)

(clojure.core/declare deser-linux-parameters)

(clojure.core/declare deser-attachment-details)

(clojure.core/declare deser-container-overrides)

(clojure.core/declare deser-long)

(clojure.core/declare deser-service-events)

(clojure.core/declare deser-load-balancer)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-port-mapping)

(clojure.core/declare deser-agent-update-status)

(clojure.core/declare deser-statistics)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-host-volume-properties)

(clojure.core/declare deser-ipc-mode)

(clojure.core/declare deser-launch-type)

(clojure.core/declare deser-ulimit)

(clojure.core/declare deser-container-instances)

(clojure.core/declare deser-compatibility-list)

(clojure.core/declare deser-service)

(clojure.core/declare deser-transport-protocol)

(clojure.core/declare deser-network-mode)

(clojure.core/declare deser-version-info)

(clojure.core/declare deser-task-override)

(clojure.core/declare deser-resource-requirements)

(clojure.core/declare deser-placement-constraints)

(clojure.core/declare deser-task-definition-status)

(clojure.core/declare deser-device)

(clojure.core/declare deser-placement-strategy-type)

(clojure.core/declare deser-task)

(clojure.core/declare deser-scope)

(clojure.core/declare deser-service-registries)

(clojure.core/declare deser-container-definitions)

(clojure.core/declare deser-deployment-controller-type)

(clojure.core/declare deser-propagate-tags)

(clojure.core/declare deser-device-cgroup-permission)

(clojure.core/declare deser-resource-requirement)

(clojure.core/declare deser-deployments)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-network-interfaces)

(clojure.core/declare deser-key-value-pair)

(clojure.core/defn- deser-setting-name [input] (clojure.core/get {"serviceLongArnFormat" :service-long-arn-format, "taskLongArnFormat" :task-long-arn-format, "containerInstanceLongArnFormat" :container-instance-long-arn-format} input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-task-definition-placement-constraint [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-task-definition-placement-constraint-type (input "type"))) (clojure.core/contains? input "expression") (clojure.core/assoc :expression (deser-string (input "expression")))))

(clojure.core/defn- deser-health-check [input] (clojure.core/cond-> {:command (deser-string-list (input "command"))} (clojure.core/contains? input "interval") (clojure.core/assoc :interval (deser-boxed-integer (input "interval"))) (clojure.core/contains? input "timeout") (clojure.core/assoc :timeout (deser-boxed-integer (input "timeout"))) (clojure.core/contains? input "retries") (clojure.core/assoc :retries (deser-boxed-integer (input "retries"))) (clojure.core/contains? input "startPeriod") (clojure.core/assoc :start-period (deser-boxed-integer (input "startPeriod")))))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-string (input "type"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "details") (clojure.core/assoc :details (deser-attachment-details (input "details")))))

(clojure.core/defn- deser-setting [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-setting-name (input "name"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value"))) (clojure.core/contains? input "principalArn") (clojure.core/assoc :principal-arn (deser-string (input "principalArn")))))

(clojure.core/defn- deser-task-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task-set coll))) input))

(clojure.core/defn- deser-scheduling-strategy [input] (clojure.core/get {"REPLICA" :replica, "DAEMON" :daemon} input))

(clojure.core/defn- deser-host-entry [input] (clojure.core/cond-> {:hostname (deser-string (input "hostname")), :ip-address (deser-string (input "ipAddress"))}))

(clojure.core/defn- deser-string-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-placement-strategies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-placement-strategy coll))) input))

(clojure.core/defn- deser-mount-point [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourceVolume") (clojure.core/assoc :source-volume (deser-string (input "sourceVolume"))) (clojure.core/contains? input "containerPath") (clojure.core/assoc :container-path (deser-string (input "containerPath"))) (clojure.core/contains? input "readOnly") (clojure.core/assoc :read-only (deser-boxed-boolean (input "readOnly")))))

(clojure.core/defn- deser-secret [input] (clojure.core/cond-> {:name (deser-string (input "name")), :value-from (deser-string (input "valueFrom"))}))

(clojure.core/defn- deser-deployment [input] (clojure.core/cond-> {} (clojure.core/contains? input "updatedAt") (clojure.core/assoc :updated-at (deser-timestamp (input "updatedAt"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "launchType") (clojure.core/assoc :launch-type (deser-launch-type (input "launchType"))) (clojure.core/contains? input "desiredCount") (clojure.core/assoc :desired-count (deser-integer (input "desiredCount"))) (clojure.core/contains? input "taskDefinition") (clojure.core/assoc :task-definition (deser-string (input "taskDefinition"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "runningCount") (clojure.core/assoc :running-count (deser-integer (input "runningCount"))) (clojure.core/contains? input "networkConfiguration") (clojure.core/assoc :network-configuration (deser-network-configuration (input "networkConfiguration"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "pendingCount") (clojure.core/assoc :pending-count (deser-integer (input "pendingCount")))))

(clojure.core/defn- deser-tasks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task coll))) input))

(clojure.core/defn- deser-port-mapping-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-port-mapping coll))) input))

(clojure.core/defn- deser-deployment-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "maximumPercent") (clojure.core/assoc :maximum-percent (deser-boxed-integer (input "maximumPercent"))) (clojure.core/contains? input "minimumHealthyPercent") (clojure.core/assoc :minimum-healthy-percent (deser-boxed-integer (input "minimumHealthyPercent")))))

(clojure.core/defn- deser-failures [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failure coll))) input))

(clojure.core/defn- deser-boxed-boolean [input] input)

(clojure.core/defn- deser-network-binding [input] (clojure.core/cond-> {} (clojure.core/contains? input "bindIP") (clojure.core/assoc :bind-ip (deser-string (input "bindIP"))) (clojure.core/contains? input "containerPort") (clojure.core/assoc :container-port (deser-boxed-integer (input "containerPort"))) (clojure.core/contains? input "hostPort") (clojure.core/assoc :host-port (deser-boxed-integer (input "hostPort"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-transport-protocol (input "protocol")))))

(clojure.core/defn- deser-container-override [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "command") (clojure.core/assoc :command (deser-string-list (input "command"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-environment-variables (input "environment"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-boxed-integer (input "cpu"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-boxed-integer (input "memory"))) (clojure.core/contains? input "memoryReservation") (clojure.core/assoc :memory-reservation (deser-boxed-integer (input "memoryReservation"))) (clojure.core/contains? input "resourceRequirements") (clojure.core/assoc :resource-requirements (deser-resource-requirements (input "resourceRequirements")))))

(clojure.core/defn- deser-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "host") (clojure.core/assoc :host (deser-host-volume-properties (input "host"))) (clojure.core/contains? input "dockerVolumeConfiguration") (clojure.core/assoc :docker-volume-configuration (deser-docker-volume-configuration (input "dockerVolumeConfiguration")))))

(clojure.core/defn- deser-volume-from [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourceContainer") (clojure.core/assoc :source-container (deser-string (input "sourceContainer"))) (clojure.core/contains? input "readOnly") (clojure.core/assoc :read-only (deser-boxed-boolean (input "readOnly")))))

(clojure.core/defn- deser-docker-labels-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-host-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-host-entry coll))) input))

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-value-pair coll))) input))

(clojure.core/defn- deser-assign-public-ip [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-boxed-integer [input] input)

(clojure.core/defn- deser-aws-vpc-configuration [input] (clojure.core/cond-> {:subnets (deser-string-list (input "subnets"))} (clojure.core/contains? input "securityGroups") (clojure.core/assoc :security-groups (deser-string-list (input "securityGroups"))) (clojure.core/contains? input "assignPublicIp") (clojure.core/assoc :assign-public-ip (deser-assign-public-ip (input "assignPublicIp")))))

(clojure.core/defn- deser-task-definition-placement-constraint-type [input] (clojure.core/get {"memberOf" :member-of} input))

(clojure.core/defn- deser-deployment-controller [input] (clojure.core/cond-> {:type (deser-deployment-controller-type (input "type"))}))

(clojure.core/defn- deser-containers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-gpu-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-target-type [input] (clojure.core/get {"container-instance" :containerinstance} input))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-ulimit-name [input] (clojure.core/get {"nproc" :nproc, "fsize" :fsize, "memlock" :memlock, "nofile" :nofile, "cpu" :cpu, "rtprio" :rtprio, "sigpending" :sigpending, "rttime" :rttime, "msgqueue" :msgqueue, "locks" :locks, "data" :data, "core" :core, "rss" :rss, "nice" :nice, "stack" :stack} input))

(clojure.core/defn- deser-scale-unit [input] (clojure.core/get {"PERCENT" :percent} input))

(clojure.core/defn- deser-health-status [input] (clojure.core/get {"HEALTHY" :healthy, "UNHEALTHY" :unhealthy, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-task-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "updatedAt") (clojure.core/assoc :updated-at (deser-timestamp (input "updatedAt"))) (clojure.core/contains? input "stabilityStatus") (clojure.core/assoc :stability-status (deser-stability-status (input "stabilityStatus"))) (clojure.core/contains? input "scale") (clojure.core/assoc :scale (deser-scale (input "scale"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "startedBy") (clojure.core/assoc :started-by (deser-string (input "startedBy"))) (clojure.core/contains? input "launchType") (clojure.core/assoc :launch-type (deser-launch-type (input "launchType"))) (clojure.core/contains? input "taskDefinition") (clojure.core/assoc :task-definition (deser-string (input "taskDefinition"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "taskSetArn") (clojure.core/assoc :task-set-arn (deser-string (input "taskSetArn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "runningCount") (clojure.core/assoc :running-count (deser-integer (input "runningCount"))) (clojure.core/contains? input "networkConfiguration") (clojure.core/assoc :network-configuration (deser-network-configuration (input "networkConfiguration"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "pendingCount") (clojure.core/assoc :pending-count (deser-integer (input "pendingCount"))) (clojure.core/contains? input "stabilityStatusAt") (clojure.core/assoc :stability-status-at (deser-timestamp (input "stabilityStatusAt"))) (clojure.core/contains? input "loadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancers (input "loadBalancers"))) (clojure.core/contains? input "externalId") (clojure.core/assoc :external-id (deser-string (input "externalId"))) (clojure.core/contains? input "computedDesiredCount") (clojure.core/assoc :computed-desired-count (deser-integer (input "computedDesiredCount")))))

(clojure.core/defn- deser-task-definition-placement-constraints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task-definition-placement-constraint coll))) input))

(clojure.core/defn- deser-ulimit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ulimit coll))) input))

(clojure.core/defn- deser-scale [input] (clojure.core/cond-> {} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-double (input "value"))) (clojure.core/contains? input "unit") (clojure.core/assoc :unit (deser-scale-unit (input "unit")))))

(clojure.core/defn- deser-service-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-docker-volume-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "scope") (clojure.core/assoc :scope (deser-scope (input "scope"))) (clojure.core/contains? input "autoprovision") (clojure.core/assoc :autoprovision (deser-boxed-boolean (input "autoprovision"))) (clojure.core/contains? input "driver") (clojure.core/assoc :driver (deser-string (input "driver"))) (clojure.core/contains? input "driverOpts") (clojure.core/assoc :driver-opts (deser-string-map (input "driverOpts"))) (clojure.core/contains? input "labels") (clojure.core/assoc :labels (deser-string-map (input "labels")))))

(clojure.core/defn- deser-attachments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attachment coll))) input))

(clojure.core/defn- deser-pid-mode [input] (clojure.core/get {"host" :host, "task" :task} input))

(clojure.core/defn- deser-placement-constraint-type [input] (clojure.core/get {"distinctInstance" :distinct-instance, "memberOf" :member-of} input))

(clojure.core/defn- deser-log-configuration [input] (clojure.core/cond-> {:log-driver (deser-log-driver (input "logDriver"))} (clojure.core/contains? input "options") (clojure.core/assoc :options (deser-log-configuration-options-map (input "options")))))

(clojure.core/defn- deser-system-controls [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-system-control coll))) input))

(clojure.core/defn- deser-services [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service coll))) input))

(clojure.core/defn- deser-attribute [input] (clojure.core/cond-> {:name (deser-string (input "name"))} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value"))) (clojure.core/contains? input "targetType") (clojure.core/assoc :target-type (deser-target-type (input "targetType"))) (clojure.core/contains? input "targetId") (clojure.core/assoc :target-id (deser-string (input "targetId")))))

(clojure.core/defn- deser-repository-credentials [input] (clojure.core/cond-> {:credentials-parameter (deser-string (input "credentialsParameter"))}))

(clojure.core/defn- deser-placement-constraint [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-placement-constraint-type (input "type"))) (clojure.core/contains? input "expression") (clojure.core/assoc :expression (deser-string (input "expression")))))

(clojure.core/defn- deser-compatibility [input] (clojure.core/get {"EC2" :ec-2, "FARGATE" :fargate} input))

(clojure.core/defn- deser-devices-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device coll))) input))

(clojure.core/defn- deser-service-registry [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryArn") (clojure.core/assoc :registry-arn (deser-string (input "registryArn"))) (clojure.core/contains? input "port") (clojure.core/assoc :port (deser-boxed-integer (input "port"))) (clojure.core/contains? input "containerName") (clojure.core/assoc :container-name (deser-string (input "containerName"))) (clojure.core/contains? input "containerPort") (clojure.core/assoc :container-port (deser-boxed-integer (input "containerPort")))))

(clojure.core/defn- deser-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-kernel-capabilities [input] (clojure.core/cond-> {} (clojure.core/contains? input "add") (clojure.core/assoc :add (deser-string-list (input "add"))) (clojure.core/contains? input "drop") (clojure.core/assoc :drop (deser-string-list (input "drop")))))

(clojure.core/defn- deser-log-driver [input] (clojure.core/get {"json-file" :jsonfile, "syslog" :syslog, "journald" :journald, "gelf" :gelf, "fluentd" :fluentd, "awslogs" :awslogs, "splunk" :splunk} input))

(clojure.core/defn- deser-network-bindings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-binding coll))) input))

(clojure.core/defn- deser-load-balancers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer coll))) input))

(clojure.core/defn- deser-mount-point-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mount-point coll))) input))

(clojure.core/defn- deser-tmpfs [input] (clojure.core/cond-> {:container-path (deser-string (input "containerPath")), :size (deser-integer (input "size"))} (clojure.core/contains? input "mountOptions") (clojure.core/assoc :mount-options (deser-string-list (input "mountOptions")))))

(clojure.core/defn- deser-cluster [input] (clojure.core/cond-> {} (clojure.core/contains? input "activeServicesCount") (clojure.core/assoc :active-services-count (deser-integer (input "activeServicesCount"))) (clojure.core/contains? input "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (input "clusterArn"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "clusterName") (clojure.core/assoc :cluster-name (deser-string (input "clusterName"))) (clojure.core/contains? input "statistics") (clojure.core/assoc :statistics (deser-statistics (input "statistics"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "runningTasksCount") (clojure.core/assoc :running-tasks-count (deser-integer (input "runningTasksCount"))) (clojure.core/contains? input "registeredContainerInstancesCount") (clojure.core/assoc :registered-container-instances-count (deser-integer (input "registeredContainerInstancesCount"))) (clojure.core/contains? input "pendingTasksCount") (clojure.core/assoc :pending-tasks-count (deser-integer (input "pendingTasksCount")))))

(clojure.core/defn- deser-task-stop-code [input] (clojure.core/get {"TaskFailedToStart" :task-failed-to-start, "EssentialContainerExited" :essential-container-exited, "UserInitiated" :user-initiated} input))

(clojure.core/defn- deser-placement-strategy [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-placement-strategy-type (input "type"))) (clojure.core/contains? input "field") (clojure.core/assoc :field (deser-string (input "field")))))

(clojure.core/defn- deser-tmpfs-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tmpfs coll))) input))

(clojure.core/defn- deser-container [input] (clojure.core/cond-> {} (clojure.core/contains? input "lastStatus") (clojure.core/assoc :last-status (deser-string (input "lastStatus"))) (clojure.core/contains? input "networkInterfaces") (clojure.core/assoc :network-interfaces (deser-network-interfaces (input "networkInterfaces"))) (clojure.core/contains? input "containerArn") (clojure.core/assoc :container-arn (deser-string (input "containerArn"))) (clojure.core/contains? input "exitCode") (clojure.core/assoc :exit-code (deser-boxed-integer (input "exitCode"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-string (input "cpu"))) (clojure.core/contains? input "healthStatus") (clojure.core/assoc :health-status (deser-health-status (input "healthStatus"))) (clojure.core/contains? input "gpuIds") (clojure.core/assoc :gpu-ids (deser-gpu-ids (input "gpuIds"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "taskArn") (clojure.core/assoc :task-arn (deser-string (input "taskArn"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-string (input "memory"))) (clojure.core/contains? input "networkBindings") (clojure.core/assoc :network-bindings (deser-network-bindings (input "networkBindings"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason"))) (clojure.core/contains? input "memoryReservation") (clojure.core/assoc :memory-reservation (deser-string (input "memoryReservation")))))

(clojure.core/defn- deser-secret-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret coll))) input))

(clojure.core/defn- deser-task-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "compatibilities") (clojure.core/assoc :compatibilities (deser-compatibility-list (input "compatibilities"))) (clojure.core/contains? input "requiresAttributes") (clojure.core/assoc :requires-attributes (deser-requires-attributes (input "requiresAttributes"))) (clojure.core/contains? input "taskDefinitionArn") (clojure.core/assoc :task-definition-arn (deser-string (input "taskDefinitionArn"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-string (input "cpu"))) (clojure.core/contains? input "volumes") (clojure.core/assoc :volumes (deser-volume-list (input "volumes"))) (clojure.core/contains? input "revision") (clojure.core/assoc :revision (deser-integer (input "revision"))) (clojure.core/contains? input "containerDefinitions") (clojure.core/assoc :container-definitions (deser-container-definitions (input "containerDefinitions"))) (clojure.core/contains? input "networkMode") (clojure.core/assoc :network-mode (deser-network-mode (input "networkMode"))) (clojure.core/contains? input "taskRoleArn") (clojure.core/assoc :task-role-arn (deser-string (input "taskRoleArn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-task-definition-status (input "status"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-string (input "memory"))) (clojure.core/contains? input "family") (clojure.core/assoc :family (deser-string (input "family"))) (clojure.core/contains? input "requiresCompatibilities") (clojure.core/assoc :requires-compatibilities (deser-compatibility-list (input "requiresCompatibilities"))) (clojure.core/contains? input "executionRoleArn") (clojure.core/assoc :execution-role-arn (deser-string (input "executionRoleArn"))) (clojure.core/contains? input "placementConstraints") (clojure.core/assoc :placement-constraints (deser-task-definition-placement-constraints (input "placementConstraints"))) (clojure.core/contains? input "ipcMode") (clojure.core/assoc :ipc-mode (deser-ipc-mode (input "ipcMode"))) (clojure.core/contains? input "pidMode") (clojure.core/assoc :pid-mode (deser-pid-mode (input "pidMode")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-container-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "workingDirectory") (clojure.core/assoc :working-directory (deser-string (input "workingDirectory"))) (clojure.core/contains? input "interactive") (clojure.core/assoc :interactive (deser-boxed-boolean (input "interactive"))) (clojure.core/contains? input "portMappings") (clojure.core/assoc :port-mappings (deser-port-mapping-list (input "portMappings"))) (clojure.core/contains? input "pseudoTerminal") (clojure.core/assoc :pseudo-terminal (deser-boxed-boolean (input "pseudoTerminal"))) (clojure.core/contains? input "hostname") (clojure.core/assoc :hostname (deser-string (input "hostname"))) (clojure.core/contains? input "ulimits") (clojure.core/assoc :ulimits (deser-ulimit-list (input "ulimits"))) (clojure.core/contains? input "linuxParameters") (clojure.core/assoc :linux-parameters (deser-linux-parameters (input "linuxParameters"))) (clojure.core/contains? input "command") (clojure.core/assoc :command (deser-string-list (input "command"))) (clojure.core/contains? input "mountPoints") (clojure.core/assoc :mount-points (deser-mount-point-list (input "mountPoints"))) (clojure.core/contains? input "image") (clojure.core/assoc :image (deser-string (input "image"))) (clojure.core/contains? input "resourceRequirements") (clojure.core/assoc :resource-requirements (deser-resource-requirements (input "resourceRequirements"))) (clojure.core/contains? input "user") (clojure.core/assoc :user (deser-string (input "user"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-integer (input "cpu"))) (clojure.core/contains? input "extraHosts") (clojure.core/assoc :extra-hosts (deser-host-entry-list (input "extraHosts"))) (clojure.core/contains? input "repositoryCredentials") (clojure.core/assoc :repository-credentials (deser-repository-credentials (input "repositoryCredentials"))) (clojure.core/contains? input "dockerLabels") (clojure.core/assoc :docker-labels (deser-docker-labels-map (input "dockerLabels"))) (clojure.core/contains? input "privileged") (clojure.core/assoc :privileged (deser-boxed-boolean (input "privileged"))) (clojure.core/contains? input "readonlyRootFilesystem") (clojure.core/assoc :readonly-root-filesystem (deser-boxed-boolean (input "readonlyRootFilesystem"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "volumesFrom") (clojure.core/assoc :volumes-from (deser-volume-from-list (input "volumesFrom"))) (clojure.core/contains? input "entryPoint") (clojure.core/assoc :entry-point (deser-string-list (input "entryPoint"))) (clojure.core/contains? input "logConfiguration") (clojure.core/assoc :log-configuration (deser-log-configuration (input "logConfiguration"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-boxed-integer (input "memory"))) (clojure.core/contains? input "dnsSearchDomains") (clojure.core/assoc :dns-search-domains (deser-string-list (input "dnsSearchDomains"))) (clojure.core/contains? input "links") (clojure.core/assoc :links (deser-string-list (input "links"))) (clojure.core/contains? input "essential") (clojure.core/assoc :essential (deser-boxed-boolean (input "essential"))) (clojure.core/contains? input "dnsServers") (clojure.core/assoc :dns-servers (deser-string-list (input "dnsServers"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-environment-variables (input "environment"))) (clojure.core/contains? input "healthCheck") (clojure.core/assoc :health-check (deser-health-check (input "healthCheck"))) (clojure.core/contains? input "memoryReservation") (clojure.core/assoc :memory-reservation (deser-boxed-integer (input "memoryReservation"))) (clojure.core/contains? input "systemControls") (clojure.core/assoc :system-controls (deser-system-controls (input "systemControls"))) (clojure.core/contains? input "dockerSecurityOptions") (clojure.core/assoc :docker-security-options (deser-string-list (input "dockerSecurityOptions"))) (clojure.core/contains? input "secrets") (clojure.core/assoc :secrets (deser-secret-list (input "secrets"))) (clojure.core/contains? input "disableNetworking") (clojure.core/assoc :disable-networking (deser-boxed-boolean (input "disableNetworking")))))

(clojure.core/defn- deser-network-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsvpcConfiguration") (clojure.core/assoc :awsvpc-configuration (deser-aws-vpc-configuration (input "awsvpcConfiguration")))))

(clojure.core/defn- deser-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason")))))

(clojure.core/defn- deser-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-settings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-setting coll))) input))

(clojure.core/defn- deser-device-cgroup-permissions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-device-cgroup-permission coll))) input))

(clojure.core/defn- deser-stability-status [input] (clojure.core/get {"STEADY_STATE" :steady-state, "STABILIZING" :stabilizing} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-volume-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume coll))) input))

(clojure.core/defn- deser-system-control [input] (clojure.core/cond-> {} (clojure.core/contains? input "namespace") (clojure.core/assoc :namespace (deser-string (input "namespace"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- deser-log-configuration-options-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-clusters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cluster coll))) input))

(clojure.core/defn- deser-volume-from-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume-from coll))) input))

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachmentId") (clojure.core/assoc :attachment-id (deser-string (input "attachmentId"))) (clojure.core/contains? input "privateIpv4Address") (clojure.core/assoc :private-ipv-4-address (deser-string (input "privateIpv4Address"))) (clojure.core/contains? input "ipv6Address") (clojure.core/assoc :ipv-6-address (deser-string (input "ipv6Address")))))

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"GPU" :gpu} input))

(clojure.core/defn- deser-container-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "versionInfo") (clojure.core/assoc :version-info (deser-version-info (input "versionInfo"))) (clojure.core/contains? input "ec2InstanceId") (clojure.core/assoc :ec-2-instance-id (deser-string (input "ec2InstanceId"))) (clojure.core/contains? input "agentUpdateStatus") (clojure.core/assoc :agent-update-status (deser-agent-update-status (input "agentUpdateStatus"))) (clojure.core/contains? input "registeredAt") (clojure.core/assoc :registered-at (deser-timestamp (input "registeredAt"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "agentConnected") (clojure.core/assoc :agent-connected (deser-boolean (input "agentConnected"))) (clojure.core/contains? input "remainingResources") (clojure.core/assoc :remaining-resources (deser-resources (input "remainingResources"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "runningTasksCount") (clojure.core/assoc :running-tasks-count (deser-integer (input "runningTasksCount"))) (clojure.core/contains? input "attributes") (clojure.core/assoc :attributes (deser-attributes (input "attributes"))) (clojure.core/contains? input "containerInstanceArn") (clojure.core/assoc :container-instance-arn (deser-string (input "containerInstanceArn"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-long (input "version"))) (clojure.core/contains? input "registeredResources") (clojure.core/assoc :registered-resources (deser-resources (input "registeredResources"))) (clojure.core/contains? input "pendingTasksCount") (clojure.core/assoc :pending-tasks-count (deser-integer (input "pendingTasksCount"))) (clojure.core/contains? input "attachments") (clojure.core/assoc :attachments (deser-attachments (input "attachments")))))

(clojure.core/defn- deser-connectivity [input] (clojure.core/get {"CONNECTED" :connected, "DISCONNECTED" :disconnected} input))

(clojure.core/defn- deser-requires-attributes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-linux-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "capabilities") (clojure.core/assoc :capabilities (deser-kernel-capabilities (input "capabilities"))) (clojure.core/contains? input "devices") (clojure.core/assoc :devices (deser-devices-list (input "devices"))) (clojure.core/contains? input "initProcessEnabled") (clojure.core/assoc :init-process-enabled (deser-boxed-boolean (input "initProcessEnabled"))) (clojure.core/contains? input "sharedMemorySize") (clojure.core/assoc :shared-memory-size (deser-boxed-integer (input "sharedMemorySize"))) (clojure.core/contains? input "tmpfs") (clojure.core/assoc :tmpfs (deser-tmpfs-list (input "tmpfs")))))

(clojure.core/defn- deser-attachment-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-value-pair coll))) input))

(clojure.core/defn- deser-container-overrides [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container-override coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-service-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-event coll))) input))

(clojure.core/defn- deser-load-balancer [input] (clojure.core/cond-> {} (clojure.core/contains? input "targetGroupArn") (clojure.core/assoc :target-group-arn (deser-string (input "targetGroupArn"))) (clojure.core/contains? input "loadBalancerName") (clojure.core/assoc :load-balancer-name (deser-string (input "loadBalancerName"))) (clojure.core/contains? input "containerName") (clojure.core/assoc :container-name (deser-string (input "containerName"))) (clojure.core/contains? input "containerPort") (clojure.core/assoc :container-port (deser-boxed-integer (input "containerPort")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-port-mapping [input] (clojure.core/cond-> {} (clojure.core/contains? input "containerPort") (clojure.core/assoc :container-port (deser-boxed-integer (input "containerPort"))) (clojure.core/contains? input "hostPort") (clojure.core/assoc :host-port (deser-boxed-integer (input "hostPort"))) (clojure.core/contains? input "protocol") (clojure.core/assoc :protocol (deser-transport-protocol (input "protocol")))))

(clojure.core/defn- deser-agent-update-status [input] (clojure.core/get {"PENDING" :pending, "STAGING" :staging, "STAGED" :staged, "UPDATING" :updating, "UPDATED" :updated, "FAILED" :failed} input))

(clojure.core/defn- deser-statistics [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-value-pair coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-tag-key (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-string (input "type"))) (clojure.core/contains? input "doubleValue") (clojure.core/assoc :double-value (deser-double (input "doubleValue"))) (clojure.core/contains? input "longValue") (clojure.core/assoc :long-value (deser-long (input "longValue"))) (clojure.core/contains? input "integerValue") (clojure.core/assoc :integer-value (deser-integer (input "integerValue"))) (clojure.core/contains? input "stringSetValue") (clojure.core/assoc :string-set-value (deser-string-list (input "stringSetValue")))))

(clojure.core/defn- deser-host-volume-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourcePath") (clojure.core/assoc :source-path (deser-string (input "sourcePath")))))

(clojure.core/defn- deser-ipc-mode [input] (clojure.core/get {"host" :host, "task" :task, "none" :none} input))

(clojure.core/defn- deser-launch-type [input] (clojure.core/get {"EC2" :ec-2, "FARGATE" :fargate} input))

(clojure.core/defn- deser-ulimit [input] (clojure.core/cond-> {:name (deser-ulimit-name (input "name")), :soft-limit (deser-integer (input "softLimit")), :hard-limit (deser-integer (input "hardLimit"))}))

(clojure.core/defn- deser-container-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container-instance coll))) input))

(clojure.core/defn- deser-compatibility-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compatibility coll))) input))

(clojure.core/defn- deser-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentConfiguration") (clojure.core/assoc :deployment-configuration (deser-deployment-configuration (input "deploymentConfiguration"))) (clojure.core/contains? input "propagateTags") (clojure.core/assoc :propagate-tags (deser-propagate-tags (input "propagateTags"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (input "clusterArn"))) (clojure.core/contains? input "launchType") (clojure.core/assoc :launch-type (deser-launch-type (input "launchType"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-string (input "roleArn"))) (clojure.core/contains? input "desiredCount") (clojure.core/assoc :desired-count (deser-integer (input "desiredCount"))) (clojure.core/contains? input "taskDefinition") (clojure.core/assoc :task-definition (deser-string (input "taskDefinition"))) (clojure.core/contains? input "healthCheckGracePeriodSeconds") (clojure.core/assoc :health-check-grace-period-seconds (deser-boxed-integer (input "healthCheckGracePeriodSeconds"))) (clojure.core/contains? input "createdBy") (clojure.core/assoc :created-by (deser-string (input "createdBy"))) (clojure.core/contains? input "deploymentController") (clojure.core/assoc :deployment-controller (deser-deployment-controller (input "deploymentController"))) (clojure.core/contains? input "placementStrategy") (clojure.core/assoc :placement-strategy (deser-placement-strategies (input "placementStrategy"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-string (input "serviceName"))) (clojure.core/contains? input "serviceArn") (clojure.core/assoc :service-arn (deser-string (input "serviceArn"))) (clojure.core/contains? input "runningCount") (clojure.core/assoc :running-count (deser-integer (input "runningCount"))) (clojure.core/contains? input "schedulingStrategy") (clojure.core/assoc :scheduling-strategy (deser-scheduling-strategy (input "schedulingStrategy"))) (clojure.core/contains? input "events") (clojure.core/assoc :events (deser-service-events (input "events"))) (clojure.core/contains? input "networkConfiguration") (clojure.core/assoc :network-configuration (deser-network-configuration (input "networkConfiguration"))) (clojure.core/contains? input "serviceRegistries") (clojure.core/assoc :service-registries (deser-service-registries (input "serviceRegistries"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "placementConstraints") (clojure.core/assoc :placement-constraints (deser-placement-constraints (input "placementConstraints"))) (clojure.core/contains? input "pendingCount") (clojure.core/assoc :pending-count (deser-integer (input "pendingCount"))) (clojure.core/contains? input "deployments") (clojure.core/assoc :deployments (deser-deployments (input "deployments"))) (clojure.core/contains? input "loadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancers (input "loadBalancers"))) (clojure.core/contains? input "enableECSManagedTags") (clojure.core/assoc :enable-ecs-managed-tags (deser-boolean (input "enableECSManagedTags"))) (clojure.core/contains? input "taskSets") (clojure.core/assoc :task-sets (deser-task-sets (input "taskSets")))))

(clojure.core/defn- deser-transport-protocol [input] (clojure.core/get {"tcp" :tcp, "udp" :udp} input))

(clojure.core/defn- deser-network-mode [input] (clojure.core/get {"bridge" :bridge, "host" :host, "awsvpc" :awsvpc, "none" :none} input))

(clojure.core/defn- deser-version-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "agentVersion") (clojure.core/assoc :agent-version (deser-string (input "agentVersion"))) (clojure.core/contains? input "agentHash") (clojure.core/assoc :agent-hash (deser-string (input "agentHash"))) (clojure.core/contains? input "dockerVersion") (clojure.core/assoc :docker-version (deser-string (input "dockerVersion")))))

(clojure.core/defn- deser-task-override [input] (clojure.core/cond-> {} (clojure.core/contains? input "containerOverrides") (clojure.core/assoc :container-overrides (deser-container-overrides (input "containerOverrides"))) (clojure.core/contains? input "taskRoleArn") (clojure.core/assoc :task-role-arn (deser-string (input "taskRoleArn"))) (clojure.core/contains? input "executionRoleArn") (clojure.core/assoc :execution-role-arn (deser-string (input "executionRoleArn")))))

(clojure.core/defn- deser-resource-requirements [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-requirement coll))) input))

(clojure.core/defn- deser-placement-constraints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-placement-constraint coll))) input))

(clojure.core/defn- deser-task-definition-status [input] (clojure.core/get {"ACTIVE" :active, "INACTIVE" :inactive} input))

(clojure.core/defn- deser-device [input] (clojure.core/cond-> {:host-path (deser-string (input "hostPath"))} (clojure.core/contains? input "containerPath") (clojure.core/assoc :container-path (deser-string (input "containerPath"))) (clojure.core/contains? input "permissions") (clojure.core/assoc :permissions (deser-device-cgroup-permissions (input "permissions")))))

(clojure.core/defn- deser-placement-strategy-type [input] (clojure.core/get {"random" :random, "spread" :spread, "binpack" :binpack} input))

(clojure.core/defn- deser-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "desiredStatus") (clojure.core/assoc :desired-status (deser-string (input "desiredStatus"))) (clojure.core/contains? input "stopCode") (clojure.core/assoc :stop-code (deser-task-stop-code (input "stopCode"))) (clojure.core/contains? input "overrides") (clojure.core/assoc :overrides (deser-task-override (input "overrides"))) (clojure.core/contains? input "lastStatus") (clojure.core/assoc :last-status (deser-string (input "lastStatus"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-timestamp (input "createdAt"))) (clojure.core/contains? input "group") (clojure.core/assoc :group (deser-string (input "group"))) (clojure.core/contains? input "startedBy") (clojure.core/assoc :started-by (deser-string (input "startedBy"))) (clojure.core/contains? input "clusterArn") (clojure.core/assoc :cluster-arn (deser-string (input "clusterArn"))) (clojure.core/contains? input "launchType") (clojure.core/assoc :launch-type (deser-launch-type (input "launchType"))) (clojure.core/contains? input "taskDefinitionArn") (clojure.core/assoc :task-definition-arn (deser-string (input "taskDefinitionArn"))) (clojure.core/contains? input "cpu") (clojure.core/assoc :cpu (deser-string (input "cpu"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags (input "tags"))) (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-timestamp (input "startedAt"))) (clojure.core/contains? input "healthStatus") (clojure.core/assoc :health-status (deser-health-status (input "healthStatus"))) (clojure.core/contains? input "connectivityAt") (clojure.core/assoc :connectivity-at (deser-timestamp (input "connectivityAt"))) (clojure.core/contains? input "connectivity") (clojure.core/assoc :connectivity (deser-connectivity (input "connectivity"))) (clojure.core/contains? input "stoppingAt") (clojure.core/assoc :stopping-at (deser-timestamp (input "stoppingAt"))) (clojure.core/contains? input "stoppedAt") (clojure.core/assoc :stopped-at (deser-timestamp (input "stoppedAt"))) (clojure.core/contains? input "taskArn") (clojure.core/assoc :task-arn (deser-string (input "taskArn"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-string (input "memory"))) (clojure.core/contains? input "containerInstanceArn") (clojure.core/assoc :container-instance-arn (deser-string (input "containerInstanceArn"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-long (input "version"))) (clojure.core/contains? input "stoppedReason") (clojure.core/assoc :stopped-reason (deser-string (input "stoppedReason"))) (clojure.core/contains? input "pullStoppedAt") (clojure.core/assoc :pull-stopped-at (deser-timestamp (input "pullStoppedAt"))) (clojure.core/contains? input "pullStartedAt") (clojure.core/assoc :pull-started-at (deser-timestamp (input "pullStartedAt"))) (clojure.core/contains? input "platformVersion") (clojure.core/assoc :platform-version (deser-string (input "platformVersion"))) (clojure.core/contains? input "executionStoppedAt") (clojure.core/assoc :execution-stopped-at (deser-timestamp (input "executionStoppedAt"))) (clojure.core/contains? input "containers") (clojure.core/assoc :containers (deser-containers (input "containers"))) (clojure.core/contains? input "attachments") (clojure.core/assoc :attachments (deser-attachments (input "attachments")))))

(clojure.core/defn- deser-scope [input] (clojure.core/get {"task" :task, "shared" :shared} input))

(clojure.core/defn- deser-service-registries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-service-registry coll))) input))

(clojure.core/defn- deser-container-definitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container-definition coll))) input))

(clojure.core/defn- deser-deployment-controller-type [input] (clojure.core/get {"ECS" :ecs, "CODE_DEPLOY" :code-deploy} input))

(clojure.core/defn- deser-propagate-tags [input] (clojure.core/get {"TASK_DEFINITION" :task-definition, "SERVICE" :service} input))

(clojure.core/defn- deser-device-cgroup-permission [input] (clojure.core/get {"read" :read, "write" :write, "mknod" :mknod} input))

(clojure.core/defn- deser-resource-requirement [input] (clojure.core/cond-> {:value (deser-string (input "value")), :type (deser-resource-type (input "type"))}))

(clojure.core/defn- deser-deployments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment coll))) input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-network-interfaces [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-interface coll))) input))

(clojure.core/defn- deser-key-value-pair [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- response-cluster-not-found-exception ([input] (response-cluster-not-found-exception nil input)) ([resultWrapper1733922 input] (clojure.core/let [rawinput1733921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733923 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-tasks-response ([input] (response-describe-tasks-response nil input)) ([resultWrapper1733925 input] (clojure.core/let [rawinput1733924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733926 {"tasks" (rawinput1733924 "tasks"), "failures" (rawinput1733924 "failures")}] (clojure.core/cond-> {} (letvar1733926 "tasks") (clojure.core/assoc :tasks (deser-tasks (clojure.core/get-in letvar1733926 ["tasks"]))) (letvar1733926 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1733926 ["failures"])))))))

(clojure.core/defn- response-list-tasks-response ([input] (response-list-tasks-response nil input)) ([resultWrapper1733928 input] (clojure.core/let [rawinput1733927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733929 {"taskArns" (rawinput1733927 "taskArns"), "nextToken" (rawinput1733927 "nextToken")}] (clojure.core/cond-> {} (letvar1733929 "taskArns") (clojure.core/assoc :task-arns (deser-string-list (clojure.core/get-in letvar1733929 ["taskArns"]))) (letvar1733929 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1733929 ["nextToken"])))))))

(clojure.core/defn- response-update-container-agent-response ([input] (response-update-container-agent-response nil input)) ([resultWrapper1733931 input] (clojure.core/let [rawinput1733930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733932 {"containerInstance" (rawinput1733930 "containerInstance")}] (clojure.core/cond-> {} (letvar1733932 "containerInstance") (clojure.core/assoc :container-instance (deser-container-instance (clojure.core/get-in letvar1733932 ["containerInstance"])))))))

(clojure.core/defn- response-no-update-available-exception ([input] (response-no-update-available-exception nil input)) ([resultWrapper1733934 input] (clojure.core/let [rawinput1733933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733935 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-container-instances-response ([input] (response-describe-container-instances-response nil input)) ([resultWrapper1733937 input] (clojure.core/let [rawinput1733936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733938 {"containerInstances" (rawinput1733936 "containerInstances"), "failures" (rawinput1733936 "failures")}] (clojure.core/cond-> {} (letvar1733938 "containerInstances") (clojure.core/assoc :container-instances (deser-container-instances (clojure.core/get-in letvar1733938 ["containerInstances"]))) (letvar1733938 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1733938 ["failures"])))))))

(clojure.core/defn- response-deregister-container-instance-response ([input] (response-deregister-container-instance-response nil input)) ([resultWrapper1733940 input] (clojure.core/let [rawinput1733939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733941 {"containerInstance" (rawinput1733939 "containerInstance")}] (clojure.core/cond-> {} (letvar1733941 "containerInstance") (clojure.core/assoc :container-instance (deser-container-instance (clojure.core/get-in letvar1733941 ["containerInstance"])))))))

(clojure.core/defn- response-client-exception ([input] (response-client-exception nil input)) ([resultWrapper1733943 input] (clojure.core/let [rawinput1733942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733944 {"message" (rawinput1733942 "message")}] (clojure.core/cond-> {} (letvar1733944 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1733944 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1733946 input] (clojure.core/let [rawinput1733945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733947 {"tags" (rawinput1733945 "tags")}] (clojure.core/cond-> {} (letvar1733947 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1733947 ["tags"])))))))

(clojure.core/defn- response-register-container-instance-response ([input] (response-register-container-instance-response nil input)) ([resultWrapper1733949 input] (clojure.core/let [rawinput1733948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733950 {"containerInstance" (rawinput1733948 "containerInstance")}] (clojure.core/cond-> {} (letvar1733950 "containerInstance") (clojure.core/assoc :container-instance (deser-container-instance (clojure.core/get-in letvar1733950 ["containerInstance"])))))))

(clojure.core/defn- response-list-clusters-response ([input] (response-list-clusters-response nil input)) ([resultWrapper1733952 input] (clojure.core/let [rawinput1733951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733953 {"clusterArns" (rawinput1733951 "clusterArns"), "nextToken" (rawinput1733951 "nextToken")}] (clojure.core/cond-> {} (letvar1733953 "clusterArns") (clojure.core/assoc :cluster-arns (deser-string-list (clojure.core/get-in letvar1733953 ["clusterArns"]))) (letvar1733953 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1733953 ["nextToken"])))))))

(clojure.core/defn- response-stop-task-response ([input] (response-stop-task-response nil input)) ([resultWrapper1733955 input] (clojure.core/let [rawinput1733954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733956 {"task" (rawinput1733954 "task")}] (clojure.core/cond-> {} (letvar1733956 "task") (clojure.core/assoc :task (deser-task (clojure.core/get-in letvar1733956 ["task"])))))))

(clojure.core/defn- response-describe-clusters-response ([input] (response-describe-clusters-response nil input)) ([resultWrapper1733958 input] (clojure.core/let [rawinput1733957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733959 {"clusters" (rawinput1733957 "clusters"), "failures" (rawinput1733957 "failures")}] (clojure.core/cond-> {} (letvar1733959 "clusters") (clojure.core/assoc :clusters (deser-clusters (clojure.core/get-in letvar1733959 ["clusters"]))) (letvar1733959 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1733959 ["failures"])))))))

(clojure.core/defn- response-run-task-response ([input] (response-run-task-response nil input)) ([resultWrapper1733961 input] (clojure.core/let [rawinput1733960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733962 {"tasks" (rawinput1733960 "tasks"), "failures" (rawinput1733960 "failures")}] (clojure.core/cond-> {} (letvar1733962 "tasks") (clojure.core/assoc :tasks (deser-tasks (clojure.core/get-in letvar1733962 ["tasks"]))) (letvar1733962 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1733962 ["failures"])))))))

(clojure.core/defn- response-delete-service-response ([input] (response-delete-service-response nil input)) ([resultWrapper1733964 input] (clojure.core/let [rawinput1733963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733965 {"service" (rawinput1733963 "service")}] (clojure.core/cond-> {} (letvar1733965 "service") (clojure.core/assoc :service (deser-service (clojure.core/get-in letvar1733965 ["service"])))))))

(clojure.core/defn- response-blocked-exception ([input] (response-blocked-exception nil input)) ([resultWrapper1733967 input] (clojure.core/let [rawinput1733966 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733968 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-attributes-response ([input] (response-delete-attributes-response nil input)) ([resultWrapper1733970 input] (clojure.core/let [rawinput1733969 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733971 {"attributes" (rawinput1733969 "attributes")}] (clojure.core/cond-> {} (letvar1733971 "attributes") (clojure.core/assoc :attributes (deser-attributes (clojure.core/get-in letvar1733971 ["attributes"])))))))

(clojure.core/defn- response-delete-cluster-response ([input] (response-delete-cluster-response nil input)) ([resultWrapper1733973 input] (clojure.core/let [rawinput1733972 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733974 {"cluster" (rawinput1733972 "cluster")}] (clojure.core/cond-> {} (letvar1733974 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar1733974 ["cluster"])))))))

(clojure.core/defn- response-service-not-active-exception ([input] (response-service-not-active-exception nil input)) ([resultWrapper1733976 input] (clojure.core/let [rawinput1733975 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733977 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-attributes-response ([input] (response-list-attributes-response nil input)) ([resultWrapper1733979 input] (clojure.core/let [rawinput1733978 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733980 {"attributes" (rawinput1733978 "attributes"), "nextToken" (rawinput1733978 "nextToken")}] (clojure.core/cond-> {} (letvar1733980 "attributes") (clojure.core/assoc :attributes (deser-attributes (clojure.core/get-in letvar1733980 ["attributes"]))) (letvar1733980 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1733980 ["nextToken"])))))))

(clojure.core/defn- response-unsupported-feature-exception ([input] (response-unsupported-feature-exception nil input)) ([resultWrapper1733982 input] (clojure.core/let [rawinput1733981 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733983 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-service-not-found-exception ([input] (response-service-not-found-exception nil input)) ([resultWrapper1733985 input] (clojure.core/let [rawinput1733984 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733986 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-platform-unknown-exception ([input] (response-platform-unknown-exception nil input)) ([resultWrapper1733988 input] (clojure.core/let [rawinput1733987 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733989 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1733991 input] (clojure.core/let [rawinput1733990 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733992 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-task-definitions-response ([input] (response-list-task-definitions-response nil input)) ([resultWrapper1733994 input] (clojure.core/let [rawinput1733993 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733995 {"taskDefinitionArns" (rawinput1733993 "taskDefinitionArns"), "nextToken" (rawinput1733993 "nextToken")}] (clojure.core/cond-> {} (letvar1733995 "taskDefinitionArns") (clojure.core/assoc :task-definition-arns (deser-string-list (clojure.core/get-in letvar1733995 ["taskDefinitionArns"]))) (letvar1733995 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1733995 ["nextToken"])))))))

(clojure.core/defn- response-create-cluster-response ([input] (response-create-cluster-response nil input)) ([resultWrapper1733997 input] (clojure.core/let [rawinput1733996 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1733998 {"cluster" (rawinput1733996 "cluster")}] (clojure.core/cond-> {} (letvar1733998 "cluster") (clojure.core/assoc :cluster (deser-cluster (clojure.core/get-in letvar1733998 ["cluster"])))))))

(clojure.core/defn- response-describe-task-definition-response ([input] (response-describe-task-definition-response nil input)) ([resultWrapper1734000 input] (clojure.core/let [rawinput1733999 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734001 {"taskDefinition" (rawinput1733999 "taskDefinition"), "tags" (rawinput1733999 "tags")}] (clojure.core/cond-> {} (letvar1734001 "taskDefinition") (clojure.core/assoc :task-definition (deser-task-definition (clojure.core/get-in letvar1734001 ["taskDefinition"]))) (letvar1734001 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1734001 ["tags"])))))))

(clojure.core/defn- response-delete-account-setting-response ([input] (response-delete-account-setting-response nil input)) ([resultWrapper1734003 input] (clojure.core/let [rawinput1734002 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734004 {"setting" (rawinput1734002 "setting")}] (clojure.core/cond-> {} (letvar1734004 "setting") (clojure.core/assoc :setting (deser-setting (clojure.core/get-in letvar1734004 ["setting"])))))))

(clojure.core/defn- response-deregister-task-definition-response ([input] (response-deregister-task-definition-response nil input)) ([resultWrapper1734006 input] (clojure.core/let [rawinput1734005 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734007 {"taskDefinition" (rawinput1734005 "taskDefinition")}] (clojure.core/cond-> {} (letvar1734007 "taskDefinition") (clojure.core/assoc :task-definition (deser-task-definition (clojure.core/get-in letvar1734007 ["taskDefinition"])))))))

(clojure.core/defn- response-describe-services-response ([input] (response-describe-services-response nil input)) ([resultWrapper1734009 input] (clojure.core/let [rawinput1734008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734010 {"services" (rawinput1734008 "services"), "failures" (rawinput1734008 "failures")}] (clojure.core/cond-> {} (letvar1734010 "services") (clojure.core/assoc :services (deser-services (clojure.core/get-in letvar1734010 ["services"]))) (letvar1734010 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1734010 ["failures"])))))))

(clojure.core/defn- response-put-account-setting-response ([input] (response-put-account-setting-response nil input)) ([resultWrapper1734012 input] (clojure.core/let [rawinput1734011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734013 {"setting" (rawinput1734011 "setting")}] (clojure.core/cond-> {} (letvar1734013 "setting") (clojure.core/assoc :setting (deser-setting (clojure.core/get-in letvar1734013 ["setting"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1734015 input] (clojure.core/let [rawinput1734014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734016 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-container-instances-response ([input] (response-list-container-instances-response nil input)) ([resultWrapper1734018 input] (clojure.core/let [rawinput1734017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734019 {"containerInstanceArns" (rawinput1734017 "containerInstanceArns"), "nextToken" (rawinput1734017 "nextToken")}] (clojure.core/cond-> {} (letvar1734019 "containerInstanceArns") (clojure.core/assoc :container-instance-arns (deser-string-list (clojure.core/get-in letvar1734019 ["containerInstanceArns"]))) (letvar1734019 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1734019 ["nextToken"])))))))

(clojure.core/defn- response-missing-version-exception ([input] (response-missing-version-exception nil input)) ([resultWrapper1734021 input] (clojure.core/let [rawinput1734020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734022 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-attribute-limit-exceeded-exception ([input] (response-attribute-limit-exceeded-exception nil input)) ([resultWrapper1734024 input] (clojure.core/let [rawinput1734023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734025 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-discover-poll-endpoint-response ([input] (response-discover-poll-endpoint-response nil input)) ([resultWrapper1734027 input] (clojure.core/let [rawinput1734026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734028 {"endpoint" (rawinput1734026 "endpoint"), "telemetryEndpoint" (rawinput1734026 "telemetryEndpoint")}] (clojure.core/cond-> {} (letvar1734028 "endpoint") (clojure.core/assoc :endpoint (deser-string (clojure.core/get-in letvar1734028 ["endpoint"]))) (letvar1734028 "telemetryEndpoint") (clojure.core/assoc :telemetry-endpoint (deser-string (clojure.core/get-in letvar1734028 ["telemetryEndpoint"])))))))

(clojure.core/defn- response-submit-task-state-change-response ([input] (response-submit-task-state-change-response nil input)) ([resultWrapper1734030 input] (clojure.core/let [rawinput1734029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734031 {"acknowledgment" (rawinput1734029 "acknowledgment")}] (clojure.core/cond-> {} (letvar1734031 "acknowledgment") (clojure.core/assoc :acknowledgment (deser-string (clojure.core/get-in letvar1734031 ["acknowledgment"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1734033 input] (clojure.core/let [rawinput1734032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734034 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cluster-contains-container-instances-exception ([input] (response-cluster-contains-container-instances-exception nil input)) ([resultWrapper1734036 input] (clojure.core/let [rawinput1734035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734037 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-platform-task-definition-incompatibility-exception ([input] (response-platform-task-definition-incompatibility-exception nil input)) ([resultWrapper1734039 input] (clojure.core/let [rawinput1734038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734040 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-services-response ([input] (response-list-services-response nil input)) ([resultWrapper1734042 input] (clojure.core/let [rawinput1734041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734043 {"serviceArns" (rawinput1734041 "serviceArns"), "nextToken" (rawinput1734041 "nextToken")}] (clojure.core/cond-> {} (letvar1734043 "serviceArns") (clojure.core/assoc :service-arns (deser-string-list (clojure.core/get-in letvar1734043 ["serviceArns"]))) (letvar1734043 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1734043 ["nextToken"])))))))

(clojure.core/defn- response-server-exception ([input] (response-server-exception nil input)) ([resultWrapper1734045 input] (clojure.core/let [rawinput1734044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734046 {"message" (rawinput1734044 "message")}] (clojure.core/cond-> {} (letvar1734046 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1734046 ["message"])))))))

(clojure.core/defn- response-list-account-settings-response ([input] (response-list-account-settings-response nil input)) ([resultWrapper1734048 input] (clojure.core/let [rawinput1734047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734049 {"settings" (rawinput1734047 "settings"), "nextToken" (rawinput1734047 "nextToken")}] (clojure.core/cond-> {} (letvar1734049 "settings") (clojure.core/assoc :settings (deser-settings (clojure.core/get-in letvar1734049 ["settings"]))) (letvar1734049 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1734049 ["nextToken"])))))))

(clojure.core/defn- response-update-service-response ([input] (response-update-service-response nil input)) ([resultWrapper1734051 input] (clojure.core/let [rawinput1734050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734052 {"service" (rawinput1734050 "service")}] (clojure.core/cond-> {} (letvar1734052 "service") (clojure.core/assoc :service (deser-service (clojure.core/get-in letvar1734052 ["service"])))))))

(clojure.core/defn- response-cluster-contains-tasks-exception ([input] (response-cluster-contains-tasks-exception nil input)) ([resultWrapper1734054 input] (clojure.core/let [rawinput1734053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-task-response ([input] (response-start-task-response nil input)) ([resultWrapper1734057 input] (clojure.core/let [rawinput1734056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734058 {"tasks" (rawinput1734056 "tasks"), "failures" (rawinput1734056 "failures")}] (clojure.core/cond-> {} (letvar1734058 "tasks") (clojure.core/assoc :tasks (deser-tasks (clojure.core/get-in letvar1734058 ["tasks"]))) (letvar1734058 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1734058 ["failures"])))))))

(clojure.core/defn- response-register-task-definition-response ([input] (response-register-task-definition-response nil input)) ([resultWrapper1734060 input] (clojure.core/let [rawinput1734059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734061 {"taskDefinition" (rawinput1734059 "taskDefinition"), "tags" (rawinput1734059 "tags")}] (clojure.core/cond-> {} (letvar1734061 "taskDefinition") (clojure.core/assoc :task-definition (deser-task-definition (clojure.core/get-in letvar1734061 ["taskDefinition"]))) (letvar1734061 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1734061 ["tags"])))))))

(clojure.core/defn- response-create-service-response ([input] (response-create-service-response nil input)) ([resultWrapper1734063 input] (clojure.core/let [rawinput1734062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734064 {"service" (rawinput1734062 "service")}] (clojure.core/cond-> {} (letvar1734064 "service") (clojure.core/assoc :service (deser-service (clojure.core/get-in letvar1734064 ["service"])))))))

(clojure.core/defn- response-submit-container-state-change-response ([input] (response-submit-container-state-change-response nil input)) ([resultWrapper1734066 input] (clojure.core/let [rawinput1734065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734067 {"acknowledgment" (rawinput1734065 "acknowledgment")}] (clojure.core/cond-> {} (letvar1734067 "acknowledgment") (clojure.core/assoc :acknowledgment (deser-string (clojure.core/get-in letvar1734067 ["acknowledgment"])))))))

(clojure.core/defn- response-target-not-found-exception ([input] (response-target-not-found-exception nil input)) ([resultWrapper1734069 input] (clojure.core/let [rawinput1734068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734070 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-task-definition-families-response ([input] (response-list-task-definition-families-response nil input)) ([resultWrapper1734072 input] (clojure.core/let [rawinput1734071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734073 {"families" (rawinput1734071 "families"), "nextToken" (rawinput1734071 "nextToken")}] (clojure.core/cond-> {} (letvar1734073 "families") (clojure.core/assoc :families (deser-string-list (clojure.core/get-in letvar1734073 ["families"]))) (letvar1734073 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1734073 ["nextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1734075 input] (clojure.core/let [rawinput1734074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734076 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1734078 input] (clojure.core/let [rawinput1734077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734079 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-attributes-response ([input] (response-put-attributes-response nil input)) ([resultWrapper1734081 input] (clojure.core/let [rawinput1734080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734082 {"attributes" (rawinput1734080 "attributes")}] (clojure.core/cond-> {} (letvar1734082 "attributes") (clojure.core/assoc :attributes (deser-attributes (clojure.core/get-in letvar1734082 ["attributes"])))))))

(clojure.core/defn- response-cluster-contains-services-exception ([input] (response-cluster-contains-services-exception nil input)) ([resultWrapper1734084 input] (clojure.core/let [rawinput1734083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734085 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-in-progress-exception ([input] (response-update-in-progress-exception nil input)) ([resultWrapper1734087 input] (clojure.core/let [rawinput1734086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734088 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-account-setting-default-response ([input] (response-put-account-setting-default-response nil input)) ([resultWrapper1734090 input] (clojure.core/let [rawinput1734089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734091 {"setting" (rawinput1734089 "setting")}] (clojure.core/cond-> {} (letvar1734091 "setting") (clojure.core/assoc :setting (deser-setting (clojure.core/get-in letvar1734091 ["setting"])))))))

(clojure.core/defn- response-update-container-instances-state-response ([input] (response-update-container-instances-state-response nil input)) ([resultWrapper1734093 input] (clojure.core/let [rawinput1734092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1734094 {"containerInstances" (rawinput1734092 "containerInstances"), "failures" (rawinput1734092 "failures")}] (clojure.core/cond-> {} (letvar1734094 "containerInstances") (clojure.core/assoc :container-instances (deser-container-instances (clojure.core/get-in letvar1734094 ["containerInstances"]))) (letvar1734094 "failures") (clojure.core/assoc :failures (deser-failures (clojure.core/get-in letvar1734094 ["failures"])))))))

(clojure.spec.alpha/def :portkey.aws.ecs/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.ecs/tag-key))

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

(clojure.spec.alpha/def :portkey.aws.ecs/setting-name #{:task-long-arn-format :container-instance-long-arn-format "taskLongArnFormat" :service-long-arn-format "serviceLongArnFormat" "containerInstanceLongArnFormat"})

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

(clojure.spec.alpha/def :portkey.aws.ecs.setting/name (clojure.spec.alpha/and :portkey.aws.ecs/setting-name))
(clojure.spec.alpha/def :portkey.aws.ecs.setting/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.setting/principal-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/setting (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.setting/name :portkey.aws.ecs.setting/value :portkey.aws.ecs.setting/principal-arn]))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/task (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/container-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/exit-code (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.submit-container-state-change-request/network-bindings (clojure.spec.alpha/and :portkey.aws.ecs/network-bindings))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-container-state-change-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-container-state-change-request/cluster :portkey.aws.ecs.submit-container-state-change-request/task :portkey.aws.ecs.submit-container-state-change-request/container-name :portkey.aws.ecs.submit-container-state-change-request/status :portkey.aws.ecs.submit-container-state-change-request/exit-code :portkey.aws.ecs.submit-container-state-change-request/reason :portkey.aws.ecs.submit-container-state-change-request/network-bindings]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-sets (clojure.spec.alpha/coll-of :portkey.aws.ecs/task-set))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-attributes-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.delete-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.delete-attributes-request/attributes] :opt-un [:portkey.aws.ecs.delete-attributes-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-response/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/container-instances))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-container-instances-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-container-instances-response/container-instances :portkey.aws.ecs.describe-container-instances-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/scheduling-strategy #{"REPLICA" :daemon :replica "DAEMON"})

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-response/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/container-instance))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-container-instance-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deregister-container-instance-response/container-instance]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/name (clojure.spec.alpha/and :portkey.aws.ecs/setting-name))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/principal-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/effective-settings (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-request/max-results (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs/list-account-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-account-settings-request/name :portkey.aws.ecs.list-account-settings-request/value :portkey.aws.ecs.list-account-settings-request/principal-arn :portkey.aws.ecs.list-account-settings-request/effective-settings :portkey.aws.ecs.list-account-settings-request/next-token :portkey.aws.ecs.list-account-settings-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecs.host-entry/hostname (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.host-entry/ip-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/host-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.host-entry/hostname :portkey.aws.ecs.host-entry/ip-address] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-default-request/name (clojure.spec.alpha/and :portkey.aws.ecs/setting-name))
(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-default-request/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/put-account-setting-default-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.put-account-setting-default-request/name :portkey.aws.ecs.put-account-setting-default-request/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/string-map (clojure.spec.alpha/map-of :portkey.aws.ecs/string :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs/placement-strategies (clojure.spec.alpha/coll-of :portkey.aws.ecs/placement-strategy))

(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/mount-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.mount-point/source-volume :portkey.aws.ecs.mount-point/container-path :portkey.aws.ecs.mount-point/read-only]))

(clojure.spec.alpha/def :portkey.aws.ecs.secret/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.secret/value-from (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/secret (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.secret/name :portkey.aws.ecs.secret/value-from] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.ecs.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-tags-for-resource-response/tags]))

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
(clojure.spec.alpha/def :portkey.aws.ecs.container-override/resource-requirements (clojure.spec.alpha/and :portkey.aws.ecs/resource-requirements))
(clojure.spec.alpha/def :portkey.aws.ecs/container-override (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-override/name :portkey.aws.ecs.container-override/command :portkey.aws.ecs.container-override/environment :portkey.aws.ecs.container-override/cpu :portkey.aws.ecs.container-override/memory :portkey.aws.ecs.container-override/memory-reservation :portkey.aws.ecs.container-override/resource-requirements]))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-devices (clojure.spec.alpha/coll-of :portkey.aws.ecs/platform-device))

(clojure.spec.alpha/def :portkey.aws.ecs/task-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/task-field))

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

(clojure.spec.alpha/def :portkey.aws.ecs.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.list-tags-for-resource-request/resource-arn] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.ecs.describe-container-instances-request/include (clojure.spec.alpha/and :portkey.aws.ecs/container-instance-field-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-container-instances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-container-instances-request/container-instances] :opt-un [:portkey.aws.ecs.describe-container-instances-request/cluster :portkey.aws.ecs.describe-container-instances-request/include]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-family-status #{:inactive :all :active "INACTIVE" "ACTIVE" "ALL"})

(clojure.spec.alpha/def :portkey.aws.ecs/boxed-integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/volumes (clojure.spec.alpha/and :portkey.aws.ecs/volume-list))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/container-definitions (clojure.spec.alpha/and :portkey.aws.ecs/container-definitions))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/network-mode (clojure.spec.alpha/and :portkey.aws.ecs/network-mode))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/task-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/memory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/family (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/requires-compatibilities (clojure.spec.alpha/and :portkey.aws.ecs/compatibility-list))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/execution-role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/ipc-mode (clojure.spec.alpha/and :portkey.aws.ecs/ipc-mode))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-request/pid-mode (clojure.spec.alpha/and :portkey.aws.ecs/pid-mode))
(clojure.spec.alpha/def :portkey.aws.ecs/register-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.register-task-definition-request/family :portkey.aws.ecs.register-task-definition-request/container-definitions] :opt-un [:portkey.aws.ecs.register-task-definition-request/cpu :portkey.aws.ecs.register-task-definition-request/tags :portkey.aws.ecs.register-task-definition-request/volumes :portkey.aws.ecs.register-task-definition-request/network-mode :portkey.aws.ecs.register-task-definition-request/task-role-arn :portkey.aws.ecs.register-task-definition-request/memory :portkey.aws.ecs.register-task-definition-request/requires-compatibilities :portkey.aws.ecs.register-task-definition-request/execution-role-arn :portkey.aws.ecs.register-task-definition-request/placement-constraints :portkey.aws.ecs.register-task-definition-request/ipc-mode :portkey.aws.ecs.register-task-definition-request/pid-mode]))

(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/subnets (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/security-groups (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.aws-vpc-configuration/assign-public-ip (clojure.spec.alpha/and :portkey.aws.ecs/assign-public-ip))
(clojure.spec.alpha/def :portkey.aws.ecs/aws-vpc-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.aws-vpc-configuration/subnets] :opt-un [:portkey.aws.ecs.aws-vpc-configuration/security-groups :portkey.aws.ecs.aws-vpc-configuration/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-request/services (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-request/include (clojure.spec.alpha/and :portkey.aws.ecs/service-field-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-services-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-services-request/services] :opt-un [:portkey.aws.ecs.describe-services-request/cluster :portkey.aws.ecs.describe-services-request/include]))

(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.put-attributes-request/attributes] :opt-un [:portkey.aws.ecs.put-attributes-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/version-info (clojure.spec.alpha/and :portkey.aws.ecs/version-info))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/total-resources (clojure.spec.alpha/and :portkey.aws.ecs/resources))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/instance-identity-document-signature (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/platform-devices (clojure.spec.alpha/and :portkey.aws.ecs/platform-devices))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/instance-identity-document (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs.register-container-instance-request/container-instance-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/register-container-instance-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.register-container-instance-request/version-info :portkey.aws.ecs.register-container-instance-request/total-resources :portkey.aws.ecs.register-container-instance-request/cluster :portkey.aws.ecs.register-container-instance-request/tags :portkey.aws.ecs.register-container-instance-request/instance-identity-document-signature :portkey.aws.ecs.register-container-instance-request/platform-devices :portkey.aws.ecs.register-container-instance-request/instance-identity-document :portkey.aws.ecs.register-container-instance-request/attributes :portkey.aws.ecs.register-container-instance-request/container-instance-arn]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-placement-constraint-type #{"memberOf" :member-of})

(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-response/task (clojure.spec.alpha/and :portkey.aws.ecs/task))
(clojure.spec.alpha/def :portkey.aws.ecs/stop-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.stop-task-response/task]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-response/clusters (clojure.spec.alpha/and :portkey.aws.ecs/clusters))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-clusters-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-clusters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-clusters-response/clusters :portkey.aws.ecs.describe-clusters-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs.deployment-controller/type (clojure.spec.alpha/and :portkey.aws.ecs/deployment-controller-type))
(clojure.spec.alpha/def :portkey.aws.ecs/deployment-controller (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.deployment-controller/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/containers (clojure.spec.alpha/coll-of :portkey.aws.ecs/container))

(clojure.spec.alpha/def :portkey.aws.ecs/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.ecs/gpu-ids (clojure.spec.alpha/coll-of :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs/target-type #{"container-instance" :containerinstance})

(clojure.spec.alpha/def :portkey.aws.ecs/sort-order #{:desc "DESC" :asc "ASC"})

(clojure.spec.alpha/def :portkey.aws.ecs.run-task-response/tasks (clojure.spec.alpha/and :portkey.aws.ecs/tasks))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/run-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.run-task-response/tasks :portkey.aws.ecs.run-task-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs/tags (clojure.spec.alpha/coll-of :portkey.aws.ecs/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.ecs/ulimit-name #{"nproc" :locks :memlock :msgqueue :sigpending "fsize" "memlock" "nofile" "cpu" :rss "rtprio" "sigpending" :fsize "rttime" :nproc "msgqueue" :rttime :nofile :stack :core :nice "locks" "data" "core" "rss" :cpu :rtprio "nice" "stack" :data})

(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-request/name (clojure.spec.alpha/and :portkey.aws.ecs/setting-name))
(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-request/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-request/principal-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/put-account-setting-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.put-account-setting-request/name :portkey.aws.ecs.put-account-setting-request/value] :opt-un [:portkey.aws.ecs.put-account-setting-request/principal-arn]))

(clojure.spec.alpha/def :portkey.aws.ecs/scale-unit #{"PERCENT" :percent})

(clojure.spec.alpha/def :portkey.aws.ecs.delete-service-response/service (clojure.spec.alpha/and :portkey.aws.ecs/service))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.delete-service-response/service]))

(clojure.spec.alpha/def :portkey.aws.ecs/blocked-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/health-status #{"UNKNOWN" :unknown :unhealthy :healthy "HEALTHY" "UNHEALTHY"})

(clojure.spec.alpha/def :portkey.aws.ecs.task-set/updated-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/stability-status (clojure.spec.alpha/and :portkey.aws.ecs/stability-status))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/scale (clojure.spec.alpha/and :portkey.aws.ecs/scale))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/task-set-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/running-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/pending-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/stability-status-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/load-balancers (clojure.spec.alpha/and :portkey.aws.ecs/load-balancers))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/external-id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task-set/computed-desired-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs/task-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task-set/updated-at :portkey.aws.ecs.task-set/stability-status :portkey.aws.ecs.task-set/scale :portkey.aws.ecs.task-set/created-at :portkey.aws.ecs.task-set/started-by :portkey.aws.ecs.task-set/launch-type :portkey.aws.ecs.task-set/task-definition :portkey.aws.ecs.task-set/id :portkey.aws.ecs.task-set/task-set-arn :portkey.aws.ecs.task-set/status :portkey.aws.ecs.task-set/running-count :portkey.aws.ecs.task-set/network-configuration :portkey.aws.ecs.task-set/platform-version :portkey.aws.ecs.task-set/pending-count :portkey.aws.ecs.task-set/stability-status-at :portkey.aws.ecs.task-set/load-balancers :portkey.aws.ecs.task-set/external-id :portkey.aws.ecs.task-set/computed-desired-count]))

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-task-definition-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.deregister-task-definition-request/task-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-placement-constraints (clojure.spec.alpha/coll-of :portkey.aws.ecs/task-definition-placement-constraint))

(clojure.spec.alpha/def :portkey.aws.ecs/ulimit-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/ulimit))

(clojure.spec.alpha/def :portkey.aws.ecs.scale/value (clojure.spec.alpha/and :portkey.aws.ecs/double))
(clojure.spec.alpha/def :portkey.aws.ecs.scale/unit (clojure.spec.alpha/and :portkey.aws.ecs/scale-unit))
(clojure.spec.alpha/def :portkey.aws.ecs/scale (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.scale/value :portkey.aws.ecs.scale/unit]))

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
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/propagate-tags (clojure.spec.alpha/and :portkey.aws.ecs/propagate-tags))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/count (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/placement-strategy (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategies))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs.run-task-request/enable-ecs-managed-tags (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/run-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.run-task-request/task-definition] :opt-un [:portkey.aws.ecs.run-task-request/overrides :portkey.aws.ecs.run-task-request/cluster :portkey.aws.ecs.run-task-request/propagate-tags :portkey.aws.ecs.run-task-request/group :portkey.aws.ecs.run-task-request/started-by :portkey.aws.ecs.run-task-request/launch-type :portkey.aws.ecs.run-task-request/tags :portkey.aws.ecs.run-task-request/count :portkey.aws.ecs.run-task-request/placement-strategy :portkey.aws.ecs.run-task-request/network-configuration :portkey.aws.ecs.run-task-request/platform-version :portkey.aws.ecs.run-task-request/placement-constraints :portkey.aws.ecs.run-task-request/enable-ecs-managed-tags]))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-unknown-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/pid-mode #{:task "host" :host "task"})

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

(clojure.spec.alpha/def :portkey.aws.ecs/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.ecs/task-field #{:tags "TAGS"})

(clojure.spec.alpha/def :portkey.aws.ecs.create-cluster-response/cluster (clojure.spec.alpha/and :portkey.aws.ecs/cluster))
(clojure.spec.alpha/def :portkey.aws.ecs/create-cluster-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.create-cluster-response/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-response/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-task-definition-response/task-definition :portkey.aws.ecs.describe-task-definition-response/tags]))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/cluster-field))

(clojure.spec.alpha/def :portkey.aws.ecs/compatibility #{"EC2" "FARGATE" :fargate :ec-2})

(clojure.spec.alpha/def :portkey.aws.ecs/service-field #{:tags "TAGS"})

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

(clojure.spec.alpha/def :portkey.aws.ecs.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.tag-resource-request/resource-arn :portkey.aws.ecs.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-account-setting-response/setting (clojure.spec.alpha/and :portkey.aws.ecs/setting))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-account-setting-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.delete-account-setting-response/setting]))

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.deregister-task-definition-response/task-definition]))

(clojure.spec.alpha/def :portkey.aws.ecs/network-bindings (clojure.spec.alpha/coll-of :portkey.aws.ecs/network-binding))

(clojure.spec.alpha/def :portkey.aws.ecs/load-balancers (clojure.spec.alpha/coll-of :portkey.aws.ecs/load-balancer))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-response/services (clojure.spec.alpha/and :portkey.aws.ecs/services))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-services-response/failures (clojure.spec.alpha/and :portkey.aws.ecs/failures))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-services-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.describe-services-response/services :portkey.aws.ecs.describe-services-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-response/setting (clojure.spec.alpha/and :portkey.aws.ecs/setting))
(clojure.spec.alpha/def :portkey.aws.ecs/put-account-setting-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.put-account-setting-response/setting]))

(clojure.spec.alpha/def :portkey.aws.ecs/mount-point-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/mount-point))

(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/container-path (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/size (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.tmpfs/mount-options (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs/tmpfs (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.tmpfs/container-path :portkey.aws.ecs.tmpfs/size] :opt-un [:portkey.aws.ecs.tmpfs/mount-options]))

(clojure.spec.alpha/def :portkey.aws.ecs.cluster/active-services-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/cluster-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/statistics (clojure.spec.alpha/and :portkey.aws.ecs/statistics))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/running-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/registered-container-instances-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.cluster/pending-tasks-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs/cluster (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.cluster/active-services-count :portkey.aws.ecs.cluster/cluster-arn :portkey.aws.ecs.cluster/tags :portkey.aws.ecs.cluster/cluster-name :portkey.aws.ecs.cluster/statistics :portkey.aws.ecs.cluster/status :portkey.aws.ecs.cluster/running-tasks-count :portkey.aws.ecs.cluster/registered-container-instances-count :portkey.aws.ecs.cluster/pending-tasks-count]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-stop-code #{:essential-container-exited "TaskFailedToStart" "UserInitiated" :task-failed-to-start :user-initiated "EssentialContainerExited"})

(clojure.spec.alpha/def :portkey.aws.ecs/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.ecs.container/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/health-status (clojure.spec.alpha/and :portkey.aws.ecs/health-status))
(clojure.spec.alpha/def :portkey.aws.ecs.container/gpu-ids (clojure.spec.alpha/and :portkey.aws.ecs/gpu-ids))
(clojure.spec.alpha/def :portkey.aws.ecs.container/name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/task-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/memory (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/network-bindings (clojure.spec.alpha/and :portkey.aws.ecs/network-bindings))
(clojure.spec.alpha/def :portkey.aws.ecs.container/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.container/memory-reservation (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/container (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container/last-status :portkey.aws.ecs.container/network-interfaces :portkey.aws.ecs.container/container-arn :portkey.aws.ecs.container/exit-code :portkey.aws.ecs.container/cpu :portkey.aws.ecs.container/health-status :portkey.aws.ecs.container/gpu-ids :portkey.aws.ecs.container/name :portkey.aws.ecs.container/task-arn :portkey.aws.ecs.container/memory :portkey.aws.ecs.container/network-bindings :portkey.aws.ecs.container/reason :portkey.aws.ecs.container/memory-reservation]))

(clojure.spec.alpha/def :portkey.aws.ecs/secret-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/secret))

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
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/ipc-mode (clojure.spec.alpha/and :portkey.aws.ecs/ipc-mode))
(clojure.spec.alpha/def :portkey.aws.ecs.task-definition/pid-mode (clojure.spec.alpha/and :portkey.aws.ecs/pid-mode))
(clojure.spec.alpha/def :portkey.aws.ecs/task-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task-definition/compatibilities :portkey.aws.ecs.task-definition/requires-attributes :portkey.aws.ecs.task-definition/task-definition-arn :portkey.aws.ecs.task-definition/cpu :portkey.aws.ecs.task-definition/volumes :portkey.aws.ecs.task-definition/revision :portkey.aws.ecs.task-definition/container-definitions :portkey.aws.ecs.task-definition/network-mode :portkey.aws.ecs.task-definition/task-role-arn :portkey.aws.ecs.task-definition/status :portkey.aws.ecs.task-definition/memory :portkey.aws.ecs.task-definition/family :portkey.aws.ecs.task-definition/requires-compatibilities :portkey.aws.ecs.task-definition/execution-role-arn :portkey.aws.ecs.task-definition/placement-constraints :portkey.aws.ecs.task-definition/ipc-mode :portkey.aws.ecs.task-definition/pid-mode]))

(clojure.spec.alpha/def :portkey.aws.ecs/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-field #{:tags "TAGS"})

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
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/resource-requirements (clojure.spec.alpha/and :portkey.aws.ecs/resource-requirements))
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
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/secrets (clojure.spec.alpha/and :portkey.aws.ecs/secret-list))
(clojure.spec.alpha/def :portkey.aws.ecs.container-definition/disable-networking (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/container-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-definition/working-directory :portkey.aws.ecs.container-definition/interactive :portkey.aws.ecs.container-definition/port-mappings :portkey.aws.ecs.container-definition/pseudo-terminal :portkey.aws.ecs.container-definition/hostname :portkey.aws.ecs.container-definition/ulimits :portkey.aws.ecs.container-definition/linux-parameters :portkey.aws.ecs.container-definition/command :portkey.aws.ecs.container-definition/mount-points :portkey.aws.ecs.container-definition/image :portkey.aws.ecs.container-definition/resource-requirements :portkey.aws.ecs.container-definition/user :portkey.aws.ecs.container-definition/cpu :portkey.aws.ecs.container-definition/extra-hosts :portkey.aws.ecs.container-definition/repository-credentials :portkey.aws.ecs.container-definition/docker-labels :portkey.aws.ecs.container-definition/privileged :portkey.aws.ecs.container-definition/readonly-root-filesystem :portkey.aws.ecs.container-definition/name :portkey.aws.ecs.container-definition/volumes-from :portkey.aws.ecs.container-definition/entry-point :portkey.aws.ecs.container-definition/log-configuration :portkey.aws.ecs.container-definition/memory :portkey.aws.ecs.container-definition/dns-search-domains :portkey.aws.ecs.container-definition/links :portkey.aws.ecs.container-definition/essential :portkey.aws.ecs.container-definition/dns-servers :portkey.aws.ecs.container-definition/environment :portkey.aws.ecs.container-definition/health-check :portkey.aws.ecs.container-definition/memory-reservation :portkey.aws.ecs.container-definition/system-controls :portkey.aws.ecs.container-definition/docker-security-options :portkey.aws.ecs.container-definition/secrets :portkey.aws.ecs.container-definition/disable-networking]))

(clojure.spec.alpha/def :portkey.aws.ecs/missing-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/task (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.stop-task-request/reason (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/stop-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.stop-task-request/task] :opt-un [:portkey.aws.ecs.stop-task-request/cluster :portkey.aws.ecs.stop-task-request/reason]))

(clojure.spec.alpha/def :portkey.aws.ecs/container-instance-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-instance-field))

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

(clojure.spec.alpha/def :portkey.aws.ecs/settings (clojure.spec.alpha/coll-of :portkey.aws.ecs/setting))

(clojure.spec.alpha/def :portkey.aws.ecs.submit-task-state-change-response/acknowledgment (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/submit-task-state-change-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.submit-task-state-change-response/acknowledgment]))

(clojure.spec.alpha/def :portkey.aws.ecs/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-container-instances-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/device-cgroup-permissions (clojure.spec.alpha/coll-of :portkey.aws.ecs/device-cgroup-permission))

(clojure.spec.alpha/def :portkey.aws.ecs/stability-status #{"STABILIZING" :steady-state "STEADY_STATE" :stabilizing})

(clojure.spec.alpha/def :portkey.aws.ecs/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-device-type #{:gpu "GPU"})

(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-task-definition-request/include (clojure.spec.alpha/and :portkey.aws.ecs/task-definition-field-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-task-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-task-definition-request/task-definition] :opt-un [:portkey.aws.ecs.describe-task-definition-request/include]))

(clojure.spec.alpha/def :portkey.aws.ecs/volume-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/volume))

(clojure.spec.alpha/def :portkey.aws.ecs.system-control/namespace (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.system-control/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/system-control (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.system-control/namespace :portkey.aws.ecs.system-control/value]))

(clojure.spec.alpha/def :portkey.aws.ecs/platform-task-definition-incompatibility-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.delete-account-setting-request/name (clojure.spec.alpha/and :portkey.aws.ecs/setting-name))
(clojure.spec.alpha/def :portkey.aws.ecs.delete-account-setting-request/principal-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/delete-account-setting-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.delete-account-setting-request/name] :opt-un [:portkey.aws.ecs.delete-account-setting-request/principal-arn]))

(clojure.spec.alpha/def :portkey.aws.ecs/log-configuration-options-map (clojure.spec.alpha/map-of :portkey.aws.ecs/string :portkey.aws.ecs/string))

(clojure.spec.alpha/def :portkey.aws.ecs/clusters (clojure.spec.alpha/coll-of :portkey.aws.ecs/cluster))

(clojure.spec.alpha/def :portkey.aws.ecs.create-cluster-request/cluster-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-cluster-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs/create-cluster-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.create-cluster-request/cluster-name :portkey.aws.ecs.create-cluster-request/tags]))

(clojure.spec.alpha/def :portkey.aws.ecs/volume-from-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/volume-from))

(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/attachment-id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/private-ipv-4-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.network-interface/ipv-6-address (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.network-interface/attachment-id :portkey.aws.ecs.network-interface/private-ipv-4-address :portkey.aws.ecs.network-interface/ipv-6-address]))

(clojure.spec.alpha/def :portkey.aws.ecs/resource-type #{:gpu "GPU"})

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
(clojure.spec.alpha/def :portkey.aws.ecs.container-instance/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
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
(clojure.spec.alpha/def :portkey.aws.ecs/container-instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.container-instance/version-info :portkey.aws.ecs.container-instance/ec-2-instance-id :portkey.aws.ecs.container-instance/agent-update-status :portkey.aws.ecs.container-instance/registered-at :portkey.aws.ecs.container-instance/tags :portkey.aws.ecs.container-instance/agent-connected :portkey.aws.ecs.container-instance/remaining-resources :portkey.aws.ecs.container-instance/status :portkey.aws.ecs.container-instance/running-tasks-count :portkey.aws.ecs.container-instance/attributes :portkey.aws.ecs.container-instance/container-instance-arn :portkey.aws.ecs.container-instance/version :portkey.aws.ecs.container-instance/registered-resources :portkey.aws.ecs.container-instance/pending-tasks-count :portkey.aws.ecs.container-instance/attachments]))

(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-response/settings (clojure.spec.alpha/and :portkey.aws.ecs/settings))
(clojure.spec.alpha/def :portkey.aws.ecs.list-account-settings-response/next-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/list-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.list-account-settings-response/settings :portkey.aws.ecs.list-account-settings-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/role (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/deployment-configuration (clojure.spec.alpha/and :portkey.aws.ecs/deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/client-token (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/propagate-tags (clojure.spec.alpha/and :portkey.aws.ecs/propagate-tags))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/health-check-grace-period-seconds (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/deployment-controller (clojure.spec.alpha/and :portkey.aws.ecs/deployment-controller))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/placement-strategy (clojure.spec.alpha/and :portkey.aws.ecs/placement-strategies))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/service-name (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/scheduling-strategy (clojure.spec.alpha/and :portkey.aws.ecs/scheduling-strategy))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/service-registries (clojure.spec.alpha/and :portkey.aws.ecs/service-registries))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/platform-version (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/placement-constraints (clojure.spec.alpha/and :portkey.aws.ecs/placement-constraints))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/load-balancers (clojure.spec.alpha/and :portkey.aws.ecs/load-balancers))
(clojure.spec.alpha/def :portkey.aws.ecs.create-service-request/enable-ecs-managed-tags (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/create-service-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.create-service-request/service-name :portkey.aws.ecs.create-service-request/task-definition] :opt-un [:portkey.aws.ecs.create-service-request/role :portkey.aws.ecs.create-service-request/deployment-configuration :portkey.aws.ecs.create-service-request/client-token :portkey.aws.ecs.create-service-request/cluster :portkey.aws.ecs.create-service-request/propagate-tags :portkey.aws.ecs.create-service-request/launch-type :portkey.aws.ecs.create-service-request/tags :portkey.aws.ecs.create-service-request/desired-count :portkey.aws.ecs.create-service-request/health-check-grace-period-seconds :portkey.aws.ecs.create-service-request/deployment-controller :portkey.aws.ecs.create-service-request/placement-strategy :portkey.aws.ecs.create-service-request/scheduling-strategy :portkey.aws.ecs.create-service-request/network-configuration :portkey.aws.ecs.create-service-request/service-registries :portkey.aws.ecs.create-service-request/platform-version :portkey.aws.ecs.create-service-request/placement-constraints :portkey.aws.ecs.create-service-request/load-balancers :portkey.aws.ecs.create-service-request/enable-ecs-managed-tags]))

(clojure.spec.alpha/def :portkey.aws.ecs/connectivity #{:disconnected :connected "CONNECTED" "DISCONNECTED"})

(clojure.spec.alpha/def :portkey.aws.ecs.update-service-response/service (clojure.spec.alpha/and :portkey.aws.ecs/service))
(clojure.spec.alpha/def :portkey.aws.ecs/update-service-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.update-service-response/service]))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-tasks-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.discover-poll-endpoint-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs/discover-poll-endpoint-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.discover-poll-endpoint-request/container-instance :portkey.aws.ecs.discover-poll-endpoint-request/cluster]))

(clojure.spec.alpha/def :portkey.aws.ecs/task-definition-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/task-definition-field))

(clojure.spec.alpha/def :portkey.aws.ecs/requires-attributes (clojure.spec.alpha/coll-of :portkey.aws.ecs/attribute))

(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/capabilities (clojure.spec.alpha/and :portkey.aws.ecs/kernel-capabilities))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/devices (clojure.spec.alpha/and :portkey.aws.ecs/devices-list))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/init-process-enabled (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/shared-memory-size (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.linux-parameters/tmpfs (clojure.spec.alpha/and :portkey.aws.ecs/tmpfs-list))
(clojure.spec.alpha/def :portkey.aws.ecs/linux-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.linux-parameters/capabilities :portkey.aws.ecs.linux-parameters/devices :portkey.aws.ecs.linux-parameters/init-process-enabled :portkey.aws.ecs.linux-parameters/shared-memory-size :portkey.aws.ecs.linux-parameters/tmpfs]))

(clojure.spec.alpha/def :portkey.aws.ecs.platform-device/id (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.platform-device/type (clojure.spec.alpha/and :portkey.aws.ecs/platform-device-type))
(clojure.spec.alpha/def :portkey.aws.ecs/platform-device (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.platform-device/id :portkey.aws.ecs.platform-device/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/attachment-details (clojure.spec.alpha/coll-of :portkey.aws.ecs/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.ecs/container-overrides (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-override))

(clojure.spec.alpha/def :portkey.aws.ecs/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-field #{:tags :statistics "STATISTICS" "TAGS"})

(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/overrides (clojure.spec.alpha/and :portkey.aws.ecs/task-override))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/propagate-tags (clojure.spec.alpha/and :portkey.aws.ecs/propagate-tags))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/network-configuration (clojure.spec.alpha/and :portkey.aws.ecs/network-configuration))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/container-instances (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.start-task-request/enable-ecs-managed-tags (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/start-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.start-task-request/task-definition :portkey.aws.ecs.start-task-request/container-instances] :opt-un [:portkey.aws.ecs.start-task-request/overrides :portkey.aws.ecs.start-task-request/cluster :portkey.aws.ecs.start-task-request/propagate-tags :portkey.aws.ecs.start-task-request/group :portkey.aws.ecs.start-task-request/started-by :portkey.aws.ecs.start-task-request/tags :portkey.aws.ecs.start-task-request/network-configuration :portkey.aws.ecs.start-task-request/enable-ecs-managed-tags]))

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

(clojure.spec.alpha/def :portkey.aws.ecs/service-field-list (clojure.spec.alpha/coll-of :portkey.aws.ecs/service-field))

(clojure.spec.alpha/def :portkey.aws.ecs.tag/key (clojure.spec.alpha/and :portkey.aws.ecs/tag-key))
(clojure.spec.alpha/def :portkey.aws.ecs.tag/value (clojure.spec.alpha/and :portkey.aws.ecs/tag-value))
(clojure.spec.alpha/def :portkey.aws.ecs/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.tag/key :portkey.aws.ecs.tag/value]))

(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-response/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/task-definition))
(clojure.spec.alpha/def :portkey.aws.ecs.register-task-definition-response/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs/register-task-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.register-task-definition-response/task-definition :portkey.aws.ecs.register-task-definition-response/tags]))

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

(clojure.spec.alpha/def :portkey.aws.ecs/ipc-mode #{"none" :task "host" :host "task" :none})

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
(clojure.spec.alpha/def :portkey.aws.ecs.service/propagate-tags (clojure.spec.alpha/and :portkey.aws.ecs/propagate-tags))
(clojure.spec.alpha/def :portkey.aws.ecs.service/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.service/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.service/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
(clojure.spec.alpha/def :portkey.aws.ecs.service/role-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/desired-count (clojure.spec.alpha/and :portkey.aws.ecs/integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/task-definition (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/health-check-grace-period-seconds (clojure.spec.alpha/and :portkey.aws.ecs/boxed-integer))
(clojure.spec.alpha/def :portkey.aws.ecs.service/created-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.service/deployment-controller (clojure.spec.alpha/and :portkey.aws.ecs/deployment-controller))
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
(clojure.spec.alpha/def :portkey.aws.ecs.service/enable-ecs-managed-tags (clojure.spec.alpha/and :portkey.aws.ecs/boolean))
(clojure.spec.alpha/def :portkey.aws.ecs.service/task-sets (clojure.spec.alpha/and :portkey.aws.ecs/task-sets))
(clojure.spec.alpha/def :portkey.aws.ecs/service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.service/deployment-configuration :portkey.aws.ecs.service/propagate-tags :portkey.aws.ecs.service/created-at :portkey.aws.ecs.service/cluster-arn :portkey.aws.ecs.service/launch-type :portkey.aws.ecs.service/tags :portkey.aws.ecs.service/role-arn :portkey.aws.ecs.service/desired-count :portkey.aws.ecs.service/task-definition :portkey.aws.ecs.service/health-check-grace-period-seconds :portkey.aws.ecs.service/created-by :portkey.aws.ecs.service/deployment-controller :portkey.aws.ecs.service/placement-strategy :portkey.aws.ecs.service/status :portkey.aws.ecs.service/service-name :portkey.aws.ecs.service/service-arn :portkey.aws.ecs.service/running-count :portkey.aws.ecs.service/scheduling-strategy :portkey.aws.ecs.service/events :portkey.aws.ecs.service/network-configuration :portkey.aws.ecs.service/service-registries :portkey.aws.ecs.service/platform-version :portkey.aws.ecs.service/placement-constraints :portkey.aws.ecs.service/pending-count :portkey.aws.ecs.service/deployments :portkey.aws.ecs.service/load-balancers :portkey.aws.ecs.service/enable-ecs-managed-tags :portkey.aws.ecs.service/task-sets]))

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

(clojure.spec.alpha/def :portkey.aws.ecs/resource-requirements (clojure.spec.alpha/coll-of :portkey.aws.ecs/resource-requirement))

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

(clojure.spec.alpha/def :portkey.aws.ecs/container-instance-field #{:tags "TAGS"})

(clojure.spec.alpha/def :portkey.aws.ecs/placement-strategy-type #{"random" :spread "binpack" :random :binpack "spread"})

(clojure.spec.alpha/def :portkey.aws.ecs/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.task/desired-status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/stop-code (clojure.spec.alpha/and :portkey.aws.ecs/task-stop-code))
(clojure.spec.alpha/def :portkey.aws.ecs.task/overrides (clojure.spec.alpha/and :portkey.aws.ecs/task-override))
(clojure.spec.alpha/def :portkey.aws.ecs.task/last-status (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/created-at (clojure.spec.alpha/and :portkey.aws.ecs/timestamp))
(clojure.spec.alpha/def :portkey.aws.ecs.task/group (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/started-by (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/cluster-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/launch-type (clojure.spec.alpha/and :portkey.aws.ecs/launch-type))
(clojure.spec.alpha/def :portkey.aws.ecs.task/task-definition-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/cpu (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.task/tags (clojure.spec.alpha/and :portkey.aws.ecs/tags))
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
(clojure.spec.alpha/def :portkey.aws.ecs/task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.task/desired-status :portkey.aws.ecs.task/stop-code :portkey.aws.ecs.task/overrides :portkey.aws.ecs.task/last-status :portkey.aws.ecs.task/created-at :portkey.aws.ecs.task/group :portkey.aws.ecs.task/started-by :portkey.aws.ecs.task/cluster-arn :portkey.aws.ecs.task/launch-type :portkey.aws.ecs.task/task-definition-arn :portkey.aws.ecs.task/cpu :portkey.aws.ecs.task/tags :portkey.aws.ecs.task/started-at :portkey.aws.ecs.task/health-status :portkey.aws.ecs.task/connectivity-at :portkey.aws.ecs.task/connectivity :portkey.aws.ecs.task/stopping-at :portkey.aws.ecs.task/stopped-at :portkey.aws.ecs.task/task-arn :portkey.aws.ecs.task/memory :portkey.aws.ecs.task/container-instance-arn :portkey.aws.ecs.task/version :portkey.aws.ecs.task/stopped-reason :portkey.aws.ecs.task/pull-stopped-at :portkey.aws.ecs.task/pull-started-at :portkey.aws.ecs.task/platform-version :portkey.aws.ecs.task/execution-stopped-at :portkey.aws.ecs.task/containers :portkey.aws.ecs.task/attachments]))

(clojure.spec.alpha/def :portkey.aws.ecs/scope #{:task "shared" "task" :shared})

(clojure.spec.alpha/def :portkey.aws.ecs/service-registries (clojure.spec.alpha/coll-of :portkey.aws.ecs/service-registry))

(clojure.spec.alpha/def :portkey.aws.ecs.put-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.ecs/attributes))
(clojure.spec.alpha/def :portkey.aws.ecs/put-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.put-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.ecs/container-definitions (clojure.spec.alpha/coll-of :portkey.aws.ecs/container-definition))

(clojure.spec.alpha/def :portkey.aws.ecs/cluster-contains-services-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/deployment-controller-type #{:code-deploy "CODE_DEPLOY" :ecs "ECS"})

(clojure.spec.alpha/def :portkey.aws.ecs/update-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.ecs/tag-keys))
(clojure.spec.alpha/def :portkey.aws.ecs/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.untag-resource-request/resource-arn :portkey.aws.ecs.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs/propagate-tags #{:service "SERVICE" "TASK_DEFINITION" :task-definition})

(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/container-instance (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.deregister-container-instance-request/force (clojure.spec.alpha/and :portkey.aws.ecs/boxed-boolean))
(clojure.spec.alpha/def :portkey.aws.ecs/deregister-container-instance-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.deregister-container-instance-request/container-instance] :opt-un [:portkey.aws.ecs.deregister-container-instance-request/cluster :portkey.aws.ecs.deregister-container-instance-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecs/device-cgroup-permission #{:read "read" :write :mknod "mknod" "write"})

(clojure.spec.alpha/def :portkey.aws.ecs.resource-requirement/value (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.resource-requirement/type (clojure.spec.alpha/and :portkey.aws.ecs/resource-type))
(clojure.spec.alpha/def :portkey.aws.ecs/resource-requirement (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.resource-requirement/value :portkey.aws.ecs.resource-requirement/type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecs.put-account-setting-default-response/setting (clojure.spec.alpha/and :portkey.aws.ecs/setting))
(clojure.spec.alpha/def :portkey.aws.ecs/put-account-setting-default-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecs.put-account-setting-default-response/setting]))

(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-request/cluster (clojure.spec.alpha/and :portkey.aws.ecs/string))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-request/tasks (clojure.spec.alpha/and :portkey.aws.ecs/string-list))
(clojure.spec.alpha/def :portkey.aws.ecs.describe-tasks-request/include (clojure.spec.alpha/and :portkey.aws.ecs/task-field-list))
(clojure.spec.alpha/def :portkey.aws.ecs/describe-tasks-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecs.describe-tasks-request/tasks] :opt-un [:portkey.aws.ecs.describe-tasks-request/cluster :portkey.aws.ecs.describe-tasks-request/include]))

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

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ResourceNotFoundException" :portkey.aws.ecs/resource-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecs/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/tag-resource-response))

(clojure.core/defn delete-service ([delete-service-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-service-request delete-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteService", :http.request.configuration/output-deser-fn response-delete-service-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-service-response))

(clojure.core/defn create-cluster ([] (create-cluster {})) ([create-cluster-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-cluster-request create-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/create-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/create-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCluster", :http.request.configuration/output-deser-fn response-create-cluster-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-cluster :args (clojure.spec.alpha/? :portkey.aws.ecs/create-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/create-cluster-response))

(clojure.core/defn delete-account-setting ([delete-account-setting-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-account-setting-request delete-account-setting-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-account-setting-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-account-setting-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAccountSetting", :http.request.configuration/output-deser-fn response-delete-account-setting-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-account-setting :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-account-setting-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-account-setting-response))

(clojure.core/defn submit-container-state-change ([] (submit-container-state-change {})) ([submit-container-state-change-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-submit-container-state-change-request submit-container-state-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/submit-container-state-change-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/submit-container-state-change-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SubmitContainerStateChange", :http.request.configuration/output-deser-fn response-submit-container-state-change-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef submit-container-state-change :args (clojure.spec.alpha/? :portkey.aws.ecs/submit-container-state-change-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/submit-container-state-change-response))

(clojure.core/defn list-tasks ([] (list-tasks {})) ([list-tasks-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tasks-request list-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTasks", :http.request.configuration/output-deser-fn response-list-tasks-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception}})))))
(clojure.spec.alpha/fdef list-tasks :args (clojure.spec.alpha/? :portkey.aws.ecs/list-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-tasks-response))

(clojure.core/defn update-container-instances-state ([update-container-instances-state-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-container-instances-state-request update-container-instances-state-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-container-instances-state-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-container-instances-state-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateContainerInstancesState", :http.request.configuration/output-deser-fn response-update-container-instances-state-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef update-container-instances-state :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-container-instances-state-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-container-instances-state-response))

(clojure.core/defn list-attributes ([list-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-attributes-request list-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAttributes", :http.request.configuration/output-deser-fn response-list-attributes-response, :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/list-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-attributes-response))

(clojure.core/defn stop-task ([stop-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-task-request stop-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/stop-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/stop-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTask", :http.request.configuration/output-deser-fn response-stop-task-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef stop-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/stop-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/stop-task-response))

(clojure.core/defn register-task-definition ([register-task-definition-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-task-definition-request register-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/register-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/register-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterTaskDefinition", :http.request.configuration/output-deser-fn response-register-task-definition-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef register-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/register-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/register-task-definition-response))

(clojure.core/defn run-task ([run-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-run-task-request run-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/run-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/run-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RunTask", :http.request.configuration/output-deser-fn response-run-task-response, :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClientException" :portkey.aws.ecs/client-exception, "BlockedException" :portkey.aws.ecs/blocked-exception, "UnsupportedFeatureException" :portkey.aws.ecs/unsupported-feature-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "ServerException" :portkey.aws.ecs/server-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef run-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/run-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/run-task-response))

(clojure.core/defn list-account-settings ([] (list-account-settings {})) ([list-account-settings-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-account-settings-request list-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-account-settings-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAccountSettings", :http.request.configuration/output-deser-fn response-list-account-settings-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-account-settings :args (clojure.spec.alpha/? :portkey.aws.ecs/list-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-account-settings-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecs/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-tags-for-resource-response))

(clojure.core/defn discover-poll-endpoint ([] (discover-poll-endpoint {})) ([discover-poll-endpoint-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-discover-poll-endpoint-request discover-poll-endpoint-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/discover-poll-endpoint-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/discover-poll-endpoint-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DiscoverPollEndpoint", :http.request.configuration/output-deser-fn response-discover-poll-endpoint-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception}})))))
(clojure.spec.alpha/fdef discover-poll-endpoint :args (clojure.spec.alpha/? :portkey.aws.ecs/discover-poll-endpoint-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/discover-poll-endpoint-response))

(clojure.core/defn describe-clusters ([] (describe-clusters {})) ([describe-clusters-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-clusters-request describe-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeClusters", :http.request.configuration/output-deser-fn response-describe-clusters-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef describe-clusters :args (clojure.spec.alpha/? :portkey.aws.ecs/describe-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-clusters-response))

(clojure.core/defn list-task-definition-families ([] (list-task-definition-families {})) ([list-task-definition-families-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-task-definition-families-request list-task-definition-families-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-task-definition-families-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-task-definition-families-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTaskDefinitionFamilies", :http.request.configuration/output-deser-fn response-list-task-definition-families-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-task-definition-families :args (clojure.spec.alpha/? :portkey.aws.ecs/list-task-definition-families-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-task-definition-families-response))

(clojure.core/defn submit-task-state-change ([] (submit-task-state-change {})) ([submit-task-state-change-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-submit-task-state-change-request submit-task-state-change-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/submit-task-state-change-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/submit-task-state-change-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SubmitTaskStateChange", :http.request.configuration/output-deser-fn response-submit-task-state-change-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef submit-task-state-change :args (clojure.spec.alpha/? :portkey.aws.ecs/submit-task-state-change-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/submit-task-state-change-response))

(clojure.core/defn delete-attributes ([delete-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-attributes-request delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAttributes", :http.request.configuration/output-deser-fn response-delete-attributes-response, :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "TargetNotFoundException" :portkey.aws.ecs/target-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-attributes-response))

(clojure.core/defn list-task-definitions ([] (list-task-definitions {})) ([list-task-definitions-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-task-definitions-request list-task-definitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-task-definitions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-task-definitions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTaskDefinitions", :http.request.configuration/output-deser-fn response-list-task-definitions-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-task-definitions :args (clojure.spec.alpha/? :portkey.aws.ecs/list-task-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-task-definitions-response))

(clojure.core/defn list-clusters ([] (list-clusters {})) ([list-clusters-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-clusters-request list-clusters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-clusters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-clusters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListClusters", :http.request.configuration/output-deser-fn response-list-clusters-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef list-clusters :args (clojure.spec.alpha/? :portkey.aws.ecs/list-clusters-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-clusters-response))

(clojure.core/defn put-attributes ([put-attributes-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-attributes-request put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/put-attributes-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/put-attributes-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAttributes", :http.request.configuration/output-deser-fn response-put-attributes-response, :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "TargetNotFoundException" :portkey.aws.ecs/target-not-found-exception, "AttributeLimitExceededException" :portkey.aws.ecs/attribute-limit-exceeded-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.ecs/put-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/put-attributes-response))

(clojure.core/defn describe-tasks ([describe-tasks-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tasks-request describe-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTasks", :http.request.configuration/output-deser-fn response-describe-tasks-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-tasks :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-tasks-response))

(clojure.core/defn describe-services ([describe-services-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-services-request describe-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeServices", :http.request.configuration/output-deser-fn response-describe-services-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-services :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-services-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-services-response))

(clojure.core/defn register-container-instance ([] (register-container-instance {})) ([register-container-instance-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-register-container-instance-request register-container-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/register-container-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/register-container-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterContainerInstance", :http.request.configuration/output-deser-fn response-register-container-instance-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef register-container-instance :args (clojure.spec.alpha/? :portkey.aws.ecs/register-container-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/register-container-instance-response))

(clojure.core/defn deregister-container-instance ([deregister-container-instance-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-deregister-container-instance-request deregister-container-instance-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/deregister-container-instance-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/deregister-container-instance-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterContainerInstance", :http.request.configuration/output-deser-fn response-deregister-container-instance-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-container-instance :args (clojure.spec.alpha/tuple :portkey.aws.ecs/deregister-container-instance-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/deregister-container-instance-response))

(clojure.core/defn create-service ([create-service-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-service-request create-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/create-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/create-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateService", :http.request.configuration/output-deser-fn response-create-service-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "UnsupportedFeatureException" :portkey.aws.ecs/unsupported-feature-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception}})))))
(clojure.spec.alpha/fdef create-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/create-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/create-service-response))

(clojure.core/defn list-container-instances ([] (list-container-instances {})) ([list-container-instances-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-container-instances-request list-container-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-container-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-container-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListContainerInstances", :http.request.configuration/output-deser-fn response-list-container-instances-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef list-container-instances :args (clojure.spec.alpha/? :portkey.aws.ecs/list-container-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-container-instances-response))

(clojure.core/defn delete-cluster ([delete-cluster-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-cluster-request delete-cluster-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/delete-cluster-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/delete-cluster-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCluster", :http.request.configuration/output-deser-fn response-delete-cluster-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClusterContainsContainerInstancesException" :portkey.aws.ecs/cluster-contains-container-instances-exception, "ClusterContainsServicesException" :portkey.aws.ecs/cluster-contains-services-exception, "ClusterContainsTasksException" :portkey.aws.ecs/cluster-contains-tasks-exception}})))))
(clojure.spec.alpha/fdef delete-cluster :args (clojure.spec.alpha/tuple :portkey.aws.ecs/delete-cluster-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/delete-cluster-response))

(clojure.core/defn describe-container-instances ([describe-container-instances-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-container-instances-request describe-container-instances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-container-instances-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-container-instances-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeContainerInstances", :http.request.configuration/output-deser-fn response-describe-container-instances-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-container-instances :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-container-instances-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-container-instances-response))

(clojure.core/defn deregister-task-definition ([deregister-task-definition-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-deregister-task-definition-request deregister-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/deregister-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/deregister-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterTaskDefinition", :http.request.configuration/output-deser-fn response-deregister-task-definition-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef deregister-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/deregister-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/deregister-task-definition-response))

(clojure.core/defn list-services ([] (list-services {})) ([list-services-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-services-request list-services-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/list-services-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/list-services-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListServices", :http.request.configuration/output-deser-fn response-list-services-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef list-services :args (clojure.spec.alpha/? :portkey.aws.ecs/list-services-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/list-services-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ResourceNotFoundException" :portkey.aws.ecs/resource-not-found-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecs/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/untag-resource-response))

(clojure.core/defn put-account-setting-default ([put-account-setting-default-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-account-setting-default-request put-account-setting-default-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/put-account-setting-default-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/put-account-setting-default-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAccountSettingDefault", :http.request.configuration/output-deser-fn response-put-account-setting-default-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef put-account-setting-default :args (clojure.spec.alpha/tuple :portkey.aws.ecs/put-account-setting-default-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/put-account-setting-default-response))

(clojure.core/defn put-account-setting ([put-account-setting-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-account-setting-request put-account-setting-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/put-account-setting-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/put-account-setting-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAccountSetting", :http.request.configuration/output-deser-fn response-put-account-setting-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef put-account-setting :args (clojure.spec.alpha/tuple :portkey.aws.ecs/put-account-setting-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/put-account-setting-response))

(clojure.core/defn update-container-agent ([update-container-agent-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-container-agent-request update-container-agent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-container-agent-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-container-agent-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateContainerAgent", :http.request.configuration/output-deser-fn response-update-container-agent-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "UpdateInProgressException" :portkey.aws.ecs/update-in-progress-exception, "NoUpdateAvailableException" :portkey.aws.ecs/no-update-available-exception, "MissingVersionException" :portkey.aws.ecs/missing-version-exception}})))))
(clojure.spec.alpha/fdef update-container-agent :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-container-agent-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-container-agent-response))

(clojure.core/defn describe-task-definition ([describe-task-definition-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-task-definition-request describe-task-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/describe-task-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/describe-task-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTaskDefinition", :http.request.configuration/output-deser-fn response-describe-task-definition-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef describe-task-definition :args (clojure.spec.alpha/tuple :portkey.aws.ecs/describe-task-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/describe-task-definition-response))

(clojure.core/defn update-service ([update-service-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-service-request update-service-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/update-service-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/update-service-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateService", :http.request.configuration/output-deser-fn response-update-service-response, :http.request.spec/error-spec {"ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception, "ClientException" :portkey.aws.ecs/client-exception, "ServiceNotActiveException" :portkey.aws.ecs/service-not-active-exception, "ServiceNotFoundException" :portkey.aws.ecs/service-not-found-exception, "PlatformUnknownException" :portkey.aws.ecs/platform-unknown-exception, "AccessDeniedException" :portkey.aws.ecs/access-denied-exception, "PlatformTaskDefinitionIncompatibilityException" :portkey.aws.ecs/platform-task-definition-incompatibility-exception, "ServerException" :portkey.aws.ecs/server-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-service :args (clojure.spec.alpha/tuple :portkey.aws.ecs/update-service-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/update-service-response))

(clojure.core/defn start-task ([start-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-task-request start-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.ecs/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerServiceV20141113", :http.request.spec/output-spec :portkey.aws.ecs/start-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-11-13", :http.request.configuration/service-id "ECS", :http.request.spec/input-spec :portkey.aws.ecs/start-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartTask", :http.request.configuration/output-deser-fn response-start-task-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecs/server-exception, "ClientException" :portkey.aws.ecs/client-exception, "InvalidParameterException" :portkey.aws.ecs/invalid-parameter-exception, "ClusterNotFoundException" :portkey.aws.ecs/cluster-not-found-exception}})))))
(clojure.spec.alpha/fdef start-task :args (clojure.spec.alpha/tuple :portkey.aws.ecs/start-task-request) :ret (clojure.spec.alpha/and :portkey.aws.ecs/start-task-response))
