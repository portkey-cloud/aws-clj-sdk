(ns portkey.aws.sms-voice.-2018-09-05 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-sns-destination)

(clojure.core/declare ser-cloud-watch-logs-destination)

(clojure.core/declare ser-non-empty-string)

(clojure.core/declare ser-string)

(clojure.core/declare ser-event-destination-definition)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-call-instructions-message-type)

(clojure.core/declare ser-voice-message-content)

(clojure.core/declare ser-word-characters-with-delimiters)

(clojure.core/declare ser-ssml-message-type)

(clojure.core/declare ser-string)

(clojure.core/declare ser-kinesis-firehose-destination)

(clojure.core/declare ser-event-types)

(clojure.core/declare ser-plain-text-message-type)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-sns-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SnsDestination", :type "structure"} (clojure.core/contains? input :topic-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :topic-arn)) #:http.request.field{:name "TopicArn", :shape "String"}))))

(clojure.core/defn- ser-cloud-watch-logs-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CloudWatchLogsDestination", :type "structure"} (clojure.core/contains? input :iam-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :iam-role-arn)) #:http.request.field{:name "IamRoleArn", :shape "String"})) (clojure.core/contains? input :log-group-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :log-group-arn)) #:http.request.field{:name "LogGroupArn", :shape "String"}))))

(clojure.core/defn- ser-non-empty-string [input] #:http.request.field{:value input, :shape "NonEmptyString"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-event-destination-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "EventDestinationDefinition", :type "structure"} (clojure.core/contains? input :cloud-watch-logs-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cloud-watch-logs-destination (input :cloud-watch-logs-destination)) #:http.request.field{:name "CloudWatchLogsDestination", :shape "CloudWatchLogsDestination"})) (clojure.core/contains? input :enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enabled)) #:http.request.field{:name "Enabled", :shape "Boolean"})) (clojure.core/contains? input :kinesis-firehose-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-firehose-destination (input :kinesis-firehose-destination)) #:http.request.field{:name "KinesisFirehoseDestination", :shape "KinesisFirehoseDestination"})) (clojure.core/contains? input :matching-event-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-types (input :matching-event-types)) #:http.request.field{:name "MatchingEventTypes", :shape "EventTypes"})) (clojure.core/contains? input :sns-destination) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sns-destination (input :sns-destination)) #:http.request.field{:name "SnsDestination", :shape "SnsDestination"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"INITIATED_CALL" "INITIATED_CALL", :ringing "RINGING", :completed-call "COMPLETED_CALL", "BUSY" "BUSY", "COMPLETED_CALL" "COMPLETED_CALL", :busy "BUSY", "ANSWERED" "ANSWERED", "NO_ANSWER" "NO_ANSWER", :answered "ANSWERED", :no-answer "NO_ANSWER", "FAILED" "FAILED", :initiated-call "INITIATED_CALL", :failed "FAILED", "RINGING" "RINGING"} input), :shape "EventType"})

(clojure.core/defn- ser-call-instructions-message-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "CallInstructionsMessageType", :type "structure"} (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :text)) #:http.request.field{:name "Text", :shape "NonEmptyString"}))))

(clojure.core/defn- ser-voice-message-content [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "VoiceMessageContent", :type "structure"} (clojure.core/contains? input :call-instructions-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-call-instructions-message-type (input :call-instructions-message)) #:http.request.field{:name "CallInstructionsMessage", :shape "CallInstructionsMessageType"})) (clojure.core/contains? input :plain-text-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-plain-text-message-type (input :plain-text-message)) #:http.request.field{:name "PlainTextMessage", :shape "PlainTextMessageType"})) (clojure.core/contains? input :ssml-message) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssml-message-type (input :ssml-message)) #:http.request.field{:name "SSMLMessage", :shape "SSMLMessageType"}))))

(clojure.core/defn- ser-word-characters-with-delimiters [input] #:http.request.field{:value input, :shape "WordCharactersWithDelimiters"})

(clojure.core/defn- ser-ssml-message-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SSMLMessageType", :type "structure"} (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "String"})) (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :text)) #:http.request.field{:name "Text", :shape "NonEmptyString"})) (clojure.core/contains? input :voice-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :voice-id)) #:http.request.field{:name "VoiceId", :shape "String"}))))

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-kinesis-firehose-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisFirehoseDestination", :type "structure"} (clojure.core/contains? input :delivery-stream-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :delivery-stream-arn)) #:http.request.field{:name "DeliveryStreamArn", :shape "String"})) (clojure.core/contains? input :iam-role-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :iam-role-arn)) #:http.request.field{:name "IamRoleArn", :shape "String"}))))

(clojure.core/defn- ser-event-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-event-type coll) #:http.request.field{:shape "EventType"}))) input), :shape "EventTypes", :type "list"})

(clojure.core/defn- ser-plain-text-message-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PlainTextMessageType", :type "structure"} (clojure.core/contains? input :language-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :language-code)) #:http.request.field{:name "LanguageCode", :shape "String"})) (clojure.core/contains? input :text) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :text)) #:http.request.field{:name "Text", :shape "NonEmptyString"})) (clojure.core/contains? input :voice-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :voice-id)) #:http.request.field{:name "VoiceId", :shape "String"}))))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-delete-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "__string", :location "uri", :location-name "EventDestinationName"}) (clojure.core/into (ser-string (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "__string", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-delete-configuration-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "__string", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-list-configuration-sets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "NextToken"})) (clojure.core/contains? input :page-size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :page-size)) #:http.request.field{:name "PageSize", :shape "__string", :location "querystring", :location-name "PageSize"}))))

(clojure.core/defn- req-create-configuration-set-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word-characters-with-delimiters (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "WordCharactersWithDelimiters"}))))

(clojure.core/defn- req-get-configuration-set-event-destinations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "__string", :location "uri", :location-name "ConfigurationSetName"})]}))

