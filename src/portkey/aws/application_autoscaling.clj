(ns portkey.aws.application-autoscaling (:require [portkey.aws]))

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

(clojure.core/declare ser-predefined-metric-specification)

(clojure.core/declare ser-resource-id-max-len-1600)

(clojure.core/declare ser-resource-capacity)

(clojure.core/declare ser-min-adjustment-magnitude)

(clojure.core/declare ser-scalable-dimension)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-scaling-adjustment)

(clojure.core/declare ser-metric-dimension-value)

(clojure.core/declare ser-scheduled-action-name)

(clojure.core/declare ser-cooldown)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-step-adjustments)

(clojure.core/declare ser-target-tracking-scaling-policy-configuration)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-metric-dimension-name)

(clojure.core/declare ser-timestamp-type)

(clojure.core/declare ser-resource-label)

(clojure.core/declare ser-adjustment-type)

(clojure.core/declare ser-scalable-target-action)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-resource-ids-max-len-1600)

(clojure.core/declare ser-metric-aggregation-type)

(clojure.core/declare ser-step-adjustment)

(clojure.core/declare ser-metric-statistic)

(clojure.core/declare ser-disable-scale-in)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-metric-scale)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-metric-dimensions)

(clojure.core/declare ser-metric-namespace)

(clojure.core/declare ser-metric-type)

(clojure.core/declare ser-policy-type)

(clojure.core/declare ser-step-scaling-policy-configuration)

(clojure.core/declare ser-service-namespace)

(clojure.core/declare ser-customized-metric-specification)

(clojure.core/defn- ser-predefined-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-type (:predefined-metric-type input)) #:http.request.field{:name "PredefinedMetricType", :shape "MetricType"})], :shape "PredefinedMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-label (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "ResourceLabel"}))))

