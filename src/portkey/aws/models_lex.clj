(ns portkey.aws.models-lex (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/status (clojure.spec.alpha/and :portkey.aws.models-lex/status))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-metadata/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/bot-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.bot-metadata/name :portkey.aws.models-lex.bot-metadata/description :portkey.aws.models-lex.bot-metadata/status :portkey.aws.models-lex.bot-metadata/lastUpdatedDate :portkey.aws.models-lex.bot-metadata/createdDate :portkey.aws.models-lex.bot-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/merge-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"OVERWRITE_LATEST" "OVERWRITE_LATEST", :overwrite-latest "OVERWRITE_LATEST", "FAIL_ON_CONFLICT" "FAIL_ON_CONFLICT", :fail-on-conflict "FAIL_ON_CONFLICT"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bots-response/bots (clojure.spec.alpha/and :portkey.aws.models-lex/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bots-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bots-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bots-response/bots :portkey.aws.models-lex.get-bots-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/slot :min-count 0 :max-count 100) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/bot-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-alias-metadata/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/bot-alias-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.bot-alias-metadata/name :portkey.aws.models-lex.bot-alias-metadata/description :portkey.aws.models-lex.bot-alias-metadata/botVersion :portkey.aws.models-lex.bot-alias-metadata/botName :portkey.aws.models-lex.bot-alias-metadata/lastUpdatedDate :portkey.aws.models-lex.bot-alias-metadata/createdDate :portkey.aws.models-lex.bot-alias-metadata/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-request/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-request/bot-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.put-bot-alias-request/name :portkey.aws.models-lex.put-bot-alias-request/botVersion :portkey.aws.models-lex.put-bot-alias-request/botName] :opt-un [:portkey.aws.models-lex.put-bot-alias-request/description :portkey.aws.models-lex.put-bot-alias-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/string-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/locale-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/locale) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-slot-type-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-intent-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/builtin-intent-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.resource-reference/name (clojure.spec.alpha/and :portkey.aws.models-lex/name))
(clojure.spec.alpha/def :portkey.aws.models-lex.resource-reference/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/resource-reference (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.resource-reference/name :portkey.aws.models-lex.resource-reference/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/lambdaarn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 20 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2048)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"arn:aws:lambda:[a-z]+-[a-z]+-[0-9]:[0-9]{12}:function:[a-zA-Z0-9-_]+(/[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})?(:[a-zA-Z0-9-_]+)?" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-response/bot-aliases (clojure.spec.alpha/and :portkey.aws.models-lex/bot-alias-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-aliases-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-aliases-response/BotAliases :portkey.aws.models-lex.get-bot-aliases-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/numerical-version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/resource-type (clojure.spec.alpha/and :portkey.aws.models-lex/resource-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/export-type (clojure.spec.alpha/and :portkey.aws.models-lex/export-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/export-status (clojure.spec.alpha/and :portkey.aws.models-lex/export-status))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-response/url (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-export-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-export-response/name :portkey.aws.models-lex.get-export-response/version :portkey.aws.models-lex.get-export-response/resourceType :portkey.aws.models-lex.get-export-response/exportType :portkey.aws.models-lex.get-export-response/exportStatus :portkey.aws.models-lex.get-export-response/failureReason :portkey.aws.models-lex.get-export-response/url] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.prompt/messages (clojure.spec.alpha/and :portkey.aws.models-lex/message-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.prompt/max-attempts (clojure.spec.alpha/and :portkey.aws.models-lex/prompt-max-attempts))
(clojure.spec.alpha/def :portkey.aws.models-lex.prompt/response-card (clojure.spec.alpha/and :portkey.aws.models-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.models-lex/prompt (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.prompt/messages :portkey.aws.models-lex.prompt/maxAttempts] :opt-un [:portkey.aws.models-lex.prompt/responseCard] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.models-lex/sessionttl))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/status (clojure.spec.alpha/and :portkey.aws.models-lex/status))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.put-bot-response/intents :portkey.aws.models-lex.put-bot-response/createdDate :portkey.aws.models-lex.put-bot-response/idleSessionTTLInSeconds :portkey.aws.models-lex.put-bot-response/clarificationPrompt :portkey.aws.models-lex.put-bot-response/name :portkey.aws.models-lex.put-bot-response/locale :portkey.aws.models-lex.put-bot-response/lastUpdatedDate :portkey.aws.models-lex.put-bot-response/status :portkey.aws.models-lex.put-bot-response/createVersion :portkey.aws.models-lex.put-bot-response/abortStatement :portkey.aws.models-lex.put-bot-response/version :portkey.aws.models-lex.put-bot-response/failureReason :portkey.aws.models-lex.put-bot-response/childDirected :portkey.aws.models-lex.put-bot-response/checksum :portkey.aws.models-lex.put-bot-response/voiceId :portkey.aws.models-lex.put-bot-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/import-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "COMPLETE" "COMPLETE", :complete "COMPLETE", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/bot-alias (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/status (clojure.spec.alpha/and :portkey.aws.models-lex/channel-status))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/bot-configuration (clojure.spec.alpha/and :portkey.aws.models-lex/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/type (clojure.spec.alpha/and :portkey.aws.models-lex/channel-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-channel-association-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-channel-association-response/botAlias :portkey.aws.models-lex.get-bot-channel-association-response/createdDate :portkey.aws.models-lex.get-bot-channel-association-response/name :portkey.aws.models-lex.get-bot-channel-association-response/status :portkey.aws.models-lex.get-bot-channel-association-response/botConfiguration :portkey.aws.models-lex.get-bot-channel-association-response/botName :portkey.aws.models-lex.get-bot-channel-association-response/type :portkey.aws.models-lex.get-bot-channel-association-response/failureReason :portkey.aws.models-lex.get-bot-channel-association-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.bad-request-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/channel-configuration-map (clojure.spec.alpha/map-of :portkey.aws.models-lex/string :portkey.aws.models-lex/string))

(clojure.spec.alpha/def :portkey.aws.models-lex.precondition-failed-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/precondition-failed-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.precondition-failed-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.put-bot-alias-response/name :portkey.aws.models-lex.put-bot-alias-response/description :portkey.aws.models-lex.put-bot-alias-response/botVersion :portkey.aws.models-lex.put-bot-alias-response/botName :portkey.aws.models-lex.put-bot-alias-response/lastUpdatedDate :portkey.aws.models-lex.put-bot-alias-response/createdDate :portkey.aws.models-lex.put-bot-alias-response/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/export-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bots-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bots-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bots-request/name-contains (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bots-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bots-request/nextToken :portkey.aws.models-lex.get-bots-request/maxResults :portkey.aws.models-lex.get-bots-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/locale (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"en-US" "en-US", :en-us "en-US", "en-GB" "en-GB", :en-gb "en-GB", "de-DE" "de-DE", :de-de "de-DE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-data/utterance-string (clojure.spec.alpha/and :portkey.aws.models-lex/utterance-string))
(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-data/count (clojure.spec.alpha/and :portkey.aws.models-lex/count))
(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-data/distinct-users (clojure.spec.alpha/and :portkey.aws.models-lex/count))
(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-data/first-uttered-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-data/last-uttered-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex/utterance-data (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.utterance-data/utteranceString :portkey.aws.models-lex.utterance-data/count :portkey.aws.models-lex.utterance-data/distinctUsers :portkey.aws.models-lex.utterance-data/firstUtteredDate :portkey.aws.models-lex.utterance-data/lastUtteredDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/alias-name-or-list-all (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^(-|^([A-Za-z]_?)+$)$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-request/bot-alias (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name-or-list-all))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-request/name-contains (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-channel-associations-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-channel-associations-request/botName :portkey.aws.models-lex.get-bot-channel-associations-request/botAlias] :opt-un [:portkey.aws.models-lex.get-bot-channel-associations-request/nextToken :portkey.aws.models-lex.get-bot-channel-associations-request/maxResults :portkey.aws.models-lex.get-bot-channel-associations-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.models-lex/sessionttl))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/clarification-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/process-behavior (clojure.spec.alpha/and :portkey.aws.models-lex/process-behavior))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/abort-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/child-directed (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/voice-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-bot-request/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.put-bot-request/name :portkey.aws.models-lex.put-bot-request/locale :portkey.aws.models-lex.put-bot-request/childDirected] :opt-un [:portkey.aws.models-lex.put-bot-request/intents :portkey.aws.models-lex.put-bot-request/idleSessionTTLInSeconds :portkey.aws.models-lex.put-bot-request/clarificationPrompt :portkey.aws.models-lex.put-bot-request/processBehavior :portkey.aws.models-lex.put-bot-request/createVersion :portkey.aws.models-lex.put-bot-request/abortStatement :portkey.aws.models-lex.put-bot-request/checksum :portkey.aws.models-lex.put-bot-request/voiceId :portkey.aws.models-lex.put-bot-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-value-selection-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ORIGINAL_VALUE" "ORIGINAL_VALUE", :original-value "ORIGINAL_VALUE", "TOP_RESOLUTION" "TOP_RESOLUTION", :top-resolution "TOP_RESOLUTION"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/prompt-max-attempts (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 5))))

(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-intent-slot-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/builtin-intent-slot) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.create-bot-version-request/name] :opt-un [:portkey.aws.models-lex.create-bot-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/numerical-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-list/bot-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.utterance-list/utterances (clojure.spec.alpha/and :portkey.aws.models-lex/list-of-utterance))
(clojure.spec.alpha/def :portkey.aws.models-lex/utterance-list (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.utterance-list/botVersion :portkey.aws.models-lex.utterance-list/utterances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-utterances-view-response/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-utterances-view-response/utterances (clojure.spec.alpha/and :portkey.aws.models-lex/lists-of-utterances))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-utterances-view-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-utterances-view-response/botName :portkey.aws.models-lex.get-utterances-view-response/utterances] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.models-lex/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-slot-type-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.create-slot-type-version-response/name :portkey.aws.models-lex.create-slot-type-version-response/description :portkey.aws.models-lex.create-slot-type-version-response/enumerationValues :portkey.aws.models-lex.create-slot-type-version-response/lastUpdatedDate :portkey.aws.models-lex.create-slot-type-version-response/createdDate :portkey.aws.models-lex.create-slot-type-version-response/version :portkey.aws.models-lex.create-slot-type-version-response/checksum :portkey.aws.models-lex.create-slot-type-version-response/valueSelectionStrategy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-intent-version-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/numerical-version))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-intent-version-request/name :portkey.aws.models-lex.delete-intent-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-builtin-slot-types-response/slotTypes :portkey.aws.models-lex.get-builtin-slot-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.statement/messages (clojure.spec.alpha/and :portkey.aws.models-lex/message-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.statement/response-card (clojure.spec.alpha/and :portkey.aws.models-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.models-lex/statement (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.statement/messages] :opt-un [:portkey.aws.models-lex.statement/responseCard] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/user-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 2 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/enumeration-values (clojure.spec.alpha/and :portkey.aws.models-lex/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-request/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.put-slot-type-request/name] :opt-un [:portkey.aws.models-lex.put-slot-type-request/description :portkey.aws.models-lex.put-slot-type-request/enumerationValues :portkey.aws.models-lex.put-slot-type-request/checksum :portkey.aws.models-lex.put-slot-type-request/valueSelectionStrategy :portkey.aws.models-lex.put-slot-type-request/createVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-intent-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.create-intent-version-request/name] :opt-un [:portkey.aws.models-lex.create-intent-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.resource-in-use-exception/reference-type (clojure.spec.alpha/and :portkey.aws.models-lex/reference-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.resource-in-use-exception/example-reference (clojure.spec.alpha/and :portkey.aws.models-lex/resource-reference))
(clojure.spec.alpha/def :portkey.aws.models-lex/resource-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.resource-in-use-exception/referenceType :portkey.aws.models-lex.resource-in-use-exception/exampleReference] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.code-hook/uri (clojure.spec.alpha/and :portkey.aws.models-lex/lambdaarn))
(clojure.spec.alpha/def :portkey.aws.models-lex.code-hook/message-version (clojure.spec.alpha/and :portkey.aws.models-lex/message-version))
(clojure.spec.alpha/def :portkey.aws.models-lex/code-hook (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.code-hook/uri :portkey.aws.models-lex.code-hook/messageVersion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.models-lex/intent-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.limit-exceeded-exception/retryAfterSeconds :portkey.aws.models-lex.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-slot-type-version-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.create-slot-type-version-request/name] :opt-un [:portkey.aws.models-lex.create-slot-type-version-request/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-utterance-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/utterance :min-count 0 :max-count 10) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/numerical-version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-request/resource-type (clojure.spec.alpha/and :portkey.aws.models-lex/resource-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.models-lex/export-type))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-export-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-export-request/name :portkey.aws.models-lex.get-export-request/version :portkey.aws.models-lex.get-export-request/resourceType :portkey.aws.models-lex.get-export-request/exportType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-types-request/name-contains (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-slot-types-request/nextToken :portkey.aws.models-lex.get-slot-types-request/maxResults :portkey.aws.models-lex.get-slot-types-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/response-card (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 50000))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-request/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-request/signature-contains (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-builtin-intents-request/locale :portkey.aws.models-lex.get-builtin-intents-request/signatureContains :portkey.aws.models-lex.get-builtin-intents-request/nextToken :portkey.aws.models-lex.get-builtin-intents-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-bot-alias-request/name :portkey.aws.models-lex.delete-bot-alias-request/botName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"BUILDING" "BUILDING", :building "BUILDING", "READY" "READY", :ready "READY", "FAILED" "FAILED", :failed "FAILED", "NOT_BUILT" "NOT_BUILT", :not-built "NOT_BUILT"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/name))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.models-lex/resource-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/import-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/import-status (clojure.spec.alpha/and :portkey.aws.models-lex/import-status))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex/start-import-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.start-import-response/name :portkey.aws.models-lex.start-import-response/resourceType :portkey.aws.models-lex.start-import-response/mergeStrategy :portkey.aws.models-lex.start-import-response/importId :portkey.aws.models-lex.start-import-response/importStatus :portkey.aws.models-lex.start-import-response/createdDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/group-number (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 5))))

(clojure.spec.alpha/def :portkey.aws.models-lex/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.models-lex/priority (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 0 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.models-lex/status-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"Detected" "Detected", :detected "Detected", "Missed" "Missed", :missed "Missed"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/utterance-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 2000))))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-slot-type-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-slot-type-version-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/numerical-version))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-slot-type-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-slot-type-version-request/name :portkey.aws.models-lex.delete-slot-type-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-version-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-version-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/numerical-version))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-bot-version-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-bot-version-request/name :portkey.aws.models-lex.delete-bot-version-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-versions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/version :min-count 1 :max-count 5) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"PlainText" "PlainText", :plain-text "PlainText", "SSML" "SSML", :ssml "SSML", "CustomPayload" "CustomPayload", :custom-payload "CustomPayload"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/sessionttl (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 60 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 86400))))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-alias-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/bot-alias-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/content-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.models-lex.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/internal-failure-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.internal-failure-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.follow-up-prompt/prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.follow-up-prompt/rejection-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex/follow-up-prompt (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.follow-up-prompt/prompt :portkey.aws.models-lex.follow-up-prompt/rejectionStatement] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-channel-association-request/name :portkey.aws.models-lex.get-bot-channel-association-request/botName :portkey.aws.models-lex.get-bot-channel-association-request/botAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-intent-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/resource-type (clojure.spec.alpha/and :portkey.aws.models-lex/resource-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/merge-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/import-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/import-status (clojure.spec.alpha/and :portkey.aws.models-lex/import-status))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-import-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-import-response/name :portkey.aws.models-lex.get-import-response/resourceType :portkey.aws.models-lex.get-import-response/mergeStrategy :portkey.aws.models-lex.get-import-response/importId :portkey.aws.models-lex.get-import-response/importStatus :portkey.aws.models-lex.get-import-response/failureReason :portkey.aws.models-lex.get-import-response/createdDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.builtin-intent-slot/name (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-intent-slot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.builtin-intent-slot/name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.models-lex/sessionttl))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/status (clojure.spec.alpha/and :portkey.aws.models-lex/status))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/abort-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/child-directed (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/voice-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-bot-version-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-bot-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.create-bot-version-response/intents :portkey.aws.models-lex.create-bot-version-response/createdDate :portkey.aws.models-lex.create-bot-version-response/idleSessionTTLInSeconds :portkey.aws.models-lex.create-bot-version-response/clarificationPrompt :portkey.aws.models-lex.create-bot-version-response/name :portkey.aws.models-lex.create-bot-version-response/locale :portkey.aws.models-lex.create-bot-version-response/lastUpdatedDate :portkey.aws.models-lex.create-bot-version-response/status :portkey.aws.models-lex.create-bot-version-response/abortStatement :portkey.aws.models-lex.create-bot-version-response/version :portkey.aws.models-lex.create-bot-version-response/failureReason :portkey.aws.models-lex.create-bot-version-response/childDirected :portkey.aws.models-lex.create-bot-version-response/checksum :portkey.aws.models-lex.create-bot-version-response/voiceId :portkey.aws.models-lex.create-bot-version-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intents-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intents-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intents-request/name-contains (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intents-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-intents-request/nextToken :portkey.aws.models-lex.get-intents-request/maxResults :portkey.aws.models-lex.get-intents-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-versions-response/slot-types (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-type-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-slot-type-versions-response/slotTypes :portkey.aws.models-lex.get-slot-type-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-versions-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-versions-request/name] :opt-un [:portkey.aws.models-lex.get-bot-versions-request/nextToken :portkey.aws.models-lex.get-bot-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-versions-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intent-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-intent-versions-response/intents :portkey.aws.models-lex.get-intent-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-versions-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-type-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-slot-type-versions-request/name] :opt-un [:portkey.aws.models-lex.get-slot-type-versions-request/nextToken :portkey.aws.models-lex.get-slot-type-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/idle-sessionttlin-seconds (clojure.spec.alpha/and :portkey.aws.models-lex/sessionttl))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/clarification-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/status (clojure.spec.alpha/and :portkey.aws.models-lex/status))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/abort-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/child-directed (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/voice-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-response/intents :portkey.aws.models-lex.get-bot-response/createdDate :portkey.aws.models-lex.get-bot-response/idleSessionTTLInSeconds :portkey.aws.models-lex.get-bot-response/clarificationPrompt :portkey.aws.models-lex.get-bot-response/name :portkey.aws.models-lex.get-bot-response/locale :portkey.aws.models-lex.get-bot-response/lastUpdatedDate :portkey.aws.models-lex.get-bot-response/status :portkey.aws.models-lex.get-bot-response/abortStatement :portkey.aws.models-lex.get-bot-response/version :portkey.aws.models-lex.get-bot-response/failureReason :portkey.aws.models-lex.get-bot-response/childDirected :portkey.aws.models-lex.get-bot-response/checksum :portkey.aws.models-lex.get-bot-response/voiceId :portkey.aws.models-lex.get-bot-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-request/locale (clojure.spec.alpha/and :portkey.aws.models-lex/locale))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-request/signature-contains (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-slot-types-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-slot-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-builtin-slot-types-request/locale :portkey.aws.models-lex.get-builtin-slot-types-request/signatureContains :portkey.aws.models-lex.get-builtin-slot-types-request/nextToken :portkey.aws.models-lex.get-builtin-slot-types-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/intent-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/intent) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/fulfillment-activity-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ReturnIntent" "ReturnIntent", :return-intent "ReturnIntent", "CodeHook" "CodeHook", :code-hook "CodeHook"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-channel-association-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/bot-channel-association) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intents-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-intents-response/intents :portkey.aws.models-lex.get-intents-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.conflict-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/utterance (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.models-lex/value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 140))))

(clojure.spec.alpha/def :portkey.aws.models-lex/list-of-utterance (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/utterance-data) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 0 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.models-lex/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.put-slot-type-response/valueSelectionStrategy :portkey.aws.models-lex.put-slot-type-response/createdDate :portkey.aws.models-lex.put-slot-type-response/name :portkey.aws.models-lex.put-slot-type-response/enumerationValues :portkey.aws.models-lex.put-slot-type-response/lastUpdatedDate :portkey.aws.models-lex.put-slot-type-response/createVersion :portkey.aws.models-lex.put-slot-type-response/version :portkey.aws.models-lex.put-slot-type-response/checksum :portkey.aws.models-lex.put-slot-type-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-response/bot-channel-associations (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-association-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-channel-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-channel-associations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-channel-associations-response/botChannelAssociations :portkey.aws.models-lex.get-bot-channel-associations-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.message/content-type (clojure.spec.alpha/and :portkey.aws.models-lex/content-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.message/content (clojure.spec.alpha/and :portkey.aws.models-lex/content-string))
(clojure.spec.alpha/def :portkey.aws.models-lex.message/group-number (clojure.spec.alpha/and :portkey.aws.models-lex/group-number))
(clojure.spec.alpha/def :portkey.aws.models-lex/message (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.message/contentType :portkey.aws.models-lex.message/content] :opt-un [:portkey.aws.models-lex.message/groupNumber] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intent-request/signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-builtin-intent-request/signature] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/export-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"ALEXA_SKILLS_KIT" "ALEXA_SKILLS_KIT", :alexa-skills-kit "ALEXA_SKILLS_KIT", "LEX" "LEX", :lex "LEX"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-utterances-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-utterances-request/user-id (clojure.spec.alpha/and :portkey.aws.models-lex/user-id))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-utterances-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-utterances-request/botName :portkey.aws.models-lex.delete-utterances-request/userId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/custom-or-builtin-slot-type-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^((AMAZON\.)_?|[A-Za-z]_?)+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex/enumeration-values (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/enumeration-value :min-count 1 :max-count 10000) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 2 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 50)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.models-lex.slot/priority (clojure.spec.alpha/and :portkey.aws.models-lex/priority))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/response-card (clojure.spec.alpha/and :portkey.aws.models-lex/response-card))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/slot-type (clojure.spec.alpha/and :portkey.aws.models-lex/custom-or-builtin-slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/slot-constraint (clojure.spec.alpha/and :portkey.aws.models-lex/slot-constraint))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/slot-type-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/sample-utterances (clojure.spec.alpha/and :portkey.aws.models-lex/slot-utterance-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/value-elicitation-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/slot (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.slot/name :portkey.aws.models-lex.slot/slotConstraint] :opt-un [:portkey.aws.models-lex.slot/priority :portkey.aws.models-lex.slot/responseCard :portkey.aws.models-lex.slot/slotType :portkey.aws.models-lex.slot/slotTypeVersion :portkey.aws.models-lex.slot/sampleUtterances :portkey.aws.models-lex.slot/valueElicitationPrompt :portkey.aws.models-lex.slot/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-request/payload (clojure.spec.alpha/and :portkey.aws.models-lex/blob))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-request/resource-type (clojure.spec.alpha/and :portkey.aws.models-lex/resource-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.start-import-request/merge-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/merge-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex/start-import-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.start-import-request/payload :portkey.aws.models-lex.start-import-request/resourceType :portkey.aws.models-lex.start-import-request/mergeStrategy] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-slot-type-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/builtin-slot-type-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-bot-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z](-|_|.)?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex/resource-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"BOT" "BOT", :bot "BOT", "INTENT" "INTENT", :intent "INTENT", "SLOT_TYPE" "SLOT_TYPE", :slot-type "SLOT_TYPE"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-intent-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-intent-request/name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.models-lex/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/slots (clojure.spec.alpha/and :portkey.aws.models-lex/slot-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.models-lex/code-hook))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.models-lex/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.put-intent-response/followUpPrompt :portkey.aws.models-lex.put-intent-response/fulfillmentActivity :portkey.aws.models-lex.put-intent-response/slots :portkey.aws.models-lex.put-intent-response/parentIntentSignature :portkey.aws.models-lex.put-intent-response/confirmationPrompt :portkey.aws.models-lex.put-intent-response/createdDate :portkey.aws.models-lex.put-intent-response/name :portkey.aws.models-lex.put-intent-response/rejectionStatement :portkey.aws.models-lex.put-intent-response/lastUpdatedDate :portkey.aws.models-lex.put-intent-response/createVersion :portkey.aws.models-lex.put-intent-response/dialogCodeHook :portkey.aws.models-lex.put-intent-response/conclusionStatement :portkey.aws.models-lex.put-intent-response/sampleUtterances :portkey.aws.models-lex.put-intent-response/version :portkey.aws.models-lex.put-intent-response/checksum :portkey.aws.models-lex.put-intent-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-channel-association-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-channel-association-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.delete-bot-channel-association-request/bot-alias (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/delete-bot-channel-association-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.delete-bot-channel-association-request/name :portkey.aws.models-lex.delete-bot-channel-association-request/botName :portkey.aws.models-lex.delete-bot-channel-association-request/botAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-slot-type-signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.models-lex.fulfillment-activity/type (clojure.spec.alpha/and :portkey.aws.models-lex/fulfillment-activity-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.fulfillment-activity/code-hook (clojure.spec.alpha/and :portkey.aws.models-lex/code-hook))
(clojure.spec.alpha/def :portkey.aws.models-lex/fulfillment-activity (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.fulfillment-activity/type] :opt-un [:portkey.aws.models-lex.fulfillment-activity/codeHook] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/channel-status (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"IN_PROGRESS" "IN_PROGRESS", :in-progress "IN_PROGRESS", "CREATED" "CREATED", :created "CREATED", "FAILED" "FAILED", :failed "FAILED"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/message-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/message :min-count 1 :max-count 15) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-versions-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-versions-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intent-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-intent-versions-request/name] :opt-un [:portkey.aws.models-lex.get-intent-versions-request/nextToken :portkey.aws.models-lex.get-intent-versions-request/maxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-intent-request/name :portkey.aws.models-lex.get-intent-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.models-lex/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/slots (clojure.spec.alpha/and :portkey.aws.models-lex/slot-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.models-lex/code-hook))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.models-lex/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-intent-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-intent-response/followUpPrompt :portkey.aws.models-lex.get-intent-response/fulfillmentActivity :portkey.aws.models-lex.get-intent-response/slots :portkey.aws.models-lex.get-intent-response/parentIntentSignature :portkey.aws.models-lex.get-intent-response/confirmationPrompt :portkey.aws.models-lex.get-intent-response/createdDate :portkey.aws.models-lex.get-intent-response/name :portkey.aws.models-lex.get-intent-response/rejectionStatement :portkey.aws.models-lex.get-intent-response/lastUpdatedDate :portkey.aws.models-lex.get-intent-response/dialogCodeHook :portkey.aws.models-lex.get-intent-response/conclusionStatement :portkey.aws.models-lex.get-intent-response/sampleUtterances :portkey.aws.models-lex.get-intent-response/version :portkey.aws.models-lex.get-intent-response/checksum :portkey.aws.models-lex.get-intent-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.intent-metadata/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.intent-metadata/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.intent-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.intent-metadata/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.intent-metadata/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.intent-metadata/name :portkey.aws.models-lex.intent-metadata/description :portkey.aws.models-lex.intent-metadata/lastUpdatedDate :portkey.aws.models-lex.intent-metadata/createdDate :portkey.aws.models-lex.intent-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-constraint (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"Required" "Required", :required "Required", "Optional" "Optional", :optional "Optional"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.slot-type-metadata/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot-type-metadata/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot-type-metadata/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot-type-metadata/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.slot-type-metadata/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.slot-type-metadata/name :portkey.aws.models-lex.slot-type-metadata/description :portkey.aws.models-lex.slot-type-metadata/lastUpdatedDate :portkey.aws.models-lex.slot-type-metadata/createdDate :portkey.aws.models-lex.slot-type-metadata/version] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/intent-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/intent-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex/message-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 5))))

