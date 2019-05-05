(ns portkey.aws.lex-models (:require [portkey.aws]))

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

(clojure.core/defn- response-get-bots-response ([input] (response-get-bots-response nil input)) ([resultWrapper1270593 input] (clojure.core/let [rawinput1270592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270594 {"bots" (rawinput1270592 "bots"), "nextToken" (rawinput1270592 "nextToken")}] (clojure.core/cond-> {} (letvar1270594 "bots") (clojure.core/assoc :bots (deser-bot-metadata-list (clojure.core/get-in letvar1270594 ["bots"]))) (letvar1270594 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270594 ["nextToken"])))))))

(clojure.core/defn- response-get-bot-aliases-response ([input] (response-get-bot-aliases-response nil input)) ([resultWrapper1270596 input] (clojure.core/let [rawinput1270595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270597 {"BotAliases" (rawinput1270595 "BotAliases"), "nextToken" (rawinput1270595 "nextToken")}] (clojure.core/cond-> {} (letvar1270597 "BotAliases") (clojure.core/assoc :bot-aliases (deser-bot-alias-metadata-list (clojure.core/get-in letvar1270597 ["BotAliases"]))) (letvar1270597 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270597 ["nextToken"])))))))

(clojure.core/defn- response-get-export-response ([input] (response-get-export-response nil input)) ([resultWrapper1270599 input] (clojure.core/let [rawinput1270598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270600 {"name" (rawinput1270598 "name"), "version" (rawinput1270598 "version"), "resourceType" (rawinput1270598 "resourceType"), "exportType" (rawinput1270598 "exportType"), "exportStatus" (rawinput1270598 "exportStatus"), "failureReason" (rawinput1270598 "failureReason"), "url" (rawinput1270598 "url")}] (clojure.core/cond-> {} (letvar1270600 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1270600 ["name"]))) (letvar1270600 "version") (clojure.core/assoc :version (deser-numerical-version (clojure.core/get-in letvar1270600 ["version"]))) (letvar1270600 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1270600 ["resourceType"]))) (letvar1270600 "exportType") (clojure.core/assoc :export-type (deser-export-type (clojure.core/get-in letvar1270600 ["exportType"]))) (letvar1270600 "exportStatus") (clojure.core/assoc :export-status (deser-export-status (clojure.core/get-in letvar1270600 ["exportStatus"]))) (letvar1270600 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1270600 ["failureReason"]))) (letvar1270600 "url") (clojure.core/assoc :url (deser-string (clojure.core/get-in letvar1270600 ["url"])))))))

(clojure.core/defn- response-put-bot-response ([input] (response-put-bot-response nil input)) ([resultWrapper1270602 input] (clojure.core/let [rawinput1270601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270603 {"intents" (rawinput1270601 "intents"), "createdDate" (rawinput1270601 "createdDate"), "idleSessionTTLInSeconds" (rawinput1270601 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1270601 "clarificationPrompt"), "name" (rawinput1270601 "name"), "locale" (rawinput1270601 "locale"), "lastUpdatedDate" (rawinput1270601 "lastUpdatedDate"), "status" (rawinput1270601 "status"), "createVersion" (rawinput1270601 "createVersion"), "abortStatement" (rawinput1270601 "abortStatement"), "version" (rawinput1270601 "version"), "failureReason" (rawinput1270601 "failureReason"), "childDirected" (rawinput1270601 "childDirected"), "checksum" (rawinput1270601 "checksum"), "voiceId" (rawinput1270601 "voiceId"), "description" (rawinput1270601 "description")}] (clojure.core/cond-> {} (letvar1270603 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1270603 ["intents"]))) (letvar1270603 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270603 ["createdDate"]))) (letvar1270603 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1270603 ["idleSessionTTLInSeconds"]))) (letvar1270603 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1270603 ["clarificationPrompt"]))) (letvar1270603 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1270603 ["name"]))) (letvar1270603 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1270603 ["locale"]))) (letvar1270603 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270603 ["lastUpdatedDate"]))) (letvar1270603 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1270603 ["status"]))) (letvar1270603 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1270603 ["createVersion"]))) (letvar1270603 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1270603 ["abortStatement"]))) (letvar1270603 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270603 ["version"]))) (letvar1270603 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1270603 ["failureReason"]))) (letvar1270603 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1270603 ["childDirected"]))) (letvar1270603 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270603 ["checksum"]))) (letvar1270603 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1270603 ["voiceId"]))) (letvar1270603 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270603 ["description"])))))))

(clojure.core/defn- response-get-bot-channel-association-response ([input] (response-get-bot-channel-association-response nil input)) ([resultWrapper1270605 input] (clojure.core/let [rawinput1270604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270606 {"botAlias" (rawinput1270604 "botAlias"), "createdDate" (rawinput1270604 "createdDate"), "name" (rawinput1270604 "name"), "status" (rawinput1270604 "status"), "botConfiguration" (rawinput1270604 "botConfiguration"), "botName" (rawinput1270604 "botName"), "type" (rawinput1270604 "type"), "failureReason" (rawinput1270604 "failureReason"), "description" (rawinput1270604 "description")}] (clojure.core/cond-> {} (letvar1270606 "botAlias") (clojure.core/assoc :bot-alias (deser-alias-name (clojure.core/get-in letvar1270606 ["botAlias"]))) (letvar1270606 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270606 ["createdDate"]))) (letvar1270606 "name") (clojure.core/assoc :name (deser-bot-channel-name (clojure.core/get-in letvar1270606 ["name"]))) (letvar1270606 "status") (clojure.core/assoc :status (deser-channel-status (clojure.core/get-in letvar1270606 ["status"]))) (letvar1270606 "botConfiguration") (clojure.core/assoc :bot-configuration (deser-channel-configuration-map (clojure.core/get-in letvar1270606 ["botConfiguration"]))) (letvar1270606 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1270606 ["botName"]))) (letvar1270606 "type") (clojure.core/assoc :type (deser-channel-type (clojure.core/get-in letvar1270606 ["type"]))) (letvar1270606 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1270606 ["failureReason"]))) (letvar1270606 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270606 ["description"])))))))

(clojure.core/defn- response-bad-request-exception ([input] (response-bad-request-exception nil input)) ([resultWrapper1270608 input] (clojure.core/let [rawinput1270607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270609 {"message" (rawinput1270607 "message")}] (clojure.core/cond-> {} (letvar1270609 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270609 ["message"])))))))

(clojure.core/defn- response-precondition-failed-exception ([input] (response-precondition-failed-exception nil input)) ([resultWrapper1270611 input] (clojure.core/let [rawinput1270610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270612 {"message" (rawinput1270610 "message")}] (clojure.core/cond-> {} (letvar1270612 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270612 ["message"])))))))

(clojure.core/defn- response-put-bot-alias-response ([input] (response-put-bot-alias-response nil input)) ([resultWrapper1270614 input] (clojure.core/let [rawinput1270613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270615 {"name" (rawinput1270613 "name"), "description" (rawinput1270613 "description"), "botVersion" (rawinput1270613 "botVersion"), "botName" (rawinput1270613 "botName"), "lastUpdatedDate" (rawinput1270613 "lastUpdatedDate"), "createdDate" (rawinput1270613 "createdDate"), "checksum" (rawinput1270613 "checksum")}] (clojure.core/cond-> {} (letvar1270615 "name") (clojure.core/assoc :name (deser-alias-name (clojure.core/get-in letvar1270615 ["name"]))) (letvar1270615 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270615 ["description"]))) (letvar1270615 "botVersion") (clojure.core/assoc :bot-version (deser-version (clojure.core/get-in letvar1270615 ["botVersion"]))) (letvar1270615 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1270615 ["botName"]))) (letvar1270615 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270615 ["lastUpdatedDate"]))) (letvar1270615 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270615 ["createdDate"]))) (letvar1270615 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270615 ["checksum"])))))))

(clojure.core/defn- response-get-utterances-view-response ([input] (response-get-utterances-view-response nil input)) ([resultWrapper1270617 input] (clojure.core/let [rawinput1270616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270618 {"botName" (rawinput1270616 "botName"), "utterances" (rawinput1270616 "utterances")}] (clojure.core/cond-> {} (letvar1270618 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1270618 ["botName"]))) (letvar1270618 "utterances") (clojure.core/assoc :utterances (deser-lists-of-utterances (clojure.core/get-in letvar1270618 ["utterances"])))))))

