(ns portkey.aws.codedeploy (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "codedeploy", :region "us-west-1"},
    :ssl-common-name "codedeploy-fips.us-west-1.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-east-1"
   {:credential-scope {:service "codedeploy", :region "us-gov-east-1"},
    :ssl-common-name "codedeploy.us-gov-east-1.amazonaws.com",
    :endpoint "https://codedeploy.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
   "us-gov-west-1-fips"
   {:credential-scope {:service "codedeploy", :region "us-gov-west-1"},
    :ssl-common-name "codedeploy-fips.us-gov-west-1.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "codedeploy", :region "us-east-2"},
    :ssl-common-name "codedeploy-fips.us-east-2.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-east-2.amazonaws.com",
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
   "us-east-1-fips"
   {:credential-scope {:service "codedeploy", :region "us-east-1"},
    :ssl-common-name "codedeploy-fips.us-east-1.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "codedeploy", :region "us-west-2"},
    :ssl-common-name "codedeploy.us-west-2.amazonaws.com",
    :endpoint "https://codedeploy.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-east-1-fips"
   {:credential-scope {:service "codedeploy", :region "us-gov-east-1"},
    :ssl-common-name "codedeploy-fips.us-gov-east-1.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "codedeploy", :region "us-west-2"},
    :ssl-common-name "codedeploy-fips.us-west-2.amazonaws.com",
    :endpoint "https://codedeploy-fips.us-west-2.amazonaws.com",
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "codedeploy", :region "eu-north-1"},
    :ssl-common-name "codedeploy.eu-north-1.amazonaws.com",
    :endpoint "https://codedeploy.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-auto-rollback-configuration)

(clojure.core/declare ser-bundle-type)

(clojure.core/declare ser-auto-scaling-group-name)

(clojure.core/declare ser-filter-value-list)

(clojure.core/declare ser-instance-action)

(clojure.core/declare ser-deployment-config-name)

(clojure.core/declare ser-instance-id)

(clojure.core/declare ser-raw-string-content)

(clojure.core/declare ser-ecs-service)

(clojure.core/declare ser-trigger-event-type-list)

(clojure.core/declare ser-elb-name)

(clojure.core/declare ser-deployment-type)

(clojure.core/declare ser-git-hub-account-token-name)

(clojure.core/declare ser-target-id-list)

(clojure.core/declare ser-raw-string)

(clojure.core/declare ser-traffic-routing-config)

(clojure.core/declare ser-elb-info)

(clojure.core/declare ser-wait-time-in-mins)

(clojure.core/declare ser-registration-status)

(clojure.core/declare ser-version-id)

(clojure.core/declare ser-elb-info-list)

(clojure.core/declare ser-listener-arn-list)

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

(clojure.core/declare ser-app-spec-content)

(clojure.core/declare ser-deployment-group-name)

(clojure.core/declare ser-target-group-pair-info)

(clojure.core/declare ser-file-exists-behavior)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-instance-status-list)

(clojure.core/declare ser-e-tag)

(clojure.core/declare ser-lifecycle-event-hook-execution-id)

(clojure.core/declare ser-key)

(clojure.core/declare ser-commit-id)

(clojure.core/declare ser-target-group-name)

(clojure.core/declare ser-ecs-service-list)

(clojure.core/declare ser-trigger-event-type)

(clojure.core/declare ser-deployment-style)

(clojure.core/declare ser-role)

(clojure.core/declare ser-application-revision-sort-by)

(clojure.core/declare ser-instance-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-ecs-cluster-name)

(clojure.core/declare ser-green-fleet-provisioning-action)

(clojure.core/declare ser-trigger-target-arn)

(clojure.core/declare ser-instance-name)

(clojure.core/declare ser-target-filter-name)

(clojure.core/declare ser-alarm-list)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-auto-rollback-events-list)

(clojure.core/declare ser-traffic-route)

(clojure.core/declare ser-trigger-name)

(clojure.core/declare ser-listener-arn)

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

(clojure.core/declare ser-ecs-service-name)

(clojure.core/declare ser-target-filters)

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

(clojure.core/declare ser-target-group-pair-info-list)

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

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-iam-session-arn)

(clojure.core/declare ser-time-based-linear)

(clojure.core/declare ser-on-premises-tag-set)

(clojure.core/declare ser-deployment-wait-type)

(clojure.core/declare ser-target-group-info)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-auto-rollback-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AutoRollbackConfiguration", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "enabled", :shape "Boolean"})) (clojure.core/contains? input :events) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-events-list (input :events)) #:http.request.field{:name "events", :shape "AutoRollbackEventsList"}))))

(clojure.core/defn- ser-bundle-type [input] #:http.request.field{:value (clojure.core/get {:tar "tar", "YAML" "YAML", "tar" "tar", :tgz "tgz", "tgz" "tgz", :yaml "YAML", "JSON" "JSON", :zip "zip", :json "JSON", "zip" "zip"} input), :shape "BundleType"})

(clojure.core/defn- ser-auto-scaling-group-name [input] #:http.request.field{:value input, :shape "AutoScalingGroupName"})

(clojure.core/defn- ser-filter-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter-value coll) #:http.request.field{:shape "FilterValue"}))) input), :shape "FilterValueList", :type "list"})

(clojure.core/defn- ser-instance-action [input] #:http.request.field{:value (clojure.core/get {"TERMINATE" "TERMINATE", :terminate "TERMINATE", "KEEP_ALIVE" "KEEP_ALIVE", :keep-alive "KEEP_ALIVE"} input), :shape "InstanceAction"})

(clojure.core/defn- ser-deployment-config-name [input] #:http.request.field{:value input, :shape "DeploymentConfigName"})

(clojure.core/defn- ser-instance-id [input] #:http.request.field{:value input, :shape "InstanceId"})

(clojure.core/defn- ser-raw-string-content [input] #:http.request.field{:value input, :shape "RawStringContent"})

(clojure.core/defn- ser-ecs-service [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ECSService", :type "structure"} (clojure.core/contains? input :service-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ecs-service-name (input :service-name)) #:http.request.field{:name "serviceName", :shape "ECSServiceName"})) (clojure.core/contains? input :cluster-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ecs-cluster-name (input :cluster-name)) #:http.request.field{:name "clusterName", :shape "ECSClusterName"}))))

(clojure.core/defn- ser-trigger-event-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-trigger-event-type coll) #:http.request.field{:shape "TriggerEventType"}))) input), :shape "TriggerEventTypeList", :type "list"})

(clojure.core/defn- ser-elb-name [input] #:http.request.field{:value input, :shape "ELBName"})

(clojure.core/defn- ser-deployment-type [input] #:http.request.field{:value (clojure.core/get {"IN_PLACE" "IN_PLACE", :in-place "IN_PLACE", "BLUE_GREEN" "BLUE_GREEN", :blue-green "BLUE_GREEN"} input), :shape "DeploymentType"})

(clojure.core/defn- ser-git-hub-account-token-name [input] #:http.request.field{:value input, :shape "GitHubAccountTokenName"})

(clojure.core/defn- ser-target-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-id coll) #:http.request.field{:shape "TargetId"}))) input), :shape "TargetIdList", :type "list"})

(clojure.core/defn- ser-raw-string [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RawString", :type "structure", :deprecated true, :deprecated-message "RawString and String revision type are deprecated, use AppSpecContent type instead."} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-content (input :content)) #:http.request.field{:name "content", :shape "RawStringContent"})) (clojure.core/contains? input :sha-256) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-sha-256 (input :sha-256)) #:http.request.field{:name "sha256", :shape "RawStringSha256"}))))

(clojure.core/defn- ser-traffic-routing-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrafficRoutingConfig", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-routing-type (input :type)) #:http.request.field{:name "type", :shape "TrafficRoutingType"})) (clojure.core/contains? input :time-based-canary) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-based-canary (input :time-based-canary)) #:http.request.field{:name "timeBasedCanary", :shape "TimeBasedCanary"})) (clojure.core/contains? input :time-based-linear) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-time-based-linear (input :time-based-linear)) #:http.request.field{:name "timeBasedLinear", :shape "TimeBasedLinear"}))))

(clojure.core/defn- ser-elb-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ELBInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elb-name (input :name)) #:http.request.field{:name "name", :shape "ELBName"}))))

(clojure.core/defn- ser-wait-time-in-mins [input] #:http.request.field{:value input, :shape "WaitTimeInMins"})

(clojure.core/defn- ser-registration-status [input] #:http.request.field{:value (clojure.core/get {"Registered" "Registered", :registered "Registered", "Deregistered" "Deregistered", :deregistered "Deregistered"} input), :shape "RegistrationStatus"})

(clojure.core/defn- ser-version-id [input] #:http.request.field{:value input, :shape "VersionId"})

(clojure.core/defn- ser-elb-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-elb-info coll) #:http.request.field{:shape "ELBInfo"}))) input), :shape "ELBInfoList", :type "list"})

(clojure.core/defn- ser-listener-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-listener-arn coll) #:http.request.field{:shape "ListenerArn"}))) input), :shape "ListenerArnList", :type "list"})

(clojure.core/defn- ser-minimum-healthy-hosts [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MinimumHealthyHosts", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-healthy-hosts-value (input :value)) #:http.request.field{:name "value", :shape "MinimumHealthyHostsValue"})) (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-healthy-hosts-type (input :type)) #:http.request.field{:name "type", :shape "MinimumHealthyHostsType"}))))

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value (clojure.core/get {"Blue" "Blue", :blue "Blue", "Green" "Green", :green "Green"} input), :shape "InstanceType"})

(clojure.core/defn- ser-instance-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-type coll) #:http.request.field{:shape "InstanceType"}))) input), :shape "InstanceTypeList", :type "list"})

(clojure.core/defn- ser-time-based-canary [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeBasedCanary", :type "structure"} (clojure.core/contains? input :canary-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :canary-percentage)) #:http.request.field{:name "canaryPercentage", :shape "Percentage"})) (clojure.core/contains? input :canary-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wait-time-in-mins (input :canary-interval)) #:http.request.field{:name "canaryInterval", :shape "WaitTimeInMins"}))))

(clojure.core/defn- ser-minimum-healthy-hosts-value [input] #:http.request.field{:value input, :shape "MinimumHealthyHostsValue"})

(clojure.core/defn- ser-blue-instance-termination-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BlueInstanceTerminationOption", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-action (input :action)) #:http.request.field{:name "action", :shape "InstanceAction"})) (clojure.core/contains? input :termination-wait-time-in-minutes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-duration (input :termination-wait-time-in-minutes)) #:http.request.field{:name "terminationWaitTimeInMinutes", :shape "Duration"}))))

(clojure.core/defn- ser-repository [input] #:http.request.field{:value input, :shape "Repository"})

(clojure.core/defn- ser-revision-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RevisionLocation", :type "structure"} (clojure.core/contains? input :revision-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-location-type (input :revision-type)) #:http.request.field{:name "revisionType", :shape "RevisionLocationType"})) (clojure.core/contains? input :s-3-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-location (input :s-3-location)) #:http.request.field{:name "s3Location", :shape "S3Location"})) (clojure.core/contains? input :git-hub-location) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-hub-location (input :git-hub-location)) #:http.request.field{:name "gitHubLocation", :shape "GitHubLocation"})) (clojure.core/contains? input :string) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string (input :string)) #:http.request.field{:name "string", :shape "RawString"})) (clojure.core/contains? input :app-spec-content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-app-spec-content (input :app-spec-content)) #:http.request.field{:name "appSpecContent", :shape "AppSpecContent"}))))

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"ascending" "ascending", :ascending "ascending", "descending" "descending", :descending "descending"} input), :shape "SortOrder"})

(clojure.core/defn- ser-tag-filter-type [input] #:http.request.field{:value (clojure.core/get {"KEY_ONLY" "KEY_ONLY", :key-only "KEY_ONLY", "VALUE_ONLY" "VALUE_ONLY", :value-only "VALUE_ONLY", "KEY_AND_VALUE" "KEY_AND_VALUE", :key-and-value "KEY_AND_VALUE"} input), :shape "TagFilterType"})

(clojure.core/defn- ser-nullable-boolean [input] #:http.request.field{:value input, :shape "NullableBoolean"})

(clojure.core/defn- ser-compute-platform [input] #:http.request.field{:value (clojure.core/get {"Server" "Server", :server "Server", "Lambda" "Lambda", :lambda "Lambda", "ECS" "ECS", :ecs "ECS"} input), :shape "ComputePlatform"})

(clojure.core/defn- ser-green-fleet-provisioning-option [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GreenFleetProvisioningOption", :type "structure"} (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-green-fleet-provisioning-action (input :action)) #:http.request.field{:name "action", :shape "GreenFleetProvisioningAction"}))))

(clojure.core/defn- ser-load-balancer-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LoadBalancerInfo", :type "structure"} (clojure.core/contains? input :elb-info-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-elb-info-list (input :elb-info-list)) #:http.request.field{:name "elbInfoList", :shape "ELBInfoList"})) (clojure.core/contains? input :target-group-info-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-info-list (input :target-group-info-list)) #:http.request.field{:name "targetGroupInfoList", :shape "TargetGroupInfoList"})) (clojure.core/contains? input :target-group-pair-info-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-pair-info-list (input :target-group-pair-info-list)) #:http.request.field{:name "targetGroupPairInfoList", :shape "TargetGroupPairInfoList"}))))

(clojure.core/defn- ser-revision-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-revision-location coll) #:http.request.field{:shape "RevisionLocation"}))) input), :shape "RevisionLocationList", :type "list"})

(clojure.core/defn- ser-app-spec-content [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AppSpecContent", :type "structure"} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-content (input :content)) #:http.request.field{:name "content", :shape "RawStringContent"})) (clojure.core/contains? input :sha-256) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-raw-string-sha-256 (input :sha-256)) #:http.request.field{:name "sha256", :shape "RawStringSha256"}))))

(clojure.core/defn- ser-deployment-group-name [input] #:http.request.field{:value input, :shape "DeploymentGroupName"})

(clojure.core/defn- ser-target-group-pair-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGroupPairInfo", :type "structure"} (clojure.core/contains? input :target-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-info-list (input :target-groups)) #:http.request.field{:name "targetGroups", :shape "TargetGroupInfoList"})) (clojure.core/contains? input :prod-traffic-route) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-route (input :prod-traffic-route)) #:http.request.field{:name "prodTrafficRoute", :shape "TrafficRoute"})) (clojure.core/contains? input :test-traffic-route) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-traffic-route (input :test-traffic-route)) #:http.request.field{:name "testTrafficRoute", :shape "TrafficRoute"}))))

(clojure.core/defn- ser-file-exists-behavior [input] #:http.request.field{:value (clojure.core/get {"DISALLOW" "DISALLOW", :disallow "DISALLOW", "OVERWRITE" "OVERWRITE", :overwrite "OVERWRITE", "RETAIN" "RETAIN", :retain "RETAIN"} input), :shape "FileExistsBehavior"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-instance-status-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-status coll) #:http.request.field{:shape "InstanceStatus"}))) input), :shape "InstanceStatusList", :type "list"})

(clojure.core/defn- ser-e-tag [input] #:http.request.field{:value input, :shape "ETag"})

(clojure.core/defn- ser-lifecycle-event-hook-execution-id [input] #:http.request.field{:value input, :shape "LifecycleEventHookExecutionId"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- ser-commit-id [input] #:http.request.field{:value input, :shape "CommitId"})

(clojure.core/defn- ser-target-group-name [input] #:http.request.field{:value input, :shape "TargetGroupName"})

(clojure.core/defn- ser-ecs-service-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ecs-service coll) #:http.request.field{:shape "ECSService"}))) input), :shape "ECSServiceList", :type "list"})

(clojure.core/defn- ser-trigger-event-type [input] #:http.request.field{:value (clojure.core/get {:instance-start "InstanceStart", :deployment-rollback "DeploymentRollback", :deployment-stop "DeploymentStop", "DeploymentReady" "DeploymentReady", "InstanceSuccess" "InstanceSuccess", "InstanceFailure" "InstanceFailure", "DeploymentRollback" "DeploymentRollback", :instance-ready "InstanceReady", "DeploymentStop" "DeploymentStop", :instance-success "InstanceSuccess", :instance-failure "InstanceFailure", :deployment-ready "DeploymentReady", "InstanceReady" "InstanceReady", "DeploymentSuccess" "DeploymentSuccess", "DeploymentFailure" "DeploymentFailure", :deployment-failure "DeploymentFailure", :deployment-success "DeploymentSuccess", :deployment-start "DeploymentStart", "InstanceStart" "InstanceStart", "DeploymentStart" "DeploymentStart"} input), :shape "TriggerEventType"})

(clojure.core/defn- ser-deployment-style [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeploymentStyle", :type "structure"} (clojure.core/contains? input :deployment-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-type (input :deployment-type)) #:http.request.field{:name "deploymentType", :shape "DeploymentType"})) (clojure.core/contains? input :deployment-option) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-option (input :deployment-option)) #:http.request.field{:name "deploymentOption", :shape "DeploymentOption"}))))

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-application-revision-sort-by [input] #:http.request.field{:value (clojure.core/get {"registerTime" "registerTime", :register-time "registerTime", "firstUsedTime" "firstUsedTime", :first-used-time "firstUsedTime", "lastUsedTime" "lastUsedTime", :last-used-time "lastUsedTime"} input), :shape "ApplicationRevisionSortBy"})

(clojure.core/defn- ser-instance-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-instance-name coll) #:http.request.field{:shape "InstanceName"}))) input), :shape "InstanceNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-ecs-cluster-name [input] #:http.request.field{:value input, :shape "ECSClusterName"})

(clojure.core/defn- ser-green-fleet-provisioning-action [input] #:http.request.field{:value (clojure.core/get {"DISCOVER_EXISTING" "DISCOVER_EXISTING", :discover-existing "DISCOVER_EXISTING", "COPY_AUTO_SCALING_GROUP" "COPY_AUTO_SCALING_GROUP", :copy-auto-scaling-group "COPY_AUTO_SCALING_GROUP"} input), :shape "GreenFleetProvisioningAction"})

(clojure.core/defn- ser-trigger-target-arn [input] #:http.request.field{:value input, :shape "TriggerTargetArn"})

(clojure.core/defn- ser-instance-name [input] #:http.request.field{:value input, :shape "InstanceName"})

(clojure.core/defn- ser-target-filter-name [input] #:http.request.field{:value (clojure.core/get {"TargetStatus" "TargetStatus", :target-status "TargetStatus", "ServerInstanceLabel" "ServerInstanceLabel", :server-instance-label "ServerInstanceLabel"} input), :shape "TargetFilterName"})

(clojure.core/defn- ser-alarm-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-alarm coll) #:http.request.field{:shape "Alarm"}))) input), :shape "AlarmList", :type "list"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-auto-rollback-events-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-auto-rollback-event coll) #:http.request.field{:shape "AutoRollbackEvent"}))) input), :shape "AutoRollbackEventsList", :type "list"})

(clojure.core/defn- ser-traffic-route [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TrafficRoute", :type "structure"} (clojure.core/contains? input :listener-arns) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-listener-arn-list (input :listener-arns)) #:http.request.field{:name "listenerArns", :shape "ListenerArnList"}))))

(clojure.core/defn- ser-trigger-name [input] #:http.request.field{:value input, :shape "TriggerName"})

(clojure.core/defn- ser-listener-arn [input] #:http.request.field{:value input, :shape "ListenerArn"})

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

(clojure.core/defn- ser-revision-location-type [input] #:http.request.field{:value (clojure.core/get {"S3" "S3", :s-3 "S3", "GitHub" "GitHub", :git-hub "GitHub", "String" "String", :string "String", "AppSpecContent" "AppSpecContent", :app-spec-content "AppSpecContent"} input), :shape "RevisionLocationType"})

(clojure.core/defn- ser-target-group-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-info coll) #:http.request.field{:shape "TargetGroupInfo"}))) input), :shape "TargetGroupInfoList", :type "list"})

(clojure.core/defn- ser-on-premises-tag-set-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter-list coll) #:http.request.field{:shape "TagFilterList"}))) input), :shape "OnPremisesTagSetList", :type "list"})

(clojure.core/defn- ser-ecs-service-name [input] #:http.request.field{:value input, :shape "ECSServiceName"})

(clojure.core/defn- ser-target-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-target-filter-name k) #:http.request.field{:map-info "key", :shape "TargetFilterName"}) (clojure.core/into (ser-filter-value-list v) #:http.request.field{:map-info "value", :shape "FilterValueList"})])) input), :shape "TargetFilters", :type "map"})

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

(clojure.core/defn- ser-target-group-pair-info-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-group-pair-info coll) #:http.request.field{:shape "TargetGroupPairInfo"}))) input), :shape "TargetGroupPairInfoList", :type "list"})

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

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-iam-session-arn [input] #:http.request.field{:value input, :shape "IamSessionArn"})

(clojure.core/defn- ser-time-based-linear [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TimeBasedLinear", :type "structure"} (clojure.core/contains? input :linear-percentage) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percentage (input :linear-percentage)) #:http.request.field{:name "linearPercentage", :shape "Percentage"})) (clojure.core/contains? input :linear-interval) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-wait-time-in-mins (input :linear-interval)) #:http.request.field{:name "linearInterval", :shape "WaitTimeInMins"}))))

(clojure.core/defn- ser-on-premises-tag-set [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OnPremisesTagSet", :type "structure"} (clojure.core/contains? input :on-premises-tag-set-list) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set-list (input :on-premises-tag-set-list)) #:http.request.field{:name "onPremisesTagSetList", :shape "OnPremisesTagSetList"}))))

(clojure.core/defn- ser-deployment-wait-type [input] #:http.request.field{:value (clojure.core/get {"READY_WAIT" "READY_WAIT", :ready-wait "READY_WAIT", "TERMINATION_WAIT" "TERMINATION_WAIT", :termination-wait "TERMINATION_WAIT"} input), :shape "DeploymentWaitType"})

(clojure.core/defn- ser-target-group-info [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TargetGroupInfo", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-name (input :name)) #:http.request.field{:name "name", :shape "TargetGroupName"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :target-instances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-instances (input :target-instances)) #:http.request.field{:name "targetInstances", :shape "TargetInstances"})) (clojure.core/contains? input :file-exists-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-exists-behavior (input :file-exists-behavior)) #:http.request.field{:name "fileExistsBehavior", :shape "FileExistsBehavior"})) (clojure.core/contains? input :ignore-application-stop-failures) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :ignore-application-stop-failures)) #:http.request.field{:name "ignoreApplicationStopFailures", :shape "Boolean"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :revision) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})) (clojure.core/contains? input :update-outdated-instances-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :update-outdated-instances-only)) #:http.request.field{:name "updateOutdatedInstancesOnly", :shape "Boolean"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-stop-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})]} (clojure.core/contains? input :auto-rollback-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nullable-boolean (input :auto-rollback-enabled)) #:http.request.field{:name "autoRollbackEnabled", :shape "NullableBoolean"}))))

(clojure.core/defn- req-create-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"}) (clojure.core/into (ser-role (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "Role"})]} (clojure.core/contains? input :ec-2-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set (input :ec-2-tag-set)) #:http.request.field{:name "ec2TagSet", :shape "EC2TagSet"})) (clojure.core/contains? input :blue-green-deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blue-green-deployment-configuration (input :blue-green-deployment-configuration)) #:http.request.field{:name "blueGreenDeploymentConfiguration", :shape "BlueGreenDeploymentConfiguration"})) (clojure.core/contains? input :on-premises-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set (input :on-premises-tag-set)) #:http.request.field{:name "onPremisesTagSet", :shape "OnPremisesTagSet"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :ec-2-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-list (input :ec-2-tag-filters)) #:http.request.field{:name "ec2TagFilters", :shape "EC2TagFilterList"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-style) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-style (input :deployment-style)) #:http.request.field{:name "deploymentStyle", :shape "DeploymentStyle"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-name-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupNameList"})) (clojure.core/contains? input :trigger-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-config-list (input :trigger-configurations)) #:http.request.field{:name "triggerConfigurations", :shape "TriggerConfigList"})) (clojure.core/contains? input :load-balancer-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-info (input :load-balancer-info)) #:http.request.field{:name "loadBalancerInfo", :shape "LoadBalancerInfo"})) (clojure.core/contains? input :alarm-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-configuration (input :alarm-configuration)) #:http.request.field{:name "alarmConfiguration", :shape "AlarmConfiguration"})) (clojure.core/contains? input :on-premises-instance-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :on-premises-instance-tag-filters)) #:http.request.field{:name "onPremisesInstanceTagFilters", :shape "TagFilterList"})) (clojure.core/contains? input :ecs-services) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ecs-service-list (input :ecs-services)) #:http.request.field{:name "ecsServices", :shape "ECSServiceList"}))))

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

(clojure.core/defn- req-list-deployment-targets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :target-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-filters (input :target-filters)) #:http.request.field{:name "targetFilters", :shape "TargetFilters"}))))

(clojure.core/defn- req-batch-get-deployment-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-groups-list (input :deployment-group-names)) #:http.request.field{:name "deploymentGroupNames", :shape "DeploymentGroupsList"})]}))

(clojure.core/defn- req-delete-deployment-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})]}))

(clojure.core/defn- req-register-application-revision-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-add-tags-to-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}) (clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-register-on-premises-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "InstanceName"})]} (clojure.core/contains? input :iam-session-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-session-arn (input :iam-session-arn)) #:http.request.field{:name "iamSessionArn", :shape "IamSessionArn"})) (clojure.core/contains? input :iam-user-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-user-arn (input :iam-user-arn)) #:http.request.field{:name "iamUserArn", :shape "IamUserArn"}))))

(clojure.core/defn- req-batch-get-applications-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-applications-list (input :application-names)) #:http.request.field{:name "applicationNames", :shape "ApplicationsList"})]}))

(clojure.core/defn- req-batch-get-deployment-targets-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :target-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-id-list (input :target-ids)) #:http.request.field{:name "targetIds", :shape "TargetIdList"}))))

(clojure.core/defn- req-get-deployment-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})]}))

(clojure.core/defn- req-get-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})]}))

(clojure.core/defn- req-batch-get-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-batch-get-deployments-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployments-list (input :deployment-ids)) #:http.request.field{:name "deploymentIds", :shape "DeploymentsList"})]}))

(clojure.core/defn- req-list-git-hub-account-token-names-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-application-revision-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location (input :revision)) #:http.request.field{:name "revision", :shape "RevisionLocation"})]}))

(clojure.core/defn- req-list-applications-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-update-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :current-deployment-group-name)) #:http.request.field{:name "currentDeploymentGroupName", :shape "DeploymentGroupName"})]} (clojure.core/contains? input :ec-2-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-set (input :ec-2-tag-set)) #:http.request.field{:name "ec2TagSet", :shape "EC2TagSet"})) (clojure.core/contains? input :blue-green-deployment-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blue-green-deployment-configuration (input :blue-green-deployment-configuration)) #:http.request.field{:name "blueGreenDeploymentConfiguration", :shape "BlueGreenDeploymentConfiguration"})) (clojure.core/contains? input :on-premises-tag-set) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-premises-tag-set (input :on-premises-tag-set)) #:http.request.field{:name "onPremisesTagSet", :shape "OnPremisesTagSet"})) (clojure.core/contains? input :deployment-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-config-name (input :deployment-config-name)) #:http.request.field{:name "deploymentConfigName", :shape "DeploymentConfigName"})) (clojure.core/contains? input :ec-2-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ec-2-tag-filter-list (input :ec-2-tag-filters)) #:http.request.field{:name "ec2TagFilters", :shape "EC2TagFilterList"})) (clojure.core/contains? input :new-deployment-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-group-name (input :new-deployment-group-name)) #:http.request.field{:name "newDeploymentGroupName", :shape "DeploymentGroupName"})) (clojure.core/contains? input :auto-rollback-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-rollback-configuration (input :auto-rollback-configuration)) #:http.request.field{:name "autoRollbackConfiguration", :shape "AutoRollbackConfiguration"})) (clojure.core/contains? input :deployment-style) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-style (input :deployment-style)) #:http.request.field{:name "deploymentStyle", :shape "DeploymentStyle"})) (clojure.core/contains? input :auto-scaling-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-name-list (input :auto-scaling-groups)) #:http.request.field{:name "autoScalingGroups", :shape "AutoScalingGroupNameList"})) (clojure.core/contains? input :trigger-configurations) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-trigger-config-list (input :trigger-configurations)) #:http.request.field{:name "triggerConfigurations", :shape "TriggerConfigList"})) (clojure.core/contains? input :service-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role (input :service-role-arn)) #:http.request.field{:name "serviceRoleArn", :shape "Role"})) (clojure.core/contains? input :load-balancer-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-info (input :load-balancer-info)) #:http.request.field{:name "loadBalancerInfo", :shape "LoadBalancerInfo"})) (clojure.core/contains? input :alarm-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alarm-configuration (input :alarm-configuration)) #:http.request.field{:name "alarmConfiguration", :shape "AlarmConfiguration"})) (clojure.core/contains? input :on-premises-instance-tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filter-list (input :on-premises-instance-tag-filters)) #:http.request.field{:name "onPremisesInstanceTagFilters", :shape "TagFilterList"})) (clojure.core/contains? input :ecs-services) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ecs-service-list (input :ecs-services)) #:http.request.field{:name "ecsServices", :shape "ECSServiceList"}))))

(clojure.core/defn- req-list-deployment-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-remove-tags-from-on-premises-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}) (clojure.core/into (ser-instance-name-list (input :instance-names)) #:http.request.field{:name "instanceNames", :shape "InstanceNameList"})]}))

(clojure.core/defn- req-update-application-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})) (clojure.core/contains? input :new-application-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-name (input :new-application-name)) #:http.request.field{:name "newApplicationName", :shape "ApplicationName"}))))

(clojure.core/defn- req-list-application-revisions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-revision-sort-by (input :sort-by)) #:http.request.field{:name "sortBy", :shape "ApplicationRevisionSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "sortOrder", :shape "SortOrder"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "s3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key-prefix)) #:http.request.field{:name "s3KeyPrefix", :shape "S3Key"})) (clojure.core/contains? input :deployed) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-state-filter-action (input :deployed)) #:http.request.field{:name "deployed", :shape "ListStateFilterAction"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-put-lifecycle-event-hook-execution-status-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :lifecycle-event-hook-execution-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-hook-execution-id (input :lifecycle-event-hook-execution-id)) #:http.request.field{:name "lifecycleEventHookExecutionId", :shape "LifecycleEventHookExecutionId"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-event-status (input :status)) #:http.request.field{:name "status", :shape "LifecycleEventStatus"}))))

(clojure.core/defn- req-get-on-premises-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-name (input :instance-name)) #:http.request.field{:name "instanceName", :shape "InstanceName"})]}))

(clojure.core/defn- req-batch-get-deployment-instances-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}) (clojure.core/into (ser-instances-list (input :instance-ids)) #:http.request.field{:name "instanceIds", :shape "InstancesList"})]}))

(clojure.core/defn- req-continue-deployment-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :deployment-wait-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-wait-type (input :deployment-wait-type)) #:http.request.field{:name "deploymentWaitType", :shape "DeploymentWaitType"}))))

(clojure.core/defn- req-delete-application-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]}))

(clojure.core/defn- req-list-deployment-groups-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-delete-deployment-group-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-deployment-group-name (input :deployment-group-name)) #:http.request.field{:name "deploymentGroupName", :shape "DeploymentGroupName"})]}))

(clojure.core/defn- req-get-deployment-target-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :deployment-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"})) (clojure.core/contains? input :target-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-id (input :target-id)) #:http.request.field{:name "targetId", :shape "TargetId"}))))

(clojure.core/defn- req-get-deployment-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-deployment-id (input :deployment-id)) #:http.request.field{:name "deploymentId", :shape "DeploymentId"}) (clojure.core/into (ser-instance-id (input :instance-id)) #:http.request.field{:name "instanceId", :shape "InstanceId"})]}))

(clojure.core/defn- req-batch-get-application-revisions-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-application-name (input :application-name)) #:http.request.field{:name "applicationName", :shape "ApplicationName"}) (clojure.core/into (ser-revision-location-list (input :revisions)) #:http.request.field{:name "revisions", :shape "RevisionLocationList"})]}))

(clojure.core/declare deser-auto-rollback-configuration)

(clojure.core/declare deser-bundle-type)

(clojure.core/declare deser-auto-scaling-group-name)

(clojure.core/declare deser-deployment-group-info)

(clojure.core/declare deser-target-label)

(clojure.core/declare deser-ecs-task-set)

(clojure.core/declare deser-deployment-info)

(clojure.core/declare deser-traffic-weight)

(clojure.core/declare deser-deployment-target-type)

(clojure.core/declare deser-instance-action)

(clojure.core/declare deser-deployment-config-name)

(clojure.core/declare deser-instance-id)

(clojure.core/declare deser-lifecycle-message)

(clojure.core/declare deser-raw-string-content)

(clojure.core/declare deser-instance-info-list)

(clojure.core/declare deser-ecs-service)

(clojure.core/declare deser-trigger-event-type-list)

(clojure.core/declare deser-instance-summary-list)

(clojure.core/declare deser-deployment-status-message-list)

(clojure.core/declare deser-elb-name)

(clojure.core/declare deser-deployment-type)

(clojure.core/declare deser-git-hub-account-token-name)

(clojure.core/declare deser-target-id-list)

(clojure.core/declare deser-raw-string)

(clojure.core/declare deser-traffic-routing-config)

(clojure.core/declare deser-application-info)

(clojure.core/declare deser-deployment-config-info)

(clojure.core/declare deser-elb-info)

(clojure.core/declare deser-instance-count)

(clojure.core/declare deser-wait-time-in-mins)

(clojure.core/declare deser-version-id)

(clojure.core/declare deser-rollback-info)

(clojure.core/declare deser-elb-info-list)

(clojure.core/declare deser-listener-arn-list)

(clojure.core/declare deser-minimum-healthy-hosts)

(clojure.core/declare deser-ecs-target)

(clojure.core/declare deser-instance-type)

(clojure.core/declare deser-time-based-canary)

(clojure.core/declare deser-minimum-healthy-hosts-value)

(clojure.core/declare deser-target-arn)

(clojure.core/declare deser-blue-instance-termination-option)

(clojure.core/declare deser-auto-scaling-group-hook)

(clojure.core/declare deser-repository)

(clojure.core/declare deser-lifecycle-event)

(clojure.core/declare deser-revision-location)

(clojure.core/declare deser-tag-filter-type)

(clojure.core/declare deser-lambda-target)

(clojure.core/declare deser-log-tail)

(clojure.core/declare deser-deployment-overview)

(clojure.core/declare deser-diagnostics)

(clojure.core/declare deser-auto-scaling-group-list)

(clojure.core/declare deser-compute-platform)

(clojure.core/declare deser-green-fleet-provisioning-option)

(clojure.core/declare deser-load-balancer-info)

(clojure.core/declare deser-revision-location-list)

(clojure.core/declare deser-app-spec-content)

(clojure.core/declare deser-deployment-group-name)

(clojure.core/declare deser-target-group-pair-info)

(clojure.core/declare deser-file-exists-behavior)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-git-hub-account-token-name-list)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-e-tag)

(clojure.core/declare deser-additional-deployment-status-info)

(clojure.core/declare deser-lifecycle-event-hook-execution-id)

(clojure.core/declare deser-key)

(clojure.core/declare deser-commit-id)

(clojure.core/declare deser-target-group-name)

(clojure.core/declare deser-ecs-service-list)

(clojure.core/declare deser-trigger-event-type)

(clojure.core/declare deser-deployment-style)

(clojure.core/declare deser-last-deployment-info)

(clojure.core/declare deser-role)

(clojure.core/declare deser-instance-name-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-ecs-cluster-name)

(clojure.core/declare deser-green-fleet-provisioning-action)

(clojure.core/declare deser-trigger-target-arn)

(clojure.core/declare deser-instance-name)

(clojure.core/declare deser-ecs-task-set-list)

(clojure.core/declare deser-alarm-list)

(clojure.core/declare deser-target-id)

(clojure.core/declare deser-auto-rollback-events-list)

(clojure.core/declare deser-traffic-route)

(clojure.core/declare deser-trigger-name)

(clojure.core/declare deser-deployment-target-list)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-application-id)

(clojure.core/declare deser-applications-info-list)

(clojure.core/declare deser-listener-arn)

(clojure.core/declare deser-ecs-task-set-status)

(clojure.core/declare deser-alarm-configuration)

(clojure.core/declare deser-target-instances)

(clojure.core/declare deser-deployment-config-id)

(clojure.core/declare deser-value)

(clojure.core/declare deser-trigger-config)

(clojure.core/declare deser-deployment-option)

(clojure.core/declare deser-auto-rollback-event)

(clojure.core/declare deser-description)

(clojure.core/declare deser-ec-2-tag-filter-type)

(clojure.core/declare deser-minimum-healthy-hosts-type)

(clojure.core/declare deser-auto-scaling-group-name-list)

(clojure.core/declare deser-deployment-id)

(clojure.core/declare deser-message)

(clojure.core/declare deser-auto-scaling-group)

(clojure.core/declare deser-application-name)

(clojure.core/declare deser-duration)

(clojure.core/declare deser-revision-location-type)

(clojure.core/declare deser-target-group-info-list)

(clojure.core/declare deser-instance-summary)

(clojure.core/declare deser-deployment-configs-list)

(clojure.core/declare deser-on-premises-tag-set-list)

(clojure.core/declare deser-ecs-service-name)

(clojure.core/declare deser-script-name)

(clojure.core/declare deser-deployment-group-id)

(clojure.core/declare deser-deployment-creator)

(clojure.core/declare deser-revision-info-list)

(clojure.core/declare deser-percentage)

(clojure.core/declare deser-alarm-name)

(clojure.core/declare deser-deployment-groups-list)

(clojure.core/declare deser-instance-target)

(clojure.core/declare deser-s-3-key)

(clojure.core/declare deser-deployment-ready-action)

(clojure.core/declare deser-git-hub-location)

(clojure.core/declare deser-s-3-location)

(clojure.core/declare deser-tag-filter)

(clojure.core/declare deser-ec-2-tag-filter-list)

(clojure.core/declare deser-instances-list)

(clojure.core/declare deser-s-3-bucket)

(clojure.core/declare deser-generic-revision-info)

(clojure.core/declare deser-deployments-list)

(clojure.core/declare deser-deployment-target)

(clojure.core/declare deser-lifecycle-event-list)

(clojure.core/declare deser-tag-filter-list)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-deployment-status)

(clojure.core/declare deser-ec-2-tag-set-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-alarm)

(clojure.core/declare deser-ec-2-tag-filter)

(clojure.core/declare deser-target-status)

(clojure.core/declare deser-lifecycle-event-name)

(clojure.core/declare deser-target-group-pair-info-list)

(clojure.core/declare deser-instance-status)

(clojure.core/declare deser-trigger-config-list)

(clojure.core/declare deser-lifecycle-error-code)

(clojure.core/declare deser-blue-green-deployment-configuration)

(clojure.core/declare deser-lifecycle-event-status)

(clojure.core/declare deser-traffic-routing-type)

(clojure.core/declare deser-deployments-info-list)

(clojure.core/declare deser-raw-string-sha-256)

(clojure.core/declare deser-iam-user-arn)

(clojure.core/declare deser-error-information)

(clojure.core/declare deser-stop-status)

(clojure.core/declare deser-revision-info)

(clojure.core/declare deser-deployment-ready-option)

(clojure.core/declare deser-applications-list)

(clojure.core/declare deser-ec-2-tag-set)

(clojure.core/declare deser-time)

(clojure.core/declare deser-iam-session-arn)

(clojure.core/declare deser-ecs-task-set-count)

(clojure.core/declare deser-time-based-linear)

(clojure.core/declare deser-ecs-task-set-identifier)

(clojure.core/declare deser-on-premises-tag-set)

(clojure.core/declare deser-instance-info)

(clojure.core/declare deser-target-group-info)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-instance-arn)

(clojure.core/declare deser-deployment-group-info-list)

(clojure.core/defn- deser-auto-rollback-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "enabled") (clojure.core/assoc :enabled (deser-boolean (input "enabled"))) (clojure.core/contains? input "events") (clojure.core/assoc :events (deser-auto-rollback-events-list (input "events")))))

(clojure.core/defn- deser-bundle-type [input] (clojure.core/get {"tar" :tar, "tgz" :tgz, "zip" :zip, "YAML" :yaml, "JSON" :json} input))

(clojure.core/defn- deser-auto-scaling-group-name [input] input)

(clojure.core/defn- deser-deployment-group-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "computePlatform") (clojure.core/assoc :compute-platform (deser-compute-platform (input "computePlatform"))) (clojure.core/contains? input "ec2TagSet") (clojure.core/assoc :ec-2-tag-set (deser-ec-2-tag-set (input "ec2TagSet"))) (clojure.core/contains? input "lastSuccessfulDeployment") (clojure.core/assoc :last-successful-deployment (deser-last-deployment-info (input "lastSuccessfulDeployment"))) (clojure.core/contains? input "lastAttemptedDeployment") (clojure.core/assoc :last-attempted-deployment (deser-last-deployment-info (input "lastAttemptedDeployment"))) (clojure.core/contains? input "blueGreenDeploymentConfiguration") (clojure.core/assoc :blue-green-deployment-configuration (deser-blue-green-deployment-configuration (input "blueGreenDeploymentConfiguration"))) (clojure.core/contains? input "onPremisesTagSet") (clojure.core/assoc :on-premises-tag-set (deser-on-premises-tag-set (input "onPremisesTagSet"))) (clojure.core/contains? input "applicationName") (clojure.core/assoc :application-name (deser-application-name (input "applicationName"))) (clojure.core/contains? input "deploymentConfigName") (clojure.core/assoc :deployment-config-name (deser-deployment-config-name (input "deploymentConfigName"))) (clojure.core/contains? input "ec2TagFilters") (clojure.core/assoc :ec-2-tag-filters (deser-ec-2-tag-filter-list (input "ec2TagFilters"))) (clojure.core/contains? input "autoRollbackConfiguration") (clojure.core/assoc :auto-rollback-configuration (deser-auto-rollback-configuration (input "autoRollbackConfiguration"))) (clojure.core/contains? input "deploymentStyle") (clojure.core/assoc :deployment-style (deser-deployment-style (input "deploymentStyle"))) (clojure.core/contains? input "autoScalingGroups") (clojure.core/assoc :auto-scaling-groups (deser-auto-scaling-group-list (input "autoScalingGroups"))) (clojure.core/contains? input "triggerConfigurations") (clojure.core/assoc :trigger-configurations (deser-trigger-config-list (input "triggerConfigurations"))) (clojure.core/contains? input "deploymentGroupName") (clojure.core/assoc :deployment-group-name (deser-deployment-group-name (input "deploymentGroupName"))) (clojure.core/contains? input "serviceRoleArn") (clojure.core/assoc :service-role-arn (deser-role (input "serviceRoleArn"))) (clojure.core/contains? input "loadBalancerInfo") (clojure.core/assoc :load-balancer-info (deser-load-balancer-info (input "loadBalancerInfo"))) (clojure.core/contains? input "alarmConfiguration") (clojure.core/assoc :alarm-configuration (deser-alarm-configuration (input "alarmConfiguration"))) (clojure.core/contains? input "onPremisesInstanceTagFilters") (clojure.core/assoc :on-premises-instance-tag-filters (deser-tag-filter-list (input "onPremisesInstanceTagFilters"))) (clojure.core/contains? input "deploymentGroupId") (clojure.core/assoc :deployment-group-id (deser-deployment-group-id (input "deploymentGroupId"))) (clojure.core/contains? input "targetRevision") (clojure.core/assoc :target-revision (deser-revision-location (input "targetRevision"))) (clojure.core/contains? input "ecsServices") (clojure.core/assoc :ecs-services (deser-ecs-service-list (input "ecsServices")))))

(clojure.core/defn- deser-target-label [input] (clojure.core/get {"Blue" :blue, "Green" :green} input))

(clojure.core/defn- deser-ecs-task-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "identifer") (clojure.core/assoc :identifer (deser-ecs-task-set-identifier (input "identifer"))) (clojure.core/contains? input "desiredCount") (clojure.core/assoc :desired-count (deser-ecs-task-set-count (input "desiredCount"))) (clojure.core/contains? input "pendingCount") (clojure.core/assoc :pending-count (deser-ecs-task-set-count (input "pendingCount"))) (clojure.core/contains? input "runningCount") (clojure.core/assoc :running-count (deser-ecs-task-set-count (input "runningCount"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-ecs-task-set-status (input "status"))) (clojure.core/contains? input "trafficWeight") (clojure.core/assoc :traffic-weight (deser-traffic-weight (input "trafficWeight"))) (clojure.core/contains? input "targetGroup") (clojure.core/assoc :target-group (deser-target-group-info (input "targetGroup"))) (clojure.core/contains? input "taskSetLabel") (clojure.core/assoc :task-set-label (deser-target-label (input "taskSetLabel")))))

(clojure.core/defn- deser-deployment-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "targetInstances") (clojure.core/assoc :target-instances (deser-target-instances (input "targetInstances"))) (clojure.core/contains? input "errorInformation") (clojure.core/assoc :error-information (deser-error-information (input "errorInformation"))) (clojure.core/contains? input "computePlatform") (clojure.core/assoc :compute-platform (deser-compute-platform (input "computePlatform"))) (clojure.core/contains? input "fileExistsBehavior") (clojure.core/assoc :file-exists-behavior (deser-file-exists-behavior (input "fileExistsBehavior"))) (clojure.core/contains? input "ignoreApplicationStopFailures") (clojure.core/assoc :ignore-application-stop-failures (deser-boolean (input "ignoreApplicationStopFailures"))) (clojure.core/contains? input "completeTime") (clojure.core/assoc :complete-time (deser-timestamp (input "completeTime"))) (clojure.core/contains? input "blueGreenDeploymentConfiguration") (clojure.core/assoc :blue-green-deployment-configuration (deser-blue-green-deployment-configuration (input "blueGreenDeploymentConfiguration"))) (clojure.core/contains? input "previousRevision") (clojure.core/assoc :previous-revision (deser-revision-location (input "previousRevision"))) (clojure.core/contains? input "deploymentStatusMessages") (clojure.core/assoc :deployment-status-messages (deser-deployment-status-message-list (input "deploymentStatusMessages"))) (clojure.core/contains? input "applicationName") (clojure.core/assoc :application-name (deser-application-name (input "applicationName"))) (clojure.core/contains? input "deploymentConfigName") (clojure.core/assoc :deployment-config-name (deser-deployment-config-name (input "deploymentConfigName"))) (clojure.core/contains? input "revision") (clojure.core/assoc :revision (deser-revision-location (input "revision"))) (clojure.core/contains? input "updateOutdatedInstancesOnly") (clojure.core/assoc :update-outdated-instances-only (deser-boolean (input "updateOutdatedInstancesOnly"))) (clojure.core/contains? input "autoRollbackConfiguration") (clojure.core/assoc :auto-rollback-configuration (deser-auto-rollback-configuration (input "autoRollbackConfiguration"))) (clojure.core/contains? input "creator") (clojure.core/assoc :creator (deser-deployment-creator (input "creator"))) (clojure.core/contains? input "deploymentStyle") (clojure.core/assoc :deployment-style (deser-deployment-style (input "deploymentStyle"))) (clojure.core/contains? input "createTime") (clojure.core/assoc :create-time (deser-timestamp (input "createTime"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-deployment-status (input "status"))) (clojure.core/contains? input "deploymentGroupName") (clojure.core/assoc :deployment-group-name (deser-deployment-group-name (input "deploymentGroupName"))) (clojure.core/contains? input "additionalDeploymentStatusInfo") (clojure.core/assoc :additional-deployment-status-info (deser-additional-deployment-status-info (input "additionalDeploymentStatusInfo"))) (clojure.core/contains? input "loadBalancerInfo") (clojure.core/assoc :load-balancer-info (deser-load-balancer-info (input "loadBalancerInfo"))) (clojure.core/contains? input "instanceTerminationWaitTimeStarted") (clojure.core/assoc :instance-termination-wait-time-started (deser-boolean (input "instanceTerminationWaitTimeStarted"))) (clojure.core/contains? input "rollbackInfo") (clojure.core/assoc :rollback-info (deser-rollback-info (input "rollbackInfo"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "deploymentOverview") (clojure.core/assoc :deployment-overview (deser-deployment-overview (input "deploymentOverview")))))

(clojure.core/defn- deser-traffic-weight [input] input)

(clojure.core/defn- deser-deployment-target-type [input] (clojure.core/get {"InstanceTarget" :instance-target, "LambdaTarget" :lambda-target, "ECSTarget" :ecs-target} input))

(clojure.core/defn- deser-instance-action [input] (clojure.core/get {"TERMINATE" :terminate, "KEEP_ALIVE" :keep-alive} input))

(clojure.core/defn- deser-deployment-config-name [input] input)

(clojure.core/defn- deser-instance-id [input] input)

(clojure.core/defn- deser-lifecycle-message [input] input)

(clojure.core/defn- deser-raw-string-content [input] input)

(clojure.core/defn- deser-instance-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-info coll))) input))

(clojure.core/defn- deser-ecs-service [input] (clojure.core/cond-> {} (clojure.core/contains? input "serviceName") (clojure.core/assoc :service-name (deser-ecs-service-name (input "serviceName"))) (clojure.core/contains? input "clusterName") (clojure.core/assoc :cluster-name (deser-ecs-cluster-name (input "clusterName")))))

(clojure.core/defn- deser-trigger-event-type-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trigger-event-type coll))) input))

(clojure.core/defn- deser-instance-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-summary coll))) input))

(clojure.core/defn- deser-deployment-status-message-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-error-message coll))) input))

(clojure.core/defn- deser-elb-name [input] input)

(clojure.core/defn- deser-deployment-type [input] (clojure.core/get {"IN_PLACE" :in-place, "BLUE_GREEN" :blue-green} input))

(clojure.core/defn- deser-git-hub-account-token-name [input] input)

(clojure.core/defn- deser-target-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-id coll))) input))

