(ns portkey.aws.lambda.-2015-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "lambda", :region "ap-northeast-1"},
    :ssl-common-name "lambda.ap-northeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "lambda", :region "eu-west-1"},
    :ssl-common-name "lambda.eu-west-1.amazonaws.com",
    :endpoint "https://lambda.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "lambda", :region "us-east-2"},
    :ssl-common-name "lambda.us-east-2.amazonaws.com",
    :endpoint "https://lambda.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "lambda", :region "ap-southeast-2"},
    :ssl-common-name "lambda.ap-southeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "lambda", :region "cn-north-1"},
    :ssl-common-name "lambda.cn-north-1.amazonaws.com.cn",
    :endpoint "https://lambda.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "lambda", :region "sa-east-1"},
    :ssl-common-name "lambda.sa-east-1.amazonaws.com",
    :endpoint "https://lambda.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "lambda", :region "ap-southeast-1"},
    :ssl-common-name "lambda.ap-southeast-1.amazonaws.com",
    :endpoint "https://lambda.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "lambda", :region "cn-northwest-1"},
    :ssl-common-name "lambda.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://lambda.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "lambda", :region "ap-northeast-2"},
    :ssl-common-name "lambda.ap-northeast-2.amazonaws.com",
    :endpoint "https://lambda.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "lambda", :region "eu-west-3"},
    :ssl-common-name "lambda.eu-west-3.amazonaws.com",
    :endpoint "https://lambda.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "lambda", :region "ca-central-1"},
    :ssl-common-name "lambda.ca-central-1.amazonaws.com",
    :endpoint "https://lambda.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "lambda", :region "eu-central-1"},
    :ssl-common-name "lambda.eu-central-1.amazonaws.com",
    :endpoint "https://lambda.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "lambda", :region "eu-west-2"},
    :ssl-common-name "lambda.eu-west-2.amazonaws.com",
    :endpoint "https://lambda.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "lambda", :region "us-gov-west-1"},
    :ssl-common-name "lambda.us-gov-west-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lambda", :region "us-west-2"},
    :ssl-common-name "lambda.us-west-2.amazonaws.com",
    :endpoint "https://lambda.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lambda", :region "us-east-1"},
    :ssl-common-name "lambda.us-east-1.amazonaws.com",
    :endpoint "https://lambda.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "lambda", :region "us-west-1"},
    :ssl-common-name "lambda.us-west-1.amazonaws.com",
    :endpoint "https://lambda.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "lambda", :region "ap-south-1"},
    :ssl-common-name "lambda.ap-south-1.amazonaws.com",
    :endpoint "https://lambda.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-reserved-concurrent-executions)

(clojure.core/declare ser-tracing-config)

(clojure.core/declare ser-function-code)

(clojure.core/declare ser-s-3-object-version)

(clojure.core/declare ser-function-arn)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-batch-size)

(clojure.core/declare ser-function-name)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-timeout)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-alias-routing-configuration)

(clojure.core/declare ser-dead-letter-config)

(clojure.core/declare ser-handler)

(clojure.core/declare ser-namespaced-function-name)

(clojure.core/declare ser-runtime)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-source-owner)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-statement-id)

(clojure.core/declare ser-alias)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-additional-version)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-function-version)

(clojure.core/declare ser-date)

(clojure.core/declare ser-memory-size)

(clojure.core/declare ser-namespaced-statement-id)

(clojure.core/declare ser-log-type)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-weight)

(clojure.core/declare ser-environment-variable-value)

(clojure.core/declare ser-kms-key-arn)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-invocation-type)

(clojure.core/declare ser-blob-stream)

(clojure.core/declare ser-max-list-items)

(clojure.core/declare ser-string)

(clojure.core/declare ser-tracing-mode)

(clojure.core/declare ser-environment)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-master-region)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-environment-variable-name)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-qualifier)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-event-source-token)

(clojure.core/declare ser-version)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-principal)

(clojure.core/declare ser-additional-version-weights)

(clojure.core/declare ser-action)

(clojure.core/declare ser-event-source-position)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-reserved-concurrent-executions [input] #:http.request.field{:value input, :shape "ReservedConcurrentExecutions"})

