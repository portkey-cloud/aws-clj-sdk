(ns portkey.aws.lex-models.-2017-04-19 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "lex", :region "eu-west-1"},
    :ssl-common-name "models.lex.eu-west-1.amazonaws.com",
    :endpoint "https://models.lex.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "lex", :region "us-west-2"},
    :ssl-common-name "models.lex.us-west-2.amazonaws.com",
    :endpoint "https://models.lex.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "lex", :region "us-east-1"},
    :ssl-common-name "models.lex.us-east-1.amazonaws.com",
    :endpoint "https://models.lex.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-merge-strategy)

(clojure.core/declare ser-slot-list)

(clojure.core/declare ser-lambda-arn)

(clojure.core/declare ser-prompt)

(clojure.core/declare ser-locale)

(clojure.core/declare ser-alias-name-or-list-all)

(clojure.core/declare ser-slot-value-selection-strategy)

(clojure.core/declare ser-prompt-max-attempts)

(clojure.core/declare ser-numerical-version)

(clojure.core/declare ser-statement)

(clojure.core/declare ser-user-id)

(clojure.core/declare ser-code-hook)

(clojure.core/declare ser-intent-name)

(clojure.core/declare ser-slot-utterance-list)

(clojure.core/declare ser-response-card)

(clojure.core/declare ser-group-number)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-priority)

(clojure.core/declare ser-status-type)

(clojure.core/declare ser-bot-versions)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-session-ttl)

(clojure.core/declare ser-content-string)

(clojure.core/declare ser-follow-up-prompt)

(clojure.core/declare ser-builtin-intent-signature)

(clojure.core/declare ser-intent-list)

(clojure.core/declare ser-fulfillment-activity-type)

(clojure.core/declare ser-utterance)

(clojure.core/declare ser-value)

(clojure.core/declare ser-description)

(clojure.core/declare ser-message)

(clojure.core/declare ser-slot-type-name)

(clojure.core/declare ser-export-type)

(clojure.core/declare ser-custom-or-builtin-slot-type-name)

(clojure.core/declare ser-enumeration-values)

(clojure.core/declare ser-bot-name)

(clojure.core/declare ser-string)

(clojure.core/declare ser-slot)

(clojure.core/declare ser-slot-name)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-fulfillment-activity)

(clojure.core/declare ser-message-list)

(clojure.core/declare ser-slot-constraint)

(clojure.core/declare ser-message-version)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-version)

(clojure.core/declare ser-intent-utterance-list)

(clojure.core/declare ser-enumeration-value)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-alias-name)

(clojure.core/declare ser-name)

(clojure.core/declare ser-bot-channel-name)

(clojure.core/declare ser-process-behavior)

(clojure.core/declare ser-synonym-list)

(clojure.core/declare ser-intent)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-merge-strategy [input] #:http.request.field{:value (clojure.core/get {"OVERWRITE_LATEST" "OVERWRITE_LATEST", :overwrite-latest "OVERWRITE_LATEST", "FAIL_ON_CONFLICT" "FAIL_ON_CONFLICT", :fail-on-conflict "FAIL_ON_CONFLICT"} input), :shape "MergeStrategy"})

(clojure.core/defn- ser-slot-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-slot coll) #:http.request.field{:shape "Slot"}))) input), :shape "SlotList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-lambda-arn [input] #:http.request.field{:value input, :shape "LambdaARN"})

