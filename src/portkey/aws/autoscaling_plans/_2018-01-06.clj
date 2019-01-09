(ns portkey.aws.autoscaling-plans.-2018-01-06 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope
    {:service "autoscaling-plans", :region "eu-west-1"},
    :ssl-common-name "autoscaling.eu-west-1.amazonaws.com",
    :endpoint "https://autoscaling.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "autoscaling-plans", :region "us-east-2"},
    :ssl-common-name "autoscaling.us-east-2.amazonaws.com",
    :endpoint "https://autoscaling.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "autoscaling-plans", :region "ap-southeast-1"},
    :ssl-common-name "autoscaling.ap-southeast-1.amazonaws.com",
    :endpoint "https://autoscaling.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "autoscaling-plans", :region "us-west-2"},
    :ssl-common-name "autoscaling.us-west-2.amazonaws.com",
    :endpoint "https://autoscaling.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "autoscaling-plans", :region "us-east-1"},
    :ssl-common-name "autoscaling.us-east-1.amazonaws.com",
    :endpoint "https://autoscaling.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-predefined-scaling-metric-specification)

(clojure.core/declare ser-tag-values)

(clojure.core/declare ser-xml-string-max-len-128)

(clojure.core/declare ser-scaling-plan-name)

(clojure.core/declare ser-resource-id-max-len-1600)

(clojure.core/declare ser-resource-capacity)

(clojure.core/declare ser-scalable-dimension)

(clojure.core/declare ser-scaling-plan-version)

(clojure.core/declare ser-metric-dimension-value)

(clojure.core/declare ser-xml-string-max-len-256)

(clojure.core/declare ser-cooldown)

(clojure.core/declare ser-metric-unit)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-tag-filters)

(clojure.core/declare ser-xml-string)

(clojure.core/declare ser-metric-dimension-name)

(clojure.core/declare ser-resource-label)

(clojure.core/declare ser-metric-dimension)

(clojure.core/declare ser-target-tracking-configuration)

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

(clojure.core/declare ser-scaling-metric-type)

(clojure.core/declare ser-scaling-instruction)

(clojure.core/declare ser-scaling-instructions)

(clojure.core/declare ser-service-namespace)

(clojure.core/defn- ser-predefined-scaling-metric-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-scaling-metric-type (:predefined-scaling-metric-type input)) #:http.request.field{:name "PredefinedScalingMetricType", :shape "ScalingMetricType"})], :shape "PredefinedScalingMetricSpecification", :type "structure"} (clojure.core/contains? input :resource-label) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-label (input :resource-label)) #:http.request.field{:name "ResourceLabel", :shape "ResourceLabel"}))))

(clojure.core/defn- ser-tag-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-xml-string-max-len-256 coll) #:http.request.field{:shape "XmlStringMaxLen256"}))) input), :shape "TagValues", :type "list"})

