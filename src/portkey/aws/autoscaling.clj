(ns portkey.aws.autoscaling (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
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
    :signature-version :v4}})

(clojure.core/declare ser-lifecycle-action-result ser-ascii-string-max-len255 ser-lifecycle-hook-names ser-predefined-metric-specification ser-should-respect-grace-period ser-filter ser-associate-public-ip-address ser-load-balancer-names ser-instance-ids ser-notification-target-resource-name ser-instance-monitoring ser-launch-template-specification ser-min-adjustment-magnitude ser-security-groups ser-ebs-optimized ser-monitoring-enabled ser-should-decrement-desired-capacity ser-metric-dimension-value ser-propagate-at-launch ser-max-records ser-tag-key ser-tags ser-lifecycle-hook-specifications ser-no-device ser-policy-names ser-ebs ser-cooldown ser-block-device-ebs-iops ser-block-device-ebs-encrypted ser-auto-scaling-group-max-size ser-metric-unit ser-policy-types ser-estimated-instance-warmup ser-block-device-ebs-volume-size ser-step-adjustments ser-activity-ids ser-spot-price ser-launch-configuration-names ser-instance-protected ser-auto-scaling-group-names ser-xml-string-max-len19 ser-xml-string ser-metric-dimension-name ser-timestamp-type ser-tag-value ser-xml-string-max-len255 ser-xml-string-max-len1023 ser-scheduled-action-names ser-values ser-metric-dimension ser-xml-string-user-data ser-resource-name ser-xml-string-max-len1600 ser-lifecycle-transition ser-launch-template-name ser-target-tracking-configuration ser-filters ser-min-adjustment-step ser-heartbeat-timeout ser-classic-linkvpcsecurity-groups ser-honor-cooldown ser-auto-scaling-notification-types ser-target-grouparns ser-protected-from-scale-in ser-block-device-ebs-delete-on-termination ser-step-adjustment ser-block-device-mappings ser-metric-statistic ser-xml-string-max-len2047 ser-xml-string-max-len511 ser-disable-scale-in ser-block-device-mapping ser-tag ser-metric-scale ser-block-device-ebs-volume-type ser-metric-name ser-metric-dimensions ser-metric-namespace ser-policy-increment ser-xml-string-max-len64 ser-lifecycle-hook-specification ser-auto-scaling-group-desired-capacity ser-availability-zones ser-metric-type ser-termination-policies ser-process-names ser-auto-scaling-group-min-size ser-force-delete ser-lifecycle-action-token ser-customized-metric-specification ser-health-check-grace-period ser-metrics ser-xml-string-max-len32)