(clojure.core/defn- response-create-slot-type-version-response ([input] (response-create-slot-type-version-response nil input)) ([resultWrapper1270620 input] (clojure.core/let [rawinput1270619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270621 {"name" (rawinput1270619 "name"), "description" (rawinput1270619 "description"), "enumerationValues" (rawinput1270619 "enumerationValues"), "lastUpdatedDate" (rawinput1270619 "lastUpdatedDate"), "createdDate" (rawinput1270619 "createdDate"), "version" (rawinput1270619 "version"), "checksum" (rawinput1270619 "checksum"), "valueSelectionStrategy" (rawinput1270619 "valueSelectionStrategy")}] (clojure.core/cond-> {} (letvar1270621 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1270621 ["name"]))) (letvar1270621 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270621 ["description"]))) (letvar1270621 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1270621 ["enumerationValues"]))) (letvar1270621 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270621 ["lastUpdatedDate"]))) (letvar1270621 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270621 ["createdDate"]))) (letvar1270621 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270621 ["version"]))) (letvar1270621 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270621 ["checksum"]))) (letvar1270621 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1270621 ["valueSelectionStrategy"])))))))

(clojure.core/defn- response-get-builtin-slot-types-response ([input] (response-get-builtin-slot-types-response nil input)) ([resultWrapper1270623 input] (clojure.core/let [rawinput1270622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270624 {"slotTypes" (rawinput1270622 "slotTypes"), "nextToken" (rawinput1270622 "nextToken")}] (clojure.core/cond-> {} (letvar1270624 "slotTypes") (clojure.core/assoc :slot-types (deser-builtin-slot-type-metadata-list (clojure.core/get-in letvar1270624 ["slotTypes"]))) (letvar1270624 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270624 ["nextToken"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1270626 input] (clojure.core/let [rawinput1270625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270627 {"referenceType" (rawinput1270625 "referenceType"), "exampleReference" (rawinput1270625 "exampleReference")}] (clojure.core/cond-> {} (letvar1270627 "referenceType") (clojure.core/assoc :reference-type (deser-reference-type (clojure.core/get-in letvar1270627 ["referenceType"]))) (letvar1270627 "exampleReference") (clojure.core/assoc :example-reference (deser-resource-reference (clojure.core/get-in letvar1270627 ["exampleReference"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1270629 input] (clojure.core/let [rawinput1270628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270630 {"Retry-After" (clojure.core/get-in input [:headers "Retry-After"]), "message" (rawinput1270628 "message")}] (clojure.core/cond-> {} (letvar1270630 "Retry-After") (clojure.core/assoc :retry-after-seconds (deser-string (clojure.core/get-in letvar1270630 ["Retry-After"]))) (letvar1270630 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270630 ["message"])))))))

(clojure.core/defn- response-start-import-response ([input] (response-start-import-response nil input)) ([resultWrapper1270632 input] (clojure.core/let [rawinput1270631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270633 {"name" (rawinput1270631 "name"), "resourceType" (rawinput1270631 "resourceType"), "mergeStrategy" (rawinput1270631 "mergeStrategy"), "importId" (rawinput1270631 "importId"), "importStatus" (rawinput1270631 "importStatus"), "createdDate" (rawinput1270631 "createdDate")}] (clojure.core/cond-> {} (letvar1270633 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1270633 ["name"]))) (letvar1270633 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1270633 ["resourceType"]))) (letvar1270633 "mergeStrategy") (clojure.core/assoc :merge-strategy (deser-merge-strategy (clojure.core/get-in letvar1270633 ["mergeStrategy"]))) (letvar1270633 "importId") (clojure.core/assoc :import-id (deser-string (clojure.core/get-in letvar1270633 ["importId"]))) (letvar1270633 "importStatus") (clojure.core/assoc :import-status (deser-import-status (clojure.core/get-in letvar1270633 ["importStatus"]))) (letvar1270633 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270633 ["createdDate"])))))))

(clojure.core/defn- response-internal-failure-exception ([input] (response-internal-failure-exception nil input)) ([resultWrapper1270635 input] (clojure.core/let [rawinput1270634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270636 {"message" (rawinput1270634 "message")}] (clojure.core/cond-> {} (letvar1270636 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270636 ["message"])))))))

(clojure.core/defn- response-get-import-response ([input] (response-get-import-response nil input)) ([resultWrapper1270638 input] (clojure.core/let [rawinput1270637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270639 {"name" (rawinput1270637 "name"), "resourceType" (rawinput1270637 "resourceType"), "mergeStrategy" (rawinput1270637 "mergeStrategy"), "importId" (rawinput1270637 "importId"), "importStatus" (rawinput1270637 "importStatus"), "failureReason" (rawinput1270637 "failureReason"), "createdDate" (rawinput1270637 "createdDate")}] (clojure.core/cond-> {} (letvar1270639 "name") (clojure.core/assoc :name (deser-name (clojure.core/get-in letvar1270639 ["name"]))) (letvar1270639 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1270639 ["resourceType"]))) (letvar1270639 "mergeStrategy") (clojure.core/assoc :merge-strategy (deser-merge-strategy (clojure.core/get-in letvar1270639 ["mergeStrategy"]))) (letvar1270639 "importId") (clojure.core/assoc :import-id (deser-string (clojure.core/get-in letvar1270639 ["importId"]))) (letvar1270639 "importStatus") (clojure.core/assoc :import-status (deser-import-status (clojure.core/get-in letvar1270639 ["importStatus"]))) (letvar1270639 "failureReason") (clojure.core/assoc :failure-reason (deser-string-list (clojure.core/get-in letvar1270639 ["failureReason"]))) (letvar1270639 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270639 ["createdDate"])))))))

(clojure.core/defn- response-create-bot-version-response ([input] (response-create-bot-version-response nil input)) ([resultWrapper1270641 input] (clojure.core/let [rawinput1270640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270642 {"intents" (rawinput1270640 "intents"), "createdDate" (rawinput1270640 "createdDate"), "idleSessionTTLInSeconds" (rawinput1270640 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1270640 "clarificationPrompt"), "name" (rawinput1270640 "name"), "locale" (rawinput1270640 "locale"), "lastUpdatedDate" (rawinput1270640 "lastUpdatedDate"), "status" (rawinput1270640 "status"), "abortStatement" (rawinput1270640 "abortStatement"), "version" (rawinput1270640 "version"), "failureReason" (rawinput1270640 "failureReason"), "childDirected" (rawinput1270640 "childDirected"), "checksum" (rawinput1270640 "checksum"), "voiceId" (rawinput1270640 "voiceId"), "description" (rawinput1270640 "description")}] (clojure.core/cond-> {} (letvar1270642 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1270642 ["intents"]))) (letvar1270642 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270642 ["createdDate"]))) (letvar1270642 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1270642 ["idleSessionTTLInSeconds"]))) (letvar1270642 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1270642 ["clarificationPrompt"]))) (letvar1270642 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1270642 ["name"]))) (letvar1270642 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1270642 ["locale"]))) (letvar1270642 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270642 ["lastUpdatedDate"]))) (letvar1270642 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1270642 ["status"]))) (letvar1270642 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1270642 ["abortStatement"]))) (letvar1270642 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270642 ["version"]))) (letvar1270642 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1270642 ["failureReason"]))) (letvar1270642 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1270642 ["childDirected"]))) (letvar1270642 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270642 ["checksum"]))) (letvar1270642 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1270642 ["voiceId"]))) (letvar1270642 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270642 ["description"])))))))

(clojure.core/defn- response-get-slot-type-versions-response ([input] (response-get-slot-type-versions-response nil input)) ([resultWrapper1270644 input] (clojure.core/let [rawinput1270643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270645 {"slotTypes" (rawinput1270643 "slotTypes"), "nextToken" (rawinput1270643 "nextToken")}] (clojure.core/cond-> {} (letvar1270645 "slotTypes") (clojure.core/assoc :slot-types (deser-slot-type-metadata-list (clojure.core/get-in letvar1270645 ["slotTypes"]))) (letvar1270645 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270645 ["nextToken"])))))))

(clojure.core/defn- response-get-intent-versions-response ([input] (response-get-intent-versions-response nil input)) ([resultWrapper1270647 input] (clojure.core/let [rawinput1270646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270648 {"intents" (rawinput1270646 "intents"), "nextToken" (rawinput1270646 "nextToken")}] (clojure.core/cond-> {} (letvar1270648 "intents") (clojure.core/assoc :intents (deser-intent-metadata-list (clojure.core/get-in letvar1270648 ["intents"]))) (letvar1270648 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270648 ["nextToken"])))))))