(clojure.core/defn- ser-resource-id-max-len-1600 [input] #:http.request.field{:value input, :shape "ResourceIdMaxLen1600"})

(clojure.core/defn- ser-resource-capacity [input] #:http.request.field{:value input, :shape "ResourceCapacity"})

(clojure.core/defn- ser-min-adjustment-magnitude [input] #:http.request.field{:value input, :shape "MinAdjustmentMagnitude"})

(clojure.core/defn- ser-scalable-dimension [input] #:http.request.field{:value (clojure.core/get {"appstream:fleet:DesiredCapacity" "appstream:fleet:DesiredCapacity", "dynamodb:table:WriteCapacityUnits" "dynamodb:table:WriteCapacityUnits", :ecsservice-desired-count "ecs:service:DesiredCount", :appstreamfleet-desired-capacity "appstream:fleet:DesiredCapacity", :customresource-resource-type-property "custom-resource:ResourceType:Property", "custom-resource:ResourceType:Property" "custom-resource:ResourceType:Property", :dynamodbindex-write-capacity-units "dynamodb:index:WriteCapacityUnits", "ec2:spot-fleet-request:TargetCapacity" "ec2:spot-fleet-request:TargetCapacity", :ec-2spotfleetrequest-target-capacity "ec2:spot-fleet-request:TargetCapacity", "dynamodb:table:ReadCapacityUnits" "dynamodb:table:ReadCapacityUnits", "ecs:service:DesiredCount" "ecs:service:DesiredCount", "dynamodb:index:WriteCapacityUnits" "dynamodb:index:WriteCapacityUnits", "elasticmapreduce:instancegroup:InstanceCount" "elasticmapreduce:instancegroup:InstanceCount", :rdscluster-read-replica-count "rds:cluster:ReadReplicaCount", :dynamodbtable-write-capacity-units "dynamodb:table:WriteCapacityUnits", :dynamodbtable-read-capacity-units "dynamodb:table:ReadCapacityUnits", "rds:cluster:ReadReplicaCount" "rds:cluster:ReadReplicaCount", :elasticmapreduceinstancegroup-instance-count "elasticmapreduce:instancegroup:InstanceCount", :sagemakervariant-desired-instance-count "sagemaker:variant:DesiredInstanceCount", "sagemaker:variant:DesiredInstanceCount" "sagemaker:variant:DesiredInstanceCount", :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits", "dynamodb:index:ReadCapacityUnits" "dynamodb:index:ReadCapacityUnits"} input), :shape "ScalableDimension"})

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-scaling-adjustment [input] #:http.request.field{:value input, :shape "ScalingAdjustment"})

(clojure.core/defn- ser-metric-dimension-value [input] #:http.request.field{:value input, :shape "MetricDimensionValue"})

(clojure.core/defn- ser-scheduled-action-name [input] #:http.request.field{:value input, :shape "ScheduledActionName"})

(clojure.core/defn- ser-cooldown [input] #:http.request.field{:value input, :shape "Cooldown"})

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value input, :shape "MetricUnit"})

(clojure.core/defn- ser-step-adjustments [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-step-adjustment coll) #:http.request.field{:shape "StepAdjustment"}))) input), :shape "StepAdjustments", :type "list"})

(clojure.core/defn- ser-target-tracking-scaling-policy-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-scale (:target-value input)) #:http.request.field{:name "TargetValue", :shape "MetricScale"})], :shape "TargetTrackingScalingPolicyConfiguration", :type "structure"} (clojure.core/contains? input :predefined-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-metric-specification (input :predefined-metric-specification)) #:http.request.field{:name "PredefinedMetricSpecification", :shape "PredefinedMetricSpecification"})) (clojure.core/contains? input :customized-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-metric-specification (input :customized-metric-specification)) #:http.request.field{:name "CustomizedMetricSpecification", :shape "CustomizedMetricSpecification"})) (clojure.core/contains? input :scale-out-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-out-cooldown)) #:http.request.field{:name "ScaleOutCooldown", :shape "Cooldown"})) (clojure.core/contains? input :scale-in-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-in-cooldown)) #:http.request.field{:name "ScaleInCooldown", :shape "Cooldown"})) (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-scale-in (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "DisableScaleIn"}))))

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-metric-dimension-name [input] #:http.request.field{:value input, :shape "MetricDimensionName"})

(clojure.core/defn- ser-timestamp-type [input] #:http.request.field{:value input, :shape "TimestampType"})

(clojure.core/defn- ser-resource-label [input] #:http.request.field{:value input, :shape "ResourceLabel"})

(clojure.core/defn- ser-adjustment-type [input] #:http.request.field{:value (clojure.core/get {"ChangeInCapacity" "ChangeInCapacity", :change-in-capacity "ChangeInCapacity", "PercentChangeInCapacity" "PercentChangeInCapacity", :percent-change-in-capacity "PercentChangeInCapacity", "ExactCapacity" "ExactCapacity", :exact-capacity "ExactCapacity"} input), :shape "AdjustmentType"})

(clojure.core/defn- ser-scalable-target-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ScalableTargetAction", :type "structure"} (clojure.core/contains? input :min-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-capacity (input :min-capacity)) #:http.request.field{:name "MinCapacity", :shape "ResourceCapacity"})) (clojure.core/contains? input :max-capacity) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-capacity (input :max-capacity)) #:http.request.field{:name "MaxCapacity", :shape "ResourceCapacity"}))))

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "MetricDimensionName"}) (clojure.core/into (ser-metric-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "MetricDimensionValue"})], :shape "MetricDimension", :type "structure"}))

(clojure.core/defn- ser-resource-ids-max-len-1600 [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-resource-id-max-len-1600 coll) #:http.request.field{:shape "ResourceIdMaxLen1600"}))) input), :shape "ResourceIdsMaxLen1600", :type "list"})

(clojure.core/defn- ser-metric-aggregation-type [input] #:http.request.field{:value (clojure.core/get {"Average" "Average", :average "Average", "Minimum" "Minimum", :minimum "Minimum", "Maximum" "Maximum", :maximum "Maximum"} input), :shape "MetricAggregationType"})

(clojure.core/defn- ser-step-adjustment [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scaling-adjustment (:scaling-adjustment input)) #:http.request.field{:name "ScalingAdjustment", :shape "ScalingAdjustment"})], :shape "StepAdjustment", :type "structure"} (clojure.core/contains? input :metric-interval-lower-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-lower-bound)) #:http.request.field{:name "MetricIntervalLowerBound", :shape "MetricScale"})) (clojure.core/contains? input :metric-interval-upper-bound) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-scale (input :metric-interval-upper-bound)) #:http.request.field{:name "MetricIntervalUpperBound", :shape "MetricScale"}))))

(clojure.core/defn- ser-metric-statistic [input] #:http.request.field{:value (clojure.core/get {"Sum" "Sum", "Average" "Average", :maximum "Maximum", "SampleCount" "SampleCount", "Minimum" "Minimum", :sample-count "SampleCount", :minimum "Minimum", :average "Average", :sum "Sum", "Maximum" "Maximum"} input), :shape "MetricStatistic"})

(clojure.core/defn- ser-disable-scale-in [input] #:http.request.field{:value input, :shape "DisableScaleIn"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-metric-scale [input] #:http.request.field{:value input, :shape "MetricScale"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-metric-dimensions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-dimension coll) #:http.request.field{:shape "MetricDimension"}))) input), :shape "MetricDimensions", :type "list"})

(clojure.core/defn- ser-metric-namespace [input] #:http.request.field{:value input, :shape "MetricNamespace"})

(clojure.core/defn- ser-metric-type [input] #:http.request.field{:value (clojure.core/get {:ec-2-spot-fleet-request-average-network-out "EC2SpotFleetRequestAverageNetworkOut", "DynamoDBWriteCapacityUtilization" "DynamoDBWriteCapacityUtilization", "DynamoDBReadCapacityUtilization" "DynamoDBReadCapacityUtilization", :dynamo-db-write-capacity-utilization "DynamoDBWriteCapacityUtilization", "EC2SpotFleetRequestAverageNetworkIn" "EC2SpotFleetRequestAverageNetworkIn", :rds-reader-average-cpu-utilization "RDSReaderAverageCPUUtilization", :sage-maker-variant-invocations-per-instance "SageMakerVariantInvocationsPerInstance", :alb-request-count-per-target "ALBRequestCountPerTarget", :dynamo-db-read-capacity-utilization "DynamoDBReadCapacityUtilization", "EC2SpotFleetRequestAverageNetworkOut" "EC2SpotFleetRequestAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", "RDSReaderAverageCPUUtilization" "RDSReaderAverageCPUUtilization", :ecs-service-average-memory-utilization "ECSServiceAverageMemoryUtilization", :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections", "RDSReaderAverageDatabaseConnections" "RDSReaderAverageDatabaseConnections", :ec-2-spot-fleet-request-average-network-in "EC2SpotFleetRequestAverageNetworkIn", "ECSServiceAverageMemoryUtilization" "ECSServiceAverageMemoryUtilization", :ecs-service-average-cpu-utilization "ECSServiceAverageCPUUtilization", "SageMakerVariantInvocationsPerInstance" "SageMakerVariantInvocationsPerInstance", :ec-2-spot-fleet-request-average-cpu-utilization "EC2SpotFleetRequestAverageCPUUtilization", "EC2SpotFleetRequestAverageCPUUtilization" "EC2SpotFleetRequestAverageCPUUtilization", "ECSServiceAverageCPUUtilization" "ECSServiceAverageCPUUtilization"} input), :shape "MetricType"})

(clojure.core/defn- ser-policy-type [input] #:http.request.field{:value (clojure.core/get {"StepScaling" "StepScaling", :step-scaling "StepScaling", "TargetTrackingScaling" "TargetTrackingScaling", :target-tracking-scaling "TargetTrackingScaling"} input), :shape "PolicyType"})

(clojure.core/defn- ser-step-scaling-policy-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StepScalingPolicyConfiguration", :type "structure"} (clojure.core/contains? input :adjustment-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-adjustment-type (input :adjustment-type)) #:http.request.field{:name "AdjustmentType", :shape "AdjustmentType"})) (clojure.core/contains? input :step-adjustments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-adjustments (input :step-adjustments)) #:http.request.field{:name "StepAdjustments", :shape "StepAdjustments"})) (clojure.core/contains? input :min-adjustment-magnitude) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-min-adjustment-magnitude (input :min-adjustment-magnitude)) #:http.request.field{:name "MinAdjustmentMagnitude", :shape "MinAdjustmentMagnitude"})) (clojure.core/contains? input :cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :cooldown)) #:http.request.field{:name "Cooldown", :shape "Cooldown"})) (clojure.core/contains? input :metric-aggregation-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-aggregation-type (input :metric-aggregation-type)) #:http.request.field{:name "MetricAggregationType", :shape "MetricAggregationType"}))))

(clojure.core/defn- ser-service-namespace [input] #:http.request.field{:value (clojure.core/get {:customresource "custom-resource", "dynamodb" "dynamodb", "ec2" "ec2", "appstream" "appstream", :elasticmapreduce "elasticmapreduce", "elasticmapreduce" "elasticmapreduce", :ecs "ecs", "ecs" "ecs", :rds "rds", "custom-resource" "custom-resource", :dynamodb "dynamodb", "sagemaker" "sagemaker", :ec-2 "ec2", :appstream "appstream", :sagemaker "sagemaker", "rds" "rds"} input), :shape "ServiceNamespace"})

(clojure.core/defn- ser-customized-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:namespace input)) #:http.request.field{:name "Namespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-statistic (:statistic input)) #:http.request.field{:name "Statistic", :shape "MetricStatistic"})], :shape "CustomizedMetricSpecification", :type "structure"} (clojure.core/contains? input :dimensions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-dimensions (input :dimensions)) #:http.request.field{:name "Dimensions", :shape "MetricDimensions"})) (clojure.core/contains? input :unit) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-unit (input :unit)) #:http.request.field{:name "Unit", :shape "MetricUnit"}))))

(clojure.core/defn- req-deregister-scalable-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})]}))

(clojure.core/defn- req-delete-scheduled-action-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"})]} (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"}))))

(clojure.core/defn- req-describe-scaling-activities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"})]} (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"})) (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-describe-scalable-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"})]} (clojure.core/contains? input :resource-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-ids-max-len-1600 (input :resource-ids)) #:http.request.field{:name "ResourceIds", :shape "ResourceIdsMaxLen1600"})) (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-describe-scaling-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"})]} (clojure.core/contains? input :policy-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-ids-max-len-1600 (input :policy-names)) #:http.request.field{:name "PolicyNames", :shape "ResourceIdsMaxLen1600"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"})) (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-register-scalable-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})]} (clojure.core/contains? input :min-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-capacity (input :min-capacity)) #:http.request.field{:name "MinCapacity", :shape "ResourceCapacity"})) (clojure.core/contains? input :max-capacity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-capacity (input :max-capacity)) #:http.request.field{:name "MaxCapacity", :shape "ResourceCapacity"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-max-len-1600 (input :role-arn)) #:http.request.field{:name "RoleARN", :shape "ResourceIdMaxLen1600"}))))

