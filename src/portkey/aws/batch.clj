(ns portkey.aws.batch (:require [portkey.aws]))

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
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-job-definition-type)

(clojure.core/declare ser-compute-environment-order)

(clojure.core/declare ser-jq-state)

(clojure.core/declare ser-mount-point)

(clojure.core/declare ser-array-properties)

(clojure.core/declare ser-job-status)

(clojure.core/declare ser-volume)

(clojure.core/declare ser-tags-map)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-compute-resource-update)

(clojure.core/declare ser-array-job-dependency)

(clojure.core/declare ser-job-dependency)

(clojure.core/declare ser-compute-resource)

(clojure.core/declare ser-cr-type)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-parameters-map)

(clojure.core/declare ser-container-overrides)

(clojure.core/declare ser-job-dependency-list)

(clojure.core/declare ser-ulimits)

(clojure.core/declare ser-job-timeout)

(clojure.core/declare ser-ce-type)

(clojure.core/declare ser-container-properties)

(clojure.core/declare ser-ulimit)

(clojure.core/declare ser-ce-state)

(clojure.core/declare ser-volumes)

(clojure.core/declare ser-mount-points)

(clojure.core/declare ser-host)

(clojure.core/declare ser-compute-environment-orders)

(clojure.core/declare ser-retry-strategy)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-key-value-pair)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-job-definition-type [input] #:http.request.field{:value (clojure.core/get {"container" "container", :container "container"} input), :shape "JobDefinitionType"})

(clojure.core/defn- ser-compute-environment-order [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:order input)) #:http.request.field{:name "order", :shape "Integer"}) (clojure.core/into (ser-string (:compute-environment input)) #:http.request.field{:name "computeEnvironment", :shape "String"})], :shape "ComputeEnvironmentOrder", :type "structure"}))

(clojure.core/defn- ser-jq-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "JQState"})