(clojure.core/defn- ser-lifecycle-action-result [shape-input] shape-input)
(clojure.core/defn- ser-ascii-string-max-len255 [shape-input] shape-input)
(clojure.core/defn- ser-lifecycle-hook-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-predefined-metric-specification [shape-input] (clojure.core/cond-> {} (:predefined-metric-type shape-input) (clojure.core/assoc "PredefinedMetricSpecification.PredefinedMetricType" (ser-metric-type (:predefined-metric-type shape-input))) (:resource-label shape-input) (clojure.core/assoc "PredefinedMetricSpecification.ResourceLabel" (ser-xml-string-max-len1023 (:resource-label shape-input)))))
(clojure.core/defn- ser-should-respect-grace-period [shape-input] shape-input)
(clojure.core/defn- ser-filter [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "Filter.Name" (ser-xml-string (:name shape-input))) (:values shape-input) (clojure.core/assoc "Filter.Values" (ser-values (:values shape-input)))))
(clojure.core/defn- ser-associate-public-ip-address [shape-input] shape-input)
(clojure.core/defn- ser-load-balancer-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-instance-ids [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-notification-target-resource-name [shape-input] shape-input)
(clojure.core/defn- ser-instance-monitoring [shape-input] (clojure.core/cond-> {} (:enabled shape-input) (clojure.core/assoc "InstanceMonitoring.Enabled" (ser-monitoring-enabled (:enabled shape-input)))))
(clojure.core/defn- ser-launch-template-specification [shape-input] (clojure.core/cond-> {} (:launch-template-id shape-input) (clojure.core/assoc "LaunchTemplateSpecification.LaunchTemplateId" (ser-xml-string-max-len255 (:launch-template-id shape-input))) (:launch-template-name shape-input) (clojure.core/assoc "LaunchTemplateSpecification.LaunchTemplateName" (ser-launch-template-name (:launch-template-name shape-input))) (:version shape-input) (clojure.core/assoc "LaunchTemplateSpecification.Version" (ser-xml-string-max-len255 (:version shape-input)))))
(clojure.core/defn- ser-min-adjustment-magnitude [shape-input] shape-input)
(clojure.core/defn- ser-security-groups [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-ebs-optimized [shape-input] shape-input)
(clojure.core/defn- ser-monitoring-enabled [shape-input] shape-input)
(clojure.core/defn- ser-should-decrement-desired-capacity [shape-input] shape-input)
(clojure.core/defn- ser-metric-dimension-value [shape-input] shape-input)
(clojure.core/defn- ser-propagate-at-launch [shape-input] shape-input)
(clojure.core/defn- ser-max-records [shape-input] shape-input)
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-tags [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-lifecycle-hook-specifications [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-no-device [shape-input] shape-input)
(clojure.core/defn- ser-policy-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-ebs [shape-input] (clojure.core/cond-> {} (:snapshot-id shape-input) (clojure.core/assoc "Ebs.SnapshotId" (ser-xml-string-max-len255 (:snapshot-id shape-input))) (:volume-size shape-input) (clojure.core/assoc "Ebs.VolumeSize" (ser-block-device-ebs-volume-size (:volume-size shape-input))) (:volume-type shape-input) (clojure.core/assoc "Ebs.VolumeType" (ser-block-device-ebs-volume-type (:volume-type shape-input))) (:delete-on-termination shape-input) (clojure.core/assoc "Ebs.DeleteOnTermination" (ser-block-device-ebs-delete-on-termination (:delete-on-termination shape-input))) (:iops shape-input) (clojure.core/assoc "Ebs.Iops" (ser-block-device-ebs-iops (:iops shape-input))) (:encrypted shape-input) (clojure.core/assoc "Ebs.Encrypted" (ser-block-device-ebs-encrypted (:encrypted shape-input)))))
(clojure.core/defn- ser-cooldown [shape-input] shape-input)
(clojure.core/defn- ser-block-device-ebs-iops [shape-input] shape-input)
(clojure.core/defn- ser-block-device-ebs-encrypted [shape-input] shape-input)
(clojure.core/defn- ser-auto-scaling-group-max-size [shape-input] shape-input)
(clojure.core/defn- ser-metric-unit [shape-input] shape-input)
(clojure.core/defn- ser-policy-types [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-estimated-instance-warmup [shape-input] shape-input)
(clojure.core/defn- ser-block-device-ebs-volume-size [shape-input] shape-input)
(clojure.core/defn- ser-step-adjustments [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-activity-ids [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-spot-price [shape-input] shape-input)
(clojure.core/defn- ser-launch-configuration-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-instance-protected [shape-input] shape-input)
(clojure.core/defn- ser-auto-scaling-group-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-xml-string-max-len19 [shape-input] shape-input)
(clojure.core/defn- ser-xml-string [shape-input] shape-input)
(clojure.core/defn- ser-metric-dimension-name [shape-input] shape-input)
(clojure.core/defn- ser-timestamp-type [shape-input] shape-input)
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-xml-string-max-len255 [shape-input] shape-input)
(clojure.core/defn- ser-xml-string-max-len1023 [shape-input] shape-input)
(clojure.core/defn- ser-scheduled-action-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-values [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-dimension [shape-input] (clojure.core/cond-> {} (:name shape-input) (clojure.core/assoc "MetricDimension.Name" (ser-metric-dimension-name (:name shape-input))) (:value shape-input) (clojure.core/assoc "MetricDimension.Value" (ser-metric-dimension-value (:value shape-input)))))
(clojure.core/defn- ser-xml-string-user-data [shape-input] shape-input)
(clojure.core/defn- ser-resource-name [shape-input] shape-input)
(clojure.core/defn- ser-xml-string-max-len1600 [shape-input] shape-input)
(clojure.core/defn- ser-lifecycle-transition [shape-input] shape-input)
(clojure.core/defn- ser-launch-template-name [shape-input] shape-input)
(clojure.core/defn- ser-target-tracking-configuration [shape-input] (clojure.core/cond-> {} (:predefined-metric-specification shape-input) (clojure.core/assoc "TargetTrackingConfiguration.PredefinedMetricSpecification" (ser-predefined-metric-specification (:predefined-metric-specification shape-input))) (:customized-metric-specification shape-input) (clojure.core/assoc "TargetTrackingConfiguration.CustomizedMetricSpecification" (ser-customized-metric-specification (:customized-metric-specification shape-input))) (:target-value shape-input) (clojure.core/assoc "TargetTrackingConfiguration.TargetValue" (ser-metric-scale (:target-value shape-input))) (:disable-scale-in shape-input) (clojure.core/assoc "TargetTrackingConfiguration.DisableScaleIn" (ser-disable-scale-in (:disable-scale-in shape-input)))))
(clojure.core/defn- ser-filters [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-min-adjustment-step [shape-input] shape-input)
(clojure.core/defn- ser-heartbeat-timeout [shape-input] shape-input)
(clojure.core/defn- ser-classic-linkvpcsecurity-groups [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-honor-cooldown [shape-input] shape-input)
(clojure.core/defn- ser-auto-scaling-notification-types [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-target-grouparns [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-protected-from-scale-in [shape-input] shape-input)
(clojure.core/defn- ser-block-device-ebs-delete-on-termination [shape-input] shape-input)
(clojure.core/defn- ser-step-adjustment [shape-input] (clojure.core/cond-> {} (:metric-interval-lower-bound shape-input) (clojure.core/assoc "StepAdjustment.MetricIntervalLowerBound" (ser-metric-scale (:metric-interval-lower-bound shape-input))) (:metric-interval-upper-bound shape-input) (clojure.core/assoc "StepAdjustment.MetricIntervalUpperBound" (ser-metric-scale (:metric-interval-upper-bound shape-input))) (:scaling-adjustment shape-input) (clojure.core/assoc "StepAdjustment.ScalingAdjustment" (ser-policy-increment (:scaling-adjustment shape-input)))))
(clojure.core/defn- ser-block-device-mappings [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-statistic [shape-input] ({"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} shape-input))
(clojure.core/defn- ser-xml-string-max-len2047 [shape-input] shape-input)
(clojure.core/defn- ser-xml-string-max-len511 [shape-input] shape-input)
(clojure.core/defn- ser-disable-scale-in [shape-input] shape-input)
(clojure.core/defn- ser-block-device-mapping [shape-input] (clojure.core/cond-> {} (:virtual-name shape-input) (clojure.core/assoc "BlockDeviceMapping.VirtualName" (ser-xml-string-max-len255 (:virtual-name shape-input))) (:device-name shape-input) (clojure.core/assoc "BlockDeviceMapping.DeviceName" (ser-xml-string-max-len255 (:device-name shape-input))) (:ebs shape-input) (clojure.core/assoc "BlockDeviceMapping.Ebs" (ser-ebs (:ebs shape-input))) (:no-device shape-input) (clojure.core/assoc "BlockDeviceMapping.NoDevice" (ser-no-device (:no-device shape-input)))))
(clojure.core/defn- ser-tag [shape-input] (clojure.core/cond-> {} (:resource-id shape-input) (clojure.core/assoc "Tag.ResourceId" (ser-xml-string (:resource-id shape-input))) (:resource-type shape-input) (clojure.core/assoc "Tag.ResourceType" (ser-xml-string (:resource-type shape-input))) (:key shape-input) (clojure.core/assoc "Tag.Key" (ser-tag-key (:key shape-input))) (:value shape-input) (clojure.core/assoc "Tag.Value" (ser-tag-value (:value shape-input))) (:propagate-at-launch shape-input) (clojure.core/assoc "Tag.PropagateAtLaunch" (ser-propagate-at-launch (:propagate-at-launch shape-input)))))
(clojure.core/defn- ser-metric-scale [shape-input] shape-input)
(clojure.core/defn- ser-block-device-ebs-volume-type [shape-input] shape-input)
(clojure.core/defn- ser-metric-name [shape-input] shape-input)
(clojure.core/defn- ser-metric-dimensions [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-namespace [shape-input] shape-input)
(clojure.core/defn- ser-policy-increment [shape-input] shape-input)
(clojure.core/defn- ser-xml-string-max-len64 [shape-input] shape-input)
(clojure.core/defn- ser-lifecycle-hook-specification [shape-input] (clojure.core/cond-> {} (:lifecycle-hook-name shape-input) (clojure.core/assoc "LifecycleHookSpecification.LifecycleHookName" (ser-ascii-string-max-len255 (:lifecycle-hook-name shape-input))) (:lifecycle-transition shape-input) (clojure.core/assoc "LifecycleHookSpecification.LifecycleTransition" (ser-lifecycle-transition (:lifecycle-transition shape-input))) (:notification-metadata shape-input) (clojure.core/assoc "LifecycleHookSpecification.NotificationMetadata" (ser-xml-string-max-len1023 (:notification-metadata shape-input))) (:heartbeat-timeout shape-input) (clojure.core/assoc "LifecycleHookSpecification.HeartbeatTimeout" (ser-heartbeat-timeout (:heartbeat-timeout shape-input))) (:default-result shape-input) (clojure.core/assoc "LifecycleHookSpecification.DefaultResult" (ser-lifecycle-action-result (:default-result shape-input))) (:notification-targetarn shape-input) (clojure.core/assoc "LifecycleHookSpecification.NotificationTargetARN" (ser-notification-target-resource-name (:notification-targetarn shape-input))) (:rolearn shape-input) (clojure.core/assoc "LifecycleHookSpecification.RoleARN" (ser-resource-name (:rolearn shape-input)))))
(clojure.core/defn- ser-auto-scaling-group-desired-capacity [shape-input] shape-input)
(clojure.core/defn- ser-availability-zones [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-metric-type [shape-input] ({"ASGAverageCPUUtilization" "ASGAverageCPUUtilization", :asgaveragecpuutilization "ASGAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asgaverage-network-in "ASGAverageNetworkIn", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :asgaverage-network-out "ASGAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", :albrequest-count-per-target "ALBRequestCountPerTarget"} shape-input))
(clojure.core/defn- ser-termination-policies [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-process-names [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-auto-scaling-group-min-size [shape-input] shape-input)
(clojure.core/defn- ser-force-delete [shape-input] shape-input)
(clojure.core/defn- ser-lifecycle-action-token [shape-input] shape-input)
(clojure.core/defn- ser-customized-metric-specification [shape-input] (clojure.core/cond-> {} (:metric-name shape-input) (clojure.core/assoc "CustomizedMetricSpecification.MetricName" (ser-metric-name (:metric-name shape-input))) (:namespace shape-input) (clojure.core/assoc "CustomizedMetricSpecification.Namespace" (ser-metric-namespace (:namespace shape-input))) (:dimensions shape-input) (clojure.core/assoc "CustomizedMetricSpecification.Dimensions" (ser-metric-dimensions (:dimensions shape-input))) (:statistic shape-input) (clojure.core/assoc "CustomizedMetricSpecification.Statistic" (ser-metric-statistic (:statistic shape-input))) (:unit shape-input) (clojure.core/assoc "CustomizedMetricSpecification.Unit" (ser-metric-unit (:unit shape-input)))))
(clojure.core/defn- ser-health-check-grace-period [shape-input] shape-input)
(clojure.core/defn- ser-metrics [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-xml-string-max-len32 [shape-input] shape-input)

(clojure.core/defn req<-update-auto-scaling-group-type [action-name37275 input37274] (clojure.core/let [input37276 {:body {"AutoScalingGroupName" (ser-resource-name (input37274 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37275}}] (clojure.core/cond-> input37276 (clojure.core/contains? input37274 :new-instances-protected-from-scale-in) (clojure.core/assoc-in [:body "NewInstancesProtectedFromScaleIn"] (ser-instance-protected (input37274 :new-instances-protected-from-scale-in))) (clojure.core/contains? input37274 :vpczone-identifier) (clojure.core/assoc-in [:body "VPCZoneIdentifier"] (ser-xml-string-max-len2047 (input37274 :vpczone-identifier))) (clojure.core/contains? input37274 :launch-template) (clojure.core/assoc-in [:body "LaunchTemplate"] (ser-launch-template-specification (input37274 :launch-template))) (clojure.core/contains? input37274 :default-cooldown) (clojure.core/assoc-in [:body "DefaultCooldown"] (ser-cooldown (input37274 :default-cooldown))) (clojure.core/contains? input37274 :launch-configuration-name) (clojure.core/assoc-in [:body "LaunchConfigurationName"] (ser-resource-name (input37274 :launch-configuration-name))) (clojure.core/contains? input37274 :health-check-type) (clojure.core/assoc-in [:body "HealthCheckType"] (ser-xml-string-max-len32 (input37274 :health-check-type))) (clojure.core/contains? input37274 :min-size) (clojure.core/assoc-in [:body "MinSize"] (ser-auto-scaling-group-min-size (input37274 :min-size))) (clojure.core/contains? input37274 :availability-zones) (clojure.core/assoc-in [:body "AvailabilityZones"] (ser-availability-zones (input37274 :availability-zones))) (clojure.core/contains? input37274 :termination-policies) (clojure.core/assoc-in [:body "TerminationPolicies"] (ser-termination-policies (input37274 :termination-policies))) (clojure.core/contains? input37274 :max-size) (clojure.core/assoc-in [:body "MaxSize"] (ser-auto-scaling-group-max-size (input37274 :max-size))) (clojure.core/contains? input37274 :placement-group) (clojure.core/assoc-in [:body "PlacementGroup"] (ser-xml-string-max-len255 (input37274 :placement-group))) (clojure.core/contains? input37274 :desired-capacity) (clojure.core/assoc-in [:body "DesiredCapacity"] (ser-auto-scaling-group-desired-capacity (input37274 :desired-capacity))) (clojure.core/contains? input37274 :health-check-grace-period) (clojure.core/assoc-in [:body "HealthCheckGracePeriod"] (ser-health-check-grace-period (input37274 :health-check-grace-period))) (clojure.core/contains? input37274 :service-linked-rolearn) (clojure.core/assoc-in [:body "ServiceLinkedRoleARN"] (ser-resource-name (input37274 :service-linked-rolearn))))))
(clojure.core/defn req<-describe-scaling-activities-type [action-name37278 input37277] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37278}} (clojure.core/contains? input37277 :activity-ids) (clojure.core/assoc-in [:body "ActivityIds"] (ser-activity-ids (input37277 :activity-ids))) (clojure.core/contains? input37277 :auto-scaling-group-name) (clojure.core/assoc-in [:body "AutoScalingGroupName"] (ser-resource-name (input37277 :auto-scaling-group-name))) (clojure.core/contains? input37277 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37277 :max-records))) (clojure.core/contains? input37277 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37277 :next-token)))))
(clojure.core/defn req<-auto-scaling-group-names-type [action-name37280 input37279] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37280}} (clojure.core/contains? input37279 :auto-scaling-group-names) (clojure.core/assoc-in [:body "AutoScalingGroupNames"] (ser-auto-scaling-group-names (input37279 :auto-scaling-group-names))) (clojure.core/contains? input37279 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37279 :next-token))) (clojure.core/contains? input37279 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37279 :max-records)))))
(clojure.core/defn req<-attach-load-balancer-target-groups-type [action-name37282 input37281] {:body {"AutoScalingGroupName" (ser-resource-name (input37281 :auto-scaling-group-name)), "TargetGroupARNs" (ser-target-grouparns (input37281 :target-grouparns)), "Version" "2011-01-01", "Action" action-name37282}})
(clojure.core/defn req<-launch-configuration-names-type [action-name37284 input37283] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37284}} (clojure.core/contains? input37283 :launch-configuration-names) (clojure.core/assoc-in [:body "LaunchConfigurationNames"] (ser-launch-configuration-names (input37283 :launch-configuration-names))) (clojure.core/contains? input37283 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37283 :next-token))) (clojure.core/contains? input37283 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37283 :max-records)))))
(clojure.core/defn req<-describe-policies-type [action-name37286 input37285] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37286}} (clojure.core/contains? input37285 :auto-scaling-group-name) (clojure.core/assoc-in [:body "AutoScalingGroupName"] (ser-resource-name (input37285 :auto-scaling-group-name))) (clojure.core/contains? input37285 :policy-names) (clojure.core/assoc-in [:body "PolicyNames"] (ser-policy-names (input37285 :policy-names))) (clojure.core/contains? input37285 :policy-types) (clojure.core/assoc-in [:body "PolicyTypes"] (ser-policy-types (input37285 :policy-types))) (clojure.core/contains? input37285 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37285 :next-token))) (clojure.core/contains? input37285 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37285 :max-records)))))
(clojure.core/defn req<-set-instance-protection-query [action-name37288 input37287] {:body {"InstanceIds" (ser-instance-ids (input37287 :instance-ids)), "AutoScalingGroupName" (ser-resource-name (input37287 :auto-scaling-group-name)), "ProtectedFromScaleIn" (ser-protected-from-scale-in (input37287 :protected-from-scale-in)), "Version" "2011-01-01", "Action" action-name37288}})
(clojure.core/defn req<-scaling-process-query [action-name37290 input37289] (clojure.core/let [input37291 {:body {"AutoScalingGroupName" (ser-resource-name (input37289 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37290}}] (clojure.core/cond-> input37291 (clojure.core/contains? input37289 :scaling-processes) (clojure.core/assoc-in [:body "ScalingProcesses"] (ser-process-names (input37289 :scaling-processes))))))
(clojure.core/defn req<-detach-instances-query [action-name37293 input37292] (clojure.core/let [input37294 {:body {"AutoScalingGroupName" (ser-resource-name (input37292 :auto-scaling-group-name)), "ShouldDecrementDesiredCapacity" (ser-should-decrement-desired-capacity (input37292 :should-decrement-desired-capacity)), "Version" "2011-01-01", "Action" action-name37293}}] (clojure.core/cond-> input37294 (clojure.core/contains? input37292 :instance-ids) (clojure.core/assoc-in [:body "InstanceIds"] (ser-instance-ids (input37292 :instance-ids))))))
(clojure.core/defn req<-attach-instances-query [action-name37296 input37295] (clojure.core/let [input37297 {:body {"AutoScalingGroupName" (ser-resource-name (input37295 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37296}}] (clojure.core/cond-> input37297 (clojure.core/contains? input37295 :instance-ids) (clojure.core/assoc-in [:body "InstanceIds"] (ser-instance-ids (input37295 :instance-ids))))))
(clojure.core/defn req<-delete-tags-type [action-name37299 input37298] {:body {"Tags" (ser-tags (input37298 :tags)), "Version" "2011-01-01", "Action" action-name37299}})
(clojure.core/defn req<-record-lifecycle-action-heartbeat-type [action-name37301 input37300] (clojure.core/let [input37302 {:body {"LifecycleHookName" (ser-ascii-string-max-len255 (input37300 :lifecycle-hook-name)), "AutoScalingGroupName" (ser-resource-name (input37300 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37301}}] (clojure.core/cond-> input37302 (clojure.core/contains? input37300 :lifecycle-action-token) (clojure.core/assoc-in [:body "LifecycleActionToken"] (ser-lifecycle-action-token (input37300 :lifecycle-action-token))) (clojure.core/contains? input37300 :instance-id) (clojure.core/assoc-in [:body "InstanceId"] (ser-xml-string-max-len19 (input37300 :instance-id))))))
(clojure.core/defn req<-create-auto-scaling-group-type [action-name37304 input37303] (clojure.core/let [input37305 {:body {"AutoScalingGroupName" (ser-xml-string-max-len255 (input37303 :auto-scaling-group-name)), "MinSize" (ser-auto-scaling-group-min-size (input37303 :min-size)), "MaxSize" (ser-auto-scaling-group-max-size (input37303 :max-size)), "Version" "2011-01-01", "Action" action-name37304}}] (clojure.core/cond-> input37305 (clojure.core/contains? input37303 :new-instances-protected-from-scale-in) (clojure.core/assoc-in [:body "NewInstancesProtectedFromScaleIn"] (ser-instance-protected (input37303 :new-instances-protected-from-scale-in))) (clojure.core/contains? input37303 :instance-id) (clojure.core/assoc-in [:body "InstanceId"] (ser-xml-string-max-len19 (input37303 :instance-id))) (clojure.core/contains? input37303 :load-balancer-names) (clojure.core/assoc-in [:body "LoadBalancerNames"] (ser-load-balancer-names (input37303 :load-balancer-names))) (clojure.core/contains? input37303 :vpczone-identifier) (clojure.core/assoc-in [:body "VPCZoneIdentifier"] (ser-xml-string-max-len2047 (input37303 :vpczone-identifier))) (clojure.core/contains? input37303 :launch-template) (clojure.core/assoc-in [:body "LaunchTemplate"] (ser-launch-template-specification (input37303 :launch-template))) (clojure.core/contains? input37303 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tags (input37303 :tags))) (clojure.core/contains? input37303 :lifecycle-hook-specification-list) (clojure.core/assoc-in [:body "LifecycleHookSpecificationList"] (ser-lifecycle-hook-specifications (input37303 :lifecycle-hook-specification-list))) (clojure.core/contains? input37303 :default-cooldown) (clojure.core/assoc-in [:body "DefaultCooldown"] (ser-cooldown (input37303 :default-cooldown))) (clojure.core/contains? input37303 :launch-configuration-name) (clojure.core/assoc-in [:body "LaunchConfigurationName"] (ser-resource-name (input37303 :launch-configuration-name))) (clojure.core/contains? input37303 :target-grouparns) (clojure.core/assoc-in [:body "TargetGroupARNs"] (ser-target-grouparns (input37303 :target-grouparns))) (clojure.core/contains? input37303 :health-check-type) (clojure.core/assoc-in [:body "HealthCheckType"] (ser-xml-string-max-len32 (input37303 :health-check-type))) (clojure.core/contains? input37303 :availability-zones) (clojure.core/assoc-in [:body "AvailabilityZones"] (ser-availability-zones (input37303 :availability-zones))) (clojure.core/contains? input37303 :termination-policies) (clojure.core/assoc-in [:body "TerminationPolicies"] (ser-termination-policies (input37303 :termination-policies))) (clojure.core/contains? input37303 :placement-group) (clojure.core/assoc-in [:body "PlacementGroup"] (ser-xml-string-max-len255 (input37303 :placement-group))) (clojure.core/contains? input37303 :desired-capacity) (clojure.core/assoc-in [:body "DesiredCapacity"] (ser-auto-scaling-group-desired-capacity (input37303 :desired-capacity))) (clojure.core/contains? input37303 :health-check-grace-period) (clojure.core/assoc-in [:body "HealthCheckGracePeriod"] (ser-health-check-grace-period (input37303 :health-check-grace-period))) (clojure.core/contains? input37303 :service-linked-rolearn) (clojure.core/assoc-in [:body "ServiceLinkedRoleARN"] (ser-resource-name (input37303 :service-linked-rolearn))))))
(clojure.core/defn req<-terminate-instance-in-auto-scaling-group-type [action-name37307 input37306] {:body {"InstanceId" (ser-xml-string-max-len19 (input37306 :instance-id)), "ShouldDecrementDesiredCapacity" (ser-should-decrement-desired-capacity (input37306 :should-decrement-desired-capacity)), "Version" "2011-01-01", "Action" action-name37307}})
(clojure.core/defn req<-describe-notification-configurations-type [action-name37309 input37308] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37309}} (clojure.core/contains? input37308 :auto-scaling-group-names) (clojure.core/assoc-in [:body "AutoScalingGroupNames"] (ser-auto-scaling-group-names (input37308 :auto-scaling-group-names))) (clojure.core/contains? input37308 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37308 :next-token))) (clojure.core/contains? input37308 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37308 :max-records)))))
(clojure.core/defn req<-attach-load-balancers-type [action-name37311 input37310] {:body {"AutoScalingGroupName" (ser-resource-name (input37310 :auto-scaling-group-name)), "LoadBalancerNames" (ser-load-balancer-names (input37310 :load-balancer-names)), "Version" "2011-01-01", "Action" action-name37311}})
(clojure.core/defn req<-set-instance-health-query [action-name37313 input37312] (clojure.core/let [input37314 {:body {"InstanceId" (ser-xml-string-max-len19 (input37312 :instance-id)), "HealthStatus" (ser-xml-string-max-len32 (input37312 :health-status)), "Version" "2011-01-01", "Action" action-name37313}}] (clojure.core/cond-> input37314 (clojure.core/contains? input37312 :should-respect-grace-period) (clojure.core/assoc-in [:body "ShouldRespectGracePeriod"] (ser-should-respect-grace-period (input37312 :should-respect-grace-period))))))
(clojure.core/defn req<-create-or-update-tags-type [action-name37316 input37315] {:body {"Tags" (ser-tags (input37315 :tags)), "Version" "2011-01-01", "Action" action-name37316}})
(clojure.core/defn req<-execute-policy-type [action-name37318 input37317] (clojure.core/let [input37319 {:body {"PolicyName" (ser-resource-name (input37317 :policy-name)), "Version" "2011-01-01", "Action" action-name37318}}] (clojure.core/cond-> input37319 (clojure.core/contains? input37317 :auto-scaling-group-name) (clojure.core/assoc-in [:body "AutoScalingGroupName"] (ser-resource-name (input37317 :auto-scaling-group-name))) (clojure.core/contains? input37317 :honor-cooldown) (clojure.core/assoc-in [:body "HonorCooldown"] (ser-honor-cooldown (input37317 :honor-cooldown))) (clojure.core/contains? input37317 :metric-value) (clojure.core/assoc-in [:body "MetricValue"] (ser-metric-scale (input37317 :metric-value))) (clojure.core/contains? input37317 :breach-threshold) (clojure.core/assoc-in [:body "BreachThreshold"] (ser-metric-scale (input37317 :breach-threshold))))))
(clojure.core/defn req<-disable-metrics-collection-query [action-name37321 input37320] (clojure.core/let [input37322 {:body {"AutoScalingGroupName" (ser-resource-name (input37320 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37321}}] (clojure.core/cond-> input37322 (clojure.core/contains? input37320 :metrics) (clojure.core/assoc-in [:body "Metrics"] (ser-metrics (input37320 :metrics))))))
(clojure.core/defn req<-delete-lifecycle-hook-type [action-name37324 input37323] {:body {"LifecycleHookName" (ser-ascii-string-max-len255 (input37323 :lifecycle-hook-name)), "AutoScalingGroupName" (ser-resource-name (input37323 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37324}})
(clojure.core/defn req<-describe-tags-type [action-name37326 input37325] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37326}} (clojure.core/contains? input37325 :filters) (clojure.core/assoc-in [:body "Filters"] (ser-filters (input37325 :filters))) (clojure.core/contains? input37325 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37325 :next-token))) (clojure.core/contains? input37325 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37325 :max-records)))))
(clojure.core/defn req<-describe-scheduled-actions-type [action-name37328 input37327] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37328}} (clojure.core/contains? input37327 :auto-scaling-group-name) (clojure.core/assoc-in [:body "AutoScalingGroupName"] (ser-resource-name (input37327 :auto-scaling-group-name))) (clojure.core/contains? input37327 :scheduled-action-names) (clojure.core/assoc-in [:body "ScheduledActionNames"] (ser-scheduled-action-names (input37327 :scheduled-action-names))) (clojure.core/contains? input37327 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-timestamp-type (input37327 :start-time))) (clojure.core/contains? input37327 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-timestamp-type (input37327 :end-time))) (clojure.core/contains? input37327 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37327 :next-token))) (clojure.core/contains? input37327 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37327 :max-records)))))
(clojure.core/defn req<-set-desired-capacity-type [action-name37330 input37329] (clojure.core/let [input37331 {:body {"AutoScalingGroupName" (ser-resource-name (input37329 :auto-scaling-group-name)), "DesiredCapacity" (ser-auto-scaling-group-desired-capacity (input37329 :desired-capacity)), "Version" "2011-01-01", "Action" action-name37330}}] (clojure.core/cond-> input37331 (clojure.core/contains? input37329 :honor-cooldown) (clojure.core/assoc-in [:body "HonorCooldown"] (ser-honor-cooldown (input37329 :honor-cooldown))))))
(clojure.core/defn req<-enable-metrics-collection-query [action-name37333 input37332] (clojure.core/let [input37334 {:body {"AutoScalingGroupName" (ser-resource-name (input37332 :auto-scaling-group-name)), "Granularity" (ser-xml-string-max-len255 (input37332 :granularity)), "Version" "2011-01-01", "Action" action-name37333}}] (clojure.core/cond-> input37334 (clojure.core/contains? input37332 :metrics) (clojure.core/assoc-in [:body "Metrics"] (ser-metrics (input37332 :metrics))))))
(clojure.core/defn req<-scaling-process-query [action-name37336 input37335] (clojure.core/let [input37337 {:body {"AutoScalingGroupName" (ser-resource-name (input37335 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37336}}] (clojure.core/cond-> input37337 (clojure.core/contains? input37335 :scaling-processes) (clojure.core/assoc-in [:body "ScalingProcesses"] (ser-process-names (input37335 :scaling-processes))))))
(clojure.core/defn req<-detach-load-balancer-target-groups-type [action-name37339 input37338] {:body {"AutoScalingGroupName" (ser-resource-name (input37338 :auto-scaling-group-name)), "TargetGroupARNs" (ser-target-grouparns (input37338 :target-grouparns)), "Version" "2011-01-01", "Action" action-name37339}})
(clojure.core/defn req<-detach-load-balancers-type [action-name37341 input37340] {:body {"AutoScalingGroupName" (ser-resource-name (input37340 :auto-scaling-group-name)), "LoadBalancerNames" (ser-load-balancer-names (input37340 :load-balancer-names)), "Version" "2011-01-01", "Action" action-name37341}})
(clojure.core/defn req<-describe-lifecycle-hooks-type [action-name37343 input37342] (clojure.core/let [input37344 {:body {"AutoScalingGroupName" (ser-resource-name (input37342 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37343}}] (clojure.core/cond-> input37344 (clojure.core/contains? input37342 :lifecycle-hook-names) (clojure.core/assoc-in [:body "LifecycleHookNames"] (ser-lifecycle-hook-names (input37342 :lifecycle-hook-names))))))
(clojure.core/defn req<-enter-standby-query [action-name37346 input37345] (clojure.core/let [input37347 {:body {"AutoScalingGroupName" (ser-resource-name (input37345 :auto-scaling-group-name)), "ShouldDecrementDesiredCapacity" (ser-should-decrement-desired-capacity (input37345 :should-decrement-desired-capacity)), "Version" "2011-01-01", "Action" action-name37346}}] (clojure.core/cond-> input37347 (clojure.core/contains? input37345 :instance-ids) (clojure.core/assoc-in [:body "InstanceIds"] (ser-instance-ids (input37345 :instance-ids))))))
(clojure.core/defn req<-describe-load-balancer-target-groups-request [action-name37349 input37348] (clojure.core/let [input37350 {:body {"AutoScalingGroupName" (ser-resource-name (input37348 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37349}}] (clojure.core/cond-> input37350 (clojure.core/contains? input37348 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37348 :next-token))) (clojure.core/contains? input37348 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37348 :max-records))))))
(clojure.core/defn req<-delete-notification-configuration-type [action-name37352 input37351] {:body {"AutoScalingGroupName" (ser-resource-name (input37351 :auto-scaling-group-name)), "TopicARN" (ser-resource-name (input37351 :topicarn)), "Version" "2011-01-01", "Action" action-name37352}})
(clojure.core/defn req<-exit-standby-query [action-name37354 input37353] (clojure.core/let [input37355 {:body {"AutoScalingGroupName" (ser-resource-name (input37353 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37354}}] (clojure.core/cond-> input37355 (clojure.core/contains? input37353 :instance-ids) (clojure.core/assoc-in [:body "InstanceIds"] (ser-instance-ids (input37353 :instance-ids))))))
(clojure.core/defn req<-launch-configuration-name-type [action-name37357 input37356] {:body {"LaunchConfigurationName" (ser-resource-name (input37356 :launch-configuration-name)), "Version" "2011-01-01", "Action" action-name37357}})
(clojure.core/defn req<-create-launch-configuration-type [action-name37359 input37358] (clojure.core/let [input37360 {:body {"LaunchConfigurationName" (ser-xml-string-max-len255 (input37358 :launch-configuration-name)), "Version" "2011-01-01", "Action" action-name37359}}] (clojure.core/cond-> input37360 (clojure.core/contains? input37358 :placement-tenancy) (clojure.core/assoc-in [:body "PlacementTenancy"] (ser-xml-string-max-len64 (input37358 :placement-tenancy))) (clojure.core/contains? input37358 :kernel-id) (clojure.core/assoc-in [:body "KernelId"] (ser-xml-string-max-len255 (input37358 :kernel-id))) (clojure.core/contains? input37358 :instance-id) (clojure.core/assoc-in [:body "InstanceId"] (ser-xml-string-max-len19 (input37358 :instance-id))) (clojure.core/contains? input37358 :associate-public-ip-address) (clojure.core/assoc-in [:body "AssociatePublicIpAddress"] (ser-associate-public-ip-address (input37358 :associate-public-ip-address))) (clojure.core/contains? input37358 :instance-monitoring) (clojure.core/assoc-in [:body "InstanceMonitoring"] (ser-instance-monitoring (input37358 :instance-monitoring))) (clojure.core/contains? input37358 :image-id) (clojure.core/assoc-in [:body "ImageId"] (ser-xml-string-max-len255 (input37358 :image-id))) (clojure.core/contains? input37358 :security-groups) (clojure.core/assoc-in [:body "SecurityGroups"] (ser-security-groups (input37358 :security-groups))) (clojure.core/contains? input37358 :ebs-optimized) (clojure.core/assoc-in [:body "EbsOptimized"] (ser-ebs-optimized (input37358 :ebs-optimized))) (clojure.core/contains? input37358 :instance-type) (clojure.core/assoc-in [:body "InstanceType"] (ser-xml-string-max-len255 (input37358 :instance-type))) (clojure.core/contains? input37358 :classic-linkvpcid) (clojure.core/assoc-in [:body "ClassicLinkVPCId"] (ser-xml-string-max-len255 (input37358 :classic-linkvpcid))) (clojure.core/contains? input37358 :key-name) (clojure.core/assoc-in [:body "KeyName"] (ser-xml-string-max-len255 (input37358 :key-name))) (clojure.core/contains? input37358 :spot-price) (clojure.core/assoc-in [:body "SpotPrice"] (ser-spot-price (input37358 :spot-price))) (clojure.core/contains? input37358 :classic-linkvpcsecurity-groups) (clojure.core/assoc-in [:body "ClassicLinkVPCSecurityGroups"] (ser-classic-linkvpcsecurity-groups (input37358 :classic-linkvpcsecurity-groups))) (clojure.core/contains? input37358 :block-device-mappings) (clojure.core/assoc-in [:body "BlockDeviceMappings"] (ser-block-device-mappings (input37358 :block-device-mappings))) (clojure.core/contains? input37358 :ramdisk-id) (clojure.core/assoc-in [:body "RamdiskId"] (ser-xml-string-max-len255 (input37358 :ramdisk-id))) (clojure.core/contains? input37358 :user-data) (clojure.core/assoc-in [:body "UserData"] (ser-xml-string-user-data (input37358 :user-data))) (clojure.core/contains? input37358 :iam-instance-profile) (clojure.core/assoc-in [:body "IamInstanceProfile"] (ser-xml-string-max-len1600 (input37358 :iam-instance-profile))))))
(clojure.core/defn req<-delete-auto-scaling-group-type [action-name37362 input37361] (clojure.core/let [input37363 {:body {"AutoScalingGroupName" (ser-resource-name (input37361 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37362}}] (clojure.core/cond-> input37363 (clojure.core/contains? input37361 :force-delete) (clojure.core/assoc-in [:body "ForceDelete"] (ser-force-delete (input37361 :force-delete))))))
(clojure.core/defn req<-describe-auto-scaling-instances-type [action-name37365 input37364] (clojure.core/cond-> {:body {"Version" "2011-01-01", "Action" action-name37365}} (clojure.core/contains? input37364 :instance-ids) (clojure.core/assoc-in [:body "InstanceIds"] (ser-instance-ids (input37364 :instance-ids))) (clojure.core/contains? input37364 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37364 :max-records))) (clojure.core/contains? input37364 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37364 :next-token)))))
(clojure.core/defn req<-put-notification-configuration-type [action-name37367 input37366] {:body {"AutoScalingGroupName" (ser-resource-name (input37366 :auto-scaling-group-name)), "TopicARN" (ser-resource-name (input37366 :topicarn)), "NotificationTypes" (ser-auto-scaling-notification-types (input37366 :notification-types)), "Version" "2011-01-01", "Action" action-name37367}})
(clojure.core/defn req<-delete-scheduled-action-type [action-name37369 input37368] {:body {"AutoScalingGroupName" (ser-resource-name (input37368 :auto-scaling-group-name)), "ScheduledActionName" (ser-resource-name (input37368 :scheduled-action-name)), "Version" "2011-01-01", "Action" action-name37369}})
(clojure.core/defn req<-complete-lifecycle-action-type [action-name37371 input37370] (clojure.core/let [input37372 {:body {"LifecycleHookName" (ser-ascii-string-max-len255 (input37370 :lifecycle-hook-name)), "AutoScalingGroupName" (ser-resource-name (input37370 :auto-scaling-group-name)), "LifecycleActionResult" (ser-lifecycle-action-result (input37370 :lifecycle-action-result)), "Version" "2011-01-01", "Action" action-name37371}}] (clojure.core/cond-> input37372 (clojure.core/contains? input37370 :lifecycle-action-token) (clojure.core/assoc-in [:body "LifecycleActionToken"] (ser-lifecycle-action-token (input37370 :lifecycle-action-token))) (clojure.core/contains? input37370 :instance-id) (clojure.core/assoc-in [:body "InstanceId"] (ser-xml-string-max-len19 (input37370 :instance-id))))))
(clojure.core/defn req<-put-scaling-policy-type [action-name37374 input37373] (clojure.core/let [input37375 {:body {"AutoScalingGroupName" (ser-resource-name (input37373 :auto-scaling-group-name)), "PolicyName" (ser-xml-string-max-len255 (input37373 :policy-name)), "Version" "2011-01-01", "Action" action-name37374}}] (clojure.core/cond-> input37375 (clojure.core/contains? input37373 :min-adjustment-magnitude) (clojure.core/assoc-in [:body "MinAdjustmentMagnitude"] (ser-min-adjustment-magnitude (input37373 :min-adjustment-magnitude))) (clojure.core/contains? input37373 :scaling-adjustment) (clojure.core/assoc-in [:body "ScalingAdjustment"] (ser-policy-increment (input37373 :scaling-adjustment))) (clojure.core/contains? input37373 :cooldown) (clojure.core/assoc-in [:body "Cooldown"] (ser-cooldown (input37373 :cooldown))) (clojure.core/contains? input37373 :estimated-instance-warmup) (clojure.core/assoc-in [:body "EstimatedInstanceWarmup"] (ser-estimated-instance-warmup (input37373 :estimated-instance-warmup))) (clojure.core/contains? input37373 :step-adjustments) (clojure.core/assoc-in [:body "StepAdjustments"] (ser-step-adjustments (input37373 :step-adjustments))) (clojure.core/contains? input37373 :adjustment-type) (clojure.core/assoc-in [:body "AdjustmentType"] (ser-xml-string-max-len255 (input37373 :adjustment-type))) (clojure.core/contains? input37373 :metric-aggregation-type) (clojure.core/assoc-in [:body "MetricAggregationType"] (ser-xml-string-max-len32 (input37373 :metric-aggregation-type))) (clojure.core/contains? input37373 :target-tracking-configuration) (clojure.core/assoc-in [:body "TargetTrackingConfiguration"] (ser-target-tracking-configuration (input37373 :target-tracking-configuration))) (clojure.core/contains? input37373 :min-adjustment-step) (clojure.core/assoc-in [:body "MinAdjustmentStep"] (ser-min-adjustment-step (input37373 :min-adjustment-step))) (clojure.core/contains? input37373 :policy-type) (clojure.core/assoc-in [:body "PolicyType"] (ser-xml-string-max-len64 (input37373 :policy-type))))))
(clojure.core/defn req<-delete-policy-type [action-name37377 input37376] (clojure.core/let [input37378 {:body {"PolicyName" (ser-resource-name (input37376 :policy-name)), "Version" "2011-01-01", "Action" action-name37377}}] (clojure.core/cond-> input37378 (clojure.core/contains? input37376 :auto-scaling-group-name) (clojure.core/assoc-in [:body "AutoScalingGroupName"] (ser-resource-name (input37376 :auto-scaling-group-name))))))
(clojure.core/defn req<-describe-load-balancers-request [action-name37380 input37379] (clojure.core/let [input37381 {:body {"AutoScalingGroupName" (ser-resource-name (input37379 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37380}}] (clojure.core/cond-> input37381 (clojure.core/contains? input37379 :next-token) (clojure.core/assoc-in [:body "NextToken"] (ser-xml-string (input37379 :next-token))) (clojure.core/contains? input37379 :max-records) (clojure.core/assoc-in [:body "MaxRecords"] (ser-max-records (input37379 :max-records))))))
(clojure.core/defn req<-put-scheduled-update-group-action-type [action-name37383 input37382] (clojure.core/let [input37384 {:body {"AutoScalingGroupName" (ser-resource-name (input37382 :auto-scaling-group-name)), "ScheduledActionName" (ser-xml-string-max-len255 (input37382 :scheduled-action-name)), "Version" "2011-01-01", "Action" action-name37383}}] (clojure.core/cond-> input37384 (clojure.core/contains? input37382 :end-time) (clojure.core/assoc-in [:body "EndTime"] (ser-timestamp-type (input37382 :end-time))) (clojure.core/contains? input37382 :start-time) (clojure.core/assoc-in [:body "StartTime"] (ser-timestamp-type (input37382 :start-time))) (clojure.core/contains? input37382 :recurrence) (clojure.core/assoc-in [:body "Recurrence"] (ser-xml-string-max-len255 (input37382 :recurrence))) (clojure.core/contains? input37382 :min-size) (clojure.core/assoc-in [:body "MinSize"] (ser-auto-scaling-group-min-size (input37382 :min-size))) (clojure.core/contains? input37382 :max-size) (clojure.core/assoc-in [:body "MaxSize"] (ser-auto-scaling-group-max-size (input37382 :max-size))) (clojure.core/contains? input37382 :time) (clojure.core/assoc-in [:body "Time"] (ser-timestamp-type (input37382 :time))) (clojure.core/contains? input37382 :desired-capacity) (clojure.core/assoc-in [:body "DesiredCapacity"] (ser-auto-scaling-group-desired-capacity (input37382 :desired-capacity))))))
(clojure.core/defn req<-put-lifecycle-hook-type [action-name37386 input37385] (clojure.core/let [input37387 {:body {"LifecycleHookName" (ser-ascii-string-max-len255 (input37385 :lifecycle-hook-name)), "AutoScalingGroupName" (ser-resource-name (input37385 :auto-scaling-group-name)), "Version" "2011-01-01", "Action" action-name37386}}] (clojure.core/cond-> input37387 (clojure.core/contains? input37385 :lifecycle-transition) (clojure.core/assoc-in [:body "LifecycleTransition"] (ser-lifecycle-transition (input37385 :lifecycle-transition))) (clojure.core/contains? input37385 :rolearn) (clojure.core/assoc-in [:body "RoleARN"] (ser-resource-name (input37385 :rolearn))) (clojure.core/contains? input37385 :notification-targetarn) (clojure.core/assoc-in [:body "NotificationTargetARN"] (ser-notification-target-resource-name (input37385 :notification-targetarn))) (clojure.core/contains? input37385 :notification-metadata) (clojure.core/assoc-in [:body "NotificationMetadata"] (ser-xml-string-max-len1023 (input37385 :notification-metadata))) (clojure.core/contains? input37385 :heartbeat-timeout) (clojure.core/assoc-in [:body "HeartbeatTimeout"] (ser-heartbeat-timeout (input37385 :heartbeat-timeout))) (clojure.core/contains? input37385 :default-result) (clojure.core/assoc-in [:body "DefaultResult"] (ser-lifecycle-action-result (input37385 :default-result))))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-result (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-adjustment-types-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/AdjustmentTypes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ascii-string-max-len255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[A-Za-z0-9\-_\/]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/ascii-string-max-len255 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/predefined-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.predefined-metric-specification/resource-label (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling/predefined-metric-specification (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.predefined-metric-specification/PredefinedMetricType] :opt-un [:portkey.aws.autoscaling.predefined-metric-specification/ResourceLabel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-respect-grace-period clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-contention-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-contention-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-contention-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-answer (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.filter/name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/filter (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.filter/Name :portkey.aws.autoscaling/Values] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enter-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.enter-standby-query/AutoScalingGroupName :portkey.aws.autoscaling/ShouldDecrementDesiredCapacity] :opt-un [:portkey.aws.autoscaling/InstanceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-request (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-request/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/load-balancer-target-grouparn (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len511))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-target-group-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-target-group-state/LoadBalancerTargetGroupARN :portkey.aws.autoscaling.load-balancer-target-group-state/State] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activities (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/activity))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-update-group-action/scheduled-actionarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.scheduled-update-group-action/AutoScalingGroupName :portkey.aws.autoscaling.scheduled-update-group-action/EndTime :portkey.aws.autoscaling.scheduled-update-group-action/StartTime :portkey.aws.autoscaling.scheduled-update-group-action/Recurrence :portkey.aws.autoscaling.scheduled-update-group-action/ScheduledActionName :portkey.aws.autoscaling.scheduled-update-group-action/MinSize :portkey.aws.autoscaling.scheduled-update-group-action/MaxSize :portkey.aws.autoscaling.scheduled-update-group-action/Time :portkey.aws.autoscaling.scheduled-update-group-action/DesiredCapacity :portkey.aws.autoscaling.scheduled-update-group-action/ScheduledActionARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/associate-public-ip-address clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-auto-scaling-group-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.delete-auto-scaling-group-type/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/ForceDelete] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/global-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/enabled-metric))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Activities] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tags-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.tags-type/Tags :portkey.aws.autoscaling.tags-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len19))

(clojure.spec.alpha/def :portkey.aws.autoscaling/create-or-update-tags-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Processes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-tags-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-tags-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Filters :portkey.aws.autoscaling.describe-tags-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.already-exists-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/already-exists-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.already-exists-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-target-resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1600)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance-monitoring/enabled (clojure.spec.alpha/and :portkey.aws.autoscaling/monitoring-enabled))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-monitoring (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.instance-monitoring/Enabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/notification-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-state {"Detaching" "Detaching", "Terminating:Wait" "Terminating:Wait", :standby "Standby", :pending:wait "Pending:Wait", :terminating:proceed "Terminating:Proceed", :pending "Pending", "InService" "InService", "Quarantined" "Quarantined", :detached "Detached", :quarantined "Quarantined", :terminating "Terminating", :terminating:wait "Terminating:Wait", :pending:proceed "Pending:Proceed", "Pending:Proceed" "Pending:Proceed", "Terminating" "Terminating", :terminated "Terminated", :in-service "InService", "EnteringStandby" "EnteringStandby", "Pending:Wait" "Pending:Wait", "Terminated" "Terminated", "Standby" "Standby", "Pending" "Pending", "Terminating:Proceed" "Terminating:Proceed", :detaching "Detaching", :entering-standby "EnteringStandby", "Detached" "Detached"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/vpczone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/lifecycle-hook-specification-list (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-hook-specifications))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-auto-scaling-group-type/service-linked-rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-auto-scaling-group-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/AutoScalingGroupName :portkey.aws.autoscaling.create-auto-scaling-group-type/MinSize :portkey.aws.autoscaling.create-auto-scaling-group-type/MaxSize] :opt-un [:portkey.aws.autoscaling.create-auto-scaling-group-type/NewInstancesProtectedFromScaleIn :portkey.aws.autoscaling.create-auto-scaling-group-type/InstanceId :portkey.aws.autoscaling/LoadBalancerNames :portkey.aws.autoscaling.create-auto-scaling-group-type/VPCZoneIdentifier :portkey.aws.autoscaling.create-auto-scaling-group-type/LaunchTemplate :portkey.aws.autoscaling/Tags :portkey.aws.autoscaling.create-auto-scaling-group-type/LifecycleHookSpecificationList :portkey.aws.autoscaling.create-auto-scaling-group-type/DefaultCooldown :portkey.aws.autoscaling.create-auto-scaling-group-type/LaunchConfigurationName :portkey.aws.autoscaling/TargetGroupARNs :portkey.aws.autoscaling.create-auto-scaling-group-type/HealthCheckType :portkey.aws.autoscaling/AvailabilityZones :portkey.aws.autoscaling/TerminationPolicies :portkey.aws.autoscaling.create-auto-scaling-group-type/PlacementGroup :portkey.aws.autoscaling.create-auto-scaling-group-type/DesiredCapacity :portkey.aws.autoscaling/HealthCheckGracePeriod :portkey.aws.autoscaling.create-auto-scaling-group-type/ServiceLinkedRoleARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/launch-template-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-template-specification/version (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-specification (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.launch-template-specification/LaunchTemplateId :portkey.aws.autoscaling/LaunchTemplateName :portkey.aws.autoscaling.launch-template-specification/Version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-magnitude clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-collection-type/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-collection-type/Metric] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-notification-configuration-type/topicarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-notification-configuration-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.delete-notification-configuration-type/AutoScalingGroupName :portkey.aws.autoscaling.delete-notification-configuration-type/TopicARN] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hooks-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.describe-lifecycle-hooks-type/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/LifecycleHookNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/security-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/LifecycleHookName :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/LifecycleActionToken :portkey.aws.autoscaling.record-lifecycle-action-heartbeat-type/InstanceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs-optimized clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancer-target-groups-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.detach-load-balancer-target-groups-type/AutoScalingGroupName :portkey.aws.autoscaling/TargetGroupARNs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/LaunchConfigurationNames :portkey.aws.autoscaling.launch-configuration-names-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/monitoring-enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-protection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/InstanceIds :portkey.aws.autoscaling.set-instance-protection-query/AutoScalingGroupName :portkey.aws.autoscaling/ProtectedFromScaleIn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/should-decrement-desired-capacity clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-desired-capacity-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-desired-capacity-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.set-desired-capacity-type/AutoScalingGroupName :portkey.aws.autoscaling.set-desired-capacity-type/DesiredCapacity] :opt-un [:portkey.aws.autoscaling/HonorCooldown] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.process-type/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/process-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.process-type/ProcessName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/propagate-at-launch clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/vpczone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.update-auto-scaling-group-type/service-linked-rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/update-auto-scaling-group-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling.update-auto-scaling-group-type/NewInstancesProtectedFromScaleIn :portkey.aws.autoscaling.update-auto-scaling-group-type/VPCZoneIdentifier :portkey.aws.autoscaling.update-auto-scaling-group-type/LaunchTemplate :portkey.aws.autoscaling.update-auto-scaling-group-type/DefaultCooldown :portkey.aws.autoscaling.update-auto-scaling-group-type/LaunchConfigurationName :portkey.aws.autoscaling.update-auto-scaling-group-type/HealthCheckType :portkey.aws.autoscaling.update-auto-scaling-group-type/MinSize :portkey.aws.autoscaling/AvailabilityZones :portkey.aws.autoscaling/TerminationPolicies :portkey.aws.autoscaling.update-auto-scaling-group-type/MaxSize :portkey.aws.autoscaling.update-auto-scaling-group-type/PlacementGroup :portkey.aws.autoscaling.update-auto-scaling-group-type/DesiredCapacity :portkey.aws.autoscaling/HealthCheckGracePeriod :portkey.aws.autoscaling.update-auto-scaling-group-type/ServiceLinkedRoleARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-records clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enable-metrics-collection-query/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enable-metrics-collection-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.enable-metrics-collection-query/AutoScalingGroupName :portkey.aws.autoscaling.enable-metrics-collection-query/Granularity] :opt-un [:portkey.aws.autoscaling/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-termination-policy-types-answer/termination-policy-types (clojure.spec.alpha/and :portkey.aws.autoscaling/termination-policies))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-termination-policy-types-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-termination-policy-types-answer/TerminationPolicyTypes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hooks-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/LifecycleHooks] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-tags-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tags (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specifications (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook-specification))

