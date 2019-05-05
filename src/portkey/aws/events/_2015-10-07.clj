(ns portkey.aws.events.-2015-10-07 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "events", :region "us-gov-east-1"},
    :ssl-common-name "events.us-gov-east-1.amazonaws.com",
    :endpoint "https://events.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "events", :region "eu-north-1"},
    :ssl-common-name "events.eu-north-1.amazonaws.com",
    :endpoint "https://events.eu-north-1.amazonaws.com",
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

(clojure.core/declare ser-condition)

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

(clojure.core/declare ser-boolean)

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

(clojure.core/defn- ser-condition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:type input)) #:http.request.field{:name "Type", :shape "String"}) (clojure.core/into (ser-string (:key input)) #:http.request.field{:name "Key", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "Condition", :type "structure"}))

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

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-sqs-parameters [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SqsParameters", :type "structure"} (clojure.core/contains? input :message-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-group-id (input :message-group-id)) #:http.request.field{:name "MessageGroupId", :shape "MessageGroupId"}))))

(clojure.core/defn- req-put-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-action (input :action)) #:http.request.field{:name "Action", :shape "Action"}) (clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "Principal", :shape "Principal"}) (clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"})]} (clojure.core/contains? input :condition) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-condition (input :condition)) #:http.request.field{:name "Condition", :shape "Condition"}))))

(clojure.core/defn- req-describe-event-bus-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-remove-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"}) (clojure.core/into (ser-target-id-list (input :ids)) #:http.request.field{:name "Ids", :shape "TargetIdList"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force)) #:http.request.field{:name "Force", :shape "Boolean"}))))

(clojure.core/defn- req-describe-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/defn- req-list-targets-by-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-list-rule-names-by-target-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "TargetArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-test-event-pattern-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-event-pattern (input :event-pattern)) #:http.request.field{:name "EventPattern", :shape "EventPattern"}) (clojure.core/into (ser-string (input :event)) #:http.request.field{:name "Event", :shape "String"})]}))

(clojure.core/defn- req-enable-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/defn- req-put-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]} (clojure.core/contains? input :schedule-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schedule-expression (input :schedule-expression)) #:http.request.field{:name "ScheduleExpression", :shape "ScheduleExpression"})) (clojure.core/contains? input :event-pattern) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-pattern (input :event-pattern)) #:http.request.field{:name "EventPattern", :shape "EventPattern"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-state (input :state)) #:http.request.field{:name "State", :shape "RuleState"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-description (input :description)) #:http.request.field{:name "Description", :shape "RuleDescription"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}))))

(clojure.core/defn- req-delete-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]} (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force)) #:http.request.field{:name "Force", :shape "Boolean"}))))

(clojure.core/defn- req-put-targets-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :rule)) #:http.request.field{:name "Rule", :shape "RuleName"}) (clojure.core/into (ser-target-list (input :targets)) #:http.request.field{:name "Targets", :shape "TargetList"})]}))

(clojure.core/defn- req-remove-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"})]}))

(clojure.core/defn- req-list-rules-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-name (input :name-prefix)) #:http.request.field{:name "NamePrefix", :shape "RuleName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-limit-max-100 (input :limit)) #:http.request.field{:name "Limit", :shape "LimitMax100"}))))

(clojure.core/defn- req-put-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-put-events-request-entry-list (input :entries)) #:http.request.field{:name "Entries", :shape "PutEventsRequestEntryList"})]}))

(clojure.core/defn- req-disable-rule-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rule-name (input :name)) #:http.request.field{:name "Name", :shape "RuleName"})]}))

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-rule-name-list)

(clojure.core/declare deser-batch-array-properties)

(clojure.core/declare deser-rule-name)

(clojure.core/declare deser-transformer-paths)

(clojure.core/declare deser-input-transformer)

(clojure.core/declare deser-target-input)

(clojure.core/declare deser-rule-state)

(clojure.core/declare deser-run-command-targets)

(clojure.core/declare deser-batch-parameters)

(clojure.core/declare deser-assign-public-ip)

(clojure.core/declare deser-kinesis-parameters)

(clojure.core/declare deser-aws-vpc-configuration)

(clojure.core/declare deser-rule-description)

(clojure.core/declare deser-put-events-result-entry)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-target-arn)

(clojure.core/declare deser-rule-response-list)

(clojure.core/declare deser-rule-arn)

(clojure.core/declare deser-run-command-target)

(clojure.core/declare deser-batch-retry-strategy)

(clojure.core/declare deser-target-input-path)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-transformer-input)

(clojure.core/declare deser-put-targets-result-entry-list)

(clojure.core/declare deser-remove-targets-result-entry-list)

(clojure.core/declare deser-input-transformer-path-key)

(clojure.core/declare deser-target-id)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-run-command-target-key)

(clojure.core/declare deser-network-configuration)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-message-group-id)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-put-events-result-entry-list)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-schedule-expression)

(clojure.core/declare deser-run-command-parameters)

(clojure.core/declare deser-target-list)

(clojure.core/declare deser-launch-type)

(clojure.core/declare deser-managed-by)

(clojure.core/declare deser-limit-min-1)

(clojure.core/declare deser-put-targets-result-entry)

(clojure.core/declare deser-target)

(clojure.core/declare deser-event-id)

(clojure.core/declare deser-remove-targets-result-entry)

(clojure.core/declare deser-ecs-parameters)

(clojure.core/declare deser-event-pattern)

(clojure.core/declare deser-run-command-target-value)

(clojure.core/declare deser-run-command-target-values)

(clojure.core/declare deser-target-partition-key-path)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-sqs-parameters)

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-rule-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule-name coll))) input))

(clojure.core/defn- deser-batch-array-properties [input] (clojure.core/cond-> {} (clojure.core/contains? input "Size") (clojure.core/assoc :size (deser-integer (input "Size")))))