(clojure.core/defn- ser-prompt [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-list (:messages input)) #:http.request.field{:name "messages", :shape "MessageList"}) (clojure.core/into (ser-prompt-max-attempts (:max-attempts input)) #:http.request.field{:name "maxAttempts", :shape "PromptMaxAttempts"})], :shape "Prompt", :type "structure"} (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"}))))

(clojure.core/defn- ser-locale [input] #:http.request.field{:value (clojure.core/get {"en-US" "en-US", :en-us "en-US", "en-GB" "en-GB", :en-gb "en-GB", "de-DE" "de-DE", :de-de "de-DE"} input), :shape "Locale"})

(clojure.core/defn- ser-alias-name-or-list-all [input] #:http.request.field{:value input, :shape "AliasNameOrListAll"})

(clojure.core/defn- ser-slot-value-selection-strategy [input] #:http.request.field{:value (clojure.core/get {"ORIGINAL_VALUE" "ORIGINAL_VALUE", :original-value "ORIGINAL_VALUE", "TOP_RESOLUTION" "TOP_RESOLUTION", :top-resolution "TOP_RESOLUTION"} input), :shape "SlotValueSelectionStrategy"})

(clojure.core/defn- ser-prompt-max-attempts [input] #:http.request.field{:value input, :shape "PromptMaxAttempts"})

(clojure.core/defn- ser-numerical-version [input] #:http.request.field{:value input, :shape "NumericalVersion"})

(clojure.core/defn- ser-statement [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-message-list (:messages input)) #:http.request.field{:name "messages", :shape "MessageList"})], :shape "Statement", :type "structure"} (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"}))))

(clojure.core/defn- ser-user-id [input] #:http.request.field{:value input, :shape "UserId"})

(clojure.core/defn- ser-code-hook [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-arn (:uri input)) #:http.request.field{:name "uri", :shape "LambdaARN"}) (clojure.core/into (ser-message-version (:message-version input)) #:http.request.field{:name "messageVersion", :shape "MessageVersion"})], :shape "CodeHook", :type "structure"}))

(clojure.core/defn- ser-intent-name [input] #:http.request.field{:value input, :shape "IntentName"})

(clojure.core/defn- ser-slot-utterance-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-utterance coll) #:http.request.field{:shape "Utterance"}))) input), :shape "SlotUtteranceList", :type "list", :max 10, :min 0})

(clojure.core/defn- ser-response-card [input] #:http.request.field{:value input, :shape "ResponseCard"})

(clojure.core/defn- ser-group-number [input] #:http.request.field{:value input, :shape "GroupNumber"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-priority [input] #:http.request.field{:value input, :shape "Priority"})

(clojure.core/defn- ser-status-type [input] #:http.request.field{:value (clojure.core/get {"Detected" "Detected", :detected "Detected", "Missed" "Missed", :missed "Missed"} input), :shape "StatusType"})

(clojure.core/defn- ser-bot-versions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-version coll) #:http.request.field{:shape "Version"}))) input), :shape "BotVersions", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value (clojure.core/get {"PlainText" "PlainText", :plain-text "PlainText", "SSML" "SSML", :ssml "SSML", "CustomPayload" "CustomPayload", :custom-payload "CustomPayload"} input), :shape "ContentType"})

(clojure.core/defn- ser-session-ttl [input] #:http.request.field{:value input, :shape "SessionTTL"})

(clojure.core/defn- ser-content-string [input] #:http.request.field{:value input, :shape "ContentString"})

(clojure.core/defn- ser-follow-up-prompt [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-prompt (:prompt input)) #:http.request.field{:name "prompt", :shape "Prompt"}) (clojure.core/into (ser-statement (:rejection-statement input)) #:http.request.field{:name "rejectionStatement", :shape "Statement"})], :shape "FollowUpPrompt", :type "structure"}))

(clojure.core/defn- ser-builtin-intent-signature [input] #:http.request.field{:value input, :shape "BuiltinIntentSignature"})

(clojure.core/defn- ser-intent-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-intent coll) #:http.request.field{:shape "Intent"}))) input), :shape "IntentList", :type "list"})

(clojure.core/defn- ser-fulfillment-activity-type [input] #:http.request.field{:value (clojure.core/get {"ReturnIntent" "ReturnIntent", :return-intent "ReturnIntent", "CodeHook" "CodeHook", :code-hook "CodeHook"} input), :shape "FulfillmentActivityType"})

(clojure.core/defn- ser-utterance [input] #:http.request.field{:value input, :shape "Utterance"})

(clojure.core/defn- ser-value [input] #:http.request.field{:value input, :shape "Value"})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-message [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-content-type (:content-type input)) #:http.request.field{:name "contentType", :shape "ContentType"}) (clojure.core/into (ser-content-string (:content input)) #:http.request.field{:name "content", :shape "ContentString"})], :shape "Message", :type "structure"} (clojure.core/contains? input :group-number) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-group-number (input :group-number)) #:http.request.field{:name "groupNumber", :shape "GroupNumber"}))))

(clojure.core/defn- ser-slot-type-name [input] #:http.request.field{:value input, :shape "SlotTypeName"})

(clojure.core/defn- ser-export-type [input] #:http.request.field{:value (clojure.core/get {"ALEXA_SKILLS_KIT" "ALEXA_SKILLS_KIT", :alexa-skills-kit "ALEXA_SKILLS_KIT", "LEX" "LEX", :lex "LEX"} input), :shape "ExportType"})

(clojure.core/defn- ser-custom-or-builtin-slot-type-name [input] #:http.request.field{:value input, :shape "CustomOrBuiltinSlotTypeName"})

(clojure.core/defn- ser-enumeration-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-enumeration-value coll) #:http.request.field{:shape "EnumerationValue"}))) input), :shape "EnumerationValues", :type "list", :max 10000, :min 1})

(clojure.core/defn- ser-bot-name [input] #:http.request.field{:value input, :shape "BotName"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-slot [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-slot-name (:name input)) #:http.request.field{:name "name", :shape "SlotName"}) (clojure.core/into (ser-slot-constraint (:slot-constraint input)) #:http.request.field{:name "slotConstraint", :shape "SlotConstraint"})], :shape "Slot", :type "structure"} (clojure.core/contains? input :priority) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-priority (input :priority)) #:http.request.field{:name "priority", :shape "Priority"})) (clojure.core/contains? input :response-card) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-response-card (input :response-card)) #:http.request.field{:name "responseCard", :shape "ResponseCard"})) (clojure.core/contains? input :slot-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-or-builtin-slot-type-name (input :slot-type)) #:http.request.field{:name "slotType", :shape "CustomOrBuiltinSlotTypeName"})) (clojure.core/contains? input :slot-type-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :slot-type-version)) #:http.request.field{:name "slotTypeVersion", :shape "Version"})) (clojure.core/contains? input :sample-utterances) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-utterance-list (input :sample-utterances)) #:http.request.field{:name "sampleUtterances", :shape "SlotUtteranceList"})) (clojure.core/contains? input :value-elicitation-prompt) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :value-elicitation-prompt)) #:http.request.field{:name "valueElicitationPrompt", :shape "Prompt"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- ser-slot-name [input] #:http.request.field{:value input, :shape "SlotName"})

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"BOT" "BOT", :bot "BOT", "INTENT" "INTENT", :intent "INTENT", "SLOT_TYPE" "SLOT_TYPE", :slot-type "SLOT_TYPE"} input), :shape "ResourceType"})

(clojure.core/defn- ser-fulfillment-activity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-fulfillment-activity-type (:type input)) #:http.request.field{:name "type", :shape "FulfillmentActivityType"})], :shape "FulfillmentActivity", :type "structure"} (clojure.core/contains? input :code-hook) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-hook (input :code-hook)) #:http.request.field{:name "codeHook", :shape "CodeHook"}))))

(clojure.core/defn- ser-message-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-message coll) #:http.request.field{:shape "Message"}))) input), :shape "MessageList", :type "list", :max 15, :min 1})

(clojure.core/defn- ser-slot-constraint [input] #:http.request.field{:value (clojure.core/get {"Required" "Required", :required "Required", "Optional" "Optional", :optional "Optional"} input), :shape "SlotConstraint"})

(clojure.core/defn- ser-message-version [input] #:http.request.field{:value input, :shape "MessageVersion"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-intent-utterance-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-utterance coll) #:http.request.field{:shape "Utterance"}))) input), :shape "IntentUtteranceList", :type "list", :max 1500, :min 0})

(clojure.core/defn- ser-enumeration-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-value (:value input)) #:http.request.field{:name "value", :shape "Value"})], :shape "EnumerationValue", :type "structure"} (clojure.core/contains? input :synonyms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-synonym-list (input :synonyms)) #:http.request.field{:name "synonyms", :shape "SynonymList"}))))

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-alias-name [input] #:http.request.field{:value input, :shape "AliasName"})

(clojure.core/defn- ser-name [input] #:http.request.field{:value input, :shape "Name"})

(clojure.core/defn- ser-bot-channel-name [input] #:http.request.field{:value input, :shape "BotChannelName"})

(clojure.core/defn- ser-process-behavior [input] #:http.request.field{:value (clojure.core/get {"SAVE" "SAVE", :save "SAVE", "BUILD" "BUILD", :build "BUILD"} input), :shape "ProcessBehavior"})

(clojure.core/defn- ser-synonym-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-value coll) #:http.request.field{:shape "Value"}))) input), :shape "SynonymList", :type "list"})

(clojure.core/defn- ser-intent [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-intent-name (:intent-name input)) #:http.request.field{:name "intentName", :shape "IntentName"}) (clojure.core/into (ser-version (:intent-version input)) #:http.request.field{:name "intentVersion", :shape "Version"})], :shape "Intent", :type "structure"}))

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-put-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})], :body [(clojure.core/into (ser-version (input :bot-version)) #:http.request.field{:name "botVersion", :shape "Version"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-delete-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-get-bots-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bot-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "BotName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-bot-channel-associations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name-or-list-all (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasNameOrListAll", :location "uri", :location-name "aliasName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bot-channel-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "BotChannelName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-put-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})], :body [(clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale"}) (clojure.core/into (ser-boolean (input :child-directed)) #:http.request.field{:name "childDirected", :shape "Boolean"})]} (clojure.core/contains? input :intents) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-list (input :intents)) #:http.request.field{:name "intents", :shape "IntentList"})) (clojure.core/contains? input :idle-session-ttl-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-ttl (input :idle-session-ttl-in-seconds)) #:http.request.field{:name "idleSessionTTLInSeconds", :shape "SessionTTL"})) (clojure.core/contains? input :clarification-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :clarification-prompt)) #:http.request.field{:name "clarificationPrompt", :shape "Prompt"})) (clojure.core/contains? input :process-behavior) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-process-behavior (input :process-behavior)) #:http.request.field{:name "processBehavior", :shape "ProcessBehavior"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"})) (clojure.core/contains? input :abort-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :abort-statement)) #:http.request.field{:name "abortStatement", :shape "Statement"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :voice-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :voice-id)) #:http.request.field{:name "voiceId", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-create-bot-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-delete-intent-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-put-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"})) (clojure.core/contains? input :enumeration-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-enumeration-values (input :enumeration-values)) #:http.request.field{:name "enumerationValues", :shape "EnumerationValues"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :value-selection-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-value-selection-strategy (input :value-selection-strategy)) #:http.request.field{:name "valueSelectionStrategy", :shape "SlotValueSelectionStrategy"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"}))))

(clojure.core/defn- req-create-intent-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-create-slot-type-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"}))))

(clojure.core/defn- req-get-export-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-name (input :name)) #:http.request.field{:name "name", :shape "Name", :location "querystring", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "querystring", :location-name "version"}) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType", :location "querystring", :location-name "resourceType"}) (clojure.core/into (ser-export-type (input :export-type)) #:http.request.field{:name "exportType", :shape "ExportType", :location "querystring", :location-name "exportType"})]}))

(clojure.core/defn- req-get-slot-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-type-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "SlotTypeName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-builtin-intents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale", :location "querystring", :location-name "locale"})) (clojure.core/contains? input :signature-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signature-contains)) #:http.request.field{:name "signatureContains", :shape "String", :location "querystring", :location-name "signatureContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-delete-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]}))

(clojure.core/defn- req-delete-slot-type-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-delete-bot-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"}) (clojure.core/into (ser-numerical-version (input :version)) #:http.request.field{:name "version", :shape "NumericalVersion", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-get-bot-channel-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-channel-name (input :name)) #:http.request.field{:name "name", :shape "BotChannelName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasName", :location "uri", :location-name "aliasName"})]}))

(clojure.core/defn- req-get-intents-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "IntentName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-bot-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-slot-type-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-builtin-slot-types-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :locale) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-locale (input :locale)) #:http.request.field{:name "locale", :shape "Locale", :location "querystring", :location-name "locale"})) (clojure.core/contains? input :signature-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :signature-contains)) #:http.request.field{:name "signatureContains", :shape "String", :location "querystring", :location-name "signatureContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-builtin-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-builtin-intent-signature (input :signature)) #:http.request.field{:name "signature", :shape "BuiltinIntentSignature", :location "uri", :location-name "signature"})]}))

(clojure.core/defn- req-delete-utterances-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-user-id (input :user-id)) #:http.request.field{:name "userId", :shape "UserId", :location "uri", :location-name "userId"})]}))

(clojure.core/defn- req-start-import-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-blob (input :payload)) #:http.request.field{:name "payload", :shape "Blob"}) (clojure.core/into (ser-resource-type (input :resource-type)) #:http.request.field{:name "resourceType", :shape "ResourceType"}) (clojure.core/into (ser-merge-strategy (input :merge-strategy)) #:http.request.field{:name "mergeStrategy", :shape "MergeStrategy"})]}))

(clojure.core/defn- req-delete-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-delete-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]}))

(clojure.core/defn- req-delete-bot-channel-association-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-channel-name (input :name)) #:http.request.field{:name "name", :shape "BotChannelName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"}) (clojure.core/into (ser-alias-name (input :bot-alias)) #:http.request.field{:name "botAlias", :shape "AliasName", :location "uri", :location-name "aliasName"})]}))

(clojure.core/defn- req-get-intent-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"}))))

(clojure.core/defn- req-get-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-put-intent-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-intent-name (input :name)) #:http.request.field{:name "name", :shape "IntentName", :location "uri", :location-name "name"})]} (clojure.core/contains? input :follow-up-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-follow-up-prompt (input :follow-up-prompt)) #:http.request.field{:name "followUpPrompt", :shape "FollowUpPrompt"})) (clojure.core/contains? input :fulfillment-activity) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-fulfillment-activity (input :fulfillment-activity)) #:http.request.field{:name "fulfillmentActivity", :shape "FulfillmentActivity"})) (clojure.core/contains? input :slots) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-slot-list (input :slots)) #:http.request.field{:name "slots", :shape "SlotList"})) (clojure.core/contains? input :parent-intent-signature) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-builtin-intent-signature (input :parent-intent-signature)) #:http.request.field{:name "parentIntentSignature", :shape "BuiltinIntentSignature"})) (clojure.core/contains? input :confirmation-prompt) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prompt (input :confirmation-prompt)) #:http.request.field{:name "confirmationPrompt", :shape "Prompt"})) (clojure.core/contains? input :rejection-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :rejection-statement)) #:http.request.field{:name "rejectionStatement", :shape "Statement"})) (clojure.core/contains? input :create-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :create-version)) #:http.request.field{:name "createVersion", :shape "Boolean"})) (clojure.core/contains? input :dialog-code-hook) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-hook (input :dialog-code-hook)) #:http.request.field{:name "dialogCodeHook", :shape "CodeHook"})) (clojure.core/contains? input :conclusion-statement) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-statement (input :conclusion-statement)) #:http.request.field{:name "conclusionStatement", :shape "Statement"})) (clojure.core/contains? input :sample-utterances) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-intent-utterance-list (input :sample-utterances)) #:http.request.field{:name "sampleUtterances", :shape "IntentUtteranceList"})) (clojure.core/contains? input :checksum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :checksum)) #:http.request.field{:name "checksum", :shape "String"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "description", :shape "Description"}))))

(clojure.core/defn- req-get-slot-type-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-slot-type-name (input :name)) #:http.request.field{:name "name", :shape "SlotTypeName", :location "uri", :location-name "name"}) (clojure.core/into (ser-version (input :version)) #:http.request.field{:name "version", :shape "Version", :location "uri", :location-name "version"})]}))

(clojure.core/defn- req-get-bot-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :name)) #:http.request.field{:name "name", :shape "BotName", :location "uri", :location-name "name"}) (clojure.core/into (ser-string (input :version-or-alias)) #:http.request.field{:name "versionOrAlias", :shape "String", :location "uri", :location-name "versionoralias"})]}))

(clojure.core/defn- req-get-bot-aliases-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-name (input :name-contains)) #:http.request.field{:name "nameContains", :shape "AliasName", :location "querystring", :location-name "nameContains"}))))

(clojure.core/defn- req-get-import-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :import-id)) #:http.request.field{:name "importId", :shape "String", :location "uri", :location-name "importId"})]}))

(clojure.core/defn- req-get-bot-alias-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-alias-name (input :name)) #:http.request.field{:name "name", :shape "AliasName", :location "uri", :location-name "name"}) (clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botName"})]}))

(clojure.core/defn- req-get-utterances-view-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-bot-name (input :bot-name)) #:http.request.field{:name "botName", :shape "BotName", :location "uri", :location-name "botname"})], :querystring [(clojure.core/into (ser-bot-versions (input :bot-versions)) #:http.request.field{:name "botVersions", :shape "BotVersions", :location "querystring", :location-name "bot_versions"}) (clojure.core/into (ser-status-type (input :status-type)) #:http.request.field{:name "statusType", :shape "StatusType", :location "querystring", :location-name "status_type"})]}))

(clojure.core/declare deser-bot-metadata)

(clojure.core/declare deser-merge-strategy)

(clojure.core/declare deser-slot-list)

(clojure.core/declare deser-bot-alias-metadata)

(clojure.core/declare deser-string-list)

(clojure.core/declare deser-locale-list)

(clojure.core/declare deser-builtin-intent-metadata-list)

(clojure.core/declare deser-resource-reference)

(clojure.core/declare deser-lambda-arn)

(clojure.core/declare deser-prompt)

(clojure.core/declare deser-import-status)

(clojure.core/declare deser-channel-configuration-map)

(clojure.core/declare deser-export-status)

(clojure.core/declare deser-locale)

(clojure.core/declare deser-utterance-data)

(clojure.core/declare deser-slot-value-selection-strategy)

(clojure.core/declare deser-prompt-max-attempts)

(clojure.core/declare deser-builtin-intent-slot-list)

(clojure.core/declare deser-numerical-version)

(clojure.core/declare deser-utterance-list)

(clojure.core/declare deser-statement)

(clojure.core/declare deser-code-hook)

(clojure.core/declare deser-count)

(clojure.core/declare deser-intent-name)

(clojure.core/declare deser-slot-utterance-list)

(clojure.core/declare deser-response-card)

(clojure.core/declare deser-status)

(clojure.core/declare deser-group-number)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-priority)

(clojure.core/declare deser-utterance-string)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-session-ttl)

(clojure.core/declare deser-bot-alias-metadata-list)

(clojure.core/declare deser-content-string)

(clojure.core/declare deser-follow-up-prompt)

(clojure.core/declare deser-builtin-intent-signature)

(clojure.core/declare deser-builtin-intent-slot)

(clojure.core/declare deser-intent-list)

(clojure.core/declare deser-fulfillment-activity-type)

(clojure.core/declare deser-bot-channel-association-list)

(clojure.core/declare deser-utterance)

(clojure.core/declare deser-value)

(clojure.core/declare deser-list-of-utterance)

(clojure.core/declare deser-description)

(clojure.core/declare deser-message)

(clojure.core/declare deser-slot-type-name)

(clojure.core/declare deser-export-type)

(clojure.core/declare deser-custom-or-builtin-slot-type-name)

(clojure.core/declare deser-enumeration-values)

(clojure.core/declare deser-bot-name)

(clojure.core/declare deser-string)

(clojure.core/declare deser-slot)

(clojure.core/declare deser-builtin-slot-type-metadata-list)

(clojure.core/declare deser-slot-name)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-builtin-slot-type-signature)

(clojure.core/declare deser-fulfillment-activity)

(clojure.core/declare deser-channel-status)

(clojure.core/declare deser-message-list)

(clojure.core/declare deser-intent-metadata)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-slot-constraint)

(clojure.core/declare deser-slot-type-metadata)

(clojure.core/declare deser-intent-metadata-list)

(clojure.core/declare deser-message-version)

(clojure.core/declare deser-slot-type-metadata-list)

(clojure.core/declare deser-reference-type)

(clojure.core/declare deser-version)

(clojure.core/declare deser-builtin-intent-metadata)

(clojure.core/declare deser-intent-utterance-list)

(clojure.core/declare deser-enumeration-value)

(clojure.core/declare deser-alias-name)

(clojure.core/declare deser-name)

(clojure.core/declare deser-bot-metadata-list)

(clojure.core/declare deser-bot-channel-association)

(clojure.core/declare deser-bot-channel-name)

(clojure.core/declare deser-builtin-slot-type-metadata)

(clojure.core/declare deser-synonym-list)

(clojure.core/declare deser-lists-of-utterances)

(clojure.core/declare deser-intent)

(clojure.core/declare deser-channel-type)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-bot-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-bot-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-status (input "status"))) (clojure.core/contains? input "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (input "lastUpdatedDate"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-timestamp (input "createdDate"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version")))))

(clojure.core/defn- deser-merge-strategy [input] (clojure.core/get {"OVERWRITE_LATEST" :overwrite-latest, "FAIL_ON_CONFLICT" :fail-on-conflict} input))

(clojure.core/defn- deser-slot-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-slot coll))) input))

(clojure.core/defn- deser-bot-alias-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-alias-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "botVersion") (clojure.core/assoc :bot-version (deser-version (input "botVersion"))) (clojure.core/contains? input "botName") (clojure.core/assoc :bot-name (deser-bot-name (input "botName"))) (clojure.core/contains? input "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (input "lastUpdatedDate"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-timestamp (input "createdDate"))) (clojure.core/contains? input "checksum") (clojure.core/assoc :checksum (deser-string (input "checksum")))))

(clojure.core/defn- deser-string-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-locale-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-locale coll))) input))

(clojure.core/defn- deser-builtin-intent-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-builtin-intent-metadata coll))) input))

