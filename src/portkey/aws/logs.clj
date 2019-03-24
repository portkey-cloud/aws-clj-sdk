(ns portkey.aws.logs (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "logs", :region "us-gov-east-1"},
    :ssl-common-name "logs.us-gov-east-1.amazonaws.com",
    :endpoint "https://logs.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "logs", :region "ap-northeast-1"},
    :ssl-common-name "logs.ap-northeast-1.amazonaws.com",
    :endpoint "https://logs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "logs", :region "eu-west-1"},
    :ssl-common-name "logs.eu-west-1.amazonaws.com",
    :endpoint "https://logs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "logs", :region "us-east-2"},
    :ssl-common-name "logs.us-east-2.amazonaws.com",
    :endpoint "https://logs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "logs", :region "ap-southeast-2"},
    :ssl-common-name "logs.ap-southeast-2.amazonaws.com",
    :endpoint "https://logs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "logs", :region "cn-north-1"},
    :ssl-common-name "logs.cn-north-1.amazonaws.com.cn",
    :endpoint "https://logs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "logs", :region "sa-east-1"},
    :ssl-common-name "logs.sa-east-1.amazonaws.com",
    :endpoint "https://logs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "logs", :region "ap-southeast-1"},
    :ssl-common-name "logs.ap-southeast-1.amazonaws.com",
    :endpoint "https://logs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "logs", :region "cn-northwest-1"},
    :ssl-common-name "logs.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://logs.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "logs", :region "ap-northeast-2"},
    :ssl-common-name "logs.ap-northeast-2.amazonaws.com",
    :endpoint "https://logs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "logs", :region "eu-west-3"},
    :ssl-common-name "logs.eu-west-3.amazonaws.com",
    :endpoint "https://logs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "logs", :region "ca-central-1"},
    :ssl-common-name "logs.ca-central-1.amazonaws.com",
    :endpoint "https://logs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "logs", :region "eu-central-1"},
    :ssl-common-name "logs.eu-central-1.amazonaws.com",
    :endpoint "https://logs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "logs", :region "eu-west-2"},
    :ssl-common-name "logs.eu-west-2.amazonaws.com",
    :endpoint "https://logs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "logs", :region "us-gov-west-1"},
    :ssl-common-name "logs.us-gov-west-1.amazonaws.com",
    :endpoint "https://logs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "logs", :region "us-west-2"},
    :ssl-common-name "logs.us-west-2.amazonaws.com",
    :endpoint "https://logs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "logs", :region "us-east-1"},
    :ssl-common-name "logs.us-east-1.amazonaws.com",
    :endpoint "https://logs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "logs", :region "us-west-1"},
    :ssl-common-name "logs.us-west-1.amazonaws.com",
    :endpoint "https://logs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "logs", :region "ap-south-1"},
    :ssl-common-name "logs.ap-south-1.amazonaws.com",
    :endpoint "https://logs.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "logs", :region "eu-north-1"},
    :ssl-common-name "logs.eu-north-1.amazonaws.com",
    :endpoint "https://logs.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-input-log-stream-names)

(clojure.core/declare ser-event-message)

(clojure.core/declare ser-test-event-messages)

(clojure.core/declare ser-input-log-event)

(clojure.core/declare ser-query-status)

(clojure.core/declare ser-descending)

(clojure.core/declare ser-distribution)

(clojure.core/declare ser-filter-pattern)

(clojure.core/declare ser-policy-name)

(clojure.core/declare ser-describe-queries-max-results)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-target-arn)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-export-task-id)

(clojure.core/declare ser-query-id)

(clojure.core/declare ser-query-string)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-access-policy)

(clojure.core/declare ser-events-limit)

(clojure.core/declare ser-log-record-pointer)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-destination-arn)

(clojure.core/declare ser-metric-transformation)

(clojure.core/declare ser-log-stream-name)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-policy-document)

(clojure.core/declare ser-metric-transformations)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-export-task-name)

(clojure.core/declare ser-input-log-events)

(clojure.core/declare ser-log-group-name)

(clojure.core/declare ser-metric-value)

(clojure.core/declare ser-export-destination-prefix)

(clojure.core/declare ser-days)

(clojure.core/declare ser-default-value)

(clojure.core/declare ser-sequence-token)

(clojure.core/declare ser-order-by)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-start-from-head)

(clojure.core/declare ser-metric-namespace)

(clojure.core/declare ser-destination-name)

(clojure.core/declare ser-export-task-status-code)

(clojure.core/declare ser-filter-name)

(clojure.core/declare ser-describe-limit)

(clojure.core/declare ser-export-destination-bucket)

(clojure.core/declare ser-interleaved)

(clojure.core/defn- ser-input-log-stream-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-log-stream-name coll) #:http.request.field{:shape "LogStreamName"}))) input), :shape "InputLogStreamNames", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-event-message [input] #:http.request.field{:value input, :shape "EventMessage"})

