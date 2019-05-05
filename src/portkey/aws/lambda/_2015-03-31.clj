(ns portkey.aws.lambda.-2015-03-31 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "lambda", :region "us-gov-east-1"},
    :ssl-common-name "lambda.us-gov-east-1.amazonaws.com",
    :endpoint "https://lambda.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "lambda", :region "eu-north-1"},
    :ssl-common-name "lambda.eu-north-1.amazonaws.com",
    :endpoint "https://lambda.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-reserved-concurrent-executions)

(clojure.core/declare ser-tracing-config)

(clojure.core/declare ser-function-code)

(clojure.core/declare ser-s-3-object-version)

(clojure.core/declare ser-function-arn)

(clojure.core/declare ser-subnet-ids)

(clojure.core/declare ser-batch-size)

(clojure.core/declare ser-function-name)

(clojure.core/declare ser-layer-version-content-input)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-timeout)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-layer-permission-allowed-action)

(clojure.core/declare ser-environment-variables)

(clojure.core/declare ser-alias-routing-configuration)

(clojure.core/declare ser-dead-letter-config)

(clojure.core/declare ser-handler)

(clojure.core/declare ser-namespaced-function-name)

(clojure.core/declare ser-runtime)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-source-owner)

(clojure.core/declare ser-layer-version-number)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-statement-id)

(clojure.core/declare ser-alias)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-organization-id)

(clojure.core/declare ser-additional-version)

(clojure.core/declare ser-enabled)

(clojure.core/declare ser-function-version)

(clojure.core/declare ser-date)

(clojure.core/declare ser-memory-size)

(clojure.core/declare ser-namespaced-statement-id)

(clojure.core/declare ser-log-type)

(clojure.core/declare ser-license-info)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-weight)

(clojure.core/declare ser-environment-variable-value)

(clojure.core/declare ser-kms-key-arn)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-layer-name)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-invocation-type)

(clojure.core/declare ser-blob-stream)

(clojure.core/declare ser-max-list-items)

(clojure.core/declare ser-string)

(clojure.core/declare ser-tracing-mode)

(clojure.core/declare ser-layer-list)

(clojure.core/declare ser-compatible-runtimes)

(clojure.core/declare ser-environment)

(clojure.core/declare ser-s-3-key)

(clojure.core/declare ser-layer-version-arn)

(clojure.core/declare ser-master-region)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-environment-variable-name)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-qualifier)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-max-layer-list-items)

(clojure.core/declare ser-event-source-token)

(clojure.core/declare ser-version)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-principal)

(clojure.core/declare ser-additional-version-weights)

(clojure.core/declare ser-action)

(clojure.core/declare ser-event-source-position)

(clojure.core/declare ser-layer-permission-allowed-principal)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-reserved-concurrent-executions [input] #:http.request.field{:value input, :shape "ReservedConcurrentExecutions"})

(clojure.core/defn- ser-tracing-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TracingConfig", :type "structure"} (clojure.core/contains? input :mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-mode (input :mode)) #:http.request.field{:name "Mode", :shape "TracingMode"}))))

(clojure.core/defn- ser-function-code [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FunctionCode", :type "structure"} (clojure.core/contains? input :zip-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :zip-file)) #:http.request.field{:name "ZipFile", :shape "Blob"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"})) (clojure.core/contains? input :s-3-object-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :s-3-object-version)) #:http.request.field{:name "S3ObjectVersion", :shape "S3ObjectVersion"}))))

(clojure.core/defn- ser-s-3-object-version [input] #:http.request.field{:value input, :shape "S3ObjectVersion"})

(clojure.core/defn- ser-function-arn [input] #:http.request.field{:value input, :shape "FunctionArn"})

(clojure.core/defn- ser-subnet-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "SubnetIds", :type "list", :max 16})

(clojure.core/defn- ser-batch-size [input] #:http.request.field{:value input, :shape "BatchSize"})

(clojure.core/defn- ser-function-name [input] #:http.request.field{:value input, :shape "FunctionName"})

(clojure.core/defn- ser-layer-version-content-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LayerVersionContentInput", :type "structure"} (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"})) (clojure.core/contains? input :s-3-object-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :s-3-object-version)) #:http.request.field{:name "S3ObjectVersion", :shape "S3ObjectVersion"})) (clojure.core/contains? input :zip-file) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :zip-file)) #:http.request.field{:name "ZipFile", :shape "Blob"}))))

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-timeout [input] #:http.request.field{:value input, :shape "Timeout"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-layer-permission-allowed-action [input] #:http.request.field{:value input, :shape "LayerPermissionAllowedAction"})

