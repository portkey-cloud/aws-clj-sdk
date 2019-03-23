(ns portkey.aws.autoscaling (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope
    {:service "autoscaling", :region "us-gov-east-1"},
    :ssl-common-name "autoscaling.us-gov-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "autoscaling", :region "ap-northeast-1"},
    :ssl-common-name "autoscaling.ap-northeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "autoscaling", :region "eu-west-1"},
    :ssl-common-name "autoscaling.eu-west-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "autoscaling", :region "us-east-2"},
    :ssl-common-name "autoscaling.us-east-2.amazonaws.com",
    :endpoint "https://autoscaling.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "autoscaling", :region "ap-southeast-2"},
    :ssl-common-name "autoscaling.ap-southeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "autoscaling", :region "cn-north-1"},
    :ssl-common-name "autoscaling.cn-north-1.amazonaws.com.cn",
    :endpoint "https://autoscaling.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "autoscaling", :region "sa-east-1"},
    :ssl-common-name "autoscaling.sa-east-1.amazonaws.com",
    :endpoint "https://autoscaling.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "autoscaling", :region "ap-southeast-1"},
    :ssl-common-name "autoscaling.ap-southeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope
    {:service "autoscaling", :region "cn-northwest-1"},
    :ssl-common-name "autoscaling.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://autoscaling.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "autoscaling", :region "ap-northeast-2"},
    :ssl-common-name "autoscaling.ap-northeast-2.amazonaws.com",
    :endpoint "https://autoscaling.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "autoscaling", :region "eu-west-3"},
    :ssl-common-name "autoscaling.eu-west-3.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "autoscaling", :region "ca-central-1"},
    :ssl-common-name "autoscaling.ca-central-1.amazonaws.com",
    :endpoint "https://autoscaling.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "autoscaling", :region "eu-central-1"},
    :ssl-common-name "autoscaling.eu-central-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "autoscaling", :region "eu-west-2"},
    :ssl-common-name "autoscaling.eu-west-2.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "autoscaling", :region "us-gov-west-1"},
    :ssl-common-name "autoscaling.us-gov-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "autoscaling", :region "us-west-2"},
    :ssl-common-name "autoscaling.us-west-2.amazonaws.com",
    :endpoint "https://autoscaling.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "autoscaling", :region "us-east-1"},
    :ssl-common-name "autoscaling.us-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "autoscaling", :region "us-west-1"},
    :ssl-common-name "autoscaling.us-west-1.amazonaws.com",
    :endpoint "https://autoscaling.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "autoscaling", :region "ap-south-1"},
    :ssl-common-name "autoscaling.ap-south-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "autoscaling", :region "eu-north-1"},
    :ssl-common-name "autoscaling.eu-north-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-lifecycle-action-result)

(clojure.core/declare ser-ascii-string-max-len-255)

(clojure.core/declare ser-lifecycle-hook-names)

(clojure.core/declare ser-predefined-metric-specification)

(clojure.core/declare ser-should-respect-grace-period)

(clojure.core/declare ser-instances-distribution)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-associate-public-ip-address)

(clojure.core/declare ser-load-balancer-names)

(clojure.core/declare ser-scheduled-update-group-action-request)

(clojure.core/declare ser-instance-ids)

(clojure.core/declare ser-notification-target-resource-name)

(clojure.core/declare ser-instance-monitoring)

(clojure.core/declare ser-launch-template-specification)

(clojure.core/declare ser-min-adjustment-magnitude)

(clojure.core/declare ser-security-groups)

(clojure.core/declare ser-ebs-optimized)

(clojure.core/declare ser-monitoring-enabled)

(clojure.core/declare ser-should-decrement-desired-capacity)

(clojure.core/declare ser-metric-dimension-value)

(clojure.core/declare ser-propagate-at-launch)

(clojure.core/declare ser-max-records)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-launch-template)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-lifecycle-hook-specifications)

(clojure.core/declare ser-no-device)

(clojure.core/declare ser-policy-names)

(clojure.core/declare ser-ebs)

(clojure.core/declare ser-cooldown)

(clojure.core/declare ser-block-device-ebs-iops)

(clojure.core/declare ser-block-device-ebs-encrypted)

(clojure.core/declare ser-auto-scaling-group-max-size)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-policy-types)

(clojure.core/declare ser-estimated-instance-warmup)

(clojure.core/declare ser-block-device-ebs-volume-size)

(clojure.core/declare ser-step-adjustments)

(clojure.core/declare ser-activity-ids)

(clojure.core/declare ser-spot-price)

(clojure.core/declare ser-launch-configuration-names)

(clojure.core/declare ser-instance-protected)

(clojure.core/declare ser-auto-scaling-group-names)

(clojure.core/declare ser-xml-string-max-len-19)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-launch-template-overrides)

(clojure.core/declare ser-metric-dimension-name)

(clojure.core/declare ser-timestamp-type)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-xml-string-max-len-255)

(clojure.core/declare ser-spot-instance-pools)

(clojure.core/declare ser-xml-string-max-len-1023)

(clojure.core/declare ser-scheduled-action-names)

(clojure.core/declare ser-values)

(clojure.core/declare ser-mixed-instances-policy)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-xml-string-user-data)

(clojure.core/declare ser-resource-name)

(clojure.core/declare ser-xml-string-max-len-1600)

(clojure.core/declare ser-lifecycle-transition)

(clojure.core/declare ser-launch-template-name)

(clojure.core/declare ser-mixed-instance-spot-price)

(clojure.core/declare ser-target-tracking-configuration)

(clojure.core/declare ser-filters)

(clojure.core/declare ser-min-adjustment-step)

(clojure.core/declare ser-heartbeat-timeout)

(clojure.core/declare ser-classic-link-vpc-security-groups)

(clojure.core/declare ser-honor-cooldown)

(clojure.core/declare ser-auto-scaling-notification-types)

(clojure.core/declare ser-target-group-ar-ns)

(clojure.core/declare ser-protected-from-scale-in)

(clojure.core/declare ser-block-device-ebs-delete-on-termination)

(clojure.core/declare ser-step-adjustment)

(clojure.core/declare ser-block-device-mappings)

(clojure.core/declare ser-metric-statistic)

(clojure.core/declare ser-overrides)

(clojure.core/declare ser-xml-string-max-len-2047)

(clojure.core/declare ser-xml-string-max-len-511)

(clojure.core/declare ser-disable-scale-in)

(clojure.core/declare ser-block-device-mapping)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-metric-scale)

(clojure.core/declare ser-block-device-ebs-volume-type)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-on-demand-percentage-above-base-capacity)

(clojure.core/declare ser-metric-dimensions)

(clojure.core/declare ser-scheduled-update-group-action-requests)

(clojure.core/declare ser-metric-namespace)

(clojure.core/declare ser-policy-increment)

(clojure.core/declare ser-xml-string-max-len-64)

(clojure.core/declare ser-lifecycle-hook-specification)

(clojure.core/declare ser-auto-scaling-group-desired-capacity)

(clojure.core/declare ser-availability-zones)

(clojure.core/declare ser-metric-type)

(clojure.core/declare ser-termination-policies)

(clojure.core/declare ser-process-names)

(clojure.core/declare ser-auto-scaling-group-min-size)

(clojure.core/declare ser-force-delete)

(clojure.core/declare ser-lifecycle-action-token)

(clojure.core/declare ser-customized-metric-specification)

(clojure.core/declare ser-health-check-grace-period)

(clojure.core/declare ser-on-demand-base-capacity)

(clojure.core/declare ser-metrics)

(clojure.core/declare ser-xml-string-max-len-32)