(clojure.core/defn- response-get-bot-response ([input] (response-get-bot-response nil input)) ([resultWrapper1270650 input] (clojure.core/let [rawinput1270649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270651 {"intents" (rawinput1270649 "intents"), "createdDate" (rawinput1270649 "createdDate"), "idleSessionTTLInSeconds" (rawinput1270649 "idleSessionTTLInSeconds"), "clarificationPrompt" (rawinput1270649 "clarificationPrompt"), "name" (rawinput1270649 "name"), "locale" (rawinput1270649 "locale"), "lastUpdatedDate" (rawinput1270649 "lastUpdatedDate"), "status" (rawinput1270649 "status"), "abortStatement" (rawinput1270649 "abortStatement"), "version" (rawinput1270649 "version"), "failureReason" (rawinput1270649 "failureReason"), "childDirected" (rawinput1270649 "childDirected"), "checksum" (rawinput1270649 "checksum"), "voiceId" (rawinput1270649 "voiceId"), "description" (rawinput1270649 "description")}] (clojure.core/cond-> {} (letvar1270651 "intents") (clojure.core/assoc :intents (deser-intent-list (clojure.core/get-in letvar1270651 ["intents"]))) (letvar1270651 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270651 ["createdDate"]))) (letvar1270651 "idleSessionTTLInSeconds") (clojure.core/assoc :idle-session-ttl-in-seconds (deser-session-ttl (clojure.core/get-in letvar1270651 ["idleSessionTTLInSeconds"]))) (letvar1270651 "clarificationPrompt") (clojure.core/assoc :clarification-prompt (deser-prompt (clojure.core/get-in letvar1270651 ["clarificationPrompt"]))) (letvar1270651 "name") (clojure.core/assoc :name (deser-bot-name (clojure.core/get-in letvar1270651 ["name"]))) (letvar1270651 "locale") (clojure.core/assoc :locale (deser-locale (clojure.core/get-in letvar1270651 ["locale"]))) (letvar1270651 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270651 ["lastUpdatedDate"]))) (letvar1270651 "status") (clojure.core/assoc :status (deser-status (clojure.core/get-in letvar1270651 ["status"]))) (letvar1270651 "abortStatement") (clojure.core/assoc :abort-statement (deser-statement (clojure.core/get-in letvar1270651 ["abortStatement"]))) (letvar1270651 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270651 ["version"]))) (letvar1270651 "failureReason") (clojure.core/assoc :failure-reason (deser-string (clojure.core/get-in letvar1270651 ["failureReason"]))) (letvar1270651 "childDirected") (clojure.core/assoc :child-directed (deser-boolean (clojure.core/get-in letvar1270651 ["childDirected"]))) (letvar1270651 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270651 ["checksum"]))) (letvar1270651 "voiceId") (clojure.core/assoc :voice-id (deser-string (clojure.core/get-in letvar1270651 ["voiceId"]))) (letvar1270651 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270651 ["description"])))))))

(clojure.core/defn- response-get-intents-response ([input] (response-get-intents-response nil input)) ([resultWrapper1270653 input] (clojure.core/let [rawinput1270652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270654 {"intents" (rawinput1270652 "intents"), "nextToken" (rawinput1270652 "nextToken")}] (clojure.core/cond-> {} (letvar1270654 "intents") (clojure.core/assoc :intents (deser-intent-metadata-list (clojure.core/get-in letvar1270654 ["intents"]))) (letvar1270654 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270654 ["nextToken"])))))))

(clojure.core/defn- response-conflict-exception ([input] (response-conflict-exception nil input)) ([resultWrapper1270656 input] (clojure.core/let [rawinput1270655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270657 {"message" (rawinput1270655 "message")}] (clojure.core/cond-> {} (letvar1270657 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270657 ["message"])))))))

(clojure.core/defn- response-put-slot-type-response ([input] (response-put-slot-type-response nil input)) ([resultWrapper1270659 input] (clojure.core/let [rawinput1270658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270660 {"valueSelectionStrategy" (rawinput1270658 "valueSelectionStrategy"), "createdDate" (rawinput1270658 "createdDate"), "name" (rawinput1270658 "name"), "enumerationValues" (rawinput1270658 "enumerationValues"), "lastUpdatedDate" (rawinput1270658 "lastUpdatedDate"), "createVersion" (rawinput1270658 "createVersion"), "version" (rawinput1270658 "version"), "checksum" (rawinput1270658 "checksum"), "description" (rawinput1270658 "description")}] (clojure.core/cond-> {} (letvar1270660 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1270660 ["valueSelectionStrategy"]))) (letvar1270660 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270660 ["createdDate"]))) (letvar1270660 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1270660 ["name"]))) (letvar1270660 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1270660 ["enumerationValues"]))) (letvar1270660 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270660 ["lastUpdatedDate"]))) (letvar1270660 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1270660 ["createVersion"]))) (letvar1270660 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270660 ["version"]))) (letvar1270660 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270660 ["checksum"]))) (letvar1270660 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270660 ["description"])))))))

(clojure.core/defn- response-get-bot-channel-associations-response ([input] (response-get-bot-channel-associations-response nil input)) ([resultWrapper1270662 input] (clojure.core/let [rawinput1270661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270663 {"botChannelAssociations" (rawinput1270661 "botChannelAssociations"), "nextToken" (rawinput1270661 "nextToken")}] (clojure.core/cond-> {} (letvar1270663 "botChannelAssociations") (clojure.core/assoc :bot-channel-associations (deser-bot-channel-association-list (clojure.core/get-in letvar1270663 ["botChannelAssociations"]))) (letvar1270663 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270663 ["nextToken"])))))))

(clojure.core/defn- response-not-found-exception ([input] (response-not-found-exception nil input)) ([resultWrapper1270665 input] (clojure.core/let [rawinput1270664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270666 {"message" (rawinput1270664 "message")}] (clojure.core/cond-> {} (letvar1270666 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1270666 ["message"])))))))

(clojure.core/defn- response-put-intent-response ([input] (response-put-intent-response nil input)) ([resultWrapper1270668 input] (clojure.core/let [rawinput1270667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270669 {"followUpPrompt" (rawinput1270667 "followUpPrompt"), "fulfillmentActivity" (rawinput1270667 "fulfillmentActivity"), "slots" (rawinput1270667 "slots"), "parentIntentSignature" (rawinput1270667 "parentIntentSignature"), "confirmationPrompt" (rawinput1270667 "confirmationPrompt"), "createdDate" (rawinput1270667 "createdDate"), "name" (rawinput1270667 "name"), "rejectionStatement" (rawinput1270667 "rejectionStatement"), "lastUpdatedDate" (rawinput1270667 "lastUpdatedDate"), "createVersion" (rawinput1270667 "createVersion"), "dialogCodeHook" (rawinput1270667 "dialogCodeHook"), "conclusionStatement" (rawinput1270667 "conclusionStatement"), "sampleUtterances" (rawinput1270667 "sampleUtterances"), "version" (rawinput1270667 "version"), "checksum" (rawinput1270667 "checksum"), "description" (rawinput1270667 "description")}] (clojure.core/cond-> {} (letvar1270669 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1270669 ["followUpPrompt"]))) (letvar1270669 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1270669 ["fulfillmentActivity"]))) (letvar1270669 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1270669 ["slots"]))) (letvar1270669 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1270669 ["parentIntentSignature"]))) (letvar1270669 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1270669 ["confirmationPrompt"]))) (letvar1270669 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270669 ["createdDate"]))) (letvar1270669 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1270669 ["name"]))) (letvar1270669 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1270669 ["rejectionStatement"]))) (letvar1270669 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270669 ["lastUpdatedDate"]))) (letvar1270669 "createVersion") (clojure.core/assoc :create-version (deser-boolean (clojure.core/get-in letvar1270669 ["createVersion"]))) (letvar1270669 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1270669 ["dialogCodeHook"]))) (letvar1270669 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1270669 ["conclusionStatement"]))) (letvar1270669 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1270669 ["sampleUtterances"]))) (letvar1270669 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270669 ["version"]))) (letvar1270669 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270669 ["checksum"]))) (letvar1270669 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270669 ["description"])))))))

(clojure.core/defn- response-get-intent-response ([input] (response-get-intent-response nil input)) ([resultWrapper1270671 input] (clojure.core/let [rawinput1270670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270672 {"followUpPrompt" (rawinput1270670 "followUpPrompt"), "fulfillmentActivity" (rawinput1270670 "fulfillmentActivity"), "slots" (rawinput1270670 "slots"), "parentIntentSignature" (rawinput1270670 "parentIntentSignature"), "confirmationPrompt" (rawinput1270670 "confirmationPrompt"), "createdDate" (rawinput1270670 "createdDate"), "name" (rawinput1270670 "name"), "rejectionStatement" (rawinput1270670 "rejectionStatement"), "lastUpdatedDate" (rawinput1270670 "lastUpdatedDate"), "dialogCodeHook" (rawinput1270670 "dialogCodeHook"), "conclusionStatement" (rawinput1270670 "conclusionStatement"), "sampleUtterances" (rawinput1270670 "sampleUtterances"), "version" (rawinput1270670 "version"), "checksum" (rawinput1270670 "checksum"), "description" (rawinput1270670 "description")}] (clojure.core/cond-> {} (letvar1270672 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1270672 ["followUpPrompt"]))) (letvar1270672 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1270672 ["fulfillmentActivity"]))) (letvar1270672 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1270672 ["slots"]))) (letvar1270672 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1270672 ["parentIntentSignature"]))) (letvar1270672 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1270672 ["confirmationPrompt"]))) (letvar1270672 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270672 ["createdDate"]))) (letvar1270672 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1270672 ["name"]))) (letvar1270672 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1270672 ["rejectionStatement"]))) (letvar1270672 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270672 ["lastUpdatedDate"]))) (letvar1270672 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1270672 ["dialogCodeHook"]))) (letvar1270672 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1270672 ["conclusionStatement"]))) (letvar1270672 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1270672 ["sampleUtterances"]))) (letvar1270672 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270672 ["version"]))) (letvar1270672 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270672 ["checksum"]))) (letvar1270672 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270672 ["description"])))))))

