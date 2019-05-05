(ns portkey.aws.robomaker (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "robomaker", :region "eu-west-1"},
    :ssl-common-name "robomaker.eu-west-1.amazonaws.com",
    :endpoint "https://robomaker.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "robomaker", :region "us-west-2"},
    :ssl-common-name "robomaker.us-west-2.amazonaws.com",
    :endpoint "https://robomaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "robomaker", :region "us-east-1"},
    :ssl-common-name "robomaker.us-east-1.amazonaws.com",
    :endpoint "https://robomaker.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-simulation-application-config)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-simulation-application-configs)

(clojure.core/declare ser-simulation-software-suite)

(clojure.core/declare ser-robot-software-suite)

(clojure.core/declare ser-source-config)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-job-duration)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-version-qualifier)

(clojure.core/declare ser-deployment-launch-config)

(clojure.core/declare ser-deployment-application-config)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-deployment-config)

(clojure.core/declare ser-iam-role)

(clojure.core/declare ser-robot-software-suite-type)

(clojure.core/declare ser-arns)

(clojure.core/declare ser-filter-values)

(clojure.core/declare ser-environment-variable-map)

(clojure.core/declare ser-failure-behavior)

(clojure.core/declare ser-robot-application-config)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-launch-config)

(clojure.core/declare ser-robot-application-configs)

(clojure.core/declare ser-environment-variable-value)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-deployment-version)

(clojure.core/declare ser-robot-software-suite-version-type)

(clojure.core/declare ser-tag-map)

(clojure.core/declare ser-percentage)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-revision-id)

(clojure.core/declare ser-architecture)

(clojure.core/declare ser-simulation-software-suite-type)

(clojure.core/declare ser-rendering-engine)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-rendering-engine-version-type)

(clojure.core/declare ser-version)

(clojure.core/declare ser-simulation-software-suite-version-type)

(clojure.core/declare ser-name)

(clojure.core/declare ser-deployment-application-configs)

(clojure.core/declare ser-environment-variable-key)

(clojure.core/declare ser-rendering-engine-type)

(clojure.core/declare ser-source-configs)

(clojure.core/declare ser-output-location)

(clojure.core/declare ser-id)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-simulation-application-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:application input)) #:http.request.field{:name "application", :shape "Arn"}) (clojure.core/into (ser-launch-config (:launch-config input)) #:http.request.field{:name "launchConfig", :shape "LaunchConfig"})], :shape "SimulationApplicationConfig", :type "structure"} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-values (input :values)) #:http.request.field{:name "values", :shape "FilterValues"}))))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-subnets (:subnets input)) #:http.request.field{:name "subnets", :shape "Subnets"})], :shape "VPCConfig", :type "structure"} (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "securityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :assign-public-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :assign-public-ip)) #:http.request.field{:name "assignPublicIp", :shape "Boolean"}))))

(clojure.core/defn- ser-simulation-application-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-simulation-application-config coll) #:http.request.field{:shape "SimulationApplicationConfig"}))) input), :shape "SimulationApplicationConfigs", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-simulation-software-suite [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SimulationSoftwareSuite", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-simulation-software-suite-type (input :name)) #:http.request.field{:name "name", :shape "SimulationSoftwareSuiteType"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-simulation-software-suite-version-type (input :version)) #:http.request.field{:name "version", :shape "SimulationSoftwareSuiteVersionType"}))))

(clojure.core/defn- ser-robot-software-suite [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RobotSoftwareSuite", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-robot-software-suite-type (input :name)) #:http.request.field{:name "name", :shape "RobotSoftwareSuiteType"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-robot-software-suite-version-type (input :version)) #:http.request.field{:name "version", :shape "RobotSoftwareSuiteVersionType"}))))

(clojure.core/defn- ser-source-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SourceConfig", :type "structure"} (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "s3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "s3Key", :shape "S3Key"})) (clojure.core/contains? input :architecture) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-architecture (input :architecture)) #:http.request.field{:name "architecture", :shape "Architecture"}))))

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "Subnets", :type "list", :max 16, :min 1})

(clojure.core/defn- ser-job-duration [input] #:http.request.field{:value input, :shape "JobDuration"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "SecurityGroups", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-version-qualifier [input] #:http.request.field{:value input, :shape "VersionQualifier"})

(clojure.core/defn- ser-deployment-launch-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-generic-string (:package-name input)) #:http.request.field{:name "packageName", :shape "GenericString"}) (clojure.core/into (ser-generic-string (:launch-file input)) #:http.request.field{:name "launchFile", :shape "GenericString"})], :shape "DeploymentLaunchConfig", :type "structure"} (clojure.core/contains? input :pre-launch-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :pre-launch-file)) #:http.request.field{:name "preLaunchFile", :shape "GenericString"})) (clojure.core/contains? input :post-launch-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :post-launch-file)) #:http.request.field{:name "postLaunchFile", :shape "GenericString"})) (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variable-map (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariableMap"}))))

(clojure.core/defn- ser-deployment-application-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:application input)) #:http.request.field{:name "application", :shape "Arn"}) (clojure.core/into (ser-deployment-version (:application-version input)) #:http.request.field{:name "applicationVersion", :shape "DeploymentVersion"}) (clojure.core/into (ser-deployment-launch-config (:launch-config input)) #:http.request.field{:name "launchConfig", :shape "DeploymentLaunchConfig"})], :shape "DeploymentApplicationConfig", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-deployment-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentConfig", :type "structure"} (clojure.core/contains? input :concurrent-deployment-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :concurrent-deployment-percentage)) #:http.request.field{:name "concurrentDeploymentPercentage", :shape "Percentage"})) (clojure.core/contains? input :failure-threshold-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :failure-threshold-percentage)) #:http.request.field{:name "failureThresholdPercentage", :shape "Percentage"}))))

(clojure.core/defn- ser-iam-role [input] #:http.request.field{:value input, :shape "IamRole"})

(clojure.core/defn- ser-robot-software-suite-type [input] #:http.request.field{:value (clojure.core/get {"ROS" "ROS", :ros "ROS"} input), :shape "RobotSoftwareSuiteType"})

(clojure.core/defn- ser-arns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-arn coll) #:http.request.field{:shape "Arn"}))) input), :shape "Arns", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-filter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-name coll) #:http.request.field{:shape "Name"}))) input), :shape "FilterValues", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-environment-variable-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-variable-key k) #:http.request.field{:map-info "key", :shape "EnvironmentVariableKey"}) (clojure.core/into (ser-environment-variable-value v) #:http.request.field{:map-info "value", :shape "EnvironmentVariableValue"})])) input), :shape "EnvironmentVariableMap", :type "map", :max 16, :min 0})

(clojure.core/defn- ser-failure-behavior [input] #:http.request.field{:value (clojure.core/get {"Fail" "Fail", :fail "Fail", "Continue" "Continue", :continue "Continue"} input), :shape "FailureBehavior"})

(clojure.core/defn- ser-robot-application-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:application input)) #:http.request.field{:name "application", :shape "Arn"}) (clojure.core/into (ser-launch-config (:launch-config input)) #:http.request.field{:name "launchConfig", :shape "LaunchConfig"})], :shape "RobotApplicationConfig", :type "structure"} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-launch-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-generic-string (:package-name input)) #:http.request.field{:name "packageName", :shape "GenericString"}) (clojure.core/into (ser-generic-string (:launch-file input)) #:http.request.field{:name "launchFile", :shape "GenericString"})], :shape "LaunchConfig", :type "structure"} (clojure.core/contains? input :environment-variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variable-map (input :environment-variables)) #:http.request.field{:name "environmentVariables", :shape "EnvironmentVariableMap"}))))

(clojure.core/defn- ser-robot-application-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-robot-application-config coll) #:http.request.field{:shape "RobotApplicationConfig"}))) input), :shape "RobotApplicationConfigs", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-environment-variable-value [input] #:http.request.field{:value input, :shape "EnvironmentVariableValue"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-deployment-version [input] #:http.request.field{:value input, :shape "DeploymentVersion"})

(clojure.core/defn- ser-robot-software-suite-version-type [input] #:http.request.field{:value (clojure.core/get {"Kinetic" "Kinetic", :kinetic "Kinetic"} input), :shape "RobotSoftwareSuiteVersionType"})

(clojure.core/defn- ser-tag-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "TagMap", :type "map", :max 50, :min 0})

(clojure.core/defn- ser-percentage [input] #:http.request.field{:value input, :shape "Percentage"})

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-revision-id [input] #:http.request.field{:value input, :shape "RevisionId"})

(clojure.core/defn- ser-architecture [input] #:http.request.field{:value (clojure.core/get {"X86_64" "X86_64", :x-86-64 "X86_64", "ARM64" "ARM64", :arm-64 "ARM64", "ARMHF" "ARMHF", :armhf "ARMHF"} input), :shape "Architecture"})

(clojure.core/defn- ser-simulation-software-suite-type [input] #:http.request.field{:value (clojure.core/get {"Gazebo" "Gazebo", :gazebo "Gazebo"} input), :shape "SimulationSoftwareSuiteType"})

(clojure.core/defn- ser-rendering-engine [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RenderingEngine", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rendering-engine-type (input :name)) #:http.request.field{:name "name", :shape "RenderingEngineType"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rendering-engine-version-type (input :version)) #:http.request.field{:name "version", :shape "RenderingEngineVersionType"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-rendering-engine-version-type [input] #:http.request.field{:value input, :shape "RenderingEngineVersionType"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-simulation-software-suite-version-type [input] #:http.request.field{:value input, :shape "SimulationSoftwareSuiteVersionType"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-deployment-application-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-deployment-application-config coll) #:http.request.field{:shape "DeploymentApplicationConfig"}))) input), :shape "DeploymentApplicationConfigs", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-environment-variable-key [input] #:http.request.field{:value input, :shape "EnvironmentVariableKey"})

(clojure.core/defn- ser-rendering-engine-type [input] #:http.request.field{:value (clojure.core/get {"OGRE" "OGRE", :ogre "OGRE"} input), :shape "RenderingEngineType"})

(clojure.core/defn- ser-source-configs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-source-config coll) #:http.request.field{:shape "SourceConfig"}))) input), :shape "SourceConfigs", :type "list"})

(clojure.core/defn- ser-output-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OutputLocation", :type "structure"} (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "s3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-prefix)) #:http.request.field{:name "s3Prefix", :shape "S3Key"}))))

(clojure.core/defn- ser-id [input] #:http.request.field{:value input, :shape "Id"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-simulation-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-source-configs (input :sources)) #:http.request.field{:name "sources", :shape "SourceConfigs"}) (clojure.core/into (ser-simulation-software-suite (input :simulation-software-suite)) #:http.request.field{:name "simulationSoftwareSuite", :shape "SimulationSoftwareSuite"}) (clojure.core/into (ser-robot-software-suite (input :robot-software-suite)) #:http.request.field{:name "robotSoftwareSuite", :shape "RobotSoftwareSuite"}) (clojure.core/into (ser-rendering-engine (input :rendering-engine)) #:http.request.field{:name "renderingEngine", :shape "RenderingEngine"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"}))))

(clojure.core/defn- req-update-robot-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"}) (clojure.core/into (ser-source-configs (input :sources)) #:http.request.field{:name "sources", :shape "SourceConfigs"}) (clojure.core/into (ser-robot-software-suite (input :robot-software-suite)) #:http.request.field{:name "robotSoftwareSuite", :shape "RobotSoftwareSuite"})]} (clojure.core/contains? input :current-revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-id (input :current-revision-id)) #:http.request.field{:name "currentRevisionId", :shape "RevisionId"}))))

(clojure.core/defn- req-describe-robot-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- req-sync-deployment-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}) (clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"})]}))

(clojure.core/defn- req-describe-simulation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :job)) #:http.request.field{:name "job", :shape "Arn"})]}))

(clojure.core/defn- req-delete-robot-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- req-list-robots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"}))))

(clojure.core/defn- req-list-robot-applications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :version-qualifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-qualifier (input :version-qualifier)) #:http.request.field{:name "versionQualifier", :shape "VersionQualifier"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"}))))

(clojure.core/defn- req-delete-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn", :location "uri", :location-name "resourceArn"})]}))

(clojure.core/defn- req-create-robot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-architecture (input :architecture)) #:http.request.field{:name "architecture", :shape "Architecture"}) (clojure.core/into (ser-id (input :greengrass-group-id)) #:http.request.field{:name "greengrassGroupId", :shape "Id"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"}))))

(clojure.core/defn- req-delete-robot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :robot)) #:http.request.field{:name "robot", :shape "Arn"})]}))

(clojure.core/defn- req-list-deployment-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-update-simulation-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"}) (clojure.core/into (ser-source-configs (input :sources)) #:http.request.field{:name "sources", :shape "SourceConfigs"}) (clojure.core/into (ser-simulation-software-suite (input :simulation-software-suite)) #:http.request.field{:name "simulationSoftwareSuite", :shape "SimulationSoftwareSuite"}) (clojure.core/into (ser-robot-software-suite (input :robot-software-suite)) #:http.request.field{:name "robotSoftwareSuite", :shape "RobotSoftwareSuite"}) (clojure.core/into (ser-rendering-engine (input :rendering-engine)) #:http.request.field{:name "renderingEngine", :shape "RenderingEngine"})]} (clojure.core/contains? input :current-revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-id (input :current-revision-id)) #:http.request.field{:name "currentRevisionId", :shape "RevisionId"}))))

(clojure.core/defn- req-list-simulation-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"}))))

(clojure.core/defn- req-describe-deployment-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :job)) #:http.request.field{:name "job", :shape "Arn"})]}))

(clojure.core/defn- req-create-simulation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-duration (input :max-job-duration-in-seconds)) #:http.request.field{:name "maxJobDurationInSeconds", :shape "JobDuration"}) (clojure.core/into (ser-iam-role (input :iam-role)) #:http.request.field{:name "iamRole", :shape "IamRole"})]} (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "vpcConfig", :shape "VPCConfig"})) (clojure.core/contains? input :output-location) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-output-location (input :output-location)) #:http.request.field{:name "outputLocation", :shape "OutputLocation"})) (clojure.core/contains? input :failure-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-failure-behavior (input :failure-behavior)) #:http.request.field{:name "failureBehavior", :shape "FailureBehavior"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true})) (clojure.core/contains? input :simulation-applications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-simulation-application-configs (input :simulation-applications)) #:http.request.field{:name "simulationApplications", :shape "SimulationApplicationConfigs"})) (clojure.core/contains? input :robot-applications) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-robot-application-configs (input :robot-applications)) #:http.request.field{:name "robotApplications", :shape "RobotApplicationConfigs"}))))

(clojure.core/defn- req-register-robot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"}) (clojure.core/into (ser-arn (input :robot)) #:http.request.field{:name "robot", :shape "Arn"})]}))

(clojure.core/defn- req-deregister-robot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"}) (clojure.core/into (ser-arn (input :robot)) #:http.request.field{:name "robot", :shape "Arn"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn", :location "uri", :location-name "resourceArn"})], :body [(clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"})]}))

(clojure.core/defn- req-delete-simulation-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- req-create-robot-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"}) (clojure.core/into (ser-source-configs (input :sources)) #:http.request.field{:name "sources", :shape "SourceConfigs"}) (clojure.core/into (ser-robot-software-suite (input :robot-software-suite)) #:http.request.field{:name "robotSoftwareSuite", :shape "RobotSoftwareSuite"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"}))))

(clojure.core/defn- req-create-robot-application-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :current-revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-id (input :current-revision-id)) #:http.request.field{:name "currentRevisionId", :shape "RevisionId"}))))

(clojure.core/defn- req-create-deployment-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true}) (clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"}) (clojure.core/into (ser-deployment-application-configs (input :deployment-application-configs)) #:http.request.field{:name "deploymentApplicationConfigs", :shape "DeploymentApplicationConfigs"})]} (clojure.core/contains? input :deployment-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config (input :deployment-config)) #:http.request.field{:name "deploymentConfig", :shape "DeploymentConfig"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"}))))

(clojure.core/defn- req-cancel-simulation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :job)) #:http.request.field{:name "job", :shape "Arn"})]}))

(clojure.core/defn- req-describe-robot-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :robot)) #:http.request.field{:name "robot", :shape "Arn"})]}))