(clojure.core/defn- deser-rule-name [input] input)

(clojure.core/defn- deser-transformer-paths [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-input-transformer-path-key k) (deser-target-input-path v)])) input))

(clojure.core/defn- deser-input-transformer [input] (clojure.core/cond-> {:input-template (deser-transformer-input (input "InputTemplate"))} (clojure.core/contains? input "InputPathsMap") (clojure.core/assoc :input-paths-map (deser-transformer-paths (input "InputPathsMap")))))

(clojure.core/defn- deser-target-input [input] input)

(clojure.core/defn- deser-rule-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-run-command-targets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-run-command-target coll))) input))

(clojure.core/defn- deser-batch-parameters [input] (clojure.core/cond-> {:job-definition (deser-string (input "JobDefinition")), :job-name (deser-string (input "JobName"))} (clojure.core/contains? input "ArrayProperties") (clojure.core/assoc :array-properties (deser-batch-array-properties (input "ArrayProperties"))) (clojure.core/contains? input "RetryStrategy") (clojure.core/assoc :retry-strategy (deser-batch-retry-strategy (input "RetryStrategy")))))

(clojure.core/defn- deser-assign-public-ip [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled} input))

(clojure.core/defn- deser-kinesis-parameters [input] (clojure.core/cond-> {:partition-key-path (deser-target-partition-key-path (input "PartitionKeyPath"))}))

(clojure.core/defn- deser-aws-vpc-configuration [input] (clojure.core/cond-> {:subnets (deser-string-list (input "Subnets"))} (clojure.core/contains? input "SecurityGroups") (clojure.core/assoc :security-groups (deser-string-list (input "SecurityGroups"))) (clojure.core/contains? input "AssignPublicIp") (clojure.core/assoc :assign-public-ip (deser-assign-public-ip (input "AssignPublicIp")))))

(clojure.core/defn- deser-rule-description [input] input)

(clojure.core/defn- deser-put-events-result-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "EventId") (clojure.core/assoc :event-id (deser-event-id (input "EventId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-target-arn [input] input)

(clojure.core/defn- deser-rule-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rule coll))) input))

(clojure.core/defn- deser-rule-arn [input] input)

(clojure.core/defn- deser-run-command-target [input] (clojure.core/cond-> {:key (deser-run-command-target-key (input "Key")), :values (deser-run-command-target-values (input "Values"))}))

(clojure.core/defn- deser-batch-retry-strategy [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attempts") (clojure.core/assoc :attempts (deser-integer (input "Attempts")))))

(clojure.core/defn- deser-target-input-path [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-transformer-input [input] input)

(clojure.core/defn- deser-put-targets-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-put-targets-result-entry coll))) input))

(clojure.core/defn- deser-remove-targets-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-remove-targets-result-entry coll))) input))

(clojure.core/defn- deser-input-transformer-path-key [input] input)

(clojure.core/defn- deser-target-id [input] input)

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-run-command-target-key [input] input)

(clojure.core/defn- deser-network-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "awsvpcConfiguration") (clojure.core/assoc :awsvpc-configuration (deser-aws-vpc-configuration (input "awsvpcConfiguration")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-message-group-id [input] input)

(clojure.core/defn- deser-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-rule-name (input "Name"))) (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-rule-arn (input "Arn"))) (clojure.core/contains? input "EventPattern") (clojure.core/assoc :event-pattern (deser-event-pattern (input "EventPattern"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-rule-state (input "State"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-rule-description (input "Description"))) (clojure.core/contains? input "ScheduleExpression") (clojure.core/assoc :schedule-expression (deser-schedule-expression (input "ScheduleExpression"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "ManagedBy") (clojure.core/assoc :managed-by (deser-managed-by (input "ManagedBy")))))

(clojure.core/defn- deser-put-events-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-put-events-result-entry coll))) input))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-schedule-expression [input] input)

(clojure.core/defn- deser-run-command-parameters [input] (clojure.core/cond-> {:run-command-targets (deser-run-command-targets (input "RunCommandTargets"))}))

(clojure.core/defn- deser-target-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-target coll))) input))

(clojure.core/defn- deser-launch-type [input] (clojure.core/get {"EC2" :ec-2, "FARGATE" :fargate} input))

(clojure.core/defn- deser-managed-by [input] input)

(clojure.core/defn- deser-limit-min-1 [input] input)

(clojure.core/defn- deser-put-targets-result-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetId") (clojure.core/assoc :target-id (deser-target-id (input "TargetId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-target [input] (clojure.core/cond-> {:id (deser-target-id (input "Id")), :arn (deser-target-arn (input "Arn"))} (clojure.core/contains? input "InputTransformer") (clojure.core/assoc :input-transformer (deser-input-transformer (input "InputTransformer"))) (clojure.core/contains? input "InputPath") (clojure.core/assoc :input-path (deser-target-input-path (input "InputPath"))) (clojure.core/contains? input "BatchParameters") (clojure.core/assoc :batch-parameters (deser-batch-parameters (input "BatchParameters"))) (clojure.core/contains? input "KinesisParameters") (clojure.core/assoc :kinesis-parameters (deser-kinesis-parameters (input "KinesisParameters"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "Input") (clojure.core/assoc :input (deser-target-input (input "Input"))) (clojure.core/contains? input "RunCommandParameters") (clojure.core/assoc :run-command-parameters (deser-run-command-parameters (input "RunCommandParameters"))) (clojure.core/contains? input "EcsParameters") (clojure.core/assoc :ecs-parameters (deser-ecs-parameters (input "EcsParameters"))) (clojure.core/contains? input "SqsParameters") (clojure.core/assoc :sqs-parameters (deser-sqs-parameters (input "SqsParameters")))))

(clojure.core/defn- deser-event-id [input] input)

(clojure.core/defn- deser-remove-targets-result-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetId") (clojure.core/assoc :target-id (deser-target-id (input "TargetId"))) (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "ErrorMessage") (clojure.core/assoc :error-message (deser-error-message (input "ErrorMessage")))))

(clojure.core/defn- deser-ecs-parameters [input] (clojure.core/cond-> {:task-definition-arn (deser-arn (input "TaskDefinitionArn"))} (clojure.core/contains? input "TaskCount") (clojure.core/assoc :task-count (deser-limit-min-1 (input "TaskCount"))) (clojure.core/contains? input "LaunchType") (clojure.core/assoc :launch-type (deser-launch-type (input "LaunchType"))) (clojure.core/contains? input "NetworkConfiguration") (clojure.core/assoc :network-configuration (deser-network-configuration (input "NetworkConfiguration"))) (clojure.core/contains? input "PlatformVersion") (clojure.core/assoc :platform-version (deser-string (input "PlatformVersion"))) (clojure.core/contains? input "Group") (clojure.core/assoc :group (deser-string (input "Group")))))

(clojure.core/defn- deser-event-pattern [input] input)

(clojure.core/defn- deser-run-command-target-value [input] input)

(clojure.core/defn- deser-run-command-target-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-run-command-target-value coll))) input))

