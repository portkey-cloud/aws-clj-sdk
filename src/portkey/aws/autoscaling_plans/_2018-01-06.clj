(ns portkey.aws.autoscaling-plans.-2018-01-06 (:require [portkey.aws]))

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

(clojure.core/declare ser-predefined-scaling-metric-specification)

(clojure.core/declare ser-tag-values)

(clojure.core/declare ser-customized-load-metric-specification)

(clojure.core/declare ser-xml-string-max-len-128)

(clojure.core/declare ser-scaling-plan-name)

(clojure.core/declare ser-load-metric-type)

(clojure.core/declare ser-resource-id-max-len-1600)

(clojure.core/declare ser-resource-capacity)

(clojure.core/declare ser-predictive-scaling-max-capacity-behavior)

(clojure.core/declare ser-scalable-dimension)

(clojure.core/declare ser-scaling-plan-version)

(clojure.core/declare ser-metric-dimension-value)

(clojure.core/declare ser-xml-string-max-len-256)

(clojure.core/declare ser-cooldown)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-scheduled-action-buffer-time)

(clojure.core/declare ser-tag-filters)

(clojure.core/declare ser-disable-dynamic-scaling)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-metric-dimension-name)

(clojure.core/declare ser-timestamp-type)

(clojure.core/declare ser-resource-label)

(clojure.core/declare ser-predefined-load-metric-specification)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-target-tracking-configuration)

(clojure.core/declare ser-scaling-policy-update-behavior)

(clojure.core/declare ser-target-tracking-configurations)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-metric-statistic)

(clojure.core/declare ser-application-source)

(clojure.core/declare ser-disable-scale-in)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-scaling-plan-names)

(clojure.core/declare ser-metric-scale)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-metric-dimensions)

(clojure.core/declare ser-metric-namespace)

(clojure.core/declare ser-customized-scaling-metric-specification)

(clojure.core/declare ser-application-sources)

(clojure.core/declare ser-predictive-scaling-mode)

(clojure.core/declare ser-scaling-metric-type)

(clojure.core/declare ser-scaling-instruction)

(clojure.core/declare ser-forecast-data-type)

(clojure.core/declare ser-scaling-instructions)

(clojure.core/declare ser-service-namespace)

(clojure.core/defn- ser-predefined-scaling-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scaling-metric-type (:predefined-scaling-metric-type input)) #:http.request.field{:name "PredefinedScalingMetricType", :shape "ScalingMetricType"})], :shape "PredefinedScalingMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-label (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "ResourceLabel"}))))

(clojure.core/defn- ser-tag-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "TagValues", :type "list"})

(clojure.core/defn- ser-customized-load-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:namespace input)) #:http.request.field{:name "Namespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-statistic (:statistic input)) #:http.request.field{:name "Statistic", :shape "MetricStatistic"})], :shape "CustomizedLoadMetricSpecification", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensions"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "Unit", :shape "MetricUnit"}))))

