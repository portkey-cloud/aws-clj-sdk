(ns portkey.aws.batch.-2016-08-10 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "batch", :region "ap-northeast-1"},
    :ssl-common-name "batch.ap-northeast-1.amazonaws.com",
    :endpoint "https://batch.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "batch", :region "eu-west-1"},
    :ssl-common-name "batch.eu-west-1.amazonaws.com",
    :endpoint "https://batch.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "batch", :region "us-east-2"},
    :ssl-common-name "batch.us-east-2.amazonaws.com",
    :endpoint "https://batch.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "batch", :region "ap-southeast-2"},
    :ssl-common-name "batch.ap-southeast-2.amazonaws.com",
    :endpoint "https://batch.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "batch", :region "sa-east-1"},
    :ssl-common-name "batch.sa-east-1.amazonaws.com",
    :endpoint "https://batch.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "batch", :region "ap-southeast-1"},
    :ssl-common-name "batch.ap-southeast-1.amazonaws.com",
    :endpoint "https://batch.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "batch", :region "ap-northeast-2"},
    :ssl-common-name "batch.ap-northeast-2.amazonaws.com",
    :endpoint "https://batch.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "batch", :region "eu-west-3"},
    :ssl-common-name "batch.eu-west-3.amazonaws.com",
    :endpoint "https://batch.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "batch", :region "ca-central-1"},
    :ssl-common-name "batch.ca-central-1.amazonaws.com",
    :endpoint "https://batch.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "batch", :region "eu-central-1"},
    :ssl-common-name "batch.eu-central-1.amazonaws.com",
    :endpoint "https://batch.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "batch", :region "eu-west-2"},
    :ssl-common-name "batch.eu-west-2.amazonaws.com",
    :endpoint "https://batch.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "batch", :region "us-west-2"},
    :ssl-common-name "batch.us-west-2.amazonaws.com",
    :endpoint "https://batch.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "batch", :region "us-east-1"},
    :ssl-common-name "batch.us-east-1.amazonaws.com",
    :endpoint "https://batch.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "batch", :region "us-west-1"},
    :ssl-common-name "batch.us-west-1.amazonaws.com",
    :endpoint "https://batch.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "batch", :region "ap-south-1"},
    :ssl-common-name "batch.ap-south-1.amazonaws.com",
    :endpoint "https://batch.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "batch", :region "eu-north-1"},
    :ssl-common-name "batch.eu-north-1.amazonaws.com",
    :endpoint "https://batch.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-job-definition-type)

(clojure.core/declare ser-compute-environment-order)

(clojure.core/declare ser-jq-state)

(clojure.core/declare ser-mount-point)

(clojure.core/declare ser-array-properties)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-launch-template-specification)

(clojure.core/declare ser-volume)

(clojure.core/declare ser-tags-map)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-compute-resource-update)

(clojure.core/declare ser-array-job-dependency)

(clojure.core/declare ser-job-dependency)

(clojure.core/declare ser-compute-resource)

(clojure.core/declare ser-cr-type)

(clojure.core/declare ser-node-property-overrides)

(clojure.core/declare ser-node-property-override)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-parameters-map)

(clojure.core/declare ser-container-overrides)

(clojure.core/declare ser-job-dependency-list)

(clojure.core/declare ser-ulimits)

(clojure.core/declare ser-job-timeout)

(clojure.core/declare ser-ce-type)

(clojure.core/declare ser-container-properties)

(clojure.core/declare ser-node-properties)

(clojure.core/declare ser-ulimit)

(clojure.core/declare ser-node-range-property)

(clojure.core/declare ser-node-overrides)

(clojure.core/declare ser-ce-state)

(clojure.core/declare ser-volumes)

(clojure.core/declare ser-mount-points)

(clojure.core/declare ser-host)

(clojure.core/declare ser-node-range-properties)

(clojure.core/declare ser-compute-environment-orders)

(clojure.core/declare ser-retry-strategy)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-key-value-pair)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-job-definition-type [input] #:http.request.field{:value (clojure.core/get {"container" "container", :container "container", "multinode" "multinode", :multinode "multinode"} input), :shape "JobDefinitionType"})

(clojure.core/defn- ser-compute-environment-order [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:order input)) #:http.request.field{:name "order", :shape "Integer"}) (clojure.core/into (ser-string (:compute-environment input)) #:http.request.field{:name "computeEnvironment", :shape "String"})], :shape "ComputeEnvironmentOrder", :type "structure"}))

(clojure.core/defn- ser-jq-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "JQState"})

(clojure.core/defn- ser-mount-point [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MountPoint", :type "structure"} (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "readOnly", :shape "Boolean"})) (clojure.core/contains? input :source-volume) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-volume)) #:http.request.field{:name "sourceVolume", :shape "String"}))))

(clojure.core/defn- ser-array-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ArrayProperties", :type "structure"} (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :size)) #:http.request.field{:name "size", :shape "Integer"}))))

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "JobStatus"})

(clojure.core/defn- ser-launch-template-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplateSpecification", :type "structure"} (clojure.core/contains? input :launch-template-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :launch-template-id)) #:http.request.field{:name "launchTemplateId", :shape "String"})) (clojure.core/contains? input :launch-template-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :launch-template-name)) #:http.request.field{:name "launchTemplateName", :shape "String"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :version)) #:http.request.field{:name "version", :shape "String"}))))

(clojure.core/defn- ser-volume [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Volume", :type "structure"} (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host (input :host)) #:http.request.field{:name "host", :shape "Host"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"}))))

(clojure.core/defn- ser-tags-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "TagsMap", :type "map"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-value-pair coll) #:http.request.field{:shape "KeyValuePair"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-compute-resource-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ComputeResourceUpdate", :type "structure"} (clojure.core/contains? input :minv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :minv-cpus)) #:http.request.field{:name "minvCpus", :shape "Integer"})) (clojure.core/contains? input :maxv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :maxv-cpus)) #:http.request.field{:name "maxvCpus", :shape "Integer"})) (clojure.core/contains? input :desiredv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :desiredv-cpus)) #:http.request.field{:name "desiredvCpus", :shape "Integer"}))))

(clojure.core/defn- ser-array-job-dependency [input] #:http.request.field{:value (clojure.core/get {"N_TO_N" "N_TO_N", :n-to-n "N_TO_N", "SEQUENTIAL" "SEQUENTIAL", :sequential "SEQUENTIAL"} input), :shape "ArrayJobDependency"})

(clojure.core/defn- ser-job-dependency [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobDependency", :type "structure"} (clojure.core/contains? input :job-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-array-job-dependency (input :type)) #:http.request.field{:name "type", :shape "ArrayJobDependency"}))))

(clojure.core/defn- ser-compute-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cr-type (:type input)) #:http.request.field{:name "type", :shape "CRType"}) (clojure.core/into (ser-integer (:minv-cpus input)) #:http.request.field{:name "minvCpus", :shape "Integer"}) (clojure.core/into (ser-integer (:maxv-cpus input)) #:http.request.field{:name "maxvCpus", :shape "Integer"}) (clojure.core/into (ser-string-list (:instance-types input)) #:http.request.field{:name "instanceTypes", :shape "StringList"}) (clojure.core/into (ser-string-list (:subnets input)) #:http.request.field{:name "subnets", :shape "StringList"}) (clojure.core/into (ser-string (:instance-role input)) #:http.request.field{:name "instanceRole", :shape "String"})], :shape "ComputeResource", :type "structure"} (clojure.core/contains? input :ec-2-key-pair) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ec-2-key-pair)) #:http.request.field{:name "ec2KeyPair", :shape "String"})) (clojure.core/contains? input :spot-iam-fleet-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :spot-iam-fleet-role)) #:http.request.field{:name "spotIamFleetRole", :shape "String"})) (clojure.core/contains? input :bid-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :bid-percentage)) #:http.request.field{:name "bidPercentage", :shape "Integer"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "tags", :shape "TagsMap"})) (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template)) #:http.request.field{:name "launchTemplate", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-id)) #:http.request.field{:name "imageId", :shape "String"})) (clojure.core/contains? input :placement-group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :placement-group)) #:http.request.field{:name "placementGroup", :shape "String"})) (clojure.core/contains? input :desiredv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :desiredv-cpus)) #:http.request.field{:name "desiredvCpus", :shape "Integer"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-group-ids)) #:http.request.field{:name "securityGroupIds", :shape "StringList"}))))

(clojure.core/defn- ser-cr-type [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "SPOT" "SPOT", :spot "SPOT"} input), :shape "CRType"})

(clojure.core/defn- ser-node-property-overrides [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-node-property-override coll) #:http.request.field{:shape "NodePropertyOverride"}))) input), :shape "NodePropertyOverrides", :type "list"})

(clojure.core/defn- ser-node-property-override [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:target-nodes input)) #:http.request.field{:name "targetNodes", :shape "String"})], :shape "NodePropertyOverride", :type "structure"} (clojure.core/contains? input :container-overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-overrides (input :container-overrides)) #:http.request.field{:name "containerOverrides", :shape "ContainerOverrides"}))))

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-parameters-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "ParametersMap", :type "map"})