(clojure.core/defn- deser-resource-reference [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-name (input "name"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version")))))

(clojure.core/defn- deser-lambda-arn [input] input)

(clojure.core/defn- deser-prompt [input] (clojure.core/cond-> {:messages (deser-message-list (input "messages")), :max-attempts (deser-prompt-max-attempts (input "maxAttempts"))} (clojure.core/contains? input "responseCard") (clojure.core/assoc :response-card (deser-response-card (input "responseCard")))))

(clojure.core/defn- deser-import-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "COMPLETE" :complete, "FAILED" :failed} input))

(clojure.core/defn- deser-channel-configuration-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-export-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "READY" :ready, "FAILED" :failed} input))

(clojure.core/defn- deser-locale [input] (clojure.core/get {"en-US" :en-us, "en-GB" :en-gb, "de-DE" :de-de} input))

(clojure.core/defn- deser-utterance-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "utteranceString") (clojure.core/assoc :utterance-string (deser-utterance-string (input "utteranceString"))) (clojure.core/contains? input "count") (clojure.core/assoc :count (deser-count (input "count"))) (clojure.core/contains? input "distinctUsers") (clojure.core/assoc :distinct-users (deser-count (input "distinctUsers"))) (clojure.core/contains? input "firstUtteredDate") (clojure.core/assoc :first-uttered-date (deser-timestamp (input "firstUtteredDate"))) (clojure.core/contains? input "lastUtteredDate") (clojure.core/assoc :last-uttered-date (deser-timestamp (input "lastUtteredDate")))))

(clojure.core/defn- deser-slot-value-selection-strategy [input] (clojure.core/get {"ORIGINAL_VALUE" :original-value, "TOP_RESOLUTION" :top-resolution} input))

(clojure.core/defn- deser-prompt-max-attempts [input] input)

(clojure.core/defn- deser-builtin-intent-slot-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-builtin-intent-slot coll))) input))

(clojure.core/defn- deser-numerical-version [input] input)

(clojure.core/defn- deser-utterance-list [input] (clojure.core/cond-> {} (clojure.core/contains? input "botVersion") (clojure.core/assoc :bot-version (deser-version (input "botVersion"))) (clojure.core/contains? input "utterances") (clojure.core/assoc :utterances (deser-list-of-utterance (input "utterances")))))

(clojure.core/defn- deser-statement [input] (clojure.core/cond-> {:messages (deser-message-list (input "messages"))} (clojure.core/contains? input "responseCard") (clojure.core/assoc :response-card (deser-response-card (input "responseCard")))))

(clojure.core/defn- deser-code-hook [input] (clojure.core/cond-> {:uri (deser-lambda-arn (input "uri")), :message-version (deser-message-version (input "messageVersion"))}))

(clojure.core/defn- deser-count [input] input)

(clojure.core/defn- deser-intent-name [input] input)

(clojure.core/defn- deser-slot-utterance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utterance coll))) input))

(clojure.core/defn- deser-response-card [input] input)

(clojure.core/defn- deser-status [input] (clojure.core/get {"BUILDING" :building, "READY" :ready, "READY_BASIC_TESTING" :ready-basic-testing, "FAILED" :failed, "NOT_BUILT" :not-built} input))

(clojure.core/defn- deser-group-number [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-priority [input] input)

(clojure.core/defn- deser-utterance-string [input] input)

(clojure.core/defn- deser-content-type [input] (clojure.core/get {"PlainText" :plain-text, "SSML" :ssml, "CustomPayload" :custom-payload} input))

(clojure.core/defn- deser-session-ttl [input] input)

(clojure.core/defn- deser-bot-alias-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bot-alias-metadata coll))) input))

(clojure.core/defn- deser-content-string [input] input)

(clojure.core/defn- deser-follow-up-prompt [input] (clojure.core/cond-> {:prompt (deser-prompt (input "prompt")), :rejection-statement (deser-statement (input "rejectionStatement"))}))

(clojure.core/defn- deser-builtin-intent-signature [input] input)

(clojure.core/defn- deser-builtin-intent-slot [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name")))))

(clojure.core/defn- deser-intent-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-intent coll))) input))

(clojure.core/defn- deser-fulfillment-activity-type [input] (clojure.core/get {"ReturnIntent" :return-intent, "CodeHook" :code-hook} input))

(clojure.core/defn- deser-bot-channel-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bot-channel-association coll))) input))

(clojure.core/defn- deser-utterance [input] input)

(clojure.core/defn- deser-value [input] input)

(clojure.core/defn- deser-list-of-utterance [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utterance-data coll))) input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-message [input] (clojure.core/cond-> {:content-type (deser-content-type (input "contentType")), :content (deser-content-string (input "content"))} (clojure.core/contains? input "groupNumber") (clojure.core/assoc :group-number (deser-group-number (input "groupNumber")))))

(clojure.core/defn- deser-slot-type-name [input] input)

(clojure.core/defn- deser-export-type [input] (clojure.core/get {"ALEXA_SKILLS_KIT" :alexa-skills-kit, "LEX" :lex} input))

(clojure.core/defn- deser-custom-or-builtin-slot-type-name [input] input)

(clojure.core/defn- deser-enumeration-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-enumeration-value coll))) input))

(clojure.core/defn- deser-bot-name [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-slot [input] (clojure.core/cond-> {:name (deser-slot-name (input "name")), :slot-constraint (deser-slot-constraint (input "slotConstraint"))} (clojure.core/contains? input "priority") (clojure.core/assoc :priority (deser-priority (input "priority"))) (clojure.core/contains? input "responseCard") (clojure.core/assoc :response-card (deser-response-card (input "responseCard"))) (clojure.core/contains? input "slotType") (clojure.core/assoc :slot-type (deser-custom-or-builtin-slot-type-name (input "slotType"))) (clojure.core/contains? input "slotTypeVersion") (clojure.core/assoc :slot-type-version (deser-version (input "slotTypeVersion"))) (clojure.core/contains? input "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-slot-utterance-list (input "sampleUtterances"))) (clojure.core/contains? input "valueElicitationPrompt") (clojure.core/assoc :value-elicitation-prompt (deser-prompt (input "valueElicitationPrompt"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description")))))

(clojure.core/defn- deser-builtin-slot-type-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-builtin-slot-type-metadata coll))) input))

(clojure.core/defn- deser-slot-name [input] input)

(clojure.core/defn- deser-resource-type [input] (clojure.core/get {"BOT" :bot, "INTENT" :intent, "SLOT_TYPE" :slot-type} input))

(clojure.core/defn- deser-builtin-slot-type-signature [input] input)

(clojure.core/defn- deser-fulfillment-activity [input] (clojure.core/cond-> {:type (deser-fulfillment-activity-type (input "type"))} (clojure.core/contains? input "codeHook") (clojure.core/assoc :code-hook (deser-code-hook (input "codeHook")))))

(clojure.core/defn- deser-channel-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "CREATED" :created, "FAILED" :failed} input))

(clojure.core/defn- deser-message-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-message coll))) input))

(clojure.core/defn- deser-intent-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-intent-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (input "lastUpdatedDate"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-timestamp (input "createdDate"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-slot-constraint [input] (clojure.core/get {"Required" :required, "Optional" :optional} input))

(clojure.core/defn- deser-slot-type-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-slot-type-name (input "name"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description"))) (clojure.core/contains? input "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (input "lastUpdatedDate"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-timestamp (input "createdDate"))) (clojure.core/contains? input "version") (clojure.core/assoc :version (deser-version (input "version")))))

(clojure.core/defn- deser-intent-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-intent-metadata coll))) input))

(clojure.core/defn- deser-message-version [input] input)

(clojure.core/defn- deser-slot-type-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-slot-type-metadata coll))) input))

(clojure.core/defn- deser-reference-type [input] (clojure.core/get {"Intent" :intent, "Bot" :bot, "BotAlias" :bot-alias, "BotChannel" :bot-channel} input))

(clojure.core/defn- deser-version [input] input)

(clojure.core/defn- deser-builtin-intent-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "signature") (clojure.core/assoc :signature (deser-builtin-intent-signature (input "signature"))) (clojure.core/contains? input "supportedLocales") (clojure.core/assoc :supported-locales (deser-locale-list (input "supportedLocales")))))

(clojure.core/defn- deser-intent-utterance-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utterance coll))) input))