(clojure.core/defn- ser-xml-string-max-len-128 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen128"})

(clojure.core/defn- ser-scaling-plan-name [input] #:http.request.field{:value input, :shape "ScalingPlanName"})

(clojure.core/defn- ser-load-metric-type [input] #:http.request.field{:value (clojure.core/get {"ASGTotalCPUUtilization" "ASGTotalCPUUtilization", :asg-total-cpu-utilization "ASGTotalCPUUtilization", "ASGTotalNetworkIn" "ASGTotalNetworkIn", :asg-total-network-in "ASGTotalNetworkIn", "ASGTotalNetworkOut" "ASGTotalNetworkOut", :asg-total-network-out "ASGTotalNetworkOut", "ALBTargetGroupRequestCount" "ALBTargetGroupRequestCount", :alb-target-group-request-count "ALBTargetGroupRequestCount"} input), :shape "LoadMetricType"})

(clojure.core/defn- ser-resource-id-max-len-1600 [input] #:http.request.field{:value input, :shape "ResourceIdMaxLen1600"})

(clojure.core/defn- ser-resource-capacity [input] #:http.request.field{:value input, :shape "ResourceCapacity"})

(clojure.core/defn- ser-predictive-scaling-max-capacity-behavior [input] #:http.request.field{:value (clojure.core/get {"SetForecastCapacityToMaxCapacity" "SetForecastCapacityToMaxCapacity", :set-forecast-capacity-to-max-capacity "SetForecastCapacityToMaxCapacity", "SetMaxCapacityToForecastCapacity" "SetMaxCapacityToForecastCapacity", :set-max-capacity-to-forecast-capacity "SetMaxCapacityToForecastCapacity", "SetMaxCapacityAboveForecastCapacity" "SetMaxCapacityAboveForecastCapacity", :set-max-capacity-above-forecast-capacity "SetMaxCapacityAboveForecastCapacity"} input), :shape "PredictiveScalingMaxCapacityBehavior"})

(clojure.core/defn- ser-scalable-dimension [input] #:http.request.field{:value (clojure.core/get {"dynamodb:table:WriteCapacityUnits" "dynamodb:table:WriteCapacityUnits", :ecsservice-desired-count "ecs:service:DesiredCount", :dynamodbindex-write-capacity-units "dynamodb:index:WriteCapacityUnits", "ec2:spot-fleet-request:TargetCapacity" "ec2:spot-fleet-request:TargetCapacity", :ec-2spotfleetrequest-target-capacity "ec2:spot-fleet-request:TargetCapacity", "dynamodb:table:ReadCapacityUnits" "dynamodb:table:ReadCapacityUnits", "ecs:service:DesiredCount" "ecs:service:DesiredCount", "dynamodb:index:WriteCapacityUnits" "dynamodb:index:WriteCapacityUnits", :rdscluster-read-replica-count "rds:cluster:ReadReplicaCount", :dynamodbtable-write-capacity-units "dynamodb:table:WriteCapacityUnits", :dynamodbtable-read-capacity-units "dynamodb:table:ReadCapacityUnits", "rds:cluster:ReadReplicaCount" "rds:cluster:ReadReplicaCount", "autoscaling:autoScalingGroup:DesiredCapacity" "autoscaling:autoScalingGroup:DesiredCapacity", :autoscalingauto-scaling-group-desired-capacity "autoscaling:autoScalingGroup:DesiredCapacity", :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits", "dynamodb:index:ReadCapacityUnits" "dynamodb:index:ReadCapacityUnits"} input), :shape "ScalableDimension"})

(clojure.core/defn- ser-scaling-plan-version [input] #:http.request.field{:value input, :shape "ScalingPlanVersion"})

(clojure.core/defn- ser-metric-dimension-value [input] #:http.request.field{:value input, :shape "MetricDimensionValue"})

(clojure.core/defn- ser-xml-string-max-len-256 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen256"})

(clojure.core/defn- ser-cooldown [input] #:http.request.field{:value input, :shape "Cooldown"})

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value input, :shape "MetricUnit"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-scheduled-action-buffer-time [input] #:http.request.field{:value input, :shape "ScheduledActionBufferTime"})

(clojure.core/defn- ser-tag-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilters", :type "list"})

(clojure.core/defn- ser-disable-dynamic-scaling [input] #:http.request.field{:value input, :shape "DisableDynamicScaling"})

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-metric-dimension-name [input] #:http.request.field{:value input, :shape "MetricDimensionName"})

(clojure.core/defn- ser-timestamp-type [input] #:http.request.field{:value input, :shape "TimestampType"})

(clojure.core/defn- ser-resource-label [input] #:http.request.field{:value input, :shape "ResourceLabel"})

(clojure.core/defn- ser-predefined-load-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-load-metric-type (:predefined-load-metric-type input)) #:http.request.field{:name "PredefinedLoadMetricType", :shape "LoadMetricType"})], :shape "PredefinedLoadMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-label (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "ResourceLabel"}))))

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "MetricDimensionName"}) (clojure.core/into (ser-metric-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "MetricDimensionValue"})], :shape "MetricDimension", :type "structure"}))

(clojure.core/defn- ser-target-tracking-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-scale (:target-value input)) #:http.request.field{:name "TargetValue", :shape "MetricScale"})], :shape "TargetTrackingConfiguration", :type "structure"} (clojure.core/contains? input :predefined-scaling-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-scaling-metric-specification (input :predefined-scaling-metric-specification)) #:http.request.field{:name "PredefinedScalingMetricSpecification", :shape "PredefinedScalingMetricSpecification"})) (clojure.core/contains? input :customized-scaling-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-scaling-metric-specification (input :customized-scaling-metric-specification)) #:http.request.field{:name "CustomizedScalingMetricSpecification", :shape "CustomizedScalingMetricSpecification"})) (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-scale-in (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "DisableScaleIn"})) (clojure.core/contains? input :scale-out-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-out-cooldown)) #:http.request.field{:name "ScaleOutCooldown", :shape "Cooldown"})) (clojure.core/contains? input :scale-in-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-in-cooldown)) #:http.request.field{:name "ScaleInCooldown", :shape "Cooldown"})) (clojure.core/contains? input :estimated-instance-warmup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :estimated-instance-warmup)) #:http.request.field{:name "EstimatedInstanceWarmup", :shape "Cooldown"}))))

(clojure.core/defn- ser-scaling-policy-update-behavior [input] #:http.request.field{:value (clojure.core/get {"KeepExternalPolicies" "KeepExternalPolicies", :keep-external-policies "KeepExternalPolicies", "ReplaceExternalPolicies" "ReplaceExternalPolicies", :replace-external-policies "ReplaceExternalPolicies"} input), :shape "ScalingPolicyUpdateBehavior"})

(clojure.core/defn- ser-target-tracking-configurations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-tracking-configuration coll) #:http.request.field{:shape "TargetTrackingConfiguration"}))) input), :shape "TargetTrackingConfigurations", :type "list"})

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagFilter", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string-max-len-128 (input :key)) #:http.request.field{:name "Key", :shape "XmlStringMaxLen128"})) (clojure.core/contains? input :values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-values (input :values)) #:http.request.field{:name "Values", :shape "TagValues"}))))

(clojure.core/defn- ser-metric-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "MetricStatistic"})

(clojure.core/defn- ser-application-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ApplicationSource", :type "structure"} (clojure.core/contains? input :cloud-formation-stack-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :cloud-formation-stack-arn)) #:http.request.field{:name "CloudFormationStackARN", :shape "XmlString"})) (clojure.core/contains? input :tag-filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filters (input :tag-filters)) #:http.request.field{:name "TagFilters", :shape "TagFilters"}))))

(clojure.core/defn- ser-disable-scale-in [input] #:http.request.field{:value input, :shape "DisableScaleIn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-scaling-plan-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scaling-plan-name coll) #:http.request.field{:shape "ScalingPlanName"}))) input), :shape "ScalingPlanNames", :type "list"})

(clojure.core/defn- ser-metric-scale [input] #:http.request.field{:value input, :shape "MetricScale"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-metric-dimensions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-dimension coll) #:http.request.field{:shape "MetricDimension"}))) input), :shape "MetricDimensions", :type "list"})

(clojure.core/defn- ser-metric-namespace [input] #:http.request.field{:value input, :shape "MetricNamespace"})

(clojure.core/defn- ser-customized-scaling-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:namespace input)) #:http.request.field{:name "Namespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-statistic (:statistic input)) #:http.request.field{:name "Statistic", :shape "MetricStatistic"})], :shape "CustomizedScalingMetricSpecification", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensions"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "Unit", :shape "MetricUnit"}))))

(clojure.core/defn- ser-application-sources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-source coll) #:http.request.field{:shape "ApplicationSource"}))) input), :shape "ApplicationSources", :type "list"})

(clojure.core/defn- ser-predictive-scaling-mode [input] #:http.request.field{:value (clojure.core/get {"ForecastAndScale" "ForecastAndScale", :forecast-and-scale "ForecastAndScale", "ForecastOnly" "ForecastOnly", :forecast-only "ForecastOnly"} input), :shape "PredictiveScalingMode"})

(clojure.core/defn- ser-scaling-metric-type [input] #:http.request.field{:value (clojure.core/get {:ec-2-spot-fleet-request-average-network-out "EC2SpotFleetRequestAverageNetworkOut", :asg-average-network-out "ASGAverageNetworkOut", "ASGAverageCPUUtilization" "ASGAverageCPUUtilization", "DynamoDBWriteCapacityUtilization" "DynamoDBWriteCapacityUtilization", "DynamoDBReadCapacityUtilization" "DynamoDBReadCapacityUtilization", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :dynamo-db-write-capacity-utilization "DynamoDBWriteCapacityUtilization", "EC2SpotFleetRequestAverageNetworkIn" "EC2SpotFleetRequestAverageNetworkIn", :rds-reader-average-cpu-utilization "RDSReaderAverageCPUUtilization", :alb-request-count-per-target "ALBRequestCountPerTarget", :dynamo-db-read-capacity-utilization "DynamoDBReadCapacityUtilization", "EC2SpotFleetRequestAverageNetworkOut" "EC2SpotFleetRequestAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", "RDSReaderAverageCPUUtilization" "RDSReaderAverageCPUUtilization", :ecs-service-average-memory-utilization "ECSServiceAverageMemoryUtilization", :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections", "RDSReaderAverageDatabaseConnections" "RDSReaderAverageDatabaseConnections", :ec-2-spot-fleet-request-average-network-in "EC2SpotFleetRequestAverageNetworkIn", "ECSServiceAverageMemoryUtilization" "ECSServiceAverageMemoryUtilization", :ecs-service-average-cpu-utilization "ECSServiceAverageCPUUtilization", :ec-2-spot-fleet-request-average-cpu-utilization "EC2SpotFleetRequestAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asg-average-network-in "ASGAverageNetworkIn", "EC2SpotFleetRequestAverageCPUUtilization" "EC2SpotFleetRequestAverageCPUUtilization", "ECSServiceAverageCPUUtilization" "ECSServiceAverageCPUUtilization", :asg-average-cpu-utilization "ASGAverageCPUUtilization"} input), :shape "ScalingMetricType"})

(clojure.core/defn- ser-scaling-instruction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-service-namespace (:service-namespace input)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (:resource-id input)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (:scalable-dimension input)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"}) (clojure.core/into (ser-resource-capacity (:min-capacity input)) #:http.request.field{:name "MinCapacity", :shape "ResourceCapacity"}) (clojure.core/into (ser-resource-capacity (:max-capacity input)) #:http.request.field{:name "MaxCapacity", :shape "ResourceCapacity"}) (clojure.core/into (ser-target-tracking-configurations (:target-tracking-configurations input)) #:http.request.field{:name "TargetTrackingConfigurations", :shape "TargetTrackingConfigurations"})], :shape "ScalingInstruction", :type "structure"} (clojure.core/contains? input :customized-load-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-load-metric-specification (input :customized-load-metric-specification)) #:http.request.field{:name "CustomizedLoadMetricSpecification", :shape "CustomizedLoadMetricSpecification"})) (clojure.core/contains? input :predictive-scaling-max-capacity-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predictive-scaling-max-capacity-behavior (input :predictive-scaling-max-capacity-behavior)) #:http.request.field{:name "PredictiveScalingMaxCapacityBehavior", :shape "PredictiveScalingMaxCapacityBehavior"})) (clojure.core/contains? input :scheduled-action-buffer-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scheduled-action-buffer-time (input :scheduled-action-buffer-time)) #:http.request.field{:name "ScheduledActionBufferTime", :shape "ScheduledActionBufferTime"})) (clojure.core/contains? input :predictive-scaling-max-capacity-buffer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-capacity (input :predictive-scaling-max-capacity-buffer)) #:http.request.field{:name "PredictiveScalingMaxCapacityBuffer", :shape "ResourceCapacity"})) (clojure.core/contains? input :disable-dynamic-scaling) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-dynamic-scaling (input :disable-dynamic-scaling)) #:http.request.field{:name "DisableDynamicScaling", :shape "DisableDynamicScaling"})) (clojure.core/contains? input :predefined-load-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-load-metric-specification (input :predefined-load-metric-specification)) #:http.request.field{:name "PredefinedLoadMetricSpecification", :shape "PredefinedLoadMetricSpecification"})) (clojure.core/contains? input :scaling-policy-update-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-policy-update-behavior (input :scaling-policy-update-behavior)) #:http.request.field{:name "ScalingPolicyUpdateBehavior", :shape "ScalingPolicyUpdateBehavior"})) (clojure.core/contains? input :predictive-scaling-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predictive-scaling-mode (input :predictive-scaling-mode)) #:http.request.field{:name "PredictiveScalingMode", :shape "PredictiveScalingMode"}))))

(clojure.core/defn- ser-forecast-data-type [input] #:http.request.field{:value (clojure.core/get {"CapacityForecast" "CapacityForecast", :capacity-forecast "CapacityForecast", "LoadForecast" "LoadForecast", :load-forecast "LoadForecast", "ScheduledActionMinCapacity" "ScheduledActionMinCapacity", :scheduled-action-min-capacity "ScheduledActionMinCapacity", "ScheduledActionMaxCapacity" "ScheduledActionMaxCapacity", :scheduled-action-max-capacity "ScheduledActionMaxCapacity"} input), :shape "ForecastDataType"})

(clojure.core/defn- ser-scaling-instructions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scaling-instruction coll) #:http.request.field{:shape "ScalingInstruction"}))) input), :shape "ScalingInstructions", :type "list"})

(clojure.core/defn- ser-service-namespace [input] #:http.request.field{:value (clojure.core/get {"dynamodb" "dynamodb", "ec2" "ec2", :autoscaling "autoscaling", :ecs "ecs", "ecs" "ecs", :rds "rds", :dynamodb "dynamodb", :ec-2 "ec2", "autoscaling" "autoscaling", "rds" "rds"} input), :shape "ServiceNamespace"})

(clojure.core/defn- req-delete-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]}))

(clojure.core/defn- req-update-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]} (clojure.core/contains? input :application-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-source (input :application-source)) #:http.request.field{:name "ApplicationSource", :shape "ApplicationSource"})) (clojure.core/contains? input :scaling-instructions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-instructions (input :scaling-instructions)) #:http.request.field{:name "ScalingInstructions", :shape "ScalingInstructions"}))))

(clojure.core/defn- req-describe-scaling-plan-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-scaling-plans-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :scaling-plan-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-plan-names (input :scaling-plan-names)) #:http.request.field{:name "ScalingPlanNames", :shape "ScalingPlanNames"})) (clojure.core/contains? input :scaling-plan-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})) (clojure.core/contains? input :application-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-sources (input :application-sources)) #:http.request.field{:name "ApplicationSources", :shape "ApplicationSources"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-get-scaling-plan-resource-forecast-data-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"}) (clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-xml-string (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "XmlString"}) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"}) (clojure.core/into (ser-forecast-data-type (input :forecast-data-type)) #:http.request.field{:name "ForecastDataType", :shape "ForecastDataType"}) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"}) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})]}))

(clojure.core/defn- req-create-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-application-source (input :application-source)) #:http.request.field{:name "ApplicationSource", :shape "ApplicationSource"}) (clojure.core/into (ser-scaling-instructions (input :scaling-instructions)) #:http.request.field{:name "ScalingInstructions", :shape "ScalingInstructions"})]}))

(clojure.core/declare deser-predefined-scaling-metric-specification)

(clojure.core/declare deser-tag-values)

(clojure.core/declare deser-customized-load-metric-specification)

(clojure.core/declare deser-xml-string-max-len-128)

(clojure.core/declare deser-scaling-plan-name)

(clojure.core/declare deser-scaling-status-code)

(clojure.core/declare deser-load-metric-type)

(clojure.core/declare deser-resource-id-max-len-1600)

(clojure.core/declare deser-resource-capacity)

(clojure.core/declare deser-predictive-scaling-max-capacity-behavior)

(clojure.core/declare deser-scalable-dimension)

(clojure.core/declare deser-policy-name)

(clojure.core/declare deser-scaling-plan-resources)

(clojure.core/declare deser-scaling-plan-version)

(clojure.core/declare deser-metric-dimension-value)

(clojure.core/declare deser-xml-string-max-len-256)

(clojure.core/declare deser-scaling-plan)

(clojure.core/declare deser-cooldown)

(clojure.core/declare deser-datapoint)

(clojure.core/declare deser-metric-unit)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-scheduled-action-buffer-time)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-tag-filters)

(clojure.core/declare deser-disable-dynamic-scaling)

(clojure.core/declare deser-xml-string)

(clojure.core/declare deser-metric-dimension-name)

(clojure.core/declare deser-timestamp-type)

(clojure.core/declare deser-resource-label)

(clojure.core/declare deser-scaling-plan-status-code)

(clojure.core/declare deser-predefined-load-metric-specification)

(clojure.core/declare deser-metric-dimension)

(clojure.core/declare deser-target-tracking-configuration)

(clojure.core/declare deser-scaling-policy-update-behavior)

(clojure.core/declare deser-target-tracking-configurations)

(clojure.core/declare deser-tag-filter)

(clojure.core/declare deser-metric-statistic)

(clojure.core/declare deser-application-source)

(clojure.core/declare deser-scaling-policy)

(clojure.core/declare deser-disable-scale-in)

(clojure.core/declare deser-metric-scale)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-metric-dimensions)

(clojure.core/declare deser-metric-namespace)

(clojure.core/declare deser-datapoints)

(clojure.core/declare deser-customized-scaling-metric-specification)

(clojure.core/declare deser-policy-type)

(clojure.core/declare deser-scaling-plan-resource)

(clojure.core/declare deser-scaling-plans)

(clojure.core/declare deser-predictive-scaling-mode)

(clojure.core/declare deser-scaling-metric-type)

(clojure.core/declare deser-scaling-instruction)

(clojure.core/declare deser-scaling-policies)

(clojure.core/declare deser-scaling-instructions)

(clojure.core/declare deser-service-namespace)

(clojure.core/defn- deser-predefined-scaling-metric-specification [input] (clojure.core/cond-> {:predefined-scaling-metric-type (deser-scaling-metric-type (input "PredefinedScalingMetricType"))} (clojure.core/contains? input "ResourceLabel") (clojure.core/assoc :resource-label (deser-resource-label (input "ResourceLabel")))))

(clojure.core/defn- deser-tag-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-xml-string-max-len-256 coll))) input))

(clojure.core/defn- deser-customized-load-metric-specification [input] (clojure.core/cond-> {:metric-name (deser-metric-name (input "MetricName")), :namespace (deser-metric-namespace (input "Namespace")), :statistic (deser-metric-statistic (input "Statistic"))} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-metric-dimensions (input "Dimensions"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-metric-unit (input "Unit")))))

(clojure.core/defn- deser-xml-string-max-len-128 [input] input)

(clojure.core/defn- deser-scaling-plan-name [input] input)

(clojure.core/defn- deser-scaling-status-code [input] (clojure.core/get {"Inactive" :inactive, "PartiallyActive" :partially-active, "Active" :active} input))

(clojure.core/defn- deser-load-metric-type [input] (clojure.core/get {"ASGTotalCPUUtilization" :asg-total-cpu-utilization, "ASGTotalNetworkIn" :asg-total-network-in, "ASGTotalNetworkOut" :asg-total-network-out, "ALBTargetGroupRequestCount" :alb-target-group-request-count} input))

(clojure.core/defn- deser-resource-id-max-len-1600 [input] input)

(clojure.core/defn- deser-resource-capacity [input] input)

(clojure.core/defn- deser-predictive-scaling-max-capacity-behavior [input] (clojure.core/get {"SetForecastCapacityToMaxCapacity" :set-forecast-capacity-to-max-capacity, "SetMaxCapacityToForecastCapacity" :set-max-capacity-to-forecast-capacity, "SetMaxCapacityAboveForecastCapacity" :set-max-capacity-above-forecast-capacity} input))

(clojure.core/defn- deser-scalable-dimension [input] (clojure.core/get {"autoscaling:autoScalingGroup:DesiredCapacity" :autoscalingauto-scaling-group-desired-capacity, "ecs:service:DesiredCount" :ecsservice-desired-count, "ec2:spot-fleet-request:TargetCapacity" :ec-2spotfleetrequest-target-capacity, "rds:cluster:ReadReplicaCount" :rdscluster-read-replica-count, "dynamodb:table:ReadCapacityUnits" :dynamodbtable-read-capacity-units, "dynamodb:table:WriteCapacityUnits" :dynamodbtable-write-capacity-units, "dynamodb:index:ReadCapacityUnits" :dynamodbindex-read-capacity-units, "dynamodb:index:WriteCapacityUnits" :dynamodbindex-write-capacity-units} input))

(clojure.core/defn- deser-policy-name [input] input)

(clojure.core/defn- deser-scaling-plan-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-plan-resource coll))) input))

(clojure.core/defn- deser-scaling-plan-version [input] input)

(clojure.core/defn- deser-metric-dimension-value [input] input)

(clojure.core/defn- deser-xml-string-max-len-256 [input] input)

(clojure.core/defn- deser-scaling-plan [input] (clojure.core/cond-> {:scaling-plan-name (deser-scaling-plan-name (input "ScalingPlanName")), :scaling-plan-version (deser-scaling-plan-version (input "ScalingPlanVersion")), :application-source (deser-application-source (input "ApplicationSource")), :scaling-instructions (deser-scaling-instructions (input "ScalingInstructions")), :status-code (deser-scaling-plan-status-code (input "StatusCode"))} (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-xml-string (input "StatusMessage"))) (clojure.core/contains? input "StatusStartTime") (clojure.core/assoc :status-start-time (deser-timestamp-type (input "StatusStartTime"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp-type (input "CreationTime")))))

(clojure.core/defn- deser-cooldown [input] input)

(clojure.core/defn- deser-datapoint [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp-type (input "Timestamp"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-metric-scale (input "Value")))))