(clojure.core/defn- ser-environment-variables [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-variable-name k) #:http.request.field{:map-info "key", :shape "EnvironmentVariableName"}) (clojure.core/into (ser-environment-variable-value v) #:http.request.field{:map-info "value", :shape "EnvironmentVariableValue"})])) input), :shape "EnvironmentVariables", :type "map", :sensitive true})

(clojure.core/defn- ser-alias-routing-configuration [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "AliasRoutingConfiguration", :type "structure"} (clojure.core/contains? input :additional-version-weights) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-version-weights (input :additional-version-weights)) #:http.request.field{:name "AdditionalVersionWeights", :shape "AdditionalVersionWeights"}))))

(clojure.core/defn- ser-dead-letter-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DeadLetterConfig", :type "structure"} (clojure.core/contains? input :target-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn (input :target-arn)) #:http.request.field{:name "TargetArn", :shape "ResourceArn"}))))

(clojure.core/defn- ser-handler [input] #:http.request.field{:value input, :shape "Handler"})

(clojure.core/defn- ser-namespaced-function-name [input] #:http.request.field{:value input, :shape "NamespacedFunctionName"})

(clojure.core/defn- ser-runtime [input] #:http.request.field{:value (clojure.core/get {"go1.x" "go1.x", "dotnetcore2.0" "dotnetcore2.0", "ruby2.5" "ruby2.5", "python3.7" "python3.7", :dotnetcore-20 "dotnetcore2.0", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", "dotnetcore2.1" "dotnetcore2.1", :python-36 "python3.6", :java-8 "java8", "provided" "provided", :nodejs-810 "nodejs8.10", :nodejs-43 "nodejs4.3", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", :python-37 "python3.7", "nodejs4.3-edge" "nodejs4.3-edge", :dotnetcore-10 "dotnetcore1.0", "nodejs8.10" "nodejs8.10", :go-1x "go1.x", "nodejs6.10" "nodejs6.10", :provided "provided", "python3.6" "python3.6", :dotnetcore-21 "dotnetcore2.1", :nodejs-43edge "nodejs4.3-edge", :nodejs-610 "nodejs6.10", "nodejs" "nodejs", :ruby-25 "ruby2.5", :python-27 "python2.7"} input), :shape "Runtime"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-source-owner [input] #:http.request.field{:value input, :shape "SourceOwner"})

(clojure.core/defn- ser-layer-version-number [input] #:http.request.field{:value input, :shape "LayerVersionNumber"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-statement-id [input] #:http.request.field{:value input, :shape "StatementId"})

(clojure.core/defn- ser-alias [input] #:http.request.field{:value input, :shape "Alias"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map"})

(clojure.core/defn- ser-organization-id [input] #:http.request.field{:value input, :shape "OrganizationId"})

(clojure.core/defn- ser-additional-version [input] #:http.request.field{:value input, :shape "AdditionalVersion"})

(clojure.core/defn- ser-enabled [input] #:http.request.field{:value input, :shape "Enabled"})

(clojure.core/defn- ser-function-version [input] #:http.request.field{:value (clojure.core/get {"ALL" "ALL", :all "ALL"} input), :shape "FunctionVersion"})

(clojure.core/defn- ser-date [input] #:http.request.field{:value input, :shape "Date"})

(clojure.core/defn- ser-memory-size [input] #:http.request.field{:value input, :shape "MemorySize"})

(clojure.core/defn- ser-namespaced-statement-id [input] #:http.request.field{:value input, :shape "NamespacedStatementId"})

(clojure.core/defn- ser-log-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Tail" "Tail", :tail "Tail"} input), :shape "LogType"})

(clojure.core/defn- ser-license-info [input] #:http.request.field{:value input, :shape "LicenseInfo"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-weight [input] #:http.request.field{:value input, :shape "Weight"})

(clojure.core/defn- ser-environment-variable-value [input] #:http.request.field{:value input, :shape "EnvironmentVariableValue"})

(clojure.core/defn- ser-kms-key-arn [input] #:http.request.field{:value input, :shape "KMSKeyArn"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-layer-name [input] #:http.request.field{:value input, :shape "LayerName"})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-invocation-type [input] #:http.request.field{:value (clojure.core/get {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"} input), :shape "InvocationType"})

(clojure.core/defn- ser-blob-stream [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BlobStream"})

(clojure.core/defn- ser-max-list-items [input] #:http.request.field{:value input, :shape "MaxListItems"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-tracing-mode [input] #:http.request.field{:value (clojure.core/get {"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"} input), :shape "TracingMode"})

(clojure.core/defn- ser-layer-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-layer-version-arn coll) #:http.request.field{:shape "LayerVersionArn"}))) input), :shape "LayerList", :type "list"})

(clojure.core/defn- ser-compatible-runtimes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-runtime coll) #:http.request.field{:shape "Runtime"}))) input), :shape "CompatibleRuntimes", :type "list", :max 5})

(clojure.core/defn- ser-environment [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Environment", :type "structure"} (clojure.core/contains? input :variables) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-variables (input :variables)) #:http.request.field{:name "Variables", :shape "EnvironmentVariables"}))))

(clojure.core/defn- ser-s-3-key [input] #:http.request.field{:value input, :shape "S3Key"})

(clojure.core/defn- ser-layer-version-arn [input] #:http.request.field{:value input, :shape "LayerVersionArn"})

(clojure.core/defn- ser-master-region [input] #:http.request.field{:value input, :shape "MasterRegion"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-environment-variable-name [input] #:http.request.field{:value input, :shape "EnvironmentVariableName"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VpcConfig", :type "structure"} (clojure.core/contains? input :subnet-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-ids (input :subnet-ids)) #:http.request.field{:name "SubnetIds", :shape "SubnetIds"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"}))))

(clojure.core/defn- ser-qualifier [input] #:http.request.field{:value input, :shape "Qualifier"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-max-layer-list-items [input] #:http.request.field{:value input, :shape "MaxLayerListItems"})

(clojure.core/defn- ser-event-source-token [input] #:http.request.field{:value input, :shape "EventSourceToken"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-principal [input] #:http.request.field{:value input, :shape "Principal"})

(clojure.core/defn- ser-additional-version-weights [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-additional-version k) #:http.request.field{:map-info "key", :shape "AdditionalVersion"}) (clojure.core/into (ser-weight v) #:http.request.field{:map-info "value", :shape "Weight"})])) input), :shape "AdditionalVersionWeights", :type "map"})

(clojure.core/defn- ser-action [input] #:http.request.field{:value input, :shape "Action"})

(clojure.core/defn- ser-event-source-position [input] #:http.request.field{:value (clojure.core/get {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"} input), :shape "EventSourcePosition"})

(clojure.core/defn- ser-layer-permission-allowed-principal [input] #:http.request.field{:value input, :shape "LayerPermissionAllowedPrincipal"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-function-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"}) (clojure.core/into (ser-runtime (input :runtime)) #:http.request.field{:name "Runtime", :shape "Runtime"}) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn"}) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler"}) (clojure.core/into (ser-function-code (input :code)) #:http.request.field{:name "Code", :shape "FunctionCode"})]} (clojure.core/contains? input :tracing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-config (input :tracing-config)) #:http.request.field{:name "TracingConfig", :shape "TracingConfig"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :layers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-layer-list (input :layers)) #:http.request.field{:name "Layers", :shape "LayerList"})) (clojure.core/contains? input :dead-letter-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dead-letter-config (input :dead-letter-config)) #:http.request.field{:name "DeadLetterConfig", :shape "DeadLetterConfig"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KMSKeyArn", :shape "KMSKeyArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment (input :environment)) #:http.request.field{:name "Environment", :shape "Environment"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :publish) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publish)) #:http.request.field{:name "Publish", :shape "Boolean"}))))

(clojure.core/defn- req-update-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"}) (clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias", :location "uri", :location-name "Name"})]} (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :routing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-routing-configuration (input :routing-config)) #:http.request.field{:name "RoutingConfig", :shape "AliasRoutingConfiguration"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-put-function-concurrency-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-reserved-concurrent-executions (input :reserved-concurrent-executions)) #:http.request.field{:name "ReservedConcurrentExecutions", :shape "ReservedConcurrentExecutions"})]}))

(clojure.core/defn- req-list-event-source-mappings-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :event-source-arn) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :event-source-arn)) #:http.request.field{:name "EventSourceArn", :shape "Arn", :location "querystring", :location-name "EventSourceArn"})) (clojure.core/contains? input :function-name) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "querystring", :location-name "FunctionName"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-function-code-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :zip-file) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :zip-file)) #:http.request.field{:name "ZipFile", :shape "Blob"})) (clojure.core/contains? input :s-3-bucket) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :s-3-bucket)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :s-3-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-key (input :s-3-key)) #:http.request.field{:name "S3Key", :shape "S3Key"})) (clojure.core/contains? input :s-3-object-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :s-3-object-version)) #:http.request.field{:name "S3ObjectVersion", :shape "S3ObjectVersion"})) (clojure.core/contains? input :publish) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :publish)) #:http.request.field{:name "Publish", :shape "Boolean"})) (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Boolean"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-delete-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/defn- req-publish-layer-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"})], :body [(clojure.core/into (ser-layer-version-content-input (input :content)) #:http.request.field{:name "Content", :shape "LayerVersionContentInput"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :compatible-runtimes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compatible-runtimes (input :compatible-runtimes)) #:http.request.field{:name "CompatibleRuntimes", :shape "CompatibleRuntimes"})) (clojure.core/contains? input :license-info) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-license-info (input :license-info)) #:http.request.field{:name "LicenseInfo", :shape "LicenseInfo"}))))

(clojure.core/defn- req-delete-function-concurrency-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]}))

(clojure.core/defn- req-delete-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-invocation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :invocation-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-invocation-type (input :invocation-type)) #:http.request.field{:name "InvocationType", :shape "InvocationType", :location "header", :location-name "X-Amz-Invocation-Type"})) (clojure.core/contains? input :log-type) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-type (input :log-type)) #:http.request.field{:name "LogType", :shape "LogType", :location "header", :location-name "X-Amz-Log-Type"})) (clojure.core/contains? input :client-context) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-context)) #:http.request.field{:name "ClientContext", :shape "String", :location "header", :location-name "X-Amz-Client-Context"})) (clojure.core/contains? input :payload) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-blob (input :payload)) #:http.request.field{:name "Payload", :shape "Blob"})) (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-create-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})], :body [(clojure.core/into (ser-alias (input :name)) #:http.request.field{:name "Name", :shape "Alias"}) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :routing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-routing-configuration (input :routing-config)) #:http.request.field{:name "RoutingConfig", :shape "AliasRoutingConfiguration"}))))

(clojure.core/defn- req-remove-layer-version-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"}) (clojure.core/into (ser-layer-version-number (input :version-number)) #:http.request.field{:name "VersionNumber", :shape "LayerVersionNumber", :location "uri", :location-name "VersionNumber"}) (clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId", :location "uri", :location-name "StatementId"})]} (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String", :location "querystring", :location-name "RevisionId"}))))

(clojure.core/defn- req-list-layers-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :compatible-runtime) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-runtime (input :compatible-runtime)) #:http.request.field{:name "CompatibleRuntime", :shape "Runtime", :location "querystring", :location-name "CompatibleRuntime"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-layer-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxLayerListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :uuid)) #:http.request.field{:name "UUID", :shape "String", :location "uri", :location-name "UUID"})]}))

(clojure.core/defn- req-add-layer-version-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"}) (clojure.core/into (ser-layer-version-number (input :version-number)) #:http.request.field{:name "VersionNumber", :shape "LayerVersionNumber", :location "uri", :location-name "VersionNumber"})], :body [(clojure.core/into (ser-statement-id (input :statement-id)) #:http.request.field{:name "StatementId", :shape "StatementId"}) (clojure.core/into (ser-layer-permission-allowed-action (input :action)) #:http.request.field{:name "Action", :shape "LayerPermissionAllowedAction"}) (clojure.core/into (ser-layer-permission-allowed-principal (input :principal)) #:http.request.field{:name "Principal", :shape "LayerPermissionAllowedPrincipal"})]} (clojure.core/contains? input :organization-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organization-id (input :organization-id)) #:http.request.field{:name "OrganizationId", :shape "OrganizationId"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String", :location "querystring", :location-name "RevisionId"}))))

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

(clojure.core/defn- req-update-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :tracing-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tracing-config (input :tracing-config)) #:http.request.field{:name "TracingConfig", :shape "TracingConfig"})) (clojure.core/contains? input :timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timeout (input :timeout)) #:http.request.field{:name "Timeout", :shape "Timeout"})) (clojure.core/contains? input :layers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-layer-list (input :layers)) #:http.request.field{:name "Layers", :shape "LayerList"})) (clojure.core/contains? input :dead-letter-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dead-letter-config (input :dead-letter-config)) #:http.request.field{:name "DeadLetterConfig", :shape "DeadLetterConfig"})) (clojure.core/contains? input :handler) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-handler (input :handler)) #:http.request.field{:name "Handler", :shape "Handler"})) (clojure.core/contains? input :runtime) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-runtime (input :runtime)) #:http.request.field{:name "Runtime", :shape "Runtime"})) (clojure.core/contains? input :memory-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-memory-size (input :memory-size)) #:http.request.field{:name "MemorySize", :shape "MemorySize"})) (clojure.core/contains? input :role) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role)) #:http.request.field{:name "Role", :shape "RoleArn"})) (clojure.core/contains? input :kms-key-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-arn (input :kms-key-arn)) #:http.request.field{:name "KMSKeyArn", :shape "KMSKeyArn"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment (input :environment)) #:http.request.field{:name "Environment", :shape "Environment"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :revision-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :revision-id)) #:http.request.field{:name "RevisionId", :shape "String"}))))

(clojure.core/defn- req-list-versions-by-function-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-functions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :master-region) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-master-region (input :master-region)) #:http.request.field{:name "MasterRegion", :shape "MasterRegion", :location "querystring", :location-name "MasterRegion"})) (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-function-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "FunctionVersion", :location "querystring", :location-name "FunctionVersion"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-layer-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"})]} (clojure.core/contains? input :compatible-runtime) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-runtime (input :compatible-runtime)) #:http.request.field{:name "CompatibleRuntime", :shape "Runtime", :location "querystring", :location-name "CompatibleRuntime"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-layer-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxLayerListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-function-configuration-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-namespaced-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "NamespacedFunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :qualifier) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-qualifier (input :qualifier)) #:http.request.field{:name "Qualifier", :shape "Qualifier", :location "querystring", :location-name "Qualifier"}))))

(clojure.core/defn- req-get-layer-version-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"}) (clojure.core/into (ser-layer-version-number (input :version-number)) #:http.request.field{:name "VersionNumber", :shape "LayerVersionNumber", :location "uri", :location-name "VersionNumber"})]}))

(clojure.core/defn- req-create-event-source-mapping-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :event-source-arn)) #:http.request.field{:name "EventSourceArn", :shape "Arn"}) (clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName"})]} (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enabled (input :enabled)) #:http.request.field{:name "Enabled", :shape "Enabled"})) (clojure.core/contains? input :batch-size) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-size (input :batch-size)) #:http.request.field{:name "BatchSize", :shape "BatchSize"})) (clojure.core/contains? input :starting-position) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-source-position (input :starting-position)) #:http.request.field{:name "StartingPosition", :shape "EventSourcePosition"})) (clojure.core/contains? input :starting-position-timestamp) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-date (input :starting-position-timestamp)) #:http.request.field{:name "StartingPositionTimestamp", :shape "Date"}))))

(clojure.core/defn- req-get-account-settings-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-aliases-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-name (input :function-name)) #:http.request.field{:name "FunctionName", :shape "FunctionName", :location "uri", :location-name "FunctionName"})]} (clojure.core/contains? input :function-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :function-version)) #:http.request.field{:name "FunctionVersion", :shape "Version", :location "querystring", :location-name "FunctionVersion"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :marker)) #:http.request.field{:name "Marker", :shape "String", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-list-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxListItems", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-layer-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"}) (clojure.core/into (ser-layer-version-number (input :version-number)) #:http.request.field{:name "VersionNumber", :shape "LayerVersionNumber", :location "uri", :location-name "VersionNumber"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-arn (input :resource)) #:http.request.field{:name "Resource", :shape "FunctionArn", :location "uri", :location-name "ARN"})], :querystring [(clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList", :location "querystring", :location-name "tagKeys"})]}))

(clojure.core/defn- req-delete-layer-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-layer-name (input :layer-name)) #:http.request.field{:name "LayerName", :shape "LayerName", :location "uri", :location-name "LayerName"}) (clojure.core/into (ser-layer-version-number (input :version-number)) #:http.request.field{:name "VersionNumber", :shape "LayerVersionNumber", :location "uri", :location-name "VersionNumber"})]}))

(clojure.core/defn- req-list-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-function-arn (input :resource)) #:http.request.field{:name "Resource", :shape "FunctionArn", :location "uri", :location-name "ARN"})]}))

(clojure.core/declare deser-reserved-concurrent-executions)

(clojure.core/declare deser-event-source-mappings-list)

(clojure.core/declare deser-layers-reference-list)

(clojure.core/declare deser-function-arn)

(clojure.core/declare deser-subnet-ids)

(clojure.core/declare deser-batch-size)

(clojure.core/declare deser-unreserved-concurrent-executions)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-timeout)

(clojure.core/declare deser-account-usage)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-environment-variables)

(clojure.core/declare deser-alias-routing-configuration)

(clojure.core/declare deser-dead-letter-config)

(clojure.core/declare deser-handler)

(clojure.core/declare deser-namespaced-function-name)

(clojure.core/declare deser-function-list)

(clojure.core/declare deser-vpc-config-response)

(clojure.core/declare deser-runtime)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-layer-version-number)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-environment-response)

(clojure.core/declare deser-alias)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-additional-version)

(clojure.core/declare deser-layer-versions-list)

(clojure.core/declare deser-date)

(clojure.core/declare deser-sensitive-string)

(clojure.core/declare deser-memory-size)

(clojure.core/declare deser-throttle-reason)

(clojure.core/declare deser-layer)

(clojure.core/declare deser-license-info)

(clojure.core/declare deser-concurrency)

(clojure.core/declare deser-weight)

(clojure.core/declare deser-layer-version-content-output)

(clojure.core/declare deser-account-limit)

(clojure.core/declare deser-environment-error)

(clojure.core/declare deser-environment-variable-value)

(clojure.core/declare deser-kms-key-arn)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-layer-name)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-layers-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-tracing-mode)

(clojure.core/declare deser-compatible-runtimes)

(clojure.core/declare deser-layer-version-arn)

(clojure.core/declare deser-http-status)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-environment-variable-name)

(clojure.core/declare deser-function-configuration)

(clojure.core/declare deser-long)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-version)

(clojure.core/declare deser-tracing-config-response)

(clojure.core/declare deser-blob)

(clojure.core/declare deser-layer-arn)

(clojure.core/declare deser-layer-versions-list-item)

(clojure.core/declare deser-additional-version-weights)

(clojure.core/declare deser-alias-configuration)

(clojure.core/declare deser-event-source-mapping-configuration)

(clojure.core/declare deser-function-code-location)

(clojure.core/declare deser-name-spaced-function-arn)

(clojure.core/declare deser-layers-list-item)

(clojure.core/defn- deser-reserved-concurrent-executions [input] input)

(clojure.core/defn- deser-event-source-mappings-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-source-mapping-configuration coll))) input))

(clojure.core/defn- deser-layers-reference-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer coll))) input))