(clojure.core/defn- ser-container-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerOverrides", :type "structure"} (clojure.core/contains? input :vcpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :vcpus)) #:http.request.field{:name "vcpus", :shape "Integer"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :memory)) #:http.request.field{:name "memory", :shape "Integer"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "instanceType", :shape "String"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"}))))

(clojure.core/defn- ser-job-dependency-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-dependency coll) #:http.request.field{:shape "JobDependency"}))) input), :shape "JobDependencyList", :type "list"})

(clojure.core/defn- ser-ulimits [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ulimit coll) #:http.request.field{:shape "Ulimit"}))) input), :shape "Ulimits", :type "list"})

(clojure.core/defn- ser-job-timeout [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobTimeout", :type "structure"} (clojure.core/contains? input :attempt-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :attempt-duration-seconds)) #:http.request.field{:name "attemptDurationSeconds", :shape "Integer"}))))

(clojure.core/defn- ser-ce-type [input] #:http.request.field{:value (clojure.core/get {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"} input), :shape "CEType"})

(clojure.core/defn- ser-container-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerProperties", :type "structure"} (clojure.core/contains? input :ulimits) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ulimits (input :ulimits)) #:http.request.field{:name "ulimits", :shape "Ulimits"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :mount-points) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-points (input :mount-points)) #:http.request.field{:name "mountPoints", :shape "MountPoints"})) (clojure.core/contains? input :image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image)) #:http.request.field{:name "image", :shape "String"})) (clojure.core/contains? input :user) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :user)) #:http.request.field{:name "user", :shape "String"})) (clojure.core/contains? input :volumes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volumes (input :volumes)) #:http.request.field{:name "volumes", :shape "Volumes"})) (clojure.core/contains? input :privileged) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privileged)) #:http.request.field{:name "privileged", :shape "Boolean"})) (clojure.core/contains? input :vcpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :vcpus)) #:http.request.field{:name "vcpus", :shape "Integer"})) (clojure.core/contains? input :readonly-root-filesystem) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :readonly-root-filesystem)) #:http.request.field{:name "readonlyRootFilesystem", :shape "Boolean"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :memory)) #:http.request.field{:name "memory", :shape "Integer"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :instance-type)) #:http.request.field{:name "instanceType", :shape "String"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :job-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-role-arn)) #:http.request.field{:name "jobRoleArn", :shape "String"}))))

(clojure.core/defn- ser-node-properties [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:num-nodes input)) #:http.request.field{:name "numNodes", :shape "Integer"}) (clojure.core/into (ser-integer (:main-node input)) #:http.request.field{:name "mainNode", :shape "Integer"}) (clojure.core/into (ser-node-range-properties (:node-range-properties input)) #:http.request.field{:name "nodeRangeProperties", :shape "NodeRangeProperties"})], :shape "NodeProperties", :type "structure"}))

(clojure.core/defn- ser-ulimit [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:hard-limit input)) #:http.request.field{:name "hardLimit", :shape "Integer"}) (clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-integer (:soft-limit input)) #:http.request.field{:name "softLimit", :shape "Integer"})], :shape "Ulimit", :type "structure"}))

(clojure.core/defn- ser-node-range-property [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:target-nodes input)) #:http.request.field{:name "targetNodes", :shape "String"})], :shape "NodeRangeProperty", :type "structure"} (clojure.core/contains? input :container) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-properties (input :container)) #:http.request.field{:name "container", :shape "ContainerProperties"}))))

(clojure.core/defn- ser-node-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NodeOverrides", :type "structure"} (clojure.core/contains? input :node-property-overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-node-property-overrides (input :node-property-overrides)) #:http.request.field{:name "nodePropertyOverrides", :shape "NodePropertyOverrides"}))))

(clojure.core/defn- ser-ce-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "CEState"})

(clojure.core/defn- ser-volumes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume coll) #:http.request.field{:shape "Volume"}))) input), :shape "Volumes", :type "list"})

(clojure.core/defn- ser-mount-points [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mount-point coll) #:http.request.field{:shape "MountPoint"}))) input), :shape "MountPoints", :type "list"})

(clojure.core/defn- ser-host [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Host", :type "structure"} (clojure.core/contains? input :source-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-path)) #:http.request.field{:name "sourcePath", :shape "String"}))))

(clojure.core/defn- ser-node-range-properties [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-node-range-property coll) #:http.request.field{:shape "NodeRangeProperty"}))) input), :shape "NodeRangeProperties", :type "list"})

(clojure.core/defn- ser-compute-environment-orders [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compute-environment-order coll) #:http.request.field{:shape "ComputeEnvironmentOrder"}))) input), :shape "ComputeEnvironmentOrders", :type "list"})

(clojure.core/defn- ser-retry-strategy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RetryStrategy", :type "structure"} (clojure.core/contains? input :attempts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :attempts)) #:http.request.field{:name "attempts", :shape "Integer"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-key-value-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyValuePair", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- req-describe-compute-environments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :compute-environments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :compute-environments)) #:http.request.field{:name "computeEnvironments", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-submit-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-name)) #:http.request.field{:name "jobName", :shape "String"}) (clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"}) (clojure.core/into (ser-string (input :job-definition)) #:http.request.field{:name "jobDefinition", :shape "String"})]} (clojure.core/contains? input :retry-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retry-strategy (input :retry-strategy)) #:http.request.field{:name "retryStrategy", :shape "RetryStrategy"})) (clojure.core/contains? input :node-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-node-overrides (input :node-overrides)) #:http.request.field{:name "nodeOverrides", :shape "NodeOverrides"})) (clojure.core/contains? input :container-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-overrides (input :container-overrides)) #:http.request.field{:name "containerOverrides", :shape "ContainerOverrides"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout (input :timeout)) #:http.request.field{:name "timeout", :shape "JobTimeout"})) (clojure.core/contains? input :depends-on) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-dependency-list (input :depends-on)) #:http.request.field{:name "dependsOn", :shape "JobDependencyList"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "parameters", :shape "ParametersMap"})) (clojure.core/contains? input :array-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-array-properties (input :array-properties)) #:http.request.field{:name "arrayProperties", :shape "ArrayProperties"}))))

(clojure.core/defn- req-update-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment)) #:http.request.field{:name "computeEnvironment", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ce-state (input :state)) #:http.request.field{:name "state", :shape "CEState"})) (clojure.core/contains? input :compute-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-resource-update (input :compute-resources)) #:http.request.field{:name "computeResources", :shape "ComputeResourceUpdate"})) (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "String"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-queue) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})) (clojure.core/contains? input :array-job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :array-job-id)) #:http.request.field{:name "arrayJobId", :shape "String"})) (clojure.core/contains? input :multi-node-job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :multi-node-job-id)) #:http.request.field{:name "multiNodeJobId", :shape "String"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "jobStatus", :shape "JobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-deregister-job-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-definition)) #:http.request.field{:name "jobDefinition", :shape "String"})]}))

(clojure.core/defn- req-describe-job-queues-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-queues) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :job-queues)) #:http.request.field{:name "jobQueues", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-create-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment-name)) #:http.request.field{:name "computeEnvironmentName", :shape "String"}) (clojure.core/into (ser-ce-type (input :type)) #:http.request.field{:name "type", :shape "CEType"}) (clojure.core/into (ser-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ce-state (input :state)) #:http.request.field{:name "state", :shape "CEState"})) (clojure.core/contains? input :compute-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-resource (input :compute-resources)) #:http.request.field{:name "computeResources", :shape "ComputeResource"}))))

(clojure.core/defn- req-register-job-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-definition-name)) #:http.request.field{:name "jobDefinitionName", :shape "String"}) (clojure.core/into (ser-job-definition-type (input :type)) #:http.request.field{:name "type", :shape "JobDefinitionType"})]} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "parameters", :shape "ParametersMap"})) (clojure.core/contains? input :container-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-properties (input :container-properties)) #:http.request.field{:name "containerProperties", :shape "ContainerProperties"})) (clojure.core/contains? input :node-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-node-properties (input :node-properties)) #:http.request.field{:name "nodeProperties", :shape "NodeProperties"})) (clojure.core/contains? input :retry-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retry-strategy (input :retry-strategy)) #:http.request.field{:name "retryStrategy", :shape "RetryStrategy"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout (input :timeout)) #:http.request.field{:name "timeout", :shape "JobTimeout"}))))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})]}))

(clojure.core/defn- req-terminate-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})]}))