(clojure.core/defn- req-list-simulation-applications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :version-qualifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-qualifier (input :version-qualifier)) #:http.request.field{:name "versionQualifier", :shape "VersionQualifier"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"}))))

(clojure.core/defn- req-describe-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :fleet)) #:http.request.field{:name "fleet", :shape "Arn"})]}))

(clojure.core/defn- req-describe-simulation-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :application-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :application-version)) #:http.request.field{:name "applicationVersion", :shape "Version"}))))

(clojure.core/defn- req-batch-describe-simulation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arns (input :jobs)) #:http.request.field{:name "jobs", :shape "Arns"})]}))

(clojure.core/defn- req-restart-simulation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :job)) #:http.request.field{:name "job", :shape "Arn"})]}))

(clojure.core/defn- req-list-fleets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "filters", :shape "Filters"}))))

(clojure.core/defn- req-create-fleet-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "tags", :shape "TagMap"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn", :location "uri", :location-name "resourceArn"})], :querystring [(clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList", :location "querystring", :location-name "tagKeys"})]}))

(clojure.core/defn- req-create-simulation-application-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :application)) #:http.request.field{:name "application", :shape "Arn"})]} (clojure.core/contains? input :current-revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-id (input :current-revision-id)) #:http.request.field{:name "currentRevisionId", :shape "RevisionId"}))))

(clojure.core/declare deser-simulation-job)

(clojure.core/declare deser-fleets)

(clojure.core/declare deser-robot-deployment-summary)

(clojure.core/declare deser-deployment-job-error-code)

(clojure.core/declare deser-robot)

(clojure.core/declare deser-simulation-application-config)

(clojure.core/declare deser-client-request-token)

(clojure.core/declare deser-robot-application-summaries)

(clojure.core/declare deser-simulation-application-configs)

(clojure.core/declare deser-simulation-software-suite)

(clojure.core/declare deser-robot-status)

(clojure.core/declare deser-robot-software-suite)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-fleet)

(clojure.core/declare deser-job-duration)

(clojure.core/declare deser-source)

(clojure.core/declare deser-simulation-jobs)

(clojure.core/declare deser-simulation-job-summary)

(clojure.core/declare desererror-message)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-deployment-launch-config)

(clojure.core/declare deser-deployment-application-config)

(clojure.core/declare deser-progress-detail)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-deployment-config)

(clojure.core/declare deser-iam-role)

(clojure.core/declare deser-simulation-application-names)

(clojure.core/declare deser-robot-deployment)

(clojure.core/declare deser-robot-software-suite-type)

(clojure.core/declare deser-arns)

(clojure.core/declare deser-last-updated-at)

(clojure.core/declare deser-simulation-application-summaries)

(clojure.core/declare deser-environment-variable-map)

(clojure.core/declare deser-failure-behavior)

(clojure.core/declare deser-robot-application-config)

(clojure.core/declare deser-simulation-application-summary)

(clojure.core/declare deser-launch-config)

(clojure.core/declare deser-robot-application-summary)

(clojure.core/declare deser-robot-application-names)

(clojure.core/declare deser-robot-application-configs)

(clojure.core/declare deser-environment-variable-value)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-deployment-version)

(clojure.core/declare deser-robot-software-suite-version-type)

(clojure.core/declare deser-tag-map)

(clojure.core/declare deser-simulation-job-status)

(clojure.core/declare deser-percentage)

(clojure.core/declare deser-s-3-key)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-created-at)

(clojure.core/declare deser-s-3-bucket)

(clojure.core/declare deser-revision-id)

(clojure.core/declare deser-architecture)

(clojure.core/declare deser-deployment-job)

(clojure.core/declare deser-simulation-software-suite-type)

(clojure.core/declare deser-deployment-status)

(clojure.core/declare deser-rendering-engine)

(clojure.core/declare deser-rendering-engine-version-type)

(clojure.core/declare deser-version)

(clojure.core/declare deser-simulation-job-error-code)

(clojure.core/declare deser-simulation-software-suite-version-type)

(clojure.core/declare deser-robots)

(clojure.core/declare deser-name)

(clojure.core/declare deser-vpc-config-response)

(clojure.core/declare deser-deployment-application-configs)

(clojure.core/declare deser-environment-variable-key)

(clojure.core/declare deser-rendering-engine-type)

(clojure.core/declare deser-sources)

(clojure.core/declare deser-output-location)

(clojure.core/declare deser-s-3-etag)

(clojure.core/declare deser-id)

(clojure.core/declare deser-simulation-job-summaries)

(clojure.core/declare deser-deployment-jobs)

(clojure.core/declare deser-simulation-time-millis)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-simulation-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (input "vpcConfig"))) (clojure.core/contains? input "outputLocation") (clojure.core/assoc :output-location (deser-output-location (input "outputLocation"))) (clojure.core/contains? input "failureBehavior") (clojure.core/assoc :failure-behavior (deser-failure-behavior (input "failureBehavior"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "maxJobDurationInSeconds") (clojure.core/assoc :max-job-duration-in-seconds (deser-job-duration (input "maxJobDurationInSeconds"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-map (input "tags"))) (clojure.core/contains? input "simulationTimeMillis") (clojure.core/assoc :simulation-time-millis (deser-simulation-time-millis (input "simulationTimeMillis"))) (clojure.core/contains? input "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (input "clientRequestToken"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-simulation-job-status (input "status"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt"))) (clojure.core/contains? input "simulationApplications") (clojure.core/assoc :simulation-applications (deser-simulation-application-configs (input "simulationApplications"))) (clojure.core/contains? input "robotApplications") (clojure.core/assoc :robot-applications (deser-robot-application-configs (input "robotApplications"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-simulation-job-error-code (input "failureCode"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (input "failureReason"))) (clojure.core/contains? input "iamRole") (clojure.core/assoc :iam-role (deser-iam-role (input "iamRole")))))

(clojure.core/defn- deser-fleets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-fleet coll))) input))

(clojure.core/defn- deser-robot-deployment-summary [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-robot-deployment coll))) input))

(clojure.core/defn- deser-deployment-job-error-code [input] (clojure.core/get {"PreLaunchFileFailure" :pre-launch-file-failure, "GreengrassGroupVersionDoesNotExist" :greengrass-group-version-does-not-exist, "MissingRobotApplicationArchitecture" :missing-robot-application-architecture, "MissingRobotDeploymentResource" :missing-robot-deployment-resource, "BadPermissionError" :bad-permission-error, "FailureThresholdBreached" :failure-threshold-breached, "PostLaunchFileFailure" :post-launch-file-failure, "MissingRobotArchitecture" :missing-robot-architecture, "GreengrassDeploymentFailed" :greengrass-deployment-failed, "InternalServerError" :internal-server-error, "ResourceNotFound" :resource-not-found, "RobotDeploymentNoResponse" :robot-deployment-no-response, "ExtractingBundleFailure" :extracting-bundle-failure} input))

(clojure.core/defn- deser-robot [input] (clojure.core/cond-> {} (clojure.core/contains? input "greenGrassGroupId") (clojure.core/assoc :green-grass-group-id (deser-id (input "greenGrassGroupId"))) (clojure.core/contains? input "lastDeploymentJob") (clojure.core/assoc :last-deployment-job (deser-arn (input "lastDeploymentJob"))) (clojure.core/contains? input "architecture") (clojure.core/assoc :architecture (deser-architecture (input "architecture"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-created-at (input "createdAt"))) (clojure.core/contains? input "lastDeploymentTime") (clojure.core/assoc :last-deployment-time (deser-created-at (input "lastDeploymentTime"))) (clojure.core/contains? input "fleetArn") (clojure.core/assoc :fleet-arn (deser-arn (input "fleetArn"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-robot-status (input "status")))))

(clojure.core/defn- deser-simulation-application-config [input] (clojure.core/cond-> {:application (deser-arn (input "application")), :launch-config (deser-launch-config (input "launchConfig"))} (clojure.core/contains? input "applicationVersion") (clojure.core/assoc :application-version (deser-version (input "applicationVersion")))))

(clojure.core/defn- deser-client-request-token [input] input)

(clojure.core/defn- deser-robot-application-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-robot-application-summary coll))) input))

(clojure.core/defn- deser-simulation-application-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-simulation-application-config coll))) input))

(clojure.core/defn- deser-simulation-software-suite [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-simulation-software-suite-type (input "name"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-simulation-software-suite-version-type (input "version")))))

(clojure.core/defn- deser-robot-status [input] (clojure.core/get {"Available" :available, "Registered" :registered, "PendingNewDeployment" :pending-new-deployment, "Deploying" :deploying, "Failed" :failed, "InSync" :in-sync, "NoResponse" :no-response} input))

(clojure.core/defn- deser-robot-software-suite [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-robot-software-suite-type (input "name"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-robot-software-suite-version-type (input "version")))))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-fleet [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-created-at (input "createdAt"))) (clojure.core/contains? input "lastDeploymentStatus") (clojure.core/assoc :last-deployment-status (deser-deployment-status (input "lastDeploymentStatus"))) (clojure.core/contains? input "lastDeploymentJob") (clojure.core/assoc :last-deployment-job (deser-arn (input "lastDeploymentJob"))) (clojure.core/contains? input "lastDeploymentTime") (clojure.core/assoc :last-deployment-time (deser-created-at (input "lastDeploymentTime")))))

(clojure.core/defn- deser-job-duration [input] input)

(clojure.core/defn- deser-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (input "s3Bucket"))) (clojure.core/contains? input "s3Key") (clojure.core/assoc :s-3-key (deser-s-3-key (input "s3Key"))) (clojure.core/contains? input "etag") (clojure.core/assoc :etag (deser-s-3-etag (input "etag"))) (clojure.core/contains? input "architecture") (clojure.core/assoc :architecture (deser-architecture (input "architecture")))))

(clojure.core/defn- deser-simulation-jobs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-simulation-job coll))) input))

(clojure.core/defn- deser-simulation-job-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-simulation-job-status (input "status"))) (clojure.core/contains? input "simulationApplicationNames") (clojure.core/assoc :simulation-application-names (deser-simulation-application-names (input "simulationApplicationNames"))) (clojure.core/contains? input "robotApplicationNames") (clojure.core/assoc :robot-application-names (deser-robot-application-names (input "robotApplicationNames")))))

(clojure.core/defn- desererror-message [input] input)

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-generic-string coll))) input))

(clojure.core/defn- deser-deployment-launch-config [input] (clojure.core/cond-> {:package-name (deser-generic-string (input "packageName")), :launch-file (deser-generic-string (input "launchFile"))} (clojure.core/contains? input "preLaunchFile") (clojure.core/assoc :pre-launch-file (deser-generic-string (input "preLaunchFile"))) (clojure.core/contains? input "postLaunchFile") (clojure.core/assoc :post-launch-file (deser-generic-string (input "postLaunchFile"))) (clojure.core/contains? input "environmentVariables") (clojure.core/assoc :environment-variables (deser-environment-variable-map (input "environmentVariables")))))

(clojure.core/defn- deser-deployment-application-config [input] (clojure.core/cond-> {:application (deser-arn (input "application")), :application-version (deser-deployment-version (input "applicationVersion")), :launch-config (deser-deployment-launch-config (input "launchConfig"))}))

(clojure.core/defn- deser-progress-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "currentProgress") (clojure.core/assoc :current-progress (deser-generic-string (input "currentProgress"))) (clojure.core/contains? input "targetResource") (clojure.core/assoc :target-resource (deser-generic-string (input "targetResource")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-deployment-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "concurrentDeploymentPercentage") (clojure.core/assoc :concurrent-deployment-percentage (deser-percentage (input "concurrentDeploymentPercentage"))) (clojure.core/contains? input "failureThresholdPercentage") (clojure.core/assoc :failure-threshold-percentage (deser-percentage (input "failureThresholdPercentage")))))

(clojure.core/defn- deser-iam-role [input] input)

(clojure.core/defn- deser-simulation-application-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name coll))) input))

(clojure.core/defn- deser-robot-deployment [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "deploymentStartTime") (clojure.core/assoc :deployment-start-time (deser-created-at (input "deploymentStartTime"))) (clojure.core/contains? input "deploymentFinishTime") (clojure.core/assoc :deployment-finish-time (deser-created-at (input "deploymentFinishTime"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-robot-status (input "status"))) (clojure.core/contains? input "progressDetail") (clojure.core/assoc :progress-detail (deser-progress-detail (input "progressDetail"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (input "failureReason"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-deployment-job-error-code (input "failureCode")))))

(clojure.core/defn- deser-robot-software-suite-type [input] (clojure.core/get {"ROS" :ros} input))

(clojure.core/defn- deser-arns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-last-updated-at [input] input)

(clojure.core/defn- deser-simulation-application-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-simulation-application-summary coll))) input))

(clojure.core/defn- deser-environment-variable-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-environment-variable-key k) (deser-environment-variable-value v)])) input))

(clojure.core/defn- deser-failure-behavior [input] (clojure.core/get {"Fail" :fail, "Continue" :continue} input))

(clojure.core/defn- deser-robot-application-config [input] (clojure.core/cond-> {:application (deser-arn (input "application")), :launch-config (deser-launch-config (input "launchConfig"))} (clojure.core/contains? input "applicationVersion") (clojure.core/assoc :application-version (deser-version (input "applicationVersion")))))

(clojure.core/defn- deser-simulation-application-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt")))))

(clojure.core/defn- deser-launch-config [input] (clojure.core/cond-> {:package-name (deser-generic-string (input "packageName")), :launch-file (deser-generic-string (input "launchFile"))} (clojure.core/contains? input "environmentVariables") (clojure.core/assoc :environment-variables (deser-environment-variable-map (input "environmentVariables")))))

(clojure.core/defn- deser-robot-application-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (input "lastUpdatedAt")))))

(clojure.core/defn- deser-robot-application-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-name coll))) input))

(clojure.core/defn- deser-robot-application-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-robot-application-config coll))) input))