(clojure.core/defn- deser-metric-unit [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-scheduled-action-buffer-time [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-tag-filters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag-filter coll))) input))

(clojure.core/defn- deser-disable-dynamic-scaling [input] input)

(clojure.core/defn- deser-xml-string [input] input)

(clojure.core/defn- deser-metric-dimension-name [input] input)

(clojure.core/defn- deser-timestamp-type [input] input)

(clojure.core/defn- deser-resource-label [input] input)

(clojure.core/defn- deser-scaling-plan-status-code [input] (clojure.core/get {"Active" :active, "ActiveWithProblems" :active-with-problems, "CreationInProgress" :creation-in-progress, "CreationFailed" :creation-failed, "DeletionInProgress" :deletion-in-progress, "DeletionFailed" :deletion-failed, "UpdateInProgress" :update-in-progress, "UpdateFailed" :update-failed} input))

(clojure.core/defn- deser-predefined-load-metric-specification [input] (clojure.core/cond-> {:predefined-load-metric-type (deser-load-metric-type (input "PredefinedLoadMetricType"))} (clojure.core/contains? input "ResourceLabel") (clojure.core/assoc :resource-label (deser-resource-label (input "ResourceLabel")))))

(clojure.core/defn- deser-metric-dimension [input] (clojure.core/cond-> {:name (deser-metric-dimension-name (input "Name")), :value (deser-metric-dimension-value (input "Value"))}))