(clojure.core/defn- deser-function-arn [input] input)

(clojure.core/defn- deser-subnet-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-batch-size [input] input)

(clojure.core/defn- deser-unreserved-concurrent-executions [input] input)

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-timeout [input] input)

(clojure.core/defn- deser-account-usage [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalCodeSize") (clojure.core/assoc :total-code-size (deser-long (input "TotalCodeSize"))) (clojure.core/contains? input "FunctionCount") (clojure.core/assoc :function-count (deser-long (input "FunctionCount")))))

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-environment-variables [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-environment-variable-name k) (deser-environment-variable-value v)])) input))

(clojure.core/defn- deser-alias-routing-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "AdditionalVersionWeights") (clojure.core/assoc :additional-version-weights (deser-additional-version-weights (input "AdditionalVersionWeights")))))

(clojure.core/defn- deser-dead-letter-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetArn") (clojure.core/assoc :target-arn (deser-resource-arn (input "TargetArn")))))

(clojure.core/defn- deser-handler [input] input)

(clojure.core/defn- deser-namespaced-function-name [input] input)

(clojure.core/defn- deser-function-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-function-configuration coll))) input))

(clojure.core/defn- deser-vpc-config-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SubnetIds") (clojure.core/assoc :subnet-ids (deser-subnet-ids (input "SubnetIds"))) (clojure.core/contains? input "SecurityGroupIds") (clojure.core/assoc :security-group-ids (deser-security-group-ids (input "SecurityGroupIds"))) (clojure.core/contains? input "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (input "VpcId")))))

(clojure.core/defn- deser-runtime [input] (clojure.core/get {"go1.x" :go-1x, "dotnetcore2.0" :dotnetcore-20, "ruby2.5" :ruby-25, "python3.7" :python-37, "dotnetcore1.0" :dotnetcore-10, "java8" :java-8, "dotnetcore2.1" :dotnetcore-21, "provided" :provided, "nodejs4.3" :nodejs-43, "python2.7" :python-27, "nodejs4.3-edge" :nodejs-43edge, "nodejs8.10" :nodejs-810, "nodejs6.10" :nodejs-610, "python3.6" :python-36, "nodejs" :nodejs} input))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-layer-version-number [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-environment-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Variables") (clojure.core/assoc :variables (deser-environment-variables (input "Variables"))) (clojure.core/contains? input "Error") (clojure.core/assoc :error (deser-environment-error (input "Error")))))

(clojure.core/defn- deser-alias [input] input)

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-additional-version [input] input)

(clojure.core/defn- deser-layer-versions-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer-versions-list-item coll))) input))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-sensitive-string [input] input)

(clojure.core/defn- deser-memory-size [input] input)

(clojure.core/defn- deser-throttle-reason [input] (clojure.core/get {"ConcurrentInvocationLimitExceeded" :concurrent-invocation-limit-exceeded, "FunctionInvocationRateLimitExceeded" :function-invocation-rate-limit-exceeded, "ReservedFunctionConcurrentInvocationLimitExceeded" :reserved-function-concurrent-invocation-limit-exceeded, "ReservedFunctionInvocationRateLimitExceeded" :reserved-function-invocation-rate-limit-exceeded, "CallerRateLimitExceeded" :caller-rate-limit-exceeded} input))

(clojure.core/defn- deser-layer [input] (clojure.core/cond-> {} (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-layer-version-arn (input "Arn"))) (clojure.core/contains? input "CodeSize") (clojure.core/assoc :code-size (deser-long (input "CodeSize")))))

(clojure.core/defn- deser-license-info [input] input)

(clojure.core/defn- deser-concurrency [input] (clojure.core/cond-> {} (clojure.core/contains? input "ReservedConcurrentExecutions") (clojure.core/assoc :reserved-concurrent-executions (deser-reserved-concurrent-executions (input "ReservedConcurrentExecutions")))))

(clojure.core/defn- deser-weight [input] input)

(clojure.core/defn- deser-layer-version-content-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "Location") (clojure.core/assoc :location (deser-string (input "Location"))) (clojure.core/contains? input "CodeSha256") (clojure.core/assoc :code-sha-256 (deser-string (input "CodeSha256"))) (clojure.core/contains? input "CodeSize") (clojure.core/assoc :code-size (deser-long (input "CodeSize")))))

(clojure.core/defn- deser-account-limit [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalCodeSize") (clojure.core/assoc :total-code-size (deser-long (input "TotalCodeSize"))) (clojure.core/contains? input "CodeSizeUnzipped") (clojure.core/assoc :code-size-unzipped (deser-long (input "CodeSizeUnzipped"))) (clojure.core/contains? input "CodeSizeZipped") (clojure.core/assoc :code-size-zipped (deser-long (input "CodeSizeZipped"))) (clojure.core/contains? input "ConcurrentExecutions") (clojure.core/assoc :concurrent-executions (deser-integer (input "ConcurrentExecutions"))) (clojure.core/contains? input "UnreservedConcurrentExecutions") (clojure.core/assoc :unreserved-concurrent-executions (deser-unreserved-concurrent-executions (input "UnreservedConcurrentExecutions")))))

(clojure.core/defn- deser-environment-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-string (input "ErrorCode"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-sensitive-string (input "Message")))))

(clojure.core/defn- deser-environment-variable-value [input] input)

(clojure.core/defn- deser-kms-key-arn [input] input)

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-layer-name [input] input)

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-alias-configuration coll))) input))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-layers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layers-list-item coll))) input))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-tracing-mode [input] (clojure.core/get {"Active" :active, "PassThrough" :pass-through} input))

(clojure.core/defn- deser-compatible-runtimes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-runtime coll))) input))

(clojure.core/defn- deser-layer-version-arn [input] input)