(clojure.core/defn- deser-enumeration-value [input] (clojure.core/cond-> {:value (deser-value (input "value"))} (clojure.core/contains? input "synonyms") (clojure.core/assoc :synonyms (deser-synonym-list (input "synonyms")))))

(clojure.core/defn- deser-alias-name [input] input)

(clojure.core/defn- deser-name [input] input)

(clojure.core/defn- deser-bot-metadata-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bot-metadata coll))) input))

(clojure.core/defn- deser-bot-channel-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "botAlias") (clojure.core/assoc :bot-alias (deser-alias-name (input "botAlias"))) (clojure.core/contains? input "createdDate") (clojure.core/assoc :created-date (deser-timestamp (input "createdDate"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-bot-channel-name (input "name"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-channel-status (input "status"))) (clojure.core/contains? input "botConfiguration") (clojure.core/assoc :bot-configuration (deser-channel-configuration-map (input "botConfiguration"))) (clojure.core/contains? input "botName") (clojure.core/assoc :bot-name (deser-bot-name (input "botName"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-channel-type (input "type"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-string (input "failureReason"))) (clojure.core/contains? input "description") (clojure.core/assoc :description (deser-description (input "description")))))

(clojure.core/defn- deser-bot-channel-name [input] input)

(clojure.core/defn- deser-builtin-slot-type-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "signature") (clojure.core/assoc :signature (deser-builtin-slot-type-signature (input "signature"))) (clojure.core/contains? input "supportedLocales") (clojure.core/assoc :supported-locales (deser-locale-list (input "supportedLocales")))))

(clojure.core/defn- deser-synonym-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-value coll))) input))

(clojure.core/defn- deser-lists-of-utterances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-utterance-list coll))) input))

(clojure.core/defn- deser-intent [input] (clojure.core/cond-> {:intent-name (deser-intent-name (input "intentName")), :intent-version (deser-version (input "intentVersion"))}))

(clojure.core/defn- deser-channel-type [input] (clojure.core/get {"Facebook" :facebook, "Slack" :slack, "Twilio-Sms" :twilio-sms, "Kik" :kik} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-get-bots-response ([input] (response-get-bots-response nil input)) ([resultWrapper1274730 input] (clojure.core/let [rawinput1274729 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274731 {"bots" (rawinput1274729 "bots"), "nextToken" (rawinput1274729 "nextToken")}] (clojure.core/cond-> {} (letvar1274731 "bots") (clojure.core/assoc :bots (deser-bot-metadata-list (clojure.core/get-in letvar1274731 ["bots"]))) (letvar1274731 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274731 ["nextToken"])))))))

(clojure.core/defn- response-get-bot-aliases-response ([input] (response-get-bot-aliases-response nil input)) ([resultWrapper1274733 input] (clojure.core/let [rawinput1274732 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274734 {"BotAliases" (rawinput1274732 "BotAliases"), "nextToken" (rawinput1274732 "nextToken")}] (clojure.core/cond-> {} (letvar1274734 "BotAliases") (clojure.core/assoc :bot-aliases (deser-bot-alias-metadata-list (clojure.core/get-in letvar1274734 ["BotAliases"]))) (letvar1274734 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274734 ["nextToken"])))))))

(clojure.core/defn- response-get-export-response ([input] (response-get-export-response nil input)) ([resultWrapper1274736 input] (clojure.core/let [rawinput1274735 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274737 {"name" (rawinput1274735 "name"), "version" (rawinput1274735 "version"), "resourceType" (rawinput1274735 "resourceType"), "exportType" (rawinput1274735 "exportType"), "exportStatus" (rawinput1274735 "exportStatus"), "failureReason" (rawinput1274735 "failureReason"), "url" (rawinput1274735 "url")}] (clojure.core/cond-> {} (letvar1274737 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1274737 ["name"]))) (letvar1274737 "version") (clojure.core/assoc :version (deser-numerical-version (clojure.core/get-in letvar1274737 ["version"]))) (letvar1274737 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1274737 ["resourceType"]))) (letvar1274737 "exportType") (clojure.core/assoc :export-type (deser-export-type (clojure.core/get-in letvar1274737 ["exportType"]))) (letvar1274737 "exportStatus") (clojure.core/assoc :export-status (deser-export-status (clojure.core/get-in letvar1274737 ["exportStatus"]))) (letvar1274737 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1274737 ["failureReason"]))) (letvar1274737 "url") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar1274737 ["url"])))))))

(clojure.core/defn- response-put-bot-response ([input] (response-put-bot-response nil input)) ([resultWrapper1274739 input] (clojure.core/let [rawinput1274738 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274740 {"intents" (rawinput1274738 "intents"), "createdDate" (rawinput1274738 "createdDate"), "idleSessionTTLInSeconds" (rawinput1274738 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1274738 "clarificationPrompt"), "name" (rawinput1274738 "name"), "locale" (rawinput1274738 "locale"), "lastUpdatedDate" (rawinput1274738 "lastUpdatedDate"), "status" (rawinput1274738 "status"), "createVersion" (rawinput1274738 "createVersion"), "abortStatement" (rawinput1274738 "abortStatement"), "version" (rawinput1274738 "version"), "failureReason" (rawinput1274738 "failureReason"), "childDirected" (rawinput1274738 "childDirected"), "checksum" (rawinput1274738 "checksum"), "voiceId" (rawinput1274738 "voiceId"), "description" (rawinput1274738 "description")}] (clojure.core/cond-> {} (letvar1274740 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1274740 ["intents"]))) (letvar1274740 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274740 ["createdDate"]))) (letvar1274740 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1274740 ["idleSessionTTLInSeconds"]))) (letvar1274740 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1274740 ["clarificationPrompt"]))) (letvar1274740 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1274740 ["name"]))) (letvar1274740 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1274740 ["locale"]))) (letvar1274740 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274740 ["lastUpdatedDate"]))) (letvar1274740 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1274740 ["status"]))) (letvar1274740 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1274740 ["createVersion"]))) (letvar1274740 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1274740 ["abortStatement"]))) (letvar1274740 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274740 ["version"]))) (letvar1274740 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1274740 ["failureReason"]))) (letvar1274740 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1274740 ["childDirected"]))) (letvar1274740 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274740 ["checksum"]))) (letvar1274740 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1274740 ["voiceId"]))) (letvar1274740 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274740 ["description"])))))))

(clojure.core/defn- response-get-bot-channel-association-response ([input] (response-get-bot-channel-association-response nil input)) ([resultWrapper1274742 input] (clojure.core/let [rawinput1274741 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274743 {"botAlias" (rawinput1274741 "botAlias"), "createdDate" (rawinput1274741 "createdDate"), "name" (rawinput1274741 "name"), "status" (rawinput1274741 "status"), "botConfiguration" (rawinput1274741 "botConfiguration"), "botName" (rawinput1274741 "botName"), "type" (rawinput1274741 "type"), "failureReason" (rawinput1274741 "failureReason"), "description" (rawinput1274741 "description")}] (clojure.core/cond-> {} (letvar1274743 "botAlias") (clojure.core/assoc :bot-alias (deser-alias-name (clojure.core/get-in letvar1274743 ["botAlias"]))) (letvar1274743 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274743 ["createdDate"]))) (letvar1274743 "name") (clojure.core/assoc :name (deser-bot-channel-name (clojure.core/get-in letvar1274743 ["name"]))) (letvar1274743 "status") (clojure.core/assoc :status (deser-channel-status (clojure.core/get-in letvar1274743 ["status"]))) (letvar1274743 "botConfiguration") (clojure.core/assoc :bot-configuration (deser-channel-configuration-map (clojure.core/get-in letvar1274743 ["botConfiguration"]))) (letvar1274743 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1274743 ["botName"]))) (letvar1274743 "type") (clojure.core/assoc :type (deser-channel-type (clojure.core/get-in letvar1274743 ["type"]))) (letvar1274743 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1274743 ["failureReason"]))) (letvar1274743 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274743 ["description"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1274745 input] (clojure.core/let [rawinput1274744 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274746 {"message" (rawinput1274744 "message")}] (clojure.core/cond-> {} (letvar1274746 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274746 ["message"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1274748 input] (clojure.core/let [rawinput1274747 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274749 {"message" (rawinput1274747 "message")}] (clojure.core/cond-> {} (letvar1274749 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274749 ["message"])))))))

(clojure.core/defn- response-put-bot-alias-response ([input] (response-put-bot-alias-response nil input)) ([resultWrapper1274751 input] (clojure.core/let [rawinput1274750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274752 {"name" (rawinput1274750 "name"), "description" (rawinput1274750 "description"), "botVersion" (rawinput1274750 "botVersion"), "botName" (rawinput1274750 "botName"), "lastUpdatedDate" (rawinput1274750 "lastUpdatedDate"), "createdDate" (rawinput1274750 "createdDate"), "checksum" (rawinput1274750 "checksum")}] (clojure.core/cond-> {} (letvar1274752 "name") (clojure.core/assoc :name (deser-alias-name (clojure.core/get-in letvar1274752 ["name"]))) (letvar1274752 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274752 ["description"]))) (letvar1274752 "botVersion") (clojure.core/assoc :bot-version (deser-version (clojure.core/get-in letvar1274752 ["botVersion"]))) (letvar1274752 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1274752 ["botName"]))) (letvar1274752 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274752 ["lastUpdatedDate"]))) (letvar1274752 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274752 ["createdDate"]))) (letvar1274752 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274752 ["checksum"])))))))

(clojure.core/defn- response-get-utterances-view-response ([input] (response-get-utterances-view-response nil input)) ([resultWrapper1274754 input] (clojure.core/let [rawinput1274753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274755 {"botName" (rawinput1274753 "botName"), "utterances" (rawinput1274753 "utterances")}] (clojure.core/cond-> {} (letvar1274755 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1274755 ["botName"]))) (letvar1274755 "utterances") (clojure.core/assoc :utterances (deser-lists-of-utterances (clojure.core/get-in letvar1274755 ["utterances"])))))))

(clojure.core/defn- response-create-slot-type-version-response ([input] (response-create-slot-type-version-response nil input)) ([resultWrapper1274757 input] (clojure.core/let [rawinput1274756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274758 {"name" (rawinput1274756 "name"), "description" (rawinput1274756 "description"), "enumerationValues" (rawinput1274756 "enumerationValues"), "lastUpdatedDate" (rawinput1274756 "lastUpdatedDate"), "createdDate" (rawinput1274756 "createdDate"), "version" (rawinput1274756 "version"), "checksum" (rawinput1274756 "checksum"), "valueSelectionStrategy" (rawinput1274756 "valueSelectionStrategy")}] (clojure.core/cond-> {} (letvar1274758 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1274758 ["name"]))) (letvar1274758 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274758 ["description"]))) (letvar1274758 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1274758 ["enumerationValues"]))) (letvar1274758 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274758 ["lastUpdatedDate"]))) (letvar1274758 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274758 ["createdDate"]))) (letvar1274758 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274758 ["version"]))) (letvar1274758 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274758 ["checksum"]))) (letvar1274758 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1274758 ["valueSelectionStrategy"])))))))