(clojure.core/defn- deser-target-tracking-configuration [input] (clojure.core/cond-> {:target-value (deser-metric-scale (input "TargetValue"))} (clojure.core/contains? input "PredefinedScalingMetricSpecification") (clojure.core/assoc :predefined-scaling-metric-specification (deser-predefined-scaling-metric-specification (input "PredefinedScalingMetricSpecification"))) (clojure.core/contains? input "CustomizedScalingMetricSpecification") (clojure.core/assoc :customized-scaling-metric-specification (deser-customized-scaling-metric-specification (input "CustomizedScalingMetricSpecification"))) (clojure.core/contains? input "DisableScaleIn") (clojure.core/assoc :disable-scale-in (deser-disable-scale-in (input "DisableScaleIn"))) (clojure.core/contains? input "ScaleOutCooldown") (clojure.core/assoc :scale-out-cooldown (deser-cooldown (input "ScaleOutCooldown"))) (clojure.core/contains? input "ScaleInCooldown") (clojure.core/assoc :scale-in-cooldown (deser-cooldown (input "ScaleInCooldown"))) (clojure.core/contains? input "EstimatedInstanceWarmup") (clojure.core/assoc :estimated-instance-warmup (deser-cooldown (input "EstimatedInstanceWarmup")))))

(clojure.core/defn- deser-scaling-policy-update-behavior [input] (clojure.core/get {"KeepExternalPolicies" :keep-external-policies, "ReplaceExternalPolicies" :replace-external-policies} input))