(clojure.core/defn- response-get-builtin-intent-response ([input] (response-get-builtin-intent-response nil input)) ([resultWrapper1270674 input] (clojure.core/let [rawinput1270673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270675 {"signature" (rawinput1270673 "signature"), "supportedLocales" (rawinput1270673 "supportedLocales"), "slots" (rawinput1270673 "slots")}] (clojure.core/cond-> {} (letvar1270675 "signature") (clojure.core/assoc :signature (deser-builtin-intent-signature (clojure.core/get-in letvar1270675 ["signature"]))) (letvar1270675 "supportedLocales") (clojure.core/assoc :supported-locales (deser-locale-list (clojure.core/get-in letvar1270675 ["supportedLocales"]))) (letvar1270675 "slots") (clojure.core/assoc :slots (deser-builtin-intent-slot-list (clojure.core/get-in letvar1270675 ["slots"])))))))

(clojure.core/defn- response-get-bot-alias-response ([input] (response-get-bot-alias-response nil input)) ([resultWrapper1270677 input] (clojure.core/let [rawinput1270676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270678 {"name" (rawinput1270676 "name"), "description" (rawinput1270676 "description"), "botVersion" (rawinput1270676 "botVersion"), "botName" (rawinput1270676 "botName"), "lastUpdatedDate" (rawinput1270676 "lastUpdatedDate"), "createdDate" (rawinput1270676 "createdDate"), "checksum" (rawinput1270676 "checksum")}] (clojure.core/cond-> {} (letvar1270678 "name") (clojure.core/assoc :name (deser-alias-name (clojure.core/get-in letvar1270678 ["name"]))) (letvar1270678 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270678 ["description"]))) (letvar1270678 "botVersion") (clojure.core/assoc :bot-version (deser-version (clojure.core/get-in letvar1270678 ["botVersion"]))) (letvar1270678 "botName") (clojure.core/assoc :bot-name (deser-bot-name (clojure.core/get-in letvar1270678 ["botName"]))) (letvar1270678 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270678 ["lastUpdatedDate"]))) (letvar1270678 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270678 ["createdDate"]))) (letvar1270678 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270678 ["checksum"])))))))

(clojure.core/defn- response-get-slot-type-response ([input] (response-get-slot-type-response nil input)) ([resultWrapper1270680 input] (clojure.core/let [rawinput1270679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270681 {"name" (rawinput1270679 "name"), "description" (rawinput1270679 "description"), "enumerationValues" (rawinput1270679 "enumerationValues"), "lastUpdatedDate" (rawinput1270679 "lastUpdatedDate"), "createdDate" (rawinput1270679 "createdDate"), "version" (rawinput1270679 "version"), "checksum" (rawinput1270679 "checksum"), "valueSelectionStrategy" (rawinput1270679 "valueSelectionStrategy")}] (clojure.core/cond-> {} (letvar1270681 "name") (clojure.core/assoc :name (deser-slot-type-name (clojure.core/get-in letvar1270681 ["name"]))) (letvar1270681 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270681 ["description"]))) (letvar1270681 "enumerationValues") (clojure.core/assoc :enumeration-values (deser-enumeration-values (clojure.core/get-in letvar1270681 ["enumerationValues"]))) (letvar1270681 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270681 ["lastUpdatedDate"]))) (letvar1270681 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270681 ["createdDate"]))) (letvar1270681 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270681 ["version"]))) (letvar1270681 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270681 ["checksum"]))) (letvar1270681 "valueSelectionStrategy") (clojure.core/assoc :value-selection-strategy (deser-slot-value-selection-strategy (clojure.core/get-in letvar1270681 ["valueSelectionStrategy"])))))))

(clojure.core/defn- response-get-bot-versions-response ([input] (response-get-bot-versions-response nil input)) ([resultWrapper1270683 input] (clojure.core/let [rawinput1270682 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270684 {"bots" (rawinput1270682 "bots"), "nextToken" (rawinput1270682 "nextToken")}] (clojure.core/cond-> {} (letvar1270684 "bots") (clojure.core/assoc :bots (deser-bot-metadata-list (clojure.core/get-in letvar1270684 ["bots"]))) (letvar1270684 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270684 ["nextToken"])))))))

(clojure.core/defn- response-get-builtin-intents-response ([input] (response-get-builtin-intents-response nil input)) ([resultWrapper1270686 input] (clojure.core/let [rawinput1270685 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270687 {"intents" (rawinput1270685 "intents"), "nextToken" (rawinput1270685 "nextToken")}] (clojure.core/cond-> {} (letvar1270687 "intents") (clojure.core/assoc :intents (deser-builtin-intent-metadata-list (clojure.core/get-in letvar1270687 ["intents"]))) (letvar1270687 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270687 ["nextToken"])))))))

(clojure.core/defn- response-get-slot-types-response ([input] (response-get-slot-types-response nil input)) ([resultWrapper1270689 input] (clojure.core/let [rawinput1270688 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270690 {"slotTypes" (rawinput1270688 "slotTypes"), "nextToken" (rawinput1270688 "nextToken")}] (clojure.core/cond-> {} (letvar1270690 "slotTypes") (clojure.core/assoc :slot-types (deser-slot-type-metadata-list (clojure.core/get-in letvar1270690 ["slotTypes"]))) (letvar1270690 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1270690 ["nextToken"])))))))