(clojure.core/defn- deser-http-status [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-environment-variable-name [input] input)

(clojure.core/defn- deser-function-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "TracingConfig") (clojure.core/assoc :tracing-config (deser-tracing-config-response (input "TracingConfig"))) (clojure.core/contains? input "FunctionArn") (clojure.core/assoc :function-arn (deser-name-spaced-function-arn (input "FunctionArn"))) (clojure.core/contains? input "FunctionName") (clojure.core/assoc :function-name (deser-namespaced-function-name (input "FunctionName"))) (clojure.core/contains? input "Timeout") (clojure.core/assoc :timeout (deser-timeout (input "Timeout"))) (clojure.core/contains? input "Layers") (clojure.core/assoc :layers (deser-layers-reference-list (input "Layers"))) (clojure.core/contains? input "DeadLetterConfig") (clojure.core/assoc :dead-letter-config (deser-dead-letter-config (input "DeadLetterConfig"))) (clojure.core/contains? input "Handler") (clojure.core/assoc :handler (deser-handler (input "Handler"))) (clojure.core/contains? input "Runtime") (clojure.core/assoc :runtime (deser-runtime (input "Runtime"))) (clojure.core/contains? input "MemorySize") (clojure.core/assoc :memory-size (deser-memory-size (input "MemorySize"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role-arn (input "Role"))) (clojure.core/contains? input "KMSKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (input "KMSKeyArn"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (input "LastModified"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-environment-response (input "Environment"))) (clojure.core/contains? input "CodeSize") (clojure.core/assoc :code-size (deser-long (input "CodeSize"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (input "VpcConfig"))) (clojure.core/contains? input "RevisionId") (clojure.core/assoc :revision-id (deser-string (input "RevisionId"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-version (input "Version"))) (clojure.core/contains? input "CodeSha256") (clojure.core/assoc :code-sha-256 (deser-string (input "CodeSha256"))) (clojure.core/contains? input "MasterArn") (clojure.core/assoc :master-arn (deser-function-arn (input "MasterArn")))))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-tracing-config-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Mode") (clojure.core/assoc :mode (deser-tracing-mode (input "Mode")))))

(clojure.core/defn- deser-blob [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-layer-arn [input] input)

(clojure.core/defn- deser-layer-versions-list-item [input] (clojure.core/cond-> {} (clojure.core/contains? input "LayerVersionArn") (clojure.core/assoc :layer-version-arn (deser-layer-version-arn (input "LayerVersionArn"))) (clojure.core/contains? input "Version") (clojure.core/assoc :version (deser-layer-version-number (input "Version"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "CreatedDate") (clojure.core/assoc :created-date (deser-timestamp (input "CreatedDate"))) (clojure.core/contains? input "CompatibleRuntimes") (clojure.core/assoc :compatible-runtimes (deser-compatible-runtimes (input "CompatibleRuntimes"))) (clojure.core/contains? input "LicenseInfo") (clojure.core/assoc :license-info (deser-license-info (input "LicenseInfo")))))

(clojure.core/defn- deser-additional-version-weights [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-additional-version k) (deser-weight v)])) input))

(clojure.core/defn- deser-alias-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "AliasArn") (clojure.core/assoc :alias-arn (deser-function-arn (input "AliasArn"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-alias (input "Name"))) (clojure.core/contains? input "FunctionVersion") (clojure.core/assoc :function-version (deser-version (input "FunctionVersion"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description (input "Description"))) (clojure.core/contains? input "RoutingConfig") (clojure.core/assoc :routing-config (deser-alias-routing-configuration (input "RoutingConfig"))) (clojure.core/contains? input "RevisionId") (clojure.core/assoc :revision-id (deser-string (input "RevisionId")))))

(clojure.core/defn- deser-event-source-mapping-configuration [input] (clojure.core/cond-> {} (clojure.core/contains? input "UUID") (clojure.core/assoc :uuid (deser-string (input "UUID"))) (clojure.core/contains? input "BatchSize") (clojure.core/assoc :batch-size (deser-batch-size (input "BatchSize"))) (clojure.core/contains? input "EventSourceArn") (clojure.core/assoc :event-source-arn (deser-arn (input "EventSourceArn"))) (clojure.core/contains? input "FunctionArn") (clojure.core/assoc :function-arn (deser-function-arn (input "FunctionArn"))) (clojure.core/contains? input "LastModified") (clojure.core/assoc :last-modified (deser-date (input "LastModified"))) (clojure.core/contains? input "LastProcessingResult") (clojure.core/assoc :last-processing-result (deser-string (input "LastProcessingResult"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-string (input "State"))) (clojure.core/contains? input "StateTransitionReason") (clojure.core/assoc :state-transition-reason (deser-string (input "StateTransitionReason")))))

(clojure.core/defn- deser-function-code-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "RepositoryType") (clojure.core/assoc :repository-type (deser-string (input "RepositoryType"))) (clojure.core/contains? input "Location") (clojure.core/assoc :location (deser-string (input "Location")))))

(clojure.core/defn- deser-name-spaced-function-arn [input] input)

(clojure.core/defn- deser-layers-list-item [input] (clojure.core/cond-> {} (clojure.core/contains? input "LayerName") (clojure.core/assoc :layer-name (deser-layer-name (input "LayerName"))) (clojure.core/contains? input "LayerArn") (clojure.core/assoc :layer-arn (deser-layer-arn (input "LayerArn"))) (clojure.core/contains? input "LatestMatchingVersion") (clojure.core/assoc :latest-matching-version (deser-layer-versions-list-item (input "LatestMatchingVersion")))))

(clojure.core/defn- response-list-layers-response ([input] (response-list-layers-response nil input)) ([resultWrapper1266385 input] (clojure.core/let [rawinput1266384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266386 {"NextMarker" (rawinput1266384 "NextMarker"), "Layers" (rawinput1266384 "Layers")}] (clojure.core/cond-> {} (letvar1266386 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266386 ["NextMarker"]))) (letvar1266386 "Layers") (clojure.core/assoc :layers (deser-layers-list (clojure.core/get-in letvar1266386 ["Layers"])))))))

(clojure.core/defn- response-unsupported-media-type-exception ([input] (response-unsupported-media-type-exception nil input)) ([resultWrapper1266388 input] (clojure.core/let [rawinput1266387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266389 {"Type" (rawinput1266387 "Type"), "message" (rawinput1266387 "message")}] (clojure.core/cond-> {} (letvar1266389 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266389 ["Type"]))) (letvar1266389 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266389 ["message"])))))))

(clojure.core/defn- response-request-too-large-exception ([input] (response-request-too-large-exception nil input)) ([resultWrapper1266391 input] (clojure.core/let [rawinput1266390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266392 {"Type" (rawinput1266390 "Type"), "message" (rawinput1266390 "message")}] (clojure.core/cond-> {} (letvar1266392 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266392 ["Type"]))) (letvar1266392 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266392 ["message"])))))))

(clojure.core/defn- response-invalid-subnet-id-exception ([input] (response-invalid-subnet-id-exception nil input)) ([resultWrapper1266394 input] (clojure.core/let [rawinput1266393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266395 {"Type" (rawinput1266393 "Type"), "Message" (rawinput1266393 "Message")}] (clojure.core/cond-> {} (letvar1266395 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266395 ["Type"]))) (letvar1266395 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266395 ["Message"])))))))

(clojure.core/defn- response-list-layer-versions-response ([input] (response-list-layer-versions-response nil input)) ([resultWrapper1266397 input] (clojure.core/let [rawinput1266396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266398 {"NextMarker" (rawinput1266396 "NextMarker"), "LayerVersions" (rawinput1266396 "LayerVersions")}] (clojure.core/cond-> {} (letvar1266398 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266398 ["NextMarker"]))) (letvar1266398 "LayerVersions") (clojure.core/assoc :layer-versions (deser-layer-versions-list (clojure.core/get-in letvar1266398 ["LayerVersions"])))))))

(clojure.core/defn- response-subnet-ip-address-limit-reached-exception ([input] (response-subnet-ip-address-limit-reached-exception nil input)) ([resultWrapper1266400 input] (clojure.core/let [rawinput1266399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266401 {"Type" (rawinput1266399 "Type"), "Message" (rawinput1266399 "Message")}] (clojure.core/cond-> {} (letvar1266401 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266401 ["Type"]))) (letvar1266401 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266401 ["Message"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1266403 input] (clojure.core/let [rawinput1266402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266404 {"Type" (rawinput1266402 "Type"), "message" (rawinput1266402 "message")}] (clojure.core/cond-> {} (letvar1266404 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266404 ["Type"]))) (letvar1266404 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266404 ["message"])))))))

(clojure.core/defn- response-list-versions-by-function-response ([input] (response-list-versions-by-function-response nil input)) ([resultWrapper1266406 input] (clojure.core/let [rawinput1266405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266407 {"NextMarker" (rawinput1266405 "NextMarker"), "Versions" (rawinput1266405 "Versions")}] (clojure.core/cond-> {} (letvar1266407 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266407 ["NextMarker"]))) (letvar1266407 "Versions") (clojure.core/assoc :versions (deser-function-list (clojure.core/get-in letvar1266407 ["Versions"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper1266409 input] (clojure.core/let [rawinput1266408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266410 {"Tags" (rawinput1266408 "Tags")}] (clojure.core/cond-> {} (letvar1266410 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1266410 ["Tags"])))))))

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper1266412 input] (clojure.core/let [rawinput1266411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266413 {"Type" (rawinput1266411 "Type"), "Message" (rawinput1266411 "Message")}] (clojure.core/cond-> {} (letvar1266413 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266413 ["Type"]))) (letvar1266413 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266413 ["Message"])))))))

(clojure.core/defn- response-list-event-source-mappings-response ([input] (response-list-event-source-mappings-response nil input)) ([resultWrapper1266415 input] (clojure.core/let [rawinput1266414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266416 {"NextMarker" (rawinput1266414 "NextMarker"), "EventSourceMappings" (rawinput1266414 "EventSourceMappings")}] (clojure.core/cond-> {} (letvar1266416 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266416 ["NextMarker"]))) (letvar1266416 "EventSourceMappings") (clojure.core/assoc :event-source-mappings (deser-event-source-mappings-list (clojure.core/get-in letvar1266416 ["EventSourceMappings"])))))))

