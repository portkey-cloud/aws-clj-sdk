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

(clojure.core/defn- response-list-layers-response ([input] (response-list-layers-response nil input)) ([resultWrapper273388 input] (clojure.core/let [rawinput273387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273389 {"NextMarker" (rawinput273387 "NextMarker"), "Layers" (rawinput273387 "Layers")}] (clojure.core/cond-> {} (letvar273389 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273389 ["NextMarker"]))) (letvar273389 "Layers") (clojure.core/assoc :layers (deser-layers-list (clojure.core/get-in letvar273389 ["Layers"])))))))

(clojure.core/defn- response-unsupported-media-type-exception ([input] (response-unsupported-media-type-exception nil input)) ([resultWrapper273391 input] (clojure.core/let [rawinput273390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273392 {"Type" (rawinput273390 "Type"), "message" (rawinput273390 "message")}] (clojure.core/cond-> {} (letvar273392 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273392 ["Type"]))) (letvar273392 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273392 ["message"])))))))

(clojure.core/defn- response-request-too-large-exception ([input] (response-request-too-large-exception nil input)) ([resultWrapper273394 input] (clojure.core/let [rawinput273393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273395 {"Type" (rawinput273393 "Type"), "message" (rawinput273393 "message")}] (clojure.core/cond-> {} (letvar273395 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273395 ["Type"]))) (letvar273395 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273395 ["message"])))))))

(clojure.core/defn- response-invalid-subnet-id-exception ([input] (response-invalid-subnet-id-exception nil input)) ([resultWrapper273397 input] (clojure.core/let [rawinput273396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273398 {"Type" (rawinput273396 "Type"), "Message" (rawinput273396 "Message")}] (clojure.core/cond-> {} (letvar273398 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273398 ["Type"]))) (letvar273398 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273398 ["Message"])))))))

(clojure.core/defn- response-list-layer-versions-response ([input] (response-list-layer-versions-response nil input)) ([resultWrapper273400 input] (clojure.core/let [rawinput273399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273401 {"NextMarker" (rawinput273399 "NextMarker"), "LayerVersions" (rawinput273399 "LayerVersions")}] (clojure.core/cond-> {} (letvar273401 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273401 ["NextMarker"]))) (letvar273401 "LayerVersions") (clojure.core/assoc :layer-versions (deser-layer-versions-list (clojure.core/get-in letvar273401 ["LayerVersions"])))))))

(clojure.core/defn- response-subnet-ip-address-limit-reached-exception ([input] (response-subnet-ip-address-limit-reached-exception nil input)) ([resultWrapper273403 input] (clojure.core/let [rawinput273402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273404 {"Type" (rawinput273402 "Type"), "Message" (rawinput273402 "Message")}] (clojure.core/cond-> {} (letvar273404 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273404 ["Type"]))) (letvar273404 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273404 ["Message"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper273406 input] (clojure.core/let [rawinput273405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273407 {"Type" (rawinput273405 "Type"), "message" (rawinput273405 "message")}] (clojure.core/cond-> {} (letvar273407 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273407 ["Type"]))) (letvar273407 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273407 ["message"])))))))

(clojure.core/defn- response-list-versions-by-function-response ([input] (response-list-versions-by-function-response nil input)) ([resultWrapper273409 input] (clojure.core/let [rawinput273408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273410 {"NextMarker" (rawinput273408 "NextMarker"), "Versions" (rawinput273408 "Versions")}] (clojure.core/cond-> {} (letvar273410 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273410 ["NextMarker"]))) (letvar273410 "Versions") (clojure.core/assoc :versions (deser-function-list (clojure.core/get-in letvar273410 ["Versions"])))))))

(clojure.core/defn- response-list-tags-response ([input] (response-list-tags-response nil input)) ([resultWrapper273412 input] (clojure.core/let [rawinput273411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273413 {"Tags" (rawinput273411 "Tags")}] (clojure.core/cond-> {} (letvar273413 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar273413 ["Tags"])))))))

(clojure.core/defn- response-service-exception ([input] (response-service-exception nil input)) ([resultWrapper273415 input] (clojure.core/let [rawinput273414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273416 {"Type" (rawinput273414 "Type"), "Message" (rawinput273414 "Message")}] (clojure.core/cond-> {} (letvar273416 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273416 ["Type"]))) (letvar273416 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273416 ["Message"])))))))

(clojure.core/defn- response-list-event-source-mappings-response ([input] (response-list-event-source-mappings-response nil input)) ([resultWrapper273418 input] (clojure.core/let [rawinput273417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273419 {"NextMarker" (rawinput273417 "NextMarker"), "EventSourceMappings" (rawinput273417 "EventSourceMappings")}] (clojure.core/cond-> {} (letvar273419 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273419 ["NextMarker"]))) (letvar273419 "EventSourceMappings") (clojure.core/assoc :event-source-mappings (deser-event-source-mappings-list (clojure.core/get-in letvar273419 ["EventSourceMappings"])))))))

(clojure.core/defn- response-kms-not-found-exception ([input] (response-kms-not-found-exception nil input)) ([resultWrapper273421 input] (clojure.core/let [rawinput273420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273422 {"Type" (rawinput273420 "Type"), "Message" (rawinput273420 "Message")}] (clojure.core/cond-> {} (letvar273422 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273422 ["Type"]))) (letvar273422 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273422 ["Message"])))))))

(clojure.core/defn- response-kms-invalid-state-exception ([input] (response-kms-invalid-state-exception nil input)) ([resultWrapper273424 input] (clojure.core/let [rawinput273423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273425 {"Type" (rawinput273423 "Type"), "Message" (rawinput273423 "Message")}] (clojure.core/cond-> {} (letvar273425 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273425 ["Type"]))) (letvar273425 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273425 ["Message"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper273427 input] (clojure.core/let [rawinput273426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273428 {"Type" (rawinput273426 "Type"), "Message" (rawinput273426 "Message")}] (clojure.core/cond-> {} (letvar273428 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273428 ["Type"]))) (letvar273428 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273428 ["Message"])))))))

(clojure.core/defn- response-invalid-runtime-exception ([input] (response-invalid-runtime-exception nil input)) ([resultWrapper273430 input] (clojure.core/let [rawinput273429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273431 {"Type" (rawinput273429 "Type"), "Message" (rawinput273429 "Message")}] (clojure.core/cond-> {} (letvar273431 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273431 ["Type"]))) (letvar273431 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273431 ["Message"])))))))

