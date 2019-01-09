(ns portkey.aws.codedeploy (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "codedeploy", :region "ap-northeast-1"},
    :ssl-common-name "codedeploy.ap-northeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "codedeploy", :region "eu-west-1"},
    :ssl-common-name "codedeploy.eu-west-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "codedeploy", :region "us-east-2"},
    :ssl-common-name "codedeploy.us-east-2.amazonaws.com",
    :endpoint "https://codedeploy.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "codedeploy", :region "ap-southeast-2"},
    :ssl-common-name "codedeploy.ap-southeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "codedeploy", :region "cn-north-1"},
    :ssl-common-name "codedeploy.cn-north-1.amazonaws.com.cn",
    :endpoint "https://codedeploy.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "codedeploy", :region "sa-east-1"},
    :ssl-common-name "codedeploy.sa-east-1.amazonaws.com",
    :endpoint "https://codedeploy.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "codedeploy", :region "ap-southeast-1"},
    :ssl-common-name "codedeploy.ap-southeast-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "codedeploy", :region "cn-northwest-1"},
    :ssl-common-name "codedeploy.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://codedeploy.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "codedeploy", :region "ap-northeast-2"},
    :ssl-common-name "codedeploy.ap-northeast-2.amazonaws.com",
    :endpoint "https://codedeploy.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "codedeploy", :region "eu-west-3"},
    :ssl-common-name "codedeploy.eu-west-3.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "codedeploy", :region "ca-central-1"},
    :ssl-common-name "codedeploy.ca-central-1.amazonaws.com",
    :endpoint "https://codedeploy.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "codedeploy", :region "eu-central-1"},
    :ssl-common-name "codedeploy.eu-central-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "codedeploy", :region "eu-west-2"},
    :ssl-common-name "codedeploy.eu-west-2.amazonaws.com",
    :endpoint "https://codedeploy.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "codedeploy", :region "us-gov-west-1"},
    :ssl-common-name "codedeploy.us-gov-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codedeploy", :region "us-west-2"},
    :ssl-common-name "codedeploy.us-west-2.amazonaws.com",
    :endpoint "https://codedeploy.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "codedeploy", :region "us-east-1"},
    :ssl-common-name "codedeploy.us-east-1.amazonaws.com",
    :endpoint "https://codedeploy.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "codedeploy", :region "us-west-1"},
    :ssl-common-name "codedeploy.us-west-1.amazonaws.com",
    :endpoint "https://codedeploy.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "codedeploy", :region "ap-south-1"},
    :ssl-common-name "codedeploy.ap-south-1.amazonaws.com",
    :endpoint "https://codedeploy.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-auto-rollback-configuration)

(clojure.core/declare ser-bundle-type)

(clojure.core/declare ser-auto-scaling-group-name)

(clojure.core/declare ser-instance-action)

(clojure.core/declare ser-deployment-config-name)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-raw-string-content)

(clojure.core/declare ser-trigger-event-type-list)

(clojure.core/declare ser-elb-name)

(clojure.core/declare ser-deployment-type)

(clojure.core/declare ser-git-hub-account-token-name)

(clojure.core/declare ser-raw-string)

(clojure.core/declare ser-traffic-routing-config)

(clojure.core/declare ser-elb-info)

(clojure.core/declare ser-wait-time-in-mins)

(clojure.core/declare ser-registration-status)

(clojure.core/declare ser-version-id)

(clojure.core/declare ser-elb-info-list)

(clojure.core/declare ser-minimum-healthy-hosts)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-instance-type-list)

(clojure.core/declare ser-time-based-canary)

(clojure.core/declare ser-minimum-healthy-hosts-value)

(clojure.core/declare ser-blue-instance-termination-option)

(clojure.core/declare ser-repository)

(clojure.core/declare ser-revision-location)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-tag-filter-type)

(clojure.core/declare ser-nullable-boolean)

(clojure.core/declare ser-compute-platform)

(clojure.core/declare ser-green-fleet-provisioning-option)

(clojure.core/declare ser-load-balancer-info)

(clojure.core/declare ser-revision-location-list)

(clojure.core/declare ser-deployment-group-name)

(clojure.core/declare ser-file-exists-behavior)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-instance-status-list)

(clojure.core/declare ser-e-tag)

(clojure.core/declare ser-lifecycle-event-hook-execution-id)

(clojure.core/declare ser-key)

(clojure.core/declare ser-commit-id)

(clojure.core/declare ser-target-group-name)

(clojure.core/declare ser-trigger-event-type)

(clojure.core/declare ser-deployment-style)

(clojure.core/declare ser-role)

(clojure.core/declare ser-application-revision-sort-by)

(clojure.core/declare ser-instance-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-green-fleet-provisioning-action)

(clojure.core/declare ser-trigger-target-arn)

(clojure.core/declare ser-instance-name)

(clojure.core/declare ser-alarm-list)

(clojure.core/declare ser-auto-rollback-events-list)

(clojure.core/declare ser-trigger-name)

(clojure.core/declare ser-alarm-configuration)

(clojure.core/declare ser-target-instances)

(clojure.core/declare ser-value)

(clojure.core/declare ser-trigger-config)

(clojure.core/declare ser-deployment-option)

(clojure.core/declare ser-auto-rollback-event)

(clojure.core/declare ser-list-state-filter-action)

(clojure.core/declare ser-description)

(clojure.core/declare ser-ec-2-tag-filter-type)

(clojure.core/declare ser-minimum-healthy-hosts-type)

(clojure.core/declare ser-auto-scaling-group-name-list)

(clojure.core/declare ser-deployment-id)

(clojure.core/declare ser-application-name)

(clojure.core/declare ser-duration)

(clojure.core/declare ser-revision-location-type)

(clojure.core/declare ser-target-group-info-list)

(clojure.core/declare ser-on-premises-tag-set-list)

(clojure.core/declare ser-percentage)

(clojure.core/declare ser-alarm-name)

(clojure.core/declare ser-deployment-groups-list)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-deployment-ready-action)

(clojure.core/declare ser-git-hub-location)

(clojure.core/declare ser-s-3-location)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-ec-2-tag-filter-list)

(clojure.core/declare ser-instances-list)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-deployments-list)

(clojure.core/declare ser-tag-filter-list)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-deployment-status)

(clojure.core/declare ser-time-range)

(clojure.core/declare ser-ec-2-tag-set-list)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-alarm)

(clojure.core/declare ser-ec-2-tag-filter)

(clojure.core/declare ser-instance-status)

(clojure.core/declare ser-trigger-config-list)

(clojure.core/declare ser-blue-green-deployment-configuration)

(clojure.core/declare ser-lifecycle-event-status)

(clojure.core/declare ser-traffic-routing-type)

(clojure.core/declare ser-raw-string-sha-256)

(clojure.core/declare ser-iam-user-arn)

(clojure.core/declare ser-deployment-ready-option)

(clojure.core/declare ser-applications-list)

(clojure.core/declare ser-deployment-status-list)

(clojure.core/declare ser-ec-2-tag-set)

(clojure.core/declare ser-iam-session-arn)

(clojure.core/declare ser-time-based-linear)

(clojure.core/declare ser-on-premises-tag-set)

(clojure.core/declare ser-target-group-info)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-auto-rollback-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AutoRollbackConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "enabled", :shape "Boolean"})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-events-list (input :events)) #:http.request.field{:name "events", :shape "AutoRollbackEventsList"}))))

