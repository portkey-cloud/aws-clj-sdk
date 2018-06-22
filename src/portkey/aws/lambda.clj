(ns portkey.aws.lambda (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.lambda.create-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.create-function-request/publish (clojure.spec.alpha/and :portkey.aws.lambda/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.create-function-request/code (clojure.spec.alpha/and :portkey.aws.lambda/function-code))
(clojure.spec.alpha/def :portkey.aws.lambda/create-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda/Runtime :portkey.aws.lambda.create-function-request/Role :portkey.aws.lambda/Handler :portkey.aws.lambda.create-function-request/Code] :opt-un [:portkey.aws.lambda/TracingConfig :portkey.aws.lambda/Timeout :portkey.aws.lambda/DeadLetterConfig :portkey.aws.lambda/Tags :portkey.aws.lambda/MemorySize :portkey.aws.lambda/KMSKeyArn :portkey.aws.lambda/Description :portkey.aws.lambda/Environment :portkey.aws.lambda/VpcConfig :portkey.aws.lambda.create-function-request/Publish] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/reserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 0 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/event-source-mappings-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/event-source-mapping-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.update-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.update-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda/version))
(clojure.spec.alpha/def :portkey.aws.lambda.update-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.update-alias-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/update-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda.update-alias-request/Name] :opt-un [:portkey.aws.lambda.update-alias-request/FunctionVersion :portkey.aws.lambda/Description :portkey.aws.lambda.update-alias-request/RoutingConfig :portkey.aws.lambda.update-alias-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.unsupported-media-type-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/unsupported-media-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.unsupported-media-type-exception/Type :portkey.aws.lambda.unsupported-media-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/put-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda/ReservedConcurrentExecutions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.list-event-source-mappings-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.list-event-source-mappings-request/marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-event-source-mappings-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda/list-event-source-mappings-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.list-event-source-mappings-request/EventSourceArn :portkey.aws.lambda/FunctionName :portkey.aws.lambda.list-event-source-mappings-request/Marker :portkey.aws.lambda.list-event-source-mappings-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.tracing-config/mode (clojure.spec.alpha/and :portkey.aws.lambda/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda/tracing-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.tracing-config/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.request-too-large-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.request-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/request-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.request-too-large-exception/Type :portkey.aws.lambda.request-too-large-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-subnetidexception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-subnetidexception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-subnetidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-subnetidexception/Type :portkey.aws.lambda.invalid-subnetidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.subnetipaddress-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.subnetipaddress-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/subnetipaddress-limit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.subnetipaddress-limit-reached-exception/Type :portkey.aws.lambda.subnetipaddress-limit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.function-code/zip-file (clojure.spec.alpha/and :portkey.aws.lambda/blob))
(clojure.spec.alpha/def :portkey.aws.lambda/function-code (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.function-code/ZipFile :portkey.aws.lambda/S3Bucket :portkey.aws.lambda/S3Key :portkey.aws.lambda/S3ObjectVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/s3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/subnet-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/subnet-id :max-count 16) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda/batch-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 140)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.precondition-failed-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.precondition-failed-exception/Type :portkey.aws.lambda.precondition-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/unreserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 0 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/security-group-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/security-group-id :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.list-versions-by-function-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-versions-by-function-response/versions (clojure.spec.alpha/and :portkey.aws.lambda/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda/list-versions-by-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.list-versions-by-function-response/NextMarker :portkey.aws.lambda.list-versions-by-function-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.account-usage/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda.account-usage/function-count (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda/account-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.account-usage/TotalCodeSize :portkey.aws.lambda.account-usage/FunctionCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.update-function-code-request/zip-file (clojure.spec.alpha/and :portkey.aws.lambda/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.update-function-code-request/publish (clojure.spec.alpha/and :portkey.aws.lambda/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.update-function-code-request/dry-run (clojure.spec.alpha/and :portkey.aws.lambda/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.update-function-code-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/update-function-code-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [:portkey.aws.lambda.update-function-code-request/ZipFile :portkey.aws.lambda/S3Bucket :portkey.aws.lambda/S3Key :portkey.aws.lambda/S3ObjectVersion :portkey.aws.lambda.update-function-code-request/Publish :portkey.aws.lambda.update-function-code-request/DryRun :portkey.aws.lambda.update-function-code-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.delete-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/delete-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.delete-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/environment-variables (clojure.spec.alpha/map-of :portkey.aws.lambda/environment-variable-name :portkey.aws.lambda/environment-variable-value))

(clojure.spec.alpha/def :portkey.aws.lambda/alias-routing-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/AdditionalVersionWeights] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.dead-letter-config/target-arn (clojure.spec.alpha/and :portkey.aws.lambda/resource-arn))
(clojure.spec.alpha/def :portkey.aws.lambda/dead-letter-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.dead-letter-config/TargetArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/delete-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/list-tags-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[^\s]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 170)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/function-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/function-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda/vpc-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/SubnetIds :portkey.aws.lambda/SecurityGroupIds :portkey.aws.lambda/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/runtime (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"go1.x" "go1.x", :nodejs4.3-edge "nodejs4.3-edge", :go1.x "go1.x", "dotnetcore2.0" "dotnetcore2.0", :nodejs6.10 "nodejs6.10", :python3.6 "python3.6", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", :nodejs8.10 "nodejs8.10", :python2.7 "python2.7", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", :dotnetcore2.0 "dotnetcore2.0", "nodejs4.3-edge" "nodejs4.3-edge", "nodejs8.10" "nodejs8.10", :java8 "java8", :nodejs4.3 "nodejs4.3", "nodejs6.10" "nodejs6.10", "python3.6" "python3.6", :dotnetcore1.0 "dotnetcore1.0", "nodejs" "nodejs"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.service-exception/Type :portkey.aws.lambda.service-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"\d{12}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda/list-event-source-mappings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.list-event-source-mappings-response/NextMarker :portkey.aws.lambda.list-event-source-mappings-response/EventSourceMappings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 100)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda/environment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.environment-response/Variables :portkey.aws.lambda.environment-response/Error] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.kmsnot-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.kmsnot-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/kmsnot-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.kmsnot-found-exception/Type :portkey.aws.lambda.kmsnot-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.kmsinvalid-state-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.kmsinvalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/kmsinvalid-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.kmsinvalid-state-exception/Type :portkey.aws.lambda.kmsinvalid-state-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-runtime-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-runtime-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-runtime-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-runtime-exception/Type :portkey.aws.lambda.invalid-runtime-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/tags (clojure.spec.alpha/map-of :portkey.aws.lambda/tag-key :portkey.aws.lambda/tag-value))

(clojure.spec.alpha/def :portkey.aws.lambda.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda/list-functions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.list-functions-response/NextMarker :portkey.aws.lambda.list-functions-response/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[0-9]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/delete-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [:portkey.aws.lambda/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invocation-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-request/client-context (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-request/payload (clojure.spec.alpha/and :portkey.aws.lambda/blob))
(clojure.spec.alpha/def :portkey.aws.lambda/invocation-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.invocation-request/FunctionName] :opt-un [:portkey.aws.lambda/InvocationType :portkey.aws.lambda/LogType :portkey.aws.lambda.invocation-request/ClientContext :portkey.aws.lambda.invocation-request/Payload :portkey.aws.lambda/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.kmsdisabled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.kmsdisabled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/kmsdisabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.kmsdisabled-exception/Type :portkey.aws.lambda.kmsdisabled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda/get-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.get-function-response/Configuration :portkey.aws.lambda.get-function-response/Code :portkey.aws.lambda/Tags :portkey.aws.lambda/Concurrency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/function-version (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ALL" "ALL", :all "ALL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.create-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.create-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda/version))
(clojure.spec.alpha/def :portkey.aws.lambda.create-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda/create-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda.create-alias-request/Name :portkey.aws.lambda.create-alias-request/FunctionVersion] :opt-un [:portkey.aws.lambda/Description :portkey.aws.lambda.create-alias-request/RoutingConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.code-storage-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.code-storage-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/code-storage-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.code-storage-exceeded-exception/Type :portkey.aws.lambda.code-storage-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lambda/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 128 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 3008))))

(clojure.spec.alpha/def :portkey.aws.lambda.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.lambda/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.lambda/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.too-many-requests-exception/retryAfterSeconds :portkey.aws.lambda.too-many-requests-exception/Type :portkey.aws.lambda.too-many-requests-exception/message :portkey.aws.lambda.too-many-requests-exception/Reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-request-content-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-request-content-exception/Type :portkey.aws.lambda.invalid-request-content-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.get-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/get-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.get-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.kmsaccess-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.kmsaccess-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/kmsaccess-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.kmsaccess-denied-exception/Type :portkey.aws.lambda.kmsaccess-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.add-permission-request/source-account (clojure.spec.alpha/and :portkey.aws.lambda/source-owner))
(clojure.spec.alpha/def :portkey.aws.lambda.add-permission-request/source-arn (clojure.spec.alpha/and :portkey.aws.lambda/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.add-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/add-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda/StatementId :portkey.aws.lambda/Action :portkey.aws.lambda/Principal] :opt-un [:portkey.aws.lambda.add-permission-request/SourceAccount :portkey.aws.lambda.add-permission-request/SourceArn :portkey.aws.lambda.add-permission-request/RevisionId :portkey.aws.lambda/Qualifier :portkey.aws.lambda/EventSourceToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/get-account-settings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/AccountLimit :portkey.aws.lambda/AccountUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/throttle-reason (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:concurrent-invocation-limit-exceeded "ConcurrentInvocationLimitExceeded", :function-invocation-rate-limit-exceeded "FunctionInvocationRateLimitExceeded", :reserved-function-invocation-rate-limit-exceeded "ReservedFunctionInvocationRateLimitExceeded", "ReservedFunctionInvocationRateLimitExceeded" "ReservedFunctionInvocationRateLimitExceeded", "ConcurrentInvocationLimitExceeded" "ConcurrentInvocationLimitExceeded", :caller-rate-limit-exceeded "CallerRateLimitExceeded", "CallerRateLimitExceeded" "CallerRateLimitExceeded", "FunctionInvocationRateLimitExceeded" "FunctionInvocationRateLimitExceeded", :reserved-function-concurrent-invocation-limit-exceeded "ReservedFunctionConcurrentInvocationLimitExceeded", "ReservedFunctionConcurrentInvocationLimitExceeded" "ReservedFunctionConcurrentInvocationLimitExceeded"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda/tag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.tag-resource-request/Resource :portkey.aws.lambda/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 100)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/log-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"None" "None", :none "None", "Tail" "Tail", :tail "Tail"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.get-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda/alias))
(clojure.spec.alpha/def :portkey.aws.lambda/get-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda.get-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/tag-key) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda.enilimit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.enilimit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/enilimit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.enilimit-reached-exception/Type :portkey.aws.lambda.enilimit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/concurrency (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/ReservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.add-permission-response/statement (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/add-permission-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.add-permission-response/Statement] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.get-policy-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.get-policy-request/FunctionName] :opt-un [:portkey.aws.lambda/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/weight clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.lambda.invocation-response/status-code (clojure.spec.alpha/and :portkey.aws.lambda/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-response/function-error (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-response/log-result (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-response/payload (clojure.spec.alpha/and :portkey.aws.lambda/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.invocation-response/executed-version (clojure.spec.alpha/and :portkey.aws.lambda/version))
(clojure.spec.alpha/def :portkey.aws.lambda/invocation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invocation-response/StatusCode :portkey.aws.lambda.invocation-response/FunctionError :portkey.aws.lambda.invocation-response/LogResult :portkey.aws.lambda.invocation-response/Payload :portkey.aws.lambda.invocation-response/ExecutedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.resource-not-found-exception/Type :portkey.aws.lambda.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invoke-async-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda/blob-stream))
(clojure.spec.alpha/def :portkey.aws.lambda/invoke-async-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.invoke-async-request/FunctionName :portkey.aws.lambda.invoke-async-request/InvokeArgs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.account-limit/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda.account-limit/code-size-unzipped (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda.account-limit/code-size-zipped (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda.account-limit/concurrent-executions (clojure.spec.alpha/and :portkey.aws.lambda/integer))
(clojure.spec.alpha/def :portkey.aws.lambda/account-limit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.account-limit/TotalCodeSize :portkey.aws.lambda.account-limit/CodeSizeUnzipped :portkey.aws.lambda.account-limit/CodeSizeZipped :portkey.aws.lambda.account-limit/ConcurrentExecutions :portkey.aws.lambda/UnreservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.environment-error/error-code (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.environment-error/message (clojure.spec.alpha/and :portkey.aws.lambda/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.lambda/environment-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.environment-error/ErrorCode :portkey.aws.lambda.environment-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/environment-variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda/kmskey-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.update-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/update-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.update-event-source-mapping-request/UUID] :opt-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda/Enabled :portkey.aws.lambda/BatchSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/alias-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.lambda/alias-configuration) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.lambda/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda/invocation-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.get-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.get-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.get-policy-response/Policy :portkey.aws.lambda.get-policy-response/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda/blob-stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.delete-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda/alias))
(clojure.spec.alpha/def :portkey.aws.lambda/delete-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda.delete-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.publish-version-request/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.publish-version-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/publish-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [:portkey.aws.lambda.publish-version-request/CodeSha256 :portkey.aws.lambda/Description :portkey.aws.lambda.publish-version-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.remove-permission-request/statement-id (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-statement-id))
(clojure.spec.alpha/def :portkey.aws.lambda.remove-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/remove-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName :portkey.aws.lambda.remove-permission-request/StatementId] :opt-un [:portkey.aws.lambda/Qualifier :portkey.aws.lambda.remove-permission-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/tracing-mode (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda.get-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda/get-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.get-function-request/FunctionName] :opt-un [:portkey.aws.lambda/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda/invoke-async-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invoke-async-response/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.update-function-configuration-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/update-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [:portkey.aws.lambda/TracingConfig :portkey.aws.lambda/Timeout :portkey.aws.lambda/DeadLetterConfig :portkey.aws.lambda/Handler :portkey.aws.lambda/Runtime :portkey.aws.lambda/MemorySize :portkey.aws.lambda.update-function-configuration-request/Role :portkey.aws.lambda/KMSKeyArn :portkey.aws.lambda/Description :portkey.aws.lambda/Environment :portkey.aws.lambda/VpcConfig :portkey.aws.lambda.update-function-configuration-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.environment/variables (clojure.spec.alpha/and :portkey.aws.lambda/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda/environment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.environment/Variables] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/s3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/resource-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.resource-conflict-exception/Type :portkey.aws.lambda.resource-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda/list-versions-by-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.list-versions-by-function-request/FunctionName] :opt-un [:portkey.aws.lambda.list-versions-by-function-request/Marker :portkey.aws.lambda.list-versions-by-function-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-zip-file-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-zip-file-exception/Type :portkey.aws.lambda.invalid-zip-file-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda/list-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.list-aliases-response/NextMarker :portkey.aws.lambda.list-aliases-response/Aliases] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/tracing-config (clojure.spec.alpha/and :portkey.aws.lambda/tracing-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda/name-spaced-function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.lambda/environment-response))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda/long))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/vpc-config (clojure.spec.alpha/and :portkey.aws.lambda/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.function-configuration/master-arn (clojure.spec.alpha/and :portkey.aws.lambda/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.function-configuration/TracingConfig :portkey.aws.lambda.function-configuration/FunctionArn :portkey.aws.lambda.function-configuration/FunctionName :portkey.aws.lambda/Timeout :portkey.aws.lambda/DeadLetterConfig :portkey.aws.lambda/Handler :portkey.aws.lambda/Runtime :portkey.aws.lambda/MemorySize :portkey.aws.lambda.function-configuration/Role :portkey.aws.lambda/KMSKeyArn :portkey.aws.lambda/Description :portkey.aws.lambda.function-configuration/LastModified :portkey.aws.lambda.function-configuration/Environment :portkey.aws.lambda.function-configuration/CodeSize :portkey.aws.lambda.function-configuration/VpcConfig :portkey.aws.lambda.function-configuration/RevisionId :portkey.aws.lambda/Version :portkey.aws.lambda.function-configuration/CodeSha256 :portkey.aws.lambda.function-configuration/MasterArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/s3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 3 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 63)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/vpc-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/SubnetIds :portkey.aws.lambda/SecurityGroupIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 128)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/policy-length-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.policy-length-exceeded-exception/Type :portkey.aws.lambda.policy-length-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda/list-functions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda/MasterRegion :portkey.aws.lambda/FunctionVersion :portkey.aws.lambda.list-functions-request/Marker :portkey.aws.lambda.list-functions-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 0 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 256)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13768__auto__] (clojure.core/<= 1 (clojure.core/count s__13768__auto__))) (clojure.core/fn [s__13769__auto__] (clojure.core/< (clojure.core/count s__13769__auto__) 1024)) (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda/tracing-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.tracing-config-response/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda/get-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.get-function-configuration-request/FunctionName] :opt-un [:portkey.aws.lambda/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.lambda/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #".*" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/additional-version-weights (clojure.spec.alpha/map-of :portkey.aws.lambda/additional-version :portkey.aws.lambda/weight))

(clojure.spec.alpha/def :portkey.aws.lambda.alias-configuration/alias-arn (clojure.spec.alpha/and :portkey.aws.lambda/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.alias-configuration/name (clojure.spec.alpha/and :portkey.aws.lambda/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.alias-configuration/function-version (clojure.spec.alpha/and :portkey.aws.lambda/version))
(clojure.spec.alpha/def :portkey.aws.lambda.alias-configuration/routing-config (clojure.spec.alpha/and :portkey.aws.lambda/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.alias-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/alias-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.alias-configuration/AliasArn :portkey.aws.lambda.alias-configuration/Name :portkey.aws.lambda.alias-configuration/FunctionVersion :portkey.aws.lambda/Description :portkey.aws.lambda.alias-configuration/RoutingConfig :portkey.aws.lambda.alias-configuration/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.ec2-throttled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.ec2-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/ec2-throttled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.ec2-throttled-exception/Type :portkey.aws.lambda.ec2-throttled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.ec2-access-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.ec2-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/ec2-access-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.ec2-access-denied-exception/Type :portkey.aws.lambda.ec2-access-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.create-event-source-mapping-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.create-event-source-mapping-request/starting-position (clojure.spec.alpha/and :portkey.aws.lambda/event-source-position))
(clojure.spec.alpha/def :portkey.aws.lambda.create-event-source-mapping-request/starting-position-timestamp (clojure.spec.alpha/and :portkey.aws.lambda/date))
(clojure.spec.alpha/def :portkey.aws.lambda/create-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.create-event-source-mapping-request/EventSourceArn :portkey.aws.lambda/FunctionName :portkey.aws.lambda.create-event-source-mapping-request/StartingPosition] :opt-un [:portkey.aws.lambda/Enabled :portkey.aws.lambda/BatchSize :portkey.aws.lambda.create-event-source-mapping-request/StartingPositionTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda/date))
(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/last-processing-result (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/state (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.event-source-mapping-configuration/state-transition-reason (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/event-source-mapping-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.event-source-mapping-configuration/UUID :portkey.aws.lambda/BatchSize :portkey.aws.lambda.event-source-mapping-configuration/EventSourceArn :portkey.aws.lambda/FunctionArn :portkey.aws.lambda.event-source-mapping-configuration/LastModified :portkey.aws.lambda.event-source-mapping-configuration/LastProcessingResult :portkey.aws.lambda.event-source-mapping-configuration/State :portkey.aws.lambda.event-source-mapping-configuration/StateTransitionReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.ec2-unexpected-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.ec2-unexpected-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.ec2-unexpected-exception/ec2-error-code (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/ec2-unexpected-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.ec2-unexpected-exception/Type :portkey.aws.lambda.ec2-unexpected-exception/Message :portkey.aws.lambda.ec2-unexpected-exception/EC2ErrorCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-parameter-value-exception/Type :portkey.aws.lambda.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/function-code-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.function-code-location/RepositoryType :portkey.aws.lambda.function-code-location/Location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__13770__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__13770__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda/get-account-settings-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.list-aliases-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda/version))
(clojure.spec.alpha/def :portkey.aws.lambda.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.list-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda/list-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda/FunctionName] :opt-un [:portkey.aws.lambda.list-aliases-request/FunctionVersion :portkey.aws.lambda.list-aliases-request/Marker :portkey.aws.lambda.list-aliases-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.invalid-security-groupidexception/type (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda.invalid-security-groupidexception/message (clojure.spec.alpha/and :portkey.aws.lambda/string))
(clojure.spec.alpha/def :portkey.aws.lambda/invalid-security-groupidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.invalid-security-groupidexception/Type :portkey.aws.lambda.invalid-security-groupidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.lambda/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.lambda/untag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.untag-resource-request/Resource :portkey.aws.lambda.untag-resource-request/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda/event-source-position (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.lambda/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda/list-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.list-tags-request/Resource] :opt-un [] :locations {}))

(clojure.core/defn tag-resource "Creates a list of tags (key-value pairs) on the Lambda function. Requires the\nLambda function ARN (Amazon Resource Name). If a key is specified without a\nvalue, Lambda creates a tag with the specified key and a value of null. For more\ninformation, see Tagging Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS Lambda\nDeveloper Guide." ([tag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2017-03-31/tags/{ARN}" tag-resource-request :portkey.aws.lambda/tag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-alias "Creates an alias that points to the specified Lambda function version. For more\ninformation, see Introduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n Alias names are unique for a given function. This requires permission for the\nlambda:CreateAlias action." ([create-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/functions/{FunctionName}/aliases" create-alias-request :portkey.aws.lambda/create-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda/alias-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/alias-configuration))

(clojure.core/defn delete-function "Deletes the specified Lambda function code and configuration.\n If you are using the versioning feature and you don't specify a function\nversion in your DeleteFunction request, AWS Lambda will delete the function,\nincluding all its versions, and any aliases pointing to the function versions.\nTo delete a specific function version, you must provide the function version via\nthe Qualifier parameter. For information about function versioning, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n When you delete a function the associated resource policy is also deleted. You\nwill need to delete the event source mappings explicitly.\n This operation requires permission for the lambda:DeleteFunction action." ([delete-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}" delete-function-request :portkey.aws.lambda/delete-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception})))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings "Returns a list of event source mappings you created using the\nCreateEventSourceMapping (see CreateEventSourceMapping).\n For each mapping, the API returns configuration information. You can optionally\nspecify filters to retrieve specific event source mappings.\n If you are using the versioning feature, you can get list of event source\nmappings for a specific Lambda function version or an alias as described in the\nFunctionName parameter. For information about the versioning feature, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:ListEventSourceMappings\naction." ([] (list-event-source-mappings {})) ([list-event-source-mappings-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/event-source-mappings/" list-event-source-mappings-request :portkey.aws.lambda/list-event-source-mappings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"EventSourceArn" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda/list-event-source-mappings-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency "Removes concurrent execution limits from this function. For more information,\nsee concurrent-executions." ([delete-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2017-10-31/functions/{FunctionName}/concurrency" delete-function-concurrency-request :portkey.aws.lambda/delete-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping "Removes an event source mapping. This means AWS Lambda will no longer invoke the\nfunction for events in the associated source.\n This operation requires permission for the lambda:DeleteEventSourceMapping\naction." ([delete-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2015-03-31/event-source-mappings/{UUID}" delete-event-source-mapping-request :portkey.aws.lambda/delete-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/event-source-mapping-configuration))

(clojure.core/defn invoke "Invokes a specific Lambda function. For an example, see Create the Lambda\nFunction and Test It Manually\n(http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually).\n If you are using the versioning feature, you can invoke the specific function\nversion by providing function version or alias name that is pointing to the\nfunction version using the Qualifier parameter in the request. If you don't\nprovide the Qualifier parameter, the $LATEST version of the Lambda function is\ninvoked. Invocations occur at least once in response to an event and functions\nmust be idempotent to handle this. For information about the versioning feature,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:InvokeFunction action.\n The TooManyRequestsException noted below will return the following:\nConcurrentInvocationLimitExceeded will be returned if you have no functions with\nreserved concurrency and have exceeded your account concurrent limit or if a\nfunction without reserved concurrency exceeds the account's unreserved\nconcurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be\nreturned when a function with reserved concurrency exceeds its configured\nconcurrency limit." ([invocation-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/functions/{FunctionName}/invocations" invocation-request :portkey.aws.lambda/invocation-request {:payload "Payload", :move {}, :headers {"InvocationType" ["X-Amz-Invocation-Type" nil], "LogType" ["X-Amz-Log-Type" nil], "ClientContext" ["X-Amz-Client-Context" nil]}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} nil :portkey.aws.lambda/invocation-response {"UnsupportedMediaTypeException" :portkey.aws.lambda/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda/invalid-subnetidexception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda/subnetipaddress-limit-reached-exception, "ServiceException" :portkey.aws.lambda/service-exception, "KMSNotFoundException" :portkey.aws.lambda/kmsnot-found-exception, "KMSInvalidStateException" :portkey.aws.lambda/kmsinvalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda/kmsdisabled-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda/kmsaccess-denied-exception, "ENILimitReachedException" :portkey.aws.lambda/enilimit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda/ec2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda/ec2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda/ec2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda/invalid-security-groupidexception})))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/invocation-response))

(clojure.core/defn get-account-settings "Returns a customer's account settings.\n You can use this operation to retrieve Lambda limits information, such as code\nsize and concurrency limits. For more information about limits, see AWS Lambda\nLimits (http://docs.aws.amazon.com/lambda/latest/dg/limits.html). You can also\nretrieve resource usage statistics, such as code storage usage and function\ncount." ([] (get-account-settings {})) ([get-account-settings-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2016-08-19/account-settings/" get-account-settings-request :portkey.aws.lambda/get-account-settings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.lambda/get-account-settings-response {"TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "ServiceException" :portkey.aws.lambda/service-exception})))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/get-account-settings-response))

(clojure.core/defn invoke-async " This API is deprecated. We recommend you use Invoke API (see Invoke).\n Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda\nexecutes the specified function asynchronously. To see the logs generated by the\nLambda function execution, see the CloudWatch Logs console.\n This operation requires permission for the lambda:InvokeFunction action." ([invoke-async-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2014-11-13/functions/{FunctionName}/invoke-async/" invoke-async-request :portkey.aws.lambda/invoke-async-request {:payload "InvokeArgs", :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 202 :portkey.aws.lambda/invoke-async-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda/invalid-runtime-exception})))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/invoke-async-response))

(clojure.core/defn get-function-configuration "Returns the configuration information of the Lambda function. This the same\ninformation you provided as parameters when uploading the function by using\nCreateFunction.\n If you are using the versioning feature, you can retrieve this information for\na specific function version by using the optional Qualifier parameter and\nspecifying the function version or alias that points to it. If you don't provide\nit, the API returns information about the $LATEST version of the function. For\nmore information about versioning, see AWS Lambda Function Versioning and\nAliases (http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:GetFunctionConfiguration\noperation." ([get-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}/configuration" get-function-configuration-request :portkey.aws.lambda/get-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda/function-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))

(clojure.core/defn update-function-code "Updates the code for the specified Lambda function. This operation must only be\nused on an existing Lambda function and cannot be used to update the function\nconfiguration.\n If you are using the versioning feature, note this API will always update the\n$LATEST version of your Lambda function. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:UpdateFunctionCode action." ([update-function-code-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/code" update-function-code-request :portkey.aws.lambda/update-function-code-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda/function-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))

(clojure.core/defn list-versions-by-function "List all versions of a function. For information about the versioning feature,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([list-versions-by-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}/versions" list-versions-by-function-request :portkey.aws.lambda/list-versions-by-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda/list-versions-by-function-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping "You can update an event source mapping. This is useful if you want to change the\nparameters of the existing mapping without losing your position in the stream.\nYou can change which function will receive the stream records, but to change the\nstream itself, you must create a new mapping.\n If you are using the versioning feature, you can update the event source\nmapping to map to a specific Lambda function version or alias as described in\nthe FunctionName parameter. For information about the versioning feature, see\nAWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n If you disable the event source mapping, AWS Lambda stops polling. If you\nenable again, it will resume polling from the time it had stopped polling, so\nyou don't lose processing of any records. However, if you delete event source\nmapping and create it again, it will reset.\n This operation requires permission for the lambda:UpdateEventSourceMapping\naction." ([update-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "PUT" "/2015-03-31/event-source-mappings/{UUID}" update-event-source-mapping-request :portkey.aws.lambda/update-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception})))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/event-source-mapping-configuration))

(clojure.core/defn list-tags "Returns a list of tags assigned to a function when supplied the function ARN\n(Amazon Resource Name). For more information on Tagging, see Tagging Lambda\nFunctions (http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS\nLambda Developer Guide." ([list-tags-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2017-03-31/tags/{ARN}" list-tags-request :portkey.aws.lambda/list-tags-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} nil :portkey.aws.lambda/list-tags-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/list-tags-response))

(clojure.core/defn update-alias "Using this API you can update the function version to which the alias points and\nthe alias description. For more information, see Introduction to AWS Lambda\nAliases (http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:UpdateAlias action." ([update-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" update-alias-request :portkey.aws.lambda/update-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda/alias-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/alias-configuration))

(clojure.core/defn get-event-source-mapping "Returns configuration information for the specified event source mapping (see\nCreateEventSourceMapping).\n This operation requires permission for the lambda:GetEventSourceMapping action." ([get-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/event-source-mappings/{UUID}" get-event-source-mapping-request :portkey.aws.lambda/get-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 200 :portkey.aws.lambda/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/event-source-mapping-configuration))

(clojure.core/defn get-function "Returns the configuration information of the Lambda function and a presigned URL\nlink to the .zip file you uploaded with CreateFunction so you can download the\n.zip file. Note that the URL is valid for up to 10 minutes. The configuration\ninformation is the same information you provided as parameters when uploading\nthe function.\n Using the optional Qualifier parameter, you can specify a specific function\nversion for which you want this information. If you don't specify this\nparameter, the API uses unqualified function ARN which return information about\nthe $LATEST version of the Lambda function. For more information, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:GetFunction action." ([get-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}" get-function-request :portkey.aws.lambda/get-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda/get-function-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/get-function-response))

(clojure.core/defn get-policy "Returns the resource policy associated with the specified Lambda function.\n If you are using the versioning feature, you can get the resource policy\nassociated with the specific Lambda function version or alias by specifying the\nversion or alias name using the Qualifier parameter. For more information about\nversioning, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n You need permission for the lambda:GetPolicy action." ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}/policy" get-policy-request :portkey.aws.lambda/get-policy-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda/get-policy-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/get-policy-response))

(clojure.core/defn add-permission "Adds a permission to the resource policy associated with the specified AWS\nLambda function. You use resource policies to grant permissions to event sources\nthat use push model. In a push model, event sources (such as Amazon S3 and\ncustom applications) invoke your Lambda function. Each permission you add to the\nresource policy allows an event source, permission to invoke the Lambda\nfunction.\n For information about the push model, see Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html).\n If you are using versioning, the permissions you add are specific to the Lambda\nfunction version or alias you specify in the AddPermission request via the\nQualifier parameter. For more information about versioning, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:AddPermission action." ([add-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/functions/{FunctionName}/policy" add-permission-request :portkey.aws.lambda/add-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 201 :portkey.aws.lambda/add-permission-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/add-permission-response))

(clojure.core/defn create-event-source-mapping "Identifies a stream as an event source for a Lambda function. It can be either\nan Amazon Kinesis stream or an Amazon DynamoDB stream. AWS Lambda invokes the\nspecified function when records are posted to the stream.\n This association between a stream source and a Lambda function is called the\nevent source mapping.\n You provide mapping information (for example, which stream to read from and\nwhich Lambda function to invoke) in the request body.\n Each event source, such as an Amazon Kinesis or a DynamoDB stream, can be\nassociated with multiple AWS Lambda functions. A given Lambda function can be\nassociated with multiple AWS event sources.\n If you are using versioning, you can specify a specific function version or an\nalias via the function name parameter. For more information about versioning,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:CreateEventSourceMapping\naction." ([create-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/event-source-mappings/" create-event-source-mapping-request :portkey.aws.lambda/create-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 202 :portkey.aws.lambda/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/event-source-mapping-configuration))

(clojure.core/defn get-alias "Returns the specified alias information such as the alias ARN, description, and\nfunction version it is pointing to. For more information, see Introduction to\nAWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:GetAlias action." ([get-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" get-alias-request :portkey.aws.lambda/get-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda/alias-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/alias-configuration))

(clojure.core/defn list-aliases "Returns list of aliases created for a Lambda function. For each alias, the\nresponse includes information such as the alias ARN, description, alias name,\nand the function version to which it points. For more information, see\nIntroduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:ListAliases action." ([list-aliases-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases" list-aliases-request :portkey.aws.lambda/list-aliases-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda/list-aliases-response {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/list-aliases-response))

(clojure.core/defn list-functions "Returns a list of your Lambda functions. For each function, the response\nincludes the function configuration information. You must use GetFunction to\nretrieve the code for your function.\n This operation requires permission for the lambda:ListFunctions action.\n If you are using the versioning feature, you can list all of your functions or\nonly $LATEST versions. For information about the versioning feature, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([] (list-functions {})) ([list-functions-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "GET" "/2015-03-31/functions/" list-functions-request :portkey.aws.lambda/list-functions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MasterRegion" "MasterRegion", "FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda/list-functions-response {"ServiceException" :portkey.aws.lambda/service-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/list-functions-response))

(clojure.core/defn remove-permission "You can remove individual permissions from an resource policy associated with a\nLambda function by providing a statement ID that you provided when you added the\npermission.\n If you are using versioning, the permissions you remove are specific to the\nLambda function version or alias you specify in the AddPermission request via\nthe Qualifier parameter. For more information about versioning, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n Note that removal of a permission will cause an active event source to lose\npermission to the function.\n You need permission for the lambda:RemovePermission action." ([remove-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/policy/{StatementId}" remove-permission-request :portkey.aws.lambda/remove-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "StatementId" "StatementId"}, :querystring {"Qualifier" "Qualifier", "RevisionId" "RevisionId"}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias "Deletes the specified Lambda function alias. For more information, see\nIntroduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:DeleteAlias action." ([delete-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" delete-alias-request :portkey.aws.lambda/delete-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function "Creates a new Lambda function. The function metadata is created from the request\nparameters, and the code for the function is provided by a .zip file in the\nrequest body. If the function name already exists, the operation will fail. Note\nthat the function name is case-sensitive.\n If you are using versioning, you can also publish a version of the Lambda\nfunction you are creating using the Publish parameter. For more information\nabout versioning, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:CreateFunction action." ([create-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/functions" create-function-request :portkey.aws.lambda/create-function-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.lambda/function-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda/code-storage-exceeded-exception})))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))

(clojure.core/defn untag-resource "Removes tags from a Lambda function. Requires the function ARN (Amazon Resource\nName). For more information, see Tagging Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS Lambda\nDeveloper Guide." ([untag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "DELETE" "/2017-03-31/tags/{ARN}" untag-resource-request :portkey.aws.lambda/untag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {"tagKeys" "TagKeys"}} 204 nil {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn publish-version "Publishes a version of your function from the current snapshot of $LATEST. That\nis, AWS Lambda takes a snapshot of the function code and configuration\ninformation from $LATEST and publishes a new version. The code and configuration\ncannot be modified after publication. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([publish-version-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "POST" "/2015-03-31/functions/{FunctionName}/versions" publish-version-request :portkey.aws.lambda/publish-version-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda/function-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))

(clojure.core/defn put-function-concurrency "Sets a limit on the number of concurrent executions available to this function.\nIt is a subset of your account's total concurrent execution limit per region.\nNote that Lambda automatically reserves a buffer of 100 concurrent executions\nfor functions without any reserved concurrency limit. This means if your account\nlimit is 1000, you have a total of 900 available to allocate to individual\nfunctions. For more information, see concurrent-executions." ([put-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "PUT" "/2017-10-31/functions/{FunctionName}/concurrency" put-function-concurrency-request :portkey.aws.lambda/put-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda/concurrency {"ServiceException" :portkey.aws.lambda/service-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/concurrency))

(clojure.core/defn update-function-configuration "Updates the configuration parameters for the specified Lambda function by using\nthe values provided in the request. You provide only the parameters you want to\nchange. This operation must only be used on an existing Lambda function and\ncannot be used to update the function's code.\n If you are using the versioning feature, note this API will always update the\n$LATEST version of your Lambda function. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:UpdateFunctionConfiguration\naction." ([update-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/configuration" update-function-configuration-request :portkey.aws.lambda/update-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda/function-configuration {"ServiceException" :portkey.aws.lambda/service-exception, "ResourceNotFoundException" :portkey.aws.lambda/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda/function-configuration))