(clojure.core/defn- deser-environment-variable-value [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-generic-string [input] input)

(clojure.core/defn- deser-deployment-version [input] input)

(clojure.core/defn- deser-robot-software-suite-version-type [input] (clojure.core/get {"Kinetic" :kinetic} input))

(clojure.core/defn- deser-tag-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-simulation-job-status [input] (clojure.core/get {"Failed" :failed, "Restarting" :restarting, "Preparing" :preparing, "RunningFailed" :running-failed, "Canceled" :canceled, "Terminating" :terminating, "Running" :running, "Terminated" :terminated, "Completed" :completed, "Pending" :pending} input))

(clojure.core/defn- deser-percentage [input] input)

(clojure.core/defn- deser-s-3-key [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-created-at [input] input)

(clojure.core/defn- deser-s-3-bucket [input] input)

(clojure.core/defn- deser-revision-id [input] input)

(clojure.core/defn- deser-architecture [input] (clojure.core/get {"X86_64" :x-86-64, "ARM64" :arm-64, "ARMHF" :armhf} input))

(clojure.core/defn- deser-deployment-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "fleet") (clojure.core/assoc :fleet (deser-arn (input "fleet"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-deployment-status (input "status"))) (clojure.core/contains? input "deploymentApplicationConfigs") (clojure.core/assoc :deployment-application-configs (deser-deployment-application-configs (input "deploymentApplicationConfigs"))) (clojure.core/contains? input "deploymentConfig") (clojure.core/assoc :deployment-config (deser-deployment-config (input "deploymentConfig"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (input "failureReason"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-deployment-job-error-code (input "failureCode"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-created-at (input "createdAt")))))

(clojure.core/defn- deser-simulation-software-suite-type [input] (clojure.core/get {"Gazebo" :gazebo} input))

(clojure.core/defn- deser-deployment-status [input] (clojure.core/get {"Pending" :pending, "Preparing" :preparing, "InProgress" :in-progress, "Failed" :failed, "Succeeded" :succeeded} input))

(clojure.core/defn- deser-rendering-engine [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-rendering-engine-type (input "name"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-rendering-engine-version-type (input "version")))))

(clojure.core/defn- deser-rendering-engine-version-type [input] input)

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-simulation-job-error-code [input] (clojure.core/get {"RobotApplicationCrash" :robot-application-crash, "SimulationApplicationVersionMismatchedEtag" :simulation-application-version-mismatched-etag, "BadPermissionsSimulationApplication" :bad-permissions-simulation-application, "InvalidBundleRobotApplication" :invalid-bundle-robot-application, "InternalServiceError" :internal-service-error, "BadPermissionsUserCredentials" :bad-permissions-user-credentials, "SubnetIpLimitExceeded" :subnet-ip-limit-exceeded, "BadPermissionsRobotApplication" :bad-permissions-robot-application, "SimulationApplicationCrash" :simulation-application-crash, "BadPermissionsS3Output" :bad-permissions-s-3-output, "ENILimitExceeded" :eni-limit-exceeded, "WrongRegionS3Output" :wrong-region-s-3-output, "WrongRegionRobotApplication" :wrong-region-robot-application, "InvalidBundleSimulationApplication" :invalid-bundle-simulation-application, "BadPermissionsCloudwatchLogs" :bad-permissions-cloudwatch-logs, "RobotApplicationVersionMismatchedEtag" :robot-application-version-mismatched-etag, "WrongRegionSimulationApplication" :wrong-region-simulation-application} input))

(clojure.core/defn- deser-simulation-software-suite-version-type [input] input)

(clojure.core/defn- deser-robots [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-robot coll))) input))

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-vpc-config-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "subnets") (clojure.core/assoc :subnets (deser-subnets (input "subnets"))) (clojure.core/contains? input "securityGroups") (clojure.core/assoc :security-groups (deser-security-groups (input "securityGroups"))) (clojure.core/contains? input "vpcId") (clojure.core/assoc :vpc-id (deser-generic-string (input "vpcId"))) (clojure.core/contains? input "assignPublicIp") (clojure.core/assoc :assign-public-ip (deser-boolean (input "assignPublicIp")))))

(clojure.core/defn- deser-deployment-application-configs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-application-config coll))) input))

(clojure.core/defn- deser-environment-variable-key [input] input)

(clojure.core/defn- deser-rendering-engine-type [input] (clojure.core/get {"OGRE" :ogre} input))

(clojure.core/defn- deser-sources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-source coll))) input))

(clojure.core/defn- deser-output-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3Bucket") (clojure.core/assoc :s-3-bucket (deser-s-3-bucket (input "s3Bucket"))) (clojure.core/contains? input "s3Prefix") (clojure.core/assoc :s-3-prefix (deser-s-3-key (input "s3Prefix")))))

(clojure.core/defn- deser-s-3-etag [input] input)

(clojure.core/defn- deser-id [input] input)

(clojure.core/defn- deser-simulation-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-simulation-job-summary coll))) input))

(clojure.core/defn- deser-deployment-jobs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-job coll))) input))

(clojure.core/defn- deser-simulation-time-millis [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-create-deployment-job-response ([input] (response-create-deployment-job-response nil input)) ([resultWrapper444954 input] (clojure.core/let [rawinput444953 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444955 {"arn" (rawinput444953 "arn"), "createdAt" (rawinput444953 "createdAt"), "tags" (rawinput444953 "tags"), "deploymentApplicationConfigs" (rawinput444953 "deploymentApplicationConfigs"), "deploymentConfig" (rawinput444953 "deploymentConfig"), "status" (rawinput444953 "status"), "failureCode" (rawinput444953 "failureCode"), "fleet" (rawinput444953 "fleet"), "failureReason" (rawinput444953 "failureReason")}] (clojure.core/cond-> {} (letvar444955 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar444955 ["arn"]))) (letvar444955 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar444955 ["createdAt"]))) (letvar444955 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar444955 ["tags"]))) (letvar444955 "deploymentApplicationConfigs") (clojure.core/assoc :deployment-application-configs (deser-deployment-application-configs (clojure.core/get-in letvar444955 ["deploymentApplicationConfigs"]))) (letvar444955 "deploymentConfig") (clojure.core/assoc :deployment-config (deser-deployment-config (clojure.core/get-in letvar444955 ["deploymentConfig"]))) (letvar444955 "status") (clojure.core/assoc :status (deser-deployment-status (clojure.core/get-in letvar444955 ["status"]))) (letvar444955 "failureCode") (clojure.core/assoc :failure-code (deser-deployment-job-error-code (clojure.core/get-in letvar444955 ["failureCode"]))) (letvar444955 "fleet") (clojure.core/assoc :fleet (deser-arn (clojure.core/get-in letvar444955 ["fleet"]))) (letvar444955 "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (clojure.core/get-in letvar444955 ["failureReason"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper444957 input] (clojure.core/let [rawinput444956 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444958 {"tags" (rawinput444956 "tags")}] (clojure.core/cond-> {} (letvar444958 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar444958 ["tags"])))))))

(clojure.core/defn- response-list-fleets-response ([input] (response-list-fleets-response nil input)) ([resultWrapper444960 input] (clojure.core/let [rawinput444959 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444961 {"fleetDetails" (rawinput444959 "fleetDetails"), "nextToken" (rawinput444959 "nextToken")}] (clojure.core/cond-> {} (letvar444961 "fleetDetails") (clojure.core/assoc :fleet-details (deser-fleets (clojure.core/get-in letvar444961 ["fleetDetails"]))) (letvar444961 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar444961 ["nextToken"])))))))

(clojure.core/defn- response-concurrent-deployment-exception ([input] (response-concurrent-deployment-exception nil input)) ([resultWrapper444963 input] (clojure.core/let [rawinput444962 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444964 {"message" (rawinput444962 "message")}] (clojure.core/cond-> {} (letvar444964 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar444964 ["message"])))))))

(clojure.core/defn- response-describe-fleet-response ([input] (response-describe-fleet-response nil input)) ([resultWrapper444966 input] (clojure.core/let [rawinput444965 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444967 {"name" (rawinput444965 "name"), "arn" (rawinput444965 "arn"), "robots" (rawinput444965 "robots"), "createdAt" (rawinput444965 "createdAt"), "lastDeploymentStatus" (rawinput444965 "lastDeploymentStatus"), "lastDeploymentJob" (rawinput444965 "lastDeploymentJob"), "lastDeploymentTime" (rawinput444965 "lastDeploymentTime"), "tags" (rawinput444965 "tags")}] (clojure.core/cond-> {} (letvar444967 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar444967 ["name"]))) (letvar444967 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar444967 ["arn"]))) (letvar444967 "robots") (clojure.core/assoc :robots (deser-robots (clojure.core/get-in letvar444967 ["robots"]))) (letvar444967 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar444967 ["createdAt"]))) (letvar444967 "lastDeploymentStatus") (clojure.core/assoc :last-deployment-status (deser-deployment-status (clojure.core/get-in letvar444967 ["lastDeploymentStatus"]))) (letvar444967 "lastDeploymentJob") (clojure.core/assoc :last-deployment-job (deser-arn (clojure.core/get-in letvar444967 ["lastDeploymentJob"]))) (letvar444967 "lastDeploymentTime") (clojure.core/assoc :last-deployment-time (deser-created-at (clojure.core/get-in letvar444967 ["lastDeploymentTime"]))) (letvar444967 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar444967 ["tags"])))))))

(clojure.core/defn- response-register-robot-response ([input] (response-register-robot-response nil input)) ([resultWrapper444969 input] (clojure.core/let [rawinput444968 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444970 {"fleet" (rawinput444968 "fleet"), "robot" (rawinput444968 "robot")}] (clojure.core/cond-> {} (letvar444970 "fleet") (clojure.core/assoc :fleet (deser-arn (clojure.core/get-in letvar444970 ["fleet"]))) (letvar444970 "robot") (clojure.core/assoc :robot (deser-arn (clojure.core/get-in letvar444970 ["robot"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper444972 input] (clojure.core/let [rawinput444971 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444973 {"message" (rawinput444971 "message")}] (clojure.core/cond-> {} (letvar444973 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar444973 ["message"])))))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper444975 input] (clojure.core/let [rawinput444974 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444976 {"message" (rawinput444974 "message")}] (clojure.core/cond-> {} (letvar444976 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar444976 ["message"])))))))

(clojure.core/defn- response-batch-describe-simulation-job-response ([input] (response-batch-describe-simulation-job-response nil input)) ([resultWrapper444978 input] (clojure.core/let [rawinput444977 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444979 {"jobs" (rawinput444977 "jobs"), "unprocessedJobs" (rawinput444977 "unprocessedJobs")}] (clojure.core/cond-> {} (letvar444979 "jobs") (clojure.core/assoc :jobs (deser-simulation-jobs (clojure.core/get-in letvar444979 ["jobs"]))) (letvar444979 "unprocessedJobs") (clojure.core/assoc :unprocessed-jobs (deser-arns (clojure.core/get-in letvar444979 ["unprocessedJobs"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper444981 input] (clojure.core/let [rawinput444980 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444982 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-restart-simulation-job-response ([input] (response-restart-simulation-job-response nil input)) ([resultWrapper444984 input] (clojure.core/let [rawinput444983 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444985 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-cancel-simulation-job-response ([input] (response-cancel-simulation-job-response nil input)) ([resultWrapper444987 input] (clojure.core/let [rawinput444986 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444988 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-simulation-application-response ([input] (response-describe-simulation-application-response nil input)) ([resultWrapper444990 input] (clojure.core/let [rawinput444989 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444991 {"sources" (rawinput444989 "sources"), "revisionId" (rawinput444989 "revisionId"), "arn" (rawinput444989 "arn"), "tags" (rawinput444989 "tags"), "name" (rawinput444989 "name"), "renderingEngine" (rawinput444989 "renderingEngine"), "lastUpdatedAt" (rawinput444989 "lastUpdatedAt"), "robotSoftwareSuite" (rawinput444989 "robotSoftwareSuite"), "version" (rawinput444989 "version"), "simulationSoftwareSuite" (rawinput444989 "simulationSoftwareSuite")}] (clojure.core/cond-> {} (letvar444991 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar444991 ["sources"]))) (letvar444991 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar444991 ["revisionId"]))) (letvar444991 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar444991 ["arn"]))) (letvar444991 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar444991 ["tags"]))) (letvar444991 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar444991 ["name"]))) (letvar444991 "renderingEngine") (clojure.core/assoc :rendering-engine (deser-rendering-engine (clojure.core/get-in letvar444991 ["renderingEngine"]))) (letvar444991 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar444991 ["lastUpdatedAt"]))) (letvar444991 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar444991 ["robotSoftwareSuite"]))) (letvar444991 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar444991 ["version"]))) (letvar444991 "simulationSoftwareSuite") (clojure.core/assoc :simulation-software-suite (deser-simulation-software-suite (clojure.core/get-in letvar444991 ["simulationSoftwareSuite"])))))))

(clojure.core/defn- response-create-simulation-job-response ([input] (response-create-simulation-job-response nil input)) ([resultWrapper444993 input] (clojure.core/let [rawinput444992 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444994 {"vpcConfig" (rawinput444992 "vpcConfig"), "outputLocation" (rawinput444992 "outputLocation"), "failureBehavior" (rawinput444992 "failureBehavior"), "arn" (rawinput444992 "arn"), "maxJobDurationInSeconds" (rawinput444992 "maxJobDurationInSeconds"), "tags" (rawinput444992 "tags"), "simulationTimeMillis" (rawinput444992 "simulationTimeMillis"), "clientRequestToken" (rawinput444992 "clientRequestToken"), "status" (rawinput444992 "status"), "lastUpdatedAt" (rawinput444992 "lastUpdatedAt"), "simulationApplications" (rawinput444992 "simulationApplications"), "robotApplications" (rawinput444992 "robotApplications"), "failureCode" (rawinput444992 "failureCode"), "iamRole" (rawinput444992 "iamRole")}] (clojure.core/cond-> {} (letvar444994 "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (clojure.core/get-in letvar444994 ["vpcConfig"]))) (letvar444994 "outputLocation") (clojure.core/assoc :output-location (deser-output-location (clojure.core/get-in letvar444994 ["outputLocation"]))) (letvar444994 "failureBehavior") (clojure.core/assoc :failure-behavior (deser-failure-behavior (clojure.core/get-in letvar444994 ["failureBehavior"]))) (letvar444994 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar444994 ["arn"]))) (letvar444994 "maxJobDurationInSeconds") (clojure.core/assoc :max-job-duration-in-seconds (deser-job-duration (clojure.core/get-in letvar444994 ["maxJobDurationInSeconds"]))) (letvar444994 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar444994 ["tags"]))) (letvar444994 "simulationTimeMillis") (clojure.core/assoc :simulation-time-millis (deser-simulation-time-millis (clojure.core/get-in letvar444994 ["simulationTimeMillis"]))) (letvar444994 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar444994 ["clientRequestToken"]))) (letvar444994 "status") (clojure.core/assoc :status (deser-simulation-job-status (clojure.core/get-in letvar444994 ["status"]))) (letvar444994 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar444994 ["lastUpdatedAt"]))) (letvar444994 "simulationApplications") (clojure.core/assoc :simulation-applications (deser-simulation-application-configs (clojure.core/get-in letvar444994 ["simulationApplications"]))) (letvar444994 "robotApplications") (clojure.core/assoc :robot-applications (deser-robot-application-configs (clojure.core/get-in letvar444994 ["robotApplications"]))) (letvar444994 "failureCode") (clojure.core/assoc :failure-code (deser-simulation-job-error-code (clojure.core/get-in letvar444994 ["failureCode"]))) (letvar444994 "iamRole") (clojure.core/assoc :iam-role (deser-iam-role (clojure.core/get-in letvar444994 ["iamRole"])))))))

(clojure.core/defn- response-update-simulation-application-response ([input] (response-update-simulation-application-response nil input)) ([resultWrapper444996 input] (clojure.core/let [rawinput444995 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar444997 {"sources" (rawinput444995 "sources"), "revisionId" (rawinput444995 "revisionId"), "arn" (rawinput444995 "arn"), "name" (rawinput444995 "name"), "renderingEngine" (rawinput444995 "renderingEngine"), "lastUpdatedAt" (rawinput444995 "lastUpdatedAt"), "robotSoftwareSuite" (rawinput444995 "robotSoftwareSuite"), "version" (rawinput444995 "version"), "simulationSoftwareSuite" (rawinput444995 "simulationSoftwareSuite")}] (clojure.core/cond-> {} (letvar444997 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar444997 ["sources"]))) (letvar444997 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar444997 ["revisionId"]))) (letvar444997 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar444997 ["arn"]))) (letvar444997 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar444997 ["name"]))) (letvar444997 "renderingEngine") (clojure.core/assoc :rendering-engine (deser-rendering-engine (clojure.core/get-in letvar444997 ["renderingEngine"]))) (letvar444997 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar444997 ["lastUpdatedAt"]))) (letvar444997 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar444997 ["robotSoftwareSuite"]))) (letvar444997 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar444997 ["version"]))) (letvar444997 "simulationSoftwareSuite") (clojure.core/assoc :simulation-software-suite (deser-simulation-software-suite (clojure.core/get-in letvar444997 ["simulationSoftwareSuite"])))))))