(clojure.core/defn- response-create-intent-version-response ([input] (response-create-intent-version-response nil input)) ([resultWrapper1270692 input] (clojure.core/let [rawinput1270691 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1270693 {"followUpPrompt" (rawinput1270691 "followUpPrompt"), "fulfillmentActivity" (rawinput1270691 "fulfillmentActivity"), "slots" (rawinput1270691 "slots"), "parentIntentSignature" (rawinput1270691 "parentIntentSignature"), "confirmationPrompt" (rawinput1270691 "confirmationPrompt"), "createdDate" (rawinput1270691 "createdDate"), "name" (rawinput1270691 "name"), "rejectionStatement" (rawinput1270691 "rejectionStatement"), "lastUpdatedDate" (rawinput1270691 "lastUpdatedDate"), "dialogCodeHook" (rawinput1270691 "dialogCodeHook"), "conclusionStatement" (rawinput1270691 "conclusionStatement"), "sampleUtterances" (rawinput1270691 "sampleUtterances"), "version" (rawinput1270691 "version"), "checksum" (rawinput1270691 "checksum"), "description" (rawinput1270691 "description")}] (clojure.core/cond-> {} (letvar1270693 "followUpPrompt") (clojure.core/assoc :follow-up-prompt (deser-follow-up-prompt (clojure.core/get-in letvar1270693 ["followUpPrompt"]))) (letvar1270693 "fulfillmentActivity") (clojure.core/assoc :fulfillment-activity (deser-fulfillment-activity (clojure.core/get-in letvar1270693 ["fulfillmentActivity"]))) (letvar1270693 "slots") (clojure.core/assoc :slots (deser-slot-list (clojure.core/get-in letvar1270693 ["slots"]))) (letvar1270693 "parentIntentSignature") (clojure.core/assoc :parent-intent-signature (deser-builtin-intent-signature (clojure.core/get-in letvar1270693 ["parentIntentSignature"]))) (letvar1270693 "confirmationPrompt") (clojure.core/assoc :confirmation-prompt (deser-prompt (clojure.core/get-in letvar1270693 ["confirmationPrompt"]))) (letvar1270693 "createdDate") (clojure.core/assoc :created-date (deser-timestamp (clojure.core/get-in letvar1270693 ["createdDate"]))) (letvar1270693 "name") (clojure.core/assoc :name (deser-intent-name (clojure.core/get-in letvar1270693 ["name"]))) (letvar1270693 "rejectionStatement") (clojure.core/assoc :rejection-statement (deser-statement (clojure.core/get-in letvar1270693 ["rejectionStatement"]))) (letvar1270693 "lastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (clojure.core/get-in letvar1270693 ["lastUpdatedDate"]))) (letvar1270693 "dialogCodeHook") (clojure.core/assoc :dialog-code-hook (deser-code-hook (clojure.core/get-in letvar1270693 ["dialogCodeHook"]))) (letvar1270693 "conclusionStatement") (clojure.core/assoc :conclusion-statement (deser-statement (clojure.core/get-in letvar1270693 ["conclusionStatement"]))) (letvar1270693 "sampleUtterances") (clojure.core/assoc :sample-utterances (deser-intent-utterance-list (clojure.core/get-in letvar1270693 ["sampleUtterances"]))) (letvar1270693 "version") (clojure.core/assoc :version (deser-version (clojure.core/get-in letvar1270693 ["version"]))) (letvar1270693 "checksum") (clojure.core/assoc :checksum (deser-string (clojure.core/get-in letvar1270693 ["checksum"]))) (letvar1270693 "description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1270693 ["description"])))))))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-metadata/name :portkey.aws.lex-models.bot-metadata/description :portkey.aws.lex-models.bot-metadata/status :portkey.aws.lex-models.bot-metadata/last-updated-date :portkey.aws.lex-models.bot-metadata/created-date :portkey.aws.lex-models.bot-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/merge-strategy #{:fail-on-conflict "FAIL_ON_CONFLICT" :overwrite-latest "OVERWRITE_LATEST"})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-response/bots :portkey.aws.lex-models.get-bots-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-alias-metadata/name :portkey.aws.lex-models.bot-alias-metadata/description :portkey.aws.lex-models.bot-alias-metadata/bot-version :portkey.aws.lex-models.bot-alias-metadata/bot-name :portkey.aws.lex-models.bot-alias-metadata/last-updated-date :portkey.aws.lex-models.bot-alias-metadata/created-date :portkey.aws.lex-models.bot-alias-metadata/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-bot-alias-request/name :portkey.aws.lex-models.put-bot-alias-request/bot-version :portkey.aws.lex-models.put-bot-alias-request/bot-name] :opt-un [:portkey.aws.lex-models.put-bot-alias-request/description :portkey.aws.lex-models.put-bot-alias-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/string-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/string))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/locale))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-slot-type-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-reference/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-reference/name :portkey.aws.lex-models.resource-reference/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/lambda-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 20 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2048)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.lex-models/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-aliases-response/bot-aliases :portkey.aws.lex-models.get-bot-aliases-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/export-status (clojure.spec.alpha/and :portkey.aws.lex-models/export-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-response/url (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-export-response/name :portkey.aws.lex-models.get-export-response/version :portkey.aws.lex-models.get-export-response/resource-type :portkey.aws.lex-models.get-export-response/export-type :portkey.aws.lex-models.get-export-response/export-status :portkey.aws.lex-models.get-export-response/failure-reason :portkey.aws.lex-models.get-export-response/url]))

(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.lex-models/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.lex-models.prompt/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.prompt/messages :portkey.aws.lex-models.prompt/max-attempts] :opt-un [:portkey.aws.lex-models.prompt/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-response/intents :portkey.aws.lex-models.put-bot-response/created-date :portkey.aws.lex-models.put-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.put-bot-response/clarification-prompt :portkey.aws.lex-models.put-bot-response/name :portkey.aws.lex-models.put-bot-response/locale :portkey.aws.lex-models.put-bot-response/last-updated-date :portkey.aws.lex-models.put-bot-response/status :portkey.aws.lex-models.put-bot-response/create-version :portkey.aws.lex-models.put-bot-response/abort-statement :portkey.aws.lex-models.put-bot-response/version :portkey.aws.lex-models.put-bot-response/failure-reason :portkey.aws.lex-models.put-bot-response/child-directed :portkey.aws.lex-models.put-bot-response/checksum :portkey.aws.lex-models.put-bot-response/voice-id :portkey.aws.lex-models.put-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/import-status #{"IN_PROGRESS" :in-progress "COMPLETE" "FAILED" :complete :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-association-response/bot-alias :portkey.aws.lex-models.get-bot-channel-association-response/created-date :portkey.aws.lex-models.get-bot-channel-association-response/name :portkey.aws.lex-models.get-bot-channel-association-response/status :portkey.aws.lex-models.get-bot-channel-association-response/bot-configuration :portkey.aws.lex-models.get-bot-channel-association-response/bot-name :portkey.aws.lex-models.get-bot-channel-association-response/type :portkey.aws.lex-models.get-bot-channel-association-response/failure-reason :portkey.aws.lex-models.get-bot-channel-association-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.lex-models/string :portkey.aws.lex-models/string))

(clojure.spec.alpha/def :portkey.aws.lex-models.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/precondition-failed-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.precondition-failed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-bot-alias-response/name :portkey.aws.lex-models.put-bot-alias-response/description :portkey.aws.lex-models.put-bot-alias-response/bot-version :portkey.aws.lex-models.put-bot-alias-response/bot-name :portkey.aws.lex-models.put-bot-alias-response/last-updated-date :portkey.aws.lex-models.put-bot-alias-response/created-date :portkey.aws.lex-models.put-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-status #{:ready "IN_PROGRESS" :in-progress "READY" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bots-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bots-request/next-token :portkey.aws.lex-models.get-bots-request/max-results :portkey.aws.lex-models.get-bots-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/locale #{"de-DE" :en-gb :de-de "en-US" "en-GB" :en-us})

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.lex-models/utterance-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/count (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.lex-models/count))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-data/utterance-string :portkey.aws.lex-models.utterance-data/count :portkey.aws.lex-models.utterance-data/distinct-users :portkey.aws.lex-models.utterance-data/first-uttered-date :portkey.aws.lex-models.utterance-data/last-uttered-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^(-|^([A-Za-z]_?)+$)$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-channel-associations-request/bot-name :portkey.aws.lex-models.get-bot-channel-associations-request/bot-alias] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-request/next-token :portkey.aws.lex-models.get-bot-channel-associations-request/max-results :portkey.aws.lex-models.get-bot-channel-associations-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/process-behavior (clojure.spec.alpha/and :portkey.aws.lex-models/process-behavior))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-bot-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-bot-request/name :portkey.aws.lex-models.put-bot-request/locale :portkey.aws.lex-models.put-bot-request/child-directed] :opt-un [:portkey.aws.lex-models.put-bot-request/intents :portkey.aws.lex-models.put-bot-request/idle-session-ttl-in-seconds :portkey.aws.lex-models.put-bot-request/clarification-prompt :portkey.aws.lex-models.put-bot-request/process-behavior :portkey.aws.lex-models.put-bot-request/create-version :portkey.aws.lex-models.put-bot-request/abort-statement :portkey.aws.lex-models.put-bot-request/checksum :portkey.aws.lex-models.put-bot-request/voice-id :portkey.aws.lex-models.put-bot-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-value-selection-strategy #{:original-value "ORIGINAL_VALUE" :top-resolution "TOP_RESOLUTION"})

(clojure.spec.alpha/def :portkey.aws.lex-models/prompt-max-attempts (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-intent-slot))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-bot-version-request/name] :opt-un [:portkey.aws.lex-models.create-bot-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.utterance-list/bot-version :portkey.aws.lex-models.utterance-list/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.lex-models/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-utterances-view-response/bot-name :portkey.aws.lex-models.get-utterances-view-response/utterances]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-slot-type-version-response/name :portkey.aws.lex-models.create-slot-type-version-response/description :portkey.aws.lex-models.create-slot-type-version-response/enumeration-values :portkey.aws.lex-models.create-slot-type-version-response/last-updated-date :portkey.aws.lex-models.create-slot-type-version-response/created-date :portkey.aws.lex-models.create-slot-type-version-response/version :portkey.aws.lex-models.create-slot-type-version-response/checksum :portkey.aws.lex-models.create-slot-type-version-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-intent-version-request/name :portkey.aws.lex-models.delete-intent-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-response/slot-types :portkey.aws.lex-models.get-builtin-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.statement/messages (clojure.spec.alpha/and :portkey.aws.lex-models/message-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.statement/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models/statement (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.statement/messages] :opt-un [:portkey.aws.lex-models.statement/response-card]))

(clojure.spec.alpha/def :portkey.aws.lex-models/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-slot-type-request/name] :opt-un [:portkey.aws.lex-models.put-slot-type-request/description :portkey.aws.lex-models.put-slot-type-request/enumeration-values :portkey.aws.lex-models.put-slot-type-request/checksum :portkey.aws.lex-models.put-slot-type-request/value-selection-strategy :portkey.aws.lex-models.put-slot-type-request/create-version]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-intent-version-request/name] :opt-un [:portkey.aws.lex-models.create-intent-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.lex-models/reference-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.lex-models/resource-reference))
(clojure.spec.alpha/def :portkey.aws.lex-models/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.resource-in-use-exception/reference-type :portkey.aws.lex-models.resource-in-use-exception/example-reference]))