(clojure.core/defn- response-get-layer-version-response ([input] (response-get-layer-version-response nil input)) ([resultWrapper273433 input] (clojure.core/let [rawinput273432 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273434 {"Content" (rawinput273432 "Content"), "LayerArn" (rawinput273432 "LayerArn"), "LayerVersionArn" (rawinput273432 "LayerVersionArn"), "Description" (rawinput273432 "Description"), "CreatedDate" (rawinput273432 "CreatedDate"), "Version" (rawinput273432 "Version"), "CompatibleRuntimes" (rawinput273432 "CompatibleRuntimes"), "LicenseInfo" (rawinput273432 "LicenseInfo")}] (clojure.core/cond-> {} (letvar273434 "Content") (clojure.core/assoc :content (deser-layer-version-content-output (clojure.core/get-in letvar273434 ["Content"]))) (letvar273434 "LayerArn") (clojure.core/assoc :layer-arn (deser-layer-arn (clojure.core/get-in letvar273434 ["LayerArn"]))) (letvar273434 "LayerVersionArn") (clojure.core/assoc :layer-version-arn (deser-layer-version-arn (clojure.core/get-in letvar273434 ["LayerVersionArn"]))) (letvar273434 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar273434 ["Description"]))) (letvar273434 "CreatedDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar273434 ["CreatedDate"]))) (letvar273434 "Version") (clojure.core/assoc :version (deser-layer-version-number (clojure.core/get-in letvar273434 ["Version"]))) (letvar273434 "CompatibleRuntimes") (clojure.core/assoc :compatible-runtimes (deser-compatible-runtimes (clojure.core/get-in letvar273434 ["CompatibleRuntimes"]))) (letvar273434 "LicenseInfo") (clojure.core/assoc :license-info (deser-license-info (clojure.core/get-in letvar273434 ["LicenseInfo"])))))))

(clojure.core/defn- response-list-functions-response ([input] (response-list-functions-response nil input)) ([resultWrapper273436 input] (clojure.core/let [rawinput273435 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273437 {"NextMarker" (rawinput273435 "NextMarker"), "Functions" (rawinput273435 "Functions")}] (clojure.core/cond-> {} (letvar273437 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273437 ["NextMarker"]))) (letvar273437 "Functions") (clojure.core/assoc :functions (deser-function-list (clojure.core/get-in letvar273437 ["Functions"])))))))

(clojure.core/defn- response-kms-disabled-exception ([input] (response-kms-disabled-exception nil input)) ([resultWrapper273439 input] (clojure.core/let [rawinput273438 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273440 {"Type" (rawinput273438 "Type"), "Message" (rawinput273438 "Message")}] (clojure.core/cond-> {} (letvar273440 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273440 ["Type"]))) (letvar273440 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273440 ["Message"])))))))

(clojure.core/defn- response-get-function-response ([input] (response-get-function-response nil input)) ([resultWrapper273442 input] (clojure.core/let [rawinput273441 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273443 {"Configuration" (rawinput273441 "Configuration"), "Code" (rawinput273441 "Code"), "Tags" (rawinput273441 "Tags"), "Concurrency" (rawinput273441 "Concurrency")}] (clojure.core/cond-> {} (letvar273443 "Configuration") (clojure.core/assoc :configuration (deser-function-configuration (clojure.core/get-in letvar273443 ["Configuration"]))) (letvar273443 "Code") (clojure.core/assoc :code (deser-function-code-location (clojure.core/get-in letvar273443 ["Code"]))) (letvar273443 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar273443 ["Tags"]))) (letvar273443 "Concurrency") (clojure.core/assoc :concurrency (deser-concurrency (clojure.core/get-in letvar273443 ["Concurrency"])))))))

(clojure.core/defn- response-code-storage-exceeded-exception ([input] (response-code-storage-exceeded-exception nil input)) ([resultWrapper273445 input] (clojure.core/let [rawinput273444 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273446 {"Type" (rawinput273444 "Type"), "message" (rawinput273444 "message")}] (clojure.core/cond-> {} (letvar273446 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273446 ["Type"]))) (letvar273446 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273446 ["message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper273448 input] (clojure.core/let [rawinput273447 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273449 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "Type" (rawinput273447 "Type"), "message" (rawinput273447 "message"), "Reason" (rawinput273447 "Reason")}] (clojure.core/cond-> {} (letvar273449 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar273449 ["Retry-After"]))) (letvar273449 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273449 ["Type"]))) (letvar273449 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273449 ["message"]))) (letvar273449 "Reason") (clojure.core/assoc :reason (deser-throttle-reason (clojure.core/get-in letvar273449 ["Reason"])))))))

(clojure.core/defn- response-invalid-request-content-exception ([input] (response-invalid-request-content-exception nil input)) ([resultWrapper273451 input] (clojure.core/let [rawinput273450 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273452 {"Type" (rawinput273450 "Type"), "message" (rawinput273450 "message")}] (clojure.core/cond-> {} (letvar273452 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273452 ["Type"]))) (letvar273452 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273452 ["message"])))))))

(clojure.core/defn- response-add-layer-version-permission-response ([input] (response-add-layer-version-permission-response nil input)) ([resultWrapper273454 input] (clojure.core/let [rawinput273453 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273455 {"Statement" (rawinput273453 "Statement"), "RevisionId" (rawinput273453 "RevisionId")}] (clojure.core/cond-> {} (letvar273455 "Statement") (clojure.core/assoc :statement (deser-string (clojure.core/get-in letvar273455 ["Statement"]))) (letvar273455 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar273455 ["RevisionId"])))))))

(clojure.core/defn- response-kms-access-denied-exception ([input] (response-kms-access-denied-exception nil input)) ([resultWrapper273457 input] (clojure.core/let [rawinput273456 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273458 {"Type" (rawinput273456 "Type"), "Message" (rawinput273456 "Message")}] (clojure.core/cond-> {} (letvar273458 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273458 ["Type"]))) (letvar273458 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273458 ["Message"])))))))

(clojure.core/defn- response-get-account-settings-response ([input] (response-get-account-settings-response nil input)) ([resultWrapper273460 input] (clojure.core/let [rawinput273459 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273461 {"AccountLimit" (rawinput273459 "AccountLimit"), "AccountUsage" (rawinput273459 "AccountUsage")}] (clojure.core/cond-> {} (letvar273461 "AccountLimit") (clojure.core/assoc :account-limit (deser-account-limit (clojure.core/get-in letvar273461 ["AccountLimit"]))) (letvar273461 "AccountUsage") (clojure.core/assoc :account-usage (deser-account-usage (clojure.core/get-in letvar273461 ["AccountUsage"])))))))