(clojure.core/defn- response-get-builtin-slot-types-response ([input] (response-get-builtin-slot-types-response nil input)) ([resultWrapper1274760 input] (clojure.core/let [rawinput1274759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274761 {"slotTypes" (rawinput1274759 "slotTypes"), "nextToken" (rawinput1274759 "nextToken")}] (clojure.core/cond-> {} (letvar1274761 "slotTypes") (clojure.core/assoc :slot-types (deser-builtin-slot-type-metadata-list (clojure.core/get-in letvar1274761 ["slotTypes"]))) (letvar1274761 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274761 ["nextToken"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1274763 input] (clojure.core/let [rawinput1274762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274764 {"referenceType" (rawinput1274762 "referenceType"), "exampleReference" (rawinput1274762 "exampleReference")}] (clojure.core/cond-> {} (letvar1274764 "referenceType") (clojure.core/assoc :reference-type (deser-reference-type (clojure.core/get-in letvar1274764 ["referenceType"]))) (letvar1274764 "exampleReference") (clojure.core/assoc :example-reference (deser-resource-reference (clojure.core/get-in letvar1274764 ["exampleReference"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1274766 input] (clojure.core/let [rawinput1274765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274767 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1274765 "message")}] (clojure.core/cond-> {} (letvar1274767 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar1274767 ["Retry-After"]))) (letvar1274767 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274767 ["message"])))))))

(clojure.core/defn- response-start-import-response ([input] (response-start-import-response nil input)) ([resultWrapper1274769 input] (clojure.core/let [rawinput1274768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274770 {"name" (rawinput1274768 "name"), "resourceType" (rawinput1274768 "resourceType"), "mergeStrategy" (rawinput1274768 "mergeStrategy"), "importId" (rawinput1274768 "importId"), "importStatus" (rawinput1274768 "importStatus"), "createdDate" (rawinput1274768 "createdDate")}] (clojure.core/cond-> {} (letvar1274770 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1274770 ["name"]))) (letvar1274770 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1274770 ["resourceType"]))) (letvar1274770 "mergeStrategy") (clojure.core/assoc :merge-strategy (deser-merge-strategy (clojure.core/get-in letvar1274770 ["mergeStrategy"]))) (letvar1274770 "importId") (clojure.core/assoc :import-id (deser-string (clojure.core/get-in letvar1274770 ["importId"]))) (letvar1274770 "importStatus") (clojure.core/assoc :import-status (deser-import-status (clojure.core/get-in letvar1274770 ["importStatus"]))) (letvar1274770 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274770 ["createdDate"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1274772 input] (clojure.core/let [rawinput1274771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274773 {"message" (rawinput1274771 "message")}] (clojure.core/cond-> {} (letvar1274773 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274773 ["message"])))))))

(clojure.core/defn- response-get-import-response ([input] (response-get-import-response nil input)) ([resultWrapper1274775 input] (clojure.core/let [rawinput1274774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274776 {"name" (rawinput1274774 "name"), "resourceType" (rawinput1274774 "resourceType"), "mergeStrategy" (rawinput1274774 "mergeStrategy"), "importId" (rawinput1274774 "importId"), "importStatus" (rawinput1274774 "importStatus"), "failureReason" (rawinput1274774 "failureReason"), "createdDate" (rawinput1274774 "createdDate")}] (clojure.core/cond-> {} (letvar1274776 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1274776 ["name"]))) (letvar1274776 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1274776 ["resourceType"]))) (letvar1274776 "mergeStrategy") (clojure.core/assoc :merge-strategy (deser-merge-strategy (clojure.core/get-in letvar1274776 ["mergeStrategy"]))) (letvar1274776 "importId") (clojure.core/assoc :import-id (deser-string (clojure.core/get-in letvar1274776 ["importId"]))) (letvar1274776 "importStatus") (clojure.core/assoc :import-status (deser-import-status (clojure.core/get-in letvar1274776 ["importStatus"]))) (letvar1274776 "failureReason") (clojure.core/assoc :failure-reason (deser-string-list (clojure.core/get-in letvar1274776 ["failureReason"]))) (letvar1274776 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274776 ["createdDate"])))))))

(clojure.core/defn- response-create-bot-version-response ([input] (response-create-bot-version-response nil input)) ([resultWrapper1274778 input] (clojure.core/let [rawinput1274777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274779 {"intents" (rawinput1274777 "intents"), "createdDate" (rawinput1274777 "createdDate"), "idleSessionTTLInSeconds" (rawinput1274777 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1274777 "clarificationPrompt"), "name" (rawinput1274777 "name"), "locale" (rawinput1274777 "locale"), "lastUpdatedDate" (rawinput1274777 "lastUpdatedDate"), "status" (rawinput1274777 "status"), "abortStatement" (rawinput1274777 "abortStatement"), "version" (rawinput1274777 "version"), "failureReason" (rawinput1274777 "failureReason"), "childDirected" (rawinput1274777 "childDirected"), "checksum" (rawinput1274777 "checksum"), "voiceId" (rawinput1274777 "voiceId"), "description" (rawinput1274777 "description")}] (clojure.core/cond-> {} (letvar1274779 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1274779 ["intents"]))) (letvar1274779 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274779 ["createdDate"]))) (letvar1274779 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1274779 ["idleSessionTTLInSeconds"]))) (letvar1274779 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1274779 ["clarificationPrompt"]))) (letvar1274779 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1274779 ["name"]))) (letvar1274779 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1274779 ["locale"]))) (letvar1274779 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274779 ["lastUpdatedDate"]))) (letvar1274779 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1274779 ["status"]))) (letvar1274779 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1274779 ["abortStatement"]))) (letvar1274779 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274779 ["version"]))) (letvar1274779 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1274779 ["failureReason"]))) (letvar1274779 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1274779 ["childDirected"]))) (letvar1274779 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274779 ["checksum"]))) (letvar1274779 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1274779 ["voiceId"]))) (letvar1274779 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274779 ["description"])))))))

(clojure.core/defn- response-get-slot-type-versions-response ([input] (response-get-slot-type-versions-response nil input)) ([resultWrapper1274781 input] (clojure.core/let [rawinput1274780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274782 {"slotTypes" (rawinput1274780 "slotTypes"), "nextToken" (rawinput1274780 "nextToken")}] (clojure.core/cond-> {} (letvar1274782 "slotTypes") (clojure.core/assoc :slot-types (deser-slot-type-metadata-list (clojure.core/get-in letvar1274782 ["slotTypes"]))) (letvar1274782 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274782 ["nextToken"])))))))

(clojure.core/defn- response-get-intent-versions-response ([input] (response-get-intent-versions-response nil input)) ([resultWrapper1274784 input] (clojure.core/let [rawinput1274783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274785 {"intents" (rawinput1274783 "intents"), "nextToken" (rawinput1274783 "nextToken")}] (clojure.core/cond-> {} (letvar1274785 "intents") (clojure.core/assoc :intents (deser-intent-metadata-list (clojure.core/get-in letvar1274785 ["intents"]))) (letvar1274785 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274785 ["nextToken"])))))))

(clojure.core/defn- response-get-bot-response ([input] (response-get-bot-response nil input)) ([resultWrapper1274787 input] (clojure.core/let [rawinput1274786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274788 {"intents" (rawinput1274786 "intents"), "createdDate" (rawinput1274786 "createdDate"), "idleSessionTTLInSeconds" (rawinput1274786 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1274786 "clarificationPrompt"), "name" (rawinput1274786 "name"), "locale" (rawinput1274786 "locale"), "lastUpdatedDate" (rawinput1274786 "lastUpdatedDate"), "status" (rawinput1274786 "status"), "abortStatement" (rawinput1274786 "abortStatement"), "version" (rawinput1274786 "version"), "failureReason" (rawinput1274786 "failureReason"), "childDirected" (rawinput1274786 "childDirected"), "checksum" (rawinput1274786 "checksum"), "voiceId" (rawinput1274786 "voiceId"), "description" (rawinput1274786 "description")}] (clojure.core/cond-> {} (letvar1274788 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1274788 ["intents"]))) (letvar1274788 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274788 ["createdDate"]))) (letvar1274788 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1274788 ["idleSessionTTLInSeconds"]))) (letvar1274788 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1274788 ["clarificationPrompt"]))) (letvar1274788 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1274788 ["name"]))) (letvar1274788 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1274788 ["locale"]))) (letvar1274788 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274788 ["lastUpdatedDate"]))) (letvar1274788 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1274788 ["status"]))) (letvar1274788 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1274788 ["abortStatement"]))) (letvar1274788 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274788 ["version"]))) (letvar1274788 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1274788 ["failureReason"]))) (letvar1274788 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1274788 ["childDirected"]))) (letvar1274788 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274788 ["checksum"]))) (letvar1274788 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1274788 ["voiceId"]))) (letvar1274788 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274788 ["description"])))))))

(clojure.core/defn- response-get-intents-response ([input] (response-get-intents-response nil input)) ([resultWrapper1274790 input] (clojure.core/let [rawinput1274789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274791 {"intents" (rawinput1274789 "intents"), "nextToken" (rawinput1274789 "nextToken")}] (clojure.core/cond-> {} (letvar1274791 "intents") (clojure.core/assoc :intents (deser-intent-metadata-list (clojure.core/get-in letvar1274791 ["intents"]))) (letvar1274791 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274791 ["nextToken"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1274793 input] (clojure.core/let [rawinput1274792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274794 {"message" (rawinput1274792 "message")}] (clojure.core/cond-> {} (letvar1274794 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274794 ["message"])))))))

(clojure.core/defn- response-put-slot-type-response ([input] (response-put-slot-type-response nil input)) ([resultWrapper1274796 input] (clojure.core/let [rawinput1274795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274797 {"valueSelectionStrategy" (rawinput1274795 "valueSelectionStrategy"), "createdDate" (rawinput1274795 "createdDate"), "name" (rawinput1274795 "name"), "enumerationValues" (rawinput1274795 "enumerationValues"), "lastUpdatedDate" (rawinput1274795 "lastUpdatedDate"), "createVersion" (rawinput1274795 "createVersion"), "version" (rawinput1274795 "version"), "checksum" (rawinput1274795 "checksum"), "description" (rawinput1274795 "description")}] (clojure.core/cond-> {} (letvar1274797 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1274797 ["valueSelectionStrategy"]))) (letvar1274797 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274797 ["createdDate"]))) (letvar1274797 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1274797 ["name"]))) (letvar1274797 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1274797 ["enumerationValues"]))) (letvar1274797 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274797 ["lastUpdatedDate"]))) (letvar1274797 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1274797 ["createVersion"]))) (letvar1274797 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274797 ["version"]))) (letvar1274797 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274797 ["checksum"]))) (letvar1274797 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274797 ["description"])))))))