(clojure.core/defn- ser-test-event-messages [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-message coll) #:http.request.field{:shape "EventMessage"}))) input), :shape "TestEventMessages", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-input-log-event [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-timestamp (:timestamp input)) #:http.request.field{:name "timestamp", :shape "Timestamp"}) (clojure.core/into (ser-event-message (:message input)) #:http.request.field{:name "message", :shape "EventMessage"})], :shape "InputLogEvent", :type "structure"}))

(clojure.core/defn- ser-query-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Cancelled" "Cancelled", "Scheduled" "Scheduled", :running "Running", :cancelled "Cancelled", "Complete" "Complete", :scheduled "Scheduled", "Running" "Running", :complete "Complete", :failed "Failed"} input), :shape "QueryStatus"})

(clojure.core/defn- ser-descending [input] #:http.request.field{:value input, :shape "Descending"})

(clojure.core/defn- ser-distribution [input] #:http.request.field{:value (clojure.core/get {"Random" "Random", :random "Random", "ByLogStream" "ByLogStream", :by-log-stream "ByLogStream"} input), :shape "Distribution"})

(clojure.core/defn- ser-filter-pattern [input] #:http.request.field{:value input, :shape "FilterPattern"})

(clojure.core/defn- ser-policy-name [input] #:http.request.field{:value input, :shape "PolicyName"})

(clojure.core/defn- ser-describe-queries-max-results [input] #:http.request.field{:value input, :shape "DescribeQueriesMaxResults"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-target-arn [input] #:http.request.field{:value input, :shape "TargetArn"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue"})])) input), :shape "Tags", :type "map", :max 50, :min 1})

(clojure.core/defn- ser-export-task-id [input] #:http.request.field{:value input, :shape "ExportTaskId"})

(clojure.core/defn- ser-query-id [input] #:http.request.field{:value input, :shape "QueryId"})

(clojure.core/defn- ser-query-string [input] #:http.request.field{:value input, :shape "QueryString"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-access-policy [input] #:http.request.field{:value input, :shape "AccessPolicy"})

(clojure.core/defn- ser-events-limit [input] #:http.request.field{:value input, :shape "EventsLimit"})

(clojure.core/defn- ser-log-record-pointer [input] #:http.request.field{:value input, :shape "LogRecordPointer"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagList", :type "list", :min 1})

(clojure.core/defn- ser-destination-arn [input] #:http.request.field{:value input, :shape "DestinationArn"})

(clojure.core/defn- ser-metric-transformation [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "metricName", :shape "MetricName"}) (clojure.core/into (ser-metric-namespace (:metric-namespace input)) #:http.request.field{:name "metricNamespace", :shape "MetricNamespace"}) (clojure.core/into (ser-metric-value (:metric-value input)) #:http.request.field{:name "metricValue", :shape "MetricValue"})], :shape "MetricTransformation", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-default-value (input :default-value)) #:http.request.field{:name "defaultValue", :shape "DefaultValue"}))))

(clojure.core/defn- ser-log-stream-name [input] #:http.request.field{:value input, :shape "LogStreamName"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-policy-document [input] #:http.request.field{:value input, :shape "PolicyDocument"})

(clojure.core/defn- ser-metric-transformations [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-transformation coll) #:http.request.field{:shape "MetricTransformation"}))) input), :shape "MetricTransformations", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-export-task-name [input] #:http.request.field{:value input, :shape "ExportTaskName"})

(clojure.core/defn- ser-input-log-events [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-input-log-event coll) #:http.request.field{:shape "InputLogEvent"}))) input), :shape "InputLogEvents", :type "list", :max 10000, :min 1})

(clojure.core/defn- ser-log-group-name [input] #:http.request.field{:value input, :shape "LogGroupName"})

(clojure.core/defn- ser-metric-value [input] #:http.request.field{:value input, :shape "MetricValue"})

(clojure.core/defn- ser-export-destination-prefix [input] #:http.request.field{:value input, :shape "ExportDestinationPrefix"})

(clojure.core/defn- ser-days [input] #:http.request.field{:value input, :shape "Days"})

(clojure.core/defn- ser-default-value [input] #:http.request.field{:value input, :shape "DefaultValue"})

(clojure.core/defn- ser-sequence-token [input] #:http.request.field{:value input, :shape "SequenceToken"})

(clojure.core/defn- ser-order-by [input] #:http.request.field{:value (clojure.core/get {"LogStreamName" "LogStreamName", :log-stream-name "LogStreamName", "LastEventTime" "LastEventTime", :last-event-time "LastEventTime"} input), :shape "OrderBy"})

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-start-from-head [input] #:http.request.field{:value input, :shape "StartFromHead"})

(clojure.core/defn- ser-metric-namespace [input] #:http.request.field{:value input, :shape "MetricNamespace"})

(clojure.core/defn- ser-destination-name [input] #:http.request.field{:value input, :shape "DestinationName"})

(clojure.core/defn- ser-export-task-status-code [input] #:http.request.field{:value (clojure.core/get {:pending-cancel "PENDING_CANCEL", "COMPLETED" "COMPLETED", :pending "PENDING", :completed "COMPLETED", "PENDING" "PENDING", :running "RUNNING", :cancelled "CANCELLED", "FAILED" "FAILED", "CANCELLED" "CANCELLED", :failed "FAILED", "RUNNING" "RUNNING", "PENDING_CANCEL" "PENDING_CANCEL"} input), :shape "ExportTaskStatusCode"})

(clojure.core/defn- ser-filter-name [input] #:http.request.field{:value input, :shape "FilterName"})

(clojure.core/defn- ser-describe-limit [input] #:http.request.field{:value input, :shape "DescribeLimit"})

(clojure.core/defn- ser-export-destination-bucket [input] #:http.request.field{:value input, :shape "ExportDestinationBucket"})

(clojure.core/defn- ser-interleaved [input] #:http.request.field{:value input, :shape "Interleaved"})

(clojure.core/defn- req-create-log-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "kmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"}))))

(clojure.core/defn- req-put-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-destination-name (input :destination-name)) #:http.request.field{:name "destinationName", :shape "DestinationName"}) (clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "targetArn", :shape "TargetArn"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-put-resource-policy-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName"})) (clojure.core/contains? input :policy-document) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-document (input :policy-document)) #:http.request.field{:name "policyDocument", :shape "PolicyDocument"}))))

(clojure.core/defn- req-describe-log-groups-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :log-group-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-group-name (input :log-group-name-prefix)) #:http.request.field{:name "logGroupNamePrefix", :shape "LogGroupName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-delete-log-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-log-stream-name (input :log-stream-name)) #:http.request.field{:name "logStreamName", :shape "LogStreamName"})]}))

(clojure.core/defn- req-delete-metric-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-filter-name (input :filter-name)) #:http.request.field{:name "filterName", :shape "FilterName"})]}))

(clojure.core/defn- req-put-metric-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-filter-name (input :filter-name)) #:http.request.field{:name "filterName", :shape "FilterName"}) (clojure.core/into (ser-filter-pattern (input :filter-pattern)) #:http.request.field{:name "filterPattern", :shape "FilterPattern"}) (clojure.core/into (ser-metric-transformations (input :metric-transformations)) #:http.request.field{:name "metricTransformations", :shape "MetricTransformations"})]}))

(clojure.core/defn- req-delete-retention-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-associate-kms-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "kmsKeyId", :shape "KmsKeyId"})]}))

(clojure.core/defn- req-stop-query-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-id (input :query-id)) #:http.request.field{:name "queryId", :shape "QueryId"})]}))

(clojure.core/defn- req-delete-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-destination-name (input :destination-name)) #:http.request.field{:name "destinationName", :shape "DestinationName"})]}))

(clojure.core/defn- req-cancel-export-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-export-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "ExportTaskId"})]}))

(clojure.core/defn- req-delete-resource-policy-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :policy-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-policy-name (input :policy-name)) #:http.request.field{:name "policyName", :shape "PolicyName"}))))

(clojure.core/defn- req-delete-log-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-create-log-stream-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-log-stream-name (input :log-stream-name)) #:http.request.field{:name "logStreamName", :shape "LogStreamName"})]}))

(clojure.core/defn- req-get-log-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-log-stream-name (input :log-stream-name)) #:http.request.field{:name "logStreamName", :shape "LogStreamName"})]} (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-events-limit (input :limit)) #:http.request.field{:name "limit", :shape "EventsLimit"})) (clojure.core/contains? input :start-from-head) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start-from-head (input :start-from-head)) #:http.request.field{:name "startFromHead", :shape "StartFromHead"}))))

(clojure.core/defn- req-put-log-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-log-stream-name (input :log-stream-name)) #:http.request.field{:name "logStreamName", :shape "LogStreamName"}) (clojure.core/into (ser-input-log-events (input :log-events)) #:http.request.field{:name "logEvents", :shape "InputLogEvents"})]} (clojure.core/contains? input :sequence-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sequence-token (input :sequence-token)) #:http.request.field{:name "sequenceToken", :shape "SequenceToken"}))))

(clojure.core/defn- req-get-query-results-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-query-id (input :query-id)) #:http.request.field{:name "queryId", :shape "QueryId"})]}))

(clojure.core/defn- req-describe-resource-policies-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-describe-queries-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :log-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})) (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-status (input :status)) #:http.request.field{:name "status", :shape "QueryStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-queries-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "DescribeQueriesMaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"}))))

(clojure.core/defn- req-put-subscription-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-filter-name (input :filter-name)) #:http.request.field{:name "filterName", :shape "FilterName"}) (clojure.core/into (ser-filter-pattern (input :filter-pattern)) #:http.request.field{:name "filterPattern", :shape "FilterPattern"}) (clojure.core/into (ser-destination-arn (input :destination-arn)) #:http.request.field{:name "destinationArn", :shape "DestinationArn"})]} (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "roleArn", :shape "RoleArn"})) (clojure.core/contains? input :distribution) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-distribution (input :distribution)) #:http.request.field{:name "distribution", :shape "Distribution"}))))

(clojure.core/defn- req-untag-log-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-get-log-record-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-record-pointer (input :log-record-pointer)) #:http.request.field{:name "logRecordPointer", :shape "LogRecordPointer"})]}))

(clojure.core/defn- req-put-retention-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-days (input :retention-in-days)) #:http.request.field{:name "retentionInDays", :shape "Days"})]}))

(clojure.core/defn- req-delete-subscription-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-filter-name (input :filter-name)) #:http.request.field{:name "filterName", :shape "FilterName"})]}))

(clojure.core/defn- req-test-metric-filter-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-filter-pattern (input :filter-pattern)) #:http.request.field{:name "filterPattern", :shape "FilterPattern"}) (clojure.core/into (ser-test-event-messages (input :log-event-messages)) #:http.request.field{:name "logEventMessages", :shape "TestEventMessages"})]}))

(clojure.core/defn- req-create-export-task-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-timestamp (input :from)) #:http.request.field{:name "from", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :to)) #:http.request.field{:name "to", :shape "Timestamp"}) (clojure.core/into (ser-export-destination-bucket (input :destination)) #:http.request.field{:name "destination", :shape "ExportDestinationBucket"})]} (clojure.core/contains? input :task-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-task-name (input :task-name)) #:http.request.field{:name "taskName", :shape "ExportTaskName"})) (clojure.core/contains? input :log-stream-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-name (input :log-stream-name-prefix)) #:http.request.field{:name "logStreamNamePrefix", :shape "LogStreamName"})) (clojure.core/contains? input :destination-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-destination-prefix (input :destination-prefix)) #:http.request.field{:name "destinationPrefix", :shape "ExportDestinationPrefix"}))))

(clojure.core/defn- req-start-query-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp"}) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp"}) (clojure.core/into (ser-query-string (input :query-string)) #:http.request.field{:name "queryString", :shape "QueryString"})]} (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-events-limit (input :limit)) #:http.request.field{:name "limit", :shape "EventsLimit"}))))

(clojure.core/defn- req-describe-subscription-filters-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]} (clojure.core/contains? input :filter-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-name (input :filter-name-prefix)) #:http.request.field{:name "filterNamePrefix", :shape "FilterName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-describe-export-tasks-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :task-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-task-id (input :task-id)) #:http.request.field{:name "taskId", :shape "ExportTaskId"})) (clojure.core/contains? input :status-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-export-task-status-code (input :status-code)) #:http.request.field{:name "statusCode", :shape "ExportTaskStatusCode"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-tag-log-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "tags", :shape "Tags"})]}))

(clojure.core/defn- req-list-tags-log-group-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-describe-destinations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :destination-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-destination-name (input :destination-name-prefix)) #:http.request.field{:name "DestinationNamePrefix", :shape "DestinationName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-disassociate-kms-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]}))

(clojure.core/defn- req-describe-log-streams-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]} (clojure.core/contains? input :log-stream-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-name (input :log-stream-name-prefix)) #:http.request.field{:name "logStreamNamePrefix", :shape "LogStreamName"})) (clojure.core/contains? input :order-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-by (input :order-by)) #:http.request.field{:name "orderBy", :shape "OrderBy"})) (clojure.core/contains? input :descending) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-descending (input :descending)) #:http.request.field{:name "descending", :shape "Descending"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"}))))

(clojure.core/defn- req-put-destination-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-destination-name (input :destination-name)) #:http.request.field{:name "destinationName", :shape "DestinationName"}) (clojure.core/into (ser-access-policy (input :access-policy)) #:http.request.field{:name "accessPolicy", :shape "AccessPolicy"})]}))

(clojure.core/defn- req-get-log-group-fields-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]} (clojure.core/contains? input :time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :time)) #:http.request.field{:name "time", :shape "Timestamp"}))))

(clojure.core/defn- req-filter-log-events-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})]} (clojure.core/contains? input :interleaved) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-interleaved (input :interleaved)) #:http.request.field{:name "interleaved", :shape "Interleaved"})) (clojure.core/contains? input :filter-pattern) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-pattern (input :filter-pattern)) #:http.request.field{:name "filterPattern", :shape "FilterPattern"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-events-limit (input :limit)) #:http.request.field{:name "limit", :shape "EventsLimit"})) (clojure.core/contains? input :start-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :start-time)) #:http.request.field{:name "startTime", :shape "Timestamp"})) (clojure.core/contains? input :log-stream-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-log-stream-names (input :log-stream-names)) #:http.request.field{:name "logStreamNames", :shape "InputLogStreamNames"})) (clojure.core/contains? input :end-time) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :end-time)) #:http.request.field{:name "endTime", :shape "Timestamp"})) (clojure.core/contains? input :log-stream-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-stream-name (input :log-stream-name-prefix)) #:http.request.field{:name "logStreamNamePrefix", :shape "LogStreamName"}))))

(clojure.core/defn- req-describe-metric-filters-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :log-group-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-log-group-name (input :log-group-name)) #:http.request.field{:name "logGroupName", :shape "LogGroupName"})) (clojure.core/contains? input :filter-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-name (input :filter-name-prefix)) #:http.request.field{:name "filterNamePrefix", :shape "FilterName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-limit (input :limit)) #:http.request.field{:name "limit", :shape "DescribeLimit"})) (clojure.core/contains? input :metric-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-name (input :metric-name)) #:http.request.field{:name "metricName", :shape "MetricName"})) (clojure.core/contains? input :metric-namespace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-namespace (input :metric-namespace)) #:http.request.field{:name "metricNamespace", :shape "MetricNamespace"}))))

(clojure.core/declare deser-event-message)

(clojure.core/declare deser-query-info)

(clojure.core/declare deser-query-status)

(clojure.core/declare deser-metric-filters)

(clojure.core/declare deser-query-compile-error-location)

(clojure.core/declare deser-event-number)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-export-tasks)

(clojure.core/declare deser-filter-pattern)

(clojure.core/declare deser-log-stream-searched-completely)

(clojure.core/declare deser-output-log-event)

(clojure.core/declare deser-policy-name)

(clojure.core/declare deser-extracted-values)

(clojure.core/declare deser-result-rows)

(clojure.core/declare deser-resource-policy)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-target-arn)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-destination)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-query-char-offset)

(clojure.core/declare deser-export-task-id)

(clojure.core/declare deser-log-groups)

(clojure.core/declare deser-query-id)

(clojure.core/declare deser-query-string)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-access-policy)

(clojure.core/declare deser-export-task-status-message)

(clojure.core/declare deser-subscription-filters)

(clojure.core/declare deser-log-group-field)

(clojure.core/declare deser-success)

(clojure.core/declare deser-rejected-log-events-info)

(clojure.core/declare deser-destination-arn)

(clojure.core/declare deser-subscription-filter)

(clojure.core/declare deser-metric-transformation)

(clojure.core/declare deser-value)

(clojure.core/declare deser-log-stream-name)

(clojure.core/declare deser-metric-filter)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-policy-document)

(clojure.core/declare deser-query-results)

(clojure.core/declare deser-message)

(clojure.core/declare deser-log-group)

(clojure.core/declare deser-query-compile-error)

(clojure.core/declare deser-export-task-status)

(clojure.core/declare deser-metric-transformations)

(clojure.core/declare deser-metric-filter-matches)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-result-field)

(clojure.core/declare deser-log-group-field-list)

(clojure.core/declare deser-log-stream)

(clojure.core/declare deser-searched-log-stream)

(clojure.core/declare deser-percentage)

(clojure.core/declare deser-export-task-name)

(clojure.core/declare deser-export-task-execution-info)

(clojure.core/declare deser-stored-bytes)

(clojure.core/declare deser-log-group-name)

(clojure.core/declare deser-metric-filter-match-record)

(clojure.core/declare deser-query-info-list)

(clojure.core/declare deser-metric-value)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-export-destination-prefix)

(clojure.core/declare deser-days)

(clojure.core/declare deser-export-task)

(clojure.core/declare deser-searched-log-streams)

(clojure.core/declare deser-stats-value)

(clojure.core/declare deser-default-value)

(clojure.core/declare deser-filtered-log-event)

(clojure.core/declare deser-sequence-token)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-field)

(clojure.core/declare deser-metric-namespace)

(clojure.core/declare deser-filter-count)

(clojure.core/declare deser-event-id)

(clojure.core/declare deser-destinations)

(clojure.core/declare deser-destination-name)

(clojure.core/declare deser-filtered-log-events)

(clojure.core/declare deser-export-task-status-code)

(clojure.core/declare deser-filter-name)

(clojure.core/declare deser-log-streams)

(clojure.core/declare deser-query-statistics)

(clojure.core/declare deser-log-event-index)

(clojure.core/declare deser-output-log-events)

(clojure.core/declare deser-log-record)

(clojure.core/declare deser-token)

(clojure.core/declare deser-resource-policies)

(clojure.core/declare deser-export-destination-bucket)

(clojure.core/defn- deser-event-message [input] input)

(clojure.core/defn- deser-query-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "queryId") (clojure.core/assoc :query-id (deser-query-id (input "queryId"))) (clojure.core/contains? input "queryString") (clojure.core/assoc :query-string (deser-query-string (input "queryString"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-query-status (input "status"))) (clojure.core/contains? input "createTime") (clojure.core/assoc :create-time (deser-timestamp (input "createTime"))) (clojure.core/contains? input "logGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "logGroupName")))))

(clojure.core/defn- deser-query-status [input] (clojure.core/get {"Scheduled" :scheduled, "Running" :running, "Complete" :complete, "Failed" :failed, "Cancelled" :cancelled} input))

(clojure.core/defn- deser-metric-filters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-filter coll))) input))

(clojure.core/defn- deser-query-compile-error-location [input] (clojure.core/cond-> {} (clojure.core/contains? input "startCharOffset") (clojure.core/assoc :start-char-offset (deser-query-char-offset (input "startCharOffset"))) (clojure.core/contains? input "endCharOffset") (clojure.core/assoc :end-char-offset (deser-query-char-offset (input "endCharOffset")))))

(clojure.core/defn- deser-event-number [input] input)

(clojure.core/defn- deser-distribution [input] (clojure.core/get {"Random" :random, "ByLogStream" :by-log-stream} input))

(clojure.core/defn- deser-export-tasks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-export-task coll))) input))

(clojure.core/defn- deser-filter-pattern [input] input)

(clojure.core/defn- deser-log-stream-searched-completely [input] input)

(clojure.core/defn- deser-output-log-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "timestamp"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-event-message (input "message"))) (clojure.core/contains? input "ingestionTime") (clojure.core/assoc :ingestion-time (deser-timestamp (input "ingestionTime")))))

(clojure.core/defn- deser-policy-name [input] input)

(clojure.core/defn- deser-extracted-values [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-token k) (deser-value v)])) input))

(clojure.core/defn- deser-result-rows [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-result-field coll))) input))