(clojure.core/defn- req-describe-scheduled-actions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"})]} (clojure.core/contains? input :scheduled-action-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-ids-max-len-1600 (input :scheduled-action-names)) #:http.request.field{:name "ScheduledActionNames", :shape "ResourceIdsMaxLen1600"})) (clojure.core/contains? input :resource-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"})) (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-xml-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "XmlString"}))))

(clojure.core/defn- req-delete-scaling-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-id-max-len-1600 (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})]}))

(clojure.core/defn- req-put-scheduled-action-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-scheduled-action-name (input :scheduled-action-name)) #:http.request.field{:name "ScheduledActionName", :shape "ScheduledActionName"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"})]} (clojure.core/contains? input :schedule) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-id-max-len-1600 (input :schedule)) #:http.request.field{:name "Schedule", :shape "ResourceIdMaxLen1600"})) (clojure.core/contains? input :scalable-dimension) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :start-time)) #:http.request.field{:name "StartTime", :shape "TimestampType"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp-type (input :end-time)) #:http.request.field{:name "EndTime", :shape "TimestampType"})) (clojure.core/contains? input :scalable-target-action) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scalable-target-action (input :scalable-target-action)) #:http.request.field{:name "ScalableTargetAction", :shape "ScalableTargetAction"}))))

(clojure.core/defn- req-put-scaling-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "PolicyName", :shape "PolicyName"}) (clojure.core/into (ser-service-namespace (input :service-namespace)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (input :resource-id)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (input :scalable-dimension)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"})]} (clojure.core/contains? input :policy-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-type (input :policy-type)) #:http.request.field{:name "PolicyType", :shape "PolicyType"})) (clojure.core/contains? input :step-scaling-policy-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-step-scaling-policy-configuration (input :step-scaling-policy-configuration)) #:http.request.field{:name "StepScalingPolicyConfiguration", :shape "StepScalingPolicyConfiguration"})) (clojure.core/contains? input :target-tracking-scaling-policy-configuration) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-tracking-scaling-policy-configuration (input :target-tracking-scaling-policy-configuration)) #:http.request.field{:name "TargetTrackingScalingPolicyConfiguration", :shape "TargetTrackingScalingPolicyConfiguration"}))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.predefined-metric-specification/predefined-metric-type (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/predefined-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.predefined-metric-specification/predefined-metric-type] :opt-un [:portkey.aws.application-autoscaling/resource-label]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.validation-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/resource-id-max-len-1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/resource-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.deregister-scalable-target-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/deregister-scalable-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.deregister-scalable-target-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/min-adjustment-magnitude clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scalable-dimension #{"appstream:fleet:DesiredCapacity" "dynamodb:table:WriteCapacityUnits" :ecsservice-desired-count :appstreamfleet-desired-capacity :customresource-resource-type-property "custom-resource:ResourceType:Property" :dynamodbindex-write-capacity-units "ec2:spot-fleet-request:TargetCapacity" :ec-2spotfleetrequest-target-capacity "dynamodb:table:ReadCapacityUnits" "ecs:service:DesiredCount" "dynamodb:index:WriteCapacityUnits" "elasticmapreduce:instancegroup:InstanceCount" :rdscluster-read-replica-count :dynamodbtable-write-capacity-units :dynamodbtable-read-capacity-units "rds:cluster:ReadReplicaCount" :elasticmapreduceinstancegroup-instance-count :sagemakervariant-desired-instance-count "sagemaker:variant:DesiredInstanceCount" :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.delete-scheduled-action-request/scheduled-action-name (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.delete-scheduled-action-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/delete-scheduled-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.delete-scheduled-action-request/scheduled-action-name :portkey.aws.application-autoscaling.delete-scheduled-action-request/resource-id] :opt-un [:portkey.aws.application-autoscaling/scalable-dimension]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\p{Print}+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/delete-scaling-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/put-scheduled-action-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-adjustment clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-activities-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-activities-request/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scaling-activities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace] :opt-un [:portkey.aws.application-autoscaling.describe-scaling-activities-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling/max-results :portkey.aws.application-autoscaling.describe-scaling-activities-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-policies-response/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scaling-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling/scaling-policies :portkey.aws.application-autoscaling.describe-scaling-policies-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scalable-targets-request/resource-ids (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-ids-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scalable-targets-request/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scalable-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace] :opt-un [:portkey.aws.application-autoscaling.describe-scalable-targets-request/resource-ids :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling/max-results :portkey.aws.application-autoscaling.describe-scalable-targets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scheduled-action-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(?!((^[ ]+.*)|(.*([\u0000-\u001f]|[\u007f-\u009f]|[:/|])+.*)|(.*[ ]+$))).+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-policies-request/policy-names (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-ids-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-policies-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-policies-request/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scaling-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace] :opt-un [:portkey.aws.application-autoscaling.describe-scaling-policies-request/policy-names :portkey.aws.application-autoscaling.describe-scaling-policies-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling/max-results :portkey.aws.application-autoscaling.describe-scaling-policies-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.failed-resource-access-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/failed-resource-access-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.failed-resource-access-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/register-scalable-target-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/step-adjustments (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/step-adjustment))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/resource-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/target-value (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/scale-out-cooldown (clojure.spec.alpha/and :portkey.aws.application-autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/scale-in-cooldown (clojure.spec.alpha/and :portkey.aws.application-autoscaling/cooldown))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/target-tracking-scaling-policy-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/target-value] :opt-un [:portkey.aws.application-autoscaling/predefined-metric-specification :portkey.aws.application-autoscaling/customized-metric-specification :portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/scale-out-cooldown :portkey.aws.application-autoscaling.target-tracking-scaling-policy-configuration/scale-in-cooldown :portkey.aws.application-autoscaling/disable-scale-in]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.register-scalable-target-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.register-scalable-target-request/min-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.register-scalable-target-request/max-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.register-scalable-target-request/role-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/register-scalable-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.register-scalable-target-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension] :opt-un [:portkey.aws.application-autoscaling.register-scalable-target-request/min-capacity :portkey.aws.application-autoscaling.register-scalable-target-request/max-capacity :portkey.aws.application-autoscaling.register-scalable-target-request/role-arn]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-activity-status-code #{"Unfulfilled" "Failed" :in-progress :pending :successful :overridden "Overridden" "InProgress" :unfulfilled "Successful" "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scheduled-actions-response/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scheduled-actions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling/scheduled-actions :portkey.aws.application-autoscaling.describe-scheduled-actions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scheduled-actions-request/scheduled-action-names (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-ids-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scheduled-actions-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scheduled-actions-request/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scheduled-actions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace] :opt-un [:portkey.aws.application-autoscaling.describe-scheduled-actions-request/scheduled-action-names :portkey.aws.application-autoscaling.describe-scheduled-actions-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling/max-results :portkey.aws.application-autoscaling.describe-scheduled-actions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.concurrent-update-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/concurrent-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.concurrent-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.delete-scaling-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.delete-scaling-policy-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/delete-scaling-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.delete-scaling-policy-request/policy-name :portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.delete-scaling-policy-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target/min-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target/max-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target/role-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target/creation-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scalable-target (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.scalable-target/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling.scalable-target/min-capacity :portkey.aws.application-autoscaling.scalable-target/max-capacity :portkey.aws.application-autoscaling.scalable-target/role-arn :portkey.aws.application-autoscaling.scalable-target/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/delete-scheduled-action-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/resource-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1023))))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scalable-targets (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/scalable-target))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/adjustment-type #{:exact-capacity "PercentChangeInCapacity" "ExactCapacity" :change-in-capacity "ChangeInCapacity" :percent-change-in-capacity})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/end-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/start-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/creation-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/schedule (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scheduled-action/scheduled-action-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scheduled-action (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/scheduled-action-name :portkey.aws.application-autoscaling.scheduled-action/scheduled-action-arn :portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.scheduled-action/schedule :portkey.aws.application-autoscaling.scheduled-action/resource-id :portkey.aws.application-autoscaling.scheduled-action/creation-time] :opt-un [:portkey.aws.application-autoscaling.scheduled-action/end-time :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling.scheduled-action/start-time :portkey.aws.application-autoscaling/scalable-target-action]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target-action/min-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scalable-target-action/max-capacity (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scalable-target-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.scalable-target-action/min-capacity :portkey.aws.application-autoscaling.scalable-target-action/max-capacity]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.metric-dimension/name :portkey.aws.application-autoscaling.metric-dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scheduled-actions (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/scheduled-action))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/resource-ids-max-len-1600 (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/resource-id-max-len-1600))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-aggregation-type #{"Average" :maximum "Minimum" :minimum :average "Maximum"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scaling-activities-response/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scaling-activities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling/scaling-activities :portkey.aws.application-autoscaling.describe-scaling-activities-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.step-adjustment/metric-interval-lower-bound (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.step-adjustment/metric-interval-upper-bound (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-scale))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/step-adjustment (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/scaling-adjustment] :opt-un [:portkey.aws.application-autoscaling.step-adjustment/metric-interval-lower-bound :portkey.aws.application-autoscaling.step-adjustment/metric-interval-upper-bound]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/alarms (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/alarm))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-statistic #{"Sum" "Average" :maximum "SampleCount" "Minimum" :sample-count :minimum :average :sum "Maximum"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-policy/policy-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-policy/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-policy/creation-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.scaling-policy/policy-arn :portkey.aws.application-autoscaling/policy-name :portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.scaling-policy/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling/policy-type :portkey.aws.application-autoscaling.scaling-policy/creation-time] :opt-un [:portkey.aws.application-autoscaling/target-tracking-scaling-policy-configuration :portkey.aws.application-autoscaling/alarms :portkey.aws.application-autoscaling/step-scaling-policy-configuration]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.describe-scalable-targets-response/next-token (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/describe-scalable-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling/scalable-targets :portkey.aws.application-autoscaling.describe-scalable-targets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-activities (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/scaling-activity))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/disable-scale-in clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/max-results clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.alarm/alarm-name (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.alarm/alarm-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/alarm (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.alarm/alarm-name :portkey.aws.application-autoscaling.alarm/alarm-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-scale clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-dimensions (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/metric-dimension))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-namespace (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.object-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/object-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.object-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scheduled-action-request/schedule (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scheduled-action-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scheduled-action-request/start-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scheduled-action-request/end-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/put-scheduled-action-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling/scheduled-action-name :portkey.aws.application-autoscaling.put-scheduled-action-request/resource-id] :opt-un [:portkey.aws.application-autoscaling.put-scheduled-action-request/schedule :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling.put-scheduled-action-request/start-time :portkey.aws.application-autoscaling.put-scheduled-action-request/end-time :portkey.aws.application-autoscaling/scalable-target-action]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/metric-type #{:ec-2-spot-fleet-request-average-network-out "DynamoDBWriteCapacityUtilization" "DynamoDBReadCapacityUtilization" :dynamo-db-write-capacity-utilization "EC2SpotFleetRequestAverageNetworkIn" :rds-reader-average-cpu-utilization :sage-maker-variant-invocations-per-instance :alb-request-count-per-target :dynamo-db-read-capacity-utilization "EC2SpotFleetRequestAverageNetworkOut" "ALBRequestCountPerTarget" "RDSReaderAverageCPUUtilization" :ecs-service-average-memory-utilization :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections" :ec-2-spot-fleet-request-average-network-in "ECSServiceAverageMemoryUtilization" :ecs-service-average-cpu-utilization "SageMakerVariantInvocationsPerInstance" :ec-2-spot-fleet-request-average-cpu-utilization "EC2SpotFleetRequestAverageCPUUtilization" "ECSServiceAverageCPUUtilization"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/policy-type #{"StepScaling" :target-tracking-scaling :step-scaling "TargetTrackingScaling"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scaling-policy-request/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/put-scaling-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/policy-name :portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.put-scaling-policy-request/resource-id :portkey.aws.application-autoscaling/scalable-dimension] :opt-un [:portkey.aws.application-autoscaling/policy-type :portkey.aws.application-autoscaling/step-scaling-policy-configuration :portkey.aws.application-autoscaling/target-tracking-scaling-policy-configuration]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/error-message))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/deregister-scalable-target-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/step-scaling-policy-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.application-autoscaling/adjustment-type :portkey.aws.application-autoscaling/step-adjustments :portkey.aws.application-autoscaling/min-adjustment-magnitude :portkey.aws.application-autoscaling/cooldown :portkey.aws.application-autoscaling/metric-aggregation-type]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.application-autoscaling/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.put-scaling-policy-response/policy-arn (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/put-scaling-policy-response (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.put-scaling-policy-response/policy-arn] :opt-un [:portkey.aws.application-autoscaling/alarms]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling/service-namespace #{:customresource "dynamodb" "ec2" "appstream" :elasticmapreduce "elasticmapreduce" :ecs "ecs" :rds "custom-resource" :dynamodb "sagemaker" :ec-2 :appstream :sagemaker "rds"})

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.customized-metric-specification/namespace (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.customized-metric-specification/dimensions (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-dimensions))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.customized-metric-specification/statistic (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-statistic))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.customized-metric-specification/unit (clojure.spec.alpha/and :portkey.aws.application-autoscaling/metric-unit))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/customized-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling/metric-name :portkey.aws.application-autoscaling.customized-metric-specification/namespace :portkey.aws.application-autoscaling.customized-metric-specification/statistic] :opt-un [:portkey.aws.application-autoscaling.customized-metric-specification/dimensions :portkey.aws.application-autoscaling.customized-metric-specification/unit]))