(clojure.core/defn- response-get-bot-channel-associations-response ([input] (response-get-bot-channel-associations-response nil input)) ([resultWrapper1274799 input] (clojure.core/let [rawinput1274798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274800 {"botChannelAssociations" (rawinput1274798 "botChannelAssociations"), "nextToken" (rawinput1274798 "nextToken")}] (clojure.core/cond-> {} (letvar1274800 "botChannelAssociations") (clojure.core/assoc :bot-channel-associations (deser-bot-channel-association-list (clojure.core/get-in letvar1274800 ["botChannelAssociations"]))) (letvar1274800 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274800 ["nextToken"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1274802 input] (clojure.core/let [rawinput1274801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274803 {"message" (rawinput1274801 "message")}] (clojure.core/cond-> {} (letvar1274803 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1274803 ["message"])))))))

(clojure.core/defn- response-put-intent-response ([input] (response-put-intent-response nil input)) ([resultWrapper1274805 input] (clojure.core/let [rawinput1274804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274806 {"followUpPrompt" (rawinput1274804 "followUpPrompt"), "fulfillmentActivity" (rawinput1274804 "fulfillmentActivity"), "slots" (rawinput1274804 "slots"), "parentIntentSignature" (rawinput1274804 "parentIntentSignature"), "confirmationPrompt" (rawinput1274804 "confirmationPrompt"), "createdDate" (rawinput1274804 "createdDate"), "name" (rawinput1274804 "name"), "rejectionStatement" (rawinput1274804 "rejectionStatement"), "lastUpdatedDate" (rawinput1274804 "lastUpdatedDate"), "createVersion" (rawinput1274804 "createVersion"), "dialogCodeHook" (rawinput1274804 "dialogCodeHook"), "conclusionStatement" (rawinput1274804 "conclusionStatement"), "sampleUtterances" (rawinput1274804 "sampleUtterances"), "version" (rawinput1274804 "version"), "checksum" (rawinput1274804 "checksum"), "description" (rawinput1274804 "description")}] (clojure.core/cond-> {} (letvar1274806 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1274806 ["followUpPrompt"]))) (letvar1274806 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1274806 ["fulfillmentActivity"]))) (letvar1274806 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1274806 ["slots"]))) (letvar1274806 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1274806 ["parentIntentSignature"]))) (letvar1274806 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1274806 ["confirmationPrompt"]))) (letvar1274806 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274806 ["createdDate"]))) (letvar1274806 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1274806 ["name"]))) (letvar1274806 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1274806 ["rejectionStatement"]))) (letvar1274806 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274806 ["lastUpdatedDate"]))) (letvar1274806 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1274806 ["createVersion"]))) (letvar1274806 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1274806 ["dialogCodeHook"]))) (letvar1274806 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1274806 ["conclusionStatement"]))) (letvar1274806 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1274806 ["sampleUtterances"]))) (letvar1274806 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274806 ["version"]))) (letvar1274806 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274806 ["checksum"]))) (letvar1274806 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274806 ["description"])))))))

(clojure.core/defn- response-get-intent-response ([input] (response-get-intent-response nil input)) ([resultWrapper1274808 input] (clojure.core/let [rawinput1274807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274809 {"followUpPrompt" (rawinput1274807 "followUpPrompt"), "fulfillmentActivity" (rawinput1274807 "fulfillmentActivity"), "slots" (rawinput1274807 "slots"), "parentIntentSignature" (rawinput1274807 "parentIntentSignature"), "confirmationPrompt" (rawinput1274807 "confirmationPrompt"), "createdDate" (rawinput1274807 "createdDate"), "name" (rawinput1274807 "name"), "rejectionStatement" (rawinput1274807 "rejectionStatement"), "lastUpdatedDate" (rawinput1274807 "lastUpdatedDate"), "dialogCodeHook" (rawinput1274807 "dialogCodeHook"), "conclusionStatement" (rawinput1274807 "conclusionStatement"), "sampleUtterances" (rawinput1274807 "sampleUtterances"), "version" (rawinput1274807 "version"), "checksum" (rawinput1274807 "checksum"), "description" (rawinput1274807 "description")}] (clojure.core/cond-> {} (letvar1274809 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1274809 ["followUpPrompt"]))) (letvar1274809 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1274809 ["fulfillmentActivity"]))) (letvar1274809 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1274809 ["slots"]))) (letvar1274809 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1274809 ["parentIntentSignature"]))) (letvar1274809 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1274809 ["confirmationPrompt"]))) (letvar1274809 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274809 ["createdDate"]))) (letvar1274809 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1274809 ["name"]))) (letvar1274809 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1274809 ["rejectionStatement"]))) (letvar1274809 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274809 ["lastUpdatedDate"]))) (letvar1274809 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1274809 ["dialogCodeHook"]))) (letvar1274809 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1274809 ["conclusionStatement"]))) (letvar1274809 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1274809 ["sampleUtterances"]))) (letvar1274809 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274809 ["version"]))) (letvar1274809 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274809 ["checksum"]))) (letvar1274809 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274809 ["description"])))))))

(clojure.core/defn- response-get-builtin-intent-response ([input] (response-get-builtin-intent-response nil input)) ([resultWrapper1274811 input] (clojure.core/let [rawinput1274810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274812 {"signature" (rawinput1274810 "signature"), "supportedLocales" (rawinput1274810 "supportedLocales"), "slots" (rawinput1274810 "slots")}] (clojure.core/cond-> {} (letvar1274812 "signature") (clojure.core/assoc :signature (deser-builtin-intent-signature (clojure.core/get-in letvar1274812 ["signature"]))) (letvar1274812 "supportedLocales") (clojure.core/assoc :supported-locales (deser-locale-list (clojure.core/get-in letvar1274812 ["supportedLocales"]))) (letvar1274812 "slots") (clojure.core/assoc :slots (deser-builtin-intent-slot-list (clojure.core/get-in letvar1274812 ["slots"])))))))

(clojure.core/defn- response-get-bot-alias-response ([input] (response-get-bot-alias-response nil input)) ([resultWrapper1274814 input] (clojure.core/let [rawinput1274813 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274815 {"name" (rawinput1274813 "name"), "description" (rawinput1274813 "description"), "botVersion" (rawinput1274813 "botVersion"), "botName" (rawinput1274813 "botName"), "lastUpdatedDate" (rawinput1274813 "lastUpdatedDate"), "createdDate" (rawinput1274813 "createdDate"), "checksum" (rawinput1274813 "checksum")}] (clojure.core/cond-> {} (letvar1274815 "name") (clojure.core/assoc :name (deser-alias-name (clojure.core/get-in letvar1274815 ["name"]))) (letvar1274815 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274815 ["description"]))) (letvar1274815 "botVersion") (clojure.core/assoc :bot-version (deser-version (clojure.core/get-in letvar1274815 ["botVersion"]))) (letvar1274815 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1274815 ["botName"]))) (letvar1274815 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274815 ["lastUpdatedDate"]))) (letvar1274815 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274815 ["createdDate"]))) (letvar1274815 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274815 ["checksum"])))))))

(clojure.core/defn- response-get-slot-type-response ([input] (response-get-slot-type-response nil input)) ([resultWrapper1274817 input] (clojure.core/let [rawinput1274816 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274818 {"name" (rawinput1274816 "name"), "description" (rawinput1274816 "description"), "enumerationValues" (rawinput1274816 "enumerationValues"), "lastUpdatedDate" (rawinput1274816 "lastUpdatedDate"), "createdDate" (rawinput1274816 "createdDate"), "version" (rawinput1274816 "version"), "checksum" (rawinput1274816 "checksum"), "valueSelectionStrategy" (rawinput1274816 "valueSelectionStrategy")}] (clojure.core/cond-> {} (letvar1274818 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1274818 ["name"]))) (letvar1274818 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274818 ["description"]))) (letvar1274818 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1274818 ["enumerationValues"]))) (letvar1274818 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274818 ["lastUpdatedDate"]))) (letvar1274818 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274818 ["createdDate"]))) (letvar1274818 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274818 ["version"]))) (letvar1274818 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274818 ["checksum"]))) (letvar1274818 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1274818 ["valueSelectionStrategy"])))))))

(clojure.core/defn- response-get-bot-versions-response ([input] (response-get-bot-versions-response nil input)) ([resultWrapper1274820 input] (clojure.core/let [rawinput1274819 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274821 {"bots" (rawinput1274819 "bots"), "nextToken" (rawinput1274819 "nextToken")}] (clojure.core/cond-> {} (letvar1274821 "bots") (clojure.core/assoc :bots (deser-bot-metadata-list (clojure.core/get-in letvar1274821 ["bots"]))) (letvar1274821 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274821 ["nextToken"])))))))

(clojure.core/defn- response-get-builtin-intents-response ([input] (response-get-builtin-intents-response nil input)) ([resultWrapper1274823 input] (clojure.core/let [rawinput1274822 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274824 {"intents" (rawinput1274822 "intents"), "nextToken" (rawinput1274822 "nextToken")}] (clojure.core/cond-> {} (letvar1274824 "intents") (clojure.core/assoc :intents (deser-builtin-intent-metadata-list (clojure.core/get-in letvar1274824 ["intents"]))) (letvar1274824 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274824 ["nextToken"])))))))

(clojure.core/defn- response-get-slot-types-response ([input] (response-get-slot-types-response nil input)) ([resultWrapper1274826 input] (clojure.core/let [rawinput1274825 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274827 {"slotTypes" (rawinput1274825 "slotTypes"), "nextToken" (rawinput1274825 "nextToken")}] (clojure.core/cond-> {} (letvar1274827 "slotTypes") (clojure.core/assoc :slot-types (deser-slot-type-metadata-list (clojure.core/get-in letvar1274827 ["slotTypes"]))) (letvar1274827 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1274827 ["nextToken"])))))))