(clojure.core/defn- req-create-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue-name)) #:http.request.field{:name "jobQueueName", :shape "String"}) (clojure.core/into (ser-integer (input :priority)) #:http.request.field{:name "priority", :shape "Integer"}) (clojure.core/into (ser-compute-environment-orders (input :compute-environment-order)) #:http.request.field{:name "computeEnvironmentOrder", :shape "ComputeEnvironmentOrders"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jq-state (input :state)) #:http.request.field{:name "state", :shape "JQState"}))))

(clojure.core/defn- req-delete-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})]}))

(clojure.core/defn- req-describe-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :jobs)) #:http.request.field{:name "jobs", :shape "StringList"})]}))

(clojure.core/defn- req-describe-job-definitions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-definitions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :job-definitions)) #:http.request.field{:name "jobDefinitions", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :job-definition-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-definition-name)) #:http.request.field{:name "jobDefinitionName", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-delete-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment)) #:http.request.field{:name "computeEnvironment", :shape "String"})]}))

(clojure.core/defn- req-update-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jq-state (input :state)) #:http.request.field{:name "state", :shape "JQState"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :priority)) #:http.request.field{:name "priority", :shape "Integer"})) (clojure.core/contains? input :compute-environment-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-environment-orders (input :compute-environment-order)) #:http.request.field{:name "computeEnvironmentOrder", :shape "ComputeEnvironmentOrders"}))))

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-compute-environment-order)

(clojure.core/declare deser-jq-state)

(clojure.core/declare deser-mount-point)

(clojure.core/declare deser-node-details)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-compute-environment-detail-list)

(clojure.core/declare deser-launch-template-specification)

(clojure.core/declare deser-volume)

(clojure.core/declare deser-node-properties-summary)

(clojure.core/declare deser-array-properties-summary)

(clojure.core/declare deser-tags-map)

(clojure.core/declare deser-attempt-details)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-job-definition)

(clojure.core/declare deser-container-detail)

(clojure.core/declare deser-jq-status)

(clojure.core/declare deser-array-job-dependency)

(clojure.core/declare deser-job-dependency)

(clojure.core/declare deser-compute-resource)

(clojure.core/declare deser-job-queue-detail-list)

(clojure.core/declare deser-job-definition-list)

(clojure.core/declare deser-cr-type)

(clojure.core/declare deser-job-detail-list)

(clojure.core/declare deser-container-summary)

(clojure.core/declare deser-network-interface-list)

(clojure.core/declare deser-job-summary-list)

(clojure.core/declare deser-attempt-detail)

(clojure.core/declare deser-compute-environment-detail)

(clojure.core/declare deser-ce-status)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deser-array-job-status-summary)

(clojure.core/declare deser-parameters-map)

(clojure.core/declare deser-array-properties-detail)

(clojure.core/declare deser-long)

(clojure.core/declare deser-job-dependency-list)

(clojure.core/declare deser-job-queue-detail)

(clojure.core/declare deser-ulimits)

(clojure.core/declare deser-job-timeout)

(clojure.core/declare deser-ce-type)

(clojure.core/declare deser-container-properties)

(clojure.core/declare deser-node-properties)

(clojure.core/declare deser-ulimit)

(clojure.core/declare deser-node-range-property)

(clojure.core/declare deser-job-detail)

(clojure.core/declare deser-ce-state)

(clojure.core/declare deser-attempt-container-detail)

(clojure.core/declare deser-volumes)

(clojure.core/declare deser-mount-points)

(clojure.core/declare deser-job-summary)

(clojure.core/declare deser-host)

(clojure.core/declare deser-node-range-properties)

(clojure.core/declare deser-compute-environment-orders)

(clojure.core/declare deser-retry-strategy)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-key-value-pair)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-compute-environment-order [input] (clojure.core/cond-> {:order (deser-integer (input "order")), :compute-environment (deser-string (input "computeEnvironment"))}))

(clojure.core/defn- deser-jq-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-mount-point [input] (clojure.core/cond-> {} (clojure.core/contains? input "containerPath") (clojure.core/assoc :container-path (deser-string (input "containerPath"))) (clojure.core/contains? input "readOnly") (clojure.core/assoc :read-only (deser-boolean (input "readOnly"))) (clojure.core/contains? input "sourceVolume") (clojure.core/assoc :source-volume (deser-string (input "sourceVolume")))))

(clojure.core/defn- deser-node-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "nodeIndex") (clojure.core/assoc :node-index (deser-integer (input "nodeIndex"))) (clojure.core/contains? input "isMainNode") (clojure.core/assoc :is-main-node (deser-boolean (input "isMainNode")))))

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"SUBMITTED" :submitted, "PENDING" :pending, "RUNNABLE" :runnable, "STARTING" :starting, "RUNNING" :running, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-compute-environment-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compute-environment-detail coll))) input))

(clojure.core/defn- deser-launch-template-specification [input] (clojure.core/cond-> {} (clojure.core/contains? input "launchTemplateId") (clojure.core/assoc :launch-template-id (deser-string (input "launchTemplateId"))) (clojure.core/contains? input "launchTemplateName") (clojure.core/assoc :launch-template-name (deser-string (input "launchTemplateName"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-string (input "version")))))

(clojure.core/defn- deser-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "host") (clojure.core/assoc :host (deser-host (input "host"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name")))))

(clojure.core/defn- deser-node-properties-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "isMainNode") (clojure.core/assoc :is-main-node (deser-boolean (input "isMainNode"))) (clojure.core/contains? input "numNodes") (clojure.core/assoc :num-nodes (deser-integer (input "numNodes"))) (clojure.core/contains? input "nodeIndex") (clojure.core/assoc :node-index (deser-integer (input "nodeIndex")))))

(clojure.core/defn- deser-array-properties-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "size") (clojure.core/assoc :size (deser-integer (input "size"))) (clojure.core/contains? input "index") (clojure.core/assoc :index (deser-integer (input "index")))))

(clojure.core/defn- deser-tags-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-attempt-details [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attempt-detail coll))) input))

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-key-value-pair coll))) input))

(clojure.core/defn- deser-job-definition [input] (clojure.core/cond-> {:job-definition-name (deser-string (input "jobDefinitionName")), :job-definition-arn (deser-string (input "jobDefinitionArn")), :revision (deser-integer (input "revision")), :type (deser-string (input "type"))} (clojure.core/contains? input "retryStrategy") (clojure.core/assoc :retry-strategy (deser-retry-strategy (input "retryStrategy"))) (clojure.core/contains? input "containerProperties") (clojure.core/assoc :container-properties (deser-container-properties (input "containerProperties"))) (clojure.core/contains? input "nodeProperties") (clojure.core/assoc :node-properties (deser-node-properties (input "nodeProperties"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-string (input "status"))) (clojure.core/contains? input "timeout") (clojure.core/assoc :timeout (deser-job-timeout (input "timeout"))) (clojure.core/contains? input "parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "parameters")))))

(clojure.core/defn- deser-container-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "ulimits") (clojure.core/assoc :ulimits (deser-ulimits (input "ulimits"))) (clojure.core/contains? input "command") (clojure.core/assoc :command (deser-string-list (input "command"))) (clojure.core/contains? input "mountPoints") (clojure.core/assoc :mount-points (deser-mount-points (input "mountPoints"))) (clojure.core/contains? input "networkInterfaces") (clojure.core/assoc :network-interfaces (deser-network-interface-list (input "networkInterfaces"))) (clojure.core/contains? input "image") (clojure.core/assoc :image (deser-string (input "image"))) (clojure.core/contains? input "exitCode") (clojure.core/assoc :exit-code (deser-integer (input "exitCode"))) (clojure.core/contains? input "user") (clojure.core/assoc :user (deser-string (input "user"))) (clojure.core/contains? input "volumes") (clojure.core/assoc :volumes (deser-volumes (input "volumes"))) (clojure.core/contains? input "privileged") (clojure.core/assoc :privileged (deser-boolean (input "privileged"))) (clojure.core/contains? input "vcpus") (clojure.core/assoc :vcpus (deser-integer (input "vcpus"))) (clojure.core/contains? input "readonlyRootFilesystem") (clojure.core/assoc :readonly-root-filesystem (deser-boolean (input "readonlyRootFilesystem"))) (clojure.core/contains? input "taskArn") (clojure.core/assoc :task-arn (deser-string (input "taskArn"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-integer (input "memory"))) (clojure.core/contains? input "logStreamName") (clojure.core/assoc :log-stream-name (deser-string (input "logStreamName"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-string (input "instanceType"))) (clojure.core/contains? input "containerInstanceArn") (clojure.core/assoc :container-instance-arn (deser-string (input "containerInstanceArn"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-environment-variables (input "environment"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason"))) (clojure.core/contains? input "jobRoleArn") (clojure.core/assoc :job-role-arn (deser-string (input "jobRoleArn")))))

(clojure.core/defn- deser-jq-status [input] (clojure.core/get {"CREATING" :creating, "UPDATING" :updating, "DELETING" :deleting, "DELETED" :deleted, "VALID" :valid, "INVALID" :invalid} input))

(clojure.core/defn- deser-array-job-dependency [input] (clojure.core/get {"N_TO_N" :n-to-n, "SEQUENTIAL" :sequential} input))

(clojure.core/defn- deser-job-dependency [input] (clojure.core/cond-> {} (clojure.core/contains? input "jobId") (clojure.core/assoc :job-id (deser-string (input "jobId"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-array-job-dependency (input "type")))))

(clojure.core/defn- deser-compute-resource [input] (clojure.core/cond-> {:type (deser-cr-type (input "type")), :minv-cpus (deser-integer (input "minvCpus")), :maxv-cpus (deser-integer (input "maxvCpus")), :instance-types (deser-string-list (input "instanceTypes")), :subnets (deser-string-list (input "subnets")), :instance-role (deser-string (input "instanceRole"))} (clojure.core/contains? input "ec2KeyPair") (clojure.core/assoc :ec-2-key-pair (deser-string (input "ec2KeyPair"))) (clojure.core/contains? input "spotIamFleetRole") (clojure.core/assoc :spot-iam-fleet-role (deser-string (input "spotIamFleetRole"))) (clojure.core/contains? input "bidPercentage") (clojure.core/assoc :bid-percentage (deser-integer (input "bidPercentage"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tags-map (input "tags"))) (clojure.core/contains? input "launchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (input "launchTemplate"))) (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-string (input "imageId"))) (clojure.core/contains? input "placementGroup") (clojure.core/assoc :placement-group (deser-string (input "placementGroup"))) (clojure.core/contains? input "desiredvCpus") (clojure.core/assoc :desiredv-cpus (deser-integer (input "desiredvCpus"))) (clojure.core/contains? input "securityGroupIds") (clojure.core/assoc :security-group-ids (deser-string-list (input "securityGroupIds")))))

(clojure.core/defn- deser-job-queue-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-queue-detail coll))) input))

(clojure.core/defn- deser-job-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-definition coll))) input))

(clojure.core/defn- deser-cr-type [input] (clojure.core/get {"EC2" :ec-2, "SPOT" :spot} input))

(clojure.core/defn- deser-job-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-detail coll))) input))

(clojure.core/defn- deser-container-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "exitCode") (clojure.core/assoc :exit-code (deser-integer (input "exitCode"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason")))))

(clojure.core/defn- deser-network-interface-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-interface coll))) input))

(clojure.core/defn- deser-job-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-summary coll))) input))