(clojure.core/defn- ser-mount-point [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MountPoint", :type "structure"} (clojure.core/contains? input :container-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :container-path)) #:http.request.field{:name "containerPath", :shape "String"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "readOnly", :shape "Boolean"})) (clojure.core/contains? input :source-volume) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-volume)) #:http.request.field{:name "sourceVolume", :shape "String"}))))

(clojure.core/defn- ser-array-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ArrayProperties", :type "structure"} (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :size)) #:http.request.field{:name "size", :shape "Integer"}))))

(clojure.core/defn- ser-job-status [input] #:http.request.field{:value (clojure.core/get {"RUNNABLE" "RUNNABLE", :starting "STARTING", :pending "PENDING", "PENDING" "PENDING", :submitted "SUBMITTED", "SUBMITTED" "SUBMITTED", :running "RUNNING", "SUCCEEDED" "SUCCEEDED", "STARTING" "STARTING", :runnable "RUNNABLE", "FAILED" "FAILED", :failed "FAILED", "RUNNING" "RUNNING", :succeeded "SUCCEEDED"} input), :shape "JobStatus"})

(clojure.core/defn- ser-volume [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Volume", :type "structure"} (clojure.core/contains? input :host) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-host (input :host)) #:http.request.field{:name "host", :shape "Host"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"}))))

(clojure.core/defn- ser-tags-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "TagsMap", :type "map"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-key-value-pair coll) #:http.request.field{:shape "KeyValuePair"}))) input), :shape "EnvironmentVariables", :type "list"})

(clojure.core/defn- ser-compute-resource-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ComputeResourceUpdate", :type "structure"} (clojure.core/contains? input :minv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :minv-cpus)) #:http.request.field{:name "minvCpus", :shape "Integer"})) (clojure.core/contains? input :maxv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :maxv-cpus)) #:http.request.field{:name "maxvCpus", :shape "Integer"})) (clojure.core/contains? input :desiredv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :desiredv-cpus)) #:http.request.field{:name "desiredvCpus", :shape "Integer"}))))

(clojure.core/defn- ser-array-job-dependency [input] #:http.request.field{:value (clojure.core/get {"N_TO_N" "N_TO_N", :n-to-n "N_TO_N", "SEQUENTIAL" "SEQUENTIAL", :sequential "SEQUENTIAL"} input), :shape "ArrayJobDependency"})

(clojure.core/defn- ser-job-dependency [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobDependency", :type "structure"} (clojure.core/contains? input :job-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-array-job-dependency (input :type)) #:http.request.field{:name "type", :shape "ArrayJobDependency"}))))

(clojure.core/defn- ser-compute-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cr-type (:type input)) #:http.request.field{:name "type", :shape "CRType"}) (clojure.core/into (ser-integer (:minv-cpus input)) #:http.request.field{:name "minvCpus", :shape "Integer"}) (clojure.core/into (ser-integer (:maxv-cpus input)) #:http.request.field{:name "maxvCpus", :shape "Integer"}) (clojure.core/into (ser-string-list (:instance-types input)) #:http.request.field{:name "instanceTypes", :shape "StringList"}) (clojure.core/into (ser-string-list (:subnets input)) #:http.request.field{:name "subnets", :shape "StringList"}) (clojure.core/into (ser-string-list (:security-group-ids input)) #:http.request.field{:name "securityGroupIds", :shape "StringList"}) (clojure.core/into (ser-string (:instance-role input)) #:http.request.field{:name "instanceRole", :shape "String"})], :shape "ComputeResource", :type "structure"} (clojure.core/contains? input :ec-2-key-pair) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :ec-2-key-pair)) #:http.request.field{:name "ec2KeyPair", :shape "String"})) (clojure.core/contains? input :spot-iam-fleet-role) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :spot-iam-fleet-role)) #:http.request.field{:name "spotIamFleetRole", :shape "String"})) (clojure.core/contains? input :bid-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :bid-percentage)) #:http.request.field{:name "bidPercentage", :shape "Integer"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-map (input :tags)) #:http.request.field{:name "tags", :shape "TagsMap"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :image-id)) #:http.request.field{:name "imageId", :shape "String"})) (clojure.core/contains? input :desiredv-cpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :desiredv-cpus)) #:http.request.field{:name "desiredvCpus", :shape "Integer"}))))

(clojure.core/defn- ser-cr-type [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "SPOT" "SPOT", :spot "SPOT"} input), :shape "CRType"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-parameters-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String"})])) input), :shape "ParametersMap", :type "map"})

(clojure.core/defn- ser-container-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerOverrides", :type "structure"} (clojure.core/contains? input :vcpus) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :vcpus)) #:http.request.field{:name "vcpus", :shape "Integer"})) (clojure.core/contains? input :memory) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :memory)) #:http.request.field{:name "memory", :shape "Integer"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"}))))

(clojure.core/defn- ser-job-dependency-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-job-dependency coll) #:http.request.field{:shape "JobDependency"}))) input), :shape "JobDependencyList", :type "list"})

(clojure.core/defn- ser-ulimits [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ulimit coll) #:http.request.field{:shape "Ulimit"}))) input), :shape "Ulimits", :type "list"})

(clojure.core/defn- ser-job-timeout [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "JobTimeout", :type "structure"} (clojure.core/contains? input :attempt-duration-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :attempt-duration-seconds)) #:http.request.field{:name "attemptDurationSeconds", :shape "Integer"}))))

(clojure.core/defn- ser-ce-type [input] #:http.request.field{:value (clojure.core/get {"MANAGED" "MANAGED", :managed "MANAGED", "UNMANAGED" "UNMANAGED", :unmanaged "UNMANAGED"} input), :shape "CEType"})

(clojure.core/defn- ser-container-properties [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:image input)) #:http.request.field{:name "image", :shape "String"}) (clojure.core/into (ser-integer (:vcpus input)) #:http.request.field{:name "vcpus", :shape "Integer"}) (clojure.core/into (ser-integer (:memory input)) #:http.request.field{:name "memory", :shape "Integer"})], :shape "ContainerProperties", :type "structure"} (clojure.core/contains? input :ulimits) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ulimits (input :ulimits)) #:http.request.field{:name "ulimits", :shape "Ulimits"})) (clojure.core/contains? input :command) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :command)) #:http.request.field{:name "command", :shape "StringList"})) (clojure.core/contains? input :mount-points) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mount-points (input :mount-points)) #:http.request.field{:name "mountPoints", :shape "MountPoints"})) (clojure.core/contains? input :user) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :user)) #:http.request.field{:name "user", :shape "String"})) (clojure.core/contains? input :volumes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volumes (input :volumes)) #:http.request.field{:name "volumes", :shape "Volumes"})) (clojure.core/contains? input :privileged) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :privileged)) #:http.request.field{:name "privileged", :shape "Boolean"})) (clojure.core/contains? input :readonly-root-filesystem) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :readonly-root-filesystem)) #:http.request.field{:name "readonlyRootFilesystem", :shape "Boolean"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :environment)) #:http.request.field{:name "environment", :shape "EnvironmentVariables"})) (clojure.core/contains? input :job-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-role-arn)) #:http.request.field{:name "jobRoleArn", :shape "String"}))))

(clojure.core/defn- ser-ulimit [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-integer (:hard-limit input)) #:http.request.field{:name "hardLimit", :shape "Integer"}) (clojure.core/into (ser-string (:name input)) #:http.request.field{:name "name", :shape "String"}) (clojure.core/into (ser-integer (:soft-limit input)) #:http.request.field{:name "softLimit", :shape "Integer"})], :shape "Ulimit", :type "structure"}))

(clojure.core/defn- ser-ce-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "CEState"})

(clojure.core/defn- ser-volumes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume coll) #:http.request.field{:shape "Volume"}))) input), :shape "Volumes", :type "list"})

(clojure.core/defn- ser-mount-points [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-mount-point coll) #:http.request.field{:shape "MountPoint"}))) input), :shape "MountPoints", :type "list"})

(clojure.core/defn- ser-host [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Host", :type "structure"} (clojure.core/contains? input :source-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-path)) #:http.request.field{:name "sourcePath", :shape "String"}))))

(clojure.core/defn- ser-compute-environment-orders [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compute-environment-order coll) #:http.request.field{:shape "ComputeEnvironmentOrder"}))) input), :shape "ComputeEnvironmentOrders", :type "list"})

(clojure.core/defn- ser-retry-strategy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RetryStrategy", :type "structure"} (clojure.core/contains? input :attempts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :attempts)) #:http.request.field{:name "attempts", :shape "Integer"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-key-value-pair [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KeyValuePair", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "value", :shape "String"}))))

(clojure.core/defn- req-describe-compute-environments-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :compute-environments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :compute-environments)) #:http.request.field{:name "computeEnvironments", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-submit-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-name)) #:http.request.field{:name "jobName", :shape "String"}) (clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"}) (clojure.core/into (ser-string (input :job-definition)) #:http.request.field{:name "jobDefinition", :shape "String"})]} (clojure.core/contains? input :retry-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retry-strategy (input :retry-strategy)) #:http.request.field{:name "retryStrategy", :shape "RetryStrategy"})) (clojure.core/contains? input :container-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-overrides (input :container-overrides)) #:http.request.field{:name "containerOverrides", :shape "ContainerOverrides"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout (input :timeout)) #:http.request.field{:name "timeout", :shape "JobTimeout"})) (clojure.core/contains? input :depends-on) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-dependency-list (input :depends-on)) #:http.request.field{:name "dependsOn", :shape "JobDependencyList"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "parameters", :shape "ParametersMap"})) (clojure.core/contains? input :array-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-array-properties (input :array-properties)) #:http.request.field{:name "arrayProperties", :shape "ArrayProperties"}))))

(clojure.core/defn- req-update-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment)) #:http.request.field{:name "computeEnvironment", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ce-state (input :state)) #:http.request.field{:name "state", :shape "CEState"})) (clojure.core/contains? input :compute-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-resource-update (input :compute-resources)) #:http.request.field{:name "computeResources", :shape "ComputeResourceUpdate"})) (clojure.core/contains? input :service-role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "String"}))))

(clojure.core/defn- req-list-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-queue) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})) (clojure.core/contains? input :array-job-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :array-job-id)) #:http.request.field{:name "arrayJobId", :shape "String"})) (clojure.core/contains? input :job-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-status (input :job-status)) #:http.request.field{:name "jobStatus", :shape "JobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-deregister-job-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-definition)) #:http.request.field{:name "jobDefinition", :shape "String"})]}))