(clojure.core/defn- response-create-intent-version-response ([input] (response-create-intent-version-response nil input)) ([resultWrapper1274829 input] (clojure.core/let [rawinput1274828 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1274830 {"followUpPrompt" (rawinput1274828 "followUpPrompt"), "fulfillmentActivity" (rawinput1274828 "fulfillmentActivity"), "slots" (rawinput1274828 "slots"), "parentIntentSignature" (rawinput1274828 "parentIntentSignature"), "confirmationPrompt" (rawinput1274828 "confirmationPrompt"), "createdDate" (rawinput1274828 "createdDate"), "name" (rawinput1274828 "name"), "rejectionStatement" (rawinput1274828 "rejectionStatement"), "lastUpdatedDate" (rawinput1274828 "lastUpdatedDate"), "dialogCodeHook" (rawinput1274828 "dialogCodeHook"), "conclusionStatement" (rawinput1274828 "conclusionStatement"), "sampleUtterances" (rawinput1274828 "sampleUtterances"), "version" (rawinput1274828 "version"), "checksum" (rawinput1274828 "checksum"), "description" (rawinput1274828 "description")}] (clojure.core/cond-> {} (letvar1274830 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1274830 ["followUpPrompt"]))) (letvar1274830 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1274830 ["fulfillmentActivity"]))) (letvar1274830 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1274830 ["slots"]))) (letvar1274830 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1274830 ["parentIntentSignature"]))) (letvar1274830 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1274830 ["confirmationPrompt"]))) (letvar1274830 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1274830 ["createdDate"]))) (letvar1274830 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1274830 ["name"]))) (letvar1274830 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1274830 ["rejectionStatement"]))) (letvar1274830 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1274830 ["lastUpdatedDate"]))) (letvar1274830 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1274830 ["dialogCodeHook"]))) (letvar1274830 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1274830 ["conclusionStatement"]))) (letvar1274830 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1274830 ["sampleUtterances"]))) (letvar1274830 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1274830 ["version"]))) (letvar1274830 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1274830 ["checksum"]))) (letvar1274830 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1274830 ["description"])))))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-metadata/name :portkey.aws.lex-models.-2017-04-19.bot-metadata/description :portkey.aws.lex-models.-2017-04-19.bot-metadata/status :portkey.aws.lex-models.-2017-04-19.bot-metadata/last-updated-date :portkey.aws.lex-models.-2017-04-19.bot-metadata/created-date :portkey.aws.lex-models.-2017-04-19.bot-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/merge-strategy #{:fail-on-conflict "FAIL_ON_CONFLICT" :overwrite-latest "OVERWRITE_LATEST"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bots-response/bots :portkey.aws.lex-models.-2017-04-19.get-bots-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/slot :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/name :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/description :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-version :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/bot-name :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/last-updated-date :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/created-date :portkey.aws.lex-models.-2017-04-19.bot-alias-metadata/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-version :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/bot-name] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/description :portkey.aws.lex-models.-2017-04-19.put-bot-alias-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/string-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/locale-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/locale))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-slot-type-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-reference/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-reference/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/resource-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.resource-reference/name :portkey.aws.lex-models.-2017-04-19.resource-reference/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/lambda-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 20 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/bot-aliases :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/export-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/export-status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/export-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-response/url (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-export-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-export-response/name :portkey.aws.lex-models.-2017-04-19.get-export-response/version :portkey.aws.lex-models.-2017-04-19.get-export-response/resource-type :portkey.aws.lex-models.-2017-04-19.get-export-response/export-type :portkey.aws.lex-models.-2017-04-19.get-export-response/export-status :portkey.aws.lex-models.-2017-04-19.get-export-response/failure-reason :portkey.aws.lex-models.-2017-04-19.get-export-response/url]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/messages (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.prompt/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.prompt/messages :portkey.aws.lex-models.-2017-04-19.prompt/max-attempts] :opt-un [:portkey.aws.lex-models.-2017-04-19.prompt/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-response/intents :portkey.aws.lex-models.-2017-04-19.put-bot-response/created-date :portkey.aws.lex-models.-2017-04-19.put-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.-2017-04-19.put-bot-response/clarification-prompt :portkey.aws.lex-models.-2017-04-19.put-bot-response/name :portkey.aws.lex-models.-2017-04-19.put-bot-response/locale :portkey.aws.lex-models.-2017-04-19.put-bot-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.put-bot-response/status :portkey.aws.lex-models.-2017-04-19.put-bot-response/create-version :portkey.aws.lex-models.-2017-04-19.put-bot-response/abort-statement :portkey.aws.lex-models.-2017-04-19.put-bot-response/version :portkey.aws.lex-models.-2017-04-19.put-bot-response/failure-reason :portkey.aws.lex-models.-2017-04-19.put-bot-response/child-directed :portkey.aws.lex-models.-2017-04-19.put-bot-response/checksum :portkey.aws.lex-models.-2017-04-19.put-bot-response/voice-id :portkey.aws.lex-models.-2017-04-19.put-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/import-status #{"IN_PROGRESS" :in-progress "COMPLETE" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-alias :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/created-date :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/status :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-configuration :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/bot-name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/type :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/failure-reason :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.lex-models.-2017-04-19/string :portkey.aws.lex-models.-2017-04-19/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/name :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/description :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-version :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/bot-name :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/created-date :portkey.aws.lex-models.-2017-04-19.put-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/export-status #{:ready "IN_PROGRESS" :in-progress "READY" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bots-request/next-token :portkey.aws.lex-models.-2017-04-19.get-bots-request/max-results :portkey.aws.lex-models.-2017-04-19.get-bots-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/locale #{"de-DE" :en-gb :de-de "en-US" "en-GB" :en-us})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/utterance-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/count (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.utterance-data/utterance-string :portkey.aws.lex-models.-2017-04-19.utterance-data/count :portkey.aws.lex-models.-2017-04-19.utterance-data/distinct-users :portkey.aws.lex-models.-2017-04-19.utterance-data/first-uttered-date :portkey.aws.lex-models.-2017-04-19.utterance-data/last-uttered-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(-|^([A-Za-z]_?)+$)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/bot-alias] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/next-token :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/max-results :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/process-behavior (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/process-behavior))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-bot-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-bot-request/name :portkey.aws.lex-models.-2017-04-19.put-bot-request/locale :portkey.aws.lex-models.-2017-04-19.put-bot-request/child-directed] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-bot-request/intents :portkey.aws.lex-models.-2017-04-19.put-bot-request/idle-session-ttl-in-seconds :portkey.aws.lex-models.-2017-04-19.put-bot-request/clarification-prompt :portkey.aws.lex-models.-2017-04-19.put-bot-request/process-behavior :portkey.aws.lex-models.-2017-04-19.put-bot-request/create-version :portkey.aws.lex-models.-2017-04-19.put-bot-request/abort-statement :portkey.aws.lex-models.-2017-04-19.put-bot-request/checksum :portkey.aws.lex-models.-2017-04-19.put-bot-request/voice-id :portkey.aws.lex-models.-2017-04-19.put-bot-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-value-selection-strategy #{:original-value "ORIGINAL_VALUE" :top-resolution "TOP_RESOLUTION"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/prompt-max-attempts (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.utterance-list/bot-version :portkey.aws.lex-models.-2017-04-19.utterance-list/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/bot-name :portkey.aws.lex-models.-2017-04-19.get-utterances-view-response/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/name :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/description :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/enumeration-values :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/created-date :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/version :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/checksum :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-intent-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/slot-types :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.statement/messages (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.statement/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/statement (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.statement/messages] :opt-un [:portkey.aws.lex-models.-2017-04-19.statement/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-request/description :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/enumeration-values :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/checksum :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/value-selection-strategy :portkey.aws.lex-models.-2017-04-19.put-slot-type-request/create-version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/reference-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-reference))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/reference-type :portkey.aws.lex-models.-2017-04-19.resource-in-use-exception/example-reference]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.code-hook/uri (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/lambda-arn))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/message-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/code-hook (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.code-hook/uri :portkey.aws.lex-models.-2017-04-19.code-hook/message-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/retry-after-seconds :portkey.aws.lex-models.-2017-04-19.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-slot-type-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-export-request/name :portkey.aws.lex-models.-2017-04-19.get-export-request/version :portkey.aws.lex-models.-2017-04-19.get-export-request/resource-type :portkey.aws.lex-models.-2017-04-19.get-export-request/export-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-types-request/next-token :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/max-results :portkey.aws.lex-models.-2017-04-19.get-slot-types-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/locale :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/signature-contains :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/next-token :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/status #{"READY_BASIC_TESTING" :ready-basic-testing "NOT_BUILT" :ready :building :not-built "READY" "BUILDING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/start-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.start-import-response/name :portkey.aws.lex-models.-2017-04-19.start-import-response/resource-type :portkey.aws.lex-models.-2017-04-19.start-import-response/merge-strategy :portkey.aws.lex-models.-2017-04-19.start-import-response/import-id :portkey.aws.lex-models.-2017-04-19.start-import-response/import-status :portkey.aws.lex-models.-2017-04-19.start-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/group-number (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/priority (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/status-type #{"Detected" :missed "Missed" :detected})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-slot-type-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-versions (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/version :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/content-type #{:custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/session-ttl (clojure.spec.alpha/int-in 60 86400))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-alias-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/follow-up-prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.follow-up-prompt/prompt :portkey.aws.lex-models.-2017-04-19.follow-up-prompt/rejection-statement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-name :portkey.aws.lex-models.-2017-04-19.get-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-import-response/name :portkey.aws.lex-models.-2017-04-19.get-import-response/resource-type :portkey.aws.lex-models.-2017-04-19.get-import-response/merge-strategy :portkey.aws.lex-models.-2017-04-19.get-import-response/import-id :portkey.aws.lex-models.-2017-04-19.get-import-response/import-status :portkey.aws.lex-models.-2017-04-19.get-import-response/failure-reason :portkey.aws.lex-models.-2017-04-19.get-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-intent-slot/name]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-bot-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-bot-version-response/intents :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/created-date :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/clarification-prompt :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/name :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/locale :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/status :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/abort-statement :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/version :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/failure-reason :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/child-directed :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/checksum :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/voice-id :portkey.aws.lex-models.-2017-04-19.create-bot-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intents-request/next-token :portkey.aws.lex-models.-2017-04-19.get-intents-request/max-results :portkey.aws.lex-models.-2017-04-19.get-intents-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/slot-types :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/next-token :portkey.aws.lex-models.-2017-04-19.get-bot-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/intents :portkey.aws.lex-models.-2017-04-19.get-intent-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/next-token :portkey.aws.lex-models.-2017-04-19.get-slot-type-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-response/intents :portkey.aws.lex-models.-2017-04-19.get-bot-response/created-date :portkey.aws.lex-models.-2017-04-19.get-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.-2017-04-19.get-bot-response/clarification-prompt :portkey.aws.lex-models.-2017-04-19.get-bot-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-response/locale :portkey.aws.lex-models.-2017-04-19.get-bot-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.get-bot-response/status :portkey.aws.lex-models.-2017-04-19.get-bot-response/abort-statement :portkey.aws.lex-models.-2017-04-19.get-bot-response/version :portkey.aws.lex-models.-2017-04-19.get-bot-response/failure-reason :portkey.aws.lex-models.-2017-04-19.get-bot-response/child-directed :portkey.aws.lex-models.-2017-04-19.get-bot-response/checksum :portkey.aws.lex-models.-2017-04-19.get-bot-response/voice-id :portkey.aws.lex-models.-2017-04-19.get-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/locale :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/signature-contains :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/next-token :portkey.aws.lex-models.-2017-04-19.get-builtin-slot-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/intent))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/fulfillment-activity-type #{:code-hook "ReturnIntent" "CodeHook" :return-intent})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-association-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-channel-association))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intents-response/intents :portkey.aws.lex-models.-2017-04-19.get-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/list-of-utterance (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance-data))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-slot-type-response/value-selection-strategy :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/created-date :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/name :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/enumeration-values :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/create-version :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/version :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/checksum :portkey.aws.lex-models.-2017-04-19.put-slot-type-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/bot-channel-associations :portkey.aws.lex-models.-2017-04-19.get-bot-channel-associations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.message/content-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/content-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.message/content (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/content-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.message/group-number (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/group-number))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.message/content-type :portkey.aws.lex-models.-2017-04-19.message/content] :opt-un [:portkey.aws.lex-models.-2017-04-19.message/group-number]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intent-request/signature] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/export-type #{"ALEXA_SKILLS_KIT" :lex "LEX" :alexa-skills-kit})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/user-id))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-utterances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-utterances-request/bot-name :portkey.aws.lex-models.-2017-04-19.delete-utterances-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^((AMAZON\.)_?|[A-Za-z]_?)+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/enumeration-values (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/enumeration-value :min-count 1 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 50)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/priority (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/priority))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/response-card (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/custom-or-builtin-slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-constraint (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-constraint))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/slot-type-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/value-elicitation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.slot/name :portkey.aws.lex-models.-2017-04-19.slot/slot-constraint] :opt-un [:portkey.aws.lex-models.-2017-04-19.slot/priority :portkey.aws.lex-models.-2017-04-19.slot/response-card :portkey.aws.lex-models.-2017-04-19.slot/slot-type :portkey.aws.lex-models.-2017-04-19.slot/slot-type-version :portkey.aws.lex-models.-2017-04-19.slot/sample-utterances :portkey.aws.lex-models.-2017-04-19.slot/value-elicitation-prompt :portkey.aws.lex-models.-2017-04-19.slot/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-request/payload (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/blob))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.start-import-request/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/start-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.start-import-request/payload :portkey.aws.lex-models.-2017-04-19.start-import-request/resource-type :portkey.aws.lex-models.-2017-04-19.start-import-request/merge-strategy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z](-|_|.)?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/resource-type #{:bot "SLOT_TYPE" "INTENT" :slot-type :intent "BOT"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-intent-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-intent-response/follow-up-prompt :portkey.aws.lex-models.-2017-04-19.put-intent-response/fulfillment-activity :portkey.aws.lex-models.-2017-04-19.put-intent-response/slots :portkey.aws.lex-models.-2017-04-19.put-intent-response/parent-intent-signature :portkey.aws.lex-models.-2017-04-19.put-intent-response/confirmation-prompt :portkey.aws.lex-models.-2017-04-19.put-intent-response/created-date :portkey.aws.lex-models.-2017-04-19.put-intent-response/name :portkey.aws.lex-models.-2017-04-19.put-intent-response/rejection-statement :portkey.aws.lex-models.-2017-04-19.put-intent-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.put-intent-response/create-version :portkey.aws.lex-models.-2017-04-19.put-intent-response/dialog-code-hook :portkey.aws.lex-models.-2017-04-19.put-intent-response/conclusion-statement :portkey.aws.lex-models.-2017-04-19.put-intent-response/sample-utterances :portkey.aws.lex-models.-2017-04-19.put-intent-response/version :portkey.aws.lex-models.-2017-04-19.put-intent-response/checksum :portkey.aws.lex-models.-2017-04-19.put-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/name :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-name :portkey.aws.lex-models.-2017-04-19.delete-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/fulfillment-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.fulfillment-activity/type] :opt-un [:portkey.aws.lex-models.-2017-04-19.fulfillment-activity/code-hook]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/channel-status #{"IN_PROGRESS" :in-progress :created "FAILED" :failed "CREATED"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/message :min-count 1 :max-count 15))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/next-token :portkey.aws.lex-models.-2017-04-19.get-intent-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-intent-request/name :portkey.aws.lex-models.-2017-04-19.get-intent-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-intent-response/follow-up-prompt :portkey.aws.lex-models.-2017-04-19.get-intent-response/fulfillment-activity :portkey.aws.lex-models.-2017-04-19.get-intent-response/slots :portkey.aws.lex-models.-2017-04-19.get-intent-response/parent-intent-signature :portkey.aws.lex-models.-2017-04-19.get-intent-response/confirmation-prompt :portkey.aws.lex-models.-2017-04-19.get-intent-response/created-date :portkey.aws.lex-models.-2017-04-19.get-intent-response/name :portkey.aws.lex-models.-2017-04-19.get-intent-response/rejection-statement :portkey.aws.lex-models.-2017-04-19.get-intent-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.get-intent-response/dialog-code-hook :portkey.aws.lex-models.-2017-04-19.get-intent-response/conclusion-statement :portkey.aws.lex-models.-2017-04-19.get-intent-response/sample-utterances :portkey.aws.lex-models.-2017-04-19.get-intent-response/version :portkey.aws.lex-models.-2017-04-19.get-intent-response/checksum :portkey.aws.lex-models.-2017-04-19.get-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.intent-metadata/name :portkey.aws.lex-models.-2017-04-19.intent-metadata/description :portkey.aws.lex-models.-2017-04-19.intent-metadata/last-updated-date :portkey.aws.lex-models.-2017-04-19.intent-metadata/created-date :portkey.aws.lex-models.-2017-04-19.intent-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-constraint #{"Required" :optional "Optional" :required})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.slot-type-metadata/name :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/description :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/last-updated-date :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/created-date :portkey.aws.lex-models.-2017-04-19.slot-type-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.put-intent-request/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/put-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.put-intent-request/name] :opt-un [:portkey.aws.lex-models.-2017-04-19.put-intent-request/follow-up-prompt :portkey.aws.lex-models.-2017-04-19.put-intent-request/fulfillment-activity :portkey.aws.lex-models.-2017-04-19.put-intent-request/slots :portkey.aws.lex-models.-2017-04-19.put-intent-request/parent-intent-signature :portkey.aws.lex-models.-2017-04-19.put-intent-request/confirmation-prompt :portkey.aws.lex-models.-2017-04-19.put-intent-request/rejection-statement :portkey.aws.lex-models.-2017-04-19.put-intent-request/create-version :portkey.aws.lex-models.-2017-04-19.put-intent-request/dialog-code-hook :portkey.aws.lex-models.-2017-04-19.put-intent-request/conclusion-statement :portkey.aws.lex-models.-2017-04-19.put-intent-request/sample-utterances :portkey.aws.lex-models.-2017-04-19.put-intent-request/checksum :portkey.aws.lex-models.-2017-04-19.put-intent-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/reference-type #{:bot :bot-channel "BotAlias" "BotChannel" :intent :bot-alias "Bot" "Intent"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/signature :portkey.aws.lex-models.-2017-04-19.builtin-intent-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance :min-count 0 :max-count 1500))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/signature :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/supported-locales :portkey.aws.lex-models.-2017-04-19.get-builtin-intent-response/slots]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-request/name :portkey.aws.lex-models.-2017-04-19.get-slot-type-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/value))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.enumeration-value/synonyms (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/synonym-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/enumeration-value (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.enumeration-value/value] :opt-un [:portkey.aws.lex-models.-2017-04-19.enumeration-value/synonyms]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/name :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/description :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-version :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/bot-name :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/created-date :portkey.aws.lex-models.-2017-04-19.get-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-type-response/name :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/description :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/enumeration-values :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/created-date :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/version :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/checksum :portkey.aws.lex-models.-2017-04-19.get-slot-type-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/bots :portkey.aws.lex-models.-2017-04-19.get-bot-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-request/version-or-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/bot-name] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/next-token :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/max-results :portkey.aws.lex-models.-2017-04-19.get-bot-aliases-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/bot-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/status (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-alias :portkey.aws.lex-models.-2017-04-19.bot-channel-association/created-date :portkey.aws.lex-models.-2017-04-19.bot-channel-association/name :portkey.aws.lex-models.-2017-04-19.bot-channel-association/status :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-configuration :portkey.aws.lex-models.-2017-04-19.bot-channel-association/bot-name :portkey.aws.lex-models.-2017-04-19.bot-channel-association/type :portkey.aws.lex-models.-2017-04-19.bot-channel-association/failure-reason :portkey.aws.lex-models.-2017-04-19.bot-channel-association/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-import-request/import-id (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-import-request/import-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/builtin-slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/signature :portkey.aws.lex-models.-2017-04-19.builtin-slot-type-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/name :portkey.aws.lex-models.-2017-04-19.get-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/process-behavior #{:save "SAVE" :build "BUILD"})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/synonym-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/value))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/intents :portkey.aws.lex-models.-2017-04-19.get-builtin-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.get-slot-types-response/slot-types :portkey.aws.lex-models.-2017-04-19.get-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/lists-of-utterances (clojure.spec.alpha/coll-of :portkey.aws.lex-models.-2017-04-19/utterance-list))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent/intent-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.intent/intent-version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/intent (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.intent/intent-name :portkey.aws.lex-models.-2017-04-19.intent/intent-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/create-intent-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.-2017-04-19.create-intent-version-response/follow-up-prompt :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/fulfillment-activity :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/slots :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/parent-intent-signature :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/confirmation-prompt :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/created-date :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/name :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/rejection-statement :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/last-updated-date :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/dialog-code-hook :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/conclusion-statement :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/sample-utterances :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/version :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/checksum :portkey.aws.lex-models.-2017-04-19.create-intent-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/channel-type #{:facebook "Slack" :kik "Kik" "Twilio-Sms" :slack "Facebook" :twilio-sms})

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/bot-versions))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/status-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-name :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/bot-versions :portkey.aws.lex-models.-2017-04-19.get-utterances-view-request/status-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.-2017-04-19/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-channel-association-request delete-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotChannelAssociation", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-slot-types-request get-builtin-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinSlotTypes", :http.request.configuration/output-deser-fn response-get-builtin-slot-types-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-channel-associations-request get-bot-channel-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotChannelAssociations", :http.request.configuration/output-deser-fn response-get-bot-channel-associations-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-slot-type-version-request create-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSlotTypeVersion", :http.request.configuration/output-deser-fn response-create-slot-type-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-slot-type-version-response))