(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/uri (clojure.spec.alpha/and :portkey.aws.lex-models/lambda-arn))
(clojure.spec.alpha/def :portkey.aws.lex-models.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.lex-models/message-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/code-hook (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.code-hook/uri :portkey.aws.lex-models.code-hook/message-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.limit-exceeded-exception/retry-after-seconds :portkey.aws.lex-models.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.create-slot-type-version-request/name] :opt-un [:portkey.aws.lex-models.create-slot-type-version-request/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.lex-models/export-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-export-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-export-request/name :portkey.aws.lex-models.get-export-request/version :portkey.aws.lex-models.get-export-request/resource-type :portkey.aws.lex-models.get-export-request/export-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-request/next-token :portkey.aws.lex-models.get-slot-types-request/max-results :portkey.aws.lex-models.get-slot-types-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-request/locale :portkey.aws.lex-models.get-builtin-intents-request/signature-contains :portkey.aws.lex-models.get-builtin-intents-request/next-token :portkey.aws.lex-models.get-builtin-intents-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-alias-request/name :portkey.aws.lex-models.delete-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/status #{"READY_BASIC_TESTING" :ready-basic-testing "NOT_BUILT" :ready :building :not-built "READY" "BUILDING" "FAILED" :failed})

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.start-import-response/name :portkey.aws.lex-models.start-import-response/resource-type :portkey.aws.lex-models.start-import-response/merge-strategy :portkey.aws.lex-models.start-import-response/import-id :portkey.aws.lex-models.start-import-response/import-status :portkey.aws.lex-models.start-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models/group-number (clojure.spec.alpha/int-in 1 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models/priority (clojure.spec.alpha/int-in 0 100))

(clojure.spec.alpha/def :portkey.aws.lex-models/status-type #{"Detected" :missed "Missed" :detected})

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-slot-type-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-slot-type-version-request/name :portkey.aws.lex-models.delete-slot-type-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/numerical-version))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-version-request/name :portkey.aws.lex-models.delete-bot-version-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-versions (clojure.spec.alpha/coll-of :portkey.aws.lex-models/version :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-type #{:custom-payload :ssml :plain-text "PlainText" "CustomPayload" "SSML"})

(clojure.spec.alpha/def :portkey.aws.lex-models/session-ttl (clojure.spec.alpha/int-in 60 86400))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-alias-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-alias-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.lex-models.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/internal-failure-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models/follow-up-prompt (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.follow-up-prompt/prompt :portkey.aws.lex-models.follow-up-prompt/rejection-statement] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-channel-association-request/name :portkey.aws.lex-models.get-bot-channel-association-request/bot-name :portkey.aws.lex-models.get-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/import-status (clojure.spec.alpha/and :portkey.aws.lex-models/import-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-import-response/name :portkey.aws.lex-models.get-import-response/resource-type :portkey.aws.lex-models.get-import-response/merge-strategy :portkey.aws.lex-models.get-import-response/import-id :portkey.aws.lex-models.get-import-response/import-status :portkey.aws.lex-models.get-import-response/failure-reason :portkey.aws.lex-models.get-import-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-slot (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-slot/name]))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-bot-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-bot-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-bot-version-response/intents :portkey.aws.lex-models.create-bot-version-response/created-date :portkey.aws.lex-models.create-bot-version-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.create-bot-version-response/clarification-prompt :portkey.aws.lex-models.create-bot-version-response/name :portkey.aws.lex-models.create-bot-version-response/locale :portkey.aws.lex-models.create-bot-version-response/last-updated-date :portkey.aws.lex-models.create-bot-version-response/status :portkey.aws.lex-models.create-bot-version-response/abort-statement :portkey.aws.lex-models.create-bot-version-response/version :portkey.aws.lex-models.create-bot-version-response/failure-reason :portkey.aws.lex-models.create-bot-version-response/child-directed :portkey.aws.lex-models.create-bot-version-response/checksum :portkey.aws.lex-models.create-bot-version-response/voice-id :portkey.aws.lex-models.create-bot-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-request/next-token :portkey.aws.lex-models.get-intents-request/max-results :portkey.aws.lex-models.get-intents-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-response/slot-types :portkey.aws.lex-models.get-slot-type-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-versions-request/name] :opt-un [:portkey.aws.lex-models.get-bot-versions-request/next-token :portkey.aws.lex-models.get-bot-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-versions-response/intents :portkey.aws.lex-models.get-intent-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-slot-type-versions-request/name] :opt-un [:portkey.aws.lex-models.get-slot-type-versions-request/next-token :portkey.aws.lex-models.get-slot-type-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/idle-session-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.lex-models/session-ttl))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/status (clojure.spec.alpha/and :portkey.aws.lex-models/status))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-response/intents :portkey.aws.lex-models.get-bot-response/created-date :portkey.aws.lex-models.get-bot-response/idle-session-ttl-in-seconds :portkey.aws.lex-models.get-bot-response/clarification-prompt :portkey.aws.lex-models.get-bot-response/name :portkey.aws.lex-models.get-bot-response/locale :portkey.aws.lex-models.get-bot-response/last-updated-date :portkey.aws.lex-models.get-bot-response/status :portkey.aws.lex-models.get-bot-response/abort-statement :portkey.aws.lex-models.get-bot-response/version :portkey.aws.lex-models.get-bot-response/failure-reason :portkey.aws.lex-models.get-bot-response/child-directed :portkey.aws.lex-models.get-bot-response/checksum :portkey.aws.lex-models.get-bot-response/voice-id :portkey.aws.lex-models.get-bot-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.lex-models/locale))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-slot-types-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-slot-types-request/locale :portkey.aws.lex-models.get-builtin-slot-types-request/signature-contains :portkey.aws.lex-models.get-builtin-slot-types-request/next-token :portkey.aws.lex-models.get-builtin-slot-types-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent))

(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity-type #{:code-hook "ReturnIntent" "CodeHook" :return-intent})

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-channel-association))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intents-response/intents :portkey.aws.lex-models.get-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.lex-models/list-of-utterance (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-data))

(clojure.spec.alpha/def :portkey.aws.lex-models/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 0 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-slot-type-response/value-selection-strategy :portkey.aws.lex-models.put-slot-type-response/created-date :portkey.aws.lex-models.put-slot-type-response/name :portkey.aws.lex-models.put-slot-type-response/enumeration-values :portkey.aws.lex-models.put-slot-type-response/last-updated-date :portkey.aws.lex-models.put-slot-type-response/create-version :portkey.aws.lex-models.put-slot-type-response/version :portkey.aws.lex-models.put-slot-type-response/checksum :portkey.aws.lex-models.put-slot-type-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-channel-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-channel-associations-response/bot-channel-associations :portkey.aws.lex-models.get-bot-channel-associations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.message/content-type (clojure.spec.alpha/and :portkey.aws.lex-models/content-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/content (clojure.spec.alpha/and :portkey.aws.lex-models/content-string))
(clojure.spec.alpha/def :portkey.aws.lex-models.message/group-number (clojure.spec.alpha/and :portkey.aws.lex-models/group-number))
(clojure.spec.alpha/def :portkey.aws.lex-models/message (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.message/content-type :portkey.aws.lex-models.message/content] :opt-un [:portkey.aws.lex-models.message/group-number]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-builtin-intent-request/signature] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.lex-models/export-type #{"ALEXA_SKILLS_KIT" :lex "LEX" :alexa-skills-kit})

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.lex-models/user-id))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-utterances-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-utterances-request/bot-name :portkey.aws.lex-models.delete-utterances-request/user-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^((AMAZON\.)_?|[A-Za-z]_?)+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-values (clojure.spec.alpha/coll-of :portkey.aws.lex-models/enumeration-value :min-count 1 :max-count 10000))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 2 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 50)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.slot/priority (clojure.spec.alpha/and :portkey.aws.lex-models/priority))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/response-card (clojure.spec.alpha/and :portkey.aws.lex-models/response-card))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-type (clojure.spec.alpha/and :portkey.aws.lex-models/custom-or-builtin-slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-constraint (clojure.spec.alpha/and :portkey.aws.lex-models/slot-constraint))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/slot-type-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/slot-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/value-elicitation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/slot (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.slot/name :portkey.aws.lex-models.slot/slot-constraint] :opt-un [:portkey.aws.lex-models.slot/priority :portkey.aws.lex-models.slot/response-card :portkey.aws.lex-models.slot/slot-type :portkey.aws.lex-models.slot/slot-type-version :portkey.aws.lex-models.slot/sample-utterances :portkey.aws.lex-models.slot/value-elicitation-prompt :portkey.aws.lex-models.slot/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/payload (clojure.spec.alpha/and :portkey.aws.lex-models/blob))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/resource-type (clojure.spec.alpha/and :portkey.aws.lex-models/resource-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.start-import-request/merge-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/start-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.start-import-request/payload :portkey.aws.lex-models.start-import-request/resource-type :portkey.aws.lex-models.start-import-request/merge-strategy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/builtin-slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z](-|_|.)?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models/resource-type #{:bot "SLOT_TYPE" "INTENT" :slot-type :intent "BOT"})

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-intent-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.put-intent-response/follow-up-prompt :portkey.aws.lex-models.put-intent-response/fulfillment-activity :portkey.aws.lex-models.put-intent-response/slots :portkey.aws.lex-models.put-intent-response/parent-intent-signature :portkey.aws.lex-models.put-intent-response/confirmation-prompt :portkey.aws.lex-models.put-intent-response/created-date :portkey.aws.lex-models.put-intent-response/name :portkey.aws.lex-models.put-intent-response/rejection-statement :portkey.aws.lex-models.put-intent-response/last-updated-date :portkey.aws.lex-models.put-intent-response/create-version :portkey.aws.lex-models.put-intent-response/dialog-code-hook :portkey.aws.lex-models.put-intent-response/conclusion-statement :portkey.aws.lex-models.put-intent-response/sample-utterances :portkey.aws.lex-models.put-intent-response/version :portkey.aws.lex-models.put-intent-response/checksum :portkey.aws.lex-models.put-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/delete-bot-channel-association-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.delete-bot-channel-association-request/name :portkey.aws.lex-models.delete-bot-channel-association-request/bot-name :portkey.aws.lex-models.delete-bot-channel-association-request/bot-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models/fulfillment-activity (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.fulfillment-activity/type] :opt-un [:portkey.aws.lex-models.fulfillment-activity/code-hook]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-status #{"IN_PROGRESS" :in-progress :created "FAILED" :failed "CREATED"})

