(ns portkey.aws.sqs.-2012-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"fips-us-west-2"
   {:credential-scope {:service "sqs", :region "us-west-2"},
    :ssl-common-name "fips-us-west-2.queue.amazonaws.com",
    :endpoint "https://sqs-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "sqs", :region "ap-northeast-1"},
    :ssl-common-name "ap-northeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sqs", :region "eu-west-1"},
    :ssl-common-name "eu-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "fips-us-east-2"
   {:credential-scope {:service "sqs", :region "us-east-2"},
    :ssl-common-name "fips-us-east-2.queue.amazonaws.com",
    :endpoint "https://sqs-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "sqs", :region "us-east-2"},
    :ssl-common-name "us-east-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "sqs", :region "ap-southeast-2"},
    :ssl-common-name "ap-southeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "sqs", :region "cn-north-1"},
    :ssl-common-name "cn-north-1.queue.amazonaws.com.cn",
    :endpoint "https://sqs.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "sqs", :region "sa-east-1"},
    :ssl-common-name "sa-east-1.queue.amazonaws.com",
    :endpoint "https://sqs.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "sqs", :region "ap-southeast-1"},
    :ssl-common-name "ap-southeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "sqs", :region "cn-northwest-1"},
    :ssl-common-name "cn-northwest-1.queue.amazonaws.com.cn",
    :endpoint "https://sqs.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "sqs", :region "ap-northeast-2"},
    :ssl-common-name "ap-northeast-2.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "fips-us-west-1"
   {:credential-scope {:service "sqs", :region "us-west-1"},
    :ssl-common-name "fips-us-west-1.queue.amazonaws.com",
    :endpoint "https://sqs-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "sqs", :region "eu-west-3"},
    :ssl-common-name "eu-west-3.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "sqs", :region "ca-central-1"},
    :ssl-common-name "ca-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "sqs", :region "eu-central-1"},
    :ssl-common-name "eu-central-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "sqs", :region "eu-west-2"},
    :ssl-common-name "eu-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "sqs", :region "us-gov-west-1"},
    :ssl-common-name "us-gov-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "fips-us-east-1"
   {:credential-scope {:service "sqs", :region "us-east-1"},
    :ssl-common-name "fips-us-east-1.queue.amazonaws.com",
    :endpoint "https://sqs-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "sqs", :region "us-west-2"},
    :ssl-common-name "us-west-2.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "sqs", :region "us-east-1"},
    :ssl-common-name "queue.amazonaws.com",
    :endpoint "https://sqs.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "sqs", :region "us-west-1"},
    :ssl-common-name "us-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "sqs", :region "ap-south-1"},
    :ssl-common-name "ap-south-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-string-list)

(clojure.core/declare ser-aws-account-id-list)

(clojure.core/declare ser-send-message-batch-request-entry)

(clojure.core/declare ser-send-message-batch-request-entry-list)

(clojure.core/declare ser-message-attribute-name-list)

(clojure.core/declare ser-change-message-visibility-batch-request-entry-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-queue-attribute-name)

(clojure.core/declare ser-action-name-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-delete-message-batch-request-entry-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-binary-list)

(clojure.core/declare ser-message-attribute-value)

(clojure.core/declare ser-attribute-name-list)

(clojure.core/declare ser-tag-map)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-delete-message-batch-request-entry)

(clojure.core/declare ser-message-attribute-name)

(clojure.core/declare ser-binary)

(clojure.core/declare ser-queue-attribute-map)

(clojure.core/declare ser-change-message-visibility-batch-request-entry)

(clojure.core/declare ser-message-body-attribute-map)

(clojure.core/defn- ser-string-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String", :location-name "StringListValue"}))) input), :shape "StringList", :type "list"})

(clojure.core/defn- ser-aws-account-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String", :location-name "AWSAccountId"}))) input), :shape "AWSAccountIdList", :type "list", :flattened true})

(clojure.core/defn- ser-send-message-batch-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id input)) #:http.request.field{:name "Id", :shape "String"}) (clojure.core/into (ser-string (:message-body input)) #:http.request.field{:name "MessageBody", :shape "String"})], :shape "SendMessageBatchRequestEntry", :type "structure"} (clojure.core/contains? input :delay-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :delay-seconds)) #:http.request.field{:name "DelaySeconds", :shape "Integer"})) (clojure.core/contains? input :message-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-body-attribute-map (input :message-attributes)) #:http.request.field{:name "MessageAttributes", :shape "MessageBodyAttributeMap", :location-name "MessageAttribute"})) (clojure.core/contains? input :message-deduplication-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :message-deduplication-id)) #:http.request.field{:name "MessageDeduplicationId", :shape "String"})) (clojure.core/contains? input :message-group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :message-group-id)) #:http.request.field{:name "MessageGroupId", :shape "String"}))))

(clojure.core/defn- ser-send-message-batch-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-send-message-batch-request-entry coll) #:http.request.field{:shape "SendMessageBatchRequestEntry", :location-name "SendMessageBatchRequestEntry"}))) input), :shape "SendMessageBatchRequestEntryList", :type "list", :flattened true})

(clojure.core/defn- ser-message-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message-attribute-name coll) #:http.request.field{:shape "MessageAttributeName", :location-name "MessageAttributeName"}))) input), :shape "MessageAttributeNameList", :type "list", :flattened true})

(clojure.core/defn- ser-change-message-visibility-batch-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-change-message-visibility-batch-request-entry coll) #:http.request.field{:shape "ChangeMessageVisibilityBatchRequestEntry", :location-name "ChangeMessageVisibilityBatchRequestEntry"}))) input), :shape "ChangeMessageVisibilityBatchRequestEntryList", :type "list", :flattened true})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-queue-attribute-name [input] #:http.request.field{:value (clojure.core/get {"DelaySeconds" "DelaySeconds", "FifoQueue" "FifoQueue", :approximate-number-of-messages "ApproximateNumberOfMessages", "CreatedTimestamp" "CreatedTimestamp", :delay-seconds "DelaySeconds", :queue-arn "QueueArn", "ContentBasedDeduplication" "ContentBasedDeduplication", "RedrivePolicy" "RedrivePolicy", :last-modified-timestamp "LastModifiedTimestamp", :kms-data-key-reuse-period-seconds "KmsDataKeyReusePeriodSeconds", :maximum-message-size "MaximumMessageSize", :fifo-queue "FifoQueue", :all "All", "KmsDataKeyReusePeriodSeconds" "KmsDataKeyReusePeriodSeconds", "ApproximateNumberOfMessagesDelayed" "ApproximateNumberOfMessagesDelayed", :policy "Policy", :message-retention-period "MessageRetentionPeriod", :approximate-number-of-messages-delayed "ApproximateNumberOfMessagesDelayed", :visibility-timeout "VisibilityTimeout", "LastModifiedTimestamp" "LastModifiedTimestamp", "ApproximateNumberOfMessagesNotVisible" "ApproximateNumberOfMessagesNotVisible", "ApproximateNumberOfMessages" "ApproximateNumberOfMessages", "MessageRetentionPeriod" "MessageRetentionPeriod", "VisibilityTimeout" "VisibilityTimeout", :redrive-policy "RedrivePolicy", :created-timestamp "CreatedTimestamp", :receive-message-wait-time-seconds "ReceiveMessageWaitTimeSeconds", "Policy" "Policy", :approximate-number-of-messages-not-visible "ApproximateNumberOfMessagesNotVisible", "QueueArn" "QueueArn", :kms-master-key-id "KmsMasterKeyId", "All" "All", :content-based-deduplication "ContentBasedDeduplication", "MaximumMessageSize" "MaximumMessageSize", "ReceiveMessageWaitTimeSeconds" "ReceiveMessageWaitTimeSeconds", "KmsMasterKeyId" "KmsMasterKeyId"} input), :shape "QueueAttributeName"})

(clojure.core/defn- ser-action-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String", :location-name "ActionName"}))) input), :shape "ActionNameList", :type "list", :flattened true})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "TagKey"}))) input), :shape "TagKeyList", :type "list", :flattened true})

(clojure.core/defn- ser-delete-message-batch-request-entry-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-delete-message-batch-request-entry coll) #:http.request.field{:shape "DeleteMessageBatchRequestEntry", :location-name "DeleteMessageBatchRequestEntry"}))) input), :shape "DeleteMessageBatchRequestEntryList", :type "list", :flattened true})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-binary-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-binary coll) #:http.request.field{:shape "Binary", :location-name "BinaryListValue"}))) input), :shape "BinaryList", :type "list"})

(clojure.core/defn- ser-message-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:data-type input)) #:http.request.field{:name "DataType", :shape "String"})], :shape "MessageAttributeValue", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :string-value)) #:http.request.field{:name "StringValue", :shape "String"})) (clojure.core/contains? input :binary-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary (input :binary-value)) #:http.request.field{:name "BinaryValue", :shape "Binary"})) (clojure.core/contains? input :string-list-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-list (input :string-list-values)) #:http.request.field{:name "StringListValues", :shape "StringList", :flattened true, :location-name "StringListValue"})) (clojure.core/contains? input :binary-list-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-list (input :binary-list-values)) #:http.request.field{:name "BinaryListValues", :shape "BinaryList", :flattened true, :location-name "BinaryListValue"}))))

(clojure.core/defn- ser-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-queue-attribute-name coll) #:http.request.field{:shape "QueueAttributeName", :location-name "AttributeName"}))) input), :shape "AttributeNameList", :type "list", :flattened true})

(clojure.core/defn- ser-tag-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-tag-key k) #:http.request.field{:map-info "key", :shape "TagKey", :location-name "Key"}) (clojure.core/into (ser-tag-value v) #:http.request.field{:map-info "value", :shape "TagValue", :location-name "Value"})])) input), :shape "TagMap", :type "map", :flattened true, :location-name "Tag"})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-delete-message-batch-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id input)) #:http.request.field{:name "Id", :shape "String"}) (clojure.core/into (ser-string (:receipt-handle input)) #:http.request.field{:name "ReceiptHandle", :shape "String"})], :shape "DeleteMessageBatchRequestEntry", :type "structure"}))

(clojure.core/defn- ser-message-attribute-name [input] #:http.request.field{:value input, :shape "MessageAttributeName"})

(clojure.core/defn- ser-binary [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Binary"})

(clojure.core/defn- ser-queue-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-queue-attribute-name k) #:http.request.field{:map-info "key", :shape "QueueAttributeName", :location-name "Name"}) (clojure.core/into (ser-string v) #:http.request.field{:map-info "value", :shape "String", :location-name "Value"})])) input), :shape "QueueAttributeMap", :type "map", :flattened true, :location-name "Attribute"})

(clojure.core/defn- ser-change-message-visibility-batch-request-entry [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:id input)) #:http.request.field{:name "Id", :shape "String"}) (clojure.core/into (ser-string (:receipt-handle input)) #:http.request.field{:name "ReceiptHandle", :shape "String"})], :shape "ChangeMessageVisibilityBatchRequestEntry", :type "structure"} (clojure.core/contains? input :visibility-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :visibility-timeout)) #:http.request.field{:name "VisibilityTimeout", :shape "Integer"}))))

(clojure.core/defn- ser-message-body-attribute-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-string k) #:http.request.field{:map-info "key", :shape "String", :location-name "Name"}) (clojure.core/into (ser-message-attribute-value v) #:http.request.field{:map-info "value", :shape "MessageAttributeValue", :location-name "Value"})])) input), :shape "MessageBodyAttributeMap", :type "map", :flattened true})

(clojure.core/defn- req-untag-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-list-queues-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :queue-name-prefix) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue-name-prefix)) #:http.request.field{:name "QueueNamePrefix", :shape "String"}))))

(clojure.core/defn- req-delete-message-batch-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-delete-message-batch-request-entry-list (input :entries)) #:http.request.field{:name "Entries", :shape "DeleteMessageBatchRequestEntryList"})]}))

(clojure.core/defn- req-change-message-visibility-batch-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-change-message-visibility-batch-request-entry-list (input :entries)) #:http.request.field{:name "Entries", :shape "ChangeMessageVisibilityBatchRequestEntryList"})]}))

(clojure.core/defn- req-delete-message-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-string (input :receipt-handle)) #:http.request.field{:name "ReceiptHandle", :shape "String"})]}))

(clojure.core/defn- req-list-dead-letter-source-queues-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]}))

(clojure.core/defn- req-delete-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]}))