(clojure.core/defn- response-delete-robot-response ([input] (response-delete-robot-response nil input)) ([resultWrapper444999 input] (clojure.core/let [rawinput444998 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445000 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-robots-response ([input] (response-list-robots-response nil input)) ([resultWrapper445002 input] (clojure.core/let [rawinput445001 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445003 {"robots" (rawinput445001 "robots"), "nextToken" (rawinput445001 "nextToken")}] (clojure.core/cond-> {} (letvar445003 "robots") (clojure.core/assoc :robots (deser-robots (clojure.core/get-in letvar445003 ["robots"]))) (letvar445003 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar445003 ["nextToken"])))))))

(clojure.core/defn- response-deregister-robot-response ([input] (response-deregister-robot-response nil input)) ([resultWrapper445005 input] (clojure.core/let [rawinput445004 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445006 {"fleet" (rawinput445004 "fleet"), "robot" (rawinput445004 "robot")}] (clojure.core/cond-> {} (letvar445006 "fleet") (clojure.core/assoc :fleet (deser-arn (clojure.core/get-in letvar445006 ["fleet"]))) (letvar445006 "robot") (clojure.core/assoc :robot (deser-arn (clojure.core/get-in letvar445006 ["robot"])))))))

(clojure.core/defn- response-create-robot-response ([input] (response-create-robot-response nil input)) ([resultWrapper445008 input] (clojure.core/let [rawinput445007 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445009 {"arn" (rawinput445007 "arn"), "name" (rawinput445007 "name"), "createdAt" (rawinput445007 "createdAt"), "greengrassGroupId" (rawinput445007 "greengrassGroupId"), "architecture" (rawinput445007 "architecture"), "tags" (rawinput445007 "tags")}] (clojure.core/cond-> {} (letvar445009 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445009 ["arn"]))) (letvar445009 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445009 ["name"]))) (letvar445009 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar445009 ["createdAt"]))) (letvar445009 "greengrassGroupId") (clojure.core/assoc :greengrass-group-id (deser-id (clojure.core/get-in letvar445009 ["greengrassGroupId"]))) (letvar445009 "architecture") (clojure.core/assoc :architecture (deser-architecture (clojure.core/get-in letvar445009 ["architecture"]))) (letvar445009 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445009 ["tags"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper445011 input] (clojure.core/let [rawinput445010 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445012 {"message" (rawinput445010 "message")}] (clojure.core/cond-> {} (letvar445012 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar445012 ["message"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper445014 input] (clojure.core/let [rawinput445013 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445015 {"message" (rawinput445013 "message")}] (clojure.core/cond-> {} (letvar445015 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar445015 ["message"])))))))

(clojure.core/defn- response-create-fleet-response ([input] (response-create-fleet-response nil input)) ([resultWrapper445017 input] (clojure.core/let [rawinput445016 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445018 {"arn" (rawinput445016 "arn"), "name" (rawinput445016 "name"), "createdAt" (rawinput445016 "createdAt"), "tags" (rawinput445016 "tags")}] (clojure.core/cond-> {} (letvar445018 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445018 ["arn"]))) (letvar445018 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445018 ["name"]))) (letvar445018 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar445018 ["createdAt"]))) (letvar445018 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445018 ["tags"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper445020 input] (clojure.core/let [rawinput445019 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445021 {"message" (rawinput445019 "message")}] (clojure.core/cond-> {} (letvar445021 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar445021 ["message"])))))))

(clojure.core/defn- response-sync-deployment-job-response ([input] (response-sync-deployment-job-response nil input)) ([resultWrapper445023 input] (clojure.core/let [rawinput445022 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445024 {"arn" (rawinput445022 "arn"), "fleet" (rawinput445022 "fleet"), "status" (rawinput445022 "status"), "deploymentConfig" (rawinput445022 "deploymentConfig"), "deploymentApplicationConfigs" (rawinput445022 "deploymentApplicationConfigs"), "failureReason" (rawinput445022 "failureReason"), "failureCode" (rawinput445022 "failureCode"), "createdAt" (rawinput445022 "createdAt")}] (clojure.core/cond-> {} (letvar445024 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445024 ["arn"]))) (letvar445024 "fleet") (clojure.core/assoc :fleet (deser-arn (clojure.core/get-in letvar445024 ["fleet"]))) (letvar445024 "status") (clojure.core/assoc :status (deser-deployment-status (clojure.core/get-in letvar445024 ["status"]))) (letvar445024 "deploymentConfig") (clojure.core/assoc :deployment-config (deser-deployment-config (clojure.core/get-in letvar445024 ["deploymentConfig"]))) (letvar445024 "deploymentApplicationConfigs") (clojure.core/assoc :deployment-application-configs (deser-deployment-application-configs (clojure.core/get-in letvar445024 ["deploymentApplicationConfigs"]))) (letvar445024 "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (clojure.core/get-in letvar445024 ["failureReason"]))) (letvar445024 "failureCode") (clojure.core/assoc :failure-code (deser-deployment-job-error-code (clojure.core/get-in letvar445024 ["failureCode"]))) (letvar445024 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar445024 ["createdAt"])))))))

(clojure.core/defn- response-create-simulation-application-response ([input] (response-create-simulation-application-response nil input)) ([resultWrapper445026 input] (clojure.core/let [rawinput445025 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445027 {"sources" (rawinput445025 "sources"), "revisionId" (rawinput445025 "revisionId"), "arn" (rawinput445025 "arn"), "tags" (rawinput445025 "tags"), "name" (rawinput445025 "name"), "renderingEngine" (rawinput445025 "renderingEngine"), "lastUpdatedAt" (rawinput445025 "lastUpdatedAt"), "robotSoftwareSuite" (rawinput445025 "robotSoftwareSuite"), "version" (rawinput445025 "version"), "simulationSoftwareSuite" (rawinput445025 "simulationSoftwareSuite")}] (clojure.core/cond-> {} (letvar445027 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445027 ["sources"]))) (letvar445027 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445027 ["revisionId"]))) (letvar445027 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445027 ["arn"]))) (letvar445027 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445027 ["tags"]))) (letvar445027 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445027 ["name"]))) (letvar445027 "renderingEngine") (clojure.core/assoc :rendering-engine (deser-rendering-engine (clojure.core/get-in letvar445027 ["renderingEngine"]))) (letvar445027 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445027 ["lastUpdatedAt"]))) (letvar445027 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445027 ["robotSoftwareSuite"]))) (letvar445027 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445027 ["version"]))) (letvar445027 "simulationSoftwareSuite") (clojure.core/assoc :simulation-software-suite (deser-simulation-software-suite (clojure.core/get-in letvar445027 ["simulationSoftwareSuite"])))))))

(clojure.core/defn- response-list-robot-applications-response ([input] (response-list-robot-applications-response nil input)) ([resultWrapper445029 input] (clojure.core/let [rawinput445028 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445030 {"robotApplicationSummaries" (rawinput445028 "robotApplicationSummaries"), "nextToken" (rawinput445028 "nextToken")}] (clojure.core/cond-> {} (letvar445030 "robotApplicationSummaries") (clojure.core/assoc :robot-application-summaries (deser-robot-application-summaries (clojure.core/get-in letvar445030 ["robotApplicationSummaries"]))) (letvar445030 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar445030 ["nextToken"])))))))

(clojure.core/defn- response-create-robot-application-version-response ([input] (response-create-robot-application-version-response nil input)) ([resultWrapper445032 input] (clojure.core/let [rawinput445031 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445033 {"arn" (rawinput445031 "arn"), "name" (rawinput445031 "name"), "version" (rawinput445031 "version"), "sources" (rawinput445031 "sources"), "robotSoftwareSuite" (rawinput445031 "robotSoftwareSuite"), "lastUpdatedAt" (rawinput445031 "lastUpdatedAt"), "revisionId" (rawinput445031 "revisionId")}] (clojure.core/cond-> {} (letvar445033 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445033 ["arn"]))) (letvar445033 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445033 ["name"]))) (letvar445033 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445033 ["version"]))) (letvar445033 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445033 ["sources"]))) (letvar445033 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445033 ["robotSoftwareSuite"]))) (letvar445033 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445033 ["lastUpdatedAt"]))) (letvar445033 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445033 ["revisionId"])))))))

(clojure.core/defn- response-update-robot-application-response ([input] (response-update-robot-application-response nil input)) ([resultWrapper445035 input] (clojure.core/let [rawinput445034 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445036 {"arn" (rawinput445034 "arn"), "name" (rawinput445034 "name"), "version" (rawinput445034 "version"), "sources" (rawinput445034 "sources"), "robotSoftwareSuite" (rawinput445034 "robotSoftwareSuite"), "lastUpdatedAt" (rawinput445034 "lastUpdatedAt"), "revisionId" (rawinput445034 "revisionId")}] (clojure.core/cond-> {} (letvar445036 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445036 ["arn"]))) (letvar445036 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445036 ["name"]))) (letvar445036 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445036 ["version"]))) (letvar445036 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445036 ["sources"]))) (letvar445036 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445036 ["robotSoftwareSuite"]))) (letvar445036 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445036 ["lastUpdatedAt"]))) (letvar445036 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445036 ["revisionId"])))))))

(clojure.core/defn- response-list-simulation-applications-response ([input] (response-list-simulation-applications-response nil input)) ([resultWrapper445038 input] (clojure.core/let [rawinput445037 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445039 {"simulationApplicationSummaries" (rawinput445037 "simulationApplicationSummaries"), "nextToken" (rawinput445037 "nextToken")}] (clojure.core/cond-> {} (letvar445039 "simulationApplicationSummaries") (clojure.core/assoc :simulation-application-summaries (deser-simulation-application-summaries (clojure.core/get-in letvar445039 ["simulationApplicationSummaries"]))) (letvar445039 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar445039 ["nextToken"])))))))

(clojure.core/defn- response-describe-robot-response ([input] (response-describe-robot-response nil input)) ([resultWrapper445041 input] (clojure.core/let [rawinput445040 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445042 {"lastDeploymentJob" (rawinput445040 "lastDeploymentJob"), "architecture" (rawinput445040 "architecture"), "arn" (rawinput445040 "arn"), "createdAt" (rawinput445040 "createdAt"), "lastDeploymentTime" (rawinput445040 "lastDeploymentTime"), "fleetArn" (rawinput445040 "fleetArn"), "tags" (rawinput445040 "tags"), "name" (rawinput445040 "name"), "status" (rawinput445040 "status"), "greengrassGroupId" (rawinput445040 "greengrassGroupId")}] (clojure.core/cond-> {} (letvar445042 "lastDeploymentJob") (clojure.core/assoc :last-deployment-job (deser-arn (clojure.core/get-in letvar445042 ["lastDeploymentJob"]))) (letvar445042 "architecture") (clojure.core/assoc :architecture (deser-architecture (clojure.core/get-in letvar445042 ["architecture"]))) (letvar445042 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445042 ["arn"]))) (letvar445042 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar445042 ["createdAt"]))) (letvar445042 "lastDeploymentTime") (clojure.core/assoc :last-deployment-time (deser-created-at (clojure.core/get-in letvar445042 ["lastDeploymentTime"]))) (letvar445042 "fleetArn") (clojure.core/assoc :fleet-arn (deser-arn (clojure.core/get-in letvar445042 ["fleetArn"]))) (letvar445042 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445042 ["tags"]))) (letvar445042 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445042 ["name"]))) (letvar445042 "status") (clojure.core/assoc :status (deser-robot-status (clojure.core/get-in letvar445042 ["status"]))) (letvar445042 "greengrassGroupId") (clojure.core/assoc :greengrass-group-id (deser-id (clojure.core/get-in letvar445042 ["greengrassGroupId"])))))))

(clojure.core/defn- response-describe-simulation-job-response ([input] (response-describe-simulation-job-response nil input)) ([resultWrapper445044 input] (clojure.core/let [rawinput445043 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445045 {"vpcConfig" (rawinput445043 "vpcConfig"), "outputLocation" (rawinput445043 "outputLocation"), "failureBehavior" (rawinput445043 "failureBehavior"), "arn" (rawinput445043 "arn"), "maxJobDurationInSeconds" (rawinput445043 "maxJobDurationInSeconds"), "tags" (rawinput445043 "tags"), "simulationTimeMillis" (rawinput445043 "simulationTimeMillis"), "clientRequestToken" (rawinput445043 "clientRequestToken"), "name" (rawinput445043 "name"), "status" (rawinput445043 "status"), "lastUpdatedAt" (rawinput445043 "lastUpdatedAt"), "simulationApplications" (rawinput445043 "simulationApplications"), "robotApplications" (rawinput445043 "robotApplications"), "failureCode" (rawinput445043 "failureCode"), "failureReason" (rawinput445043 "failureReason"), "iamRole" (rawinput445043 "iamRole")}] (clojure.core/cond-> {} (letvar445045 "vpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (clojure.core/get-in letvar445045 ["vpcConfig"]))) (letvar445045 "outputLocation") (clojure.core/assoc :output-location (deser-output-location (clojure.core/get-in letvar445045 ["outputLocation"]))) (letvar445045 "failureBehavior") (clojure.core/assoc :failure-behavior (deser-failure-behavior (clojure.core/get-in letvar445045 ["failureBehavior"]))) (letvar445045 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445045 ["arn"]))) (letvar445045 "maxJobDurationInSeconds") (clojure.core/assoc :max-job-duration-in-seconds (deser-job-duration (clojure.core/get-in letvar445045 ["maxJobDurationInSeconds"]))) (letvar445045 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445045 ["tags"]))) (letvar445045 "simulationTimeMillis") (clojure.core/assoc :simulation-time-millis (deser-simulation-time-millis (clojure.core/get-in letvar445045 ["simulationTimeMillis"]))) (letvar445045 "clientRequestToken") (clojure.core/assoc :client-request-token (deser-client-request-token (clojure.core/get-in letvar445045 ["clientRequestToken"]))) (letvar445045 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445045 ["name"]))) (letvar445045 "status") (clojure.core/assoc :status (deser-simulation-job-status (clojure.core/get-in letvar445045 ["status"]))) (letvar445045 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445045 ["lastUpdatedAt"]))) (letvar445045 "simulationApplications") (clojure.core/assoc :simulation-applications (deser-simulation-application-configs (clojure.core/get-in letvar445045 ["simulationApplications"]))) (letvar445045 "robotApplications") (clojure.core/assoc :robot-applications (deser-robot-application-configs (clojure.core/get-in letvar445045 ["robotApplications"]))) (letvar445045 "failureCode") (clojure.core/assoc :failure-code (deser-simulation-job-error-code (clojure.core/get-in letvar445045 ["failureCode"]))) (letvar445045 "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (clojure.core/get-in letvar445045 ["failureReason"]))) (letvar445045 "iamRole") (clojure.core/assoc :iam-role (deser-iam-role (clojure.core/get-in letvar445045 ["iamRole"])))))))

