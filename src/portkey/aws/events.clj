(ns portkey.aws.events (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "events", :region "ap-northeast-1"},
    :ssl-common-name "events.ap-northeast-1.amazonaws.com",
    :endpoint "https://events.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "events", :region "eu-west-1"},
    :ssl-common-name "events.eu-west-1.amazonaws.com",
    :endpoint "https://events.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "events", :region "us-east-2"},
    :ssl-common-name "events.us-east-2.amazonaws.com",
    :endpoint "https://events.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "events", :region "ap-southeast-2"},
    :ssl-common-name "events.ap-southeast-2.amazonaws.com",
    :endpoint "https://events.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "events", :region "cn-north-1"},
    :ssl-common-name "events.cn-north-1.amazonaws.com.cn",
    :endpoint "https://events.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "events", :region "sa-east-1"},
    :ssl-common-name "events.sa-east-1.amazonaws.com",
    :endpoint "https://events.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "events", :region "ap-southeast-1"},
    :ssl-common-name "events.ap-southeast-1.amazonaws.com",
    :endpoint "https://events.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "events", :region "cn-northwest-1"},
    :ssl-common-name "events.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://events.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "events", :region "ap-northeast-2"},
    :ssl-common-name "events.ap-northeast-2.amazonaws.com",
    :endpoint "https://events.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "events", :region "eu-west-3"},
    :ssl-common-name "events.eu-west-3.amazonaws.com",
    :endpoint "https://events.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "events", :region "ca-central-1"},
    :ssl-common-name "events.ca-central-1.amazonaws.com",
    :endpoint "https://events.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "events", :region "eu-central-1"},
    :ssl-common-name "events.eu-central-1.amazonaws.com",
    :endpoint "https://events.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "events", :region "eu-west-2"},
    :ssl-common-name "events.eu-west-2.amazonaws.com",
    :endpoint "https://events.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "events", :region "us-gov-west-1"},
    :ssl-common-name "events.us-gov-west-1.amazonaws.com",
    :endpoint "https://events.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "events", :region "us-west-2"},
    :ssl-common-name "events.us-west-2.amazonaws.com",
    :endpoint "https://events.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "events", :region "us-east-1"},
    :ssl-common-name "events.us-east-1.amazonaws.com",
    :endpoint "https://events.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "events", :region "us-west-1"},
    :ssl-common-name "events.us-west-1.amazonaws.com",
    :endpoint "https://events.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "events", :region "ap-south-1"},
    :ssl-common-name "events.ap-south-1.amazonaws.com",
    :endpoint "https://events.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-batch-array-properties)

(clojure.core/declare ser-rule-name)

(clojure.core/declare ser-target-id-list)

(clojure.core/declare ser-transformer-paths)

(clojure.core/declare ser-input-transformer)

(clojure.core/declare ser-target-input)

(clojure.core/declare ser-rule-state)

(clojure.core/declare ser-run-command-targets)

(clojure.core/declare ser-batch-parameters)

(clojure.core/declare ser-assign-public-ip)

(clojure.core/declare ser-event-resource)

(clojure.core/declare ser-kinesis-parameters)

(clojure.core/declare ser-put-events-request-entry-list)

(clojure.core/declare ser-aws-vpc-configuration)

(clojure.core/declare ser-rule-description)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-target-arn)

(clojure.core/declare ser-statement-id)

(clojure.core/declare ser-run-command-target)

(clojure.core/declare ser-batch-retry-strategy)

(clojure.core/declare ser-event-resource-list)

(clojure.core/declare ser-put-events-request-entry)

(clojure.core/declare ser-target-input-path)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-transformer-input)

(clojure.core/declare ser-limit-max-100)

(clojure.core/declare ser-input-transformer-path-key)

(clojure.core/declare ser-target-id)

(clojure.core/declare ser-run-command-target-key)

(clojure.core/declare ser-network-configuration)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-message-group-id)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-schedule-expression)

(clojure.core/declare ser-run-command-parameters)

(clojure.core/declare ser-event-time)

(clojure.core/declare ser-target-list)

(clojure.core/declare ser-launch-type)

(clojure.core/declare ser-limit-min-1)

(clojure.core/declare ser-target)

(clojure.core/declare ser-principal)

(clojure.core/declare ser-ecs-parameters)

(clojure.core/declare ser-event-pattern)

(clojure.core/declare ser-action)

(clojure.core/declare ser-run-command-target-value)

(clojure.core/declare ser-run-command-target-values)

(clojure.core/declare ser-target-partition-key-path)