(clojure.core/defn- req-describe-job-queues-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-queues) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :job-queues)) #:http.request.field{:name "jobQueues", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-create-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment-name)) #:http.request.field{:name "computeEnvironmentName", :shape "String"}) (clojure.core/into (ser-ce-type (input :type)) #:http.request.field{:name "type", :shape "CEType"}) (clojure.core/into (ser-string (input :service-role)) #:http.request.field{:name "serviceRole", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ce-state (input :state)) #:http.request.field{:name "state", :shape "CEState"})) (clojure.core/contains? input :compute-resources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-resource (input :compute-resources)) #:http.request.field{:name "computeResources", :shape "ComputeResource"}))))

(clojure.core/defn- req-register-job-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-definition-name)) #:http.request.field{:name "jobDefinitionName", :shape "String"}) (clojure.core/into (ser-job-definition-type (input :type)) #:http.request.field{:name "type", :shape "JobDefinitionType"})]} (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameters-map (input :parameters)) #:http.request.field{:name "parameters", :shape "ParametersMap"})) (clojure.core/contains? input :container-properties) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-properties (input :container-properties)) #:http.request.field{:name "containerProperties", :shape "ContainerProperties"})) (clojure.core/contains? input :retry-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-retry-strategy (input :retry-strategy)) #:http.request.field{:name "retryStrategy", :shape "RetryStrategy"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-timeout (input :timeout)) #:http.request.field{:name "timeout", :shape "JobTimeout"}))))

(clojure.core/defn- req-cancel-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})]}))

(clojure.core/defn- req-terminate-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-id)) #:http.request.field{:name "jobId", :shape "String"}) (clojure.core/into (ser-string (input :reason)) #:http.request.field{:name "reason", :shape "String"})]}))

(clojure.core/defn- req-create-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue-name)) #:http.request.field{:name "jobQueueName", :shape "String"}) (clojure.core/into (ser-integer (input :priority)) #:http.request.field{:name "priority", :shape "Integer"}) (clojure.core/into (ser-compute-environment-orders (input :compute-environment-order)) #:http.request.field{:name "computeEnvironmentOrder", :shape "ComputeEnvironmentOrders"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jq-state (input :state)) #:http.request.field{:name "state", :shape "JQState"}))))

(clojure.core/defn- req-delete-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})]}))

(clojure.core/defn- req-describe-jobs-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string-list (input :jobs)) #:http.request.field{:name "jobs", :shape "StringList"})]}))

(clojure.core/defn- req-describe-job-definitions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :job-definitions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :job-definitions)) #:http.request.field{:name "jobDefinitions", :shape "StringList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-results)) #:http.request.field{:name "maxResults", :shape "Integer"})) (clojure.core/contains? input :job-definition-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :job-definition-name)) #:http.request.field{:name "jobDefinitionName", :shape "String"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :status)) #:http.request.field{:name "status", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"}))))

(clojure.core/defn- req-delete-compute-environment-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :compute-environment)) #:http.request.field{:name "computeEnvironment", :shape "String"})]}))

(clojure.core/defn- req-update-job-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :job-queue)) #:http.request.field{:name "jobQueue", :shape "String"})]} (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-jq-state (input :state)) #:http.request.field{:name "state", :shape "JQState"})) (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :priority)) #:http.request.field{:name "priority", :shape "Integer"})) (clojure.core/contains? input :compute-environment-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-environment-orders (input :compute-environment-order)) #:http.request.field{:name "computeEnvironmentOrder", :shape "ComputeEnvironmentOrders"}))))