(clojure.core/defn- response-eni-limit-reached-exception ([input] (response-eni-limit-reached-exception nil input)) ([resultWrapper273463 input] (clojure.core/let [rawinput273462 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273464 {"Type" (rawinput273462 "Type"), "Message" (rawinput273462 "Message")}] (clojure.core/cond-> {} (letvar273464 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273464 ["Type"]))) (letvar273464 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273464 ["Message"])))))))

(clojure.core/defn- response-concurrency ([input] (response-concurrency nil input)) ([resultWrapper273466 input] (clojure.core/let [rawinput273465 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273467 {"ReservedConcurrentExecutions" (rawinput273465 "ReservedConcurrentExecutions")}] (clojure.core/cond-> {} (letvar273467 "ReservedConcurrentExecutions") (clojure.core/assoc :reserved-concurrent-executions (deser-reserved-concurrent-executions (clojure.core/get-in letvar273467 ["ReservedConcurrentExecutions"])))))))

(clojure.core/defn- response-add-permission-response ([input] (response-add-permission-response nil input)) ([resultWrapper273469 input] (clojure.core/let [rawinput273468 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273470 {"Statement" (rawinput273468 "Statement")}] (clojure.core/cond-> {} (letvar273470 "Statement") (clojure.core/assoc :statement (deser-string (clojure.core/get-in letvar273470 ["Statement"])))))))

(clojure.core/defn- response-invocation-response ([input] (response-invocation-response nil input)) ([resultWrapper273472 input] (clojure.core/let [rawinput273471 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273473 {"StatusCode" (clojure.core/get-in input [:status "StatusCode"]), "X-Amz-Function-Error" (clojure.core/get-in input [:headers "X-Amz-Function-Error"]), "X-Amz-Log-Result" (clojure.core/get-in input [:headers "X-Amz-Log-Result"]), "Payload" (rawinput273471 "Payload"), "X-Amz-Executed-Version" (clojure.core/get-in input [:headers "X-Amz-Executed-Version"])}] (clojure.core/cond-> {} (letvar273473 "StatusCode") (clojure.core/assoc :status-code (deser-integer (clojure.core/get-in letvar273473 ["StatusCode"]))) (letvar273473 "X-Amz-Function-Error") (clojure.core/assoc :function-error (deser-string (clojure.core/get-in letvar273473 ["X-Amz-Function-Error"]))) (letvar273473 "X-Amz-Log-Result") (clojure.core/assoc :log-result (deser-string (clojure.core/get-in letvar273473 ["X-Amz-Log-Result"]))) (letvar273473 "Payload") (clojure.core/assoc :payload (deser-blob (clojure.core/get-in letvar273473 ["Payload"]))) (letvar273473 "X-Amz-Executed-Version") (clojure.core/assoc :executed-version (deser-version (clojure.core/get-in letvar273473 ["X-Amz-Executed-Version"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper273475 input] (clojure.core/let [rawinput273474 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273476 {"Type" (rawinput273474 "Type"), "Message" (rawinput273474 "Message")}] (clojure.core/cond-> {} (letvar273476 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273476 ["Type"]))) (letvar273476 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273476 ["Message"])))))))

(clojure.core/defn- response-publish-layer-version-response ([input] (response-publish-layer-version-response nil input)) ([resultWrapper273478 input] (clojure.core/let [rawinput273477 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273479 {"Content" (rawinput273477 "Content"), "LayerArn" (rawinput273477 "LayerArn"), "LayerVersionArn" (rawinput273477 "LayerVersionArn"), "Description" (rawinput273477 "Description"), "CreatedDate" (rawinput273477 "CreatedDate"), "Version" (rawinput273477 "Version"), "CompatibleRuntimes" (rawinput273477 "CompatibleRuntimes"), "LicenseInfo" (rawinput273477 "LicenseInfo")}] (clojure.core/cond-> {} (letvar273479 "Content") (clojure.core/assoc :content (deser-layer-version-content-output (clojure.core/get-in letvar273479 ["Content"]))) (letvar273479 "LayerArn") (clojure.core/assoc :layer-arn (deser-layer-arn (clojure.core/get-in letvar273479 ["LayerArn"]))) (letvar273479 "LayerVersionArn") (clojure.core/assoc :layer-version-arn (deser-layer-version-arn (clojure.core/get-in letvar273479 ["LayerVersionArn"]))) (letvar273479 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar273479 ["Description"]))) (letvar273479 "CreatedDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar273479 ["CreatedDate"]))) (letvar273479 "Version") (clojure.core/assoc :version (deser-layer-version-number (clojure.core/get-in letvar273479 ["Version"]))) (letvar273479 "CompatibleRuntimes") (clojure.core/assoc :compatible-runtimes (deser-compatible-runtimes (clojure.core/get-in letvar273479 ["CompatibleRuntimes"]))) (letvar273479 "LicenseInfo") (clojure.core/assoc :license-info (deser-license-info (clojure.core/get-in letvar273479 ["LicenseInfo"])))))))

(clojure.core/defn- response-get-policy-response ([input] (response-get-policy-response nil input)) ([resultWrapper273481 input] (clojure.core/let [rawinput273480 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273482 {"Policy" (rawinput273480 "Policy"), "RevisionId" (rawinput273480 "RevisionId")}] (clojure.core/cond-> {} (letvar273482 "Policy") (clojure.core/assoc :policy (deser-string (clojure.core/get-in letvar273482 ["Policy"]))) (letvar273482 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar273482 ["RevisionId"])))))))

(clojure.core/defn- response-invoke-async-response ([input] (response-invoke-async-response nil input)) ([resultWrapper273484 input] (clojure.core/let [rawinput273483 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273485 {"Status" (clojure.core/get-in input [:status "Status"])}] (clojure.core/cond-> {} (letvar273485 "Status") (clojure.core/assoc :status (deser-http-status (clojure.core/get-in letvar273485 ["Status"])))))))

(clojure.core/defn- response-resource-conflict-exception ([input] (response-resource-conflict-exception nil input)) ([resultWrapper273487 input] (clojure.core/let [rawinput273486 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273488 {"Type" (rawinput273486 "Type"), "message" (rawinput273486 "message")}] (clojure.core/cond-> {} (letvar273488 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273488 ["Type"]))) (letvar273488 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273488 ["message"])))))))

(clojure.core/defn- response-invalid-zip-file-exception ([input] (response-invalid-zip-file-exception nil input)) ([resultWrapper273490 input] (clojure.core/let [rawinput273489 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273491 {"Type" (rawinput273489 "Type"), "Message" (rawinput273489 "Message")}] (clojure.core/cond-> {} (letvar273491 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273491 ["Type"]))) (letvar273491 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273491 ["Message"])))))))