(clojure.core/declare ser-sqs-parameters)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-batch-array-properties [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BatchArrayProperties", :type "structure"} (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :size)) #:http.request.field{:name "Size", :shape "Integer"}))))

(clojure.core/defn- ser-rule-name [input] #:http.request.field{:value input, :shape "RuleName"})

(clojure.core/defn- ser-target-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target-id coll) #:http.request.field{:shape "TargetId"}))) input), :shape "TargetIdList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-transformer-paths [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-input-transformer-path-key k) #:http.request.field{:map-info "key", :shape "InputTransformerPathKey"}) (clojure.core/into (ser-target-input-path v) #:http.request.field{:map-info "value", :shape "TargetInputPath"})])) input), :shape "TransformerPaths", :type "map", :max 10})

(clojure.core/defn- ser-input-transformer [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transformer-input (:input-template input)) #:http.request.field{:name "InputTemplate", :shape "TransformerInput"})], :shape "InputTransformer", :type "structure"} (clojure.core/contains? input :input-paths-map) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transformer-paths (input :input-paths-map)) #:http.request.field{:name "InputPathsMap", :shape "TransformerPaths"}))))

(clojure.core/defn- ser-target-input [input] #:http.request.field{:value input, :shape "TargetInput"})

(clojure.core/defn- ser-rule-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "RuleState"})

(clojure.core/defn- ser-run-command-targets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-run-command-target coll) #:http.request.field{:shape "RunCommandTarget"}))) input), :shape "RunCommandTargets", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-batch-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:job-definition input)) #:http.request.field{:name "JobDefinition", :shape "String"}) (clojure.core/into (ser-string (:job-name input)) #:http.request.field{:name "JobName", :shape "String"})], :shape "BatchParameters", :type "structure"} (clojure.core/contains? input :array-properties) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-array-properties (input :array-properties)) #:http.request.field{:name "ArrayProperties", :shape "BatchArrayProperties"})) (clojure.core/contains? input :retry-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-retry-strategy (input :retry-strategy)) #:http.request.field{:name "RetryStrategy", :shape "BatchRetryStrategy"}))))

(clojure.core/defn- ser-assign-public-ip [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"} input), :shape "AssignPublicIp"})

(clojure.core/defn- ser-event-resource [input] #:http.request.field{:value input, :shape "EventResource"})

(clojure.core/defn- ser-kinesis-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-partition-key-path (:partition-key-path input)) #:http.request.field{:name "PartitionKeyPath", :shape "TargetPartitionKeyPath"})], :shape "KinesisParameters", :type "structure"}))

(clojure.core/defn- ser-put-events-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-put-events-request-entry coll) #:http.request.field{:shape "PutEventsRequestEntry"}))) input), :shape "PutEventsRequestEntryList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-aws-vpc-configuration [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string-list (:subnets input)) #:http.request.field{:name "Subnets", :shape "StringList"})], :shape "AwsVpcConfiguration", :type "structure"} (clojure.core/contains? input :security-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :security-groups)) #:http.request.field{:name "SecurityGroups", :shape "StringList"})) (clojure.core/contains? input :assign-public-ip) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assign-public-ip (input :assign-public-ip)) #:http.request.field{:name "AssignPublicIp", :shape "AssignPublicIp"}))))

(clojure.core/defn- ser-rule-description [input] #:http.request.field{:value input, :shape "RuleDescription"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-target-arn [input] #:http.request.field{:value input, :shape "TargetArn"})

(clojure.core/defn- ser-statement-id [input] #:http.request.field{:value input, :shape "StatementId"})

(clojure.core/defn- ser-run-command-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-run-command-target-key (:key input)) #:http.request.field{:name "Key", :shape "RunCommandTargetKey"}) (clojure.core/into (ser-run-command-target-values (:values input)) #:http.request.field{:name "Values", :shape "RunCommandTargetValues"})], :shape "RunCommandTarget", :type "structure"}))

(clojure.core/defn- ser-batch-retry-strategy [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BatchRetryStrategy", :type "structure"} (clojure.core/contains? input :attempts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :attempts)) #:http.request.field{:name "Attempts", :shape "Integer"}))))

(clojure.core/defn- ser-event-resource-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-resource coll) #:http.request.field{:shape "EventResource"}))) input), :shape "EventResourceList", :type "list"})

(clojure.core/defn- ser-put-events-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PutEventsRequestEntry", :type "structure"} (clojure.core/contains? input :time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-time (input :time)) #:http.request.field{:name "Time", :shape "EventTime"})) (clojure.core/contains? input :source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source)) #:http.request.field{:name "Source", :shape "String"})) (clojure.core/contains? input :resources) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-resource-list (input :resources)) #:http.request.field{:name "Resources", :shape "EventResourceList"})) (clojure.core/contains? input :detail-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :detail-type)) #:http.request.field{:name "DetailType", :shape "String"})) (clojure.core/contains? input :detail) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :detail)) #:http.request.field{:name "Detail", :shape "String"}))))

(clojure.core/defn- ser-target-input-path [input] #:http.request.field{:value input, :shape "TargetInputPath"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-transformer-input [input] #:http.request.field{:value input, :shape "TransformerInput"})

(clojure.core/defn- ser-limit-max-100 [input] #:http.request.field{:value input, :shape "LimitMax100"})

(clojure.core/defn- ser-input-transformer-path-key [input] #:http.request.field{:value input, :shape "InputTransformerPathKey"})

(clojure.core/defn- ser-target-id [input] #:http.request.field{:value input, :shape "TargetId"})

(clojure.core/defn- ser-run-command-target-key [input] #:http.request.field{:value input, :shape "RunCommandTargetKey"})

(clojure.core/defn- ser-network-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NetworkConfiguration", :type "structure"} (clojure.core/contains? input :awsvpc-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-vpc-configuration (input :awsvpc-configuration)) #:http.request.field{:name "awsvpcConfiguration", :shape "AwsVpcConfiguration"}))))

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-message-group-id [input] #:http.request.field{:value input, :shape "MessageGroupId"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-schedule-expression [input] #:http.request.field{:value input, :shape "ScheduleExpression"})

(clojure.core/defn- ser-run-command-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-run-command-targets (:run-command-targets input)) #:http.request.field{:name "RunCommandTargets", :shape "RunCommandTargets"})], :shape "RunCommandParameters", :type "structure"}))

(clojure.core/defn- ser-event-time [input] #:http.request.field{:value input, :shape "EventTime"})

(clojure.core/defn- ser-target-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-target coll) #:http.request.field{:shape "Target"}))) input), :shape "TargetList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-launch-type [input] #:http.request.field{:value (clojure.core/get {"EC2" "EC2", :ec-2 "EC2", "FARGATE" "FARGATE", :fargate "FARGATE"} input), :shape "LaunchType"})

(clojure.core/defn- ser-limit-min-1 [input] #:http.request.field{:value input, :shape "LimitMin1"})

(clojure.core/defn- ser-target [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-target-id (:id input)) #:http.request.field{:name "Id", :shape "TargetId"}) (clojure.core/into (ser-target-arn (:arn input)) #:http.request.field{:name "Arn", :shape "TargetArn"})], :shape "Target", :type "structure"} (clojure.core/contains? input :input-transformer) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-transformer (input :input-transformer)) #:http.request.field{:name "InputTransformer", :shape "InputTransformer"})) (clojure.core/contains? input :input-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-input-path (input :input-path)) #:http.request.field{:name "InputPath", :shape "TargetInputPath"})) (clojure.core/contains? input :batch-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-parameters (input :batch-parameters)) #:http.request.field{:name "BatchParameters", :shape "BatchParameters"})) (clojure.core/contains? input :kinesis-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-parameters (input :kinesis-parameters)) #:http.request.field{:name "KinesisParameters", :shape "KinesisParameters"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})) (clojure.core/contains? input :input) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-input (input :input)) #:http.request.field{:name "Input", :shape "TargetInput"})) (clojure.core/contains? input :run-command-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-run-command-parameters (input :run-command-parameters)) #:http.request.field{:name "RunCommandParameters", :shape "RunCommandParameters"})) (clojure.core/contains? input :ecs-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ecs-parameters (input :ecs-parameters)) #:http.request.field{:name "EcsParameters", :shape "EcsParameters"})) (clojure.core/contains? input :sqs-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sqs-parameters (input :sqs-parameters)) #:http.request.field{:name "SqsParameters", :shape "SqsParameters"}))))

(clojure.core/defn- ser-principal [input] #:http.request.field{:value input, :shape "Principal"})

(clojure.core/defn- ser-ecs-parameters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:task-definition-arn input)) #:http.request.field{:name "TaskDefinitionArn", :shape "Arn"})], :shape "EcsParameters", :type "structure"} (clojure.core/contains? input :task-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-min-1 (input :task-count)) #:http.request.field{:name "TaskCount", :shape "LimitMin1"})) (clojure.core/contains? input :launch-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-launch-type (input :launch-type)) #:http.request.field{:name "LaunchType", :shape "LaunchType"})) (clojure.core/contains? input :network-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-network-configuration (input :network-configuration)) #:http.request.field{:name "NetworkConfiguration", :shape "NetworkConfiguration"})) (clojure.core/contains? input :platform-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :platform-version)) #:http.request.field{:name "PlatformVersion", :shape "String"})) (clojure.core/contains? input :group) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :group)) #:http.request.field{:name "Group", :shape "String"}))))

(clojure.core/defn- ser-event-pattern [input] #:http.request.field{:value input, :shape "EventPattern"})

(clojure.core/defn- ser-action [input] #:http.request.field{:value input, :shape "Action"})

(clojure.core/defn- ser-run-command-target-value [input] #:http.request.field{:value input, :shape "RunCommandTargetValue"})

(clojure.core/defn- ser-run-command-target-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-run-command-target-value coll) #:http.request.field{:shape "RunCommandTargetValue"}))) input), :shape "RunCommandTargetValues", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-target-partition-key-path [input] #:http.request.field{:value input, :shape "TargetPartitionKeyPath"})

(clojure.core/defn- ser-sqs-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SqsParameters", :type "structure"} (clojure.core/contains? input :message-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-group-id (input :message-group-id)) #:http.request.field{:name "MessageGroupId", :shape "MessageGroupId"}))))

(clojure.core/defn- req-put-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action (input :action)) #:http.request.field{:name "Action", :shape "Action"}) (clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "Principal", :shape "Principal"}) (clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"})]}))

(clojure.core/defn- req-describe-event-bus-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-remove-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"}) (clojure.core/into (ser-target-id-list (input :ids)) #:http.request.field{:name "Ids", :shape "TargetIdList"})]}))

(clojure.core/defn- req-describe-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/defn- req-list-targets-by-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-list-rule-names-by-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "TargetArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-test-event-pattern-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-event-pattern (input :event-pattern)) #:http.request.field{:name "EventPattern", :shape "EventPattern"}) (clojure.core/into (ser-string (input :event)) #:http.request.field{:name "Event", :shape "String"})]}))

(clojure.core/defn- req-enable-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/defn- req-put-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]} (clojure.core/contains? input :schedule-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :schedule-expression)) #:http.request.field{:name "ScheduleExpression", :shape "ScheduleExpression"})) (clojure.core/contains? input :event-pattern) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-pattern (input :event-pattern)) #:http.request.field{:name "EventPattern", :shape "EventPattern"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-state (input :state)) #:http.request.field{:name "State", :shape "RuleState"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-description (input :description)) #:http.request.field{:name "Description", :shape "RuleDescription"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}))))

(clojure.core/defn- req-delete-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/defn- req-put-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"}) (clojure.core/into (ser-target-list (input :targets)) #:http.request.field{:name "Targets", :shape "TargetList"})]}))

(clojure.core/defn- req-remove-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"})]}))

(clojure.core/defn- req-list-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-name (input :name-prefix)) #:http.request.field{:name "NamePrefix", :shape "RuleName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-put-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-put-events-request-entry-list (input :entries)) #:http.request.field{:name "Entries", :shape "PutEventsRequestEntryList"})]}))

(clojure.core/defn- req-disable-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.spec.alpha/def :portkey.aws.events/string-list (clojure.spec.alpha/coll-of :portkey.aws.events/string))

(clojure.spec.alpha/def :portkey.aws.events/rule-name-list (clojure.spec.alpha/coll-of :portkey.aws.events/rule-name))

(clojure.spec.alpha/def :portkey.aws.events/put-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events/action :portkey.aws.events/principal :portkey.aws.events/statement-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/describe-event-bus-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.list-rules-response/rules (clojure.spec.alpha/and :portkey.aws.events/rule-response-list))
(clojure.spec.alpha/def :portkey.aws.events/list-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.list-rules-response/rules :portkey.aws.events/next-token]))

(clojure.spec.alpha/def :portkey.aws.events.batch-array-properties/size (clojure.spec.alpha/and :portkey.aws.events/integer))
(clojure.spec.alpha/def :portkey.aws.events/batch-array-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.batch-array-properties/size]))

(clojure.spec.alpha/def :portkey.aws.events/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\.\-_A-Za-z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/target-id-list (clojure.spec.alpha/coll-of :portkey.aws.events/target-id :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.events/transformer-paths (clojure.spec.alpha/map-of :portkey.aws.events/input-transformer-path-key :portkey.aws.events/target-input-path))

(clojure.spec.alpha/def :portkey.aws.events.input-transformer/input-paths-map (clojure.spec.alpha/and :portkey.aws.events/transformer-paths))
(clojure.spec.alpha/def :portkey.aws.events.input-transformer/input-template (clojure.spec.alpha/and :portkey.aws.events/transformer-input))
(clojure.spec.alpha/def :portkey.aws.events/input-transformer (clojure.spec.alpha/keys :req-un [:portkey.aws.events.input-transformer/input-template] :opt-un [:portkey.aws.events.input-transformer/input-paths-map]))

(clojure.spec.alpha/def :portkey.aws.events/target-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.events/rule-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.events/run-command-targets (clojure.spec.alpha/coll-of :portkey.aws.events/run-command-target :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.events.batch-parameters/job-definition (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.batch-parameters/job-name (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.batch-parameters/array-properties (clojure.spec.alpha/and :portkey.aws.events/batch-array-properties))
(clojure.spec.alpha/def :portkey.aws.events.batch-parameters/retry-strategy (clojure.spec.alpha/and :portkey.aws.events/batch-retry-strategy))
(clojure.spec.alpha/def :portkey.aws.events/batch-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.batch-parameters/job-definition :portkey.aws.events.batch-parameters/job-name] :opt-un [:portkey.aws.events.batch-parameters/array-properties :portkey.aws.events.batch-parameters/retry-strategy]))

(clojure.spec.alpha/def :portkey.aws.events/assign-public-ip #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.events/event-resource (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.kinesis-parameters/partition-key-path (clojure.spec.alpha/and :portkey.aws.events/target-partition-key-path))
(clojure.spec.alpha/def :portkey.aws.events/kinesis-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.kinesis-parameters/partition-key-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/put-events-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events/put-events-request-entry :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.events.remove-targets-request/rule (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.remove-targets-request/ids (clojure.spec.alpha/and :portkey.aws.events/target-id-list))
(clojure.spec.alpha/def :portkey.aws.events/remove-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.remove-targets-request/rule :portkey.aws.events.remove-targets-request/ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.aws-vpc-configuration/subnets (clojure.spec.alpha/and :portkey.aws.events/string-list))
(clojure.spec.alpha/def :portkey.aws.events.aws-vpc-configuration/security-groups (clojure.spec.alpha/and :portkey.aws.events/string-list))
(clojure.spec.alpha/def :portkey.aws.events/aws-vpc-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.events.aws-vpc-configuration/subnets] :opt-un [:portkey.aws.events.aws-vpc-configuration/security-groups :portkey.aws.events/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.events/rule-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.events.describe-rule-request/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events/describe-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.describe-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/put-events-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events/event-id :portkey.aws.events/error-code :portkey.aws.events/error-message]))

(clojure.spec.alpha/def :portkey.aws.events/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events/target-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events/rule-response-list (clojure.spec.alpha/coll-of :portkey.aws.events/rule))

(clojure.spec.alpha/def :portkey.aws.events.put-targets-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events/integer))
(clojure.spec.alpha/def :portkey.aws.events.put-targets-response/failed-entries (clojure.spec.alpha/and :portkey.aws.events/put-targets-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events/put-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.put-targets-response/failed-entry-count :portkey.aws.events.put-targets-response/failed-entries]))

(clojure.spec.alpha/def :portkey.aws.events/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/rule-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.list-targets-by-rule-request/rule (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.list-targets-by-rule-request/limit (clojure.spec.alpha/and :portkey.aws.events/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events/list-targets-by-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.list-targets-by-rule-request/rule] :opt-un [:portkey.aws.events/next-token :portkey.aws.events.list-targets-by-rule-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.describe-event-bus-response/name (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.describe-event-bus-response/arn (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.describe-event-bus-response/policy (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events/describe-event-bus-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.describe-event-bus-response/name :portkey.aws.events.describe-event-bus-response/arn :portkey.aws.events.describe-event-bus-response/policy]))

(clojure.spec.alpha/def :portkey.aws.events.list-rule-names-by-target-request/limit (clojure.spec.alpha/and :portkey.aws.events/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events/list-rule-names-by-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events/target-arn] :opt-un [:portkey.aws.events/next-token :portkey.aws.events.list-rule-names-by-target-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.run-command-target/key (clojure.spec.alpha/and :portkey.aws.events/run-command-target-key))
(clojure.spec.alpha/def :portkey.aws.events.run-command-target/values (clojure.spec.alpha/and :portkey.aws.events/run-command-target-values))
(clojure.spec.alpha/def :portkey.aws.events/run-command-target (clojure.spec.alpha/keys :req-un [:portkey.aws.events.run-command-target/key :portkey.aws.events.run-command-target/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.test-event-pattern-request/event (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events/test-event-pattern-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events/event-pattern :portkey.aws.events.test-event-pattern-request/event] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.batch-retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.events/integer))
(clojure.spec.alpha/def :portkey.aws.events/batch-retry-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.batch-retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.events/event-resource-list (clojure.spec.alpha/coll-of :portkey.aws.events/event-resource))

(clojure.spec.alpha/def :portkey.aws.events.put-events-request-entry/time (clojure.spec.alpha/and :portkey.aws.events/event-time))
(clojure.spec.alpha/def :portkey.aws.events.put-events-request-entry/source (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.put-events-request-entry/resources (clojure.spec.alpha/and :portkey.aws.events/event-resource-list))
(clojure.spec.alpha/def :portkey.aws.events.put-events-request-entry/detail-type (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.put-events-request-entry/detail (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events/put-events-request-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.put-events-request-entry/time :portkey.aws.events.put-events-request-entry/source :portkey.aws.events.put-events-request-entry/resources :portkey.aws.events.put-events-request-entry/detail-type :portkey.aws.events.put-events-request-entry/detail]))

(clojure.spec.alpha/def :portkey.aws.events/target-input-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.events.enable-rule-request/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events/enable-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.enable-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.put-events-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events/integer))
(clojure.spec.alpha/def :portkey.aws.events.put-events-response/entries (clojure.spec.alpha/and :portkey.aws.events/put-events-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events/put-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.put-events-response/failed-entry-count :portkey.aws.events.put-events-response/entries]))

(clojure.spec.alpha/def :portkey.aws.events/transformer-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.events/put-targets-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events/put-targets-result-entry))

(clojure.spec.alpha/def :portkey.aws.events.put-rule-request/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.put-rule-request/state (clojure.spec.alpha/and :portkey.aws.events/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.put-rule-request/description (clojure.spec.alpha/and :portkey.aws.events/rule-description))
(clojure.spec.alpha/def :portkey.aws.events/put-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.put-rule-request/name] :opt-un [:portkey.aws.events/schedule-expression :portkey.aws.events/event-pattern :portkey.aws.events.put-rule-request/state :portkey.aws.events.put-rule-request/description :portkey.aws.events/role-arn]))

(clojure.spec.alpha/def :portkey.aws.events/limit-max-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.events/remove-targets-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events/remove-targets-result-entry))

(clojure.spec.alpha/def :portkey.aws.events.list-rule-names-by-target-response/rule-names (clojure.spec.alpha/and :portkey.aws.events/rule-name-list))
(clojure.spec.alpha/def :portkey.aws.events/list-rule-names-by-target-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.list-rule-names-by-target-response/rule-names :portkey.aws.events/next-token]))

(clojure.spec.alpha/def :portkey.aws.events/input-transformer-path-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[A-Za-z0-9\_\-]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\.\-_A-Za-z0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.delete-rule-request/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events/delete-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.delete-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/run-command-target-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^[\p{L}\p{Z}\p{N}_.:/=+\-@]*$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.network-configuration/awsvpc-configuration (clojure.spec.alpha/and :portkey.aws.events/aws-vpc-configuration))
(clojure.spec.alpha/def :portkey.aws.events/network-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.network-configuration/awsvpc-configuration]))

(clojure.spec.alpha/def :portkey.aws.events/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.put-targets-request/rule (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.put-targets-request/targets (clojure.spec.alpha/and :portkey.aws.events/target-list))
(clojure.spec.alpha/def :portkey.aws.events/put-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.put-targets-request/rule :portkey.aws.events.put-targets-request/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/invalid-event-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.events/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events/message-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.describe-rule-response/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.describe-rule-response/arn (clojure.spec.alpha/and :portkey.aws.events/rule-arn))
(clojure.spec.alpha/def :portkey.aws.events.describe-rule-response/state (clojure.spec.alpha/and :portkey.aws.events/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.describe-rule-response/description (clojure.spec.alpha/and :portkey.aws.events/rule-description))
(clojure.spec.alpha/def :portkey.aws.events/describe-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.describe-rule-response/name :portkey.aws.events.describe-rule-response/arn :portkey.aws.events/event-pattern :portkey.aws.events/schedule-expression :portkey.aws.events.describe-rule-response/state :portkey.aws.events.describe-rule-response/description :portkey.aws.events/role-arn]))

(clojure.spec.alpha/def :portkey.aws.events/remove-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events/statement-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.rule/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.rule/arn (clojure.spec.alpha/and :portkey.aws.events/rule-arn))
(clojure.spec.alpha/def :portkey.aws.events.rule/state (clojure.spec.alpha/and :portkey.aws.events/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.rule/description (clojure.spec.alpha/and :portkey.aws.events/rule-description))
(clojure.spec.alpha/def :portkey.aws.events/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.rule/name :portkey.aws.events.rule/arn :portkey.aws.events/event-pattern :portkey.aws.events.rule/state :portkey.aws.events.rule/description :portkey.aws.events/schedule-expression :portkey.aws.events/role-arn]))

(clojure.spec.alpha/def :portkey.aws.events.test-event-pattern-response/result (clojure.spec.alpha/and :portkey.aws.events/boolean))
(clojure.spec.alpha/def :portkey.aws.events/test-event-pattern-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.test-event-pattern-response/result]))

(clojure.spec.alpha/def :portkey.aws.events/put-events-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events/put-events-result-entry))

(clojure.spec.alpha/def :portkey.aws.events/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events/schedule-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events/run-command-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events/run-command-targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/event-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.events/policy-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.list-targets-by-rule-response/targets (clojure.spec.alpha/and :portkey.aws.events/target-list))
(clojure.spec.alpha/def :portkey.aws.events/list-targets-by-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.list-targets-by-rule-response/targets :portkey.aws.events/next-token]))

(clojure.spec.alpha/def :portkey.aws.events/target-list (clojure.spec.alpha/coll-of :portkey.aws.events/target :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.events/launch-type #{"EC2" "FARGATE" :fargate :ec-2})

(clojure.spec.alpha/def :portkey.aws.events/put-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.events/limit-min-1 (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.events.list-rules-request/name-prefix (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.list-rules-request/limit (clojure.spec.alpha/and :portkey.aws.events/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events/list-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.list-rules-request/name-prefix :portkey.aws.events/next-token :portkey.aws.events.list-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.put-events-request/entries (clojure.spec.alpha/and :portkey.aws.events/put-events-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.events/put-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.put-events-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/put-targets-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events/target-id :portkey.aws.events/error-code :portkey.aws.events/error-message]))

(clojure.spec.alpha/def :portkey.aws.events.target/input-path (clojure.spec.alpha/and :portkey.aws.events/target-input-path))
(clojure.spec.alpha/def :portkey.aws.events.target/input (clojure.spec.alpha/and :portkey.aws.events/target-input))
(clojure.spec.alpha/def :portkey.aws.events.target/arn (clojure.spec.alpha/and :portkey.aws.events/target-arn))
(clojure.spec.alpha/def :portkey.aws.events.target/id (clojure.spec.alpha/and :portkey.aws.events/target-id))
(clojure.spec.alpha/def :portkey.aws.events/target (clojure.spec.alpha/keys :req-un [:portkey.aws.events.target/id :portkey.aws.events.target/arn] :opt-un [:portkey.aws.events/input-transformer :portkey.aws.events.target/input-path :portkey.aws.events/batch-parameters :portkey.aws.events/kinesis-parameters :portkey.aws.events/role-arn :portkey.aws.events.target/input :portkey.aws.events/run-command-parameters :portkey.aws.events/ecs-parameters :portkey.aws.events/sqs-parameters]))

(clojure.spec.alpha/def :portkey.aws.events.remove-targets-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events/integer))
(clojure.spec.alpha/def :portkey.aws.events.remove-targets-response/failed-entries (clojure.spec.alpha/and :portkey.aws.events/remove-targets-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events/remove-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.remove-targets-response/failed-entry-count :portkey.aws.events.remove-targets-response/failed-entries]))

(clojure.spec.alpha/def :portkey.aws.events/event-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 12)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(\d{12}|\*)" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/remove-targets-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events/target-id :portkey.aws.events/error-code :portkey.aws.events/error-message]))

(clojure.spec.alpha/def :portkey.aws.events.ecs-parameters/task-definition-arn (clojure.spec.alpha/and :portkey.aws.events/arn))
(clojure.spec.alpha/def :portkey.aws.events.ecs-parameters/task-count (clojure.spec.alpha/and :portkey.aws.events/limit-min-1))
(clojure.spec.alpha/def :portkey.aws.events.ecs-parameters/platform-version (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events.ecs-parameters/group (clojure.spec.alpha/and :portkey.aws.events/string))
(clojure.spec.alpha/def :portkey.aws.events/ecs-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.ecs-parameters/task-definition-arn] :opt-un [:portkey.aws.events.ecs-parameters/task-count :portkey.aws.events/launch-type :portkey.aws.events/network-configuration :portkey.aws.events.ecs-parameters/platform-version :portkey.aws.events.ecs-parameters/group]))

(clojure.spec.alpha/def :portkey.aws.events/event-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 64)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"events:[a-zA-Z]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.events/run-command-target-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events/run-command-target-values (clojure.spec.alpha/coll-of :portkey.aws.events/run-command-target-value :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.events/target-partition-key-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events.disable-rule-request/name (clojure.spec.alpha/and :portkey.aws.events/rule-name))
(clojure.spec.alpha/def :portkey.aws.events/disable-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.disable-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.events/sqs-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events/message-group-id]))

(clojure.core/defn list-rules ([] (list-rules {})) ([list-rules-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rules-request list-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/list-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/list-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRules", :http.request.spec/error-spec {"InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef list-rules :args (clojure.spec.alpha/? :portkey.aws.events/list-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.events/list-rules-response))

(clojure.core/defn delete-rule ([delete-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-rule-request delete-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/delete-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRule", :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/delete-rule-request) :ret clojure.core/true?)

(clojure.core/defn list-targets-by-rule ([list-targets-by-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-targets-by-rule-request list-targets-by-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/list-targets-by-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/list-targets-by-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTargetsByRule", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef list-targets-by-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/list-targets-by-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events/list-targets-by-rule-response))

(clojure.core/defn list-rule-names-by-target ([list-rule-names-by-target-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-rule-names-by-target-request list-rule-names-by-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/list-rule-names-by-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/list-rule-names-by-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListRuleNamesByTarget", :http.request.spec/error-spec {"InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef list-rule-names-by-target :args (clojure.spec.alpha/tuple :portkey.aws.events/list-rule-names-by-target-request) :ret (clojure.spec.alpha/and :portkey.aws.events/list-rule-names-by-target-response))

(clojure.core/defn put-permission ([put-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-permission-request put-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/put-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutPermission", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "PolicyLengthExceededException" :portkey.aws.events/policy-length-exceeded-exception, "InternalException" :portkey.aws.events/internal-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-permission :args (clojure.spec.alpha/tuple :portkey.aws.events/put-permission-request) :ret clojure.core/true?)

(clojure.core/defn put-rule ([put-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-rule-request put-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/put-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/put-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutRule", :http.request.spec/error-spec {"InvalidEventPatternException" :portkey.aws.events/invalid-event-pattern-exception, "LimitExceededException" :portkey.aws.events/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef put-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/put-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events/put-rule-response))

(clojure.core/defn remove-permission ([remove-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/remove-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemovePermission", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "InternalException" :portkey.aws.events/internal-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.events/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn describe-rule ([describe-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-rule-request describe-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/describe-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/describe-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRule", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef describe-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/describe-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events/describe-rule-response))

(clojure.core/defn put-targets ([put-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-targets-request put-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/put-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/put-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutTargets", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "LimitExceededException" :portkey.aws.events/limit-exceeded-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef put-targets :args (clojure.spec.alpha/tuple :portkey.aws.events/put-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.events/put-targets-response))

(clojure.core/defn remove-targets ([remove-targets-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-targets-request remove-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/remove-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/remove-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTargets", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef remove-targets :args (clojure.spec.alpha/tuple :portkey.aws.events/remove-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.events/remove-targets-response))

(clojure.core/defn test-event-pattern ([test-event-pattern-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-test-event-pattern-request test-event-pattern-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/test-event-pattern-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/test-event-pattern-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TestEventPattern", :http.request.spec/error-spec {"InvalidEventPatternException" :portkey.aws.events/invalid-event-pattern-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef test-event-pattern :args (clojure.spec.alpha/tuple :portkey.aws.events/test-event-pattern-request) :ret (clojure.spec.alpha/and :portkey.aws.events/test-event-pattern-response))

(clojure.core/defn describe-event-bus ([] (describe-event-bus {})) ([describe-event-bus-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-event-bus-request describe-event-bus-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/describe-event-bus-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/describe-event-bus-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEventBus", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef describe-event-bus :args (clojure.spec.alpha/? :portkey.aws.events/describe-event-bus-request) :ret (clojure.spec.alpha/and :portkey.aws.events/describe-event-bus-response))

(clojure.core/defn put-events ([put-events-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-events-request put-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events/put-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/put-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutEvents", :http.request.spec/error-spec {"InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef put-events :args (clojure.spec.alpha/tuple :portkey.aws.events/put-events-request) :ret (clojure.spec.alpha/and :portkey.aws.events/put-events-response))

(clojure.core/defn enable-rule ([enable-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-enable-rule-request enable-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/enable-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "EnableRule", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef enable-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/enable-rule-request) :ret clojure.core/true?)

(clojure.core/defn disable-rule ([disable-rule-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-disable-rule-request disable-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.events/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events/disable-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisableRule", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events/concurrent-modification-exception, "InternalException" :portkey.aws.events/internal-exception}})))))
(clojure.spec.alpha/fdef disable-rule :args (clojure.spec.alpha/tuple :portkey.aws.events/disable-rule-request) :ret clojure.core/true?)