(clojure.core/defn- deser-resource-policy [input] (clojure.core/cond-> {} (clojure.core/contains? input "policyName") (clojure.core/assoc :policy-name (deser-policy-name (input "policyName"))) (clojure.core/contains? input "policyDocument") (clojure.core/assoc :policy-document (deser-policy-document (input "policyDocument"))) (clojure.core/contains? input "lastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-timestamp (input "lastUpdatedTime")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-target-arn [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "destinationName") (clojure.core/assoc :destination-name (deser-destination-name (input "destinationName"))) (clojure.core/contains? input "targetArn") (clojure.core/assoc :target-arn (deser-target-arn (input "targetArn"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "roleArn"))) (clojure.core/contains? input "accessPolicy") (clojure.core/assoc :access-policy (deser-access-policy (input "accessPolicy"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime")))))

(clojure.core/defn- deser-tags [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)])) input))

(clojure.core/defn- deser-query-char-offset [input] input)

(clojure.core/defn- deser-export-task-id [input] input)

(clojure.core/defn- deser-log-groups [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-log-group coll))) input))

(clojure.core/defn- deser-query-id [input] input)

(clojure.core/defn- deser-query-string [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-access-policy [input] input)

(clojure.core/defn- deser-export-task-status-message [input] input)

(clojure.core/defn- deser-subscription-filters [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscription-filter coll))) input))

(clojure.core/defn- deser-log-group-field [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-field (input "name"))) (clojure.core/contains? input "percent") (clojure.core/assoc :percent (deser-percentage (input "percent")))))

(clojure.core/defn- deser-success [input] input)

(clojure.core/defn- deser-rejected-log-events-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "tooNewLogEventStartIndex") (clojure.core/assoc :too-new-log-event-start-index (deser-log-event-index (input "tooNewLogEventStartIndex"))) (clojure.core/contains? input "tooOldLogEventEndIndex") (clojure.core/assoc :too-old-log-event-end-index (deser-log-event-index (input "tooOldLogEventEndIndex"))) (clojure.core/contains? input "expiredLogEventEndIndex") (clojure.core/assoc :expired-log-event-end-index (deser-log-event-index (input "expiredLogEventEndIndex")))))

(clojure.core/defn- deser-destination-arn [input] input)

(clojure.core/defn- deser-subscription-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "filterName") (clojure.core/assoc :filter-name (deser-filter-name (input "filterName"))) (clojure.core/contains? input "logGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "logGroupName"))) (clojure.core/contains? input "filterPattern") (clojure.core/assoc :filter-pattern (deser-filter-pattern (input "filterPattern"))) (clojure.core/contains? input "destinationArn") (clojure.core/assoc :destination-arn (deser-destination-arn (input "destinationArn"))) (clojure.core/contains? input "roleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "roleArn"))) (clojure.core/contains? input "distribution") (clojure.core/assoc :distribution (deser-distribution (input "distribution"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime")))))

(clojure.core/defn- deser-metric-transformation [input] (clojure.core/cond-> {:metric-name (deser-metric-name (input "metricName")), :metric-namespace (deser-metric-namespace (input "metricNamespace")), :metric-value (deser-metric-value (input "metricValue"))} (clojure.core/contains? input "defaultValue") (clojure.core/assoc :default-value (deser-default-value (input "defaultValue")))))

(clojure.core/defn- deser-value [input] input)

(clojure.core/defn- deser-log-stream-name [input] input)

(clojure.core/defn- deser-metric-filter [input] (clojure.core/cond-> {} (clojure.core/contains? input "filterName") (clojure.core/assoc :filter-name (deser-filter-name (input "filterName"))) (clojure.core/contains? input "filterPattern") (clojure.core/assoc :filter-pattern (deser-filter-pattern (input "filterPattern"))) (clojure.core/contains? input "metricTransformations") (clojure.core/assoc :metric-transformations (deser-metric-transformations (input "metricTransformations"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "logGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "logGroupName")))))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-policy-document [input] input)

(clojure.core/defn- deser-query-results [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-result-rows coll))) input))

(clojure.core/defn- deser-message [input] input)

(clojure.core/defn- deser-log-group [input] (clojure.core/cond-> {} (clojure.core/contains? input "logGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "logGroupName"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "retentionInDays") (clojure.core/assoc :retention-in-days (deser-days (input "retentionInDays"))) (clojure.core/contains? input "metricFilterCount") (clojure.core/assoc :metric-filter-count (deser-filter-count (input "metricFilterCount"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "storedBytes") (clojure.core/assoc :stored-bytes (deser-stored-bytes (input "storedBytes"))) (clojure.core/contains? input "kmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "kmsKeyId")))))

(clojure.core/defn- deser-query-compile-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "location") (clojure.core/assoc :location (deser-query-compile-error-location (input "location"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-message (input "message")))))

(clojure.core/defn- deser-export-task-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "code") (clojure.core/assoc :code (deser-export-task-status-code (input "code"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-export-task-status-message (input "message")))))

(clojure.core/defn- deser-metric-transformations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-transformation coll))) input))

(clojure.core/defn- deser-metric-filter-matches [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-filter-match-record coll))) input))

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-result-field [input] (clojure.core/cond-> {} (clojure.core/contains? input "field") (clojure.core/assoc :field (deser-field (input "field"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-value (input "value")))))

(clojure.core/defn- deser-log-group-field-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-log-group-field coll))) input))

(clojure.core/defn- deser-log-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "logStreamName") (clojure.core/assoc :log-stream-name (deser-log-stream-name (input "logStreamName"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "firstEventTimestamp") (clojure.core/assoc :first-event-timestamp (deser-timestamp (input "firstEventTimestamp"))) (clojure.core/contains? input "lastEventTimestamp") (clojure.core/assoc :last-event-timestamp (deser-timestamp (input "lastEventTimestamp"))) (clojure.core/contains? input "lastIngestionTime") (clojure.core/assoc :last-ingestion-time (deser-timestamp (input "lastIngestionTime"))) (clojure.core/contains? input "uploadSequenceToken") (clojure.core/assoc :upload-sequence-token (deser-sequence-token (input "uploadSequenceToken"))) (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-arn (input "arn"))) (clojure.core/contains? input "storedBytes") (clojure.core/assoc :stored-bytes (deser-stored-bytes (input "storedBytes")))))

(clojure.core/defn- deser-searched-log-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "logStreamName") (clojure.core/assoc :log-stream-name (deser-log-stream-name (input "logStreamName"))) (clojure.core/contains? input "searchedCompletely") (clojure.core/assoc :searched-completely (deser-log-stream-searched-completely (input "searchedCompletely")))))

(clojure.core/defn- deser-percentage [input] input)

(clojure.core/defn- deser-export-task-name [input] input)

(clojure.core/defn- deser-export-task-execution-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "creationTime"))) (clojure.core/contains? input "completionTime") (clojure.core/assoc :completion-time (deser-timestamp (input "completionTime")))))

(clojure.core/defn- deser-stored-bytes [input] input)

(clojure.core/defn- deser-log-group-name [input] input)

(clojure.core/defn- deser-metric-filter-match-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "eventNumber") (clojure.core/assoc :event-number (deser-event-number (input "eventNumber"))) (clojure.core/contains? input "eventMessage") (clojure.core/assoc :event-message (deser-event-message (input "eventMessage"))) (clojure.core/contains? input "extractedValues") (clojure.core/assoc :extracted-values (deser-extracted-values (input "extractedValues")))))

(clojure.core/defn- deser-query-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-info coll))) input))

(clojure.core/defn- deser-metric-value [input] input)

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-export-destination-prefix [input] input)

(clojure.core/defn- deser-days [input] input)

(clojure.core/defn- deser-export-task [input] (clojure.core/cond-> {} (clojure.core/contains? input "executionInfo") (clojure.core/assoc :execution-info (deser-export-task-execution-info (input "executionInfo"))) (clojure.core/contains? input "destination") (clojure.core/assoc :destination (deser-export-destination-bucket (input "destination"))) (clojure.core/contains? input "logGroupName") (clojure.core/assoc :log-group-name (deser-log-group-name (input "logGroupName"))) (clojure.core/contains? input "taskName") (clojure.core/assoc :task-name (deser-export-task-name (input "taskName"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-export-task-status (input "status"))) (clojure.core/contains? input "destinationPrefix") (clojure.core/assoc :destination-prefix (deser-export-destination-prefix (input "destinationPrefix"))) (clojure.core/contains? input "from") (clojure.core/assoc :from (deser-timestamp (input "from"))) (clojure.core/contains? input "taskId") (clojure.core/assoc :task-id (deser-export-task-id (input "taskId"))) (clojure.core/contains? input "to") (clojure.core/assoc :to (deser-timestamp (input "to")))))

(clojure.core/defn- deser-searched-log-streams [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-searched-log-stream coll))) input))

(clojure.core/defn- deser-stats-value [input] input)

(clojure.core/defn- deser-default-value [input] input)

(clojure.core/defn- deser-filtered-log-event [input] (clojure.core/cond-> {} (clojure.core/contains? input "logStreamName") (clojure.core/assoc :log-stream-name (deser-log-stream-name (input "logStreamName"))) (clojure.core/contains? input "timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "timestamp"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-event-message (input "message"))) (clojure.core/contains? input "ingestionTime") (clojure.core/assoc :ingestion-time (deser-timestamp (input "ingestionTime"))) (clojure.core/contains? input "eventId") (clojure.core/assoc :event-id (deser-event-id (input "eventId")))))

(clojure.core/defn- deser-sequence-token [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-field [input] input)

(clojure.core/defn- deser-metric-namespace [input] input)

(clojure.core/defn- deser-filter-count [input] input)

(clojure.core/defn- deser-event-id [input] input)

(clojure.core/defn- deser-destinations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-destination coll))) input))

(clojure.core/defn- deser-destination-name [input] input)

(clojure.core/defn- deser-filtered-log-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-filtered-log-event coll))) input))

(clojure.core/defn- deser-export-task-status-code [input] (clojure.core/get {"CANCELLED" :cancelled, "COMPLETED" :completed, "FAILED" :failed, "PENDING" :pending, "PENDING_CANCEL" :pending-cancel, "RUNNING" :running} input))

(clojure.core/defn- deser-filter-name [input] input)

(clojure.core/defn- deser-log-streams [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-log-stream coll))) input))

(clojure.core/defn- deser-query-statistics [input] (clojure.core/cond-> {} (clojure.core/contains? input "recordsMatched") (clojure.core/assoc :records-matched (deser-stats-value (input "recordsMatched"))) (clojure.core/contains? input "recordsScanned") (clojure.core/assoc :records-scanned (deser-stats-value (input "recordsScanned"))) (clojure.core/contains? input "bytesScanned") (clojure.core/assoc :bytes-scanned (deser-stats-value (input "bytesScanned")))))

(clojure.core/defn- deser-log-event-index [input] input)

(clojure.core/defn- deser-output-log-events [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-output-log-event coll))) input))

(clojure.core/defn- deser-log-record [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-field k) (deser-value v)])) input))

(clojure.core/defn- deser-token [input] input)

(clojure.core/defn- deser-resource-policies [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-policy coll))) input))

(clojure.core/defn- deser-export-destination-bucket [input] input)

(clojure.core/defn- response-describe-log-groups-response ([input] (response-describe-log-groups-response nil input)) ([resultWrapper1904337 input] (clojure.core/let [rawinput1904336 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904338 {"logGroups" (rawinput1904336 "logGroups"), "nextToken" (rawinput1904336 "nextToken")}] (clojure.core/cond-> {} (letvar1904338 "logGroups") (clojure.core/assoc :log-groups (deser-log-groups (clojure.core/get-in letvar1904338 ["logGroups"]))) (letvar1904338 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904338 ["nextToken"])))))))

(clojure.core/defn- response-get-query-results-response ([input] (response-get-query-results-response nil input)) ([resultWrapper1904340 input] (clojure.core/let [rawinput1904339 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904341 {"results" (rawinput1904339 "results"), "statistics" (rawinput1904339 "statistics"), "status" (rawinput1904339 "status")}] (clojure.core/cond-> {} (letvar1904341 "results") (clojure.core/assoc :results (deser-query-results (clojure.core/get-in letvar1904341 ["results"]))) (letvar1904341 "statistics") (clojure.core/assoc :statistics (deser-query-statistics (clojure.core/get-in letvar1904341 ["statistics"]))) (letvar1904341 "status") (clojure.core/assoc :status (deser-query-status (clojure.core/get-in letvar1904341 ["status"])))))))