(clojure.core/defn- deser-target-partition-key-path [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-sqs-parameters [input] (clojure.core/cond-> {} (clojure.core/contains? input "MessageGroupId") (clojure.core/assoc :message-group-id (deser-message-group-id (input "MessageGroupId")))))

(clojure.core/defn- response-list-rules-response ([input] (response-list-rules-response nil input)) ([resultWrapper1738231 input] (clojure.core/let [rawinput1738230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738232 {"Rules" (rawinput1738230 "Rules"), "NextToken" (rawinput1738230 "NextToken")}] (clojure.core/cond-> {} (letvar1738232 "Rules") (clojure.core/assoc :rules (deser-rule-response-list (clojure.core/get-in letvar1738232 ["Rules"]))) (letvar1738232 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1738232 ["NextToken"])))))))

(clojure.core/defn- response-put-targets-response ([input] (response-put-targets-response nil input)) ([resultWrapper1738234 input] (clojure.core/let [rawinput1738233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738235 {"FailedEntryCount" (rawinput1738233 "FailedEntryCount"), "FailedEntries" (rawinput1738233 "FailedEntries")}] (clojure.core/cond-> {} (letvar1738235 "FailedEntryCount") (clojure.core/assoc :failed-entry-count (deser-integer (clojure.core/get-in letvar1738235 ["FailedEntryCount"]))) (letvar1738235 "FailedEntries") (clojure.core/assoc :failed-entries (deser-put-targets-result-entry-list (clojure.core/get-in letvar1738235 ["FailedEntries"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1738237 input] (clojure.core/let [rawinput1738236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738238 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-event-bus-response ([input] (response-describe-event-bus-response nil input)) ([resultWrapper1738240 input] (clojure.core/let [rawinput1738239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738241 {"Name" (rawinput1738239 "Name"), "Arn" (rawinput1738239 "Arn"), "Policy" (rawinput1738239 "Policy")}] (clojure.core/cond-> {} (letvar1738241 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1738241 ["Name"]))) (letvar1738241 "Arn") (clojure.core/assoc :arn (deser-string (clojure.core/get-in letvar1738241 ["Arn"]))) (letvar1738241 "Policy") (clojure.core/assoc :policy (deser-string (clojure.core/get-in letvar1738241 ["Policy"])))))))

(clojure.core/defn- response-put-events-response ([input] (response-put-events-response nil input)) ([resultWrapper1738243 input] (clojure.core/let [rawinput1738242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738244 {"FailedEntryCount" (rawinput1738242 "FailedEntryCount"), "Entries" (rawinput1738242 "Entries")}] (clojure.core/cond-> {} (letvar1738244 "FailedEntryCount") (clojure.core/assoc :failed-entry-count (deser-integer (clojure.core/get-in letvar1738244 ["FailedEntryCount"]))) (letvar1738244 "Entries") (clojure.core/assoc :entries (deser-put-events-result-entry-list (clojure.core/get-in letvar1738244 ["Entries"])))))))

(clojure.core/defn- response-list-rule-names-by-target-response ([input] (response-list-rule-names-by-target-response nil input)) ([resultWrapper1738246 input] (clojure.core/let [rawinput1738245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738247 {"RuleNames" (rawinput1738245 "RuleNames"), "NextToken" (rawinput1738245 "NextToken")}] (clojure.core/cond-> {} (letvar1738247 "RuleNames") (clojure.core/assoc :rule-names (deser-rule-name-list (clojure.core/get-in letvar1738247 ["RuleNames"]))) (letvar1738247 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1738247 ["NextToken"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1738249 input] (clojure.core/let [rawinput1738248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738250 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-exception ([input] (response-internal-exception nil input)) ([resultWrapper1738252 input] (clojure.core/let [rawinput1738251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738253 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-event-pattern-exception ([input] (response-invalid-event-pattern-exception nil input)) ([resultWrapper1738255 input] (clojure.core/let [rawinput1738254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738256 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-rule-response ([input] (response-describe-rule-response nil input)) ([resultWrapper1738258 input] (clojure.core/let [rawinput1738257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738259 {"Name" (rawinput1738257 "Name"), "Arn" (rawinput1738257 "Arn"), "EventPattern" (rawinput1738257 "EventPattern"), "ScheduleExpression" (rawinput1738257 "ScheduleExpression"), "State" (rawinput1738257 "State"), "Description" (rawinput1738257 "Description"), "RoleArn" (rawinput1738257 "RoleArn"), "ManagedBy" (rawinput1738257 "ManagedBy")}] (clojure.core/cond-> {} (letvar1738259 "Name") (clojure.core/assoc :name (deser-rule-name (clojure.core/get-in letvar1738259 ["Name"]))) (letvar1738259 "Arn") (clojure.core/assoc :arn (deser-rule-arn (clojure.core/get-in letvar1738259 ["Arn"]))) (letvar1738259 "EventPattern") (clojure.core/assoc :event-pattern (deser-event-pattern (clojure.core/get-in letvar1738259 ["EventPattern"]))) (letvar1738259 "ScheduleExpression") (clojure.core/assoc :schedule-expression (deser-schedule-expression (clojure.core/get-in letvar1738259 ["ScheduleExpression"]))) (letvar1738259 "State") (clojure.core/assoc :state (deser-rule-state (clojure.core/get-in letvar1738259 ["State"]))) (letvar1738259 "Description") (clojure.core/assoc :description (deser-rule-description (clojure.core/get-in letvar1738259 ["Description"]))) (letvar1738259 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1738259 ["RoleArn"]))) (letvar1738259 "ManagedBy") (clojure.core/assoc :managed-by (deser-managed-by (clojure.core/get-in letvar1738259 ["ManagedBy"])))))))

(clojure.core/defn- response-test-event-pattern-response ([input] (response-test-event-pattern-response nil input)) ([resultWrapper1738261 input] (clojure.core/let [rawinput1738260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738262 {"Result" (rawinput1738260 "Result")}] (clojure.core/cond-> {} (letvar1738262 "Result") (clojure.core/assoc :result (deser-boolean (clojure.core/get-in letvar1738262 ["Result"])))))))

(clojure.core/defn- response-policy-length-exceeded-exception ([input] (response-policy-length-exceeded-exception nil input)) ([resultWrapper1738264 input] (clojure.core/let [rawinput1738263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738265 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-targets-by-rule-response ([input] (response-list-targets-by-rule-response nil input)) ([resultWrapper1738267 input] (clojure.core/let [rawinput1738266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738268 {"Targets" (rawinput1738266 "Targets"), "NextToken" (rawinput1738266 "NextToken")}] (clojure.core/cond-> {} (letvar1738268 "Targets") (clojure.core/assoc :targets (deser-target-list (clojure.core/get-in letvar1738268 ["Targets"]))) (letvar1738268 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1738268 ["NextToken"])))))))

(clojure.core/defn- response-managed-rule-exception ([input] (response-managed-rule-exception nil input)) ([resultWrapper1738270 input] (clojure.core/let [rawinput1738269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738271 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-rule-response ([input] (response-put-rule-response nil input)) ([resultWrapper1738273 input] (clojure.core/let [rawinput1738272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738274 {"RuleArn" (rawinput1738272 "RuleArn")}] (clojure.core/cond-> {} (letvar1738274 "RuleArn") (clojure.core/assoc :rule-arn (deser-rule-arn (clojure.core/get-in letvar1738274 ["RuleArn"])))))))

(clojure.core/defn- response-concurrent-modification-exception ([input] (response-concurrent-modification-exception nil input)) ([resultWrapper1738276 input] (clojure.core/let [rawinput1738275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738277 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-remove-targets-response ([input] (response-remove-targets-response nil input)) ([resultWrapper1738279 input] (clojure.core/let [rawinput1738278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1738280 {"FailedEntryCount" (rawinput1738278 "FailedEntryCount"), "FailedEntries" (rawinput1738278 "FailedEntries")}] (clojure.core/cond-> {} (letvar1738280 "FailedEntryCount") (clojure.core/assoc :failed-entry-count (deser-integer (clojure.core/get-in letvar1738280 ["FailedEntryCount"]))) (letvar1738280 "FailedEntries") (clojure.core/assoc :failed-entries (deser-remove-targets-result-entry-list (clojure.core/get-in letvar1738280 ["FailedEntries"])))))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/string-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/string))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-name-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/rule-name))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07/action :portkey.aws.events.-2015-10-07/principal :portkey.aws.events.-2015-10-07/statement-id] :opt-un [:portkey.aws.events.-2015-10-07/condition]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/describe-event-bus-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-rules-response/rules (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-response-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-rules-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.list-rules-response/rules :portkey.aws.events.-2015-10-07/next-token]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-array-properties/size (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/integer))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/batch-array-properties (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.batch-array-properties/size]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\.\-_A-Za-z0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-id-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/target-id :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/transformer-paths (clojure.spec.alpha/map-of :portkey.aws.events.-2015-10-07/input-transformer-path-key :portkey.aws.events.-2015-10-07/target-input-path))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.input-transformer/input-paths-map (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/transformer-paths))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.input-transformer/input-template (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/transformer-input))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/input-transformer (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.input-transformer/input-template] :opt-un [:portkey.aws.events.-2015-10-07.input-transformer/input-paths-map]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-state #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-targets (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/run-command-target :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-parameters/job-definition (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-parameters/job-name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-parameters/array-properties (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/batch-array-properties))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-parameters/retry-strategy (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/batch-retry-strategy))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/batch-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.batch-parameters/job-definition :portkey.aws.events.-2015-10-07.batch-parameters/job-name] :opt-un [:portkey.aws.events.-2015-10-07.batch-parameters/array-properties :portkey.aws.events.-2015-10-07.batch-parameters/retry-strategy]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/assign-public-ip #{"DISABLED" :disabled "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/event-resource (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.kinesis-parameters/partition-key-path (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-partition-key-path))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/kinesis-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.kinesis-parameters/partition-key-path] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/put-events-request-entry :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.remove-targets-request/rule (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.remove-targets-request/ids (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-id-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.remove-targets-request/force (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/boolean))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/remove-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.remove-targets-request/rule :portkey.aws.events.-2015-10-07.remove-targets-request/ids] :opt-un [:portkey.aws.events.-2015-10-07.remove-targets-request/force]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.aws-vpc-configuration/subnets (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.aws-vpc-configuration/security-groups (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/aws-vpc-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.aws-vpc-configuration/subnets] :opt-un [:portkey.aws.events.-2015-10-07.aws-vpc-configuration/security-groups :portkey.aws.events.-2015-10-07/assign-public-ip]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-rule-request/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/describe-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.describe-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07/event-id :portkey.aws.events.-2015-10-07/error-code :portkey.aws.events.-2015-10-07/error-message]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-response-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/rule))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-targets-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/integer))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-targets-response/failed-entries (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-targets-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.put-targets-response/failed-entry-count :portkey.aws.events.-2015-10-07.put-targets-response/failed-entries]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-targets-by-rule-request/rule (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-targets-by-rule-request/limit (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-targets-by-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.list-targets-by-rule-request/rule] :opt-un [:portkey.aws.events.-2015-10-07/next-token :portkey.aws.events.-2015-10-07.list-targets-by-rule-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-event-bus-response/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-event-bus-response/arn (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-event-bus-response/policy (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/describe-event-bus-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.describe-event-bus-response/name :portkey.aws.events.-2015-10-07.describe-event-bus-response/arn :portkey.aws.events.-2015-10-07.describe-event-bus-response/policy]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-rule-names-by-target-request/limit (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-rule-names-by-target-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07/target-arn] :opt-un [:portkey.aws.events.-2015-10-07/next-token :portkey.aws.events.-2015-10-07.list-rule-names-by-target-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.run-command-target/key (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/run-command-target-key))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.run-command-target/values (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/run-command-target-values))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-target (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.run-command-target/key :portkey.aws.events.-2015-10-07.run-command-target/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.test-event-pattern-request/event (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/test-event-pattern-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07/event-pattern :portkey.aws.events.-2015-10-07.test-event-pattern-request/event] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.batch-retry-strategy/attempts (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/integer))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/batch-retry-strategy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.batch-retry-strategy/attempts]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/event-resource-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/event-resource))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request-entry/time (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/event-time))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request-entry/source (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request-entry/resources (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/event-resource-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request-entry/detail-type (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request-entry/detail (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-request-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.put-events-request-entry/time :portkey.aws.events.-2015-10-07.put-events-request-entry/source :portkey.aws.events.-2015-10-07.put-events-request-entry/resources :portkey.aws.events.-2015-10-07.put-events-request-entry/detail-type :portkey.aws.events.-2015-10-07.put-events-request-entry/detail]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-input-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.enable-rule-request/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/enable-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.enable-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/integer))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-response/entries (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-events-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.put-events-response/failed-entry-count :portkey.aws.events.-2015-10-07.put-events-response/entries]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/transformer-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-targets-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/put-targets-result-entry))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-rule-request/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-rule-request/state (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-rule-request/description (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-description))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.put-rule-request/name] :opt-un [:portkey.aws.events.-2015-10-07/schedule-expression :portkey.aws.events.-2015-10-07/event-pattern :portkey.aws.events.-2015-10-07.put-rule-request/state :portkey.aws.events.-2015-10-07.put-rule-request/description :portkey.aws.events.-2015-10-07/role-arn]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/limit-max-100 (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/remove-targets-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/remove-targets-result-entry))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-rule-names-by-target-response/rule-names (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-rule-names-by-target-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.list-rule-names-by-target-response/rule-names :portkey.aws.events.-2015-10-07/next-token]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/input-transformer-path-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z0-9\_\-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\.\-_A-Za-z0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.delete-rule-request/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.delete-rule-request/force (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/boolean))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/delete-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.delete-rule-request/name] :opt-un [:portkey.aws.events.-2015-10-07.delete-rule-request/force]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-target-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\p{L}\p{Z}\p{N}_.:/=+\-@]*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.network-configuration/awsvpc-configuration (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/aws-vpc-configuration))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/network-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.network-configuration/awsvpc-configuration]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-targets-request/rule (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-targets-request/targets (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-targets-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.put-targets-request/rule :portkey.aws.events.-2015-10-07.put-targets-request/targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/invalid-event-pattern-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/message-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-rule-response/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-rule-response/arn (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-arn))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-rule-response/state (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.describe-rule-response/description (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-description))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/describe-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.describe-rule-response/name :portkey.aws.events.-2015-10-07.describe-rule-response/arn :portkey.aws.events.-2015-10-07/event-pattern :portkey.aws.events.-2015-10-07/schedule-expression :portkey.aws.events.-2015-10-07.describe-rule-response/state :portkey.aws.events.-2015-10-07.describe-rule-response/description :portkey.aws.events.-2015-10-07/role-arn :portkey.aws.events.-2015-10-07/managed-by]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/remove-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07/statement-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.rule/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.rule/arn (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-arn))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.rule/state (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-state))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.rule/description (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-description))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.rule/name :portkey.aws.events.-2015-10-07.rule/arn :portkey.aws.events.-2015-10-07/event-pattern :portkey.aws.events.-2015-10-07.rule/state :portkey.aws.events.-2015-10-07.rule/description :portkey.aws.events.-2015-10-07/schedule-expression :portkey.aws.events.-2015-10-07/role-arn :portkey.aws.events.-2015-10-07/managed-by]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.test-event-pattern-response/result (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/boolean))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/test-event-pattern-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.test-event-pattern-response/result]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/put-events-result-entry))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1600))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/schedule-expression (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07/run-command-targets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/event-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/policy-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-targets-by-rule-response/targets (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-targets-by-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.list-targets-by-rule-response/targets :portkey.aws.events.-2015-10-07/next-token]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.condition/type (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.condition/key (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.condition/value (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/condition (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.condition/type :portkey.aws.events.-2015-10-07.condition/key :portkey.aws.events.-2015-10-07.condition/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-list (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/target :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/launch-type #{"EC2" "FARGATE" :fargate :ec-2})

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/managed-by (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/managed-rule-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-rule-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07/rule-arn]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/limit-min-1 (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-rules-request/name-prefix (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.list-rules-request/limit (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/limit-max-100))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/list-rules-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.list-rules-request/name-prefix :portkey.aws.events.-2015-10-07/next-token :portkey.aws.events.-2015-10-07.list-rules-request/limit]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.put-events-request/entries (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-events-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.put-events-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/concurrent-modification-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/put-targets-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07/target-id :portkey.aws.events.-2015-10-07/error-code :portkey.aws.events.-2015-10-07/error-message]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.target/input-path (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-input-path))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.target/input (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-input))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.target/arn (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-arn))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.target/id (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/target-id))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.target/id :portkey.aws.events.-2015-10-07.target/arn] :opt-un [:portkey.aws.events.-2015-10-07/input-transformer :portkey.aws.events.-2015-10-07.target/input-path :portkey.aws.events.-2015-10-07/batch-parameters :portkey.aws.events.-2015-10-07/kinesis-parameters :portkey.aws.events.-2015-10-07/role-arn :portkey.aws.events.-2015-10-07.target/input :portkey.aws.events.-2015-10-07/run-command-parameters :portkey.aws.events.-2015-10-07/ecs-parameters :portkey.aws.events.-2015-10-07/sqs-parameters]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.remove-targets-response/failed-entry-count (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/integer))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.remove-targets-response/failed-entries (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/remove-targets-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/remove-targets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07.remove-targets-response/failed-entry-count :portkey.aws.events.-2015-10-07.remove-targets-response/failed-entries]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/event-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 12)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(\d{12}|\*)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/remove-targets-result-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07/target-id :portkey.aws.events.-2015-10-07/error-code :portkey.aws.events.-2015-10-07/error-message]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.ecs-parameters/task-definition-arn (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/arn))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.ecs-parameters/task-count (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/limit-min-1))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.ecs-parameters/platform-version (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.ecs-parameters/group (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/string))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/ecs-parameters (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.ecs-parameters/task-definition-arn] :opt-un [:portkey.aws.events.-2015-10-07.ecs-parameters/task-count :portkey.aws.events.-2015-10-07/launch-type :portkey.aws.events.-2015-10-07/network-configuration :portkey.aws.events.-2015-10-07.ecs-parameters/platform-version :portkey.aws.events.-2015-10-07.ecs-parameters/group]))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/event-pattern (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"events:[a-zA-Z]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-target-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/run-command-target-values (clojure.spec.alpha/coll-of :portkey.aws.events.-2015-10-07/run-command-target-value :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/target-partition-key-path (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07.disable-rule-request/name (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/rule-name))
(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/disable-rule-request (clojure.spec.alpha/keys :req-un [:portkey.aws.events.-2015-10-07.disable-rule-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.events.-2015-10-07/sqs-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.events.-2015-10-07/message-group-id]))

(clojure.core/defn list-rules "Lists your Amazon CloudWatch Events rules. You can either list all the rules or\nyou can provide a prefix to match to the rule names.\n ListRules does not list the targets of a rule. To see the targets associated\nwith a rule, use ListTargetsByRule." ([] (list-rules {})) ([list-rules-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-rules-request list-rules-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/list-rules-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/list-rules-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRules", :http.request.configuration/output-deser-fn response-list-rules-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef list-rules :args (clojure.spec.alpha/? :portkey.aws.events.-2015-10-07/list-rules-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/list-rules-response))

(clojure.core/defn delete-rule "Deletes the specified rule.\n Before you can delete the rule, you must remove all targets, using\nRemoveTargets.\n When you delete a rule, incoming events might continue to match to the deleted\nrule. Allow a short period of time for changes to take effect.\n Managed rules are rules created and managed by another AWS service on your\nbehalf. These rules are created by those other AWS services to support\nfunctionality in those services. You can delete these rules using the Force\noption, but you should do so only if you are sure the other service is not still\nusing that rule." ([delete-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-rule-request delete-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/delete-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRule", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef delete-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/delete-rule-request) :ret clojure.core/true?)

(clojure.core/defn list-targets-by-rule "Lists the targets assigned to the specified rule." ([list-targets-by-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-targets-by-rule-request list-targets-by-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/list-targets-by-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/list-targets-by-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTargetsByRule", :http.request.configuration/output-deser-fn response-list-targets-by-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef list-targets-by-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/list-targets-by-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/list-targets-by-rule-response))

(clojure.core/defn list-rule-names-by-target "Lists the rules for the specified target. You can see which of the rules in\nAmazon CloudWatch Events can invoke a specific target in your account." ([list-rule-names-by-target-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-rule-names-by-target-request list-rule-names-by-target-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/list-rule-names-by-target-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/list-rule-names-by-target-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListRuleNamesByTarget", :http.request.configuration/output-deser-fn response-list-rule-names-by-target-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef list-rule-names-by-target :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/list-rule-names-by-target-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/list-rule-names-by-target-response))

(clojure.core/defn put-permission "Running PutPermission permits the specified AWS account or AWS organization to\nput events to your account's default event bus. CloudWatch Events rules in your\naccount are triggered by these events arriving to your default event bus.\n For another account to send events to your account, that external account must\nhave a CloudWatch Events rule with your account's default event bus as a target.\n To enable multiple AWS accounts to put events to your default event bus, run\nPutPermission once for each of these accounts. Or, if all the accounts are\nmembers of the same AWS organization, you can run PutPermission once specifying\nPrincipal as \"*\" and specifying the AWS organization ID in Condition, to grant\npermissions to all accounts in that organization.\n If you grant permissions using an organization, then accounts in that\norganization must specify a RoleArn with proper permissions when they use\nPutTarget to add your account's event bus as a target. For more information, see\nSending and Receiving Events Between AWS Accounts\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html)\nin the Amazon CloudWatch Events User Guide.\n The permission policy on the default event bus cannot exceed 10 KB in size." ([put-permission-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-permission-request put-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/put-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "PolicyLengthExceededException" :portkey.aws.events.-2015-10-07/policy-length-exceeded-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef put-permission :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/put-permission-request) :ret clojure.core/true?)

(clojure.core/defn put-rule "Creates or updates the specified rule. Rules are enabled by default, or based on\nvalue of the state. You can disable a rule using DisableRule.\n If you are updating an existing rule, the rule is replaced with what you\nspecify in this PutRule command. If you omit arguments in PutRule, the old\nvalues for those arguments are not kept. Instead, they are replaced with null\nvalues.\n When you create or update a rule, incoming events might not immediately start\nmatching to new or updated rules. Allow a short period of time for changes to\ntake effect.\n A rule must contain at least an EventPattern or ScheduleExpression. Rules with\nEventPatterns are triggered when a matching event is observed. Rules with\nScheduleExpressions self-trigger based on the given schedule. A rule can have\nboth an EventPattern and a ScheduleExpression, in which case the rule triggers\non matching events as well as on a schedule.\n Most services in AWS treat : or / as the same character in Amazon Resource\nNames (ARNs). However, CloudWatch Events uses an exact match in event patterns\nand rules. Be sure to use the correct ARN characters when creating event\npatterns so that they match the ARN syntax in the event you want to match.\n In CloudWatch Events, it is possible to create rules that lead to infinite\nloops, where a rule is fired repeatedly. For example, a rule might detect that\nACLs have changed on an S3 bucket, and trigger software to change them to the\ndesired state. If the rule is not written carefully, the subsequent change to\nthe ACLs fires the rule again, creating an infinite loop.\n To prevent this, write the rules so that the triggered actions do not re-fire\nthe same rule. For example, your rule could fire only if ACLs are found to be in\na bad state, instead of after any change.\n An infinite loop can quickly cause higher than expected charges. We recommend\nthat you use budgeting, which alerts you when charges exceed your specified\nlimit. For more information, see Managing Your Costs with Budgets\n(http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html)." ([put-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-rule-request put-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/put-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/put-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRule", :http.request.configuration/output-deser-fn response-put-rule-response, :http.request.spec/error-spec {"InvalidEventPatternException" :portkey.aws.events.-2015-10-07/invalid-event-pattern-exception, "LimitExceededException" :portkey.aws.events.-2015-10-07/limit-exceeded-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef put-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/put-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-rule-response))

(clojure.core/defn remove-permission "Revokes the permission of another AWS account to be able to put events to your\ndefault event bus. Specify the account to revoke by the StatementId value that\nyou associated with the account when you granted it permission with\nPutPermission. You can find the StatementId by using DescribeEventBus." ([remove-permission-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/remove-permission-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn describe-rule "Describes the specified rule.\n DescribeRule does not list the targets of a rule. To see the targets associated\nwith a rule, use ListTargetsByRule." ([describe-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-rule-request describe-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/describe-rule-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/describe-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRule", :http.request.configuration/output-deser-fn response-describe-rule-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef describe-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/describe-rule-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/describe-rule-response))

(clojure.core/defn put-targets "Adds the specified targets to the specified rule, or updates the targets if they\nare already associated with the rule.\n Targets are the resources that are invoked when a rule is triggered.\n You can configure the following as targets for CloudWatch Events:\n * EC2 instances\n * SSM Run Command\n * SSM Automation\n * AWS Lambda functions\n * Data streams in Amazon Kinesis Data Streams\n * Data delivery streams in Amazon Kinesis Data Firehose\n * Amazon ECS tasks\n * AWS Step Functions state machines\n * AWS Batch jobs\n * AWS CodeBuild projects\n * Pipelines in AWS CodePipeline\n * Amazon Inspector assessment templates\n * Amazon SNS topics\n * Amazon SQS queues, including FIFO queues\n * The default event bus of another AWS account\n Creating rules with built-in targets is supported only in the AWS Management\nConsole. The built-in targets are EC2 CreateSnapshot API call, EC2\nRebootInstances API call, EC2 StopInstances API call, and EC2 TerminateInstances\nAPI call.\n For some target types, PutTargets provides target-specific parameters. If the\ntarget is a Kinesis data stream, you can optionally specify which shard the\nevent goes to by using the KinesisParameters argument. To invoke a command on\nmultiple EC2 instances with one rule, you can use the RunCommandParameters\nfield.\n To be able to make API calls against the resources that you own, Amazon\nCloudWatch Events needs the appropriate permissions. For AWS Lambda and Amazon\nSNS resources, CloudWatch Events relies on resource-based policies. For EC2\ninstances, Kinesis data streams, and AWS Step Functions state machines,\nCloudWatch Events relies on IAM roles that you specify in the RoleARN argument\nin PutTargets. For more information, see Authentication and Access Control\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/auth-and-access-control-cwe.html)\nin the Amazon CloudWatch Events User Guide.\n If another AWS account is in the same region and has granted you permission\n(using PutPermission), you can send events to that account. Set that account's\nevent bus as a target of the rules in your account. To send the matched events\nto the other account, specify that account's event bus as the Arn value when you\nrun PutTargets. If your account sends events to another account, your account is\ncharged for each sent event. Each event sent to another account is charged as a\ncustom event. The account receiving the event is not charged. For more\ninformation, see Amazon CloudWatch Pricing\n(https://aws.amazon.com/cloudwatch/pricing/).\n If you are setting the event bus of another account as the target, and that\naccount granted permission to your account through an organization instead of\ndirectly by the account ID, then you must specify a RoleArn with proper\npermissions in the Target structure. For more information, see Sending and\nReceiving Events Between AWS Accounts\n(http://docs.aws.amazon.com/AmazonCloudWatch/latest/events/CloudWatchEvents-CrossAccountEventDelivery.html)\nin the Amazon CloudWatch Events User Guide.\n For more information about enabling cross-account events, see PutPermission.\n Input, InputPath, and InputTransformer are mutually exclusive and optional\nparameters of a target. When a rule is triggered due to a matched event:\n * If none of the following arguments are specified for a target, then the\nentire event is passed to the target in JSON format (unless the target is Amazon\nEC2 Run Command or Amazon ECS task, in which case nothing from the event is\npassed to the target).\n * If Input is specified in the form of valid JSON, then the matched event is\noverridden with this constant.\n * If InputPath is specified in the form of JSONPath (for example, $.detail),\nthen only the part of the event specified in the path is passed to the target\n(for example, only the detail part of the event is passed).\n * If InputTransformer is specified, then one or more specified JSONPaths are\nextracted from the event and used as values in a template that you specify as\nthe input to the target.\n When you specify InputPath or InputTransformer, you must use JSON dot notation,\nnot bracket notation.\n When you add targets to a rule and the associated rule triggers soon after, new\nor updated targets might not be immediately invoked. Allow a short period of\ntime for changes to take effect.\n This action can partially fail if too many requests are made at the same time.\nIf that happens, FailedEntryCount is non-zero in the response and each entry in\nFailedEntries provides the ID of the failed target and the error code." ([put-targets-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-targets-request put-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/put-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/put-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutTargets", :http.request.configuration/output-deser-fn response-put-targets-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "LimitExceededException" :portkey.aws.events.-2015-10-07/limit-exceeded-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef put-targets :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/put-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-targets-response))

(clojure.core/defn remove-targets "Removes the specified targets from the specified rule. When the rule is\ntriggered, those targets are no longer be invoked.\n When you remove a target, when the associated rule triggers, removed targets\nmight continue to be invoked. Allow a short period of time for changes to take\neffect.\n This action can partially fail if too many requests are made at the same time.\nIf that happens, FailedEntryCount is non-zero in the response and each entry in\nFailedEntries provides the ID of the failed target and the error code." ([remove-targets-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-remove-targets-request remove-targets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/remove-targets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/remove-targets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTargets", :http.request.configuration/output-deser-fn response-remove-targets-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef remove-targets :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/remove-targets-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/remove-targets-response))

(clojure.core/defn test-event-pattern "Tests whether the specified event pattern matches the provided event.\n Most services in AWS treat : or / as the same character in Amazon Resource\nNames (ARNs). However, CloudWatch Events uses an exact match in event patterns\nand rules. Be sure to use the correct ARN characters when creating event\npatterns so that they match the ARN syntax in the event you want to match." ([test-event-pattern-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-test-event-pattern-request test-event-pattern-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/test-event-pattern-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/test-event-pattern-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestEventPattern", :http.request.configuration/output-deser-fn response-test-event-pattern-response, :http.request.spec/error-spec {"InvalidEventPatternException" :portkey.aws.events.-2015-10-07/invalid-event-pattern-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef test-event-pattern :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/test-event-pattern-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/test-event-pattern-response))

(clojure.core/defn describe-event-bus "Displays the external AWS accounts that are permitted to write events to your\naccount using your account's event bus, and the associated policy. To enable\nyour account to receive events from other accounts, use PutPermission." ([] (describe-event-bus {})) ([describe-event-bus-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-event-bus-request describe-event-bus-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/describe-event-bus-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/describe-event-bus-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEventBus", :http.request.configuration/output-deser-fn response-describe-event-bus-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef describe-event-bus :args (clojure.spec.alpha/? :portkey.aws.events.-2015-10-07/describe-event-bus-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/describe-event-bus-response))

(clojure.core/defn put-events "Sends custom events to Amazon CloudWatch Events so that they can be matched to\nrules." ([put-events-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-events-request put-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec :portkey.aws.events.-2015-10-07/put-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/put-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutEvents", :http.request.configuration/output-deser-fn response-put-events-response, :http.request.spec/error-spec {"InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef put-events :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/put-events-request) :ret (clojure.spec.alpha/and :portkey.aws.events.-2015-10-07/put-events-response))

(clojure.core/defn enable-rule "Enables the specified rule. If the rule does not exist, the operation fails.\n When you enable a rule, incoming events might not immediately start matching to\na newly enabled rule. Allow a short period of time for changes to take effect." ([enable-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-enable-rule-request enable-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/enable-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableRule", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef enable-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/enable-rule-request) :ret clojure.core/true?)

(clojure.core/defn disable-rule "Disables the specified rule. A disabled rule won't match any events, and won't\nself-trigger if it has a schedule expression.\n When you disable a rule, incoming events might continue to match to the\ndisabled rule. Allow a short period of time for changes to take effect." ([disable-rule-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-disable-rule-request disable-rule-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.events.-2015-10-07/endpoints, :http.request.configuration/target-prefix "AWSEvents", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-10-07", :http.request.configuration/service-id "CloudWatch Events", :http.request.spec/input-spec :portkey.aws.events.-2015-10-07/disable-rule-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableRule", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.events.-2015-10-07/resource-not-found-exception, "ConcurrentModificationException" :portkey.aws.events.-2015-10-07/concurrent-modification-exception, "ManagedRuleException" :portkey.aws.events.-2015-10-07/managed-rule-exception, "InternalException" :portkey.aws.events.-2015-10-07/internal-exception}})))))
(clojure.spec.alpha/fdef disable-rule :args (clojure.spec.alpha/tuple :portkey.aws.events.-2015-10-07/disable-rule-request) :ret clojure.core/true?)