(clojure.core/defn- req-add-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-string (input :label)) #:http.request.field{:name "Label", :shape "String"}) (clojure.core/into (ser-aws-account-id-list (input :aws-account-ids)) #:http.request.field{:name "AWSAccountIds", :shape "AWSAccountIdList"}) (clojure.core/into (ser-action-name-list (input :actions)) #:http.request.field{:name "Actions", :shape "ActionNameList"})]}))

(clojure.core/defn- req-receive-message-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]} (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})) (clojure.core/contains? input :message-attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-attribute-name-list (input :message-attribute-names)) #:http.request.field{:name "MessageAttributeNames", :shape "MessageAttributeNameList"})) (clojure.core/contains? input :max-number-of-messages) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-number-of-messages)) #:http.request.field{:name "MaxNumberOfMessages", :shape "Integer"})) (clojure.core/contains? input :visibility-timeout) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :visibility-timeout)) #:http.request.field{:name "VisibilityTimeout", :shape "Integer"})) (clojure.core/contains? input :wait-time-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :wait-time-seconds)) #:http.request.field{:name "WaitTimeSeconds", :shape "Integer"})) (clojure.core/contains? input :receive-request-attempt-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :receive-request-attempt-id)) #:http.request.field{:name "ReceiveRequestAttemptId", :shape "String"}))))