(clojure.core/defn- deser-attempt-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "container") (clojure.core/assoc :container (deser-attempt-container-detail (input "container"))) (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-long (input "startedAt"))) (clojure.core/contains? input "stoppedAt") (clojure.core/assoc :stopped-at (deser-long (input "stoppedAt"))) (clojure.core/contains? input "statusReason") (clojure.core/assoc :status-reason (deser-string (input "statusReason")))))

(clojure.core/defn- deser-compute-environment-detail [input] (clojure.core/cond-> {:compute-environment-name (deser-string (input "computeEnvironmentName")), :compute-environment-arn (deser-string (input "computeEnvironmentArn")), :ecs-cluster-arn (deser-string (input "ecsClusterArn"))} (clojure.core/contains? input "serviceRole") (clojure.core/assoc :service-role (deser-string (input "serviceRole"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-ce-status (input "status"))) (clojure.core/contains? input "computeResources") (clojure.core/assoc :compute-resources (deser-compute-resource (input "computeResources"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-ce-type (input "type"))) (clojure.core/contains? input "state") (clojure.core/assoc :state (deser-ce-state (input "state"))) (clojure.core/contains? input "statusReason") (clojure.core/assoc :status-reason (deser-string (input "statusReason")))))

(clojure.core/defn- deser-ce-status [input] (clojure.core/get {"CREATING" :creating, "UPDATING" :updating, "DELETING" :deleting, "DELETED" :deleted, "VALID" :valid, "INVALID" :invalid} input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachmentId") (clojure.core/assoc :attachment-id (deser-string (input "attachmentId"))) (clojure.core/contains? input "ipv6Address") (clojure.core/assoc :ipv-6-address (deser-string (input "ipv6Address"))) (clojure.core/contains? input "privateIpv4Address") (clojure.core/assoc :private-ipv-4-address (deser-string (input "privateIpv4Address")))))

(clojure.core/defn- deser-array-job-status-summary [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-integer v)])) input))

(clojure.core/defn- deser-parameters-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-array-properties-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "statusSummary") (clojure.core/assoc :status-summary (deser-array-job-status-summary (input "statusSummary"))) (clojure.core/contains? input "size") (clojure.core/assoc :size (deser-integer (input "size"))) (clojure.core/contains? input "index") (clojure.core/assoc :index (deser-integer (input "index")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-job-dependency-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job-dependency coll))) input))

(clojure.core/defn- deser-job-queue-detail [input] (clojure.core/cond-> {:job-queue-name (deser-string (input "jobQueueName")), :job-queue-arn (deser-string (input "jobQueueArn")), :state (deser-jq-state (input "state")), :priority (deser-integer (input "priority")), :compute-environment-order (deser-compute-environment-orders (input "computeEnvironmentOrder"))} (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-jq-status (input "status"))) (clojure.core/contains? input "statusReason") (clojure.core/assoc :status-reason (deser-string (input "statusReason")))))

(clojure.core/defn- deser-ulimits [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ulimit coll))) input))

(clojure.core/defn- deser-job-timeout [input] (clojure.core/cond-> {} (clojure.core/contains? input "attemptDurationSeconds") (clojure.core/assoc :attempt-duration-seconds (deser-integer (input "attemptDurationSeconds")))))

(clojure.core/defn- deser-ce-type [input] (clojure.core/get {"MANAGED" :managed, "UNMANAGED" :unmanaged} input))

(clojure.core/defn- deser-container-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "ulimits") (clojure.core/assoc :ulimits (deser-ulimits (input "ulimits"))) (clojure.core/contains? input "command") (clojure.core/assoc :command (deser-string-list (input "command"))) (clojure.core/contains? input "mountPoints") (clojure.core/assoc :mount-points (deser-mount-points (input "mountPoints"))) (clojure.core/contains? input "image") (clojure.core/assoc :image (deser-string (input "image"))) (clojure.core/contains? input "user") (clojure.core/assoc :user (deser-string (input "user"))) (clojure.core/contains? input "volumes") (clojure.core/assoc :volumes (deser-volumes (input "volumes"))) (clojure.core/contains? input "privileged") (clojure.core/assoc :privileged (deser-boolean (input "privileged"))) (clojure.core/contains? input "vcpus") (clojure.core/assoc :vcpus (deser-integer (input "vcpus"))) (clojure.core/contains? input "readonlyRootFilesystem") (clojure.core/assoc :readonly-root-filesystem (deser-boolean (input "readonlyRootFilesystem"))) (clojure.core/contains? input "memory") (clojure.core/assoc :memory (deser-integer (input "memory"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-string (input "instanceType"))) (clojure.core/contains? input "environment") (clojure.core/assoc :environment (deser-environment-variables (input "environment"))) (clojure.core/contains? input "jobRoleArn") (clojure.core/assoc :job-role-arn (deser-string (input "jobRoleArn")))))

(clojure.core/defn- deser-node-properties [input] (clojure.core/cond-> {:num-nodes (deser-integer (input "numNodes")), :main-node (deser-integer (input "mainNode")), :node-range-properties (deser-node-range-properties (input "nodeRangeProperties"))}))

(clojure.core/defn- deser-ulimit [input] (clojure.core/cond-> {:hard-limit (deser-integer (input "hardLimit")), :name (deser-string (input "name")), :soft-limit (deser-integer (input "softLimit"))}))

(clojure.core/defn- deser-node-range-property [input] (clojure.core/cond-> {:target-nodes (deser-string (input "targetNodes"))} (clojure.core/contains? input "container") (clojure.core/assoc :container (deser-container-properties (input "container")))))