(clojure.core/defn- ser-bundle-type [input] #:http.request.field{:value (clojure.core/get {:tar "tar", "YAML" "YAML", "tar" "tar", :tgz "tgz", "tgz" "tgz", :yaml "YAML", "JSON" "JSON", :zip "zip", :json "JSON", "zip" "zip"} input), :shape "BundleType"})

(clojure.core/defn- ser-auto-scaling-group-name [input] #:http.request.field{:value input, :shape "AutoScalingGroupName"})

(clojure.core/defn- ser-instance-action [input] #:http.request.field{:value (clojure.core/get {"TERMINATE" "TERMINATE", :terminate "TERMINATE", "KEEP_ALIVE" "KEEP_ALIVE", :keep-alive "KEEP_ALIVE"} input), :shape "InstanceAction"})

(clojure.core/defn- ser-deployment-config-name [input] #:http.request.field{:value input, :shape "DeploymentConfigName"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-raw-string-content [input] #:http.request.field{:value input, :shape "RawStringContent"})

(clojure.core/defn- ser-trigger-event-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trigger-event-type coll) #:http.request.field{:shape "TriggerEventType"}))) input), :shape "TriggerEventTypeList", :type "list"})

(clojure.core/defn- ser-elb-name [input] #:http.request.field{:value input, :shape "ELBName"})

(clojure.core/defn- ser-deployment-type [input] #:http.request.field{:value (clojure.core/get {"IN_PLACE" "IN_PLACE", :in-place "IN_PLACE", "BLUE_GREEN" "BLUE_GREEN", :blue-green "BLUE_GREEN"} input), :shape "DeploymentType"})

(clojure.core/defn- ser-git-hub-account-token-name [input] #:http.request.field{:value input, :shape "GitHubAccountTokenName"})

(clojure.core/defn- ser-raw-string [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RawString", :type "structure"} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-content (input :content)) #:http.request.field{:name "content", :shape "RawStringContent"})) (clojure.core/contains? input :sha-256) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-sha-256 (input :sha-256)) #:http.request.field{:name "sha256", :shape "RawStringSha256"}))))

(clojure.core/defn- ser-traffic-routing-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrafficRoutingConfig", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-routing-type (input :type)) #:http.request.field{:name "type", :shape "TrafficRoutingType"})) (clojure.core/contains? input :time-based-canary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-based-canary (input :time-based-canary)) #:http.request.field{:name "timeBasedCanary", :shape "TimeBasedCanary"})) (clojure.core/contains? input :time-based-linear) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-based-linear (input :time-based-linear)) #:http.request.field{:name "timeBasedLinear", :shape "TimeBasedLinear"}))))

(clojure.core/defn- ser-elb-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ELBInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elb-name (input :name)) #:http.request.field{:name "name", :shape "ELBName"}))))

(clojure.core/defn- ser-wait-time-in-mins [input] #:http.request.field{:value input, :shape "WaitTimeInMins"})

(clojure.core/defn- ser-registration-status [input] #:http.request.field{:value (clojure.core/get {"Registered" "Registered", :registered "Registered", "Deregistered" "Deregistered", :deregistered "Deregistered"} input), :shape "RegistrationStatus"})

(clojure.core/defn- ser-version-id [input] #:http.request.field{:value input, :shape "VersionId"})

(clojure.core/defn- ser-elb-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-elb-info coll) #:http.request.field{:shape "ELBInfo"}))) input), :shape "ELBInfoList", :type "list"})

(clojure.core/defn- ser-minimum-healthy-hosts [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MinimumHealthyHosts", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-healthy-hosts-value (input :value)) #:http.request.field{:name "value", :shape "MinimumHealthyHostsValue"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-healthy-hosts-type (input :type)) #:http.request.field{:name "type", :shape "MinimumHealthyHostsType"}))))

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value (clojure.core/get {"Blue" "Blue", :blue "Blue", "Green" "Green", :green "Green"} input), :shape "InstanceType"})

(clojure.core/defn- ser-instance-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-type coll) #:http.request.field{:shape "InstanceType"}))) input), :shape "InstanceTypeList", :type "list"})

(clojure.core/defn- ser-time-based-canary [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeBasedCanary", :type "structure"} (clojure.core/contains? input :canary-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :canary-percentage)) #:http.request.field{:name "canaryPercentage", :shape "Percentage"})) (clojure.core/contains? input :canary-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wait-time-in-mins (input :canary-interval)) #:http.request.field{:name "canaryInterval", :shape "WaitTimeInMins"}))))

(clojure.core/defn- ser-minimum-healthy-hosts-value [input] #:http.request.field{:value input, :shape "MinimumHealthyHostsValue"})

(clojure.core/defn- ser-blue-instance-termination-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BlueInstanceTerminationOption", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-action (input :action)) #:http.request.field{:name "action", :shape "InstanceAction"})) (clojure.core/contains? input :termination-wait-time-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration (input :termination-wait-time-in-minutes)) #:http.request.field{:name "terminationWaitTimeInMinutes", :shape "Duration"}))))

(clojure.core/defn- ser-repository [input] #:http.request.field{:value input, :shape "Repository"})

(clojure.core/defn- ser-revision-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RevisionLocation", :type "structure"} (clojure.core/contains? input :revision-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-location-type (input :revision-type)) #:http.request.field{:name "revisionType", :shape "RevisionLocationType"})) (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3-location)) #:http.request.field{:name "s3Location", :shape "S3Location"})) (clojure.core/contains? input :git-hub-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-hub-location (input :git-hub-location)) #:http.request.field{:name "gitHubLocation", :shape "GitHubLocation"})) (clojure.core/contains? input :string) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string (input :string)) #:http.request.field{:name "string", :shape "RawString"}))))

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"ascending" "ascending", :ascending "ascending", "descending" "descending", :descending "descending"} input), :shape "SortOrder"})

(clojure.core/defn- ser-tag-filter-type [input] #:http.request.field{:value (clojure.core/get {"KEY_ONLY" "KEY_ONLY", :key-only "KEY_ONLY", "VALUE_ONLY" "VALUE_ONLY", :value-only "VALUE_ONLY", "KEY_AND_VALUE" "KEY_AND_VALUE", :key-and-value "KEY_AND_VALUE"} input), :shape "TagFilterType"})

(clojure.core/defn- ser-nullable-boolean [input] #:http.request.field{:value input, :shape "NullableBoolean"})

(clojure.core/defn- ser-compute-platform [input] #:http.request.field{:value (clojure.core/get {"Server" "Server", :server "Server", "Lambda" "Lambda", :lambda "Lambda"} input), :shape "ComputePlatform"})

(clojure.core/defn- ser-green-fleet-provisioning-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GreenFleetProvisioningOption", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-green-fleet-provisioning-action (input :action)) #:http.request.field{:name "action", :shape "GreenFleetProvisioningAction"}))))

(clojure.core/defn- ser-load-balancer-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancerInfo", :type "structure"} (clojure.core/contains? input :elb-info-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elb-info-list (input :elb-info-list)) #:http.request.field{:name "elbInfoList", :shape "ELBInfoList"})) (clojure.core/contains? input :target-group-info-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-info-list (input :target-group-info-list)) #:http.request.field{:name "targetGroupInfoList", :shape "TargetGroupInfoList"}))))

(clojure.core/defn- ser-revision-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-revision-location coll) #:http.request.field{:shape "RevisionLocation"}))) input), :shape "RevisionLocationList", :type "list"})

(clojure.core/defn- ser-deployment-group-name [input] #:http.request.field{:value input, :shape "DeploymentGroupName"})

(clojure.core/defn- ser-file-exists-behavior [input] #:http.request.field{:value (clojure.core/get {"DISALLOW" "DISALLOW", :disallow "DISALLOW", "OVERWRITE" "OVERWRITE", :overwrite "OVERWRITE", "RETAIN" "RETAIN", :retain "RETAIN"} input), :shape "FileExistsBehavior"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-instance-status-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-status coll) #:http.request.field{:shape "InstanceStatus"}))) input), :shape "InstanceStatusList", :type "list"})

(clojure.core/defn- ser-e-tag [input] #:http.request.field{:value input, :shape "ETag"})

(clojure.core/defn- ser-lifecycle-event-hook-execution-id [input] #:http.request.field{:value input, :shape "LifecycleEventHookExecutionId"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- ser-commit-id [input] #:http.request.field{:value input, :shape "CommitId"})

(clojure.core/defn- ser-target-group-name [input] #:http.request.field{:value input, :shape "TargetGroupName"})

(clojure.core/defn- ser-trigger-event-type [input] #:http.request.field{:value (clojure.core/get {:instance-start "InstanceStart", :deployment-rollback "DeploymentRollback", :deployment-stop "DeploymentStop", "DeploymentReady" "DeploymentReady", "InstanceSuccess" "InstanceSuccess", "InstanceFailure" "InstanceFailure", "DeploymentRollback" "DeploymentRollback", :instance-ready "InstanceReady", "DeploymentStop" "DeploymentStop", :instance-success "InstanceSuccess", :instance-failure "InstanceFailure", :deployment-ready "DeploymentReady", "InstanceReady" "InstanceReady", "DeploymentSuccess" "DeploymentSuccess", "DeploymentFailure" "DeploymentFailure", :deployment-failure "DeploymentFailure", :deployment-success "DeploymentSuccess", :deployment-start "DeploymentStart", "InstanceStart" "InstanceStart", "DeploymentStart" "DeploymentStart"} input), :shape "TriggerEventType"})

(clojure.core/defn- ser-deployment-style [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentStyle", :type "structure"} (clojure.core/contains? input :deployment-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-type (input :deployment-type)) #:http.request.field{:name "deploymentType", :shape "DeploymentType"})) (clojure.core/contains? input :deployment-option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-option (input :deployment-option)) #:http.request.field{:name "deploymentOption", :shape "DeploymentOption"}))))

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-application-revision-sort-by [input] #:http.request.field{:value (clojure.core/get {"registerTime" "registerTime", :register-time "registerTime", "firstUsedTime" "firstUsedTime", :first-used-time "firstUsedTime", "lastUsedTime" "lastUsedTime", :last-used-time "lastUsedTime"} input), :shape "ApplicationRevisionSortBy"})

(clojure.core/defn- ser-instance-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-name coll) #:http.request.field{:shape "InstanceName"}))) input), :shape "InstanceNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-green-fleet-provisioning-action [input] #:http.request.field{:value (clojure.core/get {"DISCOVER_EXISTING" "DISCOVER_EXISTING", :discover-existing "DISCOVER_EXISTING", "COPY_AUTO_SCALING_GROUP" "COPY_AUTO_SCALING_GROUP", :copy-auto-scaling-group "COPY_AUTO_SCALING_GROUP"} input), :shape "GreenFleetProvisioningAction"})

(clojure.core/defn- ser-trigger-target-arn [input] #:http.request.field{:value input, :shape "TriggerTargetArn"})

(clojure.core/defn- ser-instance-name [input] #:http.request.field{:value input, :shape "InstanceName"})

(clojure.core/defn- ser-alarm-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-alarm coll) #:http.request.field{:shape "Alarm"}))) input), :shape "AlarmList", :type "list"})

(clojure.core/defn- ser-auto-rollback-events-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-auto-rollback-event coll) #:http.request.field{:shape "AutoRollbackEvent"}))) input), :shape "AutoRollbackEventsList", :type "list"})

(clojure.core/defn- ser-trigger-name [input] #:http.request.field{:value input, :shape "TriggerName"})

(clojure.core/defn- ser-alarm-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AlarmConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "enabled", :shape "Boolean"})) (clojure.core/contains? input :ignore-poll-alarm-failure) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ignore-poll-alarm-failure)) #:http.request.field{:name "ignorePollAlarmFailure", :shape "Boolean"})) (clojure.core/contains? input :alarms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-list (input :alarms)) #:http.request.field{:name "alarms", :shape "AlarmList"}))))

(clojure.core/defn- ser-target-instances [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetInstances", :type "structure"} (clojure.core/contains? input :tag-filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-list (input :tag-filters)) #:http.request.field{:name "tagFilters", :shape "EC2TagFilterList"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-name-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupNameList"})) (clojure.core/contains? input :ec-2-tag-set) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set (input :ec-2-tag-set)) #:http.request.field{:name "ec2TagSet", :shape "EC2TagSet"}))))

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-trigger-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TriggerConfig", :type "structure"} (clojure.core/contains? input :trigger-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-name (input :trigger-name)) #:http.request.field{:name "triggerName", :shape "TriggerName"})) (clojure.core/contains? input :trigger-target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-target-arn (input :trigger-target-arn)) #:http.request.field{:name "triggerTargetArn", :shape "TriggerTargetArn"})) (clojure.core/contains? input :trigger-events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-event-type-list (input :trigger-events)) #:http.request.field{:name "triggerEvents", :shape "TriggerEventTypeList"}))))

(clojure.core/defn- ser-deployment-option [input] #:http.request.field{:value (clojure.core/get {"WITH_TRAFFIC_CONTROL" "WITH_TRAFFIC_CONTROL", :with-traffic-control "WITH_TRAFFIC_CONTROL", "WITHOUT_TRAFFIC_CONTROL" "WITHOUT_TRAFFIC_CONTROL", :without-traffic-control "WITHOUT_TRAFFIC_CONTROL"} input), :shape "DeploymentOption"})

(clojure.core/defn- ser-auto-rollback-event [input] #:http.request.field{:value (clojure.core/get {"DEPLOYMENT_FAILURE" "DEPLOYMENT_FAILURE", :deployment-failure "DEPLOYMENT_FAILURE", "DEPLOYMENT_STOP_ON_ALARM" "DEPLOYMENT_STOP_ON_ALARM", :deployment-stop-on-alarm "DEPLOYMENT_STOP_ON_ALARM", "DEPLOYMENT_STOP_ON_REQUEST" "DEPLOYMENT_STOP_ON_REQUEST", :deployment-stop-on-request "DEPLOYMENT_STOP_ON_REQUEST"} input), :shape "AutoRollbackEvent"})

(clojure.core/defn- ser-list-state-filter-action [input] #:http.request.field{:value (clojure.core/get {"include" "include", :include "include", "exclude" "exclude", :exclude "exclude", "ignore" "ignore", :ignore "ignore"} input), :shape "ListStateFilterAction"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-ec-2-tag-filter-type [input] #:http.request.field{:value (clojure.core/get {"KEY_ONLY" "KEY_ONLY", :key-only "KEY_ONLY", "VALUE_ONLY" "VALUE_ONLY", :value-only "VALUE_ONLY", "KEY_AND_VALUE" "KEY_AND_VALUE", :key-and-value "KEY_AND_VALUE"} input), :shape "EC2TagFilterType"})

(clojure.core/defn- ser-minimum-healthy-hosts-type [input] #:http.request.field{:value (clojure.core/get {"HOST_COUNT" "HOST_COUNT", :host-count "HOST_COUNT", "FLEET_PERCENT" "FLEET_PERCENT", :fleet-percent "FLEET_PERCENT"} input), :shape "MinimumHealthyHostsType"})

(clojure.core/defn- ser-auto-scaling-group-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-auto-scaling-group-name coll) #:http.request.field{:shape "AutoScalingGroupName"}))) input), :shape "AutoScalingGroupNameList", :type "list"})

(clojure.core/defn- ser-deployment-id [input] #:http.request.field{:value input, :shape "DeploymentId"})

(clojure.core/defn- ser-application-name [input] #:http.request.field{:value input, :shape "ApplicationName"})

(clojure.core/defn- ser-duration [input] #:http.request.field{:value input, :shape "Duration"})

(clojure.core/defn- ser-revision-location-type [input] #:http.request.field{:value (clojure.core/get {"S3" "S3", :s-3 "S3", "GitHub" "GitHub", :git-hub "GitHub", "String" "String", :string "String"} input), :shape "RevisionLocationType"})

(clojure.core/defn- ser-target-group-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-info coll) #:http.request.field{:shape "TargetGroupInfo"}))) input), :shape "TargetGroupInfoList", :type "list"})

(clojure.core/defn- ser-on-premises-tag-set-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter-list coll) #:http.request.field{:shape "TagFilterList"}))) input), :shape "OnPremisesTagSetList", :type "list"})

(clojure.core/defn- ser-percentage [input] #:http.request.field{:value input, :shape "Percentage"})

(clojure.core/defn- ser-alarm-name [input] #:http.request.field{:value input, :shape "AlarmName"})

(clojure.core/defn- ser-deployment-groups-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-deployment-group-name coll) #:http.request.field{:shape "DeploymentGroupName"}))) input), :shape "DeploymentGroupsList", :type "list"})

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-deployment-ready-action [input] #:http.request.field{:value (clojure.core/get {"CONTINUE_DEPLOYMENT" "CONTINUE_DEPLOYMENT", :continue-deployment "CONTINUE_DEPLOYMENT", "STOP_DEPLOYMENT" "STOP_DEPLOYMENT", :stop-deployment "STOP_DEPLOYMENT"} input), :shape "DeploymentReadyAction"})

(clojure.core/defn- ser-git-hub-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GitHubLocation", :type "structure"} (clojure.core/contains? input :repository) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository (input :repository)) #:http.request.field{:name "repository", :shape "Repository"})) (clojure.core/contains? input :commit-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-commit-id (input :commit-id)) #:http.request.field{:name "commitId", :shape "CommitId"}))))

(clojure.core/defn- ser-s-3-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Location", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "bucket", :shape "S3Bucket"})) (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :key)) #:http.request.field{:name "key", :shape "S3Key"})) (clojure.core/contains? input :bundle-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bundle-type (input :bundle-type)) #:http.request.field{:name "bundleType", :shape "BundleType"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version-id (input :version)) #:http.request.field{:name "version", :shape "VersionId"})) (clojure.core/contains? input :e-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-e-tag (input :e-tag)) #:http.request.field{:name "eTag", :shape "ETag"}))))

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value (input :value)) #:http.request.field{:name "Value", :shape "Value"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-type (input :type)) #:http.request.field{:name "Type", :shape "TagFilterType"}))))

(clojure.core/defn- ser-ec-2-tag-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ec-2-tag-filter coll) #:http.request.field{:shape "EC2TagFilter"}))) input), :shape "EC2TagFilterList", :type "list"})

(clojure.core/defn- ser-instances-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-id coll) #:http.request.field{:shape "InstanceId"}))) input), :shape "InstancesList", :type "list"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-deployments-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-deployment-id coll) #:http.request.field{:shape "DeploymentId"}))) input), :shape "DeploymentsList", :type "list"})

(clojure.core/defn- ser-tag-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilterList", :type "list"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-deployment-status [input] #:http.request.field{:value (clojure.core/get {"Created" "Created", "Failed" "Failed", :ready "Ready", :in-progress "InProgress", "Succeeded" "Succeeded", "Ready" "Ready", :created "Created", :queued "Queued", :stopped "Stopped", "InProgress" "InProgress", "Stopped" "Stopped", "Queued" "Queued", :failed "Failed", :succeeded "Succeeded"} input), :shape "DeploymentStatus"})

(clojure.core/defn- ser-time-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeRange", :type "structure"} (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start)) #:http.request.field{:name "start", :shape "Timestamp"})) (clojure.core/contains? input :end) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end)) #:http.request.field{:name "end", :shape "Timestamp"}))))

(clojure.core/defn- ser-ec-2-tag-set-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ec-2-tag-filter-list coll) #:http.request.field{:shape "EC2TagFilterList"}))) input), :shape "EC2TagSetList", :type "list"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value (input :value)) #:http.request.field{:name "Value", :shape "Value"}))))

(clojure.core/defn- ser-alarm [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Alarm", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-name (input :name)) #:http.request.field{:name "name", :shape "AlarmName"}))))

(clojure.core/defn- ser-ec-2-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EC2TagFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-key (input :key)) #:http.request.field{:name "Key", :shape "Key"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-value (input :value)) #:http.request.field{:name "Value", :shape "Value"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-type (input :type)) #:http.request.field{:name "Type", :shape "EC2TagFilterType"}))))

(clojure.core/defn- ser-instance-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :ready "Ready", "Skipped" "Skipped", :in-progress "InProgress", :unknown "Unknown", "Succeeded" "Succeeded", :pending "Pending", "Ready" "Ready", "Unknown" "Unknown", :skipped "Skipped", "InProgress" "InProgress", "Pending" "Pending", :failed "Failed", :succeeded "Succeeded"} input), :shape "InstanceStatus"})

(clojure.core/defn- ser-trigger-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trigger-config coll) #:http.request.field{:shape "TriggerConfig"}))) input), :shape "TriggerConfigList", :type "list"})

(clojure.core/defn- ser-blue-green-deployment-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BlueGreenDeploymentConfiguration", :type "structure"} (clojure.core/contains? input :terminate-blue-instances-on-deployment-success) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blue-instance-termination-option (input :terminate-blue-instances-on-deployment-success)) #:http.request.field{:name "terminateBlueInstancesOnDeploymentSuccess", :shape "BlueInstanceTerminationOption"})) (clojure.core/contains? input :deployment-ready-option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-ready-option (input :deployment-ready-option)) #:http.request.field{:name "deploymentReadyOption", :shape "DeploymentReadyOption"})) (clojure.core/contains? input :green-fleet-provisioning-option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-green-fleet-provisioning-option (input :green-fleet-provisioning-option)) #:http.request.field{:name "greenFleetProvisioningOption", :shape "GreenFleetProvisioningOption"}))))

(clojure.core/defn- ser-lifecycle-event-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Skipped" "Skipped", :in-progress "InProgress", :unknown "Unknown", "Succeeded" "Succeeded", :pending "Pending", "Unknown" "Unknown", :skipped "Skipped", "InProgress" "InProgress", "Pending" "Pending", :failed "Failed", :succeeded "Succeeded"} input), :shape "LifecycleEventStatus"})

(clojure.core/defn- ser-traffic-routing-type [input] #:http.request.field{:value (clojure.core/get {"TimeBasedCanary" "TimeBasedCanary", :time-based-canary "TimeBasedCanary", "TimeBasedLinear" "TimeBasedLinear", :time-based-linear "TimeBasedLinear", "AllAtOnce" "AllAtOnce", :all-at-once "AllAtOnce"} input), :shape "TrafficRoutingType"})

(clojure.core/defn- ser-raw-string-sha-256 [input] #:http.request.field{:value input, :shape "RawStringSha256"})

(clojure.core/defn- ser-iam-user-arn [input] #:http.request.field{:value input, :shape "IamUserArn"})

(clojure.core/defn- ser-deployment-ready-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentReadyOption", :type "structure"} (clojure.core/contains? input :action-on-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-ready-action (input :action-on-timeout)) #:http.request.field{:name "actionOnTimeout", :shape "DeploymentReadyAction"})) (clojure.core/contains? input :wait-time-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration (input :wait-time-in-minutes)) #:http.request.field{:name "waitTimeInMinutes", :shape "Duration"}))))

(clojure.core/defn- ser-applications-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-name coll) #:http.request.field{:shape "ApplicationName"}))) input), :shape "ApplicationsList", :type "list"})

(clojure.core/defn- ser-deployment-status-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-deployment-status coll) #:http.request.field{:shape "DeploymentStatus"}))) input), :shape "DeploymentStatusList", :type "list"})

(clojure.core/defn- ser-ec-2-tag-set [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EC2TagSet", :type "structure"} (clojure.core/contains? input :ec-2-tag-set-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set-list (input :ec-2-tag-set-list)) #:http.request.field{:name "ec2TagSetList", :shape "EC2TagSetList"}))))

(clojure.core/defn- ser-iam-session-arn [input] #:http.request.field{:value input, :shape "IamSessionArn"})

(clojure.core/defn- ser-time-based-linear [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeBasedLinear", :type "structure"} (clojure.core/contains? input :linear-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :linear-percentage)) #:http.request.field{:name "linearPercentage", :shape "Percentage"})) (clojure.core/contains? input :linear-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wait-time-in-mins (input :linear-interval)) #:http.request.field{:name "linearInterval", :shape "WaitTimeInMins"}))))

(clojure.core/defn- ser-on-premises-tag-set [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OnPremisesTagSet", :type "structure"} (clojure.core/contains? input :on-premises-tag-set-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set-list (input :on-premises-tag-set-list)) #:http.request.field{:name "onPremisesTagSetList", :shape "OnPremisesTagSetList"}))))

(clojure.core/defn- ser-target-group-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGroupInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-name (input :name)) #:http.request.field{:name "name", :shape "TargetGroupName"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :target-instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-instances (input :target-instances)) #:http.request.field{:name "targetInstances", :shape "TargetInstances"})) (clojure.core/contains? input :file-exists-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-exists-behavior (input :file-exists-behavior)) #:http.request.field{:name "fileExistsBehavior", :shape "FileExistsBehavior"})) (clojure.core/contains? input :ignore-application-stop-failures) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ignore-application-stop-failures)) #:http.request.field{:name "ignoreApplicationStopFailures", :shape "Boolean"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :revision) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})) (clojure.core/contains? input :update-outdated-instances-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :update-outdated-instances-only)) #:http.request.field{:name "updateOutdatedInstancesOnly", :shape "Boolean"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-stop-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})]} (clojure.core/contains? input :auto-rollback-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :auto-rollback-enabled)) #:http.request.field{:name "autoRollbackEnabled", :shape "NullableBoolean"}))))

(clojure.core/defn- req-create-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"}) (clojure.core/into (ser-role (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "Role"})]} (clojure.core/contains? input :ec-2-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set (input :ec-2-tag-set)) #:http.request.field{:name "ec2TagSet", :shape "EC2TagSet"})) (clojure.core/contains? input :blue-green-deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blue-green-deployment-configuration (input :blue-green-deployment-configuration)) #:http.request.field{:name "blueGreenDeploymentConfiguration", :shape "BlueGreenDeploymentConfiguration"})) (clojure.core/contains? input :on-premises-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set (input :on-premises-tag-set)) #:http.request.field{:name "onPremisesTagSet", :shape "OnPremisesTagSet"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :ec-2-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-list (input :ec-2-tag-filters)) #:http.request.field{:name "ec2TagFilters", :shape "EC2TagFilterList"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-style) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-style (input :deployment-style)) #:http.request.field{:name "deploymentStyle", :shape "DeploymentStyle"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-name-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupNameList"})) (clojure.core/contains? input :trigger-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-config-list (input :trigger-configurations)) #:http.request.field{:name "triggerConfigurations", :shape "TriggerConfigList"})) (clojure.core/contains? input :load-balancer-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-info (input :load-balancer-info)) #:http.request.field{:name "loadBalancerInfo", :shape "LoadBalancerInfo"})) (clojure.core/contains? input :alarm-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-configuration (input :alarm-configuration)) #:http.request.field{:name "alarmConfiguration", :shape "AlarmConfiguration"})) (clojure.core/contains? input :on-premises-instance-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :on-premises-instance-tag-filters)) #:http.request.field{:name "onPremisesInstanceTagFilters", :shape "TagFilterList"}))))

(clojure.core/defn- req-list-deployment-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :instance-status-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-status-list (input :instance-status-filter)) #:http.request.field{:name "instanceStatusFilter", :shape "InstanceStatusList"})) (clojure.core/contains? input :instance-type-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type-list (input :instance-type-filter)) #:http.request.field{:name "instanceTypeFilter", :shape "InstanceTypeList"}))))

(clojure.core/defn- req-create-deployment-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})]} (clojure.core/contains? input :minimum-healthy-hosts) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-healthy-hosts (input :minimum-healthy-hosts)) #:http.request.field{:name "minimumHealthyHosts", :shape "MinimumHealthyHosts"})) (clojure.core/contains? input :traffic-routing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-routing-config (input :traffic-routing-config)) #:http.request.field{:name "trafficRoutingConfig", :shape "TrafficRoutingConfig"})) (clojure.core/contains? input :compute-platform) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-platform (input :compute-platform)) #:http.request.field{:name "computePlatform", :shape "ComputePlatform"}))))

(clojure.core/defn- req-deregister-on-premises-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "InstanceName"})]}))

(clojure.core/defn- req-get-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]}))

(clojure.core/defn- req-list-deployments-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})) (clojure.core/contains? input :deployment-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})) (clojure.core/contains? input :include-only-statuses) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-status-list (input :include-only-statuses)) #:http.request.field{:name "includeOnlyStatuses", :shape "DeploymentStatusList"})) (clojure.core/contains? input :create-time-range) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-range (input :create-time-range)) #:http.request.field{:name "createTimeRange", :shape "TimeRange"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-deployment-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})]}))

(clojure.core/defn- req-skip-wait-time-for-instance-termination-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}))))

(clojure.core/defn- req-list-on-premises-instances-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :registration-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registration-status (input :registration-status)) #:http.request.field{:name "registrationStatus", :shape "RegistrationStatus"})) (clojure.core/contains? input :tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :tag-filters)) #:http.request.field{:name "tagFilters", :shape "TagFilterList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-git-hub-account-token-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :token-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-hub-account-token-name (input :token-name)) #:http.request.field{:name "tokenName", :shape "GitHubAccountTokenName"}))))

(clojure.core/defn- req-create-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :compute-platform) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compute-platform (input :compute-platform)) #:http.request.field{:name "computePlatform", :shape "ComputePlatform"}))))

(clojure.core/defn- req-batch-get-deployment-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-groups-list (input :deployment-group-names)) #:http.request.field{:name "deploymentGroupNames", :shape "DeploymentGroupsList"})]}))

(clojure.core/defn- req-delete-deployment-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})]}))

(clojure.core/defn- req-register-application-revision-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-add-tags-to-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}) (clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-register-on-premises-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "InstanceName"})]} (clojure.core/contains? input :iam-session-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-session-arn (input :iam-session-arn)) #:http.request.field{:name "iamSessionArn", :shape "IamSessionArn"})) (clojure.core/contains? input :iam-user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-user-arn (input :iam-user-arn)) #:http.request.field{:name "iamUserArn", :shape "IamUserArn"}))))

(clojure.core/defn- req-batch-get-applications-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-applications-list (input :application-names)) #:http.request.field{:name "applicationNames", :shape "ApplicationsList"})]}))

(clojure.core/defn- req-get-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})]}))

(clojure.core/defn- req-get-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})]}))

(clojure.core/defn- req-batch-get-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-batch-get-deployments-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployments-list (input :deployment-ids)) #:http.request.field{:name "deploymentIds", :shape "DeploymentsList"})]}))

(clojure.core/defn- req-list-git-hub-account-token-names-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-application-revision-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})]}))

(clojure.core/defn- req-list-applications-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :current-deployment-group-name)) #:http.request.field{:name "currentDeploymentGroupName", :shape "DeploymentGroupName"})]} (clojure.core/contains? input :ec-2-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set (input :ec-2-tag-set)) #:http.request.field{:name "ec2TagSet", :shape "EC2TagSet"})) (clojure.core/contains? input :blue-green-deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blue-green-deployment-configuration (input :blue-green-deployment-configuration)) #:http.request.field{:name "blueGreenDeploymentConfiguration", :shape "BlueGreenDeploymentConfiguration"})) (clojure.core/contains? input :on-premises-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set (input :on-premises-tag-set)) #:http.request.field{:name "onPremisesTagSet", :shape "OnPremisesTagSet"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :ec-2-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-list (input :ec-2-tag-filters)) #:http.request.field{:name "ec2TagFilters", :shape "EC2TagFilterList"})) (clojure.core/contains? input :new-deployment-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-group-name (input :new-deployment-group-name)) #:http.request.field{:name "newDeploymentGroupName", :shape "DeploymentGroupName"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-style) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-style (input :deployment-style)) #:http.request.field{:name "deploymentStyle", :shape "DeploymentStyle"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-name-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupNameList"})) (clojure.core/contains? input :trigger-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-config-list (input :trigger-configurations)) #:http.request.field{:name "triggerConfigurations", :shape "TriggerConfigList"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "Role"})) (clojure.core/contains? input :load-balancer-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-info (input :load-balancer-info)) #:http.request.field{:name "loadBalancerInfo", :shape "LoadBalancerInfo"})) (clojure.core/contains? input :alarm-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-configuration (input :alarm-configuration)) #:http.request.field{:name "alarmConfiguration", :shape "AlarmConfiguration"})) (clojure.core/contains? input :on-premises-instance-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :on-premises-instance-tag-filters)) #:http.request.field{:name "onPremisesInstanceTagFilters", :shape "TagFilterList"}))))

(clojure.core/defn- req-list-deployment-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-remove-tags-from-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}) (clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-update-application-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})) (clojure.core/contains? input :new-application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :new-application-name)) #:http.request.field{:name "newApplicationName", :shape "ApplicationName"}))))