(clojure.core/defn- ser-lifecycle-action-result [input] #:http.request.field{:value input, :shape "LifecycleActionResult"})

(clojure.core/defn- ser-ascii-string-max-len-255 [input] #:http.request.field{:value input, :shape "AsciiStringMaxLen255"})

(clojure.core/defn- ser-lifecycle-hook-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ascii-string-max-len-255 coll) #:http.request.field{:shape "AsciiStringMaxLen255"}))) input), :shape "LifecycleHookNames", :type "list", :max 50})

(clojure.core/defn- ser-predefined-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-type (:predefined-metric-type input)) #:http.request.field{:name "PredefinedMetricType", :shape "MetricType"})], :shape "PredefinedMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "XmlStringMaxLen1023"}))))

(clojure.core/defn- ser-should-respect-grace-period [input] #:http.request.field{:value input, :shape "ShouldRespectGracePeriod"})

(clojure.core/defn- ser-instances-distribution [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstancesDistribution", :type "structure"} (clojure.core/contains? input :on-demand-allocation-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :on-demand-allocation-strategy)) #:http.request.field{:name "OnDemandAllocationStrategy", :shape "XmlString"})) (clojure.core/contains? input :on-demand-base-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-demand-base-capacity (input :on-demand-base-capacity)) #:http.request.field{:name "OnDemandBaseCapacity", :shape "OnDemandBaseCapacity"})) (clojure.core/contains? input :on-demand-percentage-above-base-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-on-demand-percentage-above-base-capacity (input :on-demand-percentage-above-base-capacity)) #:http.request.field{:name "OnDemandPercentageAboveBaseCapacity", :shape "OnDemandPercentageAboveBaseCapacity"})) (clojure.core/contains? input :spot-allocation-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :spot-allocation-strategy)) #:http.request.field{:name "SpotAllocationStrategy", :shape "XmlString"})) (clojure.core/contains? input :spot-instance-pools) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spot-instance-pools (input :spot-instance-pools)) #:http.request.field{:name "SpotInstancePools", :shape "SpotInstancePools"})) (clojure.core/contains? input :spot-max-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instance-spot-price (input :spot-max-price)) #:http.request.field{:name "SpotMaxPrice", :shape "MixedInstanceSpotPrice"}))))

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Filter", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :name)) #:http.request.field{:name "Name", :shape "XmlString"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-values (input :values)) #:http.request.field{:name "Values", :shape "Values"}))))

(clojure.core/defn- ser-associate-public-ip-address [input] #:http.request.field{:value input, :shape "AssociatePublicIpAddress"})

(clojure.core/defn- ser-load-balancer-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "LoadBalancerNames", :type "list"})

(clojure.core/defn- ser-scheduled-update-group-action-request [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-255 (:scheduled-action-name input)) #:http.request.field{:name "ScheduledActionName", :shape "XmlStringMaxLen255"})], :shape "ScheduledUpdateGroupActionRequest", :type "structure"} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"}))))

(clojure.core/defn- ser-instance-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-19 coll) #:http.request.field{:shape "XmlStringMaxLen19"}))) input), :shape "InstanceIds", :type "list"})

(clojure.core/defn- ser-notification-target-resource-name [input] #:http.request.field{:value input, :shape "NotificationTargetResourceName"})

(clojure.core/defn- ser-instance-monitoring [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "InstanceMonitoring", :type "structure"} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-monitoring-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "MonitoringEnabled"}))))

(clojure.core/defn- ser-launch-template-specification [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplateSpecification", :type "structure"} (clojure.core/contains? input :launch-template-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :launch-template-id)) #:http.request.field{:name "LaunchTemplateId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :launch-template-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-name (input :launch-template-name)) #:http.request.field{:name "LaunchTemplateName", :shape "LaunchTemplateName"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :version)) #:http.request.field{:name "Version", :shape "XmlStringMaxLen255"}))))

(clojure.core/defn- ser-min-adjustment-magnitude [input] #:http.request.field{:value input, :shape "MinAdjustmentMagnitude"})

(clojure.core/defn- ser-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "SecurityGroups", :type "list"})

(clojure.core/defn- ser-ebs-optimized [input] #:http.request.field{:value input, :shape "EbsOptimized"})

(clojure.core/defn- ser-monitoring-enabled [input] #:http.request.field{:value input, :shape "MonitoringEnabled"})

(clojure.core/defn- ser-should-decrement-desired-capacity [input] #:http.request.field{:value input, :shape "ShouldDecrementDesiredCapacity"})

(clojure.core/defn- ser-metric-dimension-value [input] #:http.request.field{:value input, :shape "MetricDimensionValue"})

(clojure.core/defn- ser-propagate-at-launch [input] #:http.request.field{:value input, :shape "PropagateAtLaunch"})

(clojure.core/defn- ser-max-records [input] #:http.request.field{:value input, :shape "MaxRecords"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-launch-template [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplate", :type "structure"} (clojure.core/contains? input :launch-template-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template-specification)) #:http.request.field{:name "LaunchTemplateSpecification", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-overrides (input :overrides)) #:http.request.field{:name "Overrides", :shape "Overrides"}))))

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-lifecycle-hook-specifications [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lifecycle-hook-specification coll) #:http.request.field{:shape "LifecycleHookSpecification"}))) input), :shape "LifecycleHookSpecifications", :type "list"})

(clojure.core/defn- ser-no-device [input] #:http.request.field{:value input, :shape "NoDevice"})

(clojure.core/defn- ser-policy-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "PolicyNames", :type "list"})

(clojure.core/defn- ser-ebs [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Ebs", :type "structure"} (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :volume-size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-volume-size (input :volume-size)) #:http.request.field{:name "VolumeSize", :shape "BlockDeviceEbsVolumeSize"})) (clojure.core/contains? input :volume-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-volume-type (input :volume-type)) #:http.request.field{:name "VolumeType", :shape "BlockDeviceEbsVolumeType"})) (clojure.core/contains? input :delete-on-termination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-delete-on-termination (input :delete-on-termination)) #:http.request.field{:name "DeleteOnTermination", :shape "BlockDeviceEbsDeleteOnTermination"})) (clojure.core/contains? input :iops) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-iops (input :iops)) #:http.request.field{:name "Iops", :shape "BlockDeviceEbsIops"})) (clojure.core/contains? input :encrypted) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-ebs-encrypted (input :encrypted)) #:http.request.field{:name "Encrypted", :shape "BlockDeviceEbsEncrypted"}))))

(clojure.core/defn- ser-cooldown [input] #:http.request.field{:value input, :shape "Cooldown"})

(clojure.core/defn- ser-block-device-ebs-iops [input] #:http.request.field{:value input, :shape "BlockDeviceEbsIops"})

(clojure.core/defn- ser-block-device-ebs-encrypted [input] #:http.request.field{:value input, :shape "BlockDeviceEbsEncrypted"})

(clojure.core/defn- ser-auto-scaling-group-max-size [input] #:http.request.field{:value input, :shape "AutoScalingGroupMaxSize"})

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value input, :shape "MetricUnit"})

(clojure.core/defn- ser-policy-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-64 coll) #:http.request.field{:shape "XmlStringMaxLen64"}))) input), :shape "PolicyTypes", :type "list"})

(clojure.core/defn- ser-estimated-instance-warmup [input] #:http.request.field{:value input, :shape "EstimatedInstanceWarmup"})

(clojure.core/defn- ser-block-device-ebs-volume-size [input] #:http.request.field{:value input, :shape "BlockDeviceEbsVolumeSize"})

(clojure.core/defn- ser-step-adjustments [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-adjustment coll) #:http.request.field{:shape "StepAdjustment"}))) input), :shape "StepAdjustments", :type "list"})

(clojure.core/defn- ser-activity-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "ActivityIds", :type "list"})

(clojure.core/defn- ser-spot-price [input] #:http.request.field{:value input, :shape "SpotPrice"})

(clojure.core/defn- ser-launch-configuration-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "LaunchConfigurationNames", :type "list"})

(clojure.core/defn- ser-instance-protected [input] #:http.request.field{:value input, :shape "InstanceProtected"})

(clojure.core/defn- ser-auto-scaling-group-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "AutoScalingGroupNames", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-19 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen19"})

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-launch-template-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LaunchTemplateOverrides", :type "structure"} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "XmlStringMaxLen255"}))))

(clojure.core/defn- ser-metric-dimension-name [input] #:http.request.field{:value input, :shape "MetricDimensionName"})

(clojure.core/defn- ser-timestamp-type [input] #:http.request.field{:value input, :shape "TimestampType"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-xml-string-max-len-255 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen255"})

(clojure.core/defn- ser-spot-instance-pools [input] #:http.request.field{:value input, :shape "SpotInstancePools"})

(clojure.core/defn- ser-xml-string-max-len-1023 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen1023"})

(clojure.core/defn- ser-scheduled-action-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-name coll) #:http.request.field{:shape "ResourceName"}))) input), :shape "ScheduledActionNames", :type "list"})

(clojure.core/defn- ser-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string coll) #:http.request.field{:shape "XmlString"}))) input), :shape "Values", :type "list"})

(clojure.core/defn- ser-mixed-instances-policy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MixedInstancesPolicy", :type "structure"} (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplate"})) (clojure.core/contains? input :instances-distribution) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instances-distribution (input :instances-distribution)) #:http.request.field{:name "InstancesDistribution", :shape "InstancesDistribution"}))))

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "MetricDimensionName"}) (clojure.core/into (ser-metric-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "MetricDimensionValue"})], :shape "MetricDimension", :type "structure"}))

(clojure.core/defn- ser-xml-string-user-data [input] #:http.request.field{:value input, :shape "XmlStringUserData"})

(clojure.core/defn- ser-resource-name [input] #:http.request.field{:value input, :shape "ResourceName"})

(clojure.core/defn- ser-xml-string-max-len-1600 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen1600"})

(clojure.core/defn- ser-lifecycle-transition [input] #:http.request.field{:value input, :shape "LifecycleTransition"})

(clojure.core/defn- ser-launch-template-name [input] #:http.request.field{:value input, :shape "LaunchTemplateName"})

(clojure.core/defn- ser-mixed-instance-spot-price [input] #:http.request.field{:value input, :shape "MixedInstanceSpotPrice"})

(clojure.core/defn- ser-target-tracking-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-scale (:target-value input)) #:http.request.field{:name "TargetValue", :shape "MetricScale"})], :shape "TargetTrackingConfiguration", :type "structure"} (clojure.core/contains? input :predefined-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-metric-specification (input :predefined-metric-specification)) #:http.request.field{:name "PredefinedMetricSpecification", :shape "PredefinedMetricSpecification"})) (clojure.core/contains? input :customized-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-metric-specification (input :customized-metric-specification)) #:http.request.field{:name "CustomizedMetricSpecification", :shape "CustomizedMetricSpecification"})) (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-scale-in (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "DisableScaleIn"}))))

(clojure.core/defn- ser-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "Filters", :type "list"})

(clojure.core/defn- ser-min-adjustment-step [input] #:http.request.field{:value input, :shape "MinAdjustmentStep"})

(clojure.core/defn- ser-heartbeat-timeout [input] #:http.request.field{:value input, :shape "HeartbeatTimeout"})

(clojure.core/defn- ser-classic-link-vpc-security-groups [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "ClassicLinkVPCSecurityGroups", :type "list"})

(clojure.core/defn- ser-honor-cooldown [input] #:http.request.field{:value input, :shape "HonorCooldown"})

(clojure.core/defn- ser-auto-scaling-notification-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "AutoScalingNotificationTypes", :type "list"})

(clojure.core/defn- ser-target-group-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-511 coll) #:http.request.field{:shape "XmlStringMaxLen511"}))) input), :shape "TargetGroupARNs", :type "list"})

(clojure.core/defn- ser-protected-from-scale-in [input] #:http.request.field{:value input, :shape "ProtectedFromScaleIn"})

(clojure.core/defn- ser-block-device-ebs-delete-on-termination [input] #:http.request.field{:value input, :shape "BlockDeviceEbsDeleteOnTermination"})

(clojure.core/defn- ser-step-adjustment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-policy-increment (:scaling-adjustment input)) #:http.request.field{:name "ScalingAdjustment", :shape "PolicyIncrement"})], :shape "StepAdjustment", :type "structure"} (clojure.core/contains? input :metric-interval-lower-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-lower-bound)) #:http.request.field{:name "MetricIntervalLowerBound", :shape "MetricScale"})) (clojure.core/contains? input :metric-interval-upper-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-upper-bound)) #:http.request.field{:name "MetricIntervalUpperBound", :shape "MetricScale"}))))

(clojure.core/defn- ser-block-device-mappings [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-block-device-mapping coll) #:http.request.field{:shape "BlockDeviceMapping"}))) input), :shape "BlockDeviceMappings", :type "list"})

(clojure.core/defn- ser-metric-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "MetricStatistic"})

(clojure.core/defn- ser-overrides [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-launch-template-overrides coll) #:http.request.field{:shape "LaunchTemplateOverrides"}))) input), :shape "Overrides", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-2047 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen2047"})

(clojure.core/defn- ser-xml-string-max-len-511 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen511"})

(clojure.core/defn- ser-disable-scale-in [input] #:http.request.field{:value input, :shape "DisableScaleIn"})

(clojure.core/defn- ser-block-device-mapping [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-xml-string-max-len-255 (:device-name input)) #:http.request.field{:name "DeviceName", :shape "XmlStringMaxLen255"})], :shape "BlockDeviceMapping", :type "structure"} (clojure.core/contains? input :virtual-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :virtual-name)) #:http.request.field{:name "VirtualName", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :ebs) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs (input :ebs)) #:http.request.field{:name "Ebs", :shape "Ebs"})) (clojure.core/contains? input :no-device) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-no-device (input :no-device)) #:http.request.field{:name "NoDevice", :shape "NoDevice"}))))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "XmlString"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :resource-type)) #:http.request.field{:name "ResourceType", :shape "XmlString"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"})) (clojure.core/contains? input :propagate-at-launch) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-propagate-at-launch (input :propagate-at-launch)) #:http.request.field{:name "PropagateAtLaunch", :shape "PropagateAtLaunch"}))))

(clojure.core/defn- ser-metric-scale [input] #:http.request.field{:value input, :shape "MetricScale"})

(clojure.core/defn- ser-block-device-ebs-volume-type [input] #:http.request.field{:value input, :shape "BlockDeviceEbsVolumeType"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-on-demand-percentage-above-base-capacity [input] #:http.request.field{:value input, :shape "OnDemandPercentageAboveBaseCapacity"})

(clojure.core/defn- ser-metric-dimensions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-dimension coll) #:http.request.field{:shape "MetricDimension"}))) input), :shape "MetricDimensions", :type "list"})

(clojure.core/defn- ser-scheduled-update-group-action-requests [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scheduled-update-group-action-request coll) #:http.request.field{:shape "ScheduledUpdateGroupActionRequest"}))) input), :shape "ScheduledUpdateGroupActionRequests", :type "list"})

(clojure.core/defn- ser-metric-namespace [input] #:http.request.field{:value input, :shape "MetricNamespace"})

(clojure.core/defn- ser-policy-increment [input] #:http.request.field{:value input, :shape "PolicyIncrement"})

(clojure.core/defn- ser-xml-string-max-len-64 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen64"})

(clojure.core/defn- ser-lifecycle-hook-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-ascii-string-max-len-255 (:lifecycle-hook-name input)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-lifecycle-transition (:lifecycle-transition input)) #:http.request.field{:name "LifecycleTransition", :shape "LifecycleTransition"})], :shape "LifecycleHookSpecification", :type "structure"} (clojure.core/contains? input :notification-metadata) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :notification-metadata)) #:http.request.field{:name "NotificationMetadata", :shape "XmlStringMaxLen1023"})) (clojure.core/contains? input :heartbeat-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-heartbeat-timeout (input :heartbeat-timeout)) #:http.request.field{:name "HeartbeatTimeout", :shape "HeartbeatTimeout"})) (clojure.core/contains? input :default-result) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-result (input :default-result)) #:http.request.field{:name "DefaultResult", :shape "LifecycleActionResult"})) (clojure.core/contains? input :notification-target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-target-resource-name (input :notification-target-arn)) #:http.request.field{:name "NotificationTargetARN", :shape "NotificationTargetResourceName"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "ResourceName"}))))

(clojure.core/defn- ser-auto-scaling-group-desired-capacity [input] #:http.request.field{:value input, :shape "AutoScalingGroupDesiredCapacity"})

(clojure.core/defn- ser-availability-zones [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "AvailabilityZones", :type "list", :min 1})

(clojure.core/defn- ser-metric-type [input] #:http.request.field{:value (clojure.core/get {"ASGAverageCPUUtilization" "ASGAverageCPUUtilization", :asg-average-cpu-utilization "ASGAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asg-average-network-in "ASGAverageNetworkIn", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :asg-average-network-out "ASGAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", :alb-request-count-per-target "ALBRequestCountPerTarget"} input), :shape "MetricType"})

(clojure.core/defn- ser-termination-policies [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-1600 coll) #:http.request.field{:shape "XmlStringMaxLen1600"}))) input), :shape "TerminationPolicies", :type "list"})

(clojure.core/defn- ser-process-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "ProcessNames", :type "list"})

(clojure.core/defn- ser-auto-scaling-group-min-size [input] #:http.request.field{:value input, :shape "AutoScalingGroupMinSize"})

(clojure.core/defn- ser-force-delete [input] #:http.request.field{:value input, :shape "ForceDelete"})

(clojure.core/defn- ser-lifecycle-action-token [input] #:http.request.field{:value input, :shape "LifecycleActionToken"})

(clojure.core/defn- ser-customized-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:namespace input)) #:http.request.field{:name "Namespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-statistic (:statistic input)) #:http.request.field{:name "Statistic", :shape "MetricStatistic"})], :shape "CustomizedMetricSpecification", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensions"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "Unit", :shape "MetricUnit"}))))

(clojure.core/defn- ser-health-check-grace-period [input] #:http.request.field{:value input, :shape "HealthCheckGracePeriod"})

(clojure.core/defn- ser-on-demand-base-capacity [input] #:http.request.field{:value input, :shape "OnDemandBaseCapacity"})

(clojure.core/defn- ser-metrics [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-255 coll) #:http.request.field{:shape "XmlStringMaxLen255"}))) input), :shape "Metrics", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-32 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen32"})

(clojure.core/defn- req-enter-standby-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-describe-load-balancer-target-groups-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-delete-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :force-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-delete (input :force-delete)) #:http.request.field{:name "ForceDelete", :shape "ForceDelete"}))))

(clojure.core/defn- req-create-or-update-tags-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-tags-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filters (input :filters)) #:http.request.field{:name "Filters", :shape "Filters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-create-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-255 (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "XmlStringMaxLen255"}) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"}) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})]} (clojure.core/contains? input :new-instances-protected-from-scale-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-protected (input :new-instances-protected-from-scale-in)) #:http.request.field{:name "NewInstancesProtectedFromScaleIn", :shape "InstanceProtected"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"})) (clojure.core/contains? input :load-balancer-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})) (clojure.core/contains? input :vpc-zone-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-2047 (input :vpc-zone-identifier)) #:http.request.field{:name "VPCZoneIdentifier", :shape "XmlStringMaxLen2047"})) (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :lifecycle-hook-specification-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-hook-specifications (input :lifecycle-hook-specification-list)) #:http.request.field{:name "LifecycleHookSpecificationList", :shape "LifecycleHookSpecifications"})) (clojure.core/contains? input :default-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :default-cooldown)) #:http.request.field{:name "DefaultCooldown", :shape "Cooldown"})) (clojure.core/contains? input :mixed-instances-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instances-policy (input :mixed-instances-policy)) #:http.request.field{:name "MixedInstancesPolicy", :shape "MixedInstancesPolicy"})) (clojure.core/contains? input :launch-configuration-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})) (clojure.core/contains? input :target-group-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})) (clojure.core/contains? input :health-check-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :health-check-type)) #:http.request.field{:name "HealthCheckType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})) (clojure.core/contains? input :termination-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-termination-policies (input :termination-policies)) #:http.request.field{:name "TerminationPolicies", :shape "TerminationPolicies"})) (clojure.core/contains? input :placement-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :placement-group)) #:http.request.field{:name "PlacementGroup", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})) (clojure.core/contains? input :health-check-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-grace-period (input :health-check-grace-period)) #:http.request.field{:name "HealthCheckGracePeriod", :shape "HealthCheckGracePeriod"})) (clojure.core/contains? input :service-linked-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :service-linked-role-arn)) #:http.request.field{:name "ServiceLinkedRoleARN", :shape "ResourceName"}))))

(clojure.core/defn- req-delete-notification-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :topic-arn)) #:http.request.field{:name "TopicARN", :shape "ResourceName"})]}))

(clojure.core/defn- req-describe-lifecycle-hooks-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-hook-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-hook-names (input :lifecycle-hook-names)) #:http.request.field{:name "LifecycleHookNames", :shape "LifecycleHookNames"}))))

(clojure.core/defn- req-record-lifecycle-action-heartbeat-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-action-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-token (input :lifecycle-action-token)) #:http.request.field{:name "LifecycleActionToken", :shape "LifecycleActionToken"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}))))

(clojure.core/defn- req-batch-put-scheduled-update-group-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-scheduled-update-group-action-requests (input :scheduled-update-group-actions)) #:http.request.field{:name "ScheduledUpdateGroupActions", :shape "ScheduledUpdateGroupActionRequests"})]}))

(clojure.core/defn- req-detach-load-balancer-target-groups-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})]}))

(clojure.core/defn- req-launch-configuration-names-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :launch-configuration-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-configuration-names (input :launch-configuration-names)) #:http.request.field{:name "LaunchConfigurationNames", :shape "LaunchConfigurationNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-set-instance-protection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-protected-from-scale-in (input :protected-from-scale-in)) #:http.request.field{:name "ProtectedFromScaleIn", :shape "ProtectedFromScaleIn"})]}))

(clojure.core/defn- req-set-desired-capacity-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})]} (clojure.core/contains? input :honor-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-honor-cooldown (input :honor-cooldown)) #:http.request.field{:name "HonorCooldown", :shape "HonorCooldown"}))))

(clojure.core/defn- req-update-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :new-instances-protected-from-scale-in) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-protected (input :new-instances-protected-from-scale-in)) #:http.request.field{:name "NewInstancesProtectedFromScaleIn", :shape "InstanceProtected"})) (clojure.core/contains? input :vpc-zone-identifier) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-2047 (input :vpc-zone-identifier)) #:http.request.field{:name "VPCZoneIdentifier", :shape "XmlStringMaxLen2047"})) (clojure.core/contains? input :launch-template) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-template-specification (input :launch-template)) #:http.request.field{:name "LaunchTemplate", :shape "LaunchTemplateSpecification"})) (clojure.core/contains? input :default-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :default-cooldown)) #:http.request.field{:name "DefaultCooldown", :shape "Cooldown"})) (clojure.core/contains? input :mixed-instances-policy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-mixed-instances-policy (input :mixed-instances-policy)) #:http.request.field{:name "MixedInstancesPolicy", :shape "MixedInstancesPolicy"})) (clojure.core/contains? input :launch-configuration-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})) (clojure.core/contains? input :health-check-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :health-check-type)) #:http.request.field{:name "HealthCheckType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :availability-zones) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-availability-zones (input :availability-zones)) #:http.request.field{:name "AvailabilityZones", :shape "AvailabilityZones"})) (clojure.core/contains? input :termination-policies) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-termination-policies (input :termination-policies)) #:http.request.field{:name "TerminationPolicies", :shape "TerminationPolicies"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :placement-group) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :placement-group)) #:http.request.field{:name "PlacementGroup", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"})) (clojure.core/contains? input :health-check-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-health-check-grace-period (input :health-check-grace-period)) #:http.request.field{:name "HealthCheckGracePeriod", :shape "HealthCheckGracePeriod"})) (clojure.core/contains? input :service-linked-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :service-linked-role-arn)) #:http.request.field{:name "ServiceLinkedRoleARN", :shape "ResourceName"}))))

(clojure.core/defn- req-enable-metrics-collection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :granularity)) #:http.request.field{:name "Granularity", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics (input :metrics)) #:http.request.field{:name "Metrics", :shape "Metrics"}))))

(clojure.core/defn- req-delete-tags-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-attach-instances-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-set-instance-health-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}) (clojure.core/into (ser-xml-string-max-len-32 (input :health-status)) #:http.request.field{:name "HealthStatus", :shape "XmlStringMaxLen32"})]} (clojure.core/contains? input :should-respect-grace-period) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-should-respect-grace-period (input :should-respect-grace-period)) #:http.request.field{:name "ShouldRespectGracePeriod", :shape "ShouldRespectGracePeriod"}))))

(clojure.core/defn- req-terminate-instance-in-auto-scaling-group-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]}))

(clojure.core/defn- req-delete-scheduled-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "ResourceName"})]}))

(clojure.core/defn- req-attach-load-balancers-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})]}))

(clojure.core/defn- req-delete-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "ResourceName"})]} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}))))

(clojure.core/defn- req-describe-policies-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :policy-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-names (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "PolicyNames"})) (clojure.core/contains? input :policy-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-types (input :policy-types)) #:http.request.field{:name "PolicyTypes", :shape "PolicyTypes"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-exit-standby-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-auto-scaling-group-names-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-names (input :auto-scaling-group-names)) #:http.request.field{:name "AutoScalingGroupNames", :shape "AutoScalingGroupNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-launch-configuration-name-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "ResourceName"})]}))

(clojure.core/defn- req-put-scheduled-update-group-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :recurrence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :recurrence)) #:http.request.field{:name "Recurrence", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :min-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-min-size (input :min-size)) #:http.request.field{:name "MinSize", :shape "AutoScalingGroupMinSize"})) (clojure.core/contains? input :max-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-max-size (input :max-size)) #:http.request.field{:name "MaxSize", :shape "AutoScalingGroupMaxSize"})) (clojure.core/contains? input :time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :time)) #:http.request.field{:name "Time", :shape "TimestampType"})) (clojure.core/contains? input :desired-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-desired-capacity (input :desired-capacity)) #:http.request.field{:name "DesiredCapacity", :shape "AutoScalingGroupDesiredCapacity"}))))

(clojure.core/defn- req-batch-delete-scheduled-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-scheduled-action-names (input :scheduled-action-names)) #:http.request.field{:name "ScheduledActionNames", :shape "ScheduledActionNames"})]}))

(clojure.core/defn- req-disable-metrics-collection-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :metrics) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metrics (input :metrics)) #:http.request.field{:name "Metrics", :shape "Metrics"}))))

(clojure.core/defn- req-put-scaling-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-xml-string-max-len-255 (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :min-adjustment-magnitude) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-adjustment-magnitude (input :min-adjustment-magnitude)) #:http.request.field{:name "MinAdjustmentMagnitude", :shape "MinAdjustmentMagnitude"})) (clojure.core/contains? input :scaling-adjustment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-increment (input :scaling-adjustment)) #:http.request.field{:name "ScalingAdjustment", :shape "PolicyIncrement"})) (clojure.core/contains? input :cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :cooldown)) #:http.request.field{:name "Cooldown", :shape "Cooldown"})) (clojure.core/contains? input :estimated-instance-warmup) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-estimated-instance-warmup (input :estimated-instance-warmup)) #:http.request.field{:name "EstimatedInstanceWarmup", :shape "EstimatedInstanceWarmup"})) (clojure.core/contains? input :step-adjustments) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-adjustments (input :step-adjustments)) #:http.request.field{:name "StepAdjustments", :shape "StepAdjustments"})) (clojure.core/contains? input :adjustment-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :adjustment-type)) #:http.request.field{:name "AdjustmentType", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :metric-aggregation-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-32 (input :metric-aggregation-type)) #:http.request.field{:name "MetricAggregationType", :shape "XmlStringMaxLen32"})) (clojure.core/contains? input :target-tracking-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-tracking-configuration (input :target-tracking-configuration)) #:http.request.field{:name "TargetTrackingConfiguration", :shape "TargetTrackingConfiguration"})) (clojure.core/contains? input :min-adjustment-step) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-adjustment-step (input :min-adjustment-step)) #:http.request.field{:name "MinAdjustmentStep", :shape "MinAdjustmentStep"})) (clojure.core/contains? input :policy-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-64 (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "XmlStringMaxLen64"}))))

(clojure.core/defn- req-detach-load-balancers-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-load-balancer-names (input :load-balancer-names)) #:http.request.field{:name "LoadBalancerNames", :shape "LoadBalancerNames"})]}))

(clojure.core/defn- req-describe-scheduled-actions-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :scheduled-action-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduled-action-names (input :scheduled-action-names)) #:http.request.field{:name "ScheduledActionNames", :shape "ScheduledActionNames"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-scaling-process-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :scaling-processes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-process-names (input :scaling-processes)) #:http.request.field{:name "ScalingProcesses", :shape "ProcessNames"}))))

(clojure.core/defn- req-execute-policy-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "ResourceName"})]} (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :honor-cooldown) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-honor-cooldown (input :honor-cooldown)) #:http.request.field{:name "HonorCooldown", :shape "HonorCooldown"})) (clojure.core/contains? input :metric-value) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-value)) #:http.request.field{:name "MetricValue", :shape "MetricScale"})) (clojure.core/contains? input :breach-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :breach-threshold)) #:http.request.field{:name "BreachThreshold", :shape "MetricScale"}))))

(clojure.core/defn- req-put-lifecycle-hook-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :lifecycle-transition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-transition (input :lifecycle-transition)) #:http.request.field{:name "LifecycleTransition", :shape "LifecycleTransition"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "ResourceName"})) (clojure.core/contains? input :notification-target-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-target-resource-name (input :notification-target-arn)) #:http.request.field{:name "NotificationTargetARN", :shape "NotificationTargetResourceName"})) (clojure.core/contains? input :notification-metadata) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1023 (input :notification-metadata)) #:http.request.field{:name "NotificationMetadata", :shape "XmlStringMaxLen1023"})) (clojure.core/contains? input :heartbeat-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-heartbeat-timeout (input :heartbeat-timeout)) #:http.request.field{:name "HeartbeatTimeout", :shape "HeartbeatTimeout"})) (clojure.core/contains? input :default-result) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-result (input :default-result)) #:http.request.field{:name "DefaultResult", :shape "LifecycleActionResult"}))))

(clojure.core/defn- req-describe-auto-scaling-instances-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-attach-load-balancer-target-groups-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-target-group-ar-ns (input :target-group-ar-ns)) #:http.request.field{:name "TargetGroupARNs", :shape "TargetGroupARNs"})]}))