(clojure.core/defn- req-update-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "__string", :location "uri", :location-name "EventDestinationName"}) (clojure.core/into (ser-string (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "__string", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :event-destination) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-destination-definition (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestinationDefinition"}))))

(clojure.core/defn- req-create-configuration-set-event-destination-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "__string", :location "uri", :location-name "ConfigurationSetName"})]} (clojure.core/contains? input :event-destination) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-destination-definition (input :event-destination)) #:http.request.field{:name "EventDestination", :shape "EventDestinationDefinition"})) (clojure.core/contains? input :event-destination-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :event-destination-name)) #:http.request.field{:name "EventDestinationName", :shape "NonEmptyString"}))))

(clojure.core/defn- req-send-voice-message-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :caller-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :caller-id)) #:http.request.field{:name "CallerId", :shape "String"})) (clojure.core/contains? input :configuration-set-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-word-characters-with-delimiters (input :configuration-set-name)) #:http.request.field{:name "ConfigurationSetName", :shape "WordCharactersWithDelimiters"})) (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-voice-message-content (input :content)) #:http.request.field{:name "Content", :shape "VoiceMessageContent"})) (clojure.core/contains? input :destination-phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :destination-phone-number)) #:http.request.field{:name "DestinationPhoneNumber", :shape "NonEmptyString"})) (clojure.core/contains? input :origination-phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-non-empty-string (input :origination-phone-number)) #:http.request.field{:name "OriginationPhoneNumber", :shape "NonEmptyString"}))))

(clojure.core/declare deser-event-destination)

(clojure.core/declare deser-sns-destination)

(clojure.core/declare deser-cloud-watch-logs-destination)

(clojure.core/declare deser-configuration-sets)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-word-characters-with-delimiters)

(clojure.core/declare deser-string)

(clojure.core/declare deser-kinesis-firehose-destination)

(clojure.core/declare deser-event-types)

(clojure.core/declare deser-event-destinations)

