(ns portkey.aws.sqs (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "sqs", :region "us-gov-east-1"},
    :ssl-common-name "sqs.us-gov-east-1.amazonaws.com",
    :endpoint "https://sqs.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "fips-us-west-2"
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
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "sqs", :region "eu-north-1"},
    :ssl-common-name "eu-north-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-north-1.amazonaws.com",
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

(clojure.core/declare deser-batch-result-error-entry-list)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-message-system-attribute-map)

(clojure.core/declare deser-delete-message-batch-result-entry)

(clojure.core/declare deser-change-message-visibility-batch-result-entry-list)

(clojure.core/declare deser-delete-message-batch-result-entry-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-message-system-attribute-name)

(clojure.core/declare deser-queue-attribute-name)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-binary-list)

(clojure.core/declare deser-message-attribute-value)

(clojure.core/declare deser-message)

(clojure.core/declare deser-tag-map)

(clojure.core/declare deser-string)

(clojure.core/declare deser-send-message-batch-result-entry-list)

(clojure.core/declare deser-change-message-visibility-batch-result-entry)

(clojure.core/declare deser-send-message-batch-result-entry)

(clojure.core/declare deser-message-list)

(clojure.core/declare deser-binary)

(clojure.core/declare deser-queue-url-list)

(clojure.core/declare deser-queue-attribute-map)

(clojure.core/declare deser-message-body-attribute-map)

(clojure.core/declare deser-batch-result-error-entry)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-batch-result-error-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-result-error-entry (:content coll)))) input))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-message-system-attribute-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map :content)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-message-system-attribute-name k) (deser-string v)]))) input)))

(clojure.core/defn- deser-delete-message-batch-result-entry [input] (clojure.core/let [letvar1755881 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-string (clojure.core/get-in letvar1755881 ["Id" :content]))})))

(clojure.core/defn- deser-change-message-visibility-batch-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-change-message-visibility-batch-result-entry (:content coll)))) input))

(clojure.core/defn- deser-delete-message-batch-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-delete-message-batch-result-entry (:content coll)))) input))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-message-system-attribute-name [input] (clojure.core/get {"SenderId" :sender-id, "SentTimestamp" :sent-timestamp, "ApproximateReceiveCount" :approximate-receive-count, "ApproximateFirstReceiveTimestamp" :approximate-first-receive-timestamp, "SequenceNumber" :sequence-number, "MessageDeduplicationId" :message-deduplication-id, "MessageGroupId" :message-group-id} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-queue-attribute-name [input] (clojure.core/get {"DelaySeconds" :delay-seconds, "FifoQueue" :fifo-queue, "CreatedTimestamp" :created-timestamp, "ContentBasedDeduplication" :content-based-deduplication, "RedrivePolicy" :redrive-policy, "KmsDataKeyReusePeriodSeconds" :kms-data-key-reuse-period-seconds, "ApproximateNumberOfMessagesDelayed" :approximate-number-of-messages-delayed, "LastModifiedTimestamp" :last-modified-timestamp, "ApproximateNumberOfMessagesNotVisible" :approximate-number-of-messages-not-visible, "ApproximateNumberOfMessages" :approximate-number-of-messages, "MessageRetentionPeriod" :message-retention-period, "VisibilityTimeout" :visibility-timeout, "Policy" :policy, "QueueArn" :queue-arn, "All" :all, "MaximumMessageSize" :maximum-message-size, "ReceiveMessageWaitTimeSeconds" :receive-message-wait-time-seconds, "KmsMasterKeyId" :kms-master-key-id} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-binary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-binary coll))) input))

(clojure.core/defn- deser-message-attribute-value [input] (clojure.core/let [letvar1756060 {"StringValue" (portkey.aws/search-for-tag input "StringValue" :flattened? nil :xmlAttribute? nil), "BinaryValue" (portkey.aws/search-for-tag input "BinaryValue" :flattened? nil :xmlAttribute? nil), "StringListValue" (portkey.aws/search-for-tag input "StringListValue" :flattened? nil :xmlAttribute? nil), "BinaryListValue" (portkey.aws/search-for-tag input "BinaryListValue" :flattened? nil :xmlAttribute? nil), "DataType" (portkey.aws/search-for-tag input "DataType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:data-type (deser-string (clojure.core/get-in letvar1756060 ["DataType" :content]))} (letvar1756060 "StringValue") (clojure.core/assoc :string-value (deser-string (clojure.core/get-in letvar1756060 ["StringValue" :content]))) (letvar1756060 "BinaryValue") (clojure.core/assoc :binary-value (deser-binary (clojure.core/get-in letvar1756060 ["BinaryValue" :content]))) (letvar1756060 "StringListValue") (clojure.core/assoc :string-list-values (deser-string-list (clojure.core/get-in letvar1756060 ["StringListValue" :content]))) (letvar1756060 "BinaryListValue") (clojure.core/assoc :binary-list-values (deser-binary-list (clojure.core/get-in letvar1756060 ["BinaryListValue" :content]))))))

(clojure.core/defn- deser-message [input] (clojure.core/let [letvar1756168 {"MessageId" (portkey.aws/search-for-tag input "MessageId" :flattened? nil :xmlAttribute? nil), "ReceiptHandle" (portkey.aws/search-for-tag input "ReceiptHandle" :flattened? nil :xmlAttribute? nil), "MD5OfBody" (portkey.aws/search-for-tag input "MD5OfBody" :flattened? nil :xmlAttribute? nil), "Body" (portkey.aws/search-for-tag input "Body" :flattened? nil :xmlAttribute? nil), "Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? true :xmlAttribute? nil), "MD5OfMessageAttributes" (portkey.aws/search-for-tag input "MD5OfMessageAttributes" :flattened? nil :xmlAttribute? nil), "MessageAttribute" (portkey.aws/search-for-tag input "MessageAttribute" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1756168 "MessageId") (clojure.core/assoc :message-id (deser-string (clojure.core/get-in letvar1756168 ["MessageId" :content]))) (letvar1756168 "ReceiptHandle") (clojure.core/assoc :receipt-handle (deser-string (clojure.core/get-in letvar1756168 ["ReceiptHandle" :content]))) (letvar1756168 "MD5OfBody") (clojure.core/assoc :md-5-of-body (deser-string (clojure.core/get-in letvar1756168 ["MD5OfBody" :content]))) (letvar1756168 "Body") (clojure.core/assoc :body (deser-string (clojure.core/get-in letvar1756168 ["Body" :content]))) (letvar1756168 "Attribute") (clojure.core/assoc :attributes (deser-message-system-attribute-map (clojure.core/get-in letvar1756168 ["Attribute"]))) (letvar1756168 "MD5OfMessageAttributes") (clojure.core/assoc :md-5-of-message-attributes (deser-string (clojure.core/get-in letvar1756168 ["MD5OfMessageAttributes" :content]))) (letvar1756168 "MessageAttribute") (clojure.core/assoc :message-attributes (deser-message-body-attribute-map (clojure.core/get-in letvar1756168 ["MessageAttribute"]))))))

(clojure.core/defn- deser-tag-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map :content)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-tag-key k) (deser-tag-value v)]))) input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-send-message-batch-result-entry-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-send-message-batch-result-entry (:content coll)))) input))