(clojure.core/defn- req-describe-load-balancers-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-detach-instances-query [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-should-decrement-desired-capacity (input :should-decrement-desired-capacity)) #:http.request.field{:name "ShouldDecrementDesiredCapacity", :shape "ShouldDecrementDesiredCapacity"})]} (clojure.core/contains? input :instance-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-ids (input :instance-ids)) #:http.request.field{:name "InstanceIds", :shape "InstanceIds"}))))

(clojure.core/defn- req-create-launch-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-xml-string-max-len-255 (input :launch-configuration-name)) #:http.request.field{:name "LaunchConfigurationName", :shape "XmlStringMaxLen255"})]} (clojure.core/contains? input :placement-tenancy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-64 (input :placement-tenancy)) #:http.request.field{:name "PlacementTenancy", :shape "XmlStringMaxLen64"})) (clojure.core/contains? input :kernel-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :kernel-id)) #:http.request.field{:name "KernelId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"})) (clojure.core/contains? input :associate-public-ip-address) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-associate-public-ip-address (input :associate-public-ip-address)) #:http.request.field{:name "AssociatePublicIpAddress", :shape "AssociatePublicIpAddress"})) (clojure.core/contains? input :instance-monitoring) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-monitoring (input :instance-monitoring)) #:http.request.field{:name "InstanceMonitoring", :shape "InstanceMonitoring"})) (clojure.core/contains? input :image-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :image-id)) #:http.request.field{:name "ImageId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-groups (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "SecurityGroups"})) (clojure.core/contains? input :ebs-optimized) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ebs-optimized (input :ebs-optimized)) #:http.request.field{:name "EbsOptimized", :shape "EbsOptimized"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :classic-link-vpc-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :classic-link-vpc-id)) #:http.request.field{:name "ClassicLinkVPCId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :key-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :key-name)) #:http.request.field{:name "KeyName", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :spot-price) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-spot-price (input :spot-price)) #:http.request.field{:name "SpotPrice", :shape "SpotPrice"})) (clojure.core/contains? input :classic-link-vpc-security-groups) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-classic-link-vpc-security-groups (input :classic-link-vpc-security-groups)) #:http.request.field{:name "ClassicLinkVPCSecurityGroups", :shape "ClassicLinkVPCSecurityGroups"})) (clojure.core/contains? input :block-device-mappings) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-block-device-mappings (input :block-device-mappings)) #:http.request.field{:name "BlockDeviceMappings", :shape "BlockDeviceMappings"})) (clojure.core/contains? input :ramdisk-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-255 (input :ramdisk-id)) #:http.request.field{:name "RamdiskId", :shape "XmlStringMaxLen255"})) (clojure.core/contains? input :user-data) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-user-data (input :user-data)) #:http.request.field{:name "UserData", :shape "XmlStringUserData"})) (clojure.core/contains? input :iam-instance-profile) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-1600 (input :iam-instance-profile)) #:http.request.field{:name "IamInstanceProfile", :shape "XmlStringMaxLen1600"}))))

(clojure.core/defn- req-describe-scaling-activities-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :activity-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-activity-ids (input :activity-ids)) #:http.request.field{:name "ActivityIds", :shape "ActivityIds"})) (clojure.core/contains? input :auto-scaling-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-describe-notification-configurations-type [input] (clojure.core/cond-> {} (clojure.core/contains? input :auto-scaling-group-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-auto-scaling-group-names (input :auto-scaling-group-names)) #:http.request.field{:name "AutoScalingGroupNames", :shape "AutoScalingGroupNames"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"})) (clojure.core/contains? input :max-records) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-records (input :max-records)) #:http.request.field{:name "MaxRecords", :shape "MaxRecords"}))))

(clojure.core/defn- req-delete-lifecycle-hook-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"})]}))

(clojure.core/defn- req-put-notification-configuration-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-resource-name (input :topic-arn)) #:http.request.field{:name "TopicARN", :shape "ResourceName"}) (clojure.core/into (ser-auto-scaling-notification-types (input :notification-types)) #:http.request.field{:name "NotificationTypes", :shape "AutoScalingNotificationTypes"})]}))

(clojure.core/defn- req-complete-lifecycle-action-type [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ascii-string-max-len-255 (input :lifecycle-hook-name)) #:http.request.field{:name "LifecycleHookName", :shape "AsciiStringMaxLen255"}) (clojure.core/into (ser-resource-name (input :auto-scaling-group-name)) #:http.request.field{:name "AutoScalingGroupName", :shape "ResourceName"}) (clojure.core/into (ser-lifecycle-action-result (input :lifecycle-action-result)) #:http.request.field{:name "LifecycleActionResult", :shape "LifecycleActionResult"})]} (clojure.core/contains? input :lifecycle-action-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-action-token (input :lifecycle-action-token)) #:http.request.field{:name "LifecycleActionToken", :shape "LifecycleActionToken"})) (clojure.core/contains? input :instance-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-19 (input :instance-id)) #:http.request.field{:name "InstanceId", :shape "XmlStringMaxLen19"}))))

(clojure.core/declare deser-lifecycle-action-result)

(clojure.core/declare deser-ascii-string-max-len-255)

(clojure.core/declare deser-predefined-metric-specification)

(clojure.core/declare deser-instances-distribution)

(clojure.core/declare deser-load-balancer-target-group-state)

(clojure.core/declare deser-activities)

(clojure.core/declare deser-failed-scheduled-update-group-action-requests)

(clojure.core/declare deser-scheduled-update-group-action)

(clojure.core/declare deser-associate-public-ip-address)

(clojure.core/declare deser-load-balancer-names)

(clojure.core/declare deser-global-timeout)

(clojure.core/declare deser-enabled-metrics)

(clojure.core/declare deser-instance-monitoring)

(clojure.core/declare deser-notification-configurations)

(clojure.core/declare deser-lifecycle-state)

(clojure.core/declare deser-launch-template-specification)

(clojure.core/declare deser-min-adjustment-magnitude)

(clojure.core/declare deser-metric-collection-type)

(clojure.core/declare deser-max-number-of-launch-configurations)

(clojure.core/declare deser-security-groups)

(clojure.core/declare deser-ebs-optimized)

(clojure.core/declare deser-monitoring-enabled)

(clojure.core/declare deser-metric-dimension-value)

(clojure.core/declare deser-process-type)

(clojure.core/declare deser-propagate-at-launch)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-launch-template)

(clojure.core/declare deser-enabled-metric)

(clojure.core/declare deser-no-device)

(clojure.core/declare deser-ebs)

(clojure.core/declare deser-suspended-process)

(clojure.core/declare deser-activity)

(clojure.core/declare deser-cooldown)

(clojure.core/declare deser-block-device-ebs-iops)

(clojure.core/declare deser-block-device-ebs-encrypted)

(clojure.core/declare deser-max-number-of-auto-scaling-groups)

(clojure.core/declare deser-auto-scaling-group-max-size)

(clojure.core/declare deser-launch-configurations)

(clojure.core/declare deser-metric-unit)

(clojure.core/declare deser-load-balancer-target-group-states)

(clojure.core/declare deser-progress)

(clojure.core/declare deser-number-of-launch-configurations)

(clojure.core/declare deser-estimated-instance-warmup)

(clojure.core/declare deser-block-device-ebs-volume-size)

(clojure.core/declare deser-step-adjustments)

(clojure.core/declare deser-spot-price)

(clojure.core/declare deser-tag-description)

(clojure.core/declare deser-instance-protected)

(clojure.core/declare deser-xml-string-max-len-19)

(clojure.core/declare deser-xml-string)

(clojure.core/declare deser-launch-template-overrides)

(clojure.core/declare deser-number-of-auto-scaling-groups)

(clojure.core/declare deser-load-balancer-state)

(clojure.core/declare deser-scaling-activity-status-code)

(clojure.core/declare deser-scheduled-update-group-actions)

(clojure.core/declare deser-auto-scaling-instances)

(clojure.core/declare deser-metric-dimension-name)

(clojure.core/declare deser-tag-description-list)

(clojure.core/declare deser-timestamp-type)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-adjustment-type)

(clojure.core/declare deser-xml-string-max-len-255)

(clojure.core/declare deser-spot-instance-pools)

(clojure.core/declare deser-xml-string-max-len-1023)

(clojure.core/declare deser-auto-scaling-group)

(clojure.core/declare deser-mixed-instances-policy)

(clojure.core/declare deser-auto-scaling-instance-details)

(clojure.core/declare deser-metric-dimension)

(clojure.core/declare deser-xml-string-user-data)

(clojure.core/declare deser-resource-name)

(clojure.core/declare deser-xml-string-max-len-1600)

(clojure.core/declare deser-lifecycle-transition)

(clojure.core/declare deser-auto-scaling-groups)

(clojure.core/declare deser-launch-template-name)

(clojure.core/declare deser-mixed-instance-spot-price)

(clojure.core/declare deser-target-tracking-configuration)

(clojure.core/declare deser-min-adjustment-step)

(clojure.core/declare deser-heartbeat-timeout)

(clojure.core/declare deser-classic-link-vpc-security-groups)

(clojure.core/declare deser-load-balancer-states)

(clojure.core/declare deser-auto-scaling-notification-types)

(clojure.core/declare deser-target-group-ar-ns)

(clojure.core/declare deser-lifecycle-hooks)

(clojure.core/declare deser-block-device-ebs-delete-on-termination)

(clojure.core/declare deser-step-adjustment)

(clojure.core/declare deser-block-device-mappings)

(clojure.core/declare deser-alarms)

(clojure.core/declare deser-metric-statistic)

(clojure.core/declare deser-overrides)

(clojure.core/declare deser-xml-string-max-len-2047)

(clojure.core/declare deser-scaling-policy)

(clojure.core/declare deser-launch-configuration)

(clojure.core/declare deser-lifecycle-hook)

(clojure.core/declare deser-xml-string-max-len-511)

(clojure.core/declare deser-disable-scale-in)

(clojure.core/declare deser-metric-granularity-types)

(clojure.core/declare deser-block-device-mapping)

(clojure.core/declare deser-alarm)

(clojure.core/declare deser-metric-scale)

(clojure.core/declare deser-block-device-ebs-volume-type)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-on-demand-percentage-above-base-capacity)

(clojure.core/declare deser-failed-scheduled-update-group-action-request)

(clojure.core/declare deser-metric-dimensions)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-metric-namespace)

(clojure.core/declare deser-policy-increment)

(clojure.core/declare deser-adjustment-types)

(clojure.core/declare deser-notification-configuration)

(clojure.core/declare deser-xml-string-max-len-64)

(clojure.core/declare deser-suspended-processes)

(clojure.core/declare deser-auto-scaling-group-desired-capacity)

(clojure.core/declare deser-availability-zones)

(clojure.core/declare deser-metric-type)

(clojure.core/declare deser-termination-policies)

(clojure.core/declare deser-processes)

(clojure.core/declare deser-metric-collection-types)

(clojure.core/declare deser-auto-scaling-group-min-size)

(clojure.core/declare deser-instances)

(clojure.core/declare deser-metric-granularity-type)

(clojure.core/declare deser-scaling-policies)

(clojure.core/declare deser-customized-metric-specification)

(clojure.core/declare deser-health-check-grace-period)

(clojure.core/declare deser-on-demand-base-capacity)

(clojure.core/declare deser-xml-string-max-len-32)

(clojure.core/defn- deser-lifecycle-action-result [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-ascii-string-max-len-255 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-predefined-metric-specification [input] (clojure.core/let [letvar286998 {"PredefinedMetricType" (portkey.aws/search-for-tag input "PredefinedMetricType" :flattened? nil :xmlAttribute? nil), "ResourceLabel" (portkey.aws/search-for-tag input "ResourceLabel" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:predefined-metric-type (deser-metric-type (clojure.core/get-in letvar286998 ["PredefinedMetricType" :content]))} (letvar286998 "ResourceLabel") (clojure.core/assoc :resource-label (deser-xml-string-max-len-1023 (clojure.core/get-in letvar286998 ["ResourceLabel" :content]))))))

(clojure.core/defn- deser-instances-distribution [input] (clojure.core/let [letvar287106 {"OnDemandAllocationStrategy" (portkey.aws/search-for-tag input "OnDemandAllocationStrategy" :flattened? nil :xmlAttribute? nil), "OnDemandBaseCapacity" (portkey.aws/search-for-tag input "OnDemandBaseCapacity" :flattened? nil :xmlAttribute? nil), "OnDemandPercentageAboveBaseCapacity" (portkey.aws/search-for-tag input "OnDemandPercentageAboveBaseCapacity" :flattened? nil :xmlAttribute? nil), "SpotAllocationStrategy" (portkey.aws/search-for-tag input "SpotAllocationStrategy" :flattened? nil :xmlAttribute? nil), "SpotInstancePools" (portkey.aws/search-for-tag input "SpotInstancePools" :flattened? nil :xmlAttribute? nil), "SpotMaxPrice" (portkey.aws/search-for-tag input "SpotMaxPrice" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287106 "OnDemandAllocationStrategy") (clojure.core/assoc :on-demand-allocation-strategy (deser-xml-string (clojure.core/get-in letvar287106 ["OnDemandAllocationStrategy" :content]))) (letvar287106 "OnDemandBaseCapacity") (clojure.core/assoc :on-demand-base-capacity (deser-on-demand-base-capacity (clojure.core/get-in letvar287106 ["OnDemandBaseCapacity" :content]))) (letvar287106 "OnDemandPercentageAboveBaseCapacity") (clojure.core/assoc :on-demand-percentage-above-base-capacity (deser-on-demand-percentage-above-base-capacity (clojure.core/get-in letvar287106 ["OnDemandPercentageAboveBaseCapacity" :content]))) (letvar287106 "SpotAllocationStrategy") (clojure.core/assoc :spot-allocation-strategy (deser-xml-string (clojure.core/get-in letvar287106 ["SpotAllocationStrategy" :content]))) (letvar287106 "SpotInstancePools") (clojure.core/assoc :spot-instance-pools (deser-spot-instance-pools (clojure.core/get-in letvar287106 ["SpotInstancePools" :content]))) (letvar287106 "SpotMaxPrice") (clojure.core/assoc :spot-max-price (deser-mixed-instance-spot-price (clojure.core/get-in letvar287106 ["SpotMaxPrice" :content]))))))

(clojure.core/defn- deser-load-balancer-target-group-state [input] (clojure.core/let [letvar287214 {"LoadBalancerTargetGroupARN" (portkey.aws/search-for-tag input "LoadBalancerTargetGroupARN" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287214 "LoadBalancerTargetGroupARN") (clojure.core/assoc :load-balancer-target-group-arn (deser-xml-string-max-len-511 (clojure.core/get-in letvar287214 ["LoadBalancerTargetGroupARN" :content]))) (letvar287214 "State") (clojure.core/assoc :state (deser-xml-string-max-len-255 (clojure.core/get-in letvar287214 ["State" :content]))))))

(clojure.core/defn- deser-activities [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-activity coll))) input))

(clojure.core/defn- deser-failed-scheduled-update-group-action-requests [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-scheduled-update-group-action-request coll))) input))

(clojure.core/defn- deser-scheduled-update-group-action [input] (clojure.core/let [letvar287356 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "EndTime" (portkey.aws/search-for-tag input "EndTime" :flattened? nil :xmlAttribute? nil), "StartTime" (portkey.aws/search-for-tag input "StartTime" :flattened? nil :xmlAttribute? nil), "Recurrence" (portkey.aws/search-for-tag input "Recurrence" :flattened? nil :xmlAttribute? nil), "ScheduledActionName" (portkey.aws/search-for-tag input "ScheduledActionName" :flattened? nil :xmlAttribute? nil), "MinSize" (portkey.aws/search-for-tag input "MinSize" :flattened? nil :xmlAttribute? nil), "MaxSize" (portkey.aws/search-for-tag input "MaxSize" :flattened? nil :xmlAttribute? nil), "Time" (portkey.aws/search-for-tag input "Time" :flattened? nil :xmlAttribute? nil), "DesiredCapacity" (portkey.aws/search-for-tag input "DesiredCapacity" :flattened? nil :xmlAttribute? nil), "ScheduledActionARN" (portkey.aws/search-for-tag input "ScheduledActionARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287356 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar287356 ["AutoScalingGroupName" :content]))) (letvar287356 "EndTime") (clojure.core/assoc :end-time (deser-timestamp-type (clojure.core/get-in letvar287356 ["EndTime" :content]))) (letvar287356 "StartTime") (clojure.core/assoc :start-time (deser-timestamp-type (clojure.core/get-in letvar287356 ["StartTime" :content]))) (letvar287356 "Recurrence") (clojure.core/assoc :recurrence (deser-xml-string-max-len-255 (clojure.core/get-in letvar287356 ["Recurrence" :content]))) (letvar287356 "ScheduledActionName") (clojure.core/assoc :scheduled-action-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar287356 ["ScheduledActionName" :content]))) (letvar287356 "MinSize") (clojure.core/assoc :min-size (deser-auto-scaling-group-min-size (clojure.core/get-in letvar287356 ["MinSize" :content]))) (letvar287356 "MaxSize") (clojure.core/assoc :max-size (deser-auto-scaling-group-max-size (clojure.core/get-in letvar287356 ["MaxSize" :content]))) (letvar287356 "Time") (clojure.core/assoc :time (deser-timestamp-type (clojure.core/get-in letvar287356 ["Time" :content]))) (letvar287356 "DesiredCapacity") (clojure.core/assoc :desired-capacity (deser-auto-scaling-group-desired-capacity (clojure.core/get-in letvar287356 ["DesiredCapacity" :content]))) (letvar287356 "ScheduledActionARN") (clojure.core/assoc :scheduled-action-arn (deser-resource-name (clojure.core/get-in letvar287356 ["ScheduledActionARN" :content]))))))

(clojure.core/defn- deser-associate-public-ip-address [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-load-balancer-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-global-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-enabled-metrics [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-enabled-metric coll))) input))

(clojure.core/defn- deser-instance-monitoring [input] (clojure.core/let [letvar287502 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287502 "Enabled") (clojure.core/assoc :enabled (deser-monitoring-enabled (clojure.core/get-in letvar287502 ["Enabled" :content]))))))

(clojure.core/defn- deser-notification-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notification-configuration coll))) input))

(clojure.core/defn- deser-lifecycle-state [input] (clojure.core/get {"Detaching" :detaching, "Terminating:Wait" :terminating-wait, "InService" :in-service, "Quarantined" :quarantined, "Pending:Proceed" :pending-proceed, "Terminating" :terminating, "EnteringStandby" :entering-standby, "Pending:Wait" :pending-wait, "Terminated" :terminated, "Standby" :standby, "Pending" :pending, "Terminating:Proceed" :terminating-proceed, "Detached" :detached} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-launch-template-specification [input] (clojure.core/let [letvar287632 {"LaunchTemplateId" (portkey.aws/search-for-tag input "LaunchTemplateId" :flattened? nil :xmlAttribute? nil), "LaunchTemplateName" (portkey.aws/search-for-tag input "LaunchTemplateName" :flattened? nil :xmlAttribute? nil), "Version" (portkey.aws/search-for-tag input "Version" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287632 "LaunchTemplateId") (clojure.core/assoc :launch-template-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar287632 ["LaunchTemplateId" :content]))) (letvar287632 "LaunchTemplateName") (clojure.core/assoc :launch-template-name (deser-launch-template-name (clojure.core/get-in letvar287632 ["LaunchTemplateName" :content]))) (letvar287632 "Version") (clojure.core/assoc :version (deser-xml-string-max-len-255 (clojure.core/get-in letvar287632 ["Version" :content]))))))

(clojure.core/defn- deser-min-adjustment-magnitude [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-metric-collection-type [input] (clojure.core/let [letvar287742 {"Metric" (portkey.aws/search-for-tag input "Metric" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287742 "Metric") (clojure.core/assoc :metric (deser-xml-string-max-len-255 (clojure.core/get-in letvar287742 ["Metric" :content]))))))

(clojure.core/defn- deser-max-number-of-launch-configurations [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string coll))) input))