(clojure.spec.alpha/def :portkey.aws.batch/delete-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/compute-environments (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-compute-environments-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-compute-environments-request/compute-environments :portkey.aws.batch.describe-compute-environments-request/max-results :portkey.aws.batch.describe-compute-environments-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch/string-list (clojure.spec.alpha/coll-of :portkey.aws.batch/string))

(clojure.spec.alpha/def :portkey.aws.batch/job-definition-type #{:container "container"})

(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-job-queue-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.create-job-queue-response/job-queue-name :portkey.aws.batch.create-job-queue-response/job-queue-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/container-overrides (clojure.spec.alpha/and :portkey.aws.batch/container-overrides))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/timeout (clojure.spec.alpha/and :portkey.aws.batch/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/depends-on (clojure.spec.alpha/and :portkey.aws.batch/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/array-properties (clojure.spec.alpha/and :portkey.aws.batch/array-properties))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-request/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/submit-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.submit-job-request/job-name :portkey.aws.batch.submit-job-request/job-queue :portkey.aws.batch.submit-job-request/job-definition] :opt-un [:portkey.aws.batch.submit-job-request/retry-strategy :portkey.aws.batch.submit-job-request/container-overrides :portkey.aws.batch.submit-job-request/timeout :portkey.aws.batch.submit-job-request/depends-on :portkey.aws.batch.submit-job-request/parameters :portkey.aws.batch.submit-job-request/array-properties]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-order/order (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-order/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-order (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.compute-environment-order/order :portkey.aws.batch.compute-environment-order/compute-environment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource-update))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.update-compute-environment-request/compute-environment] :opt-un [:portkey.aws.batch.update-compute-environment-request/state :portkey.aws.batch.update-compute-environment-request/compute-resources :portkey.aws.batch.update-compute-environment-request/service-role]))

(clojure.spec.alpha/def :portkey.aws.batch/jq-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.batch.mount-point/container-path (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/read-only (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.mount-point/source-volume (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/mount-point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.mount-point/container-path :portkey.aws.batch.mount-point/read-only :portkey.aws.batch.mount-point/source-volume]))

(clojure.spec.alpha/def :portkey.aws.batch/cancel-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.array-properties/size (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/array-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.array-properties/size]))

(clojure.spec.alpha/def :portkey.aws.batch.client-exception/message (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/client-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.client-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch/job-status #{"RUNNABLE" :starting :pending "PENDING" :submitted "SUBMITTED" :running "SUCCEEDED" "STARTING" :runnable "FAILED" :failed "RUNNING" :succeeded})

(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/compute-environment-detail))

(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-response/compute-environments (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-compute-environments-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-compute-environments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-compute-environments-response/compute-environments :portkey.aws.batch.describe-compute-environments-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.volume/host (clojure.spec.alpha/and :portkey.aws.batch/host))
(clojure.spec.alpha/def :portkey.aws.batch.volume/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.volume/host :portkey.aws.batch.volume/name]))

(clojure.spec.alpha/def :portkey.aws.batch/delete-job-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/deregister-job-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.create-compute-environment-response/compute-environment-name :portkey.aws.batch.create-compute-environment-response/compute-environment-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.array-properties-summary/size (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.array-properties-summary/index (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/array-properties-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.array-properties-summary/size :portkey.aws.batch.array-properties-summary/index]))

(clojure.spec.alpha/def :portkey.aws.batch/tags-map (clojure.spec.alpha/map-of :portkey.aws.batch/string :portkey.aws.batch/string))

(clojure.spec.alpha/def :portkey.aws.batch/attempt-details (clojure.spec.alpha/coll-of :portkey.aws.batch/attempt-detail))

(clojure.spec.alpha/def :portkey.aws.batch/environment-variables (clojure.spec.alpha/coll-of :portkey.aws.batch/key-value-pair))

(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/array-job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/job-status (clojure.spec.alpha/and :portkey.aws.batch/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/list-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.list-jobs-request/job-queue :portkey.aws.batch.list-jobs-request/array-job-id :portkey.aws.batch.list-jobs-request/job-status :portkey.aws.batch.list-jobs-request/max-results :portkey.aws.batch.list-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource-update/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/compute-resource-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.compute-resource-update/minv-cpus :portkey.aws.batch.compute-resource-update/maxv-cpus :portkey.aws.batch.compute-resource-update/desiredv-cpus]))

