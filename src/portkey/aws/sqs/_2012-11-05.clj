(ns portkey.aws.sqs.-2012-11-05 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sqs", :region "ap-northeast-1"},
    :ssl-common-name "ap-northeast-1.queue.amazonaws.com",
    :endpoint "https://sqs.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "sqs", :region "eu-west-1"},
    :ssl-common-name "eu-west-1.queue.amazonaws.com",
    :endpoint "https://sqs.eu-west-1.amazonaws.com",
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

(clojure.core/declare ser-string-list ser-awsaccount-id-list ser-send-message-batch-request-entry ser-send-message-batch-request-entry-list ser-message-attribute-name-list ser-change-message-visibility-batch-request-entry-list ser-tag-key ser-queue-attribute-name ser-action-name-list ser-tag-key-list ser-delete-message-batch-request-entry-list ser-tag-value ser-binary-list ser-message-attribute-value ser-attribute-name-list ser-tag-map ser-integer ser-string ser-delete-message-batch-request-entry ser-message-attribute-name ser-binary ser-queue-attribute-map ser-change-message-visibility-batch-request-entry ser-message-body-attribute-map)

(clojure.core/defn- ser-string-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-awsaccount-id-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-send-message-batch-request-entry [shape-input] (clojure.core/cond-> {} (:id shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.Id" (ser-string (:id shape-input))) (:message-body shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.MessageBody" (ser-string (:message-body shape-input))) (:delay-seconds shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.DelaySeconds" (ser-integer (:delay-seconds shape-input))) (:message-attributes shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.MessageAttributes" (ser-message-body-attribute-map (:message-attributes shape-input))) (:message-deduplication-id shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.MessageDeduplicationId" (ser-string (:message-deduplication-id shape-input))) (:message-group-id shape-input) (clojure.core/assoc "SendMessageBatchRequestEntry.MessageGroupId" (ser-string (:message-group-id shape-input)))))
(clojure.core/defn- ser-send-message-batch-request-entry-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-message-attribute-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-change-message-visibility-batch-request-entry-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-key [shape-input] shape-input)
(clojure.core/defn- ser-queue-attribute-name [shape-input] ({"DelaySeconds" "DelaySeconds", "FifoQueue" "FifoQueue", :approximate-number-of-messages "ApproximateNumberOfMessages", "CreatedTimestamp" "CreatedTimestamp", :delay-seconds "DelaySeconds", :queue-arn "QueueArn", "ContentBasedDeduplication" "ContentBasedDeduplication", "RedrivePolicy" "RedrivePolicy", :last-modified-timestamp "LastModifiedTimestamp", :kms-data-key-reuse-period-seconds "KmsDataKeyReusePeriodSeconds", :maximum-message-size "MaximumMessageSize", :fifo-queue "FifoQueue", :all "All", "KmsDataKeyReusePeriodSeconds" "KmsDataKeyReusePeriodSeconds", "ApproximateNumberOfMessagesDelayed" "ApproximateNumberOfMessagesDelayed", :policy "Policy", :message-retention-period "MessageRetentionPeriod", :approximate-number-of-messages-delayed "ApproximateNumberOfMessagesDelayed", :visibility-timeout "VisibilityTimeout", "LastModifiedTimestamp" "LastModifiedTimestamp", "ApproximateNumberOfMessagesNotVisible" "ApproximateNumberOfMessagesNotVisible", "ApproximateNumberOfMessages" "ApproximateNumberOfMessages", "MessageRetentionPeriod" "MessageRetentionPeriod", "VisibilityTimeout" "VisibilityTimeout", :redrive-policy "RedrivePolicy", :created-timestamp "CreatedTimestamp", :receive-message-wait-time-seconds "ReceiveMessageWaitTimeSeconds", "Policy" "Policy", :approximate-number-of-messages-not-visible "ApproximateNumberOfMessagesNotVisible", "QueueArn" "QueueArn", :kms-master-key-id "KmsMasterKeyId", "All" "All", :content-based-deduplication "ContentBasedDeduplication", "MaximumMessageSize" "MaximumMessageSize", "ReceiveMessageWaitTimeSeconds" "ReceiveMessageWaitTimeSeconds", "KmsMasterKeyId" "KmsMasterKeyId"} shape-input))
(clojure.core/defn- ser-action-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-key-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-delete-message-batch-request-entry-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-value [shape-input] shape-input)
(clojure.core/defn- ser-binary-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-message-attribute-value [shape-input] (clojure.core/cond-> {} (:string-value shape-input) (clojure.core/assoc "MessageAttributeValue.StringValue" (ser-string (:string-value shape-input))) (:binary-value shape-input) (clojure.core/assoc "MessageAttributeValue.BinaryValue" (ser-binary (:binary-value shape-input))) (:string-list-values shape-input) (clojure.core/assoc "MessageAttributeValue.StringListValues" (ser-string-list (:string-list-values shape-input))) (:binary-list-values shape-input) (clojure.core/assoc "MessageAttributeValue.BinaryListValues" (ser-binary-list (:binary-list-values shape-input))) (:data-type shape-input) (clojure.core/assoc "MessageAttributeValue.DataType" (ser-string (:data-type shape-input)))))
(clojure.core/defn- ser-attribute-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-tag-map [shape-input] (clojure.core/into {} (clojure.core/comp (clojure.core/map-indexed (clojure.core/fn [idx__36459__auto__ [k__36460__auto__ v__36461__auto__]] [[(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".key") k__36460__auto__] [(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".value") v__36461__auto__]])) clojure.core/cat) shape-input))
(clojure.core/defn- ser-integer [shape-input] shape-input)
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-delete-message-batch-request-entry [shape-input] (clojure.core/cond-> {} (:id shape-input) (clojure.core/assoc "DeleteMessageBatchRequestEntry.Id" (ser-string (:id shape-input))) (:receipt-handle shape-input) (clojure.core/assoc "DeleteMessageBatchRequestEntry.ReceiptHandle" (ser-string (:receipt-handle shape-input)))))
(clojure.core/defn- ser-message-attribute-name [shape-input] shape-input)
(clojure.core/defn- ser-binary [shape-input] (portkey.aws/base64-encode shape-input))
(clojure.core/defn- ser-queue-attribute-map [shape-input] (clojure.core/into {} (clojure.core/comp (clojure.core/map-indexed (clojure.core/fn [idx__36459__auto__ [k__36460__auto__ v__36461__auto__]] [[(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".key") k__36460__auto__] [(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".value") v__36461__auto__]])) clojure.core/cat) shape-input))
(clojure.core/defn- ser-change-message-visibility-batch-request-entry [shape-input] (clojure.core/cond-> {} (:id shape-input) (clojure.core/assoc "ChangeMessageVisibilityBatchRequestEntry.Id" (ser-string (:id shape-input))) (:receipt-handle shape-input) (clojure.core/assoc "ChangeMessageVisibilityBatchRequestEntry.ReceiptHandle" (ser-string (:receipt-handle shape-input))) (:visibility-timeout shape-input) (clojure.core/assoc "ChangeMessageVisibilityBatchRequestEntry.VisibilityTimeout" (ser-integer (:visibility-timeout shape-input)))))
(clojure.core/defn- ser-message-body-attribute-map [shape-input] (clojure.core/into {} (clojure.core/comp (clojure.core/map-indexed (clojure.core/fn [idx__36459__auto__ [k__36460__auto__ v__36461__auto__]] [[(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".key") k__36460__auto__] [(clojure.core/str "entry." (clojure.core/inc idx__36459__auto__) ".value") v__36461__auto__]])) clojure.core/cat) shape-input))

(clojure.core/defn req<-receive-message-request [action-name78592 input78591] (clojure.core/let [input78593 {:body {"QueueUrl" (ser-string (input78591 :queue-url)), "Version" "2012-11-05", "Action" action-name78592}}] (clojure.core/cond-> input78593 (clojure.core/contains? input78591 :attribute-names) (clojure.core/assoc-in [:body "AttributeNames"] (ser-attribute-name-list (input78591 :attribute-names))) (clojure.core/contains? input78591 :message-attribute-names) (clojure.core/assoc-in [:body "MessageAttributeNames"] (ser-message-attribute-name-list (input78591 :message-attribute-names))) (clojure.core/contains? input78591 :max-number-of-messages) (clojure.core/assoc-in [:body "MaxNumberOfMessages"] (ser-integer (input78591 :max-number-of-messages))) (clojure.core/contains? input78591 :visibility-timeout) (clojure.core/assoc-in [:body "VisibilityTimeout"] (ser-integer (input78591 :visibility-timeout))) (clojure.core/contains? input78591 :wait-time-seconds) (clojure.core/assoc-in [:body "WaitTimeSeconds"] (ser-integer (input78591 :wait-time-seconds))) (clojure.core/contains? input78591 :receive-request-attempt-id) (clojure.core/assoc-in [:body "ReceiveRequestAttemptId"] (ser-string (input78591 :receive-request-attempt-id))))))
(clojure.core/defn req<-list-queues-request [action-name78595 input78594] (clojure.core/cond-> {:body {"Version" "2012-11-05", "Action" action-name78595}} (clojure.core/contains? input78594 :queue-name-prefix) (clojure.core/assoc-in [:body "QueueNamePrefix"] (ser-string (input78594 :queue-name-prefix)))))
(clojure.core/defn req<-list-dead-letter-source-queues-request [action-name78597 input78596] {:body {"QueueUrl" (ser-string (input78596 :queue-url)), "Version" "2012-11-05", "Action" action-name78597}})
(clojure.core/defn req<-set-queue-attributes-request [action-name78599 input78598] {:body {"QueueUrl" (ser-string (input78598 :queue-url)), "Attributes" (ser-queue-attribute-map (input78598 :attributes)), "Version" "2012-11-05", "Action" action-name78599}})
(clojure.core/defn req<-change-message-visibility-batch-request [action-name78601 input78600] {:body {"QueueUrl" (ser-string (input78600 :queue-url)), "Entries" (ser-change-message-visibility-batch-request-entry-list (input78600 :entries)), "Version" "2012-11-05", "Action" action-name78601}})
(clojure.core/defn req<-tag-queue-request [action-name78603 input78602] {:body {"QueueUrl" (ser-string (input78602 :queue-url)), "Tags" (ser-tag-map (input78602 :tags)), "Version" "2012-11-05", "Action" action-name78603}})
(clojure.core/defn req<-get-queue-attributes-request [action-name78605 input78604] (clojure.core/let [input78606 {:body {"QueueUrl" (ser-string (input78604 :queue-url)), "Version" "2012-11-05", "Action" action-name78605}}] (clojure.core/cond-> input78606 (clojure.core/contains? input78604 :attribute-names) (clojure.core/assoc-in [:body "AttributeNames"] (ser-attribute-name-list (input78604 :attribute-names))))))
(clojure.core/defn req<-untag-queue-request [action-name78608 input78607] {:body {"QueueUrl" (ser-string (input78607 :queue-url)), "TagKeys" (ser-tag-key-list (input78607 :tag-keys)), "Version" "2012-11-05", "Action" action-name78608}})
(clojure.core/defn req<-delete-queue-request [action-name78610 input78609] {:body {"QueueUrl" (ser-string (input78609 :queue-url)), "Version" "2012-11-05", "Action" action-name78610}})
(clojure.core/defn req<-delete-message-batch-request [action-name78612 input78611] {:body {"QueueUrl" (ser-string (input78611 :queue-url)), "Entries" (ser-delete-message-batch-request-entry-list (input78611 :entries)), "Version" "2012-11-05", "Action" action-name78612}})
(clojure.core/defn req<-send-message-batch-request [action-name78614 input78613] {:body {"QueueUrl" (ser-string (input78613 :queue-url)), "Entries" (ser-send-message-batch-request-entry-list (input78613 :entries)), "Version" "2012-11-05", "Action" action-name78614}})
(clojure.core/defn req<-add-permission-request [action-name78616 input78615] {:body {"QueueUrl" (ser-string (input78615 :queue-url)), "Label" (ser-string (input78615 :label)), "AWSAccountIds" (ser-awsaccount-id-list (input78615 :awsaccount-ids)), "Actions" (ser-action-name-list (input78615 :actions)), "Version" "2012-11-05", "Action" action-name78616}})
(clojure.core/defn req<-change-message-visibility-request [action-name78618 input78617] {:body {"QueueUrl" (ser-string (input78617 :queue-url)), "ReceiptHandle" (ser-string (input78617 :receipt-handle)), "VisibilityTimeout" (ser-integer (input78617 :visibility-timeout)), "Version" "2012-11-05", "Action" action-name78618}})
(clojure.core/defn req<-delete-message-request [action-name78620 input78619] {:body {"QueueUrl" (ser-string (input78619 :queue-url)), "ReceiptHandle" (ser-string (input78619 :receipt-handle)), "Version" "2012-11-05", "Action" action-name78620}})
(clojure.core/defn req<-send-message-request [action-name78622 input78621] (clojure.core/let [input78623 {:body {"QueueUrl" (ser-string (input78621 :queue-url)), "MessageBody" (ser-string (input78621 :message-body)), "Version" "2012-11-05", "Action" action-name78622}}] (clojure.core/cond-> input78623 (clojure.core/contains? input78621 :delay-seconds) (clojure.core/assoc-in [:body "DelaySeconds"] (ser-integer (input78621 :delay-seconds))) (clojure.core/contains? input78621 :message-attributes) (clojure.core/assoc-in [:body "MessageAttributes"] (ser-message-body-attribute-map (input78621 :message-attributes))) (clojure.core/contains? input78621 :message-deduplication-id) (clojure.core/assoc-in [:body "MessageDeduplicationId"] (ser-string (input78621 :message-deduplication-id))) (clojure.core/contains? input78621 :message-group-id) (clojure.core/assoc-in [:body "MessageGroupId"] (ser-string (input78621 :message-group-id))))))
(clojure.core/defn req<-create-queue-request [action-name78625 input78624] (clojure.core/let [input78626 {:body {"QueueName" (ser-string (input78624 :queue-name)), "Version" "2012-11-05", "Action" action-name78625}}] (clojure.core/cond-> input78626 (clojure.core/contains? input78624 :attributes) (clojure.core/assoc-in [:body "Attributes"] (ser-queue-attribute-map (input78624 :attributes))))))
(clojure.core/defn req<-purge-queue-request [action-name78628 input78627] {:body {"QueueUrl" (ser-string (input78627 :queue-url)), "Version" "2012-11-05", "Action" action-name78628}})
(clojure.core/defn req<-remove-permission-request [action-name78630 input78629] {:body {"QueueUrl" (ser-string (input78629 :queue-url)), "Label" (ser-string (input78629 :label)), "Version" "2012-11-05", "Action" action-name78630}})
(clojure.core/defn req<-get-queue-url-request [action-name78632 input78631] (clojure.core/let [input78633 {:body {"QueueName" (ser-string (input78631 :queue-name)), "Version" "2012-11-05", "Action" action-name78632}}] (clojure.core/cond-> input78633 (clojure.core/contains? input78631 :queue-ownerawsaccount-id) (clojure.core/assoc-in [:body "QueueOwnerAWSAccountId"] (ser-string (input78631 :queue-ownerawsaccount-id))))))
(clojure.core/defn req<-list-queue-tags-request [action-name78635 input78634] {:body {"QueueUrl" (ser-string (input78634 :queue-url)), "Version" "2012-11-05", "Action" action-name78635}})

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-not-inflight (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/unsupported-operation (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.untag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.untag-queue-request/tag-keys (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/untag-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.untag-queue-request/QueueUrl :portkey.aws.sqs.-2012-11-05.untag-queue-request/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/batch-result-error-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/string-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-system-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/message-system-attribute-name :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-result/messages (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receive-message-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.receive-message-result/Messages] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/awsaccount-id-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queues-request/queue-name-prefix (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queues-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queues-request/QueueNamePrefix] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/purge-queue-in-progress (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/Successful :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result/Failed] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-result-entry/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-request/QueueUrl :portkey.aws.sqs.-2012-11-05.delete-message-batch-request/Entries] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/create-queue-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.create-queue-result/QueueUrl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/Id :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/MessageBody] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/DelaySeconds :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/MessageAttributes :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/MessageDeduplicationId :portkey.aws.sqs.-2012-11-05.send-message-batch-request-entry/MessageGroupId] :locations {"MessageAttribute" "MessageAttributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-id-format (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/message-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/empty-batch-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-result/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-url-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-result/QueueUrl] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queue-tags-result/tags (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queue-tags-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queue-tags-result/Tags] :locations {"Tag" "Tags"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-deleted-recently (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-result/queueUrls] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/QueueUrl :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request/Entries] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/over-limit (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-system-attribute-name {"SentTimestamp" "SentTimestamp", :approximate-receive-count "ApproximateReceiveCount", :sequence-number "SequenceNumber", "SenderId" "SenderId", "SequenceNumber" "SequenceNumber", :sent-timestamp "SentTimestamp", "ApproximateReceiveCount" "ApproximateReceiveCount", :message-deduplication-id "MessageDeduplicationId", "MessageGroupId" "MessageGroupId", "ApproximateFirstReceiveTimestamp" "ApproximateFirstReceiveTimestamp", :sender-id "SenderId", :message-group-id "MessageGroupId", :approximate-first-receive-timestamp "ApproximateFirstReceiveTimestamp", "MessageDeduplicationId" "MessageDeduplicationId"})

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-message-contents (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-request/QueueUrl :portkey.aws.sqs.-2012-11-05.delete-message-request/ReceiptHandle] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-does-not-exist (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queues-result/queue-urls (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-url-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queues-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.list-queues-result/QueueUrls] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-result (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-result/Successful :portkey.aws.sqs.-2012-11-05.delete-message-batch-result/Failed] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-attribute-name {"DelaySeconds" "DelaySeconds", "FifoQueue" "FifoQueue", :approximate-number-of-messages "ApproximateNumberOfMessages", "CreatedTimestamp" "CreatedTimestamp", :delay-seconds "DelaySeconds", :queue-arn "QueueArn", "ContentBasedDeduplication" "ContentBasedDeduplication", "RedrivePolicy" "RedrivePolicy", :last-modified-timestamp "LastModifiedTimestamp", :kms-data-key-reuse-period-seconds "KmsDataKeyReusePeriodSeconds", :maximum-message-size "MaximumMessageSize", :fifo-queue "FifoQueue", :all "All", "KmsDataKeyReusePeriodSeconds" "KmsDataKeyReusePeriodSeconds", "ApproximateNumberOfMessagesDelayed" "ApproximateNumberOfMessagesDelayed", :policy "Policy", :message-retention-period "MessageRetentionPeriod", :approximate-number-of-messages-delayed "ApproximateNumberOfMessagesDelayed", :visibility-timeout "VisibilityTimeout", "LastModifiedTimestamp" "LastModifiedTimestamp", "ApproximateNumberOfMessagesNotVisible" "ApproximateNumberOfMessagesNotVisible", "ApproximateNumberOfMessages" "ApproximateNumberOfMessages", "MessageRetentionPeriod" "MessageRetentionPeriod", "VisibilityTimeout" "VisibilityTimeout", :redrive-policy "RedrivePolicy", :created-timestamp "CreatedTimestamp", :receive-message-wait-time-seconds "ReceiveMessageWaitTimeSeconds", "Policy" "Policy", :approximate-number-of-messages-not-visible "ApproximateNumberOfMessagesNotVisible", "QueueArn" "QueueArn", :kms-master-key-id "KmsMasterKeyId", "All" "All", :content-based-deduplication "ContentBasedDeduplication", "MaximumMessageSize" "MaximumMessageSize", "ReceiveMessageWaitTimeSeconds" "ReceiveMessageWaitTimeSeconds", "KmsMasterKeyId" "KmsMasterKeyId"})

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/action-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-request-too-long (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.list-dead-letter-source-queues-request/QueueUrl] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-attribute-name (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-name-exists (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-queue-request/QueueUrl] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/awsaccount-ids (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/awsaccount-id-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.add-permission-request/actions (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/action-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/add-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.add-permission-request/QueueUrl :portkey.aws.sqs.-2012-11-05.add-permission-request/Label :portkey.aws.sqs.-2012-11-05.add-permission-request/AWSAccountIds :portkey.aws.sqs.-2012-11-05.add-permission-request/Actions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result/successful (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result/failed (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/batch-result-error-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result/Successful :portkey.aws.sqs.-2012-11-05.send-message-batch-result/Failed] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/tag-key))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/md5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/md5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-result/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-result/MD5OfMessageBody :portkey.aws.sqs.-2012-11-05.send-message-result/MD5OfMessageAttributes :portkey.aws.sqs.-2012-11-05.send-message-result/MessageId :portkey.aws.sqs.-2012-11-05.send-message-result/SequenceNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/message-attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/max-number-of-messages (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/wait-time-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.receive-message-request/receive-request-attempt-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receive-message-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.receive-message-request/QueueUrl] :opt-un [:portkey.aws.sqs.-2012-11-05.receive-message-request/AttributeNames :portkey.aws.sqs.-2012-11-05.receive-message-request/MessageAttributeNames :portkey.aws.sqs.-2012-11-05.receive-message-request/MaxNumberOfMessages :portkey.aws.sqs.-2012-11-05.receive-message-request/VisibilityTimeout :portkey.aws.sqs.-2012-11-05.receive-message-request/WaitTimeSeconds :portkey.aws.sqs.-2012-11-05.receive-message-request/ReceiveRequestAttemptId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/binary-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/binary))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/binary))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/string-list-values (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/binary-list-values (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/binary-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message-attribute-value/data-type (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-value (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.message-attribute-value/DataType] :opt-un [:portkey.aws.sqs.-2012-11-05.message-attribute-value/StringValue :portkey.aws.sqs.-2012-11-05.message-attribute-value/BinaryValue :portkey.aws.sqs.-2012-11-05.message-attribute-value/StringListValues :portkey.aws.sqs.-2012-11-05.message-attribute-value/BinaryListValues] :locations {"StringListValue" "StringListValues", "BinaryListValue" "BinaryListValues"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/md5-of-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-system-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/md5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.message/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.message/MessageId :portkey.aws.sqs.-2012-11-05.message/ReceiptHandle :portkey.aws.sqs.-2012-11-05.message/MD5OfBody :portkey.aws.sqs.-2012-11-05.message/Body :portkey.aws.sqs.-2012-11-05.message/Attributes :portkey.aws.sqs.-2012-11-05.message/MD5OfMessageAttributes :portkey.aws.sqs.-2012-11-05.message/MessageAttributes] :locations {"Attribute" "Attributes", "MessageAttribute" "MessageAttributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/queue-attribute-name))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.list-queue-tags-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/list-queue-tags-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.list-queue-tags-request/QueueUrl] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-request/QueueUrl :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/ReceiptHandle :portkey.aws.sqs.-2012-11-05.change-message-visibility-request/VisibilityTimeout] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-url-request/queue-ownerawsaccount-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-url-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-request/QueueName] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-url-request/QueueOwnerAWSAccountId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/tag-key :portkey.aws.sqs.-2012-11-05/tag-value))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.remove-permission-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.remove-permission-request/label (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/remove-permission-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.remove-permission-request/QueueUrl :portkey.aws.sqs.-2012-11-05.remove-permission-request/Label] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-result-entry/Id] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/message-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md5-of-message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/md5-of-message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/sequence-number (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-result-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/Id :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/MessageId :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/MD5OfMessageBody] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/MD5OfMessageAttributes :portkey.aws.sqs.-2012-11-05.send-message-batch-result-entry/SequenceNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-body (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/delay-seconds (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/message-body-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-deduplication-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-request/message-group-id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-request/QueueUrl :portkey.aws.sqs.-2012-11-05.send-message-request/MessageBody] :opt-un [:portkey.aws.sqs.-2012-11-05.send-message-request/DelaySeconds :portkey.aws.sqs.-2012-11-05.send-message-request/MessageAttributes :portkey.aws.sqs.-2012-11-05.send-message-request/MessageDeduplicationId :portkey.aws.sqs.-2012-11-05.send-message-request/MessageGroupId] :locations {"MessageAttribute" "MessageAttributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/QueueUrl] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-request/AttributeNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/QueueUrl :portkey.aws.sqs.-2012-11-05.set-queue-attributes-request/Attributes] :opt-un [] :locations {"Attribute" "Attributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/message))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/delete-message-batch-request-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/Id :portkey.aws.sqs.-2012-11-05.delete-message-batch-request-entry/ReceiptHandle] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-attribute-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/binary clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-url-list (clojure.spec.alpha/coll-of :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/queue-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/queue-attribute-name :portkey.aws.sqs.-2012-11-05/string))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/receipt-handle (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/visibility-timeout (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/integer))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/Id :portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/ReceiptHandle] :opt-un [:portkey.aws.sqs.-2012-11-05.change-message-visibility-batch-request-entry/VisibilityTimeout] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-request/queue-name (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.create-queue-request/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/create-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.create-queue-request/QueueName] :opt-un [:portkey.aws.sqs.-2012-11-05.create-queue-request/Attributes] :locations {"Attribute" "Attributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/message-body-attribute-map (clojure.spec.alpha/map-of :portkey.aws.sqs.-2012-11-05/string :portkey.aws.sqs.-2012-11-05/message-attribute-value))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/id (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/sender-fault (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/boolean))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/code (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/message (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/batch-result-error-entry (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.batch-result-error-entry/Id :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/SenderFault :portkey.aws.sqs.-2012-11-05.batch-result-error-entry/Code] :opt-un [:portkey.aws.sqs.-2012-11-05.batch-result-error-entry/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.send-message-batch-request/entries (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-request-entry-list))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/send-message-batch-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.send-message-batch-request/QueueUrl :portkey.aws.sqs.-2012-11-05.send-message-batch-request/Entries] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.get-queue-attributes-result/attributes (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/queue-attribute-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.sqs.-2012-11-05.get-queue-attributes-result/Attributes] :locations {"Attribute" "Attributes"}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.tag-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.tag-queue-request/tags (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/tag-map))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/tag-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.tag-queue-request/QueueUrl :portkey.aws.sqs.-2012-11-05.tag-queue-request/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05.purge-queue-request/queue-url (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/string))
(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/purge-queue-request (portkey.aws/json-keys :req-un [:portkey.aws.sqs.-2012-11-05.purge-queue-request/QueueUrl] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.sqs.-2012-11-05/boolean clojure.core/boolean?)

(clojure.core/defn receive-message "Retrieves one or more messages (up to 10), from the specified queue. Using the\nWaitTimeSeconds parameter enables long-poll support. For more information, see\nAmazon SQS Long Polling\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html)\nin the Amazon Simple Queue Service Developer Guide.\n Short poll is the default behavior where a weighted random set of machines is\nsampled on a ReceiveMessage call. Thus, only the messages on the sampled\nmachines are returned. If the number of messages in the queue is small (fewer\nthan 1,000), you most likely get fewer messages than you requested per\nReceiveMessage call. If the number of messages in the queue is extremely small,\nyou might not receive any messages in a particular ReceiveMessage response. If\nthis happens, repeat the request.\n For each message returned, the response includes the following:\n * The message body.\n * An MD5 digest of the message body. For information about MD5, see RFC1321\n(https://www.ietf.org/rfc/rfc1321.txt).\n * The MessageId you received when you sent the message to the queue.\n * The receipt handle.\n * The message attributes.\n * An MD5 digest of the message attributes.\n The receipt handle is the identifier you must provide when deleting the\nmessage. For more information, see Queue and Message Identifiers\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-queue-message-identifiers.html)\nin the Amazon Simple Queue Service Developer Guide.\n You can provide the VisibilityTimeout parameter in your request. The parameter\nis applied to the messages that Amazon SQS returns in the response. If you don't\ninclude the parameter, the overall visibility timeout for the queue is used for\nthe returned messages. For more information, see Visibility Timeout\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)\nin the Amazon Simple Queue Service Developer Guide.\n A message that isn't deleted or a message whose visibility isn't extended\nbefore the visibility timeout expires counts as a failed receive. Depending on\nthe configuration of the queue, the message might be sent to the dead-letter\nqueue.\n In the future, new attributes might be added. If you write code that calls this\naction, we recommend that you structure your code so that it can handle new\nattributes gracefully." ([receive-message-request] (clojure.core/let [req<-input__36755__auto__ (req<-receive-message-request "ReceiveMessage" receive-message-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/receive-message-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/receive-message-result {"OverLimit" :portkey.aws.sqs.-2012-11-05/over-limit}))))
(clojure.spec.alpha/fdef receive-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/receive-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/receive-message-result))

(clojure.core/defn list-queues "Returns a list of your queues. The maximum number of queues that can be returned\nis 1,000. If you specify a value for the optional QueueNamePrefix parameter,\nonly queues with a name that begins with the specified value are returned." ([] (list-queues {})) ([list-queues-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-queues-request "ListQueues" list-queues-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/list-queues-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/list-queues-result {}))))
(clojure.spec.alpha/fdef list-queues :args (clojure.spec.alpha/? :portkey.aws.sqs.-2012-11-05/list-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-queues-result))

(clojure.core/defn list-dead-letter-source-queues "Returns a list of your queues that have the RedrivePolicy queue attribute\nconfigured with a dead-letter queue.\n For more information about using dead-letter queues, see Using Amazon SQS\nDead-Letter Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-dead-letter-queues.html)\nin the Amazon Simple Queue Service Developer Guide." ([list-dead-letter-source-queues-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-dead-letter-source-queues-request "ListDeadLetterSourceQueues" list-dead-letter-source-queues-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist}))))
(clojure.spec.alpha/fdef list-dead-letter-source-queues :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-dead-letter-source-queues-result))

(clojure.core/defn set-queue-attributes "Sets the value of one or more queue attributes. When you change a queue's\nattributes, the change can take up to 60 seconds for most of the attributes to\npropagate throughout the Amazon SQS system. Changes made to the\nMessageRetentionPeriod attribute can take up to 15 minutes.\n In the future, new attributes might be added. If you write code that calls this\naction, we recommend that you structure your code so that it can handle new\nattributes gracefully." ([set-queue-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-set-queue-attributes-request "SetQueueAttributes" set-queue-attributes-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request {:payload nil, :move {"Attribute" "Attributes"}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidAttributeName" :portkey.aws.sqs.-2012-11-05/invalid-attribute-name}))))
(clojure.spec.alpha/fdef set-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/set-queue-attributes-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility-batch "Changes the visibility timeout of multiple messages. This is a batch version of\nChangeMessageVisibility. The result of the action on each message is reported\nindividually in the response. You can send up to 10 ChangeMessageVisibility\nrequests with each ChangeMessageVisibilityBatch action.\n Because the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([change-message-visibility-batch-request] (clojure.core/let [req<-input__36755__auto__ (req<-change-message-visibility-batch-request "ChangeMessageVisibilityBatch" change-message-visibility-batch-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id}))))
(clojure.spec.alpha/fdef change-message-visibility-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/change-message-visibility-batch-result))

(clojure.core/defn tag-queue "Add cost allocation tags to the specified Amazon SQS queue. For an overview, see\nTagging Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-tagging-queues.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging API actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)\nin the Amazon Simple Queue Service Developer Guide." ([tag-queue-request] (clojure.core/let [req<-input__36755__auto__ (req<-tag-queue-request "TagQueue" tag-queue-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/tag-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef tag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/tag-queue-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-attributes "Gets attributes for the specified queue.\n To determine whether a queue is FIFO\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html),\nyou can check whether QueueName ends with the .fifo suffix.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([get-queue-attributes-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-queue-attributes-request "GetQueueAttributes" get-queue-attributes-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result {"InvalidAttributeName" :portkey.aws.sqs.-2012-11-05/invalid-attribute-name}))))
(clojure.spec.alpha/fdef get-queue-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/get-queue-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/get-queue-attributes-result))

(clojure.core/defn untag-queue "Remove cost allocation tags from the specified Amazon SQS queue. For an\noverview, see Tagging Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-tagging-queues.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging API actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)\nin the Amazon Simple Queue Service Developer Guide." ([untag-queue-request] (clojure.core/let [req<-input__36755__auto__ (req<-untag-queue-request "UntagQueue" untag-queue-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/untag-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef untag-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/untag-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-queue "Deletes the queue specified by the QueueUrl, regardless of the queue's contents.\nIf the specified queue doesn't exist, Amazon SQS returns a successful response.\n Be careful with the DeleteQueue action: When you delete a queue, any messages\nin the queue are no longer available.\n When you delete a queue, the deletion process takes up to 60 seconds. Requests\nyou send involving that queue during the 60 seconds might succeed. For example,\na SendMessage request might succeed, but after 60 seconds the queue and the\nmessage you sent no longer exist.\n When you delete a queue, you must wait at least 60 seconds before creating a\nqueue with the same name." ([delete-queue-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-queue-request "DeleteQueue" delete-queue-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/delete-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef delete-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-queue-request) :ret clojure.core/true?)

(clojure.core/defn delete-message-batch "Deletes up to ten messages from the specified queue. This is a batch version of\nDeleteMessage. The result of the action on each message is reported individually\nin the response.\n Because the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([delete-message-batch-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-message-batch-request "DeleteMessageBatch" delete-message-batch-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/delete-message-batch-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/delete-message-batch-result {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id}))))
(clojure.spec.alpha/fdef delete-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/delete-message-batch-result))

(clojure.core/defn send-message-batch "Delivers up to ten messages to the specified queue. This is a batch version of\nSendMessage. For a FIFO queue, multiple messages within a single batch are\nenqueued in the order they are sent.\n The result of sending each message is reported individually in the response.\nBecause the batch request can result in a combination of successful and\nunsuccessful actions, you should check for batch errors even when the call\nreturns an HTTP status code of 200.\n The maximum allowed individual message size and the maximum total payload size\n(the sum of the individual lengths of all of the batched messages) are both 256\nKB (262,144 bytes).\n A message can include only XML, JSON, and unformatted text. The following\nUnicode characters are allowed:\n #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF\n Any characters not included in this list will be rejected. For more\ninformation, see the W3C specification for characters\n(http://www.w3.org/TR/REC-xml/#charsets).\n If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses\nthe default value for the queue.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([send-message-batch-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-message-batch-request "SendMessageBatch" send-message-batch-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/send-message-batch-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/send-message-batch-result {"TooManyEntriesInBatchRequest" :portkey.aws.sqs.-2012-11-05/too-many-entries-in-batch-request, "EmptyBatchRequest" :portkey.aws.sqs.-2012-11-05/empty-batch-request, "BatchEntryIdsNotDistinct" :portkey.aws.sqs.-2012-11-05/batch-entry-ids-not-distinct, "BatchRequestTooLong" :portkey.aws.sqs.-2012-11-05/batch-request-too-long, "InvalidBatchEntryId" :portkey.aws.sqs.-2012-11-05/invalid-batch-entry-id, "UnsupportedOperation" :portkey.aws.sqs.-2012-11-05/unsupported-operation}))))
(clojure.spec.alpha/fdef send-message-batch :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/send-message-batch-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-batch-result))

(clojure.core/defn add-permission "Adds a permission to a queue for a specific principal\n(http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P). This allows\nsharing access to the queue.\n When you create a queue, you have full control access rights for the queue.\nOnly you, the owner of the queue, can grant or deny permissions to the queue.\nFor more information about these permissions, see Shared Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html)\nin the Amazon Simple Queue Service Developer Guide.\n AddPermission writes an Amazon-SQS-generated policy. If you want to write your\nown policy, use SetQueueAttributes to upload your policy. For more information\nabout writing your own policy, see Using The Access Policy Language\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html)\nin the Amazon Simple Queue Service Developer Guide.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([add-permission-request] (clojure.core/let [req<-input__36755__auto__ (req<-add-permission-request "AddPermission" add-permission-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/add-permission-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"OverLimit" :portkey.aws.sqs.-2012-11-05/over-limit}))))
(clojure.spec.alpha/fdef add-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/add-permission-request) :ret clojure.core/true?)

(clojure.core/defn change-message-visibility "Changes the visibility timeout of a specified message in a queue to a new value.\nThe maximum allowed timeout value is 12 hours. Thus, you can't extend the\ntimeout of a message in an existing queue to more than a total visibility\ntimeout of 12 hours. For more information, see Visibility Timeout\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-visibility-timeout.html)\nin the Amazon Simple Queue Service Developer Guide.\n For example, you have a message with a visibility timeout of 5 minutes. After 3\nminutes, you call ChangeMessageVisiblity with a timeout of 10 minutes. At that\ntime, the timeout for the message is extended by 10 minutes beyond the time of\nthe ChangeMessageVisibility action. This results in a total visibility timeout\nof 13 minutes. You can continue to call the ChangeMessageVisibility to extend\nthe visibility timeout to a maximum of 12 hours. If you try to extend the\nvisibility timeout beyond 12 hours, your request is rejected.\n A message is considered to be in flight after it's received from a queue by a\nconsumer, but not yet deleted from the queue.\n For standard queues, there can be a maximum of 120,000 inflight messages per\nqueue. If you reach this limit, Amazon SQS returns the OverLimit error message.\nTo avoid reaching the limit, you should delete messages from the queue after\nthey're processed. You can also increase the number of queues you use to process\nyour messages.\n For FIFO queues, there can be a maximum of 20,000 inflight messages per queue.\nIf you reach this limit, Amazon SQS returns no error messages.\n If you attempt to set the VisibilityTimeout to a value greater than the maximum\ntime left, Amazon SQS returns an error. Amazon SQS doesn't automatically\nrecalculate and increase the timeout to the maximum remaining time.\n Unlike with a queue, when you change the visibility timeout for a specific\nmessage the timeout value is applied immediately but isn't saved in memory for\nthat message. If you don't delete a message after it is received, the visibility\ntimeout for the message reverts to the original timeout value (not to the value\nyou set using the ChangeMessageVisibility action) the next time the message is\nreceived." ([change-message-visibility-request] (clojure.core/let [req<-input__36755__auto__ (req<-change-message-visibility-request "ChangeMessageVisibility" change-message-visibility-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/change-message-visibility-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"MessageNotInflight" :portkey.aws.sqs.-2012-11-05/message-not-inflight, "ReceiptHandleIsInvalid" :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid}))))
(clojure.spec.alpha/fdef change-message-visibility :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/change-message-visibility-request) :ret clojure.core/true?)

(clojure.core/defn delete-message "Deletes the specified message from the specified queue. You specify the message\nby using the message's receipt handle and not the MessageId you receive when you\nsend the message. Even if the message is locked by another reader due to the\nvisibility timeout setting, it is still deleted from the queue. If you leave a\nmessage in the queue for longer than the queue's configured retention period,\nAmazon SQS automatically deletes the message.\n The receipt handle is associated with a specific instance of receiving the\nmessage. If you receive a message more than once, the receipt handle you get\neach time you receive the message is different. If you don't provide the most\nrecently received receipt handle for the message when you use the DeleteMessage\naction, the request succeeds, but the message might not be deleted.\n For standard queues, it is possible to receive a message even after you delete\nit. This might happen on rare occasions if one of the servers storing a copy of\nthe message is unavailable when you send the request to delete the message. The\ncopy remains on the server and might be returned to you on a subsequent receive\nrequest. You should ensure that your application is idempotent, so that\nreceiving a message more than once does not cause issues." ([delete-message-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-message-request "DeleteMessage" delete-message-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/delete-message-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"InvalidIdFormat" :portkey.aws.sqs.-2012-11-05/invalid-id-format, "ReceiptHandleIsInvalid" :portkey.aws.sqs.-2012-11-05/receipt-handle-is-invalid}))))
(clojure.spec.alpha/fdef delete-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/delete-message-request) :ret clojure.core/true?)

(clojure.core/defn send-message "Delivers a message to the specified queue.\n A message can include only XML, JSON, and unformatted text. The following\nUnicode characters are allowed:\n #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF\n Any characters not included in this list will be rejected. For more\ninformation, see the W3C specification for characters\n(http://www.w3.org/TR/REC-xml/#charsets)." ([send-message-request] (clojure.core/let [req<-input__36755__auto__ (req<-send-message-request "SendMessage" send-message-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/send-message-request {:payload nil, :move {"MessageAttribute" "MessageAttributes"}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/send-message-result {"InvalidMessageContents" :portkey.aws.sqs.-2012-11-05/invalid-message-contents, "UnsupportedOperation" :portkey.aws.sqs.-2012-11-05/unsupported-operation}))))
(clojure.spec.alpha/fdef send-message :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/send-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/send-message-result))

(clojure.core/defn create-queue "Creates a new standard or FIFO queue. You can pass one or more attributes in the\nrequest. Keep the following caveats in mind:\n * If you don't specify the FifoQueue attribute, Amazon SQS creates a standard\nqueue.\n You can't change the queue type after you create it and you can't convert an\nexisting standard queue into a FIFO queue. You must either create a new FIFO\nqueue for your application or delete your existing standard queue and recreate\nit as a FIFO queue. For more information, see Moving From a Standard Queue to a\nFIFO Queue\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-moving)\nin the Amazon Simple Queue Service Developer Guide.\n * If you don't provide a value for an attribute, the queue is created with the\ndefault value for the attribute.\n * If you delete a queue, you must wait at least 60 seconds before creating a\nqueue with the same name.\n To successfully create a new queue, you must provide a queue name that adheres\nto the limits related to queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)\nand is unique within the scope of your queues.\n To get the queue URL, use the GetQueueUrl action. GetQueueUrl requires only the\nQueueName parameter. be aware of existing queue names:\n * If you provide the name of an existing queue along with the exact names and\nvalues of all the queue's attributes, CreateQueue returns the queue URL for the\nexisting queue.\n * If the queue name, attribute names, or attribute values don't match an\nexisting queue, CreateQueue returns an error.\n Some actions take lists of parameters. These lists are specified using the\nparam.n notation. Values of n are integers starting from 1. For example, a\nparameter list with two elements looks like this:\n &Attribute.1=this\n &Attribute.2=that" ([create-queue-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-queue-request "CreateQueue" create-queue-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/create-queue-request {:payload nil, :move {"Attribute" "Attributes"}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/create-queue-result {"QueueDeletedRecently" :portkey.aws.sqs.-2012-11-05/queue-deleted-recently, "QueueNameExists" :portkey.aws.sqs.-2012-11-05/queue-name-exists}))))
(clojure.spec.alpha/fdef create-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/create-queue-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/create-queue-result))

(clojure.core/defn purge-queue "Deletes the messages in a queue specified by the QueueURL parameter.\n When you use the PurgeQueue action, you can't retrieve a message deleted from a\nqueue.\n When you purge a queue, the message deletion process takes up to 60 seconds.\nAll messages sent to the queue before calling the PurgeQueue action are deleted.\nMessages sent to the queue while it is being purged might be deleted. While the\nqueue is being purged, messages sent to the queue before PurgeQueue is called\nmight be received, but are deleted within the next minute." ([purge-queue-request] (clojure.core/let [req<-input__36755__auto__ (req<-purge-queue-request "PurgeQueue" purge-queue-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/purge-queue-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist, "PurgeQueueInProgress" :portkey.aws.sqs.-2012-11-05/purge-queue-in-progress}))))
(clojure.spec.alpha/fdef purge-queue :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/purge-queue-request) :ret clojure.core/true?)

(clojure.core/defn remove-permission "Revokes any permissions in the queue policy that matches the specified Label\nparameter. Only the owner of the queue can remove permissions." ([remove-permission-request] (clojure.core/let [req<-input__36755__auto__ (req<-remove-permission-request "RemovePermission" remove-permission-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/remove-permission-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil nil {}))))
(clojure.spec.alpha/fdef remove-permission :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/remove-permission-request) :ret clojure.core/true?)

(clojure.core/defn get-queue-url "Returns the URL of an existing queue. This action provides a simple way to\nretrieve the URL of an Amazon SQS queue.\n To access a queue that belongs to another AWS account, use the\nQueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner.\nThe queue's owner must grant you permission to access the queue. For more\ninformation about shared queue access, see AddPermission or see Shared Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html)\nin the Amazon Simple Queue Service Developer Guide." ([get-queue-url-request] (clojure.core/let [req<-input__36755__auto__ (req<-get-queue-url-request "GetQueueUrl" get-queue-url-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/get-queue-url-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/get-queue-url-result {"QueueDoesNotExist" :portkey.aws.sqs.-2012-11-05/queue-does-not-exist}))))
(clojure.spec.alpha/fdef get-queue-url :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/get-queue-url-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/get-queue-url-result))

(clojure.core/defn list-queue-tags "List all cost allocation tags added to the specified Amazon SQS queue. For an\noverview, see Tagging Amazon SQS Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-tagging-queues.html)\nin the Amazon Simple Queue Service Developer Guide.\n When you use queue tags, keep the following guidelines in mind:\n * Adding more than 50 tags to a queue isn't recommended.\n * Tags don't have any semantic meaning. Amazon SQS interprets tags as character\nstrings.\n * Tags are case-sensitive.\n * A new tag with a key identical to that of an existing tag overwrites the\nexisting tag.\n * Tagging API actions are limited to 5 TPS per AWS account. If your application\nrequires a higher throughput, file a technical support request\n(https://console.aws.amazon.com/support/home#/case/create?issueType=technical).\n For a full list of tag restrictions, see Limits Related to Queues\n(http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)\nin the Amazon Simple Queue Service Developer Guide." ([list-queue-tags-request] (clojure.core/let [req<-input__36755__auto__ (req<-list-queue-tags-request "ListQueueTags" list-queue-tags-request)] (portkey.aws/-query-call portkey.aws.sqs.-2012-11-05/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.sqs.-2012-11-05/list-queue-tags-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.sqs.-2012-11-05/list-queue-tags-result {}))))
(clojure.spec.alpha/fdef list-queue-tags :args (clojure.spec.alpha/tuple :portkey.aws.sqs.-2012-11-05/list-queue-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.sqs.-2012-11-05/list-queue-tags-result))