(clojure.core/defn- deser-ebs-optimized [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-monitoring-enabled [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-metric-dimension-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-process-type [input] (clojure.core/let [letvar287878 {"ProcessName" (portkey.aws/search-for-tag input "ProcessName" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:process-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar287878 ["ProcessName" :content]))})))

(clojure.core/defn- deser-propagate-at-launch [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template [input] (clojure.core/let [letvar287993 {"LaunchTemplateSpecification" (portkey.aws/search-for-tag input "LaunchTemplateSpecification" :flattened? nil :xmlAttribute? nil), "Overrides" (portkey.aws/search-for-tag input "Overrides" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar287993 "LaunchTemplateSpecification") (clojure.core/assoc :launch-template-specification (deser-launch-template-specification (clojure.core/get-in letvar287993 ["LaunchTemplateSpecification" :content]))) (letvar287993 "Overrides") (clojure.core/assoc :overrides (deser-overrides (clojure.core/get-in letvar287993 ["Overrides" :content]))))))

(clojure.core/defn- deser-enabled-metric [input] (clojure.core/let [letvar288101 {"Metric" (portkey.aws/search-for-tag input "Metric" :flattened? nil :xmlAttribute? nil), "Granularity" (portkey.aws/search-for-tag input "Granularity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288101 "Metric") (clojure.core/assoc :metric (deser-xml-string-max-len-255 (clojure.core/get-in letvar288101 ["Metric" :content]))) (letvar288101 "Granularity") (clojure.core/assoc :granularity (deser-xml-string-max-len-255 (clojure.core/get-in letvar288101 ["Granularity" :content]))))))

(clojure.core/defn- deser-no-device [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-ebs [input] (clojure.core/let [letvar288211 {"SnapshotId" (portkey.aws/search-for-tag input "SnapshotId" :flattened? nil :xmlAttribute? nil), "VolumeSize" (portkey.aws/search-for-tag input "VolumeSize" :flattened? nil :xmlAttribute? nil), "VolumeType" (portkey.aws/search-for-tag input "VolumeType" :flattened? nil :xmlAttribute? nil), "DeleteOnTermination" (portkey.aws/search-for-tag input "DeleteOnTermination" :flattened? nil :xmlAttribute? nil), "Iops" (portkey.aws/search-for-tag input "Iops" :flattened? nil :xmlAttribute? nil), "Encrypted" (portkey.aws/search-for-tag input "Encrypted" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288211 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar288211 ["SnapshotId" :content]))) (letvar288211 "VolumeSize") (clojure.core/assoc :volume-size (deser-block-device-ebs-volume-size (clojure.core/get-in letvar288211 ["VolumeSize" :content]))) (letvar288211 "VolumeType") (clojure.core/assoc :volume-type (deser-block-device-ebs-volume-type (clojure.core/get-in letvar288211 ["VolumeType" :content]))) (letvar288211 "DeleteOnTermination") (clojure.core/assoc :delete-on-termination (deser-block-device-ebs-delete-on-termination (clojure.core/get-in letvar288211 ["DeleteOnTermination" :content]))) (letvar288211 "Iops") (clojure.core/assoc :iops (deser-block-device-ebs-iops (clojure.core/get-in letvar288211 ["Iops" :content]))) (letvar288211 "Encrypted") (clojure.core/assoc :encrypted (deser-block-device-ebs-encrypted (clojure.core/get-in letvar288211 ["Encrypted" :content]))))))

(clojure.core/defn- deser-suspended-process [input] (clojure.core/let [letvar288319 {"ProcessName" (portkey.aws/search-for-tag input "ProcessName" :flattened? nil :xmlAttribute? nil), "SuspensionReason" (portkey.aws/search-for-tag input "SuspensionReason" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288319 "ProcessName") (clojure.core/assoc :process-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar288319 ["ProcessName" :content]))) (letvar288319 "SuspensionReason") (clojure.core/assoc :suspension-reason (deser-xml-string-max-len-255 (clojure.core/get-in letvar288319 ["SuspensionReason" :content]))))))

(clojure.core/defn- deser-activity [input] (clojure.core/let [letvar288427 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "EndTime" (portkey.aws/search-for-tag input "EndTime" :flattened? nil :xmlAttribute? nil), "Cause" (portkey.aws/search-for-tag input "Cause" :flattened? nil :xmlAttribute? nil), "StatusCode" (portkey.aws/search-for-tag input "StatusCode" :flattened? nil :xmlAttribute? nil), "Details" (portkey.aws/search-for-tag input "Details" :flattened? nil :xmlAttribute? nil), "StartTime" (portkey.aws/search-for-tag input "StartTime" :flattened? nil :xmlAttribute? nil), "StatusMessage" (portkey.aws/search-for-tag input "StatusMessage" :flattened? nil :xmlAttribute? nil), "Progress" (portkey.aws/search-for-tag input "Progress" :flattened? nil :xmlAttribute? nil), "ActivityId" (portkey.aws/search-for-tag input "ActivityId" :flattened? nil :xmlAttribute? nil), "Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:activity-id (deser-xml-string (clojure.core/get-in letvar288427 ["ActivityId" :content])), :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar288427 ["AutoScalingGroupName" :content])), :cause (deser-xml-string-max-len-1023 (clojure.core/get-in letvar288427 ["Cause" :content])), :start-time (deser-timestamp-type (clojure.core/get-in letvar288427 ["StartTime" :content])), :status-code (deser-scaling-activity-status-code (clojure.core/get-in letvar288427 ["StatusCode" :content]))} (letvar288427 "EndTime") (clojure.core/assoc :end-time (deser-timestamp-type (clojure.core/get-in letvar288427 ["EndTime" :content]))) (letvar288427 "Details") (clojure.core/assoc :details (deser-xml-string (clojure.core/get-in letvar288427 ["Details" :content]))) (letvar288427 "StatusMessage") (clojure.core/assoc :status-message (deser-xml-string-max-len-255 (clojure.core/get-in letvar288427 ["StatusMessage" :content]))) (letvar288427 "Progress") (clojure.core/assoc :progress (deser-progress (clojure.core/get-in letvar288427 ["Progress" :content]))) (letvar288427 "Description") (clojure.core/assoc :description (deser-xml-string (clojure.core/get-in letvar288427 ["Description" :content]))))))

(clojure.core/defn- deser-cooldown [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-iops [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-encrypted [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-max-number-of-auto-scaling-groups [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-auto-scaling-group-max-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-launch-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-configuration coll))) input))

(clojure.core/defn- deser-metric-unit [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-load-balancer-target-group-states [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-target-group-state coll))) input))

(clojure.core/defn- deser-progress [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-number-of-launch-configurations [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-estimated-instance-warmup [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-volume-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-step-adjustments [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-step-adjustment coll))) input))

(clojure.core/defn- deser-spot-price [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-description [input] (clojure.core/let [letvar288614 {"ResourceId" (portkey.aws/search-for-tag input "ResourceId" :flattened? nil :xmlAttribute? nil), "ResourceType" (portkey.aws/search-for-tag input "ResourceType" :flattened? nil :xmlAttribute? nil), "Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil), "PropagateAtLaunch" (portkey.aws/search-for-tag input "PropagateAtLaunch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288614 "ResourceId") (clojure.core/assoc :resource-id (deser-xml-string (clojure.core/get-in letvar288614 ["ResourceId" :content]))) (letvar288614 "ResourceType") (clojure.core/assoc :resource-type (deser-xml-string (clojure.core/get-in letvar288614 ["ResourceType" :content]))) (letvar288614 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar288614 ["Key" :content]))) (letvar288614 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar288614 ["Value" :content]))) (letvar288614 "PropagateAtLaunch") (clojure.core/assoc :propagate-at-launch (deser-propagate-at-launch (clojure.core/get-in letvar288614 ["PropagateAtLaunch" :content]))))))

(clojure.core/defn- deser-instance-protected [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-xml-string-max-len-19 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-xml-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-launch-template-overrides [input] (clojure.core/let [letvar288734 {"InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288734 "InstanceType") (clojure.core/assoc :instance-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar288734 ["InstanceType" :content]))))))

(clojure.core/defn- deser-number-of-auto-scaling-groups [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-load-balancer-state [input] (clojure.core/let [letvar288844 {"LoadBalancerName" (portkey.aws/search-for-tag input "LoadBalancerName" :flattened? nil :xmlAttribute? nil), "State" (portkey.aws/search-for-tag input "State" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar288844 "LoadBalancerName") (clojure.core/assoc :load-balancer-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar288844 ["LoadBalancerName" :content]))) (letvar288844 "State") (clojure.core/assoc :state (deser-xml-string-max-len-255 (clojure.core/get-in letvar288844 ["State" :content]))))))

(clojure.core/defn- deser-scaling-activity-status-code [input] (clojure.core/get {"Failed" :failed, "Cancelled" :cancelled, "PendingSpotBidPlacement" :pending-spot-bid-placement, "WaitingForSpotInstanceRequestId" :waiting-for-spot-instance-request-id, "WaitingForELBConnectionDraining" :waiting-for-elb-connection-draining, "WaitingForInstanceWarmup" :waiting-for-instance-warmup, "PreInService" :pre-in-service, "InProgress" :in-progress, "Successful" :successful, "WaitingForInstanceId" :waiting-for-instance-id, "WaitingForSpotInstanceId" :waiting-for-spot-instance-id, "MidLifecycleAction" :mid-lifecycle-action} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-scheduled-update-group-actions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scheduled-update-group-action coll))) input))

(clojure.core/defn- deser-auto-scaling-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-instance-details coll))) input))

(clojure.core/defn- deser-metric-dimension-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-description-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-description coll))) input))

(clojure.core/defn- deser-timestamp-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-adjustment-type [input] (clojure.core/let [letvar289020 {"AdjustmentType" (portkey.aws/search-for-tag input "AdjustmentType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar289020 "AdjustmentType") (clojure.core/assoc :adjustment-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar289020 ["AdjustmentType" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-255 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-spot-instance-pools [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-xml-string-max-len-1023 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-auto-scaling-group [input] (clojure.core/let [letvar289140 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "NewInstancesProtectedFromScaleIn" (portkey.aws/search-for-tag input "NewInstancesProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil), "LoadBalancerNames" (portkey.aws/search-for-tag input "LoadBalancerNames" :flattened? nil :xmlAttribute? nil), "EnabledMetrics" (portkey.aws/search-for-tag input "EnabledMetrics" :flattened? nil :xmlAttribute? nil), "VPCZoneIdentifier" (portkey.aws/search-for-tag input "VPCZoneIdentifier" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "Tags" (portkey.aws/search-for-tag input "Tags" :flattened? nil :xmlAttribute? nil), "AutoScalingGroupARN" (portkey.aws/search-for-tag input "AutoScalingGroupARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "DefaultCooldown" (portkey.aws/search-for-tag input "DefaultCooldown" :flattened? nil :xmlAttribute? nil), "MixedInstancesPolicy" (portkey.aws/search-for-tag input "MixedInstancesPolicy" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "TargetGroupARNs" (portkey.aws/search-for-tag input "TargetGroupARNs" :flattened? nil :xmlAttribute? nil), "HealthCheckType" (portkey.aws/search-for-tag input "HealthCheckType" :flattened? nil :xmlAttribute? nil), "MinSize" (portkey.aws/search-for-tag input "MinSize" :flattened? nil :xmlAttribute? nil), "SuspendedProcesses" (portkey.aws/search-for-tag input "SuspendedProcesses" :flattened? nil :xmlAttribute? nil), "AvailabilityZones" (portkey.aws/search-for-tag input "AvailabilityZones" :flattened? nil :xmlAttribute? nil), "TerminationPolicies" (portkey.aws/search-for-tag input "TerminationPolicies" :flattened? nil :xmlAttribute? nil), "MaxSize" (portkey.aws/search-for-tag input "MaxSize" :flattened? nil :xmlAttribute? nil), "Instances" (portkey.aws/search-for-tag input "Instances" :flattened? nil :xmlAttribute? nil), "PlacementGroup" (portkey.aws/search-for-tag input "PlacementGroup" :flattened? nil :xmlAttribute? nil), "DesiredCapacity" (portkey.aws/search-for-tag input "DesiredCapacity" :flattened? nil :xmlAttribute? nil), "HealthCheckGracePeriod" (portkey.aws/search-for-tag input "HealthCheckGracePeriod" :flattened? nil :xmlAttribute? nil), "ServiceLinkedRoleARN" (portkey.aws/search-for-tag input "ServiceLinkedRoleARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289140 ["AutoScalingGroupName" :content])), :min-size (deser-auto-scaling-group-min-size (clojure.core/get-in letvar289140 ["MinSize" :content])), :max-size (deser-auto-scaling-group-max-size (clojure.core/get-in letvar289140 ["MaxSize" :content])), :desired-capacity (deser-auto-scaling-group-desired-capacity (clojure.core/get-in letvar289140 ["DesiredCapacity" :content])), :default-cooldown (deser-cooldown (clojure.core/get-in letvar289140 ["DefaultCooldown" :content])), :availability-zones (deser-availability-zones (clojure.core/get-in letvar289140 ["AvailabilityZones" :content])), :health-check-type (deser-xml-string-max-len-32 (clojure.core/get-in letvar289140 ["HealthCheckType" :content])), :created-time (deser-timestamp-type (clojure.core/get-in letvar289140 ["CreatedTime" :content]))} (letvar289140 "NewInstancesProtectedFromScaleIn") (clojure.core/assoc :new-instances-protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar289140 ["NewInstancesProtectedFromScaleIn" :content]))) (letvar289140 "LoadBalancerNames") (clojure.core/assoc :load-balancer-names (deser-load-balancer-names (clojure.core/get-in letvar289140 ["LoadBalancerNames" :content]))) (letvar289140 "EnabledMetrics") (clojure.core/assoc :enabled-metrics (deser-enabled-metrics (clojure.core/get-in letvar289140 ["EnabledMetrics" :content]))) (letvar289140 "VPCZoneIdentifier") (clojure.core/assoc :vpc-zone-identifier (deser-xml-string-max-len-2047 (clojure.core/get-in letvar289140 ["VPCZoneIdentifier" :content]))) (letvar289140 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar289140 ["LaunchTemplate" :content]))) (letvar289140 "Tags") (clojure.core/assoc :tags (deser-tag-description-list (clojure.core/get-in letvar289140 ["Tags" :content]))) (letvar289140 "AutoScalingGroupARN") (clojure.core/assoc :auto-scaling-group-arn (deser-resource-name (clojure.core/get-in letvar289140 ["AutoScalingGroupARN" :content]))) (letvar289140 "Status") (clojure.core/assoc :status (deser-xml-string-max-len-255 (clojure.core/get-in letvar289140 ["Status" :content]))) (letvar289140 "MixedInstancesPolicy") (clojure.core/assoc :mixed-instances-policy (deser-mixed-instances-policy (clojure.core/get-in letvar289140 ["MixedInstancesPolicy" :content]))) (letvar289140 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289140 ["LaunchConfigurationName" :content]))) (letvar289140 "TargetGroupARNs") (clojure.core/assoc :target-group-ar-ns (deser-target-group-ar-ns (clojure.core/get-in letvar289140 ["TargetGroupARNs" :content]))) (letvar289140 "SuspendedProcesses") (clojure.core/assoc :suspended-processes (deser-suspended-processes (clojure.core/get-in letvar289140 ["SuspendedProcesses" :content]))) (letvar289140 "TerminationPolicies") (clojure.core/assoc :termination-policies (deser-termination-policies (clojure.core/get-in letvar289140 ["TerminationPolicies" :content]))) (letvar289140 "Instances") (clojure.core/assoc :instances (deser-instances (clojure.core/get-in letvar289140 ["Instances" :content]))) (letvar289140 "PlacementGroup") (clojure.core/assoc :placement-group (deser-xml-string-max-len-255 (clojure.core/get-in letvar289140 ["PlacementGroup" :content]))) (letvar289140 "HealthCheckGracePeriod") (clojure.core/assoc :health-check-grace-period (deser-health-check-grace-period (clojure.core/get-in letvar289140 ["HealthCheckGracePeriod" :content]))) (letvar289140 "ServiceLinkedRoleARN") (clojure.core/assoc :service-linked-role-arn (deser-resource-name (clojure.core/get-in letvar289140 ["ServiceLinkedRoleARN" :content]))))))

(clojure.core/defn- deser-mixed-instances-policy [input] (clojure.core/let [letvar289248 {"LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "InstancesDistribution" (portkey.aws/search-for-tag input "InstancesDistribution" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar289248 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template (clojure.core/get-in letvar289248 ["LaunchTemplate" :content]))) (letvar289248 "InstancesDistribution") (clojure.core/assoc :instances-distribution (deser-instances-distribution (clojure.core/get-in letvar289248 ["InstancesDistribution" :content]))))))

(clojure.core/defn- deser-auto-scaling-instance-details [input] (clojure.core/let [letvar289356 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "LifecycleState" (portkey.aws/search-for-tag input "LifecycleState" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "ProtectedFromScaleIn" (portkey.aws/search-for-tag input "ProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:instance-id (deser-xml-string-max-len-19 (clojure.core/get-in letvar289356 ["InstanceId" :content])), :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289356 ["AutoScalingGroupName" :content])), :availability-zone (deser-xml-string-max-len-255 (clojure.core/get-in letvar289356 ["AvailabilityZone" :content])), :lifecycle-state (deser-xml-string-max-len-32 (clojure.core/get-in letvar289356 ["LifecycleState" :content])), :health-status (deser-xml-string-max-len-32 (clojure.core/get-in letvar289356 ["HealthStatus" :content])), :protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar289356 ["ProtectedFromScaleIn" :content]))} (letvar289356 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289356 ["LaunchConfigurationName" :content]))) (letvar289356 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar289356 ["LaunchTemplate" :content]))))))

(clojure.core/defn- deser-metric-dimension [input] (clojure.core/let [letvar289464 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-metric-dimension-name (clojure.core/get-in letvar289464 ["Name" :content])), :value (deser-metric-dimension-value (clojure.core/get-in letvar289464 ["Value" :content]))})))

(clojure.core/defn- deser-xml-string-user-data [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-resource-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-xml-string-max-len-1600 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-lifecycle-transition [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-auto-scaling-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-auto-scaling-group coll))) input))

(clojure.core/defn- deser-launch-template-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-mixed-instance-spot-price [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-target-tracking-configuration [input] (clojure.core/let [letvar289619 {"PredefinedMetricSpecification" (portkey.aws/search-for-tag input "PredefinedMetricSpecification" :flattened? nil :xmlAttribute? nil), "CustomizedMetricSpecification" (portkey.aws/search-for-tag input "CustomizedMetricSpecification" :flattened? nil :xmlAttribute? nil), "TargetValue" (portkey.aws/search-for-tag input "TargetValue" :flattened? nil :xmlAttribute? nil), "DisableScaleIn" (portkey.aws/search-for-tag input "DisableScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-value (deser-metric-scale (clojure.core/get-in letvar289619 ["TargetValue" :content]))} (letvar289619 "PredefinedMetricSpecification") (clojure.core/assoc :predefined-metric-specification (deser-predefined-metric-specification (clojure.core/get-in letvar289619 ["PredefinedMetricSpecification" :content]))) (letvar289619 "CustomizedMetricSpecification") (clojure.core/assoc :customized-metric-specification (deser-customized-metric-specification (clojure.core/get-in letvar289619 ["CustomizedMetricSpecification" :content]))) (letvar289619 "DisableScaleIn") (clojure.core/assoc :disable-scale-in (deser-disable-scale-in (clojure.core/get-in letvar289619 ["DisableScaleIn" :content]))))))

(clojure.core/defn- deser-min-adjustment-step [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-heartbeat-timeout [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-classic-link-vpc-security-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-load-balancer-states [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-load-balancer-state coll))) input))

(clojure.core/defn- deser-auto-scaling-notification-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-target-group-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-511 coll))) input))

(clojure.core/defn- deser-lifecycle-hooks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-hook coll))) input))

(clojure.core/defn- deser-block-device-ebs-delete-on-termination [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-step-adjustment [input] (clojure.core/let [letvar289818 {"MetricIntervalLowerBound" (portkey.aws/search-for-tag input "MetricIntervalLowerBound" :flattened? nil :xmlAttribute? nil), "MetricIntervalUpperBound" (portkey.aws/search-for-tag input "MetricIntervalUpperBound" :flattened? nil :xmlAttribute? nil), "ScalingAdjustment" (portkey.aws/search-for-tag input "ScalingAdjustment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:scaling-adjustment (deser-policy-increment (clojure.core/get-in letvar289818 ["ScalingAdjustment" :content]))} (letvar289818 "MetricIntervalLowerBound") (clojure.core/assoc :metric-interval-lower-bound (deser-metric-scale (clojure.core/get-in letvar289818 ["MetricIntervalLowerBound" :content]))) (letvar289818 "MetricIntervalUpperBound") (clojure.core/assoc :metric-interval-upper-bound (deser-metric-scale (clojure.core/get-in letvar289818 ["MetricIntervalUpperBound" :content]))))))

(clojure.core/defn- deser-block-device-mappings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-block-device-mapping coll))) input))

(clojure.core/defn- deser-alarms [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alarm coll))) input))

(clojure.core/defn- deser-metric-statistic [input] (clojure.core/get {"Average" :average, "Minimum" :minimum, "Maximum" :maximum, "SampleCount" :sample-count, "Sum" :sum} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-overrides [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-launch-template-overrides coll))) input))