(clojure.spec.alpha/def :portkey.aws.lex-models/message-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/message :min-count 1 :max-count 15))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-intent-versions-request/name] :opt-un [:portkey.aws.lex-models.get-intent-versions-request/next-token :portkey.aws.lex-models.get-intent-versions-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-intent-request/name :portkey.aws.lex-models.get-intent-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-intent-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-intent-response/follow-up-prompt :portkey.aws.lex-models.get-intent-response/fulfillment-activity :portkey.aws.lex-models.get-intent-response/slots :portkey.aws.lex-models.get-intent-response/parent-intent-signature :portkey.aws.lex-models.get-intent-response/confirmation-prompt :portkey.aws.lex-models.get-intent-response/created-date :portkey.aws.lex-models.get-intent-response/name :portkey.aws.lex-models.get-intent-response/rejection-statement :portkey.aws.lex-models.get-intent-response/last-updated-date :portkey.aws.lex-models.get-intent-response/dialog-code-hook :portkey.aws.lex-models.get-intent-response/conclusion-statement :portkey.aws.lex-models.get-intent-response/sample-utterances :portkey.aws.lex-models.get-intent-response/version :portkey.aws.lex-models.get-intent-response/checksum :portkey.aws.lex-models.get-intent-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.intent-metadata/name :portkey.aws.lex-models.intent-metadata/description :portkey.aws.lex-models.intent-metadata/last-updated-date :portkey.aws.lex-models.intent-metadata/created-date :portkey.aws.lex-models.intent-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-constraint #{"Required" :optional "Optional" :required})

(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.slot-type-metadata/name :portkey.aws.lex-models.slot-type-metadata/description :portkey.aws.lex-models.slot-type-metadata/last-updated-date :portkey.aws.lex-models.slot-type-metadata/created-date :portkey.aws.lex-models.slot-type-metadata/version]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/intent-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.lex-models/slot-type-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/slot-type-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/create-version (clojure.spec.alpha/and :portkey.aws.lex-models/boolean))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.put-intent-request/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/put-intent-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.put-intent-request/name] :opt-un [:portkey.aws.lex-models.put-intent-request/follow-up-prompt :portkey.aws.lex-models.put-intent-request/fulfillment-activity :portkey.aws.lex-models.put-intent-request/slots :portkey.aws.lex-models.put-intent-request/parent-intent-signature :portkey.aws.lex-models.put-intent-request/confirmation-prompt :portkey.aws.lex-models.put-intent-request/rejection-statement :portkey.aws.lex-models.put-intent-request/create-version :portkey.aws.lex-models.put-intent-request/dialog-code-hook :portkey.aws.lex-models.put-intent-request/conclusion-statement :portkey.aws.lex-models.put-intent-request/sample-utterances :portkey.aws.lex-models.put-intent-request/checksum :portkey.aws.lex-models.put-intent-request/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/reference-type #{:bot :bot-channel "BotAlias" "BotChannel" :intent :bot-alias "Bot" "Intent"})

(clojure.spec.alpha/def :portkey.aws.lex-models/max-results (clojure.spec.alpha/int-in 1 50))

(clojure.spec.alpha/def :portkey.aws.lex-models/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 64)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-intent-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-intent-metadata/signature :portkey.aws.lex-models.builtin-intent-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models/intent-utterance-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance :min-count 0 :max-count 1500))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intent-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intent-response/signature :portkey.aws.lex-models.get-builtin-intent-response/supported-locales :portkey.aws.lex-models.get-builtin-intent-response/slots]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-slot-type-request/name :portkey.aws.lex-models.get-slot-type-request/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.lex-models/value))
(clojure.spec.alpha/def :portkey.aws.lex-models.enumeration-value/synonyms (clojure.spec.alpha/and :portkey.aws.lex-models/synonym-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/enumeration-value (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.enumeration-value/value] :opt-un [:portkey.aws.lex-models.enumeration-value/synonyms]))

(clojure.spec.alpha/def :portkey.aws.lex-models/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.lex-models/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-alias-response/name :portkey.aws.lex-models.get-bot-alias-response/description :portkey.aws.lex-models.get-bot-alias-response/bot-version :portkey.aws.lex-models.get-bot-alias-response/bot-name :portkey.aws.lex-models.get-bot-alias-response/last-updated-date :portkey.aws.lex-models.get-bot-alias-response/created-date :portkey.aws.lex-models.get-bot-alias-response/checksum]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.lex-models/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.lex-models/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-type-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-type-response/name :portkey.aws.lex-models.get-slot-type-response/description :portkey.aws.lex-models.get-slot-type-response/enumeration-values :portkey.aws.lex-models.get-slot-type-response/last-updated-date :portkey.aws.lex-models.get-slot-type-response/created-date :portkey.aws.lex-models.get-slot-type-response/version :portkey.aws.lex-models.get-slot-type-response/checksum :portkey.aws.lex-models.get-slot-type-response/value-selection-strategy]))

(clojure.spec.alpha/def :portkey.aws.lex-models/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"[a-zA-Z_]+" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.lex-models/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-bot-versions-response/bots :portkey.aws.lex-models.get-bot-versions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-request/name :portkey.aws.lex-models.get-bot-request/version-or-alias] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.lex-models/max-results))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-aliases-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-aliases-request/bot-name] :opt-un [:portkey.aws.lex-models.get-bot-aliases-request/next-token :portkey.aws.lex-models.get-bot-aliases-request/max-results :portkey.aws.lex-models.get-bot-aliases-request/name-contains]))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-metadata-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/bot-metadata))

(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/status (clojure.spec.alpha/and :portkey.aws.lex-models/channel-status))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.lex-models/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.lex-models/channel-type))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/failure-reason (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.bot-channel-association/bot-alias :portkey.aws.lex-models.bot-channel-association/created-date :portkey.aws.lex-models.bot-channel-association/name :portkey.aws.lex-models.bot-channel-association/status :portkey.aws.lex-models.bot-channel-association/bot-configuration :portkey.aws.lex-models.bot-channel-association/bot-name :portkey.aws.lex-models.bot-channel-association/type :portkey.aws.lex-models.bot-channel-association/failure-reason :portkey.aws.lex-models.bot-channel-association/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-import-request/import-id (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-import-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-import-request/import-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1012852__auto__] (clojure.core/<= 1 (clojure.core/count s__1012852__auto__))) (clojure.core/fn [s__1012853__auto__] (clojure.core/< (clojure.core/count s__1012853__auto__) 100)) (clojure.core/fn [s__1012854__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__1012854__auto__))))

(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.lex-models/locale-list))
(clojure.spec.alpha/def :portkey.aws.lex-models/builtin-slot-type-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.builtin-slot-type-metadata/signature :portkey.aws.lex-models.builtin-slot-type-metadata/supported-locales]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.lex-models/alias-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-bot-alias-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-bot-alias-request/name :portkey.aws.lex-models.get-bot-alias-request/bot-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/process-behavior #{:save "SAVE" :build "BUILD"})