(clojure.core/defn- response-kms-not-found-exception ([input] (response-kms-not-found-exception nil input)) ([resultWrapper1266418 input] (clojure.core/let [rawinput1266417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266419 {"Type" (rawinput1266417 "Type"), "Message" (rawinput1266417 "Message")}] (clojure.core/cond-> {} (letvar1266419 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266419 ["Type"]))) (letvar1266419 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266419 ["Message"])))))))

(clojure.core/defn- response-kms-invalid-state-exception ([input] (response-kms-invalid-state-exception nil input)) ([resultWrapper1266421 input] (clojure.core/let [rawinput1266420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266422 {"Type" (rawinput1266420 "Type"), "Message" (rawinput1266420 "Message")}] (clojure.core/cond-> {} (letvar1266422 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266422 ["Type"]))) (letvar1266422 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266422 ["Message"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1266424 input] (clojure.core/let [rawinput1266423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266425 {"Type" (rawinput1266423 "Type"), "Message" (rawinput1266423 "Message")}] (clojure.core/cond-> {} (letvar1266425 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266425 ["Type"]))) (letvar1266425 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266425 ["Message"])))))))

(clojure.core/defn- response-invalid-runtime-exception ([input] (response-invalid-runtime-exception nil input)) ([resultWrapper1266427 input] (clojure.core/let [rawinput1266426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266428 {"Type" (rawinput1266426 "Type"), "Message" (rawinput1266426 "Message")}] (clojure.core/cond-> {} (letvar1266428 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266428 ["Type"]))) (letvar1266428 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266428 ["Message"])))))))

(clojure.core/defn- response-get-layer-version-response ([input] (response-get-layer-version-response nil input)) ([resultWrapper1266430 input] (clojure.core/let [rawinput1266429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266431 {"Content" (rawinput1266429 "Content"), "LayerArn" (rawinput1266429 "LayerArn"), "LayerVersionArn" (rawinput1266429 "LayerVersionArn"), "Description" (rawinput1266429 "Description"), "CreatedDate" (rawinput1266429 "CreatedDate"), "Version" (rawinput1266429 "Version"), "CompatibleRuntimes" (rawinput1266429 "CompatibleRuntimes"), "LicenseInfo" (rawinput1266429 "LicenseInfo")}] (clojure.core/cond-> {} (letvar1266431 "Content") (clojure.core/assoc :content (deser-layer-version-content-output (clojure.core/get-in letvar1266431 ["Content"]))) (letvar1266431 "LayerArn") (clojure.core/assoc :layer-arn (deser-layer-arn (clojure.core/get-in letvar1266431 ["LayerArn"]))) (letvar1266431 "LayerVersionArn") (clojure.core/assoc :layer-version-arn (deser-layer-version-arn (clojure.core/get-in letvar1266431 ["LayerVersionArn"]))) (letvar1266431 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1266431 ["Description"]))) (letvar1266431 "CreatedDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1266431 ["CreatedDate"]))) (letvar1266431 "Version") (clojure.core/assoc :version (deser-layer-version-number (clojure.core/get-in letvar1266431 ["Version"]))) (letvar1266431 "CompatibleRuntimes") (clojure.core/assoc :compatible-runtimes (deser-compatible-runtimes (clojure.core/get-in letvar1266431 ["CompatibleRuntimes"]))) (letvar1266431 "LicenseInfo") (clojure.core/assoc :license-info (deser-license-info (clojure.core/get-in letvar1266431 ["LicenseInfo"])))))))

(clojure.core/defn- response-list-functions-response ([input] (response-list-functions-response nil input)) ([resultWrapper1266433 input] (clojure.core/let [rawinput1266432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266434 {"NextMarker" (rawinput1266432 "NextMarker"), "Functions" (rawinput1266432 "Functions")}] (clojure.core/cond-> {} (letvar1266434 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266434 ["NextMarker"]))) (letvar1266434 "Functions") (clojure.core/assoc :functions (deser-function-list (clojure.core/get-in letvar1266434 ["Functions"])))))))

(clojure.core/defn- response-kms-disabled-exception ([input] (response-kms-disabled-exception nil input)) ([resultWrapper1266436 input] (clojure.core/let [rawinput1266435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266437 {"Type" (rawinput1266435 "Type"), "Message" (rawinput1266435 "Message")}] (clojure.core/cond-> {} (letvar1266437 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266437 ["Type"]))) (letvar1266437 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266437 ["Message"])))))))

(clojure.core/defn- response-get-function-response ([input] (response-get-function-response nil input)) ([resultWrapper1266439 input] (clojure.core/let [rawinput1266438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266440 {"Configuration" (rawinput1266438 "Configuration"), "Code" (rawinput1266438 "Code"), "Tags" (rawinput1266438 "Tags"), "Concurrency" (rawinput1266438 "Concurrency")}] (clojure.core/cond-> {} (letvar1266440 "Configuration") (clojure.core/assoc :configuration (deser-function-configuration (clojure.core/get-in letvar1266440 ["Configuration"]))) (letvar1266440 "Code") (clojure.core/assoc :code (deser-function-code-location (clojure.core/get-in letvar1266440 ["Code"]))) (letvar1266440 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1266440 ["Tags"]))) (letvar1266440 "Concurrency") (clojure.core/assoc :concurrency (deser-concurrency (clojure.core/get-in letvar1266440 ["Concurrency"])))))))

(clojure.core/defn- response-code-storage-exceeded-exception ([input] (response-code-storage-exceeded-exception nil input)) ([resultWrapper1266442 input] (clojure.core/let [rawinput1266441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266443 {"Type" (rawinput1266441 "Type"), "message" (rawinput1266441 "message")}] (clojure.core/cond-> {} (letvar1266443 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266443 ["Type"]))) (letvar1266443 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266443 ["message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1266445 input] (clojure.core/let [rawinput1266444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266446 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "Type" (rawinput1266444 "Type"), "message" (rawinput1266444 "message"), "Reason" (rawinput1266444 "Reason")}] (clojure.core/cond-> {} (letvar1266446 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar1266446 ["Retry-After"]))) (letvar1266446 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266446 ["Type"]))) (letvar1266446 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266446 ["message"]))) (letvar1266446 "Reason") (clojure.core/assoc :reason (deser-throttle-reason (clojure.core/get-in letvar1266446 ["Reason"])))))))

(clojure.core/defn- response-invalid-request-content-exception ([input] (response-invalid-request-content-exception nil input)) ([resultWrapper1266448 input] (clojure.core/let [rawinput1266447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266449 {"Type" (rawinput1266447 "Type"), "message" (rawinput1266447 "message")}] (clojure.core/cond-> {} (letvar1266449 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266449 ["Type"]))) (letvar1266449 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266449 ["message"])))))))

(clojure.core/defn- response-add-layer-version-permission-response ([input] (response-add-layer-version-permission-response nil input)) ([resultWrapper1266451 input] (clojure.core/let [rawinput1266450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266452 {"Statement" (rawinput1266450 "Statement"), "RevisionId" (rawinput1266450 "RevisionId")}] (clojure.core/cond-> {} (letvar1266452 "Statement") (clojure.core/assoc :statement (deser-string (clojure.core/get-in letvar1266452 ["Statement"]))) (letvar1266452 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar1266452 ["RevisionId"])))))))

(clojure.core/defn- response-kms-access-denied-exception ([input] (response-kms-access-denied-exception nil input)) ([resultWrapper1266454 input] (clojure.core/let [rawinput1266453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266455 {"Type" (rawinput1266453 "Type"), "Message" (rawinput1266453 "Message")}] (clojure.core/cond-> {} (letvar1266455 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266455 ["Type"]))) (letvar1266455 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266455 ["Message"])))))))

(clojure.core/defn- response-get-account-settings-response ([input] (response-get-account-settings-response nil input)) ([resultWrapper1266457 input] (clojure.core/let [rawinput1266456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266458 {"AccountLimit" (rawinput1266456 "AccountLimit"), "AccountUsage" (rawinput1266456 "AccountUsage")}] (clojure.core/cond-> {} (letvar1266458 "AccountLimit") (clojure.core/assoc :account-limit (deser-account-limit (clojure.core/get-in letvar1266458 ["AccountLimit"]))) (letvar1266458 "AccountUsage") (clojure.core/assoc :account-usage (deser-account-usage (clojure.core/get-in letvar1266458 ["AccountUsage"])))))))

(clojure.core/defn- response-eni-limit-reached-exception ([input] (response-eni-limit-reached-exception nil input)) ([resultWrapper1266460 input] (clojure.core/let [rawinput1266459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266461 {"Type" (rawinput1266459 "Type"), "Message" (rawinput1266459 "Message")}] (clojure.core/cond-> {} (letvar1266461 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266461 ["Type"]))) (letvar1266461 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266461 ["Message"])))))))

(clojure.core/defn- response-concurrency ([input] (response-concurrency nil input)) ([resultWrapper1266463 input] (clojure.core/let [rawinput1266462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266464 {"ReservedConcurrentExecutions" (rawinput1266462 "ReservedConcurrentExecutions")}] (clojure.core/cond-> {} (letvar1266464 "ReservedConcurrentExecutions") (clojure.core/assoc :reserved-concurrent-executions (deser-reserved-concurrent-executions (clojure.core/get-in letvar1266464 ["ReservedConcurrentExecutions"])))))))

(clojure.core/defn- response-add-permission-response ([input] (response-add-permission-response nil input)) ([resultWrapper1266466 input] (clojure.core/let [rawinput1266465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266467 {"Statement" (rawinput1266465 "Statement")}] (clojure.core/cond-> {} (letvar1266467 "Statement") (clojure.core/assoc :statement (deser-string (clojure.core/get-in letvar1266467 ["Statement"])))))))