(clojure.core/defn- deser-xml-string-max-len-2047 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-scaling-policy [input] (clojure.core/let [letvar289987 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "PolicyARN" (portkey.aws/search-for-tag input "PolicyARN" :flattened? nil :xmlAttribute? nil), "MinAdjustmentMagnitude" (portkey.aws/search-for-tag input "MinAdjustmentMagnitude" :flattened? nil :xmlAttribute? nil), "PolicyName" (portkey.aws/search-for-tag input "PolicyName" :flattened? nil :xmlAttribute? nil), "ScalingAdjustment" (portkey.aws/search-for-tag input "ScalingAdjustment" :flattened? nil :xmlAttribute? nil), "Cooldown" (portkey.aws/search-for-tag input "Cooldown" :flattened? nil :xmlAttribute? nil), "EstimatedInstanceWarmup" (portkey.aws/search-for-tag input "EstimatedInstanceWarmup" :flattened? nil :xmlAttribute? nil), "StepAdjustments" (portkey.aws/search-for-tag input "StepAdjustments" :flattened? nil :xmlAttribute? nil), "AdjustmentType" (portkey.aws/search-for-tag input "AdjustmentType" :flattened? nil :xmlAttribute? nil), "MetricAggregationType" (portkey.aws/search-for-tag input "MetricAggregationType" :flattened? nil :xmlAttribute? nil), "TargetTrackingConfiguration" (portkey.aws/search-for-tag input "TargetTrackingConfiguration" :flattened? nil :xmlAttribute? nil), "MinAdjustmentStep" (portkey.aws/search-for-tag input "MinAdjustmentStep" :flattened? nil :xmlAttribute? nil), "Alarms" (portkey.aws/search-for-tag input "Alarms" :flattened? nil :xmlAttribute? nil), "PolicyType" (portkey.aws/search-for-tag input "PolicyType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar289987 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289987 ["AutoScalingGroupName" :content]))) (letvar289987 "PolicyARN") (clojure.core/assoc :policy-arn (deser-resource-name (clojure.core/get-in letvar289987 ["PolicyARN" :content]))) (letvar289987 "MinAdjustmentMagnitude") (clojure.core/assoc :min-adjustment-magnitude (deser-min-adjustment-magnitude (clojure.core/get-in letvar289987 ["MinAdjustmentMagnitude" :content]))) (letvar289987 "PolicyName") (clojure.core/assoc :policy-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar289987 ["PolicyName" :content]))) (letvar289987 "ScalingAdjustment") (clojure.core/assoc :scaling-adjustment (deser-policy-increment (clojure.core/get-in letvar289987 ["ScalingAdjustment" :content]))) (letvar289987 "Cooldown") (clojure.core/assoc :cooldown (deser-cooldown (clojure.core/get-in letvar289987 ["Cooldown" :content]))) (letvar289987 "EstimatedInstanceWarmup") (clojure.core/assoc :estimated-instance-warmup (deser-estimated-instance-warmup (clojure.core/get-in letvar289987 ["EstimatedInstanceWarmup" :content]))) (letvar289987 "StepAdjustments") (clojure.core/assoc :step-adjustments (deser-step-adjustments (clojure.core/get-in letvar289987 ["StepAdjustments" :content]))) (letvar289987 "AdjustmentType") (clojure.core/assoc :adjustment-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar289987 ["AdjustmentType" :content]))) (letvar289987 "MetricAggregationType") (clojure.core/assoc :metric-aggregation-type (deser-xml-string-max-len-32 (clojure.core/get-in letvar289987 ["MetricAggregationType" :content]))) (letvar289987 "TargetTrackingConfiguration") (clojure.core/assoc :target-tracking-configuration (deser-target-tracking-configuration (clojure.core/get-in letvar289987 ["TargetTrackingConfiguration" :content]))) (letvar289987 "MinAdjustmentStep") (clojure.core/assoc :min-adjustment-step (deser-min-adjustment-step (clojure.core/get-in letvar289987 ["MinAdjustmentStep" :content]))) (letvar289987 "Alarms") (clojure.core/assoc :alarms (deser-alarms (clojure.core/get-in letvar289987 ["Alarms" :content]))) (letvar289987 "PolicyType") (clojure.core/assoc :policy-type (deser-xml-string-max-len-64 (clojure.core/get-in letvar289987 ["PolicyType" :content]))))))

(clojure.core/defn- deser-launch-configuration [input] (clojure.core/let [letvar290095 {"LaunchConfigurationARN" (portkey.aws/search-for-tag input "LaunchConfigurationARN" :flattened? nil :xmlAttribute? nil), "PlacementTenancy" (portkey.aws/search-for-tag input "PlacementTenancy" :flattened? nil :xmlAttribute? nil), "KernelId" (portkey.aws/search-for-tag input "KernelId" :flattened? nil :xmlAttribute? nil), "AssociatePublicIpAddress" (portkey.aws/search-for-tag input "AssociatePublicIpAddress" :flattened? nil :xmlAttribute? nil), "InstanceMonitoring" (portkey.aws/search-for-tag input "InstanceMonitoring" :flattened? nil :xmlAttribute? nil), "ImageId" (portkey.aws/search-for-tag input "ImageId" :flattened? nil :xmlAttribute? nil), "SecurityGroups" (portkey.aws/search-for-tag input "SecurityGroups" :flattened? nil :xmlAttribute? nil), "EbsOptimized" (portkey.aws/search-for-tag input "EbsOptimized" :flattened? nil :xmlAttribute? nil), "InstanceType" (portkey.aws/search-for-tag input "InstanceType" :flattened? nil :xmlAttribute? nil), "ClassicLinkVPCId" (portkey.aws/search-for-tag input "ClassicLinkVPCId" :flattened? nil :xmlAttribute? nil), "KeyName" (portkey.aws/search-for-tag input "KeyName" :flattened? nil :xmlAttribute? nil), "SpotPrice" (portkey.aws/search-for-tag input "SpotPrice" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "ClassicLinkVPCSecurityGroups" (portkey.aws/search-for-tag input "ClassicLinkVPCSecurityGroups" :flattened? nil :xmlAttribute? nil), "BlockDeviceMappings" (portkey.aws/search-for-tag input "BlockDeviceMappings" :flattened? nil :xmlAttribute? nil), "RamdiskId" (portkey.aws/search-for-tag input "RamdiskId" :flattened? nil :xmlAttribute? nil), "UserData" (portkey.aws/search-for-tag input "UserData" :flattened? nil :xmlAttribute? nil), "IamInstanceProfile" (portkey.aws/search-for-tag input "IamInstanceProfile" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["LaunchConfigurationName" :content])), :image-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["ImageId" :content])), :instance-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["InstanceType" :content])), :created-time (deser-timestamp-type (clojure.core/get-in letvar290095 ["CreatedTime" :content]))} (letvar290095 "LaunchConfigurationARN") (clojure.core/assoc :launch-configuration-arn (deser-resource-name (clojure.core/get-in letvar290095 ["LaunchConfigurationARN" :content]))) (letvar290095 "PlacementTenancy") (clojure.core/assoc :placement-tenancy (deser-xml-string-max-len-64 (clojure.core/get-in letvar290095 ["PlacementTenancy" :content]))) (letvar290095 "KernelId") (clojure.core/assoc :kernel-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["KernelId" :content]))) (letvar290095 "AssociatePublicIpAddress") (clojure.core/assoc :associate-public-ip-address (deser-associate-public-ip-address (clojure.core/get-in letvar290095 ["AssociatePublicIpAddress" :content]))) (letvar290095 "InstanceMonitoring") (clojure.core/assoc :instance-monitoring (deser-instance-monitoring (clojure.core/get-in letvar290095 ["InstanceMonitoring" :content]))) (letvar290095 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-groups (clojure.core/get-in letvar290095 ["SecurityGroups" :content]))) (letvar290095 "EbsOptimized") (clojure.core/assoc :ebs-optimized (deser-ebs-optimized (clojure.core/get-in letvar290095 ["EbsOptimized" :content]))) (letvar290095 "ClassicLinkVPCId") (clojure.core/assoc :classic-link-vpc-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["ClassicLinkVPCId" :content]))) (letvar290095 "KeyName") (clojure.core/assoc :key-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["KeyName" :content]))) (letvar290095 "SpotPrice") (clojure.core/assoc :spot-price (deser-spot-price (clojure.core/get-in letvar290095 ["SpotPrice" :content]))) (letvar290095 "ClassicLinkVPCSecurityGroups") (clojure.core/assoc :classic-link-vpc-security-groups (deser-classic-link-vpc-security-groups (clojure.core/get-in letvar290095 ["ClassicLinkVPCSecurityGroups" :content]))) (letvar290095 "BlockDeviceMappings") (clojure.core/assoc :block-device-mappings (deser-block-device-mappings (clojure.core/get-in letvar290095 ["BlockDeviceMappings" :content]))) (letvar290095 "RamdiskId") (clojure.core/assoc :ramdisk-id (deser-xml-string-max-len-255 (clojure.core/get-in letvar290095 ["RamdiskId" :content]))) (letvar290095 "UserData") (clojure.core/assoc :user-data (deser-xml-string-user-data (clojure.core/get-in letvar290095 ["UserData" :content]))) (letvar290095 "IamInstanceProfile") (clojure.core/assoc :iam-instance-profile (deser-xml-string-max-len-1600 (clojure.core/get-in letvar290095 ["IamInstanceProfile" :content]))))))

(clojure.core/defn- deser-lifecycle-hook [input] (clojure.core/let [letvar290203 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "GlobalTimeout" (portkey.aws/search-for-tag input "GlobalTimeout" :flattened? nil :xmlAttribute? nil), "NotificationTargetARN" (portkey.aws/search-for-tag input "NotificationTargetARN" :flattened? nil :xmlAttribute? nil), "NotificationMetadata" (portkey.aws/search-for-tag input "NotificationMetadata" :flattened? nil :xmlAttribute? nil), "RoleARN" (portkey.aws/search-for-tag input "RoleARN" :flattened? nil :xmlAttribute? nil), "LifecycleHookName" (portkey.aws/search-for-tag input "LifecycleHookName" :flattened? nil :xmlAttribute? nil), "DefaultResult" (portkey.aws/search-for-tag input "DefaultResult" :flattened? nil :xmlAttribute? nil), "LifecycleTransition" (portkey.aws/search-for-tag input "LifecycleTransition" :flattened? nil :xmlAttribute? nil), "HeartbeatTimeout" (portkey.aws/search-for-tag input "HeartbeatTimeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar290203 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-resource-name (clojure.core/get-in letvar290203 ["AutoScalingGroupName" :content]))) (letvar290203 "GlobalTimeout") (clojure.core/assoc :global-timeout (deser-global-timeout (clojure.core/get-in letvar290203 ["GlobalTimeout" :content]))) (letvar290203 "NotificationTargetARN") (clojure.core/assoc :notification-target-arn (deser-resource-name (clojure.core/get-in letvar290203 ["NotificationTargetARN" :content]))) (letvar290203 "NotificationMetadata") (clojure.core/assoc :notification-metadata (deser-xml-string-max-len-1023 (clojure.core/get-in letvar290203 ["NotificationMetadata" :content]))) (letvar290203 "RoleARN") (clojure.core/assoc :role-arn (deser-resource-name (clojure.core/get-in letvar290203 ["RoleARN" :content]))) (letvar290203 "LifecycleHookName") (clojure.core/assoc :lifecycle-hook-name (deser-ascii-string-max-len-255 (clojure.core/get-in letvar290203 ["LifecycleHookName" :content]))) (letvar290203 "DefaultResult") (clojure.core/assoc :default-result (deser-lifecycle-action-result (clojure.core/get-in letvar290203 ["DefaultResult" :content]))) (letvar290203 "LifecycleTransition") (clojure.core/assoc :lifecycle-transition (deser-lifecycle-transition (clojure.core/get-in letvar290203 ["LifecycleTransition" :content]))) (letvar290203 "HeartbeatTimeout") (clojure.core/assoc :heartbeat-timeout (deser-heartbeat-timeout (clojure.core/get-in letvar290203 ["HeartbeatTimeout" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-511 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-disable-scale-in [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-metric-granularity-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-granularity-type coll))) input))

(clojure.core/defn- deser-block-device-mapping [input] (clojure.core/let [letvar290335 {"VirtualName" (portkey.aws/search-for-tag input "VirtualName" :flattened? nil :xmlAttribute? nil), "DeviceName" (portkey.aws/search-for-tag input "DeviceName" :flattened? nil :xmlAttribute? nil), "Ebs" (portkey.aws/search-for-tag input "Ebs" :flattened? nil :xmlAttribute? nil), "NoDevice" (portkey.aws/search-for-tag input "NoDevice" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:device-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290335 ["DeviceName" :content]))} (letvar290335 "VirtualName") (clojure.core/assoc :virtual-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290335 ["VirtualName" :content]))) (letvar290335 "Ebs") (clojure.core/assoc :ebs (deser-ebs (clojure.core/get-in letvar290335 ["Ebs" :content]))) (letvar290335 "NoDevice") (clojure.core/assoc :no-device (deser-no-device (clojure.core/get-in letvar290335 ["NoDevice" :content]))))))

(clojure.core/defn- deser-alarm [input] (clojure.core/let [letvar290443 {"AlarmName" (portkey.aws/search-for-tag input "AlarmName" :flattened? nil :xmlAttribute? nil), "AlarmARN" (portkey.aws/search-for-tag input "AlarmARN" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar290443 "AlarmName") (clojure.core/assoc :alarm-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290443 ["AlarmName" :content]))) (letvar290443 "AlarmARN") (clojure.core/assoc :alarm-arn (deser-resource-name (clojure.core/get-in letvar290443 ["AlarmARN" :content]))))))

(clojure.core/defn- deser-metric-scale [input] (java.lang.Double. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-block-device-ebs-volume-type [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-metric-name [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-on-demand-percentage-above-base-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-failed-scheduled-update-group-action-request [input] (clojure.core/let [letvar290565 {"ScheduledActionName" (portkey.aws/search-for-tag input "ScheduledActionName" :flattened? nil :xmlAttribute? nil), "ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ErrorMessage" (portkey.aws/search-for-tag input "ErrorMessage" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:scheduled-action-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290565 ["ScheduledActionName" :content]))} (letvar290565 "ErrorCode") (clojure.core/assoc :error-code (deser-xml-string-max-len-64 (clojure.core/get-in letvar290565 ["ErrorCode" :content]))) (letvar290565 "ErrorMessage") (clojure.core/assoc :error-message (deser-xml-string (clojure.core/get-in letvar290565 ["ErrorMessage" :content]))))))

(clojure.core/defn- deser-metric-dimensions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-dimension coll))) input))

(clojure.core/defn- deser-instance [input] (clojure.core/let [letvar290690 {"InstanceId" (portkey.aws/search-for-tag input "InstanceId" :flattened? nil :xmlAttribute? nil), "AvailabilityZone" (portkey.aws/search-for-tag input "AvailabilityZone" :flattened? nil :xmlAttribute? nil), "LifecycleState" (portkey.aws/search-for-tag input "LifecycleState" :flattened? nil :xmlAttribute? nil), "HealthStatus" (portkey.aws/search-for-tag input "HealthStatus" :flattened? nil :xmlAttribute? nil), "LaunchConfigurationName" (portkey.aws/search-for-tag input "LaunchConfigurationName" :flattened? nil :xmlAttribute? nil), "LaunchTemplate" (portkey.aws/search-for-tag input "LaunchTemplate" :flattened? nil :xmlAttribute? nil), "ProtectedFromScaleIn" (portkey.aws/search-for-tag input "ProtectedFromScaleIn" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:instance-id (deser-xml-string-max-len-19 (clojure.core/get-in letvar290690 ["InstanceId" :content])), :availability-zone (deser-xml-string-max-len-255 (clojure.core/get-in letvar290690 ["AvailabilityZone" :content])), :lifecycle-state (deser-lifecycle-state (clojure.core/get-in letvar290690 ["LifecycleState" :content])), :health-status (deser-xml-string-max-len-32 (clojure.core/get-in letvar290690 ["HealthStatus" :content])), :protected-from-scale-in (deser-instance-protected (clojure.core/get-in letvar290690 ["ProtectedFromScaleIn" :content]))} (letvar290690 "LaunchConfigurationName") (clojure.core/assoc :launch-configuration-name (deser-xml-string-max-len-255 (clojure.core/get-in letvar290690 ["LaunchConfigurationName" :content]))) (letvar290690 "LaunchTemplate") (clojure.core/assoc :launch-template (deser-launch-template-specification (clojure.core/get-in letvar290690 ["LaunchTemplate" :content]))))))

(clojure.core/defn- deser-metric-namespace [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-policy-increment [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-adjustment-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-adjustment-type coll))) input))

(clojure.core/defn- deser-notification-configuration [input] (clojure.core/let [letvar290822 {"AutoScalingGroupName" (portkey.aws/search-for-tag input "AutoScalingGroupName" :flattened? nil :xmlAttribute? nil), "TopicARN" (portkey.aws/search-for-tag input "TopicARN" :flattened? nil :xmlAttribute? nil), "NotificationType" (portkey.aws/search-for-tag input "NotificationType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar290822 "AutoScalingGroupName") (clojure.core/assoc :auto-scaling-group-name (deser-resource-name (clojure.core/get-in letvar290822 ["AutoScalingGroupName" :content]))) (letvar290822 "TopicARN") (clojure.core/assoc :topic-arn (deser-resource-name (clojure.core/get-in letvar290822 ["TopicARN" :content]))) (letvar290822 "NotificationType") (clojure.core/assoc :notification-type (deser-xml-string-max-len-255 (clojure.core/get-in letvar290822 ["NotificationType" :content]))))))

(clojure.core/defn- deser-xml-string-max-len-64 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-suspended-processes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-suspended-process coll))) input))

(clojure.core/defn- deser-auto-scaling-group-desired-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-availability-zones [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-255 coll))) input))

(clojure.core/defn- deser-metric-type [input] (clojure.core/get {"ASGAverageCPUUtilization" :asg-average-cpu-utilization, "ASGAverageNetworkIn" :asg-average-network-in, "ASGAverageNetworkOut" :asg-average-network-out, "ALBRequestCountPerTarget" :alb-request-count-per-target} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-termination-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-1600 coll))) input))

(clojure.core/defn- deser-processes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-process-type coll))) input))

(clojure.core/defn- deser-metric-collection-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-collection-type coll))) input))

(clojure.core/defn- deser-auto-scaling-group-min-size [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-metric-granularity-type [input] (clojure.core/let [letvar291046 {"Granularity" (portkey.aws/search-for-tag input "Granularity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar291046 "Granularity") (clojure.core/assoc :granularity (deser-xml-string-max-len-255 (clojure.core/get-in letvar291046 ["Granularity" :content]))))))

(clojure.core/defn- deser-scaling-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-policy coll))) input))

(clojure.core/defn- deser-customized-metric-specification [input] (clojure.core/let [letvar291171 {"MetricName" (portkey.aws/search-for-tag input "MetricName" :flattened? nil :xmlAttribute? nil), "Namespace" (portkey.aws/search-for-tag input "Namespace" :flattened? nil :xmlAttribute? nil), "Dimensions" (portkey.aws/search-for-tag input "Dimensions" :flattened? nil :xmlAttribute? nil), "Statistic" (portkey.aws/search-for-tag input "Statistic" :flattened? nil :xmlAttribute? nil), "Unit" (portkey.aws/search-for-tag input "Unit" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:metric-name (deser-metric-name (clojure.core/get-in letvar291171 ["MetricName" :content])), :namespace (deser-metric-namespace (clojure.core/get-in letvar291171 ["Namespace" :content])), :statistic (deser-metric-statistic (clojure.core/get-in letvar291171 ["Statistic" :content]))} (letvar291171 "Dimensions") (clojure.core/assoc :dimensions (deser-metric-dimensions (clojure.core/get-in letvar291171 ["Dimensions" :content]))) (letvar291171 "Unit") (clojure.core/assoc :unit (deser-metric-unit (clojure.core/get-in letvar291171 ["Unit" :content]))))))

(clojure.core/defn- deser-health-check-grace-period [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-on-demand-base-capacity [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-xml-string-max-len-32 [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-describe-adjustment-types-answer ([input] (response-describe-adjustment-types-answer nil input)) ([resultWrapper291182 input] (clojure.core/let [rawinput291181 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291183 {"AdjustmentTypes" (portkey.aws/search-for-tag rawinput291181 "AdjustmentTypes" :flattened? nil :result-wrapper resultWrapper291182)}] (clojure.core/cond-> {} (letvar291183 "AdjustmentTypes") (clojure.core/assoc :adjustment-types (deser-adjustment-types (clojure.core/get-in letvar291183 ["AdjustmentTypes" :content])))))))

(clojure.core/defn- response-resource-contention-fault ([input] (response-resource-contention-fault nil input)) ([resultWrapper291185 input] (clojure.core/let [rawinput291184 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291186 {"message" (portkey.aws/search-for-tag rawinput291184 "message" :flattened? nil :result-wrapper resultWrapper291185)}] (clojure.core/cond-> {} (letvar291186 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291186 ["message" :content])))))))

(clojure.core/defn- response-complete-lifecycle-action-answer ([input] (response-complete-lifecycle-action-answer nil input)) ([resultWrapper291188 input] (clojure.core/let [rawinput291187 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291189 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-load-balancer-target-groups-result-type ([input] (response-detach-load-balancer-target-groups-result-type nil input)) ([resultWrapper291191 input] (clojure.core/let [rawinput291190 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291192 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-instances-answer ([input] (response-detach-instances-answer nil input)) ([resultWrapper291194 input] (clojure.core/let [rawinput291193 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291195 {"Activities" (portkey.aws/search-for-tag rawinput291193 "Activities" :flattened? nil :result-wrapper resultWrapper291194)}] (clojure.core/cond-> {} (letvar291195 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar291195 ["Activities" :content])))))))

(clojure.core/defn- response-tags-type ([input] (response-tags-type nil input)) ([resultWrapper291197 input] (clojure.core/let [rawinput291196 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291198 {"Tags" (portkey.aws/search-for-tag rawinput291196 "Tags" :flattened? nil :result-wrapper resultWrapper291197), "NextToken" (portkey.aws/search-for-tag rawinput291196 "NextToken" :flattened? nil :result-wrapper resultWrapper291197)}] (clojure.core/cond-> {} (letvar291198 "Tags") (clojure.core/assoc :tags (deser-tag-description-list (clojure.core/get-in letvar291198 ["Tags" :content]))) (letvar291198 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291198 ["NextToken" :content])))))))

(clojure.core/defn- response-processes-type ([input] (response-processes-type nil input)) ([resultWrapper291200 input] (clojure.core/let [rawinput291199 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291201 {"Processes" (portkey.aws/search-for-tag rawinput291199 "Processes" :flattened? nil :result-wrapper resultWrapper291200)}] (clojure.core/cond-> {} (letvar291201 "Processes") (clojure.core/assoc :processes (deser-processes (clojure.core/get-in letvar291201 ["Processes" :content])))))))

(clojure.core/defn- response-already-exists-fault ([input] (response-already-exists-fault nil input)) ([resultWrapper291203 input] (clojure.core/let [rawinput291202 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291204 {"message" (portkey.aws/search-for-tag rawinput291202 "message" :flattened? nil :result-wrapper resultWrapper291203)}] (clojure.core/cond-> {} (letvar291204 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291204 ["message" :content])))))))

(clojure.core/defn- response-describe-termination-policy-types-answer ([input] (response-describe-termination-policy-types-answer nil input)) ([resultWrapper291206 input] (clojure.core/let [rawinput291205 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291207 {"TerminationPolicyTypes" (portkey.aws/search-for-tag rawinput291205 "TerminationPolicyTypes" :flattened? nil :result-wrapper resultWrapper291206)}] (clojure.core/cond-> {} (letvar291207 "TerminationPolicyTypes") (clojure.core/assoc :termination-policy-types (deser-termination-policies (clojure.core/get-in letvar291207 ["TerminationPolicyTypes" :content])))))))

(clojure.core/defn- response-describe-lifecycle-hooks-answer ([input] (response-describe-lifecycle-hooks-answer nil input)) ([resultWrapper291209 input] (clojure.core/let [rawinput291208 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291210 {"LifecycleHooks" (portkey.aws/search-for-tag rawinput291208 "LifecycleHooks" :flattened? nil :result-wrapper resultWrapper291209)}] (clojure.core/cond-> {} (letvar291210 "LifecycleHooks") (clojure.core/assoc :lifecycle-hooks (deser-lifecycle-hooks (clojure.core/get-in letvar291210 ["LifecycleHooks" :content])))))))

(clojure.core/defn- response-auto-scaling-groups-type ([input] (response-auto-scaling-groups-type nil input)) ([resultWrapper291212 input] (clojure.core/let [rawinput291211 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291213 {"AutoScalingGroups" (portkey.aws/search-for-tag rawinput291211 "AutoScalingGroups" :flattened? nil :result-wrapper resultWrapper291212), "NextToken" (portkey.aws/search-for-tag rawinput291211 "NextToken" :flattened? nil :result-wrapper resultWrapper291212)}] (clojure.core/cond-> {:auto-scaling-groups (deser-auto-scaling-groups (clojure.core/get-in letvar291213 ["AutoScalingGroups" :content]))} (letvar291213 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291213 ["NextToken" :content])))))))

(clojure.core/defn- response-policies-type ([input] (response-policies-type nil input)) ([resultWrapper291215 input] (clojure.core/let [rawinput291214 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291216 {"ScalingPolicies" (portkey.aws/search-for-tag rawinput291214 "ScalingPolicies" :flattened? nil :result-wrapper resultWrapper291215), "NextToken" (portkey.aws/search-for-tag rawinput291214 "NextToken" :flattened? nil :result-wrapper resultWrapper291215)}] (clojure.core/cond-> {} (letvar291216 "ScalingPolicies") (clojure.core/assoc :scaling-policies (deser-scaling-policies (clojure.core/get-in letvar291216 ["ScalingPolicies" :content]))) (letvar291216 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291216 ["NextToken" :content])))))))

