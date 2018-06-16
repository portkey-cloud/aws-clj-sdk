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

(clojure.core/declare ser-reserved-concurrent-executions ser-tracing-config ser-function-code ser-s3-object-version ser-function-arn ser-subnet-ids ser-batch-size ser-function-name ser-security-group-ids ser-timeout ser-subnet-id ser-environment-variables ser-alias-routing-configuration ser-dead-letter-config ser-handler ser-namespaced-function-name ser-runtime ser-role-arn ser-source-owner ser-tag-key ser-statement-id ser-alias ser-tags ser-additional-version ser-enabled ser-function-version ser-date ser-memory-size ser-namespaced-statement-id ser-log-type ser-tag-key-list ser-weight ser-environment-variable-value ser-kmskey-arn ser-description ser-tag-value ser-security-group-id ser-invocation-type ser-blob-stream ser-max-list-items ser-string ser-tracing-mode ser-environment ser-s3-key ser-master-region ser-arn ser-environment-variable-name ser-s3-bucket ser-vpc-config ser-qualifier ser-resource-arn ser-event-source-token ser-version ser-blob ser-principal ser-additional-version-weights ser-action ser-event-source-position ser-boolean)

(clojure.core/defn- ser-reserved-concurrent-executions [shape-input] shape-input)
(clojure.core/defn- ser-tracing-config [shape-input] (clojure.core/cond-> {} (:mode shape-input) (clojure.core/assoc "Mode" (ser-tracing-mode (:mode shape-input)))))
(clojure.core/defn- ser-function-code [shape-input] (clojure.core/cond-> {} (:zip-file shape-input) (clojure.core/assoc "ZipFile" (ser-blob (:zip-file shape-input))) (:s3-bucket shape-input) (clojure.core/assoc "S3Bucket" (ser-s3-bucket (:s3-bucket shape-input))) (:s3-key shape-input) (clojure.core/assoc "S3Key" (ser-s3-key (:s3-key shape-input))) (:s3-object-version shape-input) (clojure.core/assoc "S3ObjectVersion" (ser-s3-object-version (:s3-object-version shape-input)))))
(clojure.core/defn- ser-s3-object-version [shape-input] shape-input)
(clojure.core/defn- ser-function-arn [shape-input] shape-input)
(clojure.core/defn- ser-subnet-ids [shape-input] shape-input)
(clojure.core/defn- ser-batch-size [shape-input] shape-input)
(clojure.core/defn- ser-function-name [shape-input] shape-input)
(clojure.core/defn- ser-security-group-ids [shape-input] shape-input)
(clojure.core/defn- ser-timeout [shape-input] shape-input)
(clojure.core/defn- ser-subnet-id [shape-input] shape-input)
(clojure.core/defn- ser-environment-variables [shape-input] shape-input)
(clojure.core/defn- ser-alias-routing-configuration [shape-input] (clojure.core/cond-> {} (:additional-version-weights shape-input) (clojure.core/assoc "AdditionalVersionWeights" (ser-additional-version-weights (:additional-version-weights shape-input)))))
(clojure.core/defn- ser-dead-letter-config [shape-input] (clojure.core/cond-> {} (:target-arn shape-input) (clojure.core/assoc "TargetArn" (ser-resource-arn (:target-arn shape-input)))))
(clojure.core/defn- ser-handler [shape-input] shape-input)
(clojure.core/defn- ser-namespaced-function-name [shape-input] shape-input)
(clojure.core/defn- ser-runtime [shape-input] ({"go1.x" "go1.x", :nodejs4.3-edge "nodejs4.3-edge", :go1.x "go1.x", "dotnetcore2.0" "dotnetcore2.0", :nodejs6.10 "nodejs6.10", :python3.6 "python3.6", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", :nodejs8.10 "nodejs8.10", :python2.7 "python2.7", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", :dotnetcore2.0 "dotnetcore2.0", "nodejs4.3-edge" "nodejs4.3-edge", "nodejs8.10" "nodejs8.10", :java8 "java8", :nodejs4.3 "nodejs4.3", "nodejs6.10" "nodejs6.10", "python3.6" "python3.6", :dotnetcore1.0 "dotnetcore1.0", "nodejs" "nodejs"} shape-input))
(clojure.core/defn- ser-role-arn [shape-input] shape-input)
(clojure.core/defn- ser-source-owner [shape-input] shape-input)
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-statement-id [shape-input] shape-input)
(clojure.core/defn- ser-alias [shape-input] shape-input)
(clojure.core/defn- ser-tags [shape-input] shape-input)
(clojure.core/defn- ser-additional-version [shape-input] shape-input)
(clojure.core/defn- ser-enabled [shape-input] shape-input)
(clojure.core/defn- ser-function-version [shape-input] ({"ALL" "ALL", :all "ALL"} shape-input))
(clojure.core/defn- ser-date [shape-input] shape-input)
(clojure.core/defn- ser-memory-size [shape-input] shape-input)
(clojure.core/defn- ser-namespaced-statement-id [shape-input] shape-input)
(clojure.core/defn- ser-log-type [shape-input] ({"None" "None", :none "None", "Tail" "Tail", :tail "Tail"} shape-input))
(clojure.core/defn- ser-tag-key-list [shape-input] shape-input)
(clojure.core/defn- ser-weight [shape-input] shape-input)
(clojure.core/defn- ser-environment-variable-value [shape-input] shape-input)
(clojure.core/defn- ser-kmskey-arn [shape-input] shape-input)
(clojure.core/defn- ser-description [shape-input] shape-input)
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-security-group-id [shape-input] shape-input)
(clojure.core/defn- ser-invocation-type [shape-input] ({"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"} shape-input))
(clojure.core/defn- ser-blob-stream [shape-input] (portkey.aws/base64-encode shape-input))
(clojure.core/defn- ser-max-list-items [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-tracing-mode [shape-input] ({"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"} shape-input))
(clojure.core/defn- ser-environment [shape-input] (clojure.core/cond-> {} (:variables shape-input) (clojure.core/assoc "Variables" (ser-environment-variables (:variables shape-input)))))
(clojure.core/defn- ser-s3-key [shape-input] shape-input)
(clojure.core/defn- ser-master-region [shape-input] shape-input)
(clojure.core/defn- ser-arn [shape-input] shape-input)
(clojure.core/defn- ser-environment-variable-name [shape-input] shape-input)
(clojure.core/defn- ser-s3-bucket [shape-input] shape-input)
(clojure.core/defn- ser-vpc-config [shape-input] (clojure.core/cond-> {} (:subnet-ids shape-input) (clojure.core/assoc "SubnetIds" (ser-subnet-ids (:subnet-ids shape-input))) (:security-group-ids shape-input) (clojure.core/assoc "SecurityGroupIds" (ser-security-group-ids (:security-group-ids shape-input)))))
(clojure.core/defn- ser-qualifier [shape-input] shape-input)
(clojure.core/defn- ser-resource-arn [shape-input] shape-input)
(clojure.core/defn- ser-event-source-token [shape-input] shape-input)
(clojure.core/defn- ser-version [shape-input] shape-input)
(clojure.core/defn- ser-blob [shape-input] (portkey.aws/base64-encode shape-input))
(clojure.core/defn- ser-principal [shape-input] shape-input)
(clojure.core/defn- ser-additional-version-weights [shape-input] shape-input)
(clojure.core/defn- ser-action [shape-input] shape-input)
(clojure.core/defn- ser-event-source-position [shape-input] ({"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"} shape-input))
(clojure.core/defn- ser-boolean [shape-input] shape-input)

(clojure.core/defn req<-tag-resource-request [input93324] {:uri {"Resource" (ser-function-arn (input93324 :resource))}, :body {"Tags" (ser-tags (input93324 :tags))}})
(clojure.core/defn req<-create-alias-request [input93325] (clojure.core/let [input93326 {:uri {"FunctionName" (ser-function-name (input93325 :function-name))}, :body {"Name" (ser-alias (input93325 :name)), "FunctionVersion" (ser-version (input93325 :function-version))}}] (clojure.core/cond-> input93326 (clojure.core/contains? input93325 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input93325 :description))) (clojure.core/contains? input93325 :routing-config) (clojure.core/assoc-in [:body "RoutingConfig"] (ser-alias-routing-configuration (input93325 :routing-config))))))
(clojure.core/defn req<-delete-function-request [input93327] (clojure.core/let [input93328 {:uri {"FunctionName" (ser-function-name (input93327 :function-name))}}] (clojure.core/cond-> input93328 (clojure.core/contains? input93327 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93327 :qualifier))))))
(clojure.core/defn req<-list-event-source-mappings-request [input93329] (clojure.core/cond-> {} (clojure.core/contains? input93329 :event-source-arn) (clojure.core/assoc-in [:query-string "EventSourceArn"] (ser-arn (input93329 :event-source-arn))) (clojure.core/contains? input93329 :function-name) (clojure.core/assoc-in [:query-string "FunctionName"] (ser-function-name (input93329 :function-name))) (clojure.core/contains? input93329 :marker) (clojure.core/assoc-in [:query-string "Marker"] (ser-string (input93329 :marker))) (clojure.core/contains? input93329 :max-items) (clojure.core/assoc-in [:query-string "MaxItems"] (ser-max-list-items (input93329 :max-items)))))
(clojure.core/defn req<-delete-function-concurrency-request [input93330] {:uri {"FunctionName" (ser-function-name (input93330 :function-name))}})
(clojure.core/defn req<-delete-event-source-mapping-request [input93331] {:uri {"UUID" (ser-string (input93331 :uuid))}})
(clojure.core/defn req<-invocation-request [input93332] (clojure.core/let [input93333 {:uri {"FunctionName" (ser-namespaced-function-name (input93332 :function-name))}}] (clojure.core/cond-> input93333 (clojure.core/contains? input93332 :invocation-type) (clojure.core/assoc-in [:headers "InvocationType"] (ser-invocation-type (input93332 :invocation-type))) (clojure.core/contains? input93332 :log-type) (clojure.core/assoc-in [:headers "LogType"] (ser-log-type (input93332 :log-type))) (clojure.core/contains? input93332 :client-context) (clojure.core/assoc-in [:headers "ClientContext"] (ser-string (input93332 :client-context))) (clojure.core/contains? input93332 :payload) (clojure.core/assoc-in [:body "Payload"] (ser-blob (input93332 :payload))) (clojure.core/contains? input93332 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93332 :qualifier))))))
(clojure.core/defn req<-get-account-settings-request [input93334] nil)
(clojure.core/defn req<-invoke-async-request [input93335] {:uri {"FunctionName" (ser-namespaced-function-name (input93335 :function-name))}, :body {"InvokeArgs" (ser-blob-stream (input93335 :invoke-args))}})
(clojure.core/defn req<-get-function-configuration-request [input93336] (clojure.core/let [input93337 {:uri {"FunctionName" (ser-namespaced-function-name (input93336 :function-name))}}] (clojure.core/cond-> input93337 (clojure.core/contains? input93336 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93336 :qualifier))))))
(clojure.core/defn req<-update-function-code-request [input93338] (clojure.core/let [input93339 {:uri {"FunctionName" (ser-function-name (input93338 :function-name))}}] (clojure.core/cond-> input93339 (clojure.core/contains? input93338 :zip-file) (clojure.core/assoc-in [:body "ZipFile"] (ser-blob (input93338 :zip-file))) (clojure.core/contains? input93338 :s3-bucket) (clojure.core/assoc-in [:body "S3Bucket"] (ser-s3-bucket (input93338 :s3-bucket))) (clojure.core/contains? input93338 :s3-key) (clojure.core/assoc-in [:body "S3Key"] (ser-s3-key (input93338 :s3-key))) (clojure.core/contains? input93338 :s3-object-version) (clojure.core/assoc-in [:body "S3ObjectVersion"] (ser-s3-object-version (input93338 :s3-object-version))) (clojure.core/contains? input93338 :publish) (clojure.core/assoc-in [:body "Publish"] (ser-boolean (input93338 :publish))) (clojure.core/contains? input93338 :dry-run) (clojure.core/assoc-in [:body "DryRun"] (ser-boolean (input93338 :dry-run))) (clojure.core/contains? input93338 :revision-id) (clojure.core/assoc-in [:body "RevisionId"] (ser-string (input93338 :revision-id))))))
(clojure.core/defn req<-list-versions-by-function-request [input93340] (clojure.core/let [input93341 {:uri {"FunctionName" (ser-namespaced-function-name (input93340 :function-name))}}] (clojure.core/cond-> input93341 (clojure.core/contains? input93340 :marker) (clojure.core/assoc-in [:query-string "Marker"] (ser-string (input93340 :marker))) (clojure.core/contains? input93340 :max-items) (clojure.core/assoc-in [:query-string "MaxItems"] (ser-max-list-items (input93340 :max-items))))))
(clojure.core/defn req<-update-event-source-mapping-request [input93342] (clojure.core/let [input93343 {:uri {"UUID" (ser-string (input93342 :uuid))}}] (clojure.core/cond-> input93343 (clojure.core/contains? input93342 :function-name) (clojure.core/assoc-in [:body "FunctionName"] (ser-function-name (input93342 :function-name))) (clojure.core/contains? input93342 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-enabled (input93342 :enabled))) (clojure.core/contains? input93342 :batch-size) (clojure.core/assoc-in [:body "BatchSize"] (ser-batch-size (input93342 :batch-size))))))
(clojure.core/defn req<-list-tags-request [input93344] {:uri {"Resource" (ser-function-arn (input93344 :resource))}})
(clojure.core/defn req<-update-alias-request [input93345] (clojure.core/let [input93346 {:uri {"FunctionName" (ser-function-name (input93345 :function-name)), "Name" (ser-alias (input93345 :name))}}] (clojure.core/cond-> input93346 (clojure.core/contains? input93345 :function-version) (clojure.core/assoc-in [:body "FunctionVersion"] (ser-version (input93345 :function-version))) (clojure.core/contains? input93345 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input93345 :description))) (clojure.core/contains? input93345 :routing-config) (clojure.core/assoc-in [:body "RoutingConfig"] (ser-alias-routing-configuration (input93345 :routing-config))) (clojure.core/contains? input93345 :revision-id) (clojure.core/assoc-in [:body "RevisionId"] (ser-string (input93345 :revision-id))))))
(clojure.core/defn req<-get-event-source-mapping-request [input93347] {:uri {"UUID" (ser-string (input93347 :uuid))}})
(clojure.core/defn req<-get-function-request [input93348] (clojure.core/let [input93349 {:uri {"FunctionName" (ser-namespaced-function-name (input93348 :function-name))}}] (clojure.core/cond-> input93349 (clojure.core/contains? input93348 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93348 :qualifier))))))
(clojure.core/defn req<-get-policy-request [input93350] (clojure.core/let [input93351 {:uri {"FunctionName" (ser-namespaced-function-name (input93350 :function-name))}}] (clojure.core/cond-> input93351 (clojure.core/contains? input93350 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93350 :qualifier))))))
(clojure.core/defn req<-add-permission-request [input93352] (clojure.core/let [input93353 {:uri {"FunctionName" (ser-function-name (input93352 :function-name))}, :body {"StatementId" (ser-statement-id (input93352 :statement-id)), "Principal" (ser-principal (input93352 :principal)), "Action" (ser-action (input93352 :action))}}] (clojure.core/cond-> input93353 (clojure.core/contains? input93352 :source-account) (clojure.core/assoc-in [:body "SourceAccount"] (ser-source-owner (input93352 :source-account))) (clojure.core/contains? input93352 :source-arn) (clojure.core/assoc-in [:body "SourceArn"] (ser-arn (input93352 :source-arn))) (clojure.core/contains? input93352 :revision-id) (clojure.core/assoc-in [:body "RevisionId"] (ser-string (input93352 :revision-id))) (clojure.core/contains? input93352 :event-source-token) (clojure.core/assoc-in [:body "EventSourceToken"] (ser-event-source-token (input93352 :event-source-token))) (clojure.core/contains? input93352 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93352 :qualifier))))))
(clojure.core/defn req<-create-event-source-mapping-request [input93354] (clojure.core/let [input93355 {:body {"EventSourceArn" (ser-arn (input93354 :event-source-arn)), "FunctionName" (ser-function-name (input93354 :function-name)), "StartingPosition" (ser-event-source-position (input93354 :starting-position))}}] (clojure.core/cond-> input93355 (clojure.core/contains? input93354 :enabled) (clojure.core/assoc-in [:body "Enabled"] (ser-enabled (input93354 :enabled))) (clojure.core/contains? input93354 :batch-size) (clojure.core/assoc-in [:body "BatchSize"] (ser-batch-size (input93354 :batch-size))) (clojure.core/contains? input93354 :starting-position-timestamp) (clojure.core/assoc-in [:body "StartingPositionTimestamp"] (ser-date (input93354 :starting-position-timestamp))))))
(clojure.core/defn req<-get-alias-request [input93356] {:uri {"FunctionName" (ser-function-name (input93356 :function-name)), "Name" (ser-alias (input93356 :name))}})
(clojure.core/defn req<-list-aliases-request [input93357] (clojure.core/let [input93358 {:uri {"FunctionName" (ser-function-name (input93357 :function-name))}}] (clojure.core/cond-> input93358 (clojure.core/contains? input93357 :function-version) (clojure.core/assoc-in [:query-string "FunctionVersion"] (ser-version (input93357 :function-version))) (clojure.core/contains? input93357 :marker) (clojure.core/assoc-in [:query-string "Marker"] (ser-string (input93357 :marker))) (clojure.core/contains? input93357 :max-items) (clojure.core/assoc-in [:query-string "MaxItems"] (ser-max-list-items (input93357 :max-items))))))
(clojure.core/defn req<-list-functions-request [input93359] (clojure.core/cond-> {} (clojure.core/contains? input93359 :master-region) (clojure.core/assoc-in [:query-string "MasterRegion"] (ser-master-region (input93359 :master-region))) (clojure.core/contains? input93359 :function-version) (clojure.core/assoc-in [:query-string "FunctionVersion"] (ser-function-version (input93359 :function-version))) (clojure.core/contains? input93359 :marker) (clojure.core/assoc-in [:query-string "Marker"] (ser-string (input93359 :marker))) (clojure.core/contains? input93359 :max-items) (clojure.core/assoc-in [:query-string "MaxItems"] (ser-max-list-items (input93359 :max-items)))))
(clojure.core/defn req<-remove-permission-request [input93360] (clojure.core/let [input93361 {:uri {"FunctionName" (ser-function-name (input93360 :function-name)), "StatementId" (ser-namespaced-statement-id (input93360 :statement-id))}}] (clojure.core/cond-> input93361 (clojure.core/contains? input93360 :qualifier) (clojure.core/assoc-in [:query-string "Qualifier"] (ser-qualifier (input93360 :qualifier))) (clojure.core/contains? input93360 :revision-id) (clojure.core/assoc-in [:query-string "RevisionId"] (ser-string (input93360 :revision-id))))))
(clojure.core/defn req<-delete-alias-request [input93362] {:uri {"FunctionName" (ser-function-name (input93362 :function-name)), "Name" (ser-alias (input93362 :name))}})
(clojure.core/defn req<-create-function-request [input93363] (clojure.core/let [input93364 {:body {"FunctionName" (ser-function-name (input93363 :function-name)), "Handler" (ser-handler (input93363 :handler)), "Runtime" (ser-runtime (input93363 :runtime)), "Role" (ser-role-arn (input93363 :role)), "Code" (ser-function-code (input93363 :code))}}] (clojure.core/cond-> input93364 (clojure.core/contains? input93363 :tracing-config) (clojure.core/assoc-in [:body "TracingConfig"] (ser-tracing-config (input93363 :tracing-config))) (clojure.core/contains? input93363 :timeout) (clojure.core/assoc-in [:body "Timeout"] (ser-timeout (input93363 :timeout))) (clojure.core/contains? input93363 :dead-letter-config) (clojure.core/assoc-in [:body "DeadLetterConfig"] (ser-dead-letter-config (input93363 :dead-letter-config))) (clojure.core/contains? input93363 :tags) (clojure.core/assoc-in [:body "Tags"] (ser-tags (input93363 :tags))) (clojure.core/contains? input93363 :memory-size) (clojure.core/assoc-in [:body "MemorySize"] (ser-memory-size (input93363 :memory-size))) (clojure.core/contains? input93363 :kmskey-arn) (clojure.core/assoc-in [:body "KMSKeyArn"] (ser-kmskey-arn (input93363 :kmskey-arn))) (clojure.core/contains? input93363 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input93363 :description))) (clojure.core/contains? input93363 :environment) (clojure.core/assoc-in [:body "Environment"] (ser-environment (input93363 :environment))) (clojure.core/contains? input93363 :vpc-config) (clojure.core/assoc-in [:body "VpcConfig"] (ser-vpc-config (input93363 :vpc-config))) (clojure.core/contains? input93363 :publish) (clojure.core/assoc-in [:body "Publish"] (ser-boolean (input93363 :publish))))))
(clojure.core/defn req<-untag-resource-request [input93365] {:uri {"Resource" (ser-function-arn (input93365 :resource))}, :query-string {"TagKeys" (ser-tag-key-list (input93365 :tag-keys))}})
(clojure.core/defn req<-publish-version-request [input93366] (clojure.core/let [input93367 {:uri {"FunctionName" (ser-function-name (input93366 :function-name))}}] (clojure.core/cond-> input93367 (clojure.core/contains? input93366 :code-sha256) (clojure.core/assoc-in [:body "CodeSha256"] (ser-string (input93366 :code-sha256))) (clojure.core/contains? input93366 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input93366 :description))) (clojure.core/contains? input93366 :revision-id) (clojure.core/assoc-in [:body "RevisionId"] (ser-string (input93366 :revision-id))))))
(clojure.core/defn req<-put-function-concurrency-request [input93368] {:uri {"FunctionName" (ser-function-name (input93368 :function-name))}, :body {"ReservedConcurrentExecutions" (ser-reserved-concurrent-executions (input93368 :reserved-concurrent-executions))}})
(clojure.core/defn req<-update-function-configuration-request [input93369] (clojure.core/let [input93370 {:uri {"FunctionName" (ser-function-name (input93369 :function-name))}}] (clojure.core/cond-> input93370 (clojure.core/contains? input93369 :tracing-config) (clojure.core/assoc-in [:body "TracingConfig"] (ser-tracing-config (input93369 :tracing-config))) (clojure.core/contains? input93369 :timeout) (clojure.core/assoc-in [:body "Timeout"] (ser-timeout (input93369 :timeout))) (clojure.core/contains? input93369 :dead-letter-config) (clojure.core/assoc-in [:body "DeadLetterConfig"] (ser-dead-letter-config (input93369 :dead-letter-config))) (clojure.core/contains? input93369 :handler) (clojure.core/assoc-in [:body "Handler"] (ser-handler (input93369 :handler))) (clojure.core/contains? input93369 :runtime) (clojure.core/assoc-in [:body "Runtime"] (ser-runtime (input93369 :runtime))) (clojure.core/contains? input93369 :memory-size) (clojure.core/assoc-in [:body "MemorySize"] (ser-memory-size (input93369 :memory-size))) (clojure.core/contains? input93369 :role) (clojure.core/assoc-in [:body "Role"] (ser-role-arn (input93369 :role))) (clojure.core/contains? input93369 :kmskey-arn) (clojure.core/assoc-in [:body "KMSKeyArn"] (ser-kmskey-arn (input93369 :kmskey-arn))) (clojure.core/contains? input93369 :description) (clojure.core/assoc-in [:body "Description"] (ser-description (input93369 :description))) (clojure.core/contains? input93369 :environment) (clojure.core/assoc-in [:body "Environment"] (ser-environment (input93369 :environment))) (clojure.core/contains? input93369 :vpc-config) (clojure.core/assoc-in [:body "VpcConfig"] (ser-vpc-config (input93369 :vpc-config))) (clojure.core/contains? input93369 :revision-id) (clojure.core/assoc-in [:body "RevisionId"] (ser-string (input93369 :revision-id))))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-function-request/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31.create-function-request/Role :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31.create-function-request/Code] :opt-un [:portkey.aws.lambda.-2015-03-31/TracingConfig :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Tags :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31/Environment :portkey.aws.lambda.-2015-03-31/VpcConfig :portkey.aws.lambda.-2015-03-31.create-function-request/Publish] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/reserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 0 p1__91659__91660__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mappings-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-alias-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.update-alias-request/Name] :opt-un [:portkey.aws.lambda.-2015-03-31.update-alias-request/FunctionVersion :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.update-alias-request/RoutingConfig :portkey.aws.lambda.-2015-03-31.update-alias-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/Type :portkey.aws.lambda.-2015-03-31.unsupported-media-type-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/ReservedConcurrentExecutions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/Marker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/request-too-large-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.request-too-large-exception/Type :portkey.aws.lambda.-2015-03-31.request-too-large-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-subnetidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/Type :portkey.aws.lambda.-2015-03-31.invalid-subnetidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnetipaddress-limit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/Type :portkey.aws.lambda.-2015-03-31.subnetipaddress-limit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code/ZipFile :portkey.aws.lambda.-2015-03-31/S3Bucket :portkey.aws.lambda.-2015-03-31/S3Key :portkey.aws.lambda.-2015-03-31/S3ObjectVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/subnet-id :max-count 16))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/batch-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 1 p1__91659__91660__auto__)) (fn* [p1__91661__91662__auto__] (clojure.core/<= p1__91661__91662__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 140)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.precondition-failed-exception/Type :portkey.aws.lambda.-2015-03-31.precondition-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/unreserved-concurrent-executions (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 0 p1__91659__91660__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/security-group-id :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timeout (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 1 p1__91659__91660__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/versions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-response/Versions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-usage/function-count (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-usage/TotalCodeSize :portkey.aws.lambda.-2015-03-31.account-usage/FunctionCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/subnet-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/zip-file (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/publish (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/dry-run (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/boolean))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-code-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-code-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.update-function-code-request/ZipFile :portkey.aws.lambda.-2015-03-31/S3Bucket :portkey.aws.lambda.-2015-03-31/S3Key :portkey.aws.lambda.-2015-03-31/S3ObjectVersion :portkey.aws.lambda.-2015-03-31.update-function-code-request/Publish :portkey.aws.lambda.-2015-03-31.update-function-code-request/DryRun :portkey.aws.lambda.-2015-03-31.update-function-code-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.delete-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variables (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/environment-variable-name :portkey.aws.lambda.-2015-03-31/environment-variable-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-routing-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/AdditionalVersionWeights] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.dead-letter-config/target-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/resource-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/dead-letter-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.dead-letter-config/TargetArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/handler (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 128)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"[^\s]+" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-function-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 170)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_\.]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/SubnetIds :portkey.aws.lambda.-2015-03-31/SecurityGroupIds :portkey.aws.lambda.-2015-03-31/VpcId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/runtime {"go1.x" "go1.x", :nodejs4.3-edge "nodejs4.3-edge", :go1.x "go1.x", "dotnetcore2.0" "dotnetcore2.0", :nodejs6.10 "nodejs6.10", :python3.6 "python3.6", :nodejs "nodejs", "dotnetcore1.0" "dotnetcore1.0", "java8" "java8", :nodejs8.10 "nodejs8.10", :python2.7 "python2.7", "nodejs4.3" "nodejs4.3", "python2.7" "python2.7", :dotnetcore2.0 "dotnetcore2.0", "nodejs4.3-edge" "nodejs4.3-edge", "nodejs8.10" "nodejs8.10", :java8 "java8", :nodejs4.3 "nodejs4.3", "nodejs6.10" "nodejs6.10", "python3.6" "python3.6", :dotnetcore1.0 "dotnetcore1.0", "nodejs" "nodejs"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.service-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.service-exception/Type :portkey.aws.lambda.-2015-03-31.service-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/source-owner (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"\d{12}" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/event-source-mappings (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mappings-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-event-source-mappings-response/EventSourceMappings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 100)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_]+)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-response/error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-error))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-response/Variables :portkey.aws.lambda.-2015-03-31.environment-response/Error] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 128)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(?!^[0-9]+$)([a-zA-Z0-9-_]+)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsnot-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/Type :portkey.aws.lambda.-2015-03-31.kmsnot-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsinvalid-state-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/Type :portkey.aws.lambda.-2015-03-31.kmsinvalid-state-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-runtime-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tags (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/tag-key :portkey.aws.lambda.-2015-03-31/tag-value))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-response/functions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-functions-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-functions-response/Functions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 1024)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"[0-9]+" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/client-context (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-request/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.invocation-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/InvocationType :portkey.aws.lambda.-2015-03-31/LogType :portkey.aws.lambda.-2015-03-31.invocation-request/ClientContext :portkey.aws.lambda.-2015-03-31.invocation-request/Payload :portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsdisabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/Type :portkey.aws.lambda.-2015-03-31.kmsdisabled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/enabled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/configuration (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-response/code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-code-location))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-function-response/Configuration :portkey.aws.lambda.-2015-03-31.get-function-response/Code :portkey.aws.lambda.-2015-03-31/Tags :portkey.aws.lambda.-2015-03-31/Concurrency] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-version {"ALL" "ALL", :all "ALL"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-alias-request/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.create-alias-request/Name :portkey.aws.lambda.-2015-03-31.create-alias-request/FunctionVersion] :opt-un [:portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.create-alias-request/RoutingConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/Type :portkey.aws.lambda.-2015-03-31.code-storage-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/sensitive-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/memory-size (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 128 p1__91659__91660__auto__)) (fn* [p1__91661__91662__auto__] (clojure.core/<= p1__91661__91662__auto__ 3008))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/throttle-reason))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.too-many-requests-exception/retryAfterSeconds :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/Type :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/message :portkey.aws.lambda.-2015-03-31.too-many-requests-exception/Reason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-request-content-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-event-source-mapping-request/UUID] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmsaccess-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/Type :portkey.aws.lambda.-2015-03-31.kmsaccess-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-account (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/source-owner))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/StatementId :portkey.aws.lambda.-2015-03-31/Action :portkey.aws.lambda.-2015-03-31/Principal] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-request/SourceAccount :portkey.aws.lambda.-2015-03-31.add-permission-request/SourceArn :portkey.aws.lambda.-2015-03-31.add-permission-request/RevisionId :portkey.aws.lambda.-2015-03-31/Qualifier :portkey.aws.lambda.-2015-03-31/EventSourceToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/AccountLimit :portkey.aws.lambda.-2015-03-31/AccountUsage] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/throttle-reason {:concurrent-invocation-limit-exceeded "ConcurrentInvocationLimitExceeded", :function-invocation-rate-limit-exceeded "FunctionInvocationRateLimitExceeded", :reserved-function-invocation-rate-limit-exceeded "ReservedFunctionInvocationRateLimitExceeded", "ReservedFunctionInvocationRateLimitExceeded" "ReservedFunctionInvocationRateLimitExceeded", "ConcurrentInvocationLimitExceeded" "ConcurrentInvocationLimitExceeded", :caller-rate-limit-exceeded "CallerRateLimitExceeded", "CallerRateLimitExceeded" "CallerRateLimitExceeded", "FunctionInvocationRateLimitExceeded" "FunctionInvocationRateLimitExceeded", :reserved-function-concurrent-invocation-limit-exceeded "ReservedFunctionConcurrentInvocationLimitExceeded", "ReservedFunctionConcurrentInvocationLimitExceeded" "ReservedFunctionConcurrentInvocationLimitExceeded"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.tag-resource-request/Resource :portkey.aws.lambda.-2015-03-31/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/namespaced-statement-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 100)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"([a-zA-Z0-9-_.]+)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/log-type {"None" "None", :none "None", "Tail" "Tail", :tail "Tail"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.get-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/tag-key))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/enilimit-reached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/Type :portkey.aws.lambda.-2015-03-31.enilimit-reached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/concurrency (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/ReservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.add-permission-response/statement (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/add-permission-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.add-permission-response/Statement] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-policy-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/weight clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/status-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/function-error (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/log-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/payload (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invocation-response/executed-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invocation-response/StatusCode :portkey.aws.lambda.-2015-03-31.invocation-response/FunctionError :portkey.aws.lambda.-2015-03-31.invocation-response/LogResult :portkey.aws.lambda.-2015-03-31.invocation-response/Payload :portkey.aws.lambda.-2015-03-31.invocation-response/ExecutedVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-not-found-exception/Type :portkey.aws.lambda.-2015-03-31.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-request/invoke-args (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/blob-stream))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.invoke-async-request/FunctionName :portkey.aws.lambda.-2015-03-31.invoke-async-request/InvokeArgs] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/total-code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-unzipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/code-size-zipped (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.account-limit/concurrent-executions (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/integer))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/account-limit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.account-limit/TotalCodeSize :portkey.aws.lambda.-2015-03-31.account-limit/CodeSizeUnzipped :portkey.aws.lambda.-2015-03-31.account-limit/CodeSizeZipped :portkey.aws.lambda.-2015-03-31.account-limit/ConcurrentExecutions :portkey.aws.lambda.-2015-03-31/UnreservedConcurrentExecutions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment-error/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/sensitive-string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-error (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment-error/ErrorCode :portkey.aws.lambda.-2015-03-31.environment-error/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/kmskey-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 0 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.update-event-source-mapping-request/UUID] :opt-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31/Enabled :portkey.aws.lambda.-2015-03-31/BatchSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-list (clojure.spec.alpha/coll-of :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/security-group-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invocation-type {"Event" "Event", :event "Event", "RequestResponse" "RequestResponse", :request-response "RequestResponse", "DryRun" "DryRun", :dry-run "DryRun"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/policy (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-policy-response/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.get-policy-response/Policy :portkey.aws.lambda.-2015-03-31.get-policy-response/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob-stream clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/max-list-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__91659__91660__auto__] (clojure.core/<= 1 p1__91659__91660__auto__)) (fn* [p1__91661__91662__auto__] (clojure.core/<= p1__91661__91662__auto__ 10000))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.delete-alias-request/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/delete-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.delete-alias-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.publish-version-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/publish-version-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.publish-version-request/CodeSha256 :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.publish-version-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/statement-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-statement-id))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.remove-permission-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/remove-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.remove-permission-request/StatementId] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier :portkey.aws.lambda.-2015-03-31.remove-permission-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-mode {"Active" "Active", :active "Active", "PassThrough" "PassThrough", :pass-through "PassThrough"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invoke-async-response/status (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/http-status))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invoke-async-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invoke-async-response/Status] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/update-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/TracingConfig :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/Role :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31/Environment :portkey.aws.lambda.-2015-03-31/VpcConfig :portkey.aws.lambda.-2015-03-31.update-function-configuration-request/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.environment/variables (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-variables))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.environment/Variables] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.resource-conflict-exception/Type :portkey.aws.lambda.-2015-03-31.resource-conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/Marker :portkey.aws.lambda.-2015-03-31.list-versions-by-function-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/master-region (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"ALL|[a-z]{2}(-gov)?-[a-z]+-\d{1}" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/http-status (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-zip-file-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"arn:aws:([a-zA-Z0-9\-])+:([a-z]{2}-[a-z]+-\d{1})?:(\d{12})?:(.*)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/next-marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-response/aliases (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-response/NextMarker :portkey.aws.lambda.-2015-03-31.list-aliases-response/Aliases] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/environment-variable-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"[a-zA-Z]([a-zA-Z0-9_])+" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/tracing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/role (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/role-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/timestamp))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/environment (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/environment-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-size (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/long))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/vpc-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/vpc-config-response))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/code-sha256 (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-configuration/master-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-configuration/TracingConfig :portkey.aws.lambda.-2015-03-31.function-configuration/FunctionArn :portkey.aws.lambda.-2015-03-31.function-configuration/FunctionName :portkey.aws.lambda.-2015-03-31/Timeout :portkey.aws.lambda.-2015-03-31/DeadLetterConfig :portkey.aws.lambda.-2015-03-31/Handler :portkey.aws.lambda.-2015-03-31/Runtime :portkey.aws.lambda.-2015-03-31/MemorySize :portkey.aws.lambda.-2015-03-31.function-configuration/Role :portkey.aws.lambda.-2015-03-31/KMSKeyArn :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.function-configuration/LastModified :portkey.aws.lambda.-2015-03-31.function-configuration/Environment :portkey.aws.lambda.-2015-03-31.function-configuration/CodeSize :portkey.aws.lambda.-2015-03-31.function-configuration/VpcConfig :portkey.aws.lambda.-2015-03-31.function-configuration/RevisionId :portkey.aws.lambda.-2015-03-31/Version :portkey.aws.lambda.-2015-03-31.function-configuration/CodeSha256 :portkey.aws.lambda.-2015-03-31.function-configuration/MasterArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/s3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 3 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 63)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"^[0-9A-Za-z\.\-_]*(?<!\.)$" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/vpc-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/SubnetIds :portkey.aws.lambda.-2015-03-31/SecurityGroupIds] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/qualifier (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 128)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(|[a-zA-Z0-9$_-]+)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/Type :portkey.aws.lambda.-2015-03-31.policy-length-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/timestamp (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-functions-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-functions-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31/MasterRegion :portkey.aws.lambda.-2015-03-31/FunctionVersion :portkey.aws.lambda.-2015-03-31.list-functions-request/Marker :portkey.aws.lambda.-2015-03-31.list-functions-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(arn:aws:[a-z0-9-.]+:.*)|()" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 0 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 256)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"[a-zA-Z0-9._\-]+" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91604__auto__] (clojure.core/<= 1 (clojure.core/count s__91604__auto__))) (clojure.core/fn [s__91605__auto__] (clojure.core/< (clojure.core/count s__91605__auto__) 1024)) (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(\$LATEST|[0-9]+)" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.tracing-config-response/mode (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tracing-mode))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/tracing-config-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.tracing-config-response/Mode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.get-function-configuration-request/function-name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/namespaced-function-name))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-function-configuration-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.get-function-configuration-request/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31/Qualifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/principal (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #".*" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/additional-version-weights (clojure.spec.alpha/map-of :portkey.aws.lambda.-2015-03-31/additional-version :portkey.aws.lambda.-2015-03-31/weight))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/alias-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/name (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/routing-config (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-routing-configuration))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.alias-configuration/revision-id (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/alias-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.alias-configuration/AliasArn :portkey.aws.lambda.-2015-03-31.alias-configuration/Name :portkey.aws.lambda.-2015-03-31.alias-configuration/FunctionVersion :portkey.aws.lambda.-2015-03-31/Description :portkey.aws.lambda.-2015-03-31.alias-configuration/RoutingConfig :portkey.aws.lambda.-2015-03-31.alias-configuration/RevisionId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-throttled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-throttled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-access-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-access-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-position))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/starting-position-timestamp (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionName :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/StartingPosition] :opt-un [:portkey.aws.lambda.-2015-03-31/Enabled :portkey.aws.lambda.-2015-03-31/BatchSize :portkey.aws.lambda.-2015-03-31.create-event-source-mapping-request/StartingPositionTimestamp] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/uuid (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/event-source-arn (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-modified (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/date))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/last-processing-result (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/state-transition-reason (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/UUID :portkey.aws.lambda.-2015-03-31/BatchSize :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/EventSourceArn :portkey.aws.lambda.-2015-03-31/FunctionArn :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/LastModified :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/LastProcessingResult :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/State :portkey.aws.lambda.-2015-03-31.event-source-mapping-configuration/StateTransitionReason] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/action (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"(lambda:[*]|lambda:[a-zA-Z]+|[*])" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/ec2-error-code (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/ec2-unexpected-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/Type :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/Message :portkey.aws.lambda.-2015-03-31.ec2-unexpected-exception/EC2ErrorCode] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/Type :portkey.aws.lambda.-2015-03-31.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/repository-type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.function-code-location/location (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/function-code-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.function-code-location/RepositoryType :portkey.aws.lambda.-2015-03-31.function-code-location/Location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/name-spaced-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__91606__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__91606__auto__))))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/get-account-settings-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/function-version (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/version))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/marker (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-aliases-request/max-items (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/max-list-items))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31/FunctionName] :opt-un [:portkey.aws.lambda.-2015-03-31.list-aliases-request/FunctionVersion :portkey.aws.lambda.-2015-03-31.list-aliases-request/Marker :portkey.aws.lambda.-2015-03-31.list-aliases-request/MaxItems] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/type (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/message (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/string))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/invalid-security-groupidexception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/Type :portkey.aws.lambda.-2015-03-31.invalid-security-groupidexception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/untag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.untag-resource-request/Resource :portkey.aws.lambda.-2015-03-31.untag-resource-request/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/event-source-position {"TRIM_HORIZON" "TRIM_HORIZON", :trim-horizon "TRIM_HORIZON", "LATEST" "LATEST", :latest "LATEST", "AT_TIMESTAMP" "AT_TIMESTAMP", :at-timestamp "AT_TIMESTAMP"})

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31.list-tags-request/resource (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-arn))
(clojure.spec.alpha/def :portkey.aws.lambda.-2015-03-31/list-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.lambda.-2015-03-31.list-tags-request/Resource] :opt-un [] :locations {}))