(clojure.core/defn- response-list-deployment-jobs-response ([input] (response-list-deployment-jobs-response nil input)) ([resultWrapper445047 input] (clojure.core/let [rawinput445046 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445048 {"deploymentJobs" (rawinput445046 "deploymentJobs"), "nextToken" (rawinput445046 "nextToken")}] (clojure.core/cond-> {} (letvar445048 "deploymentJobs") (clojure.core/assoc :deployment-jobs (deser-deployment-jobs (clojure.core/get-in letvar445048 ["deploymentJobs"]))) (letvar445048 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar445048 ["nextToken"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper445050 input] (clojure.core/let [rawinput445049 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445051 {"message" (rawinput445049 "message")}] (clojure.core/cond-> {} (letvar445051 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar445051 ["message"])))))))

(clojure.core/defn- response-delete-robot-application-response ([input] (response-delete-robot-application-response nil input)) ([resultWrapper445053 input] (clojure.core/let [rawinput445052 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445054 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper445056 input] (clojure.core/let [rawinput445055 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445057 {"message" (rawinput445055 "message")}] (clojure.core/cond-> {} (letvar445057 "message") (clojure.core/assoc :message (desererror-message (clojure.core/get-in letvar445057 ["message"])))))))

(clojure.core/defn- response-describe-robot-application-response ([input] (response-describe-robot-application-response nil input)) ([resultWrapper445059 input] (clojure.core/let [rawinput445058 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445060 {"arn" (rawinput445058 "arn"), "name" (rawinput445058 "name"), "version" (rawinput445058 "version"), "sources" (rawinput445058 "sources"), "robotSoftwareSuite" (rawinput445058 "robotSoftwareSuite"), "revisionId" (rawinput445058 "revisionId"), "lastUpdatedAt" (rawinput445058 "lastUpdatedAt"), "tags" (rawinput445058 "tags")}] (clojure.core/cond-> {} (letvar445060 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445060 ["arn"]))) (letvar445060 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445060 ["name"]))) (letvar445060 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445060 ["version"]))) (letvar445060 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445060 ["sources"]))) (letvar445060 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445060 ["robotSoftwareSuite"]))) (letvar445060 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445060 ["revisionId"]))) (letvar445060 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445060 ["lastUpdatedAt"]))) (letvar445060 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445060 ["tags"])))))))

(clojure.core/defn- response-describe-deployment-job-response ([input] (response-describe-deployment-job-response nil input)) ([resultWrapper445062 input] (clojure.core/let [rawinput445061 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445063 {"arn" (rawinput445061 "arn"), "createdAt" (rawinput445061 "createdAt"), "tags" (rawinput445061 "tags"), "deploymentApplicationConfigs" (rawinput445061 "deploymentApplicationConfigs"), "deploymentConfig" (rawinput445061 "deploymentConfig"), "status" (rawinput445061 "status"), "failureCode" (rawinput445061 "failureCode"), "fleet" (rawinput445061 "fleet"), "robotDeploymentSummary" (rawinput445061 "robotDeploymentSummary"), "failureReason" (rawinput445061 "failureReason")}] (clojure.core/cond-> {} (letvar445063 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445063 ["arn"]))) (letvar445063 "createdAt") (clojure.core/assoc :created-at (deser-created-at (clojure.core/get-in letvar445063 ["createdAt"]))) (letvar445063 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445063 ["tags"]))) (letvar445063 "deploymentApplicationConfigs") (clojure.core/assoc :deployment-application-configs (deser-deployment-application-configs (clojure.core/get-in letvar445063 ["deploymentApplicationConfigs"]))) (letvar445063 "deploymentConfig") (clojure.core/assoc :deployment-config (deser-deployment-config (clojure.core/get-in letvar445063 ["deploymentConfig"]))) (letvar445063 "status") (clojure.core/assoc :status (deser-deployment-status (clojure.core/get-in letvar445063 ["status"]))) (letvar445063 "failureCode") (clojure.core/assoc :failure-code (deser-deployment-job-error-code (clojure.core/get-in letvar445063 ["failureCode"]))) (letvar445063 "fleet") (clojure.core/assoc :fleet (deser-arn (clojure.core/get-in letvar445063 ["fleet"]))) (letvar445063 "robotDeploymentSummary") (clojure.core/assoc :robot-deployment-summary (deser-robot-deployment-summary (clojure.core/get-in letvar445063 ["robotDeploymentSummary"]))) (letvar445063 "failureReason") (clojure.core/assoc :failure-reason (deser-generic-string (clojure.core/get-in letvar445063 ["failureReason"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper445065 input] (clojure.core/let [rawinput445064 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445066 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-fleet-response ([input] (response-delete-fleet-response nil input)) ([resultWrapper445068 input] (clojure.core/let [rawinput445067 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445069 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-simulation-jobs-response ([input] (response-list-simulation-jobs-response nil input)) ([resultWrapper445071 input] (clojure.core/let [rawinput445070 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445072 {"simulationJobSummaries" (rawinput445070 "simulationJobSummaries"), "nextToken" (rawinput445070 "nextToken")}] (clojure.core/cond-> {:simulation-job-summaries (deser-simulation-job-summaries (clojure.core/get-in letvar445072 ["simulationJobSummaries"]))} (letvar445072 "nextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar445072 ["nextToken"])))))))

(clojure.core/defn- response-create-robot-application-response ([input] (response-create-robot-application-response nil input)) ([resultWrapper445074 input] (clojure.core/let [rawinput445073 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445075 {"arn" (rawinput445073 "arn"), "name" (rawinput445073 "name"), "version" (rawinput445073 "version"), "sources" (rawinput445073 "sources"), "robotSoftwareSuite" (rawinput445073 "robotSoftwareSuite"), "lastUpdatedAt" (rawinput445073 "lastUpdatedAt"), "revisionId" (rawinput445073 "revisionId"), "tags" (rawinput445073 "tags")}] (clojure.core/cond-> {} (letvar445075 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445075 ["arn"]))) (letvar445075 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445075 ["name"]))) (letvar445075 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445075 ["version"]))) (letvar445075 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445075 ["sources"]))) (letvar445075 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445075 ["robotSoftwareSuite"]))) (letvar445075 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445075 ["lastUpdatedAt"]))) (letvar445075 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445075 ["revisionId"]))) (letvar445075 "tags") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar445075 ["tags"])))))))

(clojure.core/defn- response-create-simulation-application-version-response ([input] (response-create-simulation-application-version-response nil input)) ([resultWrapper445077 input] (clojure.core/let [rawinput445076 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445078 {"sources" (rawinput445076 "sources"), "revisionId" (rawinput445076 "revisionId"), "arn" (rawinput445076 "arn"), "name" (rawinput445076 "name"), "renderingEngine" (rawinput445076 "renderingEngine"), "lastUpdatedAt" (rawinput445076 "lastUpdatedAt"), "robotSoftwareSuite" (rawinput445076 "robotSoftwareSuite"), "version" (rawinput445076 "version"), "simulationSoftwareSuite" (rawinput445076 "simulationSoftwareSuite")}] (clojure.core/cond-> {} (letvar445078 "sources") (clojure.core/assoc :sources (deser-sources (clojure.core/get-in letvar445078 ["sources"]))) (letvar445078 "revisionId") (clojure.core/assoc :revision-id (deser-revision-id (clojure.core/get-in letvar445078 ["revisionId"]))) (letvar445078 "arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar445078 ["arn"]))) (letvar445078 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar445078 ["name"]))) (letvar445078 "renderingEngine") (clojure.core/assoc :rendering-engine (deser-rendering-engine (clojure.core/get-in letvar445078 ["renderingEngine"]))) (letvar445078 "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-last-updated-at (clojure.core/get-in letvar445078 ["lastUpdatedAt"]))) (letvar445078 "robotSoftwareSuite") (clojure.core/assoc :robot-software-suite (deser-robot-software-suite (clojure.core/get-in letvar445078 ["robotSoftwareSuite"]))) (letvar445078 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar445078 ["version"]))) (letvar445078 "simulationSoftwareSuite") (clojure.core/assoc :simulation-software-suite (deser-simulation-software-suite (clojure.core/get-in letvar445078 ["simulationSoftwareSuite"])))))))

(clojure.core/defn- response-delete-simulation-application-response ([input] (response-delete-simulation-application-response nil input)) ([resultWrapper445080 input] (clojure.core/let [rawinput445079 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar445081 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/vpc-config (clojure.spec.alpha/and :portkey.aws.robomaker/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/output-location (clojure.spec.alpha/and :portkey.aws.robomaker/output-location))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/failure-behavior (clojure.spec.alpha/and :portkey.aws.robomaker/failure-behavior))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/max-job-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.robomaker/job-duration))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/simulation-time-millis (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-time-millis))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/status (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/simulation-applications (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/robot-applications (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job/iam-role (clojure.spec.alpha/and :portkey.aws.robomaker/iam-role))
(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.simulation-job/vpc-config :portkey.aws.robomaker.simulation-job/output-location :portkey.aws.robomaker.simulation-job/failure-behavior :portkey.aws.robomaker.simulation-job/arn :portkey.aws.robomaker.simulation-job/max-job-duration-in-seconds :portkey.aws.robomaker.simulation-job/tags :portkey.aws.robomaker.simulation-job/simulation-time-millis :portkey.aws.robomaker.simulation-job/client-request-token :portkey.aws.robomaker.simulation-job/name :portkey.aws.robomaker.simulation-job/status :portkey.aws.robomaker.simulation-job/last-updated-at :portkey.aws.robomaker.simulation-job/simulation-applications :portkey.aws.robomaker.simulation-job/robot-applications :portkey.aws.robomaker.simulation-job/failure-code :portkey.aws.robomaker.simulation-job/failure-reason :portkey.aws.robomaker.simulation-job/iam-role]))

(clojure.spec.alpha/def :portkey.aws.robomaker/fleets (clojure.spec.alpha/coll-of :portkey.aws.robomaker/fleet :min-count 0 :max-count 200))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-deployment-summary (clojure.spec.alpha/coll-of :portkey.aws.robomaker/robot-deployment))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/deployment-application-configs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/deployment-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-response/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-deployment-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-deployment-job-response/arn :portkey.aws.robomaker.create-deployment-job-response/created-at :portkey.aws.robomaker.create-deployment-job-response/tags :portkey.aws.robomaker.create-deployment-job-response/deployment-application-configs :portkey.aws.robomaker.create-deployment-job-response/deployment-config :portkey.aws.robomaker.create-deployment-job-response/status :portkey.aws.robomaker.create-deployment-job-response/failure-code :portkey.aws.robomaker.create-deployment-job-response/fleet :portkey.aws.robomaker.create-deployment-job-response/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-job-error-code #{"PreLaunchFileFailure" "GreengrassGroupVersionDoesNotExist" "MissingRobotApplicationArchitecture" "MissingRobotDeploymentResource" :bad-permission-error :greengrass-deployment-failed :missing-robot-application-architecture :greengrass-group-version-does-not-exist :missing-robot-architecture :robot-deployment-no-response "BadPermissionError" "FailureThresholdBreached" :internal-server-error :extracting-bundle-failure :post-launch-file-failure "PostLaunchFileFailure" "MissingRobotArchitecture" :failure-threshold-breached :missing-robot-deployment-resource "GreengrassDeploymentFailed" "InternalServerError" "ResourceNotFound" "RobotDeploymentNoResponse" :resource-not-found :pre-launch-file-failure "ExtractingBundleFailure"})

(clojure.spec.alpha/def :portkey.aws.robomaker.robot/green-grass-group-id (clojure.spec.alpha/and :portkey.aws.robomaker/id))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/last-deployment-job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/last-deployment-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/fleet-arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot/status (clojure.spec.alpha/and :portkey.aws.robomaker/robot-status))
(clojure.spec.alpha/def :portkey.aws.robomaker/robot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.robot/green-grass-group-id :portkey.aws.robomaker.robot/last-deployment-job :portkey.aws.robomaker.robot/architecture :portkey.aws.robomaker.robot/arn :portkey.aws.robomaker.robot/created-at :portkey.aws.robomaker.robot/last-deployment-time :portkey.aws.robomaker.robot/fleet-arn :portkey.aws.robomaker.robot/name :portkey.aws.robomaker.robot/status]))

(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-config/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-config/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-config/launch-config (clojure.spec.alpha/and :portkey.aws.robomaker/launch-config))
(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-application-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.simulation-application-config/application :portkey.aws.robomaker.simulation-application-config/launch-config] :opt-un [:portkey.aws.robomaker.simulation-application-config/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/sources (clojure.spec.alpha/and :portkey.aws.robomaker/source-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-simulation-application-request/name :portkey.aws.robomaker.create-simulation-application-request/sources :portkey.aws.robomaker.create-simulation-application-request/simulation-software-suite :portkey.aws.robomaker.create-simulation-application-request/robot-software-suite :portkey.aws.robomaker.create-simulation-application-request/rendering-engine] :opt-un [:portkey.aws.robomaker.create-simulation-application-request/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.filter/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.filter/values (clojure.spec.alpha/and :portkey.aws.robomaker/filter-values))
(clojure.spec.alpha/def :portkey.aws.robomaker/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.filter/name :portkey.aws.robomaker.filter/values]))

(clojure.spec.alpha/def :portkey.aws.robomaker/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\-=]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-application-summaries (clojure.spec.alpha/coll-of :portkey.aws.robomaker/robot-application-summary :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-request/sources (clojure.spec.alpha/and :portkey.aws.robomaker/source-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-request/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-request/current-revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/update-robot-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.update-robot-application-request/application :portkey.aws.robomaker.update-robot-application-request/sources :portkey.aws.robomaker.update-robot-application-request/robot-software-suite] :opt-un [:portkey.aws.robomaker.update-robot-application-request/current-revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-request/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-robot-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-robot-application-request/application] :opt-un [:portkey.aws.robomaker.describe-robot-application-request/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config/subnets (clojure.spec.alpha/and :portkey.aws.robomaker/subnets))
(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config/security-groups (clojure.spec.alpha/and :portkey.aws.robomaker/security-groups))
(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config/assign-public-ip (clojure.spec.alpha/and :portkey.aws.robomaker/boolean))
(clojure.spec.alpha/def :portkey.aws.robomaker/vpc-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.vpc-config/subnets] :opt-un [:portkey.aws.robomaker.vpc-config/security-groups :portkey.aws.robomaker.vpc-config/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-application-configs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/simulation-application-config :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-software-suite/name (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite-type))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-software-suite/version (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite-version-type))
(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-software-suite (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.simulation-software-suite/name :portkey.aws.robomaker.simulation-software-suite/version]))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-status #{"Failed" :no-response "Registered" :pending-new-deployment :in-sync "Deploying" "PendingNewDeployment" :available :deploying "InSync" "Available" :registered "NoResponse" :failed})

(clojure.spec.alpha/def :portkey.aws.robomaker.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.robot-software-suite/name (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite-type))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-software-suite/version (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite-version-type))
(clojure.spec.alpha/def :portkey.aws.robomaker/robot-software-suite (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.robot-software-suite/name :portkey.aws.robomaker.robot-software-suite/version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/sync-deployment-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.sync-deployment-job-request/client-request-token :portkey.aws.robomaker.sync-deployment-job-request/fleet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-fleets-response/fleet-details (clojure.spec.alpha/and :portkey.aws.robomaker/fleets))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-fleets-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-fleets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-fleets-response/fleet-details :portkey.aws.robomaker.list-fleets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker.source-config/s-3-bucket (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.robomaker.source-config/s-3-key (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-key))
(clojure.spec.alpha/def :portkey.aws.robomaker.source-config/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker/source-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.source-config/s-3-bucket :portkey.aws.robomaker.source-config/s-3-key :portkey.aws.robomaker.source-config/architecture]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-request/job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-simulation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-simulation-job-request/job] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.concurrent-deployment-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/concurrent-deployment-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.concurrent-deployment-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/subnets (clojure.spec.alpha/coll-of :portkey.aws.robomaker/generic-string :min-count 1 :max-count 16))