(clojure.core/defn- ser-tracing-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TracingConfig", :type "structure"} (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-mode (input :mode)) #:http.request.field{:name "Mode", :shape "TracingMode"}))))

(clojure.core/defn- ser-function-code [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FunctionCode", :type "structure"} (clojure.core/contains? input :zip-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :zip-file)) #:http.request.field{:name "ZipFile", :shape "Blob"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"})) (clojure.core/contains? input :s-3-object-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :s-3-object-version)) #:http.request.field{:name "S3ObjectVersion", :shape "S3ObjectVersion"}))))

(clojure.core/defn- ser-s-3-object-version [input] #:http.request.field{:value input, :shape "S3ObjectVersion"})

(clojure.core/defn- ser-function-arn [input] #:http.request.field{:value input, :shape "FunctionArn"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list", :max 16})

(clojure.core/defn- ser-batch-size [input] #:http.request.field{:value input, :shape "BatchSize"})

(clojure.core/defn- ser-function-name [input] #:http.request.field{:value input, :shape "FunctionName"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-timeout [input] #:http.request.field{:value input, :shape "Timeout"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-variable-name k) #:http.request.field{:map-info "key", :shape "EnvironmentVariableName"}) (clojure.core/into (ser-environment-variable-value v) #:http.request.field{:map-info "value", :shape "EnvironmentVariableValue"})])) input), :shape "EnvironmentVariables", :type "map", :sensitive true})

(clojure.core/defn- ser-alias-routing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AliasRoutingConfiguration", :type "structure"} (clojure.core/contains? input :additional-version-weights) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-version-weights (input :additional-version-weights)) #:http.request.field{:name "AdditionalVersionWeights", :shape "AdditionalVersionWeights"}))))

(clojure.core/defn- ser-dead-letter-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeadLetterConfig", :type "structure"} (clojure.core/contains? input :target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "ResourceArn"}))))

(clojure.core/defn- ser-handler [input] #:http.request.field{:value input, :shape "Handler"})

(clojure.core/defn- ser-namespaced-function-name [input] #:http.request.field{:value input, :shape "NamespacedFunctionName"})

(clojure.core/defn- ser-runtime [input] #:http.request.field{:value (clojure.core/get {"go1.x" "go1.x", "dotnetcore2.0" "dotnetcore2.0", :dotnetcore-20 "dotnetcore2.0", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", "dotnetcore2.1" "dotnetcore2.1", :python-36 "python3.6", :java-8 "java8", :nodejs-810 "nodejs8.10", :nodejs-43 "nodejs4.3", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", "nodejs4.3-edge" "nodejs4.3-edge", :dotnetcore-10 "dotnetcore1.0", "nodejs8.10" "nodejs8.10", :go-1x "go1.x", "nodejs6.10" "nodejs6.10", "python3.6" "python3.6", :dotnetcore-21 "dotnetcore2.1", :nodejs-43edge "nodejs4.3-edge", :nodejs-610 "nodejs6.10", "nodejs" "nodejs", :python-27 "python2.7"} input), :shape "Runtime"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-source-owner [input] #:http.request.field{:value input, :shape "SourceOwner"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-statement-id [input] #:http.request.field{:value input, :shape "StatementId"})

(clojure.core/defn- ser-alias [input] #:http.request.field{:value input, :shape "Alias"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-additional-version [input] #:http.request.field{:value input, :shape "AdditionalVersion"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-function-version [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL"} input), :shape "FunctionVersion"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-memory-size [input] #:http.request.field{:value input, :shape "MemorySize"})

(clojure.core/defn- ser-namespaced-statement-id [input] #:http.request.field{:value input, :shape "NamespacedStatementId"})

(clojure.core/defn- ser-log-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Tail" "Tail", :tail "Tail"} input), :shape "LogType"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-weight [input] #:http.request.field{:value input, :shape "Weight"})

(clojure.core/defn- ser-environment-variable-value [input] #:http.request.field{:value input, :shape "EnvironmentVariableValue"})

(clojure.core/defn- ser-kms-key-arn [input] #:http.request.field{:value input, :shape "KMSKeyArn"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-invocation-type [input] #:http.request.field{:value (clojure.core/get {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"} input), :shape "InvocationType"})

(clojure.core/defn- ser-blob-stream [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BlobStream"})

(clojure.core/defn- ser-max-list-items [input] #:http.request.field{:value input, :shape "MaxListItems"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-tracing-mode [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"} input), :shape "TracingMode"})

(clojure.core/defn- ser-environment [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Environment", :type "structure"} (clojure.core/contains? input :variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :variables)) #:http.request.field{:name "Variables", :shape "EnvironmentVariables"}))))

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-master-region [input] #:http.request.field{:value input, :shape "MasterRegion"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-environment-variable-name [input] #:http.request.field{:value input, :shape "EnvironmentVariableName"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"}))))

(clojure.core/defn- ser-qualifier [input] #:http.request.field{:value input, :shape "Qualifier"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-event-source-token [input] #:http.request.field{:value input, :shape "EventSourceToken"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-principal [input] #:http.request.field{:value input, :shape "Principal"})

(clojure.core/defn- ser-additional-version-weights [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-additional-version k) #:http.request.field{:map-info "key", :shape "AdditionalVersion"}) (clojure.core/into (ser-weight v) #:http.request.field{:map-info "value", :shape "Weight"})])) input), :shape "AdditionalVersionWeights", :type "map"})

(clojure.core/defn- ser-action [input] #:http.request.field{:value input, :shape "Action"})

(clojure.core/defn- ser-event-source-position [input] #:http.request.field{:value (clojure.core/get {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"} input), :shape "EventSourcePosition"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"}) (clojure.core/into (ser-runtime (input :runtime)) #:http.request.field{:name "Runtime", :shape "Runtime"}) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn"}) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler"}) (clojure.core/into (ser-function-code (input :code)) #:http.request.field{:name "Code", :shape "FunctionCode"})]} (clojure.core/contains? input :tracing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-config (input :tracing-config)) #:http.request.field{:name "TracingConfig", :shape "TracingConfig"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :dead-letter-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dead-letter-config (input :dead-letter-config)) #:http.request.field{:name "DeadLetterConfig", :shape "DeadLetterConfig"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KMSKeyArn", :shape "KMSKeyArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment (input :environment)) #:http.request.field{:name "Environment", :shape "Environment"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :publish) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publish)) #:http.request.field{:name "Publish", :shape "Boolean"}))))

(clojure.core/defn- req-update-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"}) (clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias", :location "uri", :location-name "Name"})]} (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :routing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-routing-configuration (input :routing-config)) #:http.request.field{:name "RoutingConfig", :shape "AliasRoutingConfiguration"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-put-function-concurrency-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-reserved-concurrent-executions (input :reserved-concurrent-executions)) #:http.request.field{:name "ReservedConcurrentExecutions", :shape "ReservedConcurrentExecutions"})]}))

(clojure.core/defn- req-list-event-source-mappings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :event-source-arn) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :event-source-arn)) #:http.request.field{:name "EventSourceArn", :shape "Arn", :location "querystring", :location-name "EventSourceArn"})) (clojure.core/contains? input :function-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "querystring", :location-name "FunctionName"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-function-code-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :zip-file) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :zip-file)) #:http.request.field{:name "ZipFile", :shape "Blob"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"})) (clojure.core/contains? input :s-3-object-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :s-3-object-version)) #:http.request.field{:name "S3ObjectVersion", :shape "S3ObjectVersion"})) (clojure.core/contains? input :publish) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publish)) #:http.request.field{:name "Publish", :shape "Boolean"})) (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Boolean"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-delete-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/defn- req-delete-function-concurrency-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]}))

(clojure.core/defn- req-delete-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-invocation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :invocation-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-invocation-type (input :invocation-type)) #:http.request.field{:name "InvocationType", :shape "InvocationType", :location "header", :location-name "X-Amz-Invocation-Type"})) (clojure.core/contains? input :log-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-type (input :log-type)) #:http.request.field{:name "LogType", :shape "LogType", :location "header", :location-name "X-Amz-Log-Type"})) (clojure.core/contains? input :client-context) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-context)) #:http.request.field{:name "ClientContext", :shape "String", :location "header", :location-name "X-Amz-Client-Context"})) (clojure.core/contains? input :payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :payload)) #:http.request.field{:name "Payload", :shape "Blob"})) (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias"}) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :routing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-routing-configuration (input :routing-config)) #:http.request.field{:name "RoutingConfig", :shape "AliasRoutingConfiguration"}))))

(clojure.core/defn- req-get-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/defn- req-add-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"}) (clojure.core/into (ser-action (input :action)) #:http.request.field{:name "Action", :shape "Action"}) (clojure.core/into (ser-principal (input :principal)) #:http.request.field{:name "Principal", :shape "Principal"})]} (clojure.core/contains? input :source-account) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-owner (input :source-account)) #:http.request.field{:name "SourceAccount", :shape "SourceOwner"})) (clojure.core/contains? input :source-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :source-arn)) #:http.request.field{:name "SourceArn", :shape "Arn"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"})) (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"})) (clojure.core/contains? input :event-source-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-source-token (input :event-source-token)) #:http.request.field{:name "EventSourceToken", :shape "EventSourceToken"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-arn (input :resource)) #:http.request.field{:name "Resource", :shape "FunctionArn", :location "uri", :location-name "ARN"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-get-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"}) (clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias", :location "uri", :location-name "Name"})]}))

(clojure.core/defn- req-get-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-invoke-async-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-blob-stream (input :invoke-args)) #:http.request.field{:name "InvokeArgs", :shape "BlobStream"})]}))

(clojure.core/defn- req-update-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]} (clojure.core/contains? input :function-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-size (input :batch-size)) #:http.request.field{:name "BatchSize", :shape "BatchSize"}))))

(clojure.core/defn- req-delete-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"}) (clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias", :location "uri", :location-name "Name"})]}))

(clojure.core/defn- req-publish-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :code-sha-256) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :code-sha-256)) #:http.request.field{:name "CodeSha256", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-remove-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"}) (clojure.core/into (ser-namespaced-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "NamespacedStatementId", :location "uri", :location-name "StatementId"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String", :location "querystring", :location-name "RevisionId"}))))

(clojure.core/defn- req-get-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-update-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :tracing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-config (input :tracing-config)) #:http.request.field{:name "TracingConfig", :shape "TracingConfig"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :dead-letter-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dead-letter-config (input :dead-letter-config)) #:http.request.field{:name "DeadLetterConfig", :shape "DeadLetterConfig"})) (clojure.core/contains? input :handler) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler"})) (clojure.core/contains? input :runtime) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-runtime (input :runtime)) #:http.request.field{:name "Runtime", :shape "Runtime"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KMSKeyArn", :shape "KMSKeyArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment (input :environment)) #:http.request.field{:name "Environment", :shape "Environment"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-list-versions-by-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-functions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :master-region) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-master-region (input :master-region)) #:http.request.field{:name "MasterRegion", :shape "MasterRegion", :location "querystring", :location-name "MasterRegion"})) (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "FunctionVersion", :location "querystring", :location-name "FunctionVersion"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-create-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :event-source-arn)) #:http.request.field{:name "EventSourceArn", :shape "Arn"}) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"})]} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-size (input :batch-size)) #:http.request.field{:name "BatchSize", :shape "BatchSize"})) (clojure.core/contains? input :starting-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-source-position (input :starting-position)) #:http.request.field{:name "StartingPosition", :shape "EventSourcePosition"})) (clojure.core/contains? input :starting-position-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :starting-position-timestamp)) #:http.request.field{:name "StartingPositionTimestamp", :shape "Date"}))))

(clojure.core/defn- req-get-account-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-aliases-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version", :location "querystring", :location-name "FunctionVersion"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-arn (input :resource)) #:http.request.field{:name "Resource", :shape "FunctionArn", :location "uri", :location-name "ARN"})], :querystring [(clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList", :location "querystring", :location-name "tagKeys"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-arn (input :resource)) #:http.request.field{:name "Resource", :shape "FunctionArn", :location "uri", :location-name "ARN"})]}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31.create-function-request/role :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31.create-function-request/code] :opt-un [:portkey.aws.lambda.-2015-03-31/tracing-config :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/tags :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31/environment :portkey.aws.lambda.-2015-03-31/vpc-config :portkey.aws.lambda.-2015-03-31.create-function-request/publish]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/reserved-concurrent-executions (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mappings-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.update-alias-request/name] :opt-un [:portkey.aws.lambda.-2015-03-31.update-alias-request/function-version :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.update-alias-request/routing-config :portkey.aws.lambda.-2015-03-31.update-alias-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/type :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/reserved-concurrent-executions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/event-source-arn :portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config/mode]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/request-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.request-too-large-exception/type :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnet-id-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnet-id-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-subnet-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-subnet-id-exception/type :portkey.aws.lambda.-2015-03-31.invalid-subnet-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ip-address-limit-reached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/type :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code/zip-file :portkey.aws.lambda.-2015-03-31/s-3-bucket :portkey.aws.lambda.-2015-03-31/s-3-key :portkey.aws.lambda.-2015-03-31/s-3-object-version]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/subnet-id :max-count 16))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/batch-size (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 140)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.precondition-failed-exception/type :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unreserved-concurrent-executions (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/security-group-id :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timeout (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/versions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/next-marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/versions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/function-count (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-usage (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-usage/total-code-size :portkey.aws.lambda.-2015-03-31.account-usage/function-count]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/dry-run (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-code-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.update-function-code-request/zip-file :portkey.aws.lambda.-2015-03-31/s-3-bucket :portkey.aws.lambda.-2015-03-31/s-3-key :portkey.aws.lambda.-2015-03-31/s-3-object-version :portkey.aws.lambda.-2015-03-31.update-function-code-request/publish :portkey.aws.lambda.-2015-03-31.update-function-code-request/dry-run :portkey.aws.lambda.-2015-03-31.update-function-code-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/uuid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variables (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/environment-variable-name :portkey.aws.lambda.-2015-03-31/environment-variable-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-routing-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/additional-version-weights]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.dead-letter-config/target-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/resource-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/dead-letter-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.dead-letter-config/target-arn]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/tags]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[^\s]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 170)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids :portkey.aws.lambda.-2015-03-31/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/runtime #{"go1.x" "dotnetcore2.0" :dotnetcore-20 :nodejs "dotnetcore1.0" "java8" "dotnetcore2.1" :python-36 :java-8 :nodejs-810 :nodejs-43 "nodejs4.3" "python2.7" "nodejs4.3-edge" :dotnetcore-10 "nodejs8.10" :go-1x "nodejs6.10" "python3.6" :dotnetcore-21 :nodejs-43edge :nodejs-610 "nodejs" :python-27})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.service-exception/type :portkey.aws.lambda.-2015-03-31.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"\d{12}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-response/variables :portkey.aws.lambda.-2015-03-31.environment-response/error]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kms-not-found-exception/type :portkey.aws.lambda.-2015-03-31.kms-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-invalid-state-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-invalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-invalid-state-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kms-invalid-state-exception/type :portkey.aws.lambda.-2015-03-31.kms-invalid-state-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-in-use-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-in-use-exception/type :portkey.aws.lambda.-2015-03-31.resource-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/type :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tags (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/tag-key :portkey.aws.lambda.-2015-03-31/tag-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker :portkey.aws.lambda.-2015-03-31.list-functions-response/functions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[0-9]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/client-context (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.invocation-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/invocation-type :portkey.aws.lambda.-2015-03-31/log-type :portkey.aws.lambda.-2015-03-31.invocation-request/client-context :portkey.aws.lambda.-2015-03-31.invocation-request/payload :portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-disabled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kms-disabled-exception/type :portkey.aws.lambda.-2015-03-31.kms-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-function-response/configuration :portkey.aws.lambda.-2015-03-31.get-function-response/code :portkey.aws.lambda.-2015-03-31/tags :portkey.aws.lambda.-2015-03-31/concurrency]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-version #{:all "ALL"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.create-alias-request/name :portkey.aws.lambda.-2015-03-31.create-alias-request/function-version] :opt-un [:portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.create-alias-request/routing-config]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/type :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/memory-size (clojure.spec.alpha/int-in 128 3008))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-access-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kms-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kms-access-denied-exception/type :portkey.aws.lambda.-2015-03-31.kms-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-account (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/source-owner))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/statement-id :portkey.aws.lambda.-2015-03-31/action :portkey.aws.lambda.-2015-03-31/principal] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-request/source-account :portkey.aws.lambda.-2015-03-31.add-permission-request/source-arn :portkey.aws.lambda.-2015-03-31.add-permission-request/revision-id :portkey.aws.lambda.-2015-03-31/qualifier :portkey.aws.lambda.-2015-03-31/event-source-token]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/account-limit :portkey.aws.lambda.-2015-03-31/account-usage]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/throttle-reason #{:concurrent-invocation-limit-exceeded :function-invocation-rate-limit-exceeded :reserved-function-invocation-rate-limit-exceeded "ReservedFunctionInvocationRateLimitExceeded" "ConcurrentInvocationLimitExceeded" :caller-rate-limit-exceeded "CallerRateLimitExceeded" "FunctionInvocationRateLimitExceeded" :reserved-function-concurrent-invocation-limit-exceeded "ReservedFunctionConcurrentInvocationLimitExceeded"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.tag-resource-request/resource :portkey.aws.lambda.-2015-03-31/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 100)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/log-type #{"None" :tail "Tail" :none})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.get-alias-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/tag-key))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.eni-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.eni-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/eni-limit-reached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.eni-limit-reached-exception/type :portkey.aws.lambda.-2015-03-31.eni-limit-reached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/concurrency (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/reserved-concurrent-executions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-response/statement (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-response/statement]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-policy-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/weight clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/status-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/function-error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/log-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/executed-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invocation-response/status-code :portkey.aws.lambda.-2015-03-31.invocation-response/function-error :portkey.aws.lambda.-2015-03-31.invocation-response/log-result :portkey.aws.lambda.-2015-03-31.invocation-response/payload :portkey.aws.lambda.-2015-03-31.invocation-response/executed-version]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-not-found-exception/type :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob-stream))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.invoke-async-request/function-name :portkey.aws.lambda.-2015-03-31.invoke-async-request/invoke-args] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-unzipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-zipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/concurrent-executions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-limit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-limit/total-code-size :portkey.aws.lambda.-2015-03-31.account-limit/code-size-unzipped :portkey.aws.lambda.-2015-03-31.account-limit/code-size-zipped :portkey.aws.lambda.-2015-03-31.account-limit/concurrent-executions :portkey.aws.lambda.-2015-03-31/unreserved-concurrent-executions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-error/error-code :portkey.aws.lambda.-2015-03-31.environment-error/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid] :opt-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/enabled :portkey.aws.lambda.-2015-03-31/batch-size]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-type #{"DryRun" "RequestResponse" "Event" :event :request-response :dry-run})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-policy-response/policy :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/max-list-items (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.delete-alias-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/code-sha-256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/publish-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.publish-version-request/code-sha-256 :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.publish-version-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/statement-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-statement-id))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/remove-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31.remove-permission-request/statement-id] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier :portkey.aws.lambda.-2015-03-31.remove-permission-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-mode #{"Active" "PassThrough" :pass-through :active})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invoke-async-response/status]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/tracing-config :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31/environment :portkey.aws.lambda.-2015-03-31/vpc-config :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment/variables]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/http-status clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha-256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn :portkey.aws.lambda.-2015-03-31.function-configuration/function-name :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31.function-configuration/role :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified :portkey.aws.lambda.-2015-03-31.function-configuration/environment :portkey.aws.lambda.-2015-03-31.function-configuration/code-size :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id :portkey.aws.lambda.-2015-03-31/version :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha-256 :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 3 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 63)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 128)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/master-region :portkey.aws.lambda.-2015-03-31/function-version :portkey.aws.lambda.-2015-03-31.list-functions-request/marker :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 0 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 256)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 1 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 1024)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config-response/mode]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #".*" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version-weights (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/additional-version :portkey.aws.lambda.-2015-03-31/weight))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/alias-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.alias-configuration/alias-arn :portkey.aws.lambda.-2015-03-31.alias-configuration/name :portkey.aws.lambda.-2015-03-31.alias-configuration/function-version :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.alias-configuration/routing-config :portkey.aws.lambda.-2015-03-31.alias-configuration/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-throttled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec-2-throttled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec-2-throttled-exception/type :portkey.aws.lambda.-2015-03-31.ec-2-throttled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-access-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec-2-access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec-2-access-denied-exception/type :portkey.aws.lambda.-2015-03-31.ec-2-access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-position))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position-timestamp (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/event-source-arn :portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/enabled :portkey.aws.lambda.-2015-03-31/batch-size :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position-timestamp]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-processing-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state-transition-reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/uuid :portkey.aws.lambda.-2015-03-31/batch-size :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/event-source-arn :portkey.aws.lambda.-2015-03-31/function-arn :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-modified :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-processing-result :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state-transition-reason]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/ec-2-error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec-2-unexpected-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/type :portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/message :portkey.aws.lambda.-2015-03-31.ec-2-unexpected-exception/ec-2-error-code]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/type :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code-location/repository-type :portkey.aws.lambda.-2015-03-31.function-code-location/location]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-security-group-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/type :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.untag-resource-request/resource :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-position #{"LATEST" "TRIM_HORIZON" :at-timestamp "AT_TIMESTAMP" :latest :trim-horizon})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-tags-request/resource] :opt-un []))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-alias ([create-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateAlias", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn delete-function ([delete-function-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFunction", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings ([] (list-event-source-mappings {})) ([list-event-source-mappings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-event-source-mappings-request list-event-source-mappings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListEventSourceMappings", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency ([delete-function-concurrency-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-function-concurrency-request delete-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFunctionConcurrency", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping ([delete-event-source-mapping-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-event-source-mapping-request delete-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/action "DeleteEventSourceMapping", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn invoke ([invocation-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-invocation-request invocation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invocation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/invocations", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invocation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "Invoke", :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda.-2015-03-31/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda.-2015-03-31/invalid-subnet-id-exception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda.-2015-03-31/subnet-ip-address-limit-reached-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "KMSNotFoundException" :portkey.aws.lambda.-2015-03-31/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.lambda.-2015-03-31/kms-invalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda.-2015-03-31/kms-disabled-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda.-2015-03-31/kms-access-denied-exception, "ENILimitReachedException" :portkey.aws.lambda.-2015-03-31/eni-limit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda.-2015-03-31/ec-2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda.-2015-03-31/ec-2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda.-2015-03-31/ec-2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda.-2015-03-31/invalid-security-group-id-exception}})))))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invocation-response))

(clojure.core/defn get-account-settings ([] (get-account-settings {})) ([get-account-settings-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2016-08-19/account-settings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetAccountSettings", :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-account-settings-response))

(clojure.core/defn invoke-async ([invoke-async-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-invoke-async-request invoke-async-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invoke-async-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/invoke-async/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invoke-async-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/action "InvokeAsync", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception}})))))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invoke-async-response))

(clojure.core/defn get-function-configuration ([get-function-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-function-configuration-request get-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetFunctionConfiguration", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn update-function-code ([update-function-code-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-function-code-request update-function-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/code", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateFunctionCode", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn list-versions-by-function ([list-versions-by-function-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-versions-by-function-request list-versions-by-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListVersionsByFunction", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping ([update-event-source-mapping-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-event-source-mapping-request update-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/action "UpdateEventSourceMapping", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-tags-response))

(clojure.core/defn update-alias ([update-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-alias-request update-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateAlias", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn get-event-source-mapping ([get-event-source-mapping-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-event-source-mapping-request get-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetEventSourceMapping", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-function ([get-function-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetFunction", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-function-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetPolicy", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-policy-response))

(clojure.core/defn add-permission ([add-permission-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-add-permission-request add-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/add-permission-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/add-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "AddPermission", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-permission-response))

(clojure.core/defn create-event-source-mapping ([create-event-source-mapping-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-event-source-mapping-request create-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/action "CreateEventSourceMapping", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-alias ([get-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-alias-request get-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetAlias", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn list-aliases ([list-aliases-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListAliases", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-aliases-response))

(clojure.core/defn list-functions ([] (list-functions {})) ([list-functions-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListFunctions", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-functions-response))

(clojure.core/defn remove-permission ([remove-permission-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy/{StatementId}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/remove-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "RemovePermission", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias ([delete-alias-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteAlias", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function ([create-function-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-create-function-request create-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFunction", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn publish-version ([publish-version-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-publish-version-request publish-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/publish-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "PublishVersion", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn put-function-concurrency ([put-function-concurrency-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-function-concurrency-request put-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/concurrency, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutFunctionConcurrency", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/concurrency))

(clojure.core/defn update-function-configuration ([update-function-configuration-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-update-function-configuration-request update-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateFunctionConfiguration", :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