(clojure.core/defn- deser-target-tracking-configurations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target-tracking-configuration coll))) input))

(clojure.core/defn- deser-tag-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-xml-string-max-len-128 (input "Key"))) (clojure.core/contains? input "Values") (clojure.core/assoc :values (deser-tag-values (input "Values")))))

(clojure.core/defn- deser-metric-statistic [input] (clojure.core/get {"Average" :average, "Minimum" :minimum, "Maximum" :maximum, "SampleCount" :sample-count, "Sum" :sum} input))

(clojure.core/defn- deser-application-source [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudFormationStackARN") (clojure.core/assoc :cloud-formation-stack-arn (deser-xml-string (input "CloudFormationStackARN"))) (clojure.core/contains? input "TagFilters") (clojure.core/assoc :tag-filters (deser-tag-filters (input "TagFilters")))))

(clojure.core/defn- deser-scaling-policy [input] (clojure.core/cond-> {:policy-name (deser-policy-name (input "PolicyName")), :policy-type (deser-policy-type (input "PolicyType"))} (clojure.core/contains? input "TargetTrackingConfiguration") (clojure.core/assoc :target-tracking-configuration (deser-target-tracking-configuration (input "TargetTrackingConfiguration")))))

(clojure.core/defn- deser-disable-scale-in [input] input)

(clojure.core/defn- deser-metric-scale [input] input)

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-metric-dimensions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-dimension coll))) input))

(clojure.core/defn- deser-metric-namespace [input] input)

(clojure.core/defn- deser-datapoints [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-datapoint coll))) input))

(clojure.core/defn- deser-customized-scaling-metric-specification [input] (clojure.core/cond-> {:metric-name (deser-metric-name (input "MetricName")), :namespace (deser-metric-namespace (input "Namespace")), :statistic (deser-metric-statistic (input "Statistic"))} (clojure.core/contains? input "Dimensions") (clojure.core/assoc :dimensions (deser-metric-dimensions (input "Dimensions"))) (clojure.core/contains? input "Unit") (clojure.core/assoc :unit (deser-metric-unit (input "Unit")))))

(clojure.core/defn- deser-policy-type [input] (clojure.core/get {"TargetTrackingScaling" :target-tracking-scaling} input))