(clojure.core/defn- response-list-aliases-response ([input] (response-list-aliases-response nil input)) ([resultWrapper273493 input] (clojure.core/let [rawinput273492 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273494 {"NextMarker" (rawinput273492 "NextMarker"), "Aliases" (rawinput273492 "Aliases")}] (clojure.core/cond-> {} (letvar273494 "NextMarker") (clojure.core/assoc :next-marker (deser-string (clojure.core/get-in letvar273494 ["NextMarker"]))) (letvar273494 "Aliases") (clojure.core/assoc :aliases (deser-alias-list (clojure.core/get-in letvar273494 ["Aliases"])))))))

(clojure.core/defn- response-function-configuration ([input] (response-function-configuration nil input)) ([resultWrapper273496 input] (clojure.core/let [rawinput273495 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273497 {"TracingConfig" (rawinput273495 "TracingConfig"), "FunctionArn" (rawinput273495 "FunctionArn"), "FunctionName" (rawinput273495 "FunctionName"), "Timeout" (rawinput273495 "Timeout"), "Layers" (rawinput273495 "Layers"), "DeadLetterConfig" (rawinput273495 "DeadLetterConfig"), "Handler" (rawinput273495 "Handler"), "Runtime" (rawinput273495 "Runtime"), "MemorySize" (rawinput273495 "MemorySize"), "Role" (rawinput273495 "Role"), "KMSKeyArn" (rawinput273495 "KMSKeyArn"), "Description" (rawinput273495 "Description"), "LastModified" (rawinput273495 "LastModified"), "Environment" (rawinput273495 "Environment"), "CodeSize" (rawinput273495 "CodeSize"), "VpcConfig" (rawinput273495 "VpcConfig"), "RevisionId" (rawinput273495 "RevisionId"), "Version" (rawinput273495 "Version"), "CodeSha256" (rawinput273495 "CodeSha256"), "MasterArn" (rawinput273495 "MasterArn")}] (clojure.core/cond-> {} (letvar273497 "TracingConfig") (clojure.core/assoc :tracing-config (deser-tracing-config-response (clojure.core/get-in letvar273497 ["TracingConfig"]))) (letvar273497 "FunctionArn") (clojure.core/assoc :function-arn (deser-name-spaced-function-arn (clojure.core/get-in letvar273497 ["FunctionArn"]))) (letvar273497 "FunctionName") (clojure.core/assoc :function-name (deser-namespaced-function-name (clojure.core/get-in letvar273497 ["FunctionName"]))) (letvar273497 "Timeout") (clojure.core/assoc :timeout (deser-timeout (clojure.core/get-in letvar273497 ["Timeout"]))) (letvar273497 "Layers") (clojure.core/assoc :layers (deser-layers-reference-list (clojure.core/get-in letvar273497 ["Layers"]))) (letvar273497 "DeadLetterConfig") (clojure.core/assoc :dead-letter-config (deser-dead-letter-config (clojure.core/get-in letvar273497 ["DeadLetterConfig"]))) (letvar273497 "Handler") (clojure.core/assoc :handler (deser-handler (clojure.core/get-in letvar273497 ["Handler"]))) (letvar273497 "Runtime") (clojure.core/assoc :runtime (deser-runtime (clojure.core/get-in letvar273497 ["Runtime"]))) (letvar273497 "MemorySize") (clojure.core/assoc :memory-size (deser-memory-size (clojure.core/get-in letvar273497 ["MemorySize"]))) (letvar273497 "Role") (clojure.core/assoc :role (deser-role-arn (clojure.core/get-in letvar273497 ["Role"]))) (letvar273497 "KMSKeyArn") (clojure.core/assoc :kms-key-arn (deser-kms-key-arn (clojure.core/get-in letvar273497 ["KMSKeyArn"]))) (letvar273497 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar273497 ["Description"]))) (letvar273497 "LastModified") (clojure.core/assoc :last-modified (deser-timestamp (clojure.core/get-in letvar273497 ["LastModified"]))) (letvar273497 "Environment") (clojure.core/assoc :environment (deser-environment-response (clojure.core/get-in letvar273497 ["Environment"]))) (letvar273497 "CodeSize") (clojure.core/assoc :code-size (deser-long (clojure.core/get-in letvar273497 ["CodeSize"]))) (letvar273497 "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config-response (clojure.core/get-in letvar273497 ["VpcConfig"]))) (letvar273497 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar273497 ["RevisionId"]))) (letvar273497 "Version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar273497 ["Version"]))) (letvar273497 "CodeSha256") (clojure.core/assoc :code-sha-256 (deser-string (clojure.core/get-in letvar273497 ["CodeSha256"]))) (letvar273497 "MasterArn") (clojure.core/assoc :master-arn (deser-function-arn (clojure.core/get-in letvar273497 ["MasterArn"])))))))

(clojure.core/defn- response-policy-length-exceeded-exception ([input] (response-policy-length-exceeded-exception nil input)) ([resultWrapper273499 input] (clojure.core/let [rawinput273498 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273500 {"Type" (rawinput273498 "Type"), "message" (rawinput273498 "message")}] (clojure.core/cond-> {} (letvar273500 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273500 ["Type"]))) (letvar273500 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273500 ["message"])))))))

(clojure.core/defn- response-alias-configuration ([input] (response-alias-configuration nil input)) ([resultWrapper273502 input] (clojure.core/let [rawinput273501 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273503 {"AliasArn" (rawinput273501 "AliasArn"), "Name" (rawinput273501 "Name"), "FunctionVersion" (rawinput273501 "FunctionVersion"), "Description" (rawinput273501 "Description"), "RoutingConfig" (rawinput273501 "RoutingConfig"), "RevisionId" (rawinput273501 "RevisionId")}] (clojure.core/cond-> {} (letvar273503 "AliasArn") (clojure.core/assoc :alias-arn (deser-function-arn (clojure.core/get-in letvar273503 ["AliasArn"]))) (letvar273503 "Name") (clojure.core/assoc :name (deser-alias (clojure.core/get-in letvar273503 ["Name"]))) (letvar273503 "FunctionVersion") (clojure.core/assoc :function-version (deser-version (clojure.core/get-in letvar273503 ["FunctionVersion"]))) (letvar273503 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar273503 ["Description"]))) (letvar273503 "RoutingConfig") (clojure.core/assoc :routing-config (deser-alias-routing-configuration (clojure.core/get-in letvar273503 ["RoutingConfig"]))) (letvar273503 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar273503 ["RevisionId"])))))))