(clojure.core/defn- response-invocation-response ([input] (response-invocation-response nil input)) ([resultWrapper1266469 input] (clojure.core/let [rawinput1266468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266470 {"StatusCode" (clojure.core/get-in input [:status "StatusCode"]), "X-Amz-Function-Error" (clojure.core/get-in input [:headers "X-Amz-Function-Error"]), "X-Amz-Log-Result" (clojure.core/get-in input [:headers "X-Amz-Log-Result"]), "Payload" (rawinput1266468 "Payload"), "X-Amz-Executed-Version" (clojure.core/get-in input [:headers "X-Amz-Executed-Version"])}] (clojure.core/cond-> {} (letvar1266470 "StatusCode") (clojure.core/assoc :status-code (deser-integer (clojure.core/get-in letvar1266470 ["StatusCode"]))) (letvar1266470 "X-Amz-Function-Error") (clojure.core/assoc :function-error (deser-string (clojure.core/get-in letvar1266470 ["X-Amz-Function-Error"]))) (letvar1266470 "X-Amz-Log-Result") (clojure.core/assoc :log-result (deser-string (clojure.core/get-in letvar1266470 ["X-Amz-Log-Result"]))) (letvar1266470 "Payload") (clojure.core/assoc :payload (deser-blob (clojure.core/get-in letvar1266470 ["Payload"]))) (letvar1266470 "X-Amz-Executed-Version") (clojure.core/assoc :executed-version (deser-version (clojure.core/get-in letvar1266470 ["X-Amz-Executed-Version"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1266472 input] (clojure.core/let [rawinput1266471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266473 {"Type" (rawinput1266471 "Type"), "Message" (rawinput1266471 "Message")}] (clojure.core/cond-> {} (letvar1266473 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266473 ["Type"]))) (letvar1266473 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266473 ["Message"])))))))

(clojure.core/defn- response-publish-layer-version-response ([input] (response-publish-layer-version-response nil input)) ([resultWrapper1266475 input] (clojure.core/let [rawinput1266474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266476 {"Content" (rawinput1266474 "Content"), "LayerArn" (rawinput1266474 "LayerArn"), "LayerVersionArn" (rawinput1266474 "LayerVersionArn"), "Description" (rawinput1266474 "Description"), "CreatedDate" (rawinput1266474 "CreatedDate"), "Version" (rawinput1266474 "Version"), "CompatibleRuntimes" (rawinput1266474 "CompatibleRuntimes"), "LicenseInfo" (rawinput1266474 "LicenseInfo")}] (clojure.core/cond-> {} (letvar1266476 "Content") (clojure.core/assoc :content (deser-layer-version-content-output (clojure.core/get-in letvar1266476 ["Content"]))) (letvar1266476 "LayerArn") (clojure.core/assoc :layer-arn (deser-layer-arn (clojure.core/get-in letvar1266476 ["LayerArn"]))) (letvar1266476 "LayerVersionArn") (clojure.core/assoc :layer-version-arn (deser-layer-version-arn (clojure.core/get-in letvar1266476 ["LayerVersionArn"]))) (letvar1266476 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1266476 ["Description"]))) (letvar1266476 "CreatedDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1266476 ["CreatedDate"]))) (letvar1266476 "Version") (clojure.core/assoc :version (deser-layer-version-number (clojure.core/get-in letvar1266476 ["Version"]))) (letvar1266476 "CompatibleRuntimes") (clojure.core/assoc :compatible-runtimes (deser-compatible-runtimes (clojure.core/get-in letvar1266476 ["CompatibleRuntimes"]))) (letvar1266476 "LicenseInfo") (clojure.core/assoc :license-info (deser-license-info (clojure.core/get-in letvar1266476 ["LicenseInfo"])))))))

(clojure.core/defn- response-get-policy-response ([input] (response-get-policy-response nil input)) ([resultWrapper1266478 input] (clojure.core/let [rawinput1266477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266479 {"Policy" (rawinput1266477 "Policy"), "RevisionId" (rawinput1266477 "RevisionId")}] (clojure.core/cond-> {} (letvar1266479 "Policy") (clojure.core/assoc :policy (deser-string (clojure.core/get-in letvar1266479 ["Policy"]))) (letvar1266479 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar1266479 ["RevisionId"])))))))

(clojure.core/defn- response-invoke-async-response ([input] (response-invoke-async-response nil input)) ([resultWrapper1266481 input] (clojure.core/let [rawinput1266480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266482 {"Status" (clojure.core/get-in input [:status "Status"])}] (clojure.core/cond-> {} (letvar1266482 "Status") (clojure.core/assoc :status (deser-http-status (clojure.core/get-in letvar1266482 ["Status"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper1266484 input] (clojure.core/let [rawinput1266483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266485 {"Type" (rawinput1266483 "Type"), "message" (rawinput1266483 "message")}] (clojure.core/cond-> {} (letvar1266485 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266485 ["Type"]))) (letvar1266485 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266485 ["message"])))))))

(clojure.core/defn- response-invalid-zip-file-exception ([input] (response-invalid-zip-file-exception nil input)) ([resultWrapper1266487 input] (clojure.core/let [rawinput1266486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266488 {"Type" (rawinput1266486 "Type"), "Message" (rawinput1266486 "Message")}] (clojure.core/cond-> {} (letvar1266488 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266488 ["Type"]))) (letvar1266488 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266488 ["Message"])))))))

(clojure.core/defn- response-list-aliases-response ([input] (response-list-aliases-response nil input)) ([resultWrapper1266490 input] (clojure.core/let [rawinput1266489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266491 {"NextMarker" (rawinput1266489 "NextMarker"), "Aliases" (rawinput1266489 "Aliases")}] (clojure.core/cond-> {} (letvar1266491 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar1266491 ["NextMarker"]))) (letvar1266491 "Aliases") (clojure.core/assoc :aliases (deser-alias-list (clojure.core/get-in letvar1266491 ["Aliases"])))))))

(clojure.core/defn- response-function-configuration ([input] (response-function-configuration nil input)) ([resultWrapper1266493 input] (clojure.core/let [rawinput1266492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266494 {"TracingConfig" (rawinput1266492 "TracingConfig"), "FunctionArn" (rawinput1266492 "FunctionArn"), "FunctionName" (rawinput1266492 "FunctionName"), "Timeout" (rawinput1266492 "Timeout"), "Layers" (rawinput1266492 "Layers"), "DeadLetterConfig" (rawinput1266492 "DeadLetterConfig"), "Handler" (rawinput1266492 "Handler"), "Runtime" (rawinput1266492 "Runtime"), "MemorySize" (rawinput1266492 "MemorySize"), "Role" (rawinput1266492 "Role"), "KMSKeyArn" (rawinput1266492 "KMSKeyArn"), "Description" (rawinput1266492 "Description"), "LastModified" (rawinput1266492 "LastModified"), "Environment" (rawinput1266492 "Environment"), "CodeSize" (rawinput1266492 "CodeSize"), "VpcConfig" (rawinput1266492 "VpcConfig"), "RevisionId" (rawinput1266492 "RevisionId"), "Version" (rawinput1266492 "Version"), "CodeSha256" (rawinput1266492 "CodeSha256"), "MasterArn" (rawinput1266492 "MasterArn")}] (clojure.core/cond-> {} (letvar1266494 "TracingConfig") (clojure.core/assoc :tracing-config (deser-tracing-config-response (clojure.core/get-in letvar1266494 ["TracingConfig"]))) (letvar1266494 "FunctionArn") (clojure.core/assoc :function-arn (deser-name-spaced-function-arn (clojure.core/get-in letvar1266494 ["FunctionArn"]))) (letvar1266494 "FunctionName") (clojure.core/assoc :function-name (deser-namespaced-function-name (clojure.core/get-in letvar1266494 ["FunctionName"]))) (letvar1266494 "Timeout") (clojure.core/assoc :timeout (deser-timeout (clojure.core/get-in letvar1266494 ["Timeout"]))) (letvar1266494 "Layers") (clojure.core/assoc :layers (deser-layers-reference-list (clojure.core/get-in letvar1266494 ["Layers"]))) (letvar1266494 "DeadLetterConfig") (clojure.core/assoc :dead-letter-config (deser-dead-letter-config (clojure.core/get-in letvar1266494 ["DeadLetterConfig"]))) (letvar1266494 "Handler") (clojure.core/assoc :handler (deser-handler (clojure.core/get-in letvar1266494 ["Handler"]))) (letvar1266494 "Runtime") (clojure.core/assoc :runtime (deser-runtime (clojure.core/get-in letvar1266494 ["Runtime"]))) (letvar1266494 "MemorySize") (clojure.core/assoc :memory-size (deser-memory-size (clojure.core/get-in letvar1266494 ["MemorySize"]))) (letvar1266494 "Role") (clojure.core/assoc :role (deser-role-arn (clojure.core/get-in letvar1266494 ["Role"]))) (letvar1266494 "KMSKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (clojure.core/get-in letvar1266494 ["KMSKeyArn"]))) (letvar1266494 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1266494 ["Description"]))) (letvar1266494 "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (clojure.core/get-in letvar1266494 ["LastModified"]))) (letvar1266494 "Environment") (clojure.core/assoc :environment (deser-environment-response (clojure.core/get-in letvar1266494 ["Environment"]))) (letvar1266494 "CodeSize") (clojure.core/assoc :code-size (deser-long (clojure.core/get-in letvar1266494 ["CodeSize"]))) (letvar1266494 "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (clojure.core/get-in letvar1266494 ["VpcConfig"]))) (letvar1266494 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar1266494 ["RevisionId"]))) (letvar1266494 "Version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1266494 ["Version"]))) (letvar1266494 "CodeSha256") (clojure.core/assoc :code-sha-256 (deser-string (clojure.core/get-in letvar1266494 ["CodeSha256"]))) (letvar1266494 "MasterArn") (clojure.core/assoc :master-arn (deser-function-arn (clojure.core/get-in letvar1266494 ["MasterArn"])))))))