(clojure.core/defn- deser-scaling-plan-resource [input] (clojure.core/cond-> {:scaling-plan-name (deser-scaling-plan-name (input "ScalingPlanName")), :scaling-plan-version (deser-scaling-plan-version (input "ScalingPlanVersion")), :service-namespace (deser-service-namespace (input "ServiceNamespace")), :resource-id (deser-resource-id-max-len-1600 (input "ResourceId")), :scalable-dimension (deser-scalable-dimension (input "ScalableDimension")), :scaling-status-code (deser-scaling-status-code (input "ScalingStatusCode"))} (clojure.core/contains? input "ScalingPolicies") (clojure.core/assoc :scaling-policies (deser-scaling-policies (input "ScalingPolicies"))) (clojure.core/contains? input "ScalingStatusMessage") (clojure.core/assoc :scaling-status-message (deser-xml-string (input "ScalingStatusMessage")))))

(clojure.core/defn- deser-scaling-plans [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-plan coll))) input))

(clojure.core/defn- deser-predictive-scaling-mode [input] (clojure.core/get {"ForecastAndScale" :forecast-and-scale, "ForecastOnly" :forecast-only} input))

(clojure.core/defn- deser-scaling-metric-type [input] (clojure.core/get {"ASGAverageCPUUtilization" :asg-average-cpu-utilization, "DynamoDBWriteCapacityUtilization" :dynamo-db-write-capacity-utilization, "DynamoDBReadCapacityUtilization" :dynamo-db-read-capacity-utilization, "ASGAverageNetworkOut" :asg-average-network-out, "EC2SpotFleetRequestAverageNetworkIn" :ec-2-spot-fleet-request-average-network-in, "EC2SpotFleetRequestAverageNetworkOut" :ec-2-spot-fleet-request-average-network-out, "ALBRequestCountPerTarget" :alb-request-count-per-target, "RDSReaderAverageCPUUtilization" :rds-reader-average-cpu-utilization, "RDSReaderAverageDatabaseConnections" :rds-reader-average-database-connections, "ECSServiceAverageMemoryUtilization" :ecs-service-average-memory-utilization, "ASGAverageNetworkIn" :asg-average-network-in, "EC2SpotFleetRequestAverageCPUUtilization" :ec-2-spot-fleet-request-average-cpu-utilization, "ECSServiceAverageCPUUtilization" :ecs-service-average-cpu-utilization} input))

(clojure.core/defn- deser-scaling-instruction [input] (clojure.core/cond-> {:service-namespace (deser-service-namespace (input "ServiceNamespace")), :resource-id (deser-resource-id-max-len-1600 (input "ResourceId")), :scalable-dimension (deser-scalable-dimension (input "ScalableDimension")), :min-capacity (deser-resource-capacity (input "MinCapacity")), :max-capacity (deser-resource-capacity (input "MaxCapacity")), :target-tracking-configurations (deser-target-tracking-configurations (input "TargetTrackingConfigurations"))} (clojure.core/contains? input "CustomizedLoadMetricSpecification") (clojure.core/assoc :customized-load-metric-specification (deser-customized-load-metric-specification (input "CustomizedLoadMetricSpecification"))) (clojure.core/contains? input "PredictiveScalingMaxCapacityBehavior") (clojure.core/assoc :predictive-scaling-max-capacity-behavior (deser-predictive-scaling-max-capacity-behavior (input "PredictiveScalingMaxCapacityBehavior"))) (clojure.core/contains? input "ScheduledActionBufferTime") (clojure.core/assoc :scheduled-action-buffer-time (deser-scheduled-action-buffer-time (input "ScheduledActionBufferTime"))) (clojure.core/contains? input "PredictiveScalingMaxCapacityBuffer") (clojure.core/assoc :predictive-scaling-max-capacity-buffer (deser-resource-capacity (input "PredictiveScalingMaxCapacityBuffer"))) (clojure.core/contains? input "DisableDynamicScaling") (clojure.core/assoc :disable-dynamic-scaling (deser-disable-dynamic-scaling (input "DisableDynamicScaling"))) (clojure.core/contains? input "PredefinedLoadMetricSpecification") (clojure.core/assoc :predefined-load-metric-specification (deser-predefined-load-metric-specification (input "PredefinedLoadMetricSpecification"))) (clojure.core/contains? input "ScalingPolicyUpdateBehavior") (clojure.core/assoc :scaling-policy-update-behavior (deser-scaling-policy-update-behavior (input "ScalingPolicyUpdateBehavior"))) (clojure.core/contains? input "PredictiveScalingMode") (clojure.core/assoc :predictive-scaling-mode (deser-predictive-scaling-mode (input "PredictiveScalingMode")))))

(clojure.core/defn- deser-scaling-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-policy coll))) input))

(clojure.core/defn- deser-scaling-instructions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-scaling-instruction coll))) input))

(clojure.core/defn- deser-service-namespace [input] (clojure.core/get {"autoscaling" :autoscaling, "ecs" :ecs, "ec2" :ec-2, "rds" :rds, "dynamodb" :dynamodb} input))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper134820 input] (clojure.core/let [rawinput134819 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134821 {"Message" (rawinput134819 "Message")}] (clojure.core/cond-> {} (letvar134821 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134821 ["Message"])))))))