(clojure.core/defn get-import ([get-import-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-import-request get-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/{importId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetImport", :http.request.configuration/output-deser-fn response-get-import-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-import-response))

(clojure.core/defn get-slot-type ([get-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-type-request get-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotType", :http.request.configuration/output-deser-fn response-get-slot-type-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intent-versions-request get-intent-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntentVersions", :http.request.configuration/output-deser-fn response-get-intent-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-utterances-view-request get-utterances-view-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botname}/utterances?view=aggregation", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUtterancesView", :http.request.configuration/output-deser-fn response-get-utterances-view-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-intent-version-request delete-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIntentVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-intents-request get-builtin-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinIntents", :http.request.configuration/output-deser-fn response-get-builtin-intents-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-types-request get-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotTypes", :http.request.configuration/output-deser-fn response-get-slot-types-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-alias-request get-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotAlias", :http.request.configuration/output-deser-fn response-get-bot-alias-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-alias-response))

(clojure.core/defn get-export ([get-export-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-export-request get-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-export-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/exports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-export-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetExport", :http.request.configuration/output-deser-fn response-get-export-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-export-response))

(clojure.core/defn start-import ([start-import-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-start-import-request start-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/start-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/start-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartImport", :http.request.configuration/output-deser-fn response-start-import-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef start-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/start-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/start-import-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-intent-request get-builtin-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/{signature}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinIntent", :http.request.configuration/output-deser-fn response-get-builtin-intent-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-slot-type-request delete-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSlotType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-bot-version-request create-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/create-bot-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/create-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBotVersion", :http.request.configuration/output-deser-fn response-create-bot-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-intent-request put-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/put-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/put-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutIntent", :http.request.configuration/output-deser-fn response-put-intent-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-intent-request delete-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIntent", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intents-request get-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntents", :http.request.configuration/output-deser-fn response-get-intents-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-utterances-request delete-utterances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/utterances/{userId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-utterances-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUtterances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intent-request get-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntent", :http.request.configuration/output-deser-fn response-get-intent-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-intent-version-request create-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/create-intent-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/create-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIntentVersion", :http.request.configuration/output-deser-fn response-create-intent-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-channel-association-request get-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotChannelAssociation", :http.request.configuration/output-deser-fn response-get-bot-channel-association-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-slot-type-request put-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/put-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/put-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSlotType", :http.request.configuration/output-deser-fn response-put-slot-type-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-type-versions-request get-slot-type-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotTypeVersions", :http.request.configuration/output-deser-fn response-get-slot-type-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-version-request delete-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-aliases-request get-bot-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotAliases", :http.request.configuration/output-deser-fn response-get-bot-aliases-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-versions-request get-bot-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotVersions", :http.request.configuration/output-deser-fn response-get-bot-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-bot-alias-request put-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBotAlias", :http.request.configuration/output-deser-fn response-put-bot-alias-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bots-request get-bots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bots-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bots-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBots", :http.request.configuration/output-deser-fn response-get-bots-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.lex-models.-2017-04-19/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bots-response))

(clojure.core/defn get-bot ([get-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-request get-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/get-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{versionoralias}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/get-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBot", :http.request.configuration/output-deser-fn response-get-bot-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-slot-type-version-request delete-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/version/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSlotTypeVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-request delete-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBot", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-bot-request put-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models.-2017-04-19/put-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/put-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBot", :http.request.configuration/output-deser-fn response-put-bot-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models.-2017-04-19/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models.-2017-04-19/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-alias-request delete-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models.-2017-04-19/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models.-2017-04-19/not-found-exception, "ConflictException" :portkey.aws.lex-models.-2017-04-19/conflict-exception, "LimitExceededException" :portkey.aws.lex-models.-2017-04-19/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models.-2017-04-19/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models.-2017-04-19/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models.-2017-04-19/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models.-2017-04-19/delete-bot-alias-request) :ret clojure.core/true?)