(clojure.core/defn- response-list-tags-log-group-response ([input] (response-list-tags-log-group-response nil input)) ([resultWrapper1904343 input] (clojure.core/let [rawinput1904342 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904344 {"tags" (rawinput1904342 "tags")}] (clojure.core/cond-> {} (letvar1904344 "tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1904344 ["tags"])))))))

(clojure.core/defn- response-put-destination-response ([input] (response-put-destination-response nil input)) ([resultWrapper1904346 input] (clojure.core/let [rawinput1904345 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904347 {"destination" (rawinput1904345 "destination")}] (clojure.core/cond-> {} (letvar1904347 "destination") (clojure.core/assoc :destination (deser-destination (clojure.core/get-in letvar1904347 ["destination"])))))))

(clojure.core/defn- response-get-log-events-response ([input] (response-get-log-events-response nil input)) ([resultWrapper1904349 input] (clojure.core/let [rawinput1904348 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904350 {"events" (rawinput1904348 "events"), "nextForwardToken" (rawinput1904348 "nextForwardToken"), "nextBackwardToken" (rawinput1904348 "nextBackwardToken")}] (clojure.core/cond-> {} (letvar1904350 "events") (clojure.core/assoc :events (deser-output-log-events (clojure.core/get-in letvar1904350 ["events"]))) (letvar1904350 "nextForwardToken") (clojure.core/assoc :next-forward-token (deser-next-token (clojure.core/get-in letvar1904350 ["nextForwardToken"]))) (letvar1904350 "nextBackwardToken") (clojure.core/assoc :next-backward-token (deser-next-token (clojure.core/get-in letvar1904350 ["nextBackwardToken"])))))))

(clojure.core/defn- response-get-log-record-response ([input] (response-get-log-record-response nil input)) ([resultWrapper1904352 input] (clojure.core/let [rawinput1904351 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904353 {"logRecord" (rawinput1904351 "logRecord")}] (clojure.core/cond-> {} (letvar1904353 "logRecord") (clojure.core/assoc :log-record (deser-log-record (clojure.core/get-in letvar1904353 ["logRecord"])))))))

(clojure.core/defn- response-malformed-query-exception ([input] (response-malformed-query-exception nil input)) ([resultWrapper1904355 input] (clojure.core/let [rawinput1904354 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904356 {"queryCompileError" (rawinput1904354 "queryCompileError")}] (clojure.core/cond-> {} (letvar1904356 "queryCompileError") (clojure.core/assoc :query-compile-error (deser-query-compile-error (clojure.core/get-in letvar1904356 ["queryCompileError"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1904358 input] (clojure.core/let [rawinput1904357 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904359 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1904361 input] (clojure.core/let [rawinput1904360 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904362 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1904364 input] (clojure.core/let [rawinput1904363 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904365 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-export-tasks-response ([input] (response-describe-export-tasks-response nil input)) ([resultWrapper1904367 input] (clojure.core/let [rawinput1904366 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904368 {"exportTasks" (rawinput1904366 "exportTasks"), "nextToken" (rawinput1904366 "nextToken")}] (clojure.core/cond-> {} (letvar1904368 "exportTasks") (clojure.core/assoc :export-tasks (deser-export-tasks (clojure.core/get-in letvar1904368 ["exportTasks"]))) (letvar1904368 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904368 ["nextToken"])))))))

(clojure.core/defn- response-operation-aborted-exception ([input] (response-operation-aborted-exception nil input)) ([resultWrapper1904370 input] (clojure.core/let [rawinput1904369 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904371 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-put-log-events-response ([input] (response-put-log-events-response nil input)) ([resultWrapper1904373 input] (clojure.core/let [rawinput1904372 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904374 {"nextSequenceToken" (rawinput1904372 "nextSequenceToken"), "rejectedLogEventsInfo" (rawinput1904372 "rejectedLogEventsInfo")}] (clojure.core/cond-> {} (letvar1904374 "nextSequenceToken") (clojure.core/assoc :next-sequence-token (deser-sequence-token (clojure.core/get-in letvar1904374 ["nextSequenceToken"]))) (letvar1904374 "rejectedLogEventsInfo") (clojure.core/assoc :rejected-log-events-info (deser-rejected-log-events-info (clojure.core/get-in letvar1904374 ["rejectedLogEventsInfo"])))))))

(clojure.core/defn- response-invalid-operation-exception ([input] (response-invalid-operation-exception nil input)) ([resultWrapper1904376 input] (clojure.core/let [rawinput1904375 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904377 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unrecognized-client-exception ([input] (response-unrecognized-client-exception nil input)) ([resultWrapper1904379 input] (clojure.core/let [rawinput1904378 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904380 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1904382 input] (clojure.core/let [rawinput1904381 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904383 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-log-group-fields-response ([input] (response-get-log-group-fields-response nil input)) ([resultWrapper1904385 input] (clojure.core/let [rawinput1904384 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904386 {"logGroupFields" (rawinput1904384 "logGroupFields")}] (clojure.core/cond-> {} (letvar1904386 "logGroupFields") (clojure.core/assoc :log-group-fields (deser-log-group-field-list (clojure.core/get-in letvar1904386 ["logGroupFields"])))))))

(clojure.core/defn- response-describe-subscription-filters-response ([input] (response-describe-subscription-filters-response nil input)) ([resultWrapper1904388 input] (clojure.core/let [rawinput1904387 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904389 {"subscriptionFilters" (rawinput1904387 "subscriptionFilters"), "nextToken" (rawinput1904387 "nextToken")}] (clojure.core/cond-> {} (letvar1904389 "subscriptionFilters") (clojure.core/assoc :subscription-filters (deser-subscription-filters (clojure.core/get-in letvar1904389 ["subscriptionFilters"]))) (letvar1904389 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904389 ["nextToken"])))))))

(clojure.core/defn- response-describe-destinations-response ([input] (response-describe-destinations-response nil input)) ([resultWrapper1904391 input] (clojure.core/let [rawinput1904390 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904392 {"destinations" (rawinput1904390 "destinations"), "nextToken" (rawinput1904390 "nextToken")}] (clojure.core/cond-> {} (letvar1904392 "destinations") (clojure.core/assoc :destinations (deser-destinations (clojure.core/get-in letvar1904392 ["destinations"]))) (letvar1904392 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904392 ["nextToken"])))))))

(clojure.core/defn- response-test-metric-filter-response ([input] (response-test-metric-filter-response nil input)) ([resultWrapper1904394 input] (clojure.core/let [rawinput1904393 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904395 {"matches" (rawinput1904393 "matches")}] (clojure.core/cond-> {} (letvar1904395 "matches") (clojure.core/assoc :matches (deser-metric-filter-matches (clojure.core/get-in letvar1904395 ["matches"])))))))

(clojure.core/defn- response-start-query-response ([input] (response-start-query-response nil input)) ([resultWrapper1904397 input] (clojure.core/let [rawinput1904396 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904398 {"queryId" (rawinput1904396 "queryId")}] (clojure.core/cond-> {} (letvar1904398 "queryId") (clojure.core/assoc :query-id (deser-query-id (clojure.core/get-in letvar1904398 ["queryId"])))))))

(clojure.core/defn- response-put-resource-policy-response ([input] (response-put-resource-policy-response nil input)) ([resultWrapper1904400 input] (clojure.core/let [rawinput1904399 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904401 {"resourcePolicy" (rawinput1904399 "resourcePolicy")}] (clojure.core/cond-> {} (letvar1904401 "resourcePolicy") (clojure.core/assoc :resource-policy (deser-resource-policy (clojure.core/get-in letvar1904401 ["resourcePolicy"])))))))

(clojure.core/defn- response-describe-resource-policies-response ([input] (response-describe-resource-policies-response nil input)) ([resultWrapper1904403 input] (clojure.core/let [rawinput1904402 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904404 {"resourcePolicies" (rawinput1904402 "resourcePolicies"), "nextToken" (rawinput1904402 "nextToken")}] (clojure.core/cond-> {} (letvar1904404 "resourcePolicies") (clojure.core/assoc :resource-policies (deser-resource-policies (clojure.core/get-in letvar1904404 ["resourcePolicies"]))) (letvar1904404 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904404 ["nextToken"])))))))

(clojure.core/defn- response-describe-queries-response ([input] (response-describe-queries-response nil input)) ([resultWrapper1904406 input] (clojure.core/let [rawinput1904405 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904407 {"queries" (rawinput1904405 "queries"), "nextToken" (rawinput1904405 "nextToken")}] (clojure.core/cond-> {} (letvar1904407 "queries") (clojure.core/assoc :queries (deser-query-info-list (clojure.core/get-in letvar1904407 ["queries"]))) (letvar1904407 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904407 ["nextToken"])))))))

(clojure.core/defn- response-describe-log-streams-response ([input] (response-describe-log-streams-response nil input)) ([resultWrapper1904409 input] (clojure.core/let [rawinput1904408 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904410 {"logStreams" (rawinput1904408 "logStreams"), "nextToken" (rawinput1904408 "nextToken")}] (clojure.core/cond-> {} (letvar1904410 "logStreams") (clojure.core/assoc :log-streams (deser-log-streams (clojure.core/get-in letvar1904410 ["logStreams"]))) (letvar1904410 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904410 ["nextToken"])))))))

(clojure.core/defn- response-data-already-accepted-exception ([input] (response-data-already-accepted-exception nil input)) ([resultWrapper1904412 input] (clojure.core/let [rawinput1904411 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904413 {"expectedSequenceToken" (rawinput1904411 "expectedSequenceToken")}] (clojure.core/cond-> {} (letvar1904413 "expectedSequenceToken") (clojure.core/assoc :expected-sequence-token (deser-sequence-token (clojure.core/get-in letvar1904413 ["expectedSequenceToken"])))))))

(clojure.core/defn- response-filter-log-events-response ([input] (response-filter-log-events-response nil input)) ([resultWrapper1904415 input] (clojure.core/let [rawinput1904414 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904416 {"events" (rawinput1904414 "events"), "searchedLogStreams" (rawinput1904414 "searchedLogStreams"), "nextToken" (rawinput1904414 "nextToken")}] (clojure.core/cond-> {} (letvar1904416 "events") (clojure.core/assoc :events (deser-filtered-log-events (clojure.core/get-in letvar1904416 ["events"]))) (letvar1904416 "searchedLogStreams") (clojure.core/assoc :searched-log-streams (deser-searched-log-streams (clojure.core/get-in letvar1904416 ["searchedLogStreams"]))) (letvar1904416 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904416 ["nextToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1904418 input] (clojure.core/let [rawinput1904417 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904419 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-sequence-token-exception ([input] (response-invalid-sequence-token-exception nil input)) ([resultWrapper1904421 input] (clojure.core/let [rawinput1904420 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904422 {"expectedSequenceToken" (rawinput1904420 "expectedSequenceToken")}] (clojure.core/cond-> {} (letvar1904422 "expectedSequenceToken") (clojure.core/assoc :expected-sequence-token (deser-sequence-token (clojure.core/get-in letvar1904422 ["expectedSequenceToken"])))))))

(clojure.core/defn- response-stop-query-response ([input] (response-stop-query-response nil input)) ([resultWrapper1904424 input] (clojure.core/let [rawinput1904423 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904425 {"success" (rawinput1904423 "success")}] (clojure.core/cond-> {} (letvar1904425 "success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar1904425 ["success"])))))))

(clojure.core/defn- response-describe-metric-filters-response ([input] (response-describe-metric-filters-response nil input)) ([resultWrapper1904427 input] (clojure.core/let [rawinput1904426 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904428 {"metricFilters" (rawinput1904426 "metricFilters"), "nextToken" (rawinput1904426 "nextToken")}] (clojure.core/cond-> {} (letvar1904428 "metricFilters") (clojure.core/assoc :metric-filters (deser-metric-filters (clojure.core/get-in letvar1904428 ["metricFilters"]))) (letvar1904428 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1904428 ["nextToken"])))))))

(clojure.core/defn- response-create-export-task-response ([input] (response-create-export-task-response nil input)) ([resultWrapper1904430 input] (clojure.core/let [rawinput1904429 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1904431 {"taskId" (rawinput1904429 "taskId")}] (clojure.core/cond-> {} (letvar1904431 "taskId") (clojure.core/assoc :task-id (deser-export-task-id (clojure.core/get-in letvar1904431 ["taskId"])))))))

(clojure.spec.alpha/def :portkey.aws.logs.create-log-group-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.create-log-group-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.logs/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.logs.create-log-group-request/tags (clojure.spec.alpha/and :portkey.aws.logs/tags))
(clojure.spec.alpha/def :portkey.aws.logs/create-log-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.create-log-group-request/log-group-name] :opt-un [:portkey.aws.logs.create-log-group-request/kms-key-id :portkey.aws.logs.create-log-group-request/tags]))

(clojure.spec.alpha/def :portkey.aws.logs/input-log-stream-names (clojure.spec.alpha/coll-of :portkey.aws.logs/log-stream-name :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.logs/event-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs/test-event-messages (clojure.spec.alpha/coll-of :portkey.aws.logs/event-message :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.logs.put-destination-request/destination-name (clojure.spec.alpha/and :portkey.aws.logs/destination-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-destination-request/target-arn (clojure.spec.alpha/and :portkey.aws.logs/target-arn))
(clojure.spec.alpha/def :portkey.aws.logs.put-destination-request/role-arn (clojure.spec.alpha/and :portkey.aws.logs/role-arn))
(clojure.spec.alpha/def :portkey.aws.logs/put-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-destination-request/destination-name :portkey.aws.logs.put-destination-request/target-arn :portkey.aws.logs.put-destination-request/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.put-resource-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.logs/policy-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-resource-policy-request/policy-document (clojure.spec.alpha/and :portkey.aws.logs/policy-document))
(clojure.spec.alpha/def :portkey.aws.logs/put-resource-policy-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.put-resource-policy-request/policy-name :portkey.aws.logs.put-resource-policy-request/policy-document]))

(clojure.spec.alpha/def :portkey.aws.logs.query-info/query-id (clojure.spec.alpha/and :portkey.aws.logs/query-id))
(clojure.spec.alpha/def :portkey.aws.logs.query-info/query-string (clojure.spec.alpha/and :portkey.aws.logs/query-string))
(clojure.spec.alpha/def :portkey.aws.logs.query-info/status (clojure.spec.alpha/and :portkey.aws.logs/query-status))
(clojure.spec.alpha/def :portkey.aws.logs.query-info/create-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.query-info/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/query-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.query-info/query-id :portkey.aws.logs.query-info/query-string :portkey.aws.logs.query-info/status :portkey.aws.logs.query-info/create-time :portkey.aws.logs.query-info/log-group-name]))

(clojure.spec.alpha/def :portkey.aws.logs.input-log-event/timestamp (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.input-log-event/message (clojure.spec.alpha/and :portkey.aws.logs/event-message))
(clojure.spec.alpha/def :portkey.aws.logs/input-log-event (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.input-log-event/timestamp :portkey.aws.logs.input-log-event/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.describe-log-groups-response/log-groups (clojure.spec.alpha/and :portkey.aws.logs/log-groups))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-groups-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-log-groups-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-log-groups-response/log-groups :portkey.aws.logs.describe-log-groups-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/query-status #{"Failed" "Cancelled" "Scheduled" :running :cancelled "Complete" :scheduled "Running" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.logs.describe-log-groups-request/log-group-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-groups-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-groups-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-log-groups-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-log-groups-request/log-group-name-prefix :portkey.aws.logs.describe-log-groups-request/next-token :portkey.aws.logs.describe-log-groups-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs/metric-filters (clojure.spec.alpha/coll-of :portkey.aws.logs/metric-filter))

(clojure.spec.alpha/def :portkey.aws.logs.delete-log-stream-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.delete-log-stream-request/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-log-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-log-stream-request/log-group-name :portkey.aws.logs.delete-log-stream-request/log-stream-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/descending clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.logs.query-compile-error-location/start-char-offset (clojure.spec.alpha/and :portkey.aws.logs/query-char-offset))
(clojure.spec.alpha/def :portkey.aws.logs.query-compile-error-location/end-char-offset (clojure.spec.alpha/and :portkey.aws.logs/query-char-offset))
(clojure.spec.alpha/def :portkey.aws.logs/query-compile-error-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.query-compile-error-location/start-char-offset :portkey.aws.logs.query-compile-error-location/end-char-offset]))

(clojure.spec.alpha/def :portkey.aws.logs.delete-metric-filter-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.delete-metric-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-metric-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-metric-filter-request/log-group-name :portkey.aws.logs.delete-metric-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.put-metric-filter-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-metric-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-metric-filter-request/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.put-metric-filter-request/metric-transformations (clojure.spec.alpha/and :portkey.aws.logs/metric-transformations))
(clojure.spec.alpha/def :portkey.aws.logs/put-metric-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-metric-filter-request/log-group-name :portkey.aws.logs.put-metric-filter-request/filter-name :portkey.aws.logs.put-metric-filter-request/filter-pattern :portkey.aws.logs.put-metric-filter-request/metric-transformations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/event-number clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs/distribution #{:by-log-stream "ByLogStream" "Random" :random})

(clojure.spec.alpha/def :portkey.aws.logs.delete-retention-policy-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-retention-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-retention-policy-request/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/export-tasks (clojure.spec.alpha/coll-of :portkey.aws.logs/export-task))

(clojure.spec.alpha/def :portkey.aws.logs.associate-kms-key-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.associate-kms-key-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.logs/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.logs/associate-kms-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.associate-kms-key-request/log-group-name :portkey.aws.logs.associate-kms-key-request/kms-key-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/filter-pattern (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.logs.get-query-results-response/results (clojure.spec.alpha/and :portkey.aws.logs/query-results))
(clojure.spec.alpha/def :portkey.aws.logs.get-query-results-response/statistics (clojure.spec.alpha/and :portkey.aws.logs/query-statistics))
(clojure.spec.alpha/def :portkey.aws.logs.get-query-results-response/status (clojure.spec.alpha/and :portkey.aws.logs/query-status))
(clojure.spec.alpha/def :portkey.aws.logs/get-query-results-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.get-query-results-response/results :portkey.aws.logs.get-query-results-response/statistics :portkey.aws.logs.get-query-results-response/status]))

(clojure.spec.alpha/def :portkey.aws.logs/log-stream-searched-completely clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.logs.output-log-event/timestamp (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.output-log-event/message (clojure.spec.alpha/and :portkey.aws.logs/event-message))
(clojure.spec.alpha/def :portkey.aws.logs.output-log-event/ingestion-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/output-log-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.output-log-event/timestamp :portkey.aws.logs.output-log-event/message :portkey.aws.logs.output-log-event/ingestion-time]))

(clojure.spec.alpha/def :portkey.aws.logs.list-tags-log-group-response/tags (clojure.spec.alpha/and :portkey.aws.logs/tags))
(clojure.spec.alpha/def :portkey.aws.logs/list-tags-log-group-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.list-tags-log-group-response/tags]))

(clojure.spec.alpha/def :portkey.aws.logs/policy-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs.stop-query-request/query-id (clojure.spec.alpha/and :portkey.aws.logs/query-id))
(clojure.spec.alpha/def :portkey.aws.logs/stop-query-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.stop-query-request/query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.delete-destination-request/destination-name (clojure.spec.alpha/and :portkey.aws.logs/destination-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-destination-request/destination-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.cancel-export-task-request/task-id (clojure.spec.alpha/and :portkey.aws.logs/export-task-id))
(clojure.spec.alpha/def :portkey.aws.logs/cancel-export-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.cancel-export-task-request/task-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/describe-queries-max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.logs.delete-resource-policy-request/policy-name (clojure.spec.alpha/and :portkey.aws.logs/policy-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-resource-policy-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.delete-resource-policy-request/policy-name]))

(clojure.spec.alpha/def :portkey.aws.logs.put-destination-response/destination (clojure.spec.alpha/and :portkey.aws.logs/destination))
(clojure.spec.alpha/def :portkey.aws.logs/put-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.put-destination-response/destination]))

(clojure.spec.alpha/def :portkey.aws.logs.delete-log-group-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-log-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-log-group-request/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/extracted-values (clojure.spec.alpha/map-of :portkey.aws.logs/token :portkey.aws.logs/value))

(clojure.spec.alpha/def :portkey.aws.logs/result-rows (clojure.spec.alpha/coll-of :portkey.aws.logs/result-field))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-response/events (clojure.spec.alpha/and :portkey.aws.logs/output-log-events))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-response/next-forward-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-response/next-backward-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.get-log-events-response/events :portkey.aws.logs.get-log-events-response/next-forward-token :portkey.aws.logs.get-log-events-response/next-backward-token]))

(clojure.spec.alpha/def :portkey.aws.logs.create-log-stream-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.create-log-stream-request/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs/create-log-stream-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.create-log-stream-request/log-group-name :portkey.aws.logs.create-log-stream-request/log-stream-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.resource-policy/policy-name (clojure.spec.alpha/and :portkey.aws.logs/policy-name))
(clojure.spec.alpha/def :portkey.aws.logs.resource-policy/policy-document (clojure.spec.alpha/and :portkey.aws.logs/policy-document))
(clojure.spec.alpha/def :portkey.aws.logs.resource-policy/last-updated-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/resource-policy (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.resource-policy/policy-name :portkey.aws.logs.resource-policy/policy-document :portkey.aws.logs.resource-policy/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.logs/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs/target-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/start-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/end-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/limit (clojure.spec.alpha/and :portkey.aws.logs/events-limit))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-events-request/start-from-head (clojure.spec.alpha/and :portkey.aws.logs/start-from-head))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.get-log-events-request/log-group-name :portkey.aws.logs.get-log-events-request/log-stream-name] :opt-un [:portkey.aws.logs.get-log-events-request/start-time :portkey.aws.logs.get-log-events-request/end-time :portkey.aws.logs.get-log-events-request/next-token :portkey.aws.logs.get-log-events-request/limit :portkey.aws.logs.get-log-events-request/start-from-head]))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-record-response/log-record (clojure.spec.alpha/and :portkey.aws.logs/log-record))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-record-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.get-log-record-response/log-record]))

(clojure.spec.alpha/def :portkey.aws.logs/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]+)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs.destination/destination-name (clojure.spec.alpha/and :portkey.aws.logs/destination-name))
(clojure.spec.alpha/def :portkey.aws.logs.destination/target-arn (clojure.spec.alpha/and :portkey.aws.logs/target-arn))
(clojure.spec.alpha/def :portkey.aws.logs.destination/role-arn (clojure.spec.alpha/and :portkey.aws.logs/role-arn))
(clojure.spec.alpha/def :portkey.aws.logs.destination/access-policy (clojure.spec.alpha/and :portkey.aws.logs/access-policy))
(clojure.spec.alpha/def :portkey.aws.logs.destination/arn (clojure.spec.alpha/and :portkey.aws.logs/arn))
(clojure.spec.alpha/def :portkey.aws.logs.destination/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.destination/destination-name :portkey.aws.logs.destination/target-arn :portkey.aws.logs.destination/role-arn :portkey.aws.logs.destination/access-policy :portkey.aws.logs.destination/arn :portkey.aws.logs.destination/creation-time]))