(clojure.core/declare deser-next-token-string)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-event-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "CloudWatchLogsDestination") (clojure.core/assoc :cloud-watch-logs-destination (deser-cloud-watch-logs-destination (input "CloudWatchLogsDestination"))) (clojure.core/contains? input "Enabled") (clojure.core/assoc :enabled (deser-boolean (input "Enabled"))) (clojure.core/contains? input "KinesisFirehoseDestination") (clojure.core/assoc :kinesis-firehose-destination (deser-kinesis-firehose-destination (input "KinesisFirehoseDestination"))) (clojure.core/contains? input "MatchingEventTypes") (clojure.core/assoc :matching-event-types (deser-event-types (input "MatchingEventTypes"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "SnsDestination") (clojure.core/assoc :sns-destination (deser-sns-destination (input "SnsDestination")))))

(clojure.core/defn- deser-sns-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "TopicArn") (clojure.core/assoc :topic-arn (deser-string (input "TopicArn")))))

(clojure.core/defn- deser-cloud-watch-logs-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "IamRoleArn") (clojure.core/assoc :iam-role-arn (deser-string (input "IamRoleArn"))) (clojure.core/contains? input "LogGroupArn") (clojure.core/assoc :log-group-arn (deser-string (input "LogGroupArn")))))

(clojure.core/defn- deser-configuration-sets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-word-characters-with-delimiters coll))) input))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"INITIATED_CALL" :initiated-call, "RINGING" :ringing, "ANSWERED" :answered, "COMPLETED_CALL" :completed-call, "BUSY" :busy, "FAILED" :failed, "NO_ANSWER" :no-answer} input))

(clojure.core/defn- deser-word-characters-with-delimiters [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-kinesis-firehose-destination [input] (clojure.core/cond-> {} (clojure.core/contains? input "DeliveryStreamArn") (clojure.core/assoc :delivery-stream-arn (deser-string (input "DeliveryStreamArn"))) (clojure.core/contains? input "IamRoleArn") (clojure.core/assoc :iam-role-arn (deser-string (input "IamRoleArn")))))

(clojure.core/defn- deser-event-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-type coll))) input))

(clojure.core/defn- deser-event-destinations [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-event-destination coll))) input))

(clojure.core/defn- deser-next-token-string [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-already-exists-exception ([input] (response-already-exists-exception nil input)) ([resultWrapper1468815 input] (clojure.core/let [rawinput1468814 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468816 {"Message" (rawinput1468814 "Message")}] (clojure.core/cond-> {} (letvar1468816 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468816 ["Message"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1468818 input] (clojure.core/let [rawinput1468817 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468819 {"Message" (rawinput1468817 "Message")}] (clojure.core/cond-> {} (letvar1468819 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468819 ["Message"])))))))

(clojure.core/defn- response-get-configuration-set-event-destinations-response ([input] (response-get-configuration-set-event-destinations-response nil input)) ([resultWrapper1468821 input] (clojure.core/let [rawinput1468820 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468822 {"EventDestinations" (rawinput1468820 "EventDestinations")}] (clojure.core/cond-> {} (letvar1468822 "EventDestinations") (clojure.core/assoc :event-destinations (deser-event-destinations (clojure.core/get-in letvar1468822 ["EventDestinations"])))))))

(clojure.core/defn- response-internal-service-error-exception ([input] (response-internal-service-error-exception nil input)) ([resultWrapper1468824 input] (clojure.core/let [rawinput1468823 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468825 {"Message" (rawinput1468823 "Message")}] (clojure.core/cond-> {} (letvar1468825 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468825 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1468827 input] (clojure.core/let [rawinput1468826 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468828 {"Message" (rawinput1468826 "Message")}] (clojure.core/cond-> {} (letvar1468828 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468828 ["Message"])))))))

(clojure.core/defn- response-list-configuration-sets-response ([input] (response-list-configuration-sets-response nil input)) ([resultWrapper1468830 input] (clojure.core/let [rawinput1468829 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468831 {"ConfigurationSets" (rawinput1468829 "ConfigurationSets"), "NextToken" (rawinput1468829 "NextToken")}] (clojure.core/cond-> {} (letvar1468831 "ConfigurationSets") (clojure.core/assoc :configuration-sets (deser-configuration-sets (clojure.core/get-in letvar1468831 ["ConfigurationSets"]))) (letvar1468831 "NextToken") (clojure.core/assoc :next-token (deser-next-token-string (clojure.core/get-in letvar1468831 ["NextToken"])))))))

(clojure.core/defn- response-create-configuration-set-response ([input] (response-create-configuration-set-response nil input)) ([resultWrapper1468833 input] (clojure.core/let [rawinput1468832 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468834 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1468836 input] (clojure.core/let [rawinput1468835 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468837 {"Message" (rawinput1468835 "Message")}] (clojure.core/cond-> {} (letvar1468837 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468837 ["Message"])))))))

(clojure.core/defn- response-update-configuration-set-event-destination-response ([input] (response-update-configuration-set-event-destination-response nil input)) ([resultWrapper1468839 input] (clojure.core/let [rawinput1468838 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468840 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1468842 input] (clojure.core/let [rawinput1468841 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468843 {"Message" (rawinput1468841 "Message")}] (clojure.core/cond-> {} (letvar1468843 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1468843 ["Message"])))))))