(clojure.core/defn- response-exit-standby-answer ([input] (response-exit-standby-answer nil input)) ([resultWrapper291218 input] (clojure.core/let [rawinput291217 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291219 {"Activities" (portkey.aws/search-for-tag rawinput291217 "Activities" :flattened? nil :result-wrapper resultWrapper291218)}] (clojure.core/cond-> {} (letvar291219 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar291219 ["Activities" :content])))))))

(clojure.core/defn- response-delete-lifecycle-hook-answer ([input] (response-delete-lifecycle-hook-answer nil input)) ([resultWrapper291221 input] (clojure.core/let [rawinput291220 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291222 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-launch-configurations-type ([input] (response-launch-configurations-type nil input)) ([resultWrapper291224 input] (clojure.core/let [rawinput291223 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291225 {"LaunchConfigurations" (portkey.aws/search-for-tag rawinput291223 "LaunchConfigurations" :flattened? nil :result-wrapper resultWrapper291224), "NextToken" (portkey.aws/search-for-tag rawinput291223 "NextToken" :flattened? nil :result-wrapper resultWrapper291224)}] (clojure.core/cond-> {:launch-configurations (deser-launch-configurations (clojure.core/get-in letvar291225 ["LaunchConfigurations" :content]))} (letvar291225 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291225 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-load-balancer-target-groups-response ([input] (response-describe-load-balancer-target-groups-response nil input)) ([resultWrapper291227 input] (clojure.core/let [rawinput291226 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291228 {"LoadBalancerTargetGroups" (portkey.aws/search-for-tag rawinput291226 "LoadBalancerTargetGroups" :flattened? nil :result-wrapper resultWrapper291227), "NextToken" (portkey.aws/search-for-tag rawinput291226 "NextToken" :flattened? nil :result-wrapper resultWrapper291227)}] (clojure.core/cond-> {} (letvar291228 "LoadBalancerTargetGroups") (clojure.core/assoc :load-balancer-target-groups (deser-load-balancer-target-group-states (clojure.core/get-in letvar291228 ["LoadBalancerTargetGroups" :content]))) (letvar291228 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291228 ["NextToken" :content])))))))

(clojure.core/defn- response-enter-standby-answer ([input] (response-enter-standby-answer nil input)) ([resultWrapper291230 input] (clojure.core/let [rawinput291229 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291231 {"Activities" (portkey.aws/search-for-tag rawinput291229 "Activities" :flattened? nil :result-wrapper resultWrapper291230)}] (clojure.core/cond-> {} (letvar291231 "Activities") (clojure.core/assoc :activities (deser-activities (clojure.core/get-in letvar291231 ["Activities" :content])))))))

(clojure.core/defn- response-activities-type ([input] (response-activities-type nil input)) ([resultWrapper291233 input] (clojure.core/let [rawinput291232 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291234 {"Activities" (portkey.aws/search-for-tag rawinput291232 "Activities" :flattened? nil :result-wrapper resultWrapper291233), "NextToken" (portkey.aws/search-for-tag rawinput291232 "NextToken" :flattened? nil :result-wrapper resultWrapper291233)}] (clojure.core/cond-> {:activities (deser-activities (clojure.core/get-in letvar291234 ["Activities" :content]))} (letvar291234 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291234 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-load-balancers-response ([input] (response-describe-load-balancers-response nil input)) ([resultWrapper291236 input] (clojure.core/let [rawinput291235 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291237 {"LoadBalancers" (portkey.aws/search-for-tag rawinput291235 "LoadBalancers" :flattened? nil :result-wrapper resultWrapper291236), "NextToken" (portkey.aws/search-for-tag rawinput291235 "NextToken" :flattened? nil :result-wrapper resultWrapper291236)}] (clojure.core/cond-> {} (letvar291237 "LoadBalancers") (clojure.core/assoc :load-balancers (deser-load-balancer-states (clojure.core/get-in letvar291237 ["LoadBalancers" :content]))) (letvar291237 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291237 ["NextToken" :content])))))))

(clojure.core/defn- response-describe-lifecycle-hook-types-answer ([input] (response-describe-lifecycle-hook-types-answer nil input)) ([resultWrapper291239 input] (clojure.core/let [rawinput291238 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291240 {"LifecycleHookTypes" (portkey.aws/search-for-tag rawinput291238 "LifecycleHookTypes" :flattened? nil :result-wrapper resultWrapper291239)}] (clojure.core/cond-> {} (letvar291240 "LifecycleHookTypes") (clojure.core/assoc :lifecycle-hook-types (deser-auto-scaling-notification-types (clojure.core/get-in letvar291240 ["LifecycleHookTypes" :content])))))))

(clojure.core/defn- response-record-lifecycle-action-heartbeat-answer ([input] (response-record-lifecycle-action-heartbeat-answer nil input)) ([resultWrapper291242 input] (clojure.core/let [rawinput291241 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291243 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-in-use-fault ([input] (response-resource-in-use-fault nil input)) ([resultWrapper291245 input] (clojure.core/let [rawinput291244 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291246 {"message" (portkey.aws/search-for-tag rawinput291244 "message" :flattened? nil :result-wrapper resultWrapper291245)}] (clojure.core/cond-> {} (letvar291246 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291246 ["message" :content])))))))

(clojure.core/defn- response-activity-type ([input] (response-activity-type nil input)) ([resultWrapper291248 input] (clojure.core/let [rawinput291247 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291249 {"Activity" (portkey.aws/search-for-tag rawinput291247 "Activity" :flattened? nil :result-wrapper resultWrapper291248)}] (clojure.core/cond-> {} (letvar291249 "Activity") (clojure.core/assoc :activity (deser-activity (clojure.core/get-in letvar291249 ["Activity" :content])))))))

(clojure.core/defn- response-limit-exceeded-fault ([input] (response-limit-exceeded-fault nil input)) ([resultWrapper291251 input] (clojure.core/let [rawinput291250 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291252 {"message" (portkey.aws/search-for-tag rawinput291250 "message" :flattened? nil :result-wrapper resultWrapper291251)}] (clojure.core/cond-> {} (letvar291252 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291252 ["message" :content])))))))

(clojure.core/defn- response-describe-account-limits-answer ([input] (response-describe-account-limits-answer nil input)) ([resultWrapper291254 input] (clojure.core/let [rawinput291253 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291255 {"MaxNumberOfAutoScalingGroups" (portkey.aws/search-for-tag rawinput291253 "MaxNumberOfAutoScalingGroups" :flattened? nil :result-wrapper resultWrapper291254), "MaxNumberOfLaunchConfigurations" (portkey.aws/search-for-tag rawinput291253 "MaxNumberOfLaunchConfigurations" :flattened? nil :result-wrapper resultWrapper291254), "NumberOfAutoScalingGroups" (portkey.aws/search-for-tag rawinput291253 "NumberOfAutoScalingGroups" :flattened? nil :result-wrapper resultWrapper291254), "NumberOfLaunchConfigurations" (portkey.aws/search-for-tag rawinput291253 "NumberOfLaunchConfigurations" :flattened? nil :result-wrapper resultWrapper291254)}] (clojure.core/cond-> {} (letvar291255 "MaxNumberOfAutoScalingGroups") (clojure.core/assoc :max-number-of-auto-scaling-groups (deser-max-number-of-auto-scaling-groups (clojure.core/get-in letvar291255 ["MaxNumberOfAutoScalingGroups" :content]))) (letvar291255 "MaxNumberOfLaunchConfigurations") (clojure.core/assoc :max-number-of-launch-configurations (deser-max-number-of-launch-configurations (clojure.core/get-in letvar291255 ["MaxNumberOfLaunchConfigurations" :content]))) (letvar291255 "NumberOfAutoScalingGroups") (clojure.core/assoc :number-of-auto-scaling-groups (deser-number-of-auto-scaling-groups (clojure.core/get-in letvar291255 ["NumberOfAutoScalingGroups" :content]))) (letvar291255 "NumberOfLaunchConfigurations") (clojure.core/assoc :number-of-launch-configurations (deser-number-of-launch-configurations (clojure.core/get-in letvar291255 ["NumberOfLaunchConfigurations" :content])))))))

(clojure.core/defn- response-service-linked-role-failure ([input] (response-service-linked-role-failure nil input)) ([resultWrapper291257 input] (clojure.core/let [rawinput291256 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291258 {"message" (portkey.aws/search-for-tag rawinput291256 "message" :flattened? nil :result-wrapper resultWrapper291257)}] (clojure.core/cond-> {} (letvar291258 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291258 ["message" :content])))))))

(clojure.core/defn- response-set-instance-protection-answer ([input] (response-set-instance-protection-answer nil input)) ([resultWrapper291260 input] (clojure.core/let [rawinput291259 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291261 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-metric-collection-types-answer ([input] (response-describe-metric-collection-types-answer nil input)) ([resultWrapper291263 input] (clojure.core/let [rawinput291262 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291264 {"Metrics" (portkey.aws/search-for-tag rawinput291262 "Metrics" :flattened? nil :result-wrapper resultWrapper291263), "Granularities" (portkey.aws/search-for-tag rawinput291262 "Granularities" :flattened? nil :result-wrapper resultWrapper291263)}] (clojure.core/cond-> {} (letvar291264 "Metrics") (clojure.core/assoc :metrics (deser-metric-collection-types (clojure.core/get-in letvar291264 ["Metrics" :content]))) (letvar291264 "Granularities") (clojure.core/assoc :granularities (deser-metric-granularity-types (clojure.core/get-in letvar291264 ["Granularities" :content])))))))

(clojure.core/defn- response-describe-notification-configurations-answer ([input] (response-describe-notification-configurations-answer nil input)) ([resultWrapper291266 input] (clojure.core/let [rawinput291265 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291267 {"NotificationConfigurations" (portkey.aws/search-for-tag rawinput291265 "NotificationConfigurations" :flattened? nil :result-wrapper resultWrapper291266), "NextToken" (portkey.aws/search-for-tag rawinput291265 "NextToken" :flattened? nil :result-wrapper resultWrapper291266)}] (clojure.core/cond-> {:notification-configurations (deser-notification-configurations (clojure.core/get-in letvar291267 ["NotificationConfigurations" :content]))} (letvar291267 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291267 ["NextToken" :content])))))))

(clojure.core/defn- response-scheduled-actions-type ([input] (response-scheduled-actions-type nil input)) ([resultWrapper291269 input] (clojure.core/let [rawinput291268 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291270 {"ScheduledUpdateGroupActions" (portkey.aws/search-for-tag rawinput291268 "ScheduledUpdateGroupActions" :flattened? nil :result-wrapper resultWrapper291269), "NextToken" (portkey.aws/search-for-tag rawinput291268 "NextToken" :flattened? nil :result-wrapper resultWrapper291269)}] (clojure.core/cond-> {} (letvar291270 "ScheduledUpdateGroupActions") (clojure.core/assoc :scheduled-update-group-actions (deser-scheduled-update-group-actions (clojure.core/get-in letvar291270 ["ScheduledUpdateGroupActions" :content]))) (letvar291270 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291270 ["NextToken" :content])))))))

(clojure.core/defn- response-batch-delete-scheduled-action-answer ([input] (response-batch-delete-scheduled-action-answer nil input)) ([resultWrapper291272 input] (clojure.core/let [rawinput291271 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291273 {"FailedScheduledActions" (portkey.aws/search-for-tag rawinput291271 "FailedScheduledActions" :flattened? nil :result-wrapper resultWrapper291272)}] (clojure.core/cond-> {} (letvar291273 "FailedScheduledActions") (clojure.core/assoc :failed-scheduled-actions (deser-failed-scheduled-update-group-action-requests (clojure.core/get-in letvar291273 ["FailedScheduledActions" :content])))))))

(clojure.core/defn- response-policy-arn-type ([input] (response-policy-arn-type nil input)) ([resultWrapper291275 input] (clojure.core/let [rawinput291274 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291276 {"PolicyARN" (portkey.aws/search-for-tag rawinput291274 "PolicyARN" :flattened? nil :result-wrapper resultWrapper291275), "Alarms" (portkey.aws/search-for-tag rawinput291274 "Alarms" :flattened? nil :result-wrapper resultWrapper291275)}] (clojure.core/cond-> {} (letvar291276 "PolicyARN") (clojure.core/assoc :policy-arn (deser-resource-name (clojure.core/get-in letvar291276 ["PolicyARN" :content]))) (letvar291276 "Alarms") (clojure.core/assoc :alarms (deser-alarms (clojure.core/get-in letvar291276 ["Alarms" :content])))))))

(clojure.core/defn- response-scaling-activity-in-progress-fault ([input] (response-scaling-activity-in-progress-fault nil input)) ([resultWrapper291278 input] (clojure.core/let [rawinput291277 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291279 {"message" (portkey.aws/search-for-tag rawinput291277 "message" :flattened? nil :result-wrapper resultWrapper291278)}] (clojure.core/cond-> {} (letvar291279 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291279 ["message" :content])))))))

(clojure.core/defn- response-auto-scaling-instances-type ([input] (response-auto-scaling-instances-type nil input)) ([resultWrapper291281 input] (clojure.core/let [rawinput291280 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291282 {"AutoScalingInstances" (portkey.aws/search-for-tag rawinput291280 "AutoScalingInstances" :flattened? nil :result-wrapper resultWrapper291281), "NextToken" (portkey.aws/search-for-tag rawinput291280 "NextToken" :flattened? nil :result-wrapper resultWrapper291281)}] (clojure.core/cond-> {} (letvar291282 "AutoScalingInstances") (clojure.core/assoc :auto-scaling-instances (deser-auto-scaling-instances (clojure.core/get-in letvar291282 ["AutoScalingInstances" :content]))) (letvar291282 "NextToken") (clojure.core/assoc :next-token (deser-xml-string (clojure.core/get-in letvar291282 ["NextToken" :content])))))))

(clojure.core/defn- response-attach-load-balancer-target-groups-result-type ([input] (response-attach-load-balancer-target-groups-result-type nil input)) ([resultWrapper291284 input] (clojure.core/let [rawinput291283 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291285 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-attach-load-balancers-result-type ([input] (response-attach-load-balancers-result-type nil input)) ([resultWrapper291287 input] (clojure.core/let [rawinput291286 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291288 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-load-balancers-result-type ([input] (response-detach-load-balancers-result-type nil input)) ([resultWrapper291290 input] (clojure.core/let [rawinput291289 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291291 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-lifecycle-hook-answer ([input] (response-put-lifecycle-hook-answer nil input)) ([resultWrapper291293 input] (clojure.core/let [rawinput291292 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291294 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-put-scheduled-update-group-action-answer ([input] (response-batch-put-scheduled-update-group-action-answer nil input)) ([resultWrapper291296 input] (clojure.core/let [rawinput291295 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291297 {"FailedScheduledUpdateGroupActions" (portkey.aws/search-for-tag rawinput291295 "FailedScheduledUpdateGroupActions" :flattened? nil :result-wrapper resultWrapper291296)}] (clojure.core/cond-> {} (letvar291297 "FailedScheduledUpdateGroupActions") (clojure.core/assoc :failed-scheduled-update-group-actions (deser-failed-scheduled-update-group-action-requests (clojure.core/get-in letvar291297 ["FailedScheduledUpdateGroupActions" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper291299 input] (clojure.core/let [rawinput291298 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291300 {"message" (portkey.aws/search-for-tag rawinput291298 "message" :flattened? nil :result-wrapper resultWrapper291299)}] (clojure.core/cond-> {} (letvar291300 "message") (clojure.core/assoc :message (deser-xml-string-max-len-255 (clojure.core/get-in letvar291300 ["message" :content])))))))

(clojure.core/defn- response-describe-auto-scaling-notification-types-answer ([input] (response-describe-auto-scaling-notification-types-answer nil input)) ([resultWrapper291302 input] (clojure.core/let [rawinput291301 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar291303 {"AutoScalingNotificationTypes" (portkey.aws/search-for-tag rawinput291301 "AutoScalingNotificationTypes" :flattened? nil :result-wrapper resultWrapper291302)}] (clojure.core/cond-> {} (letvar291303 "AutoScalingNotificationTypes") (clojure.core/assoc :auto-scaling-notification-types (deser-auto-scaling-notification-types (clojure.core/get-in letvar291303 ["AutoScalingNotificationTypes" :content])))))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-adjustment-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/adjustment-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ascii-string-max-len-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[A-Za-z0-9\-_\/]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/ascii-string-max-len-255 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/predefined-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/resource-label (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling/predefined-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.predefined-metric-specification/predefined-metric-type] :opt-un [:portkey.aws.autoscaling.predefined-metric-specification/resource-label]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-respect-grace-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/on-demand-allocation-strategy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/spot-allocation-strategy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instances-distribution/spot-max-price (clojure.spec.alpha/and :portkey.aws.autoscaling/mixed-instance-spot-price))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instances-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.instances-distribution/on-demand-allocation-strategy :portkey.aws.autoscaling/on-demand-base-capacity :portkey.aws.autoscaling/on-demand-percentage-above-base-capacity :portkey.aws.autoscaling.instances-distribution/spot-allocation-strategy :portkey.aws.autoscaling/spot-instance-pools :portkey.aws.autoscaling.instances-distribution/spot-max-price]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-contention-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-contention-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-contention-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.filter/name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.filter/name :portkey.aws.autoscaling/values]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enter-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.enter-standby-query/auto-scaling-group-name :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/load-balancer-target-group-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-511))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-target-group-state/load-balancer-target-group-arn :portkey.aws.autoscaling.load-balancer-target-group-state/state]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activities (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/activity))

(clojure.spec.alpha/def :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/failed-scheduled-update-group-action-request))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scheduled-update-group-action/auto-scaling-group-name :portkey.aws.autoscaling.scheduled-update-group-action/end-time :portkey.aws.autoscaling.scheduled-update-group-action/start-time :portkey.aws.autoscaling.scheduled-update-group-action/recurrence :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-name :portkey.aws.autoscaling.scheduled-update-group-action/min-size :portkey.aws.autoscaling.scheduled-update-group-action/max-size :portkey.aws.autoscaling.scheduled-update-group-action/time :portkey.aws.autoscaling.scheduled-update-group-action/desired-capacity :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/associate-public-ip-address clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-auto-scaling-group-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/force-delete]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action-request/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.scheduled-update-group-action-request/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.scheduled-update-group-action-request/start-time :portkey.aws.autoscaling.scheduled-update-group-action-request/end-time :portkey.aws.autoscaling.scheduled-update-group-action-request/recurrence :portkey.aws.autoscaling.scheduled-update-group-action-request/min-size :portkey.aws.autoscaling.scheduled-update-group-action-request/max-size :portkey.aws.autoscaling.scheduled-update-group-action-request/desired-capacity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/global-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/enabled-metric))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tags-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.tags-type/tags :portkey.aws.autoscaling.tags-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-19))

(clojure.spec.alpha/def :portkey.aws.autoscaling/create-or-update-tags-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/processes]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-tags-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/filters :portkey.aws.autoscaling.describe-tags-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/already-exists-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.already-exists-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-target-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1600)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance-monitoring/enabled (clojure.spec.alpha/and :portkey.aws.autoscaling/monitoring-enabled))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-monitoring (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.instance-monitoring/enabled]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/notification-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-state #{"Detaching" "Terminating:Wait" :standby :terminating-wait :pending-proceed :pending "InService" "Quarantined" :detached :quarantined :terminating :terminating-proceed "Pending:Proceed" "Terminating" :terminated :in-service "EnteringStandby" "Pending:Wait" "Terminated" "Standby" "Pending" :pending-wait "Terminating:Proceed" :detaching :entering-standby "Detached"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/lifecycle-hook-specification-list (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-hook-specifications))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/auto-scaling-group-name :portkey.aws.autoscaling.create-auto-scaling-group-type/min-size :portkey.aws.autoscaling.create-auto-scaling-group-type/max-size] :opt-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/new-instances-protected-from-scale-in :portkey.aws.autoscaling.create-auto-scaling-group-type/instance-id :portkey.aws.autoscaling/load-balancer-names :portkey.aws.autoscaling.create-auto-scaling-group-type/vpc-zone-identifier :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-template :portkey.aws.autoscaling/tags :portkey.aws.autoscaling.create-auto-scaling-group-type/lifecycle-hook-specification-list :portkey.aws.autoscaling.create-auto-scaling-group-type/default-cooldown :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-configuration-name :portkey.aws.autoscaling/target-group-ar-ns :portkey.aws.autoscaling.create-auto-scaling-group-type/health-check-type :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling.create-auto-scaling-group-type/placement-group :portkey.aws.autoscaling.create-auto-scaling-group-type/desired-capacity :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.create-auto-scaling-group-type/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/launch-template-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/version (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-specification (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.launch-template-specification/launch-template-id :portkey.aws.autoscaling/launch-template-name :portkey.aws.autoscaling.launch-template-specification/version]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-magnitude clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-collection-type/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-collection-type/metric]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-notification-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-notification-configuration-type/auto-scaling-group-name :portkey.aws.autoscaling.delete-notification-configuration-type/topic-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hooks-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-lifecycle-hooks-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-hook-names]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/security-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/lifecycle-hook-name :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-action-token :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/instance-id]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs-optimized clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/scheduled-update-group-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/auto-scaling-group-name :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-type/scheduled-update-group-actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-load-balancer-target-groups-type/auto-scaling-group-name :portkey.aws.autoscaling/target-group-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-configuration-names :portkey.aws.autoscaling.launch-configuration-names-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/monitoring-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-protection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/instance-ids :portkey.aws.autoscaling.set-instance-protection-query/auto-scaling-group-name :portkey.aws.autoscaling/protected-from-scale-in] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-decrement-desired-capacity clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-desired-capacity-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.set-desired-capacity-type/auto-scaling-group-name :portkey.aws.autoscaling.set-desired-capacity-type/desired-capacity] :opt-un [:portkey.aws.autoscaling/honor-cooldown]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.process-type/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/process-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.process-type/process-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/propagate-at-launch clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/update-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/new-instances-protected-from-scale-in :portkey.aws.autoscaling.update-auto-scaling-group-type/vpc-zone-identifier :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-template :portkey.aws.autoscaling.update-auto-scaling-group-type/default-cooldown :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-configuration-name :portkey.aws.autoscaling.update-auto-scaling-group-type/health-check-type :portkey.aws.autoscaling.update-auto-scaling-group-type/min-size :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling.update-auto-scaling-group-type/max-size :portkey.aws.autoscaling.update-auto-scaling-group-type/placement-group :portkey.aws.autoscaling.update-auto-scaling-group-type/desired-capacity :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.update-auto-scaling-group-type/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-records clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-template-specification :portkey.aws.autoscaling/overrides]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enable-metrics-collection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.enable-metrics-collection-query/auto-scaling-group-name :portkey.aws.autoscaling.enable-metrics-collection-query/granularity] :opt-un [:portkey.aws.autoscaling/metrics]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-termination-policy-types-answer/termination-policy-types (clojure.spec.alpha/and :portkey.aws.autoscaling/termination-policies))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-termination-policy-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-termination-policy-types-answer/termination-policy-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/lifecycle-hooks]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-tags-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tags (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specifications (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook-specification))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metric (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.enabled-metric/metric :portkey.aws.autoscaling.enabled-metric/granularity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-groups-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/auto-scaling-groups] :opt-un [:portkey.aws.autoscaling.auto-scaling-groups-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/no-device clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-instances-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-instances-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/snapshot-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-size (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-type (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/delete-on-termination (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-delete-on-termination))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/iops (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-iops))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/encrypted (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-encrypted))
(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.ebs/snapshot-id :portkey.aws.autoscaling.ebs/volume-size :portkey.aws.autoscaling.ebs/volume-type :portkey.aws.autoscaling.ebs/delete-on-termination :portkey.aws.autoscaling.ebs/iops :portkey.aws.autoscaling.ebs/encrypted]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-health-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.set-instance-health-query/instance-id :portkey.aws.autoscaling.set-instance-health-query/health-status] :opt-un [:portkey.aws.autoscaling/should-respect-grace-period]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policies-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/scaling-policies :portkey.aws.autoscaling.policies-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/suspension-reason (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-process (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.suspended-process/process-name :portkey.aws.autoscaling.suspended-process/suspension-reason]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/cause (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-code (clojure.spec.alpha/and :portkey.aws.autoscaling/scaling-activity-status-code))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/details (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/activity-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/description (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activity (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.activity/activity-id :portkey.aws.autoscaling.activity/auto-scaling-group-name :portkey.aws.autoscaling.activity/cause :portkey.aws.autoscaling.activity/start-time :portkey.aws.autoscaling.activity/status-code] :opt-un [:portkey.aws.autoscaling.activity/end-time :portkey.aws.autoscaling.activity/details :portkey.aws.autoscaling.activity/status-message :portkey.aws.autoscaling/progress :portkey.aws.autoscaling.activity/description]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-iops (clojure.spec.alpha/int-in 100 20000))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-max-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/launch-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/launch-configurations] :opt-un [:portkey.aws.autoscaling.launch-configurations-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-target-group-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-64))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/load-balancer-target-groups (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-target-group-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-response/load-balancer-target-groups :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/progress clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/instance-id :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/estimated-instance-warmup clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activities-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/activities] :opt-un [:portkey.aws.autoscaling.activities-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-size (clojure.spec.alpha/int-in 1 16384))

(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustments (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/step-adjustment))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/load-balancers (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-response/load-balancers :portkey.aws.autoscaling.describe-load-balancers-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling/spot-price (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/lifecycle-hook-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/lifecycle-hook-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.tag-description/resource-id :portkey.aws.autoscaling.tag-description/resource-type :portkey.aws.autoscaling.tag-description/key :portkey.aws.autoscaling.tag-description/value :portkey.aws.autoscaling/propagate-at-launch]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-scheduled-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-scheduled-action-type/auto-scaling-group-name :portkey.aws.autoscaling.delete-scheduled-action-type/scheduled-action-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-protected clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-19 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 19)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-load-balancers-type/auto-scaling-group-name :portkey.aws.autoscaling/load-balancer-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-overrides/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.launch-template-overrides/instance-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling.delete-policy-type/auto-scaling-group-name]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/load-balancer-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-state (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-state/load-balancer-name :portkey.aws.autoscaling.load-balancer-state/state]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-policies-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-policies-type/auto-scaling-group-name :portkey.aws.autoscaling/policy-names :portkey.aws.autoscaling/policy-types :portkey.aws.autoscaling.describe-policies-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-in-use-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-in-use-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-in-use-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.exit-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.exit-standby-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-status-code #{:waiting-for-spot-instance-id "Failed" "Cancelled" :in-progress "PendingSpotBidPlacement" "WaitingForSpotInstanceRequestId" "WaitingForELBConnectionDraining" :successful :waiting-for-elb-connection-draining :pre-in-service "WaitingForInstanceWarmup" :cancelled "PreInService" "InProgress" :pending-spot-bid-placement "Successful" "WaitingForInstanceId" :mid-lifecycle-action "WaitingForSpotInstanceId" "MidLifecycleAction" :waiting-for-instance-id :failed :waiting-for-instance-warmup :waiting-for-spot-instance-request-id})

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-group-names :portkey.aws.autoscaling.auto-scaling-group-names-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-actions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scheduled-update-group-action))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-instance-details))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description-list (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag-description))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-name-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-name-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.launch-configuration-name-type/launch-configuration-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/limit-exceeded-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.limit-exceeded-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-account-limits-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/max-number-of-auto-scaling-groups :portkey.aws.autoscaling/max-number-of-launch-configurations :portkey.aws.autoscaling/number-of-auto-scaling-groups :portkey.aws.autoscaling/number-of-launch-configurations]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 256)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.service-linked-role-failure/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/service-linked-role-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.service-linked-role-failure/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.adjustment-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.adjustment-type/adjustment-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scheduled-update-group-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/auto-scaling-group-name :portkey.aws.autoscaling.put-scheduled-update-group-action-type/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/end-time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/start-time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/recurrence :portkey.aws.autoscaling.put-scheduled-update-group-action-type/min-size :portkey.aws.autoscaling.put-scheduled-update-group-action-type/max-size :portkey.aws.autoscaling.put-scheduled-update-group-action-type/time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/desired-capacity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-delete-scheduled-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-delete-scheduled-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.batch-delete-scheduled-action-type/auto-scaling-group-name :portkey.aws.autoscaling/scheduled-action-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.disable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-metrics-collection-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.disable-metrics-collection-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/metrics]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/spot-instance-pools clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-1023 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1023)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-action-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scaling-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-scaling-policy-type/auto-scaling-group-name :portkey.aws.autoscaling.put-scaling-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling/min-adjustment-magnitude :portkey.aws.autoscaling.put-scaling-policy-type/scaling-adjustment :portkey.aws.autoscaling/cooldown :portkey.aws.autoscaling/estimated-instance-warmup :portkey.aws.autoscaling/step-adjustments :portkey.aws.autoscaling.put-scaling-policy-type/adjustment-type :portkey.aws.autoscaling.put-scaling-policy-type/metric-aggregation-type :portkey.aws.autoscaling/target-tracking-configuration :portkey.aws.autoscaling/min-adjustment-step :portkey.aws.autoscaling.put-scaling-policy-type/policy-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/vpc-zone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/service-linked-role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-name :portkey.aws.autoscaling.auto-scaling-group/min-size :portkey.aws.autoscaling.auto-scaling-group/max-size :portkey.aws.autoscaling.auto-scaling-group/desired-capacity :portkey.aws.autoscaling.auto-scaling-group/default-cooldown :portkey.aws.autoscaling/availability-zones :portkey.aws.autoscaling.auto-scaling-group/health-check-type :portkey.aws.autoscaling.auto-scaling-group/created-time] :opt-un [:portkey.aws.autoscaling.auto-scaling-group/new-instances-protected-from-scale-in :portkey.aws.autoscaling/load-balancer-names :portkey.aws.autoscaling/enabled-metrics :portkey.aws.autoscaling.auto-scaling-group/vpc-zone-identifier :portkey.aws.autoscaling.auto-scaling-group/launch-template :portkey.aws.autoscaling.auto-scaling-group/tags :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-arn :portkey.aws.autoscaling.auto-scaling-group/status :portkey.aws.autoscaling/mixed-instances-policy :portkey.aws.autoscaling.auto-scaling-group/launch-configuration-name :portkey.aws.autoscaling/target-group-ar-ns :portkey.aws.autoscaling/suspended-processes :portkey.aws.autoscaling/termination-policies :portkey.aws.autoscaling/instances :portkey.aws.autoscaling.auto-scaling-group/placement-group :portkey.aws.autoscaling/health-check-grace-period :portkey.aws.autoscaling.auto-scaling-group/service-linked-role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/values (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling/mixed-instances-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/launch-template :portkey.aws.autoscaling/instances-distribution]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/lifecycle-state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instance-details (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.auto-scaling-instance-details/instance-id :portkey.aws.autoscaling.auto-scaling-instance-details/auto-scaling-group-name :portkey.aws.autoscaling.auto-scaling-instance-details/availability-zone :portkey.aws.autoscaling.auto-scaling-instance-details/lifecycle-state :portkey.aws.autoscaling.auto-scaling-instance-details/health-status :portkey.aws.autoscaling.auto-scaling-instance-details/protected-from-scale-in] :opt-un [:portkey.aws.autoscaling.auto-scaling-instance-details/launch-configuration-name :portkey.aws.autoscaling.auto-scaling-instance-details/launch-template]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.metric-dimension/name :portkey.aws.autoscaling.metric-dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-user-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 21847)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1600)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-load-balancers-type/auto-scaling-group-name :portkey.aws.autoscaling/load-balancer-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/metrics (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-collection-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/granularities (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-granularity-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-metric-collection-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-metric-collection-types-answer/metrics :portkey.aws.autoscaling.describe-metric-collection-types-answer/granularities]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 1600)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-transition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-answer/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-answer (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/notification-configurations] :opt-un [:portkey.aws.autoscaling.describe-notification-configurations-answer/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-actions-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/scheduled-update-group-actions :portkey.aws.autoscaling.scheduled-actions-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 3 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 128)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\(\)\.-/_]+" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/mixed-instance-spot-price (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 0 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.target-tracking-configuration/target-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/target-tracking-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.target-tracking-configuration/target-value] :opt-un [:portkey.aws.autoscaling/predefined-metric-specification :portkey.aws.autoscaling/customized-metric-specification :portkey.aws.autoscaling/disable-scale-in]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/filters (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/filter))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-step clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scheduled-actions-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-scheduled-actions-type/auto-scaling-group-name :portkey.aws.autoscaling/scheduled-action-names :portkey.aws.autoscaling.describe-scheduled-actions-type/start-time :portkey.aws.autoscaling.describe-scheduled-actions-type/end-time :portkey.aws.autoscaling.describe-scheduled-actions-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/heartbeat-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/classic-link-vpc-security-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/honor-cooldown clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-notification-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/target-group-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-511))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hooks (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook))