(clojure.core/defn- deser-raw-string [input] (clojure.core/cond-> {} (clojure.core/contains? input "content") (clojure.core/assoc :content (deser-raw-string-content (input "content"))) (clojure.core/contains? input "sha256") (clojure.core/assoc :sha-256 (deser-raw-string-sha-256 (input "sha256")))))

(clojure.core/defn- deser-traffic-routing-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-traffic-routing-type (input "type"))) (clojure.core/contains? input "timeBasedCanary") (clojure.core/assoc :time-based-canary (deser-time-based-canary (input "timeBasedCanary"))) (clojure.core/contains? input "timeBasedLinear") (clojure.core/assoc :time-based-linear (deser-time-based-linear (input "timeBasedLinear")))))

(clojure.core/defn- deser-application-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "applicationId") (clojure.core/assoc :application-id (deser-application-id (input "applicationId"))) (clojure.core/contains? input "applicationName") (clojure.core/assoc :application-name (deser-application-name (input "applicationName"))) (clojure.core/contains? input "createTime") (clojure.core/assoc :create-time (deser-timestamp (input "createTime"))) (clojure.core/contains? input "linkedToGitHub") (clojure.core/assoc :linked-to-git-hub (deser-boolean (input "linkedToGitHub"))) (clojure.core/contains? input "gitHubAccountName") (clojure.core/assoc :git-hub-account-name (deser-git-hub-account-token-name (input "gitHubAccountName"))) (clojure.core/contains? input "computePlatform") (clojure.core/assoc :compute-platform (deser-compute-platform (input "computePlatform")))))