(clojure.spec.alpha/def :portkey.aws.logs.malformed-query-exception/query-compile-error (clojure.spec.alpha/and :portkey.aws.logs/query-compile-error))
(clojure.spec.alpha/def :portkey.aws.logs/malformed-query-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.malformed-query-exception/query-compile-error]))

(clojure.spec.alpha/def :portkey.aws.logs/tags (clojure.spec.alpha/map-of :portkey.aws.logs/tag-key :portkey.aws.logs/tag-value))

(clojure.spec.alpha/def :portkey.aws.logs/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-request/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-request/log-events (clojure.spec.alpha/and :portkey.aws.logs/input-log-events))
(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-request/sequence-token (clojure.spec.alpha/and :portkey.aws.logs/sequence-token))
(clojure.spec.alpha/def :portkey.aws.logs/put-log-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-log-events-request/log-group-name :portkey.aws.logs.put-log-events-request/log-stream-name :portkey.aws.logs.put-log-events-request/log-events] :opt-un [:portkey.aws.logs.put-log-events-request/sequence-token]))

(clojure.spec.alpha/def :portkey.aws.logs.get-query-results-request/query-id (clojure.spec.alpha/and :portkey.aws.logs/query-id))
(clojure.spec.alpha/def :portkey.aws.logs/get-query-results-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.get-query-results-request/query-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/query-char-offset clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs.describe-resource-policies-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-resource-policies-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-resource-policies-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-resource-policies-request/next-token :portkey.aws.logs.describe-resource-policies-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/export-task-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.logs/log-groups (clojure.spec.alpha/coll-of :portkey.aws.logs/log-group))

(clojure.spec.alpha/def :portkey.aws.logs/query-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.logs/query-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-response/export-tasks (clojure.spec.alpha/and :portkey.aws.logs/export-tasks))
(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-export-tasks-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-export-tasks-response/export-tasks :portkey.aws.logs.describe-export-tasks-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/operation-aborted-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-request/status (clojure.spec.alpha/and :portkey.aws.logs/query-status))
(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-request/max-results (clojure.spec.alpha/and :portkey.aws.logs/describe-queries-max-results))
(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-queries-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-queries-request/log-group-name :portkey.aws.logs.describe-queries-request/status :portkey.aws.logs.describe-queries-request/max-results :portkey.aws.logs.describe-queries-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-response/next-sequence-token (clojure.spec.alpha/and :portkey.aws.logs/sequence-token))
(clojure.spec.alpha/def :portkey.aws.logs.put-log-events-response/rejected-log-events-info (clojure.spec.alpha/and :portkey.aws.logs/rejected-log-events-info))
(clojure.spec.alpha/def :portkey.aws.logs/put-log-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.put-log-events-response/next-sequence-token :portkey.aws.logs.put-log-events-response/rejected-log-events-info]))

(clojure.spec.alpha/def :portkey.aws.logs/access-policy (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs/events-limit (clojure.spec.alpha/int-in 1 10000))

(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/destination-arn (clojure.spec.alpha/and :portkey.aws.logs/destination-arn))
(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/role-arn (clojure.spec.alpha/and :portkey.aws.logs/role-arn))
(clojure.spec.alpha/def :portkey.aws.logs.put-subscription-filter-request/distribution (clojure.spec.alpha/and :portkey.aws.logs/distribution))
(clojure.spec.alpha/def :portkey.aws.logs/put-subscription-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-subscription-filter-request/log-group-name :portkey.aws.logs.put-subscription-filter-request/filter-name :portkey.aws.logs.put-subscription-filter-request/filter-pattern :portkey.aws.logs.put-subscription-filter-request/destination-arn] :opt-un [:portkey.aws.logs.put-subscription-filter-request/role-arn :portkey.aws.logs.put-subscription-filter-request/distribution]))