(clojure.core/defn- response-delete-scaling-plan-response ([input] (response-delete-scaling-plan-response nil input)) ([resultWrapper134823 input] (clojure.core/let [rawinput134822 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134824 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-scaling-plans-response ([input] (response-describe-scaling-plans-response nil input)) ([resultWrapper134826 input] (clojure.core/let [rawinput134825 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134827 {"ScalingPlans" (rawinput134825 "ScalingPlans"), "NextToken" (rawinput134825 "NextToken")}] (clojure.core/cond-> {} (letvar134827 "ScalingPlans") (clojure.core/assoc :scaling-plans (deser-scaling-plans (clojure.core/get-in letvar134827 ["ScalingPlans"]))) (letvar134827 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar134827 ["NextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper134829 input] (clojure.core/let [rawinput134828 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134830 {"Message" (rawinput134828 "Message")}] (clojure.core/cond-> {} (letvar134830 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134830 ["Message"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper134832 input] (clojure.core/let [rawinput134831 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134833 {"Message" (rawinput134831 "Message")}] (clojure.core/cond-> {} (letvar134833 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134833 ["Message"])))))))

(clojure.core/defn- response-concurrent-update-exception ([input] (response-concurrent-update-exception nil input)) ([resultWrapper134835 input] (clojure.core/let [rawinput134834 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134836 {"Message" (rawinput134834 "Message")}] (clojure.core/cond-> {} (letvar134836 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134836 ["Message"])))))))

(clojure.core/defn- response-describe-scaling-plan-resources-response ([input] (response-describe-scaling-plan-resources-response nil input)) ([resultWrapper134838 input] (clojure.core/let [rawinput134837 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134839 {"ScalingPlanResources" (rawinput134837 "ScalingPlanResources"), "NextToken" (rawinput134837 "NextToken")}] (clojure.core/cond-> {} (letvar134839 "ScalingPlanResources") (clojure.core/assoc :scaling-plan-resources (deser-scaling-plan-resources (clojure.core/get-in letvar134839 ["ScalingPlanResources"]))) (letvar134839 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar134839 ["NextToken"])))))))

(clojure.core/defn- response-create-scaling-plan-response ([input] (response-create-scaling-plan-response nil input)) ([resultWrapper134841 input] (clojure.core/let [rawinput134840 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134842 {"ScalingPlanVersion" (rawinput134840 "ScalingPlanVersion")}] (clojure.core/cond-> {:scaling-plan-version (deser-scaling-plan-version (clojure.core/get-in letvar134842 ["ScalingPlanVersion"]))}))))

(clojure.core/defn- response-object-not-found-exception ([input] (response-object-not-found-exception nil input)) ([resultWrapper134844 input] (clojure.core/let [rawinput134843 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134845 {"Message" (rawinput134843 "Message")}] (clojure.core/cond-> {} (letvar134845 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134845 ["Message"])))))))

(clojure.core/defn- response-update-scaling-plan-response ([input] (response-update-scaling-plan-response nil input)) ([resultWrapper134847 input] (clojure.core/let [rawinput134846 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134848 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-service-exception ([input] (response-internal-service-exception nil input)) ([resultWrapper134850 input] (clojure.core/let [rawinput134849 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134851 {"Message" (rawinput134849 "Message")}] (clojure.core/cond-> {} (letvar134851 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar134851 ["Message"])))))))

(clojure.core/defn- response-get-scaling-plan-resource-forecast-data-response ([input] (response-get-scaling-plan-resource-forecast-data-response nil input)) ([resultWrapper134853 input] (clojure.core/let [rawinput134852 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar134854 {"Datapoints" (rawinput134852 "Datapoints")}] (clojure.core/cond-> {:datapoints (deser-datapoints (clojure.core/get-in letvar134854 ["Datapoints"]))}))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.predefined-scaling-metric-specification/predefined-scaling-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/scaling-metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/predefined-scaling-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.predefined-scaling-metric-specification/predefined-scaling-metric-type] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/resource-label]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/tag-values (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-unit))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/customized-load-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/metric-name :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/namespace :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/statistic] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/dimensions :portkey.aws.autoscaling-plans.-2018-01-06.customized-load-metric-specification/unit]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\p{Print}&&[^|:/]]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-status-code #{:inactive :partially-active "Active" "Inactive" "PartiallyActive" :active})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/load-metric-type #{:asg-total-network-in "ASGTotalCPUUtilization" "ASGTotalNetworkOut" "ASGTotalNetworkIn" :asg-total-network-out :asg-total-cpu-utilization :alb-target-group-request-count "ALBTargetGroupRequestCount"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.validation-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-id-max-len-1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1600)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/predictive-scaling-max-capacity-behavior #{:set-max-capacity-above-forecast-capacity :set-forecast-capacity-to-max-capacity :set-max-capacity-to-forecast-capacity "SetMaxCapacityAboveForecastCapacity" "SetMaxCapacityToForecastCapacity" "SetForecastCapacityToMaxCapacity"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension #{"dynamodb:table:WriteCapacityUnits" :ecsservice-desired-count :dynamodbindex-write-capacity-units "ec2:spot-fleet-request:TargetCapacity" :ec-2spotfleetrequest-target-capacity "dynamodb:table:ReadCapacityUnits" "ecs:service:DesiredCount" "dynamodb:index:WriteCapacityUnits" :rdscluster-read-replica-count :dynamodbtable-write-capacity-units :dynamodbtable-read-capacity-units "rds:cluster:ReadReplicaCount" "autoscaling:autoScalingGroup:DesiredCapacity" :autoscalingauto-scaling-group-desired-capacity :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\p{Print}+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resources (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resource))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plans :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/max-results :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-code (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-status-code))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-start-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/creation-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-code] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-message :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-start-time :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/creation-time]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.datapoint/timestamp (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.datapoint/value (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/datapoint (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.datapoint/timestamp :portkey.aws.autoscaling-plans.-2018-01-06.datapoint/value]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scheduled-action-buffer-time (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/tag-filters (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/tag-filter))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/disable-dynamic-scaling clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-names :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/application-sources :portkey.aws.autoscaling-plans.-2018-01-06/max-results :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.concurrent-update-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.concurrent-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resources :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1023))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-status-code #{:active-with-problems "Active" "UpdateFailed" :deletion-failed "DeletionFailed" "UpdateInProgress" :deletion-in-progress "DeletionInProgress" :update-failed :active :update-in-progress "CreationInProgress" "CreationFailed" :creation-in-progress :creation-failed "ActiveWithProblems"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.predefined-load-metric-specification/predefined-load-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/load-metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/predefined-load-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.predefined-load-metric-specification/predefined-load-metric-type] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/resource-label]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/name :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/target-value (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-out-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-in-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/estimated-instance-warmup (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/target-value] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/predefined-scaling-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/customized-scaling-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/disable-scale-in :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-out-cooldown :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-in-cooldown :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/estimated-instance-warmup]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policy-update-behavior #{"KeepExternalPolicies" :keep-external-policies "ReplaceExternalPolicies" :replace-external-policies})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configurations (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configuration))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.tag-filter/key (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-128))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.tag-filter/values (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/tag-values))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.tag-filter/key :portkey.aws.autoscaling-plans.-2018-01-06.tag-filter/values]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.application-source/cloud-formation-stack-arn (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/application-source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.application-source/cloud-formation-stack-arn :portkey.aws.autoscaling-plans.-2018-01-06/tag-filters]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/policy-name :portkey.aws.autoscaling-plans.-2018-01-06/policy-type] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configuration]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-response (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/disable-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-names (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-scale clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimensions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/datapoints (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/datapoint))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-unit))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/customized-scaling-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/metric-name :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/namespace :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/statistic] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/dimensions :portkey.aws.autoscaling-plans.-2018-01-06.customized-scaling-metric-specification/unit]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/object-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.object-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/application-sources (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/application-source))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/policy-type #{:target-tracking-scaling "TargetTrackingScaling"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan-resource/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan-resource/scaling-status-message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/service-namespace :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan-resource/resource-id :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension :portkey.aws.autoscaling-plans.-2018-01-06/scaling-status-code] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-policies :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan-resource/scaling-status-message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plans (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/start-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/end-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/service-namespace :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/resource-id :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension :portkey.aws.autoscaling-plans.-2018-01-06/forecast-data-type :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/start-time :portkey.aws.autoscaling-plans.-2018-01-06.get-scaling-plan-resource-forecast-data-request/end-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/predictive-scaling-mode #{"ForecastOnly" "ForecastAndScale" :forecast-and-scale :forecast-only})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-metric-type #{:ec-2-spot-fleet-request-average-network-out :asg-average-network-out "ASGAverageCPUUtilization" "DynamoDBWriteCapacityUtilization" "DynamoDBReadCapacityUtilization" "ASGAverageNetworkOut" :dynamo-db-write-capacity-utilization "EC2SpotFleetRequestAverageNetworkIn" :rds-reader-average-cpu-utilization :alb-request-count-per-target :dynamo-db-read-capacity-utilization "EC2SpotFleetRequestAverageNetworkOut" "ALBRequestCountPerTarget" "RDSReaderAverageCPUUtilization" :ecs-service-average-memory-utilization :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections" :ec-2-spot-fleet-request-average-network-in "ECSServiceAverageMemoryUtilization" :ecs-service-average-cpu-utilization :ec-2-spot-fleet-request-average-cpu-utilization "ASGAverageNetworkIn" :asg-average-network-in "EC2SpotFleetRequestAverageCPUUtilization" "ECSServiceAverageCPUUtilization" :asg-average-cpu-utilization})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/max-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/predictive-scaling-max-capacity-buffer (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/min-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instruction (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/service-namespace :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/resource-id :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/min-capacity :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/max-capacity :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configurations] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/customized-load-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/predictive-scaling-max-capacity-behavior :portkey.aws.autoscaling-plans.-2018-01-06/scheduled-action-buffer-time :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/predictive-scaling-max-capacity-buffer :portkey.aws.autoscaling-plans.-2018-01-06/disable-dynamic-scaling :portkey.aws.autoscaling-plans.-2018-01-06/predefined-load-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policy-update-behavior :portkey.aws.autoscaling-plans.-2018-01-06/predictive-scaling-mode]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/forecast-data-type #{:scheduled-action-min-capacity "ScheduledActionMinCapacity" :capacity-forecast "ScheduledActionMaxCapacity" "LoadForecast" "CapacityForecast" :scheduled-action-max-capacity :load-forecast})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-response (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/datapoints] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instruction))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/service-namespace #{"dynamodb" "ec2" :autoscaling :ecs "ecs" :rds :dynamodb :ec-2 "autoscaling" "rds"})