(clojure.core/defn- deser-deployment-config-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentConfigId") (clojure.core/assoc :deployment-config-id (deser-deployment-config-id (input "deploymentConfigId"))) (clojure.core/contains? input "deploymentConfigName") (clojure.core/assoc :deployment-config-name (deser-deployment-config-name (input "deploymentConfigName"))) (clojure.core/contains? input "minimumHealthyHosts") (clojure.core/assoc :minimum-healthy-hosts (deser-minimum-healthy-hosts (input "minimumHealthyHosts"))) (clojure.core/contains? input "createTime") (clojure.core/assoc :create-time (deser-timestamp (input "createTime"))) (clojure.core/contains? input "computePlatform") (clojure.core/assoc :compute-platform (deser-compute-platform (input "computePlatform"))) (clojure.core/contains? input "trafficRoutingConfig") (clojure.core/assoc :traffic-routing-config (deser-traffic-routing-config (input "trafficRoutingConfig")))))

(clojure.core/defn- deser-elb-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-elb-name (input "name")))))

(clojure.core/defn- deser-instance-count [input] input)

(clojure.core/defn- deser-wait-time-in-mins [input] input)

(clojure.core/defn- deser-version-id [input] input)

(clojure.core/defn- deser-rollback-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "rollbackDeploymentId") (clojure.core/assoc :rollback-deployment-id (deser-deployment-id (input "rollbackDeploymentId"))) (clojure.core/contains? input "rollbackTriggeringDeploymentId") (clojure.core/assoc :rollback-triggering-deployment-id (deser-deployment-id (input "rollbackTriggeringDeploymentId"))) (clojure.core/contains? input "rollbackMessage") (clojure.core/assoc :rollback-message (deser-description (input "rollbackMessage")))))

(clojure.core/defn- deser-elb-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-elb-info coll))) input))

(clojure.core/defn- deser-listener-arn-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-listener-arn coll))) input))

(clojure.core/defn- deser-minimum-healthy-hosts [input] (clojure.core/cond-> {} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-minimum-healthy-hosts-value (input "value"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-minimum-healthy-hosts-type (input "type")))))

(clojure.core/defn- deser-ecs-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "targetId") (clojure.core/assoc :target-id (deser-target-id (input "targetId"))) (clojure.core/contains? input "targetArn") (clojure.core/assoc :target-arn (deser-target-arn (input "targetArn"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-time (input "lastUpdatedAt"))) (clojure.core/contains? input "lifecycleEvents") (clojure.core/assoc :lifecycle-events (deser-lifecycle-event-list (input "lifecycleEvents"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-target-status (input "status"))) (clojure.core/contains? input "taskSetsInfo") (clojure.core/assoc :task-sets-info (deser-ecs-task-set-list (input "taskSetsInfo")))))

(clojure.core/defn- deser-instance-type [input] (clojure.core/get {"Blue" :blue, "Green" :green} input))

(clojure.core/defn- deser-time-based-canary [input] (clojure.core/cond-> {} (clojure.core/contains? input "canaryPercentage") (clojure.core/assoc :canary-percentage (deser-percentage (input "canaryPercentage"))) (clojure.core/contains? input "canaryInterval") (clojure.core/assoc :canary-interval (deser-wait-time-in-mins (input "canaryInterval")))))

(clojure.core/defn- deser-minimum-healthy-hosts-value [input] input)

(clojure.core/defn- deser-target-arn [input] input)

(clojure.core/defn- deser-blue-instance-termination-option [input] (clojure.core/cond-> {} (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-instance-action (input "action"))) (clojure.core/contains? input "terminationWaitTimeInMinutes") (clojure.core/assoc :termination-wait-time-in-minutes (deser-duration (input "terminationWaitTimeInMinutes")))))

(clojure.core/defn- deser-auto-scaling-group-hook [input] input)

(clojure.core/defn- deser-repository [input] input)

(clojure.core/defn- deser-lifecycle-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "lifecycleEventName") (clojure.core/assoc :lifecycle-event-name (deser-lifecycle-event-name (input "lifecycleEventName"))) (clojure.core/contains? input "diagnostics") (clojure.core/assoc :diagnostics (deser-diagnostics (input "diagnostics"))) (clojure.core/contains? input "startTime") (clojure.core/assoc :start-time (deser-timestamp (input "startTime"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-lifecycle-event-status (input "status")))))

(clojure.core/defn- deser-revision-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "revisionType") (clojure.core/assoc :revision-type (deser-revision-location-type (input "revisionType"))) (clojure.core/contains? input "s3Location") (clojure.core/assoc :s-3-location (deser-s-3-location (input "s3Location"))) (clojure.core/contains? input "gitHubLocation") (clojure.core/assoc :git-hub-location (deser-git-hub-location (input "gitHubLocation"))) (clojure.core/contains? input "string") (clojure.core/assoc :string (deser-raw-string (input "string"))) (clojure.core/contains? input "appSpecContent") (clojure.core/assoc :app-spec-content (deser-app-spec-content (input "appSpecContent")))))

(clojure.core/defn- deser-tag-filter-type [input] (clojure.core/get {"KEY_ONLY" :key-only, "VALUE_ONLY" :value-only, "KEY_AND_VALUE" :key-and-value} input))

(clojure.core/defn- deser-lambda-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "targetId") (clojure.core/assoc :target-id (deser-target-id (input "targetId"))) (clojure.core/contains? input "targetArn") (clojure.core/assoc :target-arn (deser-target-arn (input "targetArn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-target-status (input "status"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-time (input "lastUpdatedAt"))) (clojure.core/contains? input "lifecycleEvents") (clojure.core/assoc :lifecycle-events (deser-lifecycle-event-list (input "lifecycleEvents")))))

(clojure.core/defn- deser-log-tail [input] input)

(clojure.core/defn- deser-deployment-overview [input] (clojure.core/cond-> {} (clojure.core/contains? input "Pending") (clojure.core/assoc :pending (deser-instance-count (input "Pending"))) (clojure.core/contains? input "InProgress") (clojure.core/assoc :in-progress (deser-instance-count (input "InProgress"))) (clojure.core/contains? input "Succeeded") (clojure.core/assoc :succeeded (deser-instance-count (input "Succeeded"))) (clojure.core/contains? input "Failed") (clojure.core/assoc :failed (deser-instance-count (input "Failed"))) (clojure.core/contains? input "Skipped") (clojure.core/assoc :skipped (deser-instance-count (input "Skipped"))) (clojure.core/contains? input "Ready") (clojure.core/assoc :ready (deser-instance-count (input "Ready")))))

(clojure.core/defn- deser-diagnostics [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-lifecycle-error-code (input "errorCode"))) (clojure.core/contains? input "scriptName") (clojure.core/assoc :script-name (deser-script-name (input "scriptName"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-lifecycle-message (input "message"))) (clojure.core/contains? input "logTail") (clojure.core/assoc :log-tail (deser-log-tail (input "logTail")))))

(clojure.core/defn- deser-auto-scaling-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group coll))) input))

(clojure.core/defn- deser-compute-platform [input] (clojure.core/get {"Server" :server, "Lambda" :lambda, "ECS" :ecs} input))

(clojure.core/defn- deser-green-fleet-provisioning-option [input] (clojure.core/cond-> {} (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-green-fleet-provisioning-action (input "action")))))

(clojure.core/defn- deser-load-balancer-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "elbInfoList") (clojure.core/assoc :elb-info-list (deser-elb-info-list (input "elbInfoList"))) (clojure.core/contains? input "targetGroupInfoList") (clojure.core/assoc :target-group-info-list (deser-target-group-info-list (input "targetGroupInfoList"))) (clojure.core/contains? input "targetGroupPairInfoList") (clojure.core/assoc :target-group-pair-info-list (deser-target-group-pair-info-list (input "targetGroupPairInfoList")))))

(clojure.core/defn- deser-revision-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-revision-location coll))) input))

(clojure.core/defn- deser-app-spec-content [input] (clojure.core/cond-> {} (clojure.core/contains? input "content") (clojure.core/assoc :content (deser-raw-string-content (input "content"))) (clojure.core/contains? input "sha256") (clojure.core/assoc :sha-256 (deser-raw-string-sha-256 (input "sha256")))))

(clojure.core/defn- deser-deployment-group-name [input] input)

(clojure.core/defn- deser-target-group-pair-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "targetGroups") (clojure.core/assoc :target-groups (deser-target-group-info-list (input "targetGroups"))) (clojure.core/contains? input "prodTrafficRoute") (clojure.core/assoc :prod-traffic-route (deser-traffic-route (input "prodTrafficRoute"))) (clojure.core/contains? input "testTrafficRoute") (clojure.core/assoc :test-traffic-route (deser-traffic-route (input "testTrafficRoute")))))

(clojure.core/defn- deser-file-exists-behavior [input] (clojure.core/get {"DISALLOW" :disallow, "OVERWRITE" :overwrite, "RETAIN" :retain} input))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-git-hub-account-token-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-git-hub-account-token-name coll))) input))

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-e-tag [input] input)

(clojure.core/defn- deser-additional-deployment-status-info [input] input)

(clojure.core/defn- deser-lifecycle-event-hook-execution-id [input] input)

(clojure.core/defn- deser-key [input] input)

(clojure.core/defn- deser-commit-id [input] input)

(clojure.core/defn- deser-target-group-name [input] input)

(clojure.core/defn- deser-ecs-service-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ecs-service coll))) input))

(clojure.core/defn- deser-trigger-event-type [input] (clojure.core/get {"DeploymentReady" :deployment-ready, "InstanceSuccess" :instance-success, "InstanceFailure" :instance-failure, "DeploymentRollback" :deployment-rollback, "DeploymentStop" :deployment-stop, "InstanceReady" :instance-ready, "DeploymentSuccess" :deployment-success, "DeploymentFailure" :deployment-failure, "InstanceStart" :instance-start, "DeploymentStart" :deployment-start} input))

(clojure.core/defn- deser-deployment-style [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentType") (clojure.core/assoc :deployment-type (deser-deployment-type (input "deploymentType"))) (clojure.core/contains? input "deploymentOption") (clojure.core/assoc :deployment-option (deser-deployment-option (input "deploymentOption")))))

(clojure.core/defn- deser-last-deployment-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-deployment-status (input "status"))) (clojure.core/contains? input "endTime") (clojure.core/assoc :end-time (deser-timestamp (input "endTime"))) (clojure.core/contains? input "createTime") (clojure.core/assoc :create-time (deser-timestamp (input "createTime")))))

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-instance-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-name coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-ecs-cluster-name [input] input)

(clojure.core/defn- deser-green-fleet-provisioning-action [input] (clojure.core/get {"DISCOVER_EXISTING" :discover-existing, "COPY_AUTO_SCALING_GROUP" :copy-auto-scaling-group} input))

(clojure.core/defn- deser-trigger-target-arn [input] input)

(clojure.core/defn- deser-instance-name [input] input)

(clojure.core/defn- deser-ecs-task-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ecs-task-set coll))) input))