(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/last-deployment-status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/last-deployment-job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.fleet/last-deployment-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker/fleet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.fleet/name :portkey.aws.robomaker.fleet/arn :portkey.aws.robomaker.fleet/created-at :portkey.aws.robomaker.fleet/last-deployment-status :portkey.aws.robomaker.fleet/last-deployment-job :portkey.aws.robomaker.fleet/last-deployment-time]))

(clojure.spec.alpha/def :portkey.aws.robomaker/job-duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.robomaker.source/s-3-bucket (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.robomaker.source/s-3-key (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-key))
(clojure.spec.alpha/def :portkey.aws.robomaker.source/etag (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-etag))
(clojure.spec.alpha/def :portkey.aws.robomaker.source/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker/source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.source/s-3-bucket :portkey.aws.robomaker.source/s-3-key :portkey.aws.robomaker.source/etag :portkey.aws.robomaker.source/architecture]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-jobs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/simulation-job))

(clojure.spec.alpha/def :portkey.aws.robomaker.delete-robot-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.delete-robot-application-request/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker/delete-robot-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.delete-robot-application-request/application] :opt-un [:portkey.aws.robomaker.delete-robot-application-request/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-robots-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robots-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robots-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-robots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-robots-request/next-token :portkey.aws.robomaker.list-robots-request/max-results :portkey.aws.robomaker.list-robots-request/filters]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-request/version-qualifier (clojure.spec.alpha/and :portkey.aws.robomaker/version-qualifier))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-robot-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-robot-applications-request/version-qualifier :portkey.aws.robomaker.list-robot-applications-request/next-token :portkey.aws.robomaker.list-robot-applications-request/max-results :portkey.aws.robomaker.list-robot-applications-request/filters]))

(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/status (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/simulation-application-names (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-names))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-job-summary/robot-application-names (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-names))
(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-job-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.simulation-job-summary/arn :portkey.aws.robomaker.simulation-job-summary/last-updated-at :portkey.aws.robomaker.simulation-job-summary/name :portkey.aws.robomaker.simulation-job-summary/status :portkey.aws.robomaker.simulation-job-summary/simulation-application-names :portkey.aws.robomaker.simulation-job-summary/robot-application-names]))

(clojure.spec.alpha/def :portkey.aws.robomaker/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.robomaker/security-groups (clojure.spec.alpha/coll-of :portkey.aws.robomaker/generic-string :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.robomaker.delete-fleet-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/delete-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.delete-fleet-request/fleet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/version-qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"ALL" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/robots (clojure.spec.alpha/and :portkey.aws.robomaker/robots))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/last-deployment-status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/last-deployment-job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/last-deployment-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-fleet-response/name :portkey.aws.robomaker.describe-fleet-response/arn :portkey.aws.robomaker.describe-fleet-response/robots :portkey.aws.robomaker.describe-fleet-response/created-at :portkey.aws.robomaker.describe-fleet-response/last-deployment-status :portkey.aws.robomaker.describe-fleet-response/last-deployment-job :portkey.aws.robomaker.describe-fleet-response/last-deployment-time :portkey.aws.robomaker.describe-fleet-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-launch-config/package-name (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-launch-config/pre-launch-file (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-launch-config/launch-file (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-launch-config/post-launch-file (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-launch-config/environment-variables (clojure.spec.alpha/and :portkey.aws.robomaker/environment-variable-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-launch-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.deployment-launch-config/package-name :portkey.aws.robomaker.deployment-launch-config/launch-file] :opt-un [:portkey.aws.robomaker.deployment-launch-config/pre-launch-file :portkey.aws.robomaker.deployment-launch-config/post-launch-file :portkey.aws.robomaker.deployment-launch-config/environment-variables]))

(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-application-config/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-application-config/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-version))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-application-config/launch-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-launch-config))
(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-application-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.deployment-application-config/application :portkey.aws.robomaker.deployment-application-config/application-version :portkey.aws.robomaker.deployment-application-config/launch-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-request/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-request/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-request/greengrass-group-id (clojure.spec.alpha/and :portkey.aws.robomaker/id))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-robot-request/name :portkey.aws.robomaker.create-robot-request/architecture :portkey.aws.robomaker.create-robot-request/greengrass-group-id] :opt-un [:portkey.aws.robomaker.create-robot-request/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.progress-detail/current-progress (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.progress-detail/target-resource (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker/progress-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.progress-detail/current-progress :portkey.aws.robomaker.progress-detail/target-resource]))

(clojure.spec.alpha/def :portkey.aws.robomaker.delete-robot-request/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/delete-robot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.delete-robot-request/robot] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9 _.\-\/+=:]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.register-robot-response/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.register-robot-response/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/register-robot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.register-robot-response/fleet :portkey.aws.robomaker.register-robot-response/robot]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-deployment-jobs-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-deployment-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-deployment-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-deployment-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-deployment-jobs-request/filters :portkey.aws.robomaker.list-deployment-jobs-request/next-token :portkey.aws.robomaker.list-deployment-jobs-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.robomaker/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 2048)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-\/+=]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-config/concurrent-deployment-percentage (clojure.spec.alpha/and :portkey.aws.robomaker/percentage))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-config/failure-threshold-percentage (clojure.spec.alpha/and :portkey.aws.robomaker/percentage))
(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.deployment-config/concurrent-deployment-percentage :portkey.aws.robomaker.deployment-config/failure-threshold-percentage]))

(clojure.spec.alpha/def :portkey.aws.robomaker.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/iam-role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:.*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/sources (clojure.spec.alpha/and :portkey.aws.robomaker/source-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-request/current-revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/update-simulation-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.update-simulation-application-request/application :portkey.aws.robomaker.update-simulation-application-request/sources :portkey.aws.robomaker.update-simulation-application-request/simulation-software-suite :portkey.aws.robomaker.update-simulation-application-request/robot-software-suite :portkey.aws.robomaker.update-simulation-application-request/rendering-engine] :opt-un [:portkey.aws.robomaker.update-simulation-application-request/current-revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-application-names (clojure.spec.alpha/coll-of :portkey.aws.robomaker/name :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/deployment-start-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/deployment-finish-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/status (clojure.spec.alpha/and :portkey.aws.robomaker/robot-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/progress-detail (clojure.spec.alpha/and :portkey.aws.robomaker/progress-detail))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-deployment/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker/robot-deployment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.robot-deployment/arn :portkey.aws.robomaker.robot-deployment/deployment-start-time :portkey.aws.robomaker.robot-deployment/deployment-finish-time :portkey.aws.robomaker.robot-deployment/status :portkey.aws.robomaker.robot-deployment/progress-detail :portkey.aws.robomaker.robot-deployment/failure-reason :portkey.aws.robomaker.robot-deployment/failure-code]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-jobs-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-simulation-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-simulation-jobs-request/next-token :portkey.aws.robomaker.list-simulation-jobs-request/max-results :portkey.aws.robomaker.list-simulation-jobs-request/filters]))

(clojure.spec.alpha/def :portkey.aws.robomaker.resource-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.resource-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-software-suite-type #{"ROS" :ros})

(clojure.spec.alpha/def :portkey.aws.robomaker/arns (clojure.spec.alpha/coll-of :portkey.aws.robomaker/arn :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.robomaker.batch-describe-simulation-job-response/jobs (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-jobs))
(clojure.spec.alpha/def :portkey.aws.robomaker.batch-describe-simulation-job-response/unprocessed-jobs (clojure.spec.alpha/and :portkey.aws.robomaker/arns))
(clojure.spec.alpha/def :portkey.aws.robomaker/batch-describe-simulation-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.batch-describe-simulation-job-response/jobs :portkey.aws.robomaker.batch-describe-simulation-job-response/unprocessed-jobs]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-request/job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-deployment-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-deployment-job-request/job] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/vpc-config (clojure.spec.alpha/and :portkey.aws.robomaker/vpc-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/output-location (clojure.spec.alpha/and :portkey.aws.robomaker/output-location))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/failure-behavior (clojure.spec.alpha/and :portkey.aws.robomaker/failure-behavior))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/max-job-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.robomaker/job-duration))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/simulation-applications (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/robot-applications (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-request/iam-role (clojure.spec.alpha/and :portkey.aws.robomaker/iam-role))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-simulation-job-request/max-job-duration-in-seconds :portkey.aws.robomaker.create-simulation-job-request/iam-role] :opt-un [:portkey.aws.robomaker.create-simulation-job-request/vpc-config :portkey.aws.robomaker.create-simulation-job-request/output-location :portkey.aws.robomaker.create-simulation-job-request/failure-behavior :portkey.aws.robomaker.create-simulation-job-request/tags :portkey.aws.robomaker.create-simulation-job-request/client-request-token :portkey.aws.robomaker.create-simulation-job-request/simulation-applications :portkey.aws.robomaker.create-simulation-job-request/robot-applications]))

(clojure.spec.alpha/def :portkey.aws.robomaker/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/restart-simulation-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/last-updated-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-application-summaries (clojure.spec.alpha/coll-of :portkey.aws.robomaker/simulation-application-summary :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.robomaker/cancel-simulation-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.register-robot-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.register-robot-request/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/register-robot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.register-robot-request/fleet :portkey.aws.robomaker.register-robot-request/robot] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/filter-values (clojure.spec.alpha/coll-of :portkey.aws.robomaker/name :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker/environment-variable-map (clojure.spec.alpha/map-of :portkey.aws.robomaker/environment-variable-key :portkey.aws.robomaker/environment-variable-value))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-response/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-simulation-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-simulation-application-response/sources :portkey.aws.robomaker.describe-simulation-application-response/revision-id :portkey.aws.robomaker.describe-simulation-application-response/arn :portkey.aws.robomaker.describe-simulation-application-response/tags :portkey.aws.robomaker.describe-simulation-application-response/name :portkey.aws.robomaker.describe-simulation-application-response/rendering-engine :portkey.aws.robomaker.describe-simulation-application-response/last-updated-at :portkey.aws.robomaker.describe-simulation-application-response/robot-software-suite :portkey.aws.robomaker.describe-simulation-application-response/version :portkey.aws.robomaker.describe-simulation-application-response/simulation-software-suite]))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/vpc-config (clojure.spec.alpha/and :portkey.aws.robomaker/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/output-location (clojure.spec.alpha/and :portkey.aws.robomaker/output-location))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/failure-behavior (clojure.spec.alpha/and :portkey.aws.robomaker/failure-behavior))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/max-job-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.robomaker/job-duration))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/simulation-time-millis (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-time-millis))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/simulation-applications (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/robot-applications (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-job-response/iam-role (clojure.spec.alpha/and :portkey.aws.robomaker/iam-role))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-simulation-job-response/vpc-config :portkey.aws.robomaker.create-simulation-job-response/output-location :portkey.aws.robomaker.create-simulation-job-response/failure-behavior :portkey.aws.robomaker.create-simulation-job-response/arn :portkey.aws.robomaker.create-simulation-job-response/max-job-duration-in-seconds :portkey.aws.robomaker.create-simulation-job-response/tags :portkey.aws.robomaker.create-simulation-job-response/simulation-time-millis :portkey.aws.robomaker.create-simulation-job-response/client-request-token :portkey.aws.robomaker.create-simulation-job-response/status :portkey.aws.robomaker.create-simulation-job-response/last-updated-at :portkey.aws.robomaker.create-simulation-job-response/simulation-applications :portkey.aws.robomaker.create-simulation-job-response/robot-applications :portkey.aws.robomaker.create-simulation-job-response/failure-code :portkey.aws.robomaker.create-simulation-job-response/iam-role]))

(clojure.spec.alpha/def :portkey.aws.robomaker.deregister-robot-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.deregister-robot-request/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/deregister-robot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.deregister-robot-request/fleet :portkey.aws.robomaker.deregister-robot-request/robot] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.tag-resource-request/resource-arn :portkey.aws.robomaker.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-simulation-application-response/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker/update-simulation-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.update-simulation-application-response/sources :portkey.aws.robomaker.update-simulation-application-response/revision-id :portkey.aws.robomaker.update-simulation-application-response/arn :portkey.aws.robomaker.update-simulation-application-response/name :portkey.aws.robomaker.update-simulation-application-response/rendering-engine :portkey.aws.robomaker.update-simulation-application-response/last-updated-at :portkey.aws.robomaker.update-simulation-application-response/robot-software-suite :portkey.aws.robomaker.update-simulation-application-response/version :portkey.aws.robomaker.update-simulation-application-response/simulation-software-suite]))

(clojure.spec.alpha/def :portkey.aws.robomaker.delete-simulation-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.delete-simulation-application-request/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker/delete-simulation-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.delete-simulation-application-request/application] :opt-un [:portkey.aws.robomaker.delete-simulation-application-request/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker/failure-behavior #{"Continue" :continue :fail "Fail"})

(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-config/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-config/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-config/launch-config (clojure.spec.alpha/and :portkey.aws.robomaker/launch-config))
(clojure.spec.alpha/def :portkey.aws.robomaker/robot-application-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.robot-application-config/application :portkey.aws.robomaker.robot-application-config/launch-config] :opt-un [:portkey.aws.robomaker.robot-application-config/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-request/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-request/sources (clojure.spec.alpha/and :portkey.aws.robomaker/source-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-request/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-robot-application-request/name :portkey.aws.robomaker.create-robot-application-request/sources :portkey.aws.robomaker.create-robot-application-request/robot-software-suite] :opt-un [:portkey.aws.robomaker.create-robot-application-request/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker/delete-robot-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.robomaker/tag-key))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-request/current-revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-application-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-robot-application-version-request/application] :opt-un [:portkey.aws.robomaker.create-robot-application-version-request/current-revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-robots-response/robots (clojure.spec.alpha/and :portkey.aws.robomaker/robots))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robots-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-robots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-robots-response/robots :portkey.aws.robomaker.list-robots-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-summary/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-summary/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-summary/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.simulation-application-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-application-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.simulation-application-summary/name :portkey.aws.robomaker.simulation-application-summary/arn :portkey.aws.robomaker.simulation-application-summary/version :portkey.aws.robomaker.simulation-application-summary/last-updated-at]))

(clojure.spec.alpha/def :portkey.aws.robomaker.deregister-robot-response/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.deregister-robot-response/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/deregister-robot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.deregister-robot-response/fleet :portkey.aws.robomaker.deregister-robot-response/robot]))

(clojure.spec.alpha/def :portkey.aws.robomaker.launch-config/package-name (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.launch-config/launch-file (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.launch-config/environment-variables (clojure.spec.alpha/and :portkey.aws.robomaker/environment-variable-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/launch-config (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.launch-config/package-name :portkey.aws.robomaker.launch-config/launch-file] :opt-un [:portkey.aws.robomaker.launch-config/environment-variables]))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/greengrass-group-id (clojure.spec.alpha/and :portkey.aws.robomaker/id))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-robot-response/arn :portkey.aws.robomaker.create-robot-response/name :portkey.aws.robomaker.create-robot-response/created-at :portkey.aws.robomaker.create-robot-response/greengrass-group-id :portkey.aws.robomaker.create-robot-response/architecture :portkey.aws.robomaker.create-robot-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-summary/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-summary/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-summary/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.robot-application-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker/robot-application-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.robot-application-summary/name :portkey.aws.robomaker.robot-application-summary/arn :portkey.aws.robomaker.robot-application-summary/version :portkey.aws.robomaker.robot-application-summary/last-updated-at]))