(clojure.spec.alpha/def :portkey.aws.models-lex/slot-type-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/slot-type-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.models-lex/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/slots (clojure.spec.alpha/and :portkey.aws.models-lex/slot-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/rejection-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/create-version (clojure.spec.alpha/and :portkey.aws.models-lex/boolean))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.models-lex/code-hook))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/conclusion-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/sample-utterances (clojure.spec.alpha/and :portkey.aws.models-lex/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.put-intent-request/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/put-intent-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.put-intent-request/name] :opt-un [:portkey.aws.models-lex.put-intent-request/followUpPrompt :portkey.aws.models-lex.put-intent-request/fulfillmentActivity :portkey.aws.models-lex.put-intent-request/slots :portkey.aws.models-lex.put-intent-request/parentIntentSignature :portkey.aws.models-lex.put-intent-request/confirmationPrompt :portkey.aws.models-lex.put-intent-request/rejectionStatement :portkey.aws.models-lex.put-intent-request/createVersion :portkey.aws.models-lex.put-intent-request/dialogCodeHook :portkey.aws.models-lex.put-intent-request/conclusionStatement :portkey.aws.models-lex.put-intent-request/sampleUtterances :portkey.aws.models-lex.put-intent-request/checksum :portkey.aws.models-lex.put-intent-request/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/reference-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"Intent" "Intent", :intent "Intent", "Bot" "Bot", :bot "Bot", "BotAlias" "BotAlias", :bot-alias "BotAlias", "BotChannel" "BotChannel", :bot-channel "BotChannel"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__16026__16027__auto__] (clojure.core/<= 1 p1__16026__16027__auto__)) (fn* [p1__16028__16029__auto__] (clojure.core/<= p1__16028__16029__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.models-lex/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 64)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"\$LATEST|[0-9]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.builtin-intent-metadata/signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.builtin-intent-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.models-lex/locale-list))
(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-intent-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.builtin-intent-metadata/signature :portkey.aws.models-lex.builtin-intent-metadata/supportedLocales] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/intent-utterance-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/utterance :min-count 0 :max-count 1500) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intent-response/signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intent-response/supported-locales (clojure.spec.alpha/and :portkey.aws.models-lex/locale-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intent-response/slots (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-slot-list))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-intent-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-builtin-intent-response/signature :portkey.aws.models-lex.get-builtin-intent-response/supportedLocales :portkey.aws.models-lex.get-builtin-intent-response/slots] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-request/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-type-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-slot-type-request/name :portkey.aws.models-lex.get-slot-type-request/version] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.enumeration-value/value (clojure.spec.alpha/and :portkey.aws.models-lex/value))
(clojure.spec.alpha/def :portkey.aws.models-lex.enumeration-value/synonyms (clojure.spec.alpha/and :portkey.aws.models-lex/synonym-list))
(clojure.spec.alpha/def :portkey.aws.models-lex/enumeration-value (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.enumeration-value/value] :opt-un [:portkey.aws.models-lex.enumeration-value/synonyms] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.models-lex/alias-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/bot-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-alias-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-alias-response/name :portkey.aws.models-lex.get-bot-alias-response/description :portkey.aws.models-lex.get-bot-alias-response/botVersion :portkey.aws.models-lex.get-bot-alias-response/botName :portkey.aws.models-lex.get-bot-alias-response/lastUpdatedDate :portkey.aws.models-lex.get-bot-alias-response/createdDate :portkey.aws.models-lex.get-bot-alias-response/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/enumeration-values (clojure.spec.alpha/and :portkey.aws.models-lex/enumeration-values))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-type-response/value-selection-strategy (clojure.spec.alpha/and :portkey.aws.models-lex/slot-value-selection-strategy))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-type-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-slot-type-response/name :portkey.aws.models-lex.get-slot-type-response/description :portkey.aws.models-lex.get-slot-type-response/enumerationValues :portkey.aws.models-lex.get-slot-type-response/lastUpdatedDate :portkey.aws.models-lex.get-slot-type-response/createdDate :portkey.aws.models-lex.get-slot-type-response/version :portkey.aws.models-lex.get-slot-type-response/checksum :portkey.aws.models-lex.get-slot-type-response/valueSelectionStrategy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"[a-zA-Z_]+" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-versions-response/bots (clojure.spec.alpha/and :portkey.aws.models-lex/bot-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-bot-versions-response/bots :portkey.aws.models-lex.get-bot-versions-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-request/version-or-alias (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-request/name :portkey.aws.models-lex.get-bot-request/versionOrAlias] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-request/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-request/max-results (clojure.spec.alpha/and :portkey.aws.models-lex/max-results))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-aliases-request/name-contains (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-aliases-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-aliases-request/botName] :opt-un [:portkey.aws.models-lex.get-bot-aliases-request/nextToken :portkey.aws.models-lex.get-bot-aliases-request/maxResults :portkey.aws.models-lex.get-bot-aliases-request/nameContains] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-metadata-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/bot-metadata) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/bot-alias (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-channel-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/status (clojure.spec.alpha/and :portkey.aws.models-lex/channel-status))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/bot-configuration (clojure.spec.alpha/and :portkey.aws.models-lex/channel-configuration-map))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/type (clojure.spec.alpha/and :portkey.aws.models-lex/channel-type))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/failure-reason (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.bot-channel-association/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/bot-channel-association (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.bot-channel-association/botAlias :portkey.aws.models-lex.bot-channel-association/createdDate :portkey.aws.models-lex.bot-channel-association/name :portkey.aws.models-lex.bot-channel-association/status :portkey.aws.models-lex.bot-channel-association/botConfiguration :portkey.aws.models-lex.bot-channel-association/botName :portkey.aws.models-lex.bot-channel-association/type :portkey.aws.models-lex.bot-channel-association/failureReason :portkey.aws.models-lex.bot-channel-association/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-import-request/import-id (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-import-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-import-request/importId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/bot-channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__15966__auto__] (clojure.core/<= 1 (clojure.core/count s__15966__auto__))) (clojure.core/fn [s__15967__auto__] (clojure.core/< (clojure.core/count s__15967__auto__) 100)) (clojure.core/fn [s__15968__auto__] (clojure.core/re-matches #"^([A-Za-z]_?)+$" s__15968__auto__))))

(clojure.spec.alpha/def :portkey.aws.models-lex.builtin-slot-type-metadata/signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-slot-type-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.builtin-slot-type-metadata/supported-locales (clojure.spec.alpha/and :portkey.aws.models-lex/locale-list))
(clojure.spec.alpha/def :portkey.aws.models-lex/builtin-slot-type-metadata (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.builtin-slot-type-metadata/signature :portkey.aws.models-lex.builtin-slot-type-metadata/supportedLocales] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-request/name (clojure.spec.alpha/and :portkey.aws.models-lex/alias-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-bot-alias-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-bot-alias-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-bot-alias-request/name :portkey.aws.models-lex.get-bot-alias-request/botName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/process-behavior (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"SAVE" "SAVE", :save "SAVE", "BUILD" "BUILD", :build "BUILD"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex/synonym-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-response/intents (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-builtin-intents-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-builtin-intents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-builtin-intents-response/intents :portkey.aws.models-lex.get-builtin-intents-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-types-response/slot-types (clojure.spec.alpha/and :portkey.aws.models-lex/slot-type-metadata-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-slot-types-response/next-token (clojure.spec.alpha/and :portkey.aws.models-lex/next-token))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-slot-types-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.get-slot-types-response/slotTypes :portkey.aws.models-lex.get-slot-types-response/nextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/lists-of-utterances (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.models-lex/utterance-list) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.models-lex.intent/intent-name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.intent/intent-version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex/intent (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.intent/intentName :portkey.aws.models-lex.intent/intentVersion] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/follow-up-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/follow-up-prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/fulfillment-activity (clojure.spec.alpha/and :portkey.aws.models-lex/fulfillment-activity))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/slots (clojure.spec.alpha/and :portkey.aws.models-lex/slot-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/parent-intent-signature (clojure.spec.alpha/and :portkey.aws.models-lex/builtin-intent-signature))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/confirmation-prompt (clojure.spec.alpha/and :portkey.aws.models-lex/prompt))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/created-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/name (clojure.spec.alpha/and :portkey.aws.models-lex/intent-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/rejection-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/last-updated-date (clojure.spec.alpha/and :portkey.aws.models-lex/timestamp))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/dialog-code-hook (clojure.spec.alpha/and :portkey.aws.models-lex/code-hook))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/conclusion-statement (clojure.spec.alpha/and :portkey.aws.models-lex/statement))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/sample-utterances (clojure.spec.alpha/and :portkey.aws.models-lex/intent-utterance-list))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/version (clojure.spec.alpha/and :portkey.aws.models-lex/version))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/checksum (clojure.spec.alpha/and :portkey.aws.models-lex/string))
(clojure.spec.alpha/def :portkey.aws.models-lex.create-intent-version-response/description (clojure.spec.alpha/and :portkey.aws.models-lex/description))
(clojure.spec.alpha/def :portkey.aws.models-lex/create-intent-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.models-lex.create-intent-version-response/followUpPrompt :portkey.aws.models-lex.create-intent-version-response/fulfillmentActivity :portkey.aws.models-lex.create-intent-version-response/slots :portkey.aws.models-lex.create-intent-version-response/parentIntentSignature :portkey.aws.models-lex.create-intent-version-response/confirmationPrompt :portkey.aws.models-lex.create-intent-version-response/createdDate :portkey.aws.models-lex.create-intent-version-response/name :portkey.aws.models-lex.create-intent-version-response/rejectionStatement :portkey.aws.models-lex.create-intent-version-response/lastUpdatedDate :portkey.aws.models-lex.create-intent-version-response/dialogCodeHook :portkey.aws.models-lex.create-intent-version-response/conclusionStatement :portkey.aws.models-lex.create-intent-version-response/sampleUtterances :portkey.aws.models-lex.create-intent-version-response/version :portkey.aws.models-lex.create-intent-version-response/checksum :portkey.aws.models-lex.create-intent-version-response/description] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/channel-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"Facebook" "Facebook", :facebook "Facebook", "Slack" "Slack", :slack "Slack", "Twilio-Sms" "Twilio-Sms", :twilio-sms "Twilio-Sms", "Kik" "Kik", :kik "Kik"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.models-lex.get-utterances-view-request/bot-name (clojure.spec.alpha/and :portkey.aws.models-lex/bot-name))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-utterances-view-request/bot-versions (clojure.spec.alpha/and :portkey.aws.models-lex/bot-versions))
(clojure.spec.alpha/def :portkey.aws.models-lex.get-utterances-view-request/status-type (clojure.spec.alpha/and :portkey.aws.models-lex/status-type))
(clojure.spec.alpha/def :portkey.aws.models-lex/get-utterances-view-request (portkey.aws/json-keys :req-un [:portkey.aws.models-lex.get-utterances-view-request/botName :portkey.aws.models-lex.get-utterances-view-request/botVersions :portkey.aws.models-lex.get-utterances-view-request/statusType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.models-lex/boolean clojure.core/boolean?)

(clojure.core/defn delete-bot-channel-association ([delete-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/bots/{botName}/aliases/{aliasName}/channels/{name}" delete-bot-channel-association-request :portkey.aws.models-lex/delete-bot-channel-association-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef delete-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-bot-channel-association-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-slot-types ([] (get-builtin-slot-types {})) ([get-builtin-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/builtins/slottypes/" get-builtin-slot-types-request :portkey.aws.models-lex/get-builtin-slot-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.models-lex/get-builtin-slot-types-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-slot-types :args (clojure.spec.alpha/? :portkey.aws.models-lex/get-builtin-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-builtin-slot-types-response))

(clojure.core/defn get-bot-channel-associations ([get-bot-channel-associations-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/" get-bot-channel-associations-request :portkey.aws.models-lex/get-bot-channel-associations-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName", "aliasName" "botAlias"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.models-lex/get-bot-channel-associations-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-associations :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-channel-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-channel-associations-response))

(clojure.core/defn create-slot-type-version ([create-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "POST" "/slottypes/{name}/versions" create-slot-type-version-request :portkey.aws.models-lex/create-slot-type-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.models-lex/create-slot-type-version-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/create-slot-type-version-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/create-slot-type-version-response))

(clojure.core/defn get-import ([get-import-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/imports/{importId}" get-import-request :portkey.aws.models-lex/get-import-request {:payload nil, :move {}, :headers {}, :uri {"importId" "importId"}, :querystring {}} 200 :portkey.aws.models-lex/get-import-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-import :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-import-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-import-response))

(clojure.core/defn get-slot-type ([get-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/slottypes/{name}/versions/{version}" get-slot-type-request :portkey.aws.models-lex/get-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.models-lex/get-slot-type-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-slot-type-response))

(clojure.core/defn get-intent-versions ([get-intent-versions-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/intents/{name}/versions/" get-intent-versions-request :portkey.aws.models-lex/get-intent-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.models-lex/get-intent-versions-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent-versions :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-intent-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-intent-versions-response))

(clojure.core/defn get-utterances-view ([get-utterances-view-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{botname}/utterances?view=aggregation" get-utterances-view-request :portkey.aws.models-lex/get-utterances-view-request {:payload nil, :move {}, :headers {}, :uri {"botname" "botName"}, :querystring {"bot_versions" "botVersions", "status_type" "statusType"}} 200 :portkey.aws.models-lex/get-utterances-view-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-utterances-view :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-utterances-view-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-utterances-view-response))

(clojure.core/defn delete-intent-version ([delete-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/intents/{name}/versions/{version}" delete-intent-version-request :portkey.aws.models-lex/delete-intent-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-intent-version-request) :ret clojure.core/true?)

(clojure.core/defn get-builtin-intents ([] (get-builtin-intents {})) ([get-builtin-intents-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/builtins/intents/" get-builtin-intents-request :portkey.aws.models-lex/get-builtin-intents-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"locale" "locale", "signatureContains" "signatureContains", "nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.models-lex/get-builtin-intents-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intents :args (clojure.spec.alpha/? :portkey.aws.models-lex/get-builtin-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-builtin-intents-response))

(clojure.core/defn get-slot-types ([] (get-slot-types {})) ([get-slot-types-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/slottypes/" get-slot-types-request :portkey.aws.models-lex/get-slot-types-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.models-lex/get-slot-types-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-types :args (clojure.spec.alpha/? :portkey.aws.models-lex/get-slot-types-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-slot-types-response))

(clojure.core/defn get-bot-alias ([get-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{botName}/aliases/{name}" get-bot-alias-request :portkey.aws.models-lex/get-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.models-lex/get-bot-alias-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-alias-response))

(clojure.core/defn get-export ([get-export-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/exports/" get-export-request :portkey.aws.models-lex/get-export-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"name" "name", "version" "version", "resourceType" "resourceType", "exportType" "exportType"}} 200 :portkey.aws.models-lex/get-export-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-export-response))

(clojure.core/defn start-import ([start-import-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "POST" "/imports/" start-import-request :portkey.aws.models-lex/start-import-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.models-lex/start-import-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef start-import :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/start-import-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/start-import-response))

(clojure.core/defn get-builtin-intent ([get-builtin-intent-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/builtins/intents/{signature}" get-builtin-intent-request :portkey.aws.models-lex/get-builtin-intent-request {:payload nil, :move {}, :headers {}, :uri {"signature" "signature"}, :querystring {}} 200 :portkey.aws.models-lex/get-builtin-intent-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-builtin-intent :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-builtin-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-builtin-intent-response))

(clojure.core/defn delete-slot-type ([delete-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/slottypes/{name}" delete-slot-type-request :portkey.aws.models-lex/delete-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-slot-type-request) :ret clojure.core/true?)

(clojure.core/defn create-bot-version ([create-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "POST" "/bots/{name}/versions" create-bot-version-request :portkey.aws.models-lex/create-bot-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.models-lex/create-bot-version-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/create-bot-version-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/create-bot-version-response))

(clojure.core/defn put-intent ([put-intent-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "PUT" "/intents/{name}/versions/$LATEST" put-intent-request :portkey.aws.models-lex/put-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.models-lex/put-intent-response {"ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-intent :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/put-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/put-intent-response))

(clojure.core/defn delete-intent ([delete-intent-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/intents/{name}" delete-intent-request :portkey.aws.models-lex/delete-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-intent :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-intent-request) :ret clojure.core/true?)

(clojure.core/defn get-intents ([] (get-intents {})) ([get-intents-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/intents/" get-intents-request :portkey.aws.models-lex/get-intents-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.models-lex/get-intents-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-intents :args (clojure.spec.alpha/? :portkey.aws.models-lex/get-intents-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-intents-response))

(clojure.core/defn delete-utterances ([delete-utterances-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/bots/{botName}/utterances/{userId}" delete-utterances-request :portkey.aws.models-lex/delete-utterances-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName", "userId" "userId"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef delete-utterances :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-utterances-request) :ret clojure.core/true?)

(clojure.core/defn get-intent ([get-intent-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/intents/{name}/versions/{version}" get-intent-request :portkey.aws.models-lex/get-intent-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 200 :portkey.aws.models-lex/get-intent-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-intent :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-intent-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-intent-response))

(clojure.core/defn create-intent-version ([create-intent-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "POST" "/intents/{name}/versions" create-intent-version-request :portkey.aws.models-lex/create-intent-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 201 :portkey.aws.models-lex/create-intent-version-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef create-intent-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/create-intent-version-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/create-intent-version-response))

(clojure.core/defn get-bot-channel-association ([get-bot-channel-association-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{botName}/aliases/{aliasName}/channels/{name}" get-bot-channel-association-request :portkey.aws.models-lex/get-bot-channel-association-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName", "aliasName" "botAlias"}, :querystring {}} 200 :portkey.aws.models-lex/get-bot-channel-association-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-channel-association :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-channel-association-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-channel-association-response))

(clojure.core/defn put-slot-type ([put-slot-type-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "PUT" "/slottypes/{name}/versions/$LATEST" put-slot-type-request :portkey.aws.models-lex/put-slot-type-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.models-lex/put-slot-type-response {"ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-slot-type :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/put-slot-type-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/put-slot-type-response))

(clojure.core/defn get-slot-type-versions ([get-slot-type-versions-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/slottypes/{name}/versions/" get-slot-type-versions-request :portkey.aws.models-lex/get-slot-type-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.models-lex/get-slot-type-versions-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-slot-type-versions :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-slot-type-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-slot-type-versions-response))

(clojure.core/defn delete-bot-version ([delete-bot-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/bots/{name}/versions/{version}" delete-bot-version-request :portkey.aws.models-lex/delete-bot-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-bot-version-request) :ret clojure.core/true?)

(clojure.core/defn get-bot-aliases ([get-bot-aliases-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{botName}/aliases/" get-bot-aliases-request :portkey.aws.models-lex/get-bot-aliases-request {:payload nil, :move {}, :headers {}, :uri {"botName" "botName"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.models-lex/get-bot-aliases-response {"LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-aliases :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-aliases-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-aliases-response))

(clojure.core/defn get-bot-versions ([get-bot-versions-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{name}/versions/" get-bot-versions-request :portkey.aws.models-lex/get-bot-versions-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults"}} 200 :portkey.aws.models-lex/get-bot-versions-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot-versions :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-versions-response))

(clojure.core/defn put-bot-alias ([put-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "PUT" "/bots/{botName}/aliases/{name}" put-bot-alias-request :portkey.aws.models-lex/put-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 200 :portkey.aws.models-lex/put-bot-alias-response {"ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/put-bot-alias-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/put-bot-alias-response))

(clojure.core/defn get-bots ([] (get-bots {})) ([get-bots-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/" get-bots-request :portkey.aws.models-lex/get-bots-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"nextToken" "nextToken", "maxResults" "maxResults", "nameContains" "nameContains"}} 200 :portkey.aws.models-lex/get-bots-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bots :args (clojure.spec.alpha/? :portkey.aws.models-lex/get-bots-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bots-response))

(clojure.core/defn get-bot ([get-bot-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "GET" "/bots/{name}/versions/{versionoralias}" get-bot-request :portkey.aws.models-lex/get-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "versionoralias" "versionOrAlias"}, :querystring {}} 200 :portkey.aws.models-lex/get-bot-response {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception})))
(clojure.spec.alpha/fdef get-bot :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/get-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/get-bot-response))

(clojure.core/defn delete-slot-type-version ([delete-slot-type-version-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/slottypes/{name}/version/{version}" delete-slot-type-version-request :portkey.aws.models-lex/delete-slot-type-version-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "version" "version"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-slot-type-version :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-slot-type-version-request) :ret clojure.core/true?)

(clojure.core/defn delete-bot ([delete-bot-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/bots/{name}" delete-bot-request :portkey.aws.models-lex/delete-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-bot-request) :ret clojure.core/true?)

(clojure.core/defn put-bot ([put-bot-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "PUT" "/bots/{name}/versions/$LATEST" put-bot-request :portkey.aws.models-lex/put-bot-request {:payload nil, :move {}, :headers {}, :uri {"name" "name"}, :querystring {}} 200 :portkey.aws.models-lex/put-bot-response {"ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "PreconditionFailedException" :portkey.aws.models-lex/precondition-failed-exception})))
(clojure.spec.alpha/fdef put-bot :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/put-bot-request) :ret (clojure.spec.alpha/and :portkey.aws.models-lex/put-bot-response))

(clojure.core/defn delete-bot-alias ([delete-bot-alias-request] (portkey.aws/-rest-json-call portkey.aws.models-lex/endpoints "DELETE" "/bots/{botName}/aliases/{name}" delete-bot-alias-request :portkey.aws.models-lex/delete-bot-alias-request {:payload nil, :move {}, :headers {}, :uri {"name" "name", "botName" "botName"}, :querystring {}} 204 nil {"NotFoundException" :portkey.aws.models-lex/not-found-exception, "ConflictException" :portkey.aws.models-lex/conflict-exception, "LimitExceededException" :portkey.aws.models-lex/limit-exceeded-exception, "InternalFailureException" :portkey.aws.models-lex/internal-failure-exception, "BadRequestException" :portkey.aws.models-lex/bad-request-exception, "ResourceInUseException" :portkey.aws.models-lex/resource-in-use-exception})))
(clojure.spec.alpha/fdef delete-bot-alias :args (clojure.spec.alpha/tuple :portkey.aws.models-lex/delete-bot-alias-request) :ret clojure.core/true?)