(clojure.spec.alpha/def :portkey.aws.batch.job-definition/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/container-properties (clojure.spec.alpha/and :portkey.aws.batch/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/revision (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/status (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/timeout (clojure.spec.alpha/and :portkey.aws.batch/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/type (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-definition/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch/job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.job-definition/job-definition-name :portkey.aws.batch.job-definition/job-definition-arn :portkey.aws.batch.job-definition/revision :portkey.aws.batch.job-definition/type] :opt-un [:portkey.aws.batch.job-definition/retry-strategy :portkey.aws.batch.job-definition/container-properties :portkey.aws.batch.job-definition/status :portkey.aws.batch.job-definition/timeout :portkey.aws.batch.job-definition/parameters]))

(clojure.spec.alpha/def :portkey.aws.batch.container-detail/ulimits (clojure.spec.alpha/and :portkey.aws.batch/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/mount-points (clojure.spec.alpha/and :portkey.aws.batch/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/image (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/user (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/volumes (clojure.spec.alpha/and :portkey.aws.batch/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/privileged (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-detail/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/container-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.container-detail/ulimits :portkey.aws.batch.container-detail/command :portkey.aws.batch.container-detail/mount-points :portkey.aws.batch.container-detail/image :portkey.aws.batch.container-detail/exit-code :portkey.aws.batch.container-detail/user :portkey.aws.batch.container-detail/volumes :portkey.aws.batch.container-detail/privileged :portkey.aws.batch.container-detail/vcpus :portkey.aws.batch.container-detail/readonly-root-filesystem :portkey.aws.batch.container-detail/task-arn :portkey.aws.batch.container-detail/memory :portkey.aws.batch.container-detail/log-stream-name :portkey.aws.batch.container-detail/container-instance-arn :portkey.aws.batch.container-detail/environment :portkey.aws.batch.container-detail/reason :portkey.aws.batch.container-detail/job-role-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.deregister-job-definition-request/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/deregister-job-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.deregister-job-definition-request/job-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/jq-status #{:valid :deleted :creating "UPDATING" :invalid :deleting "INVALID" "DELETING" "CREATING" :updating "DELETED" "VALID"})

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/job-queues (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-queues-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-queues-request/job-queues :portkey.aws.batch.describe-job-queues-request/max-results :portkey.aws.batch.describe-job-queues-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/type (clojure.spec.alpha/and :portkey.aws.batch/ce-type))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/state (clojure.spec.alpha/and :portkey.aws.batch/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.create-compute-environment-request/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/create-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.create-compute-environment-request/compute-environment-name :portkey.aws.batch.create-compute-environment-request/type :portkey.aws.batch.create-compute-environment-request/service-role] :opt-un [:portkey.aws.batch.create-compute-environment-request/state :portkey.aws.batch.create-compute-environment-request/compute-resources]))

(clojure.spec.alpha/def :portkey.aws.batch/array-job-dependency #{:n-to-n :sequential "SEQUENTIAL" "N_TO_N"})

(clojure.spec.alpha/def :portkey.aws.batch/terminate-job-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/type (clojure.spec.alpha/and :portkey.aws.batch/job-definition-type))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/container-properties (clojure.spec.alpha/and :portkey.aws.batch/container-properties))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-request/timeout (clojure.spec.alpha/and :portkey.aws.batch/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch/register-job-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.register-job-definition-request/job-definition-name :portkey.aws.batch.register-job-definition-request/type] :opt-un [:portkey.aws.batch.register-job-definition-request/parameters :portkey.aws.batch.register-job-definition-request/container-properties :portkey.aws.batch.register-job-definition-request/retry-strategy :portkey.aws.batch.register-job-definition-request/timeout]))

(clojure.spec.alpha/def :portkey.aws.batch.cancel-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.cancel-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/cancel-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.cancel-job-request/job-id :portkey.aws.batch.cancel-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-response/job-queues (clojure.spec.alpha/and :portkey.aws.batch/job-queue-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-queues-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-queues-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-queues-response/job-queues :portkey.aws.batch.describe-job-queues-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.job-dependency/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-dependency/type (clojure.spec.alpha/and :portkey.aws.batch/array-job-dependency))
(clojure.spec.alpha/def :portkey.aws.batch/job-dependency (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.job-dependency/job-id :portkey.aws.batch.job-dependency/type]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/ec-2-key-pair (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/spot-iam-fleet-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/subnets (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/bid-percentage (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/tags (clojure.spec.alpha/and :portkey.aws.batch/tags-map))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/maxv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/image-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/instance-types (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/desiredv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/type (clojure.spec.alpha/and :portkey.aws.batch/cr-type))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/security-group-ids (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/minv-cpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.compute-resource/instance-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.compute-resource/type :portkey.aws.batch.compute-resource/minv-cpus :portkey.aws.batch.compute-resource/maxv-cpus :portkey.aws.batch.compute-resource/instance-types :portkey.aws.batch.compute-resource/subnets :portkey.aws.batch.compute-resource/security-group-ids :portkey.aws.batch.compute-resource/instance-role] :opt-un [:portkey.aws.batch.compute-resource/ec-2-key-pair :portkey.aws.batch.compute-resource/spot-iam-fleet-role :portkey.aws.batch.compute-resource/bid-percentage :portkey.aws.batch.compute-resource/tags :portkey.aws.batch.compute-resource/image-id :portkey.aws.batch.compute-resource/desiredv-cpus]))

(clojure.spec.alpha/def :portkey.aws.batch/job-queue-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-queue-detail))

(clojure.spec.alpha/def :portkey.aws.batch.terminate-job-request/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.terminate-job-request/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/terminate-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.terminate-job-request/job-id :portkey.aws.batch.terminate-job-request/reason] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/job-definition-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-definition))

(clojure.spec.alpha/def :portkey.aws.batch/cr-type #{"EC2" "SPOT" :ec-2 :spot})

(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.create-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/create-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.create-job-queue-request/job-queue-name :portkey.aws.batch.create-job-queue-request/priority :portkey.aws.batch.create-job-queue-request/compute-environment-order] :opt-un [:portkey.aws.batch.create-job-queue-request/state]))

(clojure.spec.alpha/def :portkey.aws.batch/job-detail-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-detail))

(clojure.spec.alpha/def :portkey.aws.batch.delete-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/delete-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.delete-job-queue-request/job-queue] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.container-summary/exit-code (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-summary/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/container-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.container-summary/exit-code :portkey.aws.batch.container-summary/reason]))

(clojure.spec.alpha/def :portkey.aws.batch/job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-summary))