(clojure.core/defn- req-list-queue-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]}))

(clojure.core/defn- req-change-message-visibility-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-string (input :receipt-handle)) #:http.request.field{:name "ReceiptHandle", :shape "String"}) (clojure.core/into (ser-integer (input :visibility-timeout)) #:http.request.field{:name "VisibilityTimeout", :shape "Integer"})]}))

(clojure.core/defn- req-get-queue-url-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-name)) #:http.request.field{:name "QueueName", :shape "String"})]} (clojure.core/contains? input :queue-owner-aws-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :queue-owner-aws-account-id)) #:http.request.field{:name "QueueOwnerAWSAccountId", :shape "String"}))))

(clojure.core/defn- req-remove-permission-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-string (input :label)) #:http.request.field{:name "Label", :shape "String"})]}))

(clojure.core/defn- req-send-message-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-string (input :message-body)) #:http.request.field{:name "MessageBody", :shape "String"})]} (clojure.core/contains? input :delay-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :delay-seconds)) #:http.request.field{:name "DelaySeconds", :shape "Integer"})) (clojure.core/contains? input :message-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-message-body-attribute-map (input :message-attributes)) #:http.request.field{:name "MessageAttributes", :shape "MessageBodyAttributeMap", :location-name "MessageAttribute"})) (clojure.core/contains? input :message-deduplication-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :message-deduplication-id)) #:http.request.field{:name "MessageDeduplicationId", :shape "String"})) (clojure.core/contains? input :message-group-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :message-group-id)) #:http.request.field{:name "MessageGroupId", :shape "String"}))))