(clojure.core/defn- deser-alarm-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alarm coll))) input))

(clojure.core/defn- deser-target-id [input] input)

(clojure.core/defn- deser-auto-rollback-events-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-rollback-event coll))) input))

(clojure.core/defn- deser-traffic-route [input] (clojure.core/cond-> {} (clojure.core/contains? input "listenerArns") (clojure.core/assoc :listener-arns (deser-listener-arn-list (input "listenerArns")))))

(clojure.core/defn- deser-trigger-name [input] input)

(clojure.core/defn- deser-deployment-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-target coll))) input))

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"ALARM_ACTIVE" :alarm-active, "IAM_ROLE_PERMISSIONS" :iam-role-permissions, "REVISION_MISSING" :revision-missing, "ELB_INVALID_INSTANCE" :elb-invalid-instance, "NO_EC2_SUBSCRIPTION" :no-ec-2-subscription, "TIMEOUT" :timeout, "HEALTH_CONSTRAINTS" :health-constraints, "IAM_ROLE_MISSING" :iam-role-missing, "DEPLOYMENT_GROUP_MISSING" :deployment-group-missing, "HEALTH_CONSTRAINTS_INVALID" :health-constraints-invalid, "AUTOSCALING_VALIDATION_ERROR" :autoscaling-validation-error, "INTERNAL_ERROR" :internal-error, "INVALID_ECS_SERVICE" :invalid-ecs-service, "NO_INSTANCES" :no-instances, "ECS_UPDATE_ERROR" :ecs-update-error, "ELASTIC_LOAD_BALANCING_INVALID" :elastic-load-balancing-invalid, "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" :missing-blue-green-deployment-configuration, "AGENT_ISSUE" :agent-issue, "INVALID_REVISION" :invalid-revision, "MANUAL_STOP" :manual-stop, "OVER_MAX_INSTANCES" :over-max-instances, "HOOK_EXECUTION_FAILURE" :hook-execution-failure, "MISSING_ELB_INFORMATION" :missing-elb-information, "AUTO_SCALING_CONFIGURATION" :auto-scaling-configuration, "INVALID_LAMBDA_FUNCTION" :invalid-lambda-function, "APPLICATION_MISSING" :application-missing, "INVALID_LAMBDA_CONFIGURATION" :invalid-lambda-configuration, "MISSING_GITHUB_TOKEN" :missing-github-token, "THROTTLED" :throttled, "AUTO_SCALING_IAM_ROLE_PERMISSIONS" :auto-scaling-iam-role-permissions} input))

(clojure.core/defn- deser-application-id [input] input)

(clojure.core/defn- deser-applications-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-info coll))) input))

(clojure.core/defn- deser-listener-arn [input] input)

(clojure.core/defn- deser-ecs-task-set-status [input] input)

(clojure.core/defn- deser-alarm-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "enabled") (clojure.core/assoc :enabled (deser-boolean (input "enabled"))) (clojure.core/contains? input "ignorePollAlarmFailure") (clojure.core/assoc :ignore-poll-alarm-failure (deser-boolean (input "ignorePollAlarmFailure"))) (clojure.core/contains? input "alarms") (clojure.core/assoc :alarms (deser-alarm-list (input "alarms")))))

(clojure.core/defn- deser-target-instances [input] (clojure.core/cond-> {} (clojure.core/contains? input "tagFilters") (clojure.core/assoc :tag-filters (deser-ec-2-tag-filter-list (input "tagFilters"))) (clojure.core/contains? input "autoScalingGroups") (clojure.core/assoc :auto-scaling-groups (deser-auto-scaling-group-name-list (input "autoScalingGroups"))) (clojure.core/contains? input "ec2TagSet") (clojure.core/assoc :ec-2-tag-set (deser-ec-2-tag-set (input "ec2TagSet")))))

(clojure.core/defn- deser-deployment-config-id [input] input)

(clojure.core/defn- deser-value [input] input)

(clojure.core/defn- deser-trigger-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "triggerName") (clojure.core/assoc :trigger-name (deser-trigger-name (input "triggerName"))) (clojure.core/contains? input "triggerTargetArn") (clojure.core/assoc :trigger-target-arn (deser-trigger-target-arn (input "triggerTargetArn"))) (clojure.core/contains? input "triggerEvents") (clojure.core/assoc :trigger-events (deser-trigger-event-type-list (input "triggerEvents")))))

(clojure.core/defn- deser-deployment-option [input] (clojure.core/get {"WITH_TRAFFIC_CONTROL" :with-traffic-control, "WITHOUT_TRAFFIC_CONTROL" :without-traffic-control} input))

(clojure.core/defn- deser-auto-rollback-event [input] (clojure.core/get {"DEPLOYMENT_FAILURE" :deployment-failure, "DEPLOYMENT_STOP_ON_ALARM" :deployment-stop-on-alarm, "DEPLOYMENT_STOP_ON_REQUEST" :deployment-stop-on-request} input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-ec-2-tag-filter-type [input] (clojure.core/get {"KEY_ONLY" :key-only, "VALUE_ONLY" :value-only, "KEY_AND_VALUE" :key-and-value} input))

(clojure.core/defn- deser-minimum-healthy-hosts-type [input] (clojure.core/get {"HOST_COUNT" :host-count, "FLEET_PERCENT" :fleet-percent} input))

(clojure.core/defn- deser-auto-scaling-group-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group-name coll))) input))

(clojure.core/defn- deser-deployment-id [input] input)

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-auto-scaling-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-auto-scaling-group-name (input "name"))) (clojure.core/contains? input "hook") (clojure.core/assoc :hook (deser-auto-scaling-group-hook (input "hook")))))

(clojure.core/defn- deser-application-name [input] input)

(clojure.core/defn- deser-duration [input] input)

(clojure.core/defn- deser-revision-location-type [input] (clojure.core/get {"S3" :s-3, "GitHub" :git-hub, "String" :string, "AppSpecContent" :app-spec-content} input))

(clojure.core/defn- deser-target-group-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-group-info coll))) input))

(clojure.core/defn- deser-instance-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "instanceId") (clojure.core/assoc :instance-id (deser-instance-id (input "instanceId"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-instance-status (input "status"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-timestamp (input "lastUpdatedAt"))) (clojure.core/contains? input "lifecycleEvents") (clojure.core/assoc :lifecycle-events (deser-lifecycle-event-list (input "lifecycleEvents"))) (clojure.core/contains? input "instanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "instanceType")))))

(clojure.core/defn- deser-deployment-configs-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-config-name coll))) input))

(clojure.core/defn- deser-on-premises-tag-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-filter-list coll))) input))

(clojure.core/defn- deser-ecs-service-name [input] input)

(clojure.core/defn- deser-script-name [input] input)

(clojure.core/defn- deser-deployment-group-id [input] input)

(clojure.core/defn- deser-deployment-creator [input] (clojure.core/get {"user" :user, "autoscaling" :autoscaling, "codeDeployRollback" :code-deploy-rollback} input))

(clojure.core/defn- deser-revision-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-revision-info coll))) input))

(clojure.core/defn- deser-percentage [input] input)

(clojure.core/defn- deser-alarm-name [input] input)

(clojure.core/defn- deser-deployment-groups-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-group-name coll))) input))

(clojure.core/defn- deser-instance-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (input "deploymentId"))) (clojure.core/contains? input "targetId") (clojure.core/assoc :target-id (deser-target-id (input "targetId"))) (clojure.core/contains? input "targetArn") (clojure.core/assoc :target-arn (deser-target-arn (input "targetArn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-target-status (input "status"))) (clojure.core/contains? input "lastUpdatedAt") (clojure.core/assoc :last-updated-at (deser-time (input "lastUpdatedAt"))) (clojure.core/contains? input "lifecycleEvents") (clojure.core/assoc :lifecycle-events (deser-lifecycle-event-list (input "lifecycleEvents"))) (clojure.core/contains? input "instanceLabel") (clojure.core/assoc :instance-label (deser-target-label (input "instanceLabel")))))

(clojure.core/defn- deser-s-3-key [input] input)

(clojure.core/defn- deser-deployment-ready-action [input] (clojure.core/get {"CONTINUE_DEPLOYMENT" :continue-deployment, "STOP_DEPLOYMENT" :stop-deployment} input))

(clojure.core/defn- deser-git-hub-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "repository") (clojure.core/assoc :repository (deser-repository (input "repository"))) (clojure.core/contains? input "commitId") (clojure.core/assoc :commit-id (deser-commit-id (input "commitId")))))

(clojure.core/defn- deser-s-3-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "bucket") (clojure.core/assoc :bucket (deser-s-3-bucket (input "bucket"))) (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-s-3-key (input "key"))) (clojure.core/contains? input "bundleType") (clojure.core/assoc :bundle-type (deser-bundle-type (input "bundleType"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version-id (input "version"))) (clojure.core/contains? input "eTag") (clojure.core/assoc :e-tag (deser-e-tag (input "eTag")))))

(clojure.core/defn- deser-tag-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-tag-filter-type (input "Type")))))

(clojure.core/defn- deser-ec-2-tag-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ec-2-tag-filter coll))) input))

(clojure.core/defn- deser-instances-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance-id coll))) input))

(clojure.core/defn- deser-s-3-bucket [input] input)

(clojure.core/defn- deser-generic-revision-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "deploymentGroups") (clojure.core/assoc :deployment-groups (deser-deployment-groups-list (input "deploymentGroups"))) (clojure.core/contains? input "firstUsedTime") (clojure.core/assoc :first-used-time (deser-timestamp (input "firstUsedTime"))) (clojure.core/contains? input "lastUsedTime") (clojure.core/assoc :last-used-time (deser-timestamp (input "lastUsedTime"))) (clojure.core/contains? input "registerTime") (clojure.core/assoc :register-time (deser-timestamp (input "registerTime")))))

(clojure.core/defn- deser-deployments-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-id coll))) input))

(clojure.core/defn- deser-deployment-target [input] (clojure.core/cond-> {} (clojure.core/contains? input "deploymentTargetType") (clojure.core/assoc :deployment-target-type (deser-deployment-target-type (input "deploymentTargetType"))) (clojure.core/contains? input "instanceTarget") (clojure.core/assoc :instance-target (deser-instance-target (input "instanceTarget"))) (clojure.core/contains? input "lambdaTarget") (clojure.core/assoc :lambda-target (deser-lambda-target (input "lambdaTarget"))) (clojure.core/contains? input "ecsTarget") (clojure.core/assoc :ecs-target (deser-ecs-target (input "ecsTarget")))))

(clojure.core/defn- deser-lifecycle-event-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-event coll))) input))

(clojure.core/defn- deser-tag-filter-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-filter coll))) input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-deployment-status [input] (clojure.core/get {"Created" :created, "Queued" :queued, "InProgress" :in-progress, "Succeeded" :succeeded, "Failed" :failed, "Stopped" :stopped, "Ready" :ready} input))

(clojure.core/defn- deser-ec-2-tag-set-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ec-2-tag-filter-list coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value")))))

(clojure.core/defn- deser-alarm [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-alarm-name (input "name")))))

(clojure.core/defn- deser-ec-2-tag-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-value (input "Value"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-ec-2-tag-filter-type (input "Type")))))

(clojure.core/defn- deser-target-status [input] (clojure.core/get {"Pending" :pending, "InProgress" :in-progress, "Succeeded" :succeeded, "Failed" :failed, "Skipped" :skipped, "Unknown" :unknown, "Ready" :ready} input))

(clojure.core/defn- deser-lifecycle-event-name [input] input)

(clojure.core/defn- deser-target-group-pair-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-group-pair-info coll))) input))

(clojure.core/defn- deser-instance-status [input] (clojure.core/get {"Pending" :pending, "InProgress" :in-progress, "Succeeded" :succeeded, "Failed" :failed, "Skipped" :skipped, "Unknown" :unknown, "Ready" :ready} input))

(clojure.core/defn- deser-trigger-config-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trigger-config coll))) input))

(clojure.core/defn- deser-lifecycle-error-code [input] (clojure.core/get {"Success" :success, "ScriptMissing" :script-missing, "ScriptNotExecutable" :script-not-executable, "ScriptTimedOut" :script-timed-out, "ScriptFailed" :script-failed, "UnknownError" :unknown-error} input))

(clojure.core/defn- deser-blue-green-deployment-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "terminateBlueInstancesOnDeploymentSuccess") (clojure.core/assoc :terminate-blue-instances-on-deployment-success (deser-blue-instance-termination-option (input "terminateBlueInstancesOnDeploymentSuccess"))) (clojure.core/contains? input "deploymentReadyOption") (clojure.core/assoc :deployment-ready-option (deser-deployment-ready-option (input "deploymentReadyOption"))) (clojure.core/contains? input "greenFleetProvisioningOption") (clojure.core/assoc :green-fleet-provisioning-option (deser-green-fleet-provisioning-option (input "greenFleetProvisioningOption")))))

(clojure.core/defn- deser-lifecycle-event-status [input] (clojure.core/get {"Pending" :pending, "InProgress" :in-progress, "Succeeded" :succeeded, "Failed" :failed, "Skipped" :skipped, "Unknown" :unknown} input))

(clojure.core/defn- deser-traffic-routing-type [input] (clojure.core/get {"TimeBasedCanary" :time-based-canary, "TimeBasedLinear" :time-based-linear, "AllAtOnce" :all-at-once} input))

(clojure.core/defn- deser-deployments-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-info coll))) input))

(clojure.core/defn- deser-raw-string-sha-256 [input] input)

(clojure.core/defn- deser-iam-user-arn [input] input)

(clojure.core/defn- deser-error-information [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-error-code (input "code"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-error-message (input "message")))))

(clojure.core/defn- deser-stop-status [input] (clojure.core/get {"Pending" :pending, "Succeeded" :succeeded} input))

(clojure.core/defn- deser-revision-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "revisionLocation") (clojure.core/assoc :revision-location (deser-revision-location (input "revisionLocation"))) (clojure.core/contains? input "genericRevisionInfo") (clojure.core/assoc :generic-revision-info (deser-generic-revision-info (input "genericRevisionInfo")))))

(clojure.core/defn- deser-deployment-ready-option [input] (clojure.core/cond-> {} (clojure.core/contains? input "actionOnTimeout") (clojure.core/assoc :action-on-timeout (deser-deployment-ready-action (input "actionOnTimeout"))) (clojure.core/contains? input "waitTimeInMinutes") (clojure.core/assoc :wait-time-in-minutes (deser-duration (input "waitTimeInMinutes")))))

(clojure.core/defn- deser-applications-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-application-name coll))) input))

(clojure.core/defn- deser-ec-2-tag-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "ec2TagSetList") (clojure.core/assoc :ec-2-tag-set-list (deser-ec-2-tag-set-list (input "ec2TagSetList")))))

(clojure.core/defn- deser-time [input] input)

(clojure.core/defn- deser-iam-session-arn [input] input)

(clojure.core/defn- deser-ecs-task-set-count [input] input)

(clojure.core/defn- deser-time-based-linear [input] (clojure.core/cond-> {} (clojure.core/contains? input "linearPercentage") (clojure.core/assoc :linear-percentage (deser-percentage (input "linearPercentage"))) (clojure.core/contains? input "linearInterval") (clojure.core/assoc :linear-interval (deser-wait-time-in-mins (input "linearInterval")))))

(clojure.core/defn- deser-ecs-task-set-identifier [input] input)

(clojure.core/defn- deser-on-premises-tag-set [input] (clojure.core/cond-> {} (clojure.core/contains? input "onPremisesTagSetList") (clojure.core/assoc :on-premises-tag-set-list (deser-on-premises-tag-set-list (input "onPremisesTagSetList")))))

(clojure.core/defn- deser-instance-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "instanceName") (clojure.core/assoc :instance-name (deser-instance-name (input "instanceName"))) (clojure.core/contains? input "iamSessionArn") (clojure.core/assoc :iam-session-arn (deser-iam-session-arn (input "iamSessionArn"))) (clojure.core/contains? input "iamUserArn") (clojure.core/assoc :iam-user-arn (deser-iam-user-arn (input "iamUserArn"))) (clojure.core/contains? input "instanceArn") (clojure.core/assoc :instance-arn (deser-instance-arn (input "instanceArn"))) (clojure.core/contains? input "registerTime") (clojure.core/assoc :register-time (deser-timestamp (input "registerTime"))) (clojure.core/contains? input "deregisterTime") (clojure.core/assoc :deregister-time (deser-timestamp (input "deregisterTime"))) (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-list (input "tags")))))

(clojure.core/defn- deser-target-group-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-target-group-name (input "name")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-instance-arn [input] input)

(clojure.core/defn- deser-deployment-group-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployment-group-info coll))) input))