(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/end-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/cause (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/status-code (clojure.spec.alpha/and :portkey.aws.application-autoscaling/scaling-activity-status-code))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/details (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/start-time (clojure.spec.alpha/and :portkey.aws.application-autoscaling/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/status-message (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/resource-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/activity-id (clojure.spec.alpha/and :portkey.aws.application-autoscaling/resource-id))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling.scaling-activity/description (clojure.spec.alpha/and :portkey.aws.application-autoscaling/xml-string))
(clojure.spec.alpha/def :portkey.aws.application-autoscaling/scaling-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.application-autoscaling.scaling-activity/activity-id :portkey.aws.application-autoscaling/service-namespace :portkey.aws.application-autoscaling.scaling-activity/resource-id :portkey.aws.application-autoscaling/scalable-dimension :portkey.aws.application-autoscaling.scaling-activity/description :portkey.aws.application-autoscaling.scaling-activity/cause :portkey.aws.application-autoscaling.scaling-activity/start-time :portkey.aws.application-autoscaling.scaling-activity/status-code] :opt-un [:portkey.aws.application-autoscaling.scaling-activity/end-time :portkey.aws.application-autoscaling.scaling-activity/details :portkey.aws.application-autoscaling.scaling-activity/status-message]))

(clojure.core/defn describe-scaling-activities ([describe-scaling-activities-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-scaling-activities-request describe-scaling-activities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/describe-scaling-activities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/describe-scaling-activities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingActivities", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "InvalidNextTokenException" :portkey.aws.application-autoscaling/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-activities :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/describe-scaling-activities-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/describe-scaling-activities-response))

(clojure.core/defn put-scheduled-action ([put-scheduled-action-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-scheduled-action-request put-scheduled-action-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/put-scheduled-action-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/put-scheduled-action-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutScheduledAction", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "LimitExceededException" :portkey.aws.application-autoscaling/limit-exceeded-exception, "ObjectNotFoundException" :portkey.aws.application-autoscaling/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef put-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/put-scheduled-action-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/put-scheduled-action-response))

(clojure.core/defn describe-scaling-policies ([describe-scaling-policies-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-scaling-policies-request describe-scaling-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/describe-scaling-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/describe-scaling-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingPolicies", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "FailedResourceAccessException" :portkey.aws.application-autoscaling/failed-resource-access-exception, "InvalidNextTokenException" :portkey.aws.application-autoscaling/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-policies :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/describe-scaling-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/describe-scaling-policies-response))

(clojure.core/defn register-scalable-target ([register-scalable-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-register-scalable-target-request register-scalable-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/register-scalable-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/register-scalable-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RegisterScalableTarget", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "LimitExceededException" :portkey.aws.application-autoscaling/limit-exceeded-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef register-scalable-target :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/register-scalable-target-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/register-scalable-target-response))

(clojure.core/defn delete-scaling-policy ([delete-scaling-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-scaling-policy-request delete-scaling-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/delete-scaling-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/delete-scaling-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteScalingPolicy", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "ObjectNotFoundException" :portkey.aws.application-autoscaling/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/delete-scaling-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/delete-scaling-policy-response))

(clojure.core/defn describe-scheduled-actions ([describe-scheduled-actions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-scheduled-actions-request describe-scheduled-actions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/describe-scheduled-actions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/describe-scheduled-actions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScheduledActions", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "InvalidNextTokenException" :portkey.aws.application-autoscaling/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scheduled-actions :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/describe-scheduled-actions-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/describe-scheduled-actions-response))

(clojure.core/defn describe-scalable-targets ([describe-scalable-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-scalable-targets-request describe-scalable-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/describe-scalable-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/describe-scalable-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalableTargets", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "InvalidNextTokenException" :portkey.aws.application-autoscaling/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scalable-targets :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/describe-scalable-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/describe-scalable-targets-response))

(clojure.core/defn deregister-scalable-target ([deregister-scalable-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-deregister-scalable-target-request deregister-scalable-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/deregister-scalable-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/deregister-scalable-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeregisterScalableTarget", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "ObjectNotFoundException" :portkey.aws.application-autoscaling/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef deregister-scalable-target :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/deregister-scalable-target-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/deregister-scalable-target-response))

(clojure.core/defn delete-scheduled-action ([delete-scheduled-action-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-scheduled-action-request delete-scheduled-action-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/delete-scheduled-action-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/delete-scheduled-action-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteScheduledAction", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "ObjectNotFoundException" :portkey.aws.application-autoscaling/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-scheduled-action :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/delete-scheduled-action-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/delete-scheduled-action-response))

(clojure.core/defn put-scaling-policy ([put-scaling-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-scaling-policy-request put-scaling-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.application-autoscaling/endpoints, :http.request.configuration/target-prefix "AnyScaleFrontendService", :http.request.spec/output-spec :portkey.aws.application-autoscaling/put-scaling-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-02-06", :http.request.configuration/service-id "Application Auto Scaling", :http.request.spec/input-spec :portkey.aws.application-autoscaling/put-scaling-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutScalingPolicy", :http.request.spec/error-spec {"ValidationException" :portkey.aws.application-autoscaling/validation-exception, "LimitExceededException" :portkey.aws.application-autoscaling/limit-exceeded-exception, "ObjectNotFoundException" :portkey.aws.application-autoscaling/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.application-autoscaling/concurrent-update-exception, "FailedResourceAccessException" :portkey.aws.application-autoscaling/failed-resource-access-exception, "InternalServiceException" :portkey.aws.application-autoscaling/internal-service-exception}})))))
(clojure.spec.alpha/fdef put-scaling-policy :args (clojure.spec.alpha/tuple :portkey.aws.application-autoscaling/put-scaling-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.application-autoscaling/put-scaling-policy-response))