(clojure.core/defn- deser-job-detail [input] (clojure.core/cond-> {:job-name (deser-string (input "jobName")), :job-id (deser-string (input "jobId")), :job-queue (deser-string (input "jobQueue")), :status (deser-job-status (input "status")), :started-at (deser-long (input "startedAt")), :job-definition (deser-string (input "jobDefinition"))} (clojure.core/contains? input "retryStrategy") (clojure.core/assoc :retry-strategy (deser-retry-strategy (input "retryStrategy"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-long (input "createdAt"))) (clojure.core/contains? input "nodeDetails") (clojure.core/assoc :node-details (deser-node-details (input "nodeDetails"))) (clojure.core/contains? input "nodeProperties") (clojure.core/assoc :node-properties (deser-node-properties (input "nodeProperties"))) (clojure.core/contains? input "stoppedAt") (clojure.core/assoc :stopped-at (deser-long (input "stoppedAt"))) (clojure.core/contains? input "timeout") (clojure.core/assoc :timeout (deser-job-timeout (input "timeout"))) (clojure.core/contains? input "attempts") (clojure.core/assoc :attempts (deser-attempt-details (input "attempts"))) (clojure.core/contains? input "statusReason") (clojure.core/assoc :status-reason (deser-string (input "statusReason"))) (clojure.core/contains? input "dependsOn") (clojure.core/assoc :depends-on (deser-job-dependency-list (input "dependsOn"))) (clojure.core/contains? input "parameters") (clojure.core/assoc :parameters (deser-parameters-map (input "parameters"))) (clojure.core/contains? input "arrayProperties") (clojure.core/assoc :array-properties (deser-array-properties-detail (input "arrayProperties"))) (clojure.core/contains? input "container") (clojure.core/assoc :container (deser-container-detail (input "container")))))

(clojure.core/defn- deser-ce-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-attempt-container-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "containerInstanceArn") (clojure.core/assoc :container-instance-arn (deser-string (input "containerInstanceArn"))) (clojure.core/contains? input "taskArn") (clojure.core/assoc :task-arn (deser-string (input "taskArn"))) (clojure.core/contains? input "exitCode") (clojure.core/assoc :exit-code (deser-integer (input "exitCode"))) (clojure.core/contains? input "reason") (clojure.core/assoc :reason (deser-string (input "reason"))) (clojure.core/contains? input "logStreamName") (clojure.core/assoc :log-stream-name (deser-string (input "logStreamName"))) (clojure.core/contains? input "networkInterfaces") (clojure.core/assoc :network-interfaces (deser-network-interface-list (input "networkInterfaces")))))

(clojure.core/defn- deser-volumes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume coll))) input))

(clojure.core/defn- deser-mount-points [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-mount-point coll))) input))

(clojure.core/defn- deser-job-summary [input] (clojure.core/cond-> {:job-id (deser-string (input "jobId")), :job-name (deser-string (input "jobName"))} (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-long (input "createdAt"))) (clojure.core/contains? input "startedAt") (clojure.core/assoc :started-at (deser-long (input "startedAt"))) (clojure.core/contains? input "nodeProperties") (clojure.core/assoc :node-properties (deser-node-properties-summary (input "nodeProperties"))) (clojure.core/contains? input "stoppedAt") (clojure.core/assoc :stopped-at (deser-long (input "stoppedAt"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-job-status (input "status"))) (clojure.core/contains? input "statusReason") (clojure.core/assoc :status-reason (deser-string (input "statusReason"))) (clojure.core/contains? input "arrayProperties") (clojure.core/assoc :array-properties (deser-array-properties-summary (input "arrayProperties"))) (clojure.core/contains? input "container") (clojure.core/assoc :container (deser-container-summary (input "container")))))

(clojure.core/defn- deser-host [input] (clojure.core/cond-> {} (clojure.core/contains? input "sourcePath") (clojure.core/assoc :source-path (deser-string (input "sourcePath")))))

(clojure.core/defn- deser-node-range-properties [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-node-range-property coll))) input))

(clojure.core/defn- deser-compute-environment-orders [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compute-environment-order coll))) input))