(clojure.core/defn- deser-change-message-visibility-batch-result-entry [input] (clojure.core/let [letvar1756321 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-string (clojure.core/get-in letvar1756321 ["Id" :content]))})))

(clojure.core/defn- deser-send-message-batch-result-entry [input] (clojure.core/let [letvar1756429 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "MessageId" (portkey.aws/search-for-tag input "MessageId" :flattened? nil :xmlAttribute? nil), "MD5OfMessageBody" (portkey.aws/search-for-tag input "MD5OfMessageBody" :flattened? nil :xmlAttribute? nil), "MD5OfMessageAttributes" (portkey.aws/search-for-tag input "MD5OfMessageAttributes" :flattened? nil :xmlAttribute? nil), "SequenceNumber" (portkey.aws/search-for-tag input "SequenceNumber" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-string (clojure.core/get-in letvar1756429 ["Id" :content])), :message-id (deser-string (clojure.core/get-in letvar1756429 ["MessageId" :content])), :md-5-of-message-body (deser-string (clojure.core/get-in letvar1756429 ["MD5OfMessageBody" :content]))} (letvar1756429 "MD5OfMessageAttributes") (clojure.core/assoc :md-5-of-message-attributes (deser-string (clojure.core/get-in letvar1756429 ["MD5OfMessageAttributes" :content]))) (letvar1756429 "SequenceNumber") (clojure.core/assoc :sequence-number (deser-string (clojure.core/get-in letvar1756429 ["SequenceNumber" :content]))))))

(clojure.core/defn- deser-message-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-message (:content coll)))) input))

(clojure.core/defn- deser-binary [input] input)

(clojure.core/defn- deser-queue-url-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string (:content coll)))) input))

(clojure.core/defn- deser-queue-attribute-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map :content)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-queue-attribute-name k) (deser-string v)]))) input)))

(clojure.core/defn- deser-message-body-attribute-map [input] (clojure.core/let [x-flattened__21592__auto__ (clojure.core/map :content)] (clojure.core/into {} (clojure.core/comp x-flattened__21592__auto__ (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-message-attribute-value v)]))) input)))

(clojure.core/defn- deser-batch-result-error-entry [input] (clojure.core/let [letvar1756619 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "SenderFault" (portkey.aws/search-for-tag input "SenderFault" :flattened? nil :xmlAttribute? nil), "Code" (portkey.aws/search-for-tag input "Code" :flattened? nil :xmlAttribute? nil), "Message" (portkey.aws/search-for-tag input "Message" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deser-string (clojure.core/get-in letvar1756619 ["Id" :content])), :sender-fault (deser-boolean (clojure.core/get-in letvar1756619 ["SenderFault" :content])), :code (deser-string (clojure.core/get-in letvar1756619 ["Code" :content]))} (letvar1756619 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1756619 ["Message" :content]))))))