(clojure.core/defn- response-delete-configuration-set-response ([input] (response-delete-configuration-set-response nil input)) ([resultWrapper1468845 input] (clojure.core/let [rawinput1468844 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468846 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-send-voice-message-response ([input] (response-send-voice-message-response nil input)) ([resultWrapper1468848 input] (clojure.core/let [rawinput1468847 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468849 {"MessageId" (rawinput1468847 "MessageId")}] (clojure.core/cond-> {} (letvar1468849 "MessageId") (clojure.core/assoc :message-id (deser-string (clojure.core/get-in letvar1468849 ["MessageId"])))))))

(clojure.core/defn- response-delete-configuration-set-event-destination-response ([input] (response-delete-configuration-set-event-destination-response nil input)) ([resultWrapper1468851 input] (clojure.core/let [rawinput1468850 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468852 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-configuration-set-event-destination-response ([input] (response-create-configuration-set-event-destination-response nil input)) ([resultWrapper1468854 input] (clojure.core/let [rawinput1468853 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1468855 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.event-destination/enabled (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/boolean))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.event-destination/matching-event-types (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/event-types))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.event-destination/name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/event-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05/cloud-watch-logs-destination :portkey.aws.sms-voice.-2018-09-05.event-destination/enabled :portkey.aws.sms-voice.-2018-09-05/kinesis-firehose-destination :portkey.aws.sms-voice.-2018-09-05.event-destination/matching-event-types :portkey.aws.sms-voice.-2018-09-05.event-destination/name :portkey.aws.sms-voice.-2018-09-05/sns-destination]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.sns-destination/topic-arn (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/sns-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.sns-destination/topic-arn]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.cloud-watch-logs-destination/iam-role-arn (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.cloud-watch-logs-destination/log-group-arn (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/cloud-watch-logs-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.cloud-watch-logs-destination/iam-role-arn :portkey.aws.sms-voice.-2018-09-05.cloud-watch-logs-destination/log-group-arn]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/non-empty-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05/event-destinations]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.event-destination-definition/enabled (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/boolean))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.event-destination-definition/matching-event-types (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/event-types))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/event-destination-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05/cloud-watch-logs-destination :portkey.aws.sms-voice.-2018-09-05.event-destination-definition/enabled :portkey.aws.sms-voice.-2018-09-05/kinesis-firehose-destination :portkey.aws.sms-voice.-2018-09-05.event-destination-definition/matching-event-types :portkey.aws.sms-voice.-2018-09-05/sns-destination]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/configuration-sets (clojure.spec.alpha/coll-of :portkey.aws.sms-voice.-2018-09-05/word-characters-with-delimiters))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-response/next-token (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/next-token-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05/configuration-sets :portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/event-type #{"INITIATED_CALL" :ringing :completed-call "BUSY" "COMPLETED_CALL" :busy "ANSWERED" "NO_ANSWER" :answered :no-answer "FAILED" :initiated-call :failed "RINGING"})

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.call-instructions-message-type/text (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/call-instructions-message-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.call-instructions-message-type/text]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.voice-message-content/call-instructions-message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/call-instructions-message-type))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.voice-message-content/plain-text-message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/plain-text-message-type))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.voice-message-content/ssml-message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/ssml-message-type))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/voice-message-content (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.voice-message-content/call-instructions-message :portkey.aws.sms-voice.-2018-09-05.voice-message-content/plain-text-message :portkey.aws.sms-voice.-2018-09-05.voice-message-content/ssml-message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-event-destination-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-event-destination-request/event-destination-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-event-destination-request/event-destination-name :portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-event-destination-request/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/word-characters-with-delimiters (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.ssml-message-type/language-code (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.ssml-message-type/text (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.ssml-message-type/voice-id (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/ssml-message-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.ssml-message-type/language-code :portkey.aws.sms-voice.-2018-09-05.ssml-message-type/text :portkey.aws.sms-voice.-2018-09-05.ssml-message-type/voice-id]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms-voice.-2018-09-05.delete-configuration-set-request/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-request/next-token (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-request/page-size (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-request/next-token :portkey.aws.sms-voice.-2018-09-05.list-configuration-sets-request/page-size]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.create-configuration-set-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/word-characters-with-delimiters))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.create-configuration-set-request/configuration-set-name]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.get-configuration-set-event-destinations-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms-voice.-2018-09-05.get-configuration-set-event-destinations-request/configuration-set-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/event-destination (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/event-destination-definition))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/event-destination-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/event-destination-name :portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/configuration-set-name] :opt-un [:portkey.aws.sms-voice.-2018-09-05.update-configuration-set-event-destination-request/event-destination]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/event-destination (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/event-destination-definition))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/event-destination-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/configuration-set-name] :opt-un [:portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/event-destination :portkey.aws.sms-voice.-2018-09-05.create-configuration-set-event-destination-request/event-destination-name]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.kinesis-firehose-destination/delivery-stream-arn (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.kinesis-firehose-destination/iam-role-arn (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/kinesis-firehose-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.kinesis-firehose-destination/delivery-stream-arn :portkey.aws.sms-voice.-2018-09-05.kinesis-firehose-destination/iam-role-arn]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/timestamp-iso-8601 clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/event-types (clojure.spec.alpha/coll-of :portkey.aws.sms-voice.-2018-09-05/event-type))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-response/message-id (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/send-voice-message-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.send-voice-message-response/message-id]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/language-code (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/text (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/voice-id (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/plain-text-message-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/language-code :portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/text :portkey.aws.sms-voice.-2018-09-05.plain-text-message-type/voice-id]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/event-destinations (clojure.spec.alpha/coll-of :portkey.aws.sms-voice.-2018-09-05/event-destination))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/timestamp-unix clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/next-token-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/caller-id (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/configuration-set-name (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/word-characters-with-delimiters))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/content (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/voice-message-content))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/destination-phone-number (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/origination-phone-number (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/send-voice-message-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/caller-id :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/configuration-set-name :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/content :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/destination-phone-number :portkey.aws.sms-voice.-2018-09-05.send-voice-message-request/origination-phone-number]))