(clojure.core/defn- deser-retry-strategy [input] (clojure.core/cond-> {} (clojure.core/contains? input "attempts") (clojure.core/assoc :attempts (deser-integer (input "attempts")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-key-value-pair [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value")))))

(clojure.core/defn- response-delete-compute-environment-response ([input] (response-delete-compute-environment-response nil input)) ([resultWrapper1071776 input] (clojure.core/let [rawinput1071775 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071777 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-job-queue-response ([input] (response-create-job-queue-response nil input)) ([resultWrapper1071779 input] (clojure.core/let [rawinput1071778 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071780 {"jobQueueName" (rawinput1071778 "jobQueueName"), "jobQueueArn" (rawinput1071778 "jobQueueArn")}] (clojure.core/cond-> {:job-queue-name (deser-string (clojure.core/get-in letvar1071780 ["jobQueueName"])), :job-queue-arn (deser-string (clojure.core/get-in letvar1071780 ["jobQueueArn"]))}))))

(clojure.core/defn- response-cancel-job-response ([input] (response-cancel-job-response nil input)) ([resultWrapper1071782 input] (clojure.core/let [rawinput1071781 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071783 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-client-exception ([input] (response-client-exception nil input)) ([resultWrapper1071785 input] (clojure.core/let [rawinput1071784 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071786 {"message" (rawinput1071784 "message")}] (clojure.core/cond-> {} (letvar1071786 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1071786 ["message"])))))))

(clojure.core/defn- response-describe-compute-environments-response ([input] (response-describe-compute-environments-response nil input)) ([resultWrapper1071788 input] (clojure.core/let [rawinput1071787 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071789 {"computeEnvironments" (rawinput1071787 "computeEnvironments"), "nextToken" (rawinput1071787 "nextToken")}] (clojure.core/cond-> {} (letvar1071789 "computeEnvironments") (clojure.core/assoc :compute-environments (deser-compute-environment-detail-list (clojure.core/get-in letvar1071789 ["computeEnvironments"]))) (letvar1071789 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1071789 ["nextToken"])))))))

(clojure.core/defn- response-delete-job-queue-response ([input] (response-delete-job-queue-response nil input)) ([resultWrapper1071791 input] (clojure.core/let [rawinput1071790 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071792 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deregister-job-definition-response ([input] (response-deregister-job-definition-response nil input)) ([resultWrapper1071794 input] (clojure.core/let [rawinput1071793 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071795 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-compute-environment-response ([input] (response-create-compute-environment-response nil input)) ([resultWrapper1071797 input] (clojure.core/let [rawinput1071796 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071798 {"computeEnvironmentName" (rawinput1071796 "computeEnvironmentName"), "computeEnvironmentArn" (rawinput1071796 "computeEnvironmentArn")}] (clojure.core/cond-> {} (letvar1071798 "computeEnvironmentName") (clojure.core/assoc :compute-environment-name (deser-string (clojure.core/get-in letvar1071798 ["computeEnvironmentName"]))) (letvar1071798 "computeEnvironmentArn") (clojure.core/assoc :compute-environment-arn (deser-string (clojure.core/get-in letvar1071798 ["computeEnvironmentArn"])))))))

(clojure.core/defn- response-terminate-job-response ([input] (response-terminate-job-response nil input)) ([resultWrapper1071800 input] (clojure.core/let [rawinput1071799 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071801 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-job-queues-response ([input] (response-describe-job-queues-response nil input)) ([resultWrapper1071803 input] (clojure.core/let [rawinput1071802 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071804 {"jobQueues" (rawinput1071802 "jobQueues"), "nextToken" (rawinput1071802 "nextToken")}] (clojure.core/cond-> {} (letvar1071804 "jobQueues") (clojure.core/assoc :job-queues (deser-job-queue-detail-list (clojure.core/get-in letvar1071804 ["jobQueues"]))) (letvar1071804 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1071804 ["nextToken"])))))))

(clojure.core/defn- response-update-compute-environment-response ([input] (response-update-compute-environment-response nil input)) ([resultWrapper1071806 input] (clojure.core/let [rawinput1071805 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071807 {"computeEnvironmentName" (rawinput1071805 "computeEnvironmentName"), "computeEnvironmentArn" (rawinput1071805 "computeEnvironmentArn")}] (clojure.core/cond-> {} (letvar1071807 "computeEnvironmentName") (clojure.core/assoc :compute-environment-name (deser-string (clojure.core/get-in letvar1071807 ["computeEnvironmentName"]))) (letvar1071807 "computeEnvironmentArn") (clojure.core/assoc :compute-environment-arn (deser-string (clojure.core/get-in letvar1071807 ["computeEnvironmentArn"])))))))

(clojure.core/defn- response-submit-job-response ([input] (response-submit-job-response nil input)) ([resultWrapper1071809 input] (clojure.core/let [rawinput1071808 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071810 {"jobName" (rawinput1071808 "jobName"), "jobId" (rawinput1071808 "jobId")}] (clojure.core/cond-> {:job-name (deser-string (clojure.core/get-in letvar1071810 ["jobName"])), :job-id (deser-string (clojure.core/get-in letvar1071810 ["jobId"]))}))))

(clojure.core/defn- response-describe-jobs-response ([input] (response-describe-jobs-response nil input)) ([resultWrapper1071812 input] (clojure.core/let [rawinput1071811 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071813 {"jobs" (rawinput1071811 "jobs")}] (clojure.core/cond-> {} (letvar1071813 "jobs") (clojure.core/assoc :jobs (deser-job-detail-list (clojure.core/get-in letvar1071813 ["jobs"])))))))

(clojure.core/defn- response-register-job-definition-response ([input] (response-register-job-definition-response nil input)) ([resultWrapper1071815 input] (clojure.core/let [rawinput1071814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071816 {"jobDefinitionName" (rawinput1071814 "jobDefinitionName"), "jobDefinitionArn" (rawinput1071814 "jobDefinitionArn"), "revision" (rawinput1071814 "revision")}] (clojure.core/cond-> {:job-definition-name (deser-string (clojure.core/get-in letvar1071816 ["jobDefinitionName"])), :job-definition-arn (deser-string (clojure.core/get-in letvar1071816 ["jobDefinitionArn"])), :revision (deser-integer (clojure.core/get-in letvar1071816 ["revision"]))}))))

(clojure.core/defn- response-describe-job-definitions-response ([input] (response-describe-job-definitions-response nil input)) ([resultWrapper1071818 input] (clojure.core/let [rawinput1071817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071819 {"jobDefinitions" (rawinput1071817 "jobDefinitions"), "nextToken" (rawinput1071817 "nextToken")}] (clojure.core/cond-> {} (letvar1071819 "jobDefinitions") (clojure.core/assoc :job-definitions (deser-job-definition-list (clojure.core/get-in letvar1071819 ["jobDefinitions"]))) (letvar1071819 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1071819 ["nextToken"])))))))

(clojure.core/defn- response-server-exception ([input] (response-server-exception nil input)) ([resultWrapper1071821 input] (clojure.core/let [rawinput1071820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071822 {"message" (rawinput1071820 "message")}] (clojure.core/cond-> {} (letvar1071822 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1071822 ["message"])))))))

(clojure.core/defn- response-list-jobs-response ([input] (response-list-jobs-response nil input)) ([resultWrapper1071824 input] (clojure.core/let [rawinput1071823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071825 {"jobSummaryList" (rawinput1071823 "jobSummaryList"), "nextToken" (rawinput1071823 "nextToken")}] (clojure.core/cond-> {:job-summary-list (deser-job-summary-list (clojure.core/get-in letvar1071825 ["jobSummaryList"]))} (letvar1071825 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1071825 ["nextToken"])))))))

(clojure.core/defn- response-update-job-queue-response ([input] (response-update-job-queue-response nil input)) ([resultWrapper1071827 input] (clojure.core/let [rawinput1071826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1071828 {"jobQueueName" (rawinput1071826 "jobQueueName"), "jobQueueArn" (rawinput1071826 "jobQueueArn")}] (clojure.core/cond-> {} (letvar1071828 "jobQueueName") (clojure.core/assoc :job-queue-name (deser-string (clojure.core/get-in letvar1071828 ["jobQueueName"]))) (letvar1071828 "jobQueueArn") (clojure.core/assoc :job-queue-arn (deser-string (clojure.core/get-in letvar1071828 ["jobQueueArn"])))))))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-request/compute-environments :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/max-results :portkey.aws.batch.-2016-08-10.describe-compute-environments-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-type #{"multinode" :multinode :container "container"})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-name :portkey.aws.batch.-2016-08-10.create-job-queue-response/job-queue-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/node-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/container-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-request/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-request/job-name :portkey.aws.batch.-2016-08-10.submit-job-request/job-queue :portkey.aws.batch.-2016-08-10.submit-job-request/job-definition] :opt-un [:portkey.aws.batch.-2016-08-10.submit-job-request/retry-strategy :portkey.aws.batch.-2016-08-10.submit-job-request/node-overrides :portkey.aws.batch.-2016-08-10.submit-job-request/container-overrides :portkey.aws.batch.-2016-08-10.submit-job-request/timeout :portkey.aws.batch.-2016-08-10.submit-job-request/depends-on :portkey.aws.batch.-2016-08-10.submit-job-request/parameters :portkey.aws.batch.-2016-08-10.submit-job-request/array-properties]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-order/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-order (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-order/order :portkey.aws.batch.-2016-08-10.compute-environment-order/compute-environment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource-update))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-environment] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-request/state :portkey.aws.batch.-2016-08-10.update-compute-environment-request/compute-resources :portkey.aws.batch.-2016-08-10.update-compute-environment-request/service-role]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jq-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.mount-point/container-path :portkey.aws.batch.-2016-08-10.mount-point/read-only :portkey.aws.batch.-2016-08-10.mount-point/source-volume]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-details/node-index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-details/is-main-node (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.node-details/node-index :portkey.aws.batch.-2016-08-10.node-details/is-main-node]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties/size]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-status #{"RUNNABLE" :starting :pending "PENDING" :submitted "SUBMITTED" :running "SUCCEEDED" "STARTING" :runnable "FAILED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-detail))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/compute-environments (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-compute-environments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-compute-environments-response/compute-environments :portkey.aws.batch.-2016-08-10.describe-compute-environments-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.launch-template-specification/launch-template-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.launch-template-specification/launch-template-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.launch-template-specification/version (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/launch-template-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.launch-template-specification/launch-template-id :portkey.aws.batch.-2016-08-10.launch-template-specification/launch-template-name :portkey.aws.batch.-2016-08-10.launch-template-specification/version]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/host (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/host))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.volume/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.volume/host :portkey.aws.batch.-2016-08-10.volume/name]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties-summary/is-main-node (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties-summary/num-nodes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties-summary/node-index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-properties-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.node-properties-summary/is-main-node :portkey.aws.batch.-2016-08-10.node-properties-summary/num-nodes :portkey.aws.batch.-2016-08-10.node-properties-summary/node-index]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-name :portkey.aws.batch.-2016-08-10.create-compute-environment-response/compute-environment-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-summary/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-summary/index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties-summary/size :portkey.aws.batch.-2016-08-10.array-properties-summary/index]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/tags-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-details (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/attempt-detail))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/array-job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/multi-node-job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/job-status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-request/job-queue :portkey.aws.batch.-2016-08-10.list-jobs-request/array-job-id :portkey.aws.batch.-2016-08-10.list-jobs-request/multi-node-job-id :portkey.aws.batch.-2016-08-10.list-jobs-request/job-status :portkey.aws.batch.-2016-08-10.list-jobs-request/max-results :portkey.aws.batch.-2016-08-10.list-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource-update/minv-cpus :portkey.aws.batch.-2016-08-10.compute-resource-update/maxv-cpus :portkey.aws.batch.-2016-08-10.compute-resource-update/desiredv-cpus]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/node-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-definition/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.job-definition/job-definition-name :portkey.aws.batch.-2016-08-10.job-definition/job-definition-arn :portkey.aws.batch.-2016-08-10.job-definition/revision :portkey.aws.batch.-2016-08-10.job-definition/type] :opt-un [:portkey.aws.batch.-2016-08-10.job-definition/retry-strategy :portkey.aws.batch.-2016-08-10.job-definition/container-properties :portkey.aws.batch.-2016-08-10.job-definition/node-properties :portkey.aws.batch.-2016-08-10.job-definition/status :portkey.aws.batch.-2016-08-10.job-definition/timeout :portkey.aws.batch.-2016-08-10.job-definition/parameters]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/ulimits (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/mount-points (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/network-interfaces (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/network-interface-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/image (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/user (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/volumes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/privileged (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/instance-type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-detail/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-detail/ulimits :portkey.aws.batch.-2016-08-10.container-detail/command :portkey.aws.batch.-2016-08-10.container-detail/mount-points :portkey.aws.batch.-2016-08-10.container-detail/network-interfaces :portkey.aws.batch.-2016-08-10.container-detail/image :portkey.aws.batch.-2016-08-10.container-detail/exit-code :portkey.aws.batch.-2016-08-10.container-detail/user :portkey.aws.batch.-2016-08-10.container-detail/volumes :portkey.aws.batch.-2016-08-10.container-detail/privileged :portkey.aws.batch.-2016-08-10.container-detail/vcpus :portkey.aws.batch.-2016-08-10.container-detail/readonly-root-filesystem :portkey.aws.batch.-2016-08-10.container-detail/task-arn :portkey.aws.batch.-2016-08-10.container-detail/memory :portkey.aws.batch.-2016-08-10.container-detail/log-stream-name :portkey.aws.batch.-2016-08-10.container-detail/instance-type :portkey.aws.batch.-2016-08-10.container-detail/container-instance-arn :portkey.aws.batch.-2016-08-10.container-detail/environment :portkey.aws.batch.-2016-08-10.container-detail/reason :portkey.aws.batch.-2016-08-10.container-detail/job-role-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.deregister-job-definition-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/deregister-job-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.deregister-job-definition-request/job-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/jq-status #{:valid :deleted :creating "UPDATING" :invalid :deleting "INVALID" "DELETING" "CREATING" :updating "DELETED" "VALID"})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-request/job-queues :portkey.aws.batch.-2016-08-10.describe-job-queues-request/max-results :portkey.aws.batch.-2016-08-10.describe-job-queues-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-environment-name :portkey.aws.batch.-2016-08-10.create-compute-environment-request/type :portkey.aws.batch.-2016-08-10.create-compute-environment-request/service-role] :opt-un [:portkey.aws.batch.-2016-08-10.create-compute-environment-request/state :portkey.aws.batch.-2016-08-10.create-compute-environment-request/compute-resources]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-job-dependency #{:n-to-n :sequential "SEQUENTIAL" "N_TO_N"})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/container-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/node-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-request/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/job-definition-name :portkey.aws.batch.-2016-08-10.register-job-definition-request/type] :opt-un [:portkey.aws.batch.-2016-08-10.register-job-definition-request/parameters :portkey.aws.batch.-2016-08-10.register-job-definition-request/container-properties :portkey.aws.batch.-2016-08-10.register-job-definition-request/node-properties :portkey.aws.batch.-2016-08-10.register-job-definition-request/retry-strategy :portkey.aws.batch.-2016-08-10.register-job-definition-request/timeout]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.cancel-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.cancel-job-request/job-id :portkey.aws.batch.-2016-08-10.cancel-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/job-queues (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-queue-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-queues-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-queues-response/job-queues :portkey.aws.batch.-2016-08-10.describe-job-queues-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-dependency/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-dependency/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-job-dependency))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.job-dependency/job-id :portkey.aws.batch.-2016-08-10.job-dependency/type]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/ec-2-key-pair (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/spot-iam-fleet-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/subnets (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/bid-percentage (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/tags (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/tags-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/launch-template (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/image-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/placement-group (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/instance-types (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cr-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/security-group-ids (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-resource/instance-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.compute-resource/type :portkey.aws.batch.-2016-08-10.compute-resource/minv-cpus :portkey.aws.batch.-2016-08-10.compute-resource/maxv-cpus :portkey.aws.batch.-2016-08-10.compute-resource/instance-types :portkey.aws.batch.-2016-08-10.compute-resource/subnets :portkey.aws.batch.-2016-08-10.compute-resource/instance-role] :opt-un [:portkey.aws.batch.-2016-08-10.compute-resource/ec-2-key-pair :portkey.aws.batch.-2016-08-10.compute-resource/spot-iam-fleet-role :portkey.aws.batch.-2016-08-10.compute-resource/bid-percentage :portkey.aws.batch.-2016-08-10.compute-resource/tags :portkey.aws.batch.-2016-08-10.compute-resource/launch-template :portkey.aws.batch.-2016-08-10.compute-resource/image-id :portkey.aws.batch.-2016-08-10.compute-resource/placement-group :portkey.aws.batch.-2016-08-10.compute-resource/desiredv-cpus :portkey.aws.batch.-2016-08-10.compute-resource/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-queue-detail))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.terminate-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/terminate-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.terminate-job-request/job-id :portkey.aws.batch.-2016-08-10.terminate-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-definition-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-definition))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/cr-type #{"EC2" "SPOT" :ec-2 :spot})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.create-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/create-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/job-queue-name :portkey.aws.batch.-2016-08-10.create-job-queue-request/priority :portkey.aws.batch.-2016-08-10.create-job-queue-request/compute-environment-order] :opt-un [:portkey.aws.batch.-2016-08-10.create-job-queue-request/state]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-detail))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-property-overrides (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/node-property-override))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-property-override/target-nodes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-property-override/container-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-property-override (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.node-property-override/target-nodes] :opt-un [:portkey.aws.batch.-2016-08-10.node-property-override/container-overrides]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.delete-job-queue-request/job-queue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-summary/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-summary/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-summary/exit-code :portkey.aws.batch.-2016-08-10.container-summary/reason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/network-interface-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/network-interface))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-summary))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-name :portkey.aws.batch.-2016-08-10.update-compute-environment-response/compute-environment-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-detail/container :portkey.aws.batch.-2016-08-10.attempt-detail/started-at :portkey.aws.batch.-2016-08-10.attempt-detail/stopped-at :portkey.aws.batch.-2016-08-10.attempt-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.submit-job-response/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/submit-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.submit-job-response/job-name :portkey.aws.batch.-2016-08-10.submit-job-response/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-jobs-response/jobs]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/register-job-definition-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-name :portkey.aws.batch.-2016-08-10.register-job-definition-response/job-definition-arn :portkey.aws.batch.-2016-08-10.register-job-definition-response/revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-definition-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-response/job-definitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/service-role (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-resources (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-type))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.compute-environment-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-name :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-environment-arn :portkey.aws.batch.-2016-08-10.compute-environment-detail/ecs-cluster-arn] :opt-un [:portkey.aws.batch.-2016-08-10.compute-environment-detail/service-role :portkey.aws.batch.-2016-08-10.compute-environment-detail/status :portkey.aws.batch.-2016-08-10.compute-environment-detail/compute-resources :portkey.aws.batch.-2016-08-10.compute-environment-detail/type :portkey.aws.batch.-2016-08-10.compute-environment-detail/state :portkey.aws.batch.-2016-08-10.compute-environment-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ce-status #{:valid :deleted :creating "UPDATING" :invalid :deleting "INVALID" "DELETING" "CREATING" :updating "DELETED" "VALID"})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.network-interface/attachment-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.network-interface/ipv-6-address (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.network-interface/private-ipv-4-address (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.network-interface/attachment-id :portkey.aws.batch.-2016-08-10.network-interface/ipv-6-address :portkey.aws.batch.-2016-08-10.network-interface/private-ipv-4-address]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-job-status-summary (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/integer))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.server-exception/message (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/parameters-map (clojure.spec.alpha/map-of :portkey.aws.batch.-2016-08-10/string :portkey.aws.batch.-2016-08-10/string))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/instance-type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-overrides/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-overrides/vcpus :portkey.aws.batch.-2016-08-10.container-overrides/memory :portkey.aws.batch.-2016-08-10.container-overrides/command :portkey.aws.batch.-2016-08-10.container-overrides/instance-type :portkey.aws.batch.-2016-08-10.container-overrides/environment]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.describe-jobs-request/jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/status-summary (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-job-status-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/size (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.array-properties-detail/index (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/array-properties-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.array-properties-detail/status-summary :portkey.aws.batch.-2016-08-10.array-properties-detail/size :portkey.aws.batch.-2016-08-10.array-properties-detail/index]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-dependency-list (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/job-dependency))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jq-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-queue-detail/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-queue-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-name :portkey.aws.batch.-2016-08-10.job-queue-detail/job-queue-arn :portkey.aws.batch.-2016-08-10.job-queue-detail/state :portkey.aws.batch.-2016-08-10.job-queue-detail/priority :portkey.aws.batch.-2016-08-10.job-queue-detail/compute-environment-order] :opt-un [:portkey.aws.batch.-2016-08-10.job-queue-detail/status :portkey.aws.batch.-2016-08-10.job-queue-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimits (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/ulimit))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-timeout/attempt-duration-seconds (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.job-timeout/attempt-duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ce-type #{"MANAGED" :managed "UNMANAGED" :unmanaged})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/ulimits (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/command (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/mount-points (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/image (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/user (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/volumes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/privileged (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/vcpus (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/memory (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/instance-type (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.container-properties/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/container-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.container-properties/ulimits :portkey.aws.batch.-2016-08-10.container-properties/command :portkey.aws.batch.-2016-08-10.container-properties/mount-points :portkey.aws.batch.-2016-08-10.container-properties/image :portkey.aws.batch.-2016-08-10.container-properties/user :portkey.aws.batch.-2016-08-10.container-properties/volumes :portkey.aws.batch.-2016-08-10.container-properties/privileged :portkey.aws.batch.-2016-08-10.container-properties/vcpus :portkey.aws.batch.-2016-08-10.container-properties/readonly-root-filesystem :portkey.aws.batch.-2016-08-10.container-properties/memory :portkey.aws.batch.-2016-08-10.container-properties/instance-type :portkey.aws.batch.-2016-08-10.container-properties/environment :portkey.aws.batch.-2016-08-10.container-properties/job-role-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties/num-nodes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties/main-node (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-properties/node-range-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-range-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-properties (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.node-properties/num-nodes :portkey.aws.batch.-2016-08-10.node-properties/main-node :portkey.aws.batch.-2016-08-10.node-properties/node-range-properties] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ulimit (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.ulimit/hard-limit :portkey.aws.batch.-2016-08-10.ulimit/name :portkey.aws.batch.-2016-08-10.ulimit/soft-limit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-range-property/target-nodes (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-range-property/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-range-property (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.node-range-property/target-nodes] :opt-un [:portkey.aws.batch.-2016-08-10.node-range-property/container]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/created-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/node-details (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-details))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/node-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-properties))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/timeout (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/attempt-details))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/depends-on (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/parameters (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-definition (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-detail/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.job-detail/job-name :portkey.aws.batch.-2016-08-10.job-detail/job-id :portkey.aws.batch.-2016-08-10.job-detail/job-queue :portkey.aws.batch.-2016-08-10.job-detail/status :portkey.aws.batch.-2016-08-10.job-detail/started-at :portkey.aws.batch.-2016-08-10.job-detail/job-definition] :opt-un [:portkey.aws.batch.-2016-08-10.job-detail/retry-strategy :portkey.aws.batch.-2016-08-10.job-detail/created-at :portkey.aws.batch.-2016-08-10.job-detail/node-details :portkey.aws.batch.-2016-08-10.job-detail/node-properties :portkey.aws.batch.-2016-08-10.job-detail/stopped-at :portkey.aws.batch.-2016-08-10.job-detail/timeout :portkey.aws.batch.-2016-08-10.job-detail/attempts :portkey.aws.batch.-2016-08-10.job-detail/status-reason :portkey.aws.batch.-2016-08-10.job-detail/depends-on :portkey.aws.batch.-2016-08-10.job-detail/parameters :portkey.aws.batch.-2016-08-10.job-detail/array-properties :portkey.aws.batch.-2016-08-10.job-detail/container]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.node-overrides/node-property-overrides (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-property-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.node-overrides/node-property-overrides]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/ce-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.attempt-container-detail/network-interfaces (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/network-interface-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/attempt-container-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.attempt-container-detail/container-instance-arn :portkey.aws.batch.-2016-08-10.attempt-container-detail/task-arn :portkey.aws.batch.-2016-08-10.attempt-container-detail/exit-code :portkey.aws.batch.-2016-08-10.attempt-container-detail/reason :portkey.aws.batch.-2016-08-10.attempt-container-detail/log-stream-name :portkey.aws.batch.-2016-08-10.attempt-container-detail/network-interfaces]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definitions (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/describe-job-definitions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definitions :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/max-results :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/job-definition-name :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/status :portkey.aws.batch.-2016-08-10.describe-job-definitions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/volumes (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/volume))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/job-summary-list (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/list-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/job-summary-list] :opt-un [:portkey.aws.batch.-2016-08-10.list-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/mount-points (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/mount-point))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/created-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/started-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/node-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/node-properties-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/stopped-at (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/long))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/status (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/status-reason (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/array-properties (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/array-properties-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/container (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/container-summary))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.job-summary/job-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.job-summary/job-id :portkey.aws.batch.-2016-08-10.job-summary/job-name] :opt-un [:portkey.aws.batch.-2016-08-10.job-summary/created-at :portkey.aws.batch.-2016-08-10.job-summary/started-at :portkey.aws.batch.-2016-08-10.job-summary/node-properties :portkey.aws.batch.-2016-08-10.job-summary/stopped-at :portkey.aws.batch.-2016-08-10.job-summary/status :portkey.aws.batch.-2016-08-10.job-summary/status-reason :portkey.aws.batch.-2016-08-10.job-summary/array-properties :portkey.aws.batch.-2016-08-10.job-summary/container]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-name :portkey.aws.batch.-2016-08-10.update-job-queue-response/job-queue-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.host/source-path (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/host (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.host/source-path]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/node-range-properties (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/node-range-property))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.delete-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/delete-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.delete-compute-environment-request/compute-environment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/compute-environment-orders (clojure.spec.alpha/coll-of :portkey.aws.batch.-2016-08-10/compute-environment-order))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.update-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/update-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/job-queue] :opt-un [:portkey.aws.batch.-2016-08-10.update-job-queue-request/state :portkey.aws.batch.-2016-08-10.update-job-queue-request/priority :portkey.aws.batch.-2016-08-10.update-job-queue-request/compute-environment-order]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/integer))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/retry-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/string))
(clojure.spec.alpha/def :portkey.aws.batch.-2016-08-10/key-value-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.-2016-08-10.key-value-pair/name :portkey.aws.batch.-2016-08-10.key-value-pair/value]))

(clojure.core/defn describe-job-definitions ([] (describe-job-definitions {})) ([describe-job-definitions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-job-definitions-request describe-job-definitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/describe-job-definitions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobdefinitions", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/describe-job-definitions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJobDefinitions", :http.request.configuration/output-deser-fn response-describe-job-definitions-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef describe-job-definitions :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-job-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-job-definitions-response))

(clojure.core/defn register-job-definition ([register-job-definition-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-register-job-definition-request register-job-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/register-job-definition-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/registerjobdefinition", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/register-job-definition-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterJobDefinition", :http.request.configuration/output-deser-fn response-register-job-definition-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef register-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/register-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/register-job-definition-response))

(clojure.core/defn describe-compute-environments ([] (describe-compute-environments {})) ([describe-compute-environments-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-compute-environments-request describe-compute-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/describe-compute-environments-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describecomputeenvironments", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/describe-compute-environments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeComputeEnvironments", :http.request.configuration/output-deser-fn response-describe-compute-environments-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef describe-compute-environments :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-compute-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-compute-environments-response))

(clojure.core/defn update-compute-environment ([update-compute-environment-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-compute-environment-request update-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/update-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/updatecomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/update-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateComputeEnvironment", :http.request.configuration/output-deser-fn response-update-compute-environment-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef update-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/update-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/update-compute-environment-response))

(clojure.core/defn delete-job-queue ([delete-job-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-job-queue-request delete-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/delete-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deletejobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/delete-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteJobQueue", :http.request.configuration/output-deser-fn response-delete-job-queue-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef delete-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/delete-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/delete-job-queue-response))

(clojure.core/defn create-compute-environment ([create-compute-environment-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-compute-environment-request create-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/create-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/createcomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/create-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateComputeEnvironment", :http.request.configuration/output-deser-fn response-create-compute-environment-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef create-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/create-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/create-compute-environment-response))

(clojure.core/defn update-job-queue ([update-job-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-job-queue-request update-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/update-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/updatejobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/update-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateJobQueue", :http.request.configuration/output-deser-fn response-update-job-queue-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef update-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/update-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/update-job-queue-response))

(clojure.core/defn terminate-job ([terminate-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-terminate-job-request terminate-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/terminate-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/terminatejob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/terminate-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TerminateJob", :http.request.configuration/output-deser-fn response-terminate-job-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef terminate-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/terminate-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/terminate-job-response))

(clojure.core/defn describe-job-queues ([] (describe-job-queues {})) ([describe-job-queues-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-job-queues-request describe-job-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/describe-job-queues-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobqueues", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/describe-job-queues-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJobQueues", :http.request.configuration/output-deser-fn response-describe-job-queues-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef describe-job-queues :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/describe-job-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-job-queues-response))

(clojure.core/defn submit-job ([submit-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-submit-job-request submit-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/submit-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/submitjob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/submit-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SubmitJob", :http.request.configuration/output-deser-fn response-submit-job-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef submit-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/submit-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/submit-job-response))

(clojure.core/defn delete-compute-environment ([delete-compute-environment-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-compute-environment-request delete-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/delete-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deletecomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/delete-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteComputeEnvironment", :http.request.configuration/output-deser-fn response-delete-compute-environment-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef delete-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/delete-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/delete-compute-environment-response))

(clojure.core/defn deregister-job-definition ([deregister-job-definition-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-deregister-job-definition-request deregister-job-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/deregister-job-definition-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deregisterjobdefinition", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/deregister-job-definition-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterJobDefinition", :http.request.configuration/output-deser-fn response-deregister-job-definition-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef deregister-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/deregister-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/deregister-job-definition-response))

(clojure.core/defn describe-jobs ([describe-jobs-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-describe-jobs-request describe-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/describe-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobs", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/describe-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeJobs", :http.request.configuration/output-deser-fn response-describe-jobs-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef describe-jobs :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/describe-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/describe-jobs-response))

(clojure.core/defn create-job-queue ([create-job-queue-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-job-queue-request create-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/create-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/createjobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/create-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateJobQueue", :http.request.configuration/output-deser-fn response-create-job-queue-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef create-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/create-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/create-job-queue-response))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/list-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/listjobs", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/list-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.batch.-2016-08-10/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/list-jobs-response))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.batch.-2016-08-10/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.batch.-2016-08-10/cancel-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/canceljob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch.-2016-08-10/cancel-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-response, :http.request.spec/error-spec {"ClientException" :portkey.aws.batch.-2016-08-10/client-exception, "ServerException" :portkey.aws.batch.-2016-08-10/server-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.batch.-2016-08-10/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch.-2016-08-10/cancel-job-response))