(clojure.core/defn create-scaling-plan "Creates a scaling plan." ([create-scaling-plan-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-scaling-plan-request create-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateScalingPlan", :http.request.configuration/output-deser-fn response-create-scaling-plan-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "LimitExceededException" :portkey.aws.autoscaling-plans.-2018-01-06/limit-exceeded-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-response))

(clojure.core/defn delete-scaling-plan "Deletes the specified scaling plan.\n Deleting a scaling plan deletes the underlying ScalingInstruction for all of\nthe scalable resources that are covered by the plan.\n If the plan has launched resources or has scaling activities in progress, you\nmust delete those resources separately." ([delete-scaling-plan-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-scaling-plan-request delete-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteScalingPlan", :http.request.configuration/output-deser-fn response-delete-scaling-plan-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "ObjectNotFoundException" :portkey.aws.autoscaling-plans.-2018-01-06/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response))

(clojure.core/defn describe-scaling-plan-resources "Describes the scalable resources in the specified scaling plan." ([describe-scaling-plan-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-scaling-plan-resources-request describe-scaling-plan-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeScalingPlanResources", :http.request.configuration/output-deser-fn response-describe-scaling-plan-resources-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "InvalidNextTokenException" :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-plan-resources :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response))

(clojure.core/defn describe-scaling-plans "Describes one or more of your scaling plans." ([] (describe-scaling-plans {})) ([describe-scaling-plans-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-scaling-plans-request describe-scaling-plans-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeScalingPlans", :http.request.configuration/output-deser-fn response-describe-scaling-plans-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "InvalidNextTokenException" :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-plans :args (clojure.spec.alpha/? :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response))

(clojure.core/defn get-scaling-plan-resource-forecast-data "Retrieves the forecast data for a scalable resource.\n Capacity forecasts are represented as predicted values, or data points, that\nare calculated using historical data points from a specified CloudWatch load\nmetric. Data points are available for up to 56 days." ([get-scaling-plan-resource-forecast-data-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-scaling-plan-resource-forecast-data-request get-scaling-plan-resource-forecast-data-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetScalingPlanResourceForecastData", :http.request.configuration/output-deser-fn response-get-scaling-plan-resource-forecast-data-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-scaling-plan-resource-forecast-data :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/get-scaling-plan-resource-forecast-data-response))

(clojure.core/defn update-scaling-plan "Updates the specified scaling plan.\n You cannot update a scaling plan if it is in the process of being created,\nupdated, or deleted." ([update-scaling-plan-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-scaling-plan-request update-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.configuration/target-prefix "AnyScaleScalingPlannerFrontendService", :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateScalingPlan", :http.request.configuration/output-deser-fn response-update-scaling-plan-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception, "ObjectNotFoundException" :portkey.aws.autoscaling-plans.-2018-01-06/object-not-found-exception}})))))
(clojure.spec.alpha/fdef update-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-response))