(clojure.spec.alpha/def :portkey.aws.logs/invalid-operation-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.untag-log-group-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.untag-log-group-request/tags (clojure.spec.alpha/and :portkey.aws.logs/tag-list))
(clojure.spec.alpha/def :portkey.aws.logs/untag-log-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.untag-log-group-request/log-group-name :portkey.aws.logs.untag-log-group-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/export-task-status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs/log-record-pointer (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs/unrecognized-client-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/subscription-filters (clojure.spec.alpha/coll-of :portkey.aws.logs/subscription-filter))

(clojure.spec.alpha/def :portkey.aws.logs/tag-list (clojure.spec.alpha/coll-of :portkey.aws.logs/tag-key :min-count 1))

(clojure.spec.alpha/def :portkey.aws.logs.log-group-field/name (clojure.spec.alpha/and :portkey.aws.logs/field))
(clojure.spec.alpha/def :portkey.aws.logs.log-group-field/percent (clojure.spec.alpha/and :portkey.aws.logs/percentage))
(clojure.spec.alpha/def :portkey.aws.logs/log-group-field (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.log-group-field/name :portkey.aws.logs.log-group-field/percent]))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-record-request/log-record-pointer (clojure.spec.alpha/and :portkey.aws.logs/log-record-pointer))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-record-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.get-log-record-request/log-record-pointer] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.logs.rejected-log-events-info/too-new-log-event-start-index (clojure.spec.alpha/and :portkey.aws.logs/log-event-index))
(clojure.spec.alpha/def :portkey.aws.logs.rejected-log-events-info/too-old-log-event-end-index (clojure.spec.alpha/and :portkey.aws.logs/log-event-index))
(clojure.spec.alpha/def :portkey.aws.logs.rejected-log-events-info/expired-log-event-end-index (clojure.spec.alpha/and :portkey.aws.logs/log-event-index))
(clojure.spec.alpha/def :portkey.aws.logs/rejected-log-events-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.rejected-log-events-info/too-new-log-event-start-index :portkey.aws.logs.rejected-log-events-info/too-old-log-event-end-index :portkey.aws.logs.rejected-log-events-info/expired-log-event-end-index]))

(clojure.spec.alpha/def :portkey.aws.logs/destination-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/destination-arn (clojure.spec.alpha/and :portkey.aws.logs/destination-arn))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/role-arn (clojure.spec.alpha/and :portkey.aws.logs/role-arn))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/distribution (clojure.spec.alpha/and :portkey.aws.logs/distribution))
(clojure.spec.alpha/def :portkey.aws.logs.subscription-filter/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/subscription-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.subscription-filter/filter-name :portkey.aws.logs.subscription-filter/log-group-name :portkey.aws.logs.subscription-filter/filter-pattern :portkey.aws.logs.subscription-filter/destination-arn :portkey.aws.logs.subscription-filter/role-arn :portkey.aws.logs.subscription-filter/distribution :portkey.aws.logs.subscription-filter/creation-time]))

(clojure.spec.alpha/def :portkey.aws.logs.metric-transformation/metric-name (clojure.spec.alpha/and :portkey.aws.logs/metric-name))
(clojure.spec.alpha/def :portkey.aws.logs.metric-transformation/metric-namespace (clojure.spec.alpha/and :portkey.aws.logs/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.logs.metric-transformation/metric-value (clojure.spec.alpha/and :portkey.aws.logs/metric-value))
(clojure.spec.alpha/def :portkey.aws.logs.metric-transformation/default-value (clojure.spec.alpha/and :portkey.aws.logs/default-value))
(clojure.spec.alpha/def :portkey.aws.logs/metric-transformation (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.metric-transformation/metric-name :portkey.aws.logs.metric-transformation/metric-namespace :portkey.aws.logs.metric-transformation/metric-value] :opt-un [:portkey.aws.logs.metric-transformation/default-value]))

(clojure.spec.alpha/def :portkey.aws.logs.put-retention-policy-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-retention-policy-request/retention-in-days (clojure.spec.alpha/and :portkey.aws.logs/days))
(clojure.spec.alpha/def :portkey.aws.logs/put-retention-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-retention-policy-request/log-group-name :portkey.aws.logs.put-retention-policy-request/retention-in-days] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.delete-subscription-filter-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.delete-subscription-filter-request/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs/delete-subscription-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.delete-subscription-filter-request/log-group-name :portkey.aws.logs.delete-subscription-filter-request/filter-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-group-fields-response/log-group-fields (clojure.spec.alpha/and :portkey.aws.logs/log-group-field-list))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-group-fields-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.get-log-group-fields-response/log-group-fields]))

(clojure.spec.alpha/def :portkey.aws.logs.test-metric-filter-request/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.test-metric-filter-request/log-event-messages (clojure.spec.alpha/and :portkey.aws.logs/test-event-messages))
(clojure.spec.alpha/def :portkey.aws.logs/test-metric-filter-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.test-metric-filter-request/filter-pattern :portkey.aws.logs.test-metric-filter-request/log-event-messages] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-response/subscription-filters (clojure.spec.alpha/and :portkey.aws.logs/subscription-filters))
(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-subscription-filters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-subscription-filters-response/subscription-filters :portkey.aws.logs.describe-subscription-filters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/task-name (clojure.spec.alpha/and :portkey.aws.logs/export-task-name))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/log-stream-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/from (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/to (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/destination (clojure.spec.alpha/and :portkey.aws.logs/export-destination-bucket))
(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-request/destination-prefix (clojure.spec.alpha/and :portkey.aws.logs/export-destination-prefix))
(clojure.spec.alpha/def :portkey.aws.logs/create-export-task-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.create-export-task-request/log-group-name :portkey.aws.logs.create-export-task-request/from :portkey.aws.logs.create-export-task-request/to :portkey.aws.logs.create-export-task-request/destination] :opt-un [:portkey.aws.logs.create-export-task-request/task-name :portkey.aws.logs.create-export-task-request/log-stream-name-prefix :portkey.aws.logs.create-export-task-request/destination-prefix]))

(clojure.spec.alpha/def :portkey.aws.logs/log-stream-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:*]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs.metric-filter/filter-name (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter/metric-transformations (clojure.spec.alpha/and :portkey.aws.logs/metric-transformations))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/metric-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.metric-filter/filter-name :portkey.aws.logs.metric-filter/filter-pattern :portkey.aws.logs.metric-filter/metric-transformations :portkey.aws.logs.metric-filter/creation-time :portkey.aws.logs.metric-filter/log-group-name]))

(clojure.spec.alpha/def :portkey.aws.logs/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs/policy-document (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 5120))))

(clojure.spec.alpha/def :portkey.aws.logs/query-results (clojure.spec.alpha/coll-of :portkey.aws.logs/result-rows))

(clojure.spec.alpha/def :portkey.aws.logs.start-query-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.start-query-request/start-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.start-query-request/end-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.start-query-request/query-string (clojure.spec.alpha/and :portkey.aws.logs/query-string))
(clojure.spec.alpha/def :portkey.aws.logs.start-query-request/limit (clojure.spec.alpha/and :portkey.aws.logs/events-limit))
(clojure.spec.alpha/def :portkey.aws.logs/start-query-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.start-query-request/log-group-name :portkey.aws.logs.start-query-request/start-time :portkey.aws.logs.start-query-request/end-time :portkey.aws.logs.start-query-request/query-string] :opt-un [:portkey.aws.logs.start-query-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs.log-group/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/retention-in-days (clojure.spec.alpha/and :portkey.aws.logs/days))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/metric-filter-count (clojure.spec.alpha/and :portkey.aws.logs/filter-count))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/arn (clojure.spec.alpha/and :portkey.aws.logs/arn))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/stored-bytes (clojure.spec.alpha/and :portkey.aws.logs/stored-bytes))
(clojure.spec.alpha/def :portkey.aws.logs.log-group/kms-key-id (clojure.spec.alpha/and :portkey.aws.logs/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.logs/log-group (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.log-group/log-group-name :portkey.aws.logs.log-group/creation-time :portkey.aws.logs.log-group/retention-in-days :portkey.aws.logs.log-group/metric-filter-count :portkey.aws.logs.log-group/arn :portkey.aws.logs.log-group/stored-bytes :portkey.aws.logs.log-group/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.logs.query-compile-error/location (clojure.spec.alpha/and :portkey.aws.logs/query-compile-error-location))
(clojure.spec.alpha/def :portkey.aws.logs.query-compile-error/message (clojure.spec.alpha/and :portkey.aws.logs/message))
(clojure.spec.alpha/def :portkey.aws.logs/query-compile-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.query-compile-error/location :portkey.aws.logs.query-compile-error/message]))

(clojure.spec.alpha/def :portkey.aws.logs.export-task-status/code (clojure.spec.alpha/and :portkey.aws.logs/export-task-status-code))
(clojure.spec.alpha/def :portkey.aws.logs.export-task-status/message (clojure.spec.alpha/and :portkey.aws.logs/export-task-status-message))
(clojure.spec.alpha/def :portkey.aws.logs/export-task-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.export-task-status/code :portkey.aws.logs.export-task-status/message]))

(clojure.spec.alpha/def :portkey.aws.logs/metric-transformations (clojure.spec.alpha/coll-of :portkey.aws.logs/metric-transformation :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.logs/metric-filter-matches (clojure.spec.alpha/coll-of :portkey.aws.logs/metric-filter-match-record))

(clojure.spec.alpha/def :portkey.aws.logs/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.logs.result-field/field (clojure.spec.alpha/and :portkey.aws.logs/field))
(clojure.spec.alpha/def :portkey.aws.logs.result-field/value (clojure.spec.alpha/and :portkey.aws.logs/value))
(clojure.spec.alpha/def :portkey.aws.logs/result-field (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.result-field/field :portkey.aws.logs.result-field/value]))

(clojure.spec.alpha/def :portkey.aws.logs/log-group-field-list (clojure.spec.alpha/coll-of :portkey.aws.logs/log-group-field))

(clojure.spec.alpha/def :portkey.aws.logs.log-stream/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/first-event-timestamp (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/last-event-timestamp (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/last-ingestion-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/upload-sequence-token (clojure.spec.alpha/and :portkey.aws.logs/sequence-token))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/arn (clojure.spec.alpha/and :portkey.aws.logs/arn))
(clojure.spec.alpha/def :portkey.aws.logs.log-stream/stored-bytes (clojure.spec.alpha/and :portkey.aws.logs/stored-bytes))
(clojure.spec.alpha/def :portkey.aws.logs/log-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.log-stream/log-stream-name :portkey.aws.logs.log-stream/creation-time :portkey.aws.logs.log-stream/first-event-timestamp :portkey.aws.logs.log-stream/last-event-timestamp :portkey.aws.logs.log-stream/last-ingestion-time :portkey.aws.logs.log-stream/upload-sequence-token :portkey.aws.logs.log-stream/arn :portkey.aws.logs.log-stream/stored-bytes]))

(clojure.spec.alpha/def :portkey.aws.logs.searched-log-stream/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.searched-log-stream/searched-completely (clojure.spec.alpha/and :portkey.aws.logs/log-stream-searched-completely))
(clojure.spec.alpha/def :portkey.aws.logs/searched-log-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.searched-log-stream/log-stream-name :portkey.aws.logs.searched-log-stream/searched-completely]))

(clojure.spec.alpha/def :portkey.aws.logs.describe-destinations-response/destinations (clojure.spec.alpha/and :portkey.aws.logs/destinations))
(clojure.spec.alpha/def :portkey.aws.logs.describe-destinations-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-destinations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-destinations-response/destinations :portkey.aws.logs.describe-destinations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/percentage (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.logs/export-task-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.logs.test-metric-filter-response/matches (clojure.spec.alpha/and :portkey.aws.logs/metric-filter-matches))
(clojure.spec.alpha/def :portkey.aws.logs/test-metric-filter-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.test-metric-filter-response/matches]))

(clojure.spec.alpha/def :portkey.aws.logs.start-query-response/query-id (clojure.spec.alpha/and :portkey.aws.logs/query-id))
(clojure.spec.alpha/def :portkey.aws.logs/start-query-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.start-query-response/query-id]))

(clojure.spec.alpha/def :portkey.aws.logs/input-log-events (clojure.spec.alpha/coll-of :portkey.aws.logs/input-log-event :min-count 1 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.logs.export-task-execution-info/creation-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.export-task-execution-info/completion-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/export-task-execution-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.export-task-execution-info/creation-time :portkey.aws.logs.export-task-execution-info/completion-time]))