(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-response/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-compute-environment-response/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-compute-environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.update-compute-environment-response/compute-environment-name :portkey.aws.batch.update-compute-environment-response/compute-environment-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/container (clojure.spec.alpha/and :portkey.aws.batch/attempt-container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/attempt-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.attempt-detail/container :portkey.aws.batch.attempt-detail/started-at :portkey.aws.batch.attempt-detail/stopped-at :portkey.aws.batch.attempt-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch.submit-job-response/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.submit-job-response/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/submit-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.submit-job-response/job-name :portkey.aws.batch.submit-job-response/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.batch/job-detail-list))
(clojure.spec.alpha/def :portkey.aws.batch/describe-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-jobs-response/jobs]))

(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/job-definition-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.register-job-definition-response/revision (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/register-job-definition-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.register-job-definition-response/job-definition-name :portkey.aws.batch.register-job-definition-response/job-definition-arn :portkey.aws.batch.register-job-definition-response/revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-response/job-definitions (clojure.spec.alpha/and :portkey.aws.batch/job-definition-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-definitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-definitions-response/job-definitions :portkey.aws.batch.describe-job-definitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-environment-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/service-role (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-environment-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/ecs-cluster-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/status (clojure.spec.alpha/and :portkey.aws.batch/ce-status))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/compute-resources (clojure.spec.alpha/and :portkey.aws.batch/compute-resource))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/type (clojure.spec.alpha/and :portkey.aws.batch/ce-type))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/state (clojure.spec.alpha/and :portkey.aws.batch/ce-state))
(clojure.spec.alpha/def :portkey.aws.batch.compute-environment-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.compute-environment-detail/compute-environment-name :portkey.aws.batch.compute-environment-detail/compute-environment-arn :portkey.aws.batch.compute-environment-detail/ecs-cluster-arn] :opt-un [:portkey.aws.batch.compute-environment-detail/service-role :portkey.aws.batch.compute-environment-detail/status :portkey.aws.batch.compute-environment-detail/compute-resources :portkey.aws.batch.compute-environment-detail/type :portkey.aws.batch.compute-environment-detail/state :portkey.aws.batch.compute-environment-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch/ce-status #{:valid :deleted :creating "UPDATING" :invalid :deleting "INVALID" "DELETING" "CREATING" :updating "DELETED" "VALID"})

(clojure.spec.alpha/def :portkey.aws.batch/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.batch/array-job-status-summary (clojure.spec.alpha/map-of :portkey.aws.batch/string :portkey.aws.batch/integer))

(clojure.spec.alpha/def :portkey.aws.batch.server-exception/message (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.batch/parameters-map (clojure.spec.alpha/map-of :portkey.aws.batch/string :portkey.aws.batch/string))

(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-overrides/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch/container-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.container-overrides/vcpus :portkey.aws.batch.container-overrides/memory :portkey.aws.batch.container-overrides/command :portkey.aws.batch.container-overrides/environment]))

(clojure.spec.alpha/def :portkey.aws.batch.describe-jobs-request/jobs (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch/describe-jobs-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.describe-jobs-request/jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.array-properties-detail/status-summary (clojure.spec.alpha/and :portkey.aws.batch/array-job-status-summary))
(clojure.spec.alpha/def :portkey.aws.batch.array-properties-detail/size (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.array-properties-detail/index (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/array-properties-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.array-properties-detail/status-summary :portkey.aws.batch.array-properties-detail/size :portkey.aws.batch.array-properties-detail/index]))

(clojure.spec.alpha/def :portkey.aws.batch/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.batch/job-dependency-list (clojure.spec.alpha/coll-of :portkey.aws.batch/job-dependency))

(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/state (clojure.spec.alpha/and :portkey.aws.batch/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/status (clojure.spec.alpha/and :portkey.aws.batch/jq-status))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.job-queue-detail/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/job-queue-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.job-queue-detail/job-queue-name :portkey.aws.batch.job-queue-detail/job-queue-arn :portkey.aws.batch.job-queue-detail/state :portkey.aws.batch.job-queue-detail/priority :portkey.aws.batch.job-queue-detail/compute-environment-order] :opt-un [:portkey.aws.batch.job-queue-detail/status :portkey.aws.batch.job-queue-detail/status-reason]))

(clojure.spec.alpha/def :portkey.aws.batch/ulimits (clojure.spec.alpha/coll-of :portkey.aws.batch/ulimit))

(clojure.spec.alpha/def :portkey.aws.batch.job-timeout/attempt-duration-seconds (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/job-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.job-timeout/attempt-duration-seconds]))