(clojure.core/defn- deser-boolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- response-message-not-inflight ([input] (response-message-not-inflight nil input)) ([resultWrapper1756623 input] (clojure.core/let [rawinput1756622 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756624 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-unsupported-operation ([input] (response-unsupported-operation nil input)) ([resultWrapper1756626 input] (clojure.core/let [rawinput1756625 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756627 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-receive-message-result ([input] (response-receive-message-result nil input)) ([resultWrapper1756629 input] (clojure.core/let [rawinput1756628 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756630 {"Message" (portkey.aws/search-for-tag rawinput1756628 "Message" :flattened? true :result-wrapper resultWrapper1756629)}] (clojure.core/cond-> {} (letvar1756630 "Message") (clojure.core/assoc :messages (deser-message-list (clojure.core/get-in letvar1756630 ["Message"])))))))

(clojure.core/defn- response-purge-queue-in-progress ([input] (response-purge-queue-in-progress nil input)) ([resultWrapper1756632 input] (clojure.core/let [rawinput1756631 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756633 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-change-message-visibility-batch-result ([input] (response-change-message-visibility-batch-result nil input)) ([resultWrapper1756635 input] (clojure.core/let [rawinput1756634 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756636 {"ChangeMessageVisibilityBatchResultEntry" (portkey.aws/search-for-tag rawinput1756634 "ChangeMessageVisibilityBatchResultEntry" :flattened? true :result-wrapper resultWrapper1756635), "BatchResultErrorEntry" (portkey.aws/search-for-tag rawinput1756634 "BatchResultErrorEntry" :flattened? true :result-wrapper resultWrapper1756635)}] (clojure.core/cond-> {:successful (deser-change-message-visibility-batch-result-entry-list (clojure.core/get-in letvar1756636 ["ChangeMessageVisibilityBatchResultEntry"])), :failed (deser-batch-result-error-entry-list (clojure.core/get-in letvar1756636 ["BatchResultErrorEntry"]))}))))

(clojure.core/defn- response-create-queue-result ([input] (response-create-queue-result nil input)) ([resultWrapper1756638 input] (clojure.core/let [rawinput1756637 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756639 {"QueueUrl" (portkey.aws/search-for-tag rawinput1756637 "QueueUrl" :flattened? nil :result-wrapper resultWrapper1756638)}] (clojure.core/cond-> {} (letvar1756639 "QueueUrl") (clojure.core/assoc :queue-url (deser-string (clojure.core/get-in letvar1756639 ["QueueUrl" :content])))))))

(clojure.core/defn- response-invalid-id-format ([input] (response-invalid-id-format nil input)) ([resultWrapper1756641 input] (clojure.core/let [rawinput1756640 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756642 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-empty-batch-request ([input] (response-empty-batch-request nil input)) ([resultWrapper1756644 input] (clojure.core/let [rawinput1756643 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756645 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-queue-url-result ([input] (response-get-queue-url-result nil input)) ([resultWrapper1756647 input] (clojure.core/let [rawinput1756646 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756648 {"QueueUrl" (portkey.aws/search-for-tag rawinput1756646 "QueueUrl" :flattened? nil :result-wrapper resultWrapper1756647)}] (clojure.core/cond-> {} (letvar1756648 "QueueUrl") (clojure.core/assoc :queue-url (deser-string (clojure.core/get-in letvar1756648 ["QueueUrl" :content])))))))

(clojure.core/defn- response-list-queue-tags-result ([input] (response-list-queue-tags-result nil input)) ([resultWrapper1756650 input] (clojure.core/let [rawinput1756649 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756651 {"Tag" (portkey.aws/search-for-tag rawinput1756649 "Tag" :flattened? true :result-wrapper resultWrapper1756650)}] (clojure.core/cond-> {} (letvar1756651 "Tag") (clojure.core/assoc :tags (deser-tag-map (clojure.core/get-in letvar1756651 ["Tag"])))))))

(clojure.core/defn- response-queue-deleted-recently ([input] (response-queue-deleted-recently nil input)) ([resultWrapper1756653 input] (clojure.core/let [rawinput1756652 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756654 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-dead-letter-source-queues-result ([input] (response-list-dead-letter-source-queues-result nil input)) ([resultWrapper1756656 input] (clojure.core/let [rawinput1756655 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756657 {"QueueUrl" (portkey.aws/search-for-tag rawinput1756655 "QueueUrl" :flattened? true :result-wrapper resultWrapper1756656)}] (clojure.core/cond-> {:queue-urls (deser-queue-url-list (clojure.core/get-in letvar1756657 ["QueueUrl"]))}))))

(clojure.core/defn- response-over-limit ([input] (response-over-limit nil input)) ([resultWrapper1756659 input] (clojure.core/let [rawinput1756658 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756660 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-message-contents ([input] (response-invalid-message-contents nil input)) ([resultWrapper1756662 input] (clojure.core/let [rawinput1756661 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756663 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-queue-does-not-exist ([input] (response-queue-does-not-exist nil input)) ([resultWrapper1756665 input] (clojure.core/let [rawinput1756664 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756666 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-entries-in-batch-request ([input] (response-too-many-entries-in-batch-request nil input)) ([resultWrapper1756668 input] (clojure.core/let [rawinput1756667 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756669 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-queues-result ([input] (response-list-queues-result nil input)) ([resultWrapper1756671 input] (clojure.core/let [rawinput1756670 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756672 {"QueueUrl" (portkey.aws/search-for-tag rawinput1756670 "QueueUrl" :flattened? true :result-wrapper resultWrapper1756671)}] (clojure.core/cond-> {} (letvar1756672 "QueueUrl") (clojure.core/assoc :queue-urls (deser-queue-url-list (clojure.core/get-in letvar1756672 ["QueueUrl"])))))))

(clojure.core/defn- response-delete-message-batch-result ([input] (response-delete-message-batch-result nil input)) ([resultWrapper1756674 input] (clojure.core/let [rawinput1756673 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756675 {"DeleteMessageBatchResultEntry" (portkey.aws/search-for-tag rawinput1756673 "DeleteMessageBatchResultEntry" :flattened? true :result-wrapper resultWrapper1756674), "BatchResultErrorEntry" (portkey.aws/search-for-tag rawinput1756673 "BatchResultErrorEntry" :flattened? true :result-wrapper resultWrapper1756674)}] (clojure.core/cond-> {:successful (deser-delete-message-batch-result-entry-list (clojure.core/get-in letvar1756675 ["DeleteMessageBatchResultEntry"])), :failed (deser-batch-result-error-entry-list (clojure.core/get-in letvar1756675 ["BatchResultErrorEntry"]))}))))

(clojure.core/defn- response-batch-request-too-long ([input] (response-batch-request-too-long nil input)) ([resultWrapper1756677 input] (clojure.core/let [rawinput1756676 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756678 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-attribute-name ([input] (response-invalid-attribute-name nil input)) ([resultWrapper1756680 input] (clojure.core/let [rawinput1756679 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756681 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-queue-name-exists ([input] (response-queue-name-exists nil input)) ([resultWrapper1756683 input] (clojure.core/let [rawinput1756682 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756684 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-message-batch-result ([input] (response-send-message-batch-result nil input)) ([resultWrapper1756686 input] (clojure.core/let [rawinput1756685 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756687 {"SendMessageBatchResultEntry" (portkey.aws/search-for-tag rawinput1756685 "SendMessageBatchResultEntry" :flattened? true :result-wrapper resultWrapper1756686), "BatchResultErrorEntry" (portkey.aws/search-for-tag rawinput1756685 "BatchResultErrorEntry" :flattened? true :result-wrapper resultWrapper1756686)}] (clojure.core/cond-> {:successful (deser-send-message-batch-result-entry-list (clojure.core/get-in letvar1756687 ["SendMessageBatchResultEntry"])), :failed (deser-batch-result-error-entry-list (clojure.core/get-in letvar1756687 ["BatchResultErrorEntry"]))}))))

(clojure.core/defn- response-send-message-result ([input] (response-send-message-result nil input)) ([resultWrapper1756689 input] (clojure.core/let [rawinput1756688 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756690 {"MD5OfMessageBody" (portkey.aws/search-for-tag rawinput1756688 "MD5OfMessageBody" :flattened? nil :result-wrapper resultWrapper1756689), "MD5OfMessageAttributes" (portkey.aws/search-for-tag rawinput1756688 "MD5OfMessageAttributes" :flattened? nil :result-wrapper resultWrapper1756689), "MessageId" (portkey.aws/search-for-tag rawinput1756688 "MessageId" :flattened? nil :result-wrapper resultWrapper1756689), "SequenceNumber" (portkey.aws/search-for-tag rawinput1756688 "SequenceNumber" :flattened? nil :result-wrapper resultWrapper1756689)}] (clojure.core/cond-> {} (letvar1756690 "MD5OfMessageBody") (clojure.core/assoc :md-5-of-message-body (deser-string (clojure.core/get-in letvar1756690 ["MD5OfMessageBody" :content]))) (letvar1756690 "MD5OfMessageAttributes") (clojure.core/assoc :md-5-of-message-attributes (deser-string (clojure.core/get-in letvar1756690 ["MD5OfMessageAttributes" :content]))) (letvar1756690 "MessageId") (clojure.core/assoc :message-id (deser-string (clojure.core/get-in letvar1756690 ["MessageId" :content]))) (letvar1756690 "SequenceNumber") (clojure.core/assoc :sequence-number (deser-string (clojure.core/get-in letvar1756690 ["SequenceNumber" :content])))))))

(clojure.core/defn- response-invalid-batch-entry-id ([input] (response-invalid-batch-entry-id nil input)) ([resultWrapper1756692 input] (clojure.core/let [rawinput1756691 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756693 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-entry-ids-not-distinct ([input] (response-batch-entry-ids-not-distinct nil input)) ([resultWrapper1756695 input] (clojure.core/let [rawinput1756694 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756696 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-receipt-handle-is-invalid ([input] (response-receipt-handle-is-invalid nil input)) ([resultWrapper1756698 input] (clojure.core/let [rawinput1756697 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756699 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-queue-attributes-result ([input] (response-get-queue-attributes-result nil input)) ([resultWrapper1756701 input] (clojure.core/let [rawinput1756700 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1756702 {"Attribute" (portkey.aws/search-for-tag rawinput1756700 "Attribute" :flattened? true :result-wrapper resultWrapper1756701)}] (clojure.core/cond-> {} (letvar1756702 "Attribute") (clojure.core/assoc :attributes (deser-queue-attribute-map (clojure.core/get-in letvar1756702 ["Attribute"])))))))

(clojure.spec.alpha/def :portkey.aws.sqs/message-not-inflight (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/unsupported-operation (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.untag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.untag-queue-request/tag-keys (clojure.spec.alpha/and :portkey.aws.sqs/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sqs/untag-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.untag-queue-request/queue-url :portkey.aws.sqs.untag-queue-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/batch-result-error-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/batch-result-error-entry))

(clojure.spec.alpha/def :portkey.aws.sqs/string-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs/message-system-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs/message-system-attribute-name :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-result/messages (clojure.spec.alpha/and :portkey.aws.sqs/message-list))
(clojure.spec.alpha/def :portkey.aws.sqs/receive-message-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.receive-message-result/messages]))

(clojure.spec.alpha/def :portkey.aws.sqs/aws-account-id-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs.list-queues-request/queue-name-prefix (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/list-queues-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.list-queues-request/queue-name-prefix]))

(clojure.spec.alpha/def :portkey.aws.sqs/purge-queue-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs/change-message-visibility-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.change-message-visibility-batch-result/successful :portkey.aws.sqs.change-message-visibility-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-message-batch-result-entry/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs/delete-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-message-batch-request/queue-url :portkey.aws.sqs.delete-message-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.create-queue-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/create-queue-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.create-queue-result/queue-url]))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/message-body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request-entry/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.send-message-batch-request-entry/id :portkey.aws.sqs.send-message-batch-request-entry/message-body] :opt-un [:portkey.aws.sqs.send-message-batch-request-entry/delay-seconds :portkey.aws.sqs.send-message-batch-request-entry/message-attributes :portkey.aws.sqs.send-message-batch-request-entry/message-deduplication-id :portkey.aws.sqs.send-message-batch-request-entry/message-group-id]))

(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/send-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs/invalid-id-format (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/message-attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/message-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs/empty-batch-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-url-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/get-queue-url-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.get-queue-url-result/queue-url]))

(clojure.spec.alpha/def :portkey.aws.sqs.list-queue-tags-result/tags (clojure.spec.alpha/and :portkey.aws.sqs/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs/list-queue-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.list-queue-tags-result/tags]))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-deleted-recently (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/change-message-visibility-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/delete-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.list-dead-letter-source-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs/list-dead-letter-source-queues-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.list-dead-letter-source-queues-result/queue-urls] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs/change-message-visibility-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.change-message-visibility-batch-request/queue-url :portkey.aws.sqs.change-message-visibility-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/change-message-visibility-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs/over-limit (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs/message-system-attribute-name #{"SentTimestamp" :approximate-receive-count :sequence-number "SenderId" "SequenceNumber" :sent-timestamp "ApproximateReceiveCount" :message-deduplication-id "MessageGroupId" "ApproximateFirstReceiveTimestamp" :sender-id :message-group-id :approximate-first-receive-timestamp "MessageDeduplicationId"})

(clojure.spec.alpha/def :portkey.aws.sqs/invalid-message-contents (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-message-request/queue-url :portkey.aws.sqs.delete-message-request/receipt-handle] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/too-many-entries-in-batch-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.list-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs/list-queues-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.list-queues-result/queue-urls]))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs/delete-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-message-batch-result/successful :portkey.aws.sqs.delete-message-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-attribute-name #{"DelaySeconds" "FifoQueue" :approximate-number-of-messages "CreatedTimestamp" :delay-seconds :queue-arn "ContentBasedDeduplication" "RedrivePolicy" :last-modified-timestamp :kms-data-key-reuse-period-seconds :maximum-message-size :fifo-queue :all "KmsDataKeyReusePeriodSeconds" "ApproximateNumberOfMessagesDelayed" :policy :message-retention-period :approximate-number-of-messages-delayed :visibility-timeout "LastModifiedTimestamp" "ApproximateNumberOfMessagesNotVisible" "ApproximateNumberOfMessages" "MessageRetentionPeriod" "VisibilityTimeout" :redrive-policy :created-timestamp :receive-message-wait-time-seconds "Policy" :approximate-number-of-messages-not-visible "QueueArn" :kms-master-key-id "All" :content-based-deduplication "MaximumMessageSize" "ReceiveMessageWaitTimeSeconds" "KmsMasterKeyId"})

(clojure.spec.alpha/def :portkey.aws.sqs/action-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs/batch-request-too-long (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.list-dead-letter-source-queues-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/list-dead-letter-source-queues-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.list-dead-letter-source-queues-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/invalid-attribute-name (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-name-exists (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-queue-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.add-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.add-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.add-permission-request/aws-account-ids (clojure.spec.alpha/and :portkey.aws.sqs/aws-account-id-list))
(clojure.spec.alpha/def :portkey.aws.sqs.add-permission-request/actions (clojure.spec.alpha/and :portkey.aws.sqs/action-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs/add-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.add-permission-request/queue-url :portkey.aws.sqs.add-permission-request/label :portkey.aws.sqs.add-permission-request/aws-account-ids :portkey.aws.sqs.add-permission-request/actions] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs/send-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-result (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.send-message-batch-result/successful :portkey.aws.sqs.send-message-batch-result/failed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/tag-key))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-result/md-5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-result/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-result/message-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-result/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.send-message-result/md-5-of-message-body :portkey.aws.sqs.send-message-result/md-5-of-message-attributes :portkey.aws.sqs.send-message-result/message-id :portkey.aws.sqs.send-message-result/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/delete-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/message-attribute-names (clojure.spec.alpha/and :portkey.aws.sqs/message-attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/max-number-of-messages (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/wait-time-seconds (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.receive-message-request/receive-request-attempt-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/receive-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.receive-message-request/queue-url] :opt-un [:portkey.aws.sqs.receive-message-request/attribute-names :portkey.aws.sqs.receive-message-request/message-attribute-names :portkey.aws.sqs.receive-message-request/max-number-of-messages :portkey.aws.sqs.receive-message-request/visibility-timeout :portkey.aws.sqs.receive-message-request/wait-time-seconds :portkey.aws.sqs.receive-message-request/receive-request-attempt-id]))

(clojure.spec.alpha/def :portkey.aws.sqs/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs/binary-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/binary))

(clojure.spec.alpha/def :portkey.aws.sqs.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sqs/binary))
(clojure.spec.alpha/def :portkey.aws.sqs.message-attribute-value/string-list-values (clojure.spec.alpha/and :portkey.aws.sqs/string-list))
(clojure.spec.alpha/def :portkey.aws.sqs.message-attribute-value/binary-list-values (clojure.spec.alpha/and :portkey.aws.sqs/binary-list))
(clojure.spec.alpha/def :portkey.aws.sqs.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/message-attribute-value (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.message-attribute-value/data-type] :opt-un [:portkey.aws.sqs.message-attribute-value/string-value :portkey.aws.sqs.message-attribute-value/binary-value :portkey.aws.sqs.message-attribute-value/string-list-values :portkey.aws.sqs.message-attribute-value/binary-list-values]))

(clojure.spec.alpha/def :portkey.aws.sqs.message/message-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message/md-5-of-body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message/body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message/attributes (clojure.spec.alpha/and :portkey.aws.sqs/message-system-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.message/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.message/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs/message (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.message/message-id :portkey.aws.sqs.message/receipt-handle :portkey.aws.sqs.message/md-5-of-body :portkey.aws.sqs.message/body :portkey.aws.sqs.message/attributes :portkey.aws.sqs.message/md-5-of-message-attributes :portkey.aws.sqs.message/message-attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/queue-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs.list-queue-tags-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/list-queue-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.list-queue-tags-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.change-message-visibility-request/queue-url :portkey.aws.sqs.change-message-visibility-request/receipt-handle :portkey.aws.sqs.change-message-visibility-request/visibility-timeout] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-url-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-url-request/queue-owner-aws-account-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/get-queue-url-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.get-queue-url-request/queue-name] :opt-un [:portkey.aws.sqs.get-queue-url-request/queue-owner-aws-account-id]))

(clojure.spec.alpha/def :portkey.aws.sqs/tag-map (clojure.spec.alpha/map-of :portkey.aws.sqs/tag-key :portkey.aws.sqs/tag-value))

(clojure.spec.alpha/def :portkey.aws.sqs/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sqs/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.remove-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.remove-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/remove-permission-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.remove-permission-request/queue-url :portkey.aws.sqs.remove-permission-request/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/send-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs/invalid-batch-entry-id (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.change-message-visibility-batch-result-entry/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result-entry/message-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result-entry/md-5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result-entry/md-5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-result-entry/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-result-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.send-message-batch-result-entry/id :portkey.aws.sqs.send-message-batch-result-entry/message-id :portkey.aws.sqs.send-message-batch-result-entry/md-5-of-message-body] :opt-un [:portkey.aws.sqs.send-message-batch-result-entry/md-5-of-message-attributes :portkey.aws.sqs.send-message-batch-result-entry/sequence-number]))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/message-body (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-request/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.send-message-request/queue-url :portkey.aws.sqs.send-message-request/message-body] :opt-un [:portkey.aws.sqs.send-message-request/delay-seconds :portkey.aws.sqs.send-message-request/message-attributes :portkey.aws.sqs.send-message-request/message-deduplication-id :portkey.aws.sqs.send-message-request/message-group-id]))

(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs/get-queue-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.get-queue-attributes-request/queue-url] :opt-un [:portkey.aws.sqs.get-queue-attributes-request/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.sqs.set-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.set-queue-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs/set-queue-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.set-queue-attributes-request/queue-url :portkey.aws.sqs.set-queue-attributes-request/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/batch-entry-ids-not-distinct (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/message-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/message))

(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.delete-message-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/delete-message-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.delete-message-batch-request-entry/id :portkey.aws.sqs.delete-message-batch-request-entry/receipt-handle] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/message-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sqs/receipt-handle-is-invalid (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-url-list (clojure.spec.alpha/coll-of :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs/queue-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs/queue-attribute-name :portkey.aws.sqs/string))

(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.change-message-visibility-batch-request-entry/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs/integer))
(clojure.spec.alpha/def :portkey.aws.sqs/change-message-visibility-batch-request-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.change-message-visibility-batch-request-entry/id :portkey.aws.sqs.change-message-visibility-batch-request-entry/receipt-handle] :opt-un [:portkey.aws.sqs.change-message-visibility-batch-request-entry/visibility-timeout]))

(clojure.spec.alpha/def :portkey.aws.sqs.create-queue-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.create-queue-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs/create-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.create-queue-request/queue-name] :opt-un [:portkey.aws.sqs.create-queue-request/attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs/message-body-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs/string :portkey.aws.sqs/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sqs.batch-result-error-entry/id (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.batch-result-error-entry/sender-fault (clojure.spec.alpha/and :portkey.aws.sqs/boolean))
(clojure.spec.alpha/def :portkey.aws.sqs.batch-result-error-entry/code (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.batch-result-error-entry/message (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/batch-result-error-entry (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.batch-result-error-entry/id :portkey.aws.sqs.batch-result-error-entry/sender-fault :portkey.aws.sqs.batch-result-error-entry/code] :opt-un [:portkey.aws.sqs.batch-result-error-entry/message]))

(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.send-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs/send-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs/send-message-batch-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.send-message-batch-request/queue-url :portkey.aws.sqs.send-message-batch-request/entries] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.get-queue-attributes-result/attributes (clojure.spec.alpha/and :portkey.aws.sqs/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs/get-queue-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sqs.get-queue-attributes-result/attributes]))

(clojure.spec.alpha/def :portkey.aws.sqs.tag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs.tag-queue-request/tags (clojure.spec.alpha/and :portkey.aws.sqs/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs/tag-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.tag-queue-request/queue-url :portkey.aws.sqs.tag-queue-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs.purge-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs/string))
(clojure.spec.alpha/def :portkey.aws.sqs/purge-queue-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sqs.purge-queue-request/queue-url] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sqs/boolean clojure.core/boolean?)

(clojure.core/defn receive-message "Retrieves one or more messages (up to 10), from the specified queue. Using the\nWaitTimeSeconds parameter enables long-poll support. For more information, see\nAmazon SQS Long Polling\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html)\nin the Amazon Simple Queue Service Developer Guide.\n Short poll is the default behavior where a weighted random set of machines is\nsampled on a ReceiveMessage call. Thus, only the messages on the sampled\nmachines are returned. If the number of messages in the queue is small (fewer\nthan 1,000), you most likely get fewer messages than you requested per\nReceiveMessage call. If the number of messages in the queue is extremely small,\nyou might not receive any messages in a particular ReceiveMessage response. If\nthis happens, repeat the request.\n For each message returned, the response includes the following:\n * The message body.\n * An MD5 digest of the message body. For information about MD5, see RFC1321\n(https://www.ietf.org/rfc/rfc1321.txt).\n * The MessageId you received when you sent the message to the queue.\n * The receipt handle.\n * The message attributes.\n * An MD5 digest of the message attributes.\n The receipt handle is the identifier you must provide when deleting the\nmessage. For more information, see Queue and Message Identifiers\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html)\nin the Amazon Simple Queue Service Developer Guide.\n You can provide the VisibilityTimeout parameter in your request. The parameter\nis applied to the messages that Amazon SQS returns in the response. If you don't\ninclude the parameter, the overall visibility timeout for the queue is used for\nthe returned messages. For more information, see Visibility Timeout\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)\nin the Amazon Simple Queue Service Developer Guide.\n A message that isn't deleted or a message whose visibility isn't extended\nbefore the visibility timeout expires counts as a failed receive. Depending on\nthe configuration of the queue, the message might be sent to the dead-letter\nqueue.\n In the future, new attributes might be added. If you write code that calls this\naction, we recommend that you structure your code so that it can handle new\nattributes gracefully." ([receive-message-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-receive-message-request receive-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/receive-message-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/receive-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ReceiveMessageResult", :http.request.configuration/action "ReceiveMessage", :http.request.configuration/output-deser-fn response-receive-message-result, :http.request.spec/error-spec {"OverLimit" :portkey.aws.sqs/over-limit}})))))
(clojure.spec.alpha/fdef receive-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs/receive-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/receive-message-result))

(clojure.core/defn list-queues "Returns a list of your queues. The maximum number of queues that can be returned\nis 1,000. If you specify a value for the optional QueueNamePrefix parameter,\nonly queues with a name that begins with the specified value are returned.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([] (list-queues {})) ([list-queues-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-queues-request list-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/list-queues-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/list-queues-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListQueuesResult", :http.request.configuration/action "ListQueues", :http.request.configuration/output-deser-fn response-list-queues-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-queues :args (clojure.spec.alpha/? :portkey.aws.sqs/list-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/list-queues-result))

(clojure.core/defn list-dead-letter-source-queues "Returns a list of your queues that have the RedrivePolicy queue attribute\nconfigured with a dead-letter queue.\n For more information about using dead-letter queues, see Using Amazon SQS\nDead-Letter Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)\nin the Amazon Simple Queue Service Developer Guide." ([list-dead-letter-source-queues-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-dead-letter-source-queues-request list-dead-letter-source-queues-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/list-dead-letter-source-queues-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/list-dead-letter-source-queues-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDeadLetterSourceQueuesResult", :http.request.configuration/action "ListDeadLetterSourceQueues", :http.request.configuration/output-deser-fn response-list-dead-letter-source-queues-result, :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs/queue-does-not-exist}})))))
(clojure.spec.alpha/fdef list-dead-letter-source-queues :args (clojure.spec.alpha/tuple :portkey.aws.sqs/list-dead-letter-source-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/list-dead-letter-source-queues-result))

(clojure.core/defn set-queue-attributes "Sets the value of one or more queue attributes. When you change a queue's\nattributes, the change can take up to 60 seconds for most of the attributes to\npropagate throughout the Amazon SQS system. Changes made to the\nMessageRetentionPeriod attribute can take up to 15 minutes.\n In the future, new attributes might be added. If you write code that calls this\naction, we recommend that you structure your code so that it can handle new\nattributes gracefully.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([set-queue-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-queue-attributes-request set-queue-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/set-queue-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetQueueAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidAttributeName" :portkey.aws.sqs/invalid-attribute-name}})))))
(clojure.spec.alpha/fdef set-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs/set-queue-attributes-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility-batch "Changes the visibility timeout of multiple messages. This is a batch version of\nChangeMessageVisibility. The result of the action on each message is reported\nindividually in the response. You can send up to 10 ChangeMessageVisibility\nrequests with each ChangeMessageVisibilityBatch action.\n Because the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second" ([change-message-visibility-batch-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-change-message-visibility-batch-request change-message-visibility-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/change-message-visibility-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/change-message-visibility-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ChangeMessageVisibilityBatchResult", :http.request.configuration/action "ChangeMessageVisibilityBatch", :http.request.configuration/output-deser-fn response-change-message-visibility-batch-result, :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs/invalid-batch-entry-id}})))))
(clojure.spec.alpha/fdef change-message-visibility-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs/change-message-visibility-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/change-message-visibility-batch-result))

(clojure.core/defn tag-queue "Add cost allocation tags to the specified Amazon SQS queue. For an overview, see\nTagging Your Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues)\nin the Amazon Simple Queue Service Developer Guide.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([tag-queue-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-queue-request tag-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/tag-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagQueue", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef tag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs/tag-queue-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-attributes "Gets attributes for the specified queue.\n To determine whether a queue is FIFO\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html),\nyou can check whether QueueName ends with the .fifo suffix.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second" ([get-queue-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-queue-attributes-request get-queue-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/get-queue-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/get-queue-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetQueueAttributesResult", :http.request.configuration/action "GetQueueAttributes", :http.request.configuration/output-deser-fn response-get-queue-attributes-result, :http.request.spec/error-spec {"InvalidAttributeName" :portkey.aws.sqs/invalid-attribute-name}})))))
(clojure.spec.alpha/fdef get-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs/get-queue-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/get-queue-attributes-result))

(clojure.core/defn untag-queue "Remove cost allocation tags from the specified Amazon SQS queue. For an\noverview, see Tagging Your Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues)\nin the Amazon Simple Queue Service Developer Guide.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([untag-queue-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-queue-request untag-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/untag-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagQueue", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef untag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs/untag-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-queue "Deletes the queue specified by the QueueUrl, regardless of the queue's contents.\nIf the specified queue doesn't exist, Amazon SQS returns a successful response.\n Be careful with the DeleteQueue action: When you delete a queue, any messages\nin the queue are no longer available.\n When you delete a queue, the deletion process takes up to 60 seconds. Requests\nyou send involving that queue during the 60 seconds might succeed. For example,\na SendMessage request might succeed, but after 60 seconds the queue and the\nmessage you sent no longer exist.\n When you delete a queue, you must wait at least 60 seconds before creating a\nqueue with the same name.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([delete-queue-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-queue-request delete-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/delete-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteQueue", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs/delete-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-message-batch "Deletes up to ten messages from the specified queue. This is a batch version of\nDeleteMessage. The result of the action on each message is reported individually\nin the response.\n Because the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second" ([delete-message-batch-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-message-batch-request delete-message-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/delete-message-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/delete-message-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DeleteMessageBatchResult", :http.request.configuration/action "DeleteMessageBatch", :http.request.configuration/output-deser-fn response-delete-message-batch-result, :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs/invalid-batch-entry-id}})))))
(clojure.spec.alpha/fdef delete-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs/delete-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/delete-message-batch-result))

(clojure.core/defn send-message-batch "Delivers up to ten messages to the specified queue. This is a batch version of\nSendMessage. For a FIFO queue, multiple messages within a single batch are\nenqueued in the order they are sent.\n The result of sending each message is reported individually in the response.\nBecause the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n The maximum allowed individual message size and the maximum total payload size\n(the sum of the individual lengths of all of the batched messages) are both 256\nKB (262,144 bytes).\n A message can include only XML, JSON, and unformatted text. The following\nUnicode characters are allowed:\n #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF\n Any characters not included in this list will be rejected. For more\ninformation, see the W3C specification for characters\n(http://www.w3.org/TR/REC-xml/#charsets).\n If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses\nthe default value for the queue.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second" ([send-message-batch-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-message-batch-request send-message-batch-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/send-message-batch-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/send-message-batch-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendMessageBatchResult", :http.request.configuration/action "SendMessageBatch", :http.request.configuration/output-deser-fn response-send-message-batch-result, :http.request.spec/error-spec {"TooManyEntriesInBatchRequest" :portkey.aws.sqs/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs/batch-entry-ids-not-distinct, "BatchRequestTooLong" :portkey.aws.sqs/batch-request-too-long, "InvalidBatchEntryId" :portkey.aws.sqs/invalid-batch-entry-id, "UnsupportedOperation" :portkey.aws.sqs/unsupported-operation}})))))
(clojure.spec.alpha/fdef send-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs/send-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/send-message-batch-result))

(clojure.core/defn add-permission "Adds a permission to a queue for a specific principal\n(http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P). This allows\nsharing access to the queue.\n When you create a queue, you have full control access rights for the queue.\nOnly you, the owner of the queue, can grant or deny permissions to the queue.\nFor more information about these permissions, see Allow Developers to Write\nMessages to a Shared Queue\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-writing-an-sqs-policy.html#write-messages-to-shared-queue)\nin the Amazon Simple Queue Service Developer Guide.\n AddPermission writes an Amazon-SQS-generated policy. If you want to write your\nown policy, use SetQueueAttributes to upload your policy. For more information\nabout writing your own policy, see Using Custom Policies with the Amazon SQS\nAccess Policy Language\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-creating-custom-policies.html)\nin the Amazon Simple Queue Service Developer Guide.\n An Amazon SQS policy can have a maximum of 7 actions.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([add-permission-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-permission-request add-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/add-permission-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddPermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"OverLimit" :portkey.aws.sqs/over-limit}})))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs/add-permission-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility "Changes the visibility timeout of a specified message in a queue to a new value.\nThe maximum allowed timeout value is 12 hours. For more information, see\nVisibility Timeout\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)\nin the Amazon Simple Queue Service Developer Guide.\n For example, you have a message with a visibility timeout of 5 minutes. After 3\nminutes, you call ChangeMessageVisibility with a timeout of 10 minutes. You can\ncontinue to call ChangeMessageVisibility to extend the visibility timeout to a\nmaximum of 12 hours. If you try to extend the visibility timeout beyond 12\nhours, your request is rejected.\n A message is considered to be in flight after it's received from a queue by a\nconsumer, but not yet deleted from the queue.\n For standard queues, there can be a maximum of 120,000 inflight messages per\nqueue. If you reach this limit, Amazon SQS returns the OverLimit error message.\nTo avoid reaching the limit, you should delete messages from the queue after\nthey're processed. You can also increase the number of queues you use to process\nyour messages.\n For FIFO queues, there can be a maximum of 20,000 inflight messages per queue.\nIf you reach this limit, Amazon SQS returns no error messages.\n If you attempt to set the VisibilityTimeout to a value greater than the maximum\ntime left, Amazon SQS returns an error. Amazon SQS doesn't automatically\nrecalculate and increase the timeout to the maximum remaining time.\n Unlike with a queue, when you change the visibility timeout for a specific\nmessage the timeout value is applied immediately but isn't saved in memory for\nthat message. If you don't delete a message after it is received, the visibility\ntimeout for the message reverts to the original timeout value (not to the value\nyou set using the ChangeMessageVisibility action) the next time the message is\nreceived." ([change-message-visibility-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-change-message-visibility-request change-message-visibility-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/change-message-visibility-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ChangeMessageVisibility", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"MessageNotInflight" :portkey.aws.sqs/message-not-inflight, "ReceiptHandleIsInvalid" :portkey.aws.sqs/receipt-handle-is-invalid}})))))
(clojure.spec.alpha/fdef change-message-visibility :args (clojure.spec.alpha/tuple :portkey.aws.sqs/change-message-visibility-request) :ret clojure.core/true?)

(clojure.core/defn delete-message "Deletes the specified message from the specified queue. To select the message to\ndelete, use the ReceiptHandle of the message (not the MessageId which you\nreceive when you send the message). Amazon SQS can delete a message from a queue\neven if a visibility timeout setting causes the message to be locked by another\nconsumer. Amazon SQS automatically deletes messages left in a queue longer than\nthe retention period configured for the queue.\n The ReceiptHandle is associated with a specific instance of receiving a\nmessage. If you receive a message more than once, the ReceiptHandle is different\neach time you receive a message. When you use the DeleteMessage action, you must\nprovide the most recently received ReceiptHandle for the message (otherwise, the\nrequest succeeds, but the message might not be deleted).\n For standard queues, it is possible to receive a message even after you delete\nit. This might happen on rare occasions if one of the servers which stores a\ncopy of the message is unavailable when you send the request to delete the\nmessage. The copy remains on the server and might be returned to you during a\nsubsequent receive request. You should ensure that your application is\nidempotent, so that receiving a message more than once does not cause issues." ([delete-message-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-message-request delete-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/delete-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteMessage", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidIdFormat" :portkey.aws.sqs/invalid-id-format, "ReceiptHandleIsInvalid" :portkey.aws.sqs/receipt-handle-is-invalid}})))))
(clojure.spec.alpha/fdef delete-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs/delete-message-request) :ret clojure.core/true?)

(clojure.core/defn send-message "Delivers a message to the specified queue.\n A message can include only XML, JSON, and unformatted text. The following\nUnicode characters are allowed:\n #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF\n Any characters not included in this list will be rejected. For more\ninformation, see the W3C specification for characters\n(http://www.w3.org/TR/REC-xml/#charsets)." ([send-message-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-send-message-request send-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/send-message-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/send-message-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SendMessageResult", :http.request.configuration/action "SendMessage", :http.request.configuration/output-deser-fn response-send-message-result, :http.request.spec/error-spec {"InvalidMessageContents" :portkey.aws.sqs/invalid-message-contents, "UnsupportedOperation" :portkey.aws.sqs/unsupported-operation}})))))
(clojure.spec.alpha/fdef send-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs/send-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/send-message-result))

(clojure.core/defn create-queue "Creates a new standard or FIFO queue. You can pass one or more attributes in the\nrequest. Keep the following caveats in mind:\n * If you don't specify the FifoQueue attribute, Amazon SQS creates a standard\nqueue.\n You can't change the queue type after you create it and you can't convert an\nexisting standard queue into a FIFO queue. You must either create a new FIFO\nqueue for your application or delete your existing standard queue and recreate\nit as a FIFO queue. For more information, see Moving From a Standard Queue to a\nFIFO Queue\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-moving)\nin the Amazon Simple Queue Service Developer Guide.\n * If you don't provide a value for an attribute, the queue is created with the\ndefault value for the attribute.\n * If you delete a queue, you must wait at least 60 seconds before creating a\nqueue with the same name.\n To successfully create a new queue, you must provide a queue name that adheres\nto the limits related to queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)\nand is unique within the scope of your queues.\n To get the queue URL, use the GetQueueUrl action. GetQueueUrl requires only the\nQueueName parameter. be aware of existing queue names:\n * If you provide the name of an existing queue along with the exact names and\nvalues of all the queue's attributes, CreateQueue returns the queue URL for the\nexisting queue.\n * If the queue name, attribute names, or attribute values don't match an\nexisting queue, CreateQueue returns an error.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=first\n &Attribute.2=second\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([create-queue-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-queue-request create-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/create-queue-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/create-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateQueueResult", :http.request.configuration/action "CreateQueue", :http.request.configuration/output-deser-fn response-create-queue-result, :http.request.spec/error-spec {"QueueDeletedRecently" :portkey.aws.sqs/queue-deleted-recently, "QueueNameExists" :portkey.aws.sqs/queue-name-exists}})))))
(clojure.spec.alpha/fdef create-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs/create-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/create-queue-result))

(clojure.core/defn purge-queue "Deletes the messages in a queue specified by the QueueURL parameter.\n When you use the PurgeQueue action, you can't retrieve any messages deleted\nfrom a queue.\n The message deletion process takes up to 60 seconds. We recommend waiting for\n60 seconds regardless of your queue's size.\n Messages sent to the queue before you call PurgeQueue might be received but are\ndeleted within the next minute.\n Messages sent to the queue after you call PurgeQueue might be deleted while the\nqueue is being purged." ([purge-queue-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-purge-queue-request purge-queue-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/purge-queue-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PurgeQueue", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs/queue-does-not-exist, "PurgeQueueInProgress" :portkey.aws.sqs/purge-queue-in-progress}})))))
(clojure.spec.alpha/fdef purge-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs/purge-queue-request) :ret clojure.core/true?)

(clojure.core/defn remove-permission "Revokes any permissions in the queue policy that matches the specified Label\nparameter.\n Only the owner of a queue can remove permissions from it.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([remove-permission-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-permission-request remove-permission-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/remove-permission-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemovePermission", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-url "Returns the URL of an existing Amazon SQS queue.\n To access a queue that belongs to another AWS account, use the\nQueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner.\nThe queue's owner must grant you permission to access the queue. For more\ninformation about shared queue access, see AddPermission or see Allow Developers\nto Write Messages to a Shared Queue\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-writing-an-sqs-policy.html#write-messages-to-shared-queue)\nin the Amazon Simple Queue Service Developer Guide." ([get-queue-url-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-queue-url-request get-queue-url-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/get-queue-url-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/get-queue-url-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetQueueUrlResult", :http.request.configuration/action "GetQueueUrl", :http.request.configuration/output-deser-fn response-get-queue-url-result, :http.request.spec/error-spec {"QueueDoesNotExist" :portkey.aws.sqs/queue-does-not-exist}})))))
(clojure.spec.alpha/fdef get-queue-url :args (clojure.spec.alpha/tuple :portkey.aws.sqs/get-queue-url-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/get-queue-url-result))

(clojure.core/defn list-queue-tags "List all cost allocation tags added to the specified Amazon SQS queue. For an\noverview, see Tagging Your Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-tags.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-limits.html#limits-queues)\nin the Amazon Simple Queue Service Developer Guide.\n Cross-account permissions don't apply to this action. For more information, see\nsee Grant Cross-Account Permissions to a Role and a User Name\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-customer-managed-policy-examples.html#grant-cross-account-permissions-to-role-and-user-name)\nin the Amazon Simple Queue Service Developer Guide." ([list-queue-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-queue-tags-request list-queue-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sqs/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sqs/list-queue-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2012-11-05", :http.request.configuration/service-id "SQS", :http.request.spec/input-spec :portkey.aws.sqs/list-queue-tags-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListQueueTagsResult", :http.request.configuration/action "ListQueueTags", :http.request.configuration/output-deser-fn response-list-queue-tags-result, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-queue-tags :args (clojure.spec.alpha/tuple :portkey.aws.sqs/list-queue-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs/list-queue-tags-result))