(clojure.spec.alpha/def :portkey.aws.lex-models/synonym-list (clojure.spec.alpha/coll-of :portkey.aws.lex-models/value))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-builtin-intents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-builtin-intents-response/intents :portkey.aws.lex-models.get-builtin-intents-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.lex-models/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.lex-models/next-token))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-slot-types-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.get-slot-types-response/slot-types :portkey.aws.lex-models.get-slot-types-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.lex-models/lists-of-utterances (clojure.spec.alpha/coll-of :portkey.aws.lex-models/utterance-list))

(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.intent/intent-version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models/intent (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.intent/intent-name :portkey.aws.lex-models.intent/intent-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.lex-models/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/slots (clojure.spec.alpha/and :portkey.aws.lex-models/slot-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.lex-models/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.lex-models/prompt))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/created-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/name (clojure.spec.alpha/and :portkey.aws.lex-models/intent-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.lex-models/timestamp))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.lex-models/code-hook))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.lex-models/statement))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.lex-models/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/version (clojure.spec.alpha/and :portkey.aws.lex-models/version))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/checksum (clojure.spec.alpha/and :portkey.aws.lex-models/string))
(clojure.spec.alpha/def :portkey.aws.lex-models.create-intent-version-response/description (clojure.spec.alpha/and :portkey.aws.lex-models/description))
(clojure.spec.alpha/def :portkey.aws.lex-models/create-intent-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.lex-models.create-intent-version-response/follow-up-prompt :portkey.aws.lex-models.create-intent-version-response/fulfillment-activity :portkey.aws.lex-models.create-intent-version-response/slots :portkey.aws.lex-models.create-intent-version-response/parent-intent-signature :portkey.aws.lex-models.create-intent-version-response/confirmation-prompt :portkey.aws.lex-models.create-intent-version-response/created-date :portkey.aws.lex-models.create-intent-version-response/name :portkey.aws.lex-models.create-intent-version-response/rejection-statement :portkey.aws.lex-models.create-intent-version-response/last-updated-date :portkey.aws.lex-models.create-intent-version-response/dialog-code-hook :portkey.aws.lex-models.create-intent-version-response/conclusion-statement :portkey.aws.lex-models.create-intent-version-response/sample-utterances :portkey.aws.lex-models.create-intent-version-response/version :portkey.aws.lex-models.create-intent-version-response/checksum :portkey.aws.lex-models.create-intent-version-response/description]))

(clojure.spec.alpha/def :portkey.aws.lex-models/channel-type #{:facebook "Slack" :kik "Kik" "Twilio-Sms" :slack "Facebook" :twilio-sms})

(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.lex-models/bot-name))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.lex-models/bot-versions))
(clojure.spec.alpha/def :portkey.aws.lex-models.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.lex-models/status-type))
(clojure.spec.alpha/def :portkey.aws.lex-models/get-utterances-view-request (clojure.spec.alpha/keys :req-un [:portkey.aws.lex-models.get-utterances-view-request/bot-name :portkey.aws.lex-models.get-utterances-view-request/bot-versions :portkey.aws.lex-models.get-utterances-view-request/status-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.lex-models/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-channel-association-request delete-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotChannelAssociation", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-slot-types-request get-builtin-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinSlotTypes", :http.request.configuration/output-deser-fn response-get-builtin-slot-types-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-channel-associations-request get-bot-channel-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-channel-associations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-channel-associations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotChannelAssociations", :http.request.configuration/output-deser-fn response-get-bot-channel-associations-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-slot-type-version-request create-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/create-slot-type-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSlotTypeVersion", :http.request.configuration/output-deser-fn response-create-slot-type-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-slot-type-version-response))

(clojure.core/defn get-import ([get-import-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-import-request get-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/{importId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetImport", :http.request.configuration/output-deser-fn response-get-import-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-import-response))

(clojure.core/defn get-slot-type ([get-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-type-request get-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotType", :http.request.configuration/output-deser-fn response-get-slot-type-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intent-versions-request get-intent-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-intent-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intent-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntentVersions", :http.request.configuration/output-deser-fn response-get-intent-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-utterances-view-request get-utterances-view-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-utterances-view-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botname}/utterances?view=aggregation", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-utterances-view-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetUtterancesView", :http.request.configuration/output-deser-fn response-get-utterances-view-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-intent-version-request delete-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIntentVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-intents-request get-builtin-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinIntents", :http.request.configuration/output-deser-fn response-get-builtin-intents-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-types-request get-slot-types-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-types-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-types-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotTypes", :http.request.configuration/output-deser-fn response-get-slot-types-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-alias-request get-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotAlias", :http.request.configuration/output-deser-fn response-get-bot-alias-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-alias-response))

(clojure.core/defn get-export ([get-export-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-export-request get-export-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-export-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/exports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-export-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetExport", :http.request.configuration/output-deser-fn response-get-export-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-export-response))

(clojure.core/defn start-import ([start-import-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-start-import-request start-import-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/start-import-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/imports/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/start-import-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartImport", :http.request.configuration/output-deser-fn response-start-import-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef start-import :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/start-import-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/start-import-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-builtin-intent-request get-builtin-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-builtin-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/builtins/intents/{signature}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-builtin-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBuiltinIntent", :http.request.configuration/output-deser-fn response-get-builtin-intent-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-slot-type-request delete-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSlotType", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-bot-version-request create-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/create-bot-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateBotVersion", :http.request.configuration/output-deser-fn response-create-bot-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-intent-request put-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/put-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutIntent", :http.request.configuration/output-deser-fn response-put-intent-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-intent-request delete-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteIntent", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intents-request get-intents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-intents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntents", :http.request.configuration/output-deser-fn response-get-intents-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-utterances-request delete-utterances-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/utterances/{userId}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-utterances-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteUtterances", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-intent-request get-intent-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-intent-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-intent-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetIntent", :http.request.configuration/output-deser-fn response-get-intent-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-intent-version-request create-intent-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/create-intent-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/intents/{name}/versions", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/create-intent-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIntentVersion", :http.request.configuration/output-deser-fn response-create-intent-version-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-channel-association-request get-bot-channel-association-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-channel-association-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{aliasName}/channels/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-channel-association-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotChannelAssociation", :http.request.configuration/output-deser-fn response-get-bot-channel-association-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-slot-type-request put-slot-type-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/put-slot-type-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-slot-type-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSlotType", :http.request.configuration/output-deser-fn response-put-slot-type-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-slot-type-versions-request get-slot-type-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-slot-type-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-slot-type-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSlotTypeVersions", :http.request.configuration/output-deser-fn response-get-slot-type-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-version-request delete-bot-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-aliases-request get-bot-aliases-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-aliases-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-aliases-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotAliases", :http.request.configuration/output-deser-fn response-get-bot-aliases-response, :http.request.spec/error-spec {"LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-versions-request get-bot-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBotVersions", :http.request.configuration/output-deser-fn response-get-bot-versions-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-bot-alias-request put-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/put-bot-alias-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBotAlias", :http.request.configuration/output-deser-fn response-put-bot-alias-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bots-request get-bots-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bots-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bots-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBots", :http.request.configuration/output-deser-fn response-get-bots-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.lex-models/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bots-response))

(clojure.core/defn get-bot ([get-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-bot-request get-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/get-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/{versionoralias}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/get-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetBot", :http.request.configuration/output-deser-fn response-get-bot-response, :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception}})))))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-slot-type-version-request delete-slot-type-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/slottypes/{name}/version/{version}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-slot-type-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSlotTypeVersion", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-request delete-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBot", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-put-bot-request put-bot-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.lex-models/put-bot-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{name}/versions/$LATEST", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/put-bot-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutBot", :http.request.configuration/output-deser-fn response-put-bot-response, :http.request.spec/error-spec {"ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "PreconditionFailedException" :portkey.aws.lex-models/precondition-failed-exception}})))))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.lex-models/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-bot-alias-request delete-bot-alias-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.lex-models/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/bots/{botName}/aliases/{name}", :http.request.configuration/version "2017-04-19", :http.request.configuration/service-id "Lex Model Building Service", :http.request.spec/input-spec :portkey.aws.lex-models/delete-bot-alias-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBotAlias", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1013883__auto__] {}), :http.request.spec/error-spec {"NotFoundException" :portkey.aws.lex-models/not-found-exception, "ConflictException" :portkey.aws.lex-models/conflict-exception, "LimitExceededException" :portkey.aws.lex-models/limit-exceeded-exception, "InternalFailureException" :portkey.aws.lex-models/internal-failure-exception, "BadRequestException" :portkey.aws.lex-models/bad-request-exception, "ResourceInUseException" :portkey.aws.lex-models/resource-in-use-exception}})))))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.lex-models/delete-bot-alias-request) :ret clojure.core/true?)