(clojure.spec.alpha/def :portkey.aws.autoscaling/protected-from-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-delete-on-termination clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/scaling-processes (clojure.spec.alpha/and :portkey.aws.autoscaling/process-names))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-process-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.scaling-process-query/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.scaling-process-query/scaling-processes]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-lower-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-upper-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustment (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.step-adjustment/scaling-adjustment] :opt-un [:portkey.aws.autoscaling.step-adjustment/metric-interval-lower-bound :portkey.aws.autoscaling.step-adjustment/metric-interval-upper-bound]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mappings (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/block-device-mapping))

(clojure.spec.alpha/def :portkey.aws.autoscaling/alarms (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/alarm))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/metric-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/breach-threshold (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/execute-policy-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.execute-policy-type/policy-name] :opt-un [:portkey.aws.autoscaling.execute-policy-type/auto-scaling-group-name :portkey.aws.autoscaling/honor-cooldown :portkey.aws.autoscaling.execute-policy-type/metric-value :portkey.aws.autoscaling.execute-policy-type/breach-threshold]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-lifecycle-hook-type/lifecycle-hook-name :portkey.aws.autoscaling.put-lifecycle-hook-type/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling/lifecycle-transition :portkey.aws.autoscaling.put-lifecycle-hook-type/role-arn :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-target-arn :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-metadata :portkey.aws.autoscaling/heartbeat-timeout :portkey.aws.autoscaling.put-lifecycle-hook-type/default-result]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/overrides (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/launch-template-overrides))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-2047 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 2047)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-policy/auto-scaling-group-name :portkey.aws.autoscaling.scaling-policy/policy-arn :portkey.aws.autoscaling/min-adjustment-magnitude :portkey.aws.autoscaling.scaling-policy/policy-name :portkey.aws.autoscaling.scaling-policy/scaling-adjustment :portkey.aws.autoscaling/cooldown :portkey.aws.autoscaling/estimated-instance-warmup :portkey.aws.autoscaling/step-adjustments :portkey.aws.autoscaling.scaling-policy/adjustment-type :portkey.aws.autoscaling.scaling-policy/metric-aggregation-type :portkey.aws.autoscaling/target-tracking-configuration :portkey.aws.autoscaling/min-adjustment-step :portkey.aws.autoscaling/alarms :portkey.aws.autoscaling.scaling-policy/policy-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-delete-scheduled-action-answer/failed-scheduled-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-delete-scheduled-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.batch-delete-scheduled-action-answer/failed-scheduled-actions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configuration-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/classic-link-vpc-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.launch-configuration/launch-configuration-name :portkey.aws.autoscaling.launch-configuration/image-id :portkey.aws.autoscaling.launch-configuration/instance-type :portkey.aws.autoscaling.launch-configuration/created-time] :opt-un [:portkey.aws.autoscaling.launch-configuration/launch-configuration-arn :portkey.aws.autoscaling.launch-configuration/placement-tenancy :portkey.aws.autoscaling.launch-configuration/kernel-id :portkey.aws.autoscaling/associate-public-ip-address :portkey.aws.autoscaling/instance-monitoring :portkey.aws.autoscaling/security-groups :portkey.aws.autoscaling/ebs-optimized :portkey.aws.autoscaling.launch-configuration/classic-link-vpc-id :portkey.aws.autoscaling.launch-configuration/key-name :portkey.aws.autoscaling/spot-price :portkey.aws.autoscaling/classic-link-vpc-security-groups :portkey.aws.autoscaling/block-device-mappings :portkey.aws.autoscaling.launch-configuration/ramdisk-id :portkey.aws.autoscaling.launch-configuration/user-data :portkey.aws.autoscaling.launch-configuration/iam-instance-profile]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.lifecycle-hook/auto-scaling-group-name :portkey.aws.autoscaling/global-timeout :portkey.aws.autoscaling.lifecycle-hook/notification-target-arn :portkey.aws.autoscaling.lifecycle-hook/notification-metadata :portkey.aws.autoscaling.lifecycle-hook/role-arn :portkey.aws.autoscaling.lifecycle-hook/lifecycle-hook-name :portkey.aws.autoscaling.lifecycle-hook/default-result :portkey.aws.autoscaling/lifecycle-transition :portkey.aws.autoscaling/heartbeat-timeout]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policy-arn-type/policy-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-arn-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.policy-arn-type/policy-arn :portkey.aws.autoscaling/alarms]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-511 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 511)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-activity-in-progress-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-in-progress-fault (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-activity-in-progress-fault/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-granularity-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/virtual-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/device-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mapping (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.block-device-mapping/device-name] :opt-un [:portkey.aws.autoscaling.block-device-mapping/virtual-name :portkey.aws.autoscaling/ebs :portkey.aws.autoscaling/no-device]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.tag/key] :opt-un [:portkey.aws.autoscaling.tag/resource-id :portkey.aws.autoscaling.tag/resource-type :portkey.aws.autoscaling.tag/value :portkey.aws.autoscaling/propagate-at-launch]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarm-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarm-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/alarm (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.alarm/alarm-name :portkey.aws.autoscaling.alarm/alarm-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-scale clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/on-demand-percentage-above-base-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-code (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/failed-scheduled-update-group-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.failed-scheduled-update-group-action-request/scheduled-action-name] :opt-un [:portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-code :portkey.aws.autoscaling.failed-scheduled-update-group-action-request/error-message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-instances :portkey.aws.autoscaling.auto-scaling-instances-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimensions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action-requests (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scheduled-update-group-action-request))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.instance/instance-id :portkey.aws.autoscaling.instance/availability-zone :portkey.aws.autoscaling/lifecycle-state :portkey.aws.autoscaling.instance/health-status :portkey.aws.autoscaling.instance/protected-from-scale-in] :opt-un [:portkey.aws.autoscaling.instance/launch-configuration-name :portkey.aws.autoscaling.instance/launch-template]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-increment clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/adjustment-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-instances-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/instance-ids :portkey.aws.autoscaling/max-records :portkey.aws.autoscaling.describe-auto-scaling-instances-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/notification-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.notification-configuration/auto-scaling-group-name :portkey.aws.autoscaling.notification-configuration/topic-arn :portkey.aws.autoscaling.notification-configuration/notification-type]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 64)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/suspended-process))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.attach-load-balancer-target-groups-type/auto-scaling-group-name :portkey.aws.autoscaling/target-group-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-target-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/role-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.lifecycle-hook-specification/lifecycle-hook-name :portkey.aws.autoscaling/lifecycle-transition] :opt-un [:portkey.aws.autoscaling.lifecycle-hook-specification/notification-metadata :portkey.aws.autoscaling/heartbeat-timeout :portkey.aws.autoscaling.lifecycle-hook-specification/default-result :portkey.aws.autoscaling.lifecycle-hook-specification/notification-target-arn :portkey.aws.autoscaling.lifecycle-hook-specification/role-arn]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.describe-load-balancers-request/auto-scaling-group-name] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-request/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-query (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.detach-instances-query/auto-scaling-group-name :portkey.aws.autoscaling/should-decrement-desired-capacity] :opt-un [:portkey.aws.autoscaling/instance-ids]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/classic-link-vpc-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-launch-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.create-launch-configuration-type/launch-configuration-name] :opt-un [:portkey.aws.autoscaling.create-launch-configuration-type/placement-tenancy :portkey.aws.autoscaling.create-launch-configuration-type/kernel-id :portkey.aws.autoscaling.create-launch-configuration-type/instance-id :portkey.aws.autoscaling/associate-public-ip-address :portkey.aws.autoscaling/instance-monitoring :portkey.aws.autoscaling.create-launch-configuration-type/image-id :portkey.aws.autoscaling/security-groups :portkey.aws.autoscaling/ebs-optimized :portkey.aws.autoscaling.create-launch-configuration-type/instance-type :portkey.aws.autoscaling.create-launch-configuration-type/classic-link-vpc-id :portkey.aws.autoscaling.create-launch-configuration-type/key-name :portkey.aws.autoscaling/spot-price :portkey.aws.autoscaling/classic-link-vpc-security-groups :portkey.aws.autoscaling/block-device-mappings :portkey.aws.autoscaling.create-launch-configuration-type/ramdisk-id :portkey.aws.autoscaling.create-launch-configuration-type/user-data :portkey.aws.autoscaling.create-launch-configuration-type/iam-instance-profile]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-desired-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255 :min-count 1))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-type #{:asg-average-network-out "ASGAverageCPUUtilization" "ASGAverageNetworkOut" :alb-request-count-per-target "ALBRequestCountPerTarget" "ASGAverageNetworkIn" :asg-average-network-in :asg-average-cpu-utilization})

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scaling-activities-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/activity-ids :portkey.aws.autoscaling.describe-scaling-activities-type/auto-scaling-group-name :portkey.aws.autoscaling/max-records :portkey.aws.autoscaling.describe-scaling-activities-type/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/termination-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-1600))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-group-names :portkey.aws.autoscaling.describe-notification-configurations-type/next-token :portkey.aws.autoscaling/max-records]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-result-type (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/process-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/process-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-answer (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-collection-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-min-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/instance))