(clojure.core/defn- response-invalid-revision-exception ([input] (response-invalid-revision-exception nil input)) ([resultWrapper405009 input] (clojure.core/let [rawinput405008 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405010 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-instance-status-exception ([input] (response-invalid-instance-status-exception nil input)) ([resultWrapper405012 input] (clojure.core/let [rawinput405011 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405013 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-deployment-config-output ([input] (response-get-deployment-config-output nil input)) ([resultWrapper405015 input] (clojure.core/let [rawinput405014 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405016 {"deploymentConfigInfo" (rawinput405014 "deploymentConfigInfo")}] (clojure.core/cond-> {} (letvar405016 "deploymentConfigInfo") (clojure.core/assoc :deployment-config-info (deser-deployment-config-info (clojure.core/get-in letvar405016 ["deploymentConfigInfo"])))))))

(clojure.core/defn- response-deployment-already-completed-exception ([input] (response-deployment-already-completed-exception nil input)) ([resultWrapper405018 input] (clojure.core/let [rawinput405017 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405019 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-git-hub-account-token-output ([input] (response-delete-git-hub-account-token-output nil input)) ([resultWrapper405021 input] (clojure.core/let [rawinput405020 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405022 {"tokenName" (rawinput405020 "tokenName")}] (clojure.core/cond-> {} (letvar405022 "tokenName") (clojure.core/assoc :token-name (deser-git-hub-account-token-name (clojure.core/get-in letvar405022 ["tokenName"])))))))

(clojure.core/defn- response-create-application-output ([input] (response-create-application-output nil input)) ([resultWrapper405024 input] (clojure.core/let [rawinput405023 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405025 {"applicationId" (rawinput405023 "applicationId")}] (clojure.core/cond-> {} (letvar405025 "applicationId") (clojure.core/assoc :application-id (deser-application-id (clojure.core/get-in letvar405025 ["applicationId"])))))))

(clojure.core/defn- response-invalid-sort-by-exception ([input] (response-invalid-sort-by-exception nil input)) ([resultWrapper405027 input] (clojure.core/let [rawinput405026 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405028 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-deployment-group-output ([input] (response-get-deployment-group-output nil input)) ([resultWrapper405030 input] (clojure.core/let [rawinput405029 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405031 {"deploymentGroupInfo" (rawinput405029 "deploymentGroupInfo")}] (clojure.core/cond-> {} (letvar405031 "deploymentGroupInfo") (clojure.core/assoc :deployment-group-info (deser-deployment-group-info (clojure.core/get-in letvar405031 ["deploymentGroupInfo"])))))))

(clojure.core/defn- response-invalid-deployment-status-exception ([input] (response-invalid-deployment-status-exception nil input)) ([resultWrapper405033 input] (clojure.core/let [rawinput405032 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405034 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-group-pair-exception ([input] (response-invalid-target-group-pair-exception nil input)) ([resultWrapper405036 input] (clojure.core/let [rawinput405035 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405037 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-revision-required-exception ([input] (response-revision-required-exception nil input)) ([resultWrapper405039 input] (clojure.core/let [rawinput405038 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405040 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-target-list-size-exceeded-exception ([input] (response-deployment-target-list-size-exceeded-exception nil input)) ([resultWrapper405042 input] (clojure.core/let [rawinput405041 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405043 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-config-already-exists-exception ([input] (response-deployment-config-already-exists-exception nil input)) ([resultWrapper405045 input] (clojure.core/let [rawinput405044 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405046 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lifecycle-event-hook-execution-status-exception ([input] (response-invalid-lifecycle-event-hook-execution-status-exception nil input)) ([resultWrapper405048 input] (clojure.core/let [rawinput405047 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405049 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-wait-type-exception ([input] (response-invalid-deployment-wait-type-exception nil input)) ([resultWrapper405051 input] (clojure.core/let [rawinput405050 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405052 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-instance-not-registered-exception ([input] (response-instance-not-registered-exception nil input)) ([resultWrapper405054 input] (clojure.core/let [rawinput405053 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405055 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-group-already-exists-exception ([input] (response-deployment-group-already-exists-exception nil input)) ([resultWrapper405057 input] (clojure.core/let [rawinput405056 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405058 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-group-name-exception ([input] (response-invalid-deployment-group-name-exception nil input)) ([resultWrapper405060 input] (clojure.core/let [rawinput405059 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405061 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-compute-platform-exception ([input] (response-invalid-compute-platform-exception nil input)) ([resultWrapper405063 input] (clojure.core/let [rawinput405062 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405064 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-iam-user-arn-already-registered-exception ([input] (response-iam-user-arn-already-registered-exception nil input)) ([resultWrapper405066 input] (clojure.core/let [rawinput405065 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405067 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-role-exception ([input] (response-invalid-role-exception nil input)) ([resultWrapper405069 input] (clojure.core/let [rawinput405068 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405070 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-trigger-config-exception ([input] (response-invalid-trigger-config-exception nil input)) ([resultWrapper405072 input] (clojure.core/let [rawinput405071 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405073 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-on-premises-tag-combination-exception ([input] (response-invalid-on-premises-tag-combination-exception nil input)) ([resultWrapper405075 input] (clojure.core/let [rawinput405074 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405076 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-git-hub-account-token-name-exception ([input] (response-invalid-git-hub-account-token-name-exception nil input)) ([resultWrapper405078 input] (clojure.core/let [rawinput405077 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405079 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-limit-exceeded-exception ([input] (response-batch-limit-exceeded-exception nil input)) ([resultWrapper405081 input] (clojure.core/let [rawinput405080 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405082 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-deployment-targets-output ([input] (response-batch-get-deployment-targets-output nil input)) ([resultWrapper405084 input] (clojure.core/let [rawinput405083 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405085 {"deploymentTargets" (rawinput405083 "deploymentTargets")}] (clojure.core/cond-> {} (letvar405085 "deploymentTargets") (clojure.core/assoc :deployment-targets (deser-deployment-target-list (clojure.core/get-in letvar405085 ["deploymentTargets"])))))))

(clojure.core/defn- response-deployment-not-started-exception ([input] (response-deployment-not-started-exception nil input)) ([resultWrapper405087 input] (clojure.core/let [rawinput405086 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405088 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-ec-2-tag-exception ([input] (response-invalid-ec-2-tag-exception nil input)) ([resultWrapper405090 input] (clojure.core/let [rawinput405089 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405091 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-style-exception ([input] (response-invalid-deployment-style-exception nil input)) ([resultWrapper405093 input] (clojure.core/let [rawinput405092 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405094 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-bucket-name-filter-exception ([input] (response-invalid-bucket-name-filter-exception nil input)) ([resultWrapper405096 input] (clojure.core/let [rawinput405095 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405097 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-iam-user-arn-exception ([input] (response-invalid-iam-user-arn-exception nil input)) ([resultWrapper405099 input] (clojure.core/let [rawinput405098 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405100 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-application-output ([input] (response-get-application-output nil input)) ([resultWrapper405102 input] (clojure.core/let [rawinput405101 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405103 {"application" (rawinput405101 "application")}] (clojure.core/cond-> {} (letvar405103 "application") (clojure.core/assoc :application (deser-application-info (clojure.core/get-in letvar405103 ["application"])))))))

(clojure.core/defn- response-lifecycle-hook-limit-exceeded-exception ([input] (response-lifecycle-hook-limit-exceeded-exception nil input)) ([resultWrapper405105 input] (clojure.core/let [rawinput405104 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405106 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-trigger-targets-limit-exceeded-exception ([input] (response-trigger-targets-limit-exceeded-exception nil input)) ([resultWrapper405108 input] (clojure.core/let [rawinput405107 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405109 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-git-hub-account-token-exception ([input] (response-invalid-git-hub-account-token-exception nil input)) ([resultWrapper405111 input] (clojure.core/let [rawinput405110 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405112 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-iam-arn-required-exception ([input] (response-iam-arn-required-exception nil input)) ([resultWrapper405114 input] (clojure.core/let [rawinput405113 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405115 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-config-name-exception ([input] (response-invalid-deployment-config-name-exception nil input)) ([resultWrapper405117 input] (clojure.core/let [rawinput405116 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405118 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-limit-exceeded-exception ([input] (response-deployment-limit-exceeded-exception nil input)) ([resultWrapper405120 input] (clojure.core/let [rawinput405119 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405121 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-deployment-groups-output ([input] (response-batch-get-deployment-groups-output nil input)) ([resultWrapper405123 input] (clojure.core/let [rawinput405122 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405124 {"deploymentGroupsInfo" (rawinput405122 "deploymentGroupsInfo"), "errorMessage" (rawinput405122 "errorMessage")}] (clojure.core/cond-> {} (letvar405124 "deploymentGroupsInfo") (clojure.core/assoc :deployment-groups-info (deser-deployment-group-info-list (clojure.core/get-in letvar405124 ["deploymentGroupsInfo"]))) (letvar405124 "errorMessage") (clojure.core/assoc :error-message (deser-error-message (clojure.core/get-in letvar405124 ["errorMessage"])))))))

(clojure.core/defn- response-deployment-does-not-exist-exception ([input] (response-deployment-does-not-exist-exception nil input)) ([resultWrapper405126 input] (clojure.core/let [rawinput405125 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405127 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-filter-name-exception ([input] (response-invalid-target-filter-name-exception nil input)) ([resultWrapper405129 input] (clojure.core/let [rawinput405128 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405130 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-group-does-not-exist-exception ([input] (response-deployment-group-does-not-exist-exception nil input)) ([resultWrapper405132 input] (clojure.core/let [rawinput405131 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405133 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-stop-deployment-output ([input] (response-stop-deployment-output nil input)) ([resultWrapper405135 input] (clojure.core/let [rawinput405134 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405136 {"status" (rawinput405134 "status"), "statusMessage" (rawinput405134 "statusMessage")}] (clojure.core/cond-> {} (letvar405136 "status") (clojure.core/assoc :status (deser-stop-status (clojure.core/get-in letvar405136 ["status"]))) (letvar405136 "statusMessage") (clojure.core/assoc :status-message (deser-message (clojure.core/get-in letvar405136 ["statusMessage"])))))))

(clojure.core/defn- response-update-deployment-group-output ([input] (response-update-deployment-group-output nil input)) ([resultWrapper405138 input] (clojure.core/let [rawinput405137 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405139 {"hooksNotCleanedUp" (rawinput405137 "hooksNotCleanedUp")}] (clojure.core/cond-> {} (letvar405139 "hooksNotCleanedUp") (clojure.core/assoc :hooks-not-cleaned-up (deser-auto-scaling-group-list (clojure.core/get-in letvar405139 ["hooksNotCleanedUp"])))))))

(clojure.core/defn- response-batch-get-application-revisions-output ([input] (response-batch-get-application-revisions-output nil input)) ([resultWrapper405141 input] (clojure.core/let [rawinput405140 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405142 {"applicationName" (rawinput405140 "applicationName"), "errorMessage" (rawinput405140 "errorMessage"), "revisions" (rawinput405140 "revisions")}] (clojure.core/cond-> {} (letvar405142 "applicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar405142 ["applicationName"]))) (letvar405142 "errorMessage") (clojure.core/assoc :error-message (deser-error-message (clojure.core/get-in letvar405142 ["errorMessage"]))) (letvar405142 "revisions") (clojure.core/assoc :revisions (deser-revision-info-list (clojure.core/get-in letvar405142 ["revisions"])))))))

(clojure.core/defn- response-get-deployment-output ([input] (response-get-deployment-output nil input)) ([resultWrapper405144 input] (clojure.core/let [rawinput405143 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405145 {"deploymentInfo" (rawinput405143 "deploymentInfo")}] (clojure.core/cond-> {} (letvar405145 "deploymentInfo") (clojure.core/assoc :deployment-info (deser-deployment-info (clojure.core/get-in letvar405145 ["deploymentInfo"])))))))

(clojure.core/defn- response-git-hub-account-token-does-not-exist-exception ([input] (response-git-hub-account-token-does-not-exist-exception nil input)) ([resultWrapper405147 input] (clojure.core/let [rawinput405146 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405148 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-group-limit-exceeded-exception ([input] (response-deployment-group-limit-exceeded-exception nil input)) ([resultWrapper405150 input] (clojure.core/let [rawinput405149 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405151 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-lifecycle-event-hook-execution-id-exception ([input] (response-invalid-lifecycle-event-hook-execution-id-exception nil input)) ([resultWrapper405153 input] (clojure.core/let [rawinput405152 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405154 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-deployment-group-output ([input] (response-delete-deployment-group-output nil input)) ([resultWrapper405156 input] (clojure.core/let [rawinput405155 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405157 {"hooksNotCleanedUp" (rawinput405155 "hooksNotCleanedUp")}] (clojure.core/cond-> {} (letvar405157 "hooksNotCleanedUp") (clojure.core/assoc :hooks-not-cleaned-up (deser-auto-scaling-group-list (clojure.core/get-in letvar405157 ["hooksNotCleanedUp"])))))))

(clojure.core/defn- response-tag-limit-exceeded-exception ([input] (response-tag-limit-exceeded-exception nil input)) ([resultWrapper405159 input] (clojure.core/let [rawinput405158 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405160 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-target-does-not-exist-exception ([input] (response-deployment-target-does-not-exist-exception nil input)) ([resultWrapper405162 input] (clojure.core/let [rawinput405161 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405163 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-deployment-groups-output ([input] (response-list-deployment-groups-output nil input)) ([resultWrapper405165 input] (clojure.core/let [rawinput405164 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405166 {"applicationName" (rawinput405164 "applicationName"), "deploymentGroups" (rawinput405164 "deploymentGroups"), "nextToken" (rawinput405164 "nextToken")}] (clojure.core/cond-> {} (letvar405166 "applicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar405166 ["applicationName"]))) (letvar405166 "deploymentGroups") (clojure.core/assoc :deployment-groups (deser-deployment-groups-list (clojure.core/get-in letvar405166 ["deploymentGroups"]))) (letvar405166 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405166 ["nextToken"])))))))

(clojure.core/defn- response-bucket-name-filter-required-exception ([input] (response-bucket-name-filter-required-exception nil input)) ([resultWrapper405168 input] (clojure.core/let [rawinput405167 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405169 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-deployment-instance-output ([input] (response-get-deployment-instance-output nil input)) ([resultWrapper405171 input] (clojure.core/let [rawinput405170 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405172 {"instanceSummary" (rawinput405170 "instanceSummary")}] (clojure.core/cond-> {} (letvar405172 "instanceSummary") (clojure.core/assoc :instance-summary (deser-instance-summary (clojure.core/get-in letvar405172 ["instanceSummary"])))))))

(clojure.core/defn- response-revision-does-not-exist-exception ([input] (response-revision-does-not-exist-exception nil input)) ([resultWrapper405174 input] (clojure.core/let [rawinput405173 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405175 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-deployment-instances-output ([input] (response-batch-get-deployment-instances-output nil input)) ([resultWrapper405177 input] (clojure.core/let [rawinput405176 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405178 {"instancesSummary" (rawinput405176 "instancesSummary"), "errorMessage" (rawinput405176 "errorMessage")}] (clojure.core/cond-> {} (letvar405178 "instancesSummary") (clojure.core/assoc :instances-summary (deser-instance-summary-list (clojure.core/get-in letvar405178 ["instancesSummary"]))) (letvar405178 "errorMessage") (clojure.core/assoc :error-message (deser-error-message (clojure.core/get-in letvar405178 ["errorMessage"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper405180 input] (clojure.core/let [rawinput405179 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405181 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-ec-2-tag-combination-exception ([input] (response-invalid-ec-2-tag-combination-exception nil input)) ([resultWrapper405183 input] (clojure.core/let [rawinput405182 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405184 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-config-name-required-exception ([input] (response-deployment-config-name-required-exception nil input)) ([resultWrapper405186 input] (clojure.core/let [rawinput405185 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405187 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployed-state-filter-exception ([input] (response-invalid-deployed-state-filter-exception nil input)) ([resultWrapper405189 input] (clojure.core/let [rawinput405188 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405190 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-on-premises-instances-output ([input] (response-list-on-premises-instances-output nil input)) ([resultWrapper405192 input] (clojure.core/let [rawinput405191 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405193 {"instanceNames" (rawinput405191 "instanceNames"), "nextToken" (rawinput405191 "nextToken")}] (clojure.core/cond-> {} (letvar405193 "instanceNames") (clojure.core/assoc :instance-names (deser-instance-name-list (clojure.core/get-in letvar405193 ["instanceNames"]))) (letvar405193 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405193 ["nextToken"])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper405195 input] (clojure.core/let [rawinput405194 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405196 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-iam-user-arn-required-exception ([input] (response-iam-user-arn-required-exception nil input)) ([resultWrapper405198 input] (clojure.core/let [rawinput405197 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405199 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-application-revisions-output ([input] (response-list-application-revisions-output nil input)) ([resultWrapper405201 input] (clojure.core/let [rawinput405200 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405202 {"revisions" (rawinput405200 "revisions"), "nextToken" (rawinput405200 "nextToken")}] (clojure.core/cond-> {} (letvar405202 "revisions") (clojure.core/assoc :revisions (deser-revision-location-list (clojure.core/get-in letvar405202 ["revisions"]))) (letvar405202 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405202 ["nextToken"])))))))

(clojure.core/defn- response-application-limit-exceeded-exception ([input] (response-application-limit-exceeded-exception nil input)) ([resultWrapper405204 input] (clojure.core/let [rawinput405203 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405205 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-instance-name-exception ([input] (response-invalid-instance-name-exception nil input)) ([resultWrapper405207 input] (clojure.core/let [rawinput405206 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405208 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-applications-output ([input] (response-list-applications-output nil input)) ([resultWrapper405210 input] (clojure.core/let [rawinput405209 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405211 {"applications" (rawinput405209 "applications"), "nextToken" (rawinput405209 "nextToken")}] (clojure.core/cond-> {} (letvar405211 "applications") (clojure.core/assoc :applications (deser-applications-list (clojure.core/get-in letvar405211 ["applications"]))) (letvar405211 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405211 ["nextToken"])))))))

(clojure.core/defn- response-create-deployment-output ([input] (response-create-deployment-output nil input)) ([resultWrapper405213 input] (clojure.core/let [rawinput405212 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405214 {"deploymentId" (rawinput405212 "deploymentId")}] (clojure.core/cond-> {} (letvar405214 "deploymentId") (clojure.core/assoc :deployment-id (deser-deployment-id (clojure.core/get-in letvar405214 ["deploymentId"])))))))

(clojure.core/defn- response-invalid-tag-exception ([input] (response-invalid-tag-exception nil input)) ([resultWrapper405216 input] (clojure.core/let [rawinput405215 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405217 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-application-does-not-exist-exception ([input] (response-application-does-not-exist-exception nil input)) ([resultWrapper405219 input] (clojure.core/let [rawinput405218 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405220 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-file-exists-behavior-exception ([input] (response-invalid-file-exists-behavior-exception nil input)) ([resultWrapper405222 input] (clojure.core/let [rawinput405221 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405223 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-deployment-configs-output ([input] (response-list-deployment-configs-output nil input)) ([resultWrapper405225 input] (clojure.core/let [rawinput405224 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405226 {"deploymentConfigsList" (rawinput405224 "deploymentConfigsList"), "nextToken" (rawinput405224 "nextToken")}] (clojure.core/cond-> {} (letvar405226 "deploymentConfigsList") (clojure.core/assoc :deployment-configs-list (deser-deployment-configs-list (clojure.core/get-in letvar405226 ["deploymentConfigsList"]))) (letvar405226 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405226 ["nextToken"])))))))

(clojure.core/defn- response-batch-get-deployments-output ([input] (response-batch-get-deployments-output nil input)) ([resultWrapper405228 input] (clojure.core/let [rawinput405227 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405229 {"deploymentsInfo" (rawinput405227 "deploymentsInfo")}] (clojure.core/cond-> {} (letvar405229 "deploymentsInfo") (clojure.core/assoc :deployments-info (deser-deployments-info-list (clojure.core/get-in letvar405229 ["deploymentsInfo"])))))))

(clojure.core/defn- response-application-name-required-exception ([input] (response-application-name-required-exception nil input)) ([resultWrapper405231 input] (clojure.core/let [rawinput405230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405232 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-instance-name-required-exception ([input] (response-instance-name-required-exception nil input)) ([resultWrapper405234 input] (clojure.core/let [rawinput405233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405235 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-target-id-exception ([input] (response-invalid-deployment-target-id-exception nil input)) ([resultWrapper405237 input] (clojure.core/let [rawinput405236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405238 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-ecs-service-mapping-limit-exceeded-exception ([input] (response-ecs-service-mapping-limit-exceeded-exception nil input)) ([resultWrapper405240 input] (clojure.core/let [rawinput405239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405241 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-id-required-exception ([input] (response-deployment-id-required-exception nil input)) ([resultWrapper405243 input] (clojure.core/let [rawinput405242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405244 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper405246 input] (clojure.core/let [rawinput405245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405247 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-iam-session-arn-already-registered-exception ([input] (response-iam-session-arn-already-registered-exception nil input)) ([resultWrapper405249 input] (clojure.core/let [rawinput405248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405250 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-update-outdated-instances-only-value-exception ([input] (response-invalid-update-outdated-instances-only-value-exception nil input)) ([resultWrapper405252 input] (clojure.core/let [rawinput405251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405253 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-config-in-use-exception ([input] (response-deployment-config-in-use-exception nil input)) ([resultWrapper405255 input] (clojure.core/let [rawinput405254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405256 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-description-too-long-exception ([input] (response-description-too-long-exception nil input)) ([resultWrapper405258 input] (clojure.core/let [rawinput405257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405259 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-operation-not-supported-exception ([input] (response-operation-not-supported-exception nil input)) ([resultWrapper405261 input] (clojure.core/let [rawinput405260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405262 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-deployment-targets-output ([input] (response-list-deployment-targets-output nil input)) ([resultWrapper405264 input] (clojure.core/let [rawinput405263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405265 {"targetIds" (rawinput405263 "targetIds"), "nextToken" (rawinput405263 "nextToken")}] (clojure.core/cond-> {} (letvar405265 "targetIds") (clojure.core/assoc :target-ids (deser-target-id-list (clojure.core/get-in letvar405265 ["targetIds"]))) (letvar405265 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405265 ["nextToken"])))))))

(clojure.core/defn- response-invalid-key-prefix-filter-exception ([input] (response-invalid-key-prefix-filter-exception nil input)) ([resultWrapper405267 input] (clojure.core/let [rawinput405266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405268 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sort-order-exception ([input] (response-invalid-sort-order-exception nil input)) ([resultWrapper405270 input] (clojure.core/let [rawinput405269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405271 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-set-list-limit-exceeded-exception ([input] (response-tag-set-list-limit-exceeded-exception nil input)) ([resultWrapper405273 input] (clojure.core/let [rawinput405272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405274 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-deployment-config-output ([input] (response-create-deployment-config-output nil input)) ([resultWrapper405276 input] (clojure.core/let [rawinput405275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405277 {"deploymentConfigId" (rawinput405275 "deploymentConfigId")}] (clojure.core/cond-> {} (letvar405277 "deploymentConfigId") (clojure.core/assoc :deployment-config-id (deser-deployment-config-id (clojure.core/get-in letvar405277 ["deploymentConfigId"])))))))

(clojure.core/defn- response-invalid-registration-status-exception ([input] (response-invalid-registration-status-exception nil input)) ([resultWrapper405279 input] (clojure.core/let [rawinput405278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405280 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-instance-id-required-exception ([input] (response-instance-id-required-exception nil input)) ([resultWrapper405282 input] (clojure.core/let [rawinput405281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405283 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-tag-required-exception ([input] (response-tag-required-exception nil input)) ([resultWrapper405285 input] (clojure.core/let [rawinput405284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405286 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-on-premises-instance-output ([input] (response-get-on-premises-instance-output nil input)) ([resultWrapper405288 input] (clojure.core/let [rawinput405287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405289 {"instanceInfo" (rawinput405287 "instanceInfo")}] (clojure.core/cond-> {} (letvar405289 "instanceInfo") (clojure.core/assoc :instance-info (deser-instance-info (clojure.core/get-in letvar405289 ["instanceInfo"])))))))

(clojure.core/defn- response-batch-get-on-premises-instances-output ([input] (response-batch-get-on-premises-instances-output nil input)) ([resultWrapper405291 input] (clojure.core/let [rawinput405290 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405292 {"instanceInfos" (rawinput405290 "instanceInfos")}] (clojure.core/cond-> {} (letvar405292 "instanceInfos") (clojure.core/assoc :instance-infos (deser-instance-info-list (clojure.core/get-in letvar405292 ["instanceInfos"])))))))

(clojure.core/defn- response-invalid-iam-session-arn-exception ([input] (response-invalid-iam-session-arn-exception nil input)) ([resultWrapper405294 input] (clojure.core/let [rawinput405293 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405295 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-application-name-exception ([input] (response-invalid-application-name-exception nil input)) ([resultWrapper405297 input] (clojure.core/let [rawinput405296 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405298 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-id-exception ([input] (response-invalid-deployment-id-exception nil input)) ([resultWrapper405300 input] (clojure.core/let [rawinput405299 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405301 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-application-revision-output ([input] (response-get-application-revision-output nil input)) ([resultWrapper405303 input] (clojure.core/let [rawinput405302 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405304 {"applicationName" (rawinput405302 "applicationName"), "revision" (rawinput405302 "revision"), "revisionInfo" (rawinput405302 "revisionInfo")}] (clojure.core/cond-> {} (letvar405304 "applicationName") (clojure.core/assoc :application-name (deser-application-name (clojure.core/get-in letvar405304 ["applicationName"]))) (letvar405304 "revision") (clojure.core/assoc :revision (deser-revision-location (clojure.core/get-in letvar405304 ["revision"]))) (letvar405304 "revisionInfo") (clojure.core/assoc :revision-info (deser-generic-revision-info (clojure.core/get-in letvar405304 ["revisionInfo"])))))))

(clojure.core/defn- response-get-deployment-target-output ([input] (response-get-deployment-target-output nil input)) ([resultWrapper405306 input] (clojure.core/let [rawinput405305 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405307 {"deploymentTarget" (rawinput405305 "deploymentTarget")}] (clojure.core/cond-> {} (letvar405307 "deploymentTarget") (clojure.core/assoc :deployment-target (deser-deployment-target (clojure.core/get-in letvar405307 ["deploymentTarget"])))))))

(clojure.core/defn- response-invalid-instance-type-exception ([input] (response-invalid-instance-type-exception nil input)) ([resultWrapper405309 input] (clojure.core/let [rawinput405308 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405310 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-target-id-required-exception ([input] (response-deployment-target-id-required-exception nil input)) ([resultWrapper405312 input] (clojure.core/let [rawinput405311 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405313 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-blue-green-deployment-configuration-exception ([input] (response-invalid-blue-green-deployment-configuration-exception nil input)) ([resultWrapper405315 input] (clojure.core/let [rawinput405314 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405316 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-deployment-instance-type-exception ([input] (response-invalid-deployment-instance-type-exception nil input)) ([resultWrapper405318 input] (clojure.core/let [rawinput405317 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405319 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-deployment-instances-output ([input] (response-list-deployment-instances-output nil input)) ([resultWrapper405321 input] (clojure.core/let [rawinput405320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405322 {"instancesList" (rawinput405320 "instancesList"), "nextToken" (rawinput405320 "nextToken")}] (clojure.core/cond-> {} (letvar405322 "instancesList") (clojure.core/assoc :instances-list (deser-instances-list (clojure.core/get-in letvar405322 ["instancesList"]))) (letvar405322 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405322 ["nextToken"])))))))

(clojure.core/defn- response-deployment-is-not-in-ready-state-exception ([input] (response-deployment-is-not-in-ready-state-exception nil input)) ([resultWrapper405324 input] (clojure.core/let [rawinput405323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405325 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-multiple-iam-arns-provided-exception ([input] (response-multiple-iam-arns-provided-exception nil input)) ([resultWrapper405327 input] (clojure.core/let [rawinput405326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405328 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-load-balancer-info-exception ([input] (response-invalid-load-balancer-info-exception nil input)) ([resultWrapper405330 input] (clojure.core/let [rawinput405329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405331 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-ignore-application-stop-failures-value-exception ([input] (response-invalid-ignore-application-stop-failures-value-exception nil input)) ([resultWrapper405333 input] (clojure.core/let [rawinput405332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405334 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-get-applications-output ([input] (response-batch-get-applications-output nil input)) ([resultWrapper405336 input] (clojure.core/let [rawinput405335 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405337 {"applicationsInfo" (rawinput405335 "applicationsInfo")}] (clojure.core/cond-> {} (letvar405337 "applicationsInfo") (clojure.core/assoc :applications-info (deser-applications-info-list (clojure.core/get-in letvar405337 ["applicationsInfo"])))))))

(clojure.core/defn- response-invalid-auto-rollback-config-exception ([input] (response-invalid-auto-rollback-config-exception nil input)) ([resultWrapper405339 input] (clojure.core/let [rawinput405338 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405340 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-instance-does-not-exist-exception ([input] (response-instance-does-not-exist-exception nil input)) ([resultWrapper405342 input] (clojure.core/let [rawinput405341 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405343 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-lifecycle-event-hook-execution-status-output ([input] (response-put-lifecycle-event-hook-execution-status-output nil input)) ([resultWrapper405345 input] (clojure.core/let [rawinput405344 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405346 {"lifecycleEventHookExecutionId" (rawinput405344 "lifecycleEventHookExecutionId")}] (clojure.core/cond-> {} (letvar405346 "lifecycleEventHookExecutionId") (clojure.core/assoc :lifecycle-event-hook-execution-id (deser-lifecycle-event-hook-execution-id (clojure.core/get-in letvar405346 ["lifecycleEventHookExecutionId"])))))))

(clojure.core/defn- response-invalid-ecs-service-exception ([input] (response-invalid-ecs-service-exception nil input)) ([resultWrapper405348 input] (clojure.core/let [rawinput405347 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405349 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper405351 input] (clojure.core/let [rawinput405350 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405352 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-minimum-healthy-host-value-exception ([input] (response-invalid-minimum-healthy-host-value-exception nil input)) ([resultWrapper405354 input] (clojure.core/let [rawinput405353 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405355 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-config-does-not-exist-exception ([input] (response-deployment-config-does-not-exist-exception nil input)) ([resultWrapper405357 input] (clojure.core/let [rawinput405356 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405358 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-git-hub-account-token-name-required-exception ([input] (response-git-hub-account-token-name-required-exception nil input)) ([resultWrapper405360 input] (clojure.core/let [rawinput405359 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405361 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-config-limit-exceeded-exception ([input] (response-deployment-config-limit-exceeded-exception nil input)) ([resultWrapper405363 input] (clojure.core/let [rawinput405362 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405364 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-auto-scaling-group-exception ([input] (response-invalid-auto-scaling-group-exception nil input)) ([resultWrapper405366 input] (clojure.core/let [rawinput405365 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405367 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-traffic-routing-configuration-exception ([input] (response-invalid-traffic-routing-configuration-exception nil input)) ([resultWrapper405369 input] (clojure.core/let [rawinput405368 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405370 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-deployment-group-name-required-exception ([input] (response-deployment-group-name-required-exception nil input)) ([resultWrapper405372 input] (clojure.core/let [rawinput405371 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405373 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-tag-filter-exception ([input] (response-invalid-tag-filter-exception nil input)) ([resultWrapper405375 input] (clojure.core/let [rawinput405374 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405376 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-role-required-exception ([input] (response-role-required-exception nil input)) ([resultWrapper405378 input] (clojure.core/let [rawinput405377 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405379 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-deployments-output ([input] (response-list-deployments-output nil input)) ([resultWrapper405381 input] (clojure.core/let [rawinput405380 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405382 {"deployments" (rawinput405380 "deployments"), "nextToken" (rawinput405380 "nextToken")}] (clojure.core/cond-> {} (letvar405382 "deployments") (clojure.core/assoc :deployments (deser-deployments-list (clojure.core/get-in letvar405382 ["deployments"]))) (letvar405382 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405382 ["nextToken"])))))))

(clojure.core/defn- response-instance-name-already-registered-exception ([input] (response-instance-name-already-registered-exception nil input)) ([resultWrapper405384 input] (clojure.core/let [rawinput405383 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405385 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-alarm-config-exception ([input] (response-invalid-alarm-config-exception nil input)) ([resultWrapper405387 input] (clojure.core/let [rawinput405386 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405388 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-instance-limit-exceeded-exception ([input] (response-instance-limit-exceeded-exception nil input)) ([resultWrapper405390 input] (clojure.core/let [rawinput405389 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405391 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-alarms-limit-exceeded-exception ([input] (response-alarms-limit-exceeded-exception nil input)) ([resultWrapper405393 input] (clojure.core/let [rawinput405392 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405394 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-time-range-exception ([input] (response-invalid-time-range-exception nil input)) ([resultWrapper405396 input] (clojure.core/let [rawinput405395 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405397 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-deployment-group-output ([input] (response-create-deployment-group-output nil input)) ([resultWrapper405399 input] (clojure.core/let [rawinput405398 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405400 {"deploymentGroupId" (rawinput405398 "deploymentGroupId")}] (clojure.core/cond-> {} (letvar405400 "deploymentGroupId") (clojure.core/assoc :deployment-group-id (deser-deployment-group-id (clojure.core/get-in letvar405400 ["deploymentGroupId"])))))))

(clojure.core/defn- response-application-already-exists-exception ([input] (response-application-already-exists-exception nil input)) ([resultWrapper405402 input] (clojure.core/let [rawinput405401 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405403 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-target-instances-exception ([input] (response-invalid-target-instances-exception nil input)) ([resultWrapper405405 input] (clojure.core/let [rawinput405404 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405406 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-git-hub-account-token-names-output ([input] (response-list-git-hub-account-token-names-output nil input)) ([resultWrapper405408 input] (clojure.core/let [rawinput405407 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405409 {"tokenNameList" (rawinput405407 "tokenNameList"), "nextToken" (rawinput405407 "nextToken")}] (clojure.core/cond-> {} (letvar405409 "tokenNameList") (clojure.core/assoc :token-name-list (deser-git-hub-account-token-name-list (clojure.core/get-in letvar405409 ["tokenNameList"]))) (letvar405409 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar405409 ["nextToken"])))))))

(clojure.core/defn- response-resource-validation-exception ([input] (response-resource-validation-exception nil input)) ([resultWrapper405411 input] (clojure.core/let [rawinput405410 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405412 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-lifecycle-event-already-completed-exception ([input] (response-lifecycle-event-already-completed-exception nil input)) ([resultWrapper405414 input] (clojure.core/let [rawinput405413 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405415 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-action-for-deployment-type-exception ([input] (response-unsupported-action-for-deployment-type-exception nil input)) ([resultWrapper405417 input] (clojure.core/let [rawinput405416 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar405418 {}] (clojure.core/cond-> {}))))

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
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-group-info/ecs-services (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-service-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-group-info/compute-platform :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-set :portkey.aws.codedeploy.deployment-group-info/last-successful-deployment :portkey.aws.codedeploy.deployment-group-info/last-attempted-deployment :portkey.aws.codedeploy.deployment-group-info/blue-green-deployment-configuration :portkey.aws.codedeploy.deployment-group-info/on-premises-tag-set :portkey.aws.codedeploy.deployment-group-info/application-name :portkey.aws.codedeploy.deployment-group-info/deployment-config-name :portkey.aws.codedeploy.deployment-group-info/ec-2-tag-filters :portkey.aws.codedeploy.deployment-group-info/auto-rollback-configuration :portkey.aws.codedeploy.deployment-group-info/deployment-style :portkey.aws.codedeploy.deployment-group-info/auto-scaling-groups :portkey.aws.codedeploy.deployment-group-info/trigger-configurations :portkey.aws.codedeploy.deployment-group-info/deployment-group-name :portkey.aws.codedeploy.deployment-group-info/service-role-arn :portkey.aws.codedeploy.deployment-group-info/load-balancer-info :portkey.aws.codedeploy.deployment-group-info/alarm-configuration :portkey.aws.codedeploy.deployment-group-info/on-premises-instance-tag-filters :portkey.aws.codedeploy.deployment-group-info/deployment-group-id :portkey.aws.codedeploy.deployment-group-info/target-revision :portkey.aws.codedeploy.deployment-group-info/ecs-services]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-label #{"Blue" "Green" :green :blue})

(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/identifer (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-identifier))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/desired-count (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/pending-count (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/running-count (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-count))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/status (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/traffic-weight (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-weight))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/target-group (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-task-set/task-set-label (clojure.spec.alpha/and :portkey.aws.codedeploy/target-label))
(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-task-set (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.ecs-task-set/identifer :portkey.aws.codedeploy.ecs-task-set/desired-count :portkey.aws.codedeploy.ecs-task-set/pending-count :portkey.aws.codedeploy.ecs-task-set/running-count :portkey.aws.codedeploy.ecs-task-set/status :portkey.aws.codedeploy.ecs-task-set/traffic-weight :portkey.aws.codedeploy.ecs-task-set/target-group :portkey.aws.codedeploy.ecs-task-set/task-set-label]))

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
(clojure.spec.alpha/def :portkey.aws.codedeploy.create-deployment-group-input/ecs-services (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-service-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/create-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.create-deployment-group-input/application-name :portkey.aws.codedeploy.create-deployment-group-input/deployment-group-name :portkey.aws.codedeploy.create-deployment-group-input/service-role-arn] :opt-un [:portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-set :portkey.aws.codedeploy.create-deployment-group-input/blue-green-deployment-configuration :portkey.aws.codedeploy.create-deployment-group-input/on-premises-tag-set :portkey.aws.codedeploy.create-deployment-group-input/deployment-config-name :portkey.aws.codedeploy.create-deployment-group-input/ec-2-tag-filters :portkey.aws.codedeploy.create-deployment-group-input/auto-rollback-configuration :portkey.aws.codedeploy.create-deployment-group-input/deployment-style :portkey.aws.codedeploy.create-deployment-group-input/auto-scaling-groups :portkey.aws.codedeploy.create-deployment-group-input/trigger-configurations :portkey.aws.codedeploy.create-deployment-group-input/load-balancer-info :portkey.aws.codedeploy.create-deployment-group-input/alarm-configuration :portkey.aws.codedeploy.create-deployment-group-input/on-premises-instance-tag-filters :portkey.aws.codedeploy.create-deployment-group-input/ecs-services]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/traffic-weight clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target-type #{:lambda-target "ECSTarget" :instance-target "LambdaTarget" :ecs-target "InstanceTarget"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-output/deployment-group-info (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-info))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-group-output/deployment-group-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/filter-value-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/filter-value))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-action #{:terminate :keep-alive "TERMINATE" "KEEP_ALIVE"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-target-group-pair-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target-list-size-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/raw-string-content (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-config-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-status-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-service/service-name (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-service-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-service/cluster-name (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-cluster-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-service (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.ecs-service/service-name :portkey.aws.codedeploy.ecs-service/cluster-name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/instance-status-filter (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-status-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-instances-input/instance-type-filter (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-type-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-instances-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.list-deployment-instances-input/deployment-id] :opt-un [:portkey.aws.codedeploy.list-deployment-instances-input/next-token :portkey.aws.codedeploy.list-deployment-instances-input/instance-status-filter :portkey.aws.codedeploy.list-deployment-instances-input/instance-type-filter]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-wait-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-targets-output/deployment-targets (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-target-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-deployment-targets-output/deployment-targets]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-id-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/target-id))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/listener-arn-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/listener-arn))

(clojure.spec.alpha/def :portkey.aws.codedeploy.minimum-healthy-hosts/value (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts-value))
(clojure.spec.alpha/def :portkey.aws.codedeploy.minimum-healthy-hosts/type (clojure.spec.alpha/and :portkey.aws.codedeploy/minimum-healthy-hosts-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/minimum-healthy-hosts (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.minimum-healthy-hosts/value :portkey.aws.codedeploy.minimum-healthy-hosts/type]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-arn-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/target-id (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/target-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/target-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/last-updated-at (clojure.spec.alpha/and :portkey.aws.codedeploy/time))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/lifecycle-events (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/status (clojure.spec.alpha/and :portkey.aws.codedeploy/target-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.ecs-target/task-sets-info (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-task-set-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.ecs-target/deployment-id :portkey.aws.codedeploy.ecs-target/target-id :portkey.aws.codedeploy.ecs-target/target-arn :portkey.aws.codedeploy.ecs-target/last-updated-at :portkey.aws.codedeploy.ecs-target/lifecycle-events :portkey.aws.codedeploy.ecs-target/status :portkey.aws.codedeploy.ecs-target/task-sets-info]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-config-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-target-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-target-filter-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/minimum-healthy-hosts-value clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-arn (clojure.spec.alpha/and clojure.core/string?))

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
(clojure.spec.alpha/def :portkey.aws.codedeploy.revision-location/app-spec-content (clojure.spec.alpha/and :portkey.aws.codedeploy/app-spec-content))
(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.revision-location/revision-type :portkey.aws.codedeploy.revision-location/s-3-location :portkey.aws.codedeploy.revision-location/git-hub-location :portkey.aws.codedeploy.revision-location/string :portkey.aws.codedeploy.revision-location/app-spec-content]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-output/status (clojure.spec.alpha/and :portkey.aws.codedeploy/stop-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.stop-deployment-output/status-message (clojure.spec.alpha/and :portkey.aws.codedeploy/message))
(clojure.spec.alpha/def :portkey.aws.codedeploy/stop-deployment-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.stop-deployment-output/status :portkey.aws.codedeploy.stop-deployment-output/status-message]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/sort-order #{:descending :ascending "descending" "ascending"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-filter-type #{:value-only :key-only "KEY_ONLY" "VALUE_ONLY" :key-and-value "KEY_AND_VALUE"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-output/hooks-not-cleaned-up (clojure.spec.alpha/and :portkey.aws.codedeploy/auto-scaling-group-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/update-deployment-group-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.update-deployment-group-output/hooks-not-cleaned-up]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/target-id (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/target-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/target-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/status (clojure.spec.alpha/and :portkey.aws.codedeploy/target-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/last-updated-at (clojure.spec.alpha/and :portkey.aws.codedeploy/time))
(clojure.spec.alpha/def :portkey.aws.codedeploy.lambda-target/lifecycle-events (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/lambda-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.lambda-target/deployment-id :portkey.aws.codedeploy.lambda-target/target-id :portkey.aws.codedeploy.lambda-target/target-arn :portkey.aws.codedeploy.lambda-target/status :portkey.aws.codedeploy.lambda-target/last-updated-at :portkey.aws.codedeploy.lambda-target/lifecycle-events]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-targets-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-targets-input/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-targets-input/target-filters (clojure.spec.alpha/and :portkey.aws.codedeploy/target-filters))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-targets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-targets-input/deployment-id :portkey.aws.codedeploy.list-deployment-targets-input/next-token :portkey.aws.codedeploy.list-deployment-targets-input/target-filters]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/compute-platform #{:lambda :server :ecs "ECS" "Lambda" "Server"})

(clojure.spec.alpha/def :portkey.aws.codedeploy.green-fleet-provisioning-option/action (clojure.spec.alpha/and :portkey.aws.codedeploy/green-fleet-provisioning-action))
(clojure.spec.alpha/def :portkey.aws.codedeploy/green-fleet-provisioning-option (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.green-fleet-provisioning-option/action]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.load-balancer-info/elb-info-list (clojure.spec.alpha/and :portkey.aws.codedeploy/elb-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.load-balancer-info/target-group-info-list (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.load-balancer-info/target-group-pair-info-list (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-pair-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/load-balancer-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.load-balancer-info/elb-info-list :portkey.aws.codedeploy.load-balancer-info/target-group-info-list :portkey.aws.codedeploy.load-balancer-info/target-group-pair-info-list]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.delete-deployment-config-input/deployment-config-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-config-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/delete-deployment-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.delete-deployment-config-input/deployment-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/revision-location))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.app-spec-content/content (clojure.spec.alpha/and :portkey.aws.codedeploy/raw-string-content))
(clojure.spec.alpha/def :portkey.aws.codedeploy.app-spec-content/sha-256 (clojure.spec.alpha/and :portkey.aws.codedeploy/raw-string-sha-256))
(clojure.spec.alpha/def :portkey.aws.codedeploy/app-spec-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.app-spec-content/content :portkey.aws.codedeploy.app-spec-content/sha-256]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy.target-group-pair-info/target-groups (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-info-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.target-group-pair-info/prod-traffic-route (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-route))
(clojure.spec.alpha/def :portkey.aws.codedeploy.target-group-pair-info/test-traffic-route (clojure.spec.alpha/and :portkey.aws.codedeploy/traffic-route))
(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-pair-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.target-group-pair-info/target-groups :portkey.aws.codedeploy.target-group-pair-info/prod-traffic-route :portkey.aws.codedeploy.target-group-pair-info/test-traffic-route]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-already-started-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/commit-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/instance-name (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/iam-session-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-session-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.register-on-premises-instance-input/iam-user-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/iam-user-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy/register-on-premises-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.register-on-premises-instance-input/instance-name] :opt-un [:portkey.aws.codedeploy.register-on-premises-instance-input/iam-session-arn :portkey.aws.codedeploy.register-on-premises-instance-input/iam-user-arn]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-service-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/ecs-service))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-targets-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployment-targets-input/target-ids (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployment-targets-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.batch-get-deployment-targets-input/deployment-id :portkey.aws.codedeploy.batch-get-deployment-targets-input/target-ids]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/instance-name))

(clojure.spec.alpha/def :portkey.aws.codedeploy/tag-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/tag))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-cluster-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/green-fleet-provisioning-action #{"DISCOVER_EXISTING" "COPY_AUTO_SCALING_GROUP" :discover-existing :copy-auto-scaling-group})

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-input/deployment-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-target-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-tag-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-task-set-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/ecs-task-set))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-filter-name #{"ServerInstanceLabel" "TargetStatus" :target-status :server-instance-label})

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-instance-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/alarm-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/alarm))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-group-input/deployment-group-name (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-group-input/application-name :portkey.aws.codedeploy.get-deployment-group-input/deployment-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/auto-rollback-events-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/auto-rollback-event))

(clojure.spec.alpha/def :portkey.aws.codedeploy.traffic-route/listener-arns (clojure.spec.alpha/and :portkey.aws.codedeploy/listener-arn-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/traffic-route (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.traffic-route/listener-arns]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/trigger-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-target))

(clojure.spec.alpha/def :portkey.aws.codedeploy/error-code #{:invalid-lambda-configuration :elb-invalid-instance "ALARM_ACTIVE" :missing-blue-green-deployment-configuration :iam-role-missing :invalid-lambda-function "IAM_ROLE_PERMISSIONS" "REVISION_MISSING" :invalid-revision :agent-issue "ELB_INVALID_INSTANCE" "NO_EC2_SUBSCRIPTION" :hook-execution-failure "TIMEOUT" :internal-error "HEALTH_CONSTRAINTS" :iam-role-permissions "IAM_ROLE_MISSING" :invalid-ecs-service "DEPLOYMENT_GROUP_MISSING" "HEALTH_CONSTRAINTS_INVALID" :deployment-group-missing :alarm-active :autoscaling-validation-error :ecs-update-error "AUTOSCALING_VALIDATION_ERROR" "INTERNAL_ERROR" "INVALID_ECS_SERVICE" "NO_INSTANCES" "ECS_UPDATE_ERROR" "ELASTIC_LOAD_BALANCING_INVALID" "MISSING_BLUE_GREEN_DEPLOYMENT_CONFIGURATION" "AGENT_ISSUE" :health-constraints-invalid :health-constraints "INVALID_REVISION" :manual-stop :no-instances "MANUAL_STOP" "OVER_MAX_INSTANCES" :throttled :over-max-instances "HOOK_EXECUTION_FAILURE" "MISSING_ELB_INFORMATION" :application-missing :auto-scaling-configuration :timeout "AUTO_SCALING_CONFIGURATION" :missing-elb-information "INVALID_LAMBDA_FUNCTION" :no-ec-2-subscription "APPLICATION_MISSING" "INVALID_LAMBDA_CONFIGURATION" :revision-missing :elastic-load-balancing-invalid "MISSING_GITHUB_TOKEN" "THROTTLED" :missing-github-token :auto-scaling-iam-role-permissions "AUTO_SCALING_IAM_ROLE_PERMISSIONS"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-does-not-exist-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-file-exists-behavior-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/applications-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/application-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/listener-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-task-set-status (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-deployment-target-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-service-mapping-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/application-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.codedeploy/duration clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-location-type #{:s-3 :app-spec-content :git-hub "AppSpecContent" :string "String" "GitHub" "S3"})

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-service-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-deployments-input/deployment-ids (clojure.spec.alpha/and :portkey.aws.codedeploy/deployments-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-deployments-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-deployments-input/deployment-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/description-too-long-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/script-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-creator #{:autoscaling "user" :code-deploy-rollback "codeDeployRollback" :user "autoscaling"})

(clojure.spec.alpha/def :portkey.aws.codedeploy/revision-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/revision-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/operation-not-supported-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-targets-output/target-ids (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-deployment-targets-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-deployment-targets-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-deployment-targets-output/target-ids :portkey.aws.codedeploy.list-deployment-targets-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-filters (clojure.spec.alpha/map-of :portkey.aws.codedeploy/target-filter-name :portkey.aws.codedeploy/filter-value-list))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/target-id (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/target-arn (clojure.spec.alpha/and :portkey.aws.codedeploy/target-arn))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/status (clojure.spec.alpha/and :portkey.aws.codedeploy/target-status))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/last-updated-at (clojure.spec.alpha/and :portkey.aws.codedeploy/time))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/lifecycle-events (clojure.spec.alpha/and :portkey.aws.codedeploy/lifecycle-event-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.instance-target/instance-label (clojure.spec.alpha/and :portkey.aws.codedeploy/target-label))
(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.instance-target/deployment-id :portkey.aws.codedeploy.instance-target/target-id :portkey.aws.codedeploy.instance-target/target-arn :portkey.aws.codedeploy.instance-target/status :portkey.aws.codedeploy.instance-target/last-updated-at :portkey.aws.codedeploy.instance-target/lifecycle-events :portkey.aws.codedeploy.instance-target/instance-label]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-target-output/deployment-target (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-target))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-target-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-target-output/deployment-target]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target-id-required-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.codedeploy.update-deployment-group-input/ecs-services (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-service-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/update-deployment-group-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.update-deployment-group-input/application-name :portkey.aws.codedeploy.update-deployment-group-input/current-deployment-group-name] :opt-un [:portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-set :portkey.aws.codedeploy.update-deployment-group-input/blue-green-deployment-configuration :portkey.aws.codedeploy.update-deployment-group-input/on-premises-tag-set :portkey.aws.codedeploy.update-deployment-group-input/deployment-config-name :portkey.aws.codedeploy.update-deployment-group-input/ec-2-tag-filters :portkey.aws.codedeploy.update-deployment-group-input/new-deployment-group-name :portkey.aws.codedeploy.update-deployment-group-input/auto-rollback-configuration :portkey.aws.codedeploy.update-deployment-group-input/deployment-style :portkey.aws.codedeploy.update-deployment-group-input/auto-scaling-groups :portkey.aws.codedeploy.update-deployment-group-input/trigger-configurations :portkey.aws.codedeploy.update-deployment-group-input/service-role-arn :portkey.aws.codedeploy.update-deployment-group-input/load-balancer-info :portkey.aws.codedeploy.update-deployment-group-input/alarm-configuration :portkey.aws.codedeploy.update-deployment-group-input/on-premises-instance-tag-filters :portkey.aws.codedeploy.update-deployment-group-input/ecs-services]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-target/deployment-target-type (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-target-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-target/instance-target (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-target))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-target/lambda-target (clojure.spec.alpha/and :portkey.aws.codedeploy/lambda-target))
(clojure.spec.alpha/def :portkey.aws.codedeploy.deployment-target/ecs-target (clojure.spec.alpha/and :portkey.aws.codedeploy/ecs-target))
(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-target (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.deployment-target/deployment-target-type :portkey.aws.codedeploy.deployment-target/instance-target :portkey.aws.codedeploy.deployment-target/lambda-target :portkey.aws.codedeploy.deployment-target/ecs-target]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-status #{"Failed" :ready "Skipped" :in-progress :unknown "Succeeded" :pending "Ready" "Unknown" :skipped "InProgress" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy/lifecycle-event-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-pair-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/target-group-pair-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-status #{"Failed" :ready "Skipped" :in-progress :unknown "Succeeded" :pending "Ready" "Unknown" :skipped "InProgress" "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-ecs-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

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
(clojure.spec.alpha/def :portkey.aws.codedeploy.continue-deployment-input/deployment-wait-type (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-wait-type))
(clojure.spec.alpha/def :portkey.aws.codedeploy/continue-deployment-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.continue-deployment-input/deployment-id :portkey.aws.codedeploy.continue-deployment-input/deployment-wait-type]))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/filter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-target-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-target-input/target-id (clojure.spec.alpha/and :portkey.aws.codedeploy/target-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-target-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.get-deployment-target-input/deployment-id :portkey.aws.codedeploy.get-deployment-target-input/target-id]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/iam-session-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/invalid-target-instances-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-task-set-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.codedeploy.list-git-hub-account-token-names-output/token-name-list (clojure.spec.alpha/and :portkey.aws.codedeploy/git-hub-account-token-name-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy.list-git-hub-account-token-names-output/next-token (clojure.spec.alpha/and :portkey.aws.codedeploy/next-token))
(clojure.spec.alpha/def :portkey.aws.codedeploy/list-git-hub-account-token-names-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.list-git-hub-account-token-names-output/token-name-list :portkey.aws.codedeploy.list-git-hub-account-token-names-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-instance-input/deployment-id (clojure.spec.alpha/and :portkey.aws.codedeploy/deployment-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy.get-deployment-instance-input/instance-id (clojure.spec.alpha/and :portkey.aws.codedeploy/instance-id))
(clojure.spec.alpha/def :portkey.aws.codedeploy/get-deployment-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.get-deployment-instance-input/deployment-id :portkey.aws.codedeploy.get-deployment-instance-input/instance-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-linear/linear-percentage (clojure.spec.alpha/and :portkey.aws.codedeploy/percentage))
(clojure.spec.alpha/def :portkey.aws.codedeploy.time-based-linear/linear-interval (clojure.spec.alpha/and :portkey.aws.codedeploy/wait-time-in-mins))
(clojure.spec.alpha/def :portkey.aws.codedeploy/time-based-linear (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.time-based-linear/linear-percentage :portkey.aws.codedeploy.time-based-linear/linear-interval]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/ecs-task-set-identifier (clojure.spec.alpha/and clojure.core/string?))

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

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-wait-type #{:ready-wait "READY_WAIT" "TERMINATION_WAIT" :termination-wait})

(clojure.spec.alpha/def :portkey.aws.codedeploy.target-group-info/name (clojure.spec.alpha/and :portkey.aws.codedeploy/target-group-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy/target-group-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.codedeploy.target-group-info/name]))

(clojure.spec.alpha/def :portkey.aws.codedeploy/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.codedeploy/instance-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.codedeploy/deployment-group-info-list (clojure.spec.alpha/coll-of :portkey.aws.codedeploy/deployment-group-info))

(clojure.spec.alpha/def :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-input/application-name (clojure.spec.alpha/and :portkey.aws.codedeploy/application-name))
(clojure.spec.alpha/def :portkey.aws.codedeploy.batch-get-application-revisions-input/revisions (clojure.spec.alpha/and :portkey.aws.codedeploy/revision-location-list))
(clojure.spec.alpha/def :portkey.aws.codedeploy/batch-get-application-revisions-input (clojure.spec.alpha/keys :req-un [:portkey.aws.codedeploy.batch-get-application-revisions-input/application-name :portkey.aws.codedeploy.batch-get-application-revisions-input/revisions] :opt-un []))

(clojure.core/defn register-on-premises-instance "Registers an on-premises instance.\n Only one IAM ARN (an IAM session ARN or IAM user ARN) is supported in the\nrequest. You cannot use both." ([register-on-premises-instance-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-on-premises-instance-input register-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/register-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterOnPremisesInstance", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"IamUserArnAlreadyRegisteredException" :portkey.aws.codedeploy/iam-user-arn-already-registered-exception, "InvalidIamUserArnException" :portkey.aws.codedeploy/invalid-iam-user-arn-exception, "IamArnRequiredException" :portkey.aws.codedeploy/iam-arn-required-exception, "IamUserArnRequiredException" :portkey.aws.codedeploy/iam-user-arn-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "IamSessionArnAlreadyRegisteredException" :portkey.aws.codedeploy/iam-session-arn-already-registered-exception, "InvalidIamSessionArnException" :portkey.aws.codedeploy/invalid-iam-session-arn-exception, "MultipleIamArnsProvidedException" :portkey.aws.codedeploy/multiple-iam-arns-provided-exception, "InstanceNameAlreadyRegisteredException" :portkey.aws.codedeploy/instance-name-already-registered-exception}})))))
(clojure.spec.alpha/fdef register-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/register-on-premises-instance-input) :ret clojure.core/true?)

(clojure.core/defn list-deployment-configs "Lists the deployment configurations with the IAM user or AWS account." ([] (list-deployment-configs {})) ([list-deployment-configs-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deployment-configs-input list-deployment-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeploymentConfigs", :http.request.configuration/output-deser-fn response-list-deployment-configs-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-deployment-configs :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-deployment-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-configs-output))

(clojure.core/defn list-applications "Lists the applications registered with the IAM user or AWS account." ([] (list-applications {})) ([list-applications-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-applications-input list-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-applications-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-applications-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApplications", :http.request.configuration/output-deser-fn response-list-applications-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-applications-output))

(clojure.core/defn list-git-hub-account-token-names "Lists the names of stored connections to GitHub accounts." ([] (list-git-hub-account-token-names {})) ([list-git-hub-account-token-names-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-git-hub-account-token-names-input list-git-hub-account-token-names-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-git-hub-account-token-names-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-git-hub-account-token-names-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGitHubAccountTokenNames", :http.request.configuration/output-deser-fn response-list-git-hub-account-token-names-output, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "ResourceValidationException" :portkey.aws.codedeploy/resource-validation-exception, "OperationNotSupportedException" :portkey.aws.codedeploy/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef list-git-hub-account-token-names :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-git-hub-account-token-names-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-git-hub-account-token-names-output))

(clojure.core/defn batch-get-deployment-targets " Returns an array of targets associated with a deployment. This method works\nwith all compute types and should be used instead of the deprecated\nBatchGetDeploymentInstances.\n The type of targets returned depends on the deployment's compute platform:\n * EC2/On-premises: Information about EC2 instance targets.\n * AWS Lambda: Information about Lambda functions targets.\n * Amazon ECS: Information about Amazon ECS service targets." ([] (batch-get-deployment-targets {})) ([batch-get-deployment-targets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-deployment-targets-input batch-get-deployment-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployment-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployment-targets-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetDeploymentTargets", :http.request.configuration/output-deser-fn response-batch-get-deployment-targets-output, :http.request.spec/error-spec {"InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentTargetIdRequiredException" :portkey.aws.codedeploy/deployment-target-id-required-exception, "InvalidDeploymentTargetIdException" :portkey.aws.codedeploy/invalid-deployment-target-id-exception, "DeploymentTargetDoesNotExistException" :portkey.aws.codedeploy/deployment-target-does-not-exist-exception, "DeploymentTargetListSizeExceededException" :portkey.aws.codedeploy/deployment-target-list-size-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployment-targets :args (clojure.spec.alpha/? :portkey.aws.codedeploy/batch-get-deployment-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployment-targets-output))

(clojure.core/defn skip-wait-time-for-instance-termination "In a blue/green deployment, overrides any specified wait time and starts\nterminating instances immediately after the traffic routing is complete." ([] (skip-wait-time-for-instance-termination {})) ([skip-wait-time-for-instance-termination-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-skip-wait-time-for-instance-termination-input skip-wait-time-for-instance-termination-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/skip-wait-time-for-instance-termination-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SkipWaitTimeForInstanceTermination", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentNotStartedException" :portkey.aws.codedeploy/deployment-not-started-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception}})))))
(clojure.spec.alpha/fdef skip-wait-time-for-instance-termination :args (clojure.spec.alpha/? :portkey.aws.codedeploy/skip-wait-time-for-instance-termination-input) :ret clojure.core/true?)

(clojure.core/defn get-deployment "Gets information about a deployment.\n The content property of the appSpecContent object in the returned revision is\nalways null. Use GetApplicationRevision and the sha256 property of the returned\nappSpecContent object to get the content of the deployment’s AppSpec file." ([get-deployment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deployment-input get-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeployment", :http.request.configuration/output-deser-fn response-get-deployment-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-output))

(clojure.core/defn delete-application "Deletes an application." ([delete-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-application-input delete-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-application-input) :ret clojure.core/true?)

(clojure.core/defn delete-git-hub-account-token "Deletes a GitHub account connection." ([] (delete-git-hub-account-token {})) ([delete-git-hub-account-token-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-git-hub-account-token-input delete-git-hub-account-token-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/delete-git-hub-account-token-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-git-hub-account-token-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGitHubAccountToken", :http.request.configuration/output-deser-fn response-delete-git-hub-account-token-output, :http.request.spec/error-spec {"GitHubAccountTokenNameRequiredException" :portkey.aws.codedeploy/git-hub-account-token-name-required-exception, "GitHubAccountTokenDoesNotExistException" :portkey.aws.codedeploy/git-hub-account-token-does-not-exist-exception, "InvalidGitHubAccountTokenNameException" :portkey.aws.codedeploy/invalid-git-hub-account-token-name-exception, "ResourceValidationException" :portkey.aws.codedeploy/resource-validation-exception, "OperationNotSupportedException" :portkey.aws.codedeploy/operation-not-supported-exception}})))))
(clojure.spec.alpha/fdef delete-git-hub-account-token :args (clojure.spec.alpha/? :portkey.aws.codedeploy/delete-git-hub-account-token-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/delete-git-hub-account-token-output))

(clojure.core/defn get-application-revision "Gets information about an application revision." ([get-application-revision-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-application-revision-input get-application-revision-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-application-revision-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-application-revision-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetApplicationRevision", :http.request.configuration/output-deser-fn response-get-application-revision-output, :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "RevisionDoesNotExistException" :portkey.aws.codedeploy/revision-does-not-exist-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception}})))))
(clojure.spec.alpha/fdef get-application-revision :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-application-revision-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-application-revision-output))

(clojure.core/defn get-deployment-target " Returns information about a deployment target." ([] (get-deployment-target {})) ([get-deployment-target-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deployment-target-input get-deployment-target-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-target-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-target-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeploymentTarget", :http.request.configuration/output-deser-fn response-get-deployment-target-output, :http.request.spec/error-spec {"InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentTargetIdRequiredException" :portkey.aws.codedeploy/deployment-target-id-required-exception, "InvalidDeploymentTargetIdException" :portkey.aws.codedeploy/invalid-deployment-target-id-exception, "DeploymentTargetDoesNotExistException" :portkey.aws.codedeploy/deployment-target-does-not-exist-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef get-deployment-target :args (clojure.spec.alpha/? :portkey.aws.codedeploy/get-deployment-target-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-target-output))

(clojure.core/defn register-application-revision "Registers with AWS CodeDeploy a revision for the specified application." ([register-application-revision-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-register-application-revision-input register-application-revision-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/register-application-revision-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RegisterApplicationRevision", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DescriptionTooLongException" :portkey.aws.codedeploy/description-too-long-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception}})))))
(clojure.spec.alpha/fdef register-application-revision :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/register-application-revision-input) :ret clojure.core/true?)

(clojure.core/defn stop-deployment "Attempts to stop an ongoing deployment." ([stop-deployment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-deployment-input stop-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/stop-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/stop-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopDeployment", :http.request.configuration/output-deser-fn response-stop-deployment-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception}})))))
(clojure.spec.alpha/fdef stop-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/stop-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/stop-deployment-output))

(clojure.core/defn batch-get-deployment-instances " This method works, but is deprecated. Use BatchGetDeploymentTargets instead.\n Returns an array of instances associated with a deployment. This method works\nwith EC2/On-premises and AWS Lambda compute platforms. The newer\nBatchGetDeploymentTargets works with all compute platforms." ([batch-get-deployment-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-deployment-instances-input batch-get-deployment-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployment-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployment-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetDeploymentInstances", :http.request.configuration/output-deser-fn response-batch-get-deployment-instances-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InstanceIdRequiredException" :portkey.aws.codedeploy/instance-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployment-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployment-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployment-instances-output))

(clojure.core/defn list-deployment-instances " The newer BatchGetDeploymentTargets should be used instead because it works\nwith all compute types. ListDeploymentInstances throws an exception if it is\nused with a compute platform other than EC2/On-premises or AWS Lambda.\n Lists the instance for a deployment associated with the IAM user or AWS\naccount." ([list-deployment-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deployment-instances-input list-deployment-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeploymentInstances", :http.request.configuration/output-deser-fn response-list-deployment-instances-output, :http.request.spec/error-spec {"InvalidInstanceStatusException" :portkey.aws.codedeploy/invalid-instance-status-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception, "DeploymentNotStartedException" :portkey.aws.codedeploy/deployment-not-started-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InvalidTargetFilterNameException" :portkey.aws.codedeploy/invalid-target-filter-name-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InvalidInstanceTypeException" :portkey.aws.codedeploy/invalid-instance-type-exception, "InvalidDeploymentInstanceTypeException" :portkey.aws.codedeploy/invalid-deployment-instance-type-exception}})))))
(clojure.spec.alpha/fdef list-deployment-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-deployment-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-instances-output))

(clojure.core/defn create-deployment "Deploys an application revision through the specified deployment group." ([create-deployment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-deployment-input create-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDeployment", :http.request.configuration/output-deser-fn response-create-deployment-output, :http.request.spec/error-spec {"InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidGitHubAccountTokenException" :portkey.aws.codedeploy/invalid-git-hub-account-token-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentLimitExceededException" :portkey.aws.codedeploy/deployment-limit-exceeded-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "RevisionDoesNotExistException" :portkey.aws.codedeploy/revision-does-not-exist-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "InvalidFileExistsBehaviorException" :portkey.aws.codedeploy/invalid-file-exists-behavior-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidUpdateOutdatedInstancesOnlyValueException" :portkey.aws.codedeploy/invalid-update-outdated-instances-only-value-exception, "DescriptionTooLongException" :portkey.aws.codedeploy/description-too-long-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidIgnoreApplicationStopFailuresValueException" :portkey.aws.codedeploy/invalid-ignore-application-stop-failures-value-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "ThrottlingException" :portkey.aws.codedeploy/throttling-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidTargetInstancesException" :portkey.aws.codedeploy/invalid-target-instances-exception}})))))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-output))

(clojure.core/defn put-lifecycle-event-hook-execution-status " Sets the result of a Lambda validation function. The function validates one or\nboth lifecycle events (BeforeAllowTraffic and AfterAllowTraffic) and returns\nSucceeded or Failed." ([] (put-lifecycle-event-hook-execution-status {})) ([put-lifecycle-event-hook-execution-status-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-lifecycle-event-hook-execution-status-input put-lifecycle-event-hook-execution-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLifecycleEventHookExecutionStatus", :http.request.configuration/output-deser-fn response-put-lifecycle-event-hook-execution-status-output, :http.request.spec/error-spec {"InvalidLifecycleEventHookExecutionStatusException" :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-status-exception, "InvalidLifecycleEventHookExecutionIdException" :portkey.aws.codedeploy/invalid-lifecycle-event-hook-execution-id-exception, "LifecycleEventAlreadyCompletedException" :portkey.aws.codedeploy/lifecycle-event-already-completed-exception, "DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception}})))))
(clojure.spec.alpha/fdef put-lifecycle-event-hook-execution-status :args (clojure.spec.alpha/? :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/put-lifecycle-event-hook-execution-status-output))

(clojure.core/defn deregister-on-premises-instance "Deregisters an on-premises instance." ([deregister-on-premises-instance-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-deregister-on-premises-instance-input deregister-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/deregister-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeregisterOnPremisesInstance", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef deregister-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/deregister-on-premises-instance-input) :ret clojure.core/true?)

(clojure.core/defn delete-deployment-config "Deletes a deployment configuration.\n A deployment configuration cannot be deleted if it is currently in use.\nPredefined configurations cannot be deleted." ([delete-deployment-config-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-deployment-config-input delete-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDeploymentConfig", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigInUseException" :portkey.aws.codedeploy/deployment-config-in-use-exception, "InvalidOperationException" :portkey.aws.codedeploy/invalid-operation-exception}})))))
(clojure.spec.alpha/fdef delete-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-deployment-config-input) :ret clojure.core/true?)

(clojure.core/defn list-application-revisions "Lists information about revisions for an application." ([list-application-revisions-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-application-revisions-input list-application-revisions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-application-revisions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-application-revisions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListApplicationRevisions", :http.request.configuration/output-deser-fn response-list-application-revisions-output, :http.request.spec/error-spec {"InvalidSortByException" :portkey.aws.codedeploy/invalid-sort-by-exception, "InvalidBucketNameFilterException" :portkey.aws.codedeploy/invalid-bucket-name-filter-exception, "BucketNameFilterRequiredException" :portkey.aws.codedeploy/bucket-name-filter-required-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "InvalidDeployedStateFilterException" :portkey.aws.codedeploy/invalid-deployed-state-filter-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidKeyPrefixFilterException" :portkey.aws.codedeploy/invalid-key-prefix-filter-exception, "InvalidSortOrderException" :portkey.aws.codedeploy/invalid-sort-order-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception}})))))
(clojure.spec.alpha/fdef list-application-revisions :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-application-revisions-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-application-revisions-output))

(clojure.core/defn batch-get-on-premises-instances "Gets information about one or more on-premises instances." ([batch-get-on-premises-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-on-premises-instances-input batch-get-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-on-premises-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetOnPremisesInstances", :http.request.configuration/output-deser-fn response-batch-get-on-premises-instances-output, :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-on-premises-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-on-premises-instances-output))

(clojure.core/defn list-deployment-groups "Lists the deployment groups for an application registered with the IAM user or\nAWS account." ([list-deployment-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deployment-groups-input list-deployment-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeploymentGroups", :http.request.configuration/output-deser-fn response-list-deployment-groups-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-deployment-groups :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/list-deployment-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-groups-output))

(clojure.core/defn get-application "Gets information about an application." ([get-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-application-input get-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-application-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetApplication", :http.request.configuration/output-deser-fn response-get-application-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-application-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-application-output))

(clojure.core/defn get-deployment-config "Gets information about a deployment configuration." ([get-deployment-config-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deployment-config-input get-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeploymentConfig", :http.request.configuration/output-deser-fn response-get-deployment-config-output, :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception}})))))
(clojure.spec.alpha/fdef get-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-config-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-config-output))

(clojure.core/defn list-deployments "Lists the deployments in a deployment group for an application registered with\nthe IAM user or AWS account." ([] (list-deployments {})) ([list-deployments-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deployments-input list-deployments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployments-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployments-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeployments", :http.request.configuration/output-deser-fn response-list-deployments-output, :http.request.spec/error-spec {"InvalidDeploymentStatusException" :portkey.aws.codedeploy/invalid-deployment-status-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidTimeRangeException" :portkey.aws.codedeploy/invalid-time-range-exception}})))))
(clojure.spec.alpha/fdef list-deployments :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-deployments-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployments-output))

(clojure.core/defn update-application "Changes the name of an application." ([] (update-application {})) ([update-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-application-input update-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/update-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateApplication", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationAlreadyExistsException" :portkey.aws.codedeploy/application-already-exists-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/? :portkey.aws.codedeploy/update-application-input) :ret clojure.core/true?)

(clojure.core/defn create-deployment-group "Creates a deployment group to which application revisions are deployed." ([create-deployment-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-deployment-group-input create-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDeploymentGroup", :http.request.configuration/output-deser-fn response-create-deployment-group-output, :http.request.spec/error-spec {"InvalidTargetGroupPairException" :portkey.aws.codedeploy/invalid-target-group-pair-exception, "DeploymentGroupAlreadyExistsException" :portkey.aws.codedeploy/deployment-group-already-exists-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidTriggerConfigException" :portkey.aws.codedeploy/invalid-trigger-config-exception, "InvalidOnPremisesTagCombinationException" :portkey.aws.codedeploy/invalid-on-premises-tag-combination-exception, "InvalidEC2TagException" :portkey.aws.codedeploy/invalid-ec-2-tag-exception, "InvalidDeploymentStyleException" :portkey.aws.codedeploy/invalid-deployment-style-exception, "LifecycleHookLimitExceededException" :portkey.aws.codedeploy/lifecycle-hook-limit-exceeded-exception, "TriggerTargetsLimitExceededException" :portkey.aws.codedeploy/trigger-targets-limit-exceeded-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentGroupLimitExceededException" :portkey.aws.codedeploy/deployment-group-limit-exceeded-exception, "InvalidEC2TagCombinationException" :portkey.aws.codedeploy/invalid-ec-2-tag-combination-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "ECSServiceMappingLimitExceededException" :portkey.aws.codedeploy/ecs-service-mapping-limit-exceeded-exception, "InvalidInputException" :portkey.aws.codedeploy/invalid-input-exception, "TagSetListLimitExceededException" :portkey.aws.codedeploy/tag-set-list-limit-exceeded-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidBlueGreenDeploymentConfigurationException" :portkey.aws.codedeploy/invalid-blue-green-deployment-configuration-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "InvalidECSServiceException" :portkey.aws.codedeploy/invalid-ecs-service-exception, "ThrottlingException" :portkey.aws.codedeploy/throttling-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "RoleRequiredException" :portkey.aws.codedeploy/role-required-exception, "InvalidAlarmConfigException" :portkey.aws.codedeploy/invalid-alarm-config-exception, "AlarmsLimitExceededException" :portkey.aws.codedeploy/alarms-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-group-output))

(clojure.core/defn create-application "Creates an application." ([create-application-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-application-input create-application-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-application-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-application-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateApplication", :http.request.configuration/output-deser-fn response-create-application-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationAlreadyExistsException" :portkey.aws.codedeploy/application-already-exists-exception, "ApplicationLimitExceededException" :portkey.aws.codedeploy/application-limit-exceeded-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-application-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-application-output))

(clojure.core/defn get-deployment-instance "Gets information about an instance as part of a deployment." ([get-deployment-instance-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deployment-instance-input get-deployment-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeploymentInstance", :http.request.configuration/output-deser-fn response-get-deployment-instance-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "InstanceIdRequiredException" :portkey.aws.codedeploy/instance-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InstanceDoesNotExistException" :portkey.aws.codedeploy/instance-does-not-exist-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception}})))))
(clojure.spec.alpha/fdef get-deployment-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-instance-output))

(clojure.core/defn remove-tags-from-on-premises-instances "Removes one or more tags from one or more on-premises instances." ([remove-tags-from-on-premises-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-from-on-premises-instances-input remove-tags-from-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/remove-tags-from-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromOnPremisesInstances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "TagRequiredException" :portkey.aws.codedeploy/tag-required-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.codedeploy/tag-limit-exceeded-exception, "InstanceLimitExceededException" :portkey.aws.codedeploy/instance-limit-exceeded-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/remove-tags-from-on-premises-instances-input) :ret clojure.core/true?)

(clojure.core/defn batch-get-deployments "Gets information about one or more deployments." ([batch-get-deployments-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-deployments-input batch-get-deployments-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployments-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployments-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetDeployments", :http.request.configuration/output-deser-fn response-batch-get-deployments-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployments :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployments-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployments-output))

(clojure.core/defn batch-get-application-revisions "Gets information about one or more application revisions." ([batch-get-application-revisions-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-application-revisions-input batch-get-application-revisions-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-application-revisions-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-application-revisions-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetApplicationRevisions", :http.request.configuration/output-deser-fn response-batch-get-application-revisions-output, :http.request.spec/error-spec {"ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "RevisionRequiredException" :portkey.aws.codedeploy/revision-required-exception, "InvalidRevisionException" :portkey.aws.codedeploy/invalid-revision-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-application-revisions :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-application-revisions-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-application-revisions-output))

(clojure.core/defn list-deployment-targets " Returns an array of target IDs that are associated a deployment." ([] (list-deployment-targets {})) ([list-deployment-targets-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-deployment-targets-input list-deployment-targets-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-deployment-targets-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-deployment-targets-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDeploymentTargets", :http.request.configuration/output-deser-fn response-list-deployment-targets-output, :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentNotStartedException" :portkey.aws.codedeploy/deployment-not-started-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "InvalidInstanceStatusException" :portkey.aws.codedeploy/invalid-instance-status-exception, "InvalidInstanceTypeException" :portkey.aws.codedeploy/invalid-instance-type-exception, "InvalidDeploymentInstanceTypeException" :portkey.aws.codedeploy/invalid-deployment-instance-type-exception}})))))
(clojure.spec.alpha/fdef list-deployment-targets :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-deployment-targets-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-deployment-targets-output))

(clojure.core/defn delete-deployment-group "Deletes a deployment group." ([delete-deployment-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-deployment-group-input delete-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/delete-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/delete-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDeploymentGroup", :http.request.configuration/output-deser-fn response-delete-deployment-group-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception}})))))
(clojure.spec.alpha/fdef delete-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/delete-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/delete-deployment-group-output))

(clojure.core/defn batch-get-applications "Gets information about one or more applications." ([batch-get-applications-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-applications-input batch-get-applications-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-applications-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-applications-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetApplications", :http.request.configuration/output-deser-fn response-batch-get-applications-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef batch-get-applications :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-applications-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-applications-output))

(clojure.core/defn get-on-premises-instance " Gets information about an on-premises instance." ([get-on-premises-instance-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-on-premises-instance-input get-on-premises-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-on-premises-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-on-premises-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetOnPremisesInstance", :http.request.configuration/output-deser-fn response-get-on-premises-instance-output, :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception}})))))
(clojure.spec.alpha/fdef get-on-premises-instance :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-on-premises-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-on-premises-instance-output))

(clojure.core/defn batch-get-deployment-groups "Gets information about one or more deployment groups." ([batch-get-deployment-groups-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-get-deployment-groups-input batch-get-deployment-groups-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/batch-get-deployment-groups-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/batch-get-deployment-groups-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetDeploymentGroups", :http.request.configuration/output-deser-fn response-batch-get-deployment-groups-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "BatchLimitExceededException" :portkey.aws.codedeploy/batch-limit-exceeded-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef batch-get-deployment-groups :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/batch-get-deployment-groups-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/batch-get-deployment-groups-output))

(clojure.core/defn list-on-premises-instances "Gets a list of names for one or more on-premises instances.\n Unless otherwise specified, both registered and deregistered on-premises\ninstance names are listed. To list only registered or deregistered on-premises\ninstance names, use the registration status parameter." ([] (list-on-premises-instances {})) ([list-on-premises-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-on-premises-instances-input list-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/list-on-premises-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/list-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOnPremisesInstances", :http.request.configuration/output-deser-fn response-list-on-premises-instances-output, :http.request.spec/error-spec {"InvalidRegistrationStatusException" :portkey.aws.codedeploy/invalid-registration-status-exception, "InvalidTagFilterException" :portkey.aws.codedeploy/invalid-tag-filter-exception, "InvalidNextTokenException" :portkey.aws.codedeploy/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-on-premises-instances :args (clojure.spec.alpha/? :portkey.aws.codedeploy/list-on-premises-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/list-on-premises-instances-output))

(clojure.core/defn update-deployment-group "Changes information about a deployment group." ([update-deployment-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-deployment-group-input update-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/update-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/update-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDeploymentGroup", :http.request.configuration/output-deser-fn response-update-deployment-group-output, :http.request.spec/error-spec {"InvalidTargetGroupPairException" :portkey.aws.codedeploy/invalid-target-group-pair-exception, "DeploymentGroupAlreadyExistsException" :portkey.aws.codedeploy/deployment-group-already-exists-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "InvalidRoleException" :portkey.aws.codedeploy/invalid-role-exception, "InvalidTriggerConfigException" :portkey.aws.codedeploy/invalid-trigger-config-exception, "InvalidOnPremisesTagCombinationException" :portkey.aws.codedeploy/invalid-on-premises-tag-combination-exception, "InvalidEC2TagException" :portkey.aws.codedeploy/invalid-ec-2-tag-exception, "InvalidDeploymentStyleException" :portkey.aws.codedeploy/invalid-deployment-style-exception, "LifecycleHookLimitExceededException" :portkey.aws.codedeploy/lifecycle-hook-limit-exceeded-exception, "TriggerTargetsLimitExceededException" :portkey.aws.codedeploy/trigger-targets-limit-exceeded-exception, "InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "InvalidEC2TagCombinationException" :portkey.aws.codedeploy/invalid-ec-2-tag-combination-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "ECSServiceMappingLimitExceededException" :portkey.aws.codedeploy/ecs-service-mapping-limit-exceeded-exception, "InvalidInputException" :portkey.aws.codedeploy/invalid-input-exception, "TagSetListLimitExceededException" :portkey.aws.codedeploy/tag-set-list-limit-exceeded-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "InvalidBlueGreenDeploymentConfigurationException" :portkey.aws.codedeploy/invalid-blue-green-deployment-configuration-exception, "InvalidLoadBalancerInfoException" :portkey.aws.codedeploy/invalid-load-balancer-info-exception, "InvalidAutoRollbackConfigException" :portkey.aws.codedeploy/invalid-auto-rollback-config-exception, "InvalidECSServiceException" :portkey.aws.codedeploy/invalid-ecs-service-exception, "ThrottlingException" :portkey.aws.codedeploy/throttling-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception, "InvalidAutoScalingGroupException" :portkey.aws.codedeploy/invalid-auto-scaling-group-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidAlarmConfigException" :portkey.aws.codedeploy/invalid-alarm-config-exception, "AlarmsLimitExceededException" :portkey.aws.codedeploy/alarms-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef update-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/update-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/update-deployment-group-output))

(clojure.core/defn add-tags-to-on-premises-instances "Adds tags to on-premises instances." ([add-tags-to-on-premises-instances-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-to-on-premises-instances-input add-tags-to-on-premises-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/add-tags-to-on-premises-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToOnPremisesInstances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InstanceNameRequiredException" :portkey.aws.codedeploy/instance-name-required-exception, "InvalidInstanceNameException" :portkey.aws.codedeploy/invalid-instance-name-exception, "TagRequiredException" :portkey.aws.codedeploy/tag-required-exception, "InvalidTagException" :portkey.aws.codedeploy/invalid-tag-exception, "TagLimitExceededException" :portkey.aws.codedeploy/tag-limit-exceeded-exception, "InstanceLimitExceededException" :portkey.aws.codedeploy/instance-limit-exceeded-exception, "InstanceNotRegisteredException" :portkey.aws.codedeploy/instance-not-registered-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-on-premises-instances :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/add-tags-to-on-premises-instances-input) :ret clojure.core/true?)

(clojure.core/defn get-deployment-group "Gets information about a deployment group." ([get-deployment-group-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-deployment-group-input get-deployment-group-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/get-deployment-group-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/get-deployment-group-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDeploymentGroup", :http.request.configuration/output-deser-fn response-get-deployment-group-output, :http.request.spec/error-spec {"ApplicationNameRequiredException" :portkey.aws.codedeploy/application-name-required-exception, "InvalidApplicationNameException" :portkey.aws.codedeploy/invalid-application-name-exception, "ApplicationDoesNotExistException" :portkey.aws.codedeploy/application-does-not-exist-exception, "DeploymentGroupNameRequiredException" :portkey.aws.codedeploy/deployment-group-name-required-exception, "InvalidDeploymentGroupNameException" :portkey.aws.codedeploy/invalid-deployment-group-name-exception, "DeploymentGroupDoesNotExistException" :portkey.aws.codedeploy/deployment-group-does-not-exist-exception, "DeploymentConfigDoesNotExistException" :portkey.aws.codedeploy/deployment-config-does-not-exist-exception}})))))
(clojure.spec.alpha/fdef get-deployment-group :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/get-deployment-group-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/get-deployment-group-output))

(clojure.core/defn continue-deployment "For a blue/green deployment, starts the process of rerouting traffic from\ninstances in the original environment to instances in the replacement\nenvironment without waiting for a specified wait time to elapse. (Traffic\nrerouting, which is achieved by registering instances in the replacement\nenvironment with the load balancer, can start as soon as all instances have a\nstatus of Ready.)" ([] (continue-deployment {})) ([continue-deployment-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-continue-deployment-input continue-deployment-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/continue-deployment-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ContinueDeployment", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"DeploymentIdRequiredException" :portkey.aws.codedeploy/deployment-id-required-exception, "DeploymentDoesNotExistException" :portkey.aws.codedeploy/deployment-does-not-exist-exception, "DeploymentAlreadyCompletedException" :portkey.aws.codedeploy/deployment-already-completed-exception, "InvalidDeploymentIdException" :portkey.aws.codedeploy/invalid-deployment-id-exception, "DeploymentIsNotInReadyStateException" :portkey.aws.codedeploy/deployment-is-not-in-ready-state-exception, "UnsupportedActionForDeploymentTypeException" :portkey.aws.codedeploy/unsupported-action-for-deployment-type-exception, "InvalidDeploymentWaitTypeException" :portkey.aws.codedeploy/invalid-deployment-wait-type-exception, "InvalidDeploymentStatusException" :portkey.aws.codedeploy/invalid-deployment-status-exception}})))))
(clojure.spec.alpha/fdef continue-deployment :args (clojure.spec.alpha/? :portkey.aws.codedeploy/continue-deployment-input) :ret clojure.core/true?)

(clojure.core/defn create-deployment-config " Creates a deployment configuration." ([create-deployment-config-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-deployment-config-input create-deployment-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.codedeploy/endpoints, :http.request.configuration/target-prefix "CodeDeploy_20141006", :http.request.spec/output-spec :portkey.aws.codedeploy/create-deployment-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-10-06", :http.request.configuration/service-id "CodeDeploy", :http.request.spec/input-spec :portkey.aws.codedeploy/create-deployment-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDeploymentConfig", :http.request.configuration/output-deser-fn response-create-deployment-config-output, :http.request.spec/error-spec {"InvalidDeploymentConfigNameException" :portkey.aws.codedeploy/invalid-deployment-config-name-exception, "DeploymentConfigNameRequiredException" :portkey.aws.codedeploy/deployment-config-name-required-exception, "DeploymentConfigAlreadyExistsException" :portkey.aws.codedeploy/deployment-config-already-exists-exception, "InvalidMinimumHealthyHostValueException" :portkey.aws.codedeploy/invalid-minimum-healthy-host-value-exception, "DeploymentConfigLimitExceededException" :portkey.aws.codedeploy/deployment-config-limit-exceeded-exception, "InvalidComputePlatformException" :portkey.aws.codedeploy/invalid-compute-platform-exception, "InvalidTrafficRoutingConfigurationException" :portkey.aws.codedeploy/invalid-traffic-routing-configuration-exception}})))))
(clojure.spec.alpha/fdef create-deployment-config :args (clojure.spec.alpha/tuple :portkey.aws.codedeploy/create-deployment-config-input) :ret (clojure.spec.alpha/and :portkey.aws.codedeploy/create-deployment-config-output))