(clojure.spec.alpha/def :portkey.aws.sms-voice.-2018-09-05/boolean clojure.core/boolean?)

(clojure.core/defn create-configuration-set ([] (create-configuration-set {})) ([create-configuration-set-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-configuration-set-request create-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConfigurationSet", :http.request.configuration/output-deser-fn response-create-configuration-set-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "LimitExceededException" :portkey.aws.sms-voice.-2018-09-05/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception, "AlreadyExistsException" :portkey.aws.sms-voice.-2018-09-05/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set :args (clojure.spec.alpha/? :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-response))

(clojure.core/defn create-configuration-set-event-destination ([create-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-configuration-set-event-destination-request create-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets/{ConfigurationSetName}/event-destinations", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-create-configuration-set-event-destination-response, :http.request.spec/error-spec {"BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "LimitExceededException" :portkey.aws.sms-voice.-2018-09-05/limit-exceeded-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception, "NotFoundException" :portkey.aws.sms-voice.-2018-09-05/not-found-exception, "TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "AlreadyExistsException" :portkey.aws.sms-voice.-2018-09-05/already-exists-exception}})))))
(clojure.spec.alpha/fdef create-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/create-configuration-set-event-destination-response))

(clojure.core/defn delete-configuration-set ([delete-configuration-set-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-configuration-set-request delete-configuration-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets/{ConfigurationSetName}", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationSet", :http.request.configuration/output-deser-fn response-delete-configuration-set-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.sms-voice.-2018-09-05/not-found-exception, "TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set :args (clojure.spec.alpha/tuple :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-response))

(clojure.core/defn delete-configuration-set-event-destination ([delete-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-configuration-set-event-destination-request delete-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets/{ConfigurationSetName}/event-destinations/{EventDestinationName}", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-delete-configuration-set-event-destination-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.sms-voice.-2018-09-05/not-found-exception, "TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef delete-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/delete-configuration-set-event-destination-response))

(clojure.core/defn get-configuration-set-event-destinations ([get-configuration-set-event-destinations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-configuration-set-event-destinations-request get-configuration-set-event-destinations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets/{ConfigurationSetName}/event-destinations", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConfigurationSetEventDestinations", :http.request.configuration/output-deser-fn response-get-configuration-set-event-destinations-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.sms-voice.-2018-09-05/not-found-exception, "TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-configuration-set-event-destinations :args (clojure.spec.alpha/tuple :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/get-configuration-set-event-destinations-response))

(clojure.core/defn list-configuration-sets ([] (list-configuration-sets {})) ([list-configuration-sets-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-configuration-sets-request list-configuration-sets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListConfigurationSets", :http.request.configuration/output-deser-fn response-list-configuration-sets-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-configuration-sets :args (clojure.spec.alpha/? :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/list-configuration-sets-response))

(clojure.core/defn send-voice-message ([] (send-voice-message {})) ([send-voice-message-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-send-voice-message-request send-voice-message-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/send-voice-message-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/voice/message", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/send-voice-message-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SendVoiceMessage", :http.request.configuration/output-deser-fn response-send-voice-message-response, :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef send-voice-message :args (clojure.spec.alpha/? :portkey.aws.sms-voice.-2018-09-05/send-voice-message-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/send-voice-message-response))

(clojure.core/defn update-configuration-set-event-destination ([update-configuration-set-event-destination-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-configuration-set-event-destination-request update-configuration-set-event-destination-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.sms-voice.-2018-09-05/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/v1/sms-voice/configuration-sets/{ConfigurationSetName}/event-destinations/{EventDestinationName}", :http.request.configuration/version "2018-09-05", :http.request.configuration/service-id "Pinpoint SMS Voice", :http.request.spec/input-spec :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateConfigurationSetEventDestination", :http.request.configuration/output-deser-fn response-update-configuration-set-event-destination-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.sms-voice.-2018-09-05/not-found-exception, "TooManyRequestsException" :portkey.aws.sms-voice.-2018-09-05/too-many-requests-exception, "BadRequestException" :portkey.aws.sms-voice.-2018-09-05/bad-request-exception, "InternalServiceErrorException" :portkey.aws.sms-voice.-2018-09-05/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef update-configuration-set-event-destination :args (clojure.spec.alpha/tuple :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-request) :ret (clojure.spec.alpha/and :portkey.aws.sms-voice.-2018-09-05/update-configuration-set-event-destination-response))