(clojure.core/defn- response-ec-2-throttled-exception ([input] (response-ec-2-throttled-exception nil input)) ([resultWrapper273505 input] (clojure.core/let [rawinput273504 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273506 {"Type" (rawinput273504 "Type"), "Message" (rawinput273504 "Message")}] (clojure.core/cond-> {} (letvar273506 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273506 ["Type"]))) (letvar273506 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273506 ["Message"])))))))

(clojure.core/defn- response-ec-2-access-denied-exception ([input] (response-ec-2-access-denied-exception nil input)) ([resultWrapper273508 input] (clojure.core/let [rawinput273507 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273509 {"Type" (rawinput273507 "Type"), "Message" (rawinput273507 "Message")}] (clojure.core/cond-> {} (letvar273509 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273509 ["Type"]))) (letvar273509 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273509 ["Message"])))))))

(clojure.core/defn- response-event-source-mapping-configuration ([input] (response-event-source-mapping-configuration nil input)) ([resultWrapper273511 input] (clojure.core/let [rawinput273510 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273512 {"UUID" (rawinput273510 "UUID"), "BatchSize" (rawinput273510 "BatchSize"), "EventSourceArn" (rawinput273510 "EventSourceArn"), "FunctionArn" (rawinput273510 "FunctionArn"), "LastModified" (rawinput273510 "LastModified"), "LastProcessingResult" (rawinput273510 "LastProcessingResult"), "State" (rawinput273510 "State"), "StateTransitionReason" (rawinput273510 "StateTransitionReason")}] (clojure.core/cond-> {} (letvar273512 "UUID") (clojure.core/assoc :uuid (deser-string (clojure.core/get-in letvar273512 ["UUID"]))) (letvar273512 "BatchSize") (clojure.core/assoc :batch-size (deser-batch-size (clojure.core/get-in letvar273512 ["BatchSize"]))) (letvar273512 "EventSourceArn") (clojure.core/assoc :event-source-arn (deser-arn (clojure.core/get-in letvar273512 ["EventSourceArn"]))) (letvar273512 "FunctionArn") (clojure.core/assoc :function-arn (deser-function-arn (clojure.core/get-in letvar273512 ["FunctionArn"]))) (letvar273512 "LastModified") (clojure.core/assoc :last-modified (deser-date (clojure.core/get-in letvar273512 ["LastModified"]))) (letvar273512 "LastProcessingResult") (clojure.core/assoc :last-processing-result (deser-string (clojure.core/get-in letvar273512 ["LastProcessingResult"]))) (letvar273512 "State") (clojure.core/assoc :state (deser-string (clojure.core/get-in letvar273512 ["State"]))) (letvar273512 "StateTransitionReason") (clojure.core/assoc :state-transition-reason (deser-string (clojure.core/get-in letvar273512 ["StateTransitionReason"])))))))

(clojure.core/defn- response-ec-2-unexpected-exception ([input] (response-ec-2-unexpected-exception nil input)) ([resultWrapper273514 input] (clojure.core/let [rawinput273513 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273515 {"Type" (rawinput273513 "Type"), "Message" (rawinput273513 "Message"), "EC2ErrorCode" (rawinput273513 "EC2ErrorCode")}] (clojure.core/cond-> {} (letvar273515 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273515 ["Type"]))) (letvar273515 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273515 ["Message"]))) (letvar273515 "EC2ErrorCode") (clojure.core/assoc :ec-2-error-code (deser-string (clojure.core/get-in letvar273515 ["EC2ErrorCode"])))))))

(clojure.core/defn- response-invalid-parameter-value-exception ([input] (response-invalid-parameter-value-exception nil input)) ([resultWrapper273517 input] (clojure.core/let [rawinput273516 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273518 {"Type" (rawinput273516 "Type"), "message" (rawinput273516 "message")}] (clojure.core/cond-> {} (letvar273518 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273518 ["Type"]))) (letvar273518 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273518 ["message"])))))))

(clojure.core/defn- response-invalid-security-group-id-exception ([input] (response-invalid-security-group-id-exception nil input)) ([resultWrapper273520 input] (clojure.core/let [rawinput273519 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273521 {"Type" (rawinput273519 "Type"), "Message" (rawinput273519 "Message")}] (clojure.core/cond-> {} (letvar273521 "Type") (clojure.core/assoc :type (deser-string (clojure.core/get-in letvar273521 ["Type"]))) (letvar273521 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar273521 ["Message"])))))))