(clojure.spec.alpha/def :portkey.aws.logs/stored-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs/log-group-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[\.\-_/#A-Za-z0-9]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs.metric-filter-match-record/event-number (clojure.spec.alpha/and :portkey.aws.logs/event-number))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter-match-record/event-message (clojure.spec.alpha/and :portkey.aws.logs/event-message))
(clojure.spec.alpha/def :portkey.aws.logs.metric-filter-match-record/extracted-values (clojure.spec.alpha/and :portkey.aws.logs/extracted-values))
(clojure.spec.alpha/def :portkey.aws.logs/metric-filter-match-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.metric-filter-match-record/event-number :portkey.aws.logs.metric-filter-match-record/event-message :portkey.aws.logs.metric-filter-match-record/extracted-values]))

(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-request/filter-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-subscription-filters-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-subscription-filters-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.describe-subscription-filters-request/log-group-name] :opt-un [:portkey.aws.logs.describe-subscription-filters-request/filter-name-prefix :portkey.aws.logs.describe-subscription-filters-request/next-token :portkey.aws.logs.describe-subscription-filters-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs/query-info-list (clojure.spec.alpha/coll-of :portkey.aws.logs/query-info))

(clojure.spec.alpha/def :portkey.aws.logs/metric-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.logs.put-resource-policy-response/resource-policy (clojure.spec.alpha/and :portkey.aws.logs/resource-policy))
(clojure.spec.alpha/def :portkey.aws.logs/put-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.put-resource-policy-response/resource-policy]))

(clojure.spec.alpha/def :portkey.aws.logs.describe-resource-policies-response/resource-policies (clojure.spec.alpha/and :portkey.aws.logs/resource-policies))
(clojure.spec.alpha/def :portkey.aws.logs.describe-resource-policies-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-resource-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-resource-policies-response/resource-policies :portkey.aws.logs.describe-resource-policies-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-response/queries (clojure.spec.alpha/and :portkey.aws.logs/query-info-list))
(clojure.spec.alpha/def :portkey.aws.logs.describe-queries-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-queries-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-queries-response/queries :portkey.aws.logs.describe-queries-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/export-destination-prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs/days clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs.export-task/execution-info (clojure.spec.alpha/and :portkey.aws.logs/export-task-execution-info))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/destination (clojure.spec.alpha/and :portkey.aws.logs/export-destination-bucket))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/task-name (clojure.spec.alpha/and :portkey.aws.logs/export-task-name))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/status (clojure.spec.alpha/and :portkey.aws.logs/export-task-status))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/destination-prefix (clojure.spec.alpha/and :portkey.aws.logs/export-destination-prefix))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/from (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/task-id (clojure.spec.alpha/and :portkey.aws.logs/export-task-id))
(clojure.spec.alpha/def :portkey.aws.logs.export-task/to (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/export-task (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.export-task/execution-info :portkey.aws.logs.export-task/destination :portkey.aws.logs.export-task/log-group-name :portkey.aws.logs.export-task/task-name :portkey.aws.logs.export-task/status :portkey.aws.logs.export-task/destination-prefix :portkey.aws.logs.export-task/from :portkey.aws.logs.export-task/task-id :portkey.aws.logs.export-task/to]))

(clojure.spec.alpha/def :portkey.aws.logs/searched-log-streams (clojure.spec.alpha/coll-of :portkey.aws.logs/searched-log-stream))

(clojure.spec.alpha/def :portkey.aws.logs/stats-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-response/log-streams (clojure.spec.alpha/and :portkey.aws.logs/log-streams))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-log-streams-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-log-streams-response/log-streams :portkey.aws.logs.describe-log-streams-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/default-value clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.logs.filtered-log-event/log-stream-name (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.filtered-log-event/timestamp (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.filtered-log-event/message (clojure.spec.alpha/and :portkey.aws.logs/event-message))
(clojure.spec.alpha/def :portkey.aws.logs.filtered-log-event/ingestion-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.filtered-log-event/event-id (clojure.spec.alpha/and :portkey.aws.logs/event-id))
(clojure.spec.alpha/def :portkey.aws.logs/filtered-log-event (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.filtered-log-event/log-stream-name :portkey.aws.logs.filtered-log-event/timestamp :portkey.aws.logs.filtered-log-event/message :portkey.aws.logs.filtered-log-event/ingestion-time :portkey.aws.logs.filtered-log-event/event-id]))

(clojure.spec.alpha/def :portkey.aws.logs/sequence-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-request/task-id (clojure.spec.alpha/and :portkey.aws.logs/export-task-id))
(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-request/status-code (clojure.spec.alpha/and :portkey.aws.logs/export-task-status-code))
(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-export-tasks-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-export-tasks-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-export-tasks-request/task-id :portkey.aws.logs.describe-export-tasks-request/status-code :portkey.aws.logs.describe-export-tasks-request/next-token :portkey.aws.logs.describe-export-tasks-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs.tag-log-group-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.tag-log-group-request/tags (clojure.spec.alpha/and :portkey.aws.logs/tags))
(clojure.spec.alpha/def :portkey.aws.logs/tag-log-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.tag-log-group-request/log-group-name :portkey.aws.logs.tag-log-group-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs.list-tags-log-group-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/list-tags-log-group-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.list-tags-log-group-request/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/order-by #{"LastEventTime" :log-stream-name "LogStreamName" :last-event-time})

(clojure.spec.alpha/def :portkey.aws.logs/timestamp clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs.describe-destinations-request/destination-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/destination-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-destinations-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-destinations-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-destinations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-destinations-request/destination-name-prefix :portkey.aws.logs.describe-destinations-request/next-token :portkey.aws.logs.describe-destinations-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs.disassociate-kms-key-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs/disassociate-kms-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.disassociate-kms-key-request/log-group-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:*$]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs/start-from-head clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.logs/field (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs/metric-namespace (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:*$]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs/filter-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs.data-already-accepted-exception/expected-sequence-token (clojure.spec.alpha/and :portkey.aws.logs/sequence-token))
(clojure.spec.alpha/def :portkey.aws.logs/data-already-accepted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.data-already-accepted-exception/expected-sequence-token]))

(clojure.spec.alpha/def :portkey.aws.logs/event-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs/destinations (clojure.spec.alpha/coll-of :portkey.aws.logs/destination))

(clojure.spec.alpha/def :portkey.aws.logs/destination-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:*]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/log-stream-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/order-by (clojure.spec.alpha/and :portkey.aws.logs/order-by))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/descending (clojure.spec.alpha/and :portkey.aws.logs/descending))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-log-streams-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs/describe-log-streams-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.describe-log-streams-request/log-group-name] :opt-un [:portkey.aws.logs.describe-log-streams-request/log-stream-name-prefix :portkey.aws.logs.describe-log-streams-request/order-by :portkey.aws.logs.describe-log-streams-request/descending :portkey.aws.logs.describe-log-streams-request/next-token :portkey.aws.logs.describe-log-streams-request/limit]))

(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-response/events (clojure.spec.alpha/and :portkey.aws.logs/filtered-log-events))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-response/searched-log-streams (clojure.spec.alpha/and :portkey.aws.logs/searched-log-streams))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/filter-log-events-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.filter-log-events-response/events :portkey.aws.logs.filter-log-events-response/searched-log-streams :portkey.aws.logs.filter-log-events-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs/filtered-log-events (clojure.spec.alpha/coll-of :portkey.aws.logs/filtered-log-event))

(clojure.spec.alpha/def :portkey.aws.logs/export-task-status-code #{:pending-cancel "COMPLETED" :pending :completed "PENDING" :running :cancelled "FAILED" "CANCELLED" :failed "RUNNING" "PENDING_CANCEL"})

(clojure.spec.alpha/def :portkey.aws.logs/filter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[^:*]*" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.logs/describe-limit (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.logs/log-streams (clojure.spec.alpha/coll-of :portkey.aws.logs/log-stream))

(clojure.spec.alpha/def :portkey.aws.logs.query-statistics/records-matched (clojure.spec.alpha/and :portkey.aws.logs/stats-value))
(clojure.spec.alpha/def :portkey.aws.logs.query-statistics/records-scanned (clojure.spec.alpha/and :portkey.aws.logs/stats-value))
(clojure.spec.alpha/def :portkey.aws.logs.query-statistics/bytes-scanned (clojure.spec.alpha/and :portkey.aws.logs/stats-value))
(clojure.spec.alpha/def :portkey.aws.logs/query-statistics (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.query-statistics/records-matched :portkey.aws.logs.query-statistics/records-scanned :portkey.aws.logs.query-statistics/bytes-scanned]))

(clojure.spec.alpha/def :portkey.aws.logs/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/log-event-index clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.logs.invalid-sequence-token-exception/expected-sequence-token (clojure.spec.alpha/and :portkey.aws.logs/sequence-token))
(clojure.spec.alpha/def :portkey.aws.logs/invalid-sequence-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.invalid-sequence-token-exception/expected-sequence-token]))

(clojure.spec.alpha/def :portkey.aws.logs/output-log-events (clojure.spec.alpha/coll-of :portkey.aws.logs/output-log-event))

(clojure.spec.alpha/def :portkey.aws.logs.put-destination-policy-request/destination-name (clojure.spec.alpha/and :portkey.aws.logs/destination-name))
(clojure.spec.alpha/def :portkey.aws.logs.put-destination-policy-request/access-policy (clojure.spec.alpha/and :portkey.aws.logs/access-policy))
(clojure.spec.alpha/def :portkey.aws.logs/put-destination-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.put-destination-policy-request/destination-name :portkey.aws.logs.put-destination-policy-request/access-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.logs/log-record (clojure.spec.alpha/map-of :portkey.aws.logs/field :portkey.aws.logs/value))

(clojure.spec.alpha/def :portkey.aws.logs.stop-query-response/success (clojure.spec.alpha/and :portkey.aws.logs/success))
(clojure.spec.alpha/def :portkey.aws.logs/stop-query-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.stop-query-response/success]))

(clojure.spec.alpha/def :portkey.aws.logs/token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.logs.get-log-group-fields-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.get-log-group-fields-request/time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs/get-log-group-fields-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.get-log-group-fields-request/log-group-name] :opt-un [:portkey.aws.logs.get-log-group-fields-request/time]))

(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/interleaved (clojure.spec.alpha/and :portkey.aws.logs/interleaved))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/filter-pattern (clojure.spec.alpha/and :portkey.aws.logs/filter-pattern))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/limit (clojure.spec.alpha/and :portkey.aws.logs/events-limit))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/start-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/log-stream-names (clojure.spec.alpha/and :portkey.aws.logs/input-log-stream-names))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/end-time (clojure.spec.alpha/and :portkey.aws.logs/timestamp))
(clojure.spec.alpha/def :portkey.aws.logs.filter-log-events-request/log-stream-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/log-stream-name))
(clojure.spec.alpha/def :portkey.aws.logs/filter-log-events-request (clojure.spec.alpha/keys :req-un [:portkey.aws.logs.filter-log-events-request/log-group-name] :opt-un [:portkey.aws.logs.filter-log-events-request/interleaved :portkey.aws.logs.filter-log-events-request/filter-pattern :portkey.aws.logs.filter-log-events-request/next-token :portkey.aws.logs.filter-log-events-request/limit :portkey.aws.logs.filter-log-events-request/start-time :portkey.aws.logs.filter-log-events-request/log-stream-names :portkey.aws.logs.filter-log-events-request/end-time :portkey.aws.logs.filter-log-events-request/log-stream-name-prefix]))

(clojure.spec.alpha/def :portkey.aws.logs/resource-policies (clojure.spec.alpha/coll-of :portkey.aws.logs/resource-policy))

(clojure.spec.alpha/def :portkey.aws.logs/export-destination-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-response/metric-filters (clojure.spec.alpha/and :portkey.aws.logs/metric-filters))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-response/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs/describe-metric-filters-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-metric-filters-response/metric-filters :portkey.aws.logs.describe-metric-filters-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.logs.create-export-task-response/task-id (clojure.spec.alpha/and :portkey.aws.logs/export-task-id))
(clojure.spec.alpha/def :portkey.aws.logs/create-export-task-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.create-export-task-response/task-id]))

(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/log-group-name (clojure.spec.alpha/and :portkey.aws.logs/log-group-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/filter-name-prefix (clojure.spec.alpha/and :portkey.aws.logs/filter-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/next-token (clojure.spec.alpha/and :portkey.aws.logs/next-token))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/limit (clojure.spec.alpha/and :portkey.aws.logs/describe-limit))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/metric-name (clojure.spec.alpha/and :portkey.aws.logs/metric-name))
(clojure.spec.alpha/def :portkey.aws.logs.describe-metric-filters-request/metric-namespace (clojure.spec.alpha/and :portkey.aws.logs/metric-namespace))
(clojure.spec.alpha/def :portkey.aws.logs/describe-metric-filters-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.logs.describe-metric-filters-request/log-group-name :portkey.aws.logs.describe-metric-filters-request/filter-name-prefix :portkey.aws.logs.describe-metric-filters-request/next-token :portkey.aws.logs.describe-metric-filters-request/limit :portkey.aws.logs.describe-metric-filters-request/metric-name :portkey.aws.logs.describe-metric-filters-request/metric-namespace]))