(clojure.core/defn- req-list-application-revisions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-revision-sort-by (input :sort-by)) #:http.request.field{:name "sortBy", :shape "ApplicationRevisionSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrder"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "s3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key-prefix)) #:http.request.field{:name "s3KeyPrefix", :shape "S3Key"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-state-filter-action (input :deployed)) #:http.request.field{:name "deployed", :shape "ListStateFilterAction"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-put-lifecycle-event-hook-execution-status-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :lifecycle-event-hook-execution-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-hook-execution-id (input :lifecycle-event-hook-execution-id)) #:http.request.field{:name "lifecycleEventHookExecutionId", :shape "LifecycleEventHookExecutionId"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-status (input :status)) #:http.request.field{:name "status", :shape "LifecycleEventStatus"}))))

(clojure.core/defn- req-get-on-premises-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "InstanceName"})]}))

(clojure.core/defn- req-batch-get-deployment-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}) (clojure.core/into (ser-instances-list (input :instance-ids)) #:http.request.field{:name "instanceIds", :shape "InstancesList"})]}))

(clojure.core/defn- req-continue-deployment-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}))))

(clojure.core/defn- req-delete-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]}))

(clojure.core/defn- req-list-deployment-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})]}))

(clojure.core/defn- req-get-deployment-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "instanceId", :shape "InstanceId"})]}))