(clojure.spec.alpha/def :portkey.aws.robomaker.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-application-names (clojure.spec.alpha/coll-of :portkey.aws.robomaker/name :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-application-configs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/robot-application-config :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-fleet-response/arn :portkey.aws.robomaker.create-fleet-response/name :portkey.aws.robomaker.create-fleet-response/created-at :portkey.aws.robomaker.create-fleet-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker/environment-variable-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.robomaker/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 0 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9 _.\-\/+=:]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-request/deployment-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-request/deployment-application-configs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-deployment-job-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-deployment-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-deployment-job-request/client-request-token :portkey.aws.robomaker.create-deployment-job-request/fleet :portkey.aws.robomaker.create-deployment-job-request/deployment-application-configs] :opt-un [:portkey.aws.robomaker.create-deployment-job-request/deployment-config :portkey.aws.robomaker.create-deployment-job-request/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.idempotent-parameter-mismatch-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.robomaker.cancel-simulation-job-request/job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/cancel-simulation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.cancel-simulation-job-request/job] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-request/robot (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-robot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-robot-request/robot] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/deployment-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/deployment-application-configs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.sync-deployment-job-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker/sync-deployment-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.sync-deployment-job-response/arn :portkey.aws.robomaker.sync-deployment-job-response/fleet :portkey.aws.robomaker.sync-deployment-job-response/status :portkey.aws.robomaker.sync-deployment-job-response/deployment-config :portkey.aws.robomaker.sync-deployment-job-response/deployment-application-configs :portkey.aws.robomaker.sync-deployment-job-response/failure-reason :portkey.aws.robomaker.sync-deployment-job-response/failure-code :portkey.aws.robomaker.sync-deployment-job-response/created-at]))

(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[0-9]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/robot-software-suite-version-type #{"Kinetic" :kinetic})

(clojure.spec.alpha/def :portkey.aws.robomaker/tag-map (clojure.spec.alpha/map-of :portkey.aws.robomaker/tag-key :portkey.aws.robomaker/tag-value))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-request/version-qualifier (clojure.spec.alpha/and :portkey.aws.robomaker/version-qualifier))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-simulation-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-simulation-applications-request/version-qualifier :portkey.aws.robomaker.list-simulation-applications-request/next-token :portkey.aws.robomaker.list-simulation-applications-request/max-results :portkey.aws.robomaker.list-simulation-applications-request/filters]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-job-status #{"Failed" :restarting :preparing :pending :completed "Restarting" "Preparing" :running :running-failed :terminating :canceled "RunningFailed" "Canceled" "Terminating" :terminated "Running" "Terminated" "Completed" "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-response/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-simulation-application-response/sources :portkey.aws.robomaker.create-simulation-application-response/revision-id :portkey.aws.robomaker.create-simulation-application-response/arn :portkey.aws.robomaker.create-simulation-application-response/tags :portkey.aws.robomaker.create-simulation-application-response/name :portkey.aws.robomaker.create-simulation-application-response/rendering-engine :portkey.aws.robomaker.create-simulation-application-response/last-updated-at :portkey.aws.robomaker.create-simulation-application-response/robot-software-suite :portkey.aws.robomaker.create-simulation-application-response/version :portkey.aws.robomaker.create-simulation-application-response/simulation-software-suite]))

(clojure.spec.alpha/def :portkey.aws.robomaker/percentage (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-response/robot-application-summaries (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-summaries))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-robot-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-robot-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-robot-applications-response/robot-application-summaries :portkey.aws.robomaker.list-robot-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-fleet-request/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-fleet-request/fleet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-application-request/application-version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-simulation-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.describe-simulation-application-request/application] :opt-un [:portkey.aws.robomaker.describe-simulation-application-request/application-version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.batch-describe-simulation-job-request/jobs (clojure.spec.alpha/and :portkey.aws.robomaker/arns))
(clojure.spec.alpha/def :portkey.aws.robomaker/batch-describe-simulation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.batch-describe-simulation-job-request/jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #".*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/filters (clojure.spec.alpha/coll-of :portkey.aws.robomaker/filter :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1224)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:.*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-version-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-application-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-robot-application-version-response/arn :portkey.aws.robomaker.create-robot-application-version-response/name :portkey.aws.robomaker.create-robot-application-version-response/version :portkey.aws.robomaker.create-robot-application-version-response/sources :portkey.aws.robomaker.create-robot-application-version-response/robot-software-suite :portkey.aws.robomaker.create-robot-application-version-response/last-updated-at :portkey.aws.robomaker.create-robot-application-version-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker/created-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.robomaker/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 3 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 63)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-z0-9][a-z0-9\-]*[a-z0-9]" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/revision-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 40)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.update-robot-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/update-robot-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.update-robot-application-response/arn :portkey.aws.robomaker.update-robot-application-response/name :portkey.aws.robomaker.update-robot-application-response/version :portkey.aws.robomaker.update-robot-application-response/sources :portkey.aws.robomaker.update-robot-application-response/robot-software-suite :portkey.aws.robomaker.update-robot-application-response/last-updated-at :portkey.aws.robomaker.update-robot-application-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker/architecture #{:arm-64 :armhf "X86_64" :x-86-64 "ARM64" "ARMHF"})

(clojure.spec.alpha/def :portkey.aws.robomaker.restart-simulation-job-request/job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker/restart-simulation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.restart-simulation-job-request/job] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/deployment-application-configs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/deployment-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.deployment-job/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.deployment-job/arn :portkey.aws.robomaker.deployment-job/fleet :portkey.aws.robomaker.deployment-job/status :portkey.aws.robomaker.deployment-job/deployment-application-configs :portkey.aws.robomaker.deployment-job/deployment-config :portkey.aws.robomaker.deployment-job/failure-reason :portkey.aws.robomaker.deployment-job/failure-code :portkey.aws.robomaker.deployment-job/created-at]))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-response/simulation-application-summaries (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-summaries))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-simulation-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-simulation-applications-response/simulation-application-summaries :portkey.aws.robomaker.list-simulation-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-software-suite-type #{"Gazebo" :gazebo})

(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-status #{"Failed" :preparing :in-progress "Succeeded" :pending "Preparing" "InProgress" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.robomaker.list-fleets-request/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-fleets-request/max-results (clojure.spec.alpha/and :portkey.aws.robomaker/max-results))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-fleets-request/filters (clojure.spec.alpha/and :portkey.aws.robomaker/filters))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-fleets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-fleets-request/next-token :portkey.aws.robomaker.list-fleets-request/max-results :portkey.aws.robomaker.list-fleets-request/filters]))

(clojure.spec.alpha/def :portkey.aws.robomaker.rendering-engine/name (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine-type))
(clojure.spec.alpha/def :portkey.aws.robomaker.rendering-engine/version (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine-version-type))
(clojure.spec.alpha/def :portkey.aws.robomaker/rendering-engine (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.rendering-engine/name :portkey.aws.robomaker.rendering-engine/version]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/last-deployment-job (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/architecture (clojure.spec.alpha/and :portkey.aws.robomaker/architecture))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/last-deployment-time (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/fleet-arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/robot-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-response/greengrass-group-id (clojure.spec.alpha/and :portkey.aws.robomaker/id))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-robot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-robot-response/last-deployment-job :portkey.aws.robomaker.describe-robot-response/architecture :portkey.aws.robomaker.describe-robot-response/arn :portkey.aws.robomaker.describe-robot-response/created-at :portkey.aws.robomaker.describe-robot-response/last-deployment-time :portkey.aws.robomaker.describe-robot-response/fleet-arn :portkey.aws.robomaker.describe-robot-response/tags :portkey.aws.robomaker.describe-robot-response/name :portkey.aws.robomaker.describe-robot-response/status :portkey.aws.robomaker.describe-robot-response/greengrass-group-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.robomaker/rendering-engine-version-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"1.x" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/vpc-config (clojure.spec.alpha/and :portkey.aws.robomaker/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/output-location (clojure.spec.alpha/and :portkey.aws.robomaker/output-location))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/failure-behavior (clojure.spec.alpha/and :portkey.aws.robomaker/failure-behavior))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/max-job-duration-in-seconds (clojure.spec.alpha/and :portkey.aws.robomaker/job-duration))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/simulation-time-millis (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-time-millis))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/client-request-token (clojure.spec.alpha/and :portkey.aws.robomaker/client-request-token))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/simulation-applications (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/robot-applications (clojure.spec.alpha/and :portkey.aws.robomaker/robot-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-simulation-job-response/iam-role (clojure.spec.alpha/and :portkey.aws.robomaker/iam-role))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-simulation-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-simulation-job-response/vpc-config :portkey.aws.robomaker.describe-simulation-job-response/output-location :portkey.aws.robomaker.describe-simulation-job-response/failure-behavior :portkey.aws.robomaker.describe-simulation-job-response/arn :portkey.aws.robomaker.describe-simulation-job-response/max-job-duration-in-seconds :portkey.aws.robomaker.describe-simulation-job-response/tags :portkey.aws.robomaker.describe-simulation-job-response/simulation-time-millis :portkey.aws.robomaker.describe-simulation-job-response/client-request-token :portkey.aws.robomaker.describe-simulation-job-response/name :portkey.aws.robomaker.describe-simulation-job-response/status :portkey.aws.robomaker.describe-simulation-job-response/last-updated-at :portkey.aws.robomaker.describe-simulation-job-response/simulation-applications :portkey.aws.robomaker.describe-simulation-job-response/robot-applications :portkey.aws.robomaker.describe-simulation-job-response/failure-code :portkey.aws.robomaker.describe-simulation-job-response/failure-reason :portkey.aws.robomaker.describe-simulation-job-response/iam-role]))

(clojure.spec.alpha/def :portkey.aws.robomaker/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(\$LATEST)|[0-9]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-deployment-jobs-response/deployment-jobs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-jobs))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-deployment-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-deployment-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.list-deployment-jobs-response/deployment-jobs :portkey.aws.robomaker.list-deployment-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-job-error-code #{:bad-permissions-user-credentials "RobotApplicationCrash" :bad-permissions-cloudwatch-logs "SimulationApplicationVersionMismatchedEtag" "BadPermissionsSimulationApplication" :wrong-region-s-3-output "InvalidBundleRobotApplication" :internal-service-error "InternalServiceError" :bad-permissions-simulation-application "BadPermissionsUserCredentials" "SubnetIpLimitExceeded" "BadPermissionsRobotApplication" "SimulationApplicationCrash" :wrong-region-simulation-application :simulation-application-version-mismatched-etag "BadPermissionsS3Output" :simulation-application-crash "ENILimitExceeded" "WrongRegionS3Output" "WrongRegionRobotApplication" :eni-limit-exceeded :robot-application-crash :wrong-region-robot-application "InvalidBundleSimulationApplication" :subnet-ip-limit-exceeded :invalid-bundle-robot-application :bad-permissions-robot-application :invalid-bundle-simulation-application "BadPermissionsCloudwatchLogs" :robot-application-version-mismatched-etag "RobotApplicationVersionMismatchedEtag" "WrongRegionSimulationApplication" :bad-permissions-s-3-output})

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-software-suite-version-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"7" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/robots (clojure.spec.alpha/coll-of :portkey.aws.robomaker/robot :min-count 0 :max-count 1000))

(clojure.spec.alpha/def :portkey.aws.robomaker/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 255)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_\-]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config-response/subnets (clojure.spec.alpha/and :portkey.aws.robomaker/subnets))
(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config-response/security-groups (clojure.spec.alpha/and :portkey.aws.robomaker/security-groups))
(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config-response/vpc-id (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker.vpc-config-response/assign-public-ip (clojure.spec.alpha/and :portkey.aws.robomaker/boolean))
(clojure.spec.alpha/def :portkey.aws.robomaker/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.vpc-config-response/subnets :portkey.aws.robomaker.vpc-config-response/security-groups :portkey.aws.robomaker.vpc-config-response/vpc-id :portkey.aws.robomaker.vpc-config-response/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-application-configs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/deployment-application-config :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-request/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-fleet-request/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-fleet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-fleet-request/name] :opt-un [:portkey.aws.robomaker.create-fleet-request/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker/environment-variable-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[A-Z_][A-Z0-9_]*" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.robomaker/rendering-engine-type #{"OGRE" :ogre})

(clojure.spec.alpha/def :portkey.aws.robomaker/source-configs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/source-config))

(clojure.spec.alpha/def :portkey.aws.robomaker/sources (clojure.spec.alpha/coll-of :portkey.aws.robomaker/source))

(clojure.spec.alpha/def :portkey.aws.robomaker.output-location/s-3-bucket (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.robomaker.output-location/s-3-prefix (clojure.spec.alpha/and :portkey.aws.robomaker/s-3-key))
(clojure.spec.alpha/def :portkey.aws.robomaker/output-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.output-location/s-3-bucket :portkey.aws.robomaker.output-location/s-3-prefix]))

(clojure.spec.alpha/def :portkey.aws.robomaker/delete-robot-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.robomaker/error-message))
(clojure.spec.alpha/def :portkey.aws.robomaker/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-robot-application-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-robot-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-robot-application-response/arn :portkey.aws.robomaker.describe-robot-application-response/name :portkey.aws.robomaker.describe-robot-application-response/version :portkey.aws.robomaker.describe-robot-application-response/sources :portkey.aws.robomaker.describe-robot-application-response/robot-software-suite :portkey.aws.robomaker.describe-robot-application-response/revision-id :portkey.aws.robomaker.describe-robot-application-response/last-updated-at :portkey.aws.robomaker.describe-robot-application-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker/s-3-etag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/created-at (clojure.spec.alpha/and :portkey.aws.robomaker/created-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/deployment-application-configs (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-application-configs))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/deployment-config (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-config))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/status (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-status))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/failure-code (clojure.spec.alpha/and :portkey.aws.robomaker/deployment-job-error-code))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/fleet (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/robot-deployment-summary (clojure.spec.alpha/and :portkey.aws.robomaker/robot-deployment-summary))
(clojure.spec.alpha/def :portkey.aws.robomaker.describe-deployment-job-response/failure-reason (clojure.spec.alpha/and :portkey.aws.robomaker/generic-string))
(clojure.spec.alpha/def :portkey.aws.robomaker/describe-deployment-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.describe-deployment-job-response/arn :portkey.aws.robomaker.describe-deployment-job-response/created-at :portkey.aws.robomaker.describe-deployment-job-response/tags :portkey.aws.robomaker.describe-deployment-job-response/deployment-application-configs :portkey.aws.robomaker.describe-deployment-job-response/deployment-config :portkey.aws.robomaker.describe-deployment-job-response/status :portkey.aws.robomaker.describe-deployment-job-response/failure-code :portkey.aws.robomaker.describe-deployment-job-response/fleet :portkey.aws.robomaker.describe-deployment-job-response/robot-deployment-summary :portkey.aws.robomaker.describe-deployment-job-response/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.robomaker/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/delete-fleet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-jobs-response/simulation-job-summaries (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-job-summaries))
(clojure.spec.alpha/def :portkey.aws.robomaker.list-simulation-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.robomaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.robomaker/list-simulation-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.list-simulation-jobs-response/simulation-job-summaries] :opt-un [:portkey.aws.robomaker.list-simulation-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.robomaker/id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1224))))

(clojure.spec.alpha/def :portkey.aws.robomaker.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.robomaker/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.robomaker/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.untag-resource-request/resource-arn :portkey.aws.robomaker.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.robomaker/simulation-job-summary :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-request/application (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-request/current-revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-application-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.robomaker.create-simulation-application-version-request/application] :opt-un [:portkey.aws.robomaker.create-simulation-application-version-request/current-revision-id]))

(clojure.spec.alpha/def :portkey.aws.robomaker/deployment-jobs (clojure.spec.alpha/coll-of :portkey.aws.robomaker/deployment-job :min-count 0 :max-count 200))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-robot-application-response/tags (clojure.spec.alpha/and :portkey.aws.robomaker/tag-map))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-robot-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-robot-application-response/arn :portkey.aws.robomaker.create-robot-application-response/name :portkey.aws.robomaker.create-robot-application-response/version :portkey.aws.robomaker.create-robot-application-response/sources :portkey.aws.robomaker.create-robot-application-response/robot-software-suite :portkey.aws.robomaker.create-robot-application-response/last-updated-at :portkey.aws.robomaker.create-robot-application-response/revision-id :portkey.aws.robomaker.create-robot-application-response/tags]))