(clojure.spec.alpha/def :portkey.aws.autoscaling/force-delete clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.batch-put-scheduled-update-group-action-answer/failed-scheduled-update-group-actions (clojure.spec.alpha/and :portkey.aws.autoscaling/failed-scheduled-update-group-action-requests))
(clojure.spec.alpha/def :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.batch-put-scheduled-update-group-action-answer/failed-scheduled-update-group-actions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-granularity-type/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-granularity-type/granularity]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 36 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.autoscaling.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling.invalid-next-token/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.delete-lifecycle-hook-type/lifecycle-hook-name :portkey.aws.autoscaling.delete-lifecycle-hook-type/auto-scaling-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-unit))
(clojure.spec.alpha/def :portkey.aws.autoscaling/customized-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling/metric-name :portkey.aws.autoscaling.customized-metric-specification/namespace :portkey.aws.autoscaling.customized-metric-specification/statistic] :opt-un [:portkey.aws.autoscaling.customized-metric-specification/dimensions :portkey.aws.autoscaling.customized-metric-specification/unit]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/health-check-grace-period clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/topic-arn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/notification-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-notification-configuration-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.put-notification-configuration-type/auto-scaling-group-name :portkey.aws.autoscaling.put-notification-configuration-type/topic-arn :portkey.aws.autoscaling.put-notification-configuration-type/notification-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len-255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len-19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-type (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling.complete-lifecycle-action-type/lifecycle-hook-name :portkey.aws.autoscaling.complete-lifecycle-action-type/auto-scaling-group-name :portkey.aws.autoscaling/lifecycle-action-result] :opt-un [:portkey.aws.autoscaling/lifecycle-action-token :portkey.aws.autoscaling.complete-lifecycle-action-type/instance-id]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/on-demand-base-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling/auto-scaling-notification-types]))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len-255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len-32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__283178__auto__] (clojure.core/<= 1 (clojure.core/count s__283178__auto__))) (clojure.core/fn [s__283179__auto__] (clojure.core/< (clojure.core/count s__283179__auto__) 32)) (clojure.core/fn [s__283180__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__283180__auto__))))

(clojure.core/defn update-auto-scaling-group ([update-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-auto-scaling-group-type update-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/update-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef update-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/update-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn describe-scaling-activities ([] (describe-scaling-activities {})) ([describe-scaling-activities-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-scaling-activities-type describe-scaling-activities-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/activities-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-scaling-activities-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScalingActivitiesResult", :http.request.configuration/action "DescribeScalingActivities", :http.request.configuration/output-deser-fn response-activities-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scaling-activities :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scaling-activities-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activities-type))

(clojure.core/defn describe-lifecycle-hook-types ([] (describe-lifecycle-hook-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLifecycleHookTypesResult", :http.request.configuration/action "DescribeLifecycleHookTypes", :http.request.configuration/output-deser-fn response-describe-lifecycle-hook-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-lifecycle-hook-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer))

(clojure.core/defn describe-account-limits ([] (describe-account-limits {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-account-limits-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAccountLimitsResult", :http.request.configuration/action "DescribeAccountLimits", :http.request.configuration/output-deser-fn response-describe-account-limits-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-account-limits :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-account-limits-answer))

(clojure.core/defn describe-auto-scaling-groups ([] (describe-auto-scaling-groups {})) ([auto-scaling-group-names-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-auto-scaling-group-names-type auto-scaling-group-names-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/auto-scaling-groups-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/auto-scaling-group-names-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingGroupsResult", :http.request.configuration/action "DescribeAutoScalingGroups", :http.request.configuration/output-deser-fn response-auto-scaling-groups-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-groups :args (clojure.spec.alpha/? :portkey.aws.autoscaling/auto-scaling-group-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-groups-type))

(clojure.core/defn attach-load-balancer-target-groups ([attach-load-balancer-target-groups-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-load-balancer-target-groups-type attach-load-balancer-target-groups-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-load-balancer-target-groups-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AttachLoadBalancerTargetGroupsResult", :http.request.configuration/action "AttachLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-attach-load-balancer-target-groups-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type))

(clojure.core/defn describe-launch-configurations ([] (describe-launch-configurations {})) ([launch-configuration-names-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-launch-configuration-names-type launch-configuration-names-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/launch-configurations-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/launch-configuration-names-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLaunchConfigurationsResult", :http.request.configuration/action "DescribeLaunchConfigurations", :http.request.configuration/output-deser-fn response-launch-configurations-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-launch-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/launch-configuration-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-configurations-type))

(clojure.core/defn describe-termination-policy-types ([] (describe-termination-policy-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-termination-policy-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTerminationPolicyTypesResult", :http.request.configuration/action "DescribeTerminationPolicyTypes", :http.request.configuration/output-deser-fn response-describe-termination-policy-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-termination-policy-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-termination-policy-types-answer))

(clojure.core/defn describe-adjustment-types ([] (describe-adjustment-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-adjustment-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAdjustmentTypesResult", :http.request.configuration/action "DescribeAdjustmentTypes", :http.request.configuration/output-deser-fn response-describe-adjustment-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-adjustment-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-adjustment-types-answer))

(clojure.core/defn describe-policies ([] (describe-policies {})) ([describe-policies-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-policies-type describe-policies-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/policies-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-policies-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribePoliciesResult", :http.request.configuration/action "DescribePolicies", :http.request.configuration/output-deser-fn response-policies-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef describe-policies :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-policies-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policies-type))

(clojure.core/defn set-instance-protection ([set-instance-protection-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-instance-protection-query set-instance-protection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/set-instance-protection-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-instance-protection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SetInstanceProtectionResult", :http.request.configuration/action "SetInstanceProtection", :http.request.configuration/output-deser-fn response-set-instance-protection-answer, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-instance-protection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-protection-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/set-instance-protection-answer))

(clojure.core/defn resume-processes ([scaling-process-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-scaling-process-query scaling-process-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/scaling-process-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResumeProcesses", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef resume-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-instances ([detach-instances-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-instances-query detach-instances-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-instances-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-instances-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachInstancesResult", :http.request.configuration/action "DetachInstances", :http.request.configuration/output-deser-fn response-detach-instances-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-instances-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-instances-answer))

(clojure.core/defn attach-instances ([attach-instances-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-instances-query attach-instances-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-instances-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachInstances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-instances-query) :ret clojure.core/true?)

(clojure.core/defn delete-tags ([delete-tags-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-tags-type delete-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-tags-type) :ret clojure.core/true?)

(clojure.core/defn record-lifecycle-action-heartbeat ([record-lifecycle-action-heartbeat-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-record-lifecycle-action-heartbeat-type record-lifecycle-action-heartbeat-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "RecordLifecycleActionHeartbeatResult", :http.request.configuration/action "RecordLifecycleActionHeartbeat", :http.request.configuration/output-deser-fn response-record-lifecycle-action-heartbeat-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef record-lifecycle-action-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer))

(clojure.core/defn batch-put-scheduled-update-group-action ([batch-put-scheduled-update-group-action-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-put-scheduled-update-group-action-type batch-put-scheduled-update-group-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "BatchPutScheduledUpdateGroupActionResult", :http.request.configuration/action "BatchPutScheduledUpdateGroupAction", :http.request.configuration/output-deser-fn response-batch-put-scheduled-update-group-action-answer, :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef batch-put-scheduled-update-group-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/batch-put-scheduled-update-group-action-answer))

(clojure.core/defn create-auto-scaling-group ([create-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-auto-scaling-group-type create-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef create-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn terminate-instance-in-auto-scaling-group ([terminate-instance-in-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-terminate-instance-in-auto-scaling-group-type terminate-instance-in-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/activity-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "TerminateInstanceInAutoScalingGroupResult", :http.request.configuration/action "TerminateInstanceInAutoScalingGroup", :http.request.configuration/output-deser-fn response-activity-type, :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef terminate-instance-in-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activity-type))

(clojure.core/defn describe-notification-configurations ([] (describe-notification-configurations {})) ([describe-notification-configurations-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-notification-configurations-type describe-notification-configurations-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-notification-configurations-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-notification-configurations-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeNotificationConfigurationsResult", :http.request.configuration/action "DescribeNotificationConfigurations", :http.request.configuration/output-deser-fn response-describe-notification-configurations-answer, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-notification-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-notification-configurations-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-notification-configurations-answer))

(clojure.core/defn attach-load-balancers ([attach-load-balancers-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-attach-load-balancers-type attach-load-balancers-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/attach-load-balancers-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/attach-load-balancers-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "AttachLoadBalancersResult", :http.request.configuration/action "AttachLoadBalancers", :http.request.configuration/output-deser-fn response-attach-load-balancers-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef attach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancers-result-type))

(clojure.core/defn set-instance-health ([set-instance-health-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-instance-health-query set-instance-health-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-instance-health-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetInstanceHealth", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-health-query) :ret clojure.core/true?)

(clojure.core/defn create-or-update-tags ([create-or-update-tags-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-or-update-tags-type create-or-update-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-or-update-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateOrUpdateTags", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}})))))
(clojure.spec.alpha/fdef create-or-update-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-or-update-tags-type) :ret clojure.core/true?)

(clojure.core/defn execute-policy ([execute-policy-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-execute-policy-type execute-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/execute-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ExecutePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef execute-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/execute-policy-type) :ret clojure.core/true?)

(clojure.core/defn disable-metrics-collection ([disable-metrics-collection-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-disable-metrics-collection-query disable-metrics-collection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/disable-metrics-collection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableMetricsCollection", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef disable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/disable-metrics-collection-query) :ret clojure.core/true?)

(clojure.core/defn describe-scaling-process-types ([] (describe-scaling-process-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/processes-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScalingProcessTypesResult", :http.request.configuration/action "DescribeScalingProcessTypes", :http.request.configuration/output-deser-fn response-processes-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scaling-process-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/processes-type))

(clojure.core/defn delete-lifecycle-hook ([delete-lifecycle-hook-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-lifecycle-hook-type delete-lifecycle-hook-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/delete-lifecycle-hook-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-lifecycle-hook-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteLifecycleHookResult", :http.request.configuration/action "DeleteLifecycleHook", :http.request.configuration/output-deser-fn response-delete-lifecycle-hook-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/delete-lifecycle-hook-answer))

(clojure.core/defn describe-tags ([] (describe-tags {})) ([describe-tags-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-tags-type describe-tags-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/tags-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-tags-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeTagsResult", :http.request.configuration/action "DescribeTags", :http.request.configuration/output-deser-fn response-tags-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-tags-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/tags-type))

(clojure.core/defn describe-scheduled-actions ([] (describe-scheduled-actions {})) ([describe-scheduled-actions-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-scheduled-actions-type describe-scheduled-actions-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/scheduled-actions-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-scheduled-actions-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeScheduledActionsResult", :http.request.configuration/action "DescribeScheduledActions", :http.request.configuration/output-deser-fn response-scheduled-actions-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-scheduled-actions :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scheduled-actions-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/scheduled-actions-type))

(clojure.core/defn set-desired-capacity ([set-desired-capacity-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-set-desired-capacity-type set-desired-capacity-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/set-desired-capacity-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetDesiredCapacity", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef set-desired-capacity :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-desired-capacity-type) :ret clojure.core/true?)

(clojure.core/defn enable-metrics-collection ([enable-metrics-collection-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-enable-metrics-collection-query enable-metrics-collection-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/enable-metrics-collection-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableMetricsCollection", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef enable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enable-metrics-collection-query) :ret clojure.core/true?)

(clojure.core/defn suspend-processes ([scaling-process-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-scaling-process-query scaling-process-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/scaling-process-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SuspendProcesses", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef suspend-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-load-balancer-target-groups ([detach-load-balancer-target-groups-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-load-balancer-target-groups-type detach-load-balancer-target-groups-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-load-balancer-target-groups-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachLoadBalancerTargetGroupsResult", :http.request.configuration/action "DetachLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-detach-load-balancer-target-groups-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type))

(clojure.core/defn detach-load-balancers ([detach-load-balancers-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-detach-load-balancers-type detach-load-balancers-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/detach-load-balancers-result-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/detach-load-balancers-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DetachLoadBalancersResult", :http.request.configuration/action "DetachLoadBalancers", :http.request.configuration/output-deser-fn response-detach-load-balancers-result-type, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef detach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancers-result-type))

(clojure.core/defn describe-lifecycle-hooks ([describe-lifecycle-hooks-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-lifecycle-hooks-type describe-lifecycle-hooks-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-lifecycle-hooks-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-lifecycle-hooks-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLifecycleHooksResult", :http.request.configuration/action "DescribeLifecycleHooks", :http.request.configuration/output-deser-fn response-describe-lifecycle-hooks-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-lifecycle-hooks :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-lifecycle-hooks-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-lifecycle-hooks-answer))

(clojure.core/defn enter-standby ([enter-standby-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-enter-standby-query enter-standby-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/enter-standby-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/enter-standby-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "EnterStandbyResult", :http.request.configuration/action "EnterStandby", :http.request.configuration/output-deser-fn response-enter-standby-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef enter-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enter-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/enter-standby-answer))

(clojure.core/defn describe-load-balancer-target-groups ([describe-load-balancer-target-groups-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-load-balancer-target-groups-request describe-load-balancer-target-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-load-balancer-target-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-load-balancer-target-groups-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancerTargetGroupsResult", :http.request.configuration/action "DescribeLoadBalancerTargetGroups", :http.request.configuration/output-deser-fn response-describe-load-balancer-target-groups-response, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancer-target-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancer-target-groups-response))

(clojure.core/defn describe-auto-scaling-notification-types ([] (describe-auto-scaling-notification-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingNotificationTypesResult", :http.request.configuration/action "DescribeAutoScalingNotificationTypes", :http.request.configuration/output-deser-fn response-describe-auto-scaling-notification-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-notification-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer))

(clojure.core/defn batch-delete-scheduled-action ([batch-delete-scheduled-action-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-delete-scheduled-action-type batch-delete-scheduled-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/batch-delete-scheduled-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/batch-delete-scheduled-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "BatchDeleteScheduledActionResult", :http.request.configuration/action "BatchDeleteScheduledAction", :http.request.configuration/output-deser-fn response-batch-delete-scheduled-action-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef batch-delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/batch-delete-scheduled-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/batch-delete-scheduled-action-answer))

(clojure.core/defn delete-notification-configuration ([delete-notification-configuration-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-notification-configuration-type delete-notification-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-notification-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn exit-standby ([exit-standby-queryinput] (clojure.core/let [request-function-result__284154__auto__ (req-exit-standby-query exit-standby-queryinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/exit-standby-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/exit-standby-query, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ExitStandbyResult", :http.request.configuration/action "ExitStandby", :http.request.configuration/output-deser-fn response-exit-standby-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef exit-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/exit-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/exit-standby-answer))

(clojure.core/defn delete-launch-configuration ([launch-configuration-name-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-launch-configuration-name-type launch-configuration-name-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/launch-configuration-name-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLaunchConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/launch-configuration-name-type) :ret clojure.core/true?)

(clojure.core/defn create-launch-configuration ([create-launch-configuration-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-launch-configuration-type create-launch-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/create-launch-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLaunchConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef create-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-launch-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-auto-scaling-group ([delete-auto-scaling-group-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-auto-scaling-group-type delete-auto-scaling-group-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-auto-scaling-group-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAutoScalingGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn describe-metric-collection-types ([] (describe-metric-collection-types {})) ([_] (clojure.core/let [request-function-result__284154__auto__ {}] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-metric-collection-types-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec nil, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeMetricCollectionTypesResult", :http.request.configuration/action "DescribeMetricCollectionTypes", :http.request.configuration/output-deser-fn response-describe-metric-collection-types-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-metric-collection-types :args clojure.core/empty? :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-metric-collection-types-answer))

(clojure.core/defn describe-auto-scaling-instances ([] (describe-auto-scaling-instances {})) ([describe-auto-scaling-instances-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-auto-scaling-instances-type describe-auto-scaling-instances-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/auto-scaling-instances-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-auto-scaling-instances-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeAutoScalingInstancesResult", :http.request.configuration/action "DescribeAutoScalingInstances", :http.request.configuration/output-deser-fn response-auto-scaling-instances-type, :http.request.spec/error-spec {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-auto-scaling-instances :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-auto-scaling-instances-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-instances-type))

(clojure.core/defn put-notification-configuration ([put-notification-configuration-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-notification-configuration-type put-notification-configuration-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-notification-configuration-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutNotificationConfiguration", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef put-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-scheduled-action ([delete-scheduled-action-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-scheduled-action-type delete-scheduled-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-scheduled-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteScheduledAction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-scheduled-action-type) :ret clojure.core/true?)

(clojure.core/defn complete-lifecycle-action ([complete-lifecycle-action-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-complete-lifecycle-action-type complete-lifecycle-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/complete-lifecycle-action-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/complete-lifecycle-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CompleteLifecycleActionResult", :http.request.configuration/action "CompleteLifecycleAction", :http.request.configuration/output-deser-fn response-complete-lifecycle-action-answer, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef complete-lifecycle-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/complete-lifecycle-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/complete-lifecycle-action-answer))

(clojure.core/defn put-scaling-policy ([put-scaling-policy-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-scaling-policy-type put-scaling-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/policy-arn-type, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-scaling-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutScalingPolicyResult", :http.request.configuration/action "PutScalingPolicy", :http.request.configuration/output-deser-fn response-policy-arn-type, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef put-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scaling-policy-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-arn-type))

(clojure.core/defn delete-policy ([delete-policy-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-policy-type delete-policy-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/delete-policy-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}})))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-policy-type) :ret clojure.core/true?)

(clojure.core/defn describe-load-balancers ([describe-load-balancers-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-describe-load-balancers-request describe-load-balancers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/describe-load-balancers-response, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/describe-load-balancers-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DescribeLoadBalancersResult", :http.request.configuration/action "DescribeLoadBalancers", :http.request.configuration/output-deser-fn response-describe-load-balancers-response, :http.request.spec/error-spec {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancers-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancers-response))

(clojure.core/defn put-scheduled-update-group-action ([put-scheduled-update-group-action-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-scheduled-update-group-action-type put-scheduled-update-group-action-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-scheduled-update-group-action-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutScheduledUpdateGroupAction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef put-scheduled-update-group-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scheduled-update-group-action-type) :ret clojure.core/true?)

(clojure.core/defn put-lifecycle-hook ([put-lifecycle-hook-typeinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-lifecycle-hook-type put-lifecycle-hook-typeinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.autoscaling/put-lifecycle-hook-answer, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2011-01-01", :http.request.configuration/service-id "Auto Scaling", :http.request.spec/input-spec :portkey.aws.autoscaling/put-lifecycle-hook-type, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "PutLifecycleHookResult", :http.request.configuration/action "PutLifecycleHook", :http.request.configuration/output-deser-fn response-put-lifecycle-hook-answer, :http.request.spec/error-spec {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}})))))
(clojure.spec.alpha/fdef put-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/put-lifecycle-hook-answer))