(clojure.core/defn- response-policy-length-exceeded-exception ([input] (response-policy-length-exceeded-exception nil input)) ([resultWrapper1266496 input] (clojure.core/let [rawinput1266495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266497 {"Type" (rawinput1266495 "Type"), "message" (rawinput1266495 "message")}] (clojure.core/cond-> {} (letvar1266497 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266497 ["Type"]))) (letvar1266497 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266497 ["message"])))))))

(clojure.core/defn- response-alias-configuration ([input] (response-alias-configuration nil input)) ([resultWrapper1266499 input] (clojure.core/let [rawinput1266498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266500 {"AliasArn" (rawinput1266498 "AliasArn"), "Name" (rawinput1266498 "Name"), "FunctionVersion" (rawinput1266498 "FunctionVersion"), "Description" (rawinput1266498 "Description"), "RoutingConfig" (rawinput1266498 "RoutingConfig"), "RevisionId" (rawinput1266498 "RevisionId")}] (clojure.core/cond-> {} (letvar1266500 "AliasArn") (clojure.core/assoc :alias-arn (deser-function-arn (clojure.core/get-in letvar1266500 ["AliasArn"]))) (letvar1266500 "Name") (clojure.core/assoc :name (deser-alias (clojure.core/get-in letvar1266500 ["Name"]))) (letvar1266500 "FunctionVersion") (clojure.core/assoc :function-version (deser-version (clojure.core/get-in letvar1266500 ["FunctionVersion"]))) (letvar1266500 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1266500 ["Description"]))) (letvar1266500 "RoutingConfig") (clojure.core/assoc :routing-config (deser-alias-routing-configuration (clojure.core/get-in letvar1266500 ["RoutingConfig"]))) (letvar1266500 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar1266500 ["RevisionId"])))))))

(clojure.core/defn- response-ec-2-throttled-exception ([input] (response-ec-2-throttled-exception nil input)) ([resultWrapper1266502 input] (clojure.core/let [rawinput1266501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266503 {"Type" (rawinput1266501 "Type"), "Message" (rawinput1266501 "Message")}] (clojure.core/cond-> {} (letvar1266503 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266503 ["Type"]))) (letvar1266503 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266503 ["Message"])))))))

(clojure.core/defn- response-ec-2-access-denied-exception ([input] (response-ec-2-access-denied-exception nil input)) ([resultWrapper1266505 input] (clojure.core/let [rawinput1266504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266506 {"Type" (rawinput1266504 "Type"), "Message" (rawinput1266504 "Message")}] (clojure.core/cond-> {} (letvar1266506 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266506 ["Type"]))) (letvar1266506 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266506 ["Message"])))))))

(clojure.core/defn- response-event-source-mapping-configuration ([input] (response-event-source-mapping-configuration nil input)) ([resultWrapper1266508 input] (clojure.core/let [rawinput1266507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266509 {"UUID" (rawinput1266507 "UUID"), "BatchSize" (rawinput1266507 "BatchSize"), "EventSourceArn" (rawinput1266507 "EventSourceArn"), "FunctionArn" (rawinput1266507 "FunctionArn"), "LastModified" (rawinput1266507 "LastModified"), "LastProcessingResult" (rawinput1266507 "LastProcessingResult"), "State" (rawinput1266507 "State"), "StateTransitionReason" (rawinput1266507 "StateTransitionReason")}] (clojure.core/cond-> {} (letvar1266509 "UUID") (clojure.core/assoc :uuid (deser-string (clojure.core/get-in letvar1266509 ["UUID"]))) (letvar1266509 "BatchSize") (clojure.core/assoc :batch-size (deser-batch-size (clojure.core/get-in letvar1266509 ["BatchSize"]))) (letvar1266509 "EventSourceArn") (clojure.core/assoc :event-source-arn (deser-arn (clojure.core/get-in letvar1266509 ["EventSourceArn"]))) (letvar1266509 "FunctionArn") (clojure.core/assoc :function-arn (deser-function-arn (clojure.core/get-in letvar1266509 ["FunctionArn"]))) (letvar1266509 "LastModified") (clojure.core/assoc :last-modified (deser-date (clojure.core/get-in letvar1266509 ["LastModified"]))) (letvar1266509 "LastProcessingResult") (clojure.core/assoc :last-processing-result (deser-string (clojure.core/get-in letvar1266509 ["LastProcessingResult"]))) (letvar1266509 "State") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar1266509 ["State"]))) (letvar1266509 "StateTransitionReason") (clojure.core/assoc :state-transition-reason (deser-string (clojure.core/get-in letvar1266509 ["StateTransitionReason"])))))))

(clojure.core/defn- response-ec-2-unexpected-exception ([input] (response-ec-2-unexpected-exception nil input)) ([resultWrapper1266511 input] (clojure.core/let [rawinput1266510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266512 {"Type" (rawinput1266510 "Type"), "Message" (rawinput1266510 "Message"), "EC2ErrorCode" (rawinput1266510 "EC2ErrorCode")}] (clojure.core/cond-> {} (letvar1266512 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266512 ["Type"]))) (letvar1266512 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266512 ["Message"]))) (letvar1266512 "EC2ErrorCode") (clojure.core/assoc :ec-2-error-code (deser-string (clojure.core/get-in letvar1266512 ["EC2ErrorCode"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper1266514 input] (clojure.core/let [rawinput1266513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266515 {"Type" (rawinput1266513 "Type"), "message" (rawinput1266513 "message")}] (clojure.core/cond-> {} (letvar1266515 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266515 ["Type"]))) (letvar1266515 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266515 ["message"])))))))

(clojure.core/defn- response-invalid-security-group-id-exception ([input] (response-invalid-security-group-id-exception nil input)) ([resultWrapper1266517 input] (clojure.core/let [rawinput1266516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266518 {"Type" (rawinput1266516 "Type"), "Message" (rawinput1266516 "Message")}] (clojure.core/cond-> {} (letvar1266518 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar1266518 ["Type"]))) (letvar1266518 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1266518 ["Message"])))))))