(clojure.core/defn tag-resource "Creates a list of tags (key-value pairs) on the Lambda function. Requires the\nLambda function ARN (Amazon Resource Name). If a key is specified without a\nvalue, Lambda creates a tag with the specified key and a value of null. For more\ninformation, see Tagging Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS Lambda\nDeveloper Guide." ([tag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2017-03-31/tags/{ARN}" tag-resource-request :portkey.aws.lambda.-2015-03-31/tag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn create-alias "Creates an alias that points to the specified Lambda function version. For more\ninformation, see Introduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n Alias names are unique for a given function. This requires permission for the\nlambda:CreateAlias action." ([create-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/aliases" create-alias-request :portkey.aws.lambda.-2015-03-31/create-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef create-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn delete-function "Deletes the specified Lambda function code and configuration.\n If you are using the versioning feature and you don't specify a function\nversion in your DeleteFunction request, AWS Lambda will delete the function,\nincluding all its versions, and any aliases pointing to the function versions.\nTo delete a specific function version, you must provide the function version via\nthe Qualifier parameter. For information about function versioning, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n When you delete a function the associated resource policy is also deleted. You\nwill need to delete the event source mappings explicitly.\n This operation requires permission for the lambda:DeleteFunction action." ([delete-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}" delete-function-request :portkey.aws.lambda.-2015-03-31/delete-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception})))
(clojure.spec.alpha/fdef delete-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-request) :ret clojure.core/true?)

(clojure.core/defn list-event-source-mappings "Returns a list of event source mappings you created using the\nCreateEventSourceMapping (see CreateEventSourceMapping).\n For each mapping, the API returns configuration information. You can optionally\nspecify filters to retrieve specific event source mappings.\n If you are using the versioning feature, you can get list of event source\nmappings for a specific Lambda function version or an alias as described in the\nFunctionName parameter. For information about the versioning feature, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:ListEventSourceMappings\naction." ([] (list-event-source-mappings {})) ([list-event-source-mappings-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/event-source-mappings/" list-event-source-mappings-request :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"EventSourceArn" "EventSourceArn", "FunctionName" "FunctionName", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-event-source-mappings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-event-source-mappings-response))

(clojure.core/defn delete-function-concurrency "Removes concurrent execution limits from this function. For more information,\nsee concurrent-executions." ([delete-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2017-10-31/functions/{FunctionName}/concurrency" delete-function-concurrency-request :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef delete-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-function-concurrency-request) :ret clojure.core/true?)

(clojure.core/defn delete-event-source-mapping "Removes an event source mapping. This means AWS Lambda will no longer invoke the\nfunction for events in the associated source.\n This operation requires permission for the lambda:DeleteEventSourceMapping\naction." ([delete-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/event-source-mappings/{UUID}" delete-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn invoke "Invokes a specific Lambda function. For an example, see Create the Lambda\nFunction and Test It Manually\n(http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually).\n If you are using the versioning feature, you can invoke the specific function\nversion by providing function version or alias name that is pointing to the\nfunction version using the Qualifier parameter in the request. If you don't\nprovide the Qualifier parameter, the $LATEST version of the Lambda function is\ninvoked. Invocations occur at least once in response to an event and functions\nmust be idempotent to handle this. For information about the versioning feature,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:InvokeFunction action.\n The TooManyRequestsException noted below will return the following:\nConcurrentInvocationLimitExceeded will be returned if you have no functions with\nreserved concurrency and have exceeded your account concurrent limit or if a\nfunction without reserved concurrency exceeds the account's unreserved\nconcurrency limit. ReservedFunctionConcurrentInvocationLimitExceeded will be\nreturned when a function with reserved concurrency exceeds its configured\nconcurrency limit." ([invocation-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/invocations" invocation-request :portkey.aws.lambda.-2015-03-31/invocation-request {:payload "Payload", :move {}, :headers {"InvocationType" ["X-Amz-Invocation-Type" nil], "LogType" ["X-Amz-Log-Type" nil], "ClientContext" ["X-Amz-Client-Context" nil]}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} nil :portkey.aws.lambda.-2015-03-31/invocation-response {"UnsupportedMediaTypeException" :portkey.aws.lambda.-2015-03-31/unsupported-media-type-exception, "RequestTooLargeException" :portkey.aws.lambda.-2015-03-31/request-too-large-exception, "InvalidSubnetIDException" :portkey.aws.lambda.-2015-03-31/invalid-subnetidexception, "SubnetIPAddressLimitReachedException" :portkey.aws.lambda.-2015-03-31/subnetipaddress-limit-reached-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "KMSNotFoundException" :portkey.aws.lambda.-2015-03-31/kmsnot-found-exception, "KMSInvalidStateException" :portkey.aws.lambda.-2015-03-31/kmsinvalid-state-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception, "KMSDisabledException" :portkey.aws.lambda.-2015-03-31/kmsdisabled-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "KMSAccessDeniedException" :portkey.aws.lambda.-2015-03-31/kmsaccess-denied-exception, "ENILimitReachedException" :portkey.aws.lambda.-2015-03-31/enilimit-reached-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidZipFileException" :portkey.aws.lambda.-2015-03-31/invalid-zip-file-exception, "EC2ThrottledException" :portkey.aws.lambda.-2015-03-31/ec2-throttled-exception, "EC2AccessDeniedException" :portkey.aws.lambda.-2015-03-31/ec2-access-denied-exception, "EC2UnexpectedException" :portkey.aws.lambda.-2015-03-31/ec2-unexpected-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "InvalidSecurityGroupIDException" :portkey.aws.lambda.-2015-03-31/invalid-security-groupidexception})))
(clojure.spec.alpha/fdef invoke :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invocation-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invocation-response))

(clojure.core/defn get-account-settings "Returns a customer's account settings.\n You can use this operation to retrieve Lambda limits information, such as code\nsize and concurrency limits. For more information about limits, see AWS Lambda\nLimits (http://docs.aws.amazon.com/lambda/latest/dg/limits.html). You can also\nretrieve resource usage statistics, such as code storage usage and function\ncount." ([] (get-account-settings {})) ([get-account-settings-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2016-08-19/account-settings/" get-account-settings-request :portkey.aws.lambda.-2015-03-31/get-account-settings-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/get-account-settings-response {"TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception})))
(clojure.spec.alpha/fdef get-account-settings :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/get-account-settings-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-account-settings-response))

(clojure.core/defn invoke-async " This API is deprecated. We recommend you use Invoke API (see Invoke).\n Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda\nexecutes the specified function asynchronously. To see the logs generated by the\nLambda function execution, see the CloudWatch Logs console.\n This operation requires permission for the lambda:InvokeFunction action." ([invoke-async-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2014-11-13/functions/{FunctionName}/invoke-async/" invoke-async-request :portkey.aws.lambda.-2015-03-31/invoke-async-request {:payload "InvokeArgs", :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/invoke-async-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidRequestContentException" :portkey.aws.lambda.-2015-03-31/invalid-request-content-exception, "InvalidRuntimeException" :portkey.aws.lambda.-2015-03-31/invalid-runtime-exception})))
(clojure.spec.alpha/fdef invoke-async :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/invoke-async-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/invoke-async-response))

(clojure.core/defn get-function-configuration "Returns the configuration information of the Lambda function. This the same\ninformation you provided as parameters when uploading the function by using\nCreateFunction.\n If you are using the versioning feature, you can retrieve this information for\na specific function version by using the optional Qualifier parameter and\nspecifying the function version or alias that points to it. If you don't provide\nit, the API returns information about the $LATEST version of the function. For\nmore information about versioning, see AWS Lambda Function Versioning and\nAliases (http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:GetFunctionConfiguration\noperation." ([get-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/configuration" get-function-configuration-request :portkey.aws.lambda.-2015-03-31/get-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn update-function-code "Updates the code for the specified Lambda function. This operation must only be\nused on an existing Lambda function and cannot be used to update the function\nconfiguration.\n If you are using the versioning feature, note this API will always update the\n$LATEST version of your Lambda function. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:UpdateFunctionCode action." ([update-function-code-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/code" update-function-code-request :portkey.aws.lambda.-2015-03-31/update-function-code-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-code :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-code-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn list-versions-by-function "List all versions of a function. For information about the versioning feature,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([list-versions-by-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/versions" list-versions-by-function-request :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-versions-by-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-versions-by-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-versions-by-function-response))

(clojure.core/defn update-event-source-mapping "You can update an event source mapping. This is useful if you want to change the\nparameters of the existing mapping without losing your position in the stream.\nYou can change which function will receive the stream records, but to change the\nstream itself, you must create a new mapping.\n If you are using the versioning feature, you can update the event source\nmapping to map to a specific Lambda function version or alias as described in\nthe FunctionName parameter. For information about the versioning feature, see\nAWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n If you disable the event source mapping, AWS Lambda stops polling. If you\nenable again, it will resume polling from the time it had stopped polling, so\nyou don't lose processing of any records. However, if you delete event source\nmapping and create it again, it will reset.\n This operation requires permission for the lambda:UpdateEventSourceMapping\naction." ([update-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/event-source-mappings/{UUID}" update-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception})))
(clojure.spec.alpha/fdef update-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn list-tags "Returns a list of tags assigned to a function when supplied the function ARN\n(Amazon Resource Name). For more information on Tagging, see Tagging Lambda\nFunctions (http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS\nLambda Developer Guide." ([list-tags-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2017-03-31/tags/{ARN}" list-tags-request :portkey.aws.lambda.-2015-03-31/list-tags-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {}} nil :portkey.aws.lambda.-2015-03-31/list-tags-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-tags-response))

(clojure.core/defn update-alias "Using this API you can update the function version to which the alias points and\nthe alias description. For more information, see Introduction to AWS Lambda\nAliases (http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:UpdateAlias action." ([update-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" update-alias-request :portkey.aws.lambda.-2015-03-31/update-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn get-event-source-mapping "Returns configuration information for the specified event source mapping (see\nCreateEventSourceMapping).\n This operation requires permission for the lambda:GetEventSourceMapping action." ([get-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/event-source-mappings/{UUID}" get-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {"UUID" "UUID"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-function "Returns the configuration information of the Lambda function and a presigned URL\nlink to the .zip file you uploaded with CreateFunction so you can download the\n.zip file. Note that the URL is valid for up to 10 minutes. The configuration\ninformation is the same information you provided as parameters when uploading\nthe function.\n Using the optional Qualifier parameter, you can specify a specific function\nversion for which you want this information. If you don't specify this\nparameter, the API uses unqualified function ARN which return information about\nthe $LATEST version of the Lambda function. For more information, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:GetFunction action." ([get-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}" get-function-request :portkey.aws.lambda.-2015-03-31/get-function-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/get-function-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-function-response))

(clojure.core/defn get-policy "Returns the resource policy associated with the specified Lambda function.\n If you are using the versioning feature, you can get the resource policy\nassociated with the specific Lambda function version or alias by specifying the\nversion or alias name using the Qualifier parameter. For more information about\nversioning, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n You need permission for the lambda:GetPolicy action." ([get-policy-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/policy" get-policy-request :portkey.aws.lambda.-2015-03-31/get-policy-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 200 :portkey.aws.lambda.-2015-03-31/get-policy-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef get-policy :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/get-policy-response))

(clojure.core/defn add-permission "Adds a permission to the resource policy associated with the specified AWS\nLambda function. You use resource policies to grant permissions to event sources\nthat use push model. In a push model, event sources (such as Amazon S3 and\ncustom applications) invoke your Lambda function. Each permission you add to the\nresource policy allows an event source, permission to invoke the Lambda\nfunction.\n For information about the push model, see Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html).\n If you are using versioning, the permissions you add are specific to the Lambda\nfunction version or alias you specify in the AddPermission request via the\nQualifier parameter. For more information about versioning, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:AddPermission action." ([add-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/policy" add-permission-request :portkey.aws.lambda.-2015-03-31/add-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"Qualifier" "Qualifier"}} 201 :portkey.aws.lambda.-2015-03-31/add-permission-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "PolicyLengthExceededException" :portkey.aws.lambda.-2015-03-31/policy-length-exceeded-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/add-permission-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/add-permission-response))

(clojure.core/defn create-event-source-mapping "Identifies a stream as an event source for a Lambda function. It can be either\nan Amazon Kinesis stream or an Amazon DynamoDB stream. AWS Lambda invokes the\nspecified function when records are posted to the stream.\n This association between a stream source and a Lambda function is called the\nevent source mapping.\n You provide mapping information (for example, which stream to read from and\nwhich Lambda function to invoke) in the request body.\n Each event source, such as an Amazon Kinesis or a DynamoDB stream, can be\nassociated with multiple AWS Lambda functions. A given Lambda function can be\nassociated with multiple AWS event sources.\n If you are using versioning, you can specify a specific function version or an\nalias via the function name parameter. For more information about versioning,\nsee AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:CreateEventSourceMapping\naction." ([create-event-source-mapping-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/event-source-mappings/" create-event-source-mapping-request :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 202 :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-event-source-mapping :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-event-source-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/event-source-mapping-configuration))

(clojure.core/defn get-alias "Returns the specified alias information such as the alias ARN, description, and\nfunction version it is pointing to. For more information, see Introduction to\nAWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:GetAlias action." ([get-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" get-alias-request :portkey.aws.lambda.-2015-03-31/get-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/alias-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef get-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/get-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/alias-configuration))

(clojure.core/defn list-aliases "Returns list of aliases created for a Lambda function. For each alias, the\nresponse includes information such as the alias ARN, description, alias name,\nand the function version to which it points. For more information, see\nIntroduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:ListAliases action." ([list-aliases-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/{FunctionName}/aliases" list-aliases-request :portkey.aws.lambda.-2015-03-31/list-aliases-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {"FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-aliases-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef list-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/list-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-aliases-response))

(clojure.core/defn list-functions "Returns a list of your Lambda functions. For each function, the response\nincludes the function configuration information. You must use GetFunction to\nretrieve the code for your function.\n This operation requires permission for the lambda:ListFunctions action.\n If you are using the versioning feature, you can list all of your functions or\nonly $LATEST versions. For information about the versioning feature, see AWS\nLambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([] (list-functions {})) ([list-functions-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "GET" "/2015-03-31/functions/" list-functions-request :portkey.aws.lambda.-2015-03-31/list-functions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"MasterRegion" "MasterRegion", "FunctionVersion" "FunctionVersion", "Marker" "Marker", "MaxItems" "MaxItems"}} 200 :portkey.aws.lambda.-2015-03-31/list-functions-response {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception})))
(clojure.spec.alpha/fdef list-functions :args (clojure.spec.alpha/? :portkey.aws.lambda.-2015-03-31/list-functions-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/list-functions-response))

(clojure.core/defn remove-permission "You can remove individual permissions from an resource policy associated with a\nLambda function by providing a statement ID that you provided when you added the\npermission.\n If you are using versioning, the permissions you remove are specific to the\nLambda function version or alias you specify in the AddPermission request via\nthe Qualifier parameter. For more information about versioning, see AWS Lambda\nFunction Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n Note that removal of a permission will cause an active event source to lose\npermission to the function.\n You need permission for the lambda:RemovePermission action." ([remove-permission-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/policy/{StatementId}" remove-permission-request :portkey.aws.lambda.-2015-03-31/remove-permission-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "StatementId" "StatementId"}, :querystring {"Qualifier" "Qualifier", "RevisionId" "RevisionId"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn delete-alias "Deletes the specified Lambda function alias. For more information, see\nIntroduction to AWS Lambda Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html).\n This requires permission for the lambda:DeleteAlias action." ([delete-alias-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2015-03-31/functions/{FunctionName}/aliases/{Name}" delete-alias-request :portkey.aws.lambda.-2015-03-31/delete-alias-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName", "Name" "Name"}, :querystring {}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef delete-alias :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/delete-alias-request) :ret clojure.core/true?)

(clojure.core/defn create-function "Creates a new Lambda function. The function metadata is created from the request\nparameters, and the code for the function is provided by a .zip file in the\nrequest body. If the function name already exists, the operation will fail. Note\nthat the function name is case-sensitive.\n If you are using versioning, you can also publish a version of the Lambda\nfunction you are creating using the Publish parameter. For more information\nabout versioning, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:CreateFunction action." ([create-function-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions" create-function-request :portkey.aws.lambda.-2015-03-31/create-function-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception})))
(clojure.spec.alpha/fdef create-function :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/create-function-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn untag-resource "Removes tags from a Lambda function. Requires the function ARN (Amazon Resource\nName). For more information, see Tagging Lambda Functions\n(http://docs.aws.amazon.com/lambda/latest/dg/tagging.html) in the AWS Lambda\nDeveloper Guide." ([untag-resource-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "DELETE" "/2017-03-31/tags/{ARN}" untag-resource-request :portkey.aws.lambda.-2015-03-31/untag-resource-request {:payload nil, :move {}, :headers {}, :uri {"ARN" "Resource"}, :querystring {"tagKeys" "TagKeys"}} 204 nil {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn publish-version "Publishes a version of your function from the current snapshot of $LATEST. That\nis, AWS Lambda takes a snapshot of the function code and configuration\ninformation from $LATEST and publishes a new version. The code and configuration\ncannot be modified after publication. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html)." ([publish-version-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "POST" "/2015-03-31/functions/{FunctionName}/versions" publish-version-request :portkey.aws.lambda.-2015-03-31/publish-version-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 201 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "CodeStorageExceededException" :portkey.aws.lambda.-2015-03-31/code-storage-exceeded-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef publish-version :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/publish-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))

(clojure.core/defn put-function-concurrency "Sets a limit on the number of concurrent executions available to this function.\nIt is a subset of your account's total concurrent execution limit per region.\nNote that Lambda automatically reserves a buffer of 100 concurrent executions\nfor functions without any reserved concurrency limit. This means if your account\nlimit is 1000, you have a total of 900 available to allocate to individual\nfunctions. For more information, see concurrent-executions." ([put-function-concurrency-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2017-10-31/functions/{FunctionName}/concurrency" put-function-concurrency-request :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/concurrency {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception})))
(clojure.spec.alpha/fdef put-function-concurrency :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/put-function-concurrency-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/concurrency))

(clojure.core/defn update-function-configuration "Updates the configuration parameters for the specified Lambda function by using\nthe values provided in the request. You provide only the parameters you want to\nchange. This operation must only be used on an existing Lambda function and\ncannot be used to update the function's code.\n If you are using the versioning feature, note this API will always update the\n$LATEST version of your Lambda function. For information about the versioning\nfeature, see AWS Lambda Function Versioning and Aliases\n(http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html).\n This operation requires permission for the lambda:UpdateFunctionConfiguration\naction." ([update-function-configuration-request] (portkey.aws/-rest-json-call portkey.aws.lambda.-2015-03-31/endpoints "PUT" "/2015-03-31/functions/{FunctionName}/configuration" update-function-configuration-request :portkey.aws.lambda.-2015-03-31/update-function-configuration-request {:payload nil, :move {}, :headers {}, :uri {"FunctionName" "FunctionName"}, :querystring {}} 200 :portkey.aws.lambda.-2015-03-31/function-configuration {"ServiceException" :portkey.aws.lambda.-2015-03-31/service-exception, "ResourceNotFoundException" :portkey.aws.lambda.-2015-03-31/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.lambda.-2015-03-31/invalid-parameter-value-exception, "TooManyRequestsException" :portkey.aws.lambda.-2015-03-31/too-many-requests-exception, "ResourceConflictException" :portkey.aws.lambda.-2015-03-31/resource-conflict-exception, "PreconditionFailedException" :portkey.aws.lambda.-2015-03-31/precondition-failed-exception})))
(clojure.spec.alpha/fdef update-function-configuration :args (clojure.spec.alpha/tuple :portkey.aws.lambda.-2015-03-31/update-function-configuration-request) :ret (clojure.spec.alpha/and :portkey.aws.lambda.-2015-03-31/function-configuration))