(clojure.core/defn- req-get-queue-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]} (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"}))))

(clojure.core/defn- req-set-queue-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-queue-attribute-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "QueueAttributeMap", :location-name "Attribute"})]}))

(clojure.core/defn- req-create-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-name)) #:http.request.field{:name "QueueName", :shape "String"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-queue-attribute-map (input :attributes)) #:http.request.field{:name "Attributes", :shape "QueueAttributeMap", :location-name "Attribute"}))))

(clojure.core/defn- req-send-message-batch-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-send-message-batch-request-entry-list (input :entries)) #:http.request.field{:name "Entries", :shape "SendMessageBatchRequestEntryList"})]}))

(clojure.core/defn- req-tag-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"}) (clojure.core/into (ser-tag-map (input :tags)) #:http.request.field{:name "Tags", :shape "TagMap"})]}))

(clojure.core/defn- req-purge-queue-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :queue-url)) #:http.request.field{:name "QueueUrl", :shape "String"})]}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-not-inflight (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/unsupported-operation (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.untag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.untag-queue-request/tag-keys (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/untag-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.untag-queue-request/queue-url :portkey.aws.sqs.-2012-11-05.untag-queue-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/batch-result-error-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/string-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-system-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/message-system-attribute-name :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-result/messages (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receive-message-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.receive-message-result/messages]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/aws-account-id-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queues-request/queue-name-prefix (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queues-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queues-request/queue-name-prefix]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/purge-queue-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/successful :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-result-entry/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-request/queue-url :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/create-queue-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.create-queue-result/queue-url]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/id :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-body] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/delay-seconds :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-attributes :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-deduplication-id :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-group-id]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-id-format (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/message-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/empty-batch-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-result/queue-url]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queue-tags-result/tags (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queue-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queue-tags-result/tags]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-deleted-recently (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-result/queue-urls] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/queue-url :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/over-limit (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-system-attribute-name #{"SentTimestamp" :approximate-receive-count :sequence-number "SenderId" "SequenceNumber" :sent-timestamp "ApproximateReceiveCount" :message-deduplication-id "MessageGroupId" "ApproximateFirstReceiveTimestamp" :sender-id :message-group-id :approximate-first-receive-timestamp "MessageDeduplicationId"})

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-message-contents (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-request/queue-url :portkey.aws.sqs.-2012-11-05.delete-message-request/receipt-handle] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queues-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queues-result/queue-urls]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-result/successful :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-attribute-name #{"DelaySeconds" "FifoQueue" :approximate-number-of-messages "CreatedTimestamp" :delay-seconds :queue-arn "ContentBasedDeduplication" "RedrivePolicy" :last-modified-timestamp :kms-data-key-reuse-period-seconds :maximum-message-size :fifo-queue :all "KmsDataKeyReusePeriodSeconds" "ApproximateNumberOfMessagesDelayed" :policy :message-retention-period :approximate-number-of-messages-delayed :visibility-timeout "LastModifiedTimestamp" "ApproximateNumberOfMessagesNotVisible" "ApproximateNumberOfMessages" "MessageRetentionPeriod" "VisibilityTimeout" :redrive-policy :created-timestamp :receive-message-wait-time-seconds "Policy" :approximate-number-of-messages-not-visible "QueueArn" :kms-master-key-id "All" :content-based-deduplication "MaximumMessageSize" "ReceiveMessageWaitTimeSeconds" "KmsMasterKeyId"})

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/action-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-request-too-long (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-attribute-name (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-name-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-queue-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/aws-account-ids (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/aws-account-id-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/actions (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/action-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/add-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.add-permission-request/queue-url :portkey.aws.sqs.-2012-11-05.add-permission-request/label :portkey.aws.sqs.-2012-11-05.add-permission-request/aws-account-ids :portkey.aws.sqs.-2012-11-05.add-permission-request/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result/successful :portkey.aws.sqs.-2012-11-05.send-message-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/tag-key))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/md-5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-result/md-5-of-message-body :portkey.aws.sqs.-2012-11-05.send-message-result/md-5-of-message-attributes :portkey.aws.sqs.-2012-11-05.send-message-result/message-id :portkey.aws.sqs.-2012-11-05.send-message-result/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/message-attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/max-number-of-messages (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/wait-time-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/receive-request-attempt-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receive-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.receive-message-request/queue-url] :opt-un [:portkey.aws.sqs.-2012-11-05.receive-message-request/attribute-names :portkey.aws.sqs.-2012-11-05.receive-message-request/message-attribute-names :portkey.aws.sqs.-2012-11-05.receive-message-request/max-number-of-messages :portkey.aws.sqs.-2012-11-05.receive-message-request/visibility-timeout :portkey.aws.sqs.-2012-11-05.receive-message-request/wait-time-seconds :portkey.aws.sqs.-2012-11-05.receive-message-request/receive-request-attempt-id]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/binary-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/binary))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/binary))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/string-list-values (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-list-values (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/binary-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-value (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.message-attribute-value/data-type] :opt-un [:portkey.aws.sqs.-2012-11-05.message-attribute-value/string-value :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-value :portkey.aws.sqs.-2012-11-05.message-attribute-value/string-list-values :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-list-values]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/md-5-of-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-system-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.message/message-id :portkey.aws.sqs.-2012-11-05.message/receipt-handle :portkey.aws.sqs.-2012-11-05.message/md-5-of-body :portkey.aws.sqs.-2012-11-05.message/body :portkey.aws.sqs.-2012-11-05.message/attributes :portkey.aws.sqs.-2012-11-05.message/md-5-of-message-attributes :portkey.aws.sqs.-2012-11-05.message/message-attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/queue-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queue-tags-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queue-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.list-queue-tags-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-request/queue-url :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/receipt-handle :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/visibility-timeout] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-owner-aws-account-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-name] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-owner-aws-account-id]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/tag-key :portkey.aws.sqs.-2012-11-05/tag-value))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.remove-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.remove-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/remove-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.remove-permission-request/queue-url :portkey.aws.sqs.-2012-11-05.remove-permission-request/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result-entry/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md-5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/id :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/message-id :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md-5-of-message-body] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md-5-of-message-attributes :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-request/queue-url :portkey.aws.sqs.-2012-11-05.send-message-request/message-body] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-request/delay-seconds :portkey.aws.sqs.-2012-11-05.send-message-request/message-attributes :portkey.aws.sqs.-2012-11-05.send-message-request/message-deduplication-id :portkey.aws.sqs.-2012-11-05.send-message-request/message-group-id]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/queue-url] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/queue-url :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/message))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/id :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/receipt-handle] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-url-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/queue-attribute-name :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/id :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/receipt-handle] :opt-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/visibility-timeout]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/create-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.create-queue-request/queue-name] :opt-un [:portkey.aws.sqs.-2012-11-05.create-queue-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-body-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/string :portkey.aws.sqs.-2012-11-05/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/sender-fault (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/code (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/message (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-result-error-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.batch-result-error-entry/id :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/sender-fault :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/code] :opt-un [:portkey.aws.sqs.-2012-11-05.batch-result-error-entry/message]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request/queue-url :portkey.aws.sqs.-2012-11-05.send-message-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-result/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-result/attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.tag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.tag-queue-request/tags (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.tag-queue-request/queue-url :portkey.aws.sqs.-2012-11-05.tag-queue-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.purge-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/purge-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.-2012-11-05.purge-queue-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/boolean clojure.core/boolean?)

(clojure.core/defn receive-message ([receive-message-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-receive-message-request receive-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/receive-message-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/receive-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ReceiveMessage", :http.request.spec/error-spec {"OverLimit" :portkey.aws.sqs.-2012-11-05/over-limit}})))))
(clojure.spec.alpha/fdef receive-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/receive-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/receive-message-result))

(clojure.core/defn list-queues ([] (list-queues {})) ([list-queues-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-queues-request list-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/list-queues-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/list-queues-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQueues", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-queues :args (clojure.spec.alpha/? :portkey.aws.sqs.-2012-11-05/list-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-queues-result))

(clojure.core/defn list-dead-letter-source-queues ([list-dead-letter-source-queues-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-dead-letter-source-queues-request list-dead-letter-source-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDeadLetterSourceQueues", :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist}})))))
(clojure.spec.alpha/fdef list-dead-letter-source-queues :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result))

(clojure.core/defn set-queue-attributes ([set-queue-attributes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-queue-attributes-request set-queue-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetQueueAttributes", :http.request.spec/error-spec {"InvalidAttributeName" :portkey.aws.sqs.-2012-11-05/invalid-attribute-name}})))))
(clojure.spec.alpha/fdef set-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility-batch ([change-message-visibility-batch-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-change-message-visibility-batch-request change-message-visibility-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeMessageVisibilityBatch", :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id}})))))
(clojure.spec.alpha/fdef change-message-visibility-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result))

(clojure.core/defn tag-queue ([tag-queue-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-queue-request tag-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/tag-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "TagQueue", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef tag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/tag-queue-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-attributes ([get-queue-attributes-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-queue-attributes-request get-queue-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueueAttributes", :http.request.spec/error-spec {"InvalidAttributeName" :portkey.aws.sqs.-2012-11-05/invalid-attribute-name}})))))
(clojure.spec.alpha/fdef get-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result))

(clojure.core/defn untag-queue ([untag-queue-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-queue-request untag-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/untag-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UntagQueue", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef untag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/untag-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-queue ([delete-queue-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-queue-request delete-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/delete-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteQueue", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-message-batch ([delete-message-batch-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-message-batch-request delete-message-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/delete-message-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/delete-message-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMessageBatch", :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id}})))))
(clojure.spec.alpha/fdef delete-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-result))

(clojure.core/defn send-message-batch ([send-message-batch-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-message-batch-request send-message-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/send-message-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/send-message-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendMessageBatch", :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "BatchRequestTooLong" :portkey.aws.sqs.-2012-11-05/batch-request-too-long, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id, "UnsupportedOperation" :portkey.aws.sqs.-2012-11-05/unsupported-operation}})))))
(clojure.spec.alpha/fdef send-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/send-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-result))

(clojure.core/defn add-permission ([add-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-permission-request add-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/add-permission-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddPermission", :http.request.spec/error-spec {"OverLimit" :portkey.aws.sqs.-2012-11-05/over-limit}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/add-permission-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility ([change-message-visibility-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-change-message-visibility-request change-message-visibility-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/change-message-visibility-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ChangeMessageVisibility", :http.request.spec/error-spec {"MessageNotInflight" :portkey.aws.sqs.-2012-11-05/message-not-inflight, "ReceiptHandleIsInvalid" :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid}})))))
(clojure.spec.alpha/fdef change-message-visibility :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/change-message-visibility-request) :ret clojure.core/true?)

(clojure.core/defn delete-message ([delete-message-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-message-request delete-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/delete-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteMessage", :http.request.spec/error-spec {"InvalidIdFormat" :portkey.aws.sqs.-2012-11-05/invalid-id-format, "ReceiptHandleIsInvalid" :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid}})))))
(clojure.spec.alpha/fdef delete-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-message-request) :ret clojure.core/true?)

(clojure.core/defn send-message ([send-message-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-send-message-request send-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/send-message-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/send-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SendMessage", :http.request.spec/error-spec {"InvalidMessageContents" :portkey.aws.sqs.-2012-11-05/invalid-message-contents, "UnsupportedOperation" :portkey.aws.sqs.-2012-11-05/unsupported-operation}})))))
(clojure.spec.alpha/fdef send-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/send-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-result))

(clojure.core/defn create-queue ([create-queue-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-queue-request create-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/create-queue-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/create-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateQueue", :http.request.spec/error-spec {"QueueDeletedRecently" :portkey.aws.sqs.-2012-11-05/queue-deleted-recently, "QueueNameExists" :portkey.aws.sqs.-2012-11-05/queue-name-exists}})))))
(clojure.spec.alpha/fdef create-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/create-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/create-queue-result))

(clojure.core/defn purge-queue ([purge-queue-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-purge-queue-request purge-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/purge-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PurgeQueue", :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist, "PurgeQueueInProgress" :portkey.aws.sqs.-2012-11-05/purge-queue-in-progress}})))))
(clojure.spec.alpha/fdef purge-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/purge-queue-request) :ret clojure.core/true?)

(clojure.core/defn remove-permission ([remove-permission-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/remove-permission-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemovePermission", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-url ([get-queue-url-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-queue-url-request get-queue-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/get-queue-url-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/get-queue-url-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetQueueUrl", :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist}})))))
(clojure.spec.alpha/fdef get-queue-url :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/get-queue-url-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/get-queue-url-result))

(clojure.core/defn list-queue-tags ([list-queue-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-queue-tags-request list-queue-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.sqs.-2012-11-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs.-2012-11-05/list-queue-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs.-2012-11-05/list-queue-tags-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListQueueTags", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-queue-tags :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/list-queue-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-queue-tags-result))