(clojure.core/defn- req-batch-get-application-revisions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location-list (input :revisions)) #:http.request.field{:name "revisions", :shape "RevisionLocationList"})]}))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-revision-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-instance-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-config-output/deployment-config-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-config-output/deployment-config-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/target-instances (clojure.spec.alpha/and :portkey.aws.codedeploy/target-instances))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/file-exists-behavior (clojure.spec.alpha/and :portkey.aws.codedeploy/file-exists-behavior))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/ignore-application-stop-failures (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/update-outdated-instances-only (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/auto-rollback-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-input/description (clojure.spec.alpha/and :portkey.aws.codedeploy/description))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.create-deployment-input/application-name] :opt-un [:portkey.aws.codedeploy.create-deployment-input/target-instances :portkey.aws.codedeploy.create-deployment-input/file-exists-behavior :portkey.aws.codedeploy.create-deployment-input/ignore-application-stop-failures :portkey.aws.codedeploy.create-deployment-input/deployment-config-name :portkey.aws.codedeploy.create-deployment-input/revision :portkey.aws.codedeploy.create-deployment-input/update-outdated-instances-only :portkey.aws.codedeploy.create-deployment-input/auto-rollback-configuration :portkey.aws.codedeploy.create-deployment-input/deployment-group-name :portkey.aws.codedeploy.create-deployment-input/description]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-already-completed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-git-hub-account-token-output/token-name (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-account-token-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-git-hub-account-token-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.delete-git-hub-account-token-output/token-name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.auto-rollback-configuration/enabled (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.auto-rollback-configuration/events (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-events-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-rollback-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.auto-rollback-configuration/enabled :portkey.aws.codedeploy.auto-rollback-configuration/events]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-input/auto-rollback-enabled (clojure.spec.alpha/and :portkey.aws.codedeploy/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy/stop-deployment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.stop-deployment-input/deployment-id] :opt-un [:portkey.aws.codedeploy.stop-deployment-input/auto-rollback-enabled]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/bundle-type #{:tar "YAML" "tar" :tgz "tgz" :yaml "JSON" :zip :json "zip"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-application-output/application-id (clojure.spec.alpha/and :portkey.aws.codedeploy/application-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-application-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.create-application-output/application-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-scaling-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/last-successful-deployment (clojure.spec.alpha/and :portkey.aws.codedeploy/last-deployment-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/last-attempted-deployment (clojure.spec.alpha/and :portkey.aws.codedeploy/last-deployment-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/blue-green-deployment-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/blue-green-deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/on-premises-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/on-premises-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/auto-rollback-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/deployment-style (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-style))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/trigger-configurations (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-config-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/service-role-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/role))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/load-balancer-info (clojure.spec.alpha/and :portkey.aws.codedeploy/load-balancer-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/alarm-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/alarm-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/on-premises-instance-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/deployment-group-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/target-revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-group-info/compute-platform :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-set :portkey.aws.codedeploy.deployment-group-info/last-successful-deployment :portkey.aws.codedeploy.deployment-group-info/last-attempted-deployment :portkey.aws.codedeploy.deployment-group-info/blue-green-deployment-configuration :portkey.aws.codedeploy.deployment-group-info/on-premises-tag-set :portkey.aws.codedeploy.deployment-group-info/application-name :portkey.aws.codedeploy.deployment-group-info/deployment-config-name :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-filters :portkey.aws.codedeploy.deployment-group-info/auto-rollback-configuration :portkey.aws.codedeploy.deployment-group-info/deployment-style :portkey.aws.codedeploy.deployment-group-info/auto-scaling-groups :portkey.aws.codedeploy.deployment-group-info/trigger-configurations :portkey.aws.codedeploy.deployment-group-info/deployment-group-name :portkey.aws.codedeploy.deployment-group-info/service-role-arn :portkey.aws.codedeploy.deployment-group-info/load-balancer-info :portkey.aws.codedeploy.deployment-group-info/alarm-configuration :portkey.aws.codedeploy.deployment-group-info/on-premises-instance-tag-filters :portkey.aws.codedeploy.deployment-group-info/deployment-group-id :portkey.aws.codedeploy.deployment-group-info/target-revision]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/blue-green-deployment-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/blue-green-deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/on-premises-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/on-premises-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/auto-rollback-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/deployment-style (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-style))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/trigger-configurations (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-config-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/service-role-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/role))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/load-balancer-info (clojure.spec.alpha/and :portkey.aws.codedeploy/load-balancer-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/alarm-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/alarm-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/on-premises-instance-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.create-deployment-group-input/application-name :portkey.aws.codedeploy.create-deployment-group-input/deployment-group-name :portkey.aws.codedeploy.create-deployment-group-input/service-role-arn] :opt-un [:portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-set :portkey.aws.codedeploy.create-deployment-group-input/blue-green-deployment-configuration :portkey.aws.codedeploy.create-deployment-group-input/on-premises-tag-set :portkey.aws.codedeploy.create-deployment-group-input/deployment-config-name :portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-filters :portkey.aws.codedeploy.create-deployment-group-input/auto-rollback-configuration :portkey.aws.codedeploy.create-deployment-group-input/deployment-style :portkey.aws.codedeploy.create-deployment-group-input/auto-scaling-groups :portkey.aws.codedeploy.create-deployment-group-input/trigger-configurations :portkey.aws.codedeploy.create-deployment-group-input/load-balancer-info :portkey.aws.codedeploy.create-deployment-group-input/alarm-configuration :portkey.aws.codedeploy.create-deployment-group-input/on-premises-instance-tag-filters]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-sort-by-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/target-instances (clojure.spec.alpha/and :portkey.aws.codedeploy/target-instances))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/error-information (clojure.spec.alpha/and :portkey.aws.codedeploy/error-information))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/file-exists-behavior (clojure.spec.alpha/and :portkey.aws.codedeploy/file-exists-behavior))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/ignore-application-stop-failures (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/complete-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/blue-green-deployment-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/blue-green-deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/previous-revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-status-messages (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-status-message-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/update-outdated-instances-only (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/auto-rollback-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/creator (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-creator))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-style (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-style))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/create-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/start-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/status (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/additional-deployment-status-info (clojure.spec.alpha/and :portkey.aws.codedeploy/additional-deployment-status-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/load-balancer-info (clojure.spec.alpha/and :portkey.aws.codedeploy/load-balancer-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/instance-termination-wait-time-started (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/rollback-info (clojure.spec.alpha/and :portkey.aws.codedeploy/rollback-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/description (clojure.spec.alpha/and :portkey.aws.codedeploy/description))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-info/deployment-overview (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-overview))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-info/target-instances :portkey.aws.codedeploy.deployment-info/error-information :portkey.aws.codedeploy.deployment-info/compute-platform :portkey.aws.codedeploy.deployment-info/file-exists-behavior :portkey.aws.codedeploy.deployment-info/ignore-application-stop-failures :portkey.aws.codedeploy.deployment-info/complete-time :portkey.aws.codedeploy.deployment-info/blue-green-deployment-configuration :portkey.aws.codedeploy.deployment-info/previous-revision :portkey.aws.codedeploy.deployment-info/deployment-status-messages :portkey.aws.codedeploy.deployment-info/application-name :portkey.aws.codedeploy.deployment-info/deployment-config-name :portkey.aws.codedeploy.deployment-info/revision :portkey.aws.codedeploy.deployment-info/update-outdated-instances-only :portkey.aws.codedeploy.deployment-info/auto-rollback-configuration :portkey.aws.codedeploy.deployment-info/creator :portkey.aws.codedeploy.deployment-info/deployment-style :portkey.aws.codedeploy.deployment-info/create-time :portkey.aws.codedeploy.deployment-info/start-time :portkey.aws.codedeploy.deployment-info/deployment-id :portkey.aws.codedeploy.deployment-info/status :portkey.aws.codedeploy.deployment-info/deployment-group-name :portkey.aws.codedeploy.deployment-info/additional-deployment-status-info :portkey.aws.codedeploy.deployment-info/load-balancer-info :portkey.aws.codedeploy.deployment-info/instance-termination-wait-time-started :portkey.aws.codedeploy.deployment-info/rollback-info :portkey.aws.codedeploy.deployment-info/description :portkey.aws.codedeploy.deployment-info/deployment-overview]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-output/deployment-group-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-group-output/deployment-group-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-action #{:terminate :keep-alive "TERMINATE" "KEEP_ALIVE"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/raw-string-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/instance-status-filter (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-status-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/instance-type-filter (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-type-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.list-deployment-instances-input/deployment-id] :opt-un [:portkey.aws.codedeploy.list-deployment-instances-input/next-token :portkey.aws.codedeploy.list-deployment-instances-input/instance-status-filter :portkey.aws.codedeploy.list-deployment-instances-input/instance-type-filter]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-event-type-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/trigger-event-type))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-summary))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-not-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-config-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-config-input/minimum-healthy-hosts (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-config-input/traffic-routing-config (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-routing-config))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-config-input/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.create-deployment-config-input/deployment-config-name] :opt-un [:portkey.aws.codedeploy.create-deployment-config-input/minimum-healthy-hosts :portkey.aws.codedeploy.create-deployment-config-input/traffic-routing-config :portkey.aws.codedeploy.create-deployment-config-input/compute-platform]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deregister-on-premises-instance-input/instance-name (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deregister-on-premises-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.deregister-on-premises-instance-input/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-group-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-compute-platform-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-user-arn-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-application-input/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-role-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-trigger-config-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-status-message-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/error-message))