(clojure.core/defn- ser-xml-string-max-len-128 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen128"})

(clojure.core/defn- ser-scaling-plan-name [input] #:http.request.field{:value input, :shape "ScalingPlanName"})

(clojure.core/defn- ser-resource-id-max-len-1600 [input] #:http.request.field{:value input, :shape "ResourceIdMaxLen1600"})

(clojure.core/defn- ser-resource-capacity [input] #:http.request.field{:value input, :shape "ResourceCapacity"})

(clojure.core/defn- ser-scalable-dimension [input] #:http.request.field{:value (clojure.core/get {"dynamodb:table:WriteCapacityUnits" "dynamodb:table:WriteCapacityUnits", :ecsservice-desired-count "ecs:service:DesiredCount", :dynamodbindex-write-capacity-units "dynamodb:index:WriteCapacityUnits", "ec2:spot-fleet-request:TargetCapacity" "ec2:spot-fleet-request:TargetCapacity", :ec-2spotfleetrequest-target-capacity "ec2:spot-fleet-request:TargetCapacity", "dynamodb:table:ReadCapacityUnits" "dynamodb:table:ReadCapacityUnits", "ecs:service:DesiredCount" "ecs:service:DesiredCount", "dynamodb:index:WriteCapacityUnits" "dynamodb:index:WriteCapacityUnits", :rdscluster-read-replica-count "rds:cluster:ReadReplicaCount", :dynamodbtable-write-capacity-units "dynamodb:table:WriteCapacityUnits", :dynamodbtable-read-capacity-units "dynamodb:table:ReadCapacityUnits", "rds:cluster:ReadReplicaCount" "rds:cluster:ReadReplicaCount", "autoscaling:autoScalingGroup:DesiredCapacity" "autoscaling:autoScalingGroup:DesiredCapacity", :autoscalingauto-scaling-group-desired-capacity "autoscaling:autoScalingGroup:DesiredCapacity", :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits", "dynamodb:index:ReadCapacityUnits" "dynamodb:index:ReadCapacityUnits"} input), :shape "ScalableDimension"})

(clojure.core/defn- ser-scaling-plan-version [input] #:http.request.field{:value input, :shape "ScalingPlanVersion"})

(clojure.core/defn- ser-metric-dimension-value [input] #:http.request.field{:value input, :shape "MetricDimensionValue"})

(clojure.core/defn- ser-xml-string-max-len-256 [input] #:http.request.field{:value input, :shape "XmlStringMaxLen256"})

(clojure.core/defn- ser-cooldown [input] #:http.request.field{:value input, :shape "Cooldown"})

(clojure.core/defn- ser-metric-unit [input] #:http.request.field{:value input, :shape "MetricUnit"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-tag-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilters", :type "list"})

(clojure.core/defn- ser-xml-string [input] #:http.request.field{:value input, :shape "XmlString"})

(clojure.core/defn- ser-metric-dimension-name [input] #:http.request.field{:value input, :shape "MetricDimensionName"})

(clojure.core/defn- ser-resource-label [input] #:http.request.field{:value input, :shape "ResourceLabel"})

(clojure.core/defn- ser-metric-dimension [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-dimension-name (:name input)) #:http.request.field{:name "Name", :shape "MetricDimensionName"}) (clojure.core/into (ser-metric-dimension-value (:value input)) #:http.request.field{:name "Value", :shape "MetricDimensionValue"})], :shape "MetricDimension", :type "structure"}))

(clojure.core/defn- ser-target-tracking-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-scale (:target-value input)) #:http.request.field{:name "TargetValue", :shape "MetricScale"})], :shape "TargetTrackingConfiguration", :type "structure"} (clojure.core/contains? input :predefined-scaling-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-predefined-scaling-metric-specification (input :predefined-scaling-metric-specification)) #:http.request.field{:name "PredefinedScalingMetricSpecification", :shape "PredefinedScalingMetricSpecification"})) (clojure.core/contains? input :customized-scaling-metric-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-customized-scaling-metric-specification (input :customized-scaling-metric-specification)) #:http.request.field{:name "CustomizedScalingMetricSpecification", :shape "CustomizedScalingMetricSpecification"})) (clojure.core/contains? input :disable-scale-in) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disable-scale-in (input :disable-scale-in)) #:http.request.field{:name "DisableScaleIn", :shape "DisableScaleIn"})) (clojure.core/contains? input :scale-out-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-out-cooldown)) #:http.request.field{:name "ScaleOutCooldown", :shape "Cooldown"})) (clojure.core/contains? input :scale-in-cooldown) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :scale-in-cooldown)) #:http.request.field{:name "ScaleInCooldown", :shape "Cooldown"})) (clojure.core/contains? input :estimated-instance-warmup) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cooldown (input :estimated-instance-warmup)) #:http.request.field{:name "EstimatedInstanceWarmup", :shape "Cooldown"}))))

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

(clojure.core/defn- ser-scaling-metric-type [input] #:http.request.field{:value (clojure.core/get {:ec-2-spot-fleet-request-average-network-out "EC2SpotFleetRequestAverageNetworkOut", :asg-average-network-out "ASGAverageNetworkOut", "ASGAverageCPUUtilization" "ASGAverageCPUUtilization", "DynamoDBWriteCapacityUtilization" "DynamoDBWriteCapacityUtilization", "DynamoDBReadCapacityUtilization" "DynamoDBReadCapacityUtilization", "ASGAverageNetworkOut" "ASGAverageNetworkOut", :dynamo-db-write-capacity-utilization "DynamoDBWriteCapacityUtilization", "EC2SpotFleetRequestAverageNetworkIn" "EC2SpotFleetRequestAverageNetworkIn", :rds-reader-average-cpu-utilization "RDSReaderAverageCPUUtilization", :alb-request-count-per-target "ALBRequestCountPerTarget", :dynamo-db-read-capacity-utilization "DynamoDBReadCapacityUtilization", "EC2SpotFleetRequestAverageNetworkOut" "EC2SpotFleetRequestAverageNetworkOut", "ALBRequestCountPerTarget" "ALBRequestCountPerTarget", "RDSReaderAverageCPUUtilization" "RDSReaderAverageCPUUtilization", :ecs-service-average-memory-utilization "ECSServiceAverageMemoryUtilization", :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections", "RDSReaderAverageDatabaseConnections" "RDSReaderAverageDatabaseConnections", :ec-2-spot-fleet-request-average-network-in "EC2SpotFleetRequestAverageNetworkIn", "ECSServiceAverageMemoryUtilization" "ECSServiceAverageMemoryUtilization", :ecs-service-average-cpu-utilization "ECSServiceAverageCPUUtilization", :ec-2-spot-fleet-request-average-cpu-utilization "EC2SpotFleetRequestAverageCPUUtilization", "ASGAverageNetworkIn" "ASGAverageNetworkIn", :asg-average-network-in "ASGAverageNetworkIn", "EC2SpotFleetRequestAverageCPUUtilization" "EC2SpotFleetRequestAverageCPUUtilization", "ECSServiceAverageCPUUtilization" "ECSServiceAverageCPUUtilization", :asg-average-cpu-utilization "ASGAverageCPUUtilization"} input), :shape "ScalingMetricType"})

(clojure.core/defn- ser-scaling-instruction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-service-namespace (:service-namespace input)) #:http.request.field{:name "ServiceNamespace", :shape "ServiceNamespace"}) (clojure.core/into (ser-resource-id-max-len-1600 (:resource-id input)) #:http.request.field{:name "ResourceId", :shape "ResourceIdMaxLen1600"}) (clojure.core/into (ser-scalable-dimension (:scalable-dimension input)) #:http.request.field{:name "ScalableDimension", :shape "ScalableDimension"}) (clojure.core/into (ser-resource-capacity (:min-capacity input)) #:http.request.field{:name "MinCapacity", :shape "ResourceCapacity"}) (clojure.core/into (ser-resource-capacity (:max-capacity input)) #:http.request.field{:name "MaxCapacity", :shape "ResourceCapacity"}) (clojure.core/into (ser-target-tracking-configurations (:target-tracking-configurations input)) #:http.request.field{:name "TargetTrackingConfigurations", :shape "TargetTrackingConfigurations"})], :shape "ScalingInstruction", :type "structure"}))

(clojure.core/defn- ser-scaling-instructions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-scaling-instruction coll) #:http.request.field{:shape "ScalingInstruction"}))) input), :shape "ScalingInstructions", :type "list"})

(clojure.core/defn- ser-service-namespace [input] #:http.request.field{:value (clojure.core/get {"dynamodb" "dynamodb", "ec2" "ec2", :autoscaling "autoscaling", :ecs "ecs", "ecs" "ecs", :rds "rds", :dynamodb "dynamodb", :ec-2 "ec2", "autoscaling" "autoscaling", "rds" "rds"} input), :shape "ServiceNamespace"})

(clojure.core/defn- req-delete-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]}))

(clojure.core/defn- req-update-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]} (clojure.core/contains? input :application-source) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-source (input :application-source)) #:http.request.field{:name "ApplicationSource", :shape "ApplicationSource"})) (clojure.core/contains? input :scaling-instructions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-instructions (input :scaling-instructions)) #:http.request.field{:name "ScalingInstructions", :shape "ScalingInstructions"}))))

(clojure.core/defn- req-describe-scaling-plan-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-describe-scaling-plans-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :scaling-plan-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-plan-names (input :scaling-plan-names)) #:http.request.field{:name "ScalingPlanNames", :shape "ScalingPlanNames"})) (clojure.core/contains? input :scaling-plan-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-scaling-plan-version (input :scaling-plan-version)) #:http.request.field{:name "ScalingPlanVersion", :shape "ScalingPlanVersion"})) (clojure.core/contains? input :application-sources) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-application-sources (input :application-sources)) #:http.request.field{:name "ApplicationSources", :shape "ApplicationSources"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- req-create-scaling-plan-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-scaling-plan-name (input :scaling-plan-name)) #:http.request.field{:name "ScalingPlanName", :shape "ScalingPlanName"}) (clojure.core/into (ser-application-source (input :application-source)) #:http.request.field{:name "ApplicationSource", :shape "ApplicationSource"}) (clojure.core/into (ser-scaling-instructions (input :scaling-instructions)) #:http.request.field{:name "ScalingInstructions", :shape "ScalingInstructions"})]}))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.predefined-scaling-metric-specification/predefined-scaling-metric-type (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/scaling-metric-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/predefined-scaling-metric-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.predefined-scaling-metric-specification/predefined-scaling-metric-type] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/resource-label]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/tag-values (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-256))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-128 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\p{Print}&&[^|:/]]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-status-code #{:inactive :partially-active "Active" "Inactive" "PartiallyActive" :active})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.validation-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-id-max-len-1600 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1600)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension #{"dynamodb:table:WriteCapacityUnits" :ecsservice-desired-count :dynamodbindex-write-capacity-units "ec2:spot-fleet-request:TargetCapacity" :ec-2spotfleetrequest-target-capacity "dynamodb:table:ReadCapacityUnits" "ecs:service:DesiredCount" "dynamodb:index:WriteCapacityUnits" :rdscluster-read-replica-count :dynamodbtable-write-capacity-units :dynamodbtable-read-capacity-units "rds:cluster:ReadReplicaCount" "autoscaling:autoScalingGroup:DesiredCapacity" :autoscalingauto-scaling-group-desired-capacity :dynamodbindex-read-capacity-units "dynamodb:index:ReadCapacityUnits"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/policy-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"\p{Print}+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resources (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resource))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plans :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string-max-len-256 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/max-results :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-code (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-status-code))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/xml-string))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-start-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/creation-time (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-code] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-message :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/status-start-time :portkey.aws.autoscaling-plans.-2018-01-06.scaling-plan/creation-time]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/cooldown clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-unit (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/tag-filters (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/tag-filter))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/xml-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-names :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-version :portkey.aws.autoscaling-plans.-2018-01-06/application-sources :portkey.aws.autoscaling-plans.-2018-01-06/max-results :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.concurrent-update-exception/message (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06.concurrent-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/timestamp-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-resources :portkey.aws.autoscaling-plans.-2018-01-06/next-token]))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/resource-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1023))))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-status-code #{:active-with-problems "Active" "UpdateFailed" :deletion-failed "DeletionFailed" "UpdateInProgress" :deletion-in-progress "DeletionInProgress" :update-failed :active :update-in-progress "CreationInProgress" "CreationFailed" :creation-in-progress :creation-failed "ActiveWithProblems"})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/name (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-name))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/value (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension-value))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/metric-dimension (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/name :portkey.aws.autoscaling-plans.-2018-01-06.metric-dimension/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/target-value (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/metric-scale))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-out-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-in-cooldown (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/estimated-instance-warmup (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/cooldown))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/target-value] :opt-un [:portkey.aws.autoscaling-plans.-2018-01-06/predefined-scaling-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/customized-scaling-metric-specification :portkey.aws.autoscaling-plans.-2018-01-06/disable-scale-in :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-out-cooldown :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/scale-in-cooldown :portkey.aws.autoscaling-plans.-2018-01-06.target-tracking-configuration/estimated-instance-warmup]))

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

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-metric-type #{:ec-2-spot-fleet-request-average-network-out :asg-average-network-out "ASGAverageCPUUtilization" "DynamoDBWriteCapacityUtilization" "DynamoDBReadCapacityUtilization" "ASGAverageNetworkOut" :dynamo-db-write-capacity-utilization "EC2SpotFleetRequestAverageNetworkIn" :rds-reader-average-cpu-utilization :alb-request-count-per-target :dynamo-db-read-capacity-utilization "EC2SpotFleetRequestAverageNetworkOut" "ALBRequestCountPerTarget" "RDSReaderAverageCPUUtilization" :ecs-service-average-memory-utilization :rds-reader-average-database-connections "RDSReaderAverageDatabaseConnections" :ec-2-spot-fleet-request-average-network-in "ECSServiceAverageMemoryUtilization" :ecs-service-average-cpu-utilization :ec-2-spot-fleet-request-average-cpu-utilization "ASGAverageNetworkIn" :asg-average-network-in "EC2SpotFleetRequestAverageCPUUtilization" "ECSServiceAverageCPUUtilization" :asg-average-cpu-utilization})

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/resource-id (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-id-max-len-1600))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/min-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/max-capacity (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/resource-capacity))
(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instruction (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/service-namespace :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/resource-id :portkey.aws.autoscaling-plans.-2018-01-06/scalable-dimension :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/min-capacity :portkey.aws.autoscaling-plans.-2018-01-06.scaling-instruction/max-capacity :portkey.aws.autoscaling-plans.-2018-01-06/target-tracking-configurations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request (clojure.spec.alpha/keys :req-un [:portkey.aws.autoscaling-plans.-2018-01-06/scaling-plan-name :portkey.aws.autoscaling-plans.-2018-01-06/application-source :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policies (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-policy))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instructions (clojure.spec.alpha/coll-of :portkey.aws.autoscaling-plans.-2018-01-06/scaling-instruction))

(clojure.spec.alpha/def :portkey.aws.autoscaling-plans.-2018-01-06/service-namespace #{"dynamodb" "ec2" :autoscaling :ecs "ecs" :rds :dynamodb :ec-2 "autoscaling" "rds"})

(clojure.core/defn create-scaling-plan ([create-scaling-plan-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-scaling-plan-request create-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateScalingPlan", :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "LimitExceededException" :portkey.aws.autoscaling-plans.-2018-01-06/limit-exceeded-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/create-scaling-plan-response))

(clojure.core/defn delete-scaling-plan ([delete-scaling-plan-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-scaling-plan-request delete-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteScalingPlan", :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "ObjectNotFoundException" :portkey.aws.autoscaling-plans.-2018-01-06/object-not-found-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/delete-scaling-plan-response))

(clojure.core/defn describe-scaling-plan-resources ([describe-scaling-plan-resources-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-scaling-plan-resources-request describe-scaling-plan-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingPlanResources", :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "InvalidNextTokenException" :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-plan-resources :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plan-resources-response))

(clojure.core/defn describe-scaling-plans ([] (describe-scaling-plans {})) ([describe-scaling-plans-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-scaling-plans-request describe-scaling-plans-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeScalingPlans", :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "InvalidNextTokenException" :portkey.aws.autoscaling-plans.-2018-01-06/invalid-next-token-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception}})))))
(clojure.spec.alpha/fdef describe-scaling-plans :args (clojure.spec.alpha/? :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/describe-scaling-plans-response))

(clojure.core/defn update-scaling-plan ([update-scaling-plan-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-scaling-plan-request update-scaling-plan-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.autoscaling-plans.-2018-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-01-06", :http.request.configuration/service-id "Auto Scaling Plans", :http.request.spec/input-spec :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateScalingPlan", :http.request.spec/error-spec {"ValidationException" :portkey.aws.autoscaling-plans.-2018-01-06/validation-exception, "ConcurrentUpdateException" :portkey.aws.autoscaling-plans.-2018-01-06/concurrent-update-exception, "InternalServiceException" :portkey.aws.autoscaling-plans.-2018-01-06/internal-service-exception, "ObjectNotFoundException" :portkey.aws.autoscaling-plans.-2018-01-06/object-not-found-exception}})))))
(clojure.spec.alpha/fdef update-scaling-plan :args (clojure.spec.alpha/tuple :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.autoscaling-plans.-2018-01-06/update-scaling-plan-response))