(clojure.spec.alpha/def :portkey.aws.batch/ce-type #{"MANAGED" :managed "UNMANAGED" :unmanaged})

(clojure.spec.alpha/def :portkey.aws.batch.container-properties/ulimits (clojure.spec.alpha/and :portkey.aws.batch/ulimits))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/command (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/mount-points (clojure.spec.alpha/and :portkey.aws.batch/mount-points))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/image (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/user (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/volumes (clojure.spec.alpha/and :portkey.aws.batch/volumes))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/privileged (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/vcpus (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/readonly-root-filesystem (clojure.spec.alpha/and :portkey.aws.batch/boolean))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/memory (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/environment (clojure.spec.alpha/and :portkey.aws.batch/environment-variables))
(clojure.spec.alpha/def :portkey.aws.batch.container-properties/job-role-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/container-properties (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.container-properties/image :portkey.aws.batch.container-properties/vcpus :portkey.aws.batch.container-properties/memory] :opt-un [:portkey.aws.batch.container-properties/ulimits :portkey.aws.batch.container-properties/command :portkey.aws.batch.container-properties/mount-points :portkey.aws.batch.container-properties/user :portkey.aws.batch.container-properties/volumes :portkey.aws.batch.container-properties/privileged :portkey.aws.batch.container-properties/readonly-root-filesystem :portkey.aws.batch.container-properties/environment :portkey.aws.batch.container-properties/job-role-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.ulimit/hard-limit (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.ulimit/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.ulimit/soft-limit (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/ulimit (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.ulimit/hard-limit :portkey.aws.batch.ulimit/name :portkey.aws.batch.ulimit/soft-limit] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch.job-detail/retry-strategy (clojure.spec.alpha/and :portkey.aws.batch/retry-strategy))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/created-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/started-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/stopped-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/status (clojure.spec.alpha/and :portkey.aws.batch/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/timeout (clojure.spec.alpha/and :portkey.aws.batch/job-timeout))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/attempts (clojure.spec.alpha/and :portkey.aws.batch/attempt-details))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/depends-on (clojure.spec.alpha/and :portkey.aws.batch/job-dependency-list))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/parameters (clojure.spec.alpha/and :portkey.aws.batch/parameters-map))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/array-properties (clojure.spec.alpha/and :portkey.aws.batch/array-properties-detail))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-definition (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/container (clojure.spec.alpha/and :portkey.aws.batch/container-detail))
(clojure.spec.alpha/def :portkey.aws.batch.job-detail/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/job-detail (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.job-detail/job-name :portkey.aws.batch.job-detail/job-id :portkey.aws.batch.job-detail/job-queue :portkey.aws.batch.job-detail/status :portkey.aws.batch.job-detail/started-at :portkey.aws.batch.job-detail/job-definition] :opt-un [:portkey.aws.batch.job-detail/retry-strategy :portkey.aws.batch.job-detail/created-at :portkey.aws.batch.job-detail/stopped-at :portkey.aws.batch.job-detail/timeout :portkey.aws.batch.job-detail/attempts :portkey.aws.batch.job-detail/status-reason :portkey.aws.batch.job-detail/depends-on :portkey.aws.batch.job-detail/parameters :portkey.aws.batch.job-detail/array-properties :portkey.aws.batch.job-detail/container]))

(clojure.spec.alpha/def :portkey.aws.batch/ce-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/container-instance-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/task-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/exit-code (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.attempt-container-detail/log-stream-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/attempt-container-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.attempt-container-detail/container-instance-arn :portkey.aws.batch.attempt-container-detail/task-arn :portkey.aws.batch.attempt-container-detail/exit-code :portkey.aws.batch.attempt-container-detail/reason :portkey.aws.batch.attempt-container-detail/log-stream-name]))

(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/job-definitions (clojure.spec.alpha/and :portkey.aws.batch/string-list))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/max-results (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/job-definition-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/status (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.describe-job-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/describe-job-definitions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.describe-job-definitions-request/job-definitions :portkey.aws.batch.describe-job-definitions-request/max-results :portkey.aws.batch.describe-job-definitions-request/job-definition-name :portkey.aws.batch.describe-job-definitions-request/status :portkey.aws.batch.describe-job-definitions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch/volumes (clojure.spec.alpha/coll-of :portkey.aws.batch/volume))

(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-response/job-summary-list (clojure.spec.alpha/and :portkey.aws.batch/job-summary-list))
(clojure.spec.alpha/def :portkey.aws.batch.list-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/list-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.list-jobs-response/job-summary-list] :opt-un [:portkey.aws.batch.list-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.batch/mount-points (clojure.spec.alpha/coll-of :portkey.aws.batch/mount-point))

(clojure.spec.alpha/def :portkey.aws.batch.job-summary/created-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/started-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/stopped-at (clojure.spec.alpha/and :portkey.aws.batch/long))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/status (clojure.spec.alpha/and :portkey.aws.batch/job-status))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/status-reason (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/job-id (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/array-properties (clojure.spec.alpha/and :portkey.aws.batch/array-properties-summary))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/container (clojure.spec.alpha/and :portkey.aws.batch/container-summary))
(clojure.spec.alpha/def :portkey.aws.batch.job-summary/job-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.job-summary/job-id :portkey.aws.batch.job-summary/job-name] :opt-un [:portkey.aws.batch.job-summary/created-at :portkey.aws.batch.job-summary/started-at :portkey.aws.batch.job-summary/stopped-at :portkey.aws.batch.job-summary/status :portkey.aws.batch.job-summary/status-reason :portkey.aws.batch.job-summary/array-properties :portkey.aws.batch.job-summary/container]))

(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-response/job-queue-name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-response/job-queue-arn (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/update-job-queue-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.update-job-queue-response/job-queue-name :portkey.aws.batch.update-job-queue-response/job-queue-arn]))

(clojure.spec.alpha/def :portkey.aws.batch.host/source-path (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/host (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.host/source-path]))

(clojure.spec.alpha/def :portkey.aws.batch.delete-compute-environment-request/compute-environment (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/delete-compute-environment-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.delete-compute-environment-request/compute-environment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.batch/compute-environment-orders (clojure.spec.alpha/coll-of :portkey.aws.batch/compute-environment-order))

(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/job-queue (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/state (clojure.spec.alpha/and :portkey.aws.batch/jq-state))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/priority (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch.update-job-queue-request/compute-environment-order (clojure.spec.alpha/and :portkey.aws.batch/compute-environment-orders))
(clojure.spec.alpha/def :portkey.aws.batch/update-job-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.batch.update-job-queue-request/job-queue] :opt-un [:portkey.aws.batch.update-job-queue-request/state :portkey.aws.batch.update-job-queue-request/priority :portkey.aws.batch.update-job-queue-request/compute-environment-order]))