(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/metric (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.enabled-metric/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/enabled-metric (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.enabled-metric/Metric :portkey.aws.autoscaling.enabled-metric/Granularity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-groups-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/AutoScalingGroups] :opt-un [:portkey.aws.autoscaling.auto-scaling-groups-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/no-device clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-instances-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.attach-instances-query/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/InstanceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/snapshot-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-size (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/volume-type (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-volume-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/delete-on-termination (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-delete-on-termination))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/iops (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-iops))
(clojure.spec.alpha/def :portkey.aws.autoscaling.ebs/encrypted (clojure.spec.alpha/and :portkey.aws.autoscaling/block-device-ebs-encrypted))
(clojure.spec.alpha/def :portkey.aws.autoscaling/ebs (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.ebs/SnapshotId :portkey.aws.autoscaling.ebs/VolumeSize :portkey.aws.autoscaling.ebs/VolumeType :portkey.aws.autoscaling.ebs/DeleteOnTermination :portkey.aws.autoscaling.ebs/Iops :portkey.aws.autoscaling.ebs/Encrypted] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.set-instance-health-query/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-health-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.set-instance-health-query/InstanceId :portkey.aws.autoscaling.set-instance-health-query/HealthStatus] :opt-un [:portkey.aws.autoscaling/ShouldRespectGracePeriod] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policies-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/ScalingPolicies :portkey.aws.autoscaling.policies-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/process-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.suspended-process/suspension-reason (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-process (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.suspended-process/ProcessName :portkey.aws.autoscaling.suspended-process/SuspensionReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/cause (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-code (clojure.spec.alpha/and :portkey.aws.autoscaling/scaling-activity-status-code))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/details (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/status-message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/activity-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.activity/description (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activity (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.activity/ActivityId :portkey.aws.autoscaling.activity/AutoScalingGroupName :portkey.aws.autoscaling.activity/Cause :portkey.aws.autoscaling.activity/StartTime :portkey.aws.autoscaling.activity/StatusCode] :opt-un [:portkey.aws.autoscaling.activity/EndTime :portkey.aws.autoscaling.activity/Details :portkey.aws.autoscaling.activity/StatusMessage :portkey.aws.autoscaling/Progress :portkey.aws.autoscaling.activity/Description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Activities] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-iops (clojure.spec.alpha/int-in 100 20000))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-encrypted clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/max-number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-answer (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-max-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/launch-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configurations-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/LaunchConfigurations] :opt-un [:portkey.aws.autoscaling.launch-configurations-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-target-group-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-target-group-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len64))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/load-balancer-target-groups (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-target-group-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancer-target-groups-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancer-target-groups-response/LoadBalancerTargetGroups :portkey.aws.autoscaling.describe-load-balancer-target-groups-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/progress clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-launch-configurations clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.terminate-instance-in-auto-scaling-group-type/InstanceId :portkey.aws.autoscaling/ShouldDecrementDesiredCapacity] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/estimated-instance-warmup clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/enter-standby-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Activities] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/activities-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/Activities] :opt-un [:portkey.aws.autoscaling.activities-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-size (clojure.spec.alpha/int-in 1 16384))

(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustments (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/step-adjustment))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/load-balancers (clojure.spec.alpha/and :portkey.aws.autoscaling/load-balancer-states))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-response/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-response/LoadBalancers :portkey.aws.autoscaling.describe-load-balancers-response/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-ids (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling/spot-price (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/lifecycle-hook-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-lifecycle-hook-types-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-lifecycle-hook-types-answer/LifecycleHookTypes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag-description/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.tag-description/ResourceId :portkey.aws.autoscaling.tag-description/ResourceType :portkey.aws.autoscaling.tag-description/Key :portkey.aws.autoscaling.tag-description/Value :portkey.aws.autoscaling/PropagateAtLaunch] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-scheduled-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-scheduled-action-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.delete-scheduled-action-type/AutoScalingGroupName :portkey.aws.autoscaling.delete-scheduled-action-type/ScheduledActionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/instance-protected clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len19 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 19)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.attach-load-balancers-type/AutoScalingGroupName :portkey.aws.autoscaling/LoadBalancerNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-policy-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.delete-policy-type/PolicyName] :opt-un [:portkey.aws.autoscaling.delete-policy-type/AutoScalingGroupName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/number-of-auto-scaling-groups clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/load-balancer-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.load-balancer-state/state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-state (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.load-balancer-state/LoadBalancerName :portkey.aws.autoscaling.load-balancer-state/State] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-policies-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-policies-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-policies-type/AutoScalingGroupName :portkey.aws.autoscaling/PolicyNames :portkey.aws.autoscaling/PolicyTypes :portkey.aws.autoscaling.describe-policies-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.resource-in-use-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-in-use-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.resource-in-use-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.exit-standby-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/exit-standby-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.exit-standby-query/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/InstanceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-status-code {:waiting-for-spot-instance-id "WaitingForSpotInstanceId", "Failed" "Failed", "Cancelled" "Cancelled", :in-progress "InProgress", "PendingSpotBidPlacement" "PendingSpotBidPlacement", "WaitingForSpotInstanceRequestId" "WaitingForSpotInstanceRequestId", "WaitingForELBConnectionDraining" "WaitingForELBConnectionDraining", :successful "Successful", :pre-in-service "PreInService", "WaitingForInstanceWarmup" "WaitingForInstanceWarmup", :waiting-forelbconnection-draining "WaitingForELBConnectionDraining", :cancelled "Cancelled", "PreInService" "PreInService", "InProgress" "InProgress", :pending-spot-bid-placement "PendingSpotBidPlacement", "Successful" "Successful", "WaitingForInstanceId" "WaitingForInstanceId", :mid-lifecycle-action "MidLifecycleAction", "WaitingForSpotInstanceId" "WaitingForSpotInstanceId", "MidLifecycleAction" "MidLifecycleAction", :waiting-for-instance-id "WaitingForInstanceId", :failed "Failed", :waiting-for-instance-warmup "WaitingForInstanceWarmup", :waiting-for-spot-instance-request-id "WaitingForSpotInstanceRequestId"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group-names-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-names-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/AutoScalingGroupNames :portkey.aws.autoscaling.auto-scaling-group-names-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-update-group-actions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scheduled-update-group-action))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-instance-details))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/activity-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/Activity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-description-list (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/tag-description))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration-name-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration-name-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.launch-configuration-name-type/LaunchConfigurationName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.limit-exceeded-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/limit-exceeded-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.limit-exceeded-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-account-limits-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/MaxNumberOfAutoScalingGroups :portkey.aws.autoscaling/MaxNumberOfLaunchConfigurations :portkey.aws.autoscaling/NumberOfAutoScalingGroups :portkey.aws.autoscaling/NumberOfLaunchConfigurations] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 256)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.service-linked-role-failure/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/service-linked-role-failure (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.service-linked-role-failure/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.adjustment-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.adjustment-type/AdjustmentType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/recurrence (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scheduled-update-group-action-type/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scheduled-update-group-action-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/AutoScalingGroupName :portkey.aws.autoscaling.put-scheduled-update-group-action-type/ScheduledActionName] :opt-un [:portkey.aws.autoscaling.put-scheduled-update-group-action-type/EndTime :portkey.aws.autoscaling.put-scheduled-update-group-action-type/StartTime :portkey.aws.autoscaling.put-scheduled-update-group-action-type/Recurrence :portkey.aws.autoscaling.put-scheduled-update-group-action-type/MinSize :portkey.aws.autoscaling.put-scheduled-update-group-action-type/MaxSize :portkey.aws.autoscaling.put-scheduled-update-group-action-type/Time :portkey.aws.autoscaling.put-scheduled-update-group-action-type/DesiredCapacity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.disable-metrics-collection-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-metrics-collection-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.disable-metrics-collection-query/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/Metrics] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len255 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/set-instance-protection-answer (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len1023 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1023)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-action-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/resource-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-scaling-policy-type/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-scaling-policy-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.put-scaling-policy-type/AutoScalingGroupName :portkey.aws.autoscaling.put-scaling-policy-type/PolicyName] :opt-un [:portkey.aws.autoscaling/MinAdjustmentMagnitude :portkey.aws.autoscaling.put-scaling-policy-type/ScalingAdjustment :portkey.aws.autoscaling/Cooldown :portkey.aws.autoscaling/EstimatedInstanceWarmup :portkey.aws.autoscaling/StepAdjustments :portkey.aws.autoscaling.put-scaling-policy-type/AdjustmentType :portkey.aws.autoscaling.put-scaling-policy-type/MetricAggregationType :portkey.aws.autoscaling/TargetTrackingConfiguration :portkey.aws.autoscaling/MinAdjustmentStep :portkey.aws.autoscaling.put-scaling-policy-type/PolicyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/new-instances-protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/vpczone-identifier (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len2047))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/tags (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-description-list))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/auto-scaling-grouparn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/default-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/health-check-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/min-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-min-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/max-size (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-max-size))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/placement-group (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/desired-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-group-desired-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-group/service-linked-rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.auto-scaling-group/AutoScalingGroupName :portkey.aws.autoscaling.auto-scaling-group/MinSize :portkey.aws.autoscaling.auto-scaling-group/MaxSize :portkey.aws.autoscaling.auto-scaling-group/DesiredCapacity :portkey.aws.autoscaling.auto-scaling-group/DefaultCooldown :portkey.aws.autoscaling/AvailabilityZones :portkey.aws.autoscaling.auto-scaling-group/HealthCheckType :portkey.aws.autoscaling.auto-scaling-group/CreatedTime] :opt-un [:portkey.aws.autoscaling.auto-scaling-group/NewInstancesProtectedFromScaleIn :portkey.aws.autoscaling/LoadBalancerNames :portkey.aws.autoscaling/EnabledMetrics :portkey.aws.autoscaling.auto-scaling-group/VPCZoneIdentifier :portkey.aws.autoscaling.auto-scaling-group/LaunchTemplate :portkey.aws.autoscaling.auto-scaling-group/Tags :portkey.aws.autoscaling.auto-scaling-group/AutoScalingGroupARN :portkey.aws.autoscaling.auto-scaling-group/Status :portkey.aws.autoscaling.auto-scaling-group/LaunchConfigurationName :portkey.aws.autoscaling/TargetGroupARNs :portkey.aws.autoscaling/SuspendedProcesses :portkey.aws.autoscaling/TerminationPolicies :portkey.aws.autoscaling/Instances :portkey.aws.autoscaling.auto-scaling-group/PlacementGroup :portkey.aws.autoscaling/HealthCheckGracePeriod :portkey.aws.autoscaling.auto-scaling-group/ServiceLinkedRoleARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/values (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/lifecycle-state (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instance-details/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instance-details (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.auto-scaling-instance-details/InstanceId :portkey.aws.autoscaling.auto-scaling-instance-details/AutoScalingGroupName :portkey.aws.autoscaling.auto-scaling-instance-details/AvailabilityZone :portkey.aws.autoscaling.auto-scaling-instance-details/LifecycleState :portkey.aws.autoscaling.auto-scaling-instance-details/HealthStatus :portkey.aws.autoscaling.auto-scaling-instance-details/ProtectedFromScaleIn] :opt-un [:portkey.aws.autoscaling.auto-scaling-instance-details/LaunchConfigurationName :portkey.aws.autoscaling.auto-scaling-instance-details/LaunchTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimension (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.metric-dimension/Name :portkey.aws.autoscaling.metric-dimension/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-user-data (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 21847)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/resource-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1600)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-load-balancers-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.detach-load-balancers-type/AutoScalingGroupName :portkey.aws.autoscaling/LoadBalancerNames] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/metrics (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-collection-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-metric-collection-types-answer/granularities (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-granularity-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-metric-collection-types-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-metric-collection-types-answer/Metrics :portkey.aws.autoscaling.describe-metric-collection-types-answer/Granularities] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1600)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-transition (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/auto-scaling-group))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-answer/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-answer (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/NotificationConfigurations] :opt-un [:portkey.aws.autoscaling.describe-notification-configurations-answer/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scheduled-actions-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/ScheduledUpdateGroupActions :portkey.aws.autoscaling.scheduled-actions-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-template-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 128)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\(\)\.-/_]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.target-tracking-configuration/target-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/target-tracking-configuration (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.target-tracking-configuration/TargetValue] :opt-un [:portkey.aws.autoscaling/PredefinedMetricSpecification :portkey.aws.autoscaling/CustomizedMetricSpecification :portkey.aws.autoscaling/DisableScaleIn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/filters (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/filter))

(clojure.spec.alpha/def :portkey.aws.autoscaling/min-adjustment-step clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scheduled-actions-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scheduled-actions-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.describe-scheduled-actions-type/AutoScalingGroupName :portkey.aws.autoscaling/ScheduledActionNames :portkey.aws.autoscaling.describe-scheduled-actions-type/StartTime :portkey.aws.autoscaling.describe-scheduled-actions-type/EndTime :portkey.aws.autoscaling.describe-scheduled-actions-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/heartbeat-timeout clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/classic-linkvpcsecurity-groups (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/load-balancer-states (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/load-balancer-state))

(clojure.spec.alpha/def :portkey.aws.autoscaling/honor-cooldown clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-notification-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/target-grouparns (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len511))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hooks (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/lifecycle-hook))

(clojure.spec.alpha/def :portkey.aws.autoscaling/protected-from-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-delete-on-termination clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-process-query/scaling-processes (clojure.spec.alpha/and :portkey.aws.autoscaling/process-names))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-process-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.scaling-process-query/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling.scaling-process-query/ScalingProcesses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-lower-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/metric-interval-upper-bound (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.step-adjustment/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling/step-adjustment (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.step-adjustment/ScalingAdjustment] :opt-un [:portkey.aws.autoscaling.step-adjustment/MetricIntervalLowerBound :portkey.aws.autoscaling.step-adjustment/MetricIntervalUpperBound] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mappings (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/block-device-mapping))

(clojure.spec.alpha/def :portkey.aws.autoscaling/alarms (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/alarm))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-statistic {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/metric-value (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling.execute-policy-type/breach-threshold (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling/execute-policy-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.execute-policy-type/PolicyName] :opt-un [:portkey.aws.autoscaling.execute-policy-type/AutoScalingGroupName :portkey.aws.autoscaling/HonorCooldown :portkey.aws.autoscaling.execute-policy-type/MetricValue :portkey.aws.autoscaling.execute-policy-type/BreachThreshold] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-targetarn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-lifecycle-hook-type/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.put-lifecycle-hook-type/LifecycleHookName :portkey.aws.autoscaling.put-lifecycle-hook-type/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling/LifecycleTransition :portkey.aws.autoscaling.put-lifecycle-hook-type/RoleARN :portkey.aws.autoscaling.put-lifecycle-hook-type/NotificationTargetARN :portkey.aws.autoscaling.put-lifecycle-hook-type/NotificationMetadata :portkey.aws.autoscaling/HeartbeatTimeout :portkey.aws.autoscaling.put-lifecycle-hook-type/DefaultResult] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len2047 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 2047)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policyarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/scaling-adjustment (clojure.spec.alpha/and :portkey.aws.autoscaling/policy-increment))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/adjustment-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/metric-aggregation-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-policy/policy-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len64))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-policy/AutoScalingGroupName :portkey.aws.autoscaling.scaling-policy/PolicyARN :portkey.aws.autoscaling/MinAdjustmentMagnitude :portkey.aws.autoscaling.scaling-policy/PolicyName :portkey.aws.autoscaling.scaling-policy/ScalingAdjustment :portkey.aws.autoscaling/Cooldown :portkey.aws.autoscaling/EstimatedInstanceWarmup :portkey.aws.autoscaling/StepAdjustments :portkey.aws.autoscaling.scaling-policy/AdjustmentType :portkey.aws.autoscaling.scaling-policy/MetricAggregationType :portkey.aws.autoscaling/TargetTrackingConfiguration :portkey.aws.autoscaling/MinAdjustmentStep :portkey.aws.autoscaling/Alarms :portkey.aws.autoscaling.scaling-policy/PolicyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configurationarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/classic-linkvpcid (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/created-time (clojure.spec.alpha/and :portkey.aws.autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.launch-configuration/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/launch-configuration (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.launch-configuration/LaunchConfigurationName :portkey.aws.autoscaling.launch-configuration/ImageId :portkey.aws.autoscaling.launch-configuration/InstanceType :portkey.aws.autoscaling.launch-configuration/CreatedTime] :opt-un [:portkey.aws.autoscaling.launch-configuration/LaunchConfigurationARN :portkey.aws.autoscaling.launch-configuration/PlacementTenancy :portkey.aws.autoscaling.launch-configuration/KernelId :portkey.aws.autoscaling/AssociatePublicIpAddress :portkey.aws.autoscaling/InstanceMonitoring :portkey.aws.autoscaling/SecurityGroups :portkey.aws.autoscaling/EbsOptimized :portkey.aws.autoscaling.launch-configuration/ClassicLinkVPCId :portkey.aws.autoscaling.launch-configuration/KeyName :portkey.aws.autoscaling/SpotPrice :portkey.aws.autoscaling/ClassicLinkVPCSecurityGroups :portkey.aws.autoscaling/BlockDeviceMappings :portkey.aws.autoscaling.launch-configuration/RamdiskId :portkey.aws.autoscaling.launch-configuration/UserData :portkey.aws.autoscaling.launch-configuration/IamInstanceProfile] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-targetarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.lifecycle-hook/AutoScalingGroupName :portkey.aws.autoscaling/GlobalTimeout :portkey.aws.autoscaling.lifecycle-hook/NotificationTargetARN :portkey.aws.autoscaling.lifecycle-hook/NotificationMetadata :portkey.aws.autoscaling.lifecycle-hook/RoleARN :portkey.aws.autoscaling.lifecycle-hook/LifecycleHookName :portkey.aws.autoscaling.lifecycle-hook/DefaultResult :portkey.aws.autoscaling/LifecycleTransition :portkey.aws.autoscaling/HeartbeatTimeout] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.policyarntype/policyarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/policyarntype (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.policyarntype/PolicyARN :portkey.aws.autoscaling/Alarms] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len511 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 511)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling.scaling-activity-in-progress-fault/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-activity-in-progress-fault (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.scaling-activity-in-progress-fault/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/disable-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-granularity-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/virtual-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.block-device-mapping/device-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-mapping (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.block-device-mapping/DeviceName] :opt-un [:portkey.aws.autoscaling.block-device-mapping/VirtualName :portkey.aws.autoscaling/Ebs :portkey.aws.autoscaling/NoDevice] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/resource-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/key (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-key))
(clojure.spec.alpha/def :portkey.aws.autoscaling.tag/value (clojure.spec.alpha/and :portkey.aws.autoscaling/tag-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling/tag (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.tag/Key] :opt-un [:portkey.aws.autoscaling.tag/ResourceId :portkey.aws.autoscaling.tag/ResourceType :portkey.aws.autoscaling.tag/Value :portkey.aws.autoscaling/PropagateAtLaunch] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarm-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.alarm/alarmarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/alarm (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.alarm/AlarmName :portkey.aws.autoscaling.alarm/AlarmARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-scale clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/block-device-ebs-volume-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling.auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-instances-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/AutoScalingInstances :portkey.aws.autoscaling.auto-scaling-instances-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-dimensions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/availability-zone (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/health-status (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len32))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/launch-template (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-template-specification))
(clojure.spec.alpha/def :portkey.aws.autoscaling.instance/protected-from-scale-in (clojure.spec.alpha/and :portkey.aws.autoscaling/instance-protected))
(clojure.spec.alpha/def :portkey.aws.autoscaling/instance (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.instance/InstanceId :portkey.aws.autoscaling.instance/AvailabilityZone :portkey.aws.autoscaling/LifecycleState :portkey.aws.autoscaling.instance/HealthStatus :portkey.aws.autoscaling.instance/ProtectedFromScaleIn] :opt-un [:portkey.aws.autoscaling.instance/LaunchConfigurationName :portkey.aws.autoscaling.instance/LaunchTemplate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling/policy-increment clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/adjustment-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/adjustment-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-auto-scaling-instances-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-instances-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/InstanceIds :portkey.aws.autoscaling/MaxRecords :portkey.aws.autoscaling.describe-auto-scaling-instances-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/topicarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.notification-configuration/notification-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/notification-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.notification-configuration/AutoScalingGroupName :portkey.aws.autoscaling.notification-configuration/TopicARN :portkey.aws.autoscaling.notification-configuration/NotificationType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/suspended-processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/suspended-process))

(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancers-result-type (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.attach-load-balancer-target-groups-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/attach-load-balancer-target-groups-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.attach-load-balancer-target-groups-type/AutoScalingGroupName :portkey.aws.autoscaling/TargetGroupARNs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-metadata (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1023))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/default-result (clojure.spec.alpha/and :portkey.aws.autoscaling/lifecycle-action-result))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/notification-targetarn (clojure.spec.alpha/and :portkey.aws.autoscaling/notification-target-resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.lifecycle-hook-specification/rolearn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-hook-specification (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.lifecycle-hook-specification/LifecycleHookName :portkey.aws.autoscaling/LifecycleTransition] :opt-un [:portkey.aws.autoscaling.lifecycle-hook-specification/NotificationMetadata :portkey.aws.autoscaling/HeartbeatTimeout :portkey.aws.autoscaling.lifecycle-hook-specification/DefaultResult :portkey.aws.autoscaling.lifecycle-hook-specification/NotificationTargetARN :portkey.aws.autoscaling.lifecycle-hook-specification/RoleARN] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-load-balancers-request/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-load-balancers-request (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.describe-load-balancers-request/AutoScalingGroupName] :opt-un [:portkey.aws.autoscaling.describe-load-balancers-request/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.detach-instances-query/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-instances-query (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.detach-instances-query/AutoScalingGroupName :portkey.aws.autoscaling/ShouldDecrementDesiredCapacity] :opt-un [:portkey.aws.autoscaling/InstanceIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/placement-tenancy (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len64))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/kernel-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/image-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/instance-type (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/classic-linkvpcid (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/key-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/launch-configuration-name (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/ramdisk-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/user-data (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-user-data))
(clojure.spec.alpha/def :portkey.aws.autoscaling.create-launch-configuration-type/iam-instance-profile (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling/create-launch-configuration-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.create-launch-configuration-type/LaunchConfigurationName] :opt-un [:portkey.aws.autoscaling.create-launch-configuration-type/PlacementTenancy :portkey.aws.autoscaling.create-launch-configuration-type/KernelId :portkey.aws.autoscaling.create-launch-configuration-type/InstanceId :portkey.aws.autoscaling/AssociatePublicIpAddress :portkey.aws.autoscaling/InstanceMonitoring :portkey.aws.autoscaling.create-launch-configuration-type/ImageId :portkey.aws.autoscaling/SecurityGroups :portkey.aws.autoscaling/EbsOptimized :portkey.aws.autoscaling.create-launch-configuration-type/InstanceType :portkey.aws.autoscaling.create-launch-configuration-type/ClassicLinkVPCId :portkey.aws.autoscaling.create-launch-configuration-type/KeyName :portkey.aws.autoscaling/SpotPrice :portkey.aws.autoscaling/ClassicLinkVPCSecurityGroups :portkey.aws.autoscaling/BlockDeviceMappings :portkey.aws.autoscaling.create-launch-configuration-type/RamdiskId :portkey.aws.autoscaling.create-launch-configuration-type/UserData :portkey.aws.autoscaling.create-launch-configuration-type/IamInstanceProfile] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-desired-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/availability-zones (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255 :min-count 1))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-type {"ASGAverageCPUUtilization" "ASGAverageCPUUtilization", :asgaveragecpuutilization "ASGAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asgaverage-network-in "ASGAverageNetworkIn", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :asgaverage-network-out "ASGAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", :albrequest-count-per-target "ALBRequestCountPerTarget"})

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-scaling-activities-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-scaling-activities-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/ActivityIds :portkey.aws.autoscaling.describe-scaling-activities-type/AutoScalingGroupName :portkey.aws.autoscaling/MaxRecords :portkey.aws.autoscaling.describe-scaling-activities-type/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/termination-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len1600))

(clojure.spec.alpha/def :portkey.aws.autoscaling.describe-notification-configurations-type/next-token (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-notification-configurations-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/AutoScalingGroupNames :portkey.aws.autoscaling.describe-notification-configurations-type/NextToken :portkey.aws.autoscaling/MaxRecords] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/detach-load-balancers-result-type (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/processes (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/process-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/process-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/put-lifecycle-hook-answer (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-collection-types (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/metric-collection-type))

(clojure.spec.alpha/def :portkey.aws.autoscaling/auto-scaling-group-min-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling/instances (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/instance))

(clojure.spec.alpha/def :portkey.aws.autoscaling/force-delete clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.metric-granularity-type/granularity (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/metric-granularity-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.metric-granularity-type/Granularity] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/lifecycle-action-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 36 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 36))))

(clojure.spec.alpha/def :portkey.aws.autoscaling/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.autoscaling.invalid-next-token/message (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling/invalid-next-token (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling.invalid-next-token/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.delete-lifecycle-hook-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling/delete-lifecycle-hook-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.delete-lifecycle-hook-type/LifecycleHookName :portkey.aws.autoscaling.delete-lifecycle-hook-type/AutoScalingGroupName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.autoscaling.customized-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.autoscaling/metric-unit))
(clojure.spec.alpha/def :portkey.aws.autoscaling/customized-metric-specification (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling/MetricName :portkey.aws.autoscaling.customized-metric-specification/Namespace :portkey.aws.autoscaling.customized-metric-specification/Statistic] :opt-un [:portkey.aws.autoscaling.customized-metric-specification/Dimensions :portkey.aws.autoscaling.customized-metric-specification/Unit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/health-check-grace-period clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/topicarn (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.put-notification-configuration-type/notification-types (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-notification-types))
(clojure.spec.alpha/def :portkey.aws.autoscaling/put-notification-configuration-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.put-notification-configuration-type/AutoScalingGroupName :portkey.aws.autoscaling.put-notification-configuration-type/TopicARN :portkey.aws.autoscaling.put-notification-configuration-type/NotificationTypes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/lifecycle-hook-name (clojure.spec.alpha/and :portkey.aws.autoscaling/ascii-string-max-len255))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/auto-scaling-group-name (clojure.spec.alpha/and :portkey.aws.autoscaling/resource-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling.complete-lifecycle-action-type/instance-id (clojure.spec.alpha/and :portkey.aws.autoscaling/xml-string-max-len19))
(clojure.spec.alpha/def :portkey.aws.autoscaling/complete-lifecycle-action-type (portkey.aws/json-keys :req-un [:portkey.aws.autoscaling.complete-lifecycle-action-type/LifecycleHookName :portkey.aws.autoscaling.complete-lifecycle-action-type/AutoScalingGroupName :portkey.aws.autoscaling/LifecycleActionResult] :opt-un [:portkey.aws.autoscaling/LifecycleActionToken :portkey.aws.autoscaling.complete-lifecycle-action-type/InstanceId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/describe-auto-scaling-notification-types-answer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.autoscaling/AutoScalingNotificationTypes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.autoscaling/metrics (clojure.spec.alpha/coll-of :portkey.aws.autoscaling/xml-string-max-len255))

(clojure.spec.alpha/def :portkey.aws.autoscaling/xml-string-max-len32 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 32)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__36228__auto__))))

(clojure.core/defn update-auto-scaling-group "Updates the configuration for the specified Auto Scaling group.\n The new settings take effect on any scaling activities after this call returns.\nScaling activities that are currently in progress aren't affected.\n To update an Auto Scaling group with a launch configuration with\nInstanceMonitoring set to false, you must first disable the collection of group\nmetrics. Otherwise, you will get an error. If you have previously enabled the\ncollection of group metrics, you can disable it using DisableMetricsCollection.\n Note the following:\n * If you specify a new value for MinSize without specifying a value for\nDesiredCapacity, and the new MinSize is larger than the current size of the\ngroup, we implicitly call SetDesiredCapacity to set the size of the group to the\nnew value of MinSize.\n * If you specify a new value for MaxSize without specifying a value for\nDesiredCapacity, and the new MaxSize is smaller than the current size of the\ngroup, we implicitly call SetDesiredCapacity to set the size of the group to the\nnew value of MaxSize.\n * All other optional parameters are left unchanged if not specified." ([update-auto-scaling-group-type] (clojure.core/let [req<-input__36755__auto__ (req<-update-auto-scaling-group-type "UpdateAutoScalingGroup" update-auto-scaling-group-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/update-auto-scaling-group-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef update-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/update-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn describe-scaling-activities "Describes one or more scaling activities for the specified Auto Scaling group." ([] (describe-scaling-activities {})) ([describe-scaling-activities-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-scaling-activities-type "DescribeScalingActivities" describe-scaling-activities-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-scaling-activities-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/activities-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-scaling-activities :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scaling-activities-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activities-type))

nil

nil

(clojure.core/defn describe-auto-scaling-groups "Describes one or more Auto Scaling groups." ([] (describe-auto-scaling-groups {})) ([auto-scaling-group-names-type] (clojure.core/let [req<-input__36755__auto__ (req<-auto-scaling-group-names-type "DescribeAutoScalingGroups" auto-scaling-group-names-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/auto-scaling-group-names-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/auto-scaling-groups-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-auto-scaling-groups :args (clojure.spec.alpha/? :portkey.aws.autoscaling/auto-scaling-group-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-groups-type))

(clojure.core/defn attach-load-balancer-target-groups "Attaches one or more target groups to the specified Auto Scaling group.\n To describe the target groups for an Auto Scaling group, use\nDescribeLoadBalancerTargetGroups. To detach the target group from the Auto\nScaling group, use DetachLoadBalancerTargetGroups.\n For more information, see Attach a Load Balancer to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/attach-load-balancer-asg.html)\nin the Auto Scaling User Guide." ([attach-load-balancer-target-groups-type] (clojure.core/let [req<-input__36755__auto__ (req<-attach-load-balancer-target-groups-type "AttachLoadBalancerTargetGroups" attach-load-balancer-target-groups-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/attach-load-balancer-target-groups-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef attach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancer-target-groups-result-type))

(clojure.core/defn describe-launch-configurations "Describes one or more launch configurations." ([] (describe-launch-configurations {})) ([launch-configuration-names-type] (clojure.core/let [req<-input__36755__auto__ (req<-launch-configuration-names-type "DescribeLaunchConfigurations" launch-configuration-names-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/launch-configuration-names-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/launch-configurations-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-launch-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/launch-configuration-names-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/launch-configurations-type))

nil

nil

(clojure.core/defn describe-policies "Describes the policies for the specified Auto Scaling group." ([] (describe-policies {})) ([describe-policies-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-policies-type "DescribePolicies" describe-policies-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-policies-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/policies-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef describe-policies :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-policies-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policies-type))

(clojure.core/defn set-instance-protection "Updates the instance protection settings of the specified instances.\n For more information, see Instance Protection\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-termination.html#instance-protection)\nin the Auto Scaling User Guide." ([set-instance-protection-query] (clojure.core/let [req<-input__36755__auto__ (req<-set-instance-protection-query "SetInstanceProtection" set-instance-protection-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/set-instance-protection-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/set-instance-protection-answer {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef set-instance-protection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-protection-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/set-instance-protection-answer))

(clojure.core/defn resume-processes "Resumes the specified suspended Auto Scaling processes, or all suspended\nprocess, for the specified Auto Scaling group.\n For more information, see Suspending and Resuming Auto Scaling Processes\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-suspend-resume-processes.html)\nin the Auto Scaling User Guide." ([scaling-process-query] (clojure.core/let [req<-input__36755__auto__ (req<-scaling-process-query "ResumeProcesses" scaling-process-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/scaling-process-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef resume-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-instances "Removes one or more instances from the specified Auto Scaling group.\n After the instances are detached, you can manage them independent of the Auto\nScaling group.\n If you do not specify the option to decrement the desired capacity, Auto\nScaling launches instances to replace the ones that are detached.\n If there is a Classic Load Balancer attached to the Auto Scaling group, the\ninstances are deregistered from the load balancer. If there are target groups\nattached to the Auto Scaling group, the instances are deregistered from the\ntarget groups.\n For more information, see Detach EC2 Instances from Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/detach-instance-asg.html)\nin the Auto Scaling User Guide." ([detach-instances-query] (clojure.core/let [req<-input__36755__auto__ (req<-detach-instances-query "DetachInstances" detach-instances-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/detach-instances-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/detach-instances-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef detach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-instances-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-instances-answer))

(clojure.core/defn attach-instances "Attaches one or more EC2 instances to the specified Auto Scaling group.\n When you attach instances, Auto Scaling increases the desired capacity of the\ngroup by the number of instances being attached. If the number of instances\nbeing attached plus the desired capacity of the group exceeds the maximum size\nof the group, the operation fails.\n If there is a Classic Load Balancer attached to your Auto Scaling group, the\ninstances are also registered with the load balancer. If there are target groups\nattached to your Auto Scaling group, the instances are also registered with the\ntarget groups.\n For more information, see Attach EC2 Instances to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/attach-instance-asg.html)\nin the Auto Scaling User Guide." ([attach-instances-query] (clojure.core/let [req<-input__36755__auto__ (req<-attach-instances-query "AttachInstances" attach-instances-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/attach-instances-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef attach-instances :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-instances-query) :ret clojure.core/true?)

(clojure.core/defn delete-tags "Deletes the specified tags." ([delete-tags-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-tags-type "DeleteTags" delete-tags-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-tags-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-tags-type) :ret clojure.core/true?)

(clojure.core/defn record-lifecycle-action-heartbeat "Records a heartbeat for the lifecycle action associated with the specified token\nor instance. This extends the timeout by the length of time defined using\nPutLifecycleHook.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Auto Scaling launches or terminates\ninstances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Auto Scaling\nto publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Auto Scaling Lifecycle\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html)\nin the Auto Scaling User Guide." ([record-lifecycle-action-heartbeat-type] (clojure.core/let [req<-input__36755__auto__ (req<-record-lifecycle-action-heartbeat-type "RecordLifecycleActionHeartbeat" record-lifecycle-action-heartbeat-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef record-lifecycle-action-heartbeat :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/record-lifecycle-action-heartbeat-answer))

(clojure.core/defn create-auto-scaling-group "Creates an Auto Scaling group with the specified name and attributes.\n If you exceed your maximum limit of Auto Scaling groups, the call fails. For\ninformation about viewing this limit, see DescribeAccountLimits. For information\nabout updating this limit, see Auto Scaling Limits\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-account-limits.html)\nin the Auto Scaling User Guide.\n For more information, see Auto Scaling Groups\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroup.html)\nin the Auto Scaling User Guide." ([create-auto-scaling-group-type] (clojure.core/let [req<-input__36755__auto__ (req<-create-auto-scaling-group-type "CreateAutoScalingGroup" create-auto-scaling-group-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/create-auto-scaling-group-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef create-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-auto-scaling-group-type) :ret clojure.core/true?)

(clojure.core/defn terminate-instance-in-auto-scaling-group "Terminates the specified instance and optionally adjusts the desired group size.\n This call simply makes a termination request. The instance is not terminated\nimmediately." ([terminate-instance-in-auto-scaling-group-type] (clojure.core/let [req<-input__36755__auto__ (req<-terminate-instance-in-auto-scaling-group-type "TerminateInstanceInAutoScalingGroup" terminate-instance-in-auto-scaling-group-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/activity-type {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef terminate-instance-in-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/terminate-instance-in-auto-scaling-group-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/activity-type))

(clojure.core/defn describe-notification-configurations "Describes the notification actions associated with the specified Auto Scaling\ngroup." ([] (describe-notification-configurations {})) ([describe-notification-configurations-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-notification-configurations-type "DescribeNotificationConfigurations" describe-notification-configurations-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-notification-configurations-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/describe-notification-configurations-answer {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-notification-configurations :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-notification-configurations-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-notification-configurations-answer))

(clojure.core/defn attach-load-balancers "Attaches one or more Classic Load Balancers to the specified Auto Scaling group.\n To attach an Application Load Balancer instead, see\nAttachLoadBalancerTargetGroups.\n To describe the load balancers for an Auto Scaling group, use\nDescribeLoadBalancers. To detach the load balancer from the Auto Scaling group,\nuse DetachLoadBalancers.\n For more information, see Attach a Load Balancer to Your Auto Scaling Group\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/attach-load-balancer-asg.html)\nin the Auto Scaling User Guide." ([attach-load-balancers-type] (clojure.core/let [req<-input__36755__auto__ (req<-attach-load-balancers-type "AttachLoadBalancers" attach-load-balancers-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/attach-load-balancers-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/attach-load-balancers-result-type {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef attach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/attach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/attach-load-balancers-result-type))

(clojure.core/defn set-instance-health "Sets the health status of the specified instance.\n For more information, see Health Checks\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/healthcheck.html) in\nthe Auto Scaling User Guide." ([set-instance-health-query] (clojure.core/let [req<-input__36755__auto__ (req<-set-instance-health-query "SetInstanceHealth" set-instance-health-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/set-instance-health-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef set-instance-health :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-instance-health-query) :ret clojure.core/true?)

(clojure.core/defn create-or-update-tags "Creates or updates tags for the specified Auto Scaling group.\n When you specify a tag with a key that already exists, the operation overwrites\nthe previous tag definition, and you do not get an error message.\n For more information, see Tagging Auto Scaling Groups and Instances\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/autoscaling-tagging.html)\nin the Auto Scaling User Guide." ([create-or-update-tags-type] (clojure.core/let [req<-input__36755__auto__ (req<-create-or-update-tags-type "CreateOrUpdateTags" create-or-update-tags-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/create-or-update-tags-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault}))))
(clojure.spec.alpha/fdef create-or-update-tags :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-or-update-tags-type) :ret clojure.core/true?)

(clojure.core/defn execute-policy "Executes the specified policy." ([execute-policy-type] (clojure.core/let [req<-input__36755__auto__ (req<-execute-policy-type "ExecutePolicy" execute-policy-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/execute-policy-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef execute-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/execute-policy-type) :ret clojure.core/true?)

(clojure.core/defn disable-metrics-collection "Disables group metrics for the specified Auto Scaling group." ([disable-metrics-collection-query] (clojure.core/let [req<-input__36755__auto__ (req<-disable-metrics-collection-query "DisableMetricsCollection" disable-metrics-collection-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/disable-metrics-collection-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef disable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/disable-metrics-collection-query) :ret clojure.core/true?)

nil

(clojure.core/defn delete-lifecycle-hook "Deletes the specified lifecycle hook.\n If there are any outstanding lifecycle actions, they are completed first\n(ABANDON for launching instances, CONTINUE for terminating instances)." ([delete-lifecycle-hook-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-lifecycle-hook-type "DeleteLifecycleHook" delete-lifecycle-hook-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-lifecycle-hook-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/delete-lifecycle-hook-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef delete-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/delete-lifecycle-hook-answer))

(clojure.core/defn describe-tags "Describes the specified tags.\n You can use filters to limit the results. For example, you can query for the\ntags for a specific Auto Scaling group. You can specify multiple values for a\nfilter. A tag must match at least one of the specified values for it to be\nincluded in the results.\n You can also specify multiple filters. The result includes information for a\nparticular tag only if it matches all the filters. If there's no match, no\nspecial message is returned." ([] (describe-tags {})) ([describe-tags-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-tags-type "DescribeTags" describe-tags-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-tags-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/tags-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-tags :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-tags-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/tags-type))

(clojure.core/defn describe-scheduled-actions "Describes the actions scheduled for your Auto Scaling group that haven't run. To\ndescribe the actions that have already run, use DescribeScalingActivities." ([] (describe-scheduled-actions {})) ([describe-scheduled-actions-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-scheduled-actions-type "DescribeScheduledActions" describe-scheduled-actions-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-scheduled-actions-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/scheduled-actions-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-scheduled-actions :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-scheduled-actions-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/scheduled-actions-type))

(clojure.core/defn set-desired-capacity "Sets the size of the specified Auto Scaling group.\n For more information about desired capacity, see What Is Auto Scaling?\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/WhatIsAutoScaling.html)\nin the Auto Scaling User Guide." ([set-desired-capacity-type] (clojure.core/let [req<-input__36755__auto__ (req<-set-desired-capacity-type "SetDesiredCapacity" set-desired-capacity-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/set-desired-capacity-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef set-desired-capacity :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/set-desired-capacity-type) :ret clojure.core/true?)

(clojure.core/defn enable-metrics-collection "Enables group metrics for the specified Auto Scaling group. For more\ninformation, see Monitoring Your Auto Scaling Groups and Instances\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-instance-monitoring.html)\nin the Auto Scaling User Guide." ([enable-metrics-collection-query] (clojure.core/let [req<-input__36755__auto__ (req<-enable-metrics-collection-query "EnableMetricsCollection" enable-metrics-collection-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/enable-metrics-collection-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef enable-metrics-collection :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enable-metrics-collection-query) :ret clojure.core/true?)

(clojure.core/defn suspend-processes "Suspends the specified Auto Scaling processes, or all processes, for the\nspecified Auto Scaling group.\n Note that if you suspend either the Launch or Terminate process types, it can\nprevent other process types from functioning properly.\n To resume processes that have been suspended, use ResumeProcesses.\n For more information, see Suspending and Resuming Auto Scaling Processes\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-suspend-resume-processes.html)\nin the Auto Scaling User Guide." ([scaling-process-query] (clojure.core/let [req<-input__36755__auto__ (req<-scaling-process-query "SuspendProcesses" scaling-process-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/scaling-process-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef suspend-processes :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/scaling-process-query) :ret clojure.core/true?)

(clojure.core/defn detach-load-balancer-target-groups "Detaches one or more target groups from the specified Auto Scaling group." ([detach-load-balancer-target-groups-type] (clojure.core/let [req<-input__36755__auto__ (req<-detach-load-balancer-target-groups-type "DetachLoadBalancerTargetGroups" detach-load-balancer-target-groups-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/detach-load-balancer-target-groups-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef detach-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancer-target-groups-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancer-target-groups-result-type))

(clojure.core/defn detach-load-balancers "Detaches one or more Classic Load Balancers from the specified Auto Scaling\ngroup.\n Note that this operation detaches only Classic Load Balancers. If you have\nApplication Load Balancers, use DetachLoadBalancerTargetGroups instead.\n When you detach a load balancer, it enters the Removing state while\nderegistering the instances in the group. When all instances are deregistered,\nthen you can no longer describe the load balancer using DescribeLoadBalancers.\nNote that the instances remain running." ([detach-load-balancers-type] (clojure.core/let [req<-input__36755__auto__ (req<-detach-load-balancers-type "DetachLoadBalancers" detach-load-balancers-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/detach-load-balancers-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/detach-load-balancers-result-type {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef detach-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/detach-load-balancers-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/detach-load-balancers-result-type))

(clojure.core/defn describe-lifecycle-hooks "Describes the lifecycle hooks for the specified Auto Scaling group." ([describe-lifecycle-hooks-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-lifecycle-hooks-type "DescribeLifecycleHooks" describe-lifecycle-hooks-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-lifecycle-hooks-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/describe-lifecycle-hooks-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-lifecycle-hooks :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-lifecycle-hooks-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-lifecycle-hooks-answer))

(clojure.core/defn enter-standby "Moves the specified instances into the standby state.\n For more information, see Temporarily Removing Instances from Your Auto Scaling\nGroup\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-enter-exit-standby.html)\nin the Auto Scaling User Guide." ([enter-standby-query] (clojure.core/let [req<-input__36755__auto__ (req<-enter-standby-query "EnterStandby" enter-standby-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/enter-standby-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/enter-standby-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef enter-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/enter-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/enter-standby-answer))

(clojure.core/defn describe-load-balancer-target-groups "Describes the target groups for the specified Auto Scaling group." ([describe-load-balancer-target-groups-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancer-target-groups-request "DescribeLoadBalancerTargetGroups" describe-load-balancer-target-groups-request)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-load-balancer-target-groups-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/describe-load-balancer-target-groups-response {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-load-balancer-target-groups :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancer-target-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancer-target-groups-response))

nil

(clojure.core/defn delete-notification-configuration "Deletes the specified notification." ([delete-notification-configuration-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-notification-configuration-type "DeleteNotificationConfiguration" delete-notification-configuration-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-notification-configuration-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef delete-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn exit-standby "Moves the specified instances out of the standby state.\n For more information, see Temporarily Removing Instances from Your Auto Scaling\nGroup\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-enter-exit-standby.html)\nin the Auto Scaling User Guide." ([exit-standby-query] (clojure.core/let [req<-input__36755__auto__ (req<-exit-standby-query "ExitStandby" exit-standby-query)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/exit-standby-query {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/exit-standby-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef exit-standby :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/exit-standby-query) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/exit-standby-answer))

(clojure.core/defn delete-launch-configuration "Deletes the specified launch configuration.\n The launch configuration must not be attached to an Auto Scaling group. When\nthis call completes, the launch configuration is no longer available for use." ([launch-configuration-name-type] (clojure.core/let [req<-input__36755__auto__ (req<-launch-configuration-name-type "DeleteLaunchConfiguration" launch-configuration-name-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/launch-configuration-name-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef delete-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/launch-configuration-name-type) :ret clojure.core/true?)

(clojure.core/defn create-launch-configuration "Creates a launch configuration.\n If you exceed your maximum limit of launch configurations, the call fails. For\ninformation about viewing this limit, see DescribeAccountLimits. For information\nabout updating this limit, see Auto Scaling Limits\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/as-account-limits.html)\nin the Auto Scaling User Guide.\n For more information, see Launch Configurations\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/LaunchConfiguration.html)\nin the Auto Scaling User Guide." ([create-launch-configuration-type] (clojure.core/let [req<-input__36755__auto__ (req<-create-launch-configuration-type "CreateLaunchConfiguration" create-launch-configuration-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/create-launch-configuration-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef create-launch-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/create-launch-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-auto-scaling-group "Deletes the specified Auto Scaling group.\n If the group has instances or scaling activities in progress, you must specify\nthe option to force the deletion in order for it to succeed.\n If the group has policies, deleting the group deletes the policies, the\nunderlying alarm actions, and any alarm that no longer has an associated action.\n To remove instances from the Auto Scaling group before deleting it, call\nDetachInstances with the list of instances and the option to decrement the\ndesired capacity so that Auto Scaling does not launch replacement instances.\n To terminate all instances before deleting the Auto Scaling group, call\nUpdateAutoScalingGroup and set the minimum size and desired capacity of the Auto\nScaling group to zero." ([delete-auto-scaling-group-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-auto-scaling-group-type "DeleteAutoScalingGroup" delete-auto-scaling-group-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-auto-scaling-group-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ScalingActivityInProgressFault" :portkey.aws.autoscaling/scaling-activity-in-progress-fault, "ResourceInUseFault" :portkey.aws.autoscaling/resource-in-use-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef delete-auto-scaling-group :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-auto-scaling-group-type) :ret clojure.core/true?)

nil

(clojure.core/defn describe-auto-scaling-instances "Describes one or more Auto Scaling instances." ([] (describe-auto-scaling-instances {})) ([describe-auto-scaling-instances-type] (clojure.core/let [req<-input__36755__auto__ (req<-describe-auto-scaling-instances-type "DescribeAutoScalingInstances" describe-auto-scaling-instances-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-auto-scaling-instances-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/auto-scaling-instances-type {"InvalidNextToken" :portkey.aws.autoscaling/invalid-next-token, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-auto-scaling-instances :args (clojure.spec.alpha/? :portkey.aws.autoscaling/describe-auto-scaling-instances-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/auto-scaling-instances-type))

(clojure.core/defn put-notification-configuration "Configures an Auto Scaling group to send notifications when specified events\ntake place. Subscribers to the specified topic can have messages delivered to an\nendpoint such as a web server or an email address.\n This configuration overwrites any existing configuration.\n For more information see Getting SNS Notifications When Your Auto Scaling Group\nScales\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/ASGettingNotifications.html)\nin the Auto Scaling User Guide." ([put-notification-configuration-type] (clojure.core/let [req<-input__36755__auto__ (req<-put-notification-configuration-type "PutNotificationConfiguration" put-notification-configuration-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/put-notification-configuration-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef put-notification-configuration :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-notification-configuration-type) :ret clojure.core/true?)

(clojure.core/defn delete-scheduled-action "Deletes the specified scheduled action." ([delete-scheduled-action-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-scheduled-action-type "DeleteScheduledAction" delete-scheduled-action-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-scheduled-action-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-scheduled-action-type) :ret clojure.core/true?)

(clojure.core/defn complete-lifecycle-action "Completes the lifecycle action for the specified token or instance with the\nspecified result.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Auto Scaling launches or terminates\ninstances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Auto Scaling\nto publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Auto Scaling Lifecycle\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/AutoScalingGroupLifecycle.html)\nin the Auto Scaling User Guide." ([complete-lifecycle-action-type] (clojure.core/let [req<-input__36755__auto__ (req<-complete-lifecycle-action-type "CompleteLifecycleAction" complete-lifecycle-action-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/complete-lifecycle-action-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/complete-lifecycle-action-answer {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef complete-lifecycle-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/complete-lifecycle-action-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/complete-lifecycle-action-answer))

(clojure.core/defn put-scaling-policy "Creates or updates a policy for an Auto Scaling group. To update an existing\npolicy, use the existing policy name and set the parameters you want to change.\nAny existing parameter not changed in an update to an existing policy is not\nchanged in this update request.\n If you exceed your maximum limit of step adjustments, which by default is 20\nper region, the call fails. For information about updating this limit, see AWS\nService Limits\n(http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html) in the\nAmazon Web Services General Reference." ([put-scaling-policy-type] (clojure.core/let [req<-input__36755__auto__ (req<-put-scaling-policy-type "PutScalingPolicy" put-scaling-policy-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/put-scaling-policy-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/policyarntype {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef put-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scaling-policy-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/policyarntype))

(clojure.core/defn delete-policy "Deletes the specified Auto Scaling policy.\n Deleting a policy deletes the underlying alarm action, but does not delete the\nalarm, even if it no longer has an associated action." ([delete-policy-type] (clojure.core/let [req<-input__36755__auto__ (req<-delete-policy-type "DeletePolicy" delete-policy-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/delete-policy-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault, "ServiceLinkedRoleFailure" :portkey.aws.autoscaling/service-linked-role-failure}))))
(clojure.spec.alpha/fdef delete-policy :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/delete-policy-type) :ret clojure.core/true?)

(clojure.core/defn describe-load-balancers "Describes the load balancers for the specified Auto Scaling group.\n Note that this operation describes only Classic Load Balancers. If you have\nApplication Load Balancers, use DescribeLoadBalancerTargetGroups instead." ([describe-load-balancers-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-load-balancers-request "DescribeLoadBalancers" describe-load-balancers-request)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/describe-load-balancers-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/describe-load-balancers-response {"ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef describe-load-balancers :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/describe-load-balancers-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/describe-load-balancers-response))

(clojure.core/defn put-scheduled-update-group-action "Creates or updates a scheduled scaling action for an Auto Scaling group. When\nupdating a scheduled scaling action, if you leave a parameter unspecified, the\ncorresponding value remains unchanged.\n For more information, see Scheduled Scaling\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/schedule_time.html) in\nthe Auto Scaling User Guide." ([put-scheduled-update-group-action-type] (clojure.core/let [req<-input__36755__auto__ (req<-put-scheduled-update-group-action-type "PutScheduledUpdateGroupAction" put-scheduled-update-group-action-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/put-scheduled-update-group-action-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"AlreadyExistsFault" :portkey.aws.autoscaling/already-exists-fault, "LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef put-scheduled-update-group-action :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-scheduled-update-group-action-type) :ret clojure.core/true?)

(clojure.core/defn put-lifecycle-hook "Creates or updates a lifecycle hook for the specified Auto Scaling Group.\n A lifecycle hook tells Auto Scaling that you want to perform an action on an\ninstance that is not actively in service; for example, either when the instance\nlaunches or before the instance terminates.\n This step is a part of the procedure for adding a lifecycle hook to an Auto\nScaling group:\n * (Optional) Create a Lambda function and a rule that allows CloudWatch Events\nto invoke your Lambda function when Auto Scaling launches or terminates\ninstances.\n * (Optional) Create a notification target and an IAM role. The target can be\neither an Amazon SQS queue or an Amazon SNS topic. The role allows Auto Scaling\nto publish lifecycle notifications to the target.\n * Create the lifecycle hook. Specify whether the hook is used when the\ninstances launch or terminate.\n * If you need more time, record the lifecycle action heartbeat to keep the\ninstance in a pending state.\n * If you finish before the timeout period ends, complete the lifecycle action.\n For more information, see Auto Scaling Lifecycle Hooks\n(http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)\nin the Auto Scaling User Guide.\n If you exceed your maximum limit of lifecycle hooks, which by default is 50 per\nAuto Scaling group, the call fails. For information about updating this limit,\nsee AWS Service Limits\n(http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html) in the\nAmazon Web Services General Reference." ([put-lifecycle-hook-type] (clojure.core/let [req<-input__36755__auto__ (req<-put-lifecycle-hook-type "PutLifecycleHook" put-lifecycle-hook-type)] (portkey.aws/-query-call portkey.aws.autoscaling/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.autoscaling/put-lifecycle-hook-type {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.autoscaling/put-lifecycle-hook-answer {"LimitExceededFault" :portkey.aws.autoscaling/limit-exceeded-fault, "ResourceContentionFault" :portkey.aws.autoscaling/resource-contention-fault}))))
(clojure.spec.alpha/fdef put-lifecycle-hook :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling/put-lifecycle-hook-type) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling/put-lifecycle-hook-answer))