(clojure.core/defn- response-get-layer-version-policy-response ([input] (response-get-layer-version-policy-response nil input)) ([resultWrapper273523 input] (clojure.core/let [rawinput273522 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar273524 {"Policy" (rawinput273522 "Policy"), "RevisionId" (rawinput273522 "RevisionId")}] (clojure.core/cond-> {} (letvar273524 "Policy") (clojure.core/assoc :policy (deser-string (clojure.core/get-in letvar273524 ["Policy"]))) (letvar273524 "RevisionId") (clojure.core/assoc :revision-id (deser-string (clojure.core/get-in letvar273524 ["RevisionId"])))))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:lambda:[a-z]{2}(-gov)?-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/subnet-id :max-count 16))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/batch-size (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 140)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"lambda:GetLayerVersion" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[^\s]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 170)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:lambda:)?([a-z]{2}(-gov)?-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids :portkey.aws.lambda.-2015-03-31/vpc-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/runtime #{"go1.x" "dotnetcore2.0" "ruby2.5" "python3.7" :dotnetcore-20 :nodejs "dotnetcore1.0" "java8" "dotnetcore2.1" :python-36 :java-8 "provided" :nodejs-810 :nodejs-43 "nodejs4.3" "python2.7" :python-37 "nodejs4.3-edge" :dotnetcore-10 "nodejs8.10" :go-1x "nodejs6.10" :provided "python3.6" :dotnetcore-21 :nodejs-43edge :nodejs-610 "nodejs" :ruby-25 :python-27})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.service-exception/type :portkey.aws.lambda.-2015-03-31.service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"\d{12}" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 100)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-response/variables :portkey.aws.lambda.-2015-03-31.environment-response/error]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/organization-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"o-[a-z0-9]{10,32}" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[0-9]+" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 100)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/log-type #{"None" :tail "Tail" :none})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer/arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.layer/arn :portkey.aws.lambda.-2015-03-31.layer/code-size]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/license-info (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 512))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kms-key-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:[a-z0-9-.]+:.*)|()" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 0 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 140)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+)|[a-zA-Z0-9-_]+" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-version-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 140)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+:[0-9]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/http-status clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z0-9-]*):([a-zA-Z0-9\-])+:([a-z]{2}(-gov)?-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 3 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 63)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/subnet-ids :portkey.aws.lambda.-2015-03-31/security-group-ids]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 128)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/master-region :portkey.aws.lambda.-2015-03-31/function-version :portkey.aws.lambda.-2015-03-31.list-functions-request/marker :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(arn:(aws[a-zA-Z-]*)?:[a-z0-9-.]+:.*)|()" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/max-layer-list-items (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/compatible-runtime (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/runtime))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-layer-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-layer-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name] :opt-un [:portkey.aws.lambda.-2015-03-31.list-layer-versions-request/compatible-runtime :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/marker :portkey.aws.lambda.-2015-03-31.list-layer-versions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 0 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 256)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 1024)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config-response/mode]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-configuration-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name] :opt-un [:portkey.aws.lambda.-2015-03-31/qualifier]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-request/version-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 140)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:[a-zA-Z0-9-]+:lambda:[a-zA-Z0-9-]+:\d{12}:layer:[a-zA-Z0-9-_]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/created-date (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-versions-list-item (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/layer-version-arn :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/version :portkey.aws.lambda.-2015-03-31/description :portkey.aws.lambda.-2015-03-31.layer-versions-list-item/created-date :portkey.aws.lambda.-2015-03-31/compatible-runtimes :portkey.aws.lambda.-2015-03-31/license-info]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #".*" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"arn:(aws[a-zA-Z-]*)?:lambda:[a-z]{2}(-gov)?-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__21112__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/layer-permission-allowed-principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"\d{12}|\*|arn:(aws[a-zA-Z-]*):iam::\d{12}:root" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-layer-version-request/version-number (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/layer-version-number))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-layer-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31/layer-name :portkey.aws.lambda.-2015-03-31.delete-layer-version-request/version-number] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/policy :portkey.aws.lambda.-2015-03-31.get-layer-version-policy-response/revision-id]))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lambda.-2015-03-31.list-tags-request/resource] :opt-un []))

(clojure.core/defn tag-resource "Adds tags (https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) to a\nfunction." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn delete-layer-version "Deletes a version of an AWS Lambda layer\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).\nDeleted versions can no longer be viewed or added to functions. To avoid\nbreaking functions, a copy of the version remains in Lambda until no functions\nrefer to it." ([delete-layer-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-layer-version-request delete-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLayerVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-layer-version-request) :ret clojure.core/true?)

(clojure.core/defn create-alias "Creates an alias\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html) for a\nLambda function version. Use aliases to provide clients with a function\nidentifier that you can update to invoke a different version.\n You can also map an alias to split invocation requests between two versions.\nUse the RoutingConfig parameter to specify a second version and the percentage\nof invocation requests that it receives." ([create-alias-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-alias-request create-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn add-layer-version-permission "Adds permissions to the resource-based policy of a version of an AWS Lambda\nlayer (https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).\nUse this action to grant layer usage permission to other accounts. You can grant\npermission to a single account, all AWS accounts, or all accounts in an\norganization.\n To revoke permission, call RemoveLayerVersionPermission with the statement ID\nthat you specified when you added it." ([add-layer-version-permission-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-add-layer-version-permission-request add-layer-version-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddLayerVersionPermission", :http.request.configuration/output-deser-fn response-add-layer-version-permission-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef add-layer-version-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-layer-version-permission-response))

(clojure.core/defn delete-function "Deletes a Lambda function. To delete a specific function version, use the\nQualifier parameter. Otherwise, all versions and aliases are deleted.\n To delete Lambda event source mappings that invoke a function, use\nDeleteEventSourceMapping. For AWS services and resources that invoke your\nfunction directly, delete the trigger in the service where you originally\nconfigured it." ([delete-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-function-request delete-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunction", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception}})))))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings "Lists event source mappings. Specify an EventSourceArn to only show event source\nmappings for a single event source." ([] (list-event-source-mappings {})) ([list-event-source-mappings-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-event-source-mappings-request list-event-source-mappings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEventSourceMappings", :http.request.configuration/output-deser-fn response-list-event-source-mappings-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency "Removes a concurrent execution limit from a function." ([delete-function-concurrency-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-function-concurrency-request delete-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFunctionConcurrency", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping "Deletes an event source mapping\n(https://docs.aws.amazon.com/lambda/latest/dg/intro-invocation-modes.html). You\ncan get the identifier of a mapping from the output of ListEventSourceMappings." ([delete-event-source-mapping-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-event-source-mapping-request delete-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn invoke "Invokes a Lambda function. You can invoke a function synchronously (and wait for\nthe response), or asynchronously. To invoke a function asynchronously, set\nInvocationType to Event.\n For synchronous invocation, details about the function response, including\nerrors, are included in the response body and headers. For either invocation\ntype, you can find more information in the execution log\n(https://docs.aws.amazon.com/lambda/latest/dg/monitoring-functions.html) and\ntrace (https://docs.aws.amazon.com/lambda/latest/dg/dlq.html). To record\nfunction errors for asynchronous invocations, configure your function with a\ndead letter queue (https://docs.aws.amazon.com/lambda/latest/dg/dlq.html).\n The status code in the API response doesn't reflect function errors. Error\ncodes are reserved for errors that prevent your function from executing, such as\npermissions errors, limit errors\n(https://docs.aws.amazon.com/lambda/latest/dg/limits.html), or issues with your\nfunction's code and configuration. For example, Lambda returns\nTooManyRequestsException if executing the function would cause you to exceed a\nconcurrency limit at either the account level\n(ConcurrentInvocationLimitExceeded) or function level\n(ReservedFunctionConcurrentInvocationLimitExceeded).\n For functions with a long timeout, your client might be disconnected during\nsynchronous invocation while it waits for a response. Configure your HTTP\nclient, SDK, firewall, proxy, or operating system to allow for long connections\nwith timeout or keep-alive settings.\n This operation requires permission for the lambda:InvokeFunction action." ([invocation-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-invocation-request invocation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invocation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/invocations", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invocation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Invoke", :http.request.configuration/output-deser-fn response-invocation-response, :http.request.spec/error-spec {"UnsupportedMediaTypeException" :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda.-2015-03-31/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda.-2015-03-31/invalid-subnet-id-exception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda.-2015-03-31/subnet-ip-address-limit-reached-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "KMSNotFoundException" :portkey.aws.lambda.-2015-03-31/kms-not-found-exception, "KMSInvalidStateException" :portkey.aws.lambda.-2015-03-31/kms-invalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda.-2015-03-31/kms-disabled-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda.-2015-03-31/kms-access-denied-exception, "ENILimitReachedException" :portkey.aws.lambda.-2015-03-31/eni-limit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda.-2015-03-31/ec-2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda.-2015-03-31/ec-2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda.-2015-03-31/ec-2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda.-2015-03-31/invalid-security-group-id-exception}})))))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invocation-response))

(clojure.core/defn get-account-settings "Retrieves details about your account's limits\n(https://docs.aws.amazon.com/lambda/latest/dg/limits.html) and usage in an AWS\nRegion." ([] (get-account-settings {})) ([get-account-settings-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-account-settings-request get-account-settings-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2016-08-19/account-settings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-account-settings-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAccountSettings", :http.request.configuration/output-deser-fn response-get-account-settings-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception}})))))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-account-settings-response))

(clojure.core/defn invoke-async " For asynchronous function invocation, use Invoke.\n Invokes a function asynchronously." ([invoke-async-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-invoke-async-request invoke-async-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/invoke-async-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2014-11-13/functions/{FunctionName}/invoke-async/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/invoke-async-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InvokeAsync", :http.request.configuration/output-deser-fn response-invoke-async-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception}})))))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invoke-async-response))

(clojure.core/defn get-function-configuration "Returns the version-specific settings of a Lambda function or version. The\noutput includes only options that can vary between versions of a function. To\nmodify these settings, use UpdateFunctionConfiguration.\n To get all of a function's details, including function-level settings, use\nGetFunction." ([get-function-configuration-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-function-configuration-request get-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn update-function-code "Updates a Lambda function's code.\n The function's code is locked when you publish a version. You can't modify the\ncode of a published version, only the unpublished version." ([update-function-code-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-function-code-request update-function-code-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/code", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-code-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunctionCode", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn list-versions-by-function "Returns a list of versions\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html), with the\nversion-specific configuration of each." ([list-versions-by-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-versions-by-function-request list-versions-by-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVersionsByFunction", :http.request.configuration/output-deser-fn response-list-versions-by-function-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping "Updates an event source mapping. You can change the function that AWS Lambda\ninvokes, or pause invocation and resume later from the same location." ([update-event-source-mapping-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-event-source-mapping-request update-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "ResourceInUseException" :portkey.aws.lambda.-2015-03-31/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn list-tags "Returns a function's tags\n(https://docs.aws.amazon.com/lambda/latest/dg/tagging.html). You can also view\ntags with GetFunction." ([list-tags-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-request list-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-tags-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-tags-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-tags-response))

(clojure.core/defn update-alias "Updates the configuration of a Lambda function alias\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([update-alias-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-alias-request update-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn get-event-source-mapping "Returns details about an event source mapping. You can get the identifier of a\nmapping from the output of ListEventSourceMappings." ([get-event-source-mapping-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-event-source-mapping-request get-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/{UUID}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn remove-layer-version-permission "Removes a statement from the permissions policy for a version of an AWS Lambda\nlayer (https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).\nFor more information, see AddLayerVersionPermission." ([remove-layer-version-permission-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-remove-layer-version-permission-request remove-layer-version-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy/{StatementId}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/remove-layer-version-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveLayerVersionPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef remove-layer-version-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-layer-version-permission-request) :ret clojure.core/true?)

(clojure.core/defn get-function "Returns information about the function or function version, with a link to\ndownload the deployment package that's valid for 10 minutes. If you specify a\nfunction version, only details that are specific to that version are returned." ([get-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-function-request get-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-function-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFunction", :http.request.configuration/output-deser-fn response-get-function-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-function-response))

(clojure.core/defn get-policy "Returns the resource-based IAM policy\n(https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html)\nfor a function, version, or alias." ([get-policy-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-policy-request get-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPolicy", :http.request.configuration/output-deser-fn response-get-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-policy-response))

(clojure.core/defn add-permission "Grants an AWS service or another account permission to use a function. You can\napply the policy at the function level, or specify a qualifier to restrict\naccess to a single version or alias. If you use a qualifier, the invoker must\nuse the full Amazon Resource Name (ARN) of that version or alias to invoke the\nfunction.\n To grant permission to another account, specify the account ID as the\nPrincipal. For AWS services, the principal is a domain-style identifier defined\nby the service, like s3.amazonaws.com or sns.amazonaws.com. For AWS services,\nyou can also specify the ARN or owning account of the associated resource as the\nSourceArn or SourceAccount. If you grant permission to a service principal\nwithout specifying the source, other accounts could potentially configure\nresources in their account to invoke your Lambda function.\n This action adds a statement to a resource-based permission policy for the\nfunction. For more information about function policies, see Lambda Function\nPolicies\n(https://docs.aws.amazon.com/lambda/latest/dg/access-control-resource-based.html)." ([add-permission-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-add-permission-request add-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/add-permission-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/add-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddPermission", :http.request.configuration/output-deser-fn response-add-permission-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-permission-response))

(clojure.core/defn get-layer-version-policy "Returns the permission policy for a version of an AWS Lambda layer\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html). For\nmore information, see AddLayerVersionPermission." ([get-layer-version-policy-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-layer-version-policy-request get-layer-version-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}/policy", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLayerVersionPolicy", :http.request.configuration/output-deser-fn response-get-layer-version-policy-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef get-layer-version-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-layer-version-policy-response))

(clojure.core/defn publish-layer-version "Creates an AWS Lambda layer\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) from a\nZIP archive. Each time you call PublishLayerVersion with the same version name,\na new version is created.\n Add layers to your function with CreateFunction or UpdateFunctionConfiguration." ([publish-layer-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-publish-layer-version-request publish-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/publish-layer-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/publish-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PublishLayerVersion", :http.request.configuration/output-deser-fn response-publish-layer-version-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception}})))))
(clojure.spec.alpha/fdef publish-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-layer-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/publish-layer-version-response))

(clojure.core/defn create-event-source-mapping "Creates a mapping between an event source and an AWS Lambda function. Lambda\nreads items from the event source and triggers the function.\n For details about each event source type, see the following topics.\n * Using AWS Lambda with Amazon Kinesis\n(https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html)\n * Using AWS Lambda with Amazon SQS\n(https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html)\n * Using AWS Lambda with Amazon DynamoDB\n(https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html)" ([create-event-source-mapping-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-event-source-mapping-request create-event-source-mapping-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/event-source-mappings/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 202, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEventSourceMapping", :http.request.configuration/output-deser-fn response-event-source-mapping-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-alias "Returns details about a Lambda function alias\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([get-alias-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-alias-request get-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/alias-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAlias", :http.request.configuration/output-deser-fn response-alias-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn list-layer-versions "Lists the versions of an AWS Lambda layer\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html).\nVersions that have been deleted aren't listed. Specify a runtime identifier\n(https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) to list only\nversions that indicate that they're compatible with that runtime." ([list-layer-versions-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-layer-versions-request list-layer-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-layer-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-layer-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLayerVersions", :http.request.configuration/output-deser-fn response-list-layer-versions-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-layer-versions :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-layer-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-layer-versions-response))

(clojure.core/defn list-aliases "Returns a list of aliases\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html) for a\nLambda function." ([list-aliases-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-aliases-request list-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAliases", :http.request.configuration/output-deser-fn response-list-aliases-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-aliases-response))

(clojure.core/defn list-functions "Returns a list of Lambda functions, with the version-specific configuration of\neach.\n Set FunctionVersion to ALL to include all published versions of each function\nin addition to the unpublished version. To get more information about a function\nor version, use GetFunction." ([] (list-functions {})) ([list-functions-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-functions-request list-functions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-functions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-functions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFunctions", :http.request.configuration/output-deser-fn response-list-functions-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception}})))))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-functions-response))

(clojure.core/defn remove-permission "Revokes function-use permission from an AWS service or another account. You can\nget the ID of the statement from the output of GetPolicy." ([remove-permission-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/policy/{StatementId}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/remove-permission-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias "Deletes a Lambda function alias\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([delete-alias-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-alias-request delete-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/aliases/{Name}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/delete-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function "Creates a Lambda function. To create a function, you need a deployment package\n(https://docs.aws.amazon.com/lambda/latest/dg/deployment-package-v2.html) and an\nexecution role\n(https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html#lambda-intro-execution-role).\nThe deployment package contains your function code. The execution role grants\nthe function permission to use AWS services, such as Amazon CloudWatch Logs for\nlog streaming and AWS X-Ray for request tracing.\n A function has an unpublished version, and can have published versions and\naliases. The unpublished version changes when you update your function's code\nand configuration. A published version is a snapshot of your function code and\nconfiguration that can't be changed. An alias is a named resource that maps to a\nversion, and can be changed to map to a different version. Use the Publish\nparameter to create version 1 of your function from its initial configuration.\n The other parameters let you configure version-specific and function-level\nsettings. You can modify version-specific settings later with\nUpdateFunctionConfiguration. Function-level settings apply to both the\nunpublished and published versions of the function, and include tags\n(TagResource) and per-function concurrency limits (PutFunctionConcurrency).\n If another account or an AWS service invokes your function, use AddPermission\nto grant permission by creating a resource-based IAM policy. You can grant\npermissions at the function level, on a version, or on an alias.\n To invoke your function directly, use Invoke. To invoke your function in\nresponse to events in other AWS services, create an event source mapping\n(CreateEventSourceMapping), or configure a function trigger in the other\nservice. For more information, see Invoking Functions\n(https://docs.aws.amazon.com/lambda/latest/dg/invoking-lambda-functions.html)." ([create-function-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-function-request create-function-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/create-function-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFunction", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn untag-resource "Removes tags (https://docs.aws.amazon.com/lambda/latest/dg/tagging.html) from a\nfunction." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-03-31/tags/{ARN}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-layer-version "Returns information about a version of an AWS Lambda layer\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html), with a\nlink to download the layer archive that's valid for 10 minutes." ([get-layer-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-layer-version-request get-layer-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers/{LayerName}/versions/{VersionNumber}", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/get-layer-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLayerVersion", :http.request.configuration/output-deser-fn response-get-layer-version-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-layer-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-layer-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-layer-version-response))

(clojure.core/defn publish-version "Creates a version\n(https://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html) from the\ncurrent code and configuration of a function. Use versions to create a snapshot\nof your function code and configuration that doesn't change.\n AWS Lambda doesn't publish a version if the function's configuration and code\nhaven't changed since the last version. Use UpdateFunctionCode or\nUpdateFunctionConfiguration to update the function before publishing a version.\n Clients can invoke versions directly or with an alias. To create an alias, use\nCreateAlias." ([publish-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-publish-version-request publish-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/versions", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/publish-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PublishVersion", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn put-function-concurrency "Sets the maximum number of simultaneous executions for a function, and reserves\ncapacity for that concurrency level.\n Concurrency settings apply to the function as a whole, including all published\nversions and the unpublished version. Reserving concurrency both ensures that\nyour function has capacity to process the specified number of events\nsimultaneously, and prevents it from scaling beyond that level. Use GetFunction\nto see the current setting for a function.\n Use GetAccountSettings to see your regional concurrency limit. You can reserve\nconcurrency for as many functions as you like, as long as you leave at least 100\nsimultaneous executions unreserved for functions that aren't configured with a\nper-function limit. For more information, see Managing Concurrency\n(https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)." ([put-function-concurrency-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-function-concurrency-request put-function-concurrency-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/concurrency, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2017-10-31/functions/{FunctionName}/concurrency", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutFunctionConcurrency", :http.request.configuration/output-deser-fn response-concurrency, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/concurrency))

(clojure.core/defn list-layers "Lists AWS Lambda layers\n(https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html) and\nshows information about the latest version of each. Specify a runtime identifier\n(https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) to list only\nlayers that indicate that they're compatible with that runtime." ([] (list-layers {})) ([list-layers-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-layers-request list-layers-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/list-layers-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2018-10-31/layers", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/list-layers-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLayers", :http.request.configuration/output-deser-fn response-list-layers-response, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception}})))))
(clojure.spec.alpha/fdef list-layers :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-layers-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-layers-response))

(clojure.core/defn update-function-configuration "Modify the version-specifc settings of a Lambda function.\n These settings can vary between versions of a function and are locked when you\npublish a version. You can't modify the configuration of a published version,\nonly the unpublished version.\n To configure function concurrency, use PutFunctionConcurrency. To grant invoke\npermissions to an account or AWS service, use AddPermission." ([update-function-configuration-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-function-configuration-request update-function-configuration-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.lambda.-2015-03-31/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lambda.-2015-03-31/function-configuration, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2015-03-31/functions/{FunctionName}/configuration", :http.request.configuration/version "2015-03-31", :http.request.configuration/service-id "Lambda", :http.request.spec/input-spec :portkey.aws.lambda.-2015-03-31/update-function-configuration-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFunctionConfiguration", :http.request.configuration/output-deser-fn response-function-configuration, :http.request.spec/error-spec {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