(clojure.spec.alpha/def :portkey.aws.batch.retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.batch/integer))
(clojure.spec.alpha/def :portkey.aws.batch/retry-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.batch/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.batch.key-value-pair/name (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch.key-value-pair/value (clojure.spec.alpha/and :portkey.aws.batch/string))
(clojure.spec.alpha/def :portkey.aws.batch/key-value-pair (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.batch.key-value-pair/name :portkey.aws.batch.key-value-pair/value]))

(clojure.core/defn describe-job-definitions ([] (describe-job-definitions {})) ([describe-job-definitions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-job-definitions-request describe-job-definitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/describe-job-definitions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobdefinitions", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/describe-job-definitions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJobDefinitions", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef describe-job-definitions :args (clojure.spec.alpha/? :portkey.aws.batch/describe-job-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-job-definitions-response))

(clojure.core/defn register-job-definition ([register-job-definition-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-register-job-definition-request register-job-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/register-job-definition-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/registerjobdefinition", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/register-job-definition-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterJobDefinition", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef register-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch/register-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/register-job-definition-response))

(clojure.core/defn describe-compute-environments ([] (describe-compute-environments {})) ([describe-compute-environments-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-compute-environments-request describe-compute-environments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/describe-compute-environments-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describecomputeenvironments", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/describe-compute-environments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeComputeEnvironments", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef describe-compute-environments :args (clojure.spec.alpha/? :portkey.aws.batch/describe-compute-environments-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-compute-environments-response))

(clojure.core/defn update-compute-environment ([update-compute-environment-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-compute-environment-request update-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/update-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/updatecomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/update-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateComputeEnvironment", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef update-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch/update-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/update-compute-environment-response))

(clojure.core/defn delete-job-queue ([delete-job-queue-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-job-queue-request delete-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/delete-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deletejobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/delete-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteJobQueue", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef delete-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch/delete-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/delete-job-queue-response))

(clojure.core/defn create-compute-environment ([create-compute-environment-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-compute-environment-request create-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/create-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/createcomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/create-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateComputeEnvironment", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef create-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch/create-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/create-compute-environment-response))

(clojure.core/defn update-job-queue ([update-job-queue-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-job-queue-request update-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/update-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/updatejobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/update-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateJobQueue", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef update-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch/update-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/update-job-queue-response))

(clojure.core/defn terminate-job ([terminate-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-terminate-job-request terminate-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/terminate-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/terminatejob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/terminate-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TerminateJob", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef terminate-job :args (clojure.spec.alpha/tuple :portkey.aws.batch/terminate-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/terminate-job-response))

(clojure.core/defn describe-job-queues ([] (describe-job-queues {})) ([describe-job-queues-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-job-queues-request describe-job-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/describe-job-queues-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobqueues", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/describe-job-queues-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJobQueues", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef describe-job-queues :args (clojure.spec.alpha/? :portkey.aws.batch/describe-job-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-job-queues-response))

(clojure.core/defn submit-job ([submit-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-submit-job-request submit-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/submit-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/submitjob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/submit-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SubmitJob", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef submit-job :args (clojure.spec.alpha/tuple :portkey.aws.batch/submit-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/submit-job-response))

(clojure.core/defn delete-compute-environment ([delete-compute-environment-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-compute-environment-request delete-compute-environment-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/delete-compute-environment-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deletecomputeenvironment", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/delete-compute-environment-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteComputeEnvironment", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef delete-compute-environment :args (clojure.spec.alpha/tuple :portkey.aws.batch/delete-compute-environment-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/delete-compute-environment-response))

(clojure.core/defn deregister-job-definition ([deregister-job-definition-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-deregister-job-definition-request deregister-job-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/deregister-job-definition-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/deregisterjobdefinition", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/deregister-job-definition-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterJobDefinition", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef deregister-job-definition :args (clojure.spec.alpha/tuple :portkey.aws.batch/deregister-job-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/deregister-job-definition-response))

(clojure.core/defn describe-jobs ([describe-jobs-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-jobs-request describe-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/describe-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/describejobs", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/describe-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeJobs", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef describe-jobs :args (clojure.spec.alpha/tuple :portkey.aws.batch/describe-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/describe-jobs-response))

(clojure.core/defn create-job-queue ([create-job-queue-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-job-queue-request create-job-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/create-job-queue-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/createjobqueue", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/create-job-queue-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateJobQueue", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef create-job-queue :args (clojure.spec.alpha/tuple :portkey.aws.batch/create-job-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/create-job-queue-response))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-jobs-request list-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/list-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/listjobs", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/list-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.batch/list-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/list-jobs-response))

(clojure.core/defn cancel-job ([cancel-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-job-request cancel-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.batch/endpoints, :http.request.spec/output-spec :portkey.aws.batch/cancel-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/canceljob", :http.request.configuration/version "2016-08-10", :http.request.configuration/service-id "Batch", :http.request.spec/input-spec :portkey.aws.batch/cancel-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelJob", :http.request.spec/error-spec {"ClientException" :portkey.aws.batch/client-exception, "ServerException" :portkey.aws.batch/server-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.batch/cancel-job-request) :ret (clojure.spec.alpha/and :portkey.aws.batch/cancel-job-response))