(clojure.spec.alpha/def :portkey.aws.codedeploy/elb-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-on-premises-tag-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-input/include-only-statuses (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-status-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-input/create-time-range (clojure.spec.alpha/and :portkey.aws.codedeploy/time-range))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployments-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployments-input/application-name :portkey.aws.codedeploy.list-deployments-input/deployment-group-name :portkey.aws.codedeploy.list-deployments-input/include-only-statuses :portkey.aws.codedeploy.list-deployments-input/create-time-range :portkey.aws.codedeploy.list-deployments-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-type #{:in-place "IN_PLACE" :blue-green "BLUE_GREEN"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/git-hub-account-token-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-git-hub-account-token-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-config-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-config-input/deployment-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-not-started-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.raw-string/content (clojure.spec.alpha/and :portkey.aws.codedeploy/raw-string-content))
(clojure.spec.alpha/def :portkey.aws.codedeploy.raw-string/sha-256 (clojure.spec.alpha/and :portkey.aws.codedeploy/raw-string-sha-256))
(clojure.spec.alpha/def :portkey.aws.codedeploy/raw-string (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.raw-string/content :portkey.aws.codedeploy.raw-string/sha-256]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-ec-2-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.skip-wait-time-for-instance-termination-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/skip-wait-time-for-instance-termination-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.skip-wait-time-for-instance-termination-input/deployment-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-style-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-on-premises-instances-input/registration-status (clojure.spec.alpha/and :portkey.aws.codedeploy/registration-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-on-premises-instances-input/tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-on-premises-instances-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-on-premises-instances-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-on-premises-instances-input/registration-status :portkey.aws.codedeploy.list-on-premises-instances-input/tag-filters :portkey.aws.codedeploy.list-on-premises-instances-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-bucket-name-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-iam-user-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.traffic-routing-config/type (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-routing-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy.traffic-routing-config/time-based-canary (clojure.spec.alpha/and :portkey.aws.codedeploy/time-based-canary))
(clojure.spec.alpha/def :portkey.aws.codedeploy.traffic-routing-config/time-based-linear (clojure.spec.alpha/and :portkey.aws.codedeploy/time-based-linear))
(clojure.spec.alpha/def :portkey.aws.codedeploy/traffic-routing-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.traffic-routing-config/type :portkey.aws.codedeploy.traffic-routing-config/time-based-canary :portkey.aws.codedeploy.traffic-routing-config/time-based-linear]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/application-id (clojure.spec.alpha/and :portkey.aws.codedeploy/application-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/create-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/linked-to-git-hub (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/git-hub-account-name (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-account-token-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.application-info/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy/application-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.application-info/application-id :portkey.aws.codedeploy.application-info/application-name :portkey.aws.codedeploy.application-info/create-time :portkey.aws.codedeploy.application-info/linked-to-git-hub :portkey.aws.codedeploy.application-info/git-hub-account-name :portkey.aws.codedeploy.application-info/compute-platform]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/deployment-config-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/minimum-healthy-hosts (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/create-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-config-info/traffic-routing-config (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-routing-config))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-config-info/deployment-config-id :portkey.aws.codedeploy.deployment-config-info/deployment-config-name :portkey.aws.codedeploy.deployment-config-info/minimum-healthy-hosts :portkey.aws.codedeploy.deployment-config-info/create-time :portkey.aws.codedeploy.deployment-config-info/compute-platform :portkey.aws.codedeploy.deployment-config-info/traffic-routing-config]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-output/application (clojure.spec.alpha/and :portkey.aws.codedeploy/application-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-application-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-application-output/application]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-hook-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.elb-info/name (clojure.spec.alpha/and :portkey.aws.codedeploy/elb-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/elb-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.elb-info/name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/wait-time-in-mins clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/registration-status #{"Registered" :deregistered "Deregistered" :registered})

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-git-hub-account-token-input/token-name (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-account-token-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-git-hub-account-token-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.delete-git-hub-account-token-input/token-name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/version-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-targets-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-git-hub-account-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.rollback-info/rollback-deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.rollback-info/rollback-triggering-deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.rollback-info/rollback-message (clojure.spec.alpha/and :portkey.aws.codedeploy/description))
(clojure.spec.alpha/def :portkey.aws.codedeploy/rollback-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.rollback-info/rollback-deployment-id :portkey.aws.codedeploy.rollback-info/rollback-triggering-deployment-id :portkey.aws.codedeploy.rollback-info/rollback-message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/elb-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/elb-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy.minimum-healthy-hosts/value (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts-value))
(clojure.spec.alpha/def :portkey.aws.codedeploy.minimum-healthy-hosts/type (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/minimum-healthy-hosts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.minimum-healthy-hosts/value :portkey.aws.codedeploy.minimum-healthy-hosts/type]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-config-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-type #{"Blue" "Green" :green :blue})

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-type-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-type))

(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-canary/canary-percentage (clojure.spec.alpha/and :portkey.aws.codedeploy/percentage))
(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-canary/canary-interval (clojure.spec.alpha/and :portkey.aws.codedeploy/wait-time-in-mins))
(clojure.spec.alpha/def :portkey.aws.codedeploy/time-based-canary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.time-based-canary/canary-percentage :portkey.aws.codedeploy.time-based-canary/canary-interval]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-groups-output/deployment-groups-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-groups-output/error-message (clojure.spec.alpha/and :portkey.aws.codedeploy/error-message))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-deployment-groups-output/deployment-groups-info :portkey.aws.codedeploy.batch-get-deployment-groups-output/error-message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/minimum-healthy-hosts-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.blue-instance-termination-option/action (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-action))
(clojure.spec.alpha/def :portkey.aws.codedeploy.blue-instance-termination-option/termination-wait-time-in-minutes (clojure.spec.alpha/and :portkey.aws.codedeploy/duration))
(clojure.spec.alpha/def :portkey.aws.codedeploy/blue-instance-termination-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.blue-instance-termination-option/action :portkey.aws.codedeploy.blue-instance-termination-option/termination-wait-time-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-scaling-group-hook (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/repository (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.lifecycle-event/lifecycle-event-name (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lifecycle-event/diagnostics (clojure.spec.alpha/and :portkey.aws.codedeploy/diagnostics))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lifecycle-event/start-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lifecycle-event/end-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lifecycle-event/status (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.lifecycle-event/lifecycle-event-name :portkey.aws.codedeploy.lifecycle-event/diagnostics :portkey.aws.codedeploy.lifecycle-event/start-time :portkey.aws.codedeploy.lifecycle-event/end-time :portkey.aws.codedeploy.lifecycle-event/status]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-location/revision-type (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-location/s-3-location (clojure.spec.alpha/and :portkey.aws.codedeploy/s-3-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-location/git-hub-location (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-location/string (clojure.spec.alpha/and :portkey.aws.codedeploy/raw-string))
(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.revision-location/revision-type :portkey.aws.codedeploy.revision-location/s-3-location :portkey.aws.codedeploy.revision-location/git-hub-location :portkey.aws.codedeploy.revision-location/string]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-output/status (clojure.spec.alpha/and :portkey.aws.codedeploy/stop-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-output/status-message (clojure.spec.alpha/and :portkey.aws.codedeploy/message))
(clojure.spec.alpha/def :portkey.aws.codedeploy/stop-deployment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.stop-deployment-output/status :portkey.aws.codedeploy.stop-deployment-output/status-message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/sort-order #{:descending :ascending "descending" "ascending"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-filter-type #{:value-only :key-only "KEY_ONLY" "VALUE_ONLY" :key-and-value "KEY_AND_VALUE"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-output/hooks-not-cleaned-up (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/update-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.update-deployment-group-output/hooks-not-cleaned-up]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-output/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-output/error-message (clojure.spec.alpha/and :portkey.aws.codedeploy/error-message))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-output/revisions (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-application-revisions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-application-revisions-output/application-name :portkey.aws.codedeploy.batch-get-application-revisions-output/error-message :portkey.aws.codedeploy.batch-get-application-revisions-output/revisions]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-output/deployment-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-output/deployment-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/log-tail (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/pending (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/in-progress (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/succeeded (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/failed (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/skipped (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-overview/ready (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-overview (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-overview/pending :portkey.aws.codedeploy.deployment-overview/in-progress :portkey.aws.codedeploy.deployment-overview/succeeded :portkey.aws.codedeploy.deployment-overview/failed :portkey.aws.codedeploy.deployment-overview/skipped :portkey.aws.codedeploy.deployment-overview/ready]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-application-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-application-input/compute-platform (clojure.spec.alpha/and :portkey.aws.codedeploy/compute-platform))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.create-application-input/application-name] :opt-un [:portkey.aws.codedeploy.create-application-input/compute-platform]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/git-hub-account-token-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-groups-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-groups-input/deployment-group-names (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-groups-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-deployment-groups-input/application-name :portkey.aws.codedeploy.batch-get-deployment-groups-input/deployment-group-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.diagnostics/error-code (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-error-code))
(clojure.spec.alpha/def :portkey.aws.codedeploy.diagnostics/script-name (clojure.spec.alpha/and :portkey.aws.codedeploy/script-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.diagnostics/message (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-message))
(clojure.spec.alpha/def :portkey.aws.codedeploy.diagnostics/log-tail (clojure.spec.alpha/and :portkey.aws.codedeploy/log-tail))
(clojure.spec.alpha/def :portkey.aws.codedeploy/diagnostics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.diagnostics/error-code :portkey.aws.codedeploy.diagnostics/script-name :portkey.aws.codedeploy.diagnostics/message :portkey.aws.codedeploy.diagnostics/log-tail]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-scaling-group-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-deployment-group-output/hooks-not-cleaned-up (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.delete-deployment-group-output/hooks-not-cleaned-up]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/compute-platform #{:lambda :server "Lambda" "Server"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.green-fleet-provisioning-option/action (clojure.spec.alpha/and :portkey.aws.codedeploy/green-fleet-provisioning-action))
(clojure.spec.alpha/def :portkey.aws.codedeploy/green-fleet-provisioning-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.green-fleet-provisioning-option/action]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.load-balancer-info/elb-info-list (clojure.spec.alpha/and :portkey.aws.codedeploy/elb-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.load-balancer-info/target-group-info-list (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/load-balancer-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.load-balancer-info/elb-info-list :portkey.aws.codedeploy.load-balancer-info/target-group-info-list]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-deployment-config-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-deployment-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.delete-deployment-config-input/deployment-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/revision-location))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-groups-output/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-groups-output/deployment-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-groups-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-groups-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-groups-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-groups-output/application-name :portkey.aws.codedeploy.list-deployment-groups-output/deployment-groups :portkey.aws.codedeploy.list-deployment-groups-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.register-application-revision-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-application-revision-input/description (clojure.spec.alpha/and :portkey.aws.codedeploy/description))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-application-revision-input/revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy/register-application-revision-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.register-application-revision-input/application-name :portkey.aws.codedeploy.register-application-revision-input/revision] :opt-un [:portkey.aws.codedeploy.register-application-revision-input/description]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/bucket-name-filter-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/file-exists-behavior #{"RETAIN" :retain "OVERWRITE" "DISALLOW" :overwrite :disallow})

(clojure.spec.alpha/def :portkey.aws.codedeploy/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-instance-output/instance-summary (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-summary))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-instance-output/instance-summary]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/git-hub-account-token-name-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/git-hub-account-token-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-instances-output/instances-summary (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-instances-output/error-message (clojure.spec.alpha/and :portkey.aws.codedeploy/error-message))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-deployment-instances-output/instances-summary :portkey.aws.codedeploy.batch-get-deployment-instances-output/error-message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-status-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-status))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/e-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/additional-deployment-status-info (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-ec-2-tag-combination-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-hook-execution-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployed-state-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-on-premises-instances-output/instance-names (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-on-premises-instances-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-on-premises-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-on-premises-instances-output/instance-names :portkey.aws.codedeploy.list-on-premises-instances-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-user-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.add-tags-to-on-premises-instances-input/tags (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.add-tags-to-on-premises-instances-input/instance-names (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/add-tags-to-on-premises-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.add-tags-to-on-premises-instances-input/tags :portkey.aws.codedeploy.add-tags-to-on-premises-instances-input/instance-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/commit-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/instance-name (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/iam-session-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-session-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/iam-user-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-user-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy/register-on-premises-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.register-on-premises-instance-input/instance-name] :opt-un [:portkey.aws.codedeploy.register-on-premises-instance-input/iam-session-arn :portkey.aws.codedeploy.register-on-premises-instance-input/iam-user-arn]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-output/revisions (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-application-revisions-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-application-revisions-output/revisions :portkey.aws.codedeploy.list-application-revisions-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-event-type #{:instance-start :deployment-rollback :deployment-stop "DeploymentReady" "InstanceSuccess" "InstanceFailure" "DeploymentRollback" :instance-ready "DeploymentStop" :instance-success :instance-failure :deployment-ready "InstanceReady" "DeploymentSuccess" "DeploymentFailure" :deployment-failure :deployment-success :deployment-start "InstanceStart" "DeploymentStart"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-instance-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-style/deployment-type (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-style/deployment-option (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-option))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-style (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-style/deployment-type :portkey.aws.codedeploy.deployment-style/deployment-option]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-applications-output/applications (clojure.spec.alpha/and :portkey.aws.codedeploy/applications-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-applications-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-applications-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-applications-output/applications :portkey.aws.codedeploy.list-applications-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.last-deployment-info/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.last-deployment-info/status (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.last-deployment-info/end-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.last-deployment-info/create-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy/last-deployment-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.last-deployment-info/deployment-id :portkey.aws.codedeploy.last-deployment-info/status :portkey.aws.codedeploy.last-deployment-info/end-time :portkey.aws.codedeploy.last-deployment-info/create-time]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-output/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.create-deployment-output/deployment-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-applications-input/application-names (clojure.spec.alpha/and :portkey.aws.codedeploy/applications-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-applications-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-applications-input/application-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-revision-sort-by #{:register-time "firstUsedTime" "registerTime" :first-used-time "lastUsedTime" :last-used-time})

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/tag))

(clojure.spec.alpha/def :portkey.aws.codedeploy/green-fleet-provisioning-action #{"DISCOVER_EXISTING" "COPY_AUTO_SCALING_GROUP" :discover-existing :copy-auto-scaling-group})

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-input/deployment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-instance-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/alarm-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/alarm))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-group-input/application-name :portkey.aws.codedeploy.get-deployment-group-input/deployment-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-rollback-events-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/auto-rollback-event))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/error-code #{:invalid-lambda-configuration :elb-invalid-instance "ALARM_ACTIVE" :missing-blue-green-deployment-configuration :iam-role-missing :invalid-lambda-function "IAM_ROLE_PERMISSIONS" "REVISION_MISSING" :agent-issue "ELB_INVALID_INSTANCE" "NO_EC2_SUBSCRIPTION" :hook-execution-failure "TIMEOUT" :internal-error "HEALTH_CONSTRAINTS" :iam-role-permissions "IAM_ROLE_MISSING" "DEPLOYMENT_GROUP_MISSING" "HEALTH_CONSTRAINTS_INVALID" :deployment-group-missing :alarm-active "INTERNAL_ERROR" "NO_INSTANCES" "ELASTIC_LOAD_BALANCING_INVALID" "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" "AGENT_ISSUE" :health-constraints-invalid :health-constraints :manual-stop :no-instances "MANUAL_STOP" "OVER_MAX_INSTANCES" :throttled :over-max-instances "HOOK_EXECUTION_FAILURE" "MISSING_ELB_INFORMATION" :application-missing :auto-scaling-configuration :timeout "AUTO_SCALING_CONFIGURATION" :missing-elb-information "INVALID_LAMBDA_FUNCTION" :no-ec-2-subscription "APPLICATION_MISSING" "INVALID_LAMBDA_CONFIGURATION" :revision-missing :elastic-load-balancing-invalid "MISSING_GITHUB_TOKEN" "THROTTLED" :missing-github-token :auto-scaling-iam-role-permissions "AUTO_SCALING_IAM_ROLE_PERMISSIONS"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-file-exists-behavior-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/applications-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/application-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy.alarm-configuration/enabled (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.alarm-configuration/ignore-poll-alarm-failure (clojure.spec.alpha/and :portkey.aws.codedeploy/boolean))
(clojure.spec.alpha/def :portkey.aws.codedeploy.alarm-configuration/alarms (clojure.spec.alpha/and :portkey.aws.codedeploy/alarm-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/alarm-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.alarm-configuration/enabled :portkey.aws.codedeploy.alarm-configuration/ignore-poll-alarm-failure :portkey.aws.codedeploy.alarm-configuration/alarms]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-configs-output/deployment-configs-list (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-configs-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-configs-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-configs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-configs-output/deployment-configs-list :portkey.aws.codedeploy.list-deployment-configs-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployments-output/deployments-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployments-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployments-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-deployments-output/deployments-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.target-instances/tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.target-instances/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.target-instances/ec-2-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy/target-instances (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.target-instances/tag-filters :portkey.aws.codedeploy.target-instances/auto-scaling-groups :portkey.aws.codedeploy.target-instances/ec-2-tag-set]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.trigger-config/trigger-name (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.trigger-config/trigger-target-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-target-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.trigger-config/trigger-events (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-event-type-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.trigger-config/trigger-name :portkey.aws.codedeploy.trigger-config/trigger-target-arn :portkey.aws.codedeploy.trigger-config/trigger-events]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-option #{:with-traffic-control :without-traffic-control "WITH_TRAFFIC_CONTROL" "WITHOUT_TRAFFIC_CONTROL"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-rollback-event #{"DEPLOYMENT_STOP_ON_ALARM" "DEPLOYMENT_FAILURE" "DEPLOYMENT_STOP_ON_REQUEST" :deployment-stop-on-alarm :deployment-stop-on-request :deployment-failure})

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-on-premises-instances-input/instance-names (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-on-premises-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-on-premises-instances-input/instance-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/list-state-filter-action #{"ignore" :exclude :include :ignore "include" "exclude"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ec-2-tag-filter-type #{:value-only :key-only "KEY_ONLY" "VALUE_ONLY" :key-and-value "KEY_AND_VALUE"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/minimum-healthy-hosts-type #{:fleet-percent "FLEET_PERCENT" "HOST_COUNT" :host-count})

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-scaling-group-name-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/auto-scaling-group-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-session-arn-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-update-outdated-instances-only-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.auto-scaling-group/name (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.auto-scaling-group/hook (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-hook))
(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-scaling-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.auto-scaling-group/name :portkey.aws.codedeploy.auto-scaling-group/hook]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy/duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location-type #{:s-3 :git-hub :string "String" "GitHub" "S3"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/target-group-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/instance-id (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/status (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/last-updated-at (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/lifecycle-events (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-summary/instance-type (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.instance-summary/deployment-id :portkey.aws.codedeploy.instance-summary/instance-id :portkey.aws.codedeploy.instance-summary/status :portkey.aws.codedeploy.instance-summary/last-updated-at :portkey.aws.codedeploy.instance-summary/lifecycle-events :portkey.aws.codedeploy.instance-summary/instance-type]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-configs-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-config-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/on-premises-tag-set-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/tag-filter-list))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployments-input/deployment-ids (clojure.spec.alpha/and :portkey.aws.codedeploy/deployments-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployments-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-deployments-input/deployment-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/description-too-long-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/script-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-creator #{:autoscaling "user" :code-deploy-rollback "codeDeployRollback" :user "autoscaling"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/revision-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/operation-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-key-prefix-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/percentage clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-git-hub-account-token-names-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-git-hub-account-token-names-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-git-hub-account-token-names-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-sort-order-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-revision-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-revision-input/revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-application-revision-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-application-revision-input/application-name :portkey.aws.codedeploy.get-application-revision-input/revision] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-set-list-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-applications-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-applications-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-applications-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-config-output/deployment-config-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.create-deployment-config-output/deployment-config-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-registration-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/alarm-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-groups-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-group-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/s-3-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-on-premises-instance-output/instance-info (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-on-premises-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-on-premises-instance-output/instance-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-on-premises-instances-output/instance-infos (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-on-premises-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-on-premises-instances-output/instance-infos]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-iam-session-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-ready-action #{:stop-deployment :continue-deployment "STOP_DEPLOYMENT" "CONTINUE_DEPLOYMENT"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-application-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-revision-output/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-revision-output/revision (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-application-revision-output/revision-info (clojure.spec.alpha/and :portkey.aws.codedeploy/generic-revision-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-application-revision-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-application-revision-output/application-name :portkey.aws.codedeploy.get-application-revision-output/revision :portkey.aws.codedeploy.get-application-revision-output/revision-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.git-hub-location/repository (clojure.spec.alpha/and :portkey.aws.codedeploy/repository))
(clojure.spec.alpha/def :portkey.aws.codedeploy.git-hub-location/commit-id (clojure.spec.alpha/and :portkey.aws.codedeploy/commit-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/git-hub-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.git-hub-location/repository :portkey.aws.codedeploy.git-hub-location/commit-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.s-3-location/bucket (clojure.spec.alpha/and :portkey.aws.codedeploy/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.codedeploy.s-3-location/key (clojure.spec.alpha/and :portkey.aws.codedeploy/s-3-key))
(clojure.spec.alpha/def :portkey.aws.codedeploy.s-3-location/bundle-type (clojure.spec.alpha/and :portkey.aws.codedeploy/bundle-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy.s-3-location/version (clojure.spec.alpha/and :portkey.aws.codedeploy/version-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.s-3-location/e-tag (clojure.spec.alpha/and :portkey.aws.codedeploy/e-tag))
(clojure.spec.alpha/def :portkey.aws.codedeploy/s-3-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.s-3-location/bucket :portkey.aws.codedeploy.s-3-location/key :portkey.aws.codedeploy.s-3-location/bundle-type :portkey.aws.codedeploy.s-3-location/version :portkey.aws.codedeploy.s-3-location/e-tag]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.tag-filter/type (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-filter-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy/key :portkey.aws.codedeploy/value :portkey.aws.codedeploy.tag-filter/type]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-instance-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ec-2-tag-filter-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/ec-2-tag-filter))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instances-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-id))

(clojure.spec.alpha/def :portkey.aws.codedeploy/s-3-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/current-deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/blue-green-deployment-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/blue-green-deployment-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/on-premises-tag-set (clojure.spec.alpha/and :portkey.aws.codedeploy/on-premises-tag-set))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/new-deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/auto-rollback-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-rollback-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/deployment-style (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-style))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/auto-scaling-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/trigger-configurations (clojure.spec.alpha/and :portkey.aws.codedeploy/trigger-config-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/service-role-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/role))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/load-balancer-info (clojure.spec.alpha/and :portkey.aws.codedeploy/load-balancer-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/alarm-configuration (clojure.spec.alpha/and :portkey.aws.codedeploy/alarm-configuration))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/on-premises-instance-tag-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-filter-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/update-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.update-deployment-group-input/application-name :portkey.aws.codedeploy.update-deployment-group-input/current-deployment-group-name] :opt-un [:portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-set :portkey.aws.codedeploy.update-deployment-group-input/blue-green-deployment-configuration :portkey.aws.codedeploy.update-deployment-group-input/on-premises-tag-set :portkey.aws.codedeploy.update-deployment-group-input/deployment-config-name :portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-filters :portkey.aws.codedeploy.update-deployment-group-input/new-deployment-group-name :portkey.aws.codedeploy.update-deployment-group-input/auto-rollback-configuration :portkey.aws.codedeploy.update-deployment-group-input/deployment-style :portkey.aws.codedeploy.update-deployment-group-input/auto-scaling-groups :portkey.aws.codedeploy.update-deployment-group-input/trigger-configurations :portkey.aws.codedeploy.update-deployment-group-input/service-role-arn :portkey.aws.codedeploy.update-deployment-group-input/load-balancer-info :portkey.aws.codedeploy.update-deployment-group-input/alarm-configuration :portkey.aws.codedeploy.update-deployment-group-input/on-premises-instance-tag-filters]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-blue-green-deployment-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.generic-revision-info/description (clojure.spec.alpha/and :portkey.aws.codedeploy/description))
(clojure.spec.alpha/def :portkey.aws.codedeploy.generic-revision-info/deployment-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-groups-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.generic-revision-info/first-used-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.generic-revision-info/last-used-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.generic-revision-info/register-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy/generic-revision-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.generic-revision-info/description :portkey.aws.codedeploy.generic-revision-info/deployment-groups :portkey.aws.codedeploy.generic-revision-info/first-used-time :portkey.aws.codedeploy.generic-revision-info/last-used-time :portkey.aws.codedeploy.generic-revision-info/register-time]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-instance-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-output/instances-list (clojure.spec.alpha/and :portkey.aws.codedeploy/instances-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-instances-output/instances-list :portkey.aws.codedeploy.list-deployment-instances-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-is-not-in-ready-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployments-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-id))

(clojure.spec.alpha/def :portkey.aws.codedeploy/multiple-iam-arns-provided-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-load-balancer-info-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-ignore-application-stop-failures-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-configs-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-configs-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.remove-tags-from-on-premises-instances-input/tags (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.remove-tags-from-on-premises-instances-input/instance-names (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/remove-tags-from-on-premises-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.remove-tags-from-on-premises-instances-input/tags :portkey.aws.codedeploy.remove-tags-from-on-premises-instances-input/instance-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/lifecycle-event))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-filter-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/tag-filter))

(clojure.spec.alpha/def :portkey.aws.codedeploy/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-applications-output/applications-info (clojure.spec.alpha/and :portkey.aws.codedeploy/applications-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-applications-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-applications-output/applications-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-auto-rollback-config-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.update-application-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-application-input/new-application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/update-application-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.update-application-input/application-name :portkey.aws.codedeploy.update-application-input/new-application-name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-status #{"Created" "Failed" :ready :in-progress "Succeeded" "Ready" :created :queued :stopped "InProgress" "Stopped" "Queued" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy.time-range/start (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.time-range/end (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy/time-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.time-range/start :portkey.aws.codedeploy.time-range/end]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-output/lifecycle-event-hook-execution-id (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-hook-execution-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-output/lifecycle-event-hook-execution-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ec-2-tag-set-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/ec-2-tag-filter-list))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy/key :portkey.aws.codedeploy/value]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.alarm/name (clojure.spec.alpha/and :portkey.aws.codedeploy/alarm-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/alarm (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.alarm/name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.ec-2-tag-filter/type (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-filter-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/ec-2-tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy/key :portkey.aws.codedeploy/value :portkey.aws.codedeploy.ec-2-tag-filter/type]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/sort-by (clojure.spec.alpha/and :portkey.aws.codedeploy/application-revision-sort-by))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/sort-order (clojure.spec.alpha/and :portkey.aws.codedeploy/sort-order))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/s-3-bucket (clojure.spec.alpha/and :portkey.aws.codedeploy/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/s-3-key-prefix (clojure.spec.alpha/and :portkey.aws.codedeploy/s-3-key))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/deployed (clojure.spec.alpha/and :portkey.aws.codedeploy/list-state-filter-action))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-application-revisions-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-application-revisions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.list-application-revisions-input/application-name] :opt-un [:portkey.aws.codedeploy.list-application-revisions-input/sort-by :portkey.aws.codedeploy.list-application-revisions-input/sort-order :portkey.aws.codedeploy.list-application-revisions-input/s-3-bucket :portkey.aws.codedeploy.list-application-revisions-input/s-3-key-prefix :portkey.aws.codedeploy.list-application-revisions-input/deployed :portkey.aws.codedeploy.list-application-revisions-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-status #{"Failed" :ready "Skipped" :in-progress :unknown "Succeeded" :pending "Ready" "Unknown" :skipped "InProgress" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-config-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/trigger-config))

(clojure.spec.alpha/def :portkey.aws.codedeploy/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/lifecycle-event-hook-execution-id (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-hook-execution-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/status (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/deployment-id :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/lifecycle-event-hook-execution-id :portkey.aws.codedeploy.put-lifecycle-event-hook-execution-status-input/status]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-error-code #{"UnknownError" "ScriptTimedOut" :script-timed-out "ScriptNotExecutable" "ScriptMissing" "Success" :success "ScriptFailed" :script-missing :script-not-executable :script-failed :unknown-error})

(clojure.spec.alpha/def :portkey.aws.codedeploy.blue-green-deployment-configuration/terminate-blue-instances-on-deployment-success (clojure.spec.alpha/and :portkey.aws.codedeploy/blue-instance-termination-option))
(clojure.spec.alpha/def :portkey.aws.codedeploy.blue-green-deployment-configuration/deployment-ready-option (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-ready-option))
(clojure.spec.alpha/def :portkey.aws.codedeploy.blue-green-deployment-configuration/green-fleet-provisioning-option (clojure.spec.alpha/and :portkey.aws.codedeploy/green-fleet-provisioning-option))
(clojure.spec.alpha/def :portkey.aws.codedeploy/blue-green-deployment-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.blue-green-deployment-configuration/terminate-blue-instances-on-deployment-success :portkey.aws.codedeploy.blue-green-deployment-configuration/deployment-ready-option :portkey.aws.codedeploy.blue-green-deployment-configuration/green-fleet-provisioning-option]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-on-premises-instance-input/instance-name (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-on-premises-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-on-premises-instance-input/instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-instances-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-instances-input/instance-ids (clojure.spec.alpha/and :portkey.aws.codedeploy/instances-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-deployment-instances-input/deployment-id :portkey.aws.codedeploy.batch-get-deployment-instances-input/instance-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-status #{"Failed" "Skipped" :in-progress :unknown "Succeeded" :pending "Unknown" :skipped "InProgress" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-minimum-healthy-host-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/git-hub-account-token-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.continue-deployment-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/continue-deployment-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.continue-deployment-input/deployment-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-application-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.delete-application-input/application-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/traffic-routing-type #{"AllAtOnce" "TimeBasedCanary" :time-based-canary :time-based-linear :all-at-once "TimeBasedLinear"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployments-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-auto-scaling-group-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/raw-string-sha-256 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-traffic-routing-configuration-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-user-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-name-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.error-information/code (clojure.spec.alpha/and :portkey.aws.codedeploy/error-code))
(clojure.spec.alpha/def :portkey.aws.codedeploy.error-information/message (clojure.spec.alpha/and :portkey.aws.codedeploy/error-message))
(clojure.spec.alpha/def :portkey.aws.codedeploy/error-information (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.error-information/code :portkey.aws.codedeploy.error-information/message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/stop-status #{"Succeeded" :pending "Pending" :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-info/revision-location (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location))
(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-info/generic-revision-info (clojure.spec.alpha/and :portkey.aws.codedeploy/generic-revision-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.revision-info/revision-location :portkey.aws.codedeploy.revision-info/generic-revision-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-ready-option/action-on-timeout (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-ready-action))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-ready-option/wait-time-in-minutes (clojure.spec.alpha/and :portkey.aws.codedeploy/duration))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-ready-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-ready-option/action-on-timeout :portkey.aws.codedeploy.deployment-ready-option/wait-time-in-minutes]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/applications-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/application-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-status-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-status))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-groups-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-groups-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-groups-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.list-deployment-groups-input/application-name] :opt-un [:portkey.aws.codedeploy.list-deployment-groups-input/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-tag-filter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/role-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-output/deployments (clojure.spec.alpha/and :portkey.aws.codedeploy/deployments-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployments-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployments-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployments-output/deployments :portkey.aws.codedeploy.list-deployments-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name-already-registered-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-alarm-config-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-deployment-group-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-deployment-group-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.delete-deployment-group-input/application-name :portkey.aws.codedeploy.delete-deployment-group-input/deployment-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.ec-2-tag-set/ec-2-tag-set-list (clojure.spec.alpha/and :portkey.aws.codedeploy/ec-2-tag-set-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/ec-2-tag-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.ec-2-tag-set/ec-2-tag-set-list]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/alarms-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-time-range-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-output/deployment-group-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.create-deployment-group-output/deployment-group-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-session-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-target-instances-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-git-hub-account-token-names-output/token-name-list (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-account-token-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-git-hub-account-token-names-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-git-hub-account-token-names-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-git-hub-account-token-names-output/token-name-list :portkey.aws.codedeploy.list-git-hub-account-token-names-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-instance-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-instance-input/instance-id (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-instance-input/deployment-id :portkey.aws.codedeploy.get-deployment-instance-input/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-linear/linear-percentage (clojure.spec.alpha/and :portkey.aws.codedeploy/percentage))
(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-linear/linear-interval (clojure.spec.alpha/and :portkey.aws.codedeploy/wait-time-in-mins))
(clojure.spec.alpha/def :portkey.aws.codedeploy/time-based-linear (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.time-based-linear/linear-percentage :portkey.aws.codedeploy.time-based-linear/linear-interval]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/resource-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-already-completed-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.on-premises-tag-set/on-premises-tag-set-list (clojure.spec.alpha/and :portkey.aws.codedeploy/on-premises-tag-set-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/on-premises-tag-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.on-premises-tag-set/on-premises-tag-set-list]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/instance-name (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/iam-session-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-session-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/iam-user-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-user-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/instance-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/register-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/deregister-time (clojure.spec.alpha/and :portkey.aws.codedeploy/timestamp))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-info/tags (clojure.spec.alpha/and :portkey.aws.codedeploy/tag-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.instance-info/instance-name :portkey.aws.codedeploy.instance-info/iam-session-arn :portkey.aws.codedeploy.instance-info/iam-user-arn :portkey.aws.codedeploy.instance-info/instance-arn :portkey.aws.codedeploy.instance-info/register-time :portkey.aws.codedeploy.instance-info/deregister-time :portkey.aws.codedeploy.instance-info/tags]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.target-group-info/name (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.target-group-info/name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-group-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-input/revisions (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-application-revisions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-application-revisions-input/application-name :portkey.aws.codedeploy.batch-get-application-revisions-input/revisions] :opt-un []))

(clojure.core/defn register-on-premises-instance ([register-on-premises-instance-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-on-premises-instance-input register-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/register-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterOnPremisesInstance", :http.request.spec/error-spec {"IamUserArnAlreadyRegisteredException" :portkey.aws.codedeploy/iam-user-arn-already-registered-exception, "InvalidIamUserArnException" :portkey.aws.codedeploy/invalid-iam-user-arn-exception, "IamArnRequiredException" :portkey.aws.codedeploy/iam-arn-required-exception, "IamUserArnRequiredException" :portkey.aws.codedeploy/iam-user-arn-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "IamSessionArnAlreadyRegisteredException" :portkey.aws.codedeploy/iam-session-arn-already-registered-exception, "InvalidIamSessionArnException" :portkey.aws.codedeploy/invalid-iam-session-arn-exception, "MultipleIamArnsProvidedException" :portkey.aws.codedeploy/multiple-iam-arns-provided-exception, "InstanceNameAlreadyRegisteredException" :portkey.aws.codedeploy/instance-name-already-registered-exception}})))))
(clojure.spec.alpha/fdef register-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/register-on-premises-instance-input) :ret clojure.core/true?)

(clojure.core/defn list-deployment-configs ([] (list-deployment-configs {})) ([list-deployment-configs-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-deployment-configs-input list-deployment-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeploymentConfigs", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-deployment-configs :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-deployment-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-configs-output))

(clojure.core/defn list-applications ([] (list-applications {})) ([list-applications-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-applications-input list-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-applications-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-applications-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListApplications", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-applications-output))

(clojure.core/defn list-git-hub-account-token-names ([] (list-git-hub-account-token-names {})) ([list-git-hub-account-token-names-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-git-hub-account-token-names-input list-git-hub-account-token-names-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-git-hub-account-token-names-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-git-hub-account-token-names-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListGitHubAccountTokenNames", :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "ResourceValidationException" :portkey.aws.codedeploy/resource-validation-exception, "OperationNotSupportedException" :portkey.aws.codedeploy/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-git-hub-account-token-names :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-git-hub-account-token-names-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-git-hub-account-token-names-output))

(clojure.core/defn skip-wait-time-for-instance-termination ([] (skip-wait-time-for-instance-termination {})) ([skip-wait-time-for-instance-termination-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-skip-wait-time-for-instance-termination-input skip-wait-time-for-instance-termination-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/skip-wait-time-for-instance-termination-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SkipWaitTimeForInstanceTermination", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentNotStartedException" :portkey.aws.codedeploy/deployment-not-started-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception}})))))
(clojure.spec.alpha/fdef skip-wait-time-for-instance-termination :args (clojure.spec.alpha/? :portkey.aws.codedeploy/skip-wait-time-for-instance-termination-input) :ret clojure.core/true?)

(clojure.core/defn get-deployment ([get-deployment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-deployment-input get-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeployment", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-output))

(clojure.core/defn delete-application ([delete-application-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-application-input delete-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteApplication", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-application-input) :ret clojure.core/true?)

(clojure.core/defn delete-git-hub-account-token ([] (delete-git-hub-account-token {})) ([delete-git-hub-account-token-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-git-hub-account-token-input delete-git-hub-account-token-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/delete-git-hub-account-token-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-git-hub-account-token-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteGitHubAccountToken", :http.request.spec/error-spec {"GitHubAccountTokenNameRequiredException" :portkey.aws.codedeploy/git-hub-account-token-name-required-exception, "GitHubAccountTokenDoesNotExistException" :portkey.aws.codedeploy/git-hub-account-token-does-not-exist-exception, "InvalidGitHubAccountTokenNameException" :portkey.aws.codedeploy/invalid-git-hub-account-token-name-exception, "ResourceValidationException" :portkey.aws.codedeploy/resource-validation-exception, "OperationNotSupportedException" :portkey.aws.codedeploy/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef delete-git-hub-account-token :args (clojure.spec.alpha/? :portkey.aws.codedeploy/delete-git-hub-account-token-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/delete-git-hub-account-token-output))

(clojure.core/defn get-application-revision ([get-application-revision-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-application-revision-input get-application-revision-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-application-revision-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-application-revision-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetApplicationRevision", :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "RevisionDoesNotExistException" :portkey.aws.codedeploy/revision-does-not-exist-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception}})))))
(clojure.spec.alpha/fdef get-application-revision :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-application-revision-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-application-revision-output))

(clojure.core/defn register-application-revision ([register-application-revision-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-application-revision-input register-application-revision-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/register-application-revision-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterApplicationRevision", :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DescriptionTooLongException" :portkey.aws.codedeploy/description-too-long-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception}})))))
(clojure.spec.alpha/fdef register-application-revision :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/register-application-revision-input) :ret clojure.core/true?)

(clojure.core/defn stop-deployment ([stop-deployment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-stop-deployment-input stop-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/stop-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/stop-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopDeployment", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception}})))))
(clojure.spec.alpha/fdef stop-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/stop-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/stop-deployment-output))

(clojure.core/defn batch-get-deployment-instances ([batch-get-deployment-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-deployment-instances-input batch-get-deployment-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployment-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployment-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetDeploymentInstances", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InstanceIdRequiredException" :portkey.aws.codedeploy/instance-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployment-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployment-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployment-instances-output))

(clojure.core/defn list-deployment-instances ([list-deployment-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-deployment-instances-input list-deployment-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeploymentInstances", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentNotStartedException" :portkey.aws.codedeploy/deployment-not-started-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InvalidInstanceStatusException" :portkey.aws.codedeploy/invalid-instance-status-exception, "InvalidInstanceTypeException" :portkey.aws.codedeploy/invalid-instance-type-exception, "InvalidDeploymentInstanceTypeException" :portkey.aws.codedeploy/invalid-deployment-instance-type-exception}})))))
(clojure.spec.alpha/fdef list-deployment-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-deployment-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-instances-output))

(clojure.core/defn create-deployment ([create-deployment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-deployment-input create-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDeployment", :http.request.spec/error-spec {"InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidGitHubAccountTokenException" :portkey.aws.codedeploy/invalid-git-hub-account-token-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentLimitExceededException" :portkey.aws.codedeploy/deployment-limit-exceeded-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "RevisionDoesNotExistException" :portkey.aws.codedeploy/revision-does-not-exist-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "InvalidFileExistsBehaviorException" :portkey.aws.codedeploy/invalid-file-exists-behavior-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidUpdateOutdatedInstancesOnlyValueException" :portkey.aws.codedeploy/invalid-update-outdated-instances-only-value-exception, "DescriptionTooLongException" :portkey.aws.codedeploy/description-too-long-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidIgnoreApplicationStopFailuresValueException" :portkey.aws.codedeploy/invalid-ignore-application-stop-failures-value-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "ThrottlingException" :portkey.aws.codedeploy/throttling-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidTargetInstancesException" :portkey.aws.codedeploy/invalid-target-instances-exception}})))))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-output))

(clojure.core/defn put-lifecycle-event-hook-execution-status ([] (put-lifecycle-event-hook-execution-status {})) ([put-lifecycle-event-hook-execution-status-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-lifecycle-event-hook-execution-status-input put-lifecycle-event-hook-execution-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutLifecycleEventHookExecutionStatus", :http.request.spec/error-spec {"InvalidLifecycleEventHookExecutionStatusException" :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-status-exception, "InvalidLifecycleEventHookExecutionIdException" :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-id-exception, "LifecycleEventAlreadyCompletedException" :portkey.aws.codedeploy/lifecycle-event-already-completed-exception, "DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception}})))))
(clojure.spec.alpha/fdef put-lifecycle-event-hook-execution-status :args (clojure.spec.alpha/? :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-output))

(clojure.core/defn deregister-on-premises-instance ([deregister-on-premises-instance-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-on-premises-instance-input deregister-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/deregister-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterOnPremisesInstance", :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef deregister-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/deregister-on-premises-instance-input) :ret clojure.core/true?)

(clojure.core/defn delete-deployment-config ([delete-deployment-config-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-deployment-config-input delete-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDeploymentConfig", :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigInUseException" :portkey.aws.codedeploy/deployment-config-in-use-exception, "InvalidOperationException" :portkey.aws.codedeploy/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-deployment-config-input) :ret clojure.core/true?)

(clojure.core/defn list-application-revisions ([list-application-revisions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-application-revisions-input list-application-revisions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-application-revisions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-application-revisions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListApplicationRevisions", :http.request.spec/error-spec {"InvalidSortByException" :portkey.aws.codedeploy/invalid-sort-by-exception, "InvalidBucketNameFilterException" :portkey.aws.codedeploy/invalid-bucket-name-filter-exception, "BucketNameFilterRequiredException" :portkey.aws.codedeploy/bucket-name-filter-required-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "InvalidDeployedStateFilterException" :portkey.aws.codedeploy/invalid-deployed-state-filter-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidKeyPrefixFilterException" :portkey.aws.codedeploy/invalid-key-prefix-filter-exception, "InvalidSortOrderException" :portkey.aws.codedeploy/invalid-sort-order-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception}})))))
(clojure.spec.alpha/fdef list-application-revisions :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-application-revisions-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-application-revisions-output))

(clojure.core/defn batch-get-on-premises-instances ([batch-get-on-premises-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-on-premises-instances-input batch-get-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-on-premises-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetOnPremisesInstances", :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-on-premises-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-on-premises-instances-output))

(clojure.core/defn list-deployment-groups ([list-deployment-groups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-deployment-groups-input list-deployment-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeploymentGroups", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-deployment-groups :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-deployment-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-groups-output))

(clojure.core/defn get-application ([get-application-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-application-input get-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-application-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetApplication", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-application-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-application-output))

(clojure.core/defn get-deployment-config ([get-deployment-config-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-deployment-config-input get-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeploymentConfig", :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-config-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-config-output))

(clojure.core/defn list-deployments ([] (list-deployments {})) ([list-deployments-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-deployments-input list-deployments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployments-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployments-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeployments", :http.request.spec/error-spec {"InvalidDeploymentStatusException" :portkey.aws.codedeploy/invalid-deployment-status-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidTimeRangeException" :portkey.aws.codedeploy/invalid-time-range-exception}})))))
(clojure.spec.alpha/fdef list-deployments :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-deployments-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployments-output))

(clojure.core/defn update-application ([] (update-application {})) ([update-application-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-application-input update-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/update-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateApplication", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationAlreadyExistsException" :portkey.aws.codedeploy/application-already-exists-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/? :portkey.aws.codedeploy/update-application-input) :ret clojure.core/true?)

(clojure.core/defn create-deployment-group ([create-deployment-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-deployment-group-input create-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDeploymentGroup", :http.request.spec/error-spec {"DeploymentGroupAlreadyExistsException" :portkey.aws.codedeploy/deployment-group-already-exists-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidTriggerConfigException" :portkey.aws.codedeploy/invalid-trigger-config-exception, "InvalidOnPremisesTagCombinationException" :portkey.aws.codedeploy/invalid-on-premises-tag-combination-exception, "InvalidEC2TagException" :portkey.aws.codedeploy/invalid-ec-2-tag-exception, "InvalidDeploymentStyleException" :portkey.aws.codedeploy/invalid-deployment-style-exception, "LifecycleHookLimitExceededException" :portkey.aws.codedeploy/lifecycle-hook-limit-exceeded-exception, "TriggerTargetsLimitExceededException" :portkey.aws.codedeploy/trigger-targets-limit-exceeded-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentGroupLimitExceededException" :portkey.aws.codedeploy/deployment-group-limit-exceeded-exception, "InvalidEC2TagCombinationException" :portkey.aws.codedeploy/invalid-ec-2-tag-combination-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidInputException" :portkey.aws.codedeploy/invalid-input-exception, "TagSetListLimitExceededException" :portkey.aws.codedeploy/tag-set-list-limit-exceeded-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidBlueGreenDeploymentConfigurationException" :portkey.aws.codedeploy/invalid-blue-green-deployment-configuration-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "RoleRequiredException" :portkey.aws.codedeploy/role-required-exception, "InvalidAlarmConfigException" :portkey.aws.codedeploy/invalid-alarm-config-exception, "AlarmsLimitExceededException" :portkey.aws.codedeploy/alarms-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-group-output))

(clojure.core/defn create-application ([create-application-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-application-input create-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-application-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateApplication", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationAlreadyExistsException" :portkey.aws.codedeploy/application-already-exists-exception, "ApplicationLimitExceededException" :portkey.aws.codedeploy/application-limit-exceeded-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-application-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-application-output))

(clojure.core/defn get-deployment-instance ([get-deployment-instance-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-deployment-instance-input get-deployment-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeploymentInstance", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InstanceIdRequiredException" :portkey.aws.codedeploy/instance-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InstanceDoesNotExistException" :portkey.aws.codedeploy/instance-does-not-exist-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef get-deployment-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-instance-output))

(clojure.core/defn remove-tags-from-on-premises-instances ([remove-tags-from-on-premises-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-from-on-premises-instances-input remove-tags-from-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/remove-tags-from-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromOnPremisesInstances", :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "TagRequiredException" :portkey.aws.codedeploy/tag-required-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.codedeploy/tag-limit-exceeded-exception, "InstanceLimitExceededException" :portkey.aws.codedeploy/instance-limit-exceeded-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/remove-tags-from-on-premises-instances-input) :ret clojure.core/true?)

(clojure.core/defn batch-get-deployments ([batch-get-deployments-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-deployments-input batch-get-deployments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployments-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployments-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetDeployments", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployments :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployments-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployments-output))

(clojure.core/defn batch-get-application-revisions ([batch-get-application-revisions-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-application-revisions-input batch-get-application-revisions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-application-revisions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-application-revisions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetApplicationRevisions", :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-application-revisions :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-application-revisions-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-application-revisions-output))

(clojure.core/defn delete-deployment-group ([delete-deployment-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-deployment-group-input delete-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/delete-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteDeploymentGroup", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception}})))))
(clojure.spec.alpha/fdef delete-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/delete-deployment-group-output))

(clojure.core/defn batch-get-applications ([batch-get-applications-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-applications-input batch-get-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-applications-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-applications-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetApplications", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-applications :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-applications-output))

(clojure.core/defn get-on-premises-instance ([get-on-premises-instance-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-on-premises-instance-input get-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-on-premises-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetOnPremisesInstance", :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef get-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-on-premises-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-on-premises-instance-output))

(clojure.core/defn batch-get-deployment-groups ([batch-get-deployment-groups-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-deployment-groups-input batch-get-deployment-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployment-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployment-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetDeploymentGroups", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployment-groups :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployment-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployment-groups-output))

(clojure.core/defn list-on-premises-instances ([] (list-on-premises-instances {})) ([list-on-premises-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-on-premises-instances-input list-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-on-premises-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListOnPremisesInstances", :http.request.spec/error-spec {"InvalidRegistrationStatusException" :portkey.aws.codedeploy/invalid-registration-status-exception, "InvalidTagFilterException" :portkey.aws.codedeploy/invalid-tag-filter-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-on-premises-instances :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-on-premises-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-on-premises-instances-output))

(clojure.core/defn update-deployment-group ([update-deployment-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-deployment-group-input update-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/update-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/update-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDeploymentGroup", :http.request.spec/error-spec {"DeploymentGroupAlreadyExistsException" :portkey.aws.codedeploy/deployment-group-already-exists-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidTriggerConfigException" :portkey.aws.codedeploy/invalid-trigger-config-exception, "InvalidOnPremisesTagCombinationException" :portkey.aws.codedeploy/invalid-on-premises-tag-combination-exception, "InvalidEC2TagException" :portkey.aws.codedeploy/invalid-ec-2-tag-exception, "InvalidDeploymentStyleException" :portkey.aws.codedeploy/invalid-deployment-style-exception, "LifecycleHookLimitExceededException" :portkey.aws.codedeploy/lifecycle-hook-limit-exceeded-exception, "TriggerTargetsLimitExceededException" :portkey.aws.codedeploy/trigger-targets-limit-exceeded-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "InvalidEC2TagCombinationException" :portkey.aws.codedeploy/invalid-ec-2-tag-combination-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidInputException" :portkey.aws.codedeploy/invalid-input-exception, "TagSetListLimitExceededException" :portkey.aws.codedeploy/tag-set-list-limit-exceeded-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidBlueGreenDeploymentConfigurationException" :portkey.aws.codedeploy/invalid-blue-green-deployment-configuration-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidAlarmConfigException" :portkey.aws.codedeploy/invalid-alarm-config-exception, "AlarmsLimitExceededException" :portkey.aws.codedeploy/alarms-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/update-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/update-deployment-group-output))

(clojure.core/defn add-tags-to-on-premises-instances ([add-tags-to-on-premises-instances-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-to-on-premises-instances-input add-tags-to-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/add-tags-to-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToOnPremisesInstances", :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "TagRequiredException" :portkey.aws.codedeploy/tag-required-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.codedeploy/tag-limit-exceeded-exception, "InstanceLimitExceededException" :portkey.aws.codedeploy/instance-limit-exceeded-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/add-tags-to-on-premises-instances-input) :ret clojure.core/true?)

(clojure.core/defn get-deployment-group ([get-deployment-group-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-deployment-group-input get-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDeploymentGroup", :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-group-output))

(clojure.core/defn continue-deployment ([] (continue-deployment {})) ([continue-deployment-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-continue-deployment-input continue-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/continue-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ContinueDeployment", :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentIsNotInReadyStateException" :portkey.aws.codedeploy/deployment-is-not-in-ready-state-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception}})))))
(clojure.spec.alpha/fdef continue-deployment :args (clojure.spec.alpha/? :portkey.aws.codedeploy/continue-deployment-input) :ret clojure.core/true?)

(clojure.core/defn create-deployment-config ([create-deployment-config-inputinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-deployment-config-input create-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateDeploymentConfig", :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigAlreadyExistsException" :portkey.aws.codedeploy/deployment-config-already-exists-exception, "InvalidMinimumHealthyHostValueException" :portkey.aws.codedeploy/invalid-minimum-healthy-host-value-exception, "DeploymentConfigLimitExceededException" :portkey.aws.codedeploy/deployment-config-limit-exceeded-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception, "InvalidTrafficRoutingConfigurationException" :portkey.aws.codedeploy/invalid-traffic-routing-configuration-exception}})))))
(clojure.spec.alpha/fdef create-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-config-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-config-output))