(clojure.core/defn- response-get-layer-version-policy-response ([input] (response-get-layer-version-policy-response nil input)) ([resultWrapper1266520 input] (clojure.core/let [rawinput1266519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1266521 {"Policy" (rawinput1266519 "Policy"), "RevisionId" (rawinput1266519 "RevisionId")}] (clojure.core/cond-> {} (letvar1266521 "Policy") (clojure.core/assoc :policy (deser-string (clojure.core/get-in letvar1266521 ["Policy"]))) (letvar1266521 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar1266521 ["RevisionId"])))))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layers-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layers-response/layers (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layers-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-layers-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-layers-response/next-marker :portkey.aws.lambda.-2015-03-31.list-layers-response/layers]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/layers (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31.create-function-request/role :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31.create-function-request/code] :opt-un [:portkey.aws.lambda.-2015-03-31/tracing-config :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31.create-function-request/layers :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/tags :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31/environment :portkey.aws.lambda.-2015-03-31/vpc-config :portkey.aws.lambda.-2015-03-31.create-function-request/publish]))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-response/layer-versions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-versions-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-layer-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-layer-versions-response/next-marker :portkey.aws.lambda.-2015-03-31.list-layer-versions-response/layer-versions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layers-reference-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/layer))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ip-address-limit-reached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/type :portkey.aws.lambda.-2015-03-31.subnet-ip-address-limit-reached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code/zip-file :portkey.aws.lambda.-2015-03-31/s-3-bucket :portkey.aws.lambda.-2015-03-31/s-3-key :portkey.aws.lambda.-2015-03-31/s-3-object-version]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:lambda:[a-z]{2}(-gov)?-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/subnet-id :max-count 16))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/batch-size (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-version-content-input/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-content-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/s-3-bucket :portkey.aws.lambda.-2015-03-31/s-3-key :portkey.aws.lambda.-2015-03-31/s-3-object-version :portkey.aws.lambda.-2015-03-31.layer-version-content-input/zip-file]))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"lambda:GetLayerVersion" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-layer-version-request/content (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-content-input))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/publish-layer-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.publish-layer-version-request/content] :opt-un [:portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31/compatible-runtimes :portkey.aws.lambda.-2015-03-31/license-info]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/tags]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[^\s]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 170)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids :portkey.aws.lambda.-2015-03-31/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/runtime #{"go1.x" "dotnetcore2.0" "ruby2.5" "python3.7" :dotnetcore-20 :nodejs "dotnetcore1.0" "java8" "dotnetcore2.1" :python-36 :java-8 "provided" :nodejs-810 :nodejs-43 "nodejs4.3" "python2.7" :python-37 "nodejs4.3-edge" :dotnetcore-10 "nodejs8.10" :go-1x "nodejs6.10" :provided "python3.6" :dotnetcore-21 :nodejs-43edge :nodejs-610 "nodejs" :ruby-25 :python-27})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.service-exception/type :portkey.aws.lambda.-2015-03-31.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"\d{12}" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-response/variables :portkey.aws.lambda.-2015-03-31.environment-response/error]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-response/content (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-content-output))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-response/version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-layer-version-response/content :portkey.aws.lambda.-2015-03-31/layer-arn :portkey.aws.lambda.-2015-03-31/layer-version-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.get-layer-version-response/created-date :portkey.aws.lambda.-2015-03-31.get-layer-version-response/version :portkey.aws.lambda.-2015-03-31/compatible-runtimes :portkey.aws.lambda.-2015-03-31/license-info]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker :portkey.aws.lambda.-2015-03-31.list-functions-response/functions]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"o-[a-z0-9]{10,32}" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[0-9]+" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-versions-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/layer-versions-list-item))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-layer-version-permission-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-layer-version-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/remove-layer-version-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.remove-layer-version-permission-request/version-number :portkey.aws.lambda.-2015-03-31/statement-id] :opt-un [:portkey.aws.lambda.-2015-03-31.remove-layer-version-permission-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layers-request/compatible-runtime (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/runtime))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layers-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layers-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-layer-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-layers-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-layers-request/compatible-runtime :portkey.aws.lambda.-2015-03-31.list-layers-request/marker :portkey.aws.lambda.-2015-03-31.list-layers-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-response/statement (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.add-layer-version-permission-response/statement :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/action (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-action))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/principal (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-principal))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/version-number :portkey.aws.lambda.-2015-03-31/statement-id :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/action :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/principal] :opt-un [:portkey.aws.lambda.-2015-03-31/organization-id :portkey.aws.lambda.-2015-03-31.add-layer-version-permission-request/revision-id]))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/log-type #{"None" :tail "Tail" :none})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer/arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.layer/arn :portkey.aws.lambda.-2015-03-31.layer/code-size]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/license-info (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 512))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-version-content-output/location (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-version-content-output/code-sha-256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-version-content-output/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-content-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.layer-version-content-output/location :portkey.aws.lambda.-2015-03-31.layer-version-content-output/code-sha-256 :portkey.aws.lambda.-2015-03-31.layer-version-content-output/code-size]))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:[a-z0-9-.]+:.*)|()" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+)|[a-zA-Z0-9-_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid] :opt-un [:portkey.aws.lambda.-2015-03-31/function-name :portkey.aws.lambda.-2015-03-31/enabled :portkey.aws.lambda.-2015-03-31/batch-size]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-type #{"DryRun" "RequestResponse" "Event" :event :request-response :dry-run})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-layer-version-response/content (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-content-output))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-layer-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-layer-version-response/version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/publish-layer-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.publish-layer-version-response/content :portkey.aws.lambda.-2015-03-31/layer-arn :portkey.aws.lambda.-2015-03-31/layer-version-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.publish-layer-version-response/created-date :portkey.aws.lambda.-2015-03-31.publish-layer-version-response/version :portkey.aws.lambda.-2015-03-31/compatible-runtimes :portkey.aws.lambda.-2015-03-31/license-info]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-policy-response/policy :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layers-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/layers-list-item))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/layers (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/tracing-config :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/layers :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31/environment :portkey.aws.lambda.-2015-03-31/vpc-config :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/layer-version-arn))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/compatible-runtimes (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/runtime :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment/variables]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+:[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/http-status clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z0-9-]*):([a-zA-Z0-9\-])+:([a-z]{2}(-gov)?-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/layers (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layers-reference-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha-256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-configuration (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn :portkey.aws.lambda.-2015-03-31.function-configuration/function-name :portkey.aws.lambda.-2015-03-31/timeout :portkey.aws.lambda.-2015-03-31.function-configuration/layers :portkey.aws.lambda.-2015-03-31/dead-letter-config :portkey.aws.lambda.-2015-03-31/handler :portkey.aws.lambda.-2015-03-31/runtime :portkey.aws.lambda.-2015-03-31/memory-size :portkey.aws.lambda.-2015-03-31.function-configuration/role :portkey.aws.lambda.-2015-03-31/kms-key-arn :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified :portkey.aws.lambda.-2015-03-31.function-configuration/environment :portkey.aws.lambda.-2015-03-31.function-configuration/code-size :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id :portkey.aws.lambda.-2015-03-31/version :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha-256 :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 3 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 63)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 128)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/master-region :portkey.aws.lambda.-2015-03-31/function-version :portkey.aws.lambda.-2015-03-31.list-functions-request/marker :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:[a-z0-9-.]+:.*)|()" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/max-layer-list-items (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/compatible-runtime (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/runtime))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-layer-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-layer-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-layer-versions-request/compatible-runtime :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/marker :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 256)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1024)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config-response/mode]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-request/version-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/created-date (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-versions-list-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/layer-version-arn :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/version :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/created-date :portkey.aws.lambda.-2015-03-31/compatible-runtimes :portkey.aws.lambda.-2015-03-31/license-info]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #".*" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__1012854__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:lambda:[a-z]{2}(-gov)?-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layers-list-item/latest-matching-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-versions-list-item))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layers-list-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31/layer-arn :portkey.aws.lambda.-2015-03-31.layers-list-item/latest-matching-version]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.get-layer-version-request/version-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-security-group-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/type :portkey.aws.lambda.-2015-03-31.invalid-security-group-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.untag-resource-request/resource :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-position #{"LATEST" "TRIM_HORIZON" :at-timestamp "AT_TIMESTAMP" :latest :trim-horizon})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"\d{12}|\*|arn:(aws[a-zA-Z-]*):iam::\d{12}:root" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-layer-version-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-layer-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.delete-layer-version-request/version-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/policy :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-tags-request/resource] :opt-un []))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn delete-layer-version ([delete-layer-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-layer-version-request delete-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLayerVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-layer-version-request) :ret clojure.core/true?)

(clojure.core/defn create-alias ([create-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn add-layer-version-permission ([add-layer-version-permission-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-add-layer-version-permission-request add-layer-version-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddLayerVersionPermission", :http.request.configuration/output-deser-fn response-add-layer-version-permission-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef add-layer-version-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-response))

(clojure.core/defn delete-function ([delete-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings ([] (list-event-source-mappings {})) ([list-event-source-mappings-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-event-source-mappings-request list-event-source-mappings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEventSourceMappings", :http.request.configuration/output-deser-fn response-list-event-source-mappings-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency ([delete-function-concurrency-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-function-concurrency-request delete-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunctionConcurrency", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping ([delete-event-source-mapping-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-event-source-mapping-request delete-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn invoke ([invocation-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invocation-request invocation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invocation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/invocations", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invocation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Invoke", :http.request.configuration/output-deser-fn response-invocation-response, :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda.-2015-03-31/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda.-2015-03-31/invalid-subnet-id-exception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda.-2015-03-31/subnet-ip-address-limit-reached-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "KMSNotFoundException" :portkey.aws.lambda.-2015-03-31/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.lambda.-2015-03-31/kms-invalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda.-2015-03-31/kms-disabled-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda.-2015-03-31/kms-access-denied-exception, "ENILimitReachedException" :portkey.aws.lambda.-2015-03-31/eni-limit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda.-2015-03-31/ec-2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda.-2015-03-31/ec-2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda.-2015-03-31/ec-2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda.-2015-03-31/invalid-security-group-id-exception}})))))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invocation-response))

(clojure.core/defn get-account-settings ([] (get-account-settings {})) ([get-account-settings-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2016-08-19/account-settings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccountSettings", :http.request.configuration/output-deser-fn response-get-account-settings-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-account-settings-response))

(clojure.core/defn invoke-async ([invoke-async-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-invoke-async-request invoke-async-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invoke-async-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/invoke-async/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invoke-async-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeAsync", :http.request.configuration/output-deser-fn response-invoke-async-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception}})))))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invoke-async-response))

(clojure.core/defn get-function-configuration ([get-function-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-function-configuration-request get-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn update-function-code ([update-function-code-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-function-code-request update-function-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/code", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunctionCode", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn list-versions-by-function ([list-versions-by-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-versions-by-function-request list-versions-by-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVersionsByFunction", :http.request.configuration/output-deser-fn response-list-versions-by-function-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping ([update-event-source-mapping-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-event-source-mapping-request update-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn list-tags ([list-tags-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-tags-response))

(clojure.core/defn update-alias ([update-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-alias-request update-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn get-event-source-mapping ([get-event-source-mapping-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-event-source-mapping-request get-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn remove-layer-version-permission ([remove-layer-version-permission-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-remove-layer-version-permission-request remove-layer-version-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy/{StatementId}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/remove-layer-version-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveLayerVersionPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef remove-layer-version-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-layer-version-permission-request) :ret clojure.core/true?)

(clojure.core/defn get-function ([get-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunction", :http.request.configuration/output-deser-fn response-get-function-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-function-response))

(clojure.core/defn get-policy ([get-policy-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPolicy", :http.request.configuration/output-deser-fn response-get-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-policy-response))

(clojure.core/defn add-permission ([add-permission-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-add-permission-request add-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/add-permission-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/add-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddPermission", :http.request.configuration/output-deser-fn response-add-permission-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-permission-response))

(clojure.core/defn get-layer-version-policy ([get-layer-version-policy-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-layer-version-policy-request get-layer-version-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLayerVersionPolicy", :http.request.configuration/output-deser-fn response-get-layer-version-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-layer-version-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response))

(clojure.core/defn publish-layer-version ([publish-layer-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-publish-layer-version-request publish-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/publish-layer-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/publish-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PublishLayerVersion", :http.request.configuration/output-deser-fn response-publish-layer-version-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception}})))))
(clojure.spec.alpha/fdef publish-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-layer-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/publish-layer-version-response))

(clojure.core/defn create-event-source-mapping ([create-event-source-mapping-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-event-source-mapping-request create-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-alias ([get-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-alias-request get-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn list-layer-versions ([list-layer-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-layer-versions-request list-layer-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-layer-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-layer-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLayerVersions", :http.request.configuration/output-deser-fn response-list-layer-versions-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-layer-versions :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-layer-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-layer-versions-response))

(clojure.core/defn list-aliases ([list-aliases-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn response-list-aliases-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-aliases-response))

(clojure.core/defn list-functions ([] (list-functions {})) ([list-functions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFunctions", :http.request.configuration/output-deser-fn response-list-functions-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-functions-response))

(clojure.core/defn remove-permission ([remove-permission-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy/{StatementId}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/remove-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias ([delete-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function ([create-function-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-function-request create-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFunction", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-layer-version ([get-layer-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-layer-version-request get-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLayerVersion", :http.request.configuration/output-deser-fn response-get-layer-version-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-layer-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-layer-version-response))

(clojure.core/defn publish-version ([publish-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-publish-version-request publish-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/publish-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PublishVersion", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn put-function-concurrency ([put-function-concurrency-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-function-concurrency-request put-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/concurrency, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutFunctionConcurrency", :http.request.configuration/output-deser-fn response-concurrency, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/concurrency))

(clojure.core/defn list-layers ([] (list-layers {})) ([list-layers-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-layers-request list-layers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-layers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-layers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLayers", :http.request.configuration/output-deser-fn response-list-layers-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-layers :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-layers-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-layers-response))

(clojure.core/defn update-function-configuration ([update-function-configuration-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-function-configuration-request update-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