(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/sources (clojure.spec.alpha/and :portkey.aws.robomaker/sources))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/revision-id (clojure.spec.alpha/and :portkey.aws.robomaker/revision-id))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/arn (clojure.spec.alpha/and :portkey.aws.robomaker/arn))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/name (clojure.spec.alpha/and :portkey.aws.robomaker/name))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/rendering-engine (clojure.spec.alpha/and :portkey.aws.robomaker/rendering-engine))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/last-updated-at (clojure.spec.alpha/and :portkey.aws.robomaker/last-updated-at))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/robot-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/robot-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/version (clojure.spec.alpha/and :portkey.aws.robomaker/version))
(clojure.spec.alpha/def :portkey.aws.robomaker.create-simulation-application-version-response/simulation-software-suite (clojure.spec.alpha/and :portkey.aws.robomaker/simulation-software-suite))
(clojure.spec.alpha/def :portkey.aws.robomaker/create-simulation-application-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.robomaker.create-simulation-application-version-response/sources :portkey.aws.robomaker.create-simulation-application-version-response/revision-id :portkey.aws.robomaker.create-simulation-application-version-response/arn :portkey.aws.robomaker.create-simulation-application-version-response/name :portkey.aws.robomaker.create-simulation-application-version-response/rendering-engine :portkey.aws.robomaker.create-simulation-application-version-response/last-updated-at :portkey.aws.robomaker.create-simulation-application-version-response/robot-software-suite :portkey.aws.robomaker.create-simulation-application-version-response/version :portkey.aws.robomaker.create-simulation-application-version-response/simulation-software-suite]))

(clojure.spec.alpha/def :portkey.aws.robomaker/simulation-time-millis clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.robomaker/delete-simulation-application-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.robomaker/boolean clojure.core/boolean?)

(clojure.core/defn tag-resource "Adds or edits tags for a AWS RoboMaker resource.\n Each tag consists of a tag key and a tag value. Tag keys and tag values are\nboth required, but tag values can be empty strings.\n For information about the rules that apply to tag keys and tag values, see\nUser-Defined Tag Restrictions\n(https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html)\nin the AWS Billing and Cost Management User Guide." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/tag-resource-response))

(clojure.core/defn deregister-robot "Deregisters a robot." ([deregister-robot-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-deregister-robot-request deregister-robot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/deregister-robot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deregisterRobot", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/deregister-robot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterRobot", :http.request.configuration/output-deser-fn response-deregister-robot-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef deregister-robot :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/deregister-robot-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/deregister-robot-response))

(clojure.core/defn list-fleets "Returns a list of fleets. You can optionally provide filters to retrieve\nspecific fleets." ([] (list-fleets {})) ([list-fleets-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-fleets-request list-fleets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-fleets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listFleets", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-fleets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFleets", :http.request.configuration/output-deser-fn response-list-fleets-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef list-fleets :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-fleets-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-fleets-response))

(clojure.core/defn list-simulation-applications "Returns a list of simulation applications. You can optionally provide filters to\nretrieve specific simulation applications." ([] (list-simulation-applications {})) ([list-simulation-applications-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-simulation-applications-request list-simulation-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-simulation-applications-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listSimulationApplications", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-simulation-applications-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSimulationApplications", :http.request.configuration/output-deser-fn response-list-simulation-applications-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-simulation-applications :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-simulation-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-simulation-applications-response))

(clojure.core/defn create-fleet "Creates a fleet, a logical group of robots running the same robot application." ([create-fleet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-fleet-request create-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createFleet", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFleet", :http.request.configuration/output-deser-fn response-create-fleet-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-fleet :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-fleet-response))

(clojure.core/defn describe-simulation-application "Describes a simulation application." ([describe-simulation-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-simulation-application-request describe-simulation-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-simulation-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeSimulationApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-simulation-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSimulationApplication", :http.request.configuration/output-deser-fn response-describe-simulation-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-simulation-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-simulation-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-simulation-application-response))

(clojure.core/defn update-simulation-application "Updates a simulation application." ([update-simulation-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-simulation-application-request update-simulation-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/update-simulation-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateSimulationApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/update-simulation-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSimulationApplication", :http.request.configuration/output-deser-fn response-update-simulation-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-simulation-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/update-simulation-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/update-simulation-application-response))

(clojure.core/defn cancel-simulation-job "Cancels the specified simulation job." ([cancel-simulation-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-cancel-simulation-job-request cancel-simulation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/cancel-simulation-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/cancelSimulationJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/cancel-simulation-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelSimulationJob", :http.request.configuration/output-deser-fn response-cancel-simulation-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef cancel-simulation-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/cancel-simulation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/cancel-simulation-job-response))

(clojure.core/defn describe-simulation-job "Describes a simulation job." ([describe-simulation-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-simulation-job-request describe-simulation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-simulation-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeSimulationJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-simulation-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSimulationJob", :http.request.configuration/output-deser-fn response-describe-simulation-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-simulation-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-simulation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-simulation-job-response))

(clojure.core/defn delete-simulation-application "Deletes a simulation application." ([delete-simulation-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-simulation-application-request delete-simulation-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/delete-simulation-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteSimulationApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/delete-simulation-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSimulationApplication", :http.request.configuration/output-deser-fn response-delete-simulation-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-simulation-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/delete-simulation-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/delete-simulation-application-response))

(clojure.core/defn delete-robot "Deletes a robot." ([delete-robot-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-robot-request delete-robot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/delete-robot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteRobot", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/delete-robot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRobot", :http.request.configuration/output-deser-fn response-delete-robot-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-robot :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/delete-robot-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/delete-robot-response))

(clojure.core/defn list-simulation-jobs "Returns a list of simulation jobs. You can optionally provide filters to\nretrieve specific simulation jobs." ([] (list-simulation-jobs {})) ([list-simulation-jobs-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-simulation-jobs-request list-simulation-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-simulation-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listSimulationJobs", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-simulation-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSimulationJobs", :http.request.configuration/output-deser-fn response-list-simulation-jobs-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef list-simulation-jobs :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-simulation-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-simulation-jobs-response))

(clojure.core/defn delete-robot-application "Deletes a robot application." ([delete-robot-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-robot-application-request delete-robot-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/delete-robot-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteRobotApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/delete-robot-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRobotApplication", :http.request.configuration/output-deser-fn response-delete-robot-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef delete-robot-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/delete-robot-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/delete-robot-application-response))

(clojure.core/defn restart-simulation-job "Restarts a running simulation job." ([restart-simulation-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-restart-simulation-job-request restart-simulation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/restart-simulation-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/restartSimulationJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/restart-simulation-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestartSimulationJob", :http.request.configuration/output-deser-fn response-restart-simulation-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef restart-simulation-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/restart-simulation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/restart-simulation-job-response))

(clojure.core/defn create-simulation-application "Creates a simulation application." ([create-simulation-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-simulation-application-request create-simulation-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-simulation-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createSimulationApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-simulation-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSimulationApplication", :http.request.configuration/output-deser-fn response-create-simulation-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceAlreadyExistsException" :portkey.aws.robomaker/resource-already-exists-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-simulation-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-simulation-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-simulation-application-response))

(clojure.core/defn batch-describe-simulation-job "Describes one or more simulation jobs." ([batch-describe-simulation-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-describe-simulation-job-request batch-describe-simulation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/batch-describe-simulation-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/batchDescribeSimulationJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/batch-describe-simulation-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDescribeSimulationJob", :http.request.configuration/output-deser-fn response-batch-describe-simulation-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef batch-describe-simulation-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/batch-describe-simulation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/batch-describe-simulation-job-response))

(clojure.core/defn create-simulation-application-version "Creates a simulation application with a specific revision id." ([create-simulation-application-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-simulation-application-version-request create-simulation-application-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-simulation-application-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createSimulationApplicationVersion", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-simulation-application-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSimulationApplicationVersion", :http.request.configuration/output-deser-fn response-create-simulation-application-version-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-simulation-application-version :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-simulation-application-version-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-simulation-application-version-response))

(clojure.core/defn list-deployment-jobs "Returns a list of deployment jobs for a fleet. You can optionally provide\nfilters to retrieve specific deployment jobs." ([] (list-deployment-jobs {})) ([list-deployment-jobs-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-deployment-jobs-request list-deployment-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-deployment-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listDeploymentJobs", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-deployment-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeploymentJobs", :http.request.configuration/output-deser-fn response-list-deployment-jobs-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef list-deployment-jobs :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-deployment-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-deployment-jobs-response))

(clojure.core/defn describe-robot "Describes a robot." ([describe-robot-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-robot-request describe-robot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-robot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeRobot", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-robot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRobot", :http.request.configuration/output-deser-fn response-describe-robot-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-robot :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-robot-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-robot-response))

(clojure.core/defn list-tags-for-resource "Lists all tags on a AWS RoboMaker resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-tags-for-resource-response))

(clojure.core/defn create-robot-application "Creates a robot application." ([create-robot-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-robot-application-request create-robot-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-robot-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createRobotApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-robot-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRobotApplication", :http.request.configuration/output-deser-fn response-create-robot-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceAlreadyExistsException" :portkey.aws.robomaker/resource-already-exists-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-robot-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-robot-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-robot-application-response))

(clojure.core/defn register-robot "Registers a robot with a fleet." ([register-robot-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-register-robot-request register-robot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/register-robot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/registerRobot", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/register-robot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterRobot", :http.request.configuration/output-deser-fn response-register-robot-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef register-robot :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/register-robot-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/register-robot-response))

(clojure.core/defn delete-fleet "Deletes a fleet." ([delete-fleet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-fleet-request delete-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/delete-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteFleet", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/delete-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFleet", :http.request.configuration/output-deser-fn response-delete-fleet-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef delete-fleet :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/delete-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/delete-fleet-response))

(clojure.core/defn create-simulation-job "Creates a simulation job." ([create-simulation-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-simulation-job-request create-simulation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-simulation-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createSimulationJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-simulation-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSimulationJob", :http.request.configuration/output-deser-fn response-create-simulation-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-simulation-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-simulation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-simulation-job-response))

(clojure.core/defn create-robot-application-version "Creates a version of a robot application." ([create-robot-application-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-robot-application-version-request create-robot-application-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-robot-application-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createRobotApplicationVersion", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-robot-application-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRobotApplicationVersion", :http.request.configuration/output-deser-fn response-create-robot-application-version-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef create-robot-application-version :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-robot-application-version-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-robot-application-version-response))

(clojure.core/defn describe-robot-application "Describes a robot application." ([describe-robot-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-robot-application-request describe-robot-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-robot-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeRobotApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-robot-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRobotApplication", :http.request.configuration/output-deser-fn response-describe-robot-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef describe-robot-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-robot-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-robot-application-response))

(clojure.core/defn create-robot "Creates a robot." ([create-robot-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-robot-request create-robot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-robot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createRobot", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-robot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRobot", :http.request.configuration/output-deser-fn response-create-robot-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.robomaker/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-robot :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-robot-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-robot-response))

(clojure.core/defn describe-fleet "Describes a fleet." ([describe-fleet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-fleet-request describe-fleet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-fleet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeFleet", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-fleet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeFleet", :http.request.configuration/output-deser-fn response-describe-fleet-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-fleet :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-fleet-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-fleet-response))

(clojure.core/defn update-robot-application "Updates a robot application." ([update-robot-application-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-robot-application-request update-robot-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/update-robot-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateRobotApplication", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/update-robot-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateRobotApplication", :http.request.configuration/output-deser-fn response-update-robot-application-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef update-robot-application :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/update-robot-application-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/update-robot-application-response))

(clojure.core/defn sync-deployment-job "Syncrhonizes robots in a fleet to the latest deployment. This is helpful if\nrobots were added after a deployment." ([sync-deployment-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-sync-deployment-job-request sync-deployment-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/sync-deployment-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/syncDeploymentJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/sync-deployment-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SyncDeploymentJob", :http.request.configuration/output-deser-fn response-sync-deployment-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ConcurrentDeploymentException" :portkey.aws.robomaker/concurrent-deployment-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef sync-deployment-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/sync-deployment-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/sync-deployment-job-response))

(clojure.core/defn untag-resource "Removes the specified tags from the specified AWS RoboMaker resource.\n To remove a tag, specify the tag key. To change the tag value of an existing\ntag key, use TagResource\n(https://docs.aws.amazon.com/robomaker/latest/dg//API_Reference.htmlAPI_TagResource.html)." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tags/{resourceArn}", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/untag-resource-response))

(clojure.core/defn describe-deployment-job "Describes a deployment job. [Does it work regardless of deployment status, e.g.\nFailed?]" ([describe-deployment-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-describe-deployment-job-request describe-deployment-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/describe-deployment-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/describeDeploymentJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/describe-deployment-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDeploymentJob", :http.request.configuration/output-deser-fn response-describe-deployment-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef describe-deployment-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/describe-deployment-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/describe-deployment-job-response))

(clojure.core/defn create-deployment-job "Deploys a specific version of a robot application to robots in a fleet.\n The robot application must have a numbered applicationVersion for consistency\nreasons. To create a new version, use CreateRobotApplicationVersion or see\nCreating a Robot Application Version\n(https://docs.aws.amazon.com/robomaker/latest/dg/create-robot-application-version.html)." ([create-deployment-job-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-deployment-job-request create-deployment-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/create-deployment-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createDeploymentJob", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/create-deployment-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDeploymentJob", :http.request.configuration/output-deser-fn response-create-deployment-job-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "LimitExceededException" :portkey.aws.robomaker/limit-exceeded-exception, "ConcurrentDeploymentException" :portkey.aws.robomaker/concurrent-deployment-exception, "IdempotentParameterMismatchException" :portkey.aws.robomaker/idempotent-parameter-mismatch-exception}})))))
(clojure.spec.alpha/fdef create-deployment-job :args (clojure.spec.alpha/tuple :portkey.aws.robomaker/create-deployment-job-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/create-deployment-job-response))

(clojure.core/defn list-robot-applications "Returns a list of robot application. You can optionally provide filters to\nretrieve specific robot applications." ([] (list-robot-applications {})) ([list-robot-applications-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-robot-applications-request list-robot-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-robot-applications-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listRobotApplications", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-robot-applications-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRobotApplications", :http.request.configuration/output-deser-fn response-list-robot-applications-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception}})))))
(clojure.spec.alpha/fdef list-robot-applications :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-robot-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-robot-applications-response))

(clojure.core/defn list-robots "Returns a list of robots. You can optionally provide filters to retrieve\nspecific robots." ([] (list-robots {})) ([list-robots-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-robots-request list-robots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.robomaker/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.robomaker/list-robots-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listRobots", :http.request.configuration/version "2018-06-29", :http.request.configuration/service-id "RoboMaker", :http.request.spec/input-spec :portkey.aws.robomaker/list-robots-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRobots", :http.request.configuration/output-deser-fn response-list-robots-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.robomaker/resource-not-found-exception, "InvalidParameterException" :portkey.aws.robomaker/invalid-parameter-exception, "InternalServerException" :portkey.aws.robomaker/internal-server-exception, "ThrottlingException" :portkey.aws.robomaker/throttling-exception}})))))
(clojure.spec.alpha/fdef list-robots :args (clojure.spec.alpha/? :portkey.aws.robomaker/list-robots-request) :ret (clojure.spec.alpha/and :portkey.aws.robomaker/list-robots-response))