(clojure.spec.alpha/def :portkey.aws.logs/interleaved clojure.core/boolean?)

(clojure.core/defn filter-log-events ([filter-log-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-filter-log-events-request filter-log-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/filter-log-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/filter-log-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "FilterLogEvents", :http.request.configuration/output-deser-fn response-filter-log-events-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef filter-log-events :args (clojure.spec.alpha/tuple :portkey.aws.logs/filter-log-events-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/filter-log-events-response))

(clojure.core/defn delete-log-group ([delete-log-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-log-group-request delete-log-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-log-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLogGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-log-group :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-log-group-request) :ret clojure.core/true?)

(clojure.core/defn untag-log-group ([untag-log-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-log-group-request untag-log-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/untag-log-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagLogGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef untag-log-group :args (clojure.spec.alpha/tuple :portkey.aws.logs/untag-log-group-request) :ret clojure.core/true?)

(clojure.core/defn create-log-group ([create-log-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-log-group-request create-log-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/create-log-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLogGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceAlreadyExistsException" :portkey.aws.logs/resource-already-exists-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-log-group :args (clojure.spec.alpha/tuple :portkey.aws.logs/create-log-group-request) :ret clojure.core/true?)

(clojure.core/defn delete-resource-policy ([] (delete-resource-policy {})) ([delete-resource-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-resource-policy-request delete-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourcePolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-resource-policy :args (clojure.spec.alpha/? :portkey.aws.logs/delete-resource-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-queries ([] (describe-queries {})) ([describe-queries-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-queries-request describe-queries-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-queries-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-queries-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeQueries", :http.request.configuration/output-deser-fn response-describe-queries-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-queries :args (clojure.spec.alpha/? :portkey.aws.logs/describe-queries-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-queries-response))

(clojure.core/defn create-export-task ([create-export-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-export-task-request create-export-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/create-export-task-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/create-export-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateExportTask", :http.request.configuration/output-deser-fn response-create-export-task-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ResourceAlreadyExistsException" :portkey.aws.logs/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-export-task :args (clojure.spec.alpha/tuple :portkey.aws.logs/create-export-task-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/create-export-task-response))

(clojure.core/defn cancel-export-task ([cancel-export-task-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-export-task-request cancel-export-task-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/cancel-export-task-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelExportTask", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "InvalidOperationException" :portkey.aws.logs/invalid-operation-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef cancel-export-task :args (clojure.spec.alpha/tuple :portkey.aws.logs/cancel-export-task-request) :ret clojure.core/true?)

(clojure.core/defn delete-metric-filter ([delete-metric-filter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-metric-filter-request delete-metric-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-metric-filter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMetricFilter", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-metric-filter :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-metric-filter-request) :ret clojure.core/true?)

(clojure.core/defn describe-export-tasks ([] (describe-export-tasks {})) ([describe-export-tasks-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-export-tasks-request describe-export-tasks-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-export-tasks-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-export-tasks-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeExportTasks", :http.request.configuration/output-deser-fn response-describe-export-tasks-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-export-tasks :args (clojure.spec.alpha/? :portkey.aws.logs/describe-export-tasks-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-export-tasks-response))

(clojure.core/defn delete-log-stream ([delete-log-stream-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-log-stream-request delete-log-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-log-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLogStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-log-stream :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-log-stream-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-kms-key ([disassociate-kms-key-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disassociate-kms-key-request disassociate-kms-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/disassociate-kms-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateKmsKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef disassociate-kms-key :args (clojure.spec.alpha/tuple :portkey.aws.logs/disassociate-kms-key-request) :ret clojure.core/true?)

(clojure.core/defn describe-destinations ([] (describe-destinations {})) ([describe-destinations-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-destinations-request describe-destinations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-destinations-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-destinations-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeDestinations", :http.request.configuration/output-deser-fn response-describe-destinations-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-destinations :args (clojure.spec.alpha/? :portkey.aws.logs/describe-destinations-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-destinations-response))

(clojure.core/defn put-subscription-filter ([put-subscription-filter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-subscription-filter-request put-subscription-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-subscription-filter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSubscriptionFilter", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-subscription-filter :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-subscription-filter-request) :ret clojure.core/true?)

(clojure.core/defn put-destination-policy ([put-destination-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-destination-policy-request put-destination-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-destination-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDestinationPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-destination-policy :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-destination-policy-request) :ret clojure.core/true?)

(clojure.core/defn tag-log-group ([tag-log-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-log-group-request tag-log-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/tag-log-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagLogGroup", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef tag-log-group :args (clojure.spec.alpha/tuple :portkey.aws.logs/tag-log-group-request) :ret clojure.core/true?)

(clojure.core/defn get-log-group-fields ([get-log-group-fields-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-log-group-fields-request get-log-group-fields-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/get-log-group-fields-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/get-log-group-fields-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLogGroupFields", :http.request.configuration/output-deser-fn response-get-log-group-fields-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-log-group-fields :args (clojure.spec.alpha/tuple :portkey.aws.logs/get-log-group-fields-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/get-log-group-fields-response))

(clojure.core/defn get-log-events ([get-log-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-log-events-request get-log-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/get-log-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/get-log-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLogEvents", :http.request.configuration/output-deser-fn response-get-log-events-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-log-events :args (clojure.spec.alpha/tuple :portkey.aws.logs/get-log-events-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/get-log-events-response))

(clojure.core/defn put-log-events ([put-log-events-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-log-events-request put-log-events-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/put-log-events-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-log-events-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLogEvents", :http.request.configuration/output-deser-fn response-put-log-events-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "InvalidSequenceTokenException" :portkey.aws.logs/invalid-sequence-token-exception, "DataAlreadyAcceptedException" :portkey.aws.logs/data-already-accepted-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception, "UnrecognizedClientException" :portkey.aws.logs/unrecognized-client-exception}})))))
(clojure.spec.alpha/fdef put-log-events :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-log-events-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/put-log-events-response))

(clojure.core/defn put-resource-policy ([] (put-resource-policy {})) ([put-resource-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-resource-policy-request put-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/put-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourcePolicy", :http.request.configuration/output-deser-fn response-put-resource-policy-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-resource-policy :args (clojure.spec.alpha/? :portkey.aws.logs/put-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/put-resource-policy-response))

(clojure.core/defn describe-log-streams ([describe-log-streams-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-log-streams-request describe-log-streams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-log-streams-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-log-streams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLogStreams", :http.request.configuration/output-deser-fn response-describe-log-streams-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-log-streams :args (clojure.spec.alpha/tuple :portkey.aws.logs/describe-log-streams-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-log-streams-response))

(clojure.core/defn describe-resource-policies ([] (describe-resource-policies {})) ([describe-resource-policies-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-resource-policies-request describe-resource-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-resource-policies-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-resource-policies-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeResourcePolicies", :http.request.configuration/output-deser-fn response-describe-resource-policies-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-resource-policies :args (clojure.spec.alpha/? :portkey.aws.logs/describe-resource-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-resource-policies-response))

(clojure.core/defn delete-destination ([delete-destination-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-destination-request delete-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-destination-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDestination", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-destination :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-destination-request) :ret clojure.core/true?)

(clojure.core/defn describe-subscription-filters ([describe-subscription-filters-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-subscription-filters-request describe-subscription-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-subscription-filters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-subscription-filters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSubscriptionFilters", :http.request.configuration/output-deser-fn response-describe-subscription-filters-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-subscription-filters :args (clojure.spec.alpha/tuple :portkey.aws.logs/describe-subscription-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-subscription-filters-response))

(clojure.core/defn list-tags-log-group ([list-tags-log-group-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-log-group-request list-tags-log-group-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/list-tags-log-group-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/list-tags-log-group-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsLogGroup", :http.request.configuration/output-deser-fn response-list-tags-log-group-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-tags-log-group :args (clojure.spec.alpha/tuple :portkey.aws.logs/list-tags-log-group-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/list-tags-log-group-response))

(clojure.core/defn delete-retention-policy ([delete-retention-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-retention-policy-request delete-retention-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-retention-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRetentionPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-retention-policy :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-retention-policy-request) :ret clojure.core/true?)

(clojure.core/defn describe-metric-filters ([] (describe-metric-filters {})) ([describe-metric-filters-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-metric-filters-request describe-metric-filters-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-metric-filters-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-metric-filters-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMetricFilters", :http.request.configuration/output-deser-fn response-describe-metric-filters-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-metric-filters :args (clojure.spec.alpha/? :portkey.aws.logs/describe-metric-filters-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-metric-filters-response))

(clojure.core/defn create-log-stream ([create-log-stream-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-log-stream-request create-log-stream-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/create-log-stream-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLogStream", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceAlreadyExistsException" :portkey.aws.logs/resource-already-exists-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef create-log-stream :args (clojure.spec.alpha/tuple :portkey.aws.logs/create-log-stream-request) :ret clojure.core/true?)

(clojure.core/defn get-log-record ([get-log-record-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-log-record-request get-log-record-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/get-log-record-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/get-log-record-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLogRecord", :http.request.configuration/output-deser-fn response-get-log-record-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-log-record :args (clojure.spec.alpha/tuple :portkey.aws.logs/get-log-record-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/get-log-record-response))

(clojure.core/defn put-metric-filter ([put-metric-filter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-metric-filter-request put-metric-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-metric-filter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutMetricFilter", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-metric-filter :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-metric-filter-request) :ret clojure.core/true?)

(clojure.core/defn put-destination ([put-destination-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-destination-request put-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/put-destination-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-destination-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutDestination", :http.request.configuration/output-deser-fn response-put-destination-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-destination :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/put-destination-response))

(clojure.core/defn start-query ([start-query-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-query-request start-query-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/start-query-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/start-query-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartQuery", :http.request.configuration/output-deser-fn response-start-query-response, :http.request.spec/error-spec {"MalformedQueryException" :portkey.aws.logs/malformed-query-exception, "InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "LimitExceededException" :portkey.aws.logs/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef start-query :args (clojure.spec.alpha/tuple :portkey.aws.logs/start-query-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/start-query-response))

(clojure.core/defn delete-subscription-filter ([delete-subscription-filter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-subscription-filter-request delete-subscription-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/delete-subscription-filter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSubscriptionFilter", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef delete-subscription-filter :args (clojure.spec.alpha/tuple :portkey.aws.logs/delete-subscription-filter-request) :ret clojure.core/true?)

(clojure.core/defn stop-query ([stop-query-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-stop-query-request stop-query-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/stop-query-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/stop-query-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopQuery", :http.request.configuration/output-deser-fn response-stop-query-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef stop-query :args (clojure.spec.alpha/tuple :portkey.aws.logs/stop-query-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/stop-query-response))

(clojure.core/defn test-metric-filter ([test-metric-filter-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-test-metric-filter-request test-metric-filter-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/test-metric-filter-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/test-metric-filter-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TestMetricFilter", :http.request.configuration/output-deser-fn response-test-metric-filter-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef test-metric-filter :args (clojure.spec.alpha/tuple :portkey.aws.logs/test-metric-filter-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/test-metric-filter-response))

(clojure.core/defn get-query-results ([get-query-results-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-query-results-request get-query-results-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/get-query-results-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/get-query-results-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetQueryResults", :http.request.configuration/output-deser-fn response-get-query-results-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-query-results :args (clojure.spec.alpha/tuple :portkey.aws.logs/get-query-results-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/get-query-results-response))

(clojure.core/defn describe-log-groups ([] (describe-log-groups {})) ([describe-log-groups-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-log-groups-request describe-log-groups-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec :portkey.aws.logs/describe-log-groups-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/describe-log-groups-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLogGroups", :http.request.configuration/output-deser-fn response-describe-log-groups-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef describe-log-groups :args (clojure.spec.alpha/? :portkey.aws.logs/describe-log-groups-request) :ret (clojure.spec.alpha/and :portkey.aws.logs/describe-log-groups-response))

(clojure.core/defn put-retention-policy ([put-retention-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-retention-policy-request put-retention-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/put-retention-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutRetentionPolicy", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef put-retention-policy :args (clojure.spec.alpha/tuple :portkey.aws.logs/put-retention-policy-request) :ret clojure.core/true?)

(clojure.core/defn associate-kms-key ([associate-kms-key-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-associate-kms-key-request associate-kms-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.logs/endpoints, :http.request.configuration/target-prefix "Logs_20140328", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-03-28", :http.request.configuration/service-id "CloudWatch Logs", :http.request.spec/input-spec :portkey.aws.logs/associate-kms-key-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateKmsKey", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.logs/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.logs/resource-not-found-exception, "OperationAbortedException" :portkey.aws.logs/operation-aborted-exception, "ServiceUnavailableException" :portkey.aws.logs/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef associate-kms-key :args (clojure.spec.alpha/tuple :portkey.aws.logs/associate-kms-key-request) :ret clojure.core/true?)
